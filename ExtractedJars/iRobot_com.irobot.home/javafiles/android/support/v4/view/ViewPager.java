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
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v4.view:
//			p, s, AbsSavedState, a, 
//			o, aa

public class ViewPager extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.LayoutParams
	{

		public boolean a;
		public int b;
		float c;
		boolean d;
		int e;
		int f;

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$LayoutParams(int, int)>
			c = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float c>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void android.view.ViewGroup$LayoutParams(Context, AttributeSet)>
			c = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float c>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v4.view.ViewPager.a)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #30  <Field int[] android.support.v4.view.ViewPager.a>
		//   10   16:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			b = ((TypedArray) (context)).getInteger(0, 48);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:bipush          48
		//   16   25:invokevirtual   #42  <Method int TypedArray.getInteger(int, int)>
		//   17   28:putfield        #44  <Field int b>
			((TypedArray) (context)).recycle();
		//   18   31:aload_1         
		//   19   32:invokevirtual   #47  <Method void TypedArray.recycle()>
		//   20   35:return          
		}
	}

	public static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #64  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #65  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentPager.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #67  <String "FragmentPager.SavedState{">
		//    6   11:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #77  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #83  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" position=");
		//   14   27:aload_1         
		//   15   28:ldc1            #85  <String " position=">
		//   16   30:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(a);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #49  <Field int a>
		//   21   39:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #90  <String "}">
		//   25   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #92  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #96  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #49  <Field int a>
		//    7   11:invokevirtual   #100 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(b, i1);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field Parcelable b>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #104 <Method void Parcel.writeParcelable(Parcelable, int)>
		//   13   23:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i1)
			{
				return new SavedState[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method ViewPager$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method ViewPager$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method ViewPager$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		Parcelable b;
		ClassLoader c;

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
			a = parcel.readInt();
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokevirtual   #47  <Method int Parcel.readInt()>
		//   15   25:putfield        #49  <Field int a>
			b = parcel.readParcelable(classloader1);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:aload_3         
		//   19   31:invokevirtual   #53  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   20   34:putfield        #55  <Field Parcelable b>
			c = classloader1;
		//   21   37:aload_0         
		//   22   38:aload_3         
		//   23   39:putfield        #57  <Field ClassLoader c>
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

	public static interface a
		extends Annotation
	{
	}

	static class b
	{

		Object a;
		int b;
		boolean c;
		float d;
		float e;

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	class c extends android.support.v4.view.a
	{

		private boolean b()
		{
			return a.b != null && a.b.getCount() > 1;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager a>
		//    2    4:getfield        #22  <Field p ViewPager.b>
		//    3    7:ifnull          26
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ViewPager a>
		//    6   14:getfield        #22  <Field p ViewPager.b>
		//    7   17:invokevirtual   #28  <Method int p.getCount()>
		//    8   20:iconst_1        
		//    9   21:icmple          26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public void a(View view, android.support.v4.view.a.b b1)
		{
			super.a(view, b1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			b1.b(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #37  <Method String Class.getName()>
		//    7   12:invokevirtual   #42  <Method void android.support.v4.view.a.b.b(CharSequence)>
			b1.k(b());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #44  <Method boolean b()>
		//   11   20:invokevirtual   #48  <Method void android.support.v4.view.a.b.k(boolean)>
			if(a.canScrollHorizontally(1))
		//*  12   23:aload_0         
		//*  13   24:getfield        #13  <Field ViewPager a>
		//*  14   27:iconst_1        
		//*  15   28:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   31:ifeq            41
				b1.a(4096);
		//   17   34:aload_2         
		//   18   35:sipush          4096
		//   19   38:invokevirtual   #55  <Method void android.support.v4.view.a.b.a(int)>
			if(a.canScrollHorizontally(-1))
		//*  20   41:aload_0         
		//*  21   42:getfield        #13  <Field ViewPager a>
		//*  22   45:iconst_m1       
		//*  23   46:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  24   49:ifeq            59
				b1.a(8192);
		//   25   52:aload_2         
		//   26   53:sipush          8192
		//   27   56:invokevirtual   #55  <Method void android.support.v4.view.a.b.a(int)>
		//   28   59:return          
		}

		public void a(View view, AccessibilityEvent accessibilityevent)
		{
			super.a(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #58  <Method void android.support.v4.view.a.a(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #37  <Method String Class.getName()>
		//    7   12:invokevirtual   #63  <Method void AccessibilityEvent.setClassName(CharSequence)>
			accessibilityevent.setScrollable(b());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #44  <Method boolean b()>
		//   11   20:invokevirtual   #66  <Method void AccessibilityEvent.setScrollable(boolean)>
			if(accessibilityevent.getEventType() == 4096 && a.b != null)
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #69  <Method int AccessibilityEvent.getEventType()>
		//*  14   27:sipush          4096
		//*  15   30:icmpne          79
		//*  16   33:aload_0         
		//*  17   34:getfield        #13  <Field ViewPager a>
		//*  18   37:getfield        #22  <Field p ViewPager.b>
		//*  19   40:ifnull          79
			{
				accessibilityevent.setItemCount(a.b.getCount());
		//   20   43:aload_2         
		//   21   44:aload_0         
		//   22   45:getfield        #13  <Field ViewPager a>
		//   23   48:getfield        #22  <Field p ViewPager.b>
		//   24   51:invokevirtual   #28  <Method int p.getCount()>
		//   25   54:invokevirtual   #72  <Method void AccessibilityEvent.setItemCount(int)>
				accessibilityevent.setFromIndex(a.c);
		//   26   57:aload_2         
		//   27   58:aload_0         
		//   28   59:getfield        #13  <Field ViewPager a>
		//   29   62:getfield        #75  <Field int ViewPager.c>
		//   30   65:invokevirtual   #78  <Method void AccessibilityEvent.setFromIndex(int)>
				accessibilityevent.setToIndex(a.c);
		//   31   68:aload_2         
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field ViewPager a>
		//   34   73:getfield        #75  <Field int ViewPager.c>
		//   35   76:invokevirtual   #81  <Method void AccessibilityEvent.setToIndex(int)>
			}
		//   36   79:return          
		}

		public boolean a(View view, int i1, Bundle bundle)
		{
			if(super.a(view, i1, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #84  <Method boolean android.support.v4.view.a.a(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			if(i1 == 4096) goto _L2; else goto _L1
		//    8   12:iload_2         
		//    9   13:sipush          4096
		//   10   16:icmpeq          63
_L1:
			if(i1 != 8192)
		//*  11   19:iload_2         
		//*  12   20:sipush          8192
		//*  13   23:icmpeq          28
				return false;
		//   14   26:iconst_0        
		//   15   27:ireturn         
			if(!a.canScrollHorizontally(-1)) goto _L4; else goto _L3
		//   16   28:aload_0         
		//   17   29:getfield        #13  <Field ViewPager a>
		//   18   32:iconst_m1       
		//   19   33:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
		//   20   36:ifeq            61
_L3:
			view = ((View) (a));
		//   21   39:aload_0         
		//   22   40:getfield        #13  <Field ViewPager a>
		//   23   43:astore_1        
			i1 = a.c - 1;
		//   24   44:aload_0         
		//   25   45:getfield        #13  <Field ViewPager a>
		//   26   48:getfield        #75  <Field int ViewPager.c>
		//   27   51:iconst_1        
		//   28   52:isub            
		//   29   53:istore_2        
_L6:
			((ViewPager) (view)).setCurrentItem(i1);
		//   30   54:aload_1         
		//   31   55:iload_2         
		//   32   56:invokevirtual   #87  <Method void ViewPager.setCurrentItem(int)>
			return true;
		//   33   59:iconst_1        
		//   34   60:ireturn         
_L4:
			return false;
		//   35   61:iconst_0        
		//   36   62:ireturn         
_L2:
			if(a.canScrollHorizontally(1))
		//*  37   63:aload_0         
		//*  38   64:getfield        #13  <Field ViewPager a>
		//*  39   67:iconst_1        
		//*  40   68:invokevirtual   #52  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  41   71:ifeq            92
			{
				view = ((View) (a));
		//   42   74:aload_0         
		//   43   75:getfield        #13  <Field ViewPager a>
		//   44   78:astore_1        
				i1 = a.c + 1;
		//   45   79:aload_0         
		//   46   80:getfield        #13  <Field ViewPager a>
		//   47   83:getfield        #75  <Field int ViewPager.c>
		//   48   86:iconst_1        
		//   49   87:iadd            
		//   50   88:istore_2        
			} else
		//*  51   89:goto            54
			{
				return false;
		//   52   92:iconst_0        
		//   53   93:ireturn         
			}
			if(true) goto _L6; else goto _L5
_L5:
		}

		final ViewPager a;

		c()
		{
			a = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v4.view.a()>
		//    5    9:return          
		}
	}

	public static interface d
	{

		public abstract void a(ViewPager viewpager, p p1, p p2);
	}

	public static interface e
	{

		public abstract void a(int i1);

		public abstract void a(int i1, float f1, int j1);

		public abstract void b(int i1);
	}

	public static interface f
	{

		public abstract void a(View view, float f1);
	}

	private class g extends DataSetObserver
	{

		public void onChanged()
		{
			a.b();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager a>
		//    2    4:invokevirtual   #21  <Method void ViewPager.b()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			a.b();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager a>
		//    2    4:invokevirtual   #21  <Method void ViewPager.b()>
		//    3    7:return          
		}

		final ViewPager a;

		g()
		{
			a = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	public static class h
		implements e
	{

		public void a(int i1)
		{
		//    0    0:return          
		}

		public void a(int i1, float f1, int j1)
		{
		//    0    0:return          
		}

		public void b(int i1)
		{
		//    0    0:return          
		}

		public h()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class i
		implements Comparator
	{

		public int a(View view, View view1)
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
			if(((LayoutParams) (view)).a != ((LayoutParams) (view1)).a)
		//*   8   16:aload_1         
		//*   9   17:getfield        #28  <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
		//*  10   20:aload_2         
		//*  11   21:getfield        #28  <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
		//*  12   24:icmpeq          38
				return !((LayoutParams) (view)).a ? -1 : 1;
		//   13   27:aload_1         
		//   14   28:getfield        #28  <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
		//   15   31:ifeq            36
		//   16   34:iconst_1        
		//   17   35:ireturn         
		//   18   36:iconst_m1       
		//   19   37:ireturn         
			else
				return ((LayoutParams) (view)).e - ((LayoutParams) (view1)).e;
		//   20   38:aload_1         
		//   21   39:getfield        #32  <Field int ViewPager$LayoutParams.e>
		//   22   42:aload_2         
		//   23   43:getfield        #32  <Field int ViewPager$LayoutParams.e>
		//   24   46:isub            
		//   25   47:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return a((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #19  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #19  <Class View>
		//    5    9:invokevirtual   #36  <Method int a(View, View)>
		//    6   12:ireturn         
		}

		i()
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
	//    2    2:invokespecial   #143 <Method void ViewGroup(Context)>
		g = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #145 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #146 <Method void ArrayList()>
	//    7   13:putfield        #148 <Field ArrayList g>
		h = new b();
	//    8   16:aload_0         
	//    9   17:new             #25  <Class ViewPager$b>
	//   10   20:dup             
	//   11   21:invokespecial   #149 <Method void ViewPager$b()>
	//   12   24:putfield        #151 <Field ViewPager$b h>
		i = new Rect();
	//   13   27:aload_0         
	//   14   28:new             #153 <Class Rect>
	//   15   31:dup             
	//   16   32:invokespecial   #154 <Method void Rect()>
	//   17   35:putfield        #156 <Field Rect i>
		j = -1;
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:putfield        #158 <Field int j>
		k = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #160 <Field Parcelable k>
		l = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #162 <Field ClassLoader l>
		t = -3.402823E+38F;
	//   27   53:aload_0         
	//   28   54:ldc1            #163 <Float -3.402823E+38F>
	//   29   56:putfield        #165 <Field float t>
		u = 3.402823E+38F;
	//   30   59:aload_0         
	//   31   60:ldc1            #166 <Float 3.402823E+38F>
	//   32   62:putfield        #168 <Field float u>
		A = 1;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #170 <Field int A>
		K = -1;
	//   36   70:aload_0         
	//   37   71:iconst_m1       
	//   38   72:putfield        #172 <Field int K>
		T = true;
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:putfield        #174 <Field boolean T>
		U = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #176 <Field boolean U>
		aj = new Runnable() {

			public void run()
			{
				a.setScrollState(0);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ViewPager a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void ViewPager.setScrollState(int)>
				a.c();
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field ViewPager a>
			//    6   12:invokevirtual   #26  <Method void ViewPager.c()>
			//    7   15:return          
			}

			final ViewPager a;

			
			{
				a = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ViewPager a>
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
	//   49   91:invokespecial   #179 <Method void ViewPager$3(ViewPager)>
	//   50   94:putfield        #181 <Field Runnable aj>
		ak = 0;
	//   51   97:aload_0         
	//   52   98:iconst_0        
	//   53   99:putfield        #183 <Field int ak>
		a();
	//   54  102:aload_0         
	//   55  103:invokevirtual   #185 <Method void a()>
	//   56  106:return          
	}

	public ViewPager(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #188 <Method void ViewGroup(Context, AttributeSet)>
		g = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #145 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #146 <Method void ArrayList()>
	//    8   14:putfield        #148 <Field ArrayList g>
		h = new b();
	//    9   17:aload_0         
	//   10   18:new             #25  <Class ViewPager$b>
	//   11   21:dup             
	//   12   22:invokespecial   #149 <Method void ViewPager$b()>
	//   13   25:putfield        #151 <Field ViewPager$b h>
		i = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #153 <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #154 <Method void Rect()>
	//   18   36:putfield        #156 <Field Rect i>
		j = -1;
	//   19   39:aload_0         
	//   20   40:iconst_m1       
	//   21   41:putfield        #158 <Field int j>
		k = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #160 <Field Parcelable k>
		l = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #162 <Field ClassLoader l>
		t = -3.402823E+38F;
	//   28   54:aload_0         
	//   29   55:ldc1            #163 <Float -3.402823E+38F>
	//   30   57:putfield        #165 <Field float t>
		u = 3.402823E+38F;
	//   31   60:aload_0         
	//   32   61:ldc1            #166 <Float 3.402823E+38F>
	//   33   63:putfield        #168 <Field float u>
		A = 1;
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:putfield        #170 <Field int A>
		K = -1;
	//   37   71:aload_0         
	//   38   72:iconst_m1       
	//   39   73:putfield        #172 <Field int K>
		T = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #174 <Field boolean T>
		U = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #176 <Field boolean U>
		aj = new _cls3();
	//   46   86:aload_0         
	//   47   87:new             #10  <Class ViewPager$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:invokespecial   #179 <Method void ViewPager$3(ViewPager)>
	//   51   95:putfield        #181 <Field Runnable aj>
		ak = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #183 <Field int ak>
		a();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #185 <Method void a()>
	//   57  107:return          
	}

	private int a(int i1, float f1, int j1, int k1)
	{
		if(Math.abs(k1) > O && Math.abs(j1) > M)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #195 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #197 <Field int O>
	//*   4    9:icmple          37
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #195 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #199 <Field int M>
	//*   9   20:icmple          37
		{
			if(j1 <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            30
	//*  12   27:goto            64
				i1++;
	//   13   30:iload_1         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:istore_1        
		} else
	//*  17   34:goto            64
		{
			float f2;
			if(i1 >= c)
	//*  18   37:iload_1         
	//*  19   38:aload_0         
	//*  20   39:getfield        #201 <Field int c>
	//*  21   42:icmplt          52
				f2 = 0.4F;
	//   22   45:ldc1            #202 <Float 0.4F>
	//   23   47:fstore          5
			else
	//*  24   49:goto            56
				f2 = 0.6F;
	//   25   52:ldc1            #203 <Float 0.6F>
	//   26   54:fstore          5
			i1 += (int)(f1 + f2);
	//   27   56:iload_1         
	//   28   57:fload_2         
	//   29   58:fload           5
	//   30   60:fadd            
	//   31   61:f2i             
	//   32   62:iadd            
	//   33   63:istore_1        
		}
		j1 = i1;
	//   34   64:iload_1         
	//   35   65:istore_3        
		if(g.size() > 0)
	//*  36   66:aload_0         
	//*  37   67:getfield        #148 <Field ArrayList g>
	//*  38   70:invokevirtual   #207 <Method int ArrayList.size()>
	//*  39   73:ifle            128
		{
			b b1 = (b)g.get(0);
	//   40   76:aload_0         
	//   41   77:getfield        #148 <Field ArrayList g>
	//   42   80:iconst_0        
	//   43   81:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   44   84:checkcast       #25  <Class ViewPager$b>
	//   45   87:astore          6
			b b2 = (b)g.get(g.size() - 1);
	//   46   89:aload_0         
	//   47   90:getfield        #148 <Field ArrayList g>
	//   48   93:aload_0         
	//   49   94:getfield        #148 <Field ArrayList g>
	//   50   97:invokevirtual   #207 <Method int ArrayList.size()>
	//   51  100:iconst_1        
	//   52  101:isub            
	//   53  102:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   54  105:checkcast       #25  <Class ViewPager$b>
	//   55  108:astore          7
			j1 = Math.max(b1.b, Math.min(i1, b2.b));
	//   56  110:aload           6
	//   57  112:getfield        #213 <Field int ViewPager$b.b>
	//   58  115:iload_1         
	//   59  116:aload           7
	//   60  118:getfield        #213 <Field int ViewPager$b.b>
	//   61  121:invokestatic    #217 <Method int Math.min(int, int)>
	//   62  124:invokestatic    #220 <Method int Math.max(int, int)>
	//   63  127:istore_3        
		}
		return j1;
	//   64  128:iload_3         
	//   65  129:ireturn         
	}

	private Rect a(Rect rect, View view)
	{
		Rect rect1 = rect;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(rect == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			rect1 = new Rect();
	//    4    6:new             #153 <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #154 <Method void Rect()>
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
	//   15   23:invokevirtual   #225 <Method void Rect.set(int, int, int, int)>
			return rect1;
	//   16   26:aload_3         
	//   17   27:areturn         
		}
		rect1.left = view.getLeft();
	//   18   28:aload_3         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #230 <Method int View.getLeft()>
	//   21   33:putfield        #233 <Field int Rect.left>
		rect1.right = view.getRight();
	//   22   36:aload_3         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #236 <Method int View.getRight()>
	//   25   41:putfield        #239 <Field int Rect.right>
		rect1.top = view.getTop();
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #242 <Method int View.getTop()>
	//   29   49:putfield        #245 <Field int Rect.top>
		rect1.bottom = view.getBottom();
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #248 <Method int View.getBottom()>
	//   33   57:putfield        #251 <Field int Rect.bottom>
		for(rect = ((Rect) (view.getParent())); (rect instanceof ViewGroup) && rect != this; rect = ((Rect) (((ViewGroup) (rect)).getParent())))
	//*  34   60:aload_2         
	//*  35   61:invokevirtual   #255 <Method ViewParent View.getParent()>
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
	//   48   84:getfield        #233 <Field int Rect.left>
	//   49   87:aload_1         
	//   50   88:invokevirtual   #256 <Method int ViewGroup.getLeft()>
	//   51   91:iadd            
	//   52   92:putfield        #233 <Field int Rect.left>
			rect1.right = rect1.right + ((ViewGroup) (rect)).getRight();
	//   53   95:aload_3         
	//   54   96:aload_3         
	//   55   97:getfield        #239 <Field int Rect.right>
	//   56  100:aload_1         
	//   57  101:invokevirtual   #257 <Method int ViewGroup.getRight()>
	//   58  104:iadd            
	//   59  105:putfield        #239 <Field int Rect.right>
			rect1.top = rect1.top + ((ViewGroup) (rect)).getTop();
	//   60  108:aload_3         
	//   61  109:aload_3         
	//   62  110:getfield        #245 <Field int Rect.top>
	//   63  113:aload_1         
	//   64  114:invokevirtual   #258 <Method int ViewGroup.getTop()>
	//   65  117:iadd            
	//   66  118:putfield        #245 <Field int Rect.top>
			rect1.bottom = rect1.bottom + ((ViewGroup) (rect)).getBottom();
	//   67  121:aload_3         
	//   68  122:aload_3         
	//   69  123:getfield        #251 <Field int Rect.bottom>
	//   70  126:aload_1         
	//   71  127:invokevirtual   #259 <Method int ViewGroup.getBottom()>
	//   72  130:iadd            
	//   73  131:putfield        #251 <Field int Rect.bottom>
		}

	//   74  134:aload_1         
	//   75  135:invokevirtual   #260 <Method ViewParent ViewGroup.getParent()>
	//   76  138:astore_1        
	//*  77  139:goto            65
		return rect1;
	//   78  142:aload_3         
	//   79  143:areturn         
	}

	private void a(int i1, int j1, int k1, int l1)
	{
		if(j1 > 0 && !g.isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifle            105
	//*   2    4:aload_0         
	//*   3    5:getfield        #148 <Field ArrayList g>
	//*   4    8:invokevirtual   #264 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            105
		{
			if(!m.isFinished())
	//*   6   14:aload_0         
	//*   7   15:getfield        #266 <Field Scroller m>
	//*   8   18:invokevirtual   #271 <Method boolean Scroller.isFinished()>
	//*   9   21:ifne            41
			{
				m.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #266 <Field Scroller m>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #274 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #277 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #281 <Method void Scroller.setFinalX(int)>
				return;
	//   18   40:return          
			}
			int i2 = getPaddingLeft();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #284 <Method int getPaddingLeft()>
	//   21   45:istore          6
			int j2 = getPaddingRight();
	//   22   47:aload_0         
	//   23   48:invokevirtual   #287 <Method int getPaddingRight()>
	//   24   51:istore          7
			int k2 = getPaddingLeft();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #284 <Method int getPaddingLeft()>
	//   27   57:istore          8
			int l2 = getPaddingRight();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #287 <Method int getPaddingRight()>
	//   30   63:istore          9
			i1 = (int)(((float)getScrollX() / (float)((j1 - k2 - l2) + l1)) * (float)((i1 - i2 - j2) + k1));
	//   31   65:aload_0         
	//   32   66:invokevirtual   #290 <Method int getScrollX()>
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
	//   43   82:iload_1         
	//   44   83:iload           6
	//   45   85:isub            
	//   46   86:iload           7
	//   47   88:isub            
	//   48   89:iload_3         
	//   49   90:iadd            
	//   50   91:i2f             
	//   51   92:fmul            
	//   52   93:f2i             
	//   53   94:istore_1        
		} else
	//*  54   95:aload_0         
	//*  55   96:iload_1         
	//*  56   97:aload_0         
	//*  57   98:invokevirtual   #293 <Method int getScrollY()>
	//*  58  101:invokevirtual   #297 <Method void scrollTo(int, int)>
	//*  59  104:return          
		{
			b b1 = b(c);
	//   60  105:aload_0         
	//   61  106:aload_0         
	//   62  107:getfield        #201 <Field int c>
	//   63  110:invokevirtual   #300 <Method ViewPager$b b(int)>
	//   64  113:astore          10
			float f1;
			if(b1 != null)
	//*  65  115:aload           10
	//*  66  117:ifnull          137
				f1 = Math.min(b1.e, u);
	//   67  120:aload           10
	//   68  122:getfield        #302 <Field float ViewPager$b.e>
	//   69  125:aload_0         
	//   70  126:getfield        #168 <Field float u>
	//   71  129:invokestatic    #305 <Method float Math.min(float, float)>
	//   72  132:fstore          5
			else
	//*  73  134:goto            140
				f1 = 0.0F;
	//   74  137:fconst_0        
	//   75  138:fstore          5
			i1 = (int)(f1 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
	//   76  140:fload           5
	//   77  142:iload_1         
	//   78  143:aload_0         
	//   79  144:invokevirtual   #284 <Method int getPaddingLeft()>
	//   80  147:isub            
	//   81  148:aload_0         
	//   82  149:invokevirtual   #287 <Method int getPaddingRight()>
	//   83  152:isub            
	//   84  153:i2f             
	//   85  154:fmul            
	//   86  155:f2i             
	//   87  156:istore_1        
			if(i1 != getScrollX())
	//*  88  157:iload_1         
	//*  89  158:aload_0         
	//*  90  159:invokevirtual   #290 <Method int getScrollX()>
	//*  91  162:icmpeq          173
				a(false);
	//   92  165:aload_0         
	//   93  166:iconst_0        
	//   94  167:invokespecial   #308 <Method void a(boolean)>
			else
	//*  95  170:goto            95
				return;
	//   96  173:return          
		}
		scrollTo(i1, getScrollY());
	}

	private void a(int i1, boolean flag, int j1, boolean flag1)
	{
		b b1 = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #300 <Method ViewPager$b b(int)>
	//    3    5:astore          6
		int k1;
		if(b1 != null)
	//*   4    7:aload           6
	//*   5    9:ifnull          43
			k1 = (int)((float)getClientWidth() * Math.max(t, Math.min(b1.e, u)));
	//    6   12:aload_0         
	//    7   13:invokespecial   #277 <Method int getClientWidth()>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:getfield        #165 <Field float t>
	//   11   21:aload           6
	//   12   23:getfield        #302 <Field float ViewPager$b.e>
	//   13   26:aload_0         
	//   14   27:getfield        #168 <Field float u>
	//   15   30:invokestatic    #305 <Method float Math.min(float, float)>
	//   16   33:invokestatic    #311 <Method float Math.max(float, float)>
	//   17   36:fmul            
	//   18   37:f2i             
	//   19   38:istore          5
		else
	//*  20   40:goto            46
			k1 = 0;
	//   21   43:iconst_0        
	//   22   44:istore          5
		if(flag)
	//*  23   46:iload_2         
	//*  24   47:ifeq            69
		{
			a(k1, 0, j1);
	//   25   50:aload_0         
	//   26   51:iload           5
	//   27   53:iconst_0        
	//   28   54:iload_3         
	//   29   55:invokevirtual   #314 <Method void a(int, int, int)>
			if(flag1)
	//*  30   58:iload           4
	//*  31   60:ifeq            98
			{
				e(i1);
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:invokespecial   #316 <Method void e(int)>
				return;
	//   35   68:return          
			}
		} else
		{
			if(flag1)
	//*  36   69:iload           4
	//*  37   71:ifeq            79
				e(i1);
	//   38   74:aload_0         
	//   39   75:iload_1         
	//   40   76:invokespecial   #316 <Method void e(int)>
			a(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #308 <Method void a(boolean)>
			scrollTo(k1, 0);
	//   44   84:aload_0         
	//   45   85:iload           5
	//   46   87:iconst_0        
	//   47   88:invokevirtual   #297 <Method void scrollTo(int, int)>
			d(k1);
	//   48   91:aload_0         
	//   49   92:iload           5
	//   50   94:invokespecial   #319 <Method boolean d(int)>
	//   51   97:pop             
		}
	//   52   98:return          
	}

	private void a(b b1, int i1, b b2)
	{
		int i3 = b.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field p b>
	//    2    4:invokevirtual   #327 <Method int p.getCount()>
	//    3    7:istore          10
		int j1 = getClientWidth();
	//    4    9:aload_0         
	//    5   10:invokespecial   #277 <Method int getClientWidth()>
	//    6   13:istore          7
		float f4;
		if(j1 > 0)
	//*   7   15:iload           7
	//*   8   17:ifle            34
			f4 = (float)p / (float)j1;
	//    9   20:aload_0         
	//   10   21:getfield        #329 <Field int p>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:goto            37
			f4 = 0.0F;
	//   17   34:fconst_0        
	//   18   35:fstore          5
		if(b2 != null)
	//*  19   37:aload_3         
	//*  20   38:ifnull          383
		{
			j1 = b2.b;
	//   21   41:aload_3         
	//   22   42:getfield        #213 <Field int ViewPager$b.b>
	//   23   45:istore          7
			if(j1 < b1.b)
	//*  24   47:iload           7
	//*  25   49:aload_1         
	//*  26   50:getfield        #213 <Field int ViewPager$b.b>
	//*  27   53:icmpge          223
			{
				float f1 = b2.e + b2.d + f4;
	//   28   56:aload_3         
	//   29   57:getfield        #302 <Field float ViewPager$b.e>
	//   30   60:aload_3         
	//   31   61:getfield        #331 <Field float ViewPager$b.d>
	//   32   64:fadd            
	//   33   65:fload           5
	//   34   67:fadd            
	//   35   68:fstore          4
				j1++;
	//   36   70:iload           7
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore          7
				int j2;
				for(int k1 = 0; j1 <= b1.b && k1 < g.size(); j1 = j2 + 1)
	//*  40   76:iconst_0        
	//*  41   77:istore          8
	//*  42   79:iload           7
	//*  43   81:aload_1         
	//*  44   82:getfield        #213 <Field int ViewPager$b.b>
	//*  45   85:icmpgt          383
	//*  46   88:iload           8
	//*  47   90:aload_0         
	//*  48   91:getfield        #148 <Field ArrayList g>
	//*  49   94:invokevirtual   #207 <Method int ArrayList.size()>
	//*  50   97:icmpge          383
				{
					float f5;
					do
					{
						b2 = (b)g.get(k1);
	//   51  100:aload_0         
	//   52  101:getfield        #148 <Field ArrayList g>
	//   53  104:iload           8
	//   54  106:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #25  <Class ViewPager$b>
	//   56  112:astore_3        
						j2 = j1;
	//   57  113:iload           7
	//   58  115:istore          9
						f5 = f1;
	//   59  117:fload           4
	//   60  119:fstore          6
						if(j1 <= b2.b)
							break;
	//   61  121:iload           7
	//   62  123:aload_3         
	//   63  124:getfield        #213 <Field int ViewPager$b.b>
	//   64  127:icmple          161
						j2 = j1;
	//   65  130:iload           7
	//   66  132:istore          9
						f5 = f1;
	//   67  134:fload           4
	//   68  136:fstore          6
						if(k1 >= g.size() - 1)
							break;
	//   69  138:iload           8
	//   70  140:aload_0         
	//   71  141:getfield        #148 <Field ArrayList g>
	//   72  144:invokevirtual   #207 <Method int ArrayList.size()>
	//   73  147:iconst_1        
	//   74  148:isub            
	//   75  149:icmpge          161
						k1++;
	//   76  152:iload           8
	//   77  154:iconst_1        
	//   78  155:iadd            
	//   79  156:istore          8
					} while(true);
	//   80  158:goto            100
					for(; j2 < b2.b; j2++)
	//*  81  161:iload           9
	//*  82  163:aload_3         
	//*  83  164:getfield        #213 <Field int ViewPager$b.b>
	//*  84  167:icmpge          196
						f5 += b.getPageWidth(j2) + f4;
	//   85  170:fload           6
	//   86  172:aload_0         
	//   87  173:getfield        #322 <Field p b>
	//   88  176:iload           9
	//   89  178:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//   90  181:fload           5
	//   91  183:fadd            
	//   92  184:fadd            
	//   93  185:fstore          6

	//   94  187:iload           9
	//   95  189:iconst_1        
	//   96  190:iadd            
	//   97  191:istore          9
	//*  98  193:goto            161
					b2.e = f5;
	//   99  196:aload_3         
	//  100  197:fload           6
	//  101  199:putfield        #302 <Field float ViewPager$b.e>
					f1 = f5 + (b2.d + f4);
	//  102  202:fload           6
	//  103  204:aload_3         
	//  104  205:getfield        #331 <Field float ViewPager$b.d>
	//  105  208:fload           5
	//  106  210:fadd            
	//  107  211:fadd            
	//  108  212:fstore          4
				}

	//  109  214:iload           9
	//  110  216:iconst_1        
	//  111  217:iadd            
	//  112  218:istore          7
			} else
	//* 113  220:goto            79
			if(j1 > b1.b)
	//* 114  223:iload           7
	//* 115  225:aload_1         
	//* 116  226:getfield        #213 <Field int ViewPager$b.b>
	//* 117  229:icmple          383
			{
				int l1 = g.size() - 1;
	//  118  232:aload_0         
	//  119  233:getfield        #148 <Field ArrayList g>
	//  120  236:invokevirtual   #207 <Method int ArrayList.size()>
	//  121  239:iconst_1        
	//  122  240:isub            
	//  123  241:istore          8
				float f2 = b2.e;
	//  124  243:aload_3         
	//  125  244:getfield        #302 <Field float ViewPager$b.e>
	//  126  247:fstore          4
				int k2;
				for(j1--; j1 >= b1.b && l1 >= 0; j1 = k2 - 1)
	//* 127  249:iload           7
	//* 128  251:iconst_1        
	//* 129  252:isub            
	//* 130  253:istore          7
	//* 131  255:iload           7
	//* 132  257:aload_1         
	//* 133  258:getfield        #213 <Field int ViewPager$b.b>
	//* 134  261:icmplt          383
	//* 135  264:iload           8
	//* 136  266:iflt            383
				{
					float f6;
					do
					{
						b2 = (b)g.get(l1);
	//  137  269:aload_0         
	//  138  270:getfield        #148 <Field ArrayList g>
	//  139  273:iload           8
	//  140  275:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//  141  278:checkcast       #25  <Class ViewPager$b>
	//  142  281:astore_3        
						k2 = j1;
	//  143  282:iload           7
	//  144  284:istore          9
						f6 = f2;
	//  145  286:fload           4
	//  146  288:fstore          6
						if(j1 >= b2.b)
							break;
	//  147  290:iload           7
	//  148  292:aload_3         
	//  149  293:getfield        #213 <Field int ViewPager$b.b>
	//  150  296:icmpge          321
						k2 = j1;
	//  151  299:iload           7
	//  152  301:istore          9
						f6 = f2;
	//  153  303:fload           4
	//  154  305:fstore          6
						if(l1 <= 0)
							break;
	//  155  307:iload           8
	//  156  309:ifle            321
						l1--;
	//  157  312:iload           8
	//  158  314:iconst_1        
	//  159  315:isub            
	//  160  316:istore          8
					} while(true);
	//  161  318:goto            269
					for(; k2 > b2.b; k2--)
	//* 162  321:iload           9
	//* 163  323:aload_3         
	//* 164  324:getfield        #213 <Field int ViewPager$b.b>
	//* 165  327:icmple          356
						f6 -= b.getPageWidth(k2) + f4;
	//  166  330:fload           6
	//  167  332:aload_0         
	//  168  333:getfield        #322 <Field p b>
	//  169  336:iload           9
	//  170  338:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//  171  341:fload           5
	//  172  343:fadd            
	//  173  344:fsub            
	//  174  345:fstore          6

	//  175  347:iload           9
	//  176  349:iconst_1        
	//  177  350:isub            
	//  178  351:istore          9
	//* 179  353:goto            321
					f2 = f6 - (b2.d + f4);
	//  180  356:fload           6
	//  181  358:aload_3         
	//  182  359:getfield        #331 <Field float ViewPager$b.d>
	//  183  362:fload           5
	//  184  364:fadd            
	//  185  365:fsub            
	//  186  366:fstore          4
					b2.e = f2;
	//  187  368:aload_3         
	//  188  369:fload           4
	//  189  371:putfield        #302 <Field float ViewPager$b.e>
				}

	//  190  374:iload           9
	//  191  376:iconst_1        
	//  192  377:isub            
	//  193  378:istore          7
			}
		}
	//* 194  380:goto            255
		int l2 = g.size();
	//  195  383:aload_0         
	//  196  384:getfield        #148 <Field ArrayList g>
	//  197  387:invokevirtual   #207 <Method int ArrayList.size()>
	//  198  390:istore          9
		float f7 = b1.e;
	//  199  392:aload_1         
	//  200  393:getfield        #302 <Field float ViewPager$b.e>
	//  201  396:fstore          6
		j1 = b1.b - 1;
	//  202  398:aload_1         
	//  203  399:getfield        #213 <Field int ViewPager$b.b>
	//  204  402:iconst_1        
	//  205  403:isub            
	//  206  404:istore          7
		float f3;
		if(b1.b == 0)
	//* 207  406:aload_1         
	//* 208  407:getfield        #213 <Field int ViewPager$b.b>
	//* 209  410:ifne            422
			f3 = b1.e;
	//  210  413:aload_1         
	//  211  414:getfield        #302 <Field float ViewPager$b.e>
	//  212  417:fstore          4
		else
	//* 213  419:goto            426
			f3 = -3.402823E+38F;
	//  214  422:ldc1            #163 <Float -3.402823E+38F>
	//  215  424:fstore          4
		t = f3;
	//  216  426:aload_0         
	//  217  427:fload           4
	//  218  429:putfield        #165 <Field float t>
		int i2 = b1.b;
	//  219  432:aload_1         
	//  220  433:getfield        #213 <Field int ViewPager$b.b>
	//  221  436:istore          8
		i3--;
	//  222  438:iload           10
	//  223  440:iconst_1        
	//  224  441:isub            
	//  225  442:istore          10
		if(i2 == i3)
	//* 226  444:iload           8
	//* 227  446:iload           10
	//* 228  448:icmpne          467
			f3 = (b1.e + b1.d) - 1.0F;
	//  229  451:aload_1         
	//  230  452:getfield        #302 <Field float ViewPager$b.e>
	//  231  455:aload_1         
	//  232  456:getfield        #331 <Field float ViewPager$b.d>
	//  233  459:fadd            
	//  234  460:fconst_1        
	//  235  461:fsub            
	//  236  462:fstore          4
		else
	//* 237  464:goto            471
			f3 = 3.402823E+38F;
	//  238  467:ldc1            #166 <Float 3.402823E+38F>
	//  239  469:fstore          4
		u = f3;
	//  240  471:aload_0         
	//  241  472:fload           4
	//  242  474:putfield        #168 <Field float u>
		i2 = i1 - 1;
	//  243  477:iload_2         
	//  244  478:iconst_1        
	//  245  479:isub            
	//  246  480:istore          8
		f3 = f7;
	//  247  482:fload           6
	//  248  484:fstore          4
		while(i2 >= 0) 
	//* 249  486:iload           8
	//* 250  488:iflt            585
		{
			for(b2 = (b)g.get(i2); j1 > b2.b; j1--)
	//* 251  491:aload_0         
	//* 252  492:getfield        #148 <Field ArrayList g>
	//* 253  495:iload           8
	//* 254  497:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 255  500:checkcast       #25  <Class ViewPager$b>
	//* 256  503:astore_3        
	//* 257  504:iload           7
	//* 258  506:aload_3         
	//* 259  507:getfield        #213 <Field int ViewPager$b.b>
	//* 260  510:icmple          539
				f3 -= b.getPageWidth(j1) + f4;
	//  261  513:fload           4
	//  262  515:aload_0         
	//  263  516:getfield        #322 <Field p b>
	//  264  519:iload           7
	//  265  521:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//  266  524:fload           5
	//  267  526:fadd            
	//  268  527:fsub            
	//  269  528:fstore          4

	//  270  530:iload           7
	//  271  532:iconst_1        
	//  272  533:isub            
	//  273  534:istore          7
	//* 274  536:goto            504
			f3 -= b2.d + f4;
	//  275  539:fload           4
	//  276  541:aload_3         
	//  277  542:getfield        #331 <Field float ViewPager$b.d>
	//  278  545:fload           5
	//  279  547:fadd            
	//  280  548:fsub            
	//  281  549:fstore          4
			b2.e = f3;
	//  282  551:aload_3         
	//  283  552:fload           4
	//  284  554:putfield        #302 <Field float ViewPager$b.e>
			if(b2.b == 0)
	//* 285  557:aload_3         
	//* 286  558:getfield        #213 <Field int ViewPager$b.b>
	//* 287  561:ifne            570
				t = f3;
	//  288  564:aload_0         
	//  289  565:fload           4
	//  290  567:putfield        #165 <Field float t>
			i2--;
	//  291  570:iload           8
	//  292  572:iconst_1        
	//  293  573:isub            
	//  294  574:istore          8
			j1--;
	//  295  576:iload           7
	//  296  578:iconst_1        
	//  297  579:isub            
	//  298  580:istore          7
		}
	//* 299  582:goto            486
		f3 = b1.e + b1.d + f4;
	//  300  585:aload_1         
	//  301  586:getfield        #302 <Field float ViewPager$b.e>
	//  302  589:aload_1         
	//  303  590:getfield        #331 <Field float ViewPager$b.d>
	//  304  593:fadd            
	//  305  594:fload           5
	//  306  596:fadd            
	//  307  597:fstore          4
		i2 = b1.b + 1;
	//  308  599:aload_1         
	//  309  600:getfield        #213 <Field int ViewPager$b.b>
	//  310  603:iconst_1        
	//  311  604:iadd            
	//  312  605:istore          8
		j1 = i1 + 1;
	//  313  607:iload_2         
	//  314  608:iconst_1        
	//  315  609:iadd            
	//  316  610:istore          7
		for(i1 = i2; j1 < l2; i1++)
	//* 317  612:iload           8
	//* 318  614:istore_2        
	//* 319  615:iload           7
	//* 320  617:iload           9
	//* 321  619:icmpge          719
		{
			for(b1 = (b)g.get(j1); i1 < b1.b; i1++)
	//* 322  622:aload_0         
	//* 323  623:getfield        #148 <Field ArrayList g>
	//* 324  626:iload           7
	//* 325  628:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 326  631:checkcast       #25  <Class ViewPager$b>
	//* 327  634:astore_1        
	//* 328  635:iload_2         
	//* 329  636:aload_1         
	//* 330  637:getfield        #213 <Field int ViewPager$b.b>
	//* 331  640:icmpge          666
				f3 += b.getPageWidth(i1) + f4;
	//  332  643:fload           4
	//  333  645:aload_0         
	//  334  646:getfield        #322 <Field p b>
	//  335  649:iload_2         
	//  336  650:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//  337  653:fload           5
	//  338  655:fadd            
	//  339  656:fadd            
	//  340  657:fstore          4

	//  341  659:iload_2         
	//  342  660:iconst_1        
	//  343  661:iadd            
	//  344  662:istore_2        
	//* 345  663:goto            635
			if(b1.b == i3)
	//* 346  666:aload_1         
	//* 347  667:getfield        #213 <Field int ViewPager$b.b>
	//* 348  670:iload           10
	//* 349  672:icmpne          688
				u = (b1.d + f3) - 1.0F;
	//  350  675:aload_0         
	//  351  676:aload_1         
	//  352  677:getfield        #331 <Field float ViewPager$b.d>
	//  353  680:fload           4
	//  354  682:fadd            
	//  355  683:fconst_1        
	//  356  684:fsub            
	//  357  685:putfield        #168 <Field float u>
			b1.e = f3;
	//  358  688:aload_1         
	//  359  689:fload           4
	//  360  691:putfield        #302 <Field float ViewPager$b.e>
			f3 += b1.d + f4;
	//  361  694:fload           4
	//  362  696:aload_1         
	//  363  697:getfield        #331 <Field float ViewPager$b.d>
	//  364  700:fload           5
	//  365  702:fadd            
	//  366  703:fadd            
	//  367  704:fstore          4
			j1++;
	//  368  706:iload           7
	//  369  708:iconst_1        
	//  370  709:iadd            
	//  371  710:istore          7
		}

	//  372  712:iload_2         
	//  373  713:iconst_1        
	//  374  714:iadd            
	//  375  715:istore_2        
	//* 376  716:goto            615
		U = false;
	//  377  719:aload_0         
	//  378  720:iconst_0        
	//  379  721:putfield        #176 <Field boolean U>
	//  380  724:return          
	}

	private void a(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #341 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i1) == K)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #344 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #172 <Field int K>
	//*   8   14:icmpne          60
		{
			if(i1 == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i1 = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			G = motionevent.getX(i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//   20   34:putfield        #349 <Field float G>
			K = motionevent.getPointerId(i1);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #344 <Method int MotionEvent.getPointerId(int)>
	//   25   43:putfield        #172 <Field int K>
			if(L != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #351 <Field VelocityTracker L>
	//*  28   50:ifnull          60
				L.clear();
	//   29   53:aload_0         
	//   30   54:getfield        #351 <Field VelocityTracker L>
	//   31   57:invokevirtual   #356 <Method void VelocityTracker.clear()>
		}
	//   32   60:return          
	}

	private void a(boolean flag)
	{
		boolean flag1;
		if(ak == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field int ak>
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
	//   13   21:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
			if(m.isFinished() ^ true)
	//*  14   24:aload_0         
	//*  15   25:getfield        #266 <Field Scroller m>
	//*  16   28:invokevirtual   #271 <Method boolean Scroller.isFinished()>
	//*  17   31:iconst_1        
	//*  18   32:ixor            
	//*  19   33:ifeq            106
			{
				m.abortAnimation();
	//   20   36:aload_0         
	//   21   37:getfield        #266 <Field Scroller m>
	//   22   40:invokevirtual   #362 <Method void Scroller.abortAnimation()>
				int j1 = getScrollX();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #290 <Method int getScrollX()>
	//   25   47:istore_3        
				int k1 = getScrollY();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #293 <Method int getScrollY()>
	//   28   52:istore          4
				int l1 = m.getCurrX();
	//   29   54:aload_0         
	//   30   55:getfield        #266 <Field Scroller m>
	//   31   58:invokevirtual   #365 <Method int Scroller.getCurrX()>
	//   32   61:istore          5
				int i2 = m.getCurrY();
	//   33   63:aload_0         
	//   34   64:getfield        #266 <Field Scroller m>
	//   35   67:invokevirtual   #368 <Method int Scroller.getCurrY()>
	//   36   70:istore          6
				if(j1 != l1 || k1 != i2)
	//*  37   72:iload_3         
	//*  38   73:iload           5
	//*  39   75:icmpne          85
	//*  40   78:iload           4
	//*  41   80:iload           6
	//*  42   82:icmpeq          106
				{
					scrollTo(l1, i2);
	//   43   85:aload_0         
	//   44   86:iload           5
	//   45   88:iload           6
	//   46   90:invokevirtual   #297 <Method void scrollTo(int, int)>
					if(l1 != j1)
	//*  47   93:iload           5
	//*  48   95:iload_3         
	//*  49   96:icmpeq          106
						d(l1);
	//   50   99:aload_0         
	//   51  100:iload           5
	//   52  102:invokespecial   #319 <Method boolean d(int)>
	//   53  105:pop             
				}
			}
		}
		z = false;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #370 <Field boolean z>
		boolean flag3 = false;
	//   57  111:iconst_0        
	//   58  112:istore          4
		boolean flag2 = flag1;
	//   59  114:iload_2         
	//   60  115:istore_3        
		for(int i1 = ((int) (flag3)); i1 < g.size(); i1++)
	//*  61  116:iload           4
	//*  62  118:istore_2        
	//*  63  119:iload_2         
	//*  64  120:aload_0         
	//*  65  121:getfield        #148 <Field ArrayList g>
	//*  66  124:invokevirtual   #207 <Method int ArrayList.size()>
	//*  67  127:icmpge          166
		{
			b b1 = (b)g.get(i1);
	//   68  130:aload_0         
	//   69  131:getfield        #148 <Field ArrayList g>
	//   70  134:iload_2         
	//   71  135:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   72  138:checkcast       #25  <Class ViewPager$b>
	//   73  141:astore          7
			if(b1.c)
	//*  74  143:aload           7
	//*  75  145:getfield        #372 <Field boolean ViewPager$b.c>
	//*  76  148:ifeq            159
			{
				b1.c = false;
	//   77  151:aload           7
	//   78  153:iconst_0        
	//   79  154:putfield        #372 <Field boolean ViewPager$b.c>
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
				android.support.v4.view.s.a(((View) (this)), aj);
	//   91  174:aload_0         
	//   92  175:aload_0         
	//   93  176:getfield        #181 <Field Runnable aj>
	//   94  179:invokestatic    #377 <Method void android.support.v4.view.s.a(View, Runnable)>
				return;
	//   95  182:return          
			}
			aj.run();
	//   96  183:aload_0         
	//   97  184:getfield        #181 <Field Runnable aj>
	//   98  187:invokeinterface #382 <Method void Runnable.run()>
		}
	//   99  192:return          
	}

	private boolean a(float f1, float f2)
	{
		return f1 < (float)E && f2 > 0.0F || f1 > (float)(getWidth() - E) && f2 < 0.0F;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #385 <Field int E>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #388 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #385 <Field int E>
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

	private void b(int i1, float f1, int j1)
	{
		if(ab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #391 <Field ViewPager$e ab>
	//*   2    4:ifnull          19
			ab.a(i1, f1, j1);
	//    3    7:aload_0         
	//    4    8:getfield        #391 <Field ViewPager$e ab>
	//    5   11:iload_1         
	//    6   12:fload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #393 <Method void android.support.v4.view.ViewPager$e.a(int, float, int)>
		if(aa != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #395 <Field List aa>
	//*  11   23:ifnull          87
		{
			int k1 = 0;
	//   12   26:iconst_0        
	//   13   27:istore          4
			for(int l1 = aa.size(); k1 < l1; k1++)
	//*  14   29:aload_0         
	//*  15   30:getfield        #395 <Field List aa>
	//*  16   33:invokeinterface #398 <Method int List.size()>
	//*  17   38:istore          5
	//*  18   40:iload           4
	//*  19   42:iload           5
	//*  20   44:icmpge          87
			{
				e e1 = (e)aa.get(k1);
	//   21   47:aload_0         
	//   22   48:getfield        #395 <Field List aa>
	//   23   51:iload           4
	//   24   53:invokeinterface #399 <Method Object List.get(int)>
	//   25   58:checkcast       #34  <Class ViewPager$e>
	//   26   61:astore          6
				if(e1 != null)
	//*  27   63:aload           6
	//*  28   65:ifnull          78
					e1.a(i1, f1, j1);
	//   29   68:aload           6
	//   30   70:iload_1         
	//   31   71:fload_2         
	//   32   72:iload_3         
	//   33   73:invokeinterface #393 <Method void android.support.v4.view.ViewPager$e.a(int, float, int)>
			}

	//   34   78:iload           4
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:istore          4
		}
	//*  38   84:goto            40
		if(ac != null)
	//*  39   87:aload_0         
	//*  40   88:getfield        #401 <Field ViewPager$e ac>
	//*  41   91:ifnull          106
			ac.a(i1, f1, j1);
	//   42   94:aload_0         
	//   43   95:getfield        #401 <Field ViewPager$e ac>
	//   44   98:iload_1         
	//   45   99:fload_2         
	//   46  100:iload_3         
	//   47  101:invokeinterface #393 <Method void android.support.v4.view.ViewPager$e.a(int, float, int)>
	//   48  106:return          
	}

	private void b(boolean flag)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #404 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i1 = 0; i1 < k1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j1;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            26
				j1 = af;
	//   10   18:aload_0         
	//   11   19:getfield        #406 <Field int af>
	//   12   22:istore_3        
			else
	//*  13   23:goto            28
				j1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
			getChildAt(i1).setLayerType(j1, ((android.graphics.Paint) (null)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #410 <Method View getChildAt(int)>
	//   19   33:iload_3         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #414 <Method void View.setLayerType(int, android.graphics.Paint)>
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            8
	//   27   45:return          
	}

	private boolean b(float f1)
	{
		float f2 = G;
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field float G>
	//    2    4:fstore_2        
		G = f1;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #349 <Field float G>
		float f3 = (float)getScrollX() + (f2 - f1);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #290 <Method int getScrollX()>
	//    8   14:i2f             
	//    9   15:fload_2         
	//   10   16:fload_1         
	//   11   17:fsub            
	//   12   18:fadd            
	//   13   19:fstore_3        
		float f4 = getClientWidth();
	//   14   20:aload_0         
	//   15   21:invokespecial   #277 <Method int getClientWidth()>
	//   16   24:i2f             
	//   17   25:fstore          4
		f1 = t * f4;
	//   18   27:aload_0         
	//   19   28:getfield        #165 <Field float t>
	//   20   31:fload           4
	//   21   33:fmul            
	//   22   34:fstore_1        
		f2 = u * f4;
	//   23   35:aload_0         
	//   24   36:getfield        #168 <Field float u>
	//   25   39:fload           4
	//   26   41:fmul            
	//   27   42:fstore_2        
		Object obj = ((Object) (g));
	//   28   43:aload_0         
	//   29   44:getfield        #148 <Field ArrayList g>
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
		obj = ((Object) ((b)((ArrayList) (obj)).get(0)));
	//   37   58:aload           10
	//   38   60:iconst_0        
	//   39   61:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   40   64:checkcast       #25  <Class ViewPager$b>
	//   41   67:astore          10
		b b1 = (b)g.get(g.size() - 1);
	//   42   69:aload_0         
	//   43   70:getfield        #148 <Field ArrayList g>
	//   44   73:aload_0         
	//   45   74:getfield        #148 <Field ArrayList g>
	//   46   77:invokevirtual   #207 <Method int ArrayList.size()>
	//   47   80:iconst_1        
	//   48   81:isub            
	//   49   82:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   50   85:checkcast       #25  <Class ViewPager$b>
	//   51   88:astore          11
		boolean flag;
		if(((b) (obj)).b != 0)
	//*  52   90:aload           10
	//*  53   92:getfield        #213 <Field int ViewPager$b.b>
	//*  54   95:ifeq            113
		{
			f1 = ((b) (obj)).e * f4;
	//   55   98:aload           10
	//   56  100:getfield        #302 <Field float ViewPager$b.e>
	//   57  103:fload           4
	//   58  105:fmul            
	//   59  106:fstore_1        
			flag = false;
	//   60  107:iconst_0        
	//   61  108:istore          5
		} else
	//*  62  110:goto            116
		{
			flag = true;
	//   63  113:iconst_1        
	//   64  114:istore          5
		}
		boolean flag1;
		if(b1.b != b.getCount() - 1)
	//*  65  116:aload           11
	//*  66  118:getfield        #213 <Field int ViewPager$b.b>
	//*  67  121:aload_0         
	//*  68  122:getfield        #322 <Field p b>
	//*  69  125:invokevirtual   #327 <Method int p.getCount()>
	//*  70  128:iconst_1        
	//*  71  129:isub            
	//*  72  130:icmpeq          148
		{
			f2 = b1.e * f4;
	//   73  133:aload           11
	//   74  135:getfield        #302 <Field float ViewPager$b.e>
	//   75  138:fload           4
	//   76  140:fmul            
	//   77  141:fstore_2        
			flag1 = false;
	//   78  142:iconst_0        
	//   79  143:istore          6
		} else
	//*  80  145:goto            151
		{
			flag1 = true;
	//   81  148:iconst_1        
	//   82  149:istore          6
		}
		if(f3 < f1)
	//*  83  151:fload_3         
	//*  84  152:fload_1         
	//*  85  153:fcmpg           
	//*  86  154:ifge            184
		{
			if(flag)
	//*  87  157:iload           5
	//*  88  159:ifeq            181
			{
				R.onPull(Math.abs(f1 - f3) / f4);
	//   89  162:aload_0         
	//   90  163:getfield        #417 <Field EdgeEffect R>
	//   91  166:fload_1         
	//   92  167:fload_3         
	//   93  168:fsub            
	//   94  169:invokestatic    #420 <Method float Math.abs(float)>
	//   95  172:fload           4
	//   96  174:fdiv            
	//   97  175:invokevirtual   #426 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//   98  178:iconst_1        
	//   99  179:istore          7
			}
		} else
	//* 100  181:goto            226
		{
			flag2 = flag4;
	//  101  184:iload           9
	//  102  186:istore          7
			f1 = f3;
	//  103  188:fload_3         
	//  104  189:fstore_1        
			if(f3 > f2)
	//* 105  190:fload_3         
	//* 106  191:fload_2         
	//* 107  192:fcmpl           
	//* 108  193:ifle            226
			{
				flag2 = flag3;
	//  109  196:iload           8
	//  110  198:istore          7
				if(flag1)
	//* 111  200:iload           6
	//* 112  202:ifeq            224
				{
					S.onPull(Math.abs(f3 - f2) / f4);
	//  113  205:aload_0         
	//  114  206:getfield        #428 <Field EdgeEffect S>
	//  115  209:fload_3         
	//  116  210:fload_2         
	//  117  211:fsub            
	//  118  212:invokestatic    #420 <Method float Math.abs(float)>
	//  119  215:fload           4
	//  120  217:fdiv            
	//  121  218:invokevirtual   #426 <Method void EdgeEffect.onPull(float)>
					flag2 = true;
	//  122  221:iconst_1        
	//  123  222:istore          7
				}
				f1 = f2;
	//  124  224:fload_2         
	//  125  225:fstore_1        
			}
		}
		f2 = G;
	//  126  226:aload_0         
	//  127  227:getfield        #349 <Field float G>
	//  128  230:fstore_2        
		int i1 = (int)f1;
	//  129  231:fload_1         
	//  130  232:f2i             
	//  131  233:istore          5
		G = f2 + (f1 - (float)i1);
	//  132  235:aload_0         
	//  133  236:fload_2         
	//  134  237:fload_1         
	//  135  238:iload           5
	//  136  240:i2f             
	//  137  241:fsub            
	//  138  242:fadd            
	//  139  243:putfield        #349 <Field float G>
		scrollTo(i1, getScrollY());
	//  140  246:aload_0         
	//  141  247:iload           5
	//  142  249:aload_0         
	//  143  250:invokevirtual   #293 <Method int getScrollY()>
	//  144  253:invokevirtual   #297 <Method void scrollTo(int, int)>
		d(i1);
	//  145  256:aload_0         
	//  146  257:iload           5
	//  147  259:invokespecial   #319 <Method boolean d(int)>
	//  148  262:pop             
		return flag2;
	//  149  263:iload           7
	//  150  265:ireturn         
	}

	private void c(boolean flag)
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #429 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #434 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private static boolean c(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ViewPager$a) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #441 <Method Class Object.getClass()>
	//    2    4:ldc1            #22  <Class ViewPager$a>
	//    3    6:invokevirtual   #447 <Method Annotation Class.getAnnotation(Class)>
	//    4    9:ifnull          14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	private boolean d(int i1)
	{
		if(g.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field ArrayList g>
	//*   2    4:invokevirtual   #207 <Method int ArrayList.size()>
	//*   3    7:ifne            51
		{
			if(T)
	//*   4   10:aload_0         
	//*   5   11:getfield        #174 <Field boolean T>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			V = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #449 <Field boolean V>
			a(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #450 <Method void a(int, float, int)>
			if(!V)
	//*  17   31:aload_0         
	//*  18   32:getfield        #449 <Field boolean V>
	//*  19   35:ifne            49
				throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   20   38:new             #452 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #454 <String "onPageScrolled did not call superclass implementation">
	//   23   45:invokespecial   #457 <Method void IllegalStateException(String)>
	//   24   48:athrow          
			else
				return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		b b1 = i();
	//   27   51:aload_0         
	//   28   52:invokespecial   #460 <Method ViewPager$b i()>
	//   29   55:astore          7
		int k1 = getClientWidth();
	//   30   57:aload_0         
	//   31   58:invokespecial   #277 <Method int getClientWidth()>
	//   32   61:istore          5
		int l1 = p;
	//   33   63:aload_0         
	//   34   64:getfield        #329 <Field int p>
	//   35   67:istore          6
		float f2 = p;
	//   36   69:aload_0         
	//   37   70:getfield        #329 <Field int p>
	//   38   73:i2f             
	//   39   74:fstore_3        
		float f1 = k1;
	//   40   75:iload           5
	//   41   77:i2f             
	//   42   78:fstore_2        
		f2 /= f1;
	//   43   79:fload_3         
	//   44   80:fload_2         
	//   45   81:fdiv            
	//   46   82:fstore_3        
		int j1 = b1.b;
	//   47   83:aload           7
	//   48   85:getfield        #213 <Field int ViewPager$b.b>
	//   49   88:istore          4
		f1 = ((float)i1 / f1 - b1.e) / (b1.d + f2);
	//   50   90:iload_1         
	//   51   91:i2f             
	//   52   92:fload_2         
	//   53   93:fdiv            
	//   54   94:aload           7
	//   55   96:getfield        #302 <Field float ViewPager$b.e>
	//   56   99:fsub            
	//   57  100:aload           7
	//   58  102:getfield        #331 <Field float ViewPager$b.d>
	//   59  105:fload_3         
	//   60  106:fadd            
	//   61  107:fdiv            
	//   62  108:fstore_2        
		i1 = (int)((float)(l1 + k1) * f1);
	//   63  109:iload           6
	//   64  111:iload           5
	//   65  113:iadd            
	//   66  114:i2f             
	//   67  115:fload_2         
	//   68  116:fmul            
	//   69  117:f2i             
	//   70  118:istore_1        
		V = false;
	//   71  119:aload_0         
	//   72  120:iconst_0        
	//   73  121:putfield        #449 <Field boolean V>
		a(j1, f1, i1);
	//   74  124:aload_0         
	//   75  125:iload           4
	//   76  127:fload_2         
	//   77  128:iload_1         
	//   78  129:invokevirtual   #450 <Method void a(int, float, int)>
		if(!V)
	//*  79  132:aload_0         
	//*  80  133:getfield        #449 <Field boolean V>
	//*  81  136:ifne            150
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   82  139:new             #452 <Class IllegalStateException>
	//   83  142:dup             
	//   84  143:ldc2            #454 <String "onPageScrolled did not call superclass implementation">
	//   85  146:invokespecial   #457 <Method void IllegalStateException(String)>
	//   86  149:athrow          
		else
			return true;
	//   87  150:iconst_1        
	//   88  151:ireturn         
	}

	private void e(int i1)
	{
		if(ab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #391 <Field ViewPager$e ab>
	//*   2    4:ifnull          17
			ab.b(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #391 <Field ViewPager$e ab>
	//    5   11:iload_1         
	//    6   12:invokeinterface #462 <Method void ViewPager$e.b(int)>
		if(aa != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #395 <Field List aa>
	//*   9   21:ifnull          76
		{
			int j1 = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k1 = aa.size(); j1 < k1; j1++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #395 <Field List aa>
	//*  14   30:invokeinterface #398 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				e e1 = (e)aa.get(j1);
	//   19   41:aload_0         
	//   20   42:getfield        #395 <Field List aa>
	//   21   45:iload_2         
	//   22   46:invokeinterface #399 <Method Object List.get(int)>
	//   23   51:checkcast       #34  <Class ViewPager$e>
	//   24   54:astore          4
				if(e1 != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					e1.b(i1);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #462 <Method void ViewPager$e.b(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(ac != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #401 <Field ViewPager$e ac>
	//*  37   80:ifnull          93
			ac.b(i1);
	//   38   83:aload_0         
	//   39   84:getfield        #401 <Field ViewPager$e ac>
	//   40   87:iload_1         
	//   41   88:invokeinterface #462 <Method void ViewPager$e.b(int)>
	//   42   93:return          
	}

	private void f()
	{
		int j1;
		for(int i1 = 0; i1 < getChildCount(); i1 = j1 + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #404 <Method int getChildCount()>
	//*   5    7:icmpge          45
		{
			j1 = i1;
	//    6   10:iload_1         
	//    7   11:istore_2        
			if(!((LayoutParams)getChildAt(i1).getLayoutParams()).a)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #410 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #14  <Class ViewPager$LayoutParams>
	//*  13   23:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//*  14   26:ifne            38
			{
				removeViewAt(i1);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #471 <Method void removeViewAt(int)>
				j1 = i1 - 1;
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

	private void f(int i1)
	{
		if(ab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #391 <Field ViewPager$e ab>
	//*   2    4:ifnull          17
			ab.a(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #391 <Field ViewPager$e ab>
	//    5   11:iload_1         
	//    6   12:invokeinterface #473 <Method void android.support.v4.view.ViewPager$e.a(int)>
		if(aa != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #395 <Field List aa>
	//*   9   21:ifnull          76
		{
			int j1 = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k1 = aa.size(); j1 < k1; j1++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #395 <Field List aa>
	//*  14   30:invokeinterface #398 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				e e1 = (e)aa.get(j1);
	//   19   41:aload_0         
	//   20   42:getfield        #395 <Field List aa>
	//   21   45:iload_2         
	//   22   46:invokeinterface #399 <Method Object List.get(int)>
	//   23   51:checkcast       #34  <Class ViewPager$e>
	//   24   54:astore          4
				if(e1 != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					e1.a(i1);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #473 <Method void android.support.v4.view.ViewPager$e.a(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(ac != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #401 <Field ViewPager$e ac>
	//*  37   80:ifnull          93
			ac.a(i1);
	//   38   83:aload_0         
	//   39   84:getfield        #401 <Field ViewPager$e ac>
	//   40   87:iload_1         
	//   41   88:invokeinterface #473 <Method void android.support.v4.view.ViewPager$e.a(int)>
	//   42   93:return          
	}

	private void g()
	{
		if(ag != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #475 <Field int ag>
	//*   2    4:ifeq            79
		{
			if(ah == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #477 <Field ArrayList ah>
	//*   5   11:ifnonnull       28
				ah = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #145 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #146 <Method void ArrayList()>
	//   10   22:putfield        #477 <Field ArrayList ah>
			else
	//*  11   25:goto            35
				ah.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #477 <Field ArrayList ah>
	//   14   32:invokevirtual   #478 <Method void ArrayList.clear()>
			int j1 = getChildCount();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #404 <Method int getChildCount()>
	//   17   39:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
	//*  18   40:iconst_0        
	//*  19   41:istore_1        
	//*  20   42:iload_1         
	//*  21   43:iload_2         
	//*  22   44:icmpge          69
			{
				View view = getChildAt(i1);
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #410 <Method View getChildAt(int)>
	//   26   52:astore_3        
				ah.add(((Object) (view)));
	//   27   53:aload_0         
	//   28   54:getfield        #477 <Field ArrayList ah>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            42
			Collections.sort(((List) (ah)), ((Comparator) (ai)));
	//   37   69:aload_0         
	//   38   70:getfield        #477 <Field ArrayList ah>
	//   39   73:getstatic       #139 <Field ViewPager$i ai>
	//   40   76:invokestatic    #488 <Method void Collections.sort(List, Comparator)>
		}
	//   41   79:return          
	}

	private int getClientWidth()
	{
		return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #491 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #284 <Method int getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #287 <Method int getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private boolean h()
	{
		K = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #172 <Field int K>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #493 <Method void j()>
		R.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #417 <Field EdgeEffect R>
	//    7   13:invokevirtual   #496 <Method void EdgeEffect.onRelease()>
		S.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #428 <Field EdgeEffect S>
	//   10   20:invokevirtual   #496 <Method void EdgeEffect.onRelease()>
		return R.isFinished() || S.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #417 <Field EdgeEffect R>
	//   13   27:invokevirtual   #497 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            48
	//   15   33:aload_0         
	//   16   34:getfield        #428 <Field EdgeEffect S>
	//   17   37:invokevirtual   #497 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            46
	//   19   43:goto            48
	//   20   46:iconst_0        
	//   21   47:ireturn         
	//   22   48:iconst_1        
	//   23   49:ireturn         
	}

	private b i()
	{
		int i1 = getClientWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method int getClientWidth()>
	//    2    4:istore          5
		float f1;
		if(i1 > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            24
			f1 = (float)getScrollX() / (float)i1;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #290 <Method int getScrollX()>
	//    7   15:i2f             
	//    8   16:iload           5
	//    9   18:i2f             
	//   10   19:fdiv            
	//   11   20:fstore_1        
		else
	//*  12   21:goto            26
			f1 = 0.0F;
	//   13   24:fconst_0        
	//   14   25:fstore_1        
		float f2;
		if(i1 > 0)
	//*  15   26:iload           5
	//*  16   28:ifle            44
			f2 = (float)p / (float)i1;
	//   17   31:aload_0         
	//   18   32:getfield        #329 <Field int p>
	//   19   35:i2f             
	//   20   36:iload           5
	//   21   38:i2f             
	//   22   39:fdiv            
	//   23   40:fstore_2        
		else
	//*  24   41:goto            46
			f2 = 0.0F;
	//   25   44:fconst_0        
	//   26   45:fstore_2        
		b b2 = null;
	//   27   46:aconst_null     
	//   28   47:astore          11
		i1 = 0;
	//   29   49:iconst_0        
	//   30   50:istore          5
		boolean flag = true;
	//   31   52:iconst_1        
	//   32   53:istore          6
		int j1 = -1;
	//   33   55:iconst_m1       
	//   34   56:istore          7
		float f3 = 0.0F;
	//   35   58:fconst_0        
	//   36   59:fstore_3        
		float f4 = 0.0F;
	//   37   60:fconst_0        
	//   38   61:fstore          4
		while(i1 < g.size()) 
	//*  39   63:iload           5
	//*  40   65:aload_0         
	//*  41   66:getfield        #148 <Field ArrayList g>
	//*  42   69:invokevirtual   #207 <Method int ArrayList.size()>
	//*  43   72:icmpge          268
		{
			b b3 = (b)g.get(i1);
	//   44   75:aload_0         
	//   45   76:getfield        #148 <Field ArrayList g>
	//   46   79:iload           5
	//   47   81:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   48   84:checkcast       #25  <Class ViewPager$b>
	//   49   87:astore          12
			int k1 = i1;
	//   50   89:iload           5
	//   51   91:istore          8
			b b1 = b3;
	//   52   93:aload           12
	//   53   95:astore          10
			if(!flag)
	//*  54   97:iload           6
	//*  55   99:ifne            177
			{
				int l1 = b3.b;
	//   56  102:aload           12
	//   57  104:getfield        #213 <Field int ViewPager$b.b>
	//   58  107:istore          9
				j1++;
	//   59  109:iload           7
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore          7
				k1 = i1;
	//   63  115:iload           5
	//   64  117:istore          8
				b1 = b3;
	//   65  119:aload           12
	//   66  121:astore          10
				if(l1 != j1)
	//*  67  123:iload           9
	//*  68  125:iload           7
	//*  69  127:icmpeq          177
				{
					b1 = h;
	//   70  130:aload_0         
	//   71  131:getfield        #151 <Field ViewPager$b h>
	//   72  134:astore          10
					b1.e = f3 + f4 + f2;
	//   73  136:aload           10
	//   74  138:fload_3         
	//   75  139:fload           4
	//   76  141:fadd            
	//   77  142:fload_2         
	//   78  143:fadd            
	//   79  144:putfield        #302 <Field float ViewPager$b.e>
					b1.b = j1;
	//   80  147:aload           10
	//   81  149:iload           7
	//   82  151:putfield        #213 <Field int ViewPager$b.b>
					b1.d = b.getPageWidth(b1.b);
	//   83  154:aload           10
	//   84  156:aload_0         
	//   85  157:getfield        #322 <Field p b>
	//   86  160:aload           10
	//   87  162:getfield        #213 <Field int ViewPager$b.b>
	//   88  165:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//   89  168:putfield        #331 <Field float ViewPager$b.d>
					k1 = i1 - 1;
	//   90  171:iload           5
	//   91  173:iconst_1        
	//   92  174:isub            
	//   93  175:istore          8
				}
			}
			f3 = b1.e;
	//   94  177:aload           10
	//   95  179:getfield        #302 <Field float ViewPager$b.e>
	//   96  182:fstore_3        
			f4 = b1.d;
	//   97  183:aload           10
	//   98  185:getfield        #331 <Field float ViewPager$b.d>
	//   99  188:fstore          4
			if(!flag && f1 < f3)
	//* 100  190:iload           6
	//* 101  192:ifne            207
	//* 102  195:fload_1         
	//* 103  196:fload_3         
	//* 104  197:fcmpl           
	//* 105  198:iflt            204
	//* 106  201:goto            207
				return b2;
	//  107  204:aload           11
	//  108  206:areturn         
			if(f1 >= f4 + f3 + f2)
	//* 109  207:fload_1         
	//* 110  208:fload           4
	//* 111  210:fload_3         
	//* 112  211:fadd            
	//* 113  212:fload_2         
	//* 114  213:fadd            
	//* 115  214:fcmpg           
	//* 116  215:iflt            265
			{
				if(k1 == g.size() - 1)
	//* 117  218:iload           8
	//* 118  220:aload_0         
	//* 119  221:getfield        #148 <Field ArrayList g>
	//* 120  224:invokevirtual   #207 <Method int ArrayList.size()>
	//* 121  227:iconst_1        
	//* 122  228:isub            
	//* 123  229:icmpne          235
					return b1;
	//  124  232:aload           10
	//  125  234:areturn         
				j1 = b1.b;
	//  126  235:aload           10
	//  127  237:getfield        #213 <Field int ViewPager$b.b>
	//  128  240:istore          7
				f4 = b1.d;
	//  129  242:aload           10
	//  130  244:getfield        #331 <Field float ViewPager$b.d>
	//  131  247:fstore          4
				i1 = k1 + 1;
	//  132  249:iload           8
	//  133  251:iconst_1        
	//  134  252:iadd            
	//  135  253:istore          5
				flag = false;
	//  136  255:iconst_0        
	//  137  256:istore          6
				b2 = b1;
	//  138  258:aload           10
	//  139  260:astore          11
			} else
	//* 140  262:goto            63
			{
				return b1;
	//  141  265:aload           10
	//  142  267:areturn         
			}
		}
		return b2;
	//  143  268:aload           11
	//  144  270:areturn         
	}

	private void j()
	{
		B = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #499 <Field boolean B>
		C = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #501 <Field boolean C>
		if(L != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #351 <Field VelocityTracker L>
	//*   8   14:ifnull          29
		{
			L.recycle();
	//    9   17:aload_0         
	//   10   18:getfield        #351 <Field VelocityTracker L>
	//   11   21:invokevirtual   #504 <Method void VelocityTracker.recycle()>
			L = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #351 <Field VelocityTracker L>
		}
	//   15   29:return          
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(y != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #506 <Field boolean y>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			y = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #506 <Field boolean y>
	//    7   13:return          
	}

	float a(float f1)
	{
		return (float)Math.sin((f1 - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc2            #507 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #508 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #512 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	b a(int i1, int j1)
	{
		b b1 = new b();
	//    0    0:new             #25  <Class ViewPager$b>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void ViewPager$b()>
	//    3    7:astore_3        
		b1.b = i1;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #213 <Field int ViewPager$b.b>
		b1.a = b.instantiateItem(((ViewGroup) (this)), i1);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #322 <Field p b>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #517 <Method Object p.instantiateItem(ViewGroup, int)>
	//   13   23:putfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
		b1.d = b.getPageWidth(i1);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #322 <Field p b>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//   19   35:putfield        #331 <Field float ViewPager$b.d>
		if(j1 >= 0 && j1 < g.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            67
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #148 <Field ArrayList g>
	//*  25   47:invokevirtual   #207 <Method int ArrayList.size()>
	//*  26   50:icmplt          56
	//*  27   53:goto            67
		{
			g.add(j1, ((Object) (b1)));
	//   28   56:aload_0         
	//   29   57:getfield        #148 <Field ArrayList g>
	//   30   60:iload_2         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #523 <Method void ArrayList.add(int, Object)>
			return b1;
	//   33   65:aload_3         
	//   34   66:areturn         
		} else
		{
			g.add(((Object) (b1)));
	//   35   67:aload_0         
	//   36   68:getfield        #148 <Field ArrayList g>
	//   37   71:aload_3         
	//   38   72:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   39   75:pop             
			return b1;
	//   40   76:aload_3         
	//   41   77:areturn         
		}
	}

	b a(View view)
	{
		for(int i1 = 0; i1 < g.size(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #148 <Field ArrayList g>
	//*   5    7:invokevirtual   #207 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			b b1 = (b)g.get(i1);
	//    7   13:aload_0         
	//    8   14:getfield        #148 <Field ArrayList g>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #25  <Class ViewPager$b>
	//   12   24:astore_3        
			if(b.isViewFromObject(view, b1.a))
	//*  13   25:aload_0         
	//*  14   26:getfield        #322 <Field p b>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//*  18   34:invokevirtual   #528 <Method boolean p.isViewFromObject(View, Object)>
	//*  19   37:ifeq            42
				return b1;
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

	void a()
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #531 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #532 <Int 0x40000>
	//    5    9:invokevirtual   #535 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #538 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #542 <Method Context getContext()>
	//   11   21:astore_2        
		m = new Scroller(context, f);
	//   12   22:aload_0         
	//   13   23:new             #268 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #136 <Field Interpolator f>
	//   17   31:invokespecial   #545 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #266 <Field Scroller m>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #550 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f1 = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #556 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #562 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #567 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		F = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #570 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #572 <Field int F>
		M = (int)(400F * f1);
	//   31   61:aload_0         
	//   32   62:ldc2            #573 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #199 <Field int M>
		N = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #576 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #578 <Field int N>
		R = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #422 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #579 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #417 <Field EdgeEffect R>
		S = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #422 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #579 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #428 <Field EdgeEffect S>
		O = (int)(25F * f1);
	//   53  103:aload_0         
	//   54  104:ldc2            #580 <Float 25F>
	//   55  107:fload_1         
	//   56  108:fmul            
	//   57  109:f2i             
	//   58  110:putfield        #197 <Field int O>
		P = (int)(2.0F * f1);
	//   59  113:aload_0         
	//   60  114:fconst_2        
	//   61  115:fload_1         
	//   62  116:fmul            
	//   63  117:f2i             
	//   64  118:putfield        #582 <Field int P>
		D = (int)(f1 * 16F);
	//   65  121:aload_0         
	//   66  122:fload_1         
	//   67  123:ldc2            #583 <Float 16F>
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #585 <Field int D>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (new c())));
	//   71  131:aload_0         
	//   72  132:new             #28  <Class ViewPager$c>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #586 <Method void ViewPager$c(ViewPager)>
	//   76  140:invokestatic    #589 <Method void android.support.v4.view.s.a(View, android.support.v4.view.a)>
		if(android.support.v4.view.s.d(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #592 <Method int s.d(View)>
	//*  79  147:ifne            155
			android.support.v4.view.s.a(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #595 <Method void android.support.v4.view.s.a(View, int)>
		android.support.v4.view.s.a(((View) (this)), new o() {

			public aa a(View view, aa aa1)
			{
				view = ((View) (android.support.v4.view.s.a(view, aa1)));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #31  <Method aa android.support.v4.view.s.a(View, aa)>
			//    3    5:astore_1        
				if(((aa) (view)).f())
			//*   4    6:aload_1         
			//*   5    7:invokevirtual   #37  <Method boolean aa.f()>
			//*   6   10:ifeq            15
					return ((aa) (view));
			//    7   13:aload_1         
			//    8   14:areturn         
				aa1 = ((aa) (b));
			//    9   15:aload_0         
			//   10   16:getfield        #25  <Field Rect b>
			//   11   19:astore_2        
				aa1.left = ((aa) (view)).a();
			//   12   20:aload_2         
			//   13   21:aload_1         
			//   14   22:invokevirtual   #40  <Method int android.support.v4.view.aa.a()>
			//   15   25:putfield        #44  <Field int Rect.left>
				aa1.top = ((aa) (view)).b();
			//   16   28:aload_2         
			//   17   29:aload_1         
			//   18   30:invokevirtual   #46  <Method int aa.b()>
			//   19   33:putfield        #49  <Field int Rect.top>
				aa1.right = ((aa) (view)).c();
			//   20   36:aload_2         
			//   21   37:aload_1         
			//   22   38:invokevirtual   #52  <Method int aa.c()>
			//   23   41:putfield        #55  <Field int Rect.right>
				aa1.bottom = ((aa) (view)).d();
			//   24   44:aload_2         
			//   25   45:aload_1         
			//   26   46:invokevirtual   #58  <Method int aa.d()>
			//   27   49:putfield        #61  <Field int Rect.bottom>
				int i1 = 0;
			//   28   52:iconst_0        
			//   29   53:istore_3        
				for(int j1 = a.getChildCount(); i1 < j1; i1++)
			//*  30   54:aload_0         
			//*  31   55:getfield        #18  <Field ViewPager a>
			//*  32   58:invokevirtual   #64  <Method int ViewPager.getChildCount()>
			//*  33   61:istore          4
			//*  34   63:iload_3         
			//*  35   64:iload           4
			//*  36   66:icmpge          154
				{
					aa aa2 = android.support.v4.view.s.b(a.getChildAt(i1), ((aa) (view)));
			//   37   69:aload_0         
			//   38   70:getfield        #18  <Field ViewPager a>
			//   39   73:iload_3         
			//   40   74:invokevirtual   #68  <Method View ViewPager.getChildAt(int)>
			//   41   77:aload_1         
			//   42   78:invokestatic    #70  <Method aa s.b(View, aa)>
			//   43   81:astore          5
					aa1.left = Math.min(aa2.a(), ((Rect) (aa1)).left);
			//   44   83:aload_2         
			//   45   84:aload           5
			//   46   86:invokevirtual   #40  <Method int android.support.v4.view.aa.a()>
			//   47   89:aload_2         
			//   48   90:getfield        #44  <Field int Rect.left>
			//   49   93:invokestatic    #76  <Method int Math.min(int, int)>
			//   50   96:putfield        #44  <Field int Rect.left>
					aa1.top = Math.min(aa2.b(), ((Rect) (aa1)).top);
			//   51   99:aload_2         
			//   52  100:aload           5
			//   53  102:invokevirtual   #46  <Method int aa.b()>
			//   54  105:aload_2         
			//   55  106:getfield        #49  <Field int Rect.top>
			//   56  109:invokestatic    #76  <Method int Math.min(int, int)>
			//   57  112:putfield        #49  <Field int Rect.top>
					aa1.right = Math.min(aa2.c(), ((Rect) (aa1)).right);
			//   58  115:aload_2         
			//   59  116:aload           5
			//   60  118:invokevirtual   #52  <Method int aa.c()>
			//   61  121:aload_2         
			//   62  122:getfield        #55  <Field int Rect.right>
			//   63  125:invokestatic    #76  <Method int Math.min(int, int)>
			//   64  128:putfield        #55  <Field int Rect.right>
					aa1.bottom = Math.min(aa2.d(), ((Rect) (aa1)).bottom);
			//   65  131:aload_2         
			//   66  132:aload           5
			//   67  134:invokevirtual   #58  <Method int aa.d()>
			//   68  137:aload_2         
			//   69  138:getfield        #61  <Field int Rect.bottom>
			//   70  141:invokestatic    #76  <Method int Math.min(int, int)>
			//   71  144:putfield        #61  <Field int Rect.bottom>
				}

			//   72  147:iload_3         
			//   73  148:iconst_1        
			//   74  149:iadd            
			//   75  150:istore_3        
			//*  76  151:goto            63
				return ((aa) (view)).a(((Rect) (aa1)).left, ((Rect) (aa1)).top, ((Rect) (aa1)).right, ((Rect) (aa1)).bottom);
			//   77  154:aload_1         
			//   78  155:aload_2         
			//   79  156:getfield        #44  <Field int Rect.left>
			//   80  159:aload_2         
			//   81  160:getfield        #49  <Field int Rect.top>
			//   82  163:aload_2         
			//   83  164:getfield        #55  <Field int Rect.right>
			//   84  167:aload_2         
			//   85  168:getfield        #61  <Field int Rect.bottom>
			//   86  171:invokevirtual   #79  <Method aa android.support.v4.view.aa.a(int, int, int, int)>
			//   87  174:areturn         
			}

			final ViewPager a;
			private final Rect b = new Rect();

			
			{
				a = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ViewPager a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:aload_0         
			//    6   10:new             #22  <Class Rect>
			//    7   13:dup             
			//    8   14:invokespecial   #23  <Method void Rect()>
			//    9   17:putfield        #25  <Field Rect b>
			//   10   20:return          
			}
		}
);
	//   83  155:aload_0         
	//   84  156:new             #12  <Class ViewPager$4>
	//   85  159:dup             
	//   86  160:aload_0         
	//   87  161:invokespecial   #596 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #599 <Method void android.support.v4.view.s.a(View, o)>
	//   89  167:return          
	}

	void a(int i1)
	{
		float f3;
		int j1;
		int i3;
		int j3;
		int l3;
		Object obj2;
		b b5;
		int k3;
		b b1;
label0:
		{
			if(c != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field int c>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
			{
				obj2 = ((Object) (b(c)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #201 <Field int c>
	//    7   13:invokevirtual   #300 <Method ViewPager$b b(int)>
	//    8   16:astore          14
				c = i1;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #201 <Field int c>
			} else
	//*  12   23:goto            29
			{
				obj2 = null;
	//   13   26:aconst_null     
	//   14   27:astore          14
			}
			if(b == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #322 <Field p b>
	//*  17   33:ifnonnull       41
			{
				g();
	//   18   36:aload_0         
	//   19   37:invokespecial   #603 <Method void g()>
				return;
	//   20   40:return          
			}
			if(z)
	//*  21   41:aload_0         
	//*  22   42:getfield        #370 <Field boolean z>
	//*  23   45:ifeq            53
			{
				g();
	//   24   48:aload_0         
	//   25   49:invokespecial   #603 <Method void g()>
				return;
	//   26   52:return          
			}
			if(getWindowToken() == null)
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #607 <Method android.os.IBinder getWindowToken()>
	//*  29   57:ifnonnull       61
				return;
	//   30   60:return          
			b.startUpdate(((ViewGroup) (this)));
	//   31   61:aload_0         
	//   32   62:getfield        #322 <Field p b>
	//   33   65:aload_0         
	//   34   66:invokevirtual   #611 <Method void p.startUpdate(ViewGroup)>
			i1 = A;
	//   35   69:aload_0         
	//   36   70:getfield        #170 <Field int A>
	//   37   73:istore_1        
			k3 = Math.max(0, c - i1);
	//   38   74:iconst_0        
	//   39   75:aload_0         
	//   40   76:getfield        #201 <Field int c>
	//   41   79:iload_1         
	//   42   80:isub            
	//   43   81:invokestatic    #220 <Method int Math.max(int, int)>
	//   44   84:istore          11
			i3 = b.getCount();
	//   45   86:aload_0         
	//   46   87:getfield        #322 <Field p b>
	//   47   90:invokevirtual   #327 <Method int p.getCount()>
	//   48   93:istore          9
			j3 = Math.min(i3 - 1, c + i1);
	//   49   95:iload           9
	//   50   97:iconst_1        
	//   51   98:isub            
	//   52   99:aload_0         
	//   53  100:getfield        #201 <Field int c>
	//   54  103:iload_1         
	//   55  104:iadd            
	//   56  105:invokestatic    #217 <Method int Math.min(int, int)>
	//   57  108:istore          10
			if(i3 != d)
	//*  58  110:iload           9
	//*  59  112:aload_0         
	//*  60  113:getfield        #613 <Field int d>
	//*  61  116:icmpeq          260
			{
				String s1;
				try
				{
					s1 = getResources().getResourceName(getId());
	//   62  119:aload_0         
	//   63  120:invokevirtual   #614 <Method Resources getResources()>
	//   64  123:aload_0         
	//   65  124:invokevirtual   #617 <Method int getId()>
	//   66  127:invokevirtual   #621 <Method String Resources.getResourceName(int)>
	//   67  130:astore          13
				}
	//*  68  132:goto            144
	//*  69  135:aload_0         
	//*  70  136:invokevirtual   #617 <Method int getId()>
	//*  71  139:invokestatic    #626 <Method String Integer.toHexString(int)>
	//*  72  142:astore          13
	//*  73  144:new             #628 <Class StringBuilder>
	//*  74  147:dup             
	//*  75  148:invokespecial   #629 <Method void StringBuilder()>
	//*  76  151:astore          14
	//*  77  153:aload           14
	//*  78  155:ldc2            #631 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//*  79  158:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//*  80  161:pop             
	//*  81  162:aload           14
	//*  82  164:aload_0         
	//*  83  165:getfield        #613 <Field int d>
	//*  84  168:invokevirtual   #638 <Method StringBuilder StringBuilder.append(int)>
	//*  85  171:pop             
	//*  86  172:aload           14
	//*  87  174:ldc2            #640 <String ", found: ">
	//*  88  177:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//*  89  180:pop             
	//*  90  181:aload           14
	//*  91  183:iload           9
	//*  92  185:invokevirtual   #638 <Method StringBuilder StringBuilder.append(int)>
	//*  93  188:pop             
	//*  94  189:aload           14
	//*  95  191:ldc2            #642 <String " Pager id: ">
	//*  96  194:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//*  97  197:pop             
	//*  98  198:aload           14
	//*  99  200:aload           13
	//* 100  202:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//* 101  205:pop             
	//* 102  206:aload           14
	//* 103  208:ldc2            #644 <String " Pager class: ">
	//* 104  211:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//* 105  214:pop             
	//* 106  215:aload           14
	//* 107  217:aload_0         
	//* 108  218:invokevirtual   #441 <Method Class Object.getClass()>
	//* 109  221:invokevirtual   #647 <Method StringBuilder StringBuilder.append(Object)>
	//* 110  224:pop             
	//* 111  225:aload           14
	//* 112  227:ldc2            #649 <String " Problematic adapter: ">
	//* 113  230:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//* 114  233:pop             
	//* 115  234:aload           14
	//* 116  236:aload_0         
	//* 117  237:getfield        #322 <Field p b>
	//* 118  240:invokevirtual   #441 <Method Class Object.getClass()>
	//* 119  243:invokevirtual   #647 <Method StringBuilder StringBuilder.append(Object)>
	//* 120  246:pop             
	//* 121  247:new             #452 <Class IllegalStateException>
	//* 122  250:dup             
	//* 123  251:aload           14
	//* 124  253:invokevirtual   #653 <Method String StringBuilder.toString()>
	//* 125  256:invokespecial   #457 <Method void IllegalStateException(String)>
	//* 126  259:athrow          
	//* 127  260:iconst_0        
	//* 128  261:istore_1        
	//* 129  262:iload_1         
	//* 130  263:aload_0         
	//* 131  264:getfield        #148 <Field ArrayList g>
	//* 132  267:invokevirtual   #207 <Method int ArrayList.size()>
	//* 133  270:icmpge          320
	//* 134  273:aload_0         
	//* 135  274:getfield        #148 <Field ArrayList g>
	//* 136  277:iload_1         
	//* 137  278:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 138  281:checkcast       #25  <Class ViewPager$b>
	//* 139  284:astore          13
	//* 140  286:aload           13
	//* 141  288:getfield        #213 <Field int ViewPager$b.b>
	//* 142  291:aload_0         
	//* 143  292:getfield        #201 <Field int c>
	//* 144  295:icmplt          313
	//* 145  298:aload           13
	//* 146  300:getfield        #213 <Field int ViewPager$b.b>
	//* 147  303:aload_0         
	//* 148  304:getfield        #201 <Field int c>
	//* 149  307:icmpne          320
	//* 150  310:goto            323
	//* 151  313:iload_1         
	//* 152  314:iconst_1        
	//* 153  315:iadd            
	//* 154  316:istore_1        
	//* 155  317:goto            262
	//* 156  320:aconst_null     
	//* 157  321:astore          13
	//* 158  323:aload           13
	//* 159  325:astore          15
	//* 160  327:aload           13
	//* 161  329:ifnonnull       352
	//* 162  332:aload           13
	//* 163  334:astore          15
	//* 164  336:iload           9
	//* 165  338:ifle            352
	//* 166  341:aload_0         
	//* 167  342:aload_0         
	//* 168  343:getfield        #201 <Field int c>
	//* 169  346:iload_1         
	//* 170  347:invokevirtual   #655 <Method ViewPager$b a(int, int)>
	//* 171  350:astore          15
	//* 172  352:aload           15
	//* 173  354:ifnull          1047
	//* 174  357:iload_1         
	//* 175  358:iconst_1        
	//* 176  359:isub            
	//* 177  360:istore          5
	//* 178  362:iload           5
	//* 179  364:iflt            384
	//* 180  367:aload_0         
	//* 181  368:getfield        #148 <Field ArrayList g>
	//* 182  371:iload           5
	//* 183  373:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 184  376:checkcast       #25  <Class ViewPager$b>
	//* 185  379:astore          13
	//* 186  381:goto            387
	//* 187  384:aconst_null     
	//* 188  385:astore          13
	//* 189  387:aload_0         
	//* 190  388:invokespecial   #277 <Method int getClientWidth()>
	//* 191  391:istore          12
	//* 192  393:iload           12
	//* 193  395:ifgt            404
	//* 194  398:fconst_0        
	//* 195  399:fstore          4
	//* 196  401:goto            423
	//* 197  404:fconst_2        
	//* 198  405:aload           15
	//* 199  407:getfield        #331 <Field float ViewPager$b.d>
	//* 200  410:fsub            
	//* 201  411:aload_0         
	//* 202  412:invokevirtual   #284 <Method int getPaddingLeft()>
	//* 203  415:i2f             
	//* 204  416:iload           12
	//* 205  418:i2f             
	//* 206  419:fdiv            
	//* 207  420:fadd            
	//* 208  421:fstore          4
	//* 209  423:aload_0         
	//* 210  424:getfield        #201 <Field int c>
	//* 211  427:iconst_1        
	//* 212  428:isub            
	//* 213  429:istore          8
	//* 214  431:fconst_0        
	//* 215  432:fstore_3        
	//* 216  433:iload           8
	//* 217  435:iflt            698
	//* 218  438:fload_3         
	//* 219  439:fload           4
	//* 220  441:fcmpl           
	//* 221  442:iflt            556
	//* 222  445:iload           8
	//* 223  447:iload           11
	//* 224  449:icmpge          556
	//* 225  452:aload           13
	//* 226  454:ifnonnull       460
	//* 227  457:goto            698
	//* 228  460:fload_3         
	//* 229  461:fstore_2        
	//* 230  462:iload           5
	//* 231  464:istore          7
	//* 232  466:aload           13
	//* 233  468:astore          16
	//* 234  470:iload_1         
	//* 235  471:istore          6
	//* 236  473:iload           8
	//* 237  475:aload           13
	//* 238  477:getfield        #213 <Field int ViewPager$b.b>
	//* 239  480:icmpne          676
	//* 240  483:fload_3         
	//* 241  484:fstore_2        
	//* 242  485:iload           5
	//* 243  487:istore          7
	//* 244  489:aload           13
	//* 245  491:astore          16
	//* 246  493:iload_1         
	//* 247  494:istore          6
	//* 248  496:aload           13
	//* 249  498:getfield        #372 <Field boolean ViewPager$b.c>
	//* 250  501:ifne            676
	//* 251  504:aload_0         
	//* 252  505:getfield        #148 <Field ArrayList g>
	//* 253  508:iload           5
	//* 254  510:invokevirtual   #658 <Method Object ArrayList.remove(int)>
	//* 255  513:pop             
	//* 256  514:aload_0         
	//* 257  515:getfield        #322 <Field p b>
	//* 258  518:aload_0         
	//* 259  519:iload           8
	//* 260  521:aload           13
	//* 261  523:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//* 262  526:invokevirtual   #662 <Method void p.destroyItem(ViewGroup, int, Object)>
	//* 263  529:iload           5
	//* 264  531:iconst_1        
	//* 265  532:isub            
	//* 266  533:istore          5
	//* 267  535:iload_1         
	//* 268  536:iconst_1        
	//* 269  537:isub            
	//* 270  538:istore_1        
	//* 271  539:fload_3         
	//* 272  540:fstore_2        
	//* 273  541:iload           5
	//* 274  543:istore          6
	//* 275  545:iload_1         
	//* 276  546:istore          7
	//* 277  548:iload           5
	//* 278  550:iflt            655
	//* 279  553:goto            636
	//* 280  556:aload           13
	//* 281  558:ifnull          602
	//* 282  561:iload           8
	//* 283  563:aload           13
	//* 284  565:getfield        #213 <Field int ViewPager$b.b>
	//* 285  568:icmpne          602
	//* 286  571:fload_3         
	//* 287  572:aload           13
	//* 288  574:getfield        #331 <Field float ViewPager$b.d>
	//* 289  577:fadd            
	//* 290  578:fstore_3        
	//* 291  579:iload           5
	//* 292  581:iconst_1        
	//* 293  582:isub            
	//* 294  583:istore          5
	//* 295  585:fload_3         
	//* 296  586:fstore_2        
	//* 297  587:iload           5
	//* 298  589:istore          6
	//* 299  591:iload_1         
	//* 300  592:istore          7
	//* 301  594:iload           5
	//* 302  596:iflt            655
	//* 303  599:goto            636
	//* 304  602:fload_3         
	//* 305  603:aload_0         
	//* 306  604:iload           8
	//* 307  606:iload           5
	//* 308  608:iconst_1        
	//* 309  609:iadd            
	//* 310  610:invokevirtual   #655 <Method ViewPager$b a(int, int)>
	//* 311  613:getfield        #331 <Field float ViewPager$b.d>
	//* 312  616:fadd            
	//* 313  617:fstore_3        
	//* 314  618:iload_1         
	//* 315  619:iconst_1        
	//* 316  620:iadd            
	//* 317  621:istore_1        
	//* 318  622:fload_3         
	//* 319  623:fstore_2        
	//* 320  624:iload           5
	//* 321  626:istore          6
	//* 322  628:iload_1         
	//* 323  629:istore          7
	//* 324  631:iload           5
	//* 325  633:iflt            655
	//* 326  636:aload_0         
	//* 327  637:getfield        #148 <Field ArrayList g>
	//* 328  640:iload           5
	//* 329  642:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 330  645:checkcast       #25  <Class ViewPager$b>
	//* 331  648:astore          13
	//* 332  650:fload_3         
	//* 333  651:fstore_2        
	//* 334  652:goto            665
	//* 335  655:aconst_null     
	//* 336  656:astore          13
	//* 337  658:iload           7
	//* 338  660:istore_1        
	//* 339  661:iload           6
	//* 340  663:istore          5
	//* 341  665:iload_1         
	//* 342  666:istore          6
	//* 343  668:aload           13
	//* 344  670:astore          16
	//* 345  672:iload           5
	//* 346  674:istore          7
	//* 347  676:iload           8
	//* 348  678:iconst_1        
	//* 349  679:isub            
	//* 350  680:istore          8
	//* 351  682:fload_2         
	//* 352  683:fstore_3        
	//* 353  684:iload           7
	//* 354  686:istore          5
	//* 355  688:aload           16
	//* 356  690:astore          13
	//* 357  692:iload           6
	//* 358  694:istore_1        
	//* 359  695:goto            433
	//* 360  698:aload           15
	//* 361  700:getfield        #331 <Field float ViewPager$b.d>
	//* 362  703:fstore_3        
	//* 363  704:iload_1         
	//* 364  705:iconst_1        
	//* 365  706:iadd            
	//* 366  707:istore          5
	//* 367  709:fload_3         
	//* 368  710:fconst_2        
	//* 369  711:fcmpg           
	//* 370  712:ifge            1038
	//* 371  715:iload           5
	//* 372  717:aload_0         
	//* 373  718:getfield        #148 <Field ArrayList g>
	//* 374  721:invokevirtual   #207 <Method int ArrayList.size()>
	//* 375  724:icmpge          744
	//* 376  727:aload_0         
	//* 377  728:getfield        #148 <Field ArrayList g>
	//* 378  731:iload           5
	//* 379  733:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 380  736:checkcast       #25  <Class ViewPager$b>
	//* 381  739:astore          13
	//* 382  741:goto            747
	//* 383  744:aconst_null     
	//* 384  745:astore          13
	//* 385  747:iload           12
	//* 386  749:ifgt            758
	//* 387  752:fconst_0        
	//* 388  753:fstore          4
	//* 389  755:goto            771
	//* 390  758:aload_0         
	//* 391  759:invokevirtual   #287 <Method int getPaddingRight()>
	//* 392  762:i2f             
	//* 393  763:iload           12
	//* 394  765:i2f             
	//* 395  766:fdiv            
	//* 396  767:fconst_2        
	//* 397  768:fadd            
	//* 398  769:fstore          4
	//* 399  771:aload_0         
	//* 400  772:getfield        #201 <Field int c>
	//* 401  775:istore          6
	//* 402  777:aload           13
	//* 403  779:astore          16
	//* 404  781:iload           6
	//* 405  783:iconst_1        
	//* 406  784:iadd            
	//* 407  785:istore          7
	//* 408  787:iload           7
	//* 409  789:iload           9
	//* 410  791:icmpge          1038
	//* 411  794:fload_3         
	//* 412  795:fload           4
	//* 413  797:fcmpl           
	//* 414  798:iflt            926
	//* 415  801:iload           7
	//* 416  803:iload           10
	//* 417  805:icmple          926
	//* 418  808:aload           16
	//* 419  810:ifnonnull       816
	//* 420  813:goto            1038
	//* 421  816:fload_3         
	//* 422  817:fstore_2        
	//* 423  818:iload           5
	//* 424  820:istore          6
	//* 425  822:aload           16
	//* 426  824:astore          13
	//* 427  826:iload           7
	//* 428  828:aload           16
	//* 429  830:getfield        #213 <Field int ViewPager$b.b>
	//* 430  833:icmpne          1021
	//* 431  836:fload_3         
	//* 432  837:fstore_2        
	//* 433  838:iload           5
	//* 434  840:istore          6
	//* 435  842:aload           16
	//* 436  844:astore          13
	//* 437  846:aload           16
	//* 438  848:getfield        #372 <Field boolean ViewPager$b.c>
	//* 439  851:ifne            1021
	//* 440  854:aload_0         
	//* 441  855:getfield        #148 <Field ArrayList g>
	//* 442  858:iload           5
	//* 443  860:invokevirtual   #658 <Method Object ArrayList.remove(int)>
	//* 444  863:pop             
	//* 445  864:aload_0         
	//* 446  865:getfield        #322 <Field p b>
	//* 447  868:aload_0         
	//* 448  869:iload           7
	//* 449  871:aload           16
	//* 450  873:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//* 451  876:invokevirtual   #662 <Method void p.destroyItem(ViewGroup, int, Object)>
	//* 452  879:fload_3         
	//* 453  880:fstore_2        
	//* 454  881:iload           5
	//* 455  883:istore          6
	//* 456  885:iload           5
	//* 457  887:aload_0         
	//* 458  888:getfield        #148 <Field ArrayList g>
	//* 459  891:invokevirtual   #207 <Method int ArrayList.size()>
	//* 460  894:icmpge          920
	//* 461  897:aload_0         
	//* 462  898:getfield        #148 <Field ArrayList g>
	//* 463  901:iload           5
	//* 464  903:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//* 465  906:checkcast       #25  <Class ViewPager$b>
	//* 466  909:astore          13
	//* 467  911:fload_3         
	//* 468  912:fstore_2        
	//* 469  913:iload           5
	//* 470  915:istore          6
	//* 471  917:goto            1021
	//* 472  920:aconst_null     
	//* 473  921:astore          13
	//* 474  923:goto            1021
	//* 475  926:aload           16
	//* 476  928:ifnull          976
	//* 477  931:iload           7
	//* 478  933:aload           16
	//* 479  935:getfield        #213 <Field int ViewPager$b.b>
	//* 480  938:icmpne          976
	//* 481  941:fload_3         
	//* 482  942:aload           16
	//* 483  944:getfield        #331 <Field float ViewPager$b.d>
	//* 484  947:fadd            
	//* 485  948:fstore_3        
	//* 486  949:iload           5
	//* 487  951:iconst_1        
	//* 488  952:iadd            
	//* 489  953:istore          5
	//* 490  955:fload_3         
	//* 491  956:fstore_2        
	//* 492  957:iload           5
	//* 493  959:istore          6
	//* 494  961:iload           5
	//* 495  963:aload_0         
	//* 496  964:getfield        #148 <Field ArrayList g>
	//* 497  967:invokevirtual   #207 <Method int ArrayList.size()>
	//* 498  970:icmpge          920
	//* 499  973:goto            897
	//* 500  976:aload_0         
	//* 501  977:iload           7
	//* 502  979:iload           5
	//* 503  981:invokevirtual   #655 <Method ViewPager$b a(int, int)>
	//* 504  984:astore          13
	//* 505  986:iload           5
	//* 506  988:iconst_1        
	//* 507  989:iadd            
	//* 508  990:istore          5
	//* 509  992:fload_3         
	//* 510  993:aload           13
	//* 511  995:getfield        #331 <Field float ViewPager$b.d>
	//* 512  998:fadd            
	//* 513  999:fstore_3        
	//* 514 1000:fload_3         
	//* 515 1001:fstore_2        
	//* 516 1002:iload           5
	//* 517 1004:istore          6
	//* 518 1006:iload           5
	//* 519 1008:aload_0         
	//* 520 1009:getfield        #148 <Field ArrayList g>
	//* 521 1012:invokevirtual   #207 <Method int ArrayList.size()>
	//* 522 1015:icmpge          920
	//* 523 1018:goto            897
	//* 524 1021:fload_2         
	//* 525 1022:fstore_3        
	//* 526 1023:iload           6
	//* 527 1025:istore          5
	//* 528 1027:aload           13
	//* 529 1029:astore          16
	//* 530 1031:iload           7
	//* 531 1033:istore          6
	//* 532 1035:goto            781
	//* 533 1038:aload_0         
	//* 534 1039:aload           15
	//* 535 1041:iload_1         
	//* 536 1042:aload           14
	//* 537 1044:invokespecial   #664 <Method void a(ViewPager$b, int, ViewPager$b)>
	//* 538 1047:aload_0         
	//* 539 1048:getfield        #322 <Field p b>
	//* 540 1051:astore          14
	//* 541 1053:aload_0         
	//* 542 1054:getfield        #201 <Field int c>
	//* 543 1057:istore_1        
	//* 544 1058:aload           15
	//* 545 1060:ifnull          1073
	//* 546 1063:aload           15
	//* 547 1065:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//* 548 1068:astore          13
	//* 549 1070:goto            1076
	//* 550 1073:aconst_null     
	//* 551 1074:astore          13
	//* 552 1076:aload           14
	//* 553 1078:aload_0         
	//* 554 1079:iload_1         
	//* 555 1080:aload           13
	//* 556 1082:invokevirtual   #667 <Method void p.setPrimaryItem(ViewGroup, int, Object)>
	//* 557 1085:aload_0         
	//* 558 1086:getfield        #322 <Field p b>
	//* 559 1089:aload_0         
	//* 560 1090:invokevirtual   #670 <Method void p.finishUpdate(ViewGroup)>
	//* 561 1093:aload_0         
	//* 562 1094:invokevirtual   #404 <Method int getChildCount()>
	//* 563 1097:istore          5
	//* 564 1099:iconst_0        
	//* 565 1100:istore_1        
	//* 566 1101:iload_1         
	//* 567 1102:iload           5
	//* 568 1104:icmpge          1188
	//* 569 1107:aload_0         
	//* 570 1108:iload_1         
	//* 571 1109:invokevirtual   #410 <Method View getChildAt(int)>
	//* 572 1112:astore          14
	//* 573 1114:aload           14
	//* 574 1116:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 575 1119:checkcast       #14  <Class ViewPager$LayoutParams>
	//* 576 1122:astore          13
	//* 577 1124:aload           13
	//* 578 1126:iload_1         
	//* 579 1127:putfield        #672 <Field int ViewPager$LayoutParams.f>
	//* 580 1130:aload           13
	//* 581 1132:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//* 582 1135:ifne            1181
	//* 583 1138:aload           13
	//* 584 1140:getfield        #674 <Field float ViewPager$LayoutParams.c>
	//* 585 1143:fconst_0        
	//* 586 1144:fcmpl           
	//* 587 1145:ifne            1181
	//* 588 1148:aload_0         
	//* 589 1149:aload           14
	//* 590 1151:invokevirtual   #676 <Method ViewPager$b a(View)>
	//* 591 1154:astore          14
	//* 592 1156:aload           14
	//* 593 1158:ifnull          1181
	//* 594 1161:aload           13
	//* 595 1163:aload           14
	//* 596 1165:getfield        #331 <Field float ViewPager$b.d>
	//* 597 1168:putfield        #674 <Field float ViewPager$LayoutParams.c>
	//* 598 1171:aload           13
	//* 599 1173:aload           14
	//* 600 1175:getfield        #213 <Field int ViewPager$b.b>
	//* 601 1178:putfield        #678 <Field int ViewPager$LayoutParams.e>
	//* 602 1181:iload_1         
	//* 603 1182:iconst_1        
	//* 604 1183:iadd            
	//* 605 1184:istore_1        
	//* 606 1185:goto            1101
	//* 607 1188:aload_0         
	//* 608 1189:invokespecial   #603 <Method void g()>
	//* 609 1192:aload_0         
	//* 610 1193:invokevirtual   #681 <Method boolean hasFocus()>
	//* 611 1196:ifeq            1300
	//* 612 1199:aload_0         
	//* 613 1200:invokevirtual   #685 <Method View findFocus()>
	//* 614 1203:astore          13
	//* 615 1205:aload           13
	//* 616 1207:ifnull          1221
	//* 617 1210:aload_0         
	//* 618 1211:aload           13
	//* 619 1213:invokevirtual   #687 <Method ViewPager$b b(View)>
	//* 620 1216:astore          13
	//* 621 1218:goto            1224
	//* 622 1221:aconst_null     
	//* 623 1222:astore          13
	//* 624 1224:aload           13
	//* 625 1226:ifnull          1241
	//* 626 1229:aload           13
	//* 627 1231:getfield        #213 <Field int ViewPager$b.b>
	//* 628 1234:aload_0         
	//* 629 1235:getfield        #201 <Field int c>
	//* 630 1238:icmpeq          1300
	//* 631 1241:iconst_0        
	//* 632 1242:istore_1        
	//* 633 1243:iload_1         
	//* 634 1244:aload_0         
	//* 635 1245:invokevirtual   #404 <Method int getChildCount()>
	//* 636 1248:icmpge          1300
	//* 637 1251:aload_0         
	//* 638 1252:iload_1         
	//* 639 1253:invokevirtual   #410 <Method View getChildAt(int)>
	//* 640 1256:astore          13
	//* 641 1258:aload_0         
	//* 642 1259:aload           13
	//* 643 1261:invokevirtual   #676 <Method ViewPager$b a(View)>
	//* 644 1264:astore          14
	//* 645 1266:aload           14
	//* 646 1268:ifnull          1293
	//* 647 1271:aload           14
	//* 648 1273:getfield        #213 <Field int ViewPager$b.b>
	//* 649 1276:aload_0         
	//* 650 1277:getfield        #201 <Field int c>
	//* 651 1280:icmpne          1293
	//* 652 1283:aload           13
	//* 653 1285:iconst_2        
	//* 654 1286:invokevirtual   #690 <Method boolean View.requestFocus(int)>
	//* 655 1289:ifeq            1293
	//* 656 1292:return          
	//* 657 1293:iload_1         
	//* 658 1294:iconst_1        
	//* 659 1295:iadd            
	//* 660 1296:istore_1        
	//* 661 1297:goto            1243
	//* 662 1300:return          
				// Misplaced declaration of an exception variable
				catch(android.content.res.Resources.NotFoundException notfoundexception)
				{
					s1 = Integer.toHexString(getId());
				}
				obj2 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj2)).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
				((StringBuilder) (obj2)).append(d);
				((StringBuilder) (obj2)).append(", found: ");
				((StringBuilder) (obj2)).append(i3);
				((StringBuilder) (obj2)).append(" Pager id: ");
				((StringBuilder) (obj2)).append(s1);
				((StringBuilder) (obj2)).append(" Pager class: ");
				((StringBuilder) (obj2)).append(((Object) (((Object)this).getClass())));
				((StringBuilder) (obj2)).append(" Problematic adapter: ");
				((StringBuilder) (obj2)).append(((Object) (((Object) (b)).getClass())));
				throw new IllegalStateException(((StringBuilder) (obj2)).toString());
			}
			i1 = 0;
			do
			{
				if(i1 >= g.size())
					break;
				b1 = (b)g.get(i1);
				if(b1.b >= c)
				{
					if(b1.b == c)
						break label0;
					break;
				}
				i1++;
			} while(true);
			b1 = null;
		}
		b5 = b1;
		if(b1 == null)
		{
			b5 = b1;
			if(i3 > 0)
				b5 = a(c, i1);
		}
		if(b5 == null)
			break MISSING_BLOCK_LABEL_1047;
		j1 = i1 - 1;
		if(j1 >= 0)
			b1 = (b)g.get(j1);
		else
			b1 = null;
		l3 = getClientWidth();
		float f4;
		if(l3 <= 0)
			f4 = 0.0F;
		else
			f4 = (2.0F - b5.d) + (float)getPaddingLeft() / (float)l3;
		int l2 = c - 1;
		f3 = 0.0F;
label1:
		while(l2 >= 0) 
		{
			float f1;
			int l1;
			int j2;
			b b6;
label2:
			{
label3:
				{
label4:
					{
						if(f3 >= f4 && l2 < k3)
						{
							if(b1 == null)
								break label1;
							f1 = f3;
							j2 = j1;
							b6 = b1;
							l1 = i1;
							if(l2 != b1.b)
								break label2;
							f1 = f3;
							j2 = j1;
							b6 = b1;
							l1 = i1;
							if(b1.c)
								break label2;
							g.remove(j1);
							b.destroyItem(((ViewGroup) (this)), l2, b1.a);
							j1--;
							i1--;
							f1 = f3;
							l1 = j1;
							j2 = i1;
							if(j1 < 0)
								break label4;
						} else
						if(b1 != null && l2 == b1.b)
						{
							f3 += b1.d;
							j1--;
							f1 = f3;
							l1 = j1;
							j2 = i1;
							if(j1 < 0)
								break label4;
						} else
						{
							f3 += a(l2, j1 + 1).d;
							i1++;
							f1 = f3;
							l1 = j1;
							j2 = i1;
							if(j1 < 0)
								break label4;
						}
						b1 = (b)g.get(j1);
						f1 = f3;
						break label3;
					}
					b1 = null;
					i1 = j2;
					j1 = l1;
				}
				l1 = i1;
				b6 = b1;
				j2 = j1;
			}
			l2--;
			f3 = f1;
			j1 = j2;
			b1 = b6;
			i1 = l1;
		}
		f3 = b5.d;
		j1 = i1 + 1;
		if(f3 >= 2.0F) goto _L2; else goto _L1
_L1:
		float f5;
		int i2;
		b b7;
		b b2;
		if(j1 < g.size())
			b2 = (b)g.get(j1);
		else
			b2 = null;
		if(l3 <= 0)
			f5 = 0.0F;
		else
			f5 = (float)getPaddingRight() / (float)l3 + 2.0F;
		i2 = c;
		b7 = b2;
_L11:
		int k2;
		k2 = i2 + 1;
		if(k2 >= i3)
			break; /* Loop/switch isn't completed */
		if(f3 < f5 || k2 <= j3) goto _L4; else goto _L3
_L3:
		float f2;
		b b3;
		if(b7 == null)
			break; /* Loop/switch isn't completed */
		f2 = f3;
		i2 = j1;
		b3 = b7;
		if(k2 != b7.b) goto _L6; else goto _L5
_L5:
		f2 = f3;
		i2 = j1;
		b3 = b7;
		if(b7.c) goto _L6; else goto _L7
_L7:
		g.remove(j1);
		b.destroyItem(((ViewGroup) (this)), k2, b7.a);
		f2 = f3;
		i2 = j1;
		if(j1 >= g.size()) goto _L9; else goto _L8
_L8:
		b3 = (b)g.get(j1);
		f2 = f3;
		i2 = j1;
		  goto _L6
_L9:
		b3 = null;
		  goto _L6
_L4:
		if(b7 == null || k2 != b7.b)
			break; /* Loop/switch isn't completed */
		f3 += b7.d;
		j1++;
		f2 = f3;
		i2 = j1;
		if(j1 < g.size())
			break; /* Loop/switch isn't completed */
		if(true) goto _L9; else goto _L10
_L10:
		b3 = a(k2, j1);
		j1++;
		f3 += b3.d;
		f2 = f3;
		i2 = j1;
		if(j1 >= g.size()) goto _L9; else goto _L8
_L6:
		f3 = f2;
		j1 = i2;
		b7 = b3;
		i2 = k2;
		if(true) goto _L11; else goto _L2
_L2:
		a(b5, i1, ((b) (obj2)));
		android.content.res.Resources.NotFoundException notfoundexception;
		p p1 = b;
		i1 = c;
		Object obj;
		if(b5 != null)
			obj = b5.a;
		else
			obj = null;
		p1.setPrimaryItem(((ViewGroup) (this)), i1, obj);
		b.finishUpdate(((ViewGroup) (this)));
		int k1 = getChildCount();
		for(i1 = 0; i1 < k1; i1++)
		{
			Object obj3 = ((Object) (getChildAt(i1)));
			LayoutParams layoutparams = (LayoutParams)((View) (obj3)).getLayoutParams();
			layoutparams.f = i1;
			if(layoutparams.a || layoutparams.c != 0.0F)
				continue;
			obj3 = ((Object) (a(((View) (obj3)))));
			if(obj3 != null)
			{
				layoutparams.c = ((b) (obj3)).d;
				layoutparams.e = ((b) (obj3)).b;
			}
		}

		g();
		if(hasFocus())
		{
			Object obj1 = ((Object) (findFocus()));
			if(obj1 != null)
				obj1 = ((Object) (b(((View) (obj1)))));
			else
				obj1 = null;
			if(obj1 == null || ((b) (obj1)).b != c)
				for(i1 = 0; i1 < getChildCount(); i1++)
				{
					View view = getChildAt(i1);
					b b4 = a(view);
					if(b4 != null && b4.b == c && view.requestFocus(2))
						return;
				}

		}
		return;
	//* 663 1301:astore          13
	//* 664 1303:goto            135
	}

	protected void a(int i1, float f1, int j1)
	{
		int k1 = W;
	//    0    0:aload_0         
	//    1    1:getfield        #692 <Field int W>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          9
		if(k1 > 0)
	//*   5    9:iload           4
	//*   6   11:ifle            224
		{
			int k3 = getScrollX();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #290 <Method int getScrollX()>
	//    9   18:istore          10
			int l1 = getPaddingLeft();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #284 <Method int getPaddingLeft()>
	//   12   24:istore          4
			int j2 = getPaddingRight();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #287 <Method int getPaddingRight()>
	//   15   30:istore          5
			int l3 = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #388 <Method int getWidth()>
	//   18   36:istore          11
			int i4 = getChildCount();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #404 <Method int getChildCount()>
	//   21   42:istore          12
			for(int l2 = 0; l2 < i4; l2++)
	//*  22   44:iconst_0        
	//*  23   45:istore          7
	//*  24   47:iload           7
	//*  25   49:iload           12
	//*  26   51:icmpge          224
			{
				View view = getChildAt(l2);
	//   27   54:aload_0         
	//   28   55:iload           7
	//   29   57:invokevirtual   #410 <Method View getChildAt(int)>
	//   30   60:astore          13
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   31   62:aload           13
	//   32   64:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   67:checkcast       #14  <Class ViewPager$LayoutParams>
	//   34   70:astore          14
				if(!layoutparams.a)
	//*  35   72:aload           14
	//*  36   74:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//*  37   77:ifne            83
					continue;
	//   38   80:goto            215
				int k2 = layoutparams.b & 7;
	//   39   83:aload           14
	//   40   85:getfield        #693 <Field int ViewPager$LayoutParams.b>
	//   41   88:bipush          7
	//   42   90:iand            
	//   43   91:istore          6
				if(k2 != 1)
	//*  44   93:iload           6
	//*  45   95:iconst_1        
	//*  46   96:icmpeq          173
				{
					if(k2 != 3)
	//*  47   99:iload           6
	//*  48  101:iconst_3        
	//*  49  102:icmpeq          152
					{
						if(k2 != 5)
	//*  50  105:iload           6
	//*  51  107:iconst_5        
	//*  52  108:icmpeq          126
						{
							int i3 = l1;
	//   53  111:iload           4
	//   54  113:istore          8
							k2 = l1;
	//   55  115:iload           4
	//   56  117:istore          6
							l1 = i3;
	//   57  119:iload           8
	//   58  121:istore          4
						} else
	//*  59  123:goto            190
						{
							k2 = l3 - j2 - view.getMeasuredWidth();
	//   60  126:iload           11
	//   61  128:iload           5
	//   62  130:isub            
	//   63  131:aload           13
	//   64  133:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//   65  136:isub            
	//   66  137:istore          6
							j2 += view.getMeasuredWidth();
	//   67  139:iload           5
	//   68  141:aload           13
	//   69  143:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//   70  146:iadd            
	//   71  147:istore          5
						}
					} else
	//*  72  149:goto            190
					{
						int j3 = view.getWidth() + l1;
	//   73  152:aload           13
	//   74  154:invokevirtual   #695 <Method int View.getWidth()>
	//   75  157:iload           4
	//   76  159:iadd            
	//   77  160:istore          8
						k2 = l1;
	//   78  162:iload           4
	//   79  164:istore          6
						l1 = j3;
	//   80  166:iload           8
	//   81  168:istore          4
					}
				} else
	//*  82  170:goto            190
				{
					k2 = Math.max((l3 - view.getMeasuredWidth()) / 2, l1);
	//   83  173:iload           11
	//   84  175:aload           13
	//   85  177:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//   86  180:isub            
	//   87  181:iconst_2        
	//   88  182:idiv            
	//   89  183:iload           4
	//   90  185:invokestatic    #220 <Method int Math.max(int, int)>
	//   91  188:istore          6
				}
				k2 = (k2 + k3) - view.getLeft();
	//   92  190:iload           6
	//   93  192:iload           10
	//   94  194:iadd            
	//   95  195:aload           13
	//   96  197:invokevirtual   #230 <Method int View.getLeft()>
	//   97  200:isub            
	//   98  201:istore          6
				if(k2 != 0)
	//*  99  203:iload           6
	//* 100  205:ifeq            215
					view.offsetLeftAndRight(k2);
	//  101  208:aload           13
	//  102  210:iload           6
	//  103  212:invokevirtual   #698 <Method void View.offsetLeftAndRight(int)>
			}

	//  104  215:iload           7
	//  105  217:iconst_1        
	//  106  218:iadd            
	//  107  219:istore          7
		}
	//* 108  221:goto            47
		b(i1, f1, j1);
	//  109  224:aload_0         
	//  110  225:iload_1         
	//  111  226:fload_2         
	//  112  227:iload_3         
	//  113  228:invokespecial   #700 <Method void b(int, float, int)>
		if(ae != null)
	//* 114  231:aload_0         
	//* 115  232:getfield        #702 <Field ViewPager$f ae>
	//* 116  235:ifnull          316
		{
			j1 = getScrollX();
	//  117  238:aload_0         
	//  118  239:invokevirtual   #290 <Method int getScrollX()>
	//  119  242:istore_3        
			int i2 = getChildCount();
	//  120  243:aload_0         
	//  121  244:invokevirtual   #404 <Method int getChildCount()>
	//  122  247:istore          4
			for(i1 = ((int) (flag)); i1 < i2; i1++)
	//* 123  249:iload           9
	//* 124  251:istore_1        
	//* 125  252:iload_1         
	//* 126  253:iload           4
	//* 127  255:icmpge          316
			{
				View view1 = getChildAt(i1);
	//  128  258:aload_0         
	//  129  259:iload_1         
	//  130  260:invokevirtual   #410 <Method View getChildAt(int)>
	//  131  263:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).a)
	//* 132  265:aload           13
	//* 133  267:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 134  270:checkcast       #14  <Class ViewPager$LayoutParams>
	//* 135  273:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//* 136  276:ifeq            282
	//* 137  279:goto            309
				{
					f1 = (float)(view1.getLeft() - j1) / (float)getClientWidth();
	//  138  282:aload           13
	//  139  284:invokevirtual   #230 <Method int View.getLeft()>
	//  140  287:iload_3         
	//  141  288:isub            
	//  142  289:i2f             
	//  143  290:aload_0         
	//  144  291:invokespecial   #277 <Method int getClientWidth()>
	//  145  294:i2f             
	//  146  295:fdiv            
	//  147  296:fstore_2        
					ae.a(view1, f1);
	//  148  297:aload_0         
	//  149  298:getfield        #702 <Field ViewPager$f ae>
	//  150  301:aload           13
	//  151  303:fload_2         
	//  152  304:invokeinterface #705 <Method void android.support.v4.view.ViewPager$f.a(View, float)>
				}
			}

	//  153  309:iload_1         
	//  154  310:iconst_1        
	//  155  311:iadd            
	//  156  312:istore_1        
		}
	//* 157  313:goto            252
		V = true;
	//  158  316:aload_0         
	//  159  317:iconst_1        
	//  160  318:putfield        #449 <Field boolean V>
	//  161  321:return          
	}

	void a(int i1, int j1, int k1)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #404 <Method int getChildCount()>
	//*   2    4:ifne            13
		{
			setScrollingCacheEnabled(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//    6   12:return          
		}
		boolean flag;
		if(m != null && !m.isFinished())
	//*   7   13:aload_0         
	//*   8   14:getfield        #266 <Field Scroller m>
	//*   9   17:ifnull          36
	//*  10   20:aload_0         
	//*  11   21:getfield        #266 <Field Scroller m>
	//*  12   24:invokevirtual   #271 <Method boolean Scroller.isFinished()>
	//*  13   27:ifne            36
			flag = true;
	//   14   30:iconst_1        
	//   15   31:istore          7
		else
	//*  16   33:goto            39
			flag = false;
	//   17   36:iconst_0        
	//   18   37:istore          7
		int l1;
		if(flag)
	//*  19   39:iload           7
	//*  20   41:ifeq            87
		{
			if(n)
	//*  21   44:aload_0         
	//*  22   45:getfield        #707 <Field boolean n>
	//*  23   48:ifeq            63
				l1 = m.getCurrX();
	//   24   51:aload_0         
	//   25   52:getfield        #266 <Field Scroller m>
	//   26   55:invokevirtual   #365 <Method int Scroller.getCurrX()>
	//   27   58:istore          7
			else
	//*  28   60:goto            72
				l1 = m.getStartX();
	//   29   63:aload_0         
	//   30   64:getfield        #266 <Field Scroller m>
	//   31   67:invokevirtual   #710 <Method int Scroller.getStartX()>
	//   32   70:istore          7
			m.abortAnimation();
	//   33   72:aload_0         
	//   34   73:getfield        #266 <Field Scroller m>
	//   35   76:invokevirtual   #362 <Method void Scroller.abortAnimation()>
			setScrollingCacheEnabled(false);
	//   36   79:aload_0         
	//   37   80:iconst_0        
	//   38   81:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
		} else
	//*  39   84:goto            93
		{
			l1 = getScrollX();
	//   40   87:aload_0         
	//   41   88:invokevirtual   #290 <Method int getScrollX()>
	//   42   91:istore          7
		}
		int i2 = getScrollY();
	//   43   93:aload_0         
	//   44   94:invokevirtual   #293 <Method int getScrollY()>
	//   45   97:istore          8
		int j2 = i1 - l1;
	//   46   99:iload_1         
	//   47  100:iload           7
	//   48  102:isub            
	//   49  103:istore          9
		j1 -= i2;
	//   50  105:iload_2         
	//   51  106:iload           8
	//   52  108:isub            
	//   53  109:istore_2        
		if(j2 == 0 && j1 == 0)
	//*  54  110:iload           9
	//*  55  112:ifne            134
	//*  56  115:iload_2         
	//*  57  116:ifne            134
		{
			a(false);
	//   58  119:aload_0         
	//   59  120:iconst_0        
	//   60  121:invokespecial   #308 <Method void a(boolean)>
			c();
	//   61  124:aload_0         
	//   62  125:invokevirtual   #712 <Method void c()>
			setScrollState(0);
	//   63  128:aload_0         
	//   64  129:iconst_0        
	//   65  130:invokevirtual   #715 <Method void setScrollState(int)>
			return;
	//   66  133:return          
		}
		setScrollingCacheEnabled(true);
	//   67  134:aload_0         
	//   68  135:iconst_1        
	//   69  136:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   70  139:aload_0         
	//   71  140:iconst_2        
	//   72  141:invokevirtual   #715 <Method void setScrollState(int)>
		i1 = getClientWidth();
	//   73  144:aload_0         
	//   74  145:invokespecial   #277 <Method int getClientWidth()>
	//   75  148:istore_1        
		int k2 = i1 / 2;
	//   76  149:iload_1         
	//   77  150:iconst_2        
	//   78  151:idiv            
	//   79  152:istore          10
		float f2 = Math.abs(j2);
	//   80  154:iload           9
	//   81  156:invokestatic    #195 <Method int Math.abs(int)>
	//   82  159:i2f             
	//   83  160:fstore          5
		float f1 = i1;
	//   84  162:iload_1         
	//   85  163:i2f             
	//   86  164:fstore          4
		float f4 = Math.min(1.0F, (f2 * 1.0F) / f1);
	//   87  166:fconst_1        
	//   88  167:fload           5
	//   89  169:fconst_1        
	//   90  170:fmul            
	//   91  171:fload           4
	//   92  173:fdiv            
	//   93  174:invokestatic    #305 <Method float Math.min(float, float)>
	//   94  177:fstore          6
		f2 = k2;
	//   95  179:iload           10
	//   96  181:i2f             
	//   97  182:fstore          5
		f4 = a(f4);
	//   98  184:aload_0         
	//   99  185:fload           6
	//  100  187:invokevirtual   #717 <Method float a(float)>
	//  101  190:fstore          6
		i1 = Math.abs(k1);
	//  102  192:iload_3         
	//  103  193:invokestatic    #195 <Method int Math.abs(int)>
	//  104  196:istore_1        
		if(i1 > 0)
	//* 105  197:iload_1         
	//* 106  198:ifle            228
		{
			i1 = Math.round(Math.abs((f2 + f4 * f2) / (float)i1) * 1000F) * 4;
	//  107  201:fload           5
	//  108  203:fload           6
	//  109  205:fload           5
	//  110  207:fmul            
	//  111  208:fadd            
	//  112  209:iload_1         
	//  113  210:i2f             
	//  114  211:fdiv            
	//  115  212:invokestatic    #420 <Method float Math.abs(float)>
	//  116  215:ldc2            #718 <Float 1000F>
	//  117  218:fmul            
	//  118  219:invokestatic    #722 <Method int Math.round(float)>
	//  119  222:iconst_4        
	//  120  223:imul            
	//  121  224:istore_1        
		} else
	//* 122  225:goto            267
		{
			float f3 = b.getPageWidth(c);
	//  123  228:aload_0         
	//  124  229:getfield        #322 <Field p b>
	//  125  232:aload_0         
	//  126  233:getfield        #201 <Field int c>
	//  127  236:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//  128  239:fstore          5
			i1 = (int)(((float)Math.abs(j2) / (f1 * f3 + (float)p) + 1.0F) * 100F);
	//  129  241:iload           9
	//  130  243:invokestatic    #195 <Method int Math.abs(int)>
	//  131  246:i2f             
	//  132  247:fload           4
	//  133  249:fload           5
	//  134  251:fmul            
	//  135  252:aload_0         
	//  136  253:getfield        #329 <Field int p>
	//  137  256:i2f             
	//  138  257:fadd            
	//  139  258:fdiv            
	//  140  259:fconst_1        
	//  141  260:fadd            
	//  142  261:ldc2            #723 <Float 100F>
	//  143  264:fmul            
	//  144  265:f2i             
	//  145  266:istore_1        
		}
		i1 = Math.min(i1, 600);
	//  146  267:iload_1         
	//  147  268:sipush          600
	//  148  271:invokestatic    #217 <Method int Math.min(int, int)>
	//  149  274:istore_1        
		n = false;
	//  150  275:aload_0         
	//  151  276:iconst_0        
	//  152  277:putfield        #707 <Field boolean n>
		m.startScroll(l1, i2, j2, j1, i1);
	//  153  280:aload_0         
	//  154  281:getfield        #266 <Field Scroller m>
	//  155  284:iload           7
	//  156  286:iload           8
	//  157  288:iload           9
	//  158  290:iload_2         
	//  159  291:iload_1         
	//  160  292:invokevirtual   #727 <Method void Scroller.startScroll(int, int, int, int, int)>
		android.support.v4.view.s.c(((View) (this)));
	//  161  295:aload_0         
	//  162  296:invokestatic    #730 <Method void s.c(View)>
	//  163  299:return          
	}

	public void a(int i1, boolean flag)
	{
		z = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #370 <Field boolean z>
		a(i1, flag, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #734 <Method void a(int, boolean, boolean)>
	//    8   12:return          
	}

	void a(int i1, boolean flag, boolean flag1)
	{
		a(i1, flag, flag1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #737 <Method void a(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void a(int i1, boolean flag, boolean flag1, int j1)
	{
		if(b != null && b.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field p b>
	//*   2    4:ifnull          206
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field p b>
	//*   5   11:invokevirtual   #327 <Method int p.getCount()>
	//*   6   14:ifgt            20
	//*   7   17:goto            206
		{
			if(!flag1 && c == i1 && g.size() != 0)
	//*   8   20:iload_3         
	//*   9   21:ifne            48
	//*  10   24:aload_0         
	//*  11   25:getfield        #201 <Field int c>
	//*  12   28:iload_1         
	//*  13   29:icmpne          48
	//*  14   32:aload_0         
	//*  15   33:getfield        #148 <Field ArrayList g>
	//*  16   36:invokevirtual   #207 <Method int ArrayList.size()>
	//*  17   39:ifeq            48
			{
				setScrollingCacheEnabled(false);
	//   18   42:aload_0         
	//   19   43:iconst_0        
	//   20   44:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
				return;
	//   21   47:return          
			}
			flag1 = true;
	//   22   48:iconst_1        
	//   23   49:istore_3        
			int k1;
			if(i1 < 0)
	//*  24   50:iload_1         
	//*  25   51:ifge            60
			{
				k1 = 0;
	//   26   54:iconst_0        
	//   27   55:istore          5
			} else
	//*  28   57:goto            85
			{
				k1 = i1;
	//   29   60:iload_1         
	//   30   61:istore          5
				if(i1 >= b.getCount())
	//*  31   63:iload_1         
	//*  32   64:aload_0         
	//*  33   65:getfield        #322 <Field p b>
	//*  34   68:invokevirtual   #327 <Method int p.getCount()>
	//*  35   71:icmplt          85
					k1 = b.getCount() - 1;
	//   36   74:aload_0         
	//   37   75:getfield        #322 <Field p b>
	//   38   78:invokevirtual   #327 <Method int p.getCount()>
	//   39   81:iconst_1        
	//   40   82:isub            
	//   41   83:istore          5
			}
			i1 = A;
	//   42   85:aload_0         
	//   43   86:getfield        #170 <Field int A>
	//   44   89:istore_1        
			if(k1 > c + i1 || k1 < c - i1)
	//*  45   90:iload           5
	//*  46   92:aload_0         
	//*  47   93:getfield        #201 <Field int c>
	//*  48   96:iload_1         
	//*  49   97:iadd            
	//*  50   98:icmpgt          112
	//*  51  101:iload           5
	//*  52  103:aload_0         
	//*  53  104:getfield        #201 <Field int c>
	//*  54  107:iload_1         
	//*  55  108:isub            
	//*  56  109:icmpge          147
				for(i1 = 0; i1 < g.size(); i1++)
	//*  57  112:iconst_0        
	//*  58  113:istore_1        
	//*  59  114:iload_1         
	//*  60  115:aload_0         
	//*  61  116:getfield        #148 <Field ArrayList g>
	//*  62  119:invokevirtual   #207 <Method int ArrayList.size()>
	//*  63  122:icmpge          147
					((b)g.get(i1)).c = true;
	//   64  125:aload_0         
	//   65  126:getfield        #148 <Field ArrayList g>
	//   66  129:iload_1         
	//   67  130:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   68  133:checkcast       #25  <Class ViewPager$b>
	//   69  136:iconst_1        
	//   70  137:putfield        #372 <Field boolean ViewPager$b.c>

	//   71  140:iload_1         
	//   72  141:iconst_1        
	//   73  142:iadd            
	//   74  143:istore_1        
	//*  75  144:goto            114
			if(c == k1)
	//*  76  147:aload_0         
	//*  77  148:getfield        #201 <Field int c>
	//*  78  151:iload           5
	//*  79  153:icmpeq          159
	//*  80  156:goto            161
				flag1 = false;
	//   81  159:iconst_0        
	//   82  160:istore_3        
			if(T)
	//*  83  161:aload_0         
	//*  84  162:getfield        #174 <Field boolean T>
	//*  85  165:ifeq            189
			{
				c = k1;
	//   86  168:aload_0         
	//   87  169:iload           5
	//   88  171:putfield        #201 <Field int c>
				if(flag1)
	//*  89  174:iload_3         
	//*  90  175:ifeq            184
					e(k1);
	//   91  178:aload_0         
	//   92  179:iload           5
	//   93  181:invokespecial   #316 <Method void e(int)>
				requestLayout();
	//   94  184:aload_0         
	//   95  185:invokevirtual   #740 <Method void requestLayout()>
				return;
	//   96  188:return          
			} else
			{
				a(k1);
	//   97  189:aload_0         
	//   98  190:iload           5
	//   99  192:invokevirtual   #741 <Method void a(int)>
				a(k1, flag, j1, flag1);
	//  100  195:aload_0         
	//  101  196:iload           5
	//  102  198:iload_2         
	//  103  199:iload           4
	//  104  201:iload_3         
	//  105  202:invokespecial   #743 <Method void a(int, boolean, int, boolean)>
				return;
	//  106  205:return          
			}
		} else
		{
			setScrollingCacheEnabled(false);
	//  107  206:aload_0         
	//  108  207:iconst_0        
	//  109  208:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//  110  211:return          
		}
	}

	public void a(d d1)
	{
		if(ad == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #746 <Field List ad>
	//*   2    4:ifnonnull       18
			ad = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #145 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #146 <Method void ArrayList()>
	//    7   15:putfield        #746 <Field List ad>
		ad.add(((Object) (d1)));
	//    8   18:aload_0         
	//    9   19:getfield        #746 <Field List ad>
	//   10   22:aload_1         
	//   11   23:invokeinterface #747 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void a(e e1)
	{
		if(aa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #395 <Field List aa>
	//*   2    4:ifnonnull       18
			aa = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #145 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #146 <Method void ArrayList()>
	//    7   15:putfield        #395 <Field List aa>
		aa.add(((Object) (e1)));
	//    8   18:aload_0         
	//    9   19:getfield        #395 <Field List aa>
	//   10   22:aload_1         
	//   11   23:invokeinterface #747 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public boolean a(KeyEvent keyevent)
	{
label0:
		{
			if(keyevent.getAction() != 0)
				break label0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #754 <Method int KeyEvent.getAction()>
	//    2    4:ifne            111
			int i1 = keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #757 <Method int KeyEvent.getKeyCode()>
	//    5   11:istore_2        
			if(i1 != 61)
	//*   6   12:iload_2         
	//*   7   13:bipush          61
	//*   8   15:icmpeq          84
			{
				switch(i1)
	//*   9   18:iload_2         
				{
	//*  10   19:tableswitch     21 22: default 40
	//	               21 62
	//	               22 43
				default:
					break label0;
	//   11   40:goto            111

				case 22: // '\026'
					if(keyevent.hasModifiers(2))
	//*  12   43:aload_1         
	//*  13   44:iconst_2        
	//*  14   45:invokevirtual   #760 <Method boolean KeyEvent.hasModifiers(int)>
	//*  15   48:ifeq            56
						return e();
	//   16   51:aload_0         
	//   17   52:invokevirtual   #762 <Method boolean e()>
	//   18   55:ireturn         
					i1 = 66;
	//   19   56:bipush          66
	//   20   58:istore_2        
					break;
	//   21   59:goto            78

				case 21: // '\025'
					if(keyevent.hasModifiers(2))
	//*  22   62:aload_1         
	//*  23   63:iconst_2        
	//*  24   64:invokevirtual   #760 <Method boolean KeyEvent.hasModifiers(int)>
	//*  25   67:ifeq            75
						return d();
	//   26   70:aload_0         
	//   27   71:invokevirtual   #764 <Method boolean d()>
	//   28   74:ireturn         
					i1 = 17;
	//   29   75:bipush          17
	//   30   77:istore_2        
					break;
				}
				return c(i1);
	//   31   78:aload_0         
	//   32   79:iload_2         
	//   33   80:invokevirtual   #766 <Method boolean c(int)>
	//   34   83:ireturn         
			}
			if(keyevent.hasNoModifiers())
	//*  35   84:aload_1         
	//*  36   85:invokevirtual   #769 <Method boolean KeyEvent.hasNoModifiers()>
	//*  37   88:ifeq            97
				return c(2);
	//   38   91:aload_0         
	//   39   92:iconst_2        
	//   40   93:invokevirtual   #766 <Method boolean c(int)>
	//   41   96:ireturn         
			if(keyevent.hasModifiers(1))
	//*  42   97:aload_1         
	//*  43   98:iconst_1        
	//*  44   99:invokevirtual   #760 <Method boolean KeyEvent.hasModifiers(int)>
	//*  45  102:ifeq            111
				return c(1);
	//   46  105:aload_0         
	//   47  106:iconst_1        
	//   48  107:invokevirtual   #766 <Method boolean c(int)>
	//   49  110:ireturn         
		}
		return false;
	//   50  111:iconst_0        
	//   51  112:ireturn         
	}

	protected boolean a(View view, boolean flag, int i1, int j1, int k1)
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
			int i2 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #771 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j2 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #772 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l1 = viewgroup.getChildCount() - 1; l1 >= 0; l1--)
	//*  12   25:aload           11
	//*  13   27:invokevirtual   #773 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            140
			{
				View view1 = viewgroup.getChildAt(l1);
	//   19   39:aload           11
	//   20   41:iload           6
	//   21   43:invokevirtual   #774 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          12
				int k2 = j1 + i2;
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:istore          9
				if(k2 < view1.getLeft() || k2 >= view1.getRight())
					continue;
	//   27   55:iload           9
	//   28   57:aload           12
	//   29   59:invokevirtual   #230 <Method int View.getLeft()>
	//   30   62:icmplt          131
	//   31   65:iload           9
	//   32   67:aload           12
	//   33   69:invokevirtual   #236 <Method int View.getRight()>
	//   34   72:icmpge          131
				int l2 = k1 + j2;
	//   35   75:iload           5
	//   36   77:iload           8
	//   37   79:iadd            
	//   38   80:istore          10
				if(l2 >= view1.getTop() && l2 < view1.getBottom() && a(view1, true, i1, k2 - view1.getLeft(), l2 - view1.getTop()))
	//*  39   82:iload           10
	//*  40   84:aload           12
	//*  41   86:invokevirtual   #242 <Method int View.getTop()>
	//*  42   89:icmplt          131
	//*  43   92:iload           10
	//*  44   94:aload           12
	//*  45   96:invokevirtual   #248 <Method int View.getBottom()>
	//*  46   99:icmpge          131
	//*  47  102:aload_0         
	//*  48  103:aload           12
	//*  49  105:iconst_1        
	//*  50  106:iload_3         
	//*  51  107:iload           9
	//*  52  109:aload           12
	//*  53  111:invokevirtual   #230 <Method int View.getLeft()>
	//*  54  114:isub            
	//*  55  115:iload           10
	//*  56  117:aload           12
	//*  57  119:invokevirtual   #242 <Method int View.getTop()>
	//*  58  122:isub            
	//*  59  123:invokevirtual   #776 <Method boolean a(View, boolean, int, int, int)>
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
		return flag && view.canScrollHorizontally(-i1);
	//   68  140:iload_2         
	//   69  141:ifeq            155
	//   70  144:aload_1         
	//   71  145:iload_3         
	//   72  146:ineg            
	//   73  147:invokevirtual   #779 <Method boolean View.canScrollHorizontally(int)>
	//   74  150:ifeq            155
	//   75  153:iconst_1        
	//   76  154:ireturn         
	//   77  155:iconst_0        
	//   78  156:ireturn         
	}

	public void addFocusables(ArrayList arraylist, int i1, int j1)
	{
		int l1 = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i2 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #784 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i2 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #785 <Int 0x60000>
	//*   8   17:icmpeq          90
		{
			for(int k1 = 0; k1 < getChildCount(); k1++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #404 <Method int getChildCount()>
	//*  14   29:icmpge          90
			{
				View view = getChildAt(k1);
	//   15   32:aload_0         
	//   16   33:iload           4
	//   17   35:invokevirtual   #410 <Method View getChildAt(int)>
	//   18   38:astore          7
				if(view.getVisibility() != 0)
					continue;
	//   19   40:aload           7
	//   20   42:invokevirtual   #788 <Method int View.getVisibility()>
	//   21   45:ifne            81
				b b1 = a(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #676 <Method ViewPager$b a(View)>
	//   25   54:astore          8
				if(b1 != null && b1.b == c)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #213 <Field int ViewPager$b.b>
	//*  30   66:aload_0         
	//*  31   67:getfield        #201 <Field int c>
	//*  32   70:icmpne          81
					view.addFocusables(arraylist, i1, j1);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #790 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		if(i2 != 0x40000 || l1 == arraylist.size())
	//*  43   90:iload           6
	//*  44   92:ldc2            #532 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #207 <Method int ArrayList.size()>
	//*  49  104:icmpne          147
		{
			if(!isFocusable())
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #793 <Method boolean isFocusable()>
	//*  52  111:ifne            115
				return;
	//   53  114:return          
			if((j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
	//*  54  115:iload_3         
	//*  55  116:iconst_1        
	//*  56  117:iand            
	//*  57  118:iconst_1        
	//*  58  119:icmpne          137
	//*  59  122:aload_0         
	//*  60  123:invokevirtual   #796 <Method boolean isInTouchMode()>
	//*  61  126:ifeq            137
	//*  62  129:aload_0         
	//*  63  130:invokevirtual   #799 <Method boolean isFocusableInTouchMode()>
	//*  64  133:ifne            137
				return;
	//   65  136:return          
			if(arraylist != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          147
				arraylist.add(((Object) (this)));
	//   68  141:aload_1         
	//   69  142:aload_0         
	//   70  143:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   71  146:pop             
		}
	//   72  147:return          
	}

	public void addTouchables(ArrayList arraylist)
	{
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #404 <Method int getChildCount()>
	//*   5    7:icmpge          59
		{
			View view = getChildAt(i1);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #410 <Method View getChildAt(int)>
	//    9   15:astore_3        
			if(view.getVisibility() != 0)
				continue;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #788 <Method int View.getVisibility()>
	//   12   20:ifne            52
			b b1 = a(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #676 <Method ViewPager$b a(View)>
	//   16   28:astore          4
			if(b1 != null && b1.b == c)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #213 <Field int ViewPager$b.b>
	//*  21   40:aload_0         
	//*  22   41:getfield        #201 <Field int c>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #805 <Method void View.addTouchables(ArrayList)>
		}

	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
	//*  31   56:goto            2
	//   32   59:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(!checkLayoutParams(layoutparams))
	//*   2    3:aload_0         
	//*   3    4:aload_3         
	//*   4    5:invokevirtual   #812 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   5    8:ifne            18
			layoutparams1 = generateLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #816 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   16:astore          4
		layoutparams = ((android.view.ViewGroup.LayoutParams) ((LayoutParams)layoutparams1));
	//   10   18:aload           4
	//   11   20:checkcast       #14  <Class ViewPager$LayoutParams>
	//   12   23:astore_3        
		layoutparams.a = ((LayoutParams) (layoutparams)).a | c(view);
	//   13   24:aload_3         
	//   14   25:aload_3         
	//   15   26:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//   16   29:aload_1         
	//   17   30:invokestatic    #818 <Method boolean c(View)>
	//   18   33:ior             
	//   19   34:putfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
		if(x)
	//*  20   37:aload_0         
	//*  21   38:getfield        #820 <Field boolean x>
	//*  22   41:ifeq            81
		{
			if(layoutparams != null && ((LayoutParams) (layoutparams)).a)
	//*  23   44:aload_3         
	//*  24   45:ifnull          66
	//*  25   48:aload_3         
	//*  26   49:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//*  27   52:ifeq            66
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   28   55:new             #452 <Class IllegalStateException>
	//   29   58:dup             
	//   30   59:ldc2            #822 <String "Cannot add pager decor view during layout">
	//   31   62:invokespecial   #457 <Method void IllegalStateException(String)>
	//   32   65:athrow          
			} else
			{
				layoutparams.d = true;
	//   33   66:aload_3         
	//   34   67:iconst_1        
	//   35   68:putfield        #824 <Field boolean ViewPager$LayoutParams.d>
				addViewInLayout(view, i1, layoutparams1);
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:iload_2         
	//   39   74:aload           4
	//   40   76:invokevirtual   #828 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
	//   41   79:pop             
				return;
	//   42   80:return          
			}
		} else
		{
			super.addView(view, i1, layoutparams1);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:iload_2         
	//   46   84:aload           4
	//   47   86:invokespecial   #830 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   48   89:return          
		}
	}

	b b(int i1)
	{
		for(int j1 = 0; j1 < g.size(); j1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #148 <Field ArrayList g>
	//*   5    7:invokevirtual   #207 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			b b1 = (b)g.get(j1);
	//    7   13:aload_0         
	//    8   14:getfield        #148 <Field ArrayList g>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #25  <Class ViewPager$b>
	//   12   24:astore_3        
			if(b1.b == i1)
	//*  13   25:aload_3         
	//*  14   26:getfield        #213 <Field int ViewPager$b.b>
	//*  15   29:iload_1         
	//*  16   30:icmpne          35
				return b1;
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

	b b(View view)
	{
		do
		{
			ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #255 <Method ViewParent View.getParent()>
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
	//*   9   15:instanceof      #227 <Class View>
	//*  10   18:ifne            24
	//*  11   21:goto            32
					view = (View)viewparent;
	//   12   24:aload_2         
	//   13   25:checkcast       #227 <Class View>
	//   14   28:astore_1        
				else
	//*  15   29:goto            0
					return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			} else
			{
				return a(view);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #676 <Method ViewPager$b a(View)>
	//   21   39:areturn         
			}
		} while(true);
	}

	void b()
	{
		int i1;
		int j1;
		int l1;
		boolean flag;
		int j3;
		j3 = b.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field p b>
	//    2    4:invokevirtual   #327 <Method int p.getCount()>
	//    3    7:istore          9
		d = j3;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #613 <Field int d>
		if(g.size() < A * 2 + 1 && g.size() < j3)
	//*   7   15:aload_0         
	//*   8   16:getfield        #148 <Field ArrayList g>
	//*   9   19:invokevirtual   #207 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #170 <Field int A>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          50
	//*  17   33:aload_0         
	//*  18   34:getfield        #148 <Field ArrayList g>
	//*  19   37:invokevirtual   #207 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          50
			i1 = 1;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			i1 = 0;
	//   25   50:iconst_0        
	//   26   51:istore_1        
		j1 = c;
	//   27   52:aload_0         
	//   28   53:getfield        #201 <Field int c>
	//   29   56:istore_2        
		flag = ((boolean) (i1));
	//   30   57:iload_1         
	//   31   58:istore          6
		i1 = j1;
	//   32   60:iload_2         
	//   33   61:istore_1        
		l1 = 0;
	//   34   62:iconst_0        
	//   35   63:istore_3        
		j1 = 0;
	//   36   64:iconst_0        
	//   37   65:istore_2        
_L9:
		if(l1 >= g.size()) goto _L2; else goto _L1
	//   38   66:iload_3         
	//   39   67:aload_0         
	//   40   68:getfield        #148 <Field ArrayList g>
	//   41   71:invokevirtual   #207 <Method int ArrayList.size()>
	//   42   74:icmpge          292
_L1:
		int i3;
		b b1;
		b1 = (b)g.get(l1);
	//   43   77:aload_0         
	//   44   78:getfield        #148 <Field ArrayList g>
	//   45   81:iload_3         
	//   46   82:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   47   85:checkcast       #25  <Class ViewPager$b>
	//   48   88:astore          10
		i3 = b.getItemPosition(b1.a);
	//   49   90:aload_0         
	//   50   91:getfield        #322 <Field p b>
	//   51   94:aload           10
	//   52   96:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//   53   99:invokevirtual   #834 <Method int p.getItemPosition(Object)>
	//   54  102:istore          8
		if(i3 != -1) goto _L4; else goto _L3
	//   55  104:iload           8
	//   56  106:iconst_m1       
	//   57  107:icmpne          122
_L3:
		int j2;
		int k2;
		int l2;
		j2 = l1;
	//   58  110:iload_3         
	//   59  111:istore          4
		k2 = j1;
	//   60  113:iload_2         
	//   61  114:istore          5
		l2 = i1;
	//   62  116:iload_1         
	//   63  117:istore          7
		  goto _L5
	//*  64  119:goto            278
_L4:
		if(i3 != -2) goto _L7; else goto _L6
	//   65  122:iload           8
	//   66  124:bipush          -2
	//   67  126:icmpne          234
_L6:
		g.remove(l1);
	//   68  129:aload_0         
	//   69  130:getfield        #148 <Field ArrayList g>
	//   70  133:iload_3         
	//   71  134:invokevirtual   #658 <Method Object ArrayList.remove(int)>
	//   72  137:pop             
		k2 = l1 - 1;
	//   73  138:iload_3         
	//   74  139:iconst_1        
	//   75  140:isub            
	//   76  141:istore          5
		j2 = j1;
	//   77  143:iload_2         
	//   78  144:istore          4
		if(j1 == 0)
	//*  79  146:iload_2         
	//*  80  147:ifne            161
		{
			b.startUpdate(((ViewGroup) (this)));
	//   81  150:aload_0         
	//   82  151:getfield        #322 <Field p b>
	//   83  154:aload_0         
	//   84  155:invokevirtual   #611 <Method void p.startUpdate(ViewGroup)>
			j2 = 1;
	//   85  158:iconst_1        
	//   86  159:istore          4
		}
		b.destroyItem(((ViewGroup) (this)), b1.b, b1.a);
	//   87  161:aload_0         
	//   88  162:getfield        #322 <Field p b>
	//   89  165:aload_0         
	//   90  166:aload           10
	//   91  168:getfield        #213 <Field int ViewPager$b.b>
	//   92  171:aload           10
	//   93  173:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//   94  176:invokevirtual   #662 <Method void p.destroyItem(ViewGroup, int, Object)>
		l1 = k2;
	//   95  179:iload           5
	//   96  181:istore_3        
		j1 = j2;
	//   97  182:iload           4
	//   98  184:istore_2        
		if(c == b1.b)
	//*  99  185:aload_0         
	//* 100  186:getfield        #201 <Field int c>
	//* 101  189:aload           10
	//* 102  191:getfield        #213 <Field int ViewPager$b.b>
	//* 103  194:icmpne          219
		{
			i1 = Math.max(0, Math.min(c, j3 - 1));
	//  104  197:iconst_0        
	//  105  198:aload_0         
	//  106  199:getfield        #201 <Field int c>
	//  107  202:iload           9
	//  108  204:iconst_1        
	//  109  205:isub            
	//  110  206:invokestatic    #217 <Method int Math.min(int, int)>
	//  111  209:invokestatic    #220 <Method int Math.max(int, int)>
	//  112  212:istore_1        
			j1 = j2;
	//  113  213:iload           4
	//  114  215:istore_2        
			l1 = k2;
	//  115  216:iload           5
	//  116  218:istore_3        
		}
_L8:
		flag = true;
	//  117  219:iconst_1        
	//  118  220:istore          6
		j2 = l1;
	//  119  222:iload_3         
	//  120  223:istore          4
		k2 = j1;
	//  121  225:iload_2         
	//  122  226:istore          5
		l2 = i1;
	//  123  228:iload_1         
	//  124  229:istore          7
		break; /* Loop/switch isn't completed */
	//  125  231:goto            278
_L7:
		j2 = l1;
	//  126  234:iload_3         
	//  127  235:istore          4
		k2 = j1;
	//  128  237:iload_2         
	//  129  238:istore          5
		l2 = i1;
	//  130  240:iload_1         
	//  131  241:istore          7
		if(b1.b == i3)
			break; /* Loop/switch isn't completed */
	//  132  243:aload           10
	//  133  245:getfield        #213 <Field int ViewPager$b.b>
	//  134  248:iload           8
	//  135  250:icmpeq          278
		if(b1.b == c)
	//* 136  253:aload           10
	//* 137  255:getfield        #213 <Field int ViewPager$b.b>
	//* 138  258:aload_0         
	//* 139  259:getfield        #201 <Field int c>
	//* 140  262:icmpne          268
			i1 = i3;
	//  141  265:iload           8
	//  142  267:istore_1        
		b1.b = i3;
	//  143  268:aload           10
	//  144  270:iload           8
	//  145  272:putfield        #213 <Field int ViewPager$b.b>
		if(true) goto _L8; else goto _L5
	//  146  275:goto            219
_L5:
		l1 = j2 + 1;
	//  147  278:iload           4
	//  148  280:iconst_1        
	//  149  281:iadd            
	//  150  282:istore_3        
		j1 = k2;
	//  151  283:iload           5
	//  152  285:istore_2        
		i1 = l2;
	//  153  286:iload           7
	//  154  288:istore_1        
		  goto _L9
	//* 155  289:goto            66
_L2:
		if(j1 != 0)
	//* 156  292:iload_2         
	//* 157  293:ifeq            304
			b.finishUpdate(((ViewGroup) (this)));
	//  158  296:aload_0         
	//  159  297:getfield        #322 <Field p b>
	//  160  300:aload_0         
	//  161  301:invokevirtual   #670 <Method void p.finishUpdate(ViewGroup)>
		Collections.sort(((List) (g)), e);
	//  162  304:aload_0         
	//  163  305:getfield        #148 <Field ArrayList g>
	//  164  308:getstatic       #133 <Field Comparator e>
	//  165  311:invokestatic    #488 <Method void Collections.sort(List, Comparator)>
		if(flag)
	//* 166  314:iload           6
	//* 167  316:ifeq            376
		{
			int i2 = getChildCount();
	//  168  319:aload_0         
	//  169  320:invokevirtual   #404 <Method int getChildCount()>
	//  170  323:istore_3        
			for(int k1 = 0; k1 < i2; k1++)
	//* 171  324:iconst_0        
	//* 172  325:istore_2        
	//* 173  326:iload_2         
	//* 174  327:iload_3         
	//* 175  328:icmpge          365
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(k1).getLayoutParams();
	//  176  331:aload_0         
	//  177  332:iload_2         
	//  178  333:invokevirtual   #410 <Method View getChildAt(int)>
	//  179  336:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  180  339:checkcast       #14  <Class ViewPager$LayoutParams>
	//  181  342:astore          10
				if(!layoutparams.a)
	//* 182  344:aload           10
	//* 183  346:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//* 184  349:ifne            358
					layoutparams.c = 0.0F;
	//  185  352:aload           10
	//  186  354:fconst_0        
	//  187  355:putfield        #674 <Field float ViewPager$LayoutParams.c>
			}

	//  188  358:iload_2         
	//  189  359:iconst_1        
	//  190  360:iadd            
	//  191  361:istore_2        
	//* 192  362:goto            326
			a(i1, false, true);
	//  193  365:aload_0         
	//  194  366:iload_1         
	//  195  367:iconst_0        
	//  196  368:iconst_1        
	//  197  369:invokevirtual   #734 <Method void a(int, boolean, boolean)>
			requestLayout();
	//  198  372:aload_0         
	//  199  373:invokevirtual   #740 <Method void requestLayout()>
		}
		return;
	//  200  376:return          
	}

	public void b(d d1)
	{
		if(ad != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #746 <Field List ad>
	//*   2    4:ifnull          18
			ad.remove(((Object) (d1)));
	//    3    7:aload_0         
	//    4    8:getfield        #746 <Field List ad>
	//    5   11:aload_1         
	//    6   12:invokeinterface #836 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void b(e e1)
	{
		if(aa != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #395 <Field List aa>
	//*   2    4:ifnull          18
			aa.remove(((Object) (e1)));
	//    3    7:aload_0         
	//    4    8:getfield        #395 <Field List aa>
	//    5   11:aload_1         
	//    6   12:invokeinterface #836 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	e c(e e1)
	{
		e e2 = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field ViewPager$e ac>
	//    2    4:astore_2        
		ac = e1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #401 <Field ViewPager$e ac>
		return e2;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	void c()
	{
		a(c);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #201 <Field int c>
	//    3    5:invokevirtual   #741 <Method void a(int)>
	//    4    8:return          
	}

	public boolean c(int i1)
	{
		boolean flag1;
		Object obj;
		View view;
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
	//    1    1:invokevirtual   #685 <Method View findFocus()>
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
	//   12   22:goto            199
					}
					if(view1 == null)
						break label1;
	//   13   25:aload           7
	//   14   27:ifnull          195
					obj = ((Object) (view1.getParent()));
	//   15   30:aload           7
	//   16   32:invokevirtual   #255 <Method ViewParent View.getParent()>
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
	//   28   58:invokeinterface #838 <Method ViewParent ViewParent.getParent()>
	//   29   63:astore          5
					} while(true);
	//   30   65:goto            37
					flag = false;
	//   31   68:iconst_0        
	//   32   69:istore_2        
				}
				if(!flag)
	//*  33   70:iload_2         
	//*  34   71:ifne            195
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   74:new             #628 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #629 <Method void StringBuilder()>
	//   38   81:astore          8
					stringbuilder.append(((Object) (view1)).getClass().getSimpleName());
	//   39   83:aload           8
	//   40   85:aload           7
	//   41   87:invokevirtual   #441 <Method Class Object.getClass()>
	//   42   90:invokevirtual   #841 <Method String Class.getSimpleName()>
	//   43   93:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
					for(obj = ((Object) (view1.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
	//*  45   97:aload           7
	//*  46   99:invokevirtual   #255 <Method ViewParent View.getParent()>
	//*  47  102:astore          5
	//*  48  104:aload           5
	//*  49  106:instanceof      #4   <Class ViewGroup>
	//*  50  109:ifeq            147
					{
						stringbuilder.append(" => ");
	//   51  112:aload           8
	//   52  114:ldc2            #843 <String " => ">
	//   53  117:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
						stringbuilder.append(obj.getClass().getSimpleName());
	//   55  121:aload           8
	//   56  123:aload           5
	//   57  125:invokevirtual   #441 <Method Class Object.getClass()>
	//   58  128:invokevirtual   #841 <Method String Class.getSimpleName()>
	//   59  131:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					}

	//   61  135:aload           5
	//   62  137:invokeinterface #838 <Method ViewParent ViewParent.getParent()>
	//   63  142:astore          5
	//*  64  144:goto            104
					obj = ((Object) (new StringBuilder()));
	//   65  147:new             #628 <Class StringBuilder>
	//   66  150:dup             
	//   67  151:invokespecial   #629 <Method void StringBuilder()>
	//   68  154:astore          5
					((StringBuilder) (obj)).append("arrowScroll tried to find focus based on non-child current focused view ");
	//   69  156:aload           5
	//   70  158:ldc2            #845 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//   71  161:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   72  164:pop             
					((StringBuilder) (obj)).append(stringbuilder.toString());
	//   73  165:aload           5
	//   74  167:aload           8
	//   75  169:invokevirtual   #653 <Method String StringBuilder.toString()>
	//   76  172:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   77  175:pop             
					Log.e("ViewPager", ((StringBuilder) (obj)).toString());
	//   78  176:ldc2            #847 <String "ViewPager">
	//   79  179:aload           5
	//   80  181:invokevirtual   #653 <Method String StringBuilder.toString()>
	//   81  184:invokestatic    #852 <Method int Log.e(String, String)>
	//   82  187:pop             
					obj = ((Object) (obj1));
	//   83  188:aload           6
	//   84  190:astore          5
					break label0;
	//   85  192:goto            199
				}
			}
			obj = ((Object) (view1));
	//   86  195:aload           7
	//   87  197:astore          5
		}
		view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i1);
	//   88  199:invokestatic    #858 <Method FocusFinder FocusFinder.getInstance()>
	//   89  202:aload_0         
	//   90  203:aload           5
	//   91  205:iload_1         
	//   92  206:invokevirtual   #862 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   93  209:astore          6
		if(view == null || view == obj)
			break MISSING_BLOCK_LABEL_339;
	//   94  211:aload           6
	//   95  213:ifnull          339
	//   96  216:aload           6
	//   97  218:aload           5
	//   98  220:if_acmpeq       339
		if(i1 != 17) goto _L2; else goto _L1
	//   99  223:iload_1         
	//  100  224:bipush          17
	//  101  226:icmpne          286
_L1:
		int j1 = a(i, view).left;
	//  102  229:aload_0         
	//  103  230:aload_0         
	//  104  231:getfield        #156 <Field Rect i>
	//  105  234:aload           6
	//  106  236:invokespecial   #864 <Method Rect a(Rect, View)>
	//  107  239:getfield        #233 <Field int Rect.left>
	//  108  242:istore_2        
		int l1 = a(i, ((View) (obj))).left;
	//  109  243:aload_0         
	//  110  244:aload_0         
	//  111  245:getfield        #156 <Field Rect i>
	//  112  248:aload           5
	//  113  250:invokespecial   #864 <Method Rect a(Rect, View)>
	//  114  253:getfield        #233 <Field int Rect.left>
	//  115  256:istore_3        
		if(obj != null && j1 >= l1)
	//* 116  257:aload           5
	//* 117  259:ifnull          276
	//* 118  262:iload_2         
	//* 119  263:iload_3         
	//* 120  264:icmplt          276
		{
			flag1 = d();
	//  121  267:aload_0         
	//  122  268:invokevirtual   #764 <Method boolean d()>
	//  123  271:istore          4
			break MISSING_BLOCK_LABEL_379;
	//  124  273:goto            283
		}
_L4:
		flag1 = view.requestFocus();
	//  125  276:aload           6
	//  126  278:invokevirtual   #866 <Method boolean View.requestFocus()>
	//  127  281:istore          4
		break MISSING_BLOCK_LABEL_379;
	//  128  283:goto            379
_L2:
		int k1;
		int i2;
		if(i1 != 66)
			break MISSING_BLOCK_LABEL_379;
	//  129  286:iload_1         
	//  130  287:bipush          66
	//  131  289:icmpne          379
		k1 = a(i, view).left;
	//  132  292:aload_0         
	//  133  293:aload_0         
	//  134  294:getfield        #156 <Field Rect i>
	//  135  297:aload           6
	//  136  299:invokespecial   #864 <Method Rect a(Rect, View)>
	//  137  302:getfield        #233 <Field int Rect.left>
	//  138  305:istore_2        
		i2 = a(i, ((View) (obj))).left;
	//  139  306:aload_0         
	//  140  307:aload_0         
	//  141  308:getfield        #156 <Field Rect i>
	//  142  311:aload           5
	//  143  313:invokespecial   #864 <Method Rect a(Rect, View)>
	//  144  316:getfield        #233 <Field int Rect.left>
	//  145  319:istore_3        
		if(obj == null || k1 > i2) goto _L4; else goto _L3
	//  146  320:aload           5
	//  147  322:ifnull          276
	//  148  325:iload_2         
	//  149  326:iload_3         
	//  150  327:icmpgt          276
_L3:
		flag1 = e();
	//  151  330:aload_0         
	//  152  331:invokevirtual   #762 <Method boolean e()>
	//  153  334:istore          4
		break MISSING_BLOCK_LABEL_379;
	//  154  336:goto            283
		if(i1 != 17 && i1 != 1)
	//* 155  339:iload_1         
	//* 156  340:bipush          17
	//* 157  342:icmpeq          373
	//* 158  345:iload_1         
	//* 159  346:iconst_1        
	//* 160  347:icmpne          353
	//* 161  350:goto            373
		{
			if(i1 == 66 || i1 == 2)
	//* 162  353:iload_1         
	//* 163  354:bipush          66
	//* 164  356:icmpeq          364
	//* 165  359:iload_1         
	//* 166  360:iconst_2        
	//* 167  361:icmpne          379
				flag1 = e();
	//  168  364:aload_0         
	//  169  365:invokevirtual   #762 <Method boolean e()>
	//  170  368:istore          4
		} else
	//* 171  370:goto            379
		{
			flag1 = d();
	//  172  373:aload_0         
	//  173  374:invokevirtual   #764 <Method boolean d()>
	//  174  377:istore          4
		}
		if(flag1)
	//* 175  379:iload           4
	//* 176  381:ifeq            392
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
	//  177  384:aload_0         
	//  178  385:iload_1         
	//  179  386:invokestatic    #871 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//  180  389:invokevirtual   #874 <Method void playSoundEffect(int)>
		return flag1;
	//  181  392:iload           4
	//  182  394:ireturn         
	}

	public boolean canScrollHorizontally(int i1)
	{
		p p1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field p b>
	//    2    4:astore          6
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(p1 == null)
	//*   7   12:aload           6
	//*   8   14:ifnonnull       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		int j1 = getClientWidth();
	//   11   19:aload_0         
	//   12   20:invokespecial   #277 <Method int getClientWidth()>
	//   13   23:istore_2        
		int k1 = getScrollX();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #290 <Method int getScrollX()>
	//   16   28:istore_3        
		if(i1 < 0)
	//*  17   29:iload_1         
	//*  18   30:ifge            51
		{
			if(k1 > (int)((float)j1 * t))
	//*  19   33:iload_3         
	//*  20   34:iload_2         
	//*  21   35:i2f             
	//*  22   36:aload_0         
	//*  23   37:getfield        #165 <Field float t>
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
		flag = flag1;
	//   31   51:iload           5
	//   32   53:istore          4
		if(i1 > 0)
	//*  33   55:iload_1         
	//*  34   56:ifle            78
		{
			flag = flag1;
	//   35   59:iload           5
	//   36   61:istore          4
			if(k1 < (int)((float)j1 * u))
	//*  37   63:iload_3         
	//*  38   64:iload_2         
	//*  39   65:i2f             
	//*  40   66:aload_0         
	//*  41   67:getfield        #168 <Field float u>
	//*  42   70:fmul            
	//*  43   71:f2i             
	//*  44   72:icmpge          78
				flag = true;
	//   45   75:iconst_1        
	//   46   76:istore          4
		}
		return flag;
	//   47   78:iload           4
	//   48   80:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #14  <Class ViewPager$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #875 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		n = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #707 <Field boolean n>
		if(!m.isFinished() && m.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #266 <Field Scroller m>
	//*   5    9:invokevirtual   #271 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #266 <Field Scroller m>
	//*   9   19:invokevirtual   #879 <Method boolean Scroller.computeScrollOffset()>
	//*  10   22:ifeq            97
		{
			int i1 = getScrollX();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #290 <Method int getScrollX()>
	//   13   29:istore_1        
			int j1 = getScrollY();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #293 <Method int getScrollY()>
	//   16   34:istore_2        
			int k1 = m.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #266 <Field Scroller m>
	//   19   39:invokevirtual   #365 <Method int Scroller.getCurrX()>
	//   20   42:istore_3        
			int l1 = m.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #266 <Field Scroller m>
	//   23   47:invokevirtual   #368 <Method int Scroller.getCurrY()>
	//   24   50:istore          4
			if(i1 != k1 || j1 != l1)
	//*  25   52:iload_1         
	//*  26   53:iload_3         
	//*  27   54:icmpne          63
	//*  28   57:iload_2         
	//*  29   58:iload           4
	//*  30   60:icmpeq          92
			{
				scrollTo(k1, l1);
	//   31   63:aload_0         
	//   32   64:iload_3         
	//   33   65:iload           4
	//   34   67:invokevirtual   #297 <Method void scrollTo(int, int)>
				if(!d(k1))
	//*  35   70:aload_0         
	//*  36   71:iload_3         
	//*  37   72:invokespecial   #319 <Method boolean d(int)>
	//*  38   75:ifne            92
				{
					m.abortAnimation();
	//   39   78:aload_0         
	//   40   79:getfield        #266 <Field Scroller m>
	//   41   82:invokevirtual   #362 <Method void Scroller.abortAnimation()>
					scrollTo(0, l1);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:iload           4
	//   45   89:invokevirtual   #297 <Method void scrollTo(int, int)>
				}
			}
			android.support.v4.view.s.c(((View) (this)));
	//   46   92:aload_0         
	//   47   93:invokestatic    #730 <Method void s.c(View)>
			return;
	//   48   96:return          
		} else
		{
			a(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #308 <Method void a(boolean)>
			return;
	//   52  102:return          
		}
	}

	boolean d()
	{
		if(c > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field int c>
	//*   2    4:ifle            20
		{
			a(c - 1, true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #201 <Field int c>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #881 <Method void a(int, boolean)>
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

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || a(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #884 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #886 <Method boolean a(KeyEvent)>
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
	//*   1    1:invokevirtual   #893 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:sipush          4096
	//*   3    7:icmpne          16
			return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #895 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    7   15:ireturn         
		int j1 = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #404 <Method int getChildCount()>
	//   10   20:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          86
		{
			View view = getChildAt(i1);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #410 <Method View getChildAt(int)>
	//   19   33:astore          4
			if(view.getVisibility() != 0)
				continue;
	//   20   35:aload           4
	//   21   37:invokevirtual   #788 <Method int View.getVisibility()>
	//   22   40:ifne            79
			b b1 = a(view);
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:invokevirtual   #676 <Method ViewPager$b a(View)>
	//   26   49:astore          5
			if(b1 != null && b1.b == c && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  27   51:aload           5
	//*  28   53:ifnull          79
	//*  29   56:aload           5
	//*  30   58:getfield        #213 <Field int ViewPager$b.b>
	//*  31   61:aload_0         
	//*  32   62:getfield        #201 <Field int c>
	//*  33   65:icmpne          79
	//*  34   68:aload           4
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #896 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
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

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #900 <Method void ViewGroup.draw(Canvas)>
		int k1 = getOverScrollMode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #903 <Method int getOverScrollMode()>
	//    5    9:istore          4
		int j1 = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		int i1 = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		if(k1 != 0 && (k1 != 1 || b == null || b.getCount() <= 1))
	//*  10   15:iload           4
	//*  11   17:ifeq            64
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          47
	//*  15   26:aload_0         
	//*  16   27:getfield        #322 <Field p b>
	//*  17   30:ifnull          47
	//*  18   33:aload_0         
	//*  19   34:getfield        #322 <Field p b>
	//*  20   37:invokevirtual   #327 <Method int p.getCount()>
	//*  21   40:iconst_1        
	//*  22   41:icmple          47
	//*  23   44:goto            64
		{
			R.finish();
	//   24   47:aload_0         
	//   25   48:getfield        #417 <Field EdgeEffect R>
	//   26   51:invokevirtual   #906 <Method void EdgeEffect.finish()>
			S.finish();
	//   27   54:aload_0         
	//   28   55:getfield        #428 <Field EdgeEffect S>
	//   29   58:invokevirtual   #906 <Method void EdgeEffect.finish()>
		} else
	//*  30   61:goto            254
		{
			if(!R.isFinished())
	//*  31   64:aload_0         
	//*  32   65:getfield        #417 <Field EdgeEffect R>
	//*  33   68:invokevirtual   #497 <Method boolean EdgeEffect.isFinished()>
	//*  34   71:ifne            153
			{
				j1 = canvas.save();
	//   35   74:aload_1         
	//   36   75:invokevirtual   #911 <Method int Canvas.save()>
	//   37   78:istore_3        
				i1 = getHeight() - getPaddingTop() - getPaddingBottom();
	//   38   79:aload_0         
	//   39   80:invokevirtual   #914 <Method int getHeight()>
	//   40   83:aload_0         
	//   41   84:invokevirtual   #917 <Method int getPaddingTop()>
	//   42   87:isub            
	//   43   88:aload_0         
	//   44   89:invokevirtual   #920 <Method int getPaddingBottom()>
	//   45   92:isub            
	//   46   93:istore_2        
				int l1 = getWidth();
	//   47   94:aload_0         
	//   48   95:invokevirtual   #388 <Method int getWidth()>
	//   49   98:istore          4
				canvas.rotate(270F);
	//   50  100:aload_1         
	//   51  101:ldc2            #921 <Float 270F>
	//   52  104:invokevirtual   #924 <Method void Canvas.rotate(float)>
				canvas.translate(-i1 + getPaddingTop(), t * (float)l1);
	//   53  107:aload_1         
	//   54  108:iload_2         
	//   55  109:ineg            
	//   56  110:aload_0         
	//   57  111:invokevirtual   #917 <Method int getPaddingTop()>
	//   58  114:iadd            
	//   59  115:i2f             
	//   60  116:aload_0         
	//   61  117:getfield        #165 <Field float t>
	//   62  120:iload           4
	//   63  122:i2f             
	//   64  123:fmul            
	//   65  124:invokevirtual   #928 <Method void Canvas.translate(float, float)>
				R.setSize(i1, l1);
	//   66  127:aload_0         
	//   67  128:getfield        #417 <Field EdgeEffect R>
	//   68  131:iload_2         
	//   69  132:iload           4
	//   70  134:invokevirtual   #931 <Method void EdgeEffect.setSize(int, int)>
				i1 = ((int) (false | R.draw(canvas)));
	//   71  137:iconst_0        
	//   72  138:aload_0         
	//   73  139:getfield        #417 <Field EdgeEffect R>
	//   74  142:aload_1         
	//   75  143:invokevirtual   #934 <Method boolean EdgeEffect.draw(Canvas)>
	//   76  146:ior             
	//   77  147:istore_2        
				canvas.restoreToCount(j1);
	//   78  148:aload_1         
	//   79  149:iload_3         
	//   80  150:invokevirtual   #937 <Method void Canvas.restoreToCount(int)>
			}
			j1 = i1;
	//   81  153:iload_2         
	//   82  154:istore_3        
			if(!S.isFinished())
	//*  83  155:aload_0         
	//*  84  156:getfield        #428 <Field EdgeEffect S>
	//*  85  159:invokevirtual   #497 <Method boolean EdgeEffect.isFinished()>
	//*  86  162:ifne            254
			{
				int i2 = canvas.save();
	//   87  165:aload_1         
	//   88  166:invokevirtual   #911 <Method int Canvas.save()>
	//   89  169:istore          4
				j1 = getWidth();
	//   90  171:aload_0         
	//   91  172:invokevirtual   #388 <Method int getWidth()>
	//   92  175:istore_3        
				int j2 = getHeight();
	//   93  176:aload_0         
	//   94  177:invokevirtual   #914 <Method int getHeight()>
	//   95  180:istore          5
				int k2 = getPaddingTop();
	//   96  182:aload_0         
	//   97  183:invokevirtual   #917 <Method int getPaddingTop()>
	//   98  186:istore          6
				int l2 = getPaddingBottom();
	//   99  188:aload_0         
	//  100  189:invokevirtual   #920 <Method int getPaddingBottom()>
	//  101  192:istore          7
				canvas.rotate(90F);
	//  102  194:aload_1         
	//  103  195:ldc2            #938 <Float 90F>
	//  104  198:invokevirtual   #924 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(u + 1.0F) * (float)j1);
	//  105  201:aload_1         
	//  106  202:aload_0         
	//  107  203:invokevirtual   #917 <Method int getPaddingTop()>
	//  108  206:ineg            
	//  109  207:i2f             
	//  110  208:aload_0         
	//  111  209:getfield        #168 <Field float u>
	//  112  212:fconst_1        
	//  113  213:fadd            
	//  114  214:fneg            
	//  115  215:iload_3         
	//  116  216:i2f             
	//  117  217:fmul            
	//  118  218:invokevirtual   #928 <Method void Canvas.translate(float, float)>
				S.setSize(j2 - k2 - l2, j1);
	//  119  221:aload_0         
	//  120  222:getfield        #428 <Field EdgeEffect S>
	//  121  225:iload           5
	//  122  227:iload           6
	//  123  229:isub            
	//  124  230:iload           7
	//  125  232:isub            
	//  126  233:iload_3         
	//  127  234:invokevirtual   #931 <Method void EdgeEffect.setSize(int, int)>
				j1 = i1 | S.draw(canvas);
	//  128  237:iload_2         
	//  129  238:aload_0         
	//  130  239:getfield        #428 <Field EdgeEffect S>
	//  131  242:aload_1         
	//  132  243:invokevirtual   #934 <Method boolean EdgeEffect.draw(Canvas)>
	//  133  246:ior             
	//  134  247:istore_3        
				canvas.restoreToCount(i2);
	//  135  248:aload_1         
	//  136  249:iload           4
	//  137  251:invokevirtual   #937 <Method void Canvas.restoreToCount(int)>
			}
		}
		if(j1 != 0)
	//* 138  254:iload_3         
	//* 139  255:ifeq            262
			android.support.v4.view.s.c(((View) (this)));
	//  140  258:aload_0         
	//  141  259:invokestatic    #730 <Method void s.c(View)>
	//  142  262:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #941 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = q;
	//    2    4:aload_0         
	//    3    5:getfield        #943 <Field Drawable q>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #948 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #952 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #956 <Method boolean Drawable.setState(int[])>
	//   14   28:pop             
	//   15   29:return          
	}

	boolean e()
	{
		if(b != null && c < b.getCount() - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field p b>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #201 <Field int c>
	//*   5   11:aload_0         
	//*   6   12:getfield        #322 <Field p b>
	//*   7   15:invokevirtual   #327 <Method int p.getCount()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:icmpge          36
		{
			a(c + 1, true);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #201 <Field int c>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #881 <Method void a(int, boolean)>
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

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #14  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #958 <Method void ViewPager$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #14  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #542 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #960 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #962 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public p getAdapter()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field p b>
	//    2    4:areturn         
	}

	protected int getChildDrawingOrder(int i1, int j1)
	{
		int k1 = j1;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(ag == 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #475 <Field int ag>
	//*   4    6:iconst_2        
	//*   5    7:icmpne          16
			k1 = i1 - 1 - j1;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iload_2         
	//   10   14:isub            
	//   11   15:istore_3        
		return ((LayoutParams)((View)ah.get(k1)).getLayoutParams()).f;
	//   12   16:aload_0         
	//   13   17:getfield        #477 <Field ArrayList ah>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   16   24:checkcast       #227 <Class View>
	//   17   27:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   30:checkcast       #14  <Class ViewPager$LayoutParams>
	//   19   33:getfield        #672 <Field int ViewPager$LayoutParams.f>
	//   20   36:ireturn         
	}

	public int getCurrentItem()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field int c>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field int A>
	//    2    4:ireturn         
	}

	public int getPageMargin()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field int p>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #970 <Method void ViewGroup.onAttachedToWindow()>
		T = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #174 <Field boolean T>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(aj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #181 <Field Runnable aj>
	//    3    5:invokevirtual   #975 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		if(m != null && !m.isFinished())
	//*   5    9:aload_0         
	//*   6   10:getfield        #266 <Field Scroller m>
	//*   7   13:ifnull          33
	//*   8   16:aload_0         
	//*   9   17:getfield        #266 <Field Scroller m>
	//*  10   20:invokevirtual   #271 <Method boolean Scroller.isFinished()>
	//*  11   23:ifne            33
			m.abortAnimation();
	//   12   26:aload_0         
	//   13   27:getfield        #266 <Field Scroller m>
	//   14   30:invokevirtual   #362 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   15   33:aload_0         
	//   16   34:invokespecial   #977 <Method void ViewGroup.onDetachedFromWindow()>
	//   17   37:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #980 <Method void ViewGroup.onDraw(Canvas)>
		if(p > 0 && q != null && g.size() > 0 && b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #329 <Field int p>
	//*   5    9:ifle            339
	//*   6   12:aload_0         
	//*   7   13:getfield        #943 <Field Drawable q>
	//*   8   16:ifnull          339
	//*   9   19:aload_0         
	//*  10   20:getfield        #148 <Field ArrayList g>
	//*  11   23:invokevirtual   #207 <Method int ArrayList.size()>
	//*  12   26:ifle            339
	//*  13   29:aload_0         
	//*  14   30:getfield        #322 <Field p b>
	//*  15   33:ifnull          339
		{
			int k1 = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #290 <Method int getScrollX()>
	//   18   40:istore          10
			int l1 = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #388 <Method int getWidth()>
	//   21   46:istore          11
			float f1 = p;
	//   22   48:aload_0         
	//   23   49:getfield        #329 <Field int p>
	//   24   52:i2f             
	//   25   53:fstore_2        
			float f4 = l1;
	//   26   54:iload           11
	//   27   56:i2f             
	//   28   57:fstore          5
			float f2 = f1 / f4;
	//   29   59:fload_2         
	//   30   60:fload           5
	//   31   62:fdiv            
	//   32   63:fstore_3        
			Object obj = ((Object) (g));
	//   33   64:aload_0         
	//   34   65:getfield        #148 <Field ArrayList g>
	//   35   68:astore          14
			int j1 = 0;
	//   36   70:iconst_0        
	//   37   71:istore          9
			obj = ((Object) ((b)((ArrayList) (obj)).get(0)));
	//   38   73:aload           14
	//   39   75:iconst_0        
	//   40   76:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   41   79:checkcast       #25  <Class ViewPager$b>
	//   42   82:astore          14
			f1 = ((b) (obj)).e;
	//   43   84:aload           14
	//   44   86:getfield        #302 <Field float ViewPager$b.e>
	//   45   89:fstore_2        
			int i2 = g.size();
	//   46   90:aload_0         
	//   47   91:getfield        #148 <Field ArrayList g>
	//   48   94:invokevirtual   #207 <Method int ArrayList.size()>
	//   49   97:istore          12
			int i1 = ((b) (obj)).b;
	//   50   99:aload           14
	//   51  101:getfield        #213 <Field int ViewPager$b.b>
	//   52  104:istore          8
			for(int j2 = ((b)g.get(i2 - 1)).b; i1 < j2; i1++)
	//*  53  106:aload_0         
	//*  54  107:getfield        #148 <Field ArrayList g>
	//*  55  110:iload           12
	//*  56  112:iconst_1        
	//*  57  113:isub            
	//*  58  114:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//*  59  117:checkcast       #25  <Class ViewPager$b>
	//*  60  120:getfield        #213 <Field int ViewPager$b.b>
	//*  61  123:istore          13
	//*  62  125:iload           8
	//*  63  127:iload           13
	//*  64  129:icmpge          339
			{
				for(; i1 > ((b) (obj)).b && j1 < i2; obj = ((Object) ((b)((ArrayList) (obj)).get(j1))))
	//*  65  132:iload           8
	//*  66  134:aload           14
	//*  67  136:getfield        #213 <Field int ViewPager$b.b>
	//*  68  139:icmple          176
	//*  69  142:iload           9
	//*  70  144:iload           12
	//*  71  146:icmpge          176
				{
					obj = ((Object) (g));
	//   72  149:aload_0         
	//   73  150:getfield        #148 <Field ArrayList g>
	//   74  153:astore          14
					j1++;
	//   75  155:iload           9
	//   76  157:iconst_1        
	//   77  158:iadd            
	//   78  159:istore          9
				}

	//   79  161:aload           14
	//   80  163:iload           9
	//   81  165:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   82  168:checkcast       #25  <Class ViewPager$b>
	//   83  171:astore          14
	//*  84  173:goto            132
				float f3;
				if(i1 == ((b) (obj)).b)
	//*  85  176:iload           8
	//*  86  178:aload           14
	//*  87  180:getfield        #213 <Field int ViewPager$b.b>
	//*  88  183:icmpne          233
				{
					f3 = ((b) (obj)).e;
	//   89  186:aload           14
	//   90  188:getfield        #302 <Field float ViewPager$b.e>
	//   91  191:fstore          4
					float f7 = ((b) (obj)).d;
	//   92  193:aload           14
	//   93  195:getfield        #331 <Field float ViewPager$b.d>
	//   94  198:fstore          7
					f1 = ((b) (obj)).e;
	//   95  200:aload           14
	//   96  202:getfield        #302 <Field float ViewPager$b.e>
	//   97  205:fstore_2        
					float f5 = ((b) (obj)).d;
	//   98  206:aload           14
	//   99  208:getfield        #331 <Field float ViewPager$b.d>
	//  100  211:fstore          6
					f3 = (f3 + f7) * f4;
	//  101  213:fload           4
	//  102  215:fload           7
	//  103  217:fadd            
	//  104  218:fload           5
	//  105  220:fmul            
	//  106  221:fstore          4
					f1 = f1 + f5 + f2;
	//  107  223:fload_2         
	//  108  224:fload           6
	//  109  226:fadd            
	//  110  227:fload_3         
	//  111  228:fadd            
	//  112  229:fstore_2        
				} else
	//* 113  230:goto            260
				{
					float f6 = b.getPageWidth(i1);
	//  114  233:aload_0         
	//  115  234:getfield        #322 <Field p b>
	//  116  237:iload           8
	//  117  239:invokevirtual   #335 <Method float p.getPageWidth(int)>
	//  118  242:fstore          6
					f3 = (f1 + f6) * f4;
	//  119  244:fload_2         
	//  120  245:fload           6
	//  121  247:fadd            
	//  122  248:fload           5
	//  123  250:fmul            
	//  124  251:fstore          4
					f1 += f6 + f2;
	//  125  253:fload_2         
	//  126  254:fload           6
	//  127  256:fload_3         
	//  128  257:fadd            
	//  129  258:fadd            
	//  130  259:fstore_2        
				}
				if((float)p + f3 > (float)k1)
	//* 131  260:aload_0         
	//* 132  261:getfield        #329 <Field int p>
	//* 133  264:i2f             
	//* 134  265:fload           4
	//* 135  267:fadd            
	//* 136  268:iload           10
	//* 137  270:i2f             
	//* 138  271:fcmpl           
	//* 139  272:ifle            317
				{
					q.setBounds(Math.round(f3), r, Math.round((float)p + f3), s);
	//  140  275:aload_0         
	//  141  276:getfield        #943 <Field Drawable q>
	//  142  279:fload           4
	//  143  281:invokestatic    #722 <Method int Math.round(float)>
	//  144  284:aload_0         
	//  145  285:getfield        #982 <Field int r>
	//  146  288:aload_0         
	//  147  289:getfield        #329 <Field int p>
	//  148  292:i2f             
	//  149  293:fload           4
	//  150  295:fadd            
	//  151  296:invokestatic    #722 <Method int Math.round(float)>
	//  152  299:aload_0         
	//  153  300:getfield        #984 <Field int s>
	//  154  303:invokevirtual   #987 <Method void Drawable.setBounds(int, int, int, int)>
					q.draw(canvas);
	//  155  306:aload_0         
	//  156  307:getfield        #943 <Field Drawable q>
	//  157  310:aload_1         
	//  158  311:invokevirtual   #988 <Method void Drawable.draw(Canvas)>
				}
	//* 159  314:goto            317
				if(f3 > (float)(k1 + l1))
	//* 160  317:fload           4
	//* 161  319:iload           10
	//* 162  321:iload           11
	//* 163  323:iadd            
	//* 164  324:i2f             
	//* 165  325:fcmpl           
	//* 166  326:ifle            330
					return;
	//  167  329:return          
			}

	//  168  330:iload           8
	//  169  332:iconst_1        
	//  170  333:iadd            
	//  171  334:istore          8
		}
	//* 172  336:goto            125
	//  173  339:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #991 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i1 != 3 && i1 != 1)
	//*   5   10:iload           7
	//*   6   12:iconst_3        
	//*   7   13:icmpeq          482
	//*   8   16:iload           7
	//*   9   18:iconst_1        
	//*  10   19:icmpne          25
	//*  11   22:goto            482
		{
			if(i1 != 0)
	//*  12   25:iload           7
	//*  13   27:ifeq            48
			{
				if(B)
	//*  14   30:aload_0         
	//*  15   31:getfield        #499 <Field boolean B>
	//*  16   34:ifeq            39
					return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
				if(C)
	//*  19   39:aload_0         
	//*  20   40:getfield        #501 <Field boolean C>
	//*  21   43:ifeq            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			}
			if(i1 != 0)
	//*  24   48:iload           7
	//*  25   50:ifeq            321
			{
				if(i1 != 2)
	//*  26   53:iload           7
	//*  27   55:iconst_2        
	//*  28   56:icmpeq          77
				{
					if(i1 == 6)
	//*  29   59:iload           7
	//*  30   61:bipush          6
	//*  31   63:icmpeq          69
	//*  32   66:goto            455
						a(motionevent);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #993 <Method void a(MotionEvent)>
				} else
	//*  36   74:goto            455
				{
					int j1 = K;
	//   37   77:aload_0         
	//   38   78:getfield        #172 <Field int K>
	//   39   81:istore          7
					if(j1 != -1)
	//*  40   83:iload           7
	//*  41   85:iconst_m1       
	//*  42   86:icmpne          92
	//*  43   89:goto            455
					{
						j1 = motionevent.findPointerIndex(j1);
	//   44   92:aload_1         
	//   45   93:iload           7
	//   46   95:invokevirtual   #996 <Method int MotionEvent.findPointerIndex(int)>
	//   47   98:istore          7
						float f4 = motionevent.getX(j1);
	//   48  100:aload_1         
	//   49  101:iload           7
	//   50  103:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//   51  106:fstore_3        
						float f1 = f4 - G;
	//   52  107:fload_3         
	//   53  108:aload_0         
	//   54  109:getfield        #349 <Field float G>
	//   55  112:fsub            
	//   56  113:fstore_2        
						float f6 = Math.abs(f1);
	//   57  114:fload_2         
	//   58  115:invokestatic    #420 <Method float Math.abs(float)>
	//   59  118:fstore          5
						float f5 = motionevent.getY(j1);
	//   60  120:aload_1         
	//   61  121:iload           7
	//   62  123:invokevirtual   #999 <Method float MotionEvent.getY(int)>
	//   63  126:fstore          4
						float f7 = Math.abs(f5 - J);
	//   64  128:fload           4
	//   65  130:aload_0         
	//   66  131:getfield        #1001 <Field float J>
	//   67  134:fsub            
	//   68  135:invokestatic    #420 <Method float Math.abs(float)>
	//   69  138:fstore          6
						j1 = f1 != 0.0F;
	//   70  140:fload_2         
	//   71  141:fconst_0        
	//   72  142:fcmpl           
	//   73  143:istore          7
						if(j1 != 0 && !a(G, f1) && a(((View) (this)), false, (int)f1, (int)f4, (int)f5))
	//*  74  145:iload           7
	//*  75  147:ifeq            196
	//*  76  150:aload_0         
	//*  77  151:aload_0         
	//*  78  152:getfield        #349 <Field float G>
	//*  79  155:fload_2         
	//*  80  156:invokespecial   #1003 <Method boolean a(float, float)>
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
	//*  91  172:invokevirtual   #776 <Method boolean a(View, boolean, int, int, int)>
	//*  92  175:ifeq            196
						{
							G = f4;
	//   93  178:aload_0         
	//   94  179:fload_3         
	//   95  180:putfield        #349 <Field float G>
							H = f5;
	//   96  183:aload_0         
	//   97  184:fload           4
	//   98  186:putfield        #1005 <Field float H>
							C = true;
	//   99  189:aload_0         
	//  100  190:iconst_1        
	//  101  191:putfield        #501 <Field boolean C>
							return false;
	//  102  194:iconst_0        
	//  103  195:ireturn         
						}
						if(f6 > (float)F && f6 * 0.5F > f7)
	//* 104  196:fload           5
	//* 105  198:aload_0         
	//* 106  199:getfield        #572 <Field int F>
	//* 107  202:i2f             
	//* 108  203:fcmpl           
	//* 109  204:ifle            283
	//* 110  207:fload           5
	//* 111  209:ldc2            #507 <Float 0.5F>
	//* 112  212:fmul            
	//* 113  213:fload           6
	//* 114  215:fcmpl           
	//* 115  216:ifle            283
						{
							B = true;
	//  116  219:aload_0         
	//  117  220:iconst_1        
	//  118  221:putfield        #499 <Field boolean B>
							c(true);
	//  119  224:aload_0         
	//  120  225:iconst_1        
	//  121  226:invokespecial   #1007 <Method void c(boolean)>
							setScrollState(1);
	//  122  229:aload_0         
	//  123  230:iconst_1        
	//  124  231:invokevirtual   #715 <Method void setScrollState(int)>
							float f2;
							if(j1 > 0)
	//* 125  234:iload           7
	//* 126  236:ifle            253
								f2 = I + (float)F;
	//  127  239:aload_0         
	//  128  240:getfield        #1009 <Field float I>
	//  129  243:aload_0         
	//  130  244:getfield        #572 <Field int F>
	//  131  247:i2f             
	//  132  248:fadd            
	//  133  249:fstore_2        
							else
	//* 134  250:goto            264
								f2 = I - (float)F;
	//  135  253:aload_0         
	//  136  254:getfield        #1009 <Field float I>
	//  137  257:aload_0         
	//  138  258:getfield        #572 <Field int F>
	//  139  261:i2f             
	//  140  262:fsub            
	//  141  263:fstore_2        
							G = f2;
	//  142  264:aload_0         
	//  143  265:fload_2         
	//  144  266:putfield        #349 <Field float G>
							H = f5;
	//  145  269:aload_0         
	//  146  270:fload           4
	//  147  272:putfield        #1005 <Field float H>
							setScrollingCacheEnabled(true);
	//  148  275:aload_0         
	//  149  276:iconst_1        
	//  150  277:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
						} else
	//* 151  280:goto            299
						if(f7 > (float)F)
	//* 152  283:fload           6
	//* 153  285:aload_0         
	//* 154  286:getfield        #572 <Field int F>
	//* 155  289:i2f             
	//* 156  290:fcmpl           
	//* 157  291:ifle            299
							C = true;
	//  158  294:aload_0         
	//  159  295:iconst_1        
	//  160  296:putfield        #501 <Field boolean C>
						if(B && b(f4))
	//* 161  299:aload_0         
	//* 162  300:getfield        #499 <Field boolean B>
	//* 163  303:ifeq            455
	//* 164  306:aload_0         
	//* 165  307:fload_3         
	//* 166  308:invokespecial   #1011 <Method boolean b(float)>
	//* 167  311:ifeq            455
							android.support.v4.view.s.c(((View) (this)));
	//  168  314:aload_0         
	//  169  315:invokestatic    #730 <Method void s.c(View)>
					}
				}
			} else
	//* 170  318:goto            455
			{
				float f3 = motionevent.getX();
	//  171  321:aload_1         
	//  172  322:invokevirtual   #1014 <Method float MotionEvent.getX()>
	//  173  325:fstore_2        
				I = f3;
	//  174  326:aload_0         
	//  175  327:fload_2         
	//  176  328:putfield        #1009 <Field float I>
				G = f3;
	//  177  331:aload_0         
	//  178  332:fload_2         
	//  179  333:putfield        #349 <Field float G>
				f3 = motionevent.getY();
	//  180  336:aload_1         
	//  181  337:invokevirtual   #1016 <Method float MotionEvent.getY()>
	//  182  340:fstore_2        
				J = f3;
	//  183  341:aload_0         
	//  184  342:fload_2         
	//  185  343:putfield        #1001 <Field float J>
				H = f3;
	//  186  346:aload_0         
	//  187  347:fload_2         
	//  188  348:putfield        #1005 <Field float H>
				K = motionevent.getPointerId(0);
	//  189  351:aload_0         
	//  190  352:aload_1         
	//  191  353:iconst_0        
	//  192  354:invokevirtual   #344 <Method int MotionEvent.getPointerId(int)>
	//  193  357:putfield        #172 <Field int K>
				C = false;
	//  194  360:aload_0         
	//  195  361:iconst_0        
	//  196  362:putfield        #501 <Field boolean C>
				n = true;
	//  197  365:aload_0         
	//  198  366:iconst_1        
	//  199  367:putfield        #707 <Field boolean n>
				m.computeScrollOffset();
	//  200  370:aload_0         
	//  201  371:getfield        #266 <Field Scroller m>
	//  202  374:invokevirtual   #879 <Method boolean Scroller.computeScrollOffset()>
	//  203  377:pop             
				if(ak == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > P)
	//* 204  378:aload_0         
	//* 205  379:getfield        #183 <Field int ak>
	//* 206  382:iconst_2        
	//* 207  383:icmpne          445
	//* 208  386:aload_0         
	//* 209  387:getfield        #266 <Field Scroller m>
	//* 210  390:invokevirtual   #1019 <Method int Scroller.getFinalX()>
	//* 211  393:aload_0         
	//* 212  394:getfield        #266 <Field Scroller m>
	//* 213  397:invokevirtual   #365 <Method int Scroller.getCurrX()>
	//* 214  400:isub            
	//* 215  401:invokestatic    #195 <Method int Math.abs(int)>
	//* 216  404:aload_0         
	//* 217  405:getfield        #582 <Field int P>
	//* 218  408:icmple          445
				{
					m.abortAnimation();
	//  219  411:aload_0         
	//  220  412:getfield        #266 <Field Scroller m>
	//  221  415:invokevirtual   #362 <Method void Scroller.abortAnimation()>
					z = false;
	//  222  418:aload_0         
	//  223  419:iconst_0        
	//  224  420:putfield        #370 <Field boolean z>
					c();
	//  225  423:aload_0         
	//  226  424:invokevirtual   #712 <Method void c()>
					B = true;
	//  227  427:aload_0         
	//  228  428:iconst_1        
	//  229  429:putfield        #499 <Field boolean B>
					c(true);
	//  230  432:aload_0         
	//  231  433:iconst_1        
	//  232  434:invokespecial   #1007 <Method void c(boolean)>
					setScrollState(1);
	//  233  437:aload_0         
	//  234  438:iconst_1        
	//  235  439:invokevirtual   #715 <Method void setScrollState(int)>
				} else
	//* 236  442:goto            455
				{
					a(false);
	//  237  445:aload_0         
	//  238  446:iconst_0        
	//  239  447:invokespecial   #308 <Method void a(boolean)>
					B = false;
	//  240  450:aload_0         
	//  241  451:iconst_0        
	//  242  452:putfield        #499 <Field boolean B>
				}
			}
			if(L == null)
	//* 243  455:aload_0         
	//* 244  456:getfield        #351 <Field VelocityTracker L>
	//* 245  459:ifnonnull       469
				L = VelocityTracker.obtain();
	//  246  462:aload_0         
	//  247  463:invokestatic    #1023 <Method VelocityTracker VelocityTracker.obtain()>
	//  248  466:putfield        #351 <Field VelocityTracker L>
			L.addMovement(motionevent);
	//  249  469:aload_0         
	//  250  470:getfield        #351 <Field VelocityTracker L>
	//  251  473:aload_1         
	//  252  474:invokevirtual   #1026 <Method void VelocityTracker.addMovement(MotionEvent)>
			return B;
	//  253  477:aload_0         
	//  254  478:getfield        #499 <Field boolean B>
	//  255  481:ireturn         
		} else
		{
			h();
	//  256  482:aload_0         
	//  257  483:invokespecial   #1028 <Method boolean h()>
	//  258  486:pop             
			return false;
	//  259  487:iconst_0        
	//  260  488:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		int i4 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #404 <Method int getChildCount()>
	//    2    4:istore          14
		int j4 = k1 - i1;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		int k4 = l1 - j1;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          16
		j1 = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #284 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i1 = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #917 <Method int getPaddingTop()>
	//   16   27:istore_2        
		int k2 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #287 <Method int getPaddingRight()>
	//   19   32:istore          8
		l1 = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #920 <Method int getPaddingBottom()>
	//   22   38:istore          5
		int l4 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #290 <Method int getScrollX()>
	//   25   44:istore          17
		int l2 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          9
		for(int i3 = 0; i3 < i4;)
	//*  28   49:iconst_0        
	//*  29   50:istore          10
	//*  30   52:iload           10
	//*  31   54:iload           14
	//*  32   56:icmpge          402
		{
			View view = getChildAt(i3);
	//   33   59:aload_0         
	//   34   60:iload           10
	//   35   62:invokevirtual   #410 <Method View getChildAt(int)>
	//   36   65:astore          18
			int i2 = j1;
	//   37   67:iload_3         
	//   38   68:istore          7
			int l3 = k2;
	//   39   70:iload           8
	//   40   72:istore          13
			int k3 = i1;
	//   41   74:iload_2         
	//   42   75:istore          12
			int j3 = l1;
	//   43   77:iload           5
	//   44   79:istore          11
			k1 = l2;
	//   45   81:iload           9
	//   46   83:istore          4
			if(view.getVisibility() != 8)
	//*  47   85:aload           18
	//*  48   87:invokevirtual   #788 <Method int View.getVisibility()>
	//*  49   90:bipush          8
	//*  50   92:icmpeq          375
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   51   95:aload           18
	//   52   97:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #14  <Class ViewPager$LayoutParams>
	//   54  103:astore          19
				i2 = j1;
	//   55  105:iload_3         
	//   56  106:istore          7
				l3 = k2;
	//   57  108:iload           8
	//   58  110:istore          13
				k3 = i1;
	//   59  112:iload_2         
	//   60  113:istore          12
				j3 = l1;
	//   61  115:iload           5
	//   62  117:istore          11
				k1 = l2;
	//   63  119:iload           9
	//   64  121:istore          4
				if(layoutparams.a)
	//*  65  123:aload           19
	//*  66  125:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//*  67  128:ifeq            375
				{
					k1 = layoutparams.b & 7;
	//   68  131:aload           19
	//   69  133:getfield        #693 <Field int ViewPager$LayoutParams.b>
	//   70  136:bipush          7
	//   71  138:iand            
	//   72  139:istore          4
					j3 = layoutparams.b & 0x70;
	//   73  141:aload           19
	//   74  143:getfield        #693 <Field int ViewPager$LayoutParams.b>
	//   75  146:bipush          112
	//   76  148:iand            
	//   77  149:istore          11
					if(k1 != 1)
	//*  78  151:iload           4
	//*  79  153:iconst_1        
	//*  80  154:icmpeq          226
					{
						if(k1 != 3)
	//*  81  157:iload           4
	//*  82  159:iconst_3        
	//*  83  160:icmpeq          207
						{
							if(k1 != 5)
	//*  84  163:iload           4
	//*  85  165:iconst_5        
	//*  86  166:icmpeq          178
							{
								k1 = j1;
	//   87  169:iload_3         
	//   88  170:istore          4
								i2 = j1;
	//   89  172:iload_3         
	//   90  173:istore          7
							} else
	//*  91  175:goto            245
							{
								k1 = j4 - k2 - view.getMeasuredWidth();
	//   92  178:iload           15
	//   93  180:iload           8
	//   94  182:isub            
	//   95  183:aload           18
	//   96  185:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//   97  188:isub            
	//   98  189:istore          4
								k2 += view.getMeasuredWidth();
	//   99  191:iload           8
	//  100  193:aload           18
	//  101  195:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  102  198:iadd            
	//  103  199:istore          8
								i2 = j1;
	//  104  201:iload_3         
	//  105  202:istore          7
							}
						} else
	//* 106  204:goto            245
						{
							i2 = view.getMeasuredWidth();
	//  107  207:aload           18
	//  108  209:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  109  212:istore          7
							k1 = j1;
	//  110  214:iload_3         
	//  111  215:istore          4
							i2 += j1;
	//  112  217:iload           7
	//  113  219:iload_3         
	//  114  220:iadd            
	//  115  221:istore          7
						}
					} else
	//* 116  223:goto            245
					{
						k1 = Math.max((j4 - view.getMeasuredWidth()) / 2, j1);
	//  117  226:iload           15
	//  118  228:aload           18
	//  119  230:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  120  233:isub            
	//  121  234:iconst_2        
	//  122  235:idiv            
	//  123  236:iload_3         
	//  124  237:invokestatic    #220 <Method int Math.max(int, int)>
	//  125  240:istore          4
						i2 = j1;
	//  126  242:iload_3         
	//  127  243:istore          7
					}
					if(j3 != 16)
	//* 128  245:iload           11
	//* 129  247:bipush          16
	//* 130  249:icmpeq          313
					{
						if(j3 != 48)
	//* 131  252:iload           11
	//* 132  254:bipush          48
	//* 133  256:icmpeq          296
						{
							if(j3 != 80)
	//* 134  259:iload           11
	//* 135  261:bipush          80
	//* 136  263:icmpeq          271
							{
								j1 = i1;
	//  137  266:iload_2         
	//  138  267:istore_3        
							} else
	//* 139  268:goto            328
							{
								j1 = k4 - l1 - view.getMeasuredHeight();
	//  140  271:iload           16
	//  141  273:iload           5
	//  142  275:isub            
	//  143  276:aload           18
	//  144  278:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  145  281:isub            
	//  146  282:istore_3        
								l1 += view.getMeasuredHeight();
	//  147  283:iload           5
	//  148  285:aload           18
	//  149  287:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  150  290:iadd            
	//  151  291:istore          5
							}
						} else
	//* 152  293:goto            328
						{
							j3 = view.getMeasuredHeight();
	//  153  296:aload           18
	//  154  298:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  155  301:istore          11
							j1 = i1;
	//  156  303:iload_2         
	//  157  304:istore_3        
							i1 = j3 + i1;
	//  158  305:iload           11
	//  159  307:iload_2         
	//  160  308:iadd            
	//  161  309:istore_2        
						}
					} else
	//* 162  310:goto            328
					{
						j1 = Math.max((k4 - view.getMeasuredHeight()) / 2, i1);
	//  163  313:iload           16
	//  164  315:aload           18
	//  165  317:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  166  320:isub            
	//  167  321:iconst_2        
	//  168  322:idiv            
	//  169  323:iload_2         
	//  170  324:invokestatic    #220 <Method int Math.max(int, int)>
	//  171  327:istore_3        
					}
					k1 += l4;
	//  172  328:iload           4
	//  173  330:iload           17
	//  174  332:iadd            
	//  175  333:istore          4
					view.layout(k1, j1, view.getMeasuredWidth() + k1, j1 + view.getMeasuredHeight());
	//  176  335:aload           18
	//  177  337:iload           4
	//  178  339:iload_3         
	//  179  340:aload           18
	//  180  342:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  181  345:iload           4
	//  182  347:iadd            
	//  183  348:iload_3         
	//  184  349:aload           18
	//  185  351:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  186  354:iadd            
	//  187  355:invokevirtual   #1036 <Method void View.layout(int, int, int, int)>
					k1 = l2 + 1;
	//  188  358:iload           9
	//  189  360:iconst_1        
	//  190  361:iadd            
	//  191  362:istore          4
					j3 = l1;
	//  192  364:iload           5
	//  193  366:istore          11
					k3 = i1;
	//  194  368:iload_2         
	//  195  369:istore          12
					l3 = k2;
	//  196  371:iload           8
	//  197  373:istore          13
				}
			}
			i3++;
	//  198  375:iload           10
	//  199  377:iconst_1        
	//  200  378:iadd            
	//  201  379:istore          10
			j1 = i2;
	//  202  381:iload           7
	//  203  383:istore_3        
			k2 = l3;
	//  204  384:iload           13
	//  205  386:istore          8
			i1 = k3;
	//  206  388:iload           12
	//  207  390:istore_2        
			l1 = j3;
	//  208  391:iload           11
	//  209  393:istore          5
			l2 = k1;
	//  210  395:iload           4
	//  211  397:istore          9
		}

	//* 212  399:goto            52
		for(k1 = 0; k1 < i4; k1++)
	//* 213  402:iconst_0        
	//* 214  403:istore          4
	//* 215  405:iload           4
	//* 216  407:iload           14
	//* 217  409:icmpge          563
		{
			View view1 = getChildAt(k1);
	//  218  412:aload_0         
	//  219  413:iload           4
	//  220  415:invokevirtual   #410 <Method View getChildAt(int)>
	//  221  418:astore          18
			if(view1.getVisibility() == 8)
				continue;
	//  222  420:aload           18
	//  223  422:invokevirtual   #788 <Method int View.getVisibility()>
	//  224  425:bipush          8
	//  225  427:icmpeq          554
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  226  430:aload           18
	//  227  432:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  228  435:checkcast       #14  <Class ViewPager$LayoutParams>
	//  229  438:astore          19
			if(layoutparams1.a)
				continue;
	//  230  440:aload           19
	//  231  442:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//  232  445:ifne            554
			b b1 = a(view1);
	//  233  448:aload_0         
	//  234  449:aload           18
	//  235  451:invokevirtual   #676 <Method ViewPager$b a(View)>
	//  236  454:astore          20
			if(b1 == null)
				continue;
	//  237  456:aload           20
	//  238  458:ifnull          554
			float f1 = j4 - j1 - k2;
	//  239  461:iload           15
	//  240  463:iload_3         
	//  241  464:isub            
	//  242  465:iload           8
	//  243  467:isub            
	//  244  468:i2f             
	//  245  469:fstore          6
			int j2 = (int)(b1.e * f1) + j1;
	//  246  471:aload           20
	//  247  473:getfield        #302 <Field float ViewPager$b.e>
	//  248  476:fload           6
	//  249  478:fmul            
	//  250  479:f2i             
	//  251  480:iload_3         
	//  252  481:iadd            
	//  253  482:istore          7
			if(layoutparams1.d)
	//* 254  484:aload           19
	//* 255  486:getfield        #824 <Field boolean ViewPager$LayoutParams.d>
	//* 256  489:ifeq            531
			{
				layoutparams1.d = false;
	//  257  492:aload           19
	//  258  494:iconst_0        
	//  259  495:putfield        #824 <Field boolean ViewPager$LayoutParams.d>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(f1 * layoutparams1.c), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k4 - i1 - l1, 0x40000000));
	//  260  498:aload           18
	//  261  500:fload           6
	//  262  502:aload           19
	//  263  504:getfield        #674 <Field float ViewPager$LayoutParams.c>
	//  264  507:fmul            
	//  265  508:f2i             
	//  266  509:ldc2            #1037 <Int 0x40000000>
	//  267  512:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  268  515:iload           16
	//  269  517:iload_2         
	//  270  518:isub            
	//  271  519:iload           5
	//  272  521:isub            
	//  273  522:ldc2            #1037 <Int 0x40000000>
	//  274  525:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  528:invokevirtual   #1045 <Method void View.measure(int, int)>
			}
			view1.layout(j2, i1, view1.getMeasuredWidth() + j2, view1.getMeasuredHeight() + i1);
	//  276  531:aload           18
	//  277  533:iload           7
	//  278  535:iload_2         
	//  279  536:aload           18
	//  280  538:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  281  541:iload           7
	//  282  543:iadd            
	//  283  544:aload           18
	//  284  546:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  285  549:iload_2         
	//  286  550:iadd            
	//  287  551:invokevirtual   #1036 <Method void View.layout(int, int, int, int)>
		}

	//  288  554:iload           4
	//  289  556:iconst_1        
	//  290  557:iadd            
	//  291  558:istore          4
	//* 292  560:goto            405
		r = i1;
	//  293  563:aload_0         
	//  294  564:iload_2         
	//  295  565:putfield        #982 <Field int r>
		s = k4 - l1;
	//  296  568:aload_0         
	//  297  569:iload           16
	//  298  571:iload           5
	//  299  573:isub            
	//  300  574:putfield        #984 <Field int s>
		W = l2;
	//  301  577:aload_0         
	//  302  578:iload           9
	//  303  580:putfield        #692 <Field int W>
		if(T)
	//* 304  583:aload_0         
	//* 305  584:getfield        #174 <Field boolean T>
	//* 306  587:ifeq            604
			a(c, false, 0, false);
	//  307  590:aload_0         
	//  308  591:aload_0         
	//  309  592:getfield        #201 <Field int c>
	//  310  595:iconst_0        
	//  311  596:iconst_0        
	//  312  597:iconst_0        
	//  313  598:invokespecial   #743 <Method void a(int, boolean, int, boolean)>
	//* 314  601:goto            604
		T = false;
	//  315  604:aload_0         
	//  316  605:iconst_0        
	//  317  606:putfield        #174 <Field boolean T>
	//  318  609:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int l2;
		int j4;
		setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1049 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1049 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1052 <Method void setMeasuredDimension(int, int)>
		i1 = getMeasuredWidth();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #491 <Method int getMeasuredWidth()>
	//   10   18:istore_1        
		E = Math.min(i1 / 10, D);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:idiv            
	//   15   24:aload_0         
	//   16   25:getfield        #585 <Field int D>
	//   17   28:invokestatic    #217 <Method int Math.min(int, int)>
	//   18   31:putfield        #385 <Field int E>
		int k1 = getPaddingLeft();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #284 <Method int getPaddingLeft()>
	//   21   38:istore_3        
		int j2 = getPaddingRight();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #287 <Method int getPaddingRight()>
	//   24   43:istore          4
		j1 = getMeasuredHeight();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #1053 <Method int getMeasuredHeight()>
	//   27   49:istore_2        
		l2 = getPaddingTop();
	//   28   50:aload_0         
	//   29   51:invokevirtual   #917 <Method int getPaddingTop()>
	//   30   54:istore          5
		int i3 = getPaddingBottom();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #920 <Method int getPaddingBottom()>
	//   33   60:istore          6
		j4 = getChildCount();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #404 <Method int getChildCount()>
	//   36   66:istore          11
		j1 = j1 - l2 - i3;
	//   37   68:iload_2         
	//   38   69:iload           5
	//   39   71:isub            
	//   40   72:iload           6
	//   41   74:isub            
	//   42   75:istore_2        
		i1 = i1 - k1 - j2;
	//   43   76:iload_1         
	//   44   77:iload_3         
	//   45   78:isub            
	//   46   79:iload           4
	//   47   81:isub            
	//   48   82:istore_1        
		l2 = 0;
	//   49   83:iconst_0        
	//   50   84:istore          5
_L6:
		int l1;
		int k2;
		boolean flag;
		boolean flag1;
		int j3;
		int i4;
		View view;
		LayoutParams layoutparams;
		j3 = 1;
	//   51   86:iconst_1        
	//   52   87:istore          8
		i4 = 0x40000000;
	//   53   89:ldc2            #1037 <Int 0x40000000>
	//   54   92:istore          10
		if(l2 >= j4)
			break; /* Loop/switch isn't completed */
	//   55   94:iload           5
	//   56   96:iload           11
	//   57   98:icmpge          430
		view = getChildAt(l2);
	//   58  101:aload_0         
	//   59  102:iload           5
	//   60  104:invokevirtual   #410 <Method View getChildAt(int)>
	//   61  107:astore          12
		l1 = i1;
	//   62  109:iload_1         
	//   63  110:istore_3        
		k2 = j1;
	//   64  111:iload_2         
	//   65  112:istore          4
		if(view.getVisibility() == 8)
			break MISSING_BLOCK_LABEL_416;
	//   66  114:aload           12
	//   67  116:invokevirtual   #788 <Method int View.getVisibility()>
	//   68  119:bipush          8
	//   69  121:icmpeq          416
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   70  124:aload           12
	//   71  126:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  129:checkcast       #14  <Class ViewPager$LayoutParams>
	//   73  132:astore          13
		l1 = i1;
	//   74  134:iload_1         
	//   75  135:istore_3        
		k2 = j1;
	//   76  136:iload_2         
	//   77  137:istore          4
		if(layoutparams == null)
			break MISSING_BLOCK_LABEL_416;
	//   78  139:aload           13
	//   79  141:ifnull          416
		l1 = i1;
	//   80  144:iload_1         
	//   81  145:istore_3        
		k2 = j1;
	//   82  146:iload_2         
	//   83  147:istore          4
		if(!layoutparams.a)
			break MISSING_BLOCK_LABEL_416;
	//   84  149:aload           13
	//   85  151:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//   86  154:ifeq            416
		l1 = layoutparams.b & 7;
	//   87  157:aload           13
	//   88  159:getfield        #693 <Field int ViewPager$LayoutParams.b>
	//   89  162:bipush          7
	//   90  164:iand            
	//   91  165:istore_3        
		k2 = layoutparams.b & 0x70;
	//   92  166:aload           13
	//   93  168:getfield        #693 <Field int ViewPager$LayoutParams.b>
	//   94  171:bipush          112
	//   95  173:iand            
	//   96  174:istore          4
		if(k2 != 48 && k2 != 80)
	//*  97  176:iload           4
	//*  98  178:bipush          48
	//*  99  180:icmpeq          199
	//* 100  183:iload           4
	//* 101  185:bipush          80
	//* 102  187:icmpne          193
	//* 103  190:goto            199
			flag1 = false;
	//  104  193:iconst_0        
	//  105  194:istore          7
		else
	//* 106  196:goto            202
			flag1 = true;
	//  107  199:iconst_1        
	//  108  200:istore          7
		flag = ((boolean) (j3));
	//  109  202:iload           8
	//  110  204:istore          6
		if(l1 != 3)
	//* 111  206:iload_3         
	//* 112  207:iconst_3        
	//* 113  208:icmpeq          226
			if(l1 == 5)
	//* 114  211:iload_3         
	//* 115  212:iconst_5        
	//* 116  213:icmpne          223
				flag = ((boolean) (j3));
	//  117  216:iload           8
	//  118  218:istore          6
			else
	//* 119  220:goto            226
				flag = false;
	//  120  223:iconst_0        
	//  121  224:istore          6
		j3 = 0x80000000;
	//  122  226:ldc2            #1054 <Int 0x80000000>
	//  123  229:istore          8
		if(!flag1) goto _L2; else goto _L1
	//  124  231:iload           7
	//  125  233:ifeq            248
_L1:
		k2 = 0x40000000;
	//  126  236:ldc2            #1037 <Int 0x40000000>
	//  127  239:istore          4
_L4:
		l1 = 0x80000000;
	//  128  241:ldc2            #1054 <Int 0x80000000>
	//  129  244:istore_3        
		break; /* Loop/switch isn't completed */
	//  130  245:goto            265
_L2:
		k2 = j3;
	//  131  248:iload           8
	//  132  250:istore          4
		if(!flag)
			continue; /* Loop/switch isn't completed */
	//  133  252:iload           6
	//  134  254:ifeq            241
		l1 = 0x40000000;
	//  135  257:ldc2            #1037 <Int 0x40000000>
	//  136  260:istore_3        
		k2 = j3;
	//  137  261:iload           8
	//  138  263:istore          4
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
		int k3;
		int l3;
		if(layoutparams.width != -2)
	//* 139  265:aload           13
	//* 140  267:getfield        #1057 <Field int ViewPager$LayoutParams.width>
	//* 141  270:bipush          -2
	//* 142  272:icmpeq          309
		{
			if(layoutparams.width != -1)
	//* 143  275:aload           13
	//* 144  277:getfield        #1057 <Field int ViewPager$LayoutParams.width>
	//* 145  280:iconst_m1       
	//* 146  281:icmpeq          294
				k2 = layoutparams.width;
	//  147  284:aload           13
	//  148  286:getfield        #1057 <Field int ViewPager$LayoutParams.width>
	//  149  289:istore          4
			else
	//* 150  291:goto            297
				k2 = i1;
	//  151  294:iload_1         
	//  152  295:istore          4
			k3 = 0x40000000;
	//  153  297:ldc2            #1037 <Int 0x40000000>
	//  154  300:istore          8
			l3 = k2;
	//  155  302:iload           4
	//  156  304:istore          9
		} else
	//* 157  306:goto            316
		{
			l3 = i1;
	//  158  309:iload_1         
	//  159  310:istore          9
			k3 = k2;
	//  160  312:iload           4
	//  161  314:istore          8
		}
		if(layoutparams.height != -2)
	//* 162  316:aload           13
	//* 163  318:getfield        #1060 <Field int ViewPager$LayoutParams.height>
	//* 164  321:bipush          -2
	//* 165  323:icmpeq          349
		{
			if(layoutparams.height != -1)
	//* 166  326:aload           13
	//* 167  328:getfield        #1060 <Field int ViewPager$LayoutParams.height>
	//* 168  331:iconst_m1       
	//* 169  332:icmpeq          344
				l1 = layoutparams.height;
	//  170  335:aload           13
	//  171  337:getfield        #1060 <Field int ViewPager$LayoutParams.height>
	//  172  340:istore_3        
			else
	//* 173  341:goto            358
				l1 = j1;
	//  174  344:iload_2         
	//  175  345:istore_3        
		} else
	//* 176  346:goto            358
		{
			k2 = j1;
	//  177  349:iload_2         
	//  178  350:istore          4
			i4 = l1;
	//  179  352:iload_3         
	//  180  353:istore          10
			l1 = k2;
	//  181  355:iload           4
	//  182  357:istore_3        
		}
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l3, k3), android.view.View.MeasureSpec.makeMeasureSpec(l1, i4));
	//  183  358:aload           12
	//  184  360:iload           9
	//  185  362:iload           8
	//  186  364:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  187  367:iload_3         
	//  188  368:iload           10
	//  189  370:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  190  373:invokevirtual   #1045 <Method void View.measure(int, int)>
		if(flag1)
	//* 191  376:iload           7
	//* 192  378:ifeq            395
		{
			k2 = j1 - view.getMeasuredHeight();
	//  193  381:iload_2         
	//  194  382:aload           12
	//  195  384:invokevirtual   #1033 <Method int View.getMeasuredHeight()>
	//  196  387:isub            
	//  197  388:istore          4
			l1 = i1;
	//  198  390:iload_1         
	//  199  391:istore_3        
		} else
	//* 200  392:goto            416
		{
			l1 = i1;
	//  201  395:iload_1         
	//  202  396:istore_3        
			k2 = j1;
	//  203  397:iload_2         
	//  204  398:istore          4
			if(flag)
	//* 205  400:iload           6
	//* 206  402:ifeq            416
			{
				l1 = i1 - view.getMeasuredWidth();
	//  207  405:iload_1         
	//  208  406:aload           12
	//  209  408:invokevirtual   #694 <Method int View.getMeasuredWidth()>
	//  210  411:isub            
	//  211  412:istore_3        
				k2 = j1;
	//  212  413:iload_2         
	//  213  414:istore          4
			}
		}
		l2++;
	//  214  416:iload           5
	//  215  418:iconst_1        
	//  216  419:iadd            
	//  217  420:istore          5
		i1 = l1;
	//  218  422:iload_3         
	//  219  423:istore_1        
		j1 = k2;
	//  220  424:iload           4
	//  221  426:istore_2        
		if(true) goto _L6; else goto _L5
	//  222  427:goto            86
_L5:
		v = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  223  430:aload_0         
	//  224  431:iload_1         
	//  225  432:ldc2            #1037 <Int 0x40000000>
	//  226  435:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  227  438:putfield        #1062 <Field int v>
		w = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  228  441:aload_0         
	//  229  442:iload_2         
	//  230  443:ldc2            #1037 <Int 0x40000000>
	//  231  446:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  232  449:putfield        #1064 <Field int w>
		x = true;
	//  233  452:aload_0         
	//  234  453:iconst_1        
	//  235  454:putfield        #820 <Field boolean x>
		c();
	//  236  457:aload_0         
	//  237  458:invokevirtual   #712 <Method void c()>
		j1 = 0;
	//  238  461:iconst_0        
	//  239  462:istore_2        
		x = false;
	//  240  463:aload_0         
	//  241  464:iconst_0        
	//  242  465:putfield        #820 <Field boolean x>
		for(int i2 = getChildCount(); j1 < i2; j1++)
	//* 243  468:aload_0         
	//* 244  469:invokevirtual   #404 <Method int getChildCount()>
	//* 245  472:istore_3        
	//* 246  473:iload_2         
	//* 247  474:iload_3         
	//* 248  475:icmpge          549
		{
			View view1 = getChildAt(j1);
	//  249  478:aload_0         
	//  250  479:iload_2         
	//  251  480:invokevirtual   #410 <Method View getChildAt(int)>
	//  252  483:astore          12
			if(view1.getVisibility() == 8)
				continue;
	//  253  485:aload           12
	//  254  487:invokevirtual   #788 <Method int View.getVisibility()>
	//  255  490:bipush          8
	//  256  492:icmpeq          542
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  257  495:aload           12
	//  258  497:invokevirtual   #466 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  259  500:checkcast       #14  <Class ViewPager$LayoutParams>
	//  260  503:astore          13
			if(layoutparams1 == null || !layoutparams1.a)
	//* 261  505:aload           13
	//* 262  507:ifnull          518
	//* 263  510:aload           13
	//* 264  512:getfield        #468 <Field boolean android.support.v4.view.ViewPager$LayoutParams.a>
	//* 265  515:ifne            542
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i1 * layoutparams1.c), 0x40000000), w);
	//  266  518:aload           12
	//  267  520:iload_1         
	//  268  521:i2f             
	//  269  522:aload           13
	//  270  524:getfield        #674 <Field float ViewPager$LayoutParams.c>
	//  271  527:fmul            
	//  272  528:f2i             
	//  273  529:ldc2            #1037 <Int 0x40000000>
	//  274  532:invokestatic    #1042 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  535:aload_0         
	//  276  536:getfield        #1064 <Field int w>
	//  277  539:invokevirtual   #1045 <Method void View.measure(int, int)>
		}

	//  278  542:iload_2         
	//  279  543:iconst_1        
	//  280  544:iadd            
	//  281  545:istore_2        
	//* 282  546:goto            473
		return;
	//  283  549:return          
	}

	protected boolean onRequestFocusInDescendants(int i1, Rect rect)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #404 <Method int getChildCount()>
	//    2    4:istore_3        
		int k1 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore          5
		byte byte0;
		if((i1 & 2) != 0)
	//*   5    8:iload_1         
	//*   6    9:iconst_2        
	//*   7   10:iand            
	//*   8   11:ifeq            25
		{
			k1 = j1;
	//    9   14:iload_3         
	//   10   15:istore          5
			j1 = 0;
	//   11   17:iconst_0        
	//   12   18:istore_3        
			byte0 = 1;
	//   13   19:iconst_1        
	//   14   20:istore          4
		} else
	//*  15   22:goto            32
		{
			j1--;
	//   16   25:iload_3         
	//   17   26:iconst_1        
	//   18   27:isub            
	//   19   28:istore_3        
			byte0 = -1;
	//   20   29:iconst_m1       
	//   21   30:istore          4
		}
		for(; j1 != k1; j1 += ((int) (byte0)))
	//*  22   32:iload_3         
	//*  23   33:iload           5
	//*  24   35:icmpeq          98
		{
			View view = getChildAt(j1);
	//   25   38:aload_0         
	//   26   39:iload_3         
	//   27   40:invokevirtual   #410 <Method View getChildAt(int)>
	//   28   43:astore          6
			if(view.getVisibility() != 0)
				continue;
	//   29   45:aload           6
	//   30   47:invokevirtual   #788 <Method int View.getVisibility()>
	//   31   50:ifne            90
			b b1 = a(view);
	//   32   53:aload_0         
	//   33   54:aload           6
	//   34   56:invokevirtual   #676 <Method ViewPager$b a(View)>
	//   35   59:astore          7
			if(b1 != null && b1.b == c && view.requestFocus(i1, rect))
	//*  36   61:aload           7
	//*  37   63:ifnull          90
	//*  38   66:aload           7
	//*  39   68:getfield        #213 <Field int ViewPager$b.b>
	//*  40   71:aload_0         
	//*  41   72:getfield        #201 <Field int c>
	//*  42   75:icmpne          90
	//*  43   78:aload           6
	//*  44   80:iload_1         
	//*  45   81:aload_2         
	//*  46   82:invokevirtual   #1068 <Method boolean View.requestFocus(int, Rect)>
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
	//*   1    1:instanceof      #17  <Class ViewPager$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1072 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #17  <Class ViewPager$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1075 <Method Parcelable android.support.v4.view.ViewPager$SavedState.a()>
	//   13   23:invokespecial   #1072 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(b != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #322 <Field p b>
	//*  16   30:ifnull          59
		{
			b.restoreState(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
	//   17   33:aload_0         
	//   18   34:getfield        #322 <Field p b>
	//   19   37:aload_1         
	//   20   38:getfield        #1077 <Field Parcelable ViewPager$SavedState.b>
	//   21   41:aload_1         
	//   22   42:getfield        #1079 <Field ClassLoader ViewPager$SavedState.c>
	//   23   45:invokevirtual   #1083 <Method void p.restoreState(Parcelable, ClassLoader)>
			a(((SavedState) (parcelable)).a, false, true);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #1085 <Field int android.support.v4.view.ViewPager$SavedState.a>
	//   27   53:iconst_0        
	//   28   54:iconst_1        
	//   29   55:invokevirtual   #734 <Method void a(int, boolean, boolean)>
			return;
	//   30   58:return          
		} else
		{
			j = ((SavedState) (parcelable)).a;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #1085 <Field int android.support.v4.view.ViewPager$SavedState.a>
	//   34   64:putfield        #158 <Field int j>
			k = ((SavedState) (parcelable)).b;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:getfield        #1077 <Field Parcelable ViewPager$SavedState.b>
	//   38   72:putfield        #160 <Field Parcelable k>
			l = ((SavedState) (parcelable)).c;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:getfield        #1079 <Field ClassLoader ViewPager$SavedState.c>
	//   42   80:putfield        #162 <Field ClassLoader l>
			return;
	//   43   83:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #17  <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1088 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1090 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = c;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #201 <Field int c>
	//    9   17:putfield        #1085 <Field int android.support.v4.view.ViewPager$SavedState.a>
		if(b != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #322 <Field p b>
	//*  12   24:ifnull          38
			savedstate.b = b.saveState();
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #322 <Field p b>
	//   16   32:invokevirtual   #1093 <Method Parcelable p.saveState()>
	//   17   35:putfield        #1077 <Field Parcelable ViewPager$SavedState.b>
		return ((Parcelable) (savedstate));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #1096 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i1 != k1)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          28
			a(i1, k1, p, p);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iload_3         
	//   12   17:aload_0         
	//   13   18:getfield        #329 <Field int p>
	//   14   21:aload_0         
	//   15   22:getfield        #329 <Field int p>
	//   16   25:invokespecial   #1098 <Method void a(int, int, int, int)>
	//   17   28:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag;
		if(Q)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1101 <Field boolean Q>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int i1 = motionevent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #991 <Method int MotionEvent.getAction()>
	//    7   13:istore          6
		flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          9
		if(i1 == 0 && motionevent.getEdgeFlags() != 0)
	//*  10   18:iload           6
	//*  11   20:ifne            32
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #1104 <Method int MotionEvent.getEdgeFlags()>
	//*  14   27:ifeq            32
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		if(b == null)
			break MISSING_BLOCK_LABEL_605;
	//   17   32:aload_0         
	//   18   33:getfield        #322 <Field p b>
	//   19   36:ifnull          605
		if(b.getCount() == 0)
	//*  20   39:aload_0         
	//*  21   40:getfield        #322 <Field p b>
	//*  22   43:invokevirtual   #327 <Method int p.getCount()>
	//*  23   46:ifne            51
			return false;
	//   24   49:iconst_0        
	//   25   50:ireturn         
		if(L == null)
	//*  26   51:aload_0         
	//*  27   52:getfield        #351 <Field VelocityTracker L>
	//*  28   55:ifnonnull       65
			L = VelocityTracker.obtain();
	//   29   58:aload_0         
	//   30   59:invokestatic    #1023 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   62:putfield        #351 <Field VelocityTracker L>
		L.addMovement(motionevent);
	//   32   65:aload_0         
	//   33   66:getfield        #351 <Field VelocityTracker L>
	//   34   69:aload_1         
	//   35   70:invokevirtual   #1026 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent.getAction() & 0xff;
	//   36   73:aload_1         
	//   37   74:invokevirtual   #991 <Method int MotionEvent.getAction()>
	//   38   77:sipush          255
	//   39   80:iand            
		JVM INSTR tableswitch 0 6: default 124
	//	               0 535
	//	               1 395
	//	               2 199
	//	               3 178
	//	               4 124
	//	               5 151
	//	               6 127;
	//   40   81:tableswitch     0 6: default 124
	//	               0 535
	//	               1 395
	//	               2 199
	//	               3 178
	//	               4 124
	//	               5 151
	//	               6 127
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
		break MISSING_BLOCK_LABEL_594;
	//   41  124:goto            594
_L7:
		a(motionevent);
	//   42  127:aload_0         
	//   43  128:aload_1         
	//   44  129:invokespecial   #993 <Method void a(MotionEvent)>
		G = motionevent.getX(motionevent.findPointerIndex(K));
	//   45  132:aload_0         
	//   46  133:aload_1         
	//   47  134:aload_1         
	//   48  135:aload_0         
	//   49  136:getfield        #172 <Field int K>
	//   50  139:invokevirtual   #996 <Method int MotionEvent.findPointerIndex(int)>
	//   51  142:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//   52  145:putfield        #349 <Field float G>
		break MISSING_BLOCK_LABEL_594;
	//   53  148:goto            594
_L6:
		int j1;
		j1 = motionevent.getActionIndex();
	//   54  151:aload_1         
	//   55  152:invokevirtual   #341 <Method int MotionEvent.getActionIndex()>
	//   56  155:istore          6
		G = motionevent.getX(j1);
	//   57  157:aload_0         
	//   58  158:aload_1         
	//   59  159:iload           6
	//   60  161:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//   61  164:putfield        #349 <Field float G>
		j1 = motionevent.getPointerId(j1);
	//   62  167:aload_1         
	//   63  168:iload           6
	//   64  170:invokevirtual   #344 <Method int MotionEvent.getPointerId(int)>
	//   65  173:istore          6
		break; /* Loop/switch isn't completed */
	//   66  175:goto            588
_L5:
		if(!B)
			break MISSING_BLOCK_LABEL_594;
	//   67  178:aload_0         
	//   68  179:getfield        #499 <Field boolean B>
	//   69  182:ifeq            594
		a(c, true, 0, false);
	//   70  185:aload_0         
	//   71  186:aload_0         
	//   72  187:getfield        #201 <Field int c>
	//   73  190:iconst_1        
	//   74  191:iconst_0        
	//   75  192:iconst_0        
	//   76  193:invokespecial   #743 <Method void a(int, boolean, int, boolean)>
		  goto _L8
	//*  77  196:goto            526
_L4:
		if(B) goto _L10; else goto _L9
	//   78  199:aload_0         
	//   79  200:getfield        #499 <Field boolean B>
	//   80  203:ifne            365
_L9:
		j1 = motionevent.findPointerIndex(K);
	//   81  206:aload_1         
	//   82  207:aload_0         
	//   83  208:getfield        #172 <Field int K>
	//   84  211:invokevirtual   #996 <Method int MotionEvent.findPointerIndex(int)>
	//   85  214:istore          6
		if(j1 != -1) goto _L11; else goto _L8
	//   86  216:iload           6
	//   87  218:iconst_m1       
	//   88  219:icmpne          225
	//*  89  222:goto            526
_L11:
		float f1 = motionevent.getX(j1);
	//   90  225:aload_1         
	//   91  226:iload           6
	//   92  228:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//   93  231:fstore_2        
		float f6 = Math.abs(f1 - G);
	//   94  232:fload_2         
	//   95  233:aload_0         
	//   96  234:getfield        #349 <Field float G>
	//   97  237:fsub            
	//   98  238:invokestatic    #420 <Method float Math.abs(float)>
	//   99  241:fstore          4
		float f4 = motionevent.getY(j1);
	//  100  243:aload_1         
	//  101  244:iload           6
	//  102  246:invokevirtual   #999 <Method float MotionEvent.getY(int)>
	//  103  249:fstore_3        
		float f7 = Math.abs(f4 - H);
	//  104  250:fload_3         
	//  105  251:aload_0         
	//  106  252:getfield        #1005 <Field float H>
	//  107  255:fsub            
	//  108  256:invokestatic    #420 <Method float Math.abs(float)>
	//  109  259:fstore          5
		if(f6 > (float)F && f6 > f7)
	//* 110  261:fload           4
	//* 111  263:aload_0         
	//* 112  264:getfield        #572 <Field int F>
	//* 113  267:i2f             
	//* 114  268:fcmpl           
	//* 115  269:ifle            365
	//* 116  272:fload           4
	//* 117  274:fload           5
	//* 118  276:fcmpl           
	//* 119  277:ifle            365
		{
			B = true;
	//  120  280:aload_0         
	//  121  281:iconst_1        
	//  122  282:putfield        #499 <Field boolean B>
			c(true);
	//  123  285:aload_0         
	//  124  286:iconst_1        
	//  125  287:invokespecial   #1007 <Method void c(boolean)>
			if(f1 - I > 0.0F)
	//* 126  290:fload_2         
	//* 127  291:aload_0         
	//* 128  292:getfield        #1009 <Field float I>
	//* 129  295:fsub            
	//* 130  296:fconst_0        
	//* 131  297:fcmpl           
	//* 132  298:ifle            315
				f1 = I + (float)F;
	//  133  301:aload_0         
	//  134  302:getfield        #1009 <Field float I>
	//  135  305:aload_0         
	//  136  306:getfield        #572 <Field int F>
	//  137  309:i2f             
	//  138  310:fadd            
	//  139  311:fstore_2        
			else
	//* 140  312:goto            326
				f1 = I - (float)F;
	//  141  315:aload_0         
	//  142  316:getfield        #1009 <Field float I>
	//  143  319:aload_0         
	//  144  320:getfield        #572 <Field int F>
	//  145  323:i2f             
	//  146  324:fsub            
	//  147  325:fstore_2        
			G = f1;
	//  148  326:aload_0         
	//  149  327:fload_2         
	//  150  328:putfield        #349 <Field float G>
			H = f4;
	//  151  331:aload_0         
	//  152  332:fload_3         
	//  153  333:putfield        #1005 <Field float H>
			setScrollState(1);
	//  154  336:aload_0         
	//  155  337:iconst_1        
	//  156  338:invokevirtual   #715 <Method void setScrollState(int)>
			setScrollingCacheEnabled(true);
	//  157  341:aload_0         
	//  158  342:iconst_1        
	//  159  343:invokespecial   #359 <Method void setScrollingCacheEnabled(boolean)>
			ViewParent viewparent = getParent();
	//  160  346:aload_0         
	//  161  347:invokevirtual   #429 <Method ViewParent getParent()>
	//  162  350:astore          10
			if(viewparent != null)
	//* 163  352:aload           10
	//* 164  354:ifnull          365
				viewparent.requestDisallowInterceptTouchEvent(true);
	//  165  357:aload           10
	//  166  359:iconst_1        
	//  167  360:invokeinterface #434 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		}
_L10:
		if(B)
	//* 168  365:aload_0         
	//* 169  366:getfield        #499 <Field boolean B>
	//* 170  369:ifeq            594
			flag = false | b(motionevent.getX(motionevent.findPointerIndex(K)));
	//  171  372:iconst_0        
	//  172  373:aload_0         
	//  173  374:aload_1         
	//  174  375:aload_1         
	//  175  376:aload_0         
	//  176  377:getfield        #172 <Field int K>
	//  177  380:invokevirtual   #996 <Method int MotionEvent.findPointerIndex(int)>
	//  178  383:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//  179  386:invokespecial   #1011 <Method boolean b(float)>
	//  180  389:ior             
	//  181  390:istore          9
		break MISSING_BLOCK_LABEL_594;
	//  182  392:goto            594
_L3:
		if(!B)
			break MISSING_BLOCK_LABEL_594;
	//  183  395:aload_0         
	//  184  396:getfield        #499 <Field boolean B>
	//  185  399:ifeq            594
		Object obj = ((Object) (L));
	//  186  402:aload_0         
	//  187  403:getfield        #351 <Field VelocityTracker L>
	//  188  406:astore          10
		((VelocityTracker) (obj)).computeCurrentVelocity(1000, N);
	//  189  408:aload           10
	//  190  410:sipush          1000
	//  191  413:aload_0         
	//  192  414:getfield        #578 <Field int N>
	//  193  417:i2f             
	//  194  418:invokevirtual   #1108 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		j1 = (int)((VelocityTracker) (obj)).getXVelocity(K);
	//  195  421:aload           10
	//  196  423:aload_0         
	//  197  424:getfield        #172 <Field int K>
	//  198  427:invokevirtual   #1111 <Method float VelocityTracker.getXVelocity(int)>
	//  199  430:f2i             
	//  200  431:istore          6
		z = true;
	//  201  433:aload_0         
	//  202  434:iconst_1        
	//  203  435:putfield        #370 <Field boolean z>
		int k1 = getClientWidth();
	//  204  438:aload_0         
	//  205  439:invokespecial   #277 <Method int getClientWidth()>
	//  206  442:istore          7
		int l1 = getScrollX();
	//  207  444:aload_0         
	//  208  445:invokevirtual   #290 <Method int getScrollX()>
	//  209  448:istore          8
		obj = ((Object) (i()));
	//  210  450:aload_0         
	//  211  451:invokespecial   #460 <Method ViewPager$b i()>
	//  212  454:astore          10
		float f5 = p;
	//  213  456:aload_0         
	//  214  457:getfield        #329 <Field int p>
	//  215  460:i2f             
	//  216  461:fstore_3        
		float f2 = k1;
	//  217  462:iload           7
	//  218  464:i2f             
	//  219  465:fstore_2        
		f5 /= f2;
	//  220  466:fload_3         
	//  221  467:fload_2         
	//  222  468:fdiv            
	//  223  469:fstore_3        
		a(a(((b) (obj)).b, ((float)l1 / f2 - ((b) (obj)).e) / (((b) (obj)).d + f5), j1, (int)(motionevent.getX(motionevent.findPointerIndex(K)) - I)), true, true, j1);
	//  224  470:aload_0         
	//  225  471:aload_0         
	//  226  472:aload           10
	//  227  474:getfield        #213 <Field int ViewPager$b.b>
	//  228  477:iload           8
	//  229  479:i2f             
	//  230  480:fload_2         
	//  231  481:fdiv            
	//  232  482:aload           10
	//  233  484:getfield        #302 <Field float ViewPager$b.e>
	//  234  487:fsub            
	//  235  488:aload           10
	//  236  490:getfield        #331 <Field float ViewPager$b.d>
	//  237  493:fload_3         
	//  238  494:fadd            
	//  239  495:fdiv            
	//  240  496:iload           6
	//  241  498:aload_1         
	//  242  499:aload_1         
	//  243  500:aload_0         
	//  244  501:getfield        #172 <Field int K>
	//  245  504:invokevirtual   #996 <Method int MotionEvent.findPointerIndex(int)>
	//  246  507:invokevirtual   #347 <Method float MotionEvent.getX(int)>
	//  247  510:aload_0         
	//  248  511:getfield        #1009 <Field float I>
	//  249  514:fsub            
	//  250  515:f2i             
	//  251  516:invokespecial   #1113 <Method int a(int, float, int, int)>
	//  252  519:iconst_1        
	//  253  520:iconst_1        
	//  254  521:iload           6
	//  255  523:invokevirtual   #737 <Method void a(int, boolean, boolean, int)>
_L8:
		flag = h();
	//  256  526:aload_0         
	//  257  527:invokespecial   #1028 <Method boolean h()>
	//  258  530:istore          9
		break MISSING_BLOCK_LABEL_594;
	//  259  532:goto            594
_L2:
		m.abortAnimation();
	//  260  535:aload_0         
	//  261  536:getfield        #266 <Field Scroller m>
	//  262  539:invokevirtual   #362 <Method void Scroller.abortAnimation()>
		z = false;
	//  263  542:aload_0         
	//  264  543:iconst_0        
	//  265  544:putfield        #370 <Field boolean z>
		c();
	//  266  547:aload_0         
	//  267  548:invokevirtual   #712 <Method void c()>
		float f3 = motionevent.getX();
	//  268  551:aload_1         
	//  269  552:invokevirtual   #1014 <Method float MotionEvent.getX()>
	//  270  555:fstore_2        
		I = f3;
	//  271  556:aload_0         
	//  272  557:fload_2         
	//  273  558:putfield        #1009 <Field float I>
		G = f3;
	//  274  561:aload_0         
	//  275  562:fload_2         
	//  276  563:putfield        #349 <Field float G>
		f3 = motionevent.getY();
	//  277  566:aload_1         
	//  278  567:invokevirtual   #1016 <Method float MotionEvent.getY()>
	//  279  570:fstore_2        
		J = f3;
	//  280  571:aload_0         
	//  281  572:fload_2         
	//  282  573:putfield        #1001 <Field float J>
		H = f3;
	//  283  576:aload_0         
	//  284  577:fload_2         
	//  285  578:putfield        #1005 <Field float H>
		j1 = motionevent.getPointerId(0);
	//  286  581:aload_1         
	//  287  582:iconst_0        
	//  288  583:invokevirtual   #344 <Method int MotionEvent.getPointerId(int)>
	//  289  586:istore          6
		K = j1;
	//  290  588:aload_0         
	//  291  589:iload           6
	//  292  591:putfield        #172 <Field int K>
		if(flag)
	//* 293  594:iload           9
	//* 294  596:ifeq            603
			android.support.v4.view.s.c(((View) (this)));
	//  295  599:aload_0         
	//  296  600:invokestatic    #730 <Method void s.c(View)>
		return true;
	//  297  603:iconst_1        
	//  298  604:ireturn         
		return false;
	//  299  605:iconst_0        
	//  300  606:ireturn         
	}

	public void removeView(View view)
	{
		if(x)
	//*   0    0:aload_0         
	//*   1    1:getfield        #820 <Field boolean x>
	//*   2    4:ifeq            13
		{
			removeViewInLayout(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1117 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1119 <Method void ViewGroup.removeView(View)>
			return;
	//   10   18:return          
		}
	}

	public void setAdapter(p p1)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field p b>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(obj != null)
	//*   5    8:aload           6
	//*   6   10:ifnull          110
		{
			b.setViewPagerObserver(((DataSetObserver) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #322 <Field p b>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #1125 <Method void p.setViewPagerObserver(DataSetObserver)>
			b.startUpdate(((ViewGroup) (this)));
	//   11   21:aload_0         
	//   12   22:getfield        #322 <Field p b>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #611 <Method void p.startUpdate(ViewGroup)>
			for(int i1 = 0; i1 < g.size(); i1++)
	//*  15   29:iconst_0        
	//*  16   30:istore_2        
	//*  17   31:iload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #148 <Field ArrayList g>
	//*  20   36:invokevirtual   #207 <Method int ArrayList.size()>
	//*  21   39:icmpge          80
			{
				obj = ((Object) ((b)g.get(i1)));
	//   22   42:aload_0         
	//   23   43:getfield        #148 <Field ArrayList g>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   26   50:checkcast       #25  <Class ViewPager$b>
	//   27   53:astore          6
				b.destroyItem(((ViewGroup) (this)), ((b) (obj)).b, ((b) (obj)).a);
	//   28   55:aload_0         
	//   29   56:getfield        #322 <Field p b>
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:getfield        #213 <Field int ViewPager$b.b>
	//   33   65:aload           6
	//   34   67:getfield        #520 <Field Object android.support.v4.view.ViewPager$b.a>
	//   35   70:invokevirtual   #662 <Method void p.destroyItem(ViewGroup, int, Object)>
			}

	//   36   73:iload_2         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_2        
	//*  40   77:goto            31
			b.finishUpdate(((ViewGroup) (this)));
	//   41   80:aload_0         
	//   42   81:getfield        #322 <Field p b>
	//   43   84:aload_0         
	//   44   85:invokevirtual   #670 <Method void p.finishUpdate(ViewGroup)>
			g.clear();
	//   45   88:aload_0         
	//   46   89:getfield        #148 <Field ArrayList g>
	//   47   92:invokevirtual   #478 <Method void ArrayList.clear()>
			f();
	//   48   95:aload_0         
	//   49   96:invokespecial   #1127 <Method void f()>
			c = 0;
	//   50   99:aload_0         
	//   51  100:iconst_0        
	//   52  101:putfield        #201 <Field int c>
			scrollTo(0, 0);
	//   53  104:aload_0         
	//   54  105:iconst_0        
	//   55  106:iconst_0        
	//   56  107:invokevirtual   #297 <Method void scrollTo(int, int)>
		}
		obj = ((Object) (b));
	//   57  110:aload_0         
	//   58  111:getfield        #322 <Field p b>
	//   59  114:astore          6
		b = p1;
	//   60  116:aload_0         
	//   61  117:aload_1         
	//   62  118:putfield        #322 <Field p b>
		d = 0;
	//   63  121:aload_0         
	//   64  122:iconst_0        
	//   65  123:putfield        #613 <Field int d>
		if(b != null)
	//*  66  126:aload_0         
	//*  67  127:getfield        #322 <Field p b>
	//*  68  130:ifnull          256
		{
			if(o == null)
	//*  69  133:aload_0         
	//*  70  134:getfield        #1129 <Field ViewPager$g o>
	//*  71  137:ifnonnull       152
				o = new g();
	//   72  140:aload_0         
	//   73  141:new             #40  <Class ViewPager$g>
	//   74  144:dup             
	//   75  145:aload_0         
	//   76  146:invokespecial   #1130 <Method void ViewPager$g(ViewPager)>
	//   77  149:putfield        #1129 <Field ViewPager$g o>
			b.setViewPagerObserver(((DataSetObserver) (o)));
	//   78  152:aload_0         
	//   79  153:getfield        #322 <Field p b>
	//   80  156:aload_0         
	//   81  157:getfield        #1129 <Field ViewPager$g o>
	//   82  160:invokevirtual   #1125 <Method void p.setViewPagerObserver(DataSetObserver)>
			z = false;
	//   83  163:aload_0         
	//   84  164:iconst_0        
	//   85  165:putfield        #370 <Field boolean z>
			boolean flag1 = T;
	//   86  168:aload_0         
	//   87  169:getfield        #174 <Field boolean T>
	//   88  172:istore          5
			T = true;
	//   89  174:aload_0         
	//   90  175:iconst_1        
	//   91  176:putfield        #174 <Field boolean T>
			d = b.getCount();
	//   92  179:aload_0         
	//   93  180:aload_0         
	//   94  181:getfield        #322 <Field p b>
	//   95  184:invokevirtual   #327 <Method int p.getCount()>
	//   96  187:putfield        #613 <Field int d>
			if(j >= 0)
	//*  97  190:aload_0         
	//*  98  191:getfield        #158 <Field int j>
	//*  99  194:iflt            240
			{
				b.restoreState(k, l);
	//  100  197:aload_0         
	//  101  198:getfield        #322 <Field p b>
	//  102  201:aload_0         
	//  103  202:getfield        #160 <Field Parcelable k>
	//  104  205:aload_0         
	//  105  206:getfield        #162 <Field ClassLoader l>
	//  106  209:invokevirtual   #1083 <Method void p.restoreState(Parcelable, ClassLoader)>
				a(j, false, true);
	//  107  212:aload_0         
	//  108  213:aload_0         
	//  109  214:getfield        #158 <Field int j>
	//  110  217:iconst_0        
	//  111  218:iconst_1        
	//  112  219:invokevirtual   #734 <Method void a(int, boolean, boolean)>
				j = -1;
	//  113  222:aload_0         
	//  114  223:iconst_m1       
	//  115  224:putfield        #158 <Field int j>
				k = null;
	//  116  227:aload_0         
	//  117  228:aconst_null     
	//  118  229:putfield        #160 <Field Parcelable k>
				l = null;
	//  119  232:aload_0         
	//  120  233:aconst_null     
	//  121  234:putfield        #162 <Field ClassLoader l>
			} else
	//* 122  237:goto            256
			if(!flag1)
	//* 123  240:iload           5
	//* 124  242:ifne            252
				c();
	//  125  245:aload_0         
	//  126  246:invokevirtual   #712 <Method void c()>
			else
	//* 127  249:goto            256
				requestLayout();
	//  128  252:aload_0         
	//  129  253:invokevirtual   #740 <Method void requestLayout()>
		}
		if(ad != null && !ad.isEmpty())
	//* 130  256:aload_0         
	//* 131  257:getfield        #746 <Field List ad>
	//* 132  260:ifnull          323
	//* 133  263:aload_0         
	//* 134  264:getfield        #746 <Field List ad>
	//* 135  267:invokeinterface #1131 <Method boolean List.isEmpty()>
	//* 136  272:ifne            323
		{
			int k1 = ad.size();
	//  137  275:aload_0         
	//  138  276:getfield        #746 <Field List ad>
	//  139  279:invokeinterface #398 <Method int List.size()>
	//  140  284:istore          4
			for(int j1 = ((int) (flag)); j1 < k1; j1++)
	//* 141  286:iload_3         
	//* 142  287:istore_2        
	//* 143  288:iload_2         
	//* 144  289:iload           4
	//* 145  291:icmpge          323
				((d)ad.get(j1)).a(this, ((p) (obj)), p1);
	//  146  294:aload_0         
	//  147  295:getfield        #746 <Field List ad>
	//  148  298:iload_2         
	//  149  299:invokeinterface #399 <Method Object List.get(int)>
	//  150  304:checkcast       #31  <Class ViewPager$d>
	//  151  307:aload_0         
	//  152  308:aload           6
	//  153  310:aload_1         
	//  154  311:invokeinterface #1134 <Method void android.support.v4.view.ViewPager$d.a(ViewPager, p, p)>

	//  155  316:iload_2         
	//  156  317:iconst_1        
	//  157  318:iadd            
	//  158  319:istore_2        
		}
	//* 159  320:goto            288
	//  160  323:return          
	}

	public void setCurrentItem(int i1)
	{
		z = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #370 <Field boolean z>
		a(i1, T ^ true, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #174 <Field boolean T>
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #734 <Method void a(int, boolean, boolean)>
	//   11   17:return          
	}

	public void setOffscreenPageLimit(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 < 1)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #628 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #629 <Method void StringBuilder()>
	//    8   14:astore_3        
			stringbuilder.append("Requested offscreen page limit ");
	//    9   15:aload_3         
	//   10   16:ldc2            #1138 <String "Requested offscreen page limit ">
	//   11   19:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
			stringbuilder.append(i1);
	//   13   23:aload_3         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #638 <Method StringBuilder StringBuilder.append(int)>
	//   16   28:pop             
			stringbuilder.append(" too small; defaulting to ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1140 <String " too small; defaulting to ">
	//   19   33:invokevirtual   #635 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(1);
	//   21   37:aload_3         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #638 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			Log.w("ViewPager", stringbuilder.toString());
	//   25   43:ldc2            #847 <String "ViewPager">
	//   26   46:aload_3         
	//   27   47:invokevirtual   #653 <Method String StringBuilder.toString()>
	//   28   50:invokestatic    #1142 <Method int Log.w(String, String)>
	//   29   53:pop             
			j1 = 1;
	//   30   54:iconst_1        
	//   31   55:istore_2        
		}
		if(j1 != A)
	//*  32   56:iload_2         
	//*  33   57:aload_0         
	//*  34   58:getfield        #170 <Field int A>
	//*  35   61:icmpeq          73
		{
			A = j1;
	//   36   64:aload_0         
	//   37   65:iload_2         
	//   38   66:putfield        #170 <Field int A>
			c();
	//   39   69:aload_0         
	//   40   70:invokevirtual   #712 <Method void c()>
		}
	//   41   73:return          
	}

	public void setOnPageChangeListener(e e1)
	{
		ab = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #391 <Field ViewPager$e ab>
	//    3    5:return          
	}

	public void setPageMargin(int i1)
	{
		int j1 = p;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field int p>
	//    2    4:istore_2        
		p = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #329 <Field int p>
		int k1 = getWidth();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #388 <Method int getWidth()>
	//    8   14:istore_3        
		a(k1, k1, i1, j1);
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:iload_3         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokespecial   #1098 <Method void a(int, int, int, int)>
		requestLayout();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #740 <Method void requestLayout()>
	//   17   27:return          
	}

	public void setPageMarginDrawable(int i1)
	{
		setPageMarginDrawable(android.support.v4.content.a.getDrawable(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #542 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1153 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #1156 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		q = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #943 <Field Drawable q>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1159 <Method void refreshDrawableState()>
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
	//   16   26:invokevirtual   #531 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #1162 <Method void invalidate()>
	//   19   33:return          
	}

	void setScrollState(int i1)
	{
		if(ak == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field int ak>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		ak = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #183 <Field int ak>
		if(ae != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #702 <Field ViewPager$f ae>
	//*  10   18:ifnull          37
		{
			boolean flag;
			if(i1 != 0)
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
			b(flag);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokespecial   #1164 <Method void b(boolean)>
		}
		f(i1);
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:invokespecial   #1166 <Method void f(int)>
	//   24   42:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == q;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1170 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #943 <Field Drawable q>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	static final int a[] = {
		0x10100b3
	};
	private static final i ai = new i();
	private static final Comparator e = new Comparator() {

		public int a(b b1, b b2)
		{
			return b1.b - b2.b;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int ViewPager$b.b>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int ViewPager$b.b>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return a((b)obj, (b)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class ViewPager$b>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class ViewPager$b>
		//    5    9:invokevirtual   #26  <Method int a(ViewPager$b, ViewPager$b)>
		//    6   12:ireturn         
		}

	}
;
	private static final Interpolator f = new Interpolator() {

		public float getInterpolation(float f1)
		{
			f1--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return f1 * f1 * f1 * f1 * f1 + 1.0F;
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
	private int A;
	private boolean B;
	private boolean C;
	private int D;
	private int E;
	private int F;
	private float G;
	private float H;
	private float I;
	private float J;
	private int K;
	private VelocityTracker L;
	private int M;
	private int N;
	private int O;
	private int P;
	private boolean Q;
	private EdgeEffect R;
	private EdgeEffect S;
	private boolean T;
	private boolean U;
	private boolean V;
	private int W;
	private List aa;
	private e ab;
	private e ac;
	private List ad;
	private f ae;
	private int af;
	private int ag;
	private ArrayList ah;
	private final Runnable aj;
	private int ak;
	p b;
	int c;
	private int d;
	private final ArrayList g;
	private final b h;
	private final Rect i;
	private int j;
	private Parcelable k;
	private ClassLoader l;
	private Scroller m;
	private boolean n;
	private g o;
	private int p;
	private Drawable q;
	private int r;
	private int s;
	private float t;
	private float u;
	private int v;
	private int w;
	private boolean x;
	private boolean y;
	private boolean z;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #126 <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #128 <Field int[] a>
	//    7   11:new             #6   <Class ViewPager$1>
	//    8   14:dup             
	//    9   15:invokespecial   #131 <Method void ViewPager$1()>
	//   10   18:putstatic       #133 <Field Comparator e>
	//   11   21:new             #8   <Class ViewPager$2>
	//   12   24:dup             
	//   13   25:invokespecial   #134 <Method void ViewPager$2()>
	//   14   28:putstatic       #136 <Field Interpolator f>
	//   15   31:new             #46  <Class ViewPager$i>
	//   16   34:dup             
	//   17   35:invokespecial   #137 <Method void ViewPager$i()>
	//   18   38:putstatic       #139 <Field ViewPager$i ai>
	//*  19   41:return          
	}
}
