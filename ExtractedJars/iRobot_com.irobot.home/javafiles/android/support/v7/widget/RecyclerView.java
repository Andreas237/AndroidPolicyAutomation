// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a.a;
import android.support.v4.view.h;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.s;
import android.support.v4.view.t;
import android.support.v4.widget.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			bc, w, ai, t, 
//			e, aa, ad, bb

public class RecyclerView extends ViewGroup
	implements android.support.v4.view.j
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public boolean c()
		{
			return c.n();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field RecyclerView$u c>
		//    2    4:invokevirtual   #48  <Method boolean RecyclerView$u.n()>
		//    3    7:ireturn         
		}

		public boolean d()
		{
			return c.q();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field RecyclerView$u c>
		//    2    4:invokevirtual   #51  <Method boolean RecyclerView$u.q()>
		//    3    7:ireturn         
		}

		public boolean e()
		{
			return c.x();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field RecyclerView$u c>
		//    2    4:invokevirtual   #54  <Method boolean RecyclerView$u.x()>
		//    3    7:ireturn         
		}

		public int f()
		{
			return c.d();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field RecyclerView$u c>
		//    2    4:invokevirtual   #57  <Method int RecyclerView$u.d()>
		//    3    7:ireturn         
		}

		u c;
		final Rect d;
		boolean e;
		boolean f;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			d = new Rect();
		//    4    6:aload_0         
		//    5    7:new             #20  <Class Rect>
		//    6   10:dup             
		//    7   11:invokespecial   #23  <Method void Rect()>
		//    8   14:putfield        #25  <Field Rect d>
			e = true;
		//    9   17:aload_0         
		//   10   18:iconst_1        
		//   11   19:putfield        #27  <Field boolean e>
			f = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #29  <Field boolean f>
		//   15   27:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			d = new Rect();
		//    4    6:aload_0         
		//    5    7:new             #20  <Class Rect>
		//    6   10:dup             
		//    7   11:invokespecial   #23  <Method void Rect()>
		//    8   14:putfield        #25  <Field Rect d>
			e = true;
		//    9   17:aload_0         
		//   10   18:iconst_1        
		//   11   19:putfield        #27  <Field boolean e>
			f = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #29  <Field boolean f>
		//   15   27:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			d = new Rect();
		//    3    5:aload_0         
		//    4    6:new             #20  <Class Rect>
		//    5    9:dup             
		//    6   10:invokespecial   #23  <Method void Rect()>
		//    7   13:putfield        #25  <Field Rect d>
			e = true;
		//    8   16:aload_0         
		//    9   17:iconst_1        
		//   10   18:putfield        #27  <Field boolean e>
			f = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #29  <Field boolean f>
		//   14   26:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			d = new Rect();
		//    3    5:aload_0         
		//    4    6:new             #20  <Class Rect>
		//    5    9:dup             
		//    6   10:invokespecial   #23  <Method void Rect()>
		//    7   13:putfield        #25  <Field Rect d>
			e = true;
		//    8   16:aload_0         
		//    9   17:iconst_1        
		//   10   18:putfield        #27  <Field boolean e>
			f = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #29  <Field boolean f>
		//   14   26:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			d = new Rect();
		//    3    5:aload_0         
		//    4    6:new             #20  <Class Rect>
		//    5    9:dup             
		//    6   10:invokespecial   #23  <Method void Rect()>
		//    7   13:putfield        #25  <Field Rect d>
			e = true;
		//    8   16:aload_0         
		//    9   17:iconst_1        
		//   10   18:putfield        #27  <Field boolean e>
			f = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #29  <Field boolean f>
		//   14   26:return          
		}
	}

	public static class SavedState extends AbsSavedState
	{

		void a(SavedState savedstate)
		{
			a = savedstate.a;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #41  <Field Parcelable a>
		//    3    5:putfield        #41  <Field Parcelable a>
		//    4    8:return          
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeParcelable(a, 0);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #41  <Field Parcelable a>
		//    7   11:iconst_0        
		//    8   12:invokevirtual   #53  <Method void Parcel.writeParcelable(Parcelable, int)>
		//    9   15:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class RecyclerView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class RecyclerView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #28  <Method RecyclerView$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method RecyclerView$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method RecyclerView$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		Parcelable a;

		static 
		{
		//    0    0:new             #9   <Class RecyclerView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void RecyclerView$SavedState$1()>
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
			if(classloader == null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          13
		//*   6   10:goto            19
				classloader = ((Class) (android/support/v7/widget/RecyclerView$h)).getClassLoader();
		//    7   13:ldc1            #27  <Class RecyclerView$h>
		//    8   15:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
		//    9   18:astore_2        
			a = parcel.readParcelable(classloader);
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:aload_2         
		//   13   22:invokevirtual   #39  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   14   25:putfield        #41  <Field Parcelable a>
		//   15   28:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static abstract class a
	{

		public abstract int a();

		public long a(int i1)
		{
			return -1L;
		//    0    0:ldc2w           #26  <Long -1L>
		//    1    3:lreturn         
		}

		public void a(c c1)
		{
			a.registerObserver(((Object) (c1)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclerView$b a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #32  <Method void RecyclerView$b.registerObserver(Object)>
		//    4    8:return          
		}

		public void a(u u1)
		{
		//    0    0:return          
		}

		public abstract void a(u u1, int i1);

		public void a(u u1, int i1, List list)
		{
			a(u1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #39  <Method void a(RecyclerView$u, int)>
		//    4    6:return          
		}

		public void a(RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public int b(int i1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public abstract u b(ViewGroup viewgroup, int i1);

		public void b(c c1)
		{
			a.unregisterObserver(((Object) (c1)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclerView$b a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #46  <Method void RecyclerView$b.unregisterObserver(Object)>
		//    4    8:return          
		}

		public final void b(u u1, int i1)
		{
			u1.c = i1;
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:putfield        #52  <Field int RecyclerView$u.c>
			if(d())
		//*   3    5:aload_0         
		//*   4    6:invokevirtual   #56  <Method boolean d()>
		//*   5    9:ifeq            21
				u1.e = a(i1);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:iload_2         
		//    9   15:invokevirtual   #58  <Method long a(int)>
		//   10   18:putfield        #62  <Field long RecyclerView$u.e>
			u1.a(1, 519);
		//   11   21:aload_1         
		//   12   22:iconst_1        
		//   13   23:sipush          519
		//   14   26:invokevirtual   #65  <Method void android.support.v7.widget.RecyclerView$u.a(int, int)>
			android.support.v4.os.b.a("RV OnBindView");
		//   15   29:ldc1            #67  <String "RV OnBindView">
		//   16   31:invokestatic    #72  <Method void b.a(String)>
			a(u1, i1, u1.u());
		//   17   34:aload_0         
		//   18   35:aload_1         
		//   19   36:iload_2         
		//   20   37:aload_1         
		//   21   38:invokevirtual   #76  <Method List RecyclerView$u.u()>
		//   22   41:invokevirtual   #78  <Method void a(RecyclerView$u, int, List)>
			u1.t();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #81  <Method void android.support.v7.widget.RecyclerView$u.t()>
			u1 = ((u) (u1.a.getLayoutParams()));
		//   25   48:aload_1         
		//   26   49:getfield        #84  <Field View android.support.v7.widget.RecyclerView$u.a>
		//   27   52:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   28   55:astore_1        
			if(u1 instanceof LayoutParams)
		//*  29   56:aload_1         
		//*  30   57:instanceof      #92  <Class RecyclerView$LayoutParams>
		//*  31   60:ifeq            71
				((LayoutParams)u1).e = true;
		//   32   63:aload_1         
		//   33   64:checkcast       #92  <Class RecyclerView$LayoutParams>
		//   34   67:iconst_1        
		//   35   68:putfield        #94  <Field boolean RecyclerView$LayoutParams.e>
			android.support.v4.os.b.a();
		//   36   71:invokestatic    #96  <Method void b.a()>
		//   37   74:return          
		}

		public void b(RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public boolean b(u u1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public final u c(ViewGroup viewgroup, int i1)
		{
			android.support.v4.os.b.a("RV CreateView");
		//    0    0:ldc1            #101 <String "RV CreateView">
		//    1    2:invokestatic    #72  <Method void b.a(String)>
			viewgroup = ((ViewGroup) (b(viewgroup, i1)));
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:iload_2         
		//    5    8:invokevirtual   #103 <Method RecyclerView$u b(ViewGroup, int)>
		//    6   11:astore_1        
			viewgroup.f = i1;
		//    7   12:aload_1         
		//    8   13:iload_2         
		//    9   14:putfield        #106 <Field int RecyclerView$u.f>
			android.support.v4.os.b.a();
		//   10   17:invokestatic    #96  <Method void b.a()>
			return ((u) (viewgroup));
		//   11   20:aload_1         
		//   12   21:areturn         
		}

		public final void c(int i1)
		{
			a.a(i1, 1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclerView$b a>
		//    2    4:iload_1         
		//    3    5:iconst_1        
		//    4    6:invokevirtual   #109 <Method void android.support.v7.widget.RecyclerView$b.a(int, int)>
		//    5    9:return          
		}

		public void c(u u1)
		{
		//    0    0:return          
		}

		public final void d(int i1)
		{
			a.b(i1, 1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclerView$b a>
		//    2    4:iload_1         
		//    3    5:iconst_1        
		//    4    6:invokevirtual   #111 <Method void android.support.v7.widget.RecyclerView$b.b(int, int)>
		//    5    9:return          
		}

		public void d(u u1)
		{
		//    0    0:return          
		}

		public final boolean d()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field boolean b>
		//    2    4:ireturn         
		}

		public final void e()
		{
			a.a();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclerView$b a>
		//    2    4:invokevirtual   #112 <Method void android.support.v7.widget.RecyclerView$b.a()>
		//    3    7:return          
		}

		private final b a = new b();
		private boolean b;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class RecyclerView$b>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void RecyclerView$b()>
		//    6   12:putfield        #20  <Field RecyclerView$b a>
			b = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #22  <Field boolean b>
		//   10   20:return          
		}
	}

	static class b extends Observable
	{

		public void a()
		{
			for(int i1 = mObservers.size() - 1; i1 >= 0; i1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ArrayList mObservers>
		//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iflt            35
				((c)mObservers.get(i1)).a();
		//    8   14:aload_0         
		//    9   15:getfield        #18  <Field ArrayList mObservers>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #28  <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #30  <Class RecyclerView$c>
		//   13   25:invokevirtual   #32  <Method void android.support.v7.widget.RecyclerView$c.a()>

		//   14   28:iload_1         
		//   15   29:iconst_1        
		//   16   30:isub            
		//   17   31:istore_1        
		//*  18   32:goto            10
		//   19   35:return          
		}

		public void a(int i1, int j1)
		{
			a(i1, j1, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #36  <Method void a(int, int, Object)>
		//    5    7:return          
		}

		public void a(int i1, int j1, Object obj)
		{
			for(int k1 = mObservers.size() - 1; k1 >= 0; k1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ArrayList mObservers>
		//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore          4
		//*   6   11:iload           4
		//*   7   13:iflt            43
				((c)mObservers.get(k1)).a(i1, j1, obj);
		//    8   16:aload_0         
		//    9   17:getfield        #18  <Field ArrayList mObservers>
		//   10   20:iload           4
		//   11   22:invokevirtual   #28  <Method Object ArrayList.get(int)>
		//   12   25:checkcast       #30  <Class RecyclerView$c>
		//   13   28:iload_1         
		//   14   29:iload_2         
		//   15   30:aload_3         
		//   16   31:invokevirtual   #37  <Method void android.support.v7.widget.RecyclerView$c.a(int, int, Object)>

		//   17   34:iload           4
		//   18   36:iconst_1        
		//   19   37:isub            
		//   20   38:istore          4
		//*  21   40:goto            11
		//   22   43:return          
		}

		public void b(int i1, int j1)
		{
			for(int k1 = mObservers.size() - 1; k1 >= 0; k1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ArrayList mObservers>
		//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_3        
		//*   6   10:iload_3         
		//*   7   11:iflt            37
				((c)mObservers.get(k1)).b(i1, j1);
		//    8   14:aload_0         
		//    9   15:getfield        #18  <Field ArrayList mObservers>
		//   10   18:iload_3         
		//   11   19:invokevirtual   #28  <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #30  <Class RecyclerView$c>
		//   13   25:iload_1         
		//   14   26:iload_2         
		//   15   27:invokevirtual   #39  <Method void android.support.v7.widget.RecyclerView$c.b(int, int)>

		//   16   30:iload_3         
		//   17   31:iconst_1        
		//   18   32:isub            
		//   19   33:istore_3        
		//*  20   34:goto            10
		//   21   37:return          
		}

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Observable()>
		//    2    4:return          
		}
	}

	public static abstract class c
	{

		public void a()
		{
		//    0    0:return          
		}

		public void a(int i1, int j1)
		{
		//    0    0:return          
		}

		public void a(int i1, int j1, Object obj)
		{
			a(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #17  <Method void a(int, int)>
		//    4    6:return          
		}

		public void b(int i1, int j1)
		{
		//    0    0:return          
		}

		public c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface d
	{

		public abstract int a(int i1, int j1);
	}

	public static abstract class e
	{

		static int e(u u1)
		{
			int j1 = u.d(u1) & 0xe;
		//    0    0:aload_0         
		//    1    1:invokestatic    #51  <Method int RecyclerView$u.d(RecyclerView$u)>
		//    2    4:bipush          14
		//    3    6:iand            
		//    4    7:istore_2        
			if(u1.n())
		//*   5    8:aload_0         
		//*   6    9:invokevirtual   #55  <Method boolean RecyclerView$u.n()>
		//*   7   12:ifeq            17
				return 4;
		//    8   15:iconst_4        
		//    9   16:ireturn         
			int i1 = j1;
		//   10   17:iload_2         
		//   11   18:istore_1        
			if((j1 & 4) == 0)
		//*  12   19:iload_2         
		//*  13   20:iconst_4        
		//*  14   21:iand            
		//*  15   22:ifne            65
			{
				int k1 = u1.f();
		//   16   25:aload_0         
		//   17   26:invokevirtual   #58  <Method int RecyclerView$u.f()>
		//   18   29:istore_3        
				int l1 = u1.e();
		//   19   30:aload_0         
		//   20   31:invokevirtual   #60  <Method int RecyclerView$u.e()>
		//   21   34:istore          4
				i1 = j1;
		//   22   36:iload_2         
		//   23   37:istore_1        
				if(k1 != -1)
		//*  24   38:iload_3         
		//*  25   39:iconst_m1       
		//*  26   40:icmpeq          65
				{
					i1 = j1;
		//   27   43:iload_2         
		//   28   44:istore_1        
					if(l1 != -1)
		//*  29   45:iload           4
		//*  30   47:iconst_m1       
		//*  31   48:icmpeq          65
					{
						i1 = j1;
		//   32   51:iload_2         
		//   33   52:istore_1        
						if(k1 != l1)
		//*  34   53:iload_3         
		//*  35   54:iload           4
		//*  36   56:icmpeq          65
							i1 = j1 | 0x800;
		//   37   59:iload_2         
		//   38   60:sipush          2048
		//   39   63:ior             
		//   40   64:istore_1        
					}
				}
			}
			return i1;
		//   41   65:iload_1         
		//   42   66:ireturn         
		}

		public c a(r r1, u u1)
		{
			return j().a(u1);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method RecyclerView$e$c j()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #68  <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e$c.a(RecyclerView$u)>
		//    4    8:areturn         
		}

		public c a(r r1, u u1, int i1, List list)
		{
			return j().a(u1);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method RecyclerView$e$c j()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #68  <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e$c.a(RecyclerView$u)>
		//    4    8:areturn         
		}

		public abstract void a();

		void a(b b1)
		{
			a = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field RecyclerView$e$b a>
		//    3    5:return          
		}

		public final boolean a(a a1)
		{
			boolean flag = b();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method boolean b()>
		//    2    4:istore_2        
			if(a1 != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          30
			{
				if(!flag)
		//*   5    9:iload_2         
		//*   6   10:ifne            21
				{
					a1.a();
		//    7   13:aload_1         
		//    8   14:invokeinterface #77  <Method void android.support.v7.widget.RecyclerView$e$a.a()>
					return flag;
		//    9   19:iload_2         
		//   10   20:ireturn         
				}
				b.add(((Object) (a1)));
		//   11   21:aload_0         
		//   12   22:getfield        #33  <Field ArrayList b>
		//   13   25:aload_1         
		//   14   26:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
		//   15   29:pop             
			}
			return flag;
		//   16   30:iload_2         
		//   17   31:ireturn         
		}

		public abstract boolean a(u u1, c c1, c c2);

		public abstract boolean a(u u1, u u2, c c1, c c2);

		public boolean a(u u1, List list)
		{
			return h(u1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #88  <Method boolean h(RecyclerView$u)>
		//    3    5:ireturn         
		}

		public abstract boolean b();

		public abstract boolean b(u u1, c c1, c c2);

		public abstract boolean c(u u1, c c1, c c2);

		public abstract void d();

		public abstract void d(u u1);

		public long e()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field long e>
		//    2    4:lreturn         
		}

		public long f()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field long c>
		//    2    4:lreturn         
		}

		public final void f(u u1)
		{
			g(u1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #94  <Method void g(RecyclerView$u)>
			if(a != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #28  <Field RecyclerView$e$b a>
		//*   5    9:ifnull          22
				a.a(u1);
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field RecyclerView$e$b a>
		//    8   16:aload_1         
		//    9   17:invokeinterface #96  <Method void android.support.v7.widget.RecyclerView$e$b.a(RecyclerView$u)>
		//   10   22:return          
		}

		public long g()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field long d>
		//    2    4:lreturn         
		}

		public void g(u u1)
		{
		//    0    0:return          
		}

		public long h()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field long f>
		//    2    4:lreturn         
		}

		public boolean h(u u1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public final void i()
		{
			int j1 = b.size();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field ArrayList b>
		//    2    4:invokevirtual   #100 <Method int ArrayList.size()>
		//    3    7:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          38
				((a)b.get(i1)).a();
		//    9   15:aload_0         
		//   10   16:getfield        #33  <Field ArrayList b>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #104 <Method Object ArrayList.get(int)>
		//   13   23:checkcast       #9   <Class RecyclerView$e$a>
		//   14   26:invokeinterface #77  <Method void android.support.v7.widget.RecyclerView$e$a.a()>

		//   15   31:iload_1         
		//   16   32:iconst_1        
		//   17   33:iadd            
		//   18   34:istore_1        
		//*  19   35:goto            10
			b.clear();
		//   20   38:aload_0         
		//   21   39:getfield        #33  <Field ArrayList b>
		//   22   42:invokevirtual   #107 <Method void ArrayList.clear()>
		//   23   45:return          
		}

		public c j()
		{
			return new c();
		//    0    0:new             #15  <Class RecyclerView$e$c>
		//    1    3:dup             
		//    2    4:invokespecial   #108 <Method void RecyclerView$e$c()>
		//    3    7:areturn         
		}

		private b a;
		private ArrayList b;
		private long c;
		private long d;
		private long e;
		private long f;

		public e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			a = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #28  <Field RecyclerView$e$b a>
			b = new ArrayList();
		//    5    9:aload_0         
		//    6   10:new             #30  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #31  <Method void ArrayList()>
		//    9   17:putfield        #33  <Field ArrayList b>
			c = 120L;
		//   10   20:aload_0         
		//   11   21:ldc2w           #34  <Long 120L>
		//   12   24:putfield        #37  <Field long c>
			d = 120L;
		//   13   27:aload_0         
		//   14   28:ldc2w           #34  <Long 120L>
		//   15   31:putfield        #39  <Field long d>
			e = 250L;
		//   16   34:aload_0         
		//   17   35:ldc2w           #40  <Long 250L>
		//   18   38:putfield        #43  <Field long e>
			f = 250L;
		//   19   41:aload_0         
		//   20   42:ldc2w           #40  <Long 250L>
		//   21   45:putfield        #45  <Field long f>
		//   22   48:return          
		}
	}

	public static interface e.a
	{

		public abstract void a();
	}

	static interface e.b
	{

		public abstract void a(u u1);
	}

	public static class e.c
	{

		public e.c a(u u1)
		{
			return a(u1, 0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #23  <Method RecyclerView$e$c a(RecyclerView$u, int)>
		//    4    6:areturn         
		}

		public e.c a(u u1, int i1)
		{
			u1 = ((u) (u1.a));
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field View android.support.v7.widget.RecyclerView$u.a>
		//    2    4:astore_1        
			a = ((View) (u1)).getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #34  <Method int View.getLeft()>
		//    6   10:putfield        #36  <Field int a>
			b = ((View) (u1)).getTop();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #39  <Method int View.getTop()>
		//   10   18:putfield        #41  <Field int b>
			c = ((View) (u1)).getRight();
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokevirtual   #44  <Method int View.getRight()>
		//   14   26:putfield        #46  <Field int c>
			d = ((View) (u1)).getBottom();
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #49  <Method int View.getBottom()>
		//   18   34:putfield        #51  <Field int d>
			return this;
		//   19   37:aload_0         
		//   20   38:areturn         
		}

		public int a;
		public int b;
		public int c;
		public int d;

		public e.c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	private class f
		implements e.b
	{

		public void a(u u1)
		{
			u1.a(true);
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:invokevirtual   #25  <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
			if(u1.h != null && u1.i == null)
		//*   3    5:aload_1         
		//*   4    6:getfield        #29  <Field RecyclerView$u android.support.v7.widget.RecyclerView$u.h>
		//*   5    9:ifnull          24
		//*   6   12:aload_1         
		//*   7   13:getfield        #32  <Field RecyclerView$u RecyclerView$u.i>
		//*   8   16:ifnonnull       24
				u1.h = null;
		//    9   19:aload_1         
		//   10   20:aconst_null     
		//   11   21:putfield        #29  <Field RecyclerView$u android.support.v7.widget.RecyclerView$u.h>
			u1.i = null;
		//   12   24:aload_1         
		//   13   25:aconst_null     
		//   14   26:putfield        #32  <Field RecyclerView$u RecyclerView$u.i>
			if(!u.c(u1) && !a.a(u1.a) && u1.r())
		//*  15   29:aload_1         
		//*  16   30:invokestatic    #36  <Method boolean RecyclerView$u.c(RecyclerView$u)>
		//*  17   33:ifne            69
		//*  18   36:aload_0         
		//*  19   37:getfield        #15  <Field RecyclerView a>
		//*  20   40:aload_1         
		//*  21   41:getfield        #39  <Field View android.support.v7.widget.RecyclerView$u.a>
		//*  22   44:invokevirtual   #42  <Method boolean android.support.v7.widget.RecyclerView.a(View)>
		//*  23   47:ifne            69
		//*  24   50:aload_1         
		//*  25   51:invokevirtual   #46  <Method boolean RecyclerView$u.r()>
		//*  26   54:ifeq            69
				a.removeDetachedView(u1.a, false);
		//   27   57:aload_0         
		//   28   58:getfield        #15  <Field RecyclerView a>
		//   29   61:aload_1         
		//   30   62:getfield        #39  <Field View android.support.v7.widget.RecyclerView$u.a>
		//   31   65:iconst_0        
		//   32   66:invokevirtual   #50  <Method void RecyclerView.removeDetachedView(View, boolean)>
		//   33   69:return          
		}

		final RecyclerView a;

		f()
		{
			a = RecyclerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field RecyclerView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static abstract class g
	{

		public void a(Canvas canvas, RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public void a(Canvas canvas, RecyclerView recyclerview, r r1)
		{
			a(canvas, recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #19  <Method void a(Canvas, RecyclerView)>
		//    4    6:return          
		}

		public void a(Rect rect, int i1, RecyclerView recyclerview)
		{
			rect.set(0, 0, 0, 0);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:iconst_0        
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:invokevirtual   #26  <Method void Rect.set(int, int, int, int)>
		//    6    8:return          
		}

		public void a(Rect rect, View view, RecyclerView recyclerview, r r1)
		{
			a(rect, ((LayoutParams)view.getLayoutParams()).f(), recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #33  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    4    6:checkcast       #35  <Class RecyclerView$LayoutParams>
		//    5    9:invokevirtual   #39  <Method int RecyclerView$LayoutParams.f()>
		//    6   12:aload_3         
		//    7   13:invokevirtual   #41  <Method void a(Rect, int, RecyclerView)>
		//    8   16:return          
		}

		public void b(Canvas canvas, RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public void b(Canvas canvas, RecyclerView recyclerview, r r1)
		{
			b(canvas, recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #44  <Method void b(Canvas, RecyclerView)>
		//    4    6:return          
		}

		public g()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class h
	{

		public static int a(int i1, int j1, int k1)
		{
			int l1 = android.view.View.MeasureSpec.getMode(i1);
		//    0    0:iload_0         
		//    1    1:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
		//    2    4:istore_3        
			i1 = android.view.View.MeasureSpec.getSize(i1);
		//    3    5:iload_0         
		//    4    6:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
		//    5    9:istore_0        
			if(l1 != 0x80000000)
		//*   6   10:iload_3         
		//*   7   11:ldc1            #82  <Int 0x80000000>
		//*   8   13:icmpeq          30
			{
				if(l1 != 0x40000000)
		//*   9   16:iload_3         
		//*  10   17:ldc1            #83  <Int 0x40000000>
		//*  11   19:icmpeq          28
					i1 = Math.max(j1, k1);
		//   12   22:iload_1         
		//   13   23:iload_2         
		//   14   24:invokestatic    #89  <Method int Math.max(int, int)>
		//   15   27:istore_0        
				return i1;
		//   16   28:iload_0         
		//   17   29:ireturn         
			} else
			{
				return Math.min(i1, Math.max(j1, k1));
		//   18   30:iload_0         
		//   19   31:iload_1         
		//   20   32:iload_2         
		//   21   33:invokestatic    #89  <Method int Math.max(int, int)>
		//   22   36:invokestatic    #92  <Method int Math.min(int, int)>
		//   23   39:ireturn         
			}
		}

		public static int a(int i1, int j1, int k1, int l1, boolean flag)
		{
			int i2;
			boolean flag1;
			flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          6
			i2 = Math.max(0, i1 - k1);
		//    2    3:iconst_0        
		//    3    4:iload_0         
		//    4    5:iload_2         
		//    5    6:isub            
		//    6    7:invokestatic    #89  <Method int Math.max(int, int)>
		//    7   10:istore          5
			if(!flag) goto _L2; else goto _L1
		//    8   12:iload           4
		//    9   14:ifeq            67
_L1:
			if(l1 < 0) goto _L4; else goto _L3
		//   10   17:iload_3         
		//   11   18:iflt            29
_L3:
			k1 = l1;
		//   12   21:iload_3         
		//   13   22:istore_2        
			i1 = 0x40000000;
		//   14   23:ldc1            #83  <Int 0x40000000>
		//   15   25:istore_0        
			break MISSING_BLOCK_LABEL_125;
		//   16   26:goto            125
_L4:
			if(l1 == -1)
		//*  17   29:iload_3         
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          120
			{
				if(j1 != 0x80000000 && (j1 == 0 || j1 != 0x40000000))
		//*  20   34:iload_1         
		//*  21   35:ldc1            #82  <Int 0x80000000>
		//*  22   37:icmpeq          57
		//*  23   40:iload_1         
		//*  24   41:ifeq            50
		//*  25   44:iload_1         
		//*  26   45:ldc1            #83  <Int 0x40000000>
		//*  27   47:icmpeq          57
				{
					j1 = 0;
		//   28   50:iconst_0        
		//   29   51:istore_1        
					i1 = 0;
		//   30   52:iconst_0        
		//   31   53:istore_0        
				} else
		//*  32   54:goto            60
				{
					i1 = i2;
		//   33   57:iload           5
		//   34   59:istore_0        
				}
				k1 = i1;
		//   35   60:iload_0         
		//   36   61:istore_2        
				i1 = j1;
		//   37   62:iload_1         
		//   38   63:istore_0        
				break MISSING_BLOCK_LABEL_125;
		//   39   64:goto            125
			}
			break; /* Loop/switch isn't completed */
_L2:
			if(l1 >= 0)
		//*  40   67:iload_3         
		//*  41   68:iflt            74
				continue; /* Loop/switch isn't completed */
		//   42   71:goto            21
			if(l1 == -1)
		//*  43   74:iload_3         
		//*  44   75:iconst_m1       
		//*  45   76:icmpne          87
			{
				i1 = j1;
		//   46   79:iload_1         
		//   47   80:istore_0        
				k1 = i2;
		//   48   81:iload           5
		//   49   83:istore_2        
				break MISSING_BLOCK_LABEL_125;
		//   50   84:goto            125
			}
			if(l1 == -2)
		//*  51   87:iload_3         
		//*  52   88:bipush          -2
		//*  53   90:icmpne          120
			{
				if(j1 != 0x80000000)
		//*  54   93:iload_1         
		//*  55   94:ldc1            #82  <Int 0x80000000>
		//*  56   96:icmpeq          111
				{
					k1 = i2;
		//   57   99:iload           5
		//   58  101:istore_2        
					i1 = ((int) (flag1));
		//   59  102:iload           6
		//   60  104:istore_0        
					if(j1 != 0x40000000)
						break MISSING_BLOCK_LABEL_125;
		//   61  105:iload_1         
		//   62  106:ldc1            #83  <Int 0x40000000>
		//   63  108:icmpne          125
				}
				i1 = 0x80000000;
		//   64  111:ldc1            #82  <Int 0x80000000>
		//   65  113:istore_0        
				k1 = i2;
		//   66  114:iload           5
		//   67  116:istore_2        
				break MISSING_BLOCK_LABEL_125;
		//   68  117:goto            125
			}
			break; /* Loop/switch isn't completed */
			if(true) goto _L3; else goto _L5
_L5:
			k1 = 0;
		//   69  120:iconst_0        
		//   70  121:istore_2        
			i1 = ((int) (flag1));
		//   71  122:iload           6
		//   72  124:istore_0        
			return android.view.View.MeasureSpec.makeMeasureSpec(k1, i1);
		//   73  125:iload_2         
		//   74  126:iload_0         
		//   75  127:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   76  130:ireturn         
		}

		public static b a(Context context, AttributeSet attributeset, int i1, int j1)
		{
			b b1 = new b();
		//    0    0:new             #16  <Class RecyclerView$h$b>
		//    1    3:dup             
		//    2    4:invokespecial   #98  <Method void RecyclerView$h$b()>
		//    3    7:astore          4
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.e.a.c.RecyclerView, i1, j1)));
		//    4    9:aload_0         
		//    5   10:aload_1         
		//    6   11:getstatic       #104 <Field int[] android.support.v7.e.a$c.RecyclerView>
		//    7   14:iload_2         
		//    8   15:iload_3         
		//    9   16:invokevirtual   #110 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
		//   10   19:astore_0        
			b1.a = ((TypedArray) (context)).getInt(android.support.v7.e.a.c.RecyclerView_android_orientation, 1);
		//   11   20:aload           4
		//   12   22:aload_0         
		//   13   23:getstatic       #113 <Field int android.support.v7.e.a$c.RecyclerView_android_orientation>
		//   14   26:iconst_1        
		//   15   27:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
		//   16   30:putfield        #120 <Field int android.support.v7.widget.RecyclerView$h$b.a>
			b1.b = ((TypedArray) (context)).getInt(android.support.v7.e.a.c.RecyclerView_spanCount, 1);
		//   17   33:aload           4
		//   18   35:aload_0         
		//   19   36:getstatic       #123 <Field int android.support.v7.e.a$c.RecyclerView_spanCount>
		//   20   39:iconst_1        
		//   21   40:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
		//   22   43:putfield        #125 <Field int android.support.v7.widget.RecyclerView$h$b.b>
			b1.c = ((TypedArray) (context)).getBoolean(android.support.v7.e.a.c.RecyclerView_reverseLayout, false);
		//   23   46:aload           4
		//   24   48:aload_0         
		//   25   49:getstatic       #128 <Field int android.support.v7.e.a$c.RecyclerView_reverseLayout>
		//   26   52:iconst_0        
		//   27   53:invokevirtual   #132 <Method boolean TypedArray.getBoolean(int, boolean)>
		//   28   56:putfield        #133 <Field boolean RecyclerView$h$b.c>
			b1.d = ((TypedArray) (context)).getBoolean(android.support.v7.e.a.c.RecyclerView_stackFromEnd, false);
		//   29   59:aload           4
		//   30   61:aload_0         
		//   31   62:getstatic       #136 <Field int android.support.v7.e.a$c.RecyclerView_stackFromEnd>
		//   32   65:iconst_0        
		//   33   66:invokevirtual   #132 <Method boolean TypedArray.getBoolean(int, boolean)>
		//   34   69:putfield        #137 <Field boolean RecyclerView$h$b.d>
			((TypedArray) (context)).recycle();
		//   35   72:aload_0         
		//   36   73:invokevirtual   #140 <Method void TypedArray.recycle()>
			return b1;
		//   37   76:aload           4
		//   38   78:areturn         
		}

		private void a(int i1, View view)
		{
			p.e(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field android.support.v7.widget.t p>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #148 <Method void t.e(int)>
		//    4    8:return          
		}

		static void a(h h1, q q1)
		{
			h1.a(q1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #152 <Method void a(RecyclerView$q)>
		//    3    5:return          
		}

		private void a(n n1, int i1, View view)
		{
			u u1 = RecyclerView.e(view);
		//    0    0:aload_3         
		//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore          4
			if(u1.c())
		//*   3    6:aload           4
		//*   4    8:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
		//*   5   11:ifeq            15
				return;
		//    6   14:return          
			if(u1.n() && !u1.q() && !q.l.d())
		//*   7   15:aload           4
		//*   8   17:invokevirtual   #164 <Method boolean RecyclerView$u.n()>
		//*   9   20:ifeq            56
		//*  10   23:aload           4
		//*  11   25:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//*  12   28:ifne            56
		//*  13   31:aload_0         
		//*  14   32:getfield        #168 <Field RecyclerView q>
		//*  15   35:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//*  16   38:invokevirtual   #176 <Method boolean RecyclerView$a.d()>
		//*  17   41:ifne            56
			{
				f(i1);
		//   18   44:aload_0         
		//   19   45:iload_2         
		//   20   46:invokevirtual   #178 <Method void f(int)>
				n1.b(u1);
		//   21   49:aload_1         
		//   22   50:aload           4
		//   23   52:invokevirtual   #183 <Method void android.support.v7.widget.RecyclerView$n.b(RecyclerView$u)>
				return;
		//   24   55:return          
			} else
			{
				g(i1);
		//   25   56:aload_0         
		//   26   57:iload_2         
		//   27   58:invokevirtual   #185 <Method void g(int)>
				n1.c(view);
		//   28   61:aload_1         
		//   29   62:aload_3         
		//   30   63:invokevirtual   #188 <Method void RecyclerView$n.c(View)>
				q.g.h(u1);
		//   31   66:aload_0         
		//   32   67:getfield        #168 <Field RecyclerView q>
		//   33   70:getfield        #191 <Field bc android.support.v7.widget.RecyclerView.g>
		//   34   73:aload           4
		//   35   75:invokevirtual   #195 <Method void android.support.v7.widget.bc.h(RecyclerView$u)>
				return;
		//   36   78:return          
			}
		}

		private void a(q q1)
		{
			if(t == q1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #197 <Field RecyclerView$q t>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       13
				t = null;
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:putfield        #197 <Field RecyclerView$q t>
		//    7   13:return          
		}

		private void a(View view, int i1, boolean flag)
		{
			Object obj = ((Object) (RecyclerView.e(view)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore          6
			if(!flag && !((u) (obj)).q())
		//*   3    6:iload_3         
		//*   4    7:ifne            36
		//*   5   10:aload           6
		//*   6   12:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//*   7   15:ifeq            21
		//*   8   18:goto            36
				q.g.f(((u) (obj)));
		//    9   21:aload_0         
		//   10   22:getfield        #168 <Field RecyclerView q>
		//   11   25:getfield        #191 <Field bc android.support.v7.widget.RecyclerView.g>
		//   12   28:aload           6
		//   13   30:invokevirtual   #200 <Method void bc.f(RecyclerView$u)>
			else
		//*  14   33:goto            48
				q.g.e(((u) (obj)));
		//   15   36:aload_0         
		//   16   37:getfield        #168 <Field RecyclerView q>
		//   17   40:getfield        #191 <Field bc android.support.v7.widget.RecyclerView.g>
		//   18   43:aload           6
		//   19   45:invokevirtual   #202 <Method void bc.e(RecyclerView$u)>
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   20   48:aload_1         
		//   21   49:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   22   52:checkcast       #210 <Class RecyclerView$LayoutParams>
		//   23   55:astore          7
			if(!((u) (obj)).k() && !((u) (obj)).i())
		//*  24   57:aload           6
		//*  25   59:invokevirtual   #213 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  26   62:ifne            245
		//*  27   65:aload           6
		//*  28   67:invokevirtual   #216 <Method boolean RecyclerView$u.i()>
		//*  29   70:ifeq            76
		//*  30   73:goto            245
			{
				if(view.getParent() == q)
		//*  31   76:aload_1         
		//*  32   77:invokevirtual   #220 <Method ViewParent View.getParent()>
		//*  33   80:aload_0         
		//*  34   81:getfield        #168 <Field RecyclerView q>
		//*  35   84:if_acmpne       201
				{
					int k1 = p.b(view);
		//   36   87:aload_0         
		//   37   88:getfield        #143 <Field android.support.v7.widget.t p>
		//   38   91:aload_1         
		//   39   92:invokevirtual   #223 <Method int android.support.v7.widget.t.b(View)>
		//   40   95:istore          5
					int j1 = i1;
		//   41   97:iload_2         
		//   42   98:istore          4
					if(i1 == -1)
		//*  43  100:iload_2         
		//*  44  101:iconst_m1       
		//*  45  102:icmpne          114
						j1 = p.b();
		//   46  105:aload_0         
		//   47  106:getfield        #143 <Field android.support.v7.widget.t p>
		//   48  109:invokevirtual   #226 <Method int android.support.v7.widget.t.b()>
		//   49  112:istore          4
					if(k1 == -1)
		//*  50  114:iload           5
		//*  51  116:iconst_m1       
		//*  52  117:icmpne          177
					{
						obj = ((Object) (new StringBuilder()));
		//   53  120:new             #228 <Class StringBuilder>
		//   54  123:dup             
		//   55  124:invokespecial   #229 <Method void StringBuilder()>
		//   56  127:astore          6
						((StringBuilder) (obj)).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
		//   57  129:aload           6
		//   58  131:ldc1            #231 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
		//   59  133:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
		//   60  136:pop             
						((StringBuilder) (obj)).append(q.indexOfChild(view));
		//   61  137:aload           6
		//   62  139:aload_0         
		//   63  140:getfield        #168 <Field RecyclerView q>
		//   64  143:aload_1         
		//   65  144:invokevirtual   #238 <Method int RecyclerView.indexOfChild(View)>
		//   66  147:invokevirtual   #241 <Method StringBuilder StringBuilder.append(int)>
		//   67  150:pop             
						((StringBuilder) (obj)).append(q.a());
		//   68  151:aload           6
		//   69  153:aload_0         
		//   70  154:getfield        #168 <Field RecyclerView q>
		//   71  157:invokevirtual   #244 <Method String android.support.v7.widget.RecyclerView.a()>
		//   72  160:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
		//   73  163:pop             
						throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   74  164:new             #246 <Class IllegalStateException>
		//   75  167:dup             
		//   76  168:aload           6
		//   77  170:invokevirtual   #249 <Method String StringBuilder.toString()>
		//   78  173:invokespecial   #252 <Method void IllegalStateException(String)>
		//   79  176:athrow          
					}
					if(k1 != j1)
		//*  80  177:iload           5
		//*  81  179:iload           4
		//*  82  181:icmpeq          280
						q.m.f(k1, j1);
		//   83  184:aload_0         
		//   84  185:getfield        #168 <Field RecyclerView q>
		//   85  188:getfield        #256 <Field RecyclerView$h RecyclerView.m>
		//   86  191:iload           5
		//   87  193:iload           4
		//   88  195:invokevirtual   #259 <Method void f(int, int)>
				} else
		//*  89  198:goto            280
				{
					p.a(view, i1, false);
		//   90  201:aload_0         
		//   91  202:getfield        #143 <Field android.support.v7.widget.t p>
		//   92  205:aload_1         
		//   93  206:iload_2         
		//   94  207:iconst_0        
		//   95  208:invokevirtual   #261 <Method void android.support.v7.widget.t.a(View, int, boolean)>
					layoutparams.e = true;
		//   96  211:aload           7
		//   97  213:iconst_1        
		//   98  214:putfield        #263 <Field boolean RecyclerView$LayoutParams.e>
					if(t != null && t.c())
		//*  99  217:aload_0         
		//* 100  218:getfield        #197 <Field RecyclerView$q t>
		//* 101  221:ifnull          280
		//* 102  224:aload_0         
		//* 103  225:getfield        #197 <Field RecyclerView$q t>
		//* 104  228:invokevirtual   #266 <Method boolean RecyclerView$q.c()>
		//* 105  231:ifeq            280
						t.b(view);
		//  106  234:aload_0         
		//  107  235:getfield        #197 <Field RecyclerView$q t>
		//  108  238:aload_1         
		//  109  239:invokevirtual   #268 <Method void android.support.v7.widget.RecyclerView$q.b(View)>
				}
			} else
		//* 110  242:goto            280
			{
				if(((u) (obj)).i())
		//* 111  245:aload           6
		//* 112  247:invokevirtual   #216 <Method boolean RecyclerView$u.i()>
		//* 113  250:ifeq            261
					((u) (obj)).j();
		//  114  253:aload           6
		//  115  255:invokevirtual   #271 <Method void android.support.v7.widget.RecyclerView$u.j()>
				else
		//* 116  258:goto            266
					((u) (obj)).l();
		//  117  261:aload           6
		//  118  263:invokevirtual   #273 <Method void RecyclerView$u.l()>
				p.a(view, i1, view.getLayoutParams(), false);
		//  119  266:aload_0         
		//  120  267:getfield        #143 <Field android.support.v7.widget.t p>
		//  121  270:aload_1         
		//  122  271:iload_2         
		//  123  272:aload_1         
		//  124  273:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//  125  276:iconst_0        
		//  126  277:invokevirtual   #276 <Method void android.support.v7.widget.t.a(View, int, android.view.ViewGroup$LayoutParams, boolean)>
			}
			if(layoutparams.f)
		//* 127  280:aload           7
		//* 128  282:getfield        #278 <Field boolean RecyclerView$LayoutParams.f>
		//* 129  285:ifeq            302
			{
				((u) (obj)).a.invalidate();
		//  130  288:aload           6
		//  131  290:getfield        #281 <Field View android.support.v7.widget.RecyclerView$u.a>
		//  132  293:invokevirtual   #284 <Method void View.invalidate()>
				layoutparams.f = false;
		//  133  296:aload           7
		//  134  298:iconst_0        
		//  135  299:putfield        #278 <Field boolean RecyclerView$LayoutParams.f>
			}
		//  136  302:return          
		}

		private static boolean b(int i1, int j1, int k1)
		{
			int l1 = android.view.View.MeasureSpec.getMode(j1);
		//    0    0:iload_1         
		//    1    1:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
		//    2    4:istore_3        
			j1 = android.view.View.MeasureSpec.getSize(j1);
		//    3    5:iload_1         
		//    4    6:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
		//    5    9:istore_1        
			boolean flag1 = false;
		//    6   10:iconst_0        
		//    7   11:istore          5
			boolean flag = false;
		//    8   13:iconst_0        
		//    9   14:istore          4
			if(k1 > 0 && i1 != k1)
		//*  10   16:iload_2         
		//*  11   17:ifle            27
		//*  12   20:iload_0         
		//*  13   21:iload_2         
		//*  14   22:icmpeq          27
				return false;
		//   15   25:iconst_0        
		//   16   26:ireturn         
			if(l1 != 0x80000000)
		//*  17   27:iload_3         
		//*  18   28:ldc1            #82  <Int 0x80000000>
		//*  19   30:icmpeq          58
				if(l1 != 0)
		//*  20   33:iload_3         
		//*  21   34:ifeq            56
				{
					if(l1 != 0x40000000)
		//*  22   37:iload_3         
		//*  23   38:ldc1            #83  <Int 0x40000000>
		//*  24   40:icmpeq          45
						return false;
		//   25   43:iconst_0        
		//   26   44:ireturn         
					if(j1 == i1)
		//*  27   45:iload_1         
		//*  28   46:iload_0         
		//*  29   47:icmpne          53
						flag = true;
		//   30   50:iconst_1        
		//   31   51:istore          4
					return flag;
		//   32   53:iload           4
		//   33   55:ireturn         
				} else
				{
					return true;
		//   34   56:iconst_1        
		//   35   57:ireturn         
				}
			flag = flag1;
		//   36   58:iload           5
		//   37   60:istore          4
			if(j1 >= i1)
		//*  38   62:iload_1         
		//*  39   63:iload_0         
		//*  40   64:icmplt          70
				flag = true;
		//   41   67:iconst_1        
		//   42   68:istore          4
			return flag;
		//   43   70:iload           4
		//   44   72:ireturn         
		}

		private int[] b(RecyclerView recyclerview, View view, Rect rect, boolean flag)
		{
			int i1 = z();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #289 <Method int z()>
		//    2    4:istore          5
			int j1 = A();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #292 <Method int A()>
		//    5   10:istore          6
			int k1 = x();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #294 <Method int x()>
		//    8   16:istore          7
			int j3 = B();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #297 <Method int B()>
		//   11   22:istore          14
			int i2 = y();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #299 <Method int y()>
		//   14   28:istore          9
			int j2 = C();
		//   15   30:aload_0         
		//   16   31:invokevirtual   #302 <Method int C()>
		//   17   34:istore          10
			int k3 = (view.getLeft() + rect.left) - view.getScrollX();
		//   18   36:aload_2         
		//   19   37:invokevirtual   #305 <Method int View.getLeft()>
		//   20   40:aload_3         
		//   21   41:getfield        #310 <Field int Rect.left>
		//   22   44:iadd            
		//   23   45:aload_2         
		//   24   46:invokevirtual   #313 <Method int View.getScrollX()>
		//   25   49:isub            
		//   26   50:istore          15
			int k2 = (view.getTop() + rect.top) - view.getScrollY();
		//   27   52:aload_2         
		//   28   53:invokevirtual   #316 <Method int View.getTop()>
		//   29   56:aload_3         
		//   30   57:getfield        #319 <Field int Rect.top>
		//   31   60:iadd            
		//   32   61:aload_2         
		//   33   62:invokevirtual   #322 <Method int View.getScrollY()>
		//   34   65:isub            
		//   35   66:istore          11
			int l3 = rect.width();
		//   36   68:aload_3         
		//   37   69:invokevirtual   #325 <Method int Rect.width()>
		//   38   72:istore          16
			int l2 = rect.height();
		//   39   74:aload_3         
		//   40   75:invokevirtual   #328 <Method int Rect.height()>
		//   41   78:istore          12
			int i3 = k3 - i1;
		//   42   80:iload           15
		//   43   82:iload           5
		//   44   84:isub            
		//   45   85:istore          13
			i1 = Math.min(0, i3);
		//   46   87:iconst_0        
		//   47   88:iload           13
		//   48   90:invokestatic    #92  <Method int Math.min(int, int)>
		//   49   93:istore          5
			int l1 = k2 - j1;
		//   50   95:iload           11
		//   51   97:iload           6
		//   52   99:isub            
		//   53  100:istore          8
			j1 = Math.min(0, l1);
		//   54  102:iconst_0        
		//   55  103:iload           8
		//   56  105:invokestatic    #92  <Method int Math.min(int, int)>
		//   57  108:istore          6
			j3 = (l3 + k3) - (k1 - j3);
		//   58  110:iload           16
		//   59  112:iload           15
		//   60  114:iadd            
		//   61  115:iload           7
		//   62  117:iload           14
		//   63  119:isub            
		//   64  120:isub            
		//   65  121:istore          14
			k1 = Math.max(0, j3);
		//   66  123:iconst_0        
		//   67  124:iload           14
		//   68  126:invokestatic    #89  <Method int Math.max(int, int)>
		//   69  129:istore          7
			i2 = Math.max(0, (l2 + k2) - (i2 - j2));
		//   70  131:iconst_0        
		//   71  132:iload           12
		//   72  134:iload           11
		//   73  136:iadd            
		//   74  137:iload           9
		//   75  139:iload           10
		//   76  141:isub            
		//   77  142:isub            
		//   78  143:invokestatic    #89  <Method int Math.max(int, int)>
		//   79  146:istore          9
			if(s() == 1)
		//*  80  148:aload_0         
		//*  81  149:invokevirtual   #330 <Method int s()>
		//*  82  152:iconst_1        
		//*  83  153:icmpne          180
			{
				if(k1 != 0)
		//*  84  156:iload           7
		//*  85  158:ifeq            168
					i1 = k1;
		//   86  161:iload           7
		//   87  163:istore          5
				else
		//*  88  165:goto            200
					i1 = Math.max(i1, j3);
		//   89  168:iload           5
		//   90  170:iload           14
		//   91  172:invokestatic    #89  <Method int Math.max(int, int)>
		//   92  175:istore          5
			} else
		//*  93  177:goto            200
			if(i1 == 0)
		//*  94  180:iload           5
		//*  95  182:ifeq            188
		//*  96  185:goto            200
				i1 = Math.min(i3, k1);
		//   97  188:iload           13
		//   98  190:iload           7
		//   99  192:invokestatic    #92  <Method int Math.min(int, int)>
		//  100  195:istore          5
		//* 101  197:goto            185
			if(j1 == 0)
		//* 102  200:iload           6
		//* 103  202:ifeq            208
		//* 104  205:goto            217
				j1 = Math.min(l1, i2);
		//  105  208:iload           8
		//  106  210:iload           9
		//  107  212:invokestatic    #92  <Method int Math.min(int, int)>
		//  108  215:istore          6
			return (new int[] {
				i1, j1
			});
		//  109  217:iconst_2        
		//  110  218:newarray        int[]
		//  111  220:dup             
		//  112  221:iconst_0        
		//  113  222:iload           5
		//  114  224:iastore         
		//  115  225:dup             
		//  116  226:iconst_1        
		//  117  227:iload           6
		//  118  229:iastore         
		//  119  230:areturn         
		}

		private boolean d(RecyclerView recyclerview, int i1, int j1)
		{
			recyclerview = ((RecyclerView) (recyclerview.getFocusedChild()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #335 <Method View RecyclerView.getFocusedChild()>
		//    2    4:astore_1        
			if(recyclerview == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return false;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			int k1 = z();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #289 <Method int z()>
		//    9   15:istore          4
			int l1 = A();
		//   10   17:aload_0         
		//   11   18:invokevirtual   #292 <Method int A()>
		//   12   21:istore          5
			int i2 = x();
		//   13   23:aload_0         
		//   14   24:invokevirtual   #294 <Method int x()>
		//   15   27:istore          6
			int j2 = B();
		//   16   29:aload_0         
		//   17   30:invokevirtual   #297 <Method int B()>
		//   18   33:istore          7
			int k2 = y();
		//   19   35:aload_0         
		//   20   36:invokevirtual   #299 <Method int y()>
		//   21   39:istore          8
			int l2 = C();
		//   22   41:aload_0         
		//   23   42:invokevirtual   #302 <Method int C()>
		//   24   45:istore          9
			Rect rect = q.j;
		//   25   47:aload_0         
		//   26   48:getfield        #168 <Field RecyclerView q>
		//   27   51:getfield        #338 <Field Rect android.support.v7.widget.RecyclerView.j>
		//   28   54:astore          10
			a(((View) (recyclerview)), rect);
		//   29   56:aload_0         
		//   30   57:aload_1         
		//   31   58:aload           10
		//   32   60:invokevirtual   #341 <Method void a(View, Rect)>
			if(rect.left - i1 < i2 - j2 && rect.right - i1 > k1 && rect.top - j1 < k2 - l2)
		//*  33   63:aload           10
		//*  34   65:getfield        #310 <Field int Rect.left>
		//*  35   68:iload_2         
		//*  36   69:isub            
		//*  37   70:iload           6
		//*  38   72:iload           7
		//*  39   74:isub            
		//*  40   75:icmpge          121
		//*  41   78:aload           10
		//*  42   80:getfield        #344 <Field int Rect.right>
		//*  43   83:iload_2         
		//*  44   84:isub            
		//*  45   85:iload           4
		//*  46   87:icmple          121
		//*  47   90:aload           10
		//*  48   92:getfield        #319 <Field int Rect.top>
		//*  49   95:iload_3         
		//*  50   96:isub            
		//*  51   97:iload           8
		//*  52   99:iload           9
		//*  53  101:isub            
		//*  54  102:icmpge          121
				return rect.bottom - j1 > l1;
		//   55  105:aload           10
		//   56  107:getfield        #347 <Field int Rect.bottom>
		//   57  110:iload_3         
		//   58  111:isub            
		//   59  112:iload           5
		//   60  114:icmpgt          119
		//   61  117:iconst_0        
		//   62  118:ireturn         
		//   63  119:iconst_1        
		//   64  120:ireturn         
			else
				return false;
		//   65  121:iconst_0        
		//   66  122:ireturn         
		}

		public int A()
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				return q.getPaddingTop();
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:invokevirtual   #350 <Method int RecyclerView.getPaddingTop()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public int B()
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				return q.getPaddingRight();
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:invokevirtual   #353 <Method int RecyclerView.getPaddingRight()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public int C()
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				return q.getPaddingBottom();
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:invokevirtual   #356 <Method int RecyclerView.getPaddingBottom()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public View D()
		{
			if(q == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			View view = q.getFocusedChild();
		//    5    9:aload_0         
		//    6   10:getfield        #168 <Field RecyclerView q>
		//    7   13:invokevirtual   #335 <Method View RecyclerView.getFocusedChild()>
		//    8   16:astore_1        
			if(view != null)
		//*   9   17:aload_1         
		//*  10   18:ifnull          36
			{
				if(p.c(view))
		//*  11   21:aload_0         
		//*  12   22:getfield        #143 <Field android.support.v7.widget.t p>
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #360 <Method boolean t.c(View)>
		//*  15   29:ifeq            34
					return null;
		//   16   32:aconst_null     
		//   17   33:areturn         
				else
					return view;
		//   18   34:aload_1         
		//   19   35:areturn         
			} else
			{
				return null;
		//   20   36:aconst_null     
		//   21   37:areturn         
			}
		}

		public int E()
		{
			return android.support.v4.view.s.i(((View) (q)));
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:invokestatic    #365 <Method int s.i(View)>
		//    3    7:ireturn         
		}

		public int F()
		{
			return android.support.v4.view.s.j(((View) (q)));
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:invokestatic    #368 <Method int s.j(View)>
		//    3    7:ireturn         
		}

		void G()
		{
			if(t != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #197 <Field RecyclerView$q t>
		//*   2    4:ifnull          14
				t.a();
		//    3    7:aload_0         
		//    4    8:getfield        #197 <Field RecyclerView$q t>
		//    5   11:invokevirtual   #371 <Method void android.support.v7.widget.RecyclerView$q.a()>
		//    6   14:return          
		}

		public void H()
		{
			u = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #62  <Field boolean u>
		//    3    5:return          
		}

		boolean I()
		{
			int j1 = u();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #374 <Method int u()>
		//    2    4:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   3    5:iconst_0        
		//*   4    6:istore_1        
		//*   5    7:iload_1         
		//*   6    8:iload_2         
		//*   7    9:icmpge          44
			{
				android.view.ViewGroup.LayoutParams layoutparams = h(i1).getLayoutParams();
		//    8   12:aload_0         
		//    9   13:iload_1         
		//   10   14:invokevirtual   #377 <Method View h(int)>
		//   11   17:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   12   20:astore_3        
				if(layoutparams.width < 0 && layoutparams.height < 0)
		//*  13   21:aload_3         
		//*  14   22:getfield        #381 <Field int android.view.ViewGroup$LayoutParams.width>
		//*  15   25:ifge            37
		//*  16   28:aload_3         
		//*  17   29:getfield        #383 <Field int android.view.ViewGroup$LayoutParams.height>
		//*  18   32:ifge            37
					return true;
		//   19   35:iconst_1        
		//   20   36:ireturn         
			}

		//   21   37:iload_1         
		//   22   38:iconst_1        
		//   23   39:iadd            
		//   24   40:istore_1        
		//*  25   41:goto            7
			return false;
		//   26   44:iconst_0        
		//   27   45:ireturn         
		}

		public int a(int i1, n n1, r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int a(n n1, r r1)
		{
			n1 = ((n) (q));
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:astore_1        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore          4
			int i1 = ((int) (flag));
		//    5    8:iload           4
		//    6   10:istore_3        
			if(n1 != null)
		//*   7   11:aload_1         
		//*   8   12:ifnull          48
			{
				if(q.l == null)
		//*   9   15:aload_0         
		//*  10   16:getfield        #168 <Field RecyclerView q>
		//*  11   19:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//*  12   22:ifnonnull       27
					return 1;
		//   13   25:iconst_1        
		//   14   26:ireturn         
				i1 = ((int) (flag));
		//   15   27:iload           4
		//   16   29:istore_3        
				if(e())
		//*  17   30:aload_0         
		//*  18   31:invokevirtual   #387 <Method boolean e()>
		//*  19   34:ifeq            48
					i1 = q.l.a();
		//   20   37:aload_0         
		//   21   38:getfield        #168 <Field RecyclerView q>
		//   22   41:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//   23   44:invokevirtual   #389 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//   24   47:istore_3        
			}
			return i1;
		//   25   48:iload_3         
		//   26   49:ireturn         
		}

		public abstract LayoutParams a();

		public LayoutParams a(Context context, AttributeSet attributeset)
		{
			return new LayoutParams(context, attributeset);
		//    0    0:new             #210 <Class RecyclerView$LayoutParams>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #394 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
		//    5    9:areturn         
		}

		public LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
		{
			if(layoutparams instanceof LayoutParams)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #210 <Class RecyclerView$LayoutParams>
		//*   2    4:ifeq            19
				return new LayoutParams((LayoutParams)layoutparams);
		//    3    7:new             #210 <Class RecyclerView$LayoutParams>
		//    4   10:dup             
		//    5   11:aload_1         
		//    6   12:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    7   15:invokespecial   #398 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
		//    8   18:areturn         
			if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
		//*   9   19:aload_1         
		//*  10   20:instanceof      #400 <Class android.view.ViewGroup$MarginLayoutParams>
		//*  11   23:ifeq            38
				return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
		//   12   26:new             #210 <Class RecyclerView$LayoutParams>
		//   13   29:dup             
		//   14   30:aload_1         
		//   15   31:checkcast       #400 <Class android.view.ViewGroup$MarginLayoutParams>
		//   16   34:invokespecial   #403 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		//   17   37:areturn         
			else
				return new LayoutParams(layoutparams);
		//   18   38:new             #210 <Class RecyclerView$LayoutParams>
		//   19   41:dup             
		//   20   42:aload_1         
		//   21   43:invokespecial   #406 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//   22   46:areturn         
		}

		public View a(View view, int i1, n n1, r r1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(int i1, int j1, r r1, a a1)
		{
		//    0    0:return          
		}

		public void a(int i1, a a1)
		{
		//    0    0:return          
		}

		public void a(int i1, n n1)
		{
			View view = h(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #377 <Method View h(int)>
		//    3    5:astore_3        
			f(i1);
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:invokevirtual   #178 <Method void f(int)>
			n1.a(view);
		//    7   11:aload_2         
		//    8   12:aload_3         
		//    9   13:invokevirtual   #412 <Method void android.support.v7.widget.RecyclerView$n.a(View)>
		//   10   16:return          
		}

		public void a(Rect rect, int i1, int j1)
		{
			int k1 = rect.width();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #325 <Method int Rect.width()>
		//    2    4:istore          4
			int l1 = z();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #289 <Method int z()>
		//    5   10:istore          5
			int i2 = B();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #297 <Method int B()>
		//    8   16:istore          6
			int j2 = rect.height();
		//    9   18:aload_1         
		//   10   19:invokevirtual   #328 <Method int Rect.height()>
		//   11   22:istore          7
			int k2 = A();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #292 <Method int A()>
		//   14   28:istore          8
			int l2 = C();
		//   15   30:aload_0         
		//   16   31:invokevirtual   #302 <Method int C()>
		//   17   34:istore          9
			g(a(i1, k1 + l1 + i2, E()), a(j1, j2 + k2 + l2, F()));
		//   18   36:aload_0         
		//   19   37:iload_2         
		//   20   38:iload           4
		//   21   40:iload           5
		//   22   42:iadd            
		//   23   43:iload           6
		//   24   45:iadd            
		//   25   46:aload_0         
		//   26   47:invokevirtual   #415 <Method int E()>
		//   27   50:invokestatic    #417 <Method int a(int, int, int)>
		//   28   53:iload_3         
		//   29   54:iload           7
		//   30   56:iload           8
		//   31   58:iadd            
		//   32   59:iload           9
		//   33   61:iadd            
		//   34   62:aload_0         
		//   35   63:invokevirtual   #419 <Method int F()>
		//   36   66:invokestatic    #417 <Method int a(int, int, int)>
		//   37   69:invokevirtual   #421 <Method void g(int, int)>
		//   38   72:return          
		}

		public void a(Parcelable parcelable)
		{
		//    0    0:return          
		}

		void a(android.support.v4.view.a.b b1)
		{
			a(q.d, q.B, b1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #168 <Field RecyclerView q>
		//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
		//    4    8:aload_0         
		//    5    9:getfield        #168 <Field RecyclerView q>
		//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #432 <Method void a(RecyclerView$n, RecyclerView$r, android.support.v4.view.a.b)>
		//    9   19:return          
		}

		public void a(a a1, a a2)
		{
		//    0    0:return          
		}

		public void a(n n1)
		{
			for(int i1 = u() - 1; i1 >= 0; i1--)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #374 <Method int u()>
		//*   2    4:iconst_1        
		//*   3    5:isub            
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iflt            29
				a(n1, i1, h(i1));
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:iload_2         
		//   10   14:aload_0         
		//   11   15:iload_2         
		//   12   16:invokevirtual   #377 <Method View h(int)>
		//   13   19:invokespecial   #436 <Method void a(RecyclerView$n, int, View)>

		//   14   22:iload_2         
		//   15   23:iconst_1        
		//   16   24:isub            
		//   17   25:istore_2        
		//*  18   26:goto            7
		//   19   29:return          
		}

		public void a(n n1, r r1, int i1, int j1)
		{
			q.e(i1, j1);
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:iload_3         
		//    3    5:iload           4
		//    4    7:invokevirtual   #439 <Method void RecyclerView.e(int, int)>
		//    5   10:return          
		}

		public void a(n n1, r r1, android.support.v4.view.a.b b1)
		{
			if(q.canScrollVertically(-1) || q.canScrollHorizontally(-1))
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:iconst_m1       
		//*   3    5:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*   4    8:ifne            22
		//*   5   11:aload_0         
		//*   6   12:getfield        #168 <Field RecyclerView q>
		//*   7   15:iconst_m1       
		//*   8   16:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//*   9   19:ifeq            34
			{
				b1.a(8192);
		//   10   22:aload_3         
		//   11   23:sipush          8192
		//   12   26:invokevirtual   #450 <Method void android.support.v4.view.a.b.a(int)>
				b1.k(true);
		//   13   29:aload_3         
		//   14   30:iconst_1        
		//   15   31:invokevirtual   #453 <Method void android.support.v4.view.a.b.k(boolean)>
			}
			if(q.canScrollVertically(1) || q.canScrollHorizontally(1))
		//*  16   34:aload_0         
		//*  17   35:getfield        #168 <Field RecyclerView q>
		//*  18   38:iconst_1        
		//*  19   39:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*  20   42:ifne            56
		//*  21   45:aload_0         
		//*  22   46:getfield        #168 <Field RecyclerView q>
		//*  23   49:iconst_1        
		//*  24   50:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//*  25   53:ifeq            68
			{
				b1.a(4096);
		//   26   56:aload_3         
		//   27   57:sipush          4096
		//   28   60:invokevirtual   #450 <Method void android.support.v4.view.a.b.a(int)>
				b1.k(true);
		//   29   63:aload_3         
		//   30   64:iconst_1        
		//   31   65:invokevirtual   #453 <Method void android.support.v4.view.a.b.k(boolean)>
			}
			b1.a(((Object) (android.support.v4.view.a.b.k.a(a(n1, r1), b(n1, r1), e(n1, r1), d(n1, r1)))));
		//   32   68:aload_3         
		//   33   69:aload_0         
		//   34   70:aload_1         
		//   35   71:aload_2         
		//   36   72:invokevirtual   #455 <Method int a(RecyclerView$n, RecyclerView$r)>
		//   37   75:aload_0         
		//   38   76:aload_1         
		//   39   77:aload_2         
		//   40   78:invokevirtual   #457 <Method int b(RecyclerView$n, RecyclerView$r)>
		//   41   81:aload_0         
		//   42   82:aload_1         
		//   43   83:aload_2         
		//   44   84:invokevirtual   #460 <Method boolean e(RecyclerView$n, RecyclerView$r)>
		//   45   87:aload_0         
		//   46   88:aload_1         
		//   47   89:aload_2         
		//   48   90:invokevirtual   #462 <Method int d(RecyclerView$n, RecyclerView$r)>
		//   49   93:invokestatic    #467 <Method android.support.v4.view.a.b$k android.support.v4.view.a.b$k.a(int, int, boolean, int)>
		//   50   96:invokevirtual   #470 <Method void android.support.v4.view.a.b.a(Object)>
		//   51   99:return          
		}

		public void a(n n1, r r1, View view, android.support.v4.view.a.b b1)
		{
			int i1;
			if(e())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #387 <Method boolean e()>
		//*   2    4:ifeq            17
				i1 = d(view);
		//    3    7:aload_0         
		//    4    8:aload_3         
		//    5    9:invokevirtual   #473 <Method int d(View)>
		//    6   12:istore          5
			else
		//*   7   14:goto            20
				i1 = 0;
		//    8   17:iconst_0        
		//    9   18:istore          5
			int j1;
			if(d())
		//*  10   20:aload_0         
		//*  11   21:invokevirtual   #474 <Method boolean d()>
		//*  12   24:ifeq            37
				j1 = d(view);
		//   13   27:aload_0         
		//   14   28:aload_3         
		//   15   29:invokevirtual   #473 <Method int d(View)>
		//   16   32:istore          6
			else
		//*  17   34:goto            40
				j1 = 0;
		//   18   37:iconst_0        
		//   19   38:istore          6
			b1.b(((Object) (android.support.v4.view.a.b.l.a(i1, 1, j1, 1, false, false))));
		//   20   40:aload           4
		//   21   42:iload           5
		//   22   44:iconst_1        
		//   23   45:iload           6
		//   24   47:iconst_1        
		//   25   48:iconst_0        
		//   26   49:iconst_0        
		//   27   50:invokestatic    #479 <Method android.support.v4.view.a.b$l android.support.v4.view.a.b$l.a(int, int, int, int, boolean, boolean)>
		//   28   53:invokevirtual   #481 <Method void android.support.v4.view.a.b.b(Object)>
		//   29   56:return          
		}

		public void a(n n1, r r1, AccessibilityEvent accessibilityevent)
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          113
			{
				if(accessibilityevent == null)
		//*   3    7:aload_3         
		//*   4    8:ifnonnull       12
					return;
		//    5   11:return          
				n1 = ((n) (q));
		//    6   12:aload_0         
		//    7   13:getfield        #168 <Field RecyclerView q>
		//    8   16:astore_1        
				boolean flag1 = true;
		//    9   17:iconst_1        
		//   10   18:istore          5
				boolean flag = flag1;
		//   11   20:iload           5
		//   12   22:istore          4
				if(!((RecyclerView) (n1)).canScrollVertically(1))
		//*  13   24:aload_1         
		//*  14   25:iconst_1        
		//*  15   26:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*  16   29:ifne            83
				{
					flag = flag1;
		//   17   32:iload           5
		//   18   34:istore          4
					if(!q.canScrollVertically(-1))
		//*  19   36:aload_0         
		//*  20   37:getfield        #168 <Field RecyclerView q>
		//*  21   40:iconst_m1       
		//*  22   41:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*  23   44:ifne            83
					{
						flag = flag1;
		//   24   47:iload           5
		//   25   49:istore          4
						if(!q.canScrollHorizontally(-1))
		//*  26   51:aload_0         
		//*  27   52:getfield        #168 <Field RecyclerView q>
		//*  28   55:iconst_m1       
		//*  29   56:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//*  30   59:ifne            83
							if(q.canScrollHorizontally(1))
		//*  31   62:aload_0         
		//*  32   63:getfield        #168 <Field RecyclerView q>
		//*  33   66:iconst_1        
		//*  34   67:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//*  35   70:ifeq            80
								flag = flag1;
		//   36   73:iload           5
		//   37   75:istore          4
							else
		//*  38   77:goto            83
								flag = false;
		//   39   80:iconst_0        
		//   40   81:istore          4
					}
				}
				accessibilityevent.setScrollable(flag);
		//   41   83:aload_3         
		//   42   84:iload           4
		//   43   86:invokevirtual   #487 <Method void AccessibilityEvent.setScrollable(boolean)>
				if(q.l != null)
		//*  44   89:aload_0         
		//*  45   90:getfield        #168 <Field RecyclerView q>
		//*  46   93:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//*  47   96:ifnull          113
					accessibilityevent.setItemCount(q.l.a());
		//   48   99:aload_3         
		//   49  100:aload_0         
		//   50  101:getfield        #168 <Field RecyclerView q>
		//   51  104:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//   52  107:invokevirtual   #389 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//   53  110:invokevirtual   #490 <Method void AccessibilityEvent.setItemCount(int)>
			}
		//   54  113:return          
		}

		public void a(r r1)
		{
		//    0    0:return          
		}

		public void a(RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public void a(RecyclerView recyclerview, int i1, int j1)
		{
		//    0    0:return          
		}

		public void a(RecyclerView recyclerview, int i1, int j1, int k1)
		{
		//    0    0:return          
		}

		public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
		{
			c(recyclerview, i1, j1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #497 <Method void c(RecyclerView, int, int)>
		//    5    7:return          
		}

		public void a(RecyclerView recyclerview, n n1)
		{
			e(recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #500 <Method void e(RecyclerView)>
		//    3    5:return          
		}

		public void a(View view)
		{
			a(view, -1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_m1       
		//    3    3:invokevirtual   #503 <Method void a(View, int)>
		//    4    6:return          
		}

		public void a(View view, int i1)
		{
			a(view, i1, true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iconst_1        
		//    4    4:invokespecial   #504 <Method void a(View, int, boolean)>
		//    5    7:return          
		}

		public void a(View view, int i1, int j1)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:astore          8
			Rect rect = q.i(view);
		//    4    9:aload_0         
		//    5   10:getfield        #168 <Field RecyclerView q>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #508 <Method Rect RecyclerView.i(View)>
		//    8   17:astore          9
			int i2 = rect.left;
		//    9   19:aload           9
		//   10   21:getfield        #310 <Field int Rect.left>
		//   11   24:istore          6
			int j2 = rect.right;
		//   12   26:aload           9
		//   13   28:getfield        #344 <Field int Rect.right>
		//   14   31:istore          7
			int k1 = rect.top;
		//   15   33:aload           9
		//   16   35:getfield        #319 <Field int Rect.top>
		//   17   38:istore          4
			int l1 = rect.bottom;
		//   18   40:aload           9
		//   19   42:getfield        #347 <Field int Rect.bottom>
		//   20   45:istore          5
			i1 = a(x(), v(), z() + B() + layoutparams.leftMargin + layoutparams.rightMargin + (i1 + (i2 + j2)), layoutparams.width, d());
		//   21   47:aload_0         
		//   22   48:invokevirtual   #294 <Method int x()>
		//   23   51:aload_0         
		//   24   52:invokevirtual   #510 <Method int v()>
		//   25   55:aload_0         
		//   26   56:invokevirtual   #289 <Method int z()>
		//   27   59:aload_0         
		//   28   60:invokevirtual   #297 <Method int B()>
		//   29   63:iadd            
		//   30   64:aload           8
		//   31   66:getfield        #513 <Field int RecyclerView$LayoutParams.leftMargin>
		//   32   69:iadd            
		//   33   70:aload           8
		//   34   72:getfield        #516 <Field int RecyclerView$LayoutParams.rightMargin>
		//   35   75:iadd            
		//   36   76:iload_2         
		//   37   77:iload           6
		//   38   79:iload           7
		//   39   81:iadd            
		//   40   82:iadd            
		//   41   83:iadd            
		//   42   84:aload           8
		//   43   86:getfield        #517 <Field int RecyclerView$LayoutParams.width>
		//   44   89:aload_0         
		//   45   90:invokevirtual   #474 <Method boolean d()>
		//   46   93:invokestatic    #519 <Method int a(int, int, int, int, boolean)>
		//   47   96:istore_2        
			j1 = a(y(), w(), A() + C() + layoutparams.topMargin + layoutparams.bottomMargin + (j1 + (k1 + l1)), layoutparams.height, e());
		//   48   97:aload_0         
		//   49   98:invokevirtual   #299 <Method int y()>
		//   50  101:aload_0         
		//   51  102:invokevirtual   #521 <Method int w()>
		//   52  105:aload_0         
		//   53  106:invokevirtual   #292 <Method int A()>
		//   54  109:aload_0         
		//   55  110:invokevirtual   #302 <Method int C()>
		//   56  113:iadd            
		//   57  114:aload           8
		//   58  116:getfield        #524 <Field int RecyclerView$LayoutParams.topMargin>
		//   59  119:iadd            
		//   60  120:aload           8
		//   61  122:getfield        #527 <Field int RecyclerView$LayoutParams.bottomMargin>
		//   62  125:iadd            
		//   63  126:iload_3         
		//   64  127:iload           4
		//   65  129:iload           5
		//   66  131:iadd            
		//   67  132:iadd            
		//   68  133:iadd            
		//   69  134:aload           8
		//   70  136:getfield        #528 <Field int RecyclerView$LayoutParams.height>
		//   71  139:aload_0         
		//   72  140:invokevirtual   #387 <Method boolean e()>
		//   73  143:invokestatic    #519 <Method int a(int, int, int, int, boolean)>
		//   74  146:istore_3        
			if(b(view, i1, j1, layoutparams))
		//*  75  147:aload_0         
		//*  76  148:aload_1         
		//*  77  149:iload_2         
		//*  78  150:iload_3         
		//*  79  151:aload           8
		//*  80  153:invokevirtual   #531 <Method boolean b(View, int, int, RecyclerView$LayoutParams)>
		//*  81  156:ifeq            165
				view.measure(i1, j1);
		//   82  159:aload_1         
		//   83  160:iload_2         
		//   84  161:iload_3         
		//   85  162:invokevirtual   #534 <Method void View.measure(int, int)>
		//   86  165:return          
		}

		public void a(View view, int i1, int j1, int k1, int l1)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:astore          6
			Rect rect = layoutparams.d;
		//    4    9:aload           6
		//    5   11:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    6   14:astore          7
			view.layout(i1 + rect.left + layoutparams.leftMargin, j1 + rect.top + layoutparams.topMargin, k1 - rect.right - layoutparams.rightMargin, l1 - rect.bottom - layoutparams.bottomMargin);
		//    7   16:aload_1         
		//    8   17:iload_2         
		//    9   18:aload           7
		//   10   20:getfield        #310 <Field int Rect.left>
		//   11   23:iadd            
		//   12   24:aload           6
		//   13   26:getfield        #513 <Field int RecyclerView$LayoutParams.leftMargin>
		//   14   29:iadd            
		//   15   30:iload_3         
		//   16   31:aload           7
		//   17   33:getfield        #319 <Field int Rect.top>
		//   18   36:iadd            
		//   19   37:aload           6
		//   20   39:getfield        #524 <Field int RecyclerView$LayoutParams.topMargin>
		//   21   42:iadd            
		//   22   43:iload           4
		//   23   45:aload           7
		//   24   47:getfield        #344 <Field int Rect.right>
		//   25   50:isub            
		//   26   51:aload           6
		//   27   53:getfield        #516 <Field int RecyclerView$LayoutParams.rightMargin>
		//   28   56:isub            
		//   29   57:iload           5
		//   30   59:aload           7
		//   31   61:getfield        #347 <Field int Rect.bottom>
		//   32   64:isub            
		//   33   65:aload           6
		//   34   67:getfield        #527 <Field int RecyclerView$LayoutParams.bottomMargin>
		//   35   70:isub            
		//   36   71:invokevirtual   #541 <Method void View.layout(int, int, int, int)>
		//   37   74:return          
		}

		public void a(View view, int i1, LayoutParams layoutparams)
		{
			u u1 = RecyclerView.e(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore          4
			if(u1.q())
		//*   3    6:aload           4
		//*   4    8:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//*   5   11:ifeq            29
				q.g.e(u1);
		//    6   14:aload_0         
		//    7   15:getfield        #168 <Field RecyclerView q>
		//    8   18:getfield        #191 <Field bc android.support.v7.widget.RecyclerView.g>
		//    9   21:aload           4
		//   10   23:invokevirtual   #202 <Method void bc.e(RecyclerView$u)>
			else
		//*  11   26:goto            41
				q.g.f(u1);
		//   12   29:aload_0         
		//   13   30:getfield        #168 <Field RecyclerView q>
		//   14   33:getfield        #191 <Field bc android.support.v7.widget.RecyclerView.g>
		//   15   36:aload           4
		//   16   38:invokevirtual   #200 <Method void bc.f(RecyclerView$u)>
			p.a(view, i1, ((android.view.ViewGroup.LayoutParams) (layoutparams)), u1.q());
		//   17   41:aload_0         
		//   18   42:getfield        #143 <Field android.support.v7.widget.t p>
		//   19   45:aload_1         
		//   20   46:iload_2         
		//   21   47:aload_3         
		//   22   48:aload           4
		//   23   50:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//   24   53:invokevirtual   #276 <Method void android.support.v7.widget.t.a(View, int, android.view.ViewGroup$LayoutParams, boolean)>
		//   25   56:return          
		}

		public void a(View view, Rect rect)
		{
			android.support.v7.widget.RecyclerView.b(view, rect);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #544 <Method void android.support.v7.widget.RecyclerView.b(View, Rect)>
		//    3    5:return          
		}

		void a(View view, android.support.v4.view.a.b b1)
		{
			u u1 = RecyclerView.e(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore_3        
			if(u1 != null && !u1.q() && !p.c(u1.a))
		//*   3    5:aload_3         
		//*   4    6:ifnull          50
		//*   5    9:aload_3         
		//*   6   10:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//*   7   13:ifne            50
		//*   8   16:aload_0         
		//*   9   17:getfield        #143 <Field android.support.v7.widget.t p>
		//*  10   20:aload_3         
		//*  11   21:getfield        #281 <Field View android.support.v7.widget.RecyclerView$u.a>
		//*  12   24:invokevirtual   #360 <Method boolean t.c(View)>
		//*  13   27:ifne            50
				a(q.d, q.B, view, b1);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #168 <Field RecyclerView q>
		//   17   35:getfield        #426 <Field RecyclerView$n RecyclerView.d>
		//   18   38:aload_0         
		//   19   39:getfield        #168 <Field RecyclerView q>
		//   20   42:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//   21   45:aload_1         
		//   22   46:aload_2         
		//   23   47:invokevirtual   #547 <Method void a(RecyclerView$n, RecyclerView$r, View, android.support.v4.view.a.b)>
		//   24   50:return          
		}

		public void a(View view, n n1)
		{
			c(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #549 <Method void c(View)>
			n1.a(view);
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #412 <Method void android.support.v7.widget.RecyclerView$n.a(View)>
		//    6   10:return          
		}

		public void a(View view, boolean flag, Rect rect)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            55
			{
				Rect rect1 = ((LayoutParams)view.getLayoutParams()).d;
		//    2    4:aload_1         
		//    3    5:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    4    8:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    5   11:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    6   14:astore          4
				rect.set(-rect1.left, -rect1.top, view.getWidth() + rect1.right, view.getHeight() + rect1.bottom);
		//    7   16:aload_3         
		//    8   17:aload           4
		//    9   19:getfield        #310 <Field int Rect.left>
		//   10   22:ineg            
		//   11   23:aload           4
		//   12   25:getfield        #319 <Field int Rect.top>
		//   13   28:ineg            
		//   14   29:aload_1         
		//   15   30:invokevirtual   #553 <Method int View.getWidth()>
		//   16   33:aload           4
		//   17   35:getfield        #344 <Field int Rect.right>
		//   18   38:iadd            
		//   19   39:aload_1         
		//   20   40:invokevirtual   #556 <Method int View.getHeight()>
		//   21   43:aload           4
		//   22   45:getfield        #347 <Field int Rect.bottom>
		//   23   48:iadd            
		//   24   49:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
			} else
		//*  25   52:goto            69
			{
				rect.set(0, 0, view.getWidth(), view.getHeight());
		//   26   55:aload_3         
		//   27   56:iconst_0        
		//   28   57:iconst_0        
		//   29   58:aload_1         
		//   30   59:invokevirtual   #553 <Method int View.getWidth()>
		//   31   62:aload_1         
		//   32   63:invokevirtual   #556 <Method int View.getHeight()>
		//   33   66:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
			}
			if(q != null)
		//*  34   69:aload_0         
		//*  35   70:getfield        #168 <Field RecyclerView q>
		//*  36   73:ifnull          162
			{
				Matrix matrix = view.getMatrix();
		//   37   76:aload_1         
		//   38   77:invokevirtual   #563 <Method Matrix View.getMatrix()>
		//   39   80:astore          4
				if(matrix != null && !matrix.isIdentity())
		//*  40   82:aload           4
		//*  41   84:ifnull          162
		//*  42   87:aload           4
		//*  43   89:invokevirtual   #568 <Method boolean Matrix.isIdentity()>
		//*  44   92:ifne            162
				{
					RectF rectf = q.k;
		//   45   95:aload_0         
		//   46   96:getfield        #168 <Field RecyclerView q>
		//   47   99:getfield        #571 <Field RectF android.support.v7.widget.RecyclerView.k>
		//   48  102:astore          5
					rectf.set(rect);
		//   49  104:aload           5
		//   50  106:aload_3         
		//   51  107:invokevirtual   #576 <Method void RectF.set(Rect)>
					matrix.mapRect(rectf);
		//   52  110:aload           4
		//   53  112:aload           5
		//   54  114:invokevirtual   #580 <Method boolean Matrix.mapRect(RectF)>
		//   55  117:pop             
					rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
		//   56  118:aload_3         
		//   57  119:aload           5
		//   58  121:getfield        #582 <Field float RectF.left>
		//   59  124:f2d             
		//   60  125:invokestatic    #586 <Method double Math.floor(double)>
		//   61  128:d2i             
		//   62  129:aload           5
		//   63  131:getfield        #588 <Field float RectF.top>
		//   64  134:f2d             
		//   65  135:invokestatic    #586 <Method double Math.floor(double)>
		//   66  138:d2i             
		//   67  139:aload           5
		//   68  141:getfield        #590 <Field float RectF.right>
		//   69  144:f2d             
		//   70  145:invokestatic    #593 <Method double Math.ceil(double)>
		//   71  148:d2i             
		//   72  149:aload           5
		//   73  151:getfield        #595 <Field float RectF.bottom>
		//   74  154:f2d             
		//   75  155:invokestatic    #593 <Method double Math.ceil(double)>
		//   76  158:d2i             
		//   77  159:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
				}
			}
			rect.offset(view.getLeft(), view.getTop());
		//   78  162:aload_3         
		//   79  163:aload_1         
		//   80  164:invokevirtual   #305 <Method int View.getLeft()>
		//   81  167:aload_1         
		//   82  168:invokevirtual   #316 <Method int View.getTop()>
		//   83  171:invokevirtual   #598 <Method void Rect.offset(int, int)>
		//   84  174:return          
		}

		public void a(AccessibilityEvent accessibilityevent)
		{
			a(q.d, q.B, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #168 <Field RecyclerView q>
		//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
		//    4    8:aload_0         
		//    5    9:getfield        #168 <Field RecyclerView q>
		//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #601 <Method void a(RecyclerView$n, RecyclerView$r, AccessibilityEvent)>
		//    9   19:return          
		}

		public void a(String s1)
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				q.a(s1);
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #603 <Method void android.support.v7.widget.RecyclerView.a(String)>
		//    7   15:return          
		}

		boolean a(int i1, Bundle bundle)
		{
			return a(q.d, q.B, i1, bundle);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #168 <Field RecyclerView q>
		//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
		//    4    8:aload_0         
		//    5    9:getfield        #168 <Field RecyclerView q>
		//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #607 <Method boolean a(RecyclerView$n, RecyclerView$r, int, Bundle)>
		//   10   20:ireturn         
		}

		public boolean a(LayoutParams layoutparams)
		{
			return layoutparams != null;
		//    0    0:aload_1         
		//    1    1:ifnull          6
		//    2    4:iconst_1        
		//    3    5:ireturn         
		//    4    6:iconst_0        
		//    5    7:ireturn         
		}

		public boolean a(n n1, r r1, int i1, Bundle bundle)
		{
			if(q == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnonnull       9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			if(i1 == 4096) goto _L2; else goto _L1
		//    5    9:iload_3         
		//    6   10:sipush          4096
		//    7   13:icmpeq          102
_L1:
			if(i1 == 8192) goto _L4; else goto _L3
		//    8   16:iload_3         
		//    9   17:sipush          8192
		//   10   20:icmpeq          31
_L3:
			i1 = 0;
		//   11   23:iconst_0        
		//   12   24:istore_3        
_L6:
			int l1;
			l1 = 0;
		//   13   25:iconst_0        
		//   14   26:istore          6
			break; /* Loop/switch isn't completed */
		//   15   28:goto            168
_L4:
			int j1;
			if(q.canScrollVertically(-1))
		//*  16   31:aload_0         
		//*  17   32:getfield        #168 <Field RecyclerView q>
		//*  18   35:iconst_m1       
		//*  19   36:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*  20   39:ifeq            62
				j1 = -(y() - A() - C());
		//   21   42:aload_0         
		//   22   43:invokevirtual   #299 <Method int y()>
		//   23   46:aload_0         
		//   24   47:invokevirtual   #292 <Method int A()>
		//   25   50:isub            
		//   26   51:aload_0         
		//   27   52:invokevirtual   #302 <Method int C()>
		//   28   55:isub            
		//   29   56:ineg            
		//   30   57:istore          5
			else
		//*  31   59:goto            65
				j1 = 0;
		//   32   62:iconst_0        
		//   33   63:istore          5
			i1 = j1;
		//   34   65:iload           5
		//   35   67:istore_3        
			if(!q.canScrollHorizontally(-1))
				continue; /* Loop/switch isn't completed */
		//   36   68:aload_0         
		//   37   69:getfield        #168 <Field RecyclerView q>
		//   38   72:iconst_m1       
		//   39   73:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//   40   76:ifeq            25
			l1 = -(x() - z() - B());
		//   41   79:aload_0         
		//   42   80:invokevirtual   #294 <Method int x()>
		//   43   83:aload_0         
		//   44   84:invokevirtual   #289 <Method int z()>
		//   45   87:isub            
		//   46   88:aload_0         
		//   47   89:invokevirtual   #297 <Method int B()>
		//   48   92:isub            
		//   49   93:ineg            
		//   50   94:istore          6
			i1 = j1;
		//   51   96:iload           5
		//   52   98:istore_3        
			break; /* Loop/switch isn't completed */
		//   53   99:goto            168
_L2:
			int k1;
			if(q.canScrollVertically(1))
		//*  54  102:aload_0         
		//*  55  103:getfield        #168 <Field RecyclerView q>
		//*  56  106:iconst_1        
		//*  57  107:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
		//*  58  110:ifeq            132
				k1 = y() - A() - C();
		//   59  113:aload_0         
		//   60  114:invokevirtual   #299 <Method int y()>
		//   61  117:aload_0         
		//   62  118:invokevirtual   #292 <Method int A()>
		//   63  121:isub            
		//   64  122:aload_0         
		//   65  123:invokevirtual   #302 <Method int C()>
		//   66  126:isub            
		//   67  127:istore          5
			else
		//*  68  129:goto            135
				k1 = 0;
		//   69  132:iconst_0        
		//   70  133:istore          5
			i1 = k1;
		//   71  135:iload           5
		//   72  137:istore_3        
			if(!q.canScrollHorizontally(1))
				continue; /* Loop/switch isn't completed */
		//   73  138:aload_0         
		//   74  139:getfield        #168 <Field RecyclerView q>
		//   75  142:iconst_1        
		//   76  143:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
		//   77  146:ifeq            25
			l1 = x() - z() - B();
		//   78  149:aload_0         
		//   79  150:invokevirtual   #294 <Method int x()>
		//   80  153:aload_0         
		//   81  154:invokevirtual   #289 <Method int z()>
		//   82  157:isub            
		//   83  158:aload_0         
		//   84  159:invokevirtual   #297 <Method int B()>
		//   85  162:isub            
		//   86  163:istore          6
			i1 = k1;
		//   87  165:iload           5
		//   88  167:istore_3        
			break; /* Loop/switch isn't completed */
			if(true) goto _L6; else goto _L5
_L5:
			if(i1 == 0 && l1 == 0)
		//*  89  168:iload_3         
		//*  90  169:ifne            179
		//*  91  172:iload           6
		//*  92  174:ifne            179
			{
				return false;
		//   93  177:iconst_0        
		//   94  178:ireturn         
			} else
			{
				q.scrollBy(l1, i1);
		//   95  179:aload_0         
		//   96  180:getfield        #168 <Field RecyclerView q>
		//   97  183:iload           6
		//   98  185:iload_3         
		//   99  186:invokevirtual   #611 <Method void RecyclerView.scrollBy(int, int)>
				return true;
		//  100  189:iconst_1        
		//  101  190:ireturn         
			}
		}

		public boolean a(n n1, r r1, View view, int i1, Bundle bundle)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(RecyclerView recyclerview, r r1, View view, View view1)
		{
			return a(recyclerview, view, view1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:invokevirtual   #616 <Method boolean a(RecyclerView, View, View)>
		//    5    8:ireturn         
		}

		public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag)
		{
			return a(recyclerview, view, rect, flag, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:iconst_0        
		//    6    7:invokevirtual   #620 <Method boolean a(RecyclerView, View, Rect, boolean, boolean)>
		//    7   10:ireturn         
		}

		public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag, boolean flag1)
		{
			view = ((View) (b(recyclerview, view, rect, flag)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:invokespecial   #622 <Method int[] b(RecyclerView, View, Rect, boolean)>
		//    6    9:astore_2        
			int i1 = view[0];
		//    7   10:aload_2         
		//    8   11:iconst_0        
		//    9   12:iaload          
		//   10   13:istore          6
			int j1 = view[1];
		//   11   15:aload_2         
		//   12   16:iconst_1        
		//   13   17:iaload          
		//   14   18:istore          7
			if(flag1 && !d(recyclerview, i1, j1) || i1 == 0 && j1 == 0)
		//*  15   20:iload           5
		//*  16   22:ifeq            37
		//*  17   25:aload_0         
		//*  18   26:aload_1         
		//*  19   27:iload           6
		//*  20   29:iload           7
		//*  21   31:invokespecial   #624 <Method boolean d(RecyclerView, int, int)>
		//*  22   34:ifeq            50
		//*  23   37:iload           6
		//*  24   39:ifne            52
		//*  25   42:iload           7
		//*  26   44:ifeq            50
		//*  27   47:goto            52
				return false;
		//   28   50:iconst_0        
		//   29   51:ireturn         
			if(flag)
		//*  30   52:iload           4
		//*  31   54:ifeq            67
			{
				recyclerview.scrollBy(i1, j1);
		//   32   57:aload_1         
		//   33   58:iload           6
		//   34   60:iload           7
		//   35   62:invokevirtual   #611 <Method void RecyclerView.scrollBy(int, int)>
				return true;
		//   36   65:iconst_1        
		//   37   66:ireturn         
			} else
			{
				recyclerview.a(i1, j1);
		//   38   67:aload_1         
		//   39   68:iload           6
		//   40   70:iload           7
		//   41   72:invokevirtual   #626 <Method void android.support.v7.widget.RecyclerView.a(int, int)>
				return true;
		//   42   75:iconst_1        
		//   43   76:ireturn         
			}
		}

		public boolean a(RecyclerView recyclerview, View view, View view1)
		{
			return r() || recyclerview.o();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #629 <Method boolean r()>
		//    2    4:ifne            19
		//    3    7:aload_1         
		//    4    8:invokevirtual   #632 <Method boolean RecyclerView.o()>
		//    5   11:ifeq            17
		//    6   14:goto            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		public boolean a(RecyclerView recyclerview, ArrayList arraylist, int i1, int j1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		boolean a(View view, int i1, int j1, LayoutParams layoutparams)
		{
			return !c || !b(view.getMeasuredWidth(), i1, layoutparams.width) || !b(view.getMeasuredHeight(), j1, layoutparams.height);
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field boolean c>
		//    2    4:ifeq            44
		//    3    7:aload_1         
		//    4    8:invokevirtual   #639 <Method int View.getMeasuredWidth()>
		//    5   11:iload_2         
		//    6   12:aload           4
		//    7   14:getfield        #517 <Field int RecyclerView$LayoutParams.width>
		//    8   17:invokestatic    #641 <Method boolean b(int, int, int)>
		//    9   20:ifeq            44
		//   10   23:aload_1         
		//   11   24:invokevirtual   #644 <Method int View.getMeasuredHeight()>
		//   12   27:iload_3         
		//   13   28:aload           4
		//   14   30:getfield        #528 <Field int RecyclerView$LayoutParams.height>
		//   15   33:invokestatic    #641 <Method boolean b(int, int, int)>
		//   16   36:ifne            42
		//   17   39:goto            44
		//   18   42:iconst_0        
		//   19   43:ireturn         
		//   20   44:iconst_1        
		//   21   45:ireturn         
		}

		boolean a(View view, int i1, Bundle bundle)
		{
			return a(q.d, q.B, view, i1, bundle);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #168 <Field RecyclerView q>
		//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
		//    4    8:aload_0         
		//    5    9:getfield        #168 <Field RecyclerView q>
		//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//    7   15:aload_1         
		//    8   16:iload_2         
		//    9   17:aload_3         
		//   10   18:invokevirtual   #647 <Method boolean a(RecyclerView$n, RecyclerView$r, View, int, Bundle)>
		//   11   21:ireturn         
		}

		public boolean a(View view, boolean flag, boolean flag1)
		{
			if(r.a(view, 24579) && s.a(view, 24579))
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field bb r>
		//*   2    4:aload_1         
		//*   3    5:sipush          24579
		//*   4    8:invokevirtual   #651 <Method boolean android.support.v7.widget.bb.a(View, int)>
		//*   5   11:ifeq            33
		//*   6   14:aload_0         
		//*   7   15:getfield        #60  <Field bb s>
		//*   8   18:aload_1         
		//*   9   19:sipush          24579
		//*  10   22:invokevirtual   #651 <Method boolean android.support.v7.widget.bb.a(View, int)>
		//*  11   25:ifeq            33
				flag1 = true;
		//   12   28:iconst_1        
		//   13   29:istore_3        
			else
		//*  14   30:goto            35
				flag1 = false;
		//   15   33:iconst_0        
		//   16   34:istore_3        
			if(flag)
		//*  17   35:iload_2         
		//*  18   36:ifeq            41
				return flag1;
		//   19   39:iload_3         
		//   20   40:ireturn         
			else
				return flag1 ^ true;
		//   21   41:iload_3         
		//   22   42:iconst_1        
		//   23   43:ixor            
		//   24   44:ireturn         
		}

		public boolean a(Runnable runnable)
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          16
				return q.removeCallbacks(runnable);
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #655 <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//    7   15:ireturn         
			else
				return false;
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public int b(int i1, n n1, r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int b(n n1, r r1)
		{
			n1 = ((n) (q));
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:astore_1        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore          4
			int i1 = ((int) (flag));
		//    5    8:iload           4
		//    6   10:istore_3        
			if(n1 != null)
		//*   7   11:aload_1         
		//*   8   12:ifnull          48
			{
				if(q.l == null)
		//*   9   15:aload_0         
		//*  10   16:getfield        #168 <Field RecyclerView q>
		//*  11   19:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//*  12   22:ifnonnull       27
					return 1;
		//   13   25:iconst_1        
		//   14   26:ireturn         
				i1 = ((int) (flag));
		//   15   27:iload           4
		//   16   29:istore_3        
				if(d())
		//*  17   30:aload_0         
		//*  18   31:invokevirtual   #474 <Method boolean d()>
		//*  19   34:ifeq            48
					i1 = q.l.a();
		//   20   37:aload_0         
		//   21   38:getfield        #168 <Field RecyclerView q>
		//   22   41:getfield        #172 <Field RecyclerView$a RecyclerView.l>
		//   23   44:invokevirtual   #389 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//   24   47:istore_3        
			}
			return i1;
		//   25   48:iload_3         
		//   26   49:ireturn         
		}

		void b(n n1)
		{
			int j1 = n1.e();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #657 <Method int RecyclerView$n.e()>
		//    2    4:istore_3        
			for(int i1 = j1 - 1; i1 >= 0; i1--)
		//*   3    5:iload_3         
		//*   4    6:iconst_1        
		//*   5    7:isub            
		//*   6    8:istore_2        
		//*   7    9:iload_2         
		//*   8   10:iflt            103
			{
				View view = n1.e(i1);
		//    9   13:aload_1         
		//   10   14:iload_2         
		//   11   15:invokevirtual   #659 <Method View RecyclerView$n.e(int)>
		//   12   18:astore          4
				u u1 = RecyclerView.e(view);
		//   13   20:aload           4
		//   14   22:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//   15   25:astore          5
				if(u1.c())
		//*  16   27:aload           5
		//*  17   29:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
		//*  18   32:ifeq            38
					continue;
		//   19   35:goto            96
				u1.a(false);
		//   20   38:aload           5
		//   21   40:iconst_0        
		//   22   41:invokevirtual   #661 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
				if(u1.r())
		//*  23   44:aload           5
		//*  24   46:invokevirtual   #662 <Method boolean RecyclerView$u.r()>
		//*  25   49:ifeq            62
					q.removeDetachedView(view, false);
		//   26   52:aload_0         
		//   27   53:getfield        #168 <Field RecyclerView q>
		//   28   56:aload           4
		//   29   58:iconst_0        
		//   30   59:invokevirtual   #666 <Method void RecyclerView.removeDetachedView(View, boolean)>
				if(q.x != null)
		//*  31   62:aload_0         
		//*  32   63:getfield        #168 <Field RecyclerView q>
		//*  33   66:getfield        #669 <Field RecyclerView$e RecyclerView.x>
		//*  34   69:ifnull          84
					q.x.d(u1);
		//   35   72:aload_0         
		//   36   73:getfield        #168 <Field RecyclerView q>
		//   37   76:getfield        #669 <Field RecyclerView$e RecyclerView.x>
		//   38   79:aload           5
		//   39   81:invokevirtual   #673 <Method void RecyclerView$e.d(RecyclerView$u)>
				u1.a(true);
		//   40   84:aload           5
		//   41   86:iconst_1        
		//   42   87:invokevirtual   #661 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
				n1.b(view);
		//   43   90:aload_1         
		//   44   91:aload           4
		//   45   93:invokevirtual   #674 <Method void android.support.v7.widget.RecyclerView$n.b(View)>
			}

		//   46   96:iload_2         
		//   47   97:iconst_1        
		//   48   98:isub            
		//   49   99:istore_2        
		//*  50  100:goto            9
			n1.f();
		//   51  103:aload_1         
		//   52  104:invokevirtual   #676 <Method void RecyclerView$n.f()>
			if(j1 > 0)
		//*  53  107:iload_3         
		//*  54  108:ifle            118
				q.invalidate();
		//   55  111:aload_0         
		//   56  112:getfield        #168 <Field RecyclerView q>
		//   57  115:invokevirtual   #677 <Method void RecyclerView.invalidate()>
		//   58  118:return          
		}

		void b(RecyclerView recyclerview)
		{
			int i1;
			if(recyclerview == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       29
			{
				q = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #168 <Field RecyclerView q>
				p = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #143 <Field android.support.v7.widget.t p>
				i1 = 0;
		//    8   14:iconst_0        
		//    9   15:istore_2        
				g = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #679 <Field int g>
			} else
		//*  13   21:aload_0         
		//*  14   22:iload_2         
		//*  15   23:putfield        #681 <Field int h>
		//*  16   26:goto            58
			{
				q = recyclerview;
		//   17   29:aload_0         
		//   18   30:aload_1         
		//   19   31:putfield        #168 <Field RecyclerView q>
				p = recyclerview.f;
		//   20   34:aload_0         
		//   21   35:aload_1         
		//   22   36:getfield        #683 <Field android.support.v7.widget.t RecyclerView.f>
		//   23   39:putfield        #143 <Field android.support.v7.widget.t p>
				g = recyclerview.getWidth();
		//   24   42:aload_0         
		//   25   43:aload_1         
		//   26   44:invokevirtual   #684 <Method int RecyclerView.getWidth()>
		//   27   47:putfield        #679 <Field int g>
				i1 = recyclerview.getHeight();
		//   28   50:aload_1         
		//   29   51:invokevirtual   #685 <Method int RecyclerView.getHeight()>
		//   30   54:istore_2        
			}
			h = i1;
		//*  31   55:goto            21
			e = 0x40000000;
		//   32   58:aload_0         
		//   33   59:ldc1            #83  <Int 0x40000000>
		//   34   61:putfield        #687 <Field int e>
			f = 0x40000000;
		//   35   64:aload_0         
		//   36   65:ldc1            #83  <Int 0x40000000>
		//   37   67:putfield        #689 <Field int f>
		//   38   70:return          
		}

		public void b(RecyclerView recyclerview, int i1, int j1)
		{
		//    0    0:return          
		}

		void b(RecyclerView recyclerview, n n1)
		{
			v = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #64  <Field boolean v>
			a(recyclerview, n1);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #691 <Method void a(RecyclerView, RecyclerView$n)>
		//    7   11:return          
		}

		public void b(View view)
		{
			b(view, -1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_m1       
		//    3    3:invokevirtual   #693 <Method void b(View, int)>
		//    4    6:return          
		}

		public void b(View view, int i1)
		{
			a(view, i1, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:invokespecial   #504 <Method void a(View, int, boolean)>
		//    5    7:return          
		}

		public void b(View view, Rect rect)
		{
			if(q == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnonnull       16
			{
				rect.set(0, 0, 0, 0);
		//    3    7:aload_2         
		//    4    8:iconst_0        
		//    5    9:iconst_0        
		//    6   10:iconst_0        
		//    7   11:iconst_0        
		//    8   12:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
				return;
		//    9   15:return          
			} else
			{
				rect.set(q.i(view));
		//   10   16:aload_2         
		//   11   17:aload_0         
		//   12   18:getfield        #168 <Field RecyclerView q>
		//   13   21:aload_1         
		//   14   22:invokevirtual   #508 <Method Rect RecyclerView.i(View)>
		//   15   25:invokevirtual   #694 <Method void Rect.set(Rect)>
				return;
		//   16   28:return          
			}
		}

		public boolean b()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		boolean b(View view, int i1, int j1, LayoutParams layoutparams)
		{
			return view.isLayoutRequested() || !c || !b(view.getWidth(), i1, layoutparams.width) || !b(view.getHeight(), j1, layoutparams.height);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #697 <Method boolean View.isLayoutRequested()>
		//    2    4:ifne            51
		//    3    7:aload_0         
		//    4    8:getfield        #68  <Field boolean c>
		//    5   11:ifeq            51
		//    6   14:aload_1         
		//    7   15:invokevirtual   #553 <Method int View.getWidth()>
		//    8   18:iload_2         
		//    9   19:aload           4
		//   10   21:getfield        #517 <Field int RecyclerView$LayoutParams.width>
		//   11   24:invokestatic    #641 <Method boolean b(int, int, int)>
		//   12   27:ifeq            51
		//   13   30:aload_1         
		//   14   31:invokevirtual   #556 <Method int View.getHeight()>
		//   15   34:iload_3         
		//   16   35:aload           4
		//   17   37:getfield        #528 <Field int RecyclerView$LayoutParams.height>
		//   18   40:invokestatic    #641 <Method boolean b(int, int, int)>
		//   19   43:ifne            49
		//   20   46:goto            51
		//   21   49:iconst_0        
		//   22   50:ireturn         
		//   23   51:iconst_1        
		//   24   52:ireturn         
		}

		public int c(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Parcelable c()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public View c(int i1)
		{
			int k1 = u();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #374 <Method int u()>
		//    2    4:istore_3        
			for(int j1 = 0; j1 < k1; j1++)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iload_3         
		//*   7    9:icmpge          82
			{
				View view = h(j1);
		//    8   12:aload_0         
		//    9   13:iload_2         
		//   10   14:invokevirtual   #377 <Method View h(int)>
		//   11   17:astore          4
				u u1 = RecyclerView.e(view);
		//   12   19:aload           4
		//   13   21:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//   14   24:astore          5
				if(u1 != null && u1.d() == i1 && !u1.c() && (q.B.a() || !u1.q()))
		//*  15   26:aload           5
		//*  16   28:ifnonnull       34
		//*  17   31:goto            75
		//*  18   34:aload           5
		//*  19   36:invokevirtual   #701 <Method int RecyclerView$u.d()>
		//*  20   39:iload_1         
		//*  21   40:icmpne          75
		//*  22   43:aload           5
		//*  23   45:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
		//*  24   48:ifne            75
		//*  25   51:aload_0         
		//*  26   52:getfield        #168 <Field RecyclerView q>
		//*  27   55:getfield        #429 <Field RecyclerView$r RecyclerView.B>
		//*  28   58:invokevirtual   #705 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//*  29   61:ifne            72
		//*  30   64:aload           5
		//*  31   66:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
		//*  32   69:ifne            75
					return view;
		//   33   72:aload           4
		//   34   74:areturn         
			}

		//   35   75:iload_2         
		//   36   76:iconst_1        
		//   37   77:iadd            
		//   38   78:istore_2        
		//*  39   79:goto            7
			return null;
		//   40   82:aconst_null     
		//   41   83:areturn         
		}

		public void c(n n1)
		{
			for(int i1 = u() - 1; i1 >= 0; i1--)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #374 <Method int u()>
		//*   2    4:iconst_1        
		//*   3    5:isub            
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iflt            38
				if(!RecyclerView.e(h(i1)).c())
		//*   7   11:aload_0         
		//*   8   12:iload_2         
		//*   9   13:invokevirtual   #377 <Method View h(int)>
		//*  10   16:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
		//*  11   19:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
		//*  12   22:ifne            31
					a(i1, n1);
		//   13   25:aload_0         
		//   14   26:iload_2         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #707 <Method void a(int, RecyclerView$n)>

		//   17   31:iload_2         
		//   18   32:iconst_1        
		//   19   33:isub            
		//   20   34:istore_2        
		//*  21   35:goto            7
		//   22   38:return          
		}

		public void c(n n1, r r1)
		{
			Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
		//    0    0:ldc2            #709 <String "RecyclerView">
		//    1    3:ldc2            #711 <String "You must override onLayoutChildren(Recycler recycler, State state) ">
		//    2    6:invokestatic    #716 <Method int Log.e(String, String)>
		//    3    9:pop             
		//    4   10:return          
		}

		void c(RecyclerView recyclerview)
		{
			v = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #64  <Field boolean v>
			d(recyclerview);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #718 <Method void d(RecyclerView)>
		//    6   10:return          
		}

		public void c(RecyclerView recyclerview, int i1, int j1)
		{
		//    0    0:return          
		}

		public void c(View view)
		{
			p.a(view);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field android.support.v7.widget.t p>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #719 <Method void android.support.v7.widget.t.a(View)>
		//    4    8:return          
		}

		public void c(View view, int i1)
		{
			a(view, i1, (LayoutParams)view.getLayoutParams());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_1         
		//    4    4:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    5    7:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    6   10:invokevirtual   #721 <Method void a(View, int, RecyclerView$LayoutParams)>
		//    7   13:return          
		}

		public void c(boolean flag)
		{
			w = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #66  <Field boolean w>
		//    3    5:return          
		}

		public int d(n n1, r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int d(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int d(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).f();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:invokevirtual   #723 <Method int RecyclerView$LayoutParams.f()>
		//    4   10:ireturn         
		}

		public View d(View view, int i1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void d(int i1)
		{
		//    0    0:return          
		}

		void d(int i1, int j1)
		{
			g = android.view.View.MeasureSpec.getSize(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
		//    3    5:putfield        #679 <Field int g>
			e = android.view.View.MeasureSpec.getMode(i1);
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
		//    7   13:putfield        #687 <Field int e>
			if(e == 0 && !android.support.v7.widget.RecyclerView.b)
		//*   8   16:aload_0         
		//*   9   17:getfield        #687 <Field int e>
		//*  10   20:ifne            34
		//*  11   23:getstatic       #726 <Field boolean android.support.v7.widget.RecyclerView.b>
		//*  12   26:ifne            34
				g = 0;
		//   13   29:aload_0         
		//   14   30:iconst_0        
		//   15   31:putfield        #679 <Field int g>
			h = android.view.View.MeasureSpec.getSize(j1);
		//   16   34:aload_0         
		//   17   35:iload_2         
		//   18   36:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
		//   19   39:putfield        #681 <Field int h>
			f = android.view.View.MeasureSpec.getMode(j1);
		//   20   42:aload_0         
		//   21   43:iload_2         
		//   22   44:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
		//   23   47:putfield        #689 <Field int f>
			if(f == 0 && !android.support.v7.widget.RecyclerView.b)
		//*  24   50:aload_0         
		//*  25   51:getfield        #689 <Field int f>
		//*  26   54:ifne            68
		//*  27   57:getstatic       #726 <Field boolean android.support.v7.widget.RecyclerView.b>
		//*  28   60:ifne            68
				h = 0;
		//   29   63:aload_0         
		//   30   64:iconst_0        
		//   31   65:putfield        #681 <Field int h>
		//   32   68:return          
		}

		public void d(RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public boolean d()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int e(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public View e(View view)
		{
			if(q == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			view = q.c(view);
		//    5    9:aload_0         
		//    6   10:getfield        #168 <Field RecyclerView q>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #729 <Method View RecyclerView.c(View)>
		//    9   17:astore_1        
			if(view == null)
		//*  10   18:aload_1         
		//*  11   19:ifnonnull       24
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			if(p.c(view))
		//*  14   24:aload_0         
		//*  15   25:getfield        #143 <Field android.support.v7.widget.t p>
		//*  16   28:aload_1         
		//*  17   29:invokevirtual   #360 <Method boolean t.c(View)>
		//*  18   32:ifeq            37
				return null;
		//   19   35:aconst_null     
		//   20   36:areturn         
			else
				return view;
		//   21   37:aload_1         
		//   22   38:areturn         
		}

		void e(int i1, int j1)
		{
			int k3 = u();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #374 <Method int u()>
		//    2    4:istore          11
			if(k3 == 0)
		//*   3    6:iload           11
		//*   4    8:ifne            21
			{
				q.e(i1, j1);
		//    5   11:aload_0         
		//    6   12:getfield        #168 <Field RecyclerView q>
		//    7   15:iload_1         
		//    8   16:iload_2         
		//    9   17:invokevirtual   #439 <Method void RecyclerView.e(int, int)>
				return;
		//   10   20:return          
			}
			int l1 = 0;
		//   11   21:iconst_0        
		//   12   22:istore          4
			int i3 = 0x7fffffff;
		//   13   24:ldc2            #730 <Int 0x7fffffff>
		//   14   27:istore          9
			int j2 = 0x7fffffff;
		//   15   29:ldc2            #730 <Int 0x7fffffff>
		//   16   32:istore          6
			int k2 = 0x80000000;
		//   17   34:ldc1            #82  <Int 0x80000000>
		//   18   36:istore          7
			int k1;
			int j3;
			for(k1 = 0x80000000; l1 < k3; k1 = j3)
		//*  19   38:ldc1            #82  <Int 0x80000000>
		//*  20   40:istore_3        
		//*  21   41:iload           4
		//*  22   43:iload           11
		//*  23   45:icmpge          179
			{
				View view = h(l1);
		//   24   48:aload_0         
		//   25   49:iload           4
		//   26   51:invokevirtual   #377 <Method View h(int)>
		//   27   54:astore          12
				Rect rect = q.j;
		//   28   56:aload_0         
		//   29   57:getfield        #168 <Field RecyclerView q>
		//   30   60:getfield        #338 <Field Rect android.support.v7.widget.RecyclerView.j>
		//   31   63:astore          13
				a(view, rect);
		//   32   65:aload_0         
		//   33   66:aload           12
		//   34   68:aload           13
		//   35   70:invokevirtual   #341 <Method void a(View, Rect)>
				int i2 = i3;
		//   36   73:iload           9
		//   37   75:istore          5
				if(rect.left < i3)
		//*  38   77:aload           13
		//*  39   79:getfield        #310 <Field int Rect.left>
		//*  40   82:iload           9
		//*  41   84:icmpge          94
					i2 = rect.left;
		//   42   87:aload           13
		//   43   89:getfield        #310 <Field int Rect.left>
		//   44   92:istore          5
				int l2 = k2;
		//   45   94:iload           7
		//   46   96:istore          8
				if(rect.right > k2)
		//*  47   98:aload           13
		//*  48  100:getfield        #344 <Field int Rect.right>
		//*  49  103:iload           7
		//*  50  105:icmple          115
					l2 = rect.right;
		//   51  108:aload           13
		//   52  110:getfield        #344 <Field int Rect.right>
		//   53  113:istore          8
				k2 = j2;
		//   54  115:iload           6
		//   55  117:istore          7
				if(rect.top < j2)
		//*  56  119:aload           13
		//*  57  121:getfield        #319 <Field int Rect.top>
		//*  58  124:iload           6
		//*  59  126:icmpge          136
					k2 = rect.top;
		//   60  129:aload           13
		//   61  131:getfield        #319 <Field int Rect.top>
		//   62  134:istore          7
				j3 = k1;
		//   63  136:iload_3         
		//   64  137:istore          10
				if(rect.bottom > k1)
		//*  65  139:aload           13
		//*  66  141:getfield        #347 <Field int Rect.bottom>
		//*  67  144:iload_3         
		//*  68  145:icmple          155
					j3 = rect.bottom;
		//   69  148:aload           13
		//   70  150:getfield        #347 <Field int Rect.bottom>
		//   71  153:istore          10
				l1++;
		//   72  155:iload           4
		//   73  157:iconst_1        
		//   74  158:iadd            
		//   75  159:istore          4
				j2 = k2;
		//   76  161:iload           7
		//   77  163:istore          6
				i3 = i2;
		//   78  165:iload           5
		//   79  167:istore          9
				k2 = l2;
		//   80  169:iload           8
		//   81  171:istore          7
			}

		//   82  173:iload           10
		//   83  175:istore_3        
		//*  84  176:goto            41
			q.j.set(i3, j2, k2, k1);
		//   85  179:aload_0         
		//   86  180:getfield        #168 <Field RecyclerView q>
		//   87  183:getfield        #338 <Field Rect android.support.v7.widget.RecyclerView.j>
		//   88  186:iload           9
		//   89  188:iload           6
		//   90  190:iload           7
		//   91  192:iload_3         
		//   92  193:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
			a(q.j, i1, j1);
		//   93  196:aload_0         
		//   94  197:aload_0         
		//   95  198:getfield        #168 <Field RecyclerView q>
		//   96  201:getfield        #338 <Field Rect android.support.v7.widget.RecyclerView.j>
		//   97  204:iload_1         
		//   98  205:iload_2         
		//   99  206:invokevirtual   #732 <Method void a(Rect, int, int)>
		//  100  209:return          
		}

		public void e(RecyclerView recyclerview)
		{
		//    0    0:return          
		}

		public boolean e()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean e(n n1, r r1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int f(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int f(View view)
		{
			Rect rect = ((LayoutParams)view.getLayoutParams()).d;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:astore_2        
			return view.getMeasuredWidth() + rect.left + rect.right;
		//    5   11:aload_1         
		//    6   12:invokevirtual   #639 <Method int View.getMeasuredWidth()>
		//    7   15:aload_2         
		//    8   16:getfield        #310 <Field int Rect.left>
		//    9   19:iadd            
		//   10   20:aload_2         
		//   11   21:getfield        #344 <Field int Rect.right>
		//   12   24:iadd            
		//   13   25:ireturn         
		}

		public void f(int i1)
		{
			if(h(i1) != null)
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokevirtual   #377 <Method View h(int)>
		//*   3    5:ifnull          16
				p.a(i1);
		//    4    8:aload_0         
		//    5    9:getfield        #143 <Field android.support.v7.widget.t p>
		//    6   12:iload_1         
		//    7   13:invokevirtual   #733 <Method void android.support.v7.widget.t.a(int)>
		//    8   16:return          
		}

		public void f(int i1, int j1)
		{
			Object obj = ((Object) (h(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #377 <Method View h(int)>
		//    3    5:astore_3        
			if(obj == null)
		//*   4    6:aload_3         
		//*   5    7:ifnonnull       56
			{
				obj = ((Object) (new StringBuilder()));
		//    6   10:new             #228 <Class StringBuilder>
		//    7   13:dup             
		//    8   14:invokespecial   #229 <Method void StringBuilder()>
		//    9   17:astore_3        
				((StringBuilder) (obj)).append("Cannot move a child from non-existing index:");
		//   10   18:aload_3         
		//   11   19:ldc2            #735 <String "Cannot move a child from non-existing index:">
		//   12   22:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
		//   13   25:pop             
				((StringBuilder) (obj)).append(i1);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokevirtual   #241 <Method StringBuilder StringBuilder.append(int)>
		//   17   31:pop             
				((StringBuilder) (obj)).append(q.toString());
		//   18   32:aload_3         
		//   19   33:aload_0         
		//   20   34:getfield        #168 <Field RecyclerView q>
		//   21   37:invokevirtual   #736 <Method String RecyclerView.toString()>
		//   22   40:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
		//   23   43:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		//   24   44:new             #738 <Class IllegalArgumentException>
		//   25   47:dup             
		//   26   48:aload_3         
		//   27   49:invokevirtual   #249 <Method String StringBuilder.toString()>
		//   28   52:invokespecial   #739 <Method void IllegalArgumentException(String)>
		//   29   55:athrow          
			} else
			{
				g(i1);
		//   30   56:aload_0         
		//   31   57:iload_1         
		//   32   58:invokevirtual   #185 <Method void g(int)>
				c(((View) (obj)), j1);
		//   33   61:aload_0         
		//   34   62:aload_3         
		//   35   63:iload_2         
		//   36   64:invokevirtual   #741 <Method void c(View, int)>
				return;
		//   37   67:return          
			}
		}

		void f(RecyclerView recyclerview)
		{
			d(android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getHeight(), 0x40000000));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #684 <Method int RecyclerView.getWidth()>
		//    3    5:ldc1            #83  <Int 0x40000000>
		//    4    7:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//    5   10:aload_1         
		//    6   11:invokevirtual   #685 <Method int RecyclerView.getHeight()>
		//    7   14:ldc1            #83  <Int 0x40000000>
		//    8   16:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//    9   19:invokevirtual   #743 <Method void d(int, int)>
		//   10   22:return          
		}

		public int g(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int g(View view)
		{
			Rect rect = ((LayoutParams)view.getLayoutParams()).d;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:astore_2        
			return view.getMeasuredHeight() + rect.top + rect.bottom;
		//    5   11:aload_1         
		//    6   12:invokevirtual   #644 <Method int View.getMeasuredHeight()>
		//    7   15:aload_2         
		//    8   16:getfield        #319 <Field int Rect.top>
		//    9   19:iadd            
		//   10   20:aload_2         
		//   11   21:getfield        #347 <Field int Rect.bottom>
		//   12   24:iadd            
		//   13   25:ireturn         
		}

		public void g(int i1)
		{
			a(i1, h(i1));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_0         
		//    3    3:iload_1         
		//    4    4:invokevirtual   #377 <Method View h(int)>
		//    5    7:invokespecial   #745 <Method void a(int, View)>
		//    6   10:return          
		}

		public void g(int i1, int j1)
		{
			android.support.v7.widget.RecyclerView.a(q, i1, j1);
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #747 <Method void android.support.v7.widget.RecyclerView.a(RecyclerView, int, int)>
		//    5    9:return          
		}

		public int h(r r1)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int h(View view)
		{
			return view.getLeft() - n(view);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #305 <Method int View.getLeft()>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #749 <Method int n(View)>
		//    5    9:isub            
		//    6   10:ireturn         
		}

		public View h(int i1)
		{
			if(p != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #143 <Field android.support.v7.widget.t p>
		//*   2    4:ifnull          16
				return p.b(i1);
		//    3    7:aload_0         
		//    4    8:getfield        #143 <Field android.support.v7.widget.t p>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #751 <Method View android.support.v7.widget.t.b(int)>
		//    7   15:areturn         
			else
				return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
		}

		public int i(View view)
		{
			return view.getTop() - l(view);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #316 <Method int View.getTop()>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #753 <Method int l(View)>
		//    5    9:isub            
		//    6   10:ireturn         
		}

		public void i(int i1)
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				q.e(i1);
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #754 <Method void RecyclerView.e(int)>
		//    7   15:return          
		}

		public int j(View view)
		{
			return view.getRight() + o(view);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #757 <Method int View.getRight()>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #759 <Method int o(View)>
		//    5    9:iadd            
		//    6   10:ireturn         
		}

		public void j(int i1)
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				q.d(i1);
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #761 <Method void RecyclerView.d(int)>
		//    7   15:return          
		}

		public int k(View view)
		{
			return view.getBottom() + m(view);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #764 <Method int View.getBottom()>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #766 <Method int m(View)>
		//    5    9:iadd            
		//    6   10:ireturn         
		}

		public void k(int i1)
		{
		//    0    0:return          
		}

		boolean k()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int l(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).d.top;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:getfield        #319 <Field int Rect.top>
		//    5   13:ireturn         
		}

		public int m(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).d.bottom;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:getfield        #347 <Field int Rect.bottom>
		//    5   13:ireturn         
		}

		public int n(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).d.left;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:getfield        #310 <Field int Rect.left>
		//    5   13:ireturn         
		}

		public void n()
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          14
				q.requestLayout();
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:invokevirtual   #769 <Method void RecyclerView.requestLayout()>
		//    6   14:return          
		}

		public int o(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).d.right;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
		//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
		//    4   10:getfield        #344 <Field int Rect.right>
		//    5   13:ireturn         
		}

		public final boolean o()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field boolean d>
		//    2    4:ireturn         
		}

		public boolean p()
		{
			return v;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean v>
		//    2    4:ireturn         
		}

		public boolean q()
		{
			return q != null && q.h;
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:getfield        #771 <Field boolean android.support.v7.widget.RecyclerView.h>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public boolean r()
		{
			return t != null && t.c();
		//    0    0:aload_0         
		//    1    1:getfield        #197 <Field RecyclerView$q t>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #197 <Field RecyclerView$q t>
		//    5   11:invokevirtual   #266 <Method boolean RecyclerView$q.c()>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public int s()
		{
			return android.support.v4.view.s.e(((View) (q)));
		//    0    0:aload_0         
		//    1    1:getfield        #168 <Field RecyclerView q>
		//    2    4:invokestatic    #773 <Method int s.e(View)>
		//    3    7:ireturn         
		}

		public int t()
		{
			return -1;
		//    0    0:iconst_m1       
		//    1    1:ireturn         
		}

		public int u()
		{
			if(p != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #143 <Field android.support.v7.widget.t p>
		//*   2    4:ifnull          15
				return p.b();
		//    3    7:aload_0         
		//    4    8:getfield        #143 <Field android.support.v7.widget.t p>
		//    5   11:invokevirtual   #226 <Method int android.support.v7.widget.t.b()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public int v()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #687 <Field int e>
		//    2    4:ireturn         
		}

		public int w()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #689 <Field int f>
		//    2    4:ireturn         
		}

		public int x()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #679 <Field int g>
		//    2    4:ireturn         
		}

		public int y()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #681 <Field int h>
		//    2    4:ireturn         
		}

		public int z()
		{
			if(q != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #168 <Field RecyclerView q>
		//*   2    4:ifnull          15
				return q.getPaddingLeft();
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field RecyclerView q>
		//    5   11:invokevirtual   #776 <Method int RecyclerView.getPaddingLeft()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		private final bb.b a = new _cls1(this);
		private final bb.b b = new _cls2(this);
		private boolean c;
		private boolean d;
		private int e;
		private int f;
		private int g;
		private int h;
		android.support.v7.widget.t p;
		RecyclerView q;
		bb r;
		bb s;
		q t;
		boolean u;
		boolean v;
		boolean w;
		int x;
		boolean y;

		public h()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #9   <Class RecyclerView$h$1>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #46  <Method void RecyclerView$h$1(RecyclerView$h)>
		//    7   13:putfield        #48  <Field bb$b a>
		//    8   16:aload_0         
		//    9   17:new             #11  <Class RecyclerView$h$2>
		//   10   20:dup             
		//   11   21:aload_0         
		//   12   22:invokespecial   #49  <Method void RecyclerView$h$2(RecyclerView$h)>
		//   13   25:putfield        #51  <Field bb$b b>
			r = new bb(a);
		//   14   28:aload_0         
		//   15   29:new             #53  <Class bb>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:getfield        #48  <Field bb$b a>
		//   19   37:invokespecial   #56  <Method void bb(bb$b)>
		//   20   40:putfield        #58  <Field bb r>
			s = new bb(b);
		//   21   43:aload_0         
		//   22   44:new             #53  <Class bb>
		//   23   47:dup             
		//   24   48:aload_0         
		//   25   49:getfield        #51  <Field bb$b b>
		//   26   52:invokespecial   #56  <Method void bb(bb$b)>
		//   27   55:putfield        #60  <Field bb s>
			u = false;
		//   28   58:aload_0         
		//   29   59:iconst_0        
		//   30   60:putfield        #62  <Field boolean u>
			v = false;
		//   31   63:aload_0         
		//   32   64:iconst_0        
		//   33   65:putfield        #64  <Field boolean v>
			w = false;
		//   34   68:aload_0         
		//   35   69:iconst_0        
		//   36   70:putfield        #66  <Field boolean w>
			c = true;
		//   37   73:aload_0         
		//   38   74:iconst_1        
		//   39   75:putfield        #68  <Field boolean c>
			d = true;
		//   40   78:aload_0         
		//   41   79:iconst_1        
		//   42   80:putfield        #70  <Field boolean d>
		//   43   83:return          
		}
	}

	public static interface h.a
	{

		public abstract void b(int i1, int j1);
	}

	public static class h.b
	{

		public int a;
		public int b;
		public boolean c;
		public boolean d;

		public h.b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface i
	{

		public abstract void a(View view);

		public abstract void b(View view);
	}

	public static abstract class j
	{

		public abstract boolean a(int i1, int j1);
	}

	public static interface k
	{

		public abstract void a(boolean flag);

		public abstract boolean a(RecyclerView recyclerview, MotionEvent motionevent);

		public abstract void b(RecyclerView recyclerview, MotionEvent motionevent);
	}

	public static abstract class l
	{

		public void a(RecyclerView recyclerview, int i1)
		{
		//    0    0:return          
		}

		public void a(RecyclerView recyclerview, int i1, int j1)
		{
		//    0    0:return          
		}

		public l()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class m
	{

		private a b(int i1)
		{
			a a2 = (a)a.get(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SparseArray a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #9   <Class RecyclerView$m$a>
		//    5   11:astore_3        
			a a1 = a2;
		//    6   12:aload_3         
		//    7   13:astore_2        
			if(a2 == null)
		//*   8   14:aload_3         
		//*   9   15:ifnonnull       35
			{
				a1 = new a();
		//   10   18:new             #9   <Class RecyclerView$m$a>
		//   11   21:dup             
		//   12   22:invokespecial   #32  <Method void RecyclerView$m$a()>
		//   13   25:astore_2        
				a.put(i1, ((Object) (a1)));
		//   14   26:aload_0         
		//   15   27:getfield        #23  <Field SparseArray a>
		//   16   30:iload_1         
		//   17   31:aload_2         
		//   18   32:invokevirtual   #36  <Method void SparseArray.put(int, Object)>
			}
			return a1;
		//   19   35:aload_2         
		//   20   36:areturn         
		}

		long a(long l1, long l2)
		{
			if(l1 == 0L)
		//*   0    0:lload_1         
		//*   1    1:lconst_0        
		//*   2    2:lcmp            
		//*   3    3:ifne            8
				return l2;
		//    4    6:lload_3         
		//    5    7:lreturn         
			else
				return (l1 / 4L) * 3L + l2 / 4L;
		//    6    8:lload_1         
		//    7    9:ldc2w           #38  <Long 4L>
		//    8   12:ldiv            
		//    9   13:ldc2w           #40  <Long 3L>
		//   10   16:lmul            
		//   11   17:lload_3         
		//   12   18:ldc2w           #38  <Long 4L>
		//   13   21:ldiv            
		//   14   22:ladd            
		//   15   23:lreturn         
		}

		public u a(int i1)
		{
			Object obj = ((Object) ((a)a.get(i1)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SparseArray a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #9   <Class RecyclerView$m$a>
		//    5   11:astore_2        
			if(obj != null && !((a) (obj)).a.isEmpty())
		//*   6   12:aload_2         
		//*   7   13:ifnull          45
		//*   8   16:aload_2         
		//*   9   17:getfield        #45  <Field ArrayList android.support.v7.widget.RecyclerView$m$a.a>
		//*  10   20:invokevirtual   #51  <Method boolean ArrayList.isEmpty()>
		//*  11   23:ifne            45
			{
				obj = ((Object) (((a) (obj)).a));
		//   12   26:aload_2         
		//   13   27:getfield        #45  <Field ArrayList android.support.v7.widget.RecyclerView$m$a.a>
		//   14   30:astore_2        
				return (u)((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1);
		//   15   31:aload_2         
		//   16   32:aload_2         
		//   17   33:invokevirtual   #55  <Method int ArrayList.size()>
		//   18   36:iconst_1        
		//   19   37:isub            
		//   20   38:invokevirtual   #58  <Method Object ArrayList.remove(int)>
		//   21   41:checkcast       #60  <Class RecyclerView$u>
		//   22   44:areturn         
			} else
			{
				return null;
		//   23   45:aconst_null     
		//   24   46:areturn         
			}
		}

		public void a()
		{
			for(int i1 = 0; i1 < a.size(); i1++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:getfield        #23  <Field SparseArray a>
		//*   5    7:invokevirtual   #61  <Method int SparseArray.size()>
		//*   6   10:icmpge          37
				((a)a.valueAt(i1)).a.clear();
		//    7   13:aload_0         
		//    8   14:getfield        #23  <Field SparseArray a>
		//    9   17:iload_1         
		//   10   18:invokevirtual   #64  <Method Object SparseArray.valueAt(int)>
		//   11   21:checkcast       #9   <Class RecyclerView$m$a>
		//   12   24:getfield        #45  <Field ArrayList android.support.v7.widget.RecyclerView$m$a.a>
		//   13   27:invokevirtual   #67  <Method void ArrayList.clear()>

		//   14   30:iload_1         
		//   15   31:iconst_1        
		//   16   32:iadd            
		//   17   33:istore_1        
		//*  18   34:goto            2
		//   19   37:return          
		}

		void a(int i1, long l1)
		{
			a a1 = b(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
		//    3    5:astore          4
			a1.c = a(a1.c, l1);
		//    4    7:aload           4
		//    5    9:aload_0         
		//    6   10:aload           4
		//    7   12:getfield        #74  <Field long RecyclerView$m$a.c>
		//    8   15:lload_2         
		//    9   16:invokevirtual   #76  <Method long a(long, long)>
		//   10   19:putfield        #74  <Field long RecyclerView$m$a.c>
		//   11   22:return          
		}

		void a(a a1)
		{
			b = b + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #25  <Field int b>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #25  <Field int b>
		//    6   10:return          
		}

		void a(a a1, a a2, boolean flag)
		{
			if(a1 != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          8
				b();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #80  <Method void b()>
			if(!flag && b == 0)
		//*   4    8:iload_3         
		//*   5    9:ifne            23
		//*   6   12:aload_0         
		//*   7   13:getfield        #25  <Field int b>
		//*   8   16:ifne            23
				a();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #82  <Method void a()>
			if(a2 != null)
		//*  11   23:aload_2         
		//*  12   24:ifnull          32
				a(a2);
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #84  <Method void a(RecyclerView$a)>
		//   16   32:return          
		}

		public void a(u u1)
		{
			int i1 = u1.h();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #88  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//    2    4:istore_2        
			ArrayList arraylist = b(i1).a;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:invokespecial   #70  <Method RecyclerView$m$a b(int)>
		//    6   10:getfield        #45  <Field ArrayList android.support.v7.widget.RecyclerView$m$a.a>
		//    7   13:astore_3        
			if(((a)a.get(i1)).b <= arraylist.size())
		//*   8   14:aload_0         
		//*   9   15:getfield        #23  <Field SparseArray a>
		//*  10   18:iload_2         
		//*  11   19:invokevirtual   #31  <Method Object SparseArray.get(int)>
		//*  12   22:checkcast       #9   <Class RecyclerView$m$a>
		//*  13   25:getfield        #89  <Field int android.support.v7.widget.RecyclerView$m$a.b>
		//*  14   28:aload_3         
		//*  15   29:invokevirtual   #55  <Method int ArrayList.size()>
		//*  16   32:icmpgt          36
			{
				return;
		//   17   35:return          
			} else
			{
				u1.v();
		//   18   36:aload_1         
		//   19   37:invokevirtual   #92  <Method void RecyclerView$u.v()>
				arraylist.add(((Object) (u1)));
		//   20   40:aload_3         
		//   21   41:aload_1         
		//   22   42:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
		//   23   45:pop             
				return;
		//   24   46:return          
			}
		}

		boolean a(int i1, long l1, long l2)
		{
			long l3 = b(i1).c;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
		//    3    5:getfield        #74  <Field long RecyclerView$m$a.c>
		//    4    8:lstore          6
			return l3 == 0L || l1 + l3 < l2;
		//    5   10:lload           6
		//    6   12:lconst_0        
		//    7   13:lcmp            
		//    8   14:ifeq            32
		//    9   17:lload_2         
		//   10   18:lload           6
		//   11   20:ladd            
		//   12   21:lload           4
		//   13   23:lcmp            
		//   14   24:ifge            30
		//   15   27:goto            32
		//   16   30:iconst_0        
		//   17   31:ireturn         
		//   18   32:iconst_1        
		//   19   33:ireturn         
		}

		void b()
		{
			b = b - 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #25  <Field int b>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #25  <Field int b>
		//    6   10:return          
		}

		void b(int i1, long l1)
		{
			a a1 = b(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
		//    3    5:astore          4
			a1.d = a(a1.d, l1);
		//    4    7:aload           4
		//    5    9:aload_0         
		//    6   10:aload           4
		//    7   12:getfield        #100 <Field long RecyclerView$m$a.d>
		//    8   15:lload_2         
		//    9   16:invokevirtual   #76  <Method long a(long, long)>
		//   10   19:putfield        #100 <Field long RecyclerView$m$a.d>
		//   11   22:return          
		}

		boolean b(int i1, long l1, long l2)
		{
			long l3 = b(i1).d;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
		//    3    5:getfield        #100 <Field long RecyclerView$m$a.d>
		//    4    8:lstore          6
			return l3 == 0L || l1 + l3 < l2;
		//    5   10:lload           6
		//    6   12:lconst_0        
		//    7   13:lcmp            
		//    8   14:ifeq            32
		//    9   17:lload_2         
		//   10   18:lload           6
		//   11   20:ladd            
		//   12   21:lload           4
		//   13   23:lcmp            
		//   14   24:ifge            30
		//   15   27:goto            32
		//   16   30:iconst_0        
		//   17   31:ireturn         
		//   18   32:iconst_1        
		//   19   33:ireturn         
		}

		SparseArray a;
		private int b;

		public m()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			a = new SparseArray();
		//    2    4:aload_0         
		//    3    5:new             #20  <Class SparseArray>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void SparseArray()>
		//    6   12:putfield        #23  <Field SparseArray a>
			b = 0;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #25  <Field int b>
		//   10   20:return          
		}
	}

	static class m.a
	{

		ArrayList a;
		int b;
		long c;
		long d;

		m.a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			a = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #23  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void ArrayList()>
		//    6   12:putfield        #26  <Field ArrayList a>
			b = 5;
		//    7   15:aload_0         
		//    8   16:iconst_5        
		//    9   17:putfield        #28  <Field int b>
			c = 0L;
		//   10   20:aload_0         
		//   11   21:lconst_0        
		//   12   22:putfield        #30  <Field long c>
			d = 0L;
		//   13   25:aload_0         
		//   14   26:lconst_0        
		//   15   27:putfield        #32  <Field long d>
		//   16   30:return          
		}
	}

	public final class n
	{

		private void a(ViewGroup viewgroup, boolean flag)
		{
			for(int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #60  <Method int ViewGroup.getChildCount()>
		//*   2    4:iconst_1        
		//*   3    5:isub            
		//*   4    6:istore_3        
		//*   5    7:iload_3         
		//*   6    8:iflt            43
			{
				View view = viewgroup.getChildAt(i1);
		//    7   11:aload_1         
		//    8   12:iload_3         
		//    9   13:invokevirtual   #64  <Method View ViewGroup.getChildAt(int)>
		//   10   16:astore          4
				if(view instanceof ViewGroup)
		//*  11   18:aload           4
		//*  12   20:instanceof      #56  <Class ViewGroup>
		//*  13   23:ifeq            36
					a((ViewGroup)view, true);
		//   14   26:aload_0         
		//   15   27:aload           4
		//   16   29:checkcast       #56  <Class ViewGroup>
		//   17   32:iconst_1        
		//   18   33:invokespecial   #66  <Method void a(ViewGroup, boolean)>
			}

		//   19   36:iload_3         
		//   20   37:iconst_1        
		//   21   38:isub            
		//   22   39:istore_3        
		//*  23   40:goto            7
			if(!flag)
		//*  24   43:iload_2         
		//*  25   44:ifne            48
				return;
		//   26   47:return          
			if(viewgroup.getVisibility() == 4)
		//*  27   48:aload_1         
		//*  28   49:invokevirtual   #69  <Method int ViewGroup.getVisibility()>
		//*  29   52:iconst_4        
		//*  30   53:icmpne          67
			{
				viewgroup.setVisibility(0);
		//   31   56:aload_1         
		//   32   57:iconst_0        
		//   33   58:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
				viewgroup.setVisibility(4);
		//   34   61:aload_1         
		//   35   62:iconst_4        
		//   36   63:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
				return;
		//   37   66:return          
			} else
			{
				int j1 = viewgroup.getVisibility();
		//   38   67:aload_1         
		//   39   68:invokevirtual   #69  <Method int ViewGroup.getVisibility()>
		//   40   71:istore_3        
				viewgroup.setVisibility(4);
		//   41   72:aload_1         
		//   42   73:iconst_4        
		//   43   74:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
				viewgroup.setVisibility(j1);
		//   44   77:aload_1         
		//   45   78:iload_3         
		//   46   79:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
				return;
		//   47   82:return          
			}
		}

		private boolean a(u u1, int i1, int j1, long l1)
		{
			u1.m = f;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field RecyclerView f>
		//    3    5:putfield        #79  <Field RecyclerView RecyclerView$u.m>
			int k1 = u1.h();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #81  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//    6   12:istore          6
			long l2 = f.getNanoTime();
		//    7   14:aload_0         
		//    8   15:getfield        #28  <Field RecyclerView f>
		//    9   18:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
		//   10   21:lstore          7
			if(l1 != 0xffffffffL && !e.b(k1, l2, l1))
		//*  11   23:lload           4
		//*  12   25:ldc2w           #86  <Long 0xffffffffL>
		//*  13   28:lcmp            
		//*  14   29:ifeq            50
		//*  15   32:aload_0         
		//*  16   33:getfield        #89  <Field RecyclerView$m e>
		//*  17   36:iload           6
		//*  18   38:lload           7
		//*  19   40:lload           4
		//*  20   42:invokevirtual   #94  <Method boolean android.support.v7.widget.RecyclerView$m.b(int, long, long)>
		//*  21   45:ifne            50
				return false;
		//   22   48:iconst_0        
		//   23   49:ireturn         
			f.l.b(u1, i1);
		//   24   50:aload_0         
		//   25   51:getfield        #28  <Field RecyclerView f>
		//   26   54:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//   27   57:aload_1         
		//   28   58:iload_2         
		//   29   59:invokevirtual   #103 <Method void android.support.v7.widget.RecyclerView$a.b(RecyclerView$u, int)>
			l1 = f.getNanoTime();
		//   30   62:aload_0         
		//   31   63:getfield        #28  <Field RecyclerView f>
		//   32   66:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
		//   33   69:lstore          4
			e.b(u1.h(), l1 - l2);
		//   34   71:aload_0         
		//   35   72:getfield        #89  <Field RecyclerView$m e>
		//   36   75:aload_1         
		//   37   76:invokevirtual   #81  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//   38   79:lload           4
		//   39   81:lload           7
		//   40   83:lsub            
		//   41   84:invokevirtual   #106 <Method void android.support.v7.widget.RecyclerView$m.b(int, long)>
			e(u1);
		//   42   87:aload_0         
		//   43   88:aload_1         
		//   44   89:invokespecial   #109 <Method void e(RecyclerView$u)>
			if(f.B.a())
		//*  45   92:aload_0         
		//*  46   93:getfield        #28  <Field RecyclerView f>
		//*  47   96:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*  48   99:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//*  49  102:ifeq            110
				u1.g = j1;
		//   50  105:aload_1         
		//   51  106:iload_3         
		//   52  107:putfield        #120 <Field int android.support.v7.widget.RecyclerView$u.g>
			return true;
		//   53  110:iconst_1        
		//   54  111:ireturn         
		}

		private void e(u u1)
		{
			if(f.n())
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field RecyclerView f>
		//*   2    4:invokevirtual   #122 <Method boolean RecyclerView.n()>
		//*   3    7:ifeq            55
			{
				View view = u1.a;
		//    4   10:aload_1         
		//    5   11:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//    6   14:astore_2        
				if(android.support.v4.view.s.d(view) == 0)
		//*   7   15:aload_2         
		//*   8   16:invokestatic    #130 <Method int s.d(View)>
		//*   9   19:ifne            27
					android.support.v4.view.s.a(view, 1);
		//   10   22:aload_2         
		//   11   23:iconst_1        
		//   12   24:invokestatic    #133 <Method void s.a(View, int)>
				if(!android.support.v4.view.s.a(view))
		//*  13   27:aload_2         
		//*  14   28:invokestatic    #136 <Method boolean s.a(View)>
		//*  15   31:ifne            55
				{
					u1.b(16384);
		//   16   34:aload_1         
		//   17   35:sipush          16384
		//   18   38:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					android.support.v4.view.s.a(view, f.F.c());
		//   19   41:aload_2         
		//   20   42:aload_0         
		//   21   43:getfield        #28  <Field RecyclerView f>
		//   22   46:getfield        #142 <Field ai RecyclerView.F>
		//   23   49:invokevirtual   #147 <Method android.support.v4.view.a ai.c()>
		//   24   52:invokestatic    #150 <Method void s.a(View, android.support.v4.view.a)>
				}
			}
		//   25   55:return          
		}

		private void f(u u1)
		{
			if(u1.a instanceof ViewGroup)
		//*   0    0:aload_1         
		//*   1    1:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//*   2    4:instanceof      #56  <Class ViewGroup>
		//*   3    7:ifeq            22
				a((ViewGroup)u1.a, false);
		//    4   10:aload_0         
		//    5   11:aload_1         
		//    6   12:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//    7   15:checkcast       #56  <Class ViewGroup>
		//    8   18:iconst_0        
		//    9   19:invokespecial   #66  <Method void a(ViewGroup, boolean)>
		//   10   22:return          
		}

		u a(int i1, boolean flag, long l1)
		{
			int k1;
			boolean flag2;
			Object obj;
			Object obj1;
label0:
			{
				if(i1 < 0 || i1 >= f.B.e())
		//*   0    0:iload_1         
		//*   1    1:iflt            1062
		//*   2    4:iload_1         
		//*   3    5:aload_0         
		//*   4    6:getfield        #28  <Field RecyclerView f>
		//*   5    9:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*   6   12:invokevirtual   #153 <Method int RecyclerView$r.e()>
		//*   7   15:icmplt          21
					break MISSING_BLOCK_LABEL_1062;
		//    8   18:goto            1062
				boolean flag3 = f.B.a();
		//    9   21:aload_0         
		//   10   22:getfield        #28  <Field RecyclerView f>
		//   11   25:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//   12   28:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//   13   31:istore          10
				flag2 = true;
		//   14   33:iconst_1        
		//   15   34:istore          9
				u u1;
				if(flag3)
		//*  16   36:iload           10
		//*  17   38:ifeq            63
				{
					obj1 = ((Object) (f(i1)));
		//   18   41:aload_0         
		//   19   42:iload_1         
		//   20   43:invokevirtual   #156 <Method RecyclerView$u f(int)>
		//   21   46:astore          16
					u1 = ((u) (obj1));
		//   22   48:aload           16
		//   23   50:astore          15
					if(obj1 != null)
		//*  24   52:aload           16
		//*  25   54:ifnull          66
					{
						k1 = 1;
		//   26   57:iconst_1        
		//   27   58:istore          6
						break label0;
		//   28   60:goto            73
					}
				} else
				{
					u1 = null;
		//   29   63:aconst_null     
		//   30   64:astore          15
				}
				k1 = 0;
		//   31   66:iconst_0        
		//   32   67:istore          6
				obj1 = ((Object) (u1));
		//   33   69:aload           15
		//   34   71:astore          16
			}
label1:
			{
				obj = obj1;
		//   35   73:aload           16
		//   36   75:astore          15
				boolean flag1 = ((boolean) (k1));
		//   37   77:iload           6
		//   38   79:istore          5
				if(obj1 == null)
		//*  39   81:aload           16
		//*  40   83:ifnonnull       191
				{
					obj1 = ((Object) (b(i1, flag)));
		//   41   86:aload_0         
		//   42   87:iload_1         
		//   43   88:iload_2         
		//   44   89:invokevirtual   #159 <Method RecyclerView$u b(int, boolean)>
		//   45   92:astore          16
					obj = obj1;
		//   46   94:aload           16
		//   47   96:astore          15
					flag1 = ((boolean) (k1));
		//   48   98:iload           6
		//   49  100:istore          5
					if(obj1 != null)
		//*  50  102:aload           16
		//*  51  104:ifnull          191
						if(!a(((u) (obj1))))
		//*  52  107:aload_0         
		//*  53  108:aload           16
		//*  54  110:invokevirtual   #162 <Method boolean a(RecyclerView$u)>
		//*  55  113:ifne            184
						{
							if(!flag)
		//*  56  116:iload_2         
		//*  57  117:ifne            174
							{
								((u) (obj1)).b(4);
		//   58  120:aload           16
		//   59  122:iconst_4        
		//   60  123:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
								if(((u) (obj1)).i())
		//*  61  126:aload           16
		//*  62  128:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
		//*  63  131:ifeq            155
								{
									f.removeDetachedView(((u) (obj1)).a, false);
		//   64  134:aload_0         
		//   65  135:getfield        #28  <Field RecyclerView f>
		//   66  138:aload           16
		//   67  140:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//   68  143:iconst_0        
		//   69  144:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
									((u) (obj1)).j();
		//   70  147:aload           16
		//   71  149:invokevirtual   #171 <Method void android.support.v7.widget.RecyclerView$u.j()>
								} else
		//*  72  152:goto            168
								if(((u) (obj1)).k())
		//*  73  155:aload           16
		//*  74  157:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  75  160:ifeq            168
									((u) (obj1)).l();
		//   76  163:aload           16
		//   77  165:invokevirtual   #176 <Method void RecyclerView$u.l()>
								b(((u) (obj1)));
		//   78  168:aload_0         
		//   79  169:aload           16
		//   80  171:invokevirtual   #178 <Method void b(RecyclerView$u)>
							}
							obj = null;
		//   81  174:aconst_null     
		//   82  175:astore          15
							flag1 = ((boolean) (k1));
		//   83  177:iload           6
		//   84  179:istore          5
						} else
		//*  85  181:goto            191
						{
							flag1 = true;
		//   86  184:iconst_1        
		//   87  185:istore          5
							obj = obj1;
		//   88  187:aload           16
		//   89  189:astore          15
						}
				}
				Object obj2 = obj;
		//   90  191:aload           15
		//   91  193:astore          17
				int i2 = ((int) (flag1));
		//   92  195:iload           5
		//   93  197:istore          7
				if(obj == null)
		//*  94  199:aload           15
		//*  95  201:ifnonnull       761
				{
					i2 = f.e.b(i1);
		//   96  204:aload_0         
		//   97  205:getfield        #28  <Field RecyclerView f>
		//   98  208:getfield        #181 <Field e RecyclerView.e>
		//   99  211:iload_1         
		//  100  212:invokevirtual   #186 <Method int android.support.v7.widget.e.b(int)>
		//  101  215:istore          7
					if(i2 >= 0 && i2 < f.l.a())
		//* 102  217:iload           7
		//* 103  219:iflt            659
		//* 104  222:iload           7
		//* 105  224:aload_0         
		//* 106  225:getfield        #28  <Field RecyclerView f>
		//* 107  228:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//* 108  231:invokevirtual   #188 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//* 109  234:icmplt          240
		//* 110  237:goto            659
					{
						int j2 = f.l.b(i2);
		//  111  240:aload_0         
		//  112  241:getfield        #28  <Field RecyclerView f>
		//  113  244:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//  114  247:iload           7
		//  115  249:invokevirtual   #189 <Method int android.support.v7.widget.RecyclerView$a.b(int)>
		//  116  252:istore          8
						obj1 = obj;
		//  117  254:aload           15
		//  118  256:astore          16
						k1 = ((int) (flag1));
		//  119  258:iload           5
		//  120  260:istore          6
						if(f.l.d())
		//* 121  262:aload_0         
		//* 122  263:getfield        #28  <Field RecyclerView f>
		//* 123  266:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//* 124  269:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
		//* 125  272:ifeq            323
						{
							obj = ((Object) (a(f.l.a(i2), j2, flag)));
		//  126  275:aload_0         
		//  127  276:aload_0         
		//  128  277:getfield        #28  <Field RecyclerView f>
		//  129  280:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//  130  283:iload           7
		//  131  285:invokevirtual   #194 <Method long android.support.v7.widget.RecyclerView$a.a(int)>
		//  132  288:iload           8
		//  133  290:iload_2         
		//  134  291:invokevirtual   #197 <Method RecyclerView$u a(long, int, boolean)>
		//  135  294:astore          15
							obj1 = obj;
		//  136  296:aload           15
		//  137  298:astore          16
							k1 = ((int) (flag1));
		//  138  300:iload           5
		//  139  302:istore          6
							if(obj != null)
		//* 140  304:aload           15
		//* 141  306:ifnull          323
							{
								obj.c = i2;
		//  142  309:aload           15
		//  143  311:iload           7
		//  144  313:putfield        #199 <Field int RecyclerView$u.c>
								k1 = 1;
		//  145  316:iconst_1        
		//  146  317:istore          6
								obj1 = obj;
		//  147  319:aload           15
		//  148  321:astore          16
							}
						}
						obj = obj1;
		//  149  323:aload           16
		//  150  325:astore          15
						if(obj1 == null)
		//* 151  327:aload           16
		//* 152  329:ifnonnull       479
						{
							obj = obj1;
		//  153  332:aload           16
		//  154  334:astore          15
							if(i != null)
		//* 155  336:aload_0         
		//* 156  337:getfield        #201 <Field RecyclerView$s i>
		//* 157  340:ifnull          479
							{
								obj2 = ((Object) (i.a(this, i1, j2)));
		//  158  343:aload_0         
		//  159  344:getfield        #201 <Field RecyclerView$s i>
		//  160  347:aload_0         
		//  161  348:iload_1         
		//  162  349:iload           8
		//  163  351:invokevirtual   #206 <Method View android.support.v7.widget.RecyclerView$s.a(RecyclerView$n, int, int)>
		//  164  354:astore          17
								obj = obj1;
		//  165  356:aload           16
		//  166  358:astore          15
								if(obj2 != null)
		//* 167  360:aload           17
		//* 168  362:ifnull          479
								{
									obj1 = ((Object) (f.b(((View) (obj2)))));
		//  169  365:aload_0         
		//  170  366:getfield        #28  <Field RecyclerView f>
		//  171  369:aload           17
		//  172  371:invokevirtual   #209 <Method RecyclerView$u android.support.v7.widget.RecyclerView.b(View)>
		//  173  374:astore          16
									if(obj1 == null)
		//* 174  376:aload           16
		//* 175  378:ifnonnull       424
									{
										obj = ((Object) (new StringBuilder()));
		//  176  381:new             #211 <Class StringBuilder>
		//  177  384:dup             
		//  178  385:invokespecial   #212 <Method void StringBuilder()>
		//  179  388:astore          15
										((StringBuilder) (obj)).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
		//  180  390:aload           15
		//  181  392:ldc1            #214 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
		//  182  394:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  183  397:pop             
										((StringBuilder) (obj)).append(f.a());
		//  184  398:aload           15
		//  185  400:aload_0         
		//  186  401:getfield        #28  <Field RecyclerView f>
		//  187  404:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//  188  407:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  189  410:pop             
										throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		//  190  411:new             #223 <Class IllegalArgumentException>
		//  191  414:dup             
		//  192  415:aload           15
		//  193  417:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  194  420:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//  195  423:athrow          
									}
									obj = obj1;
		//  196  424:aload           16
		//  197  426:astore          15
									if(((u) (obj1)).c())
		//* 198  428:aload           16
		//* 199  430:invokevirtual   #231 <Method boolean RecyclerView$u.c()>
		//* 200  433:ifeq            479
									{
										obj = ((Object) (new StringBuilder()));
		//  201  436:new             #211 <Class StringBuilder>
		//  202  439:dup             
		//  203  440:invokespecial   #212 <Method void StringBuilder()>
		//  204  443:astore          15
										((StringBuilder) (obj)).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
		//  205  445:aload           15
		//  206  447:ldc1            #233 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
		//  207  449:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  208  452:pop             
										((StringBuilder) (obj)).append(f.a());
		//  209  453:aload           15
		//  210  455:aload_0         
		//  211  456:getfield        #28  <Field RecyclerView f>
		//  212  459:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//  213  462:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  214  465:pop             
										throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		//  215  466:new             #223 <Class IllegalArgumentException>
		//  216  469:dup             
		//  217  470:aload           15
		//  218  472:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  219  475:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//  220  478:athrow          
									}
								}
							}
						}
						obj1 = obj;
		//  221  479:aload           15
		//  222  481:astore          16
						if(obj == null)
		//* 223  483:aload           15
		//* 224  485:ifnonnull       533
						{
							obj = ((Object) (g().a(j2)));
		//  225  488:aload_0         
		//  226  489:invokevirtual   #236 <Method RecyclerView$m g()>
		//  227  492:iload           8
		//  228  494:invokevirtual   #238 <Method RecyclerView$u android.support.v7.widget.RecyclerView$m.a(int)>
		//  229  497:astore          15
							obj1 = obj;
		//  230  499:aload           15
		//  231  501:astore          16
							if(obj != null)
		//* 232  503:aload           15
		//* 233  505:ifnull          533
							{
								((u) (obj)).v();
		//  234  508:aload           15
		//  235  510:invokevirtual   #241 <Method void RecyclerView$u.v()>
								obj1 = obj;
		//  236  513:aload           15
		//  237  515:astore          16
								if(android.support.v7.widget.RecyclerView.a)
		//* 238  517:getstatic       #244 <Field boolean android.support.v7.widget.RecyclerView.a>
		//* 239  520:ifeq            533
								{
									f(((u) (obj)));
		//  240  523:aload_0         
		//  241  524:aload           15
		//  242  526:invokespecial   #246 <Method void f(RecyclerView$u)>
									obj1 = obj;
		//  243  529:aload           15
		//  244  531:astore          16
								}
							}
						}
						obj2 = obj1;
		//  245  533:aload           16
		//  246  535:astore          17
						i2 = k1;
		//  247  537:iload           6
		//  248  539:istore          7
						if(obj1 == null)
		//* 249  541:aload           16
		//* 250  543:ifnonnull       761
						{
							long l2 = f.getNanoTime();
		//  251  546:aload_0         
		//  252  547:getfield        #28  <Field RecyclerView f>
		//  253  550:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
		//  254  553:lstore          11
							if(l1 != 0xffffffffL && !e.a(j2, l2, l1))
		//* 255  555:lload_3         
		//* 256  556:ldc2w           #86  <Long 0xffffffffL>
		//* 257  559:lcmp            
		//* 258  560:ifeq            580
		//* 259  563:aload_0         
		//* 260  564:getfield        #89  <Field RecyclerView$m e>
		//* 261  567:iload           8
		//* 262  569:lload           11
		//* 263  571:lload_3         
		//* 264  572:invokevirtual   #248 <Method boolean android.support.v7.widget.RecyclerView$m.a(int, long, long)>
		//* 265  575:ifne            580
								return null;
		//  266  578:aconst_null     
		//  267  579:areturn         
							obj = ((Object) (f.l.c(((ViewGroup) (f)), j2)));
		//  268  580:aload_0         
		//  269  581:getfield        #28  <Field RecyclerView f>
		//  270  584:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//  271  587:aload_0         
		//  272  588:getfield        #28  <Field RecyclerView f>
		//  273  591:iload           8
		//  274  593:invokevirtual   #251 <Method RecyclerView$u RecyclerView$a.c(ViewGroup, int)>
		//  275  596:astore          15
							if(RecyclerView.z())
		//* 276  598:invokestatic    #254 <Method boolean RecyclerView.z()>
		//* 277  601:ifeq            633
							{
								obj1 = ((Object) (android.support.v7.widget.RecyclerView.j(((u) (obj)).a)));
		//  278  604:aload           15
		//  279  606:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//  280  609:invokestatic    #257 <Method RecyclerView android.support.v7.widget.RecyclerView.j(View)>
		//  281  612:astore          16
								if(obj1 != null)
		//* 282  614:aload           16
		//* 283  616:ifnull          633
									obj.b = new WeakReference(obj1);
		//  284  619:aload           15
		//  285  621:new             #259 <Class WeakReference>
		//  286  624:dup             
		//  287  625:aload           16
		//  288  627:invokespecial   #262 <Method void WeakReference(Object)>
		//  289  630:putfield        #265 <Field WeakReference android.support.v7.widget.RecyclerView$u.b>
							}
							long l3 = f.getNanoTime();
		//  290  633:aload_0         
		//  291  634:getfield        #28  <Field RecyclerView f>
		//  292  637:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
		//  293  640:lstore          13
							e.a(j2, l3 - l2);
		//  294  642:aload_0         
		//  295  643:getfield        #89  <Field RecyclerView$m e>
		//  296  646:iload           8
		//  297  648:lload           13
		//  298  650:lload           11
		//  299  652:lsub            
		//  300  653:invokevirtual   #267 <Method void android.support.v7.widget.RecyclerView$m.a(int, long)>
							break label1;
		//  301  656:goto            769
						}
					} else
					{
						obj = ((Object) (new StringBuilder()));
		//  302  659:new             #211 <Class StringBuilder>
		//  303  662:dup             
		//  304  663:invokespecial   #212 <Method void StringBuilder()>
		//  305  666:astore          15
						((StringBuilder) (obj)).append("Inconsistency detected. Invalid item position ");
		//  306  668:aload           15
		//  307  670:ldc2            #269 <String "Inconsistency detected. Invalid item position ">
		//  308  673:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  309  676:pop             
						((StringBuilder) (obj)).append(i1);
		//  310  677:aload           15
		//  311  679:iload_1         
		//  312  680:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  313  683:pop             
						((StringBuilder) (obj)).append("(offset:");
		//  314  684:aload           15
		//  315  686:ldc2            #274 <String "(offset:">
		//  316  689:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  317  692:pop             
						((StringBuilder) (obj)).append(i2);
		//  318  693:aload           15
		//  319  695:iload           7
		//  320  697:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  321  700:pop             
						((StringBuilder) (obj)).append(").");
		//  322  701:aload           15
		//  323  703:ldc2            #276 <String ").">
		//  324  706:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  325  709:pop             
						((StringBuilder) (obj)).append("state:");
		//  326  710:aload           15
		//  327  712:ldc2            #278 <String "state:">
		//  328  715:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  329  718:pop             
						((StringBuilder) (obj)).append(f.B.e());
		//  330  719:aload           15
		//  331  721:aload_0         
		//  332  722:getfield        #28  <Field RecyclerView f>
		//  333  725:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//  334  728:invokevirtual   #153 <Method int RecyclerView$r.e()>
		//  335  731:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  336  734:pop             
						((StringBuilder) (obj)).append(f.a());
		//  337  735:aload           15
		//  338  737:aload_0         
		//  339  738:getfield        #28  <Field RecyclerView f>
		//  340  741:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//  341  744:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  342  747:pop             
						throw new IndexOutOfBoundsException(((StringBuilder) (obj)).toString());
		//  343  748:new             #280 <Class IndexOutOfBoundsException>
		//  344  751:dup             
		//  345  752:aload           15
		//  346  754:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  347  757:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
		//  348  760:athrow          
					}
				}
				obj = obj2;
		//  349  761:aload           17
		//  350  763:astore          15
				k1 = i2;
		//  351  765:iload           7
		//  352  767:istore          6
			}
label2:
			{
label3:
				{
					if(k1 != 0 && !f.B.a() && ((u) (obj)).a(8192))
		//* 353  769:iload           6
		//* 354  771:ifeq            870
		//* 355  774:aload_0         
		//* 356  775:getfield        #28  <Field RecyclerView f>
		//* 357  778:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//* 358  781:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//* 359  784:ifne            870
		//* 360  787:aload           15
		//* 361  789:sipush          8192
		//* 362  792:invokevirtual   #284 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
		//* 363  795:ifeq            870
					{
						((u) (obj)).a(0, 8192);
		//  364  798:aload           15
		//  365  800:iconst_0        
		//  366  801:sipush          8192
		//  367  804:invokevirtual   #287 <Method void android.support.v7.widget.RecyclerView$u.a(int, int)>
						if(f.B.i)
		//* 368  807:aload_0         
		//* 369  808:getfield        #28  <Field RecyclerView f>
		//* 370  811:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//* 371  814:getfield        #289 <Field boolean RecyclerView$r.i>
		//* 372  817:ifeq            870
						{
							int j1 = e.e(((u) (obj)));
		//  373  820:aload           15
		//  374  822:invokestatic    #294 <Method int RecyclerView$e.e(RecyclerView$u)>
		//  375  825:istore          5
							obj1 = ((Object) (f.x.a(f.B, ((u) (obj)), j1 | 0x1000, ((u) (obj)).u())));
		//  376  827:aload_0         
		//  377  828:getfield        #28  <Field RecyclerView f>
		//  378  831:getfield        #298 <Field RecyclerView$e RecyclerView.x>
		//  379  834:aload_0         
		//  380  835:getfield        #28  <Field RecyclerView f>
		//  381  838:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//  382  841:aload           15
		//  383  843:iload           5
		//  384  845:sipush          4096
		//  385  848:ior             
		//  386  849:aload           15
		//  387  851:invokevirtual   #302 <Method List RecyclerView$u.u()>
		//  388  854:invokevirtual   #305 <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e.a(RecyclerView$r, RecyclerView$u, int, List)>
		//  389  857:astore          16
							f.a(((u) (obj)), ((e.c) (obj1)));
		//  390  859:aload_0         
		//  391  860:getfield        #28  <Field RecyclerView f>
		//  392  863:aload           15
		//  393  865:aload           16
		//  394  867:invokevirtual   #308 <Method void android.support.v7.widget.RecyclerView.a(RecyclerView$u, RecyclerView$e$c)>
						}
					}
					if(f.B.a() && ((u) (obj)).p())
		//* 395  870:aload_0         
		//* 396  871:getfield        #28  <Field RecyclerView f>
		//* 397  874:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//* 398  877:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//* 399  880:ifeq            900
		//* 400  883:aload           15
		//* 401  885:invokevirtual   #311 <Method boolean RecyclerView$u.p()>
		//* 402  888:ifeq            900
						obj.g = i1;
		//  403  891:aload           15
		//  404  893:iload_1         
		//  405  894:putfield        #120 <Field int android.support.v7.widget.RecyclerView$u.g>
					else
		//* 406  897:goto            927
					if(!((u) (obj)).p() || ((u) (obj)).o() || ((u) (obj)).n())
		//* 407  900:aload           15
		//* 408  902:invokevirtual   #311 <Method boolean RecyclerView$u.p()>
		//* 409  905:ifeq            932
		//* 410  908:aload           15
		//* 411  910:invokevirtual   #314 <Method boolean RecyclerView$u.o()>
		//* 412  913:ifne            932
		//* 413  916:aload           15
		//* 414  918:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
		//* 415  921:ifeq            927
						break label3;
		//  416  924:goto            932
					flag = false;
		//  417  927:iconst_0        
		//  418  928:istore_2        
					break label2;
		//  419  929:goto            952
				}
				flag = a(((u) (obj)), f.e.b(i1), i1, l1);
		//  420  932:aload_0         
		//  421  933:aload           15
		//  422  935:aload_0         
		//  423  936:getfield        #28  <Field RecyclerView f>
		//  424  939:getfield        #181 <Field e RecyclerView.e>
		//  425  942:iload_1         
		//  426  943:invokevirtual   #186 <Method int android.support.v7.widget.e.b(int)>
		//  427  946:iload_1         
		//  428  947:lload_3         
		//  429  948:invokespecial   #317 <Method boolean a(RecyclerView$u, int, int, long)>
		//  430  951:istore_2        
			}
			obj1 = ((Object) (((u) (obj)).a.getLayoutParams()));
		//  431  952:aload           15
		//  432  954:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//  433  957:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//  434  960:astore          16
			if(obj1 != null) goto _L2; else goto _L1
		//  435  962:aload           16
		//  436  964:ifnonnull       996
_L1:
			obj1 = ((Object) (f.generateDefaultLayoutParams()));
		//  437  967:aload_0         
		//  438  968:getfield        #28  <Field RecyclerView f>
		//  439  971:invokevirtual   #326 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
		//  440  974:astore          16
_L4:
			obj1 = ((Object) ((LayoutParams)obj1));
		//  441  976:aload           16
		//  442  978:checkcast       #328 <Class RecyclerView$LayoutParams>
		//  443  981:astore          16
			((u) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
		//  444  983:aload           15
		//  445  985:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//  446  988:aload           16
		//  447  990:invokevirtual   #332 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			break MISSING_BLOCK_LABEL_1029;
		//  448  993:goto            1029
_L2:
			if(f.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
				break; /* Loop/switch isn't completed */
		//  449  996:aload_0         
		//  450  997:getfield        #28  <Field RecyclerView f>
		//  451 1000:aload           16
		//  452 1002:invokevirtual   #336 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
		//  453 1005:ifne            1022
			obj1 = ((Object) (f.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)))));
		//  454 1008:aload_0         
		//  455 1009:getfield        #28  <Field RecyclerView f>
		//  456 1012:aload           16
		//  457 1014:invokevirtual   #340 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
		//  458 1017:astore          16
			if(true) goto _L4; else goto _L3
		//  459 1019:goto            976
_L3:
			obj1 = ((Object) ((LayoutParams)obj1));
		//  460 1022:aload           16
		//  461 1024:checkcast       #328 <Class RecyclerView$LayoutParams>
		//  462 1027:astore          16
			obj1.c = ((u) (obj));
		//  463 1029:aload           16
		//  464 1031:aload           15
		//  465 1033:putfield        #343 <Field RecyclerView$u RecyclerView$LayoutParams.c>
			if(k1 != 0 && flag)
		//* 466 1036:iload           6
		//* 467 1038:ifeq            1051
		//* 468 1041:iload_2         
		//* 469 1042:ifeq            1051
				flag = flag2;
		//  470 1045:iload           9
		//  471 1047:istore_2        
			else
		//* 472 1048:goto            1053
				flag = false;
		//  473 1051:iconst_0        
		//  474 1052:istore_2        
			obj1.f = flag;
		//  475 1053:aload           16
		//  476 1055:iload_2         
		//  477 1056:putfield        #345 <Field boolean RecyclerView$LayoutParams.f>
			return ((u) (obj));
		//  478 1059:aload           15
		//  479 1061:areturn         
			StringBuilder stringbuilder = new StringBuilder();
		//  480 1062:new             #211 <Class StringBuilder>
		//  481 1065:dup             
		//  482 1066:invokespecial   #212 <Method void StringBuilder()>
		//  483 1069:astore          15
			stringbuilder.append("Invalid item position ");
		//  484 1071:aload           15
		//  485 1073:ldc2            #347 <String "Invalid item position ">
		//  486 1076:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  487 1079:pop             
			stringbuilder.append(i1);
		//  488 1080:aload           15
		//  489 1082:iload_1         
		//  490 1083:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  491 1086:pop             
			stringbuilder.append("(");
		//  492 1087:aload           15
		//  493 1089:ldc2            #349 <String "(">
		//  494 1092:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  495 1095:pop             
			stringbuilder.append(i1);
		//  496 1096:aload           15
		//  497 1098:iload_1         
		//  498 1099:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  499 1102:pop             
			stringbuilder.append("). Item count:");
		//  500 1103:aload           15
		//  501 1105:ldc2            #351 <String "). Item count:">
		//  502 1108:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  503 1111:pop             
			stringbuilder.append(f.B.e());
		//  504 1112:aload           15
		//  505 1114:aload_0         
		//  506 1115:getfield        #28  <Field RecyclerView f>
		//  507 1118:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//  508 1121:invokevirtual   #153 <Method int RecyclerView$r.e()>
		//  509 1124:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//  510 1127:pop             
			stringbuilder.append(f.a());
		//  511 1128:aload           15
		//  512 1130:aload_0         
		//  513 1131:getfield        #28  <Field RecyclerView f>
		//  514 1134:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//  515 1137:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  516 1140:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
		//  517 1141:new             #280 <Class IndexOutOfBoundsException>
		//  518 1144:dup             
		//  519 1145:aload           15
		//  520 1147:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  521 1150:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
		//  522 1153:athrow          
		}

		u a(long l1, int i1, boolean flag)
		{
			for(int j1 = a.size() - 1; j1 >= 0; j1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field ArrayList a>
		//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore          5
		//*   6   11:iload           5
		//*   7   13:iflt            142
			{
				u u1 = (u)a.get(j1);
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field ArrayList a>
		//   10   20:iload           5
		//   11   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   12   25:checkcast       #76  <Class RecyclerView$u>
		//   13   28:astore          6
				if(u1.g() != l1 || u1.k())
					continue;
		//   14   30:aload           6
		//   15   32:invokevirtual   #360 <Method long android.support.v7.widget.RecyclerView$u.g()>
		//   16   35:lload_1         
		//   17   36:lcmp            
		//   18   37:ifne            133
		//   19   40:aload           6
		//   20   42:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//   21   45:ifne            133
				if(i1 == u1.h())
		//*  22   48:iload_3         
		//*  23   49:aload           6
		//*  24   51:invokevirtual   #81  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//*  25   54:icmpne          96
				{
					u1.b(32);
		//   26   57:aload           6
		//   27   59:bipush          32
		//   28   61:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					if(u1.q() && !f.B.a())
		//*  29   64:aload           6
		//*  30   66:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
		//*  31   69:ifeq            93
		//*  32   72:aload_0         
		//*  33   73:getfield        #28  <Field RecyclerView f>
		//*  34   76:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*  35   79:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//*  36   82:ifne            93
						u1.a(2, 14);
		//   37   85:aload           6
		//   38   87:iconst_2        
		//   39   88:bipush          14
		//   40   90:invokevirtual   #287 <Method void android.support.v7.widget.RecyclerView$u.a(int, int)>
					return u1;
		//   41   93:aload           6
		//   42   95:areturn         
				}
				if(!flag)
		//*  43   96:iload           4
		//*  44   98:ifne            133
				{
					a.remove(j1);
		//   45  101:aload_0         
		//   46  102:getfield        #36  <Field ArrayList a>
		//   47  105:iload           5
		//   48  107:invokevirtual   #366 <Method Object ArrayList.remove(int)>
		//   49  110:pop             
					f.removeDetachedView(u1.a, false);
		//   50  111:aload_0         
		//   51  112:getfield        #28  <Field RecyclerView f>
		//   52  115:aload           6
		//   53  117:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//   54  120:iconst_0        
		//   55  121:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
					b(u1.a);
		//   56  124:aload_0         
		//   57  125:aload           6
		//   58  127:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//   59  130:invokevirtual   #369 <Method void b(View)>
				}
			}

		//   60  133:iload           5
		//   61  135:iconst_1        
		//   62  136:isub            
		//   63  137:istore          5
		//*  64  139:goto            11
			for(int k1 = c.size() - 1; k1 >= 0; k1--)
		//*  65  142:aload_0         
		//*  66  143:getfield        #40  <Field ArrayList c>
		//*  67  146:invokevirtual   #354 <Method int ArrayList.size()>
		//*  68  149:iconst_1        
		//*  69  150:isub            
		//*  70  151:istore          5
		//*  71  153:iload           5
		//*  72  155:iflt            231
			{
				u u2 = (u)c.get(k1);
		//   73  158:aload_0         
		//   74  159:getfield        #40  <Field ArrayList c>
		//   75  162:iload           5
		//   76  164:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   77  167:checkcast       #76  <Class RecyclerView$u>
		//   78  170:astore          6
				if(u2.g() != l1)
					continue;
		//   79  172:aload           6
		//   80  174:invokevirtual   #360 <Method long android.support.v7.widget.RecyclerView$u.g()>
		//   81  177:lload_1         
		//   82  178:lcmp            
		//   83  179:ifne            222
				if(i1 == u2.h())
		//*  84  182:iload_3         
		//*  85  183:aload           6
		//*  86  185:invokevirtual   #81  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//*  87  188:icmpne          209
				{
					if(!flag)
		//*  88  191:iload           4
		//*  89  193:ifne            206
						c.remove(k1);
		//   90  196:aload_0         
		//   91  197:getfield        #40  <Field ArrayList c>
		//   92  200:iload           5
		//   93  202:invokevirtual   #366 <Method Object ArrayList.remove(int)>
		//   94  205:pop             
					return u2;
		//   95  206:aload           6
		//   96  208:areturn         
				}
				if(!flag)
		//*  97  209:iload           4
		//*  98  211:ifne            222
				{
					d(k1);
		//   99  214:aload_0         
		//  100  215:iload           5
		//  101  217:invokevirtual   #371 <Method void d(int)>
					return null;
		//  102  220:aconst_null     
		//  103  221:areturn         
				}
			}

		//  104  222:iload           5
		//  105  224:iconst_1        
		//  106  225:isub            
		//  107  226:istore          5
		//* 108  228:goto            153
			return null;
		//  109  231:aconst_null     
		//  110  232:areturn         
		}

		View a(int i1, boolean flag)
		{
			return a(i1, flag, 0xffffffffL).a;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:ldc2w           #86  <Long 0xffffffffL>
		//    4    6:invokevirtual   #374 <Method RecyclerView$u a(int, boolean, long)>
		//    5    9:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//    6   12:areturn         
		}

		public void a()
		{
			a.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ArrayList a>
		//    2    4:invokevirtual   #377 <Method void ArrayList.clear()>
			d();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #379 <Method void d()>
		//    5   11:return          
		}

		public void a(int i1)
		{
			h = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #50  <Field int h>
			b();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #381 <Method void b()>
		//    5    9:return          
		}

		void a(int i1, int j1)
		{
			int k1;
			int l1;
			byte byte0;
			if(i1 < j1)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmpge          16
			{
				k1 = i1;
		//    3    5:iload_1         
		//    4    6:istore_3        
				l1 = j1;
		//    5    7:iload_2         
		//    6    8:istore          4
				byte0 = -1;
		//    7   10:iconst_m1       
		//    8   11:istore          5
			} else
		//*   9   13:goto            24
			{
				l1 = i1;
		//   10   16:iload_1         
		//   11   17:istore          4
				k1 = j1;
		//   12   19:iload_2         
		//   13   20:istore_3        
				byte0 = 1;
		//   14   21:iconst_1        
		//   15   22:istore          5
			}
			int j2 = c.size();
		//   16   24:aload_0         
		//   17   25:getfield        #40  <Field ArrayList c>
		//   18   28:invokevirtual   #354 <Method int ArrayList.size()>
		//   19   31:istore          7
			for(int i2 = 0; i2 < j2; i2++)
		//*  20   33:iconst_0        
		//*  21   34:istore          6
		//*  22   36:iload           6
		//*  23   38:iload           7
		//*  24   40:icmpge          122
			{
				u u1 = (u)c.get(i2);
		//   25   43:aload_0         
		//   26   44:getfield        #40  <Field ArrayList c>
		//   27   47:iload           6
		//   28   49:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   29   52:checkcast       #76  <Class RecyclerView$u>
		//   30   55:astore          8
				if(u1 == null || u1.c < k1 || u1.c > l1)
		//*  31   57:aload           8
		//*  32   59:ifnull          113
		//*  33   62:aload           8
		//*  34   64:getfield        #199 <Field int RecyclerView$u.c>
		//*  35   67:iload_3         
		//*  36   68:icmplt          113
		//*  37   71:aload           8
		//*  38   73:getfield        #199 <Field int RecyclerView$u.c>
		//*  39   76:iload           4
		//*  40   78:icmple          84
					continue;
		//   41   81:goto            113
				if(u1.c == i1)
		//*  42   84:aload           8
		//*  43   86:getfield        #199 <Field int RecyclerView$u.c>
		//*  44   89:iload_1         
		//*  45   90:icmpne          105
					u1.a(j1 - i1, false);
		//   46   93:aload           8
		//   47   95:iload_2         
		//   48   96:iload_1         
		//   49   97:isub            
		//   50   98:iconst_0        
		//   51   99:invokevirtual   #384 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
				else
		//*  52  102:goto            113
					u1.a(((int) (byte0)), false);
		//   53  105:aload           8
		//   54  107:iload           5
		//   55  109:iconst_0        
		//   56  110:invokevirtual   #384 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
			}

		//   57  113:iload           6
		//   58  115:iconst_1        
		//   59  116:iadd            
		//   60  117:istore          6
		//*  61  119:goto            36
		//   62  122:return          
		}

		void a(int i1, int j1, boolean flag)
		{
			for(int k1 = c.size() - 1; k1 >= 0; k1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field ArrayList c>
		//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore          4
		//*   6   11:iload           4
		//*   7   13:iflt            88
			{
				u u1 = (u)c.get(k1);
		//    8   16:aload_0         
		//    9   17:getfield        #40  <Field ArrayList c>
		//   10   20:iload           4
		//   11   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   12   25:checkcast       #76  <Class RecyclerView$u>
		//   13   28:astore          5
				if(u1 == null)
					continue;
		//   14   30:aload           5
		//   15   32:ifnull          79
				if(u1.c >= i1 + j1)
		//*  16   35:aload           5
		//*  17   37:getfield        #199 <Field int RecyclerView$u.c>
		//*  18   40:iload_1         
		//*  19   41:iload_2         
		//*  20   42:iadd            
		//*  21   43:icmplt          57
				{
					u1.a(-j1, flag);
		//   22   46:aload           5
		//   23   48:iload_2         
		//   24   49:ineg            
		//   25   50:iload_3         
		//   26   51:invokevirtual   #384 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
					continue;
		//   27   54:goto            79
				}
				if(u1.c >= i1)
		//*  28   57:aload           5
		//*  29   59:getfield        #199 <Field int RecyclerView$u.c>
		//*  30   62:iload_1         
		//*  31   63:icmplt          79
				{
					u1.b(8);
		//   32   66:aload           5
		//   33   68:bipush          8
		//   34   70:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					d(k1);
		//   35   73:aload_0         
		//   36   74:iload           4
		//   37   76:invokevirtual   #371 <Method void d(int)>
				}
			}

		//   38   79:iload           4
		//   39   81:iconst_1        
		//   40   82:isub            
		//   41   83:istore          4
		//*  42   85:goto            11
		//   43   88:return          
		}

		void a(a a1, a a2, boolean flag)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #388 <Method void a()>
			g().a(a1, a2, flag);
		//    2    4:aload_0         
		//    3    5:invokevirtual   #236 <Method RecyclerView$m g()>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:iload_3         
		//    7   11:invokevirtual   #390 <Method void android.support.v7.widget.RecyclerView$m.a(RecyclerView$a, RecyclerView$a, boolean)>
		//    8   14:return          
		}

		void a(m m1)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field RecyclerView$m e>
		//*   2    4:ifnull          14
				e.b();
		//    3    7:aload_0         
		//    4    8:getfield        #89  <Field RecyclerView$m e>
		//    5   11:invokevirtual   #392 <Method void android.support.v7.widget.RecyclerView$m.b()>
			e = m1;
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:putfield        #89  <Field RecyclerView$m e>
			if(m1 != null)
		//*   9   19:aload_1         
		//*  10   20:ifnull          37
				e.a(f.getAdapter());
		//   11   23:aload_0         
		//   12   24:getfield        #89  <Field RecyclerView$m e>
		//   13   27:aload_0         
		//   14   28:getfield        #28  <Field RecyclerView f>
		//   15   31:invokevirtual   #396 <Method RecyclerView$a RecyclerView.getAdapter()>
		//   16   34:invokevirtual   #399 <Method void android.support.v7.widget.RecyclerView$m.a(RecyclerView$a)>
		//   17   37:return          
		}

		void a(s s1)
		{
			i = s1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #201 <Field RecyclerView$s i>
		//    3    5:return          
		}

		void a(u u1, boolean flag)
		{
			RecyclerView.c(u1);
		//    0    0:aload_1         
		//    1    1:invokestatic    #403 <Method void RecyclerView.c(RecyclerView$u)>
			if(u1.a(16384))
		//*   2    4:aload_1         
		//*   3    5:sipush          16384
		//*   4    8:invokevirtual   #284 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
		//*   5   11:ifeq            30
			{
				u1.a(0, 16384);
		//    6   14:aload_1         
		//    7   15:iconst_0        
		//    8   16:sipush          16384
		//    9   19:invokevirtual   #287 <Method void android.support.v7.widget.RecyclerView$u.a(int, int)>
				android.support.v4.view.s.a(u1.a, ((android.support.v4.view.a) (null)));
		//   10   22:aload_1         
		//   11   23:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//   12   26:aconst_null     
		//   13   27:invokestatic    #150 <Method void s.a(View, android.support.v4.view.a)>
			}
			if(flag)
		//*  14   30:iload_2         
		//*  15   31:ifeq            39
				d(u1);
		//   16   34:aload_0         
		//   17   35:aload_1         
		//   18   36:invokevirtual   #405 <Method void d(RecyclerView$u)>
			u1.m = null;
		//   19   39:aload_1         
		//   20   40:aconst_null     
		//   21   41:putfield        #79  <Field RecyclerView RecyclerView$u.m>
			g().a(u1);
		//   22   44:aload_0         
		//   23   45:invokevirtual   #236 <Method RecyclerView$m g()>
		//   24   48:aload_1         
		//   25   49:invokevirtual   #407 <Method void android.support.v7.widget.RecyclerView$m.a(RecyclerView$u)>
		//   26   52:return          
		}

		public void a(View view)
		{
			u u1 = RecyclerView.e(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore_2        
			if(u1.r())
		//*   3    5:aload_2         
		//*   4    6:invokevirtual   #412 <Method boolean RecyclerView$u.r()>
		//*   5    9:ifeq            21
				f.removeDetachedView(view, false);
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field RecyclerView f>
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
			if(u1.i())
		//*  11   21:aload_2         
		//*  12   22:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
		//*  13   25:ifeq            35
				u1.j();
		//   14   28:aload_2         
		//   15   29:invokevirtual   #171 <Method void android.support.v7.widget.RecyclerView$u.j()>
			else
		//*  16   32:goto            46
			if(u1.k())
		//*  17   35:aload_2         
		//*  18   36:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  19   39:ifeq            46
				u1.l();
		//   20   42:aload_2         
		//   21   43:invokevirtual   #176 <Method void RecyclerView$u.l()>
			b(u1);
		//   22   46:aload_0         
		//   23   47:aload_2         
		//   24   48:invokevirtual   #178 <Method void b(RecyclerView$u)>
		//   25   51:return          
		}

		boolean a(u u1)
		{
			if(u1.q())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
		//*   2    4:ifeq            18
				return f.B.a();
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field RecyclerView f>
		//    5   11:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//    6   14:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//    7   17:ireturn         
			if(u1.c >= 0 && u1.c < f.l.a())
		//*   8   18:aload_1         
		//*   9   19:getfield        #199 <Field int RecyclerView$u.c>
		//*  10   22:iflt            126
		//*  11   25:aload_1         
		//*  12   26:getfield        #199 <Field int RecyclerView$u.c>
		//*  13   29:aload_0         
		//*  14   30:getfield        #28  <Field RecyclerView f>
		//*  15   33:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  16   36:invokevirtual   #188 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//*  17   39:icmplt          45
		//*  18   42:goto            126
			{
				boolean flag1 = f.B.a();
		//   19   45:aload_0         
		//   20   46:getfield        #28  <Field RecyclerView f>
		//   21   49:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//   22   52:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//   23   55:istore_3        
				boolean flag = false;
		//   24   56:iconst_0        
		//   25   57:istore_2        
				if(!flag1 && f.l.b(u1.c) != u1.h())
		//*  26   58:iload_3         
		//*  27   59:ifne            85
		//*  28   62:aload_0         
		//*  29   63:getfield        #28  <Field RecyclerView f>
		//*  30   66:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  31   69:aload_1         
		//*  32   70:getfield        #199 <Field int RecyclerView$u.c>
		//*  33   73:invokevirtual   #189 <Method int android.support.v7.widget.RecyclerView$a.b(int)>
		//*  34   76:aload_1         
		//*  35   77:invokevirtual   #81  <Method int android.support.v7.widget.RecyclerView$u.h()>
		//*  36   80:icmpeq          85
					return false;
		//   37   83:iconst_0        
		//   38   84:ireturn         
				if(f.l.d())
		//*  39   85:aload_0         
		//*  40   86:getfield        #28  <Field RecyclerView f>
		//*  41   89:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  42   92:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
		//*  43   95:ifeq            124
				{
					if(u1.g() == f.l.a(u1.c))
		//*  44   98:aload_1         
		//*  45   99:invokevirtual   #360 <Method long android.support.v7.widget.RecyclerView$u.g()>
		//*  46  102:aload_0         
		//*  47  103:getfield        #28  <Field RecyclerView f>
		//*  48  106:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  49  109:aload_1         
		//*  50  110:getfield        #199 <Field int RecyclerView$u.c>
		//*  51  113:invokevirtual   #194 <Method long android.support.v7.widget.RecyclerView$a.a(int)>
		//*  52  116:lcmp            
		//*  53  117:ifne            122
						flag = true;
		//   54  120:iconst_1        
		//   55  121:istore_2        
					return flag;
		//   56  122:iload_2         
		//   57  123:ireturn         
				} else
				{
					return true;
		//   58  124:iconst_1        
		//   59  125:ireturn         
				}
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   60  126:new             #211 <Class StringBuilder>
		//   61  129:dup             
		//   62  130:invokespecial   #212 <Method void StringBuilder()>
		//   63  133:astore          4
				stringbuilder.append("Inconsistency detected. Invalid view holder adapter position");
		//   64  135:aload           4
		//   65  137:ldc2            #414 <String "Inconsistency detected. Invalid view holder adapter position">
		//   66  140:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   67  143:pop             
				stringbuilder.append(((Object) (u1)));
		//   68  144:aload           4
		//   69  146:aload_1         
		//   70  147:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
		//   71  150:pop             
				stringbuilder.append(f.a());
		//   72  151:aload           4
		//   73  153:aload_0         
		//   74  154:getfield        #28  <Field RecyclerView f>
		//   75  157:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   76  160:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   77  163:pop             
				throw new IndexOutOfBoundsException(stringbuilder.toString());
		//   78  164:new             #280 <Class IndexOutOfBoundsException>
		//   79  167:dup             
		//   80  168:aload           4
		//   81  170:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   82  173:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
		//   83  176:athrow          
			}
		}

		public int b(int i1)
		{
			if(i1 >= 0 && i1 < f.B.e())
		//*   0    0:iload_1         
		//*   1    1:iflt            48
		//*   2    4:iload_1         
		//*   3    5:aload_0         
		//*   4    6:getfield        #28  <Field RecyclerView f>
		//*   5    9:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*   6   12:invokevirtual   #153 <Method int RecyclerView$r.e()>
		//*   7   15:icmplt          21
		//*   8   18:goto            48
			{
				if(!f.B.a())
		//*   9   21:aload_0         
		//*  10   22:getfield        #28  <Field RecyclerView f>
		//*  11   25:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*  12   28:invokevirtual   #118 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
		//*  13   31:ifne            36
					return i1;
		//   14   34:iload_1         
		//   15   35:ireturn         
				else
					return f.e.b(i1);
		//   16   36:aload_0         
		//   17   37:getfield        #28  <Field RecyclerView f>
		//   18   40:getfield        #181 <Field e RecyclerView.e>
		//   19   43:iload_1         
		//   20   44:invokevirtual   #186 <Method int android.support.v7.widget.e.b(int)>
		//   21   47:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   22   48:new             #211 <Class StringBuilder>
		//   23   51:dup             
		//   24   52:invokespecial   #212 <Method void StringBuilder()>
		//   25   55:astore_2        
				stringbuilder.append("invalid position ");
		//   26   56:aload_2         
		//   27   57:ldc2            #419 <String "invalid position ">
		//   28   60:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   29   63:pop             
				stringbuilder.append(i1);
		//   30   64:aload_2         
		//   31   65:iload_1         
		//   32   66:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//   33   69:pop             
				stringbuilder.append(". State ");
		//   34   70:aload_2         
		//   35   71:ldc2            #421 <String ". State ">
		//   36   74:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   37   77:pop             
				stringbuilder.append("item count is ");
		//   38   78:aload_2         
		//   39   79:ldc2            #423 <String "item count is ">
		//   40   82:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   41   85:pop             
				stringbuilder.append(f.B.e());
		//   42   86:aload_2         
		//   43   87:aload_0         
		//   44   88:getfield        #28  <Field RecyclerView f>
		//   45   91:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//   46   94:invokevirtual   #153 <Method int RecyclerView$r.e()>
		//   47   97:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
		//   48  100:pop             
				stringbuilder.append(f.a());
		//   49  101:aload_2         
		//   50  102:aload_0         
		//   51  103:getfield        #28  <Field RecyclerView f>
		//   52  106:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   53  109:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   54  112:pop             
				throw new IndexOutOfBoundsException(stringbuilder.toString());
		//   55  113:new             #280 <Class IndexOutOfBoundsException>
		//   56  116:dup             
		//   57  117:aload_2         
		//   58  118:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   59  121:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
		//   60  124:athrow          
			}
		}

		u b(int i1, boolean flag)
		{
			int l1 = a.size();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ArrayList a>
		//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//    3    7:istore          5
			boolean flag1 = false;
		//    4    9:iconst_0        
		//    5   10:istore          4
			for(int j1 = 0; j1 < l1; j1++)
		//*   6   12:iconst_0        
		//*   7   13:istore_3        
		//*   8   14:iload_3         
		//*   9   15:iload           5
		//*  10   17:icmpge          96
			{
				u u1 = (u)a.get(j1);
		//   11   20:aload_0         
		//   12   21:getfield        #36  <Field ArrayList a>
		//   13   24:iload_3         
		//   14   25:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   15   28:checkcast       #76  <Class RecyclerView$u>
		//   16   31:astore          6
				if(!u1.k() && u1.d() == i1 && !u1.n() && (f.B.f || !u1.q()))
		//*  17   33:aload           6
		//*  18   35:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  19   38:ifne            89
		//*  20   41:aload           6
		//*  21   43:invokevirtual   #425 <Method int RecyclerView$u.d()>
		//*  22   46:iload_1         
		//*  23   47:icmpne          89
		//*  24   50:aload           6
		//*  25   52:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
		//*  26   55:ifne            89
		//*  27   58:aload_0         
		//*  28   59:getfield        #28  <Field RecyclerView f>
		//*  29   62:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*  30   65:getfield        #426 <Field boolean RecyclerView$r.f>
		//*  31   68:ifne            79
		//*  32   71:aload           6
		//*  33   73:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
		//*  34   76:ifne            89
				{
					u1.b(32);
		//   35   79:aload           6
		//   36   81:bipush          32
		//   37   83:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					return u1;
		//   38   86:aload           6
		//   39   88:areturn         
				}
			}

		//   40   89:iload_3         
		//   41   90:iconst_1        
		//   42   91:iadd            
		//   43   92:istore_3        
		//*  44   93:goto            14
			if(!flag)
		//*  45   96:iload_2         
		//*  46   97:ifne            235
			{
				Object obj = ((Object) (f.f.c(i1)));
		//   47  100:aload_0         
		//   48  101:getfield        #28  <Field RecyclerView f>
		//   49  104:getfield        #429 <Field android.support.v7.widget.t RecyclerView.f>
		//   50  107:iload_1         
		//   51  108:invokevirtual   #433 <Method View t.c(int)>
		//   52  111:astore          7
				if(obj != null)
		//*  53  113:aload           7
		//*  54  115:ifnull          235
				{
					u u2 = RecyclerView.e(((View) (obj)));
		//   55  118:aload           7
		//   56  120:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
		//   57  123:astore          6
					f.f.e(((View) (obj)));
		//   58  125:aload_0         
		//   59  126:getfield        #28  <Field RecyclerView f>
		//   60  129:getfield        #429 <Field android.support.v7.widget.t RecyclerView.f>
		//   61  132:aload           7
		//   62  134:invokevirtual   #435 <Method void t.e(View)>
					i1 = f.f.b(((View) (obj)));
		//   63  137:aload_0         
		//   64  138:getfield        #28  <Field RecyclerView f>
		//   65  141:getfield        #429 <Field android.support.v7.widget.t RecyclerView.f>
		//   66  144:aload           7
		//   67  146:invokevirtual   #437 <Method int android.support.v7.widget.t.b(View)>
		//   68  149:istore_1        
					if(i1 == -1)
		//*  69  150:iload_1         
		//*  70  151:iconst_m1       
		//*  71  152:icmpne          207
					{
						obj = ((Object) (new StringBuilder()));
		//   72  155:new             #211 <Class StringBuilder>
		//   73  158:dup             
		//   74  159:invokespecial   #212 <Method void StringBuilder()>
		//   75  162:astore          7
						((StringBuilder) (obj)).append("layout index should not be -1 after unhiding a view:");
		//   76  164:aload           7
		//   77  166:ldc2            #439 <String "layout index should not be -1 after unhiding a view:">
		//   78  169:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   79  172:pop             
						((StringBuilder) (obj)).append(((Object) (u2)));
		//   80  173:aload           7
		//   81  175:aload           6
		//   82  177:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
		//   83  180:pop             
						((StringBuilder) (obj)).append(f.a());
		//   84  181:aload           7
		//   85  183:aload_0         
		//   86  184:getfield        #28  <Field RecyclerView f>
		//   87  187:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   88  190:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   89  193:pop             
						throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   90  194:new             #441 <Class IllegalStateException>
		//   91  197:dup             
		//   92  198:aload           7
		//   93  200:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   94  203:invokespecial   #442 <Method void IllegalStateException(String)>
		//   95  206:athrow          
					} else
					{
						f.f.e(i1);
		//   96  207:aload_0         
		//   97  208:getfield        #28  <Field RecyclerView f>
		//   98  211:getfield        #429 <Field android.support.v7.widget.t RecyclerView.f>
		//   99  214:iload_1         
		//  100  215:invokevirtual   #444 <Method void t.e(int)>
						c(((View) (obj)));
		//  101  218:aload_0         
		//  102  219:aload           7
		//  103  221:invokevirtual   #446 <Method void c(View)>
						u2.b(8224);
		//  104  224:aload           6
		//  105  226:sipush          8224
		//  106  229:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
						return u2;
		//  107  232:aload           6
		//  108  234:areturn         
					}
				}
			}
			l1 = c.size();
		//  109  235:aload_0         
		//  110  236:getfield        #40  <Field ArrayList c>
		//  111  239:invokevirtual   #354 <Method int ArrayList.size()>
		//  112  242:istore          5
			for(int k1 = ((int) (flag1)); k1 < l1; k1++)
		//* 113  244:iload           4
		//* 114  246:istore_3        
		//* 115  247:iload_3         
		//* 116  248:iload           5
		//* 117  250:icmpge          306
			{
				u u3 = (u)c.get(k1);
		//  118  253:aload_0         
		//  119  254:getfield        #40  <Field ArrayList c>
		//  120  257:iload_3         
		//  121  258:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//  122  261:checkcast       #76  <Class RecyclerView$u>
		//  123  264:astore          6
				if(!u3.n() && u3.d() == i1)
		//* 124  266:aload           6
		//* 125  268:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
		//* 126  271:ifne            299
		//* 127  274:aload           6
		//* 128  276:invokevirtual   #425 <Method int RecyclerView$u.d()>
		//* 129  279:iload_1         
		//* 130  280:icmpne          299
				{
					if(!flag)
		//* 131  283:iload_2         
		//* 132  284:ifne            296
						c.remove(k1);
		//  133  287:aload_0         
		//  134  288:getfield        #40  <Field ArrayList c>
		//  135  291:iload_3         
		//  136  292:invokevirtual   #366 <Method Object ArrayList.remove(int)>
		//  137  295:pop             
					return u3;
		//  138  296:aload           6
		//  139  298:areturn         
				}
			}

		//  140  299:iload_3         
		//  141  300:iconst_1        
		//  142  301:iadd            
		//  143  302:istore_3        
		//* 144  303:goto            247
			return null;
		//  145  306:aconst_null     
		//  146  307:areturn         
		}

		void b()
		{
			int i1;
			if(f.m != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field RecyclerView f>
		//*   2    4:getfield        #449 <Field RecyclerView$h RecyclerView.m>
		//*   3    7:ifnull          24
				i1 = f.m.x;
		//    4   10:aload_0         
		//    5   11:getfield        #28  <Field RecyclerView f>
		//    6   14:getfield        #449 <Field RecyclerView$h RecyclerView.m>
		//    7   17:getfield        #453 <Field int RecyclerView$h.x>
		//    8   20:istore_1        
			else
		//*   9   21:goto            26
				i1 = 0;
		//   10   24:iconst_0        
		//   11   25:istore_1        
			d = h + i1;
		//   12   26:aload_0         
		//   13   27:aload_0         
		//   14   28:getfield        #50  <Field int h>
		//   15   31:iload_1         
		//   16   32:iadd            
		//   17   33:putfield        #52  <Field int d>
			for(int j1 = c.size() - 1; j1 >= 0 && c.size() > d; j1--)
		//*  18   36:aload_0         
		//*  19   37:getfield        #40  <Field ArrayList c>
		//*  20   40:invokevirtual   #354 <Method int ArrayList.size()>
		//*  21   43:iconst_1        
		//*  22   44:isub            
		//*  23   45:istore_1        
		//*  24   46:iload_1         
		//*  25   47:iflt            76
		//*  26   50:aload_0         
		//*  27   51:getfield        #40  <Field ArrayList c>
		//*  28   54:invokevirtual   #354 <Method int ArrayList.size()>
		//*  29   57:aload_0         
		//*  30   58:getfield        #52  <Field int d>
		//*  31   61:icmple          76
				d(j1);
		//   32   64:aload_0         
		//   33   65:iload_1         
		//   34   66:invokevirtual   #371 <Method void d(int)>

		//   35   69:iload_1         
		//   36   70:iconst_1        
		//   37   71:isub            
		//   38   72:istore_1        
		//*  39   73:goto            46
		//   40   76:return          
		}

		void b(int i1, int j1)
		{
			int l1 = c.size();
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ArrayList c>
		//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//    3    7:istore          4
			for(int k1 = 0; k1 < l1; k1++)
		//*   4    9:iconst_0        
		//*   5   10:istore_3        
		//*   6   11:iload_3         
		//*   7   12:iload           4
		//*   8   14:icmpge          58
			{
				u u1 = (u)c.get(k1);
		//    9   17:aload_0         
		//   10   18:getfield        #40  <Field ArrayList c>
		//   11   21:iload_3         
		//   12   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   13   25:checkcast       #76  <Class RecyclerView$u>
		//   14   28:astore          5
				if(u1 != null && u1.c >= i1)
		//*  15   30:aload           5
		//*  16   32:ifnull          51
		//*  17   35:aload           5
		//*  18   37:getfield        #199 <Field int RecyclerView$u.c>
		//*  19   40:iload_1         
		//*  20   41:icmplt          51
					u1.a(j1, true);
		//   21   44:aload           5
		//   22   46:iload_2         
		//   23   47:iconst_1        
		//   24   48:invokevirtual   #384 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
			}

		//   25   51:iload_3         
		//   26   52:iconst_1        
		//   27   53:iadd            
		//   28   54:istore_3        
		//*  29   55:goto            11
		//   30   58:return          
		}

		void b(u u1)
		{
			boolean flag5 = u1.i();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
		//    2    4:istore          6
			boolean flag4 = false;
		//    3    6:iconst_0        
		//    4    7:istore          5
			boolean flag3 = false;
		//    5    9:iconst_0        
		//    6   10:istore          4
			if(!flag5 && u1.a.getParent() == null)
		//*   7   12:iload           6
		//*   8   14:ifne            404
		//*   9   17:aload_1         
		//*  10   18:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//*  11   21:invokevirtual   #457 <Method ViewParent View.getParent()>
		//*  12   24:ifnull          30
		//*  13   27:goto            404
			{
				if(u1.r())
		//*  14   30:aload_1         
		//*  15   31:invokevirtual   #412 <Method boolean RecyclerView$u.r()>
		//*  16   34:ifeq            88
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   17   37:new             #211 <Class StringBuilder>
		//   18   40:dup             
		//   19   41:invokespecial   #212 <Method void StringBuilder()>
		//   20   44:astore          7
					stringbuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
		//   21   46:aload           7
		//   22   48:ldc2            #459 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
		//   23   51:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   24   54:pop             
					stringbuilder.append(((Object) (u1)));
		//   25   55:aload           7
		//   26   57:aload_1         
		//   27   58:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
		//   28   61:pop             
					stringbuilder.append(f.a());
		//   29   62:aload           7
		//   30   64:aload_0         
		//   31   65:getfield        #28  <Field RecyclerView f>
		//   32   68:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   33   71:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   34   74:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
		//   35   75:new             #223 <Class IllegalArgumentException>
		//   36   78:dup             
		//   37   79:aload           7
		//   38   81:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   39   84:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//   40   87:athrow          
				}
				if(u1.c())
		//*  41   88:aload_1         
		//*  42   89:invokevirtual   #231 <Method boolean RecyclerView$u.c()>
		//*  43   92:ifeq            135
				{
					u1 = ((u) (new StringBuilder()));
		//   44   95:new             #211 <Class StringBuilder>
		//   45   98:dup             
		//   46   99:invokespecial   #212 <Method void StringBuilder()>
		//   47  102:astore_1        
					((StringBuilder) (u1)).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
		//   48  103:aload_1         
		//   49  104:ldc2            #461 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
		//   50  107:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   51  110:pop             
					((StringBuilder) (u1)).append(f.a());
		//   52  111:aload_1         
		//   53  112:aload_0         
		//   54  113:getfield        #28  <Field RecyclerView f>
		//   55  116:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   56  119:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   57  122:pop             
					throw new IllegalArgumentException(((StringBuilder) (u1)).toString());
		//   58  123:new             #223 <Class IllegalArgumentException>
		//   59  126:dup             
		//   60  127:aload_1         
		//   61  128:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   62  131:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//   63  134:athrow          
				}
				flag4 = android.support.v7.widget.u.a(u1);
		//   64  135:aload_1         
		//   65  136:invokestatic    #462 <Method boolean android.support.v7.widget.RecyclerView$u.a(RecyclerView$u)>
		//   66  139:istore          5
				boolean flag;
				if(f.l != null && flag4 && f.l.b(u1))
		//*  67  141:aload_0         
		//*  68  142:getfield        #28  <Field RecyclerView f>
		//*  69  145:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  70  148:ifnull          175
		//*  71  151:iload           5
		//*  72  153:ifeq            175
		//*  73  156:aload_0         
		//*  74  157:getfield        #28  <Field RecyclerView f>
		//*  75  160:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  76  163:aload_1         
		//*  77  164:invokevirtual   #464 <Method boolean android.support.v7.widget.RecyclerView$a.b(RecyclerView$u)>
		//*  78  167:ifeq            175
					flag = true;
		//   79  170:iconst_1        
		//   80  171:istore_2        
				else
		//*  81  172:goto            177
					flag = false;
		//   82  175:iconst_0        
		//   83  176:istore_2        
				int j1;
				if(!flag && !u1.w())
		//*  84  177:iload_2         
		//*  85  178:ifne            202
		//*  86  181:aload_1         
		//*  87  182:invokevirtual   #467 <Method boolean RecyclerView$u.w()>
		//*  88  185:ifeq            191
		//*  89  188:goto            202
				{
					boolean flag1 = false;
		//   90  191:iconst_0        
		//   91  192:istore_2        
					j1 = ((int) (flag3));
		//   92  193:iload           4
		//   93  195:istore_3        
					flag3 = flag1;
		//   94  196:iload_2         
		//   95  197:istore          4
				} else
		//*  96  199:goto            373
				{
					boolean flag2;
					if(d > 0 && !u1.a(526))
		//*  97  202:aload_0         
		//*  98  203:getfield        #52  <Field int d>
		//*  99  206:ifle            350
		//* 100  209:aload_1         
		//* 101  210:sipush          526
		//* 102  213:invokevirtual   #284 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
		//* 103  216:ifne            350
					{
						j1 = c.size();
		//  104  219:aload_0         
		//  105  220:getfield        #40  <Field ArrayList c>
		//  106  223:invokevirtual   #354 <Method int ArrayList.size()>
		//  107  226:istore_3        
						int i1 = j1;
		//  108  227:iload_3         
		//  109  228:istore_2        
						if(j1 >= d)
		//* 110  229:iload_3         
		//* 111  230:aload_0         
		//* 112  231:getfield        #52  <Field int d>
		//* 113  234:icmplt          252
						{
							i1 = j1;
		//  114  237:iload_3         
		//  115  238:istore_2        
							if(j1 > 0)
		//* 116  239:iload_3         
		//* 117  240:ifle            252
							{
								d(0);
		//  118  243:aload_0         
		//  119  244:iconst_0        
		//  120  245:invokevirtual   #371 <Method void d(int)>
								i1 = j1 - 1;
		//  121  248:iload_3         
		//  122  249:iconst_1        
		//  123  250:isub            
		//  124  251:istore_2        
							}
						}
						j1 = i1;
		//  125  252:iload_2         
		//  126  253:istore_3        
						if(RecyclerView.z())
		//* 127  254:invokestatic    #254 <Method boolean RecyclerView.z()>
		//* 128  257:ifeq            336
						{
							j1 = i1;
		//  129  260:iload_2         
		//  130  261:istore_3        
							if(i1 > 0)
		//* 131  262:iload_2         
		//* 132  263:ifle            336
							{
								j1 = i1;
		//  133  266:iload_2         
		//  134  267:istore_3        
								if(!f.A.a(u1.c))
		//* 135  268:aload_0         
		//* 136  269:getfield        #28  <Field RecyclerView f>
		//* 137  272:getfield        #471 <Field ad$a RecyclerView.A>
		//* 138  275:aload_1         
		//* 139  276:getfield        #199 <Field int RecyclerView$u.c>
		//* 140  279:invokevirtual   #474 <Method boolean android.support.v7.widget.ad$a.a(int)>
		//* 141  282:ifne            336
								{
									i1--;
		//  142  285:iload_2         
		//  143  286:iconst_1        
		//  144  287:isub            
		//  145  288:istore_2        
									do
									{
										if(i1 < 0)
											break;
		//  146  289:iload_2         
		//  147  290:iflt            332
										j1 = ((u)c.get(i1)).c;
		//  148  293:aload_0         
		//  149  294:getfield        #40  <Field ArrayList c>
		//  150  297:iload_2         
		//  151  298:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//  152  301:checkcast       #76  <Class RecyclerView$u>
		//  153  304:getfield        #199 <Field int RecyclerView$u.c>
		//  154  307:istore_3        
										if(!f.A.a(j1))
		//* 155  308:aload_0         
		//* 156  309:getfield        #28  <Field RecyclerView f>
		//* 157  312:getfield        #471 <Field ad$a RecyclerView.A>
		//* 158  315:iload_3         
		//* 159  316:invokevirtual   #474 <Method boolean android.support.v7.widget.ad$a.a(int)>
		//* 160  319:ifne            325
											break;
		//  161  322:goto            332
										i1--;
		//  162  325:iload_2         
		//  163  326:iconst_1        
		//  164  327:isub            
		//  165  328:istore_2        
									} while(true);
		//  166  329:goto            289
									j1 = i1 + 1;
		//  167  332:iload_2         
		//  168  333:iconst_1        
		//  169  334:iadd            
		//  170  335:istore_3        
								}
							}
						}
						c.add(j1, ((Object) (u1)));
		//  171  336:aload_0         
		//  172  337:getfield        #40  <Field ArrayList c>
		//  173  340:iload_3         
		//  174  341:aload_1         
		//  175  342:invokevirtual   #478 <Method void ArrayList.add(int, Object)>
						flag2 = true;
		//  176  345:iconst_1        
		//  177  346:istore_2        
					} else
		//* 178  347:goto            352
					{
						flag2 = false;
		//  179  350:iconst_0        
		//  180  351:istore_2        
					}
					j1 = ((int) (flag3));
		//  181  352:iload           4
		//  182  354:istore_3        
					flag3 = flag2;
		//  183  355:iload_2         
		//  184  356:istore          4
					if(!flag2)
		//* 185  358:iload_2         
		//* 186  359:ifne            373
					{
						a(u1, true);
		//  187  362:aload_0         
		//  188  363:aload_1         
		//  189  364:iconst_1        
		//  190  365:invokevirtual   #480 <Method void a(RecyclerView$u, boolean)>
						j1 = 1;
		//  191  368:iconst_1        
		//  192  369:istore_3        
						flag3 = flag2;
		//  193  370:iload_2         
		//  194  371:istore          4
					}
				}
				f.g.g(u1);
		//  195  373:aload_0         
		//  196  374:getfield        #28  <Field RecyclerView f>
		//  197  377:getfield        #483 <Field bc android.support.v7.widget.RecyclerView.g>
		//  198  380:aload_1         
		//  199  381:invokevirtual   #487 <Method void android.support.v7.widget.bc.g(RecyclerView$u)>
				if(!flag3 && j1 == 0 && flag4)
		//* 200  384:iload           4
		//* 201  386:ifne            403
		//* 202  389:iload_3         
		//* 203  390:ifne            403
		//* 204  393:iload           5
		//* 205  395:ifeq            403
					u1.m = null;
		//  206  398:aload_1         
		//  207  399:aconst_null     
		//  208  400:putfield        #79  <Field RecyclerView RecyclerView$u.m>
				return;
		//  209  403:return          
			}
			StringBuilder stringbuilder1 = new StringBuilder();
		//  210  404:new             #211 <Class StringBuilder>
		//  211  407:dup             
		//  212  408:invokespecial   #212 <Method void StringBuilder()>
		//  213  411:astore          7
			stringbuilder1.append("Scrapped or attached views may not be recycled. isScrap:");
		//  214  413:aload           7
		//  215  415:ldc2            #489 <String "Scrapped or attached views may not be recycled. isScrap:">
		//  216  418:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  217  421:pop             
			stringbuilder1.append(u1.i());
		//  218  422:aload           7
		//  219  424:aload_1         
		//  220  425:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
		//  221  428:invokevirtual   #492 <Method StringBuilder StringBuilder.append(boolean)>
		//  222  431:pop             
			stringbuilder1.append(" isAttached:");
		//  223  432:aload           7
		//  224  434:ldc2            #494 <String " isAttached:">
		//  225  437:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  226  440:pop             
			if(u1.a.getParent() != null)
		//* 227  441:aload_1         
		//* 228  442:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//* 229  445:invokevirtual   #457 <Method ViewParent View.getParent()>
		//* 230  448:ifnull          454
				flag4 = true;
		//  231  451:iconst_1        
		//  232  452:istore          5
			stringbuilder1.append(flag4);
		//  233  454:aload           7
		//  234  456:iload           5
		//  235  458:invokevirtual   #492 <Method StringBuilder StringBuilder.append(boolean)>
		//  236  461:pop             
			stringbuilder1.append(f.a());
		//  237  462:aload           7
		//  238  464:aload_0         
		//  239  465:getfield        #28  <Field RecyclerView f>
		//  240  468:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//  241  471:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//  242  474:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
		//  243  475:new             #223 <Class IllegalArgumentException>
		//  244  478:dup             
		//  245  479:aload           7
		//  246  481:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  247  484:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//  248  487:athrow          
		}

		void b(View view)
		{
			view = ((View) (RecyclerView.e(view)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore_1        
			android.support.v7.widget.u.a(((u) (view)), ((n) (null)));
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:invokestatic    #497 <Method RecyclerView$n android.support.v7.widget.RecyclerView$u.a(RecyclerView$u, RecyclerView$n)>
		//    6   10:pop             
			android.support.v7.widget.u.a(((u) (view)), false);
		//    7   11:aload_1         
		//    8   12:iconst_0        
		//    9   13:invokestatic    #500 <Method boolean android.support.v7.widget.RecyclerView$u.a(RecyclerView$u, boolean)>
		//   10   16:pop             
			((u) (view)).l();
		//   11   17:aload_1         
		//   12   18:invokevirtual   #176 <Method void RecyclerView$u.l()>
			b(((u) (view)));
		//   13   21:aload_0         
		//   14   22:aload_1         
		//   15   23:invokevirtual   #178 <Method void b(RecyclerView$u)>
		//   16   26:return          
		}

		public View c(int i1)
		{
			return a(i1, false);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #502 <Method View a(int, boolean)>
		//    4    6:areturn         
		}

		public List c()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field List g>
		//    2    4:areturn         
		}

		void c(int i1, int j1)
		{
			for(int k1 = c.size() - 1; k1 >= 0; k1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field ArrayList c>
		//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_3        
		//*   6   10:iload_3         
		//*   7   11:iflt            74
			{
				u u1 = (u)c.get(k1);
		//    8   14:aload_0         
		//    9   15:getfield        #40  <Field ArrayList c>
		//   10   18:iload_3         
		//   11   19:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #76  <Class RecyclerView$u>
		//   13   25:astore          5
				if(u1 == null)
		//*  14   27:aload           5
		//*  15   29:ifnonnull       35
					continue;
		//   16   32:goto            67
				int l1 = u1.c;
		//   17   35:aload           5
		//   18   37:getfield        #199 <Field int RecyclerView$u.c>
		//   19   40:istore          4
				if(l1 >= i1 && l1 < j1 + i1)
		//*  20   42:iload           4
		//*  21   44:iload_1         
		//*  22   45:icmplt          67
		//*  23   48:iload           4
		//*  24   50:iload_2         
		//*  25   51:iload_1         
		//*  26   52:iadd            
		//*  27   53:icmpge          67
				{
					u1.b(2);
		//   28   56:aload           5
		//   29   58:iconst_2        
		//   30   59:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					d(k1);
		//   31   62:aload_0         
		//   32   63:iload_3         
		//   33   64:invokevirtual   #371 <Method void d(int)>
				}
			}

		//   34   67:iload_3         
		//   35   68:iconst_1        
		//   36   69:isub            
		//   37   70:istore_3        
		//*  38   71:goto            10
		//   39   74:return          
		}

		void c(u u1)
		{
			ArrayList arraylist;
			if(android.support.v7.widget.u.b(u1))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #505 <Method boolean android.support.v7.widget.RecyclerView$u.b(RecyclerView$u)>
		//*   2    4:ifeq            21
				arraylist = b;
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field ArrayList b>
		//    5   11:astore_2        
			else
		//*   6   12:aload_2         
		//*   7   13:aload_1         
		//*   8   14:invokevirtual   #508 <Method boolean ArrayList.remove(Object)>
		//*   9   17:pop             
		//*  10   18:goto            29
				arraylist = a;
		//   11   21:aload_0         
		//   12   22:getfield        #36  <Field ArrayList a>
		//   13   25:astore_2        
			arraylist.remove(((Object) (u1)));
		//*  14   26:goto            12
			android.support.v7.widget.u.a(u1, ((n) (null)));
		//   15   29:aload_1         
		//   16   30:aconst_null     
		//   17   31:invokestatic    #497 <Method RecyclerView$n android.support.v7.widget.RecyclerView$u.a(RecyclerView$u, RecyclerView$n)>
		//   18   34:pop             
			android.support.v7.widget.u.a(u1, false);
		//   19   35:aload_1         
		//   20   36:iconst_0        
		//   21   37:invokestatic    #500 <Method boolean android.support.v7.widget.RecyclerView$u.a(RecyclerView$u, boolean)>
		//   22   40:pop             
			u1.l();
		//   23   41:aload_1         
		//   24   42:invokevirtual   #176 <Method void RecyclerView$u.l()>
		//   25   45:return          
		}

		void c(View view)
		{
			u u1 = RecyclerView.e(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
		//    2    4:astore_2        
			if(!u1.a(12) && u1.x() && !f.b(u1))
		//*   3    5:aload_2         
		//*   4    6:bipush          12
		//*   5    8:invokevirtual   #284 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
		//*   6   11:ifne            67
		//*   7   14:aload_2         
		//*   8   15:invokevirtual   #510 <Method boolean RecyclerView$u.x()>
		//*   9   18:ifeq            67
		//*  10   21:aload_0         
		//*  11   22:getfield        #28  <Field RecyclerView f>
		//*  12   25:aload_2         
		//*  13   26:invokevirtual   #511 <Method boolean android.support.v7.widget.RecyclerView.b(RecyclerView$u)>
		//*  14   29:ifeq            35
		//*  15   32:goto            67
			{
				if(b == null)
		//*  16   35:aload_0         
		//*  17   36:getfield        #38  <Field ArrayList b>
		//*  18   39:ifnonnull       53
					b = new ArrayList();
		//   19   42:aload_0         
		//   20   43:new             #33  <Class ArrayList>
		//   21   46:dup             
		//   22   47:invokespecial   #34  <Method void ArrayList()>
		//   23   50:putfield        #38  <Field ArrayList b>
				u1.a(this, true);
		//   24   53:aload_2         
		//   25   54:aload_0         
		//   26   55:iconst_1        
		//   27   56:invokevirtual   #514 <Method void android.support.v7.widget.RecyclerView$u.a(RecyclerView$n, boolean)>
				view = ((View) (b));
		//   28   59:aload_0         
		//   29   60:getfield        #38  <Field ArrayList b>
		//   30   63:astore_1        
			} else
		//*  31   64:goto            145
			{
				if(u1.n() && !u1.q() && !f.l.d())
		//*  32   67:aload_2         
		//*  33   68:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
		//*  34   71:ifeq            134
		//*  35   74:aload_2         
		//*  36   75:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
		//*  37   78:ifne            134
		//*  38   81:aload_0         
		//*  39   82:getfield        #28  <Field RecyclerView f>
		//*  40   85:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  41   88:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
		//*  42   91:ifne            134
				{
					view = ((View) (new StringBuilder()));
		//   43   94:new             #211 <Class StringBuilder>
		//   44   97:dup             
		//   45   98:invokespecial   #212 <Method void StringBuilder()>
		//   46  101:astore_1        
					((StringBuilder) (view)).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
		//   47  102:aload_1         
		//   48  103:ldc2            #516 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
		//   49  106:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   50  109:pop             
					((StringBuilder) (view)).append(f.a());
		//   51  110:aload_1         
		//   52  111:aload_0         
		//   53  112:getfield        #28  <Field RecyclerView f>
		//   54  115:invokevirtual   #221 <Method String android.support.v7.widget.RecyclerView.a()>
		//   55  118:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
		//   56  121:pop             
					throw new IllegalArgumentException(((StringBuilder) (view)).toString());
		//   57  122:new             #223 <Class IllegalArgumentException>
		//   58  125:dup             
		//   59  126:aload_1         
		//   60  127:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   61  130:invokespecial   #229 <Method void IllegalArgumentException(String)>
		//   62  133:athrow          
				}
				u1.a(this, false);
		//   63  134:aload_2         
		//   64  135:aload_0         
		//   65  136:iconst_0        
		//   66  137:invokevirtual   #514 <Method void android.support.v7.widget.RecyclerView$u.a(RecyclerView$n, boolean)>
				view = ((View) (a));
		//   67  140:aload_0         
		//   68  141:getfield        #36  <Field ArrayList a>
		//   69  144:astore_1        
			}
			((ArrayList) (view)).add(((Object) (u1)));
		//   70  145:aload_1         
		//   71  146:aload_2         
		//   72  147:invokevirtual   #518 <Method boolean ArrayList.add(Object)>
		//   73  150:pop             
		//   74  151:return          
		}

		void d()
		{
			for(int i1 = c.size() - 1; i1 >= 0; i1--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field ArrayList c>
		//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iflt            26
				d(i1);
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:invokevirtual   #371 <Method void d(int)>

		//   11   19:iload_1         
		//   12   20:iconst_1        
		//   13   21:isub            
		//   14   22:istore_1        
		//*  15   23:goto            10
			c.clear();
		//   16   26:aload_0         
		//   17   27:getfield        #40  <Field ArrayList c>
		//   18   30:invokevirtual   #377 <Method void ArrayList.clear()>
			if(RecyclerView.z())
		//*  19   33:invokestatic    #254 <Method boolean RecyclerView.z()>
		//*  20   36:ifeq            49
				f.A.a();
		//   21   39:aload_0         
		//   22   40:getfield        #28  <Field RecyclerView f>
		//   23   43:getfield        #471 <Field ad$a RecyclerView.A>
		//   24   46:invokevirtual   #519 <Method void android.support.v7.widget.ad$a.a()>
		//   25   49:return          
		}

		void d(int i1)
		{
			a((u)c.get(i1), true);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #40  <Field ArrayList c>
		//    3    5:iload_1         
		//    4    6:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//    5    9:checkcast       #76  <Class RecyclerView$u>
		//    6   12:iconst_1        
		//    7   13:invokevirtual   #480 <Method void a(RecyclerView$u, boolean)>
			c.remove(i1);
		//    8   16:aload_0         
		//    9   17:getfield        #40  <Field ArrayList c>
		//   10   20:iload_1         
		//   11   21:invokevirtual   #366 <Method Object ArrayList.remove(int)>
		//   12   24:pop             
		//   13   25:return          
		}

		void d(u u1)
		{
			if(f.n != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field RecyclerView f>
		//*   2    4:getfield        #522 <Field RecyclerView$o RecyclerView.n>
		//*   3    7:ifnull          23
				f.n.a(u1);
		//    4   10:aload_0         
		//    5   11:getfield        #28  <Field RecyclerView f>
		//    6   14:getfield        #522 <Field RecyclerView$o RecyclerView.n>
		//    7   17:aload_1         
		//    8   18:invokeinterface #525 <Method void android.support.v7.widget.RecyclerView$o.a(RecyclerView$u)>
			if(f.l != null)
		//*   9   23:aload_0         
		//*  10   24:getfield        #28  <Field RecyclerView f>
		//*  11   27:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  12   30:ifnull          44
				f.l.a(u1);
		//   13   33:aload_0         
		//   14   34:getfield        #28  <Field RecyclerView f>
		//   15   37:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//   16   40:aload_1         
		//   17   41:invokevirtual   #526 <Method void android.support.v7.widget.RecyclerView$a.a(RecyclerView$u)>
			if(f.B != null)
		//*  18   44:aload_0         
		//*  19   45:getfield        #28  <Field RecyclerView f>
		//*  20   48:getfield        #113 <Field RecyclerView$r RecyclerView.B>
		//*  21   51:ifnull          65
				f.g.g(u1);
		//   22   54:aload_0         
		//   23   55:getfield        #28  <Field RecyclerView f>
		//   24   58:getfield        #483 <Field bc android.support.v7.widget.RecyclerView.g>
		//   25   61:aload_1         
		//   26   62:invokevirtual   #487 <Method void android.support.v7.widget.bc.g(RecyclerView$u)>
		//   27   65:return          
		}

		int e()
		{
			return a.size();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ArrayList a>
		//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//    3    7:ireturn         
		}

		View e(int i1)
		{
			return ((u)a.get(i1)).a;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ArrayList a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #76  <Class RecyclerView$u>
		//    5   11:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//    6   14:areturn         
		}

		u f(int i1)
		{
			if(b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field ArrayList b>
		//*   2    4:ifnull          193
			{
				int k1 = b.size();
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field ArrayList b>
		//    5   11:invokevirtual   #354 <Method int ArrayList.size()>
		//    6   14:istore          4
				if(k1 == 0)
		//*   7   16:iload           4
		//*   8   18:ifne            23
					return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
				boolean flag = false;
		//   11   23:iconst_0        
		//   12   24:istore_3        
				for(int j1 = 0; j1 < k1; j1++)
		//*  13   25:iconst_0        
		//*  14   26:istore_2        
		//*  15   27:iload_2         
		//*  16   28:iload           4
		//*  17   30:icmpge          80
				{
					u u1 = (u)b.get(j1);
		//   18   33:aload_0         
		//   19   34:getfield        #38  <Field ArrayList b>
		//   20   37:iload_2         
		//   21   38:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   22   41:checkcast       #76  <Class RecyclerView$u>
		//   23   44:astore          7
					if(!u1.k() && u1.d() == i1)
		//*  24   46:aload           7
		//*  25   48:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  26   51:ifne            73
		//*  27   54:aload           7
		//*  28   56:invokevirtual   #425 <Method int RecyclerView$u.d()>
		//*  29   59:iload_1         
		//*  30   60:icmpne          73
					{
						u1.b(32);
		//   31   63:aload           7
		//   32   65:bipush          32
		//   33   67:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
						return u1;
		//   34   70:aload           7
		//   35   72:areturn         
					}
				}

		//   36   73:iload_2         
		//   37   74:iconst_1        
		//   38   75:iadd            
		//   39   76:istore_2        
		//*  40   77:goto            27
				if(f.l.d())
		//*  41   80:aload_0         
		//*  42   81:getfield        #28  <Field RecyclerView f>
		//*  43   84:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  44   87:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
		//*  45   90:ifeq            193
				{
					i1 = f.e.b(i1);
		//   46   93:aload_0         
		//   47   94:getfield        #28  <Field RecyclerView f>
		//   48   97:getfield        #181 <Field e RecyclerView.e>
		//   49  100:iload_1         
		//   50  101:invokevirtual   #186 <Method int android.support.v7.widget.e.b(int)>
		//   51  104:istore_1        
					if(i1 > 0 && i1 < f.l.a())
		//*  52  105:iload_1         
		//*  53  106:ifle            193
		//*  54  109:iload_1         
		//*  55  110:aload_0         
		//*  56  111:getfield        #28  <Field RecyclerView f>
		//*  57  114:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*  58  117:invokevirtual   #188 <Method int android.support.v7.widget.RecyclerView$a.a()>
		//*  59  120:icmpge          193
					{
						long l1 = f.l.a(i1);
		//   60  123:aload_0         
		//   61  124:getfield        #28  <Field RecyclerView f>
		//   62  127:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//   63  130:iload_1         
		//   64  131:invokevirtual   #194 <Method long android.support.v7.widget.RecyclerView$a.a(int)>
		//   65  134:lstore          5
						for(i1 = ((int) (flag)); i1 < k1; i1++)
		//*  66  136:iload_3         
		//*  67  137:istore_1        
		//*  68  138:iload_1         
		//*  69  139:iload           4
		//*  70  141:icmpge          193
						{
							u u2 = (u)b.get(i1);
		//   71  144:aload_0         
		//   72  145:getfield        #38  <Field ArrayList b>
		//   73  148:iload_1         
		//   74  149:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   75  152:checkcast       #76  <Class RecyclerView$u>
		//   76  155:astore          7
							if(!u2.k() && u2.g() == l1)
		//*  77  157:aload           7
		//*  78  159:invokevirtual   #174 <Method boolean android.support.v7.widget.RecyclerView$u.k()>
		//*  79  162:ifne            186
		//*  80  165:aload           7
		//*  81  167:invokevirtual   #360 <Method long android.support.v7.widget.RecyclerView$u.g()>
		//*  82  170:lload           5
		//*  83  172:lcmp            
		//*  84  173:ifne            186
							{
								u2.b(32);
		//   85  176:aload           7
		//   86  178:bipush          32
		//   87  180:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
								return u2;
		//   88  183:aload           7
		//   89  185:areturn         
							}
						}

		//   90  186:iload_1         
		//   91  187:iconst_1        
		//   92  188:iadd            
		//   93  189:istore_1        
					}
				}
			}
		//*  94  190:goto            138
			return null;
		//   95  193:aconst_null     
		//   96  194:areturn         
		}

		void f()
		{
			a.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ArrayList a>
		//    2    4:invokevirtual   #377 <Method void ArrayList.clear()>
			if(b != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #38  <Field ArrayList b>
		//*   5   11:ifnull          21
				b.clear();
		//    6   14:aload_0         
		//    7   15:getfield        #38  <Field ArrayList b>
		//    8   18:invokevirtual   #377 <Method void ArrayList.clear()>
		//    9   21:return          
		}

		m g()
		{
			if(e == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field RecyclerView$m e>
		//*   2    4:ifnonnull       18
				e = new m();
		//    3    7:aload_0         
		//    4    8:new             #91  <Class RecyclerView$m>
		//    5   11:dup             
		//    6   12:invokespecial   #527 <Method void RecyclerView$m()>
		//    7   15:putfield        #89  <Field RecyclerView$m e>
			return e;
		//    8   18:aload_0         
		//    9   19:getfield        #89  <Field RecyclerView$m e>
		//   10   22:areturn         
		}

		void h()
		{
			if(f.l != null && f.l.d())
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field RecyclerView f>
		//*   2    4:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*   3    7:ifnull          72
		//*   4   10:aload_0         
		//*   5   11:getfield        #28  <Field RecyclerView f>
		//*   6   14:getfield        #98  <Field RecyclerView$a RecyclerView.l>
		//*   7   17:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
		//*   8   20:ifeq            72
			{
				int j1 = c.size();
		//    9   23:aload_0         
		//   10   24:getfield        #40  <Field ArrayList c>
		//   11   27:invokevirtual   #354 <Method int ArrayList.size()>
		//   12   30:istore_2        
				for(int i1 = 0; i1 < j1; i1++)
		//*  13   31:iconst_0        
		//*  14   32:istore_1        
		//*  15   33:iload_1         
		//*  16   34:iload_2         
		//*  17   35:icmpge          76
				{
					u u1 = (u)c.get(i1);
		//   18   38:aload_0         
		//   19   39:getfield        #40  <Field ArrayList c>
		//   20   42:iload_1         
		//   21   43:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   22   46:checkcast       #76  <Class RecyclerView$u>
		//   23   49:astore_3        
					if(u1 != null)
		//*  24   50:aload_3         
		//*  25   51:ifnull          65
					{
						u1.b(6);
		//   26   54:aload_3         
		//   27   55:bipush          6
		//   28   57:invokevirtual   #138 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
						u1.a(((Object) (null)));
		//   29   60:aload_3         
		//   30   61:aconst_null     
		//   31   62:invokevirtual   #529 <Method void android.support.v7.widget.RecyclerView$u.a(Object)>
					}
				}

		//   32   65:iload_1         
		//   33   66:iconst_1        
		//   34   67:iadd            
		//   35   68:istore_1        
			} else
		//*  36   69:goto            33
			{
				d();
		//   37   72:aload_0         
		//   38   73:invokevirtual   #379 <Method void d()>
			}
		//   39   76:return          
		}

		void i()
		{
			int l1 = c.size();
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ArrayList c>
		//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//    3    7:istore_3        
			boolean flag = false;
		//    4    8:iconst_0        
		//    5    9:istore_2        
			for(int i1 = 0; i1 < l1; i1++)
		//*   6   10:iconst_0        
		//*   7   11:istore_1        
		//*   8   12:iload_1         
		//*   9   13:iload_3         
		//*  10   14:icmpge          38
				((u)c.get(i1)).a();
		//   11   17:aload_0         
		//   12   18:getfield        #40  <Field ArrayList c>
		//   13   21:iload_1         
		//   14   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   15   25:checkcast       #76  <Class RecyclerView$u>
		//   16   28:invokevirtual   #530 <Method void android.support.v7.widget.RecyclerView$u.a()>

		//   17   31:iload_1         
		//   18   32:iconst_1        
		//   19   33:iadd            
		//   20   34:istore_1        
		//*  21   35:goto            12
			l1 = a.size();
		//   22   38:aload_0         
		//   23   39:getfield        #36  <Field ArrayList a>
		//   24   42:invokevirtual   #354 <Method int ArrayList.size()>
		//   25   45:istore_3        
			for(int j1 = 0; j1 < l1; j1++)
		//*  26   46:iconst_0        
		//*  27   47:istore_1        
		//*  28   48:iload_1         
		//*  29   49:iload_3         
		//*  30   50:icmpge          74
				((u)a.get(j1)).a();
		//   31   53:aload_0         
		//   32   54:getfield        #36  <Field ArrayList a>
		//   33   57:iload_1         
		//   34   58:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   35   61:checkcast       #76  <Class RecyclerView$u>
		//   36   64:invokevirtual   #530 <Method void android.support.v7.widget.RecyclerView$u.a()>

		//   37   67:iload_1         
		//   38   68:iconst_1        
		//   39   69:iadd            
		//   40   70:istore_1        
		//*  41   71:goto            48
			if(b != null)
		//*  42   74:aload_0         
		//*  43   75:getfield        #38  <Field ArrayList b>
		//*  44   78:ifnull          117
			{
				int i2 = b.size();
		//   45   81:aload_0         
		//   46   82:getfield        #38  <Field ArrayList b>
		//   47   85:invokevirtual   #354 <Method int ArrayList.size()>
		//   48   88:istore_3        
				for(int k1 = ((int) (flag)); k1 < i2; k1++)
		//*  49   89:iload_2         
		//*  50   90:istore_1        
		//*  51   91:iload_1         
		//*  52   92:iload_3         
		//*  53   93:icmpge          117
					((u)b.get(k1)).a();
		//   54   96:aload_0         
		//   55   97:getfield        #38  <Field ArrayList b>
		//   56  100:iload_1         
		//   57  101:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   58  104:checkcast       #76  <Class RecyclerView$u>
		//   59  107:invokevirtual   #530 <Method void android.support.v7.widget.RecyclerView$u.a()>

		//   60  110:iload_1         
		//   61  111:iconst_1        
		//   62  112:iadd            
		//   63  113:istore_1        
			}
		//*  64  114:goto            91
		//   65  117:return          
		}

		void j()
		{
			int j1 = c.size();
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ArrayList c>
		//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
		//    3    7:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          52
			{
				LayoutParams layoutparams = (LayoutParams)((u)c.get(i1)).a.getLayoutParams();
		//    9   15:aload_0         
		//   10   16:getfield        #40  <Field ArrayList c>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #358 <Method Object ArrayList.get(int)>
		//   13   23:checkcast       #76  <Class RecyclerView$u>
		//   14   26:getfield        #125 <Field View android.support.v7.widget.RecyclerView$u.a>
		//   15   29:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   16   32:checkcast       #328 <Class RecyclerView$LayoutParams>
		//   17   35:astore_3        
				if(layoutparams != null)
		//*  18   36:aload_3         
		//*  19   37:ifnull          45
					layoutparams.e = true;
		//   20   40:aload_3         
		//   21   41:iconst_1        
		//   22   42:putfield        #532 <Field boolean RecyclerView$LayoutParams.e>
			}

		//   23   45:iload_1         
		//   24   46:iconst_1        
		//   25   47:iadd            
		//   26   48:istore_1        
		//*  27   49:goto            10
		//   28   52:return          
		}

		final ArrayList a = new ArrayList();
		ArrayList b;
		final ArrayList c = new ArrayList();
		int d;
		m e;
		final RecyclerView f;
		private final List g;
		private int h;
		private s i;

		public n()
		{
			f = RecyclerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field RecyclerView f>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #33  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #34  <Method void ArrayList()>
		//    9   17:putfield        #36  <Field ArrayList a>
			b = null;
		//   10   20:aload_0         
		//   11   21:aconst_null     
		//   12   22:putfield        #38  <Field ArrayList b>
		//   13   25:aload_0         
		//   14   26:new             #33  <Class ArrayList>
		//   15   29:dup             
		//   16   30:invokespecial   #34  <Method void ArrayList()>
		//   17   33:putfield        #40  <Field ArrayList c>
			g = Collections.unmodifiableList(((List) (a)));
		//   18   36:aload_0         
		//   19   37:aload_0         
		//   20   38:getfield        #36  <Field ArrayList a>
		//   21   41:invokestatic    #46  <Method List Collections.unmodifiableList(List)>
		//   22   44:putfield        #48  <Field List g>
			h = 2;
		//   23   47:aload_0         
		//   24   48:iconst_2        
		//   25   49:putfield        #50  <Field int h>
			d = 2;
		//   26   52:aload_0         
		//   27   53:iconst_2        
		//   28   54:putfield        #52  <Field int d>
		//   29   57:return          
		}
	}

	public static interface o
	{

		public abstract void a(u u1);
	}

	private class p extends c
	{

		public void a()
		{
			a.a(((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field RecyclerView a>
		//    2    4:aconst_null     
		//    3    5:invokevirtual   #20  <Method void android.support.v7.widget.RecyclerView.a(String)>
			a.B.e = true;
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field RecyclerView a>
		//    6   12:getfield        #24  <Field RecyclerView$r RecyclerView.B>
		//    7   15:iconst_1        
		//    8   16:putfield        #30  <Field boolean RecyclerView$r.e>
			a.u();
		//    9   19:aload_0         
		//   10   20:getfield        #13  <Field RecyclerView a>
		//   11   23:invokevirtual   #33  <Method void RecyclerView.u()>
			if(!a.e.d())
		//*  12   26:aload_0         
		//*  13   27:getfield        #13  <Field RecyclerView a>
		//*  14   30:getfield        #36  <Field e RecyclerView.e>
		//*  15   33:invokevirtual   #42  <Method boolean e.d()>
		//*  16   36:ifne            46
				a.requestLayout();
		//   17   39:aload_0         
		//   18   40:getfield        #13  <Field RecyclerView a>
		//   19   43:invokevirtual   #45  <Method void RecyclerView.requestLayout()>
		//   20   46:return          
		}

		public void a(int i1, int j1, Object obj)
		{
			a.a(((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field RecyclerView a>
		//    2    4:aconst_null     
		//    3    5:invokevirtual   #20  <Method void android.support.v7.widget.RecyclerView.a(String)>
			if(a.e.a(i1, j1, obj))
		//*   4    8:aload_0         
		//*   5    9:getfield        #13  <Field RecyclerView a>
		//*   6   12:getfield        #36  <Field e RecyclerView.e>
		//*   7   15:iload_1         
		//*   8   16:iload_2         
		//*   9   17:aload_3         
		//*  10   18:invokevirtual   #49  <Method boolean android.support.v7.widget.e.a(int, int, Object)>
		//*  11   21:ifeq            28
				b();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #52  <Method void b()>
		//   14   28:return          
		}

		void b()
		{
			if(RecyclerView.c && a.q && a.p)
		//*   0    0:getstatic       #55  <Field boolean RecyclerView.c>
		//*   1    3:ifeq            41
		//*   2    6:aload_0         
		//*   3    7:getfield        #13  <Field RecyclerView a>
		//*   4   10:getfield        #58  <Field boolean RecyclerView.q>
		//*   5   13:ifeq            41
		//*   6   16:aload_0         
		//*   7   17:getfield        #13  <Field RecyclerView a>
		//*   8   20:getfield        #60  <Field boolean RecyclerView.p>
		//*   9   23:ifeq            41
			{
				android.support.v4.view.s.a(((View) (a)), a.i);
		//   10   26:aload_0         
		//   11   27:getfield        #13  <Field RecyclerView a>
		//   12   30:aload_0         
		//   13   31:getfield        #13  <Field RecyclerView a>
		//   14   34:getfield        #64  <Field Runnable RecyclerView.i>
		//   15   37:invokestatic    #69  <Method void s.a(View, Runnable)>
				return;
		//   16   40:return          
			} else
			{
				a.v = true;
		//   17   41:aload_0         
		//   18   42:getfield        #13  <Field RecyclerView a>
		//   19   45:iconst_1        
		//   20   46:putfield        #72  <Field boolean RecyclerView.v>
				a.requestLayout();
		//   21   49:aload_0         
		//   22   50:getfield        #13  <Field RecyclerView a>
		//   23   53:invokevirtual   #45  <Method void RecyclerView.requestLayout()>
				return;
		//   24   56:return          
			}
		}

		public void b(int i1, int j1)
		{
			a.a(((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field RecyclerView a>
		//    2    4:aconst_null     
		//    3    5:invokevirtual   #20  <Method void android.support.v7.widget.RecyclerView.a(String)>
			if(a.e.b(i1, j1))
		//*   4    8:aload_0         
		//*   5    9:getfield        #13  <Field RecyclerView a>
		//*   6   12:getfield        #36  <Field e RecyclerView.e>
		//*   7   15:iload_1         
		//*   8   16:iload_2         
		//*   9   17:invokevirtual   #76  <Method boolean android.support.v7.widget.e.b(int, int)>
		//*  10   20:ifeq            27
				b();
		//   11   23:aload_0         
		//   12   24:invokevirtual   #52  <Method void b()>
		//   13   27:return          
		}

		final RecyclerView a;

		p()
		{
			a = RecyclerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field RecyclerView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void RecyclerView$c()>
		//    5    9:return          
		}
	}

	public static abstract class q
	{

		private void a(int i1, int j1)
		{
			RecyclerView recyclerview = b;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field RecyclerView b>
		//    2    4:astore          4
			if(!e || a == -1 || recyclerview == null)
		//*   3    6:aload_0         
		//*   4    7:getfield        #27  <Field boolean e>
		//*   5   10:ifeq            26
		//*   6   13:aload_0         
		//*   7   14:getfield        #29  <Field int a>
		//*   8   17:iconst_m1       
		//*   9   18:icmpeq          26
		//*  10   21:aload           4
		//*  11   23:ifnonnull       30
				a();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #32  <Method void a()>
			d = false;
		//   14   30:aload_0         
		//   15   31:iconst_0        
		//   16   32:putfield        #34  <Field boolean d>
			if(f != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #36  <Field View f>
		//*  19   39:ifnull          103
				if(a(f) == a)
		//*  20   42:aload_0         
		//*  21   43:aload_0         
		//*  22   44:getfield        #36  <Field View f>
		//*  23   47:invokevirtual   #39  <Method int a(View)>
		//*  24   50:aload_0         
		//*  25   51:getfield        #29  <Field int a>
		//*  26   54:icmpne          90
				{
					a(f, recyclerview.B, g);
		//   27   57:aload_0         
		//   28   58:aload_0         
		//   29   59:getfield        #36  <Field View f>
		//   30   62:aload           4
		//   31   64:getfield        #43  <Field RecyclerView$r RecyclerView.B>
		//   32   67:aload_0         
		//   33   68:getfield        #45  <Field RecyclerView$q$a g>
		//   34   71:invokevirtual   #48  <Method void a(View, RecyclerView$r, RecyclerView$q$a)>
					g.a(recyclerview);
		//   35   74:aload_0         
		//   36   75:getfield        #45  <Field RecyclerView$q$a g>
		//   37   78:aload           4
		//   38   80:invokevirtual   #51  <Method void android.support.v7.widget.RecyclerView$q$a.a(RecyclerView)>
					a();
		//   39   83:aload_0         
		//   40   84:invokevirtual   #32  <Method void a()>
				} else
		//*  41   87:goto            103
				{
					Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
		//   42   90:ldc1            #53  <String "RecyclerView">
		//   43   92:ldc1            #55  <String "Passed over target position while smooth scrolling.">
		//   44   94:invokestatic    #60  <Method int Log.e(String, String)>
		//   45   97:pop             
					f = null;
		//   46   98:aload_0         
		//   47   99:aconst_null     
		//   48  100:putfield        #36  <Field View f>
				}
			if(e)
		//*  49  103:aload_0         
		//*  50  104:getfield        #27  <Field boolean e>
		//*  51  107:ifeq            171
			{
				a(i1, j1, recyclerview.B, g);
		//   52  110:aload_0         
		//   53  111:iload_1         
		//   54  112:iload_2         
		//   55  113:aload           4
		//   56  115:getfield        #43  <Field RecyclerView$r RecyclerView.B>
		//   57  118:aload_0         
		//   58  119:getfield        #45  <Field RecyclerView$q$a g>
		//   59  122:invokevirtual   #63  <Method void a(int, int, RecyclerView$r, RecyclerView$q$a)>
				boolean flag = g.a();
		//   60  125:aload_0         
		//   61  126:getfield        #45  <Field RecyclerView$q$a g>
		//   62  129:invokevirtual   #66  <Method boolean android.support.v7.widget.RecyclerView$q$a.a()>
		//   63  132:istore_3        
				g.a(recyclerview);
		//   64  133:aload_0         
		//   65  134:getfield        #45  <Field RecyclerView$q$a g>
		//   66  137:aload           4
		//   67  139:invokevirtual   #51  <Method void android.support.v7.widget.RecyclerView$q$a.a(RecyclerView)>
				if(flag)
		//*  68  142:iload_3         
		//*  69  143:ifeq            171
				{
					if(e)
		//*  70  146:aload_0         
		//*  71  147:getfield        #27  <Field boolean e>
		//*  72  150:ifeq            167
					{
						d = true;
		//   73  153:aload_0         
		//   74  154:iconst_1        
		//   75  155:putfield        #34  <Field boolean d>
						recyclerview.y.a();
		//   76  158:aload           4
		//   77  160:getfield        #70  <Field RecyclerView$t RecyclerView.y>
		//   78  163:invokevirtual   #73  <Method void android.support.v7.widget.RecyclerView$t.a()>
						return;
		//   79  166:return          
					}
					a();
		//   80  167:aload_0         
		//   81  168:invokevirtual   #32  <Method void a()>
				}
			}
		//   82  171:return          
		}

		static void a(q q1, int i1, int j1)
		{
			q1.a(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #77  <Method void a(int, int)>
		//    4    6:return          
		}

		public int a(View view)
		{
			return b.f(view);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field RecyclerView b>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #79  <Method int RecyclerView.f(View)>
		//    4    8:ireturn         
		}

		protected final void a()
		{
			if(!e)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean e>
		//*   2    4:ifne            8
			{
				return;
		//    3    7:return          
			} else
			{
				e();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #81  <Method void e()>
				android.support.v7.widget.r.a(b.B, -1);
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field RecyclerView b>
		//    8   16:getfield        #43  <Field RecyclerView$r RecyclerView.B>
		//    9   19:iconst_m1       
		//   10   20:invokestatic    #86  <Method int android.support.v7.widget.RecyclerView$r.a(RecyclerView$r, int)>
		//   11   23:pop             
				f = null;
		//   12   24:aload_0         
		//   13   25:aconst_null     
		//   14   26:putfield        #36  <Field View f>
				a = -1;
		//   15   29:aload_0         
		//   16   30:iconst_m1       
		//   17   31:putfield        #29  <Field int a>
				d = false;
		//   18   34:aload_0         
		//   19   35:iconst_0        
		//   20   36:putfield        #34  <Field boolean d>
				e = false;
		//   21   39:aload_0         
		//   22   40:iconst_0        
		//   23   41:putfield        #27  <Field boolean e>
				android.support.v7.widget.h.a(c, this);
		//   24   44:aload_0         
		//   25   45:getfield        #88  <Field RecyclerView$h c>
		//   26   48:aload_0         
		//   27   49:invokestatic    #93  <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$h, RecyclerView$q)>
				c = null;
		//   28   52:aload_0         
		//   29   53:aconst_null     
		//   30   54:putfield        #88  <Field RecyclerView$h c>
				b = null;
		//   31   57:aload_0         
		//   32   58:aconst_null     
		//   33   59:putfield        #25  <Field RecyclerView b>
				return;
		//   34   62:return          
			}
		}

		public void a(int i1)
		{
			a = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #29  <Field int a>
		//    3    5:return          
		}

		protected abstract void a(int i1, int j1, r r1, a a1);

		protected abstract void a(View view, r r1, a a1);

		protected void b(View view)
		{
			if(a(view) == d())
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #39  <Method int a(View)>
		//*   3    5:aload_0         
		//*   4    6:invokevirtual   #98  <Method int d()>
		//*   5    9:icmpne          17
				f = view;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:putfield        #36  <Field View f>
		//    9   17:return          
		}

		public boolean b()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field boolean d>
		//    2    4:ireturn         
		}

		public boolean c()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field boolean e>
		//    2    4:ireturn         
		}

		public int d()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int a>
		//    2    4:ireturn         
		}

		protected abstract void e();

		private int a;
		private RecyclerView b;
		private h c;
		private boolean d;
		private boolean e;
		private View f;
		private final a g;
	}

	public static class q.a
	{

		private void b()
		{
			if(e != null && c < 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Interpolator e>
		//*   2    4:ifnull          25
		//*   3    7:aload_0         
		//*   4    8:getfield        #24  <Field int c>
		//*   5   11:iconst_1        
		//*   6   12:icmpge          25
				throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
		//    7   15:new             #26  <Class IllegalStateException>
		//    8   18:dup             
		//    9   19:ldc1            #28  <String "If you provide an interpolator, you must set a positive duration">
		//   10   21:invokespecial   #32  <Method void IllegalStateException(String)>
		//   11   24:athrow          
			if(c < 1)
		//*  12   25:aload_0         
		//*  13   26:getfield        #24  <Field int c>
		//*  14   29:iconst_1        
		//*  15   30:icmpge          43
				throw new IllegalStateException("Scroll duration must be a positive number");
		//   16   33:new             #26  <Class IllegalStateException>
		//   17   36:dup             
		//   18   37:ldc1            #34  <String "Scroll duration must be a positive number">
		//   19   39:invokespecial   #32  <Method void IllegalStateException(String)>
		//   20   42:athrow          
			else
				return;
		//   21   43:return          
		}

		void a(RecyclerView recyclerview)
		{
			if(d >= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field int d>
		//*   2    4:iflt            28
			{
				int i1 = d;
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field int d>
		//    5   11:istore_2        
				d = -1;
		//    6   12:aload_0         
		//    7   13:iconst_m1       
		//    8   14:putfield        #38  <Field int d>
				recyclerview.b(i1);
		//    9   17:aload_1         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #41  <Method void android.support.v7.widget.RecyclerView.b(int)>
				f = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #43  <Field boolean f>
				return;
		//   15   27:return          
			}
			if(f)
		//*  16   28:aload_0         
		//*  17   29:getfield        #43  <Field boolean f>
		//*  18   32:ifeq            151
			{
				b();
		//   19   35:aload_0         
		//   20   36:invokespecial   #45  <Method void b()>
				if(e == null)
		//*  21   39:aload_0         
		//*  22   40:getfield        #22  <Field Interpolator e>
		//*  23   43:ifnonnull       95
				{
					if(c == 0x80000000)
		//*  24   46:aload_0         
		//*  25   47:getfield        #24  <Field int c>
		//*  26   50:ldc1            #46  <Int 0x80000000>
		//*  27   52:icmpne          73
						recyclerview.y.b(a, b);
		//   28   55:aload_1         
		//   29   56:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   30   59:aload_0         
		//   31   60:getfield        #52  <Field int a>
		//   32   63:aload_0         
		//   33   64:getfield        #54  <Field int b>
		//   34   67:invokevirtual   #59  <Method void android.support.v7.widget.RecyclerView$t.b(int, int)>
					else
		//*  35   70:goto            118
						recyclerview.y.a(a, b, c);
		//   36   73:aload_1         
		//   37   74:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   38   77:aload_0         
		//   39   78:getfield        #52  <Field int a>
		//   40   81:aload_0         
		//   41   82:getfield        #54  <Field int b>
		//   42   85:aload_0         
		//   43   86:getfield        #24  <Field int c>
		//   44   89:invokevirtual   #62  <Method void android.support.v7.widget.RecyclerView$t.a(int, int, int)>
				} else
		//*  45   92:goto            118
				{
					recyclerview.y.a(a, b, c, e);
		//   46   95:aload_1         
		//   47   96:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   48   99:aload_0         
		//   49  100:getfield        #52  <Field int a>
		//   50  103:aload_0         
		//   51  104:getfield        #54  <Field int b>
		//   52  107:aload_0         
		//   53  108:getfield        #24  <Field int c>
		//   54  111:aload_0         
		//   55  112:getfield        #22  <Field Interpolator e>
		//   56  115:invokevirtual   #65  <Method void android.support.v7.widget.RecyclerView$t.a(int, int, int, Interpolator)>
				}
				g = g + 1;
		//   57  118:aload_0         
		//   58  119:aload_0         
		//   59  120:getfield        #67  <Field int g>
		//   60  123:iconst_1        
		//   61  124:iadd            
		//   62  125:putfield        #67  <Field int g>
				if(g > 10)
		//*  63  128:aload_0         
		//*  64  129:getfield        #67  <Field int g>
		//*  65  132:bipush          10
		//*  66  134:icmple          145
					Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
		//   67  137:ldc1            #69  <String "RecyclerView">
		//   68  139:ldc1            #71  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
		//   69  141:invokestatic    #76  <Method int Log.e(String, String)>
		//   70  144:pop             
				f = false;
		//   71  145:aload_0         
		//   72  146:iconst_0        
		//   73  147:putfield        #43  <Field boolean f>
				return;
		//   74  150:return          
			} else
			{
				g = 0;
		//   75  151:aload_0         
		//   76  152:iconst_0        
		//   77  153:putfield        #67  <Field int g>
				return;
		//   78  156:return          
			}
		}

		boolean a()
		{
			return d >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int d>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		private int a;
		private int b;
		private int c;
		private int d;
		private Interpolator e;
		private boolean f;
		private int g;
	}

	public static class r
	{

		static int a(r r1, int i1)
		{
			r1.p = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field int p>
			return i1;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

		void a(int i1)
		{
			if((c & i1) == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field int c>
		//*   2    4:iload_1         
		//*   3    5:iand            
		//*   4    6:ifne            64
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    5    9:new             #60  <Class StringBuilder>
		//    6   12:dup             
		//    7   13:invokespecial   #61  <Method void StringBuilder()>
		//    8   16:astore_2        
				stringbuilder.append("Layout state should be one of ");
		//    9   17:aload_2         
		//   10   18:ldc1            #63  <String "Layout state should be one of ">
		//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
				stringbuilder.append(Integer.toBinaryString(i1));
		//   13   24:aload_2         
		//   14   25:iload_1         
		//   15   26:invokestatic    #73  <Method String Integer.toBinaryString(int)>
		//   16   29:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
				stringbuilder.append(" but it is ");
		//   18   33:aload_2         
		//   19   34:ldc1            #75  <String " but it is ">
		//   20   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   21   39:pop             
				stringbuilder.append(Integer.toBinaryString(c));
		//   22   40:aload_2         
		//   23   41:aload_0         
		//   24   42:getfield        #41  <Field int c>
		//   25   45:invokestatic    #73  <Method String Integer.toBinaryString(int)>
		//   26   48:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   27   51:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   28   52:new             #77  <Class IllegalStateException>
		//   29   55:dup             
		//   30   56:aload_2         
		//   31   57:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   32   60:invokespecial   #84  <Method void IllegalStateException(String)>
		//   33   63:athrow          
			} else
			{
				return;
		//   34   64:return          
			}
		}

		void a(a a1)
		{
			c = 1;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #41  <Field int c>
			d = a1.a();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #90  <Method int android.support.v7.widget.RecyclerView$a.a()>
		//    6   10:putfield        #43  <Field int d>
			f = false;
		//    7   13:aload_0         
		//    8   14:iconst_0        
		//    9   15:putfield        #47  <Field boolean f>
			g = false;
		//   10   18:aload_0         
		//   11   19:iconst_0        
		//   12   20:putfield        #49  <Field boolean g>
			h = false;
		//   13   23:aload_0         
		//   14   24:iconst_0        
		//   15   25:putfield        #51  <Field boolean h>
		//   16   28:return          
		}

		public boolean a()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field boolean f>
		//    2    4:ireturn         
		}

		public boolean b()
		{
			return j;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field boolean j>
		//    2    4:ireturn         
		}

		public int c()
		{
			return p;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int p>
		//    2    4:ireturn         
		}

		public boolean d()
		{
			return p != -1;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int p>
		//    2    4:iconst_m1       
		//    3    5:icmpeq          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public int e()
		{
			if(f)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field boolean f>
		//*   2    4:ifeq            17
				return a - b;
		//    3    7:aload_0         
		//    4    8:getfield        #37  <Field int a>
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field int b>
		//    7   15:isub            
		//    8   16:ireturn         
			else
				return d;
		//    9   17:aload_0         
		//   10   18:getfield        #43  <Field int d>
		//   11   21:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #60  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #61  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("State{mTargetPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #93  <String "State{mTargetPosition=">
		//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(p);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #35  <Field int p>
		//   11   20:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mData=");
		//   13   24:aload_1         
		//   14   25:ldc1            #98  <String ", mData=">
		//   15   27:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(((Object) (q)));
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #100 <Field SparseArray q>
		//   20   36:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
		//   21   39:pop             
			stringbuilder.append(", mItemCount=");
		//   22   40:aload_1         
		//   23   41:ldc1            #105 <String ", mItemCount=">
		//   24   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(d);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #43  <Field int d>
		//   29   52:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
		//   30   55:pop             
			stringbuilder.append(", mPreviousLayoutItemCount=");
		//   31   56:aload_1         
		//   32   57:ldc1            #107 <String ", mPreviousLayoutItemCount=">
		//   33   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(a);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #37  <Field int a>
		//   38   68:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
		//   39   71:pop             
			stringbuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
		//   40   72:aload_1         
		//   41   73:ldc1            #109 <String ", mDeletedInvisibleItemCountSincePreviousLayout=">
		//   42   75:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   43   78:pop             
			stringbuilder.append(b);
		//   44   79:aload_1         
		//   45   80:aload_0         
		//   46   81:getfield        #39  <Field int b>
		//   47   84:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
		//   48   87:pop             
			stringbuilder.append(", mStructureChanged=");
		//   49   88:aload_1         
		//   50   89:ldc1            #111 <String ", mStructureChanged=">
		//   51   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   52   94:pop             
			stringbuilder.append(e);
		//   53   95:aload_1         
		//   54   96:aload_0         
		//   55   97:getfield        #45  <Field boolean e>
		//   56  100:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
		//   57  103:pop             
			stringbuilder.append(", mInPreLayout=");
		//   58  104:aload_1         
		//   59  105:ldc1            #116 <String ", mInPreLayout=">
		//   60  107:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   61  110:pop             
			stringbuilder.append(f);
		//   62  111:aload_1         
		//   63  112:aload_0         
		//   64  113:getfield        #47  <Field boolean f>
		//   65  116:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
		//   66  119:pop             
			stringbuilder.append(", mRunSimpleAnimations=");
		//   67  120:aload_1         
		//   68  121:ldc1            #118 <String ", mRunSimpleAnimations=">
		//   69  123:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   70  126:pop             
			stringbuilder.append(i);
		//   71  127:aload_1         
		//   72  128:aload_0         
		//   73  129:getfield        #53  <Field boolean i>
		//   74  132:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
		//   75  135:pop             
			stringbuilder.append(", mRunPredictiveAnimations=");
		//   76  136:aload_1         
		//   77  137:ldc1            #120 <String ", mRunPredictiveAnimations=">
		//   78  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   79  142:pop             
			stringbuilder.append(j);
		//   80  143:aload_1         
		//   81  144:aload_0         
		//   82  145:getfield        #55  <Field boolean j>
		//   83  148:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
		//   84  151:pop             
			stringbuilder.append('}');
		//   85  152:aload_1         
		//   86  153:bipush          125
		//   87  155:invokevirtual   #123 <Method StringBuilder StringBuilder.append(char)>
		//   88  158:pop             
			return stringbuilder.toString();
		//   89  159:aload_1         
		//   90  160:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   91  163:areturn         
		}

		int a;
		int b;
		int c;
		int d;
		boolean e;
		boolean f;
		boolean g;
		boolean h;
		boolean i;
		boolean j;
		int k;
		long l;
		int m;
		int n;
		int o;
		private int p;
		private SparseArray q;

		public r()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			p = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #35  <Field int p>
			a = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #37  <Field int a>
			b = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #39  <Field int b>
			c = 1;
		//   11   19:aload_0         
		//   12   20:iconst_1        
		//   13   21:putfield        #41  <Field int c>
			d = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #43  <Field int d>
			e = false;
		//   17   29:aload_0         
		//   18   30:iconst_0        
		//   19   31:putfield        #45  <Field boolean e>
			f = false;
		//   20   34:aload_0         
		//   21   35:iconst_0        
		//   22   36:putfield        #47  <Field boolean f>
			g = false;
		//   23   39:aload_0         
		//   24   40:iconst_0        
		//   25   41:putfield        #49  <Field boolean g>
			h = false;
		//   26   44:aload_0         
		//   27   45:iconst_0        
		//   28   46:putfield        #51  <Field boolean h>
			i = false;
		//   29   49:aload_0         
		//   30   50:iconst_0        
		//   31   51:putfield        #53  <Field boolean i>
			j = false;
		//   32   54:aload_0         
		//   33   55:iconst_0        
		//   34   56:putfield        #55  <Field boolean j>
		//   35   59:return          
		}
	}

	public static abstract class s
	{

		public abstract View a(n n1, int i1, int j1);
	}

	class t
		implements Runnable
	{

		private float a(float f1)
		{
			return (float)Math.sin((f1 - 0.5F) * 0.4712389F);
		//    0    0:fload_1         
		//    1    1:ldc1            #51  <Float 0.5F>
		//    2    3:fsub            
		//    3    4:ldc1            #52  <Float 0.4712389F>
		//    4    6:fmul            
		//    5    7:f2d             
		//    6    8:invokestatic    #58  <Method double Math.sin(double)>
		//    7   11:d2f             
		//    8   12:freturn         
		}

		static OverScroller a(t t1)
		{
			return t1.e;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field OverScroller e>
		//    2    4:areturn         
		}

		private int b(int i1, int j1, int k1, int l1)
		{
			int i2 = Math.abs(i1);
		//    0    0:iload_1         
		//    1    1:invokestatic    #64  <Method int Math.abs(int)>
		//    2    4:istore          9
			int j2 = Math.abs(j1);
		//    3    6:iload_2         
		//    4    7:invokestatic    #64  <Method int Math.abs(int)>
		//    5   10:istore          10
			boolean flag;
			if(i2 > j2)
		//*   6   12:iload           9
		//*   7   14:iload           10
		//*   8   16:icmple          25
				flag = true;
		//    9   19:iconst_1        
		//   10   20:istore          8
			else
		//*  11   22:goto            28
				flag = false;
		//   12   25:iconst_0        
		//   13   26:istore          8
			k1 = (int)Math.sqrt(k1 * k1 + l1 * l1);
		//   14   28:iload_3         
		//   15   29:iload_3         
		//   16   30:imul            
		//   17   31:iload           4
		//   18   33:iload           4
		//   19   35:imul            
		//   20   36:iadd            
		//   21   37:i2d             
		//   22   38:invokestatic    #67  <Method double Math.sqrt(double)>
		//   23   41:d2i             
		//   24   42:istore_3        
			j1 = (int)Math.sqrt(i1 * i1 + j1 * j1);
		//   25   43:iload_1         
		//   26   44:iload_1         
		//   27   45:imul            
		//   28   46:iload_2         
		//   29   47:iload_2         
		//   30   48:imul            
		//   31   49:iadd            
		//   32   50:i2d             
		//   33   51:invokestatic    #67  <Method double Math.sqrt(double)>
		//   34   54:d2i             
		//   35   55:istore_2        
			if(flag)
		//*  36   56:iload           8
		//*  37   58:ifeq            72
				i1 = b.getWidth();
		//   38   61:aload_0         
		//   39   62:getfield        #25  <Field RecyclerView b>
		//   40   65:invokevirtual   #71  <Method int RecyclerView.getWidth()>
		//   41   68:istore_1        
			else
		//*  42   69:goto            80
				i1 = b.getHeight();
		//   43   72:aload_0         
		//   44   73:getfield        #25  <Field RecyclerView b>
		//   45   76:invokevirtual   #74  <Method int RecyclerView.getHeight()>
		//   46   79:istore_1        
			l1 = i1 / 2;
		//   47   80:iload_1         
		//   48   81:iconst_2        
		//   49   82:idiv            
		//   50   83:istore          4
			float f2 = j1;
		//   51   85:iload_2         
		//   52   86:i2f             
		//   53   87:fstore          6
			float f1 = i1;
		//   54   89:iload_1         
		//   55   90:i2f             
		//   56   91:fstore          5
			float f3 = Math.min(1.0F, (f2 * 1.0F) / f1);
		//   57   93:fconst_1        
		//   58   94:fload           6
		//   59   96:fconst_1        
		//   60   97:fmul            
		//   61   98:fload           5
		//   62  100:fdiv            
		//   63  101:invokestatic    #78  <Method float Math.min(float, float)>
		//   64  104:fstore          7
			f2 = l1;
		//   65  106:iload           4
		//   66  108:i2f             
		//   67  109:fstore          6
			f3 = a(f3);
		//   68  111:aload_0         
		//   69  112:fload           7
		//   70  114:invokespecial   #80  <Method float a(float)>
		//   71  117:fstore          7
			if(k1 > 0)
		//*  72  119:iload_3         
		//*  73  120:ifle            149
			{
				i1 = Math.round(Math.abs((f2 + f3 * f2) / (float)k1) * 1000F) * 4;
		//   74  123:fload           6
		//   75  125:fload           7
		//   76  127:fload           6
		//   77  129:fmul            
		//   78  130:fadd            
		//   79  131:iload_3         
		//   80  132:i2f             
		//   81  133:fdiv            
		//   82  134:invokestatic    #82  <Method float Math.abs(float)>
		//   83  137:ldc1            #83  <Float 1000F>
		//   84  139:fmul            
		//   85  140:invokestatic    #87  <Method int Math.round(float)>
		//   86  143:iconst_4        
		//   87  144:imul            
		//   88  145:istore_1        
			} else
		//*  89  146:goto            175
			{
				if(flag)
		//*  90  149:iload           8
		//*  91  151:ifeq            160
					i1 = i2;
		//   92  154:iload           9
		//   93  156:istore_1        
				else
		//*  94  157:goto            163
					i1 = j2;
		//   95  160:iload           10
		//   96  162:istore_1        
				i1 = (int)(((float)i1 / f1 + 1.0F) * 300F);
		//   97  163:iload_1         
		//   98  164:i2f             
		//   99  165:fload           5
		//  100  167:fdiv            
		//  101  168:fconst_1        
		//  102  169:fadd            
		//  103  170:ldc1            #88  <Float 300F>
		//  104  172:fmul            
		//  105  173:f2i             
		//  106  174:istore_1        
			}
			return Math.min(i1, 2000);
		//  107  175:iload_1         
		//  108  176:sipush          2000
		//  109  179:invokestatic    #91  <Method int Math.min(int, int)>
		//  110  182:ireturn         
		}

		private void c()
		{
			g = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #37  <Field boolean g>
			f = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #35  <Field boolean f>
		//    6   10:return          
		}

		private void d()
		{
			f = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #35  <Field boolean f>
			if(g)
		//*   3    5:aload_0         
		//*   4    6:getfield        #37  <Field boolean g>
		//*   5    9:ifeq            16
				a();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #93  <Method void a()>
		//    8   16:return          
		}

		void a()
		{
			if(f)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field boolean f>
		//*   2    4:ifeq            13
			{
				g = true;
		//    3    7:aload_0         
		//    4    8:iconst_1        
		//    5    9:putfield        #37  <Field boolean g>
				return;
		//    6   12:return          
			} else
			{
				b.removeCallbacks(((Runnable) (this)));
		//    7   13:aload_0         
		//    8   14:getfield        #25  <Field RecyclerView b>
		//    9   17:aload_0         
		//   10   18:invokevirtual   #97  <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   11   21:pop             
				android.support.v4.view.s.a(((View) (b)), ((Runnable) (this)));
		//   12   22:aload_0         
		//   13   23:getfield        #25  <Field RecyclerView b>
		//   14   26:aload_0         
		//   15   27:invokestatic    #102 <Method void s.a(View, Runnable)>
				return;
		//   16   30:return          
			}
		}

		public void a(int i1, int j1)
		{
			b.setScrollState(2);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field RecyclerView b>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
			d = 0;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #109 <Field int d>
			c = 0;
		//    7   13:aload_0         
		//    8   14:iconst_0        
		//    9   15:putfield        #111 <Field int c>
			e.fling(0, 0, i1, j1, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
		//   10   18:aload_0         
		//   11   19:getfield        #48  <Field OverScroller e>
		//   12   22:iconst_0        
		//   13   23:iconst_0        
		//   14   24:iload_1         
		//   15   25:iload_2         
		//   16   26:ldc1            #112 <Int 0x80000000>
		//   17   28:ldc1            #113 <Int 0x7fffffff>
		//   18   30:ldc1            #112 <Int 0x80000000>
		//   19   32:ldc1            #113 <Int 0x7fffffff>
		//   20   34:invokevirtual   #117 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
			a();
		//   21   37:aload_0         
		//   22   38:invokevirtual   #93  <Method void a()>
		//   23   41:return          
		}

		public void a(int i1, int j1, int k1)
		{
			a(i1, j1, k1, RecyclerView.H);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:getstatic       #31  <Field Interpolator RecyclerView.H>
		//    5    7:invokevirtual   #121 <Method void a(int, int, int, Interpolator)>
		//    6   10:return          
		}

		public void a(int i1, int j1, int k1, int l1)
		{
			a(i1, j1, b(i1, j1, k1, l1));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:aload_0         
		//    4    4:iload_1         
		//    5    5:iload_2         
		//    6    6:iload_3         
		//    7    7:iload           4
		//    8    9:invokespecial   #124 <Method int b(int, int, int, int)>
		//    9   12:invokevirtual   #126 <Method void a(int, int, int)>
		//   10   15:return          
		}

		public void a(int i1, int j1, int k1, Interpolator interpolator)
		{
			if(a != interpolator)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Interpolator a>
		//*   2    4:aload           4
		//*   3    6:if_acmpeq       35
			{
				a = interpolator;
		//    4    9:aload_0         
		//    5   10:aload           4
		//    6   12:putfield        #33  <Field Interpolator a>
				e = new OverScroller(b.getContext(), interpolator);
		//    7   15:aload_0         
		//    8   16:new             #39  <Class OverScroller>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:getfield        #25  <Field RecyclerView b>
		//   12   24:invokevirtual   #43  <Method Context RecyclerView.getContext()>
		//   13   27:aload           4
		//   14   29:invokespecial   #46  <Method void OverScroller(Context, Interpolator)>
		//   15   32:putfield        #48  <Field OverScroller e>
			}
			b.setScrollState(2);
		//   16   35:aload_0         
		//   17   36:getfield        #25  <Field RecyclerView b>
		//   18   39:iconst_2        
		//   19   40:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
			d = 0;
		//   20   43:aload_0         
		//   21   44:iconst_0        
		//   22   45:putfield        #109 <Field int d>
			c = 0;
		//   23   48:aload_0         
		//   24   49:iconst_0        
		//   25   50:putfield        #111 <Field int c>
			e.startScroll(0, 0, i1, j1, k1);
		//   26   53:aload_0         
		//   27   54:getfield        #48  <Field OverScroller e>
		//   28   57:iconst_0        
		//   29   58:iconst_0        
		//   30   59:iload_1         
		//   31   60:iload_2         
		//   32   61:iload_3         
		//   33   62:invokevirtual   #130 <Method void OverScroller.startScroll(int, int, int, int, int)>
			if(android.os.Build.VERSION.SDK_INT < 23)
		//*  34   65:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
		//*  35   68:bipush          23
		//*  36   70:icmpge          81
				e.computeScrollOffset();
		//   37   73:aload_0         
		//   38   74:getfield        #48  <Field OverScroller e>
		//   39   77:invokevirtual   #139 <Method boolean OverScroller.computeScrollOffset()>
		//   40   80:pop             
			a();
		//   41   81:aload_0         
		//   42   82:invokevirtual   #93  <Method void a()>
		//   43   85:return          
		}

		public void a(int i1, int j1, Interpolator interpolator)
		{
			int k1 = b(i1, j1, 0, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:invokespecial   #124 <Method int b(int, int, int, int)>
		//    6    8:istore          4
			Interpolator interpolator1 = interpolator;
		//    7   10:aload_3         
		//    8   11:astore          5
			if(interpolator == null)
		//*   9   13:aload_3         
		//*  10   14:ifnonnull       22
				interpolator1 = RecyclerView.H;
		//   11   17:getstatic       #31  <Field Interpolator RecyclerView.H>
		//   12   20:astore          5
			a(i1, j1, k1, interpolator1);
		//   13   22:aload_0         
		//   14   23:iload_1         
		//   15   24:iload_2         
		//   16   25:iload           4
		//   17   27:aload           5
		//   18   29:invokevirtual   #121 <Method void a(int, int, int, Interpolator)>
		//   19   32:return          
		}

		public void b()
		{
			b.removeCallbacks(((Runnable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field RecyclerView b>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #97  <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//    4    8:pop             
			e.abortAnimation();
		//    5    9:aload_0         
		//    6   10:getfield        #48  <Field OverScroller e>
		//    7   13:invokevirtual   #143 <Method void OverScroller.abortAnimation()>
		//    8   16:return          
		}

		public void b(int i1, int j1)
		{
			a(i1, j1, 0, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:invokevirtual   #145 <Method void a(int, int, int, int)>
		//    6    8:return          
		}

		public void run()
		{
			q q1;
label0:
			{
				int i2;
				int j2;
				int k2;
				int i3;
				OverScroller overscroller;
label1:
				{
					int i1;
					int j1;
					int l2;
					int j3;
					int k3;
					int l3;
label2:
					{
						if(b.m == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field RecyclerView b>
		//*   2    4:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//*   3    7:ifnonnull       15
						{
							b();
		//    4   10:aload_0         
		//    5   11:invokevirtual   #152 <Method void b()>
							return;
		//    6   14:return          
						}
						c();
		//    7   15:aload_0         
		//    8   16:invokespecial   #154 <Method void c()>
						b.d();
		//    9   19:aload_0         
		//   10   20:getfield        #25  <Field RecyclerView b>
		//   11   23:invokevirtual   #156 <Method void RecyclerView.d()>
						overscroller = e;
		//   12   26:aload_0         
		//   13   27:getfield        #48  <Field OverScroller e>
		//   14   30:astore          13
						q1 = b.m.t;
		//   15   32:aload_0         
		//   16   33:getfield        #25  <Field RecyclerView b>
		//   17   36:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//   18   39:getfield        #161 <Field RecyclerView$q android.support.v7.widget.RecyclerView$h.t>
		//   19   42:astore          14
						if(!overscroller.computeScrollOffset())
							break label0;
		//   20   44:aload           13
		//   21   46:invokevirtual   #139 <Method boolean OverScroller.computeScrollOffset()>
		//   22   49:ifeq            881
						int ai1[] = android.support.v7.widget.RecyclerView.a(b);
		//   23   52:aload_0         
		//   24   53:getfield        #25  <Field RecyclerView b>
		//   25   56:invokestatic    #164 <Method int[] android.support.v7.widget.RecyclerView.a(RecyclerView)>
		//   26   59:astore          15
						k3 = overscroller.getCurrX();
		//   27   61:aload           13
		//   28   63:invokevirtual   #167 <Method int OverScroller.getCurrX()>
		//   29   66:istore          11
						l3 = overscroller.getCurrY();
		//   30   68:aload           13
		//   31   70:invokevirtual   #170 <Method int OverScroller.getCurrY()>
		//   32   73:istore          12
						j1 = k3 - c;
		//   33   75:iload           11
		//   34   77:aload_0         
		//   35   78:getfield        #111 <Field int c>
		//   36   81:isub            
		//   37   82:istore_2        
						i1 = l3 - d;
		//   38   83:iload           12
		//   39   85:aload_0         
		//   40   86:getfield        #109 <Field int d>
		//   41   89:isub            
		//   42   90:istore_1        
						c = k3;
		//   43   91:aload_0         
		//   44   92:iload           11
		//   45   94:putfield        #111 <Field int c>
						d = l3;
		//   46   97:aload_0         
		//   47   98:iload           12
		//   48  100:putfield        #109 <Field int d>
						j2 = j1;
		//   49  103:iload_2         
		//   50  104:istore          6
						i2 = i1;
		//   51  106:iload_1         
		//   52  107:istore          5
						if(b.a(j1, i1, ai1, ((int []) (null)), 1))
		//*  53  109:aload_0         
		//*  54  110:getfield        #25  <Field RecyclerView b>
		//*  55  113:iload_2         
		//*  56  114:iload_1         
		//*  57  115:aload           15
		//*  58  117:aconst_null     
		//*  59  118:iconst_1        
		//*  60  119:invokevirtual   #173 <Method boolean android.support.v7.widget.RecyclerView.a(int, int, int[], int[], int)>
		//*  61  122:ifeq            141
						{
							j2 = j1 - ai1[0];
		//   62  125:iload_2         
		//   63  126:aload           15
		//   64  128:iconst_0        
		//   65  129:iaload          
		//   66  130:isub            
		//   67  131:istore          6
							i2 = i1 - ai1[1];
		//   68  133:iload_1         
		//   69  134:aload           15
		//   70  136:iconst_1        
		//   71  137:iaload          
		//   72  138:isub            
		//   73  139:istore          5
						}
						if(b.l != null)
		//*  74  141:aload_0         
		//*  75  142:getfield        #25  <Field RecyclerView b>
		//*  76  145:getfield        #177 <Field RecyclerView$a RecyclerView.l>
		//*  77  148:ifnull          446
						{
							b.e();
		//   78  151:aload_0         
		//   79  152:getfield        #25  <Field RecyclerView b>
		//   80  155:invokevirtual   #179 <Method void RecyclerView.e()>
							b.l();
		//   81  158:aload_0         
		//   82  159:getfield        #25  <Field RecyclerView b>
		//   83  162:invokevirtual   #181 <Method void RecyclerView.l()>
							android.support.v4.os.b.a("RV Scroll");
		//   84  165:ldc1            #183 <String "RV Scroll">
		//   85  167:invokestatic    #188 <Method void b.a(String)>
							b.a(b.B);
		//   86  170:aload_0         
		//   87  171:getfield        #25  <Field RecyclerView b>
		//   88  174:aload_0         
		//   89  175:getfield        #25  <Field RecyclerView b>
		//   90  178:getfield        #192 <Field RecyclerView$r RecyclerView.B>
		//   91  181:invokevirtual   #195 <Method void android.support.v7.widget.RecyclerView.a(RecyclerView$r)>
							if(j2 != 0)
		//*  92  184:iload           6
		//*  93  186:ifeq            224
							{
								i1 = b.m.a(j2, b.d, b.B);
		//   94  189:aload_0         
		//   95  190:getfield        #25  <Field RecyclerView b>
		//   96  193:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//   97  196:iload           6
		//   98  198:aload_0         
		//   99  199:getfield        #25  <Field RecyclerView b>
		//  100  202:getfield        #198 <Field RecyclerView$n RecyclerView.d>
		//  101  205:aload_0         
		//  102  206:getfield        #25  <Field RecyclerView b>
		//  103  209:getfield        #192 <Field RecyclerView$r RecyclerView.B>
		//  104  212:invokevirtual   #201 <Method int android.support.v7.widget.RecyclerView$h.a(int, RecyclerView$n, RecyclerView$r)>
		//  105  215:istore_1        
								j1 = j2 - i1;
		//  106  216:iload           6
		//  107  218:iload_1         
		//  108  219:isub            
		//  109  220:istore_2        
							} else
		//* 110  221:goto            228
							{
								i1 = 0;
		//  111  224:iconst_0        
		//  112  225:istore_1        
								j1 = 0;
		//  113  226:iconst_0        
		//  114  227:istore_2        
							}
							int k1;
							int l1;
							if(i2 != 0)
		//* 115  228:iload           5
		//* 116  230:ifeq            269
							{
								k1 = b.m.b(i2, b.d, b.B);
		//  117  233:aload_0         
		//  118  234:getfield        #25  <Field RecyclerView b>
		//  119  237:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//  120  240:iload           5
		//  121  242:aload_0         
		//  122  243:getfield        #25  <Field RecyclerView b>
		//  123  246:getfield        #198 <Field RecyclerView$n RecyclerView.d>
		//  124  249:aload_0         
		//  125  250:getfield        #25  <Field RecyclerView b>
		//  126  253:getfield        #192 <Field RecyclerView$r RecyclerView.B>
		//  127  256:invokevirtual   #203 <Method int android.support.v7.widget.RecyclerView$h.b(int, RecyclerView$n, RecyclerView$r)>
		//  128  259:istore_3        
								l1 = i2 - k1;
		//  129  260:iload           5
		//  130  262:iload_3         
		//  131  263:isub            
		//  132  264:istore          4
							} else
		//* 133  266:goto            274
							{
								k1 = 0;
		//  134  269:iconst_0        
		//  135  270:istore_3        
								l1 = 0;
		//  136  271:iconst_0        
		//  137  272:istore          4
							}
							android.support.v4.os.b.a();
		//  138  274:invokestatic    #204 <Method void b.a()>
							b.x();
		//  139  277:aload_0         
		//  140  278:getfield        #25  <Field RecyclerView b>
		//  141  281:invokevirtual   #207 <Method void RecyclerView.x()>
							b.m();
		//  142  284:aload_0         
		//  143  285:getfield        #25  <Field RecyclerView b>
		//  144  288:invokevirtual   #209 <Method void RecyclerView.m()>
							b.a(false);
		//  145  291:aload_0         
		//  146  292:getfield        #25  <Field RecyclerView b>
		//  147  295:iconst_0        
		//  148  296:invokevirtual   #212 <Method void android.support.v7.widget.RecyclerView.a(boolean)>
							k2 = i1;
		//  149  299:iload_1         
		//  150  300:istore          7
							j3 = j1;
		//  151  302:iload_2         
		//  152  303:istore          10
							i3 = k1;
		//  153  305:iload_3         
		//  154  306:istore          9
							l2 = l1;
		//  155  308:iload           4
		//  156  310:istore          8
							if(q1 != null)
		//* 157  312:aload           14
		//* 158  314:ifnull          458
							{
								k2 = i1;
		//  159  317:iload_1         
		//  160  318:istore          7
								j3 = j1;
		//  161  320:iload_2         
		//  162  321:istore          10
								i3 = k1;
		//  163  323:iload_3         
		//  164  324:istore          9
								l2 = l1;
		//  165  326:iload           4
		//  166  328:istore          8
								if(!q1.b())
		//* 167  330:aload           14
		//* 168  332:invokevirtual   #216 <Method boolean android.support.v7.widget.RecyclerView$q.b()>
		//* 169  335:ifne            458
								{
									k2 = i1;
		//  170  338:iload_1         
		//  171  339:istore          7
									j3 = j1;
		//  172  341:iload_2         
		//  173  342:istore          10
									i3 = k1;
		//  174  344:iload_3         
		//  175  345:istore          9
									l2 = l1;
		//  176  347:iload           4
		//  177  349:istore          8
									if(q1.c())
		//* 178  351:aload           14
		//* 179  353:invokevirtual   #218 <Method boolean RecyclerView$q.c()>
		//* 180  356:ifeq            458
									{
										k2 = b.B.e();
		//  181  359:aload_0         
		//  182  360:getfield        #25  <Field RecyclerView b>
		//  183  363:getfield        #192 <Field RecyclerView$r RecyclerView.B>
		//  184  366:invokevirtual   #222 <Method int RecyclerView$r.e()>
		//  185  369:istore          7
										if(k2 == 0)
		//* 186  371:iload           7
		//* 187  373:ifne            397
										{
											q1.a();
		//  188  376:aload           14
		//  189  378:invokevirtual   #223 <Method void android.support.v7.widget.RecyclerView$q.a()>
											k2 = i1;
		//  190  381:iload_1         
		//  191  382:istore          7
											j3 = j1;
		//  192  384:iload_2         
		//  193  385:istore          10
											i3 = k1;
		//  194  387:iload_3         
		//  195  388:istore          9
											l2 = l1;
		//  196  390:iload           4
		//  197  392:istore          8
										} else
		//* 198  394:goto            458
										{
											if(q1.d() >= k2)
		//* 199  397:aload           14
		//* 200  399:invokevirtual   #225 <Method int RecyclerView$q.d()>
		//* 201  402:iload           7
		//* 202  404:icmplt          416
												q1.a(k2 - 1);
		//  203  407:aload           14
		//  204  409:iload           7
		//  205  411:iconst_1        
		//  206  412:isub            
		//  207  413:invokevirtual   #227 <Method void android.support.v7.widget.RecyclerView$q.a(int)>
											android.support.v7.widget.q.a(q1, j2 - j1, i2 - l1);
		//  208  416:aload           14
		//  209  418:iload           6
		//  210  420:iload_2         
		//  211  421:isub            
		//  212  422:iload           5
		//  213  424:iload           4
		//  214  426:isub            
		//  215  427:invokestatic    #230 <Method void android.support.v7.widget.RecyclerView$q.a(RecyclerView$q, int, int)>
											k2 = i1;
		//  216  430:iload_1         
		//  217  431:istore          7
											j3 = j1;
		//  218  433:iload_2         
		//  219  434:istore          10
											i3 = k1;
		//  220  436:iload_3         
		//  221  437:istore          9
											l2 = l1;
		//  222  439:iload           4
		//  223  441:istore          8
										}
									}
								}
							}
						} else
		//* 224  443:goto            458
						{
							k2 = 0;
		//  225  446:iconst_0        
		//  226  447:istore          7
							j3 = 0;
		//  227  449:iconst_0        
		//  228  450:istore          10
							i3 = 0;
		//  229  452:iconst_0        
		//  230  453:istore          9
							l2 = 0;
		//  231  455:iconst_0        
		//  232  456:istore          8
						}
						if(!b.o.isEmpty())
		//* 233  458:aload_0         
		//* 234  459:getfield        #25  <Field RecyclerView b>
		//* 235  462:getfield        #234 <Field ArrayList RecyclerView.o>
		//* 236  465:invokevirtual   #239 <Method boolean ArrayList.isEmpty()>
		//* 237  468:ifne            478
							b.invalidate();
		//  238  471:aload_0         
		//  239  472:getfield        #25  <Field RecyclerView b>
		//  240  475:invokevirtual   #242 <Method void RecyclerView.invalidate()>
						if(b.getOverScrollMode() != 2)
		//* 241  478:aload_0         
		//* 242  479:getfield        #25  <Field RecyclerView b>
		//* 243  482:invokevirtual   #245 <Method int RecyclerView.getOverScrollMode()>
		//* 244  485:iconst_2        
		//* 245  486:icmpeq          500
							b.c(j2, i2);
		//  246  489:aload_0         
		//  247  490:getfield        #25  <Field RecyclerView b>
		//  248  493:iload           6
		//  249  495:iload           5
		//  250  497:invokevirtual   #247 <Method void RecyclerView.c(int, int)>
						if(b.a(k2, i3, j3, l2, ((int []) (null)), 1) || j3 == 0 && l2 == 0)
							break label1;
		//  251  500:aload_0         
		//  252  501:getfield        #25  <Field RecyclerView b>
		//  253  504:iload           7
		//  254  506:iload           9
		//  255  508:iload           10
		//  256  510:iload           8
		//  257  512:aconst_null     
		//  258  513:iconst_1        
		//  259  514:invokevirtual   #250 <Method boolean android.support.v7.widget.RecyclerView.a(int, int, int, int, int[], int)>
		//  260  517:ifne            658
		//  261  520:iload           10
		//  262  522:ifne            530
		//  263  525:iload           8
		//  264  527:ifeq            658
						j1 = (int)overscroller.getCurrVelocity();
		//  265  530:aload           13
		//  266  532:invokevirtual   #254 <Method float OverScroller.getCurrVelocity()>
		//  267  535:f2i             
		//  268  536:istore_2        
						if(j3 != k3)
		//* 269  537:iload           10
		//* 270  539:iload           11
		//* 271  541:icmpeq          565
						{
							if(j3 < 0)
		//* 272  544:iload           10
		//* 273  546:ifge            555
							{
								i1 = -j1;
		//  274  549:iload_2         
		//  275  550:ineg            
		//  276  551:istore_1        
								break label2;
		//  277  552:goto            567
							}
							if(j3 > 0)
		//* 278  555:iload           10
		//* 279  557:ifle            565
							{
								i1 = j1;
		//  280  560:iload_2         
		//  281  561:istore_1        
								break label2;
		//  282  562:goto            567
							}
						}
						i1 = 0;
		//  283  565:iconst_0        
		//  284  566:istore_1        
					}
label3:
					{
						if(l2 != l3)
		//* 285  567:iload           8
		//* 286  569:iload           12
		//* 287  571:icmpeq          593
						{
							if(l2 < 0)
		//* 288  574:iload           8
		//* 289  576:ifge            585
							{
								j1 = -j1;
		//  290  579:iload_2         
		//  291  580:ineg            
		//  292  581:istore_2        
								break label3;
		//  293  582:goto            595
							}
							if(l2 > 0)
		//* 294  585:iload           8
		//* 295  587:ifle            593
								break label3;
		//  296  590:goto            595
						}
						j1 = 0;
		//  297  593:iconst_0        
		//  298  594:istore_2        
					}
					if(b.getOverScrollMode() != 2)
		//* 299  595:aload_0         
		//* 300  596:getfield        #25  <Field RecyclerView b>
		//* 301  599:invokevirtual   #245 <Method int RecyclerView.getOverScrollMode()>
		//* 302  602:iconst_2        
		//* 303  603:icmpeq          615
						b.d(i1, j1);
		//  304  606:aload_0         
		//  305  607:getfield        #25  <Field RecyclerView b>
		//  306  610:iload_1         
		//  307  611:iload_2         
		//  308  612:invokevirtual   #256 <Method void RecyclerView.d(int, int)>
					if((i1 != 0 || j3 == k3 || overscroller.getFinalX() == 0) && (j1 != 0 || l2 == l3 || overscroller.getFinalY() == 0))
		//* 309  615:iload_1         
		//* 310  616:ifne            634
		//* 311  619:iload           10
		//* 312  621:iload           11
		//* 313  623:icmpeq          634
		//* 314  626:aload           13
		//* 315  628:invokevirtual   #259 <Method int OverScroller.getFinalX()>
		//* 316  631:ifne            658
		//* 317  634:iload_2         
		//* 318  635:ifne            653
		//* 319  638:iload           8
		//* 320  640:iload           12
		//* 321  642:icmpeq          653
		//* 322  645:aload           13
		//* 323  647:invokevirtual   #262 <Method int OverScroller.getFinalY()>
		//* 324  650:ifne            658
						overscroller.abortAnimation();
		//  325  653:aload           13
		//  326  655:invokevirtual   #143 <Method void OverScroller.abortAnimation()>
				}
				if(k2 != 0 || i3 != 0)
		//* 327  658:iload           7
		//* 328  660:ifne            668
		//* 329  663:iload           9
		//* 330  665:ifeq            679
					b.i(k2, i3);
		//  331  668:aload_0         
		//  332  669:getfield        #25  <Field RecyclerView b>
		//  333  672:iload           7
		//  334  674:iload           9
		//  335  676:invokevirtual   #265 <Method void RecyclerView.i(int, int)>
				if(!android.support.v7.widget.RecyclerView.b(b))
		//* 336  679:aload_0         
		//* 337  680:getfield        #25  <Field RecyclerView b>
		//* 338  683:invokestatic    #268 <Method boolean android.support.v7.widget.RecyclerView.b(RecyclerView)>
		//* 339  686:ifne            696
					b.invalidate();
		//  340  689:aload_0         
		//  341  690:getfield        #25  <Field RecyclerView b>
		//  342  693:invokevirtual   #242 <Method void RecyclerView.invalidate()>
				boolean flag;
				if(i2 != 0 && b.m.e() && i3 == i2)
		//* 343  696:iload           5
		//* 344  698:ifeq            726
		//* 345  701:aload_0         
		//* 346  702:getfield        #25  <Field RecyclerView b>
		//* 347  705:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//* 348  708:invokevirtual   #270 <Method boolean RecyclerView$h.e()>
		//* 349  711:ifeq            726
		//* 350  714:iload           9
		//* 351  716:iload           5
		//* 352  718:icmpne          726
					flag = true;
		//  353  721:iconst_1        
		//  354  722:istore_1        
				else
		//* 355  723:goto            728
					flag = false;
		//  356  726:iconst_0        
		//  357  727:istore_1        
				boolean flag1;
				if(j2 != 0 && b.m.d() && k2 == j2)
		//* 358  728:iload           6
		//* 359  730:ifeq            758
		//* 360  733:aload_0         
		//* 361  734:getfield        #25  <Field RecyclerView b>
		//* 362  737:getfield        #150 <Field RecyclerView$h RecyclerView.m>
		//* 363  740:invokevirtual   #272 <Method boolean RecyclerView$h.d()>
		//* 364  743:ifeq            758
		//* 365  746:iload           7
		//* 366  748:iload           6
		//* 367  750:icmpne          758
					flag1 = true;
		//  368  753:iconst_1        
		//  369  754:istore_2        
				else
		//* 370  755:goto            760
					flag1 = false;
		//  371  758:iconst_0        
		//  372  759:istore_2        
				if((j2 != 0 || i2 != 0) && !flag1 && !flag)
		//* 373  760:iload           6
		//* 374  762:ifne            770
		//* 375  765:iload           5
		//* 376  767:ifeq            786
		//* 377  770:iload_2         
		//* 378  771:ifne            786
		//* 379  774:iload_1         
		//* 380  775:ifeq            781
		//* 381  778:goto            786
					flag = false;
		//  382  781:iconst_0        
		//  383  782:istore_1        
				else
		//* 384  783:goto            788
					flag = true;
		//  385  786:iconst_1        
		//  386  787:istore_1        
				if(!overscroller.isFinished() && (flag || b.i(1)))
		//* 387  788:aload           13
		//* 388  790:invokevirtual   #275 <Method boolean OverScroller.isFinished()>
		//* 389  793:ifne            849
		//* 390  796:iload_1         
		//* 391  797:ifne            814
		//* 392  800:aload_0         
		//* 393  801:getfield        #25  <Field RecyclerView b>
		//* 394  804:iconst_1        
		//* 395  805:invokevirtual   #278 <Method boolean RecyclerView.i(int)>
		//* 396  808:ifne            814
		//* 397  811:goto            849
				{
					a();
		//  398  814:aload_0         
		//  399  815:invokevirtual   #93  <Method void a()>
					if(b.z != null)
		//* 400  818:aload_0         
		//* 401  819:getfield        #25  <Field RecyclerView b>
		//* 402  822:getfield        #282 <Field ad RecyclerView.z>
		//* 403  825:ifnull          881
						b.z.a(b, j2, i2);
		//  404  828:aload_0         
		//  405  829:getfield        #25  <Field RecyclerView b>
		//  406  832:getfield        #282 <Field ad RecyclerView.z>
		//  407  835:aload_0         
		//  408  836:getfield        #25  <Field RecyclerView b>
		//  409  839:iload           6
		//  410  841:iload           5
		//  411  843:invokevirtual   #287 <Method void android.support.v7.widget.ad.a(RecyclerView, int, int)>
				} else
		//* 412  846:goto            881
				{
					b.setScrollState(0);
		//  413  849:aload_0         
		//  414  850:getfield        #25  <Field RecyclerView b>
		//  415  853:iconst_0        
		//  416  854:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
					if(RecyclerView.z())
		//* 417  857:invokestatic    #289 <Method boolean RecyclerView.z()>
		//* 418  860:ifeq            873
						b.A.a();
		//  419  863:aload_0         
		//  420  864:getfield        #25  <Field RecyclerView b>
		//  421  867:getfield        #293 <Field ad$a RecyclerView.A>
		//  422  870:invokevirtual   #296 <Method void android.support.v7.widget.ad$a.a()>
					b.h(1);
		//  423  873:aload_0         
		//  424  874:getfield        #25  <Field RecyclerView b>
		//  425  877:iconst_1        
		//  426  878:invokevirtual   #299 <Method void android.support.v7.widget.RecyclerView.h(int)>
				}
			}
			if(q1 != null)
		//* 427  881:aload           14
		//* 428  883:ifnull          913
			{
				if(q1.b())
		//* 429  886:aload           14
		//* 430  888:invokevirtual   #216 <Method boolean android.support.v7.widget.RecyclerView$q.b()>
		//* 431  891:ifeq            901
					android.support.v7.widget.q.a(q1, 0, 0);
		//  432  894:aload           14
		//  433  896:iconst_0        
		//  434  897:iconst_0        
		//  435  898:invokestatic    #230 <Method void android.support.v7.widget.RecyclerView$q.a(RecyclerView$q, int, int)>
				if(!g)
		//* 436  901:aload_0         
		//* 437  902:getfield        #37  <Field boolean g>
		//* 438  905:ifne            913
					q1.a();
		//  439  908:aload           14
		//  440  910:invokevirtual   #223 <Method void android.support.v7.widget.RecyclerView$q.a()>
			}
			d();
		//  441  913:aload_0         
		//  442  914:invokespecial   #300 <Method void d()>
		//  443  917:return          
		}

		Interpolator a;
		final RecyclerView b;
		private int c;
		private int d;
		private OverScroller e;
		private boolean f;
		private boolean g;

		t()
		{
			b = RecyclerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field RecyclerView b>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
			a = RecyclerView.H;
		//    5    9:aload_0         
		//    6   10:getstatic       #31  <Field Interpolator RecyclerView.H>
		//    7   13:putfield        #33  <Field Interpolator a>
			f = false;
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:putfield        #35  <Field boolean f>
			g = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #37  <Field boolean g>
			e = new OverScroller(getContext(), RecyclerView.H);
		//   14   26:aload_0         
		//   15   27:new             #39  <Class OverScroller>
		//   16   30:dup             
		//   17   31:aload_1         
		//   18   32:invokevirtual   #43  <Method Context RecyclerView.getContext()>
		//   19   35:getstatic       #31  <Field Interpolator RecyclerView.H>
		//   20   38:invokespecial   #46  <Method void OverScroller(Context, Interpolator)>
		//   21   41:putfield        #48  <Field OverScroller e>
		//   22   44:return          
		}
	}

	public static abstract class u
	{

		private boolean A()
		{
			return (n & 0x10) == 0 && android.support.v4.view.s.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:bipush          16
		//    3    6:iand            
		//    4    7:ifne            22
		//    5   10:aload_0         
		//    6   11:getfield        #90  <Field View a>
		//    7   14:invokestatic    #99  <Method boolean s.b(View)>
		//    8   17:ifeq            22
		//    9   20:iconst_1        
		//   10   21:ireturn         
		//   11   22:iconst_0        
		//   12   23:ireturn         
		}

		static n a(u u1, n n1)
		{
			u1.q = n1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #75  <Field RecyclerView$n q>
			return n1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static void a(u u1, RecyclerView recyclerview)
		{
			u1.a(recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #104 <Method void a(RecyclerView)>
		//    3    5:return          
		}

		private void a(RecyclerView recyclerview)
		{
			s = android.support.v4.view.s.d(a);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #90  <Field View a>
		//    3    5:invokestatic    #107 <Method int s.d(View)>
		//    4    8:putfield        #79  <Field int s>
			recyclerview.a(this, 4);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:iconst_4        
		//    8   14:invokevirtual   #110 <Method boolean android.support.v7.widget.RecyclerView.a(RecyclerView$u, int)>
		//    9   17:pop             
		//   10   18:return          
		}

		static boolean a(u u1)
		{
			return u1.A();
		//    0    0:aload_0         
		//    1    1:invokespecial   #113 <Method boolean A()>
		//    2    4:ireturn         
		}

		static boolean a(u u1, boolean flag)
		{
			u1.r = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #77  <Field boolean r>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

		static void b(u u1, RecyclerView recyclerview)
		{
			u1.b(recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #116 <Method void b(RecyclerView)>
		//    3    5:return          
		}

		private void b(RecyclerView recyclerview)
		{
			recyclerview.a(this, s);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_0         
		//    3    3:getfield        #79  <Field int s>
		//    4    6:invokevirtual   #110 <Method boolean android.support.v7.widget.RecyclerView.a(RecyclerView$u, int)>
		//    5    9:pop             
			s = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #79  <Field int s>
		//    9   15:return          
		}

		static boolean b(u u1)
		{
			return u1.r;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field boolean r>
		//    2    4:ireturn         
		}

		static boolean c(u u1)
		{
			return u1.z();
		//    0    0:aload_0         
		//    1    1:invokespecial   #119 <Method boolean z()>
		//    2    4:ireturn         
		}

		static int d(u u1)
		{
			return u1.n;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:ireturn         
		}

		private void y()
		{
			if(j == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field List j>
		//*   2    4:ifnonnull       29
			{
				j = ((List) (new ArrayList()));
		//    3    7:aload_0         
		//    4    8:new             #123 <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #124 <Method void ArrayList()>
		//    7   15:putfield        #69  <Field List j>
				k = Collections.unmodifiableList(j);
		//    8   18:aload_0         
		//    9   19:aload_0         
		//   10   20:getfield        #69  <Field List j>
		//   11   23:invokestatic    #128 <Method List Collections.unmodifiableList(List)>
		//   12   26:putfield        #71  <Field List k>
			}
		//   13   29:return          
		}

		private boolean z()
		{
			return (n & 0x10) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:bipush          16
		//    3    6:iand            
		//    4    7:ifeq            12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		void a()
		{
			d = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #55  <Field int d>
			g = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #63  <Field int g>
		//    6   10:return          
		}

		void a(int i1, int j1)
		{
			n = i1 & j1 | n & j1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iand            
		//    4    4:aload_0         
		//    5    5:getfield        #94  <Field int n>
		//    6    8:iload_2         
		//    7    9:iand            
		//    8   10:ior             
		//    9   11:putfield        #94  <Field int n>
		//   10   14:return          
		}

		void a(int i1, int j1, boolean flag)
		{
			b(8);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:invokevirtual   #133 <Method void b(int)>
			a(j1, flag);
		//    3    6:aload_0         
		//    4    7:iload_2         
		//    5    8:iload_3         
		//    6    9:invokevirtual   #136 <Method void a(int, boolean)>
			c = i1;
		//    7   12:aload_0         
		//    8   13:iload_1         
		//    9   14:putfield        #53  <Field int c>
		//   10   17:return          
		}

		void a(int i1, boolean flag)
		{
			if(d == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #55  <Field int d>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          16
				d = c;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #53  <Field int c>
		//    7   13:putfield        #55  <Field int d>
			if(g == -1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #63  <Field int g>
		//*  10   20:iconst_m1       
		//*  11   21:icmpne          32
				g = c;
		//   12   24:aload_0         
		//   13   25:aload_0         
		//   14   26:getfield        #53  <Field int c>
		//   15   29:putfield        #63  <Field int g>
			if(flag)
		//*  16   32:iload_2         
		//*  17   33:ifeq            46
				g = g + i1;
		//   18   36:aload_0         
		//   19   37:aload_0         
		//   20   38:getfield        #63  <Field int g>
		//   21   41:iload_1         
		//   22   42:iadd            
		//   23   43:putfield        #63  <Field int g>
			c = c + i1;
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #53  <Field int c>
		//   27   51:iload_1         
		//   28   52:iadd            
		//   29   53:putfield        #53  <Field int c>
			if(a.getLayoutParams() != null)
		//*  30   56:aload_0         
		//*  31   57:getfield        #90  <Field View a>
		//*  32   60:invokevirtual   #142 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  33   63:ifnull          80
				((LayoutParams)a.getLayoutParams()).e = true;
		//   34   66:aload_0         
		//   35   67:getfield        #90  <Field View a>
		//   36   70:invokevirtual   #142 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   37   73:checkcast       #144 <Class RecyclerView$LayoutParams>
		//   38   76:iconst_1        
		//   39   77:putfield        #146 <Field boolean RecyclerView$LayoutParams.e>
		//   40   80:return          
		}

		void a(n n1, boolean flag)
		{
			q = n1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #75  <Field RecyclerView$n q>
			r = flag;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #77  <Field boolean r>
		//    6   10:return          
		}

		void a(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				b(1024);
		//    2    4:aload_0         
		//    3    5:sipush          1024
		//    4    8:invokevirtual   #133 <Method void b(int)>
				return;
		//    5   11:return          
			}
			if((0x400 & n) == 0)
		//*   6   12:sipush          1024
		//*   7   15:aload_0         
		//*   8   16:getfield        #94  <Field int n>
		//*   9   19:iand            
		//*  10   20:ifne            38
			{
				y();
		//   11   23:aload_0         
		//   12   24:invokespecial   #150 <Method void y()>
				j.add(obj);
		//   13   27:aload_0         
		//   14   28:getfield        #69  <Field List j>
		//   15   31:aload_1         
		//   16   32:invokeinterface #156 <Method boolean List.add(Object)>
		//   17   37:pop             
			}
		//   18   38:return          
		}

		public final void a(boolean flag)
		{
			int i1;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            14
				i1 = p - 1;
		//    2    4:aload_0         
		//    3    5:getfield        #73  <Field int p>
		//    4    8:iconst_1        
		//    5    9:isub            
		//    6   10:istore_2        
			else
		//*   7   11:goto            21
				i1 = p + 1;
		//    8   14:aload_0         
		//    9   15:getfield        #73  <Field int p>
		//   10   18:iconst_1        
		//   11   19:iadd            
		//   12   20:istore_2        
			p = i1;
		//   13   21:aload_0         
		//   14   22:iload_2         
		//   15   23:putfield        #73  <Field int p>
			if(p < 0)
		//*  16   26:aload_0         
		//*  17   27:getfield        #73  <Field int p>
		//*  18   30:ifge            70
			{
				p = 0;
		//   19   33:aload_0         
		//   20   34:iconst_0        
		//   21   35:putfield        #73  <Field int p>
				StringBuilder stringbuilder = new StringBuilder();
		//   22   38:new             #159 <Class StringBuilder>
		//   23   41:dup             
		//   24   42:invokespecial   #160 <Method void StringBuilder()>
		//   25   45:astore_3        
				stringbuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
		//   26   46:aload_3         
		//   27   47:ldc1            #162 <String "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ">
		//   28   49:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   29   52:pop             
				stringbuilder.append(((Object) (this)));
		//   30   53:aload_3         
		//   31   54:aload_0         
		//   32   55:invokevirtual   #169 <Method StringBuilder StringBuilder.append(Object)>
		//   33   58:pop             
				Log.e("View", stringbuilder.toString());
		//   34   59:ldc1            #171 <String "View">
		//   35   61:aload_3         
		//   36   62:invokevirtual   #175 <Method String StringBuilder.toString()>
		//   37   65:invokestatic    #180 <Method int Log.e(String, String)>
		//   38   68:pop             
				return;
		//   39   69:return          
			}
			if(!flag && p == 1)
		//*  40   70:iload_1         
		//*  41   71:ifne            96
		//*  42   74:aload_0         
		//*  43   75:getfield        #73  <Field int p>
		//*  44   78:iconst_1        
		//*  45   79:icmpne          96
				i1 = n | 0x10;
		//   46   82:aload_0         
		//   47   83:getfield        #94  <Field int n>
		//   48   86:bipush          16
		//   49   88:ior             
		//   50   89:istore_2        
			else
		//*  51   90:aload_0         
		//*  52   91:iload_2         
		//*  53   92:putfield        #94  <Field int n>
		//*  54   95:return          
			if(flag && p == 0)
		//*  55   96:iload_1         
		//*  56   97:ifeq            118
		//*  57  100:aload_0         
		//*  58  101:getfield        #73  <Field int p>
		//*  59  104:ifne            118
				i1 = n & 0xffffffef;
		//   60  107:aload_0         
		//   61  108:getfield        #94  <Field int n>
		//   62  111:bipush          -17
		//   63  113:iand            
		//   64  114:istore_2        
			else
		//*  65  115:goto            90
				return;
		//   66  118:return          
			n = i1;
		}

		boolean a(int i1)
		{
			return (i1 & n) != 0;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #94  <Field int n>
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		void b()
		{
			if(d == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #55  <Field int d>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          16
				d = c;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #53  <Field int c>
		//    7   13:putfield        #55  <Field int d>
		//    8   16:return          
		}

		void b(int i1)
		{
			n = i1 | n;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_0         
		//    3    3:getfield        #94  <Field int n>
		//    4    6:ior             
		//    5    7:putfield        #94  <Field int n>
		//    6   10:return          
		}

		boolean c()
		{
			return (n & 0x80) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:sipush          128
		//    3    7:iand            
		//    4    8:ifeq            13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public final int d()
		{
			if(g == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field int g>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          13
				return c;
		//    4    8:aload_0         
		//    5    9:getfield        #53  <Field int c>
		//    6   12:ireturn         
			else
				return g;
		//    7   13:aload_0         
		//    8   14:getfield        #63  <Field int g>
		//    9   17:ireturn         
		}

		public final int e()
		{
			if(m == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #184 <Field RecyclerView m>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			else
				return m.d(this);
		//    5    9:aload_0         
		//    6   10:getfield        #184 <Field RecyclerView m>
		//    7   13:aload_0         
		//    8   14:invokevirtual   #186 <Method int RecyclerView.d(RecyclerView$u)>
		//    9   17:ireturn         
		}

		public final int f()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field int d>
		//    2    4:ireturn         
		}

		public final long g()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field long e>
		//    2    4:lreturn         
		}

		public final int h()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field int f>
		//    2    4:ireturn         
		}

		boolean i()
		{
			return q != null;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field RecyclerView$n q>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		void j()
		{
			q.c(this);
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field RecyclerView$n q>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #192 <Method void RecyclerView$n.c(RecyclerView$u)>
		//    4    8:return          
		}

		boolean k()
		{
			return (n & 0x20) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:bipush          32
		//    3    6:iand            
		//    4    7:ifeq            12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		void l()
		{
			n = n & 0xffffffdf;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #94  <Field int n>
		//    3    5:bipush          -33
		//    4    7:iand            
		//    5    8:putfield        #94  <Field int n>
		//    6   11:return          
		}

		void m()
		{
			n = n & 0xfffffeff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #94  <Field int n>
		//    3    5:sipush          -257
		//    4    8:iand            
		//    5    9:putfield        #94  <Field int n>
		//    6   12:return          
		}

		boolean n()
		{
			return (n & 4) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		boolean o()
		{
			return (n & 2) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		boolean p()
		{
			return (n & 1) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		boolean q()
		{
			return (n & 8) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:bipush          8
		//    3    6:iand            
		//    4    7:ifeq            12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		boolean r()
		{
			return (n & 0x100) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:sipush          256
		//    3    7:iand            
		//    4    8:ifeq            13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		boolean s()
		{
			return (n & 0x200) != 0 || n();
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:sipush          512
		//    3    7:iand            
		//    4    8:ifne            23
		//    5   11:aload_0         
		//    6   12:invokevirtual   #194 <Method boolean n()>
		//    7   15:ifeq            21
		//    8   18:goto            23
		//    9   21:iconst_0        
		//   10   22:ireturn         
		//   11   23:iconst_1        
		//   12   24:ireturn         
		}

		void t()
		{
			if(j != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field List j>
		//*   2    4:ifnull          16
				j.clear();
		//    3    7:aload_0         
		//    4    8:getfield        #69  <Field List j>
		//    5   11:invokeinterface #198 <Method void List.clear()>
			n = n & 0xfffffbff;
		//    6   16:aload_0         
		//    7   17:aload_0         
		//    8   18:getfield        #94  <Field int n>
		//    9   21:sipush          -1025
		//   10   24:iand            
		//   11   25:putfield        #94  <Field int n>
		//   12   28:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #159 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #160 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("ViewHolder{");
		//    4    8:aload_1         
		//    5    9:ldc1            #200 <String "ViewHolder{">
		//    6   11:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokevirtual   #203 <Method int Object.hashCode()>
		//   11   20:invokestatic    #209 <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" position=");
		//   14   27:aload_1         
		//   15   28:ldc1            #211 <String " position=">
		//   16   30:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(c);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #53  <Field int c>
		//   21   39:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append(" id=");
		//   23   43:aload_1         
		//   24   44:ldc1            #216 <String " id=">
		//   25   46:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			stringbuilder.append(e);
		//   27   50:aload_1         
		//   28   51:aload_0         
		//   29   52:getfield        #59  <Field long e>
		//   30   55:invokevirtual   #219 <Method StringBuilder StringBuilder.append(long)>
		//   31   58:pop             
			stringbuilder.append(", oldPos=");
		//   32   59:aload_1         
		//   33   60:ldc1            #221 <String ", oldPos=">
		//   34   62:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   35   65:pop             
			stringbuilder.append(d);
		//   36   66:aload_1         
		//   37   67:aload_0         
		//   38   68:getfield        #55  <Field int d>
		//   39   71:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   40   74:pop             
			stringbuilder.append(", pLpos:");
		//   41   75:aload_1         
		//   42   76:ldc1            #223 <String ", pLpos:">
		//   43   78:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   44   81:pop             
			stringbuilder.append(g);
		//   45   82:aload_1         
		//   46   83:aload_0         
		//   47   84:getfield        #63  <Field int g>
		//   48   87:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   49   90:pop             
			StringBuilder stringbuilder2 = new StringBuilder(stringbuilder.toString());
		//   50   91:new             #159 <Class StringBuilder>
		//   51   94:dup             
		//   52   95:aload_1         
		//   53   96:invokevirtual   #175 <Method String StringBuilder.toString()>
		//   54   99:invokespecial   #224 <Method void StringBuilder(String)>
		//   55  102:astore_2        
			if(i())
		//*  56  103:aload_0         
		//*  57  104:invokevirtual   #226 <Method boolean i()>
		//*  58  107:ifeq            139
			{
				stringbuilder2.append(" scrap ");
		//   59  110:aload_2         
		//   60  111:ldc1            #228 <String " scrap ">
		//   61  113:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   62  116:pop             
				String s1;
				if(r)
		//*  63  117:aload_0         
		//*  64  118:getfield        #77  <Field boolean r>
		//*  65  121:ifeq            130
					s1 = "[changeScrap]";
		//   66  124:ldc1            #230 <String "[changeScrap]">
		//   67  126:astore_1        
				else
		//*  68  127:goto            133
					s1 = "[attachedScrap]";
		//   69  130:ldc1            #232 <String "[attachedScrap]">
		//   70  132:astore_1        
				stringbuilder2.append(s1);
		//   71  133:aload_2         
		//   72  134:aload_1         
		//   73  135:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   74  138:pop             
			}
			if(n())
		//*  75  139:aload_0         
		//*  76  140:invokevirtual   #194 <Method boolean n()>
		//*  77  143:ifeq            153
				stringbuilder2.append(" invalid");
		//   78  146:aload_2         
		//   79  147:ldc1            #234 <String " invalid">
		//   80  149:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   81  152:pop             
			if(!p())
		//*  82  153:aload_0         
		//*  83  154:invokevirtual   #236 <Method boolean p()>
		//*  84  157:ifne            167
				stringbuilder2.append(" unbound");
		//   85  160:aload_2         
		//   86  161:ldc1            #238 <String " unbound">
		//   87  163:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   88  166:pop             
			if(o())
		//*  89  167:aload_0         
		//*  90  168:invokevirtual   #240 <Method boolean o()>
		//*  91  171:ifeq            181
				stringbuilder2.append(" update");
		//   92  174:aload_2         
		//   93  175:ldc1            #242 <String " update">
		//   94  177:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//   95  180:pop             
			if(q())
		//*  96  181:aload_0         
		//*  97  182:invokevirtual   #244 <Method boolean q()>
		//*  98  185:ifeq            195
				stringbuilder2.append(" removed");
		//   99  188:aload_2         
		//  100  189:ldc1            #246 <String " removed">
		//  101  191:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  102  194:pop             
			if(c())
		//* 103  195:aload_0         
		//* 104  196:invokevirtual   #248 <Method boolean c()>
		//* 105  199:ifeq            209
				stringbuilder2.append(" ignored");
		//  106  202:aload_2         
		//  107  203:ldc1            #250 <String " ignored">
		//  108  205:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  109  208:pop             
			if(r())
		//* 110  209:aload_0         
		//* 111  210:invokevirtual   #252 <Method boolean r()>
		//* 112  213:ifeq            223
				stringbuilder2.append(" tmpDetached");
		//  113  216:aload_2         
		//  114  217:ldc1            #254 <String " tmpDetached">
		//  115  219:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  116  222:pop             
			if(!w())
		//* 117  223:aload_0         
		//* 118  224:invokevirtual   #257 <Method boolean w()>
		//* 119  227:ifne            272
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//  120  230:new             #159 <Class StringBuilder>
		//  121  233:dup             
		//  122  234:invokespecial   #160 <Method void StringBuilder()>
		//  123  237:astore_1        
				stringbuilder1.append(" not recyclable(");
		//  124  238:aload_1         
		//  125  239:ldc2            #259 <String " not recyclable(">
		//  126  242:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  127  245:pop             
				stringbuilder1.append(p);
		//  128  246:aload_1         
		//  129  247:aload_0         
		//  130  248:getfield        #73  <Field int p>
		//  131  251:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//  132  254:pop             
				stringbuilder1.append(")");
		//  133  255:aload_1         
		//  134  256:ldc2            #261 <String ")">
		//  135  259:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  136  262:pop             
				stringbuilder2.append(stringbuilder1.toString());
		//  137  263:aload_2         
		//  138  264:aload_1         
		//  139  265:invokevirtual   #175 <Method String StringBuilder.toString()>
		//  140  268:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  141  271:pop             
			}
			if(s())
		//* 142  272:aload_0         
		//* 143  273:invokevirtual   #263 <Method boolean s()>
		//* 144  276:ifeq            287
				stringbuilder2.append(" undefined adapter position");
		//  145  279:aload_2         
		//  146  280:ldc2            #265 <String " undefined adapter position">
		//  147  283:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  148  286:pop             
			if(a.getParent() == null)
		//* 149  287:aload_0         
		//* 150  288:getfield        #90  <Field View a>
		//* 151  291:invokevirtual   #269 <Method ViewParent View.getParent()>
		//* 152  294:ifnonnull       305
				stringbuilder2.append(" no parent");
		//  153  297:aload_2         
		//  154  298:ldc2            #271 <String " no parent">
		//  155  301:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  156  304:pop             
			stringbuilder2.append("}");
		//  157  305:aload_2         
		//  158  306:ldc2            #273 <String "}">
		//  159  309:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
		//  160  312:pop             
			return stringbuilder2.toString();
		//  161  313:aload_2         
		//  162  314:invokevirtual   #175 <Method String StringBuilder.toString()>
		//  163  317:areturn         
		}

		List u()
		{
			if((n & 0x400) == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #94  <Field int n>
		//*   2    4:sipush          1024
		//*   3    7:iand            
		//*   4    8:ifne            42
			{
				if(j != null && j.size() != 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #69  <Field List j>
		//*   7   15:ifnull          38
		//*   8   18:aload_0         
		//*   9   19:getfield        #69  <Field List j>
		//*  10   22:invokeinterface #277 <Method int List.size()>
		//*  11   27:ifne            33
		//*  12   30:goto            38
					return k;
		//   13   33:aload_0         
		//   14   34:getfield        #71  <Field List k>
		//   15   37:areturn         
				else
					return o;
		//   16   38:getstatic       #46  <Field List o>
		//   17   41:areturn         
			} else
			{
				return o;
		//   18   42:getstatic       #46  <Field List o>
		//   19   45:areturn         
			}
		}

		void v()
		{
			n = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #94  <Field int n>
			c = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #53  <Field int c>
			d = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #55  <Field int d>
			e = -1L;
		//    9   15:aload_0         
		//   10   16:ldc2w           #56  <Long -1L>
		//   11   19:putfield        #59  <Field long e>
			g = -1;
		//   12   22:aload_0         
		//   13   23:iconst_m1       
		//   14   24:putfield        #63  <Field int g>
			p = 0;
		//   15   27:aload_0         
		//   16   28:iconst_0        
		//   17   29:putfield        #73  <Field int p>
			h = null;
		//   18   32:aload_0         
		//   19   33:aconst_null     
		//   20   34:putfield        #65  <Field RecyclerView$u h>
			i = null;
		//   21   37:aload_0         
		//   22   38:aconst_null     
		//   23   39:putfield        #67  <Field RecyclerView$u i>
			t();
		//   24   42:aload_0         
		//   25   43:invokevirtual   #282 <Method void t()>
			s = 0;
		//   26   46:aload_0         
		//   27   47:iconst_0        
		//   28   48:putfield        #79  <Field int s>
			l = -1;
		//   29   51:aload_0         
		//   30   52:iconst_m1       
		//   31   53:putfield        #81  <Field int l>
			RecyclerView.c(this);
		//   32   56:aload_0         
		//   33   57:invokestatic    #283 <Method void RecyclerView.c(RecyclerView$u)>
		//   34   60:return          
		}

		public final boolean w()
		{
			return (n & 0x10) == 0 && !android.support.v4.view.s.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:bipush          16
		//    3    6:iand            
		//    4    7:ifne            22
		//    5   10:aload_0         
		//    6   11:getfield        #90  <Field View a>
		//    7   14:invokestatic    #99  <Method boolean s.b(View)>
		//    8   17:ifne            22
		//    9   20:iconst_1        
		//   10   21:ireturn         
		//   11   22:iconst_0        
		//   12   23:ireturn         
		}

		boolean x()
		{
			return (n & 2) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field int n>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		private static final List o;
		public final View a;
		WeakReference b;
		int c;
		int d;
		long e;
		int f;
		int g;
		u h;
		u i;
		List j;
		List k;
		int l;
		RecyclerView m;
		private int n;
		private int p;
		private n q;
		private boolean r;
		private int s;

		static 
		{
			o = Collections.EMPTY_LIST;
		//    0    0:getstatic       #44  <Field List Collections.EMPTY_LIST>
		//    1    3:putstatic       #46  <Field List o>
		//*   2    6:return          
		}

		public u(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #51  <Method void Object()>
			c = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #53  <Field int c>
			d = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #55  <Field int d>
			e = -1L;
		//    8   14:aload_0         
		//    9   15:ldc2w           #56  <Long -1L>
		//   10   18:putfield        #59  <Field long e>
			f = -1;
		//   11   21:aload_0         
		//   12   22:iconst_m1       
		//   13   23:putfield        #61  <Field int f>
			g = -1;
		//   14   26:aload_0         
		//   15   27:iconst_m1       
		//   16   28:putfield        #63  <Field int g>
			h = null;
		//   17   31:aload_0         
		//   18   32:aconst_null     
		//   19   33:putfield        #65  <Field RecyclerView$u h>
			i = null;
		//   20   36:aload_0         
		//   21   37:aconst_null     
		//   22   38:putfield        #67  <Field RecyclerView$u i>
			j = null;
		//   23   41:aload_0         
		//   24   42:aconst_null     
		//   25   43:putfield        #69  <Field List j>
			k = null;
		//   26   46:aload_0         
		//   27   47:aconst_null     
		//   28   48:putfield        #71  <Field List k>
			p = 0;
		//   29   51:aload_0         
		//   30   52:iconst_0        
		//   31   53:putfield        #73  <Field int p>
			q = null;
		//   32   56:aload_0         
		//   33   57:aconst_null     
		//   34   58:putfield        #75  <Field RecyclerView$n q>
			r = false;
		//   35   61:aload_0         
		//   36   62:iconst_0        
		//   37   63:putfield        #77  <Field boolean r>
			s = 0;
		//   38   66:aload_0         
		//   39   67:iconst_0        
		//   40   68:putfield        #79  <Field int s>
			l = -1;
		//   41   71:aload_0         
		//   42   72:iconst_m1       
		//   43   73:putfield        #81  <Field int l>
			if(view == null)
		//*  44   76:aload_1         
		//*  45   77:ifnonnull       90
			{
				throw new IllegalArgumentException("itemView may not be null");
		//   46   80:new             #83  <Class IllegalArgumentException>
		//   47   83:dup             
		//   48   84:ldc1            #85  <String "itemView may not be null">
		//   49   86:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//   50   89:athrow          
			} else
			{
				a = view;
		//   51   90:aload_0         
		//   52   91:aload_1         
		//   53   92:putfield        #90  <Field View a>
				return;
		//   54   95:return          
			}
		}
	}


	public RecyclerView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #256 <Method void RecyclerView(Context, AttributeSet)>
	//    4    6:return          
	}

	public RecyclerView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #259 <Method void RecyclerView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public RecyclerView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #260 <Method void ViewGroup(Context, AttributeSet, int)>
		O = new p();
	//    5    7:aload_0         
	//    6    8:new             #89  <Class RecyclerView$p>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #263 <Method void RecyclerView$p(RecyclerView)>
	//   10   16:putfield        #265 <Field RecyclerView$p O>
		d = new n();
	//   11   19:aload_0         
	//   12   20:new             #83  <Class RecyclerView$n>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #266 <Method void RecyclerView$n(RecyclerView)>
	//   16   28:putfield        #268 <Field RecyclerView$n d>
		g = new bc();
	//   17   31:aload_0         
	//   18   32:new             #270 <Class bc>
	//   19   35:dup             
	//   20   36:invokespecial   #271 <Method void bc()>
	//   21   39:putfield        #273 <Field bc g>
		i = new Runnable() {

			public void run()
			{
				if(a.s)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field RecyclerView a>
			//*   2    4:getfield        #23  <Field boolean android.support.v7.widget.RecyclerView.s>
			//*   3    7:ifeq            65
				{
					if(a.isLayoutRequested())
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field RecyclerView a>
			//*   6   14:invokevirtual   #27  <Method boolean RecyclerView.isLayoutRequested()>
			//*   7   17:ifeq            21
						return;
			//    8   20:return          
					if(!a.p)
			//*   9   21:aload_0         
			//*  10   22:getfield        #14  <Field RecyclerView a>
			//*  11   25:getfield        #30  <Field boolean RecyclerView.p>
			//*  12   28:ifne            39
					{
						a.requestLayout();
			//   13   31:aload_0         
			//   14   32:getfield        #14  <Field RecyclerView a>
			//   15   35:invokevirtual   #33  <Method void RecyclerView.requestLayout()>
						return;
			//   16   38:return          
					}
					if(a.u)
			//*  17   39:aload_0         
			//*  18   40:getfield        #14  <Field RecyclerView a>
			//*  19   43:getfield        #36  <Field boolean RecyclerView.u>
			//*  20   46:ifeq            58
					{
						a.t = true;
			//   21   49:aload_0         
			//   22   50:getfield        #14  <Field RecyclerView a>
			//   23   53:iconst_1        
			//   24   54:putfield        #39  <Field boolean android.support.v7.widget.RecyclerView.t>
						return;
			//   25   57:return          
					}
					a.d();
			//   26   58:aload_0         
			//   27   59:getfield        #14  <Field RecyclerView a>
			//   28   62:invokevirtual   #42  <Method void RecyclerView.d()>
				}
			//   29   65:return          
			}

			final RecyclerView a;

			
			{
				a = RecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   22   42:aload_0         
	//   23   43:new             #8   <Class RecyclerView$1>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #274 <Method void RecyclerView$1(RecyclerView)>
	//   27   51:putfield        #276 <Field Runnable i>
		j = new Rect();
	//   28   54:aload_0         
	//   29   55:new             #278 <Class Rect>
	//   30   58:dup             
	//   31   59:invokespecial   #279 <Method void Rect()>
	//   32   62:putfield        #281 <Field Rect j>
		Q = new Rect();
	//   33   65:aload_0         
	//   34   66:new             #278 <Class Rect>
	//   35   69:dup             
	//   36   70:invokespecial   #279 <Method void Rect()>
	//   37   73:putfield        #283 <Field Rect Q>
		k = new RectF();
	//   38   76:aload_0         
	//   39   77:new             #285 <Class RectF>
	//   40   80:dup             
	//   41   81:invokespecial   #286 <Method void RectF()>
	//   42   84:putfield        #288 <Field RectF k>
		o = new ArrayList();
	//   43   87:aload_0         
	//   44   88:new             #290 <Class ArrayList>
	//   45   91:dup             
	//   46   92:invokespecial   #291 <Method void ArrayList()>
	//   47   95:putfield        #293 <Field ArrayList o>
		R = new ArrayList();
	//   48   98:aload_0         
	//   49   99:new             #290 <Class ArrayList>
	//   50  102:dup             
	//   51  103:invokespecial   #291 <Method void ArrayList()>
	//   52  106:putfield        #295 <Field ArrayList R>
		T = 0;
	//   53  109:aload_0         
	//   54  110:iconst_0        
	//   55  111:putfield        #297 <Field int T>
		w = false;
	//   56  114:aload_0         
	//   57  115:iconst_0        
	//   58  116:putfield        #299 <Field boolean w>
		ab = 0;
	//   59  119:aload_0         
	//   60  120:iconst_0        
	//   61  121:putfield        #301 <Field int ab>
		ac = 0;
	//   62  124:aload_0         
	//   63  125:iconst_0        
	//   64  126:putfield        #303 <Field int ac>
		x = ((e) (new w()));
	//   65  129:aload_0         
	//   66  130:new             #305 <Class w>
	//   67  133:dup             
	//   68  134:invokespecial   #306 <Method void w()>
	//   69  137:putfield        #308 <Field RecyclerView$e x>
		ah = 0;
	//   70  140:aload_0         
	//   71  141:iconst_0        
	//   72  142:putfield        #310 <Field int ah>
		ai = -1;
	//   73  145:aload_0         
	//   74  146:iconst_m1       
	//   75  147:putfield        #312 <Field int ai>
		as = 1.401298E-45F;
	//   76  150:aload_0         
	//   77  151:ldc2            #313 <Float 1.401298E-45F>
	//   78  154:putfield        #315 <Field float as>
		at = 1.401298E-45F;
	//   79  157:aload_0         
	//   80  158:ldc2            #313 <Float 1.401298E-45F>
	//   81  161:putfield        #317 <Field float at>
		boolean flag1 = true;
	//   82  164:iconst_1        
	//   83  165:istore          5
		au = true;
	//   84  167:aload_0         
	//   85  168:iconst_1        
	//   86  169:putfield        #319 <Field boolean au>
		y = new t();
	//   87  172:aload_0         
	//   88  173:new             #103 <Class RecyclerView$t>
	//   89  176:dup             
	//   90  177:aload_0         
	//   91  178:invokespecial   #320 <Method void RecyclerView$t(RecyclerView)>
	//   92  181:putfield        #322 <Field RecyclerView$t y>
		Object obj;
		if(K)
	//*  93  184:getstatic       #228 <Field boolean K>
	//*  94  187:ifeq            202
			obj = ((Object) (new ad.a()));
	//   95  190:new             #324 <Class ad$a>
	//   96  193:dup             
	//   97  194:invokespecial   #325 <Method void ad$a()>
	//   98  197:astore          6
		else
	//*  99  199:goto            205
			obj = null;
	//  100  202:aconst_null     
	//  101  203:astore          6
		A = ((ad.a) (obj));
	//  102  205:aload_0         
	//  103  206:aload           6
	//  104  208:putfield        #327 <Field ad$a A>
		B = new r();
	//  105  211:aload_0         
	//  106  212:new             #97  <Class RecyclerView$r>
	//  107  215:dup             
	//  108  216:invokespecial   #328 <Method void RecyclerView$r()>
	//  109  219:putfield        #330 <Field RecyclerView$r B>
		C = false;
	//  110  222:aload_0         
	//  111  223:iconst_0        
	//  112  224:putfield        #332 <Field boolean C>
		D = false;
	//  113  227:aload_0         
	//  114  228:iconst_0        
	//  115  229:putfield        #334 <Field boolean D>
		ax = ((e.b) (new f()));
	//  116  232:aload_0         
	//  117  233:new             #49  <Class RecyclerView$f>
	//  118  236:dup             
	//  119  237:aload_0         
	//  120  238:invokespecial   #335 <Method void RecyclerView$f(RecyclerView)>
	//  121  241:putfield        #337 <Field RecyclerView$e$b ax>
		E = false;
	//  122  244:aload_0         
	//  123  245:iconst_0        
	//  124  246:putfield        #339 <Field boolean E>
		az = new int[2];
	//  125  249:aload_0         
	//  126  250:iconst_2        
	//  127  251:newarray        int[]
	//  128  253:putfield        #341 <Field int[] az>
		aB = new int[2];
	//  129  256:aload_0         
	//  130  257:iconst_2        
	//  131  258:newarray        int[]
	//  132  260:putfield        #343 <Field int[] aB>
		aC = new int[2];
	//  133  263:aload_0         
	//  134  264:iconst_2        
	//  135  265:newarray        int[]
	//  136  267:putfield        #345 <Field int[] aC>
		aD = new int[2];
	//  137  270:aload_0         
	//  138  271:iconst_2        
	//  139  272:newarray        int[]
	//  140  274:putfield        #347 <Field int[] aD>
		G = ((List) (new ArrayList()));
	//  141  277:aload_0         
	//  142  278:new             #290 <Class ArrayList>
	//  143  281:dup             
	//  144  282:invokespecial   #291 <Method void ArrayList()>
	//  145  285:putfield        #349 <Field List G>
	//  146  288:aload_0         
	//  147  289:new             #10  <Class RecyclerView$2>
	//  148  292:dup             
	//  149  293:aload_0         
	//  150  294:invokespecial   #350 <Method void RecyclerView$2(RecyclerView)>
	//  151  297:putfield        #352 <Field Runnable aE>
		aF = new bc.b() {

			public void a(u u1)
			{
				a.m.a(u1.a, a.d);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field RecyclerView a>
			//    2    4:getfield        #23  <Field RecyclerView$h RecyclerView.m>
			//    3    7:aload_1         
			//    4    8:getfield        #28  <Field View android.support.v7.widget.RecyclerView$u.a>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field RecyclerView a>
			//    7   15:getfield        #32  <Field RecyclerView$n RecyclerView.d>
			//    8   18:invokevirtual   #37  <Method void android.support.v7.widget.RecyclerView$h.a(View, RecyclerView$n)>
			//    9   21:return          
			}

			public void a(u u1, e.c c1, e.c c2)
			{
				a.d.c(u1);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field RecyclerView a>
			//    2    4:getfield        #32  <Field RecyclerView$n RecyclerView.d>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #43  <Method void RecyclerView$n.c(RecyclerView$u)>
				a.b(u1, c1, c2);
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field RecyclerView a>
			//    7   15:aload_1         
			//    8   16:aload_2         
			//    9   17:aload_3         
			//   10   18:invokevirtual   #46  <Method void android.support.v7.widget.RecyclerView.b(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
			//   11   21:return          
			}

			public void b(u u1, e.c c1, e.c c2)
			{
				a.a(u1, c1, c2);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field RecyclerView a>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #48  <Method void android.support.v7.widget.RecyclerView.a(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
			//    6   10:return          
			}

			public void c(u u1, e.c c1, e.c c2)
			{
				u1.a(false);
			//    0    0:aload_1         
			//    1    1:iconst_0        
			//    2    2:invokevirtual   #51  <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
				if(a.w ? a.x.a(u1, u1, c1, c2) : a.x.c(u1, c1, c2))
			//*   3    5:aload_0         
			//*   4    6:getfield        #14  <Field RecyclerView a>
			//*   5    9:getfield        #55  <Field boolean RecyclerView.w>
			//*   6   12:ifeq            40
			//*   7   15:aload_0         
			//*   8   16:getfield        #14  <Field RecyclerView a>
			//*   9   19:getfield        #59  <Field RecyclerView$e RecyclerView.x>
			//*  10   22:aload_1         
			//*  11   23:aload_1         
			//*  12   24:aload_2         
			//*  13   25:aload_3         
			//*  14   26:invokevirtual   #64  <Method boolean android.support.v7.widget.RecyclerView$e.a(RecyclerView$u, RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
			//*  15   29:ifeq            59
				{
					a.p();
			//   16   32:aload_0         
			//   17   33:getfield        #14  <Field RecyclerView a>
			//   18   36:invokevirtual   #67  <Method void RecyclerView.p()>
					return;
			//   19   39:return          
				} else
			//*  20   40:aload_0         
			//*  21   41:getfield        #14  <Field RecyclerView a>
			//*  22   44:getfield        #59  <Field RecyclerView$e RecyclerView.x>
			//*  23   47:aload_1         
			//*  24   48:aload_2         
			//*  25   49:aload_3         
			//*  26   50:invokevirtual   #70  <Method boolean RecyclerView$e.c(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
			//*  27   53:ifeq            59
			//*  28   56:goto            32
				{
					return;
			//   29   59:return          
				}
			}

			final RecyclerView a;

			
			{
				a = RecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//  152  300:aload_0         
	//  153  301:new             #14  <Class RecyclerView$4>
	//  154  304:dup             
	//  155  305:aload_0         
	//  156  306:invokespecial   #353 <Method void RecyclerView$4(RecyclerView)>
	//  157  309:putfield        #355 <Field bc$b aF>
		if(attributeset != null)
	//* 158  312:aload_2         
	//* 159  313:ifnull          347
		{
			obj = ((Object) (context.obtainStyledAttributes(attributeset, J, i1, 0)));
	//  160  316:aload_1         
	//  161  317:aload_2         
	//  162  318:getstatic       #215 <Field int[] J>
	//  163  321:iload_3         
	//  164  322:iconst_0        
	//  165  323:invokevirtual   #359 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//  166  326:astore          6
			h = ((TypedArray) (obj)).getBoolean(0, true);
	//  167  328:aload_0         
	//  168  329:aload           6
	//  169  331:iconst_0        
	//  170  332:iconst_1        
	//  171  333:invokevirtual   #365 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  172  336:putfield        #367 <Field boolean h>
			((TypedArray) (obj)).recycle();
	//  173  339:aload           6
	//  174  341:invokevirtual   #370 <Method void TypedArray.recycle()>
		} else
	//* 175  344:goto            352
		{
			h = true;
	//  176  347:aload_0         
	//  177  348:iconst_1        
	//  178  349:putfield        #367 <Field boolean h>
		}
		setScrollContainer(true);
	//  179  352:aload_0         
	//  180  353:iconst_1        
	//  181  354:invokevirtual   #374 <Method void setScrollContainer(boolean)>
		setFocusableInTouchMode(true);
	//  182  357:aload_0         
	//  183  358:iconst_1        
	//  184  359:invokevirtual   #377 <Method void setFocusableInTouchMode(boolean)>
		obj = ((Object) (ViewConfiguration.get(context)));
	//  185  362:aload_1         
	//  186  363:invokestatic    #383 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  187  366:astore          6
		ao = ((ViewConfiguration) (obj)).getScaledTouchSlop();
	//  188  368:aload_0         
	//  189  369:aload           6
	//  190  371:invokevirtual   #387 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  191  374:putfield        #389 <Field int ao>
		as = android.support.v4.view.t.a(((ViewConfiguration) (obj)), context);
	//  192  377:aload_0         
	//  193  378:aload           6
	//  194  380:aload_1         
	//  195  381:invokestatic    #394 <Method float t.a(ViewConfiguration, Context)>
	//  196  384:putfield        #315 <Field float as>
		at = android.support.v4.view.t.b(((ViewConfiguration) (obj)), context);
	//  197  387:aload_0         
	//  198  388:aload           6
	//  199  390:aload_1         
	//  200  391:invokestatic    #396 <Method float t.b(ViewConfiguration, Context)>
	//  201  394:putfield        #317 <Field float at>
		aq = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
	//  202  397:aload_0         
	//  203  398:aload           6
	//  204  400:invokevirtual   #399 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  205  403:putfield        #401 <Field int aq>
		ar = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
	//  206  406:aload_0         
	//  207  407:aload           6
	//  208  409:invokevirtual   #404 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//  209  412:putfield        #406 <Field int ar>
		boolean flag;
		if(getOverScrollMode() == 2)
	//* 210  415:aload_0         
	//* 211  416:invokevirtual   #409 <Method int getOverScrollMode()>
	//* 212  419:iconst_2        
	//* 213  420:icmpne          429
			flag = true;
	//  214  423:iconst_1        
	//  215  424:istore          4
		else
	//* 216  426:goto            432
			flag = false;
	//  217  429:iconst_0        
	//  218  430:istore          4
		setWillNotDraw(flag);
	//  219  432:aload_0         
	//  220  433:iload           4
	//  221  435:invokevirtual   #412 <Method void setWillNotDraw(boolean)>
		x.a(ax);
	//  222  438:aload_0         
	//  223  439:getfield        #308 <Field RecyclerView$e x>
	//  224  442:aload_0         
	//  225  443:getfield        #337 <Field RecyclerView$e$b ax>
	//  226  446:invokevirtual   #415 <Method void android.support.v7.widget.RecyclerView$e.a(RecyclerView$e$b)>
		b();
	//  227  449:aload_0         
	//  228  450:invokevirtual   #417 <Method void b()>
		A();
	//  229  453:aload_0         
	//  230  454:invokespecial   #419 <Method void A()>
		if(android.support.v4.view.s.d(((View) (this))) == 0)
	//* 231  457:aload_0         
	//* 232  458:invokestatic    #424 <Method int s.d(View)>
	//* 233  461:ifne            469
			android.support.v4.view.s.a(((View) (this)), 1);
	//  234  464:aload_0         
	//  235  465:iconst_1        
	//  236  466:invokestatic    #427 <Method void s.a(View, int)>
		W = (AccessibilityManager)getContext().getSystemService("accessibility");
	//  237  469:aload_0         
	//  238  470:aload_0         
	//  239  471:invokevirtual   #431 <Method Context getContext()>
	//  240  474:ldc2            #433 <String "accessibility">
	//  241  477:invokevirtual   #437 <Method Object Context.getSystemService(String)>
	//  242  480:checkcast       #439 <Class AccessibilityManager>
	//  243  483:putfield        #441 <Field AccessibilityManager W>
		setAccessibilityDelegateCompat(new ai(this));
	//  244  486:aload_0         
	//  245  487:new             #443 <Class ai>
	//  246  490:dup             
	//  247  491:aload_0         
	//  248  492:invokespecial   #444 <Method void ai(RecyclerView)>
	//  249  495:invokevirtual   #448 <Method void setAccessibilityDelegateCompat(ai)>
		if(attributeset != null)
	//* 250  498:aload_2         
	//* 251  499:ifnull          659
		{
			TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.e.a.c.RecyclerView, i1, 0);
	//  252  502:aload_1         
	//  253  503:aload_2         
	//  254  504:getstatic       #453 <Field int[] android.support.v7.e.a$c.RecyclerView>
	//  255  507:iload_3         
	//  256  508:iconst_0        
	//  257  509:invokevirtual   #359 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//  258  512:astore          6
			String s1 = typedarray.getString(android.support.v7.e.a.c.RecyclerView_layoutManager);
	//  259  514:aload           6
	//  260  516:getstatic       #456 <Field int android.support.v7.e.a$c.RecyclerView_layoutManager>
	//  261  519:invokevirtual   #460 <Method String TypedArray.getString(int)>
	//  262  522:astore          7
			if(typedarray.getInt(android.support.v7.e.a.c.RecyclerView_android_descendantFocusability, -1) == -1)
	//* 263  524:aload           6
	//* 264  526:getstatic       #463 <Field int android.support.v7.e.a$c.RecyclerView_android_descendantFocusability>
	//* 265  529:iconst_m1       
	//* 266  530:invokevirtual   #467 <Method int TypedArray.getInt(int, int)>
	//* 267  533:iconst_m1       
	//* 268  534:icmpne          544
				setDescendantFocusability(0x40000);
	//  269  537:aload_0         
	//  270  538:ldc2            #468 <Int 0x40000>
	//  271  541:invokevirtual   #472 <Method void setDescendantFocusability(int)>
			r = typedarray.getBoolean(android.support.v7.e.a.c.RecyclerView_fastScrollEnabled, false);
	//  272  544:aload_0         
	//  273  545:aload           6
	//  274  547:getstatic       #475 <Field int android.support.v7.e.a$c.RecyclerView_fastScrollEnabled>
	//  275  550:iconst_0        
	//  276  551:invokevirtual   #365 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  277  554:putfield        #477 <Field boolean r>
			if(r)
	//* 278  557:aload_0         
	//* 279  558:getfield        #477 <Field boolean r>
	//* 280  561:ifeq            606
				a((StateListDrawable)typedarray.getDrawable(android.support.v7.e.a.c.RecyclerView_fastScrollVerticalThumbDrawable), typedarray.getDrawable(android.support.v7.e.a.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable)typedarray.getDrawable(android.support.v7.e.a.c.RecyclerView_fastScrollHorizontalThumbDrawable), typedarray.getDrawable(android.support.v7.e.a.c.RecyclerView_fastScrollHorizontalTrackDrawable));
	//  281  564:aload_0         
	//  282  565:aload           6
	//  283  567:getstatic       #480 <Field int android.support.v7.e.a$c.RecyclerView_fastScrollVerticalThumbDrawable>
	//  284  570:invokevirtual   #484 <Method Drawable TypedArray.getDrawable(int)>
	//  285  573:checkcast       #486 <Class StateListDrawable>
	//  286  576:aload           6
	//  287  578:getstatic       #489 <Field int android.support.v7.e.a$c.RecyclerView_fastScrollVerticalTrackDrawable>
	//  288  581:invokevirtual   #484 <Method Drawable TypedArray.getDrawable(int)>
	//  289  584:aload           6
	//  290  586:getstatic       #492 <Field int android.support.v7.e.a$c.RecyclerView_fastScrollHorizontalThumbDrawable>
	//  291  589:invokevirtual   #484 <Method Drawable TypedArray.getDrawable(int)>
	//  292  592:checkcast       #486 <Class StateListDrawable>
	//  293  595:aload           6
	//  294  597:getstatic       #495 <Field int android.support.v7.e.a$c.RecyclerView_fastScrollHorizontalTrackDrawable>
	//  295  600:invokevirtual   #484 <Method Drawable TypedArray.getDrawable(int)>
	//  296  603:invokevirtual   #498 <Method void a(StateListDrawable, Drawable, StateListDrawable, Drawable)>
			typedarray.recycle();
	//  297  606:aload           6
	//  298  608:invokevirtual   #370 <Method void TypedArray.recycle()>
			a(context, s1, attributeset, i1, 0);
	//  299  611:aload_0         
	//  300  612:aload_1         
	//  301  613:aload           7
	//  302  615:aload_2         
	//  303  616:iload_3         
	//  304  617:iconst_0        
	//  305  618:invokespecial   #501 <Method void a(Context, String, AttributeSet, int, int)>
			flag = flag1;
	//  306  621:iload           5
	//  307  623:istore          4
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 308  625:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//* 309  628:bipush          21
	//* 310  630:icmplt          670
			{
				context = ((Context) (context.obtainStyledAttributes(attributeset, I, i1, 0)));
	//  311  633:aload_1         
	//  312  634:aload_2         
	//  313  635:getstatic       #212 <Field int[] I>
	//  314  638:iload_3         
	//  315  639:iconst_0        
	//  316  640:invokevirtual   #359 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//  317  643:astore_1        
				flag = ((TypedArray) (context)).getBoolean(0, true);
	//  318  644:aload_1         
	//  319  645:iconst_0        
	//  320  646:iconst_1        
	//  321  647:invokevirtual   #365 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  322  650:istore          4
				((TypedArray) (context)).recycle();
	//  323  652:aload_1         
	//  324  653:invokevirtual   #370 <Method void TypedArray.recycle()>
			}
		} else
	//* 325  656:goto            670
		{
			setDescendantFocusability(0x40000);
	//  326  659:aload_0         
	//  327  660:ldc2            #468 <Int 0x40000>
	//  328  663:invokevirtual   #472 <Method void setDescendantFocusability(int)>
			flag = flag1;
	//  329  666:iload           5
	//  330  668:istore          4
		}
		setNestedScrollingEnabled(flag);
	//  331  670:aload_0         
	//  332  671:iload           4
	//  333  673:invokevirtual   #504 <Method void setNestedScrollingEnabled(boolean)>
	//  334  676:return          
	}

	private void A()
	{
		f = new android.support.v7.widget.t(new t.b() {

			public int a()
			{
				return a.getChildCount();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:invokevirtual   #24  <Method int RecyclerView.getChildCount()>
			//    3    7:ireturn         
			}

			public int a(View view)
			{
				return a.indexOfChild(view);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #28  <Method int RecyclerView.indexOfChild(View)>
			//    4    8:ireturn         
			}

			public void a(int i1)
			{
				View view = a.getChildAt(i1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #33  <Method View RecyclerView.getChildAt(int)>
			//    4    8:astore_2        
				if(view != null)
			//*   5    9:aload_2         
			//*   6   10:ifnull          25
				{
					a.k(view);
			//    7   13:aload_0         
			//    8   14:getfield        #17  <Field RecyclerView a>
			//    9   17:aload_2         
			//   10   18:invokevirtual   #37  <Method void android.support.v7.widget.RecyclerView.k(View)>
					view.clearAnimation();
			//   11   21:aload_2         
			//   12   22:invokevirtual   #42  <Method void View.clearAnimation()>
				}
				a.removeViewAt(i1);
			//   13   25:aload_0         
			//   14   26:getfield        #17  <Field RecyclerView a>
			//   15   29:iload_1         
			//   16   30:invokevirtual   #45  <Method void RecyclerView.removeViewAt(int)>
			//   17   33:return          
			}

			public void a(View view, int i1)
			{
				a.addView(view, i1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #49  <Method void RecyclerView.addView(View, int)>
				a.l(view);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field RecyclerView a>
			//    7   13:aload_1         
			//    8   14:invokevirtual   #52  <Method void RecyclerView.l(View)>
			//    9   17:return          
			}

			public void a(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
			{
				u u1 = RecyclerView.e(view);
			//    0    0:aload_1         
			//    1    1:invokestatic    #57  <Method RecyclerView$u RecyclerView.e(View)>
			//    2    4:astore          4
				if(u1 != null)
			//*   3    6:aload           4
			//*   4    8:ifnull          78
				{
					if(!u1.r() && !u1.c())
			//*   5   11:aload           4
			//*   6   13:invokevirtual   #63  <Method boolean RecyclerView$u.r()>
			//*   7   16:ifne            73
			//*   8   19:aload           4
			//*   9   21:invokevirtual   #66  <Method boolean RecyclerView$u.c()>
			//*  10   24:ifne            73
					{
						view = ((View) (new StringBuilder()));
			//   11   27:new             #68  <Class StringBuilder>
			//   12   30:dup             
			//   13   31:invokespecial   #69  <Method void StringBuilder()>
			//   14   34:astore_1        
						((StringBuilder) (view)).append("Called attach on a child which is not detached: ");
			//   15   35:aload_1         
			//   16   36:ldc1            #71  <String "Called attach on a child which is not detached: ">
			//   17   38:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
			//   18   41:pop             
						((StringBuilder) (view)).append(((Object) (u1)));
			//   19   42:aload_1         
			//   20   43:aload           4
			//   21   45:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
			//   22   48:pop             
						((StringBuilder) (view)).append(a.a());
			//   23   49:aload_1         
			//   24   50:aload_0         
			//   25   51:getfield        #17  <Field RecyclerView a>
			//   26   54:invokevirtual   #81  <Method String android.support.v7.widget.RecyclerView.a()>
			//   27   57:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
			//   28   60:pop             
						throw new IllegalArgumentException(((StringBuilder) (view)).toString());
			//   29   61:new             #83  <Class IllegalArgumentException>
			//   30   64:dup             
			//   31   65:aload_1         
			//   32   66:invokevirtual   #86  <Method String StringBuilder.toString()>
			//   33   69:invokespecial   #89  <Method void IllegalArgumentException(String)>
			//   34   72:athrow          
					}
					u1.m();
			//   35   73:aload           4
			//   36   75:invokevirtual   #92  <Method void RecyclerView$u.m()>
				}
				android.support.v7.widget.RecyclerView.a(a, view, i1, layoutparams);
			//   37   78:aload_0         
			//   38   79:getfield        #17  <Field RecyclerView a>
			//   39   82:aload_1         
			//   40   83:iload_2         
			//   41   84:aload_3         
			//   42   85:invokestatic    #95  <Method void android.support.v7.widget.RecyclerView.a(RecyclerView, View, int, android.view.ViewGroup$LayoutParams)>
			//   43   88:return          
			}

			public u b(View view)
			{
				return RecyclerView.e(view);
			//    0    0:aload_1         
			//    1    1:invokestatic    #57  <Method RecyclerView$u RecyclerView.e(View)>
			//    2    4:areturn         
			}

			public View b(int i1)
			{
				return a.getChildAt(i1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #33  <Method View RecyclerView.getChildAt(int)>
			//    4    8:areturn         
			}

			public void b()
			{
				int j1 = a();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #98  <Method int a()>
			//    2    4:istore_2        
				for(int i1 = 0; i1 < j1; i1++)
			//*   3    5:iconst_0        
			//*   4    6:istore_1        
			//*   5    7:iload_1         
			//*   6    8:iload_2         
			//*   7    9:icmpge          37
				{
					View view = b(i1);
			//    8   12:aload_0         
			//    9   13:iload_1         
			//   10   14:invokevirtual   #100 <Method View b(int)>
			//   11   17:astore_3        
					a.k(view);
			//   12   18:aload_0         
			//   13   19:getfield        #17  <Field RecyclerView a>
			//   14   22:aload_3         
			//   15   23:invokevirtual   #37  <Method void android.support.v7.widget.RecyclerView.k(View)>
					view.clearAnimation();
			//   16   26:aload_3         
			//   17   27:invokevirtual   #42  <Method void View.clearAnimation()>
				}

			//   18   30:iload_1         
			//   19   31:iconst_1        
			//   20   32:iadd            
			//   21   33:istore_1        
			//*  22   34:goto            7
				a.removeAllViews();
			//   23   37:aload_0         
			//   24   38:getfield        #17  <Field RecyclerView a>
			//   25   41:invokevirtual   #103 <Method void RecyclerView.removeAllViews()>
			//   26   44:return          
			}

			public void c(int i1)
			{
				Object obj = ((Object) (b(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #100 <Method View b(int)>
			//    3    5:astore_2        
				if(obj != null)
			//*   4    6:aload_2         
			//*   5    7:ifnull          85
				{
					obj = ((Object) (RecyclerView.e(((View) (obj)))));
			//    6   10:aload_2         
			//    7   11:invokestatic    #57  <Method RecyclerView$u RecyclerView.e(View)>
			//    8   14:astore_2        
					if(obj != null)
			//*   9   15:aload_2         
			//*  10   16:ifnull          85
					{
						if(((u) (obj)).r() && !((u) (obj)).c())
			//*  11   19:aload_2         
			//*  12   20:invokevirtual   #63  <Method boolean RecyclerView$u.r()>
			//*  13   23:ifeq            78
			//*  14   26:aload_2         
			//*  15   27:invokevirtual   #66  <Method boolean RecyclerView$u.c()>
			//*  16   30:ifne            78
						{
							StringBuilder stringbuilder = new StringBuilder();
			//   17   33:new             #68  <Class StringBuilder>
			//   18   36:dup             
			//   19   37:invokespecial   #69  <Method void StringBuilder()>
			//   20   40:astore_3        
							stringbuilder.append("called detach on an already detached child ");
			//   21   41:aload_3         
			//   22   42:ldc1            #105 <String "called detach on an already detached child ">
			//   23   44:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
			//   24   47:pop             
							stringbuilder.append(obj);
			//   25   48:aload_3         
			//   26   49:aload_2         
			//   27   50:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
			//   28   53:pop             
							stringbuilder.append(a.a());
			//   29   54:aload_3         
			//   30   55:aload_0         
			//   31   56:getfield        #17  <Field RecyclerView a>
			//   32   59:invokevirtual   #81  <Method String android.support.v7.widget.RecyclerView.a()>
			//   33   62:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
			//   34   65:pop             
							throw new IllegalArgumentException(stringbuilder.toString());
			//   35   66:new             #83  <Class IllegalArgumentException>
			//   36   69:dup             
			//   37   70:aload_3         
			//   38   71:invokevirtual   #86  <Method String StringBuilder.toString()>
			//   39   74:invokespecial   #89  <Method void IllegalArgumentException(String)>
			//   40   77:athrow          
						}
						((u) (obj)).b(256);
			//   41   78:aload_2         
			//   42   79:sipush          256
			//   43   82:invokevirtual   #107 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
					}
				}
				android.support.v7.widget.RecyclerView.a(a, i1);
			//   44   85:aload_0         
			//   45   86:getfield        #17  <Field RecyclerView a>
			//   46   89:iload_1         
			//   47   90:invokestatic    #110 <Method void android.support.v7.widget.RecyclerView.a(RecyclerView, int)>
			//   48   93:return          
			}

			public void c(View view)
			{
				view = ((View) (RecyclerView.e(view)));
			//    0    0:aload_1         
			//    1    1:invokestatic    #57  <Method RecyclerView$u RecyclerView.e(View)>
			//    2    4:astore_1        
				if(view != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          17
					android.support.v7.widget.u.a(((u) (view)), a);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field RecyclerView a>
			//    8   14:invokestatic    #113 <Method void android.support.v7.widget.RecyclerView$u.a(RecyclerView$u, RecyclerView)>
			//    9   17:return          
			}

			public void d(View view)
			{
				view = ((View) (RecyclerView.e(view)));
			//    0    0:aload_1         
			//    1    1:invokestatic    #57  <Method RecyclerView$u RecyclerView.e(View)>
			//    2    4:astore_1        
				if(view != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          17
					android.support.v7.widget.u.b(((u) (view)), a);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field RecyclerView a>
			//    8   14:invokestatic    #116 <Method void android.support.v7.widget.RecyclerView$u.b(RecyclerView$u, RecyclerView)>
			//    9   17:return          
			}

			final RecyclerView a;

			
			{
				a = RecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #506 <Class android.support.v7.widget.t>
	//    2    4:dup             
	//    3    5:new             #16  <Class RecyclerView$5>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #507 <Method void RecyclerView$5(RecyclerView)>
	//    7   13:invokespecial   #510 <Method void android.support.v7.widget.t(t$b)>
	//    8   16:putfield        #512 <Field android.support.v7.widget.t f>
	//    9   19:return          
	}

	private boolean B()
	{
		int j1 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          57
		{
			u u1 = e(f.b(i1));
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   13   23:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   26:astore_3        
			if(u1 != null && !u1.c() && u1.x())
	//*  15   27:aload_3         
	//*  16   28:ifnull          50
	//*  17   31:aload_3         
	//*  18   32:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  19   35:ifeq            41
	//*  20   38:goto            50
	//*  21   41:aload_3         
	//*  22   42:invokevirtual   #525 <Method boolean RecyclerView$u.x()>
	//*  23   45:ifeq            50
				return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}

	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:istore_1        
	//*  30   54:goto            10
		return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
	}

	private void C()
	{
		y.b();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field RecyclerView$t y>
	//    2    4:invokevirtual   #526 <Method void android.support.v7.widget.RecyclerView$t.b()>
		if(m != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #528 <Field RecyclerView$h m>
	//*   5   11:ifnull          21
			m.G();
	//    6   14:aload_0         
	//    7   15:getfield        #528 <Field RecyclerView$h m>
	//    8   18:invokevirtual   #530 <Method void RecyclerView$h.G()>
	//    9   21:return          
	}

	private void D()
	{
		boolean flag1;
		if(ad != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #532 <Field EdgeEffect ad>
	//*   2    4:ifnull          25
		{
			ad.onRelease();
	//    3    7:aload_0         
	//    4    8:getfield        #532 <Field EdgeEffect ad>
	//    5   11:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
			flag1 = ad.isFinished();
	//    6   14:aload_0         
	//    7   15:getfield        #532 <Field EdgeEffect ad>
	//    8   18:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//    9   21:istore_2        
		} else
	//*  10   22:goto            27
		{
			flag1 = false;
	//   11   25:iconst_0        
	//   12   26:istore_2        
		}
		boolean flag = flag1;
	//   13   27:iload_2         
	//   14   28:istore_1        
		if(ae != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #542 <Field EdgeEffect ae>
	//*  17   33:ifnull          53
		{
			ae.onRelease();
	//   18   36:aload_0         
	//   19   37:getfield        #542 <Field EdgeEffect ae>
	//   20   40:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
			flag = flag1 | ae.isFinished();
	//   21   43:iload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #542 <Field EdgeEffect ae>
	//   24   48:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   25   51:ior             
	//   26   52:istore_1        
		}
		flag1 = flag;
	//   27   53:iload_1         
	//   28   54:istore_2        
		if(af != null)
	//*  29   55:aload_0         
	//*  30   56:getfield        #544 <Field EdgeEffect af>
	//*  31   59:ifnull          79
		{
			af.onRelease();
	//   32   62:aload_0         
	//   33   63:getfield        #544 <Field EdgeEffect af>
	//   34   66:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
			flag1 = flag | af.isFinished();
	//   35   69:iload_1         
	//   36   70:aload_0         
	//   37   71:getfield        #544 <Field EdgeEffect af>
	//   38   74:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   39   77:ior             
	//   40   78:istore_2        
		}
		flag = flag1;
	//   41   79:iload_2         
	//   42   80:istore_1        
		if(ag != null)
	//*  43   81:aload_0         
	//*  44   82:getfield        #546 <Field EdgeEffect ag>
	//*  45   85:ifnull          105
		{
			ag.onRelease();
	//   46   88:aload_0         
	//   47   89:getfield        #546 <Field EdgeEffect ag>
	//   48   92:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
			flag = flag1 | ag.isFinished();
	//   49   95:iload_2         
	//   50   96:aload_0         
	//   51   97:getfield        #546 <Field EdgeEffect ag>
	//   52  100:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   53  103:ior             
	//   54  104:istore_1        
		}
		if(flag)
	//*  55  105:iload_1         
	//*  56  106:ifeq            113
			android.support.v4.view.s.c(((View) (this)));
	//   57  109:aload_0         
	//   58  110:invokestatic    #549 <Method void s.c(View)>
	//   59  113:return          
	}

	private void E()
	{
		if(aj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #551 <Field VelocityTracker aj>
	//*   2    4:ifnull          14
			aj.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #551 <Field VelocityTracker aj>
	//    5   11:invokevirtual   #556 <Method void VelocityTracker.clear()>
		h(0);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #558 <Method void h(int)>
		D();
	//    9   19:aload_0         
	//   10   20:invokespecial   #560 <Method void D()>
	//   11   23:return          
	}

	private void F()
	{
		E();
	//    0    0:aload_0         
	//    1    1:invokespecial   #562 <Method void E()>
		setScrollState(0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #565 <Method void setScrollState(int)>
	//    5    9:return          
	}

	private void G()
	{
		int i1 = V;
	//    0    0:aload_0         
	//    1    1:getfield        #567 <Field int V>
	//    2    4:istore_1        
		V = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #567 <Field int V>
		if(i1 != 0 && n())
	//*   6   10:iload_1         
	//*   7   11:ifeq            42
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #569 <Method boolean n()>
	//*  10   18:ifeq            42
		{
			AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
	//   11   21:invokestatic    #575 <Method AccessibilityEvent AccessibilityEvent.obtain()>
	//   12   24:astore_2        
			accessibilityevent.setEventType(2048);
	//   13   25:aload_2         
	//   14   26:sipush          2048
	//   15   29:invokevirtual   #578 <Method void AccessibilityEvent.setEventType(int)>
			android.support.v4.view.a.a.a(accessibilityevent, i1);
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:invokestatic    #583 <Method void a.a(AccessibilityEvent, int)>
			sendAccessibilityEventUnchecked(accessibilityevent);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #587 <Method void sendAccessibilityEventUnchecked(AccessibilityEvent)>
		}
	//   22   42:return          
	}

	private boolean H()
	{
		return x != null && m.b();
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field RecyclerView$e x>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:invokevirtual   #589 <Method boolean android.support.v7.widget.RecyclerView$h.b()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private void I()
	{
		if(w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #299 <Field boolean w>
	//*   2    4:ifeq            22
		{
			e.a();
	//    3    7:aload_0         
	//    4    8:getfield        #591 <Field e e>
	//    5   11:invokevirtual   #595 <Method void android.support.v7.widget.e.a()>
			m.a(this);
	//    6   14:aload_0         
	//    7   15:getfield        #528 <Field RecyclerView$h m>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #597 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView)>
		}
		if(H())
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #599 <Method boolean H()>
	//*  12   26:ifeq            39
			e.b();
	//   13   29:aload_0         
	//   14   30:getfield        #591 <Field e e>
	//   15   33:invokevirtual   #600 <Method void android.support.v7.widget.e.b()>
		else
	//*  16   36:goto            46
			e.e();
	//   17   39:aload_0         
	//   18   40:getfield        #591 <Field e e>
	//   19   43:invokevirtual   #602 <Method void e.e()>
		boolean flag1 = C;
	//   20   46:aload_0         
	//   21   47:getfield        #332 <Field boolean C>
	//   22   50:istore_2        
		boolean flag2 = true;
	//   23   51:iconst_1        
	//   24   52:istore_3        
		boolean flag;
		if(!flag1 && !D)
	//*  25   53:iload_2         
	//*  26   54:ifne            72
	//*  27   57:aload_0         
	//*  28   58:getfield        #334 <Field boolean D>
	//*  29   61:ifeq            67
	//*  30   64:goto            72
			flag = false;
	//   31   67:iconst_0        
	//   32   68:istore_1        
		else
	//*  33   69:goto            74
			flag = true;
	//   34   72:iconst_1        
	//   35   73:istore_1        
		r r1 = B;
	//   36   74:aload_0         
	//   37   75:getfield        #330 <Field RecyclerView$r B>
	//   38   78:astore          4
		if(s && x != null && (w || flag || m.u) && (!w || l.d()))
	//*  39   80:aload_0         
	//*  40   81:getfield        #604 <Field boolean s>
	//*  41   84:ifeq            137
	//*  42   87:aload_0         
	//*  43   88:getfield        #308 <Field RecyclerView$e x>
	//*  44   91:ifnull          137
	//*  45   94:aload_0         
	//*  46   95:getfield        #299 <Field boolean w>
	//*  47   98:ifne            115
	//*  48  101:iload_1         
	//*  49  102:ifne            115
	//*  50  105:aload_0         
	//*  51  106:getfield        #528 <Field RecyclerView$h m>
	//*  52  109:getfield        #606 <Field boolean RecyclerView$h.u>
	//*  53  112:ifeq            137
	//*  54  115:aload_0         
	//*  55  116:getfield        #299 <Field boolean w>
	//*  56  119:ifeq            132
	//*  57  122:aload_0         
	//*  58  123:getfield        #608 <Field RecyclerView$a l>
	//*  59  126:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  60  129:ifeq            137
			flag1 = true;
	//   61  132:iconst_1        
	//   62  133:istore_2        
		else
	//*  63  134:goto            139
			flag1 = false;
	//   64  137:iconst_0        
	//   65  138:istore_2        
		r1.i = flag1;
	//   66  139:aload           4
	//   67  141:iload_2         
	//   68  142:putfield        #612 <Field boolean RecyclerView$r.i>
		r1 = B;
	//   69  145:aload_0         
	//   70  146:getfield        #330 <Field RecyclerView$r B>
	//   71  149:astore          4
		if(B.i && flag && !w && H())
	//*  72  151:aload_0         
	//*  73  152:getfield        #330 <Field RecyclerView$r B>
	//*  74  155:getfield        #612 <Field boolean RecyclerView$r.i>
	//*  75  158:ifeq            184
	//*  76  161:iload_1         
	//*  77  162:ifeq            184
	//*  78  165:aload_0         
	//*  79  166:getfield        #299 <Field boolean w>
	//*  80  169:ifne            184
	//*  81  172:aload_0         
	//*  82  173:invokespecial   #599 <Method boolean H()>
	//*  83  176:ifeq            184
			flag1 = flag2;
	//   84  179:iload_3         
	//   85  180:istore_2        
		else
	//*  86  181:goto            186
			flag1 = false;
	//   87  184:iconst_0        
	//   88  185:istore_2        
		r1.j = flag1;
	//   89  186:aload           4
	//   90  188:iload_2         
	//   91  189:putfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
	//   92  192:return          
	}

	private void J()
	{
		boolean flag = au;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field boolean au>
	//    2    4:istore_2        
		r r1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		Object obj;
		if(flag && hasFocus() && l != null)
	//*   5    8:iload_2         
	//*   6    9:ifeq            35
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #617 <Method boolean hasFocus()>
	//*   9   16:ifeq            35
	//*  10   19:aload_0         
	//*  11   20:getfield        #608 <Field RecyclerView$a l>
	//*  12   23:ifnull          35
			obj = ((Object) (getFocusedChild()));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #621 <Method View getFocusedChild()>
	//   15   30:astore          5
		else
	//*  16   32:goto            38
			obj = null;
	//   17   35:aconst_null     
	//   18   36:astore          5
		if(obj == null)
	//*  19   38:aload           5
	//*  20   40:ifnonnull       50
			obj = ((Object) (r1));
	//   21   43:aload           6
	//   22   45:astore          5
		else
	//*  23   47:goto            58
			obj = ((Object) (d(((View) (obj)))));
	//   24   50:aload_0         
	//   25   51:aload           5
	//   26   53:invokevirtual   #623 <Method RecyclerView$u d(View)>
	//   27   56:astore          5
		if(obj == null)
	//*  28   58:aload           5
	//*  29   60:ifnonnull       68
		{
			K();
	//   30   63:aload_0         
	//   31   64:invokespecial   #625 <Method void K()>
			return;
	//   32   67:return          
		}
		r1 = B;
	//   33   68:aload_0         
	//   34   69:getfield        #330 <Field RecyclerView$r B>
	//   35   72:astore          6
		long l1;
		if(l.d())
	//*  36   74:aload_0         
	//*  37   75:getfield        #608 <Field RecyclerView$a l>
	//*  38   78:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  39   81:ifeq            93
			l1 = ((u) (obj)).g();
	//   40   84:aload           5
	//   41   86:invokevirtual   #628 <Method long android.support.v7.widget.RecyclerView$u.g()>
	//   42   89:lstore_3        
		else
	//*  43   90:goto            97
			l1 = -1L;
	//   44   93:ldc2w           #629 <Long -1L>
	//   45   96:lstore_3        
		r1.l = l1;
	//   46   97:aload           6
	//   47   99:lload_3         
	//   48  100:putfield        #632 <Field long RecyclerView$r.l>
		r1 = B;
	//   49  103:aload_0         
	//   50  104:getfield        #330 <Field RecyclerView$r B>
	//   51  107:astore          6
		int i1;
		if(w)
	//*  52  109:aload_0         
	//*  53  110:getfield        #299 <Field boolean w>
	//*  54  113:ifeq            121
			i1 = -1;
	//   55  116:iconst_m1       
	//   56  117:istore_1        
		else
	//*  57  118:goto            144
		if(((u) (obj)).q())
	//*  58  121:aload           5
	//*  59  123:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//*  60  126:ifeq            138
			i1 = ((u) (obj)).d;
	//   61  129:aload           5
	//   62  131:getfield        #636 <Field int RecyclerView$u.d>
	//   63  134:istore_1        
		else
	//*  64  135:goto            144
			i1 = ((u) (obj)).e();
	//   65  138:aload           5
	//   66  140:invokevirtual   #638 <Method int RecyclerView$u.e()>
	//   67  143:istore_1        
		r1.k = i1;
	//   68  144:aload           6
	//   69  146:iload_1         
	//   70  147:putfield        #640 <Field int android.support.v7.widget.RecyclerView$r.k>
		B.m = m(((u) (obj)).a);
	//   71  150:aload_0         
	//   72  151:getfield        #330 <Field RecyclerView$r B>
	//   73  154:aload_0         
	//   74  155:aload           5
	//   75  157:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   76  160:invokespecial   #645 <Method int m(View)>
	//   77  163:putfield        #647 <Field int RecyclerView$r.m>
	//   78  166:return          
	}

	private void K()
	{
		B.l = -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field RecyclerView$r B>
	//    2    4:ldc2w           #629 <Long -1L>
	//    3    7:putfield        #632 <Field long RecyclerView$r.l>
		B.k = -1;
	//    4   10:aload_0         
	//    5   11:getfield        #330 <Field RecyclerView$r B>
	//    6   14:iconst_m1       
	//    7   15:putfield        #640 <Field int android.support.v7.widget.RecyclerView$r.k>
		B.m = -1;
	//    8   18:aload_0         
	//    9   19:getfield        #330 <Field RecyclerView$r B>
	//   10   22:iconst_m1       
	//   11   23:putfield        #647 <Field int RecyclerView$r.m>
	//   12   26:return          
	}

	private View L()
	{
		int i1;
		if(B.k != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #330 <Field RecyclerView$r B>
	//*   2    4:getfield        #640 <Field int android.support.v7.widget.RecyclerView$r.k>
	//*   3    7:iconst_m1       
	//*   4    8:icmpeq          22
			i1 = B.k;
	//    5   11:aload_0         
	//    6   12:getfield        #330 <Field RecyclerView$r B>
	//    7   15:getfield        #640 <Field int android.support.v7.widget.RecyclerView$r.k>
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			i1 = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		int k1 = B.e();
	//   12   24:aload_0         
	//   13   25:getfield        #330 <Field RecyclerView$r B>
	//   14   28:invokevirtual   #648 <Method int RecyclerView$r.e()>
	//   15   31:istore_3        
		int j1 = i1;
	//   16   32:iload_1         
	//   17   33:istore_2        
		do
		{
			if(j1 >= k1)
				break;
	//   18   34:iload_2         
	//   19   35:iload_3         
	//   20   36:icmpge          78
			u u1 = c(j1);
	//   21   39:aload_0         
	//   22   40:iload_2         
	//   23   41:invokevirtual   #651 <Method RecyclerView$u c(int)>
	//   24   44:astore          4
			if(u1 == null)
	//*  25   46:aload           4
	//*  26   48:ifnonnull       54
				break;
	//   27   51:goto            78
			if(u1.a.hasFocusable())
	//*  28   54:aload           4
	//*  29   56:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  30   59:invokevirtual   #656 <Method boolean View.hasFocusable()>
	//*  31   62:ifeq            71
				return u1.a;
	//   32   65:aload           4
	//   33   67:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   34   70:areturn         
			j1++;
	//   35   71:iload_2         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_2        
		} while(true);
	//   39   75:goto            34
		for(i1 = Math.min(k1, i1) - 1; i1 >= 0; i1--)
	//*  40   78:iload_3         
	//*  41   79:iload_1         
	//*  42   80:invokestatic    #661 <Method int Math.min(int, int)>
	//*  43   83:iconst_1        
	//*  44   84:isub            
	//*  45   85:istore_1        
	//*  46   86:iload_1         
	//*  47   87:iflt            128
		{
			u u2 = c(i1);
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:invokevirtual   #651 <Method RecyclerView$u c(int)>
	//   51   95:astore          4
			if(u2 == null)
	//*  52   97:aload           4
	//*  53   99:ifnonnull       104
				return null;
	//   54  102:aconst_null     
	//   55  103:areturn         
			if(u2.a.hasFocusable())
	//*  56  104:aload           4
	//*  57  106:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  58  109:invokevirtual   #656 <Method boolean View.hasFocusable()>
	//*  59  112:ifeq            121
				return u2.a;
	//   60  115:aload           4
	//   61  117:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   62  120:areturn         
		}

	//   63  121:iload_1         
	//   64  122:iconst_1        
	//   65  123:isub            
	//   66  124:istore_1        
	//*  67  125:goto            86
		return null;
	//   68  128:aconst_null     
	//   69  129:areturn         
	}

	private void M()
	{
		if(au && l != null && hasFocus() && getDescendantFocusability() != 0x60000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #319 <Field boolean au>
	//*   2    4:ifeq            268
	//*   3    7:aload_0         
	//*   4    8:getfield        #608 <Field RecyclerView$a l>
	//*   5   11:ifnull          268
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #617 <Method boolean hasFocus()>
	//*   8   18:ifeq            268
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #664 <Method int getDescendantFocusability()>
	//*  11   25:ldc2            #665 <Int 0x60000>
	//*  12   28:icmpeq          268
		{
			if(getDescendantFocusability() == 0x20000 && isFocused())
	//*  13   31:aload_0         
	//*  14   32:invokevirtual   #664 <Method int getDescendantFocusability()>
	//*  15   35:ldc2            #666 <Int 0x20000>
	//*  16   38:icmpne          49
	//*  17   41:aload_0         
	//*  18   42:invokevirtual   #669 <Method boolean isFocused()>
	//*  19   45:ifeq            49
				return;
	//   20   48:return          
			if(!isFocused())
	//*  21   49:aload_0         
	//*  22   50:invokevirtual   #669 <Method boolean isFocused()>
	//*  23   53:ifne            109
			{
				View view = getFocusedChild();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #621 <Method View getFocusedChild()>
	//   26   60:astore_3        
				if(M && (view.getParent() == null || !view.hasFocus()))
	//*  27   61:getstatic       #232 <Field boolean M>
	//*  28   64:ifeq            97
	//*  29   67:aload_3         
	//*  30   68:invokevirtual   #673 <Method ViewParent View.getParent()>
	//*  31   71:ifnull          81
	//*  32   74:aload_3         
	//*  33   75:invokevirtual   #674 <Method boolean View.hasFocus()>
	//*  34   78:ifne            97
				{
					if(f.b() == 0)
	//*  35   81:aload_0         
	//*  36   82:getfield        #512 <Field android.support.v7.widget.t f>
	//*  37   85:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//*  38   88:ifne            109
					{
						requestFocus();
	//   39   91:aload_0         
	//   40   92:invokevirtual   #677 <Method boolean requestFocus()>
	//   41   95:pop             
						return;
	//   42   96:return          
					}
				} else
				if(!f.c(view))
	//*  43   97:aload_0         
	//*  44   98:getfield        #512 <Field android.support.v7.widget.t f>
	//*  45  101:aload_3         
	//*  46  102:invokevirtual   #680 <Method boolean t.c(View)>
	//*  47  105:ifne            109
					return;
	//   48  108:return          
			}
			long l1 = B.l;
	//   49  109:aload_0         
	//   50  110:getfield        #330 <Field RecyclerView$r B>
	//   51  113:getfield        #632 <Field long RecyclerView$r.l>
	//   52  116:lstore_1        
			Object obj1 = null;
	//   53  117:aconst_null     
	//   54  118:astore          4
			Object obj;
			if(l1 != -1L && l.d())
	//*  55  120:lload_1         
	//*  56  121:ldc2w           #629 <Long -1L>
	//*  57  124:lcmp            
	//*  58  125:ifeq            153
	//*  59  128:aload_0         
	//*  60  129:getfield        #608 <Field RecyclerView$a l>
	//*  61  132:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  62  135:ifeq            153
				obj = ((Object) (a(B.l)));
	//   63  138:aload_0         
	//   64  139:aload_0         
	//   65  140:getfield        #330 <Field RecyclerView$r B>
	//   66  143:getfield        #632 <Field long RecyclerView$r.l>
	//   67  146:invokevirtual   #683 <Method RecyclerView$u a(long)>
	//   68  149:astore_3        
			else
	//*  69  150:goto            155
				obj = null;
	//   70  153:aconst_null     
	//   71  154:astore_3        
			if(obj != null && !f.c(((u) (obj)).a) && ((u) (obj)).a.hasFocusable())
	//*  72  155:aload_3         
	//*  73  156:ifnull          194
	//*  74  159:aload_0         
	//*  75  160:getfield        #512 <Field android.support.v7.widget.t f>
	//*  76  163:aload_3         
	//*  77  164:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  78  167:invokevirtual   #680 <Method boolean t.c(View)>
	//*  79  170:ifne            194
	//*  80  173:aload_3         
	//*  81  174:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  82  177:invokevirtual   #656 <Method boolean View.hasFocusable()>
	//*  83  180:ifne            186
	//*  84  183:goto            194
			{
				obj = ((Object) (((u) (obj)).a));
	//   85  186:aload_3         
	//   86  187:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   87  190:astore_3        
			} else
	//*  88  191:goto            212
			{
				obj = ((Object) (obj1));
	//   89  194:aload           4
	//   90  196:astore_3        
				if(f.b() > 0)
	//*  91  197:aload_0         
	//*  92  198:getfield        #512 <Field android.support.v7.widget.t f>
	//*  93  201:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//*  94  204:ifle            212
					obj = ((Object) (L()));
	//   95  207:aload_0         
	//   96  208:invokespecial   #685 <Method View L()>
	//   97  211:astore_3        
			}
			if(obj != null)
	//*  98  212:aload_3         
	//*  99  213:ifnull          268
			{
				if((long)B.m != -1L)
	//* 100  216:aload_0         
	//* 101  217:getfield        #330 <Field RecyclerView$r B>
	//* 102  220:getfield        #647 <Field int RecyclerView$r.m>
	//* 103  223:i2l             
	//* 104  224:ldc2w           #629 <Long -1L>
	//* 105  227:lcmp            
	//* 106  228:ifeq            263
				{
					View view1 = ((View) (obj)).findViewById(B.m);
	//  107  231:aload_3         
	//  108  232:aload_0         
	//  109  233:getfield        #330 <Field RecyclerView$r B>
	//  110  236:getfield        #647 <Field int RecyclerView$r.m>
	//  111  239:invokevirtual   #688 <Method View View.findViewById(int)>
	//  112  242:astore          4
					if(view1 != null && view1.isFocusable())
	//* 113  244:aload           4
	//* 114  246:ifnull          263
	//* 115  249:aload           4
	//* 116  251:invokevirtual   #691 <Method boolean View.isFocusable()>
	//* 117  254:ifeq            263
						obj = ((Object) (view1));
	//  118  257:aload           4
	//  119  259:astore_3        
				}
	//* 120  260:goto            263
				((View) (obj)).requestFocus();
	//  121  263:aload_3         
	//  122  264:invokevirtual   #692 <Method boolean View.requestFocus()>
	//  123  267:pop             
			}
		}
	//  124  268:return          
	}

	private void N()
	{
		r r1 = B;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field RecyclerView$r B>
	//    2    4:astore          7
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		r1.a(1);
	//    5    9:aload           7
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #694 <Method void android.support.v7.widget.RecyclerView$r.a(int)>
		a(B);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #330 <Field RecyclerView$r B>
	//   11   20:invokevirtual   #697 <Method void a(RecyclerView$r)>
		B.h = false;
	//   12   23:aload_0         
	//   13   24:getfield        #330 <Field RecyclerView$r B>
	//   14   27:iconst_0        
	//   15   28:putfield        #698 <Field boolean android.support.v7.widget.RecyclerView$r.h>
		e();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #699 <Method void e()>
		g.a();
	//   18   35:aload_0         
	//   19   36:getfield        #273 <Field bc g>
	//   20   39:invokevirtual   #700 <Method void android.support.v7.widget.bc.a()>
		l();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #702 <Method void l()>
		I();
	//   23   46:aload_0         
	//   24   47:invokespecial   #704 <Method void I()>
		J();
	//   25   50:aload_0         
	//   26   51:invokespecial   #706 <Method void J()>
		r1 = B;
	//   27   54:aload_0         
	//   28   55:getfield        #330 <Field RecyclerView$r B>
	//   29   58:astore          7
		if(!B.i || !D)
	//*  30   60:aload_0         
	//*  31   61:getfield        #330 <Field RecyclerView$r B>
	//*  32   64:getfield        #612 <Field boolean RecyclerView$r.i>
	//*  33   67:ifeq            80
	//*  34   70:aload_0         
	//*  35   71:getfield        #334 <Field boolean D>
	//*  36   74:ifeq            80
	//*  37   77:goto            83
			flag = false;
	//   38   80:iconst_0        
	//   39   81:istore          4
		r1.g = flag;
	//   40   83:aload           7
	//   41   85:iload           4
	//   42   87:putfield        #708 <Field boolean android.support.v7.widget.RecyclerView$r.g>
		D = false;
	//   43   90:aload_0         
	//   44   91:iconst_0        
	//   45   92:putfield        #334 <Field boolean D>
		C = false;
	//   46   95:aload_0         
	//   47   96:iconst_0        
	//   48   97:putfield        #332 <Field boolean C>
		B.f = B.j;
	//   49  100:aload_0         
	//   50  101:getfield        #330 <Field RecyclerView$r B>
	//   51  104:aload_0         
	//   52  105:getfield        #330 <Field RecyclerView$r B>
	//   53  108:getfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
	//   54  111:putfield        #710 <Field boolean RecyclerView$r.f>
		B.d = l.a();
	//   55  114:aload_0         
	//   56  115:getfield        #330 <Field RecyclerView$r B>
	//   57  118:aload_0         
	//   58  119:getfield        #608 <Field RecyclerView$a l>
	//   59  122:invokevirtual   #712 <Method int android.support.v7.widget.RecyclerView$a.a()>
	//   60  125:putfield        #713 <Field int RecyclerView$r.d>
		a(az);
	//   61  128:aload_0         
	//   62  129:aload_0         
	//   63  130:getfield        #341 <Field int[] az>
	//   64  133:invokespecial   #716 <Method void a(int[])>
		if(B.i)
	//*  65  136:aload_0         
	//*  66  137:getfield        #330 <Field RecyclerView$r B>
	//*  67  140:getfield        #612 <Field boolean RecyclerView$r.i>
	//*  68  143:ifeq            307
		{
			int k1 = f.b();
	//   69  146:aload_0         
	//   70  147:getfield        #512 <Field android.support.v7.widget.t f>
	//   71  150:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//   72  153:istore_2        
			for(int i1 = 0; i1 < k1; i1++)
	//*  73  154:iconst_0        
	//*  74  155:istore_1        
	//*  75  156:iload_1         
	//*  76  157:iload_2         
	//*  77  158:icmpge          307
			{
				u u1 = e(f.b(i1));
	//   78  161:aload_0         
	//   79  162:getfield        #512 <Field android.support.v7.widget.t f>
	//   80  165:iload_1         
	//   81  166:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   82  169:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   83  172:astore          7
				if(u1.c() || u1.n() && !l.d())
	//*  84  174:aload           7
	//*  85  176:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  86  179:ifne            300
	//*  87  182:aload           7
	//*  88  184:invokevirtual   #717 <Method boolean RecyclerView$u.n()>
	//*  89  187:ifeq            203
	//*  90  190:aload_0         
	//*  91  191:getfield        #608 <Field RecyclerView$a l>
	//*  92  194:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  93  197:ifne            203
					continue;
	//   94  200:goto            300
				e.c c1 = x.a(B, u1, e.e(u1), u1.u());
	//   95  203:aload_0         
	//   96  204:getfield        #308 <Field RecyclerView$e x>
	//   97  207:aload_0         
	//   98  208:getfield        #330 <Field RecyclerView$r B>
	//   99  211:aload           7
	//  100  213:aload           7
	//  101  215:invokestatic    #720 <Method int RecyclerView$e.e(RecyclerView$u)>
	//  102  218:aload           7
	//  103  220:invokevirtual   #723 <Method List RecyclerView$u.u()>
	//  104  223:invokevirtual   #726 <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e.a(RecyclerView$r, RecyclerView$u, int, List)>
	//  105  226:astore          8
				g.a(u1, c1);
	//  106  228:aload_0         
	//  107  229:getfield        #273 <Field bc g>
	//  108  232:aload           7
	//  109  234:aload           8
	//  110  236:invokevirtual   #729 <Method void android.support.v7.widget.bc.a(RecyclerView$u, RecyclerView$e$c)>
				if(B.g && u1.x() && !u1.q() && !u1.c() && !u1.n())
	//* 111  239:aload_0         
	//* 112  240:getfield        #330 <Field RecyclerView$r B>
	//* 113  243:getfield        #708 <Field boolean android.support.v7.widget.RecyclerView$r.g>
	//* 114  246:ifeq            300
	//* 115  249:aload           7
	//* 116  251:invokevirtual   #525 <Method boolean RecyclerView$u.x()>
	//* 117  254:ifeq            300
	//* 118  257:aload           7
	//* 119  259:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//* 120  262:ifne            300
	//* 121  265:aload           7
	//* 122  267:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//* 123  270:ifne            300
	//* 124  273:aload           7
	//* 125  275:invokevirtual   #717 <Method boolean RecyclerView$u.n()>
	//* 126  278:ifne            300
				{
					long l2 = a(u1);
	//  127  281:aload_0         
	//  128  282:aload           7
	//  129  284:invokevirtual   #732 <Method long a(RecyclerView$u)>
	//  130  287:lstore          5
					g.a(l2, u1);
	//  131  289:aload_0         
	//  132  290:getfield        #273 <Field bc g>
	//  133  293:lload           5
	//  134  295:aload           7
	//  135  297:invokevirtual   #735 <Method void android.support.v7.widget.bc.a(long, RecyclerView$u)>
				}
			}

	//  136  300:iload_1         
	//  137  301:iconst_1        
	//  138  302:iadd            
	//  139  303:istore_1        
		}
	//* 140  304:goto            156
		if(B.j)
	//* 141  307:aload_0         
	//* 142  308:getfield        #330 <Field RecyclerView$r B>
	//* 143  311:getfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
	//* 144  314:ifeq            495
		{
			s();
	//  145  317:aload_0         
	//  146  318:invokevirtual   #737 <Method void s()>
			boolean flag1 = B.e;
	//  147  321:aload_0         
	//  148  322:getfield        #330 <Field RecyclerView$r B>
	//  149  325:getfield        #739 <Field boolean RecyclerView$r.e>
	//  150  328:istore          4
			B.e = false;
	//  151  330:aload_0         
	//  152  331:getfield        #330 <Field RecyclerView$r B>
	//  153  334:iconst_0        
	//  154  335:putfield        #739 <Field boolean RecyclerView$r.e>
			m.c(d, B);
	//  155  338:aload_0         
	//  156  339:getfield        #528 <Field RecyclerView$h m>
	//  157  342:aload_0         
	//  158  343:getfield        #268 <Field RecyclerView$n d>
	//  159  346:aload_0         
	//  160  347:getfield        #330 <Field RecyclerView$r B>
	//  161  350:invokevirtual   #742 <Method void RecyclerView$h.c(RecyclerView$n, RecyclerView$r)>
			B.e = flag1;
	//  162  353:aload_0         
	//  163  354:getfield        #330 <Field RecyclerView$r B>
	//  164  357:iload           4
	//  165  359:putfield        #739 <Field boolean RecyclerView$r.e>
			for(int j1 = 0; j1 < f.b(); j1++)
	//* 166  362:iconst_0        
	//* 167  363:istore_1        
	//* 168  364:iload_1         
	//* 169  365:aload_0         
	//* 170  366:getfield        #512 <Field android.support.v7.widget.t f>
	//* 171  369:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//* 172  372:icmpge          495
			{
				u u2 = e(f.b(j1));
	//  173  375:aload_0         
	//  174  376:getfield        #512 <Field android.support.v7.widget.t f>
	//  175  379:iload_1         
	//  176  380:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//  177  383:invokestatic    #521 <Method RecyclerView$u e(View)>
	//  178  386:astore          7
				if(u2.c() || g.d(u2))
					continue;
	//  179  388:aload           7
	//  180  390:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//  181  393:ifeq            399
	//  182  396:goto            488
	//  183  399:aload_0         
	//  184  400:getfield        #273 <Field bc g>
	//  185  403:aload           7
	//  186  405:invokevirtual   #745 <Method boolean bc.d(RecyclerView$u)>
	//  187  408:ifne            488
				int i2 = e.e(u2);
	//  188  411:aload           7
	//  189  413:invokestatic    #720 <Method int RecyclerView$e.e(RecyclerView$u)>
	//  190  416:istore_3        
				boolean flag2 = u2.a(8192);
	//  191  417:aload           7
	//  192  419:sipush          8192
	//  193  422:invokevirtual   #748 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
	//  194  425:istore          4
				int l1 = i2;
	//  195  427:iload_3         
	//  196  428:istore_2        
				if(!flag2)
	//* 197  429:iload           4
	//* 198  431:ifne            440
					l1 = i2 | 0x1000;
	//  199  434:iload_3         
	//  200  435:sipush          4096
	//  201  438:ior             
	//  202  439:istore_2        
				e.c c2 = x.a(B, u2, l1, u2.u());
	//  203  440:aload_0         
	//  204  441:getfield        #308 <Field RecyclerView$e x>
	//  205  444:aload_0         
	//  206  445:getfield        #330 <Field RecyclerView$r B>
	//  207  448:aload           7
	//  208  450:iload_2         
	//  209  451:aload           7
	//  210  453:invokevirtual   #723 <Method List RecyclerView$u.u()>
	//  211  456:invokevirtual   #726 <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e.a(RecyclerView$r, RecyclerView$u, int, List)>
	//  212  459:astore          8
				if(flag2)
	//* 213  461:iload           4
	//* 214  463:ifeq            477
					a(u2, c2);
	//  215  466:aload_0         
	//  216  467:aload           7
	//  217  469:aload           8
	//  218  471:invokevirtual   #749 <Method void a(RecyclerView$u, RecyclerView$e$c)>
				else
	//* 219  474:goto            488
					g.b(u2, c2);
	//  220  477:aload_0         
	//  221  478:getfield        #273 <Field bc g>
	//  222  481:aload           7
	//  223  483:aload           8
	//  224  485:invokevirtual   #751 <Method void android.support.v7.widget.bc.b(RecyclerView$u, RecyclerView$e$c)>
			}

	//  225  488:iload_1         
	//  226  489:iconst_1        
	//  227  490:iadd            
	//  228  491:istore_1        
		}
	//* 229  492:goto            364
		t();
	//  230  495:aload_0         
	//  231  496:invokevirtual   #753 <Method void t()>
		m();
	//  232  499:aload_0         
	//  233  500:invokevirtual   #755 <Method void m()>
		a(false);
	//  234  503:aload_0         
	//  235  504:iconst_0        
	//  236  505:invokevirtual   #757 <Method void a(boolean)>
		B.c = 2;
	//  237  508:aload_0         
	//  238  509:getfield        #330 <Field RecyclerView$r B>
	//  239  512:iconst_2        
	//  240  513:putfield        #759 <Field int RecyclerView$r.c>
	//  241  516:return          
	}

	private void O()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #699 <Method void e()>
		l();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #702 <Method void l()>
		B.a(6);
	//    4    8:aload_0         
	//    5    9:getfield        #330 <Field RecyclerView$r B>
	//    6   12:bipush          6
	//    7   14:invokevirtual   #694 <Method void android.support.v7.widget.RecyclerView$r.a(int)>
		e.e();
	//    8   17:aload_0         
	//    9   18:getfield        #591 <Field e e>
	//   10   21:invokevirtual   #602 <Method void e.e()>
		B.d = l.a();
	//   11   24:aload_0         
	//   12   25:getfield        #330 <Field RecyclerView$r B>
	//   13   28:aload_0         
	//   14   29:getfield        #608 <Field RecyclerView$a l>
	//   15   32:invokevirtual   #712 <Method int android.support.v7.widget.RecyclerView$a.a()>
	//   16   35:putfield        #713 <Field int RecyclerView$r.d>
		B.b = 0;
	//   17   38:aload_0         
	//   18   39:getfield        #330 <Field RecyclerView$r B>
	//   19   42:iconst_0        
	//   20   43:putfield        #761 <Field int android.support.v7.widget.RecyclerView$r.b>
		B.f = false;
	//   21   46:aload_0         
	//   22   47:getfield        #330 <Field RecyclerView$r B>
	//   23   50:iconst_0        
	//   24   51:putfield        #710 <Field boolean RecyclerView$r.f>
		m.c(d, B);
	//   25   54:aload_0         
	//   26   55:getfield        #528 <Field RecyclerView$h m>
	//   27   58:aload_0         
	//   28   59:getfield        #268 <Field RecyclerView$n d>
	//   29   62:aload_0         
	//   30   63:getfield        #330 <Field RecyclerView$r B>
	//   31   66:invokevirtual   #742 <Method void RecyclerView$h.c(RecyclerView$n, RecyclerView$r)>
		B.e = false;
	//   32   69:aload_0         
	//   33   70:getfield        #330 <Field RecyclerView$r B>
	//   34   73:iconst_0        
	//   35   74:putfield        #739 <Field boolean RecyclerView$r.e>
		P = null;
	//   36   77:aload_0         
	//   37   78:aconst_null     
	//   38   79:putfield        #763 <Field RecyclerView$SavedState P>
		r r1 = B;
	//   39   82:aload_0         
	//   40   83:getfield        #330 <Field RecyclerView$r B>
	//   41   86:astore_2        
		boolean flag;
		if(B.i && x != null)
	//*  42   87:aload_0         
	//*  43   88:getfield        #330 <Field RecyclerView$r B>
	//*  44   91:getfield        #612 <Field boolean RecyclerView$r.i>
	//*  45   94:ifeq            109
	//*  46   97:aload_0         
	//*  47   98:getfield        #308 <Field RecyclerView$e x>
	//*  48  101:ifnull          109
			flag = true;
	//   49  104:iconst_1        
	//   50  105:istore_1        
		else
	//*  51  106:goto            111
			flag = false;
	//   52  109:iconst_0        
	//   53  110:istore_1        
		r1.i = flag;
	//   54  111:aload_2         
	//   55  112:iload_1         
	//   56  113:putfield        #612 <Field boolean RecyclerView$r.i>
		B.c = 4;
	//   57  116:aload_0         
	//   58  117:getfield        #330 <Field RecyclerView$r B>
	//   59  120:iconst_4        
	//   60  121:putfield        #759 <Field int RecyclerView$r.c>
		m();
	//   61  124:aload_0         
	//   62  125:invokevirtual   #755 <Method void m()>
		a(false);
	//   63  128:aload_0         
	//   64  129:iconst_0        
	//   65  130:invokevirtual   #757 <Method void a(boolean)>
	//   66  133:return          
	}

	private void P()
	{
		B.a(4);
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field RecyclerView$r B>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #694 <Method void android.support.v7.widget.RecyclerView$r.a(int)>
		e();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #699 <Method void e()>
		l();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #702 <Method void l()>
		B.c = 1;
	//    8   16:aload_0         
	//    9   17:getfield        #330 <Field RecyclerView$r B>
	//   10   20:iconst_1        
	//   11   21:putfield        #759 <Field int RecyclerView$r.c>
		if(B.i)
	//*  12   24:aload_0         
	//*  13   25:getfield        #330 <Field RecyclerView$r B>
	//*  14   28:getfield        #612 <Field boolean RecyclerView$r.i>
	//*  15   31:ifeq            252
		{
			for(int i1 = f.b() - 1; i1 >= 0; i1--)
	//*  16   34:aload_0         
	//*  17   35:getfield        #512 <Field android.support.v7.widget.t f>
	//*  18   38:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//*  19   41:iconst_1        
	//*  20   42:isub            
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:iflt            241
			{
				u u1 = e(f.b(i1));
	//   24   48:aload_0         
	//   25   49:getfield        #512 <Field android.support.v7.widget.t f>
	//   26   52:iload_1         
	//   27   53:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   28   56:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   29   59:astore          6
				if(u1.c())
	//*  30   61:aload           6
	//*  31   63:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  32   66:ifeq            72
					continue;
	//   33   69:goto            234
				long l1 = a(u1);
	//   34   72:aload_0         
	//   35   73:aload           6
	//   36   75:invokevirtual   #732 <Method long a(RecyclerView$u)>
	//   37   78:lstore_2        
				e.c c2 = x.a(B, u1);
	//   38   79:aload_0         
	//   39   80:getfield        #308 <Field RecyclerView$e x>
	//   40   83:aload_0         
	//   41   84:getfield        #330 <Field RecyclerView$r B>
	//   42   87:aload           6
	//   43   89:invokevirtual   #766 <Method RecyclerView$e$c android.support.v7.widget.RecyclerView$e.a(RecyclerView$r, RecyclerView$u)>
	//   44   92:astore          9
				u u2 = g.a(l1);
	//   45   94:aload_0         
	//   46   95:getfield        #273 <Field bc g>
	//   47   98:lload_2         
	//   48   99:invokevirtual   #767 <Method RecyclerView$u android.support.v7.widget.bc.a(long)>
	//   49  102:astore          7
				if(u2 != null && !u2.c())
	//*  50  104:aload           7
	//*  51  106:ifnull          223
	//*  52  109:aload           7
	//*  53  111:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  54  114:ifne            223
				{
					boolean flag = g.a(u2);
	//   55  117:aload_0         
	//   56  118:getfield        #273 <Field bc g>
	//   57  121:aload           7
	//   58  123:invokevirtual   #769 <Method boolean android.support.v7.widget.bc.a(RecyclerView$u)>
	//   59  126:istore          4
					boolean flag1 = g.a(u1);
	//   60  128:aload_0         
	//   61  129:getfield        #273 <Field bc g>
	//   62  132:aload           6
	//   63  134:invokevirtual   #769 <Method boolean android.support.v7.widget.bc.a(RecyclerView$u)>
	//   64  137:istore          5
					if(!flag || u2 != u1)
	//*  65  139:iload           4
	//*  66  141:ifeq            154
	//*  67  144:aload           7
	//*  68  146:aload           6
	//*  69  148:if_acmpne       154
	//*  70  151:goto            223
					{
						e.c c1 = g.b(u2);
	//   71  154:aload_0         
	//   72  155:getfield        #273 <Field bc g>
	//   73  158:aload           7
	//   74  160:invokevirtual   #772 <Method RecyclerView$e$c android.support.v7.widget.bc.b(RecyclerView$u)>
	//   75  163:astore          8
						g.c(u1, c2);
	//   76  165:aload_0         
	//   77  166:getfield        #273 <Field bc g>
	//   78  169:aload           6
	//   79  171:aload           9
	//   80  173:invokevirtual   #774 <Method void bc.c(RecyclerView$u, RecyclerView$e$c)>
						c2 = g.c(u1);
	//   81  176:aload_0         
	//   82  177:getfield        #273 <Field bc g>
	//   83  180:aload           6
	//   84  182:invokevirtual   #776 <Method RecyclerView$e$c bc.c(RecyclerView$u)>
	//   85  185:astore          9
						if(c1 == null)
	//*  86  187:aload           8
	//*  87  189:ifnonnull       204
							a(l1, u1, u2);
	//   88  192:aload_0         
	//   89  193:lload_2         
	//   90  194:aload           6
	//   91  196:aload           7
	//   92  198:invokespecial   #779 <Method void a(long, RecyclerView$u, RecyclerView$u)>
						else
	//*  93  201:goto            234
							a(u2, u1, c1, c2, flag, flag1);
	//   94  204:aload_0         
	//   95  205:aload           7
	//   96  207:aload           6
	//   97  209:aload           8
	//   98  211:aload           9
	//   99  213:iload           4
	//  100  215:iload           5
	//  101  217:invokespecial   #782 <Method void a(RecyclerView$u, RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c, boolean, boolean)>
						continue;
	//  102  220:goto            234
					}
				}
				g.c(u1, c2);
	//  103  223:aload_0         
	//  104  224:getfield        #273 <Field bc g>
	//  105  227:aload           6
	//  106  229:aload           9
	//  107  231:invokevirtual   #774 <Method void bc.c(RecyclerView$u, RecyclerView$e$c)>
			}

	//  108  234:iload_1         
	//  109  235:iconst_1        
	//  110  236:isub            
	//  111  237:istore_1        
	//* 112  238:goto            44
			g.a(aF);
	//  113  241:aload_0         
	//  114  242:getfield        #273 <Field bc g>
	//  115  245:aload_0         
	//  116  246:getfield        #355 <Field bc$b aF>
	//  117  249:invokevirtual   #785 <Method void android.support.v7.widget.bc.a(bc$b)>
		}
		m.b(d);
	//  118  252:aload_0         
	//  119  253:getfield        #528 <Field RecyclerView$h m>
	//  120  256:aload_0         
	//  121  257:getfield        #268 <Field RecyclerView$n d>
	//  122  260:invokevirtual   #788 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView$n)>
		B.a = B.d;
	//  123  263:aload_0         
	//  124  264:getfield        #330 <Field RecyclerView$r B>
	//  125  267:aload_0         
	//  126  268:getfield        #330 <Field RecyclerView$r B>
	//  127  271:getfield        #713 <Field int RecyclerView$r.d>
	//  128  274:putfield        #790 <Field int android.support.v7.widget.RecyclerView$r.a>
		w = false;
	//  129  277:aload_0         
	//  130  278:iconst_0        
	//  131  279:putfield        #299 <Field boolean w>
		B.i = false;
	//  132  282:aload_0         
	//  133  283:getfield        #330 <Field RecyclerView$r B>
	//  134  286:iconst_0        
	//  135  287:putfield        #612 <Field boolean RecyclerView$r.i>
		B.j = false;
	//  136  290:aload_0         
	//  137  291:getfield        #330 <Field RecyclerView$r B>
	//  138  294:iconst_0        
	//  139  295:putfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
		m.u = false;
	//  140  298:aload_0         
	//  141  299:getfield        #528 <Field RecyclerView$h m>
	//  142  302:iconst_0        
	//  143  303:putfield        #606 <Field boolean RecyclerView$h.u>
		if(d.b != null)
	//* 144  306:aload_0         
	//* 145  307:getfield        #268 <Field RecyclerView$n d>
	//* 146  310:getfield        #792 <Field ArrayList android.support.v7.widget.RecyclerView$n.b>
	//* 147  313:ifnull          326
			d.b.clear();
	//  148  316:aload_0         
	//  149  317:getfield        #268 <Field RecyclerView$n d>
	//  150  320:getfield        #792 <Field ArrayList android.support.v7.widget.RecyclerView$n.b>
	//  151  323:invokevirtual   #793 <Method void ArrayList.clear()>
		if(m.y)
	//* 152  326:aload_0         
	//* 153  327:getfield        #528 <Field RecyclerView$h m>
	//* 154  330:getfield        #795 <Field boolean RecyclerView$h.y>
	//* 155  333:ifeq            359
		{
			m.x = 0;
	//  156  336:aload_0         
	//  157  337:getfield        #528 <Field RecyclerView$h m>
	//  158  340:iconst_0        
	//  159  341:putfield        #797 <Field int RecyclerView$h.x>
			m.y = false;
	//  160  344:aload_0         
	//  161  345:getfield        #528 <Field RecyclerView$h m>
	//  162  348:iconst_0        
	//  163  349:putfield        #795 <Field boolean RecyclerView$h.y>
			d.b();
	//  164  352:aload_0         
	//  165  353:getfield        #268 <Field RecyclerView$n d>
	//  166  356:invokevirtual   #798 <Method void android.support.v7.widget.RecyclerView$n.b()>
		}
		m.a(B);
	//  167  359:aload_0         
	//  168  360:getfield        #528 <Field RecyclerView$h m>
	//  169  363:aload_0         
	//  170  364:getfield        #330 <Field RecyclerView$r B>
	//  171  367:invokevirtual   #799 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$r)>
		m();
	//  172  370:aload_0         
	//  173  371:invokevirtual   #755 <Method void m()>
		a(false);
	//  174  374:aload_0         
	//  175  375:iconst_0        
	//  176  376:invokevirtual   #757 <Method void a(boolean)>
		g.a();
	//  177  379:aload_0         
	//  178  380:getfield        #273 <Field bc g>
	//  179  383:invokevirtual   #700 <Method void android.support.v7.widget.bc.a()>
		if(k(az[0], az[1]))
	//* 180  386:aload_0         
	//* 181  387:aload_0         
	//* 182  388:getfield        #341 <Field int[] az>
	//* 183  391:iconst_0        
	//* 184  392:iaload          
	//* 185  393:aload_0         
	//* 186  394:getfield        #341 <Field int[] az>
	//* 187  397:iconst_1        
	//* 188  398:iaload          
	//* 189  399:invokespecial   #802 <Method boolean k(int, int)>
	//* 190  402:ifeq            411
			i(0, 0);
	//  191  405:aload_0         
	//  192  406:iconst_0        
	//  193  407:iconst_0        
	//  194  408:invokevirtual   #805 <Method void i(int, int)>
		M();
	//  195  411:aload_0         
	//  196  412:invokespecial   #807 <Method void M()>
		K();
	//  197  415:aload_0         
	//  198  416:invokespecial   #625 <Method void K()>
	//  199  419:return          
	}

	private String a(Context context, String s1)
	{
		if(s1.charAt(0) == '.')
	//*   0    0:aload_2         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #814 <Method char String.charAt(int)>
	//*   3    5:bipush          46
	//*   4    7:icmpne          38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #816 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #817 <Method void StringBuilder()>
	//    8   17:astore_3        
			stringbuilder.append(context.getPackageName());
	//    9   18:aload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #821 <Method String Context.getPackageName()>
	//   12   23:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(s1);
	//   14   27:aload_3         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			return stringbuilder.toString();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   20   37:areturn         
		}
		if(s1.contains("."))
	//*  21   38:aload_2         
	//*  22   39:ldc2            #830 <String ".">
	//*  23   42:invokevirtual   #834 <Method boolean String.contains(CharSequence)>
	//*  24   45:ifeq            50
		{
			return s1;
	//   25   48:aload_2         
	//   26   49:areturn         
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   27   50:new             #816 <Class StringBuilder>
	//   28   53:dup             
	//   29   54:invokespecial   #817 <Method void StringBuilder()>
	//   30   57:astore_1        
			((StringBuilder) (context)).append(((Class) (android/support/v7/widget/RecyclerView)).getPackage().getName());
	//   31   58:aload_1         
	//   32   59:ldc1            #2   <Class RecyclerView>
	//   33   61:invokevirtual   #838 <Method Package Class.getPackage()>
	//   34   64:invokevirtual   #843 <Method String Package.getName()>
	//   35   67:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			((StringBuilder) (context)).append('.');
	//   37   71:aload_1         
	//   38   72:bipush          46
	//   39   74:invokevirtual   #846 <Method StringBuilder StringBuilder.append(char)>
	//   40   77:pop             
			((StringBuilder) (context)).append(s1);
	//   41   78:aload_1         
	//   42   79:aload_2         
	//   43   80:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
			return ((StringBuilder) (context)).toString();
	//   45   84:aload_1         
	//   46   85:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   47   88:areturn         
		}
	}

	private void a(float f1, float f2, float f3, float f4)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          8
		if(f2 >= 0.0F) goto _L2; else goto _L1
	//    2    3:fload_2         
	//    3    4:fconst_0        
	//    4    5:fcmpg           
	//    5    6:ifge            57
_L1:
		float f5;
		EdgeEffect edgeeffect;
		g();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #849 <Method void g()>
		edgeeffect = ad;
	//    8   13:aload_0         
	//    9   14:getfield        #532 <Field EdgeEffect ad>
	//   10   17:astore          9
		float f6 = -f2 / (float)getWidth();
	//   11   19:fload_2         
	//   12   20:fneg            
	//   13   21:aload_0         
	//   14   22:invokevirtual   #852 <Method int getWidth()>
	//   15   25:i2f             
	//   16   26:fdiv            
	//   17   27:fstore          6
		f5 = 1.0F - f3 / (float)getHeight();
	//   18   29:fconst_1        
	//   19   30:fload_3         
	//   20   31:aload_0         
	//   21   32:invokevirtual   #855 <Method int getHeight()>
	//   22   35:i2f             
	//   23   36:fdiv            
	//   24   37:fsub            
	//   25   38:fstore          5
		f3 = f6;
	//   26   40:fload           6
	//   27   42:fstore_3        
_L4:
		boolean flag;
		android.support.v4.widget.g.a(edgeeffect, f3, f5);
	//   28   43:aload           9
	//   29   45:fload_3         
	//   30   46:fload           5
	//   31   48:invokestatic    #860 <Method void g.a(EdgeEffect, float, float)>
		flag = true;
	//   32   51:iconst_1        
	//   33   52:istore          7
		break MISSING_BLOCK_LABEL_104;
	//   34   54:goto            104
_L2:
		if(f2 <= 0.0F)
			break; /* Loop/switch isn't completed */
	//   35   57:fload_2         
	//   36   58:fconst_0        
	//   37   59:fcmpl           
	//   38   60:ifle            101
		h();
	//   39   63:aload_0         
	//   40   64:invokevirtual   #862 <Method void h()>
		edgeeffect = af;
	//   41   67:aload_0         
	//   42   68:getfield        #544 <Field EdgeEffect af>
	//   43   71:astore          9
		f5 = f2 / (float)getWidth();
	//   44   73:fload_2         
	//   45   74:aload_0         
	//   46   75:invokevirtual   #852 <Method int getWidth()>
	//   47   78:i2f             
	//   48   79:fdiv            
	//   49   80:fstore          5
		float f7 = f3 / (float)getHeight();
	//   50   82:fload_3         
	//   51   83:aload_0         
	//   52   84:invokevirtual   #855 <Method int getHeight()>
	//   53   87:i2f             
	//   54   88:fdiv            
	//   55   89:fstore          6
		f3 = f5;
	//   56   91:fload           5
	//   57   93:fstore_3        
		f5 = f7;
	//   58   94:fload           6
	//   59   96:fstore          5
		if(true) goto _L4; else goto _L3
	//   60   98:goto            43
_L3:
		flag = false;
	//   61  101:iconst_0        
	//   62  102:istore          7
		if(f4 < 0.0F)
	//*  63  104:fload           4
	//*  64  106:fconst_0        
	//*  65  107:fcmpg           
	//*  66  108:ifge            145
		{
			i();
	//   67  111:aload_0         
	//   68  112:invokevirtual   #864 <Method void i()>
			android.support.v4.widget.g.a(ae, -f4 / (float)getHeight(), f1 / (float)getWidth());
	//   69  115:aload_0         
	//   70  116:getfield        #542 <Field EdgeEffect ae>
	//   71  119:fload           4
	//   72  121:fneg            
	//   73  122:aload_0         
	//   74  123:invokevirtual   #855 <Method int getHeight()>
	//   75  126:i2f             
	//   76  127:fdiv            
	//   77  128:fload_1         
	//   78  129:aload_0         
	//   79  130:invokevirtual   #852 <Method int getWidth()>
	//   80  133:i2f             
	//   81  134:fdiv            
	//   82  135:invokestatic    #860 <Method void g.a(EdgeEffect, float, float)>
			flag = flag1;
	//   83  138:iload           8
	//   84  140:istore          7
		} else
	//*  85  142:goto            187
		if(f4 > 0.0F)
	//*  86  145:fload           4
	//*  87  147:fconst_0        
	//*  88  148:fcmpl           
	//*  89  149:ifle            187
		{
			j();
	//   90  152:aload_0         
	//   91  153:invokevirtual   #866 <Method void j()>
			android.support.v4.widget.g.a(ag, f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth());
	//   92  156:aload_0         
	//   93  157:getfield        #546 <Field EdgeEffect ag>
	//   94  160:fload           4
	//   95  162:aload_0         
	//   96  163:invokevirtual   #855 <Method int getHeight()>
	//   97  166:i2f             
	//   98  167:fdiv            
	//   99  168:fconst_1        
	//  100  169:fload_1         
	//  101  170:aload_0         
	//  102  171:invokevirtual   #852 <Method int getWidth()>
	//  103  174:i2f             
	//  104  175:fdiv            
	//  105  176:fsub            
	//  106  177:invokestatic    #860 <Method void g.a(EdgeEffect, float, float)>
			flag = flag1;
	//  107  180:iload           8
	//  108  182:istore          7
		}
	//* 109  184:goto            187
		if(flag || f2 != 0.0F || f4 != 0.0F)
	//* 110  187:iload           7
	//* 111  189:ifne            205
	//* 112  192:fload_2         
	//* 113  193:fconst_0        
	//* 114  194:fcmpl           
	//* 115  195:ifne            205
	//* 116  198:fload           4
	//* 117  200:fconst_0        
	//* 118  201:fcmpl           
	//* 119  202:ifeq            209
			android.support.v4.view.s.c(((View) (this)));
	//  120  205:aload_0         
	//  121  206:invokestatic    #549 <Method void s.c(View)>
		return;
	//  122  209:return          
	}

	private void a(long l1, u u1, u u2)
	{
		int j1 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore          6
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    9:iconst_0        
	//*   5   10:istore          5
	//*   6   12:iload           5
	//*   7   14:iload           6
	//*   8   16:icmpge          209
		{
			u u3 = e(f.b(i1));
	//    9   19:aload_0         
	//   10   20:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   23:iload           5
	//   12   25:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   13   28:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   31:astore          7
			if(u3 != u1 && a(u3) == l1)
	//*  15   33:aload           7
	//*  16   35:aload_3         
	//*  17   36:if_acmpne       42
	//*  18   39:goto            200
	//*  19   42:aload_0         
	//*  20   43:aload           7
	//*  21   45:invokevirtual   #732 <Method long a(RecyclerView$u)>
	//*  22   48:lload_1         
	//*  23   49:lcmp            
	//*  24   50:ifne            200
				if(l != null && l.d())
	//*  25   53:aload_0         
	//*  26   54:getfield        #608 <Field RecyclerView$a l>
	//*  27   57:ifnull          135
	//*  28   60:aload_0         
	//*  29   61:getfield        #608 <Field RecyclerView$a l>
	//*  30   64:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  31   67:ifeq            135
				{
					u2 = ((u) (new StringBuilder()));
	//   32   70:new             #816 <Class StringBuilder>
	//   33   73:dup             
	//   34   74:invokespecial   #817 <Method void StringBuilder()>
	//   35   77:astore          4
					((StringBuilder) (u2)).append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
	//   36   79:aload           4
	//   37   81:ldc2            #868 <String "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:">
	//   38   84:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   39   87:pop             
					((StringBuilder) (u2)).append(((Object) (u3)));
	//   40   88:aload           4
	//   41   90:aload           7
	//   42   92:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   43   95:pop             
					((StringBuilder) (u2)).append(" \n View Holder 2:");
	//   44   96:aload           4
	//   45   98:ldc2            #873 <String " \n View Holder 2:">
	//   46  101:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   47  104:pop             
					((StringBuilder) (u2)).append(((Object) (u1)));
	//   48  105:aload           4
	//   49  107:aload_3         
	//   50  108:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   51  111:pop             
					((StringBuilder) (u2)).append(a());
	//   52  112:aload           4
	//   53  114:aload_0         
	//   54  115:invokevirtual   #875 <Method String a()>
	//   55  118:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   56  121:pop             
					throw new IllegalStateException(((StringBuilder) (u2)).toString());
	//   57  122:new             #877 <Class IllegalStateException>
	//   58  125:dup             
	//   59  126:aload           4
	//   60  128:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   61  131:invokespecial   #880 <Method void IllegalStateException(String)>
	//   62  134:athrow          
				} else
				{
					u2 = ((u) (new StringBuilder()));
	//   63  135:new             #816 <Class StringBuilder>
	//   64  138:dup             
	//   65  139:invokespecial   #817 <Method void StringBuilder()>
	//   66  142:astore          4
					((StringBuilder) (u2)).append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
	//   67  144:aload           4
	//   68  146:ldc2            #882 <String "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:">
	//   69  149:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   70  152:pop             
					((StringBuilder) (u2)).append(((Object) (u3)));
	//   71  153:aload           4
	//   72  155:aload           7
	//   73  157:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   74  160:pop             
					((StringBuilder) (u2)).append(" \n View Holder 2:");
	//   75  161:aload           4
	//   76  163:ldc2            #873 <String " \n View Holder 2:">
	//   77  166:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   78  169:pop             
					((StringBuilder) (u2)).append(((Object) (u1)));
	//   79  170:aload           4
	//   80  172:aload_3         
	//   81  173:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   82  176:pop             
					((StringBuilder) (u2)).append(a());
	//   83  177:aload           4
	//   84  179:aload_0         
	//   85  180:invokevirtual   #875 <Method String a()>
	//   86  183:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   87  186:pop             
					throw new IllegalStateException(((StringBuilder) (u2)).toString());
	//   88  187:new             #877 <Class IllegalStateException>
	//   89  190:dup             
	//   90  191:aload           4
	//   91  193:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   92  196:invokespecial   #880 <Method void IllegalStateException(String)>
	//   93  199:athrow          
				}
		}

	//   94  200:iload           5
	//   95  202:iconst_1        
	//   96  203:iadd            
	//   97  204:istore          5
	//*  98  206:goto            12
		StringBuilder stringbuilder = new StringBuilder();
	//   99  209:new             #816 <Class StringBuilder>
	//  100  212:dup             
	//  101  213:invokespecial   #817 <Method void StringBuilder()>
	//  102  216:astore          7
		stringbuilder.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
	//  103  218:aload           7
	//  104  220:ldc2            #884 <String "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ">
	//  105  223:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  106  226:pop             
		stringbuilder.append(((Object) (u2)));
	//  107  227:aload           7
	//  108  229:aload           4
	//  109  231:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//  110  234:pop             
		stringbuilder.append(" cannot be found but it is necessary for ");
	//  111  235:aload           7
	//  112  237:ldc2            #886 <String " cannot be found but it is necessary for ">
	//  113  240:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  114  243:pop             
		stringbuilder.append(((Object) (u1)));
	//  115  244:aload           7
	//  116  246:aload_3         
	//  117  247:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//  118  250:pop             
		stringbuilder.append(a());
	//  119  251:aload           7
	//  120  253:aload_0         
	//  121  254:invokevirtual   #875 <Method String a()>
	//  122  257:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  123  260:pop             
		Log.e("RecyclerView", stringbuilder.toString());
	//  124  261:ldc2            #887 <String "RecyclerView">
	//  125  264:aload           7
	//  126  266:invokevirtual   #828 <Method String StringBuilder.toString()>
	//  127  269:invokestatic    #892 <Method int Log.e(String, String)>
	//  128  272:pop             
	//  129  273:return          
	}

	private void a(Context context, String s1, AttributeSet attributeset, int i1, int j1)
	{
		String s2;
		if(s1 == null)
			break MISSING_BLOCK_LABEL_430;
	//    0    0:aload_2         
	//    1    1:ifnull          430
		s1 = s1.trim();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #907 <Method String String.trim()>
	//    4    8:astore_2        
		if(s1.isEmpty())
			break MISSING_BLOCK_LABEL_430;
	//    5    9:aload_2         
	//    6   10:invokevirtual   #910 <Method boolean String.isEmpty()>
	//    7   13:ifne            430
		s2 = a(context, s1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #912 <Method String a(Context, String)>
	//   12   22:astore          7
		if(isInEditMode())
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #915 <Method boolean isInEditMode()>
	//*  15   28:ifeq            42
		{
			s1 = ((String) (((Object)this).getClass().getClassLoader()));
	//   16   31:aload_0         
	//   17   32:invokevirtual   #921 <Method Class Object.getClass()>
	//   18   35:invokevirtual   #925 <Method ClassLoader Class.getClassLoader()>
	//   19   38:astore_2        
			break MISSING_BLOCK_LABEL_47;
	//   20   39:goto            47
		}
		s1 = ((String) (context.getClassLoader()));
	//   21   42:aload_1         
	//   22   43:invokevirtual   #926 <Method ClassLoader Context.getClassLoader()>
	//   23   46:astore_2        
		Class class1 = ((ClassLoader) (s1)).loadClass(s2).asSubclass(android/support/v7/widget/RecyclerView$h);
	//   24   47:aload_2         
	//   25   48:aload           7
	//   26   50:invokevirtual   #932 <Method Class ClassLoader.loadClass(String)>
	//   27   53:ldc1            #55  <Class RecyclerView$h>
	//   28   55:invokevirtual   #936 <Method Class Class.asSubclass(Class)>
	//   29   58:astore          8
		Object obj = null;
	//   30   60:aconst_null     
	//   31   61:astore          6
		s1 = ((String) (class1.getConstructor(N)));
	//   32   63:aload           8
	//   33   65:getstatic       #246 <Field Class[] N>
	//   34   68:invokevirtual   #940 <Method Constructor Class.getConstructor(Class[])>
	//   35   71:astore_2        
		context = ((Context) (new Object[] {
			context, attributeset, Integer.valueOf(i1), Integer.valueOf(j1)
		}));
	//   36   72:iconst_4        
	//   37   73:anewarray       Object[]
	//   38   76:dup             
	//   39   77:iconst_0        
	//   40   78:aload_1         
	//   41   79:aastore         
	//   42   80:dup             
	//   43   81:iconst_1        
	//   44   82:aload_3         
	//   45   83:aastore         
	//   46   84:dup             
	//   47   85:iconst_2        
	//   48   86:iload           4
	//   49   88:invokestatic    #944 <Method Integer Integer.valueOf(int)>
	//   50   91:aastore         
	//   51   92:dup             
	//   52   93:iconst_3        
	//   53   94:iload           5
	//   54   96:invokestatic    #944 <Method Integer Integer.valueOf(int)>
	//   55   99:aastore         
	//   56  100:astore_1        
		break MISSING_BLOCK_LABEL_118;
	//   57  101:goto            118
		context;
	//   58  104:astore_1        
		s1 = ((String) (class1.getConstructor(new Class[0])));
	//   59  105:aload           8
	//   60  107:iconst_0        
	//   61  108:anewarray       Class[]
	//   62  111:invokevirtual   #940 <Method Constructor Class.getConstructor(Class[])>
	//   63  114:astore_2        
		context = ((Context) (obj));
	//   64  115:aload           6
	//   65  117:astore_1        
		try
		{
			((Constructor) (s1)).setAccessible(true);
	//   66  118:aload_2         
	//   67  119:iconst_1        
	//   68  120:invokevirtual   #949 <Method void Constructor.setAccessible(boolean)>
			setLayoutManager((h)((Constructor) (s1)).newInstance(((Object []) (context))));
	//   69  123:aload_0         
	//   70  124:aload_2         
	//   71  125:aload_1         
	//   72  126:invokevirtual   #953 <Method Object Constructor.newInstance(Object[])>
	//   73  129:checkcast       #55  <Class RecyclerView$h>
	//   74  132:invokevirtual   #957 <Method void setLayoutManager(RecyclerView$h)>
			return;
	//   75  135:return          
		}
	//*  76  136:astore_2        
	//*  77  137:aload_2         
	//*  78  138:aload_1         
	//*  79  139:invokevirtual   #961 <Method Throwable NoSuchMethodException.initCause(Throwable)>
	//*  80  142:pop             
	//*  81  143:new             #816 <Class StringBuilder>
	//*  82  146:dup             
	//*  83  147:invokespecial   #817 <Method void StringBuilder()>
	//*  84  150:astore_1        
	//*  85  151:aload_1         
	//*  86  152:aload_3         
	//*  87  153:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//*  88  158:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//*  89  161:pop             
	//*  90  162:aload_1         
	//*  91  163:ldc2            #966 <String ": Error creating LayoutManager ">
	//*  92  166:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//*  93  169:pop             
	//*  94  170:aload_1         
	//*  95  171:aload           7
	//*  96  173:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//*  97  176:pop             
	//*  98  177:new             #877 <Class IllegalStateException>
	//*  99  180:dup             
	//* 100  181:aload_1         
	//* 101  182:invokevirtual   #828 <Method String StringBuilder.toString()>
	//* 102  185:aload_2         
	//* 103  186:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//* 104  189:athrow          
	//* 105  190:astore_1        
	//* 106  191:new             #816 <Class StringBuilder>
	//* 107  194:dup             
	//* 108  195:invokespecial   #817 <Method void StringBuilder()>
	//* 109  198:astore_2        
	//* 110  199:aload_2         
	//* 111  200:aload_3         
	//* 112  201:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//* 113  206:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 114  209:pop             
	//* 115  210:aload_2         
	//* 116  211:ldc2            #971 <String ": Class is not a LayoutManager ">
	//* 117  214:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 118  217:pop             
	//* 119  218:aload_2         
	//* 120  219:aload           7
	//* 121  221:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 122  224:pop             
	//* 123  225:new             #877 <Class IllegalStateException>
	//* 124  228:dup             
	//* 125  229:aload_2         
	//* 126  230:invokevirtual   #828 <Method String StringBuilder.toString()>
	//* 127  233:aload_1         
	//* 128  234:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//* 129  237:athrow          
	//* 130  238:astore_1        
	//* 131  239:new             #816 <Class StringBuilder>
	//* 132  242:dup             
	//* 133  243:invokespecial   #817 <Method void StringBuilder()>
	//* 134  246:astore_2        
	//* 135  247:aload_2         
	//* 136  248:aload_3         
	//* 137  249:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//* 138  254:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 139  257:pop             
	//* 140  258:aload_2         
	//* 141  259:ldc2            #973 <String ": Cannot access non-public constructor ">
	//* 142  262:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 143  265:pop             
	//* 144  266:aload_2         
	//* 145  267:aload           7
	//* 146  269:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 147  272:pop             
	//* 148  273:new             #877 <Class IllegalStateException>
	//* 149  276:dup             
	//* 150  277:aload_2         
	//* 151  278:invokevirtual   #828 <Method String StringBuilder.toString()>
	//* 152  281:aload_1         
	//* 153  282:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//* 154  285:athrow          
	//* 155  286:astore_1        
	//* 156  287:new             #816 <Class StringBuilder>
	//* 157  290:dup             
	//* 158  291:invokespecial   #817 <Method void StringBuilder()>
	//* 159  294:astore_2        
	//* 160  295:aload_2         
	//* 161  296:aload_3         
	//* 162  297:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//* 163  302:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 164  305:pop             
	//* 165  306:aload_2         
	//* 166  307:ldc2            #975 <String ": Could not instantiate the LayoutManager: ">
	//* 167  310:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 168  313:pop             
	//* 169  314:aload_2         
	//* 170  315:aload           7
	//* 171  317:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 172  320:pop             
	//* 173  321:new             #877 <Class IllegalStateException>
	//* 174  324:dup             
	//* 175  325:aload_2         
	//* 176  326:invokevirtual   #828 <Method String StringBuilder.toString()>
	//* 177  329:aload_1         
	//* 178  330:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//* 179  333:athrow          
	//* 180  334:astore_1        
	//* 181  335:new             #816 <Class StringBuilder>
	//* 182  338:dup             
	//* 183  339:invokespecial   #817 <Method void StringBuilder()>
	//* 184  342:astore_2        
	//* 185  343:aload_2         
	//* 186  344:aload_3         
	//* 187  345:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//* 188  350:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 189  353:pop             
	//* 190  354:aload_2         
	//* 191  355:ldc2            #975 <String ": Could not instantiate the LayoutManager: ">
	//* 192  358:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 193  361:pop             
	//* 194  362:aload_2         
	//* 195  363:aload           7
	//* 196  365:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//* 197  368:pop             
	//* 198  369:new             #877 <Class IllegalStateException>
	//* 199  372:dup             
	//* 200  373:aload_2         
	//* 201  374:invokevirtual   #828 <Method String StringBuilder.toString()>
	//* 202  377:aload_1         
	//* 203  378:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//* 204  381:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 205  382:astore_1        
		{
			s1 = ((String) (new StringBuilder()));
	//  206  383:new             #816 <Class StringBuilder>
	//  207  386:dup             
	//  208  387:invokespecial   #817 <Method void StringBuilder()>
	//  209  390:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			s1 = ((String) (new StringBuilder()));
			((StringBuilder) (s1)).append(attributeset.getPositionDescription());
			((StringBuilder) (s1)).append(": Could not instantiate the LayoutManager: ");
			((StringBuilder) (s1)).append(s2);
			throw new IllegalStateException(((StringBuilder) (s1)).toString(), ((Throwable) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			s1 = ((String) (new StringBuilder()));
			((StringBuilder) (s1)).append(attributeset.getPositionDescription());
			((StringBuilder) (s1)).append(": Could not instantiate the LayoutManager: ");
			((StringBuilder) (s1)).append(s2);
			throw new IllegalStateException(((StringBuilder) (s1)).toString(), ((Throwable) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			s1 = ((String) (new StringBuilder()));
			((StringBuilder) (s1)).append(attributeset.getPositionDescription());
			((StringBuilder) (s1)).append(": Cannot access non-public constructor ");
			((StringBuilder) (s1)).append(s2);
			throw new IllegalStateException(((StringBuilder) (s1)).toString(), ((Throwable) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			s1 = ((String) (new StringBuilder()));
			((StringBuilder) (s1)).append(attributeset.getPositionDescription());
			((StringBuilder) (s1)).append(": Class is not a LayoutManager ");
			((StringBuilder) (s1)).append(s2);
			throw new IllegalStateException(((StringBuilder) (s1)).toString(), ((Throwable) (context)));
		}
		break MISSING_BLOCK_LABEL_391;
		s1;
		((NoSuchMethodException) (s1)).initCause(((Throwable) (context)));
		context = ((Context) (new StringBuilder()));
		((StringBuilder) (context)).append(attributeset.getPositionDescription());
		((StringBuilder) (context)).append(": Error creating LayoutManager ");
		((StringBuilder) (context)).append(s2);
		throw new IllegalStateException(((StringBuilder) (context)).toString(), ((Throwable) (s1)));
		((StringBuilder) (s1)).append(attributeset.getPositionDescription());
	//  210  391:aload_2         
	//  211  392:aload_3         
	//  212  393:invokeinterface #964 <Method String AttributeSet.getPositionDescription()>
	//  213  398:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  214  401:pop             
		((StringBuilder) (s1)).append(": Unable to find LayoutManager ");
	//  215  402:aload_2         
	//  216  403:ldc2            #977 <String ": Unable to find LayoutManager ">
	//  217  406:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  218  409:pop             
		((StringBuilder) (s1)).append(s2);
	//  219  410:aload_2         
	//  220  411:aload           7
	//  221  413:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  222  416:pop             
		throw new IllegalStateException(((StringBuilder) (s1)).toString(), ((Throwable) (context)));
	//  223  417:new             #877 <Class IllegalStateException>
	//  224  420:dup             
	//  225  421:aload_2         
	//  226  422:invokevirtual   #828 <Method String StringBuilder.toString()>
	//  227  425:aload_1         
	//  228  426:invokespecial   #969 <Method void IllegalStateException(String, Throwable)>
	//  229  429:athrow          
	//  230  430:return          
	}

	private void a(a a1, boolean flag, boolean flag1)
	{
		if(l != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #608 <Field RecyclerView$a l>
	//*   2    4:ifnull          26
		{
			l.b(((c) (O)));
	//    3    7:aload_0         
	//    4    8:getfield        #608 <Field RecyclerView$a l>
	//    5   11:aload_0         
	//    6   12:getfield        #265 <Field RecyclerView$p O>
	//    7   15:invokevirtual   #981 <Method void android.support.v7.widget.RecyclerView$a.b(RecyclerView$c)>
			l.b(this);
	//    8   18:aload_0         
	//    9   19:getfield        #608 <Field RecyclerView$a l>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #983 <Method void android.support.v7.widget.RecyclerView$a.b(RecyclerView)>
		}
		if(!flag || flag1)
	//*  12   26:iload_2         
	//*  13   27:ifeq            34
	//*  14   30:iload_3         
	//*  15   31:ifeq            38
			c();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #985 <Method void c()>
		e.a();
	//   18   38:aload_0         
	//   19   39:getfield        #591 <Field e e>
	//   20   42:invokevirtual   #595 <Method void android.support.v7.widget.e.a()>
		a a2 = l;
	//   21   45:aload_0         
	//   22   46:getfield        #608 <Field RecyclerView$a l>
	//   23   49:astore          4
		l = a1;
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:putfield        #608 <Field RecyclerView$a l>
		if(a1 != null)
	//*  27   56:aload_1         
	//*  28   57:ifnull          73
		{
			a1.a(((c) (O)));
	//   29   60:aload_1         
	//   30   61:aload_0         
	//   31   62:getfield        #265 <Field RecyclerView$p O>
	//   32   65:invokevirtual   #987 <Method void android.support.v7.widget.RecyclerView$a.a(RecyclerView$c)>
			a1.a(this);
	//   33   68:aload_1         
	//   34   69:aload_0         
	//   35   70:invokevirtual   #988 <Method void android.support.v7.widget.RecyclerView$a.a(RecyclerView)>
		}
		if(m != null)
	//*  36   73:aload_0         
	//*  37   74:getfield        #528 <Field RecyclerView$h m>
	//*  38   77:ifnull          93
			m.a(a2, l);
	//   39   80:aload_0         
	//   40   81:getfield        #528 <Field RecyclerView$h m>
	//   41   84:aload           4
	//   42   86:aload_0         
	//   43   87:getfield        #608 <Field RecyclerView$a l>
	//   44   90:invokevirtual   #991 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$a, RecyclerView$a)>
		d.a(a2, l, flag);
	//   45   93:aload_0         
	//   46   94:getfield        #268 <Field RecyclerView$n d>
	//   47   97:aload           4
	//   48   99:aload_0         
	//   49  100:getfield        #608 <Field RecyclerView$a l>
	//   50  103:iload_2         
	//   51  104:invokevirtual   #994 <Method void android.support.v7.widget.RecyclerView$n.a(RecyclerView$a, RecyclerView$a, boolean)>
		B.e = true;
	//   52  107:aload_0         
	//   53  108:getfield        #330 <Field RecyclerView$r B>
	//   54  111:iconst_1        
	//   55  112:putfield        #739 <Field boolean RecyclerView$r.e>
		u();
	//   56  115:aload_0         
	//   57  116:invokevirtual   #996 <Method void u()>
	//   58  119:return          
	}

	private void a(u u1, u u2, e.c c1, e.c c2, boolean flag, boolean flag1)
	{
		u1.a(false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #997 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
		if(flag)
	//*   3    5:iload           5
	//*   4    7:ifeq            15
			e(u1);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #1000 <Method void e(RecyclerView$u)>
		if(u1 != u2)
	//*   8   15:aload_1         
	//*   9   16:aload_2         
	//*  10   17:if_acmpeq       58
		{
			if(flag1)
	//*  11   20:iload           6
	//*  12   22:ifeq            30
				e(u2);
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokespecial   #1000 <Method void e(RecyclerView$u)>
			u1.h = u2;
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:putfield        #1003 <Field RecyclerView$u android.support.v7.widget.RecyclerView$u.h>
			e(u1);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokespecial   #1000 <Method void e(RecyclerView$u)>
			d.c(u1);
	//   22   40:aload_0         
	//   23   41:getfield        #268 <Field RecyclerView$n d>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #1005 <Method void RecyclerView$n.c(RecyclerView$u)>
			u2.a(false);
	//   26   48:aload_2         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #997 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
			u2.i = u1;
	//   29   53:aload_2         
	//   30   54:aload_1         
	//   31   55:putfield        #1007 <Field RecyclerView$u RecyclerView$u.i>
		}
		if(x.a(u1, u2, c1, c2))
	//*  32   58:aload_0         
	//*  33   59:getfield        #308 <Field RecyclerView$e x>
	//*  34   62:aload_1         
	//*  35   63:aload_2         
	//*  36   64:aload_3         
	//*  37   65:aload           4
	//*  38   67:invokevirtual   #1010 <Method boolean android.support.v7.widget.RecyclerView$e.a(RecyclerView$u, RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//*  39   70:ifeq            77
			p();
	//   40   73:aload_0         
	//   41   74:invokevirtual   #1012 <Method void p()>
	//   42   77:return          
	}

	static void a(RecyclerView recyclerview, int i1)
	{
		recyclerview.detachViewFromParent(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1016 <Method void detachViewFromParent(int)>
	//    3    5:return          
	}

	static void a(RecyclerView recyclerview, int i1, int j1)
	{
		recyclerview.setMeasuredDimension(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #1020 <Method void setMeasuredDimension(int, int)>
	//    4    6:return          
	}

	static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		recyclerview.attachViewToParent(view, i1, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #1025 <Method void attachViewToParent(View, int, android.view.ViewGroup$LayoutParams)>
	//    5    7:return          
	}

	private void a(View view, View view1)
	{
		Object obj;
		if(view1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			obj = ((Object) (view1));
	//    2    4:aload_2         
	//    3    5:astore          5
		else
	//*   4    7:goto            13
			obj = ((Object) (view));
	//    5   10:aload_1         
	//    6   11:astore          5
		j.set(0, 0, ((View) (obj)).getWidth(), ((View) (obj)).getHeight());
	//    7   13:aload_0         
	//    8   14:getfield        #281 <Field Rect j>
	//    9   17:iconst_0        
	//   10   18:iconst_0        
	//   11   19:aload           5
	//   12   21:invokevirtual   #1027 <Method int View.getWidth()>
	//   13   24:aload           5
	//   14   26:invokevirtual   #1028 <Method int View.getHeight()>
	//   15   29:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
		obj = ((Object) (((View) (obj)).getLayoutParams()));
	//   16   32:aload           5
	//   17   34:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   37:astore          5
		if(obj instanceof LayoutParams)
	//*  19   39:aload           5
	//*  20   41:instanceof      #20  <Class RecyclerView$LayoutParams>
	//*  21   44:ifeq            157
		{
			obj = ((Object) ((LayoutParams)obj));
	//   22   47:aload           5
	//   23   49:checkcast       #20  <Class RecyclerView$LayoutParams>
	//   24   52:astore          5
			if(!((LayoutParams) (obj)).e)
	//*  25   54:aload           5
	//*  26   56:getfield        #1037 <Field boolean RecyclerView$LayoutParams.e>
	//*  27   59:ifne            157
			{
				obj = ((Object) (((LayoutParams) (obj)).d));
	//   28   62:aload           5
	//   29   64:getfield        #1039 <Field Rect RecyclerView$LayoutParams.d>
	//   30   67:astore          5
				Rect rect = j;
	//   31   69:aload_0         
	//   32   70:getfield        #281 <Field Rect j>
	//   33   73:astore          6
				rect.left = rect.left - ((Rect) (obj)).left;
	//   34   75:aload           6
	//   35   77:aload           6
	//   36   79:getfield        #1042 <Field int Rect.left>
	//   37   82:aload           5
	//   38   84:getfield        #1042 <Field int Rect.left>
	//   39   87:isub            
	//   40   88:putfield        #1042 <Field int Rect.left>
				rect = j;
	//   41   91:aload_0         
	//   42   92:getfield        #281 <Field Rect j>
	//   43   95:astore          6
				rect.right = rect.right + ((Rect) (obj)).right;
	//   44   97:aload           6
	//   45   99:aload           6
	//   46  101:getfield        #1045 <Field int Rect.right>
	//   47  104:aload           5
	//   48  106:getfield        #1045 <Field int Rect.right>
	//   49  109:iadd            
	//   50  110:putfield        #1045 <Field int Rect.right>
				rect = j;
	//   51  113:aload_0         
	//   52  114:getfield        #281 <Field Rect j>
	//   53  117:astore          6
				rect.top = rect.top - ((Rect) (obj)).top;
	//   54  119:aload           6
	//   55  121:aload           6
	//   56  123:getfield        #1048 <Field int Rect.top>
	//   57  126:aload           5
	//   58  128:getfield        #1048 <Field int Rect.top>
	//   59  131:isub            
	//   60  132:putfield        #1048 <Field int Rect.top>
				rect = j;
	//   61  135:aload_0         
	//   62  136:getfield        #281 <Field Rect j>
	//   63  139:astore          6
				rect.bottom = rect.bottom + ((Rect) (obj)).bottom;
	//   64  141:aload           6
	//   65  143:aload           6
	//   66  145:getfield        #1051 <Field int Rect.bottom>
	//   67  148:aload           5
	//   68  150:getfield        #1051 <Field int Rect.bottom>
	//   69  153:iadd            
	//   70  154:putfield        #1051 <Field int Rect.bottom>
			}
		}
		if(view1 != null)
	//*  71  157:aload_2         
	//*  72  158:ifnull          179
		{
			offsetDescendantRectToMyCoords(view1, j);
	//   73  161:aload_0         
	//   74  162:aload_2         
	//   75  163:aload_0         
	//   76  164:getfield        #281 <Field Rect j>
	//   77  167:invokevirtual   #1055 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			offsetRectIntoDescendantCoords(view, j);
	//   78  170:aload_0         
	//   79  171:aload_1         
	//   80  172:aload_0         
	//   81  173:getfield        #281 <Field Rect j>
	//   82  176:invokevirtual   #1058 <Method void offsetRectIntoDescendantCoords(View, Rect)>
		}
		obj = ((Object) (m));
	//   83  179:aload_0         
	//   84  180:getfield        #528 <Field RecyclerView$h m>
	//   85  183:astore          5
		Rect rect1 = j;
	//   86  185:aload_0         
	//   87  186:getfield        #281 <Field Rect j>
	//   88  189:astore          6
		boolean flag1 = s;
	//   89  191:aload_0         
	//   90  192:getfield        #604 <Field boolean s>
	//   91  195:istore          4
		boolean flag;
		if(view1 == null)
	//*  92  197:aload_2         
	//*  93  198:ifnonnull       206
			flag = true;
	//   94  201:iconst_1        
	//   95  202:istore_3        
		else
	//*  96  203:goto            208
			flag = false;
	//   97  206:iconst_0        
	//   98  207:istore_3        
		((h) (obj)).a(this, view, rect1, flag1 ^ true, flag);
	//   99  208:aload           5
	//  100  210:aload_0         
	//  101  211:aload_1         
	//  102  212:aload           6
	//  103  214:iload           4
	//  104  216:iconst_1        
	//  105  217:ixor            
	//  106  218:iload_3         
	//  107  219:invokevirtual   #1061 <Method boolean android.support.v7.widget.RecyclerView$h.a(RecyclerView, View, Rect, boolean, boolean)>
	//  108  222:pop             
	//  109  223:return          
	}

	private void a(int ai1[])
	{
		int k2 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore          8
		if(k2 == 0)
	//*   4    9:iload           8
	//*   5   11:ifne            23
		{
			ai1[0] = -1;
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:iconst_m1       
	//    9   17:iastore         
			ai1[1] = -1;
	//   10   18:aload_1         
	//   11   19:iconst_1        
	//   12   20:iconst_m1       
	//   13   21:iastore         
			return;
	//   14   22:return          
		}
		int l1 = 0;
	//   15   23:iconst_0        
	//   16   24:istore          5
		int j1 = 0x7fffffff;
	//   17   26:ldc2            #1062 <Int 0x7fffffff>
	//   18   29:istore_3        
		int k1;
		int j2;
		for(k1 = 0x80000000; l1 < k2; k1 = j2)
	//*  19   30:ldc2            #1063 <Int 0x80000000>
	//*  20   33:istore          4
	//*  21   35:iload           5
	//*  22   37:iload           8
	//*  23   39:icmpge          121
		{
			u u1 = e(f.b(l1));
	//   24   42:aload_0         
	//   25   43:getfield        #512 <Field android.support.v7.widget.t f>
	//   26   46:iload           5
	//   27   48:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   28   51:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   29   54:astore          9
			if(u1.c())
	//*  30   56:aload           9
	//*  31   58:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  32   61:ifeq            71
			{
				j2 = k1;
	//   33   64:iload           4
	//   34   66:istore          7
			} else
	//*  35   68:goto            108
			{
				int i2 = u1.d();
	//   36   71:aload           9
	//   37   73:invokevirtual   #1065 <Method int RecyclerView$u.d()>
	//   38   76:istore          6
				int i1 = j1;
	//   39   78:iload_3         
	//   40   79:istore_2        
				if(i2 < j1)
	//*  41   80:iload           6
	//*  42   82:iload_3         
	//*  43   83:icmpge          89
					i1 = i2;
	//   44   86:iload           6
	//   45   88:istore_2        
				j1 = i1;
	//   46   89:iload_2         
	//   47   90:istore_3        
				j2 = k1;
	//   48   91:iload           4
	//   49   93:istore          7
				if(i2 > k1)
	//*  50   95:iload           6
	//*  51   97:iload           4
	//*  52   99:icmple          108
				{
					j2 = i2;
	//   53  102:iload           6
	//   54  104:istore          7
					j1 = i1;
	//   55  106:iload_2         
	//   56  107:istore_3        
				}
			}
			l1++;
	//   57  108:iload           5
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:istore          5
		}

	//   61  114:iload           7
	//   62  116:istore          4
	//*  63  118:goto            35
		ai1[0] = j1;
	//   64  121:aload_1         
	//   65  122:iconst_0        
	//   66  123:iload_3         
	//   67  124:iastore         
		ai1[1] = k1;
	//   68  125:aload_1         
	//   69  126:iconst_1        
	//   70  127:iload           4
	//   71  129:iastore         
	//   72  130:return          
	}

	private boolean a(MotionEvent motionevent)
	{
		int j1 = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1071 <Method int MotionEvent.getAction()>
	//    2    4:istore_3        
		if(j1 == 3 || j1 == 0)
	//*   3    5:iload_3         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          14
	//*   6   10:iload_3         
	//*   7   11:ifne            19
			S = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #1073 <Field RecyclerView$k S>
		int k1 = R.size();
	//   11   19:aload_0         
	//   12   20:getfield        #295 <Field ArrayList R>
	//   13   23:invokevirtual   #1076 <Method int ArrayList.size()>
	//   14   26:istore          4
		for(int i1 = 0; i1 < k1; i1++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload           4
	//*  19   33:icmpge          81
		{
			k k2 = (k)R.get(i1);
	//   20   36:aload_0         
	//   21   37:getfield        #295 <Field ArrayList R>
	//   22   40:iload_2         
	//   23   41:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   24   44:checkcast       #72  <Class RecyclerView$k>
	//   25   47:astore          5
			if(k2.a(this, motionevent) && j1 != 3)
	//*  26   49:aload           5
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:invokeinterface #1082 <Method boolean android.support.v7.widget.RecyclerView$k.a(RecyclerView, MotionEvent)>
	//*  30   58:ifeq            74
	//*  31   61:iload_3         
	//*  32   62:iconst_3        
	//*  33   63:icmpeq          74
			{
				S = k2;
	//   34   66:aload_0         
	//   35   67:aload           5
	//   36   69:putfield        #1073 <Field RecyclerView$k S>
				return true;
	//   37   72:iconst_1        
	//   38   73:ireturn         
			}
		}

	//   39   74:iload_2         
	//   40   75:iconst_1        
	//   41   76:iadd            
	//   42   77:istore_2        
	//*  43   78:goto            30
		return false;
	//   44   81:iconst_0        
	//   45   82:ireturn         
	}

	private boolean a(View view, View view1, int i1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(view1 != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          124
		{
			if(view1 == this)
	//*   4    7:aload_2         
	//*   5    8:aload_0         
	//*   6    9:if_acmpne       14
				return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
			if(view == null)
	//*   9   14:aload_1         
	//*  10   15:ifnonnull       20
				return true;
	//   11   18:iconst_1        
	//   12   19:ireturn         
			if(i1 != 2 && i1 != 1)
	//*  13   20:iload_3         
	//*  14   21:iconst_2        
	//*  15   22:icmpeq          41
	//*  16   25:iload_3         
	//*  17   26:iconst_1        
	//*  18   27:icmpne          33
	//*  19   30:goto            41
				return b(view, view1, i1);
	//   20   33:aload_0         
	//   21   34:aload_1         
	//   22   35:aload_2         
	//   23   36:iload_3         
	//   24   37:invokespecial   #1085 <Method boolean b(View, View, int)>
	//   25   40:ireturn         
			byte byte0;
			if(m.s() == 1)
	//*  26   41:aload_0         
	//*  27   42:getfield        #528 <Field RecyclerView$h m>
	//*  28   45:invokevirtual   #1087 <Method int android.support.v7.widget.RecyclerView$h.s()>
	//*  29   48:iconst_1        
	//*  30   49:icmpne          58
				byte0 = 1;
	//   31   52:iconst_1        
	//   32   53:istore          4
			else
	//*  33   55:goto            61
				byte0 = 0;
	//   34   58:iconst_0        
	//   35   59:istore          4
			if(i1 == 2)
	//*  36   61:iload_3         
	//*  37   62:iconst_2        
	//*  38   63:icmpne          69
				flag = true;
	//   39   66:iconst_1        
	//   40   67:istore          5
			if(flag ^ byte0)
	//*  41   69:iload           5
	//*  42   71:iload           4
	//*  43   73:ixor            
	//*  44   74:ifeq            84
				byte0 = 66;
	//   45   77:bipush          66
	//   46   79:istore          4
			else
	//*  47   81:goto            88
				byte0 = 17;
	//   48   84:bipush          17
	//   49   86:istore          4
			if(b(view, view1, ((int) (byte0))))
	//*  50   88:aload_0         
	//*  51   89:aload_1         
	//*  52   90:aload_2         
	//*  53   91:iload           4
	//*  54   93:invokespecial   #1085 <Method boolean b(View, View, int)>
	//*  55   96:ifeq            101
				return true;
	//   56   99:iconst_1        
	//   57  100:ireturn         
			if(i1 == 2)
	//*  58  101:iload_3         
	//*  59  102:iconst_2        
	//*  60  103:icmpne          118
				i1 = 130;
	//   61  106:sipush          130
	//   62  109:istore_3        
			else
	//*  63  110:aload_0         
	//*  64  111:aload_1         
	//*  65  112:aload_2         
	//*  66  113:iload_3         
	//*  67  114:invokespecial   #1085 <Method boolean b(View, View, int)>
	//*  68  117:ireturn         
				i1 = 33;
	//   69  118:bipush          33
	//   70  120:istore_3        
			return b(view, view1, i1);
		} else
	//*  71  121:goto            110
		{
			return false;
	//   72  124:iconst_0        
	//   73  125:ireturn         
		}
	}

	static int[] a(RecyclerView recyclerview)
	{
		return recyclerview.aC;
	//    0    0:aload_0         
	//    1    1:getfield        #345 <Field int[] aC>
	//    2    4:areturn         
	}

	static void b(View view, Rect rect)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		Rect rect1 = layoutparams.d;
	//    4    8:aload_2         
	//    5    9:getfield        #1039 <Field Rect RecyclerView$LayoutParams.d>
	//    6   12:astore_3        
		rect.set(view.getLeft() - rect1.left - layoutparams.leftMargin, view.getTop() - rect1.top - layoutparams.topMargin, view.getRight() + rect1.right + layoutparams.rightMargin, view.getBottom() + rect1.bottom + layoutparams.bottomMargin);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #1091 <Method int View.getLeft()>
	//   10   18:aload_3         
	//   11   19:getfield        #1042 <Field int Rect.left>
	//   12   22:isub            
	//   13   23:aload_2         
	//   14   24:getfield        #1094 <Field int RecyclerView$LayoutParams.leftMargin>
	//   15   27:isub            
	//   16   28:aload_0         
	//   17   29:invokevirtual   #1097 <Method int View.getTop()>
	//   18   32:aload_3         
	//   19   33:getfield        #1048 <Field int Rect.top>
	//   20   36:isub            
	//   21   37:aload_2         
	//   22   38:getfield        #1100 <Field int RecyclerView$LayoutParams.topMargin>
	//   23   41:isub            
	//   24   42:aload_0         
	//   25   43:invokevirtual   #1103 <Method int View.getRight()>
	//   26   46:aload_3         
	//   27   47:getfield        #1045 <Field int Rect.right>
	//   28   50:iadd            
	//   29   51:aload_2         
	//   30   52:getfield        #1106 <Field int RecyclerView$LayoutParams.rightMargin>
	//   31   55:iadd            
	//   32   56:aload_0         
	//   33   57:invokevirtual   #1109 <Method int View.getBottom()>
	//   34   60:aload_3         
	//   35   61:getfield        #1051 <Field int Rect.bottom>
	//   36   64:iadd            
	//   37   65:aload_2         
	//   38   66:getfield        #1112 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   39   69:iadd            
	//   40   70:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
	//   41   73:return          
	}

	static boolean b(RecyclerView recyclerview)
	{
		return recyclerview.awakenScrollBars();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1116 <Method boolean awakenScrollBars()>
	//    2    4:ireturn         
	}

	private boolean b(MotionEvent motionevent)
	{
		int i1 = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1071 <Method int MotionEvent.getAction()>
	//    2    4:istore_2        
		if(S != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #1073 <Field RecyclerView$k S>
	//*   5    9:ifnull          52
			if(i1 == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            24
			{
				S = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #1073 <Field RecyclerView$k S>
			} else
	//*  11   21:goto            52
			{
				S.b(this, motionevent);
	//   12   24:aload_0         
	//   13   25:getfield        #1073 <Field RecyclerView$k S>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokeinterface #1119 <Method void android.support.v7.widget.RecyclerView$k.b(RecyclerView, MotionEvent)>
				if(i1 == 3 || i1 == 1)
	//*  17   35:iload_2         
	//*  18   36:iconst_3        
	//*  19   37:icmpeq          45
	//*  20   40:iload_2         
	//*  21   41:iconst_1        
	//*  22   42:icmpne          50
					S = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #1073 <Field RecyclerView$k S>
				return true;
	//   26   50:iconst_1        
	//   27   51:ireturn         
			}
		if(i1 != 0)
	//*  28   52:iload_2         
	//*  29   53:ifeq            111
		{
			int k1 = R.size();
	//   30   56:aload_0         
	//   31   57:getfield        #295 <Field ArrayList R>
	//   32   60:invokevirtual   #1076 <Method int ArrayList.size()>
	//   33   63:istore_3        
			for(int j1 = 0; j1 < k1; j1++)
	//*  34   64:iconst_0        
	//*  35   65:istore_2        
	//*  36   66:iload_2         
	//*  37   67:iload_3         
	//*  38   68:icmpge          111
			{
				k k2 = (k)R.get(j1);
	//   39   71:aload_0         
	//   40   72:getfield        #295 <Field ArrayList R>
	//   41   75:iload_2         
	//   42   76:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   43   79:checkcast       #72  <Class RecyclerView$k>
	//   44   82:astore          4
				if(k2.a(this, motionevent))
	//*  45   84:aload           4
	//*  46   86:aload_0         
	//*  47   87:aload_1         
	//*  48   88:invokeinterface #1082 <Method boolean android.support.v7.widget.RecyclerView$k.a(RecyclerView, MotionEvent)>
	//*  49   93:ifeq            104
				{
					S = k2;
	//   50   96:aload_0         
	//   51   97:aload           4
	//   52   99:putfield        #1073 <Field RecyclerView$k S>
					return true;
	//   53  102:iconst_1        
	//   54  103:ireturn         
				}
			}

	//   55  104:iload_2         
	//   56  105:iconst_1        
	//   57  106:iadd            
	//   58  107:istore_2        
		}
	//*  59  108:goto            66
		return false;
	//   60  111:iconst_0        
	//   61  112:ireturn         
	}

	private boolean b(View view, View view1, int i1)
	{
		j.set(0, 0, view.getWidth(), view.getHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field Rect j>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:invokevirtual   #1027 <Method int View.getWidth()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1028 <Method int View.getHeight()>
	//    8   14:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
		Q.set(0, 0, view1.getWidth(), view1.getHeight());
	//    9   17:aload_0         
	//   10   18:getfield        #283 <Field Rect Q>
	//   11   21:iconst_0        
	//   12   22:iconst_0        
	//   13   23:aload_2         
	//   14   24:invokevirtual   #1027 <Method int View.getWidth()>
	//   15   27:aload_2         
	//   16   28:invokevirtual   #1028 <Method int View.getHeight()>
	//   17   31:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
		offsetDescendantRectToMyCoords(view, j);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #281 <Field Rect j>
	//   22   40:invokevirtual   #1055 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		offsetDescendantRectToMyCoords(view1, Q);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:getfield        #283 <Field Rect Q>
	//   27   49:invokevirtual   #1055 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		if(i1 != 17)
	//*  28   52:iload_3         
	//*  29   53:bipush          17
	//*  30   55:icmpeq          285
		{
			if(i1 != 33)
	//*  31   58:iload_3         
	//*  32   59:bipush          33
	//*  33   61:icmpeq          230
			{
				if(i1 != 66)
	//*  34   64:iload_3         
	//*  35   65:bipush          66
	//*  36   67:icmpeq          175
				{
					if(i1 != 130)
	//*  37   70:iload_3         
	//*  38   71:sipush          130
	//*  39   74:icmpeq          120
					{
						view = ((View) (new StringBuilder()));
	//   40   77:new             #816 <Class StringBuilder>
	//   41   80:dup             
	//   42   81:invokespecial   #817 <Method void StringBuilder()>
	//   43   84:astore_1        
						((StringBuilder) (view)).append("direction must be absolute. received:");
	//   44   85:aload_1         
	//   45   86:ldc2            #1121 <String "direction must be absolute. received:">
	//   46   89:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
						((StringBuilder) (view)).append(i1);
	//   48   93:aload_1         
	//   49   94:iload_3         
	//   50   95:invokevirtual   #1124 <Method StringBuilder StringBuilder.append(int)>
	//   51   98:pop             
						((StringBuilder) (view)).append(a());
	//   52   99:aload_1         
	//   53  100:aload_0         
	//   54  101:invokevirtual   #875 <Method String a()>
	//   55  104:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   56  107:pop             
						throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   57  108:new             #1126 <Class IllegalArgumentException>
	//   58  111:dup             
	//   59  112:aload_1         
	//   60  113:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   61  116:invokespecial   #1127 <Method void IllegalArgumentException(String)>
	//   62  119:athrow          
					}
					return (j.top < Q.top || j.bottom <= Q.top) && j.bottom < Q.bottom;
	//   63  120:aload_0         
	//   64  121:getfield        #281 <Field Rect j>
	//   65  124:getfield        #1048 <Field int Rect.top>
	//   66  127:aload_0         
	//   67  128:getfield        #283 <Field Rect Q>
	//   68  131:getfield        #1048 <Field int Rect.top>
	//   69  134:icmplt          154
	//   70  137:aload_0         
	//   71  138:getfield        #281 <Field Rect j>
	//   72  141:getfield        #1051 <Field int Rect.bottom>
	//   73  144:aload_0         
	//   74  145:getfield        #283 <Field Rect Q>
	//   75  148:getfield        #1048 <Field int Rect.top>
	//   76  151:icmpgt          173
	//   77  154:aload_0         
	//   78  155:getfield        #281 <Field Rect j>
	//   79  158:getfield        #1051 <Field int Rect.bottom>
	//   80  161:aload_0         
	//   81  162:getfield        #283 <Field Rect Q>
	//   82  165:getfield        #1051 <Field int Rect.bottom>
	//   83  168:icmpge          173
	//   84  171:iconst_1        
	//   85  172:ireturn         
	//   86  173:iconst_0        
	//   87  174:ireturn         
				}
				return (j.left < Q.left || j.right <= Q.left) && j.right < Q.right;
	//   88  175:aload_0         
	//   89  176:getfield        #281 <Field Rect j>
	//   90  179:getfield        #1042 <Field int Rect.left>
	//   91  182:aload_0         
	//   92  183:getfield        #283 <Field Rect Q>
	//   93  186:getfield        #1042 <Field int Rect.left>
	//   94  189:icmplt          209
	//   95  192:aload_0         
	//   96  193:getfield        #281 <Field Rect j>
	//   97  196:getfield        #1045 <Field int Rect.right>
	//   98  199:aload_0         
	//   99  200:getfield        #283 <Field Rect Q>
	//  100  203:getfield        #1042 <Field int Rect.left>
	//  101  206:icmpgt          228
	//  102  209:aload_0         
	//  103  210:getfield        #281 <Field Rect j>
	//  104  213:getfield        #1045 <Field int Rect.right>
	//  105  216:aload_0         
	//  106  217:getfield        #283 <Field Rect Q>
	//  107  220:getfield        #1045 <Field int Rect.right>
	//  108  223:icmpge          228
	//  109  226:iconst_1        
	//  110  227:ireturn         
	//  111  228:iconst_0        
	//  112  229:ireturn         
			}
			return (j.bottom > Q.bottom || j.top >= Q.bottom) && j.top > Q.top;
	//  113  230:aload_0         
	//  114  231:getfield        #281 <Field Rect j>
	//  115  234:getfield        #1051 <Field int Rect.bottom>
	//  116  237:aload_0         
	//  117  238:getfield        #283 <Field Rect Q>
	//  118  241:getfield        #1051 <Field int Rect.bottom>
	//  119  244:icmpgt          264
	//  120  247:aload_0         
	//  121  248:getfield        #281 <Field Rect j>
	//  122  251:getfield        #1048 <Field int Rect.top>
	//  123  254:aload_0         
	//  124  255:getfield        #283 <Field Rect Q>
	//  125  258:getfield        #1051 <Field int Rect.bottom>
	//  126  261:icmplt          283
	//  127  264:aload_0         
	//  128  265:getfield        #281 <Field Rect j>
	//  129  268:getfield        #1048 <Field int Rect.top>
	//  130  271:aload_0         
	//  131  272:getfield        #283 <Field Rect Q>
	//  132  275:getfield        #1048 <Field int Rect.top>
	//  133  278:icmple          283
	//  134  281:iconst_1        
	//  135  282:ireturn         
	//  136  283:iconst_0        
	//  137  284:ireturn         
		}
		return (j.right > Q.right || j.left >= Q.right) && j.left > Q.left;
	//  138  285:aload_0         
	//  139  286:getfield        #281 <Field Rect j>
	//  140  289:getfield        #1045 <Field int Rect.right>
	//  141  292:aload_0         
	//  142  293:getfield        #283 <Field Rect Q>
	//  143  296:getfield        #1045 <Field int Rect.right>
	//  144  299:icmpgt          319
	//  145  302:aload_0         
	//  146  303:getfield        #281 <Field Rect j>
	//  147  306:getfield        #1042 <Field int Rect.left>
	//  148  309:aload_0         
	//  149  310:getfield        #283 <Field Rect Q>
	//  150  313:getfield        #1045 <Field int Rect.right>
	//  151  316:icmplt          338
	//  152  319:aload_0         
	//  153  320:getfield        #281 <Field Rect j>
	//  154  323:getfield        #1042 <Field int Rect.left>
	//  155  326:aload_0         
	//  156  327:getfield        #283 <Field Rect Q>
	//  157  330:getfield        #1042 <Field int Rect.left>
	//  158  333:icmple          338
	//  159  336:iconst_1        
	//  160  337:ireturn         
	//  161  338:iconst_0        
	//  162  339:ireturn         
	}

	static void c(u u1)
	{
label0:
		{
			if(u1.b == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #1130 <Field WeakReference android.support.v7.widget.RecyclerView$u.b>
	//    2    4:ifnull          58
			Object obj = u1.b.get();
	//    3    7:aload_0         
	//    4    8:getfield        #1130 <Field WeakReference android.support.v7.widget.RecyclerView$u.b>
	//    5   11:invokevirtual   #1135 <Method Object WeakReference.get()>
	//    6   14:astore_1        
label1:
			do
			{
				obj = ((Object) ((View)obj));
	//    7   15:aload_1         
	//    8   16:checkcast       #653 <Class View>
	//    9   19:astore_1        
				do
				{
					if(obj == null)
						break label1;
	//   10   20:aload_1         
	//   11   21:ifnull          53
					if(obj == u1.a)
	//*  12   24:aload_1         
	//*  13   25:aload_0         
	//*  14   26:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  15   29:if_acmpne       33
						return;
	//   16   32:return          
					obj = ((Object) (((View) (obj)).getParent()));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #673 <Method ViewParent View.getParent()>
	//   19   37:astore_1        
					if(obj instanceof View)
	//*  20   38:aload_1         
	//*  21   39:instanceof      #653 <Class View>
	//*  22   42:ifeq            48
						continue label1;
	//   23   45:goto            15
					obj = null;
	//   24   48:aconst_null     
	//   25   49:astore_1        
				} while(true);
	//   26   50:goto            20
			} while(true);
			u1.b = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #1130 <Field WeakReference android.support.v7.widget.RecyclerView$u.b>
		}
	//   30   58:return          
	}

	private void c(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1139 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i1) == ai)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #312 <Field int ai>
	//*   8   14:icmpne          79
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
			ai = motionevent.getPointerId(i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//   20   34:putfield        #312 <Field int ai>
			int j1 = (int)(motionevent.getX(i1) + 0.5F);
	//   21   37:aload_1         
	//   22   38:iload_2         
	//   23   39:invokevirtual   #1147 <Method float MotionEvent.getX(int)>
	//   24   42:ldc2            #1148 <Float 0.5F>
	//   25   45:fadd            
	//   26   46:f2i             
	//   27   47:istore_3        
			am = j1;
	//   28   48:aload_0         
	//   29   49:iload_3         
	//   30   50:putfield        #1150 <Field int am>
			ak = j1;
	//   31   53:aload_0         
	//   32   54:iload_3         
	//   33   55:putfield        #1152 <Field int ak>
			i1 = (int)(motionevent.getY(i1) + 0.5F);
	//   34   58:aload_1         
	//   35   59:iload_2         
	//   36   60:invokevirtual   #1155 <Method float MotionEvent.getY(int)>
	//   37   63:ldc2            #1148 <Float 0.5F>
	//   38   66:fadd            
	//   39   67:f2i             
	//   40   68:istore_2        
			an = i1;
	//   41   69:aload_0         
	//   42   70:iload_2         
	//   43   71:putfield        #1157 <Field int an>
			al = i1;
	//   44   74:aload_0         
	//   45   75:iload_2         
	//   46   76:putfield        #1159 <Field int al>
		}
	//   47   79:return          
	}

	static u e(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((LayoutParams)view.getLayoutParams()).c;
	//    4    6:aload_0         
	//    5    7:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   10:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    7   13:getfield        #1161 <Field RecyclerView$u RecyclerView$LayoutParams.c>
	//    8   16:areturn         
	}

	private void e(u u1)
	{
		View view = u1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//    2    4:astore_3        
		boolean flag;
		if(view.getParent() == this)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #673 <Method ViewParent View.getParent()>
	//*   5    9:aload_0         
	//*   6   10:if_acmpne       18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		d.c(b(view));
	//   12   20:aload_0         
	//   13   21:getfield        #268 <Field RecyclerView$n d>
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #1163 <Method RecyclerView$u b(View)>
	//   17   29:invokevirtual   #1005 <Method void RecyclerView$n.c(RecyclerView$u)>
		if(u1.r())
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #1165 <Method boolean RecyclerView$u.r()>
	//*  20   36:ifeq            54
		{
			f.a(view, -1, view.getLayoutParams(), true);
	//   21   39:aload_0         
	//   22   40:getfield        #512 <Field android.support.v7.widget.t f>
	//   23   43:aload_3         
	//   24   44:iconst_m1       
	//   25   45:aload_3         
	//   26   46:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   49:iconst_1        
	//   28   50:invokevirtual   #1168 <Method void android.support.v7.widget.t.a(View, int, android.view.ViewGroup$LayoutParams, boolean)>
			return;
	//   29   53:return          
		}
		if(!flag)
	//*  30   54:iload_2         
	//*  31   55:ifne            68
		{
			f.a(view, true);
	//   32   58:aload_0         
	//   33   59:getfield        #512 <Field android.support.v7.widget.t f>
	//   34   62:aload_3         
	//   35   63:iconst_1        
	//   36   64:invokevirtual   #1171 <Method void android.support.v7.widget.t.a(View, boolean)>
			return;
	//   37   67:return          
		} else
		{
			f.d(view);
	//   38   68:aload_0         
	//   39   69:getfield        #512 <Field android.support.v7.widget.t f>
	//   40   72:aload_3         
	//   41   73:invokevirtual   #1173 <Method void t.d(View)>
			return;
	//   42   76:return          
		}
	}

	private android.support.v4.view.k getScrollingChildHelper()
	{
		if(aA == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1177 <Field k aA>
	//*   2    4:ifnonnull       19
			aA = new android.support.v4.view.k(((View) (this)));
	//    3    7:aload_0         
	//    4    8:new             #1179 <Class k>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #1181 <Method void k(View)>
	//    8   16:putfield        #1177 <Field k aA>
		return aA;
	//    9   19:aload_0         
	//   10   20:getfield        #1177 <Field k aA>
	//   11   23:areturn         
	}

	static RecyclerView j(View view)
	{
		if(!(view instanceof ViewGroup))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #4   <Class ViewGroup>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(view instanceof RecyclerView)
	//*   5    9:aload_0         
	//*   6   10:instanceof      #2   <Class RecyclerView>
	//*   7   13:ifeq            21
			return (RecyclerView)view;
	//    8   16:aload_0         
	//    9   17:checkcast       #2   <Class RecyclerView>
	//   10   20:areturn         
		view = ((View) ((ViewGroup)view));
	//   11   21:aload_0         
	//   12   22:checkcast       #4   <Class ViewGroup>
	//   13   25:astore_0        
		int j1 = ((ViewGroup) (view)).getChildCount();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #1185 <Method int ViewGroup.getChildCount()>
	//   16   30:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  17   31:iconst_0        
	//*  18   32:istore_1        
	//*  19   33:iload_1         
	//*  20   34:iload_2         
	//*  21   35:icmpge          60
		{
			RecyclerView recyclerview = j(((ViewGroup) (view)).getChildAt(i1));
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:invokevirtual   #1188 <Method View ViewGroup.getChildAt(int)>
	//   25   43:invokestatic    #1190 <Method RecyclerView j(View)>
	//   26   46:astore_3        
			if(recyclerview != null)
	//*  27   47:aload_3         
	//*  28   48:ifnull          53
				return recyclerview;
	//   29   51:aload_3         
	//   30   52:areturn         
		}

	//   31   53:iload_1         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_1        
	//*  35   57:goto            33
		return null;
	//   36   60:aconst_null     
	//   37   61:areturn         
	}

	private boolean k(int i1, int j1)
	{
		a(az);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #341 <Field int[] az>
	//    3    5:invokespecial   #716 <Method void a(int[])>
		int ai1[] = az;
	//    4    8:aload_0         
	//    5    9:getfield        #341 <Field int[] az>
	//    6   12:astore          4
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		if(ai1[0] != i1 || az[1] != j1)
	//*   9   16:aload           4
	//*  10   18:iconst_0        
	//*  11   19:iaload          
	//*  12   20:iload_1         
	//*  13   21:icmpne          34
	//*  14   24:aload_0         
	//*  15   25:getfield        #341 <Field int[] az>
	//*  16   28:iconst_1        
	//*  17   29:iaload          
	//*  18   30:iload_2         
	//*  19   31:icmpeq          36
			flag = true;
	//   20   34:iconst_1        
	//   21   35:istore_3        
		return flag;
	//   22   36:iload_3         
	//   23   37:ireturn         
	}

	private int m(View view)
	{
		int i1;
label0:
		do
		{
			i1 = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1193 <Method int View.getId()>
	//    2    4:istore_2        
			View view1;
			do
			{
				if(view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus())
					break label0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1194 <Method boolean View.isFocused()>
	//    5    9:ifne            49
	//    6   12:aload_1         
	//    7   13:instanceof      #4   <Class ViewGroup>
	//    8   16:ifeq            49
	//    9   19:aload_1         
	//   10   20:invokevirtual   #674 <Method boolean View.hasFocus()>
	//   11   23:ifeq            49
				view1 = ((ViewGroup)view).getFocusedChild();
	//   12   26:aload_1         
	//   13   27:checkcast       #4   <Class ViewGroup>
	//   14   30:invokevirtual   #1195 <Method View ViewGroup.getFocusedChild()>
	//   15   33:astore_3        
				view = view1;
	//   16   34:aload_3         
	//   17   35:astore_1        
			} while(view1.getId() == -1);
	//   18   36:aload_3         
	//   19   37:invokevirtual   #1193 <Method int View.getId()>
	//   20   40:iconst_m1       
	//   21   41:icmpeq          5
			view = view1;
	//   22   44:aload_3         
	//   23   45:astore_1        
		} while(true);
	//   24   46:goto            0
		return i1;
	//   25   49:iload_2         
	//   26   50:ireturn         
	}

	static boolean z()
	{
		return K;
	//    0    0:getstatic       #228 <Field boolean K>
	//    1    3:ireturn         
	}

	long a(u u1)
	{
		if(l.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #608 <Field RecyclerView$a l>
	//*   2    4:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*   3    7:ifeq            15
			return u1.g();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #628 <Method long android.support.v7.widget.RecyclerView$u.g()>
	//    6   14:lreturn         
		else
			return (long)u1.c;
	//    7   15:aload_1         
	//    8   16:getfield        #1196 <Field int RecyclerView$u.c>
	//    9   19:i2l             
	//   10   20:lreturn         
	}

	u a(int i1, boolean flag)
	{
		int k1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore          4
		u u1 = null;
	//    4    9:aconst_null     
	//    5   10:astore          5
		for(int j1 = 0; j1 < k1;)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:iload           4
	//*  10   17:icmpge          126
		{
			u u2;
label0:
			{
				u u3 = e(f.d(j1));
	//   11   20:aload_0         
	//   12   21:getfield        #512 <Field android.support.v7.widget.t f>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #1201 <Method View t.d(int)>
	//   15   28:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   16   31:astore          7
				u2 = u1;
	//   17   33:aload           5
	//   18   35:astore          6
				if(u3 == null)
					break label0;
	//   19   37:aload           7
	//   20   39:ifnull          115
				u2 = u1;
	//   21   42:aload           5
	//   22   44:astore          6
				if(u3.q())
					break label0;
	//   23   46:aload           7
	//   24   48:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//   25   51:ifne            115
				if(flag)
	//*  26   54:iload_2         
	//*  27   55:ifeq            74
				{
					if(u3.c != i1)
	//*  28   58:aload           7
	//*  29   60:getfield        #1196 <Field int RecyclerView$u.c>
	//*  30   63:iload_1         
	//*  31   64:icmpeq          90
					{
						u2 = u1;
	//   32   67:aload           5
	//   33   69:astore          6
						break label0;
	//   34   71:goto            115
					}
				} else
				if(u3.d() != i1)
	//*  35   74:aload           7
	//*  36   76:invokevirtual   #1065 <Method int RecyclerView$u.d()>
	//*  37   79:iload_1         
	//*  38   80:icmpeq          90
				{
					u2 = u1;
	//   39   83:aload           5
	//   40   85:astore          6
					break label0;
	//   41   87:goto            115
				}
				if(f.c(u3.a))
	//*  42   90:aload_0         
	//*  43   91:getfield        #512 <Field android.support.v7.widget.t f>
	//*  44   94:aload           7
	//*  45   96:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  46   99:invokevirtual   #680 <Method boolean t.c(View)>
	//*  47  102:ifeq            112
					u2 = u3;
	//   48  105:aload           7
	//   49  107:astore          6
				else
	//*  50  109:goto            115
					return u3;
	//   51  112:aload           7
	//   52  114:areturn         
			}
			j1++;
	//   53  115:iload_3         
	//   54  116:iconst_1        
	//   55  117:iadd            
	//   56  118:istore_3        
			u1 = u2;
	//   57  119:aload           6
	//   58  121:astore          5
		}

	//*  59  123:goto            14
		return u1;
	//   60  126:aload           5
	//   61  128:areturn         
	}

	public u a(long l1)
	{
		a a1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field RecyclerView$a l>
	//    2    4:astore          7
		u u2 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		u u1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		if(a1 != null)
	//*   7   12:aload           7
	//*   8   14:ifnull          134
		{
			if(!l.d())
	//*   9   17:aload_0         
	//*  10   18:getfield        #608 <Field RecyclerView$a l>
	//*  11   21:invokevirtual   #610 <Method boolean RecyclerView$a.d()>
	//*  12   24:ifne            29
				return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
			int j1 = f.c();
	//   15   29:aload_0         
	//   16   30:getfield        #512 <Field android.support.v7.widget.t f>
	//   17   33:invokevirtual   #1199 <Method int t.c()>
	//   18   36:istore          4
			int i1 = 0;
	//   19   38:iconst_0        
	//   20   39:istore_3        
			do
			{
				u2 = u1;
	//   21   40:aload           5
	//   22   42:astore          6
				if(i1 >= j1)
					break;
	//   23   44:iload_3         
	//   24   45:iload           4
	//   25   47:icmpge          134
				u u3 = e(f.d(i1));
	//   26   50:aload_0         
	//   27   51:getfield        #512 <Field android.support.v7.widget.t f>
	//   28   54:iload_3         
	//   29   55:invokevirtual   #1201 <Method View t.d(int)>
	//   30   58:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   31   61:astore          7
				u2 = u1;
	//   32   63:aload           5
	//   33   65:astore          6
				if(u3 != null)
	//*  34   67:aload           7
	//*  35   69:ifnull          123
				{
					u2 = u1;
	//   36   72:aload           5
	//   37   74:astore          6
					if(!u3.q())
	//*  38   76:aload           7
	//*  39   78:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//*  40   81:ifne            123
					{
						u2 = u1;
	//   41   84:aload           5
	//   42   86:astore          6
						if(u3.g() == l1)
	//*  43   88:aload           7
	//*  44   90:invokevirtual   #628 <Method long android.support.v7.widget.RecyclerView$u.g()>
	//*  45   93:lload_1         
	//*  46   94:lcmp            
	//*  47   95:ifne            123
							if(f.c(u3.a))
	//*  48   98:aload_0         
	//*  49   99:getfield        #512 <Field android.support.v7.widget.t f>
	//*  50  102:aload           7
	//*  51  104:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  52  107:invokevirtual   #680 <Method boolean t.c(View)>
	//*  53  110:ifeq            120
								u2 = u3;
	//   54  113:aload           7
	//   55  115:astore          6
							else
	//*  56  117:goto            123
								return u3;
	//   57  120:aload           7
	//   58  122:areturn         
					}
				}
				i1++;
	//   59  123:iload_3         
	//   60  124:iconst_1        
	//   61  125:iadd            
	//   62  126:istore_3        
				u1 = u2;
	//   63  127:aload           6
	//   64  129:astore          5
			} while(true);
	//   65  131:goto            40
		}
		return u2;
	//   66  134:aload           6
	//   67  136:areturn         
	}

	public View a(float f1, float f2)
	{
		for(int i1 = f.b() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//*   2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          5
	//*   6   11:iload           5
	//*   7   13:iflt            106
		{
			View view = f.b(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #512 <Field android.support.v7.widget.t f>
	//   10   20:iload           5
	//   11   22:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   12   25:astore          6
			float f3 = view.getTranslationX();
	//   13   27:aload           6
	//   14   29:invokevirtual   #1206 <Method float View.getTranslationX()>
	//   15   32:fstore_3        
			float f4 = view.getTranslationY();
	//   16   33:aload           6
	//   17   35:invokevirtual   #1209 <Method float View.getTranslationY()>
	//   18   38:fstore          4
			if(f1 >= (float)view.getLeft() + f3 && f1 <= (float)view.getRight() + f3 && f2 >= (float)view.getTop() + f4 && f2 <= (float)view.getBottom() + f4)
	//*  19   40:fload_1         
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #1091 <Method int View.getLeft()>
	//*  22   46:i2f             
	//*  23   47:fload_3         
	//*  24   48:fadd            
	//*  25   49:fcmpl           
	//*  26   50:iflt            97
	//*  27   53:fload_1         
	//*  28   54:aload           6
	//*  29   56:invokevirtual   #1103 <Method int View.getRight()>
	//*  30   59:i2f             
	//*  31   60:fload_3         
	//*  32   61:fadd            
	//*  33   62:fcmpg           
	//*  34   63:ifgt            97
	//*  35   66:fload_2         
	//*  36   67:aload           6
	//*  37   69:invokevirtual   #1097 <Method int View.getTop()>
	//*  38   72:i2f             
	//*  39   73:fload           4
	//*  40   75:fadd            
	//*  41   76:fcmpl           
	//*  42   77:iflt            97
	//*  43   80:fload_2         
	//*  44   81:aload           6
	//*  45   83:invokevirtual   #1109 <Method int View.getBottom()>
	//*  46   86:i2f             
	//*  47   87:fload           4
	//*  48   89:fadd            
	//*  49   90:fcmpg           
	//*  50   91:ifgt            97
				return view;
	//   51   94:aload           6
	//   52   96:areturn         
		}

	//   53   97:iload           5
	//   54   99:iconst_1        
	//   55  100:isub            
	//   56  101:istore          5
	//*  57  103:goto            11
		return null;
	//   58  106:aconst_null     
	//   59  107:areturn         
	}

	String a()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #816 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #817 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(" ");
	//    4    8:aload_1         
	//    5    9:ldc2            #1211 <String " ">
	//    6   12:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(super.toString());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokespecial   #1212 <Method String ViewGroup.toString()>
	//   11   21:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", adapter:");
	//   13   25:aload_1         
	//   14   26:ldc2            #1214 <String ", adapter:">
	//   15   29:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((Object) (l)));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #608 <Field RecyclerView$a l>
	//   20   38:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   21   41:pop             
		stringbuilder.append(", layout:");
	//   22   42:aload_1         
	//   23   43:ldc2            #1216 <String ", layout:">
	//   24   46:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(((Object) (m)));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #528 <Field RecyclerView$h m>
	//   29   55:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   30   58:pop             
		stringbuilder.append(", context:");
	//   31   59:aload_1         
	//   32   60:ldc2            #1218 <String ", context:">
	//   33   63:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(((Object) (getContext())));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #431 <Method Context getContext()>
	//   38   72:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   39   75:pop             
		return stringbuilder.toString();
	//   40   76:aload_1         
	//   41   77:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   42   80:areturn         
	}

	public void a(int i1)
	{
		if(u)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1219 <Field boolean u>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		f();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1221 <Method void f()>
		if(m == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #528 <Field RecyclerView$h m>
	//*   8   16:ifnonnull       30
		{
			Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
	//    9   19:ldc2            #887 <String "RecyclerView">
	//   10   22:ldc2            #1223 <String "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.">
	//   11   25:invokestatic    #892 <Method int Log.e(String, String)>
	//   12   28:pop             
			return;
	//   13   29:return          
		} else
		{
			m.d(i1);
	//   14   30:aload_0         
	//   15   31:getfield        #528 <Field RecyclerView$h m>
	//   16   34:iload_1         
	//   17   35:invokevirtual   #1225 <Method void RecyclerView$h.d(int)>
			awakenScrollBars();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #1116 <Method boolean awakenScrollBars()>
	//   20   42:pop             
			return;
	//   21   43:return          
		}
	}

	public void a(int i1, int j1)
	{
		a(i1, j1, ((Interpolator) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1228 <Method void a(int, int, Interpolator)>
	//    5    7:return          
	}

	public void a(int i1, int j1, Interpolator interpolator)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       18
		{
			Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	//    3    7:ldc2            #887 <String "RecyclerView">
	//    4   10:ldc2            #1230 <String "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.">
	//    5   13:invokestatic    #892 <Method int Log.e(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		}
		if(u)
	//*   8   18:aload_0         
	//*   9   19:getfield        #1219 <Field boolean u>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		if(!m.d())
	//*  12   26:aload_0         
	//*  13   27:getfield        #528 <Field RecyclerView$h m>
	//*  14   30:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  15   33:ifne            38
			i1 = 0;
	//   16   36:iconst_0        
	//   17   37:istore_1        
		if(!m.e())
	//*  18   38:aload_0         
	//*  19   39:getfield        #528 <Field RecyclerView$h m>
	//*  20   42:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  21   45:ifne            50
			j1 = 0;
	//   22   48:iconst_0        
	//   23   49:istore_2        
		if(i1 != 0 || j1 != 0)
	//*  24   50:iload_1         
	//*  25   51:ifne            58
	//*  26   54:iload_2         
	//*  27   55:ifeq            68
			y.a(i1, j1, interpolator);
	//   28   58:aload_0         
	//   29   59:getfield        #322 <Field RecyclerView$t y>
	//   30   62:iload_1         
	//   31   63:iload_2         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #1234 <Method void android.support.v7.widget.RecyclerView$t.a(int, int, Interpolator)>
	//   34   68:return          
	}

	void a(int i1, int j1, Object obj)
	{
		int l1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore          5
		for(int k1 = 0; k1 < l1; k1++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          106
		{
			View view = f.d(k1);
	//    9   19:aload_0         
	//   10   20:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   23:iload           4
	//   12   25:invokevirtual   #1201 <Method View t.d(int)>
	//   13   28:astore          6
			u u1 = e(view);
	//   14   30:aload           6
	//   15   32:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   16   35:astore          7
			if(u1 != null && !u1.c() && u1.c >= i1 && u1.c < i1 + j1)
	//*  17   37:aload           7
	//*  18   39:ifnull          97
	//*  19   42:aload           7
	//*  20   44:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  21   47:ifeq            53
	//*  22   50:goto            97
	//*  23   53:aload           7
	//*  24   55:getfield        #1196 <Field int RecyclerView$u.c>
	//*  25   58:iload_1         
	//*  26   59:icmplt          97
	//*  27   62:aload           7
	//*  28   64:getfield        #1196 <Field int RecyclerView$u.c>
	//*  29   67:iload_1         
	//*  30   68:iload_2         
	//*  31   69:iadd            
	//*  32   70:icmpge          97
			{
				u1.b(2);
	//   33   73:aload           7
	//   34   75:iconst_2        
	//   35   76:invokevirtual   #1237 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
				u1.a(obj);
	//   36   79:aload           7
	//   37   81:aload_3         
	//   38   82:invokevirtual   #1240 <Method void android.support.v7.widget.RecyclerView$u.a(Object)>
				((LayoutParams)view.getLayoutParams()).e = true;
	//   39   85:aload           6
	//   40   87:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   41   90:checkcast       #20  <Class RecyclerView$LayoutParams>
	//   42   93:iconst_1        
	//   43   94:putfield        #1037 <Field boolean RecyclerView$LayoutParams.e>
			}
		}

	//   44   97:iload           4
	//   45   99:iconst_1        
	//   46  100:iadd            
	//   47  101:istore          4
	//*  48  103:goto            12
		d.c(i1, j1);
	//   49  106:aload_0         
	//   50  107:getfield        #268 <Field RecyclerView$n d>
	//   51  110:iload_1         
	//   52  111:iload_2         
	//   53  112:invokevirtual   #1242 <Method void RecyclerView$n.c(int, int)>
	//   54  115:return          
	}

	void a(int i1, int j1, boolean flag)
	{
		int l1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore          5
		for(int k1 = 0; k1 < l1; k1++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          108
		{
			u u1 = e(f.d(k1));
	//    9   19:aload_0         
	//   10   20:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   23:iload           4
	//   12   25:invokevirtual   #1201 <Method View t.d(int)>
	//   13   28:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   31:astore          6
			if(u1 == null || u1.c())
				continue;
	//   15   33:aload           6
	//   16   35:ifnull          99
	//   17   38:aload           6
	//   18   40:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//   19   43:ifne            99
			if(u1.c >= i1 + j1)
	//*  20   46:aload           6
	//*  21   48:getfield        #1196 <Field int RecyclerView$u.c>
	//*  22   51:iload_1         
	//*  23   52:iload_2         
	//*  24   53:iadd            
	//*  25   54:icmplt          76
			{
				u1.a(-j1, flag);
	//   26   57:aload           6
	//   27   59:iload_2         
	//   28   60:ineg            
	//   29   61:iload_3         
	//   30   62:invokevirtual   #1246 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
			} else
	//*  31   65:aload_0         
	//*  32   66:getfield        #330 <Field RecyclerView$r B>
	//*  33   69:iconst_1        
	//*  34   70:putfield        #739 <Field boolean RecyclerView$r.e>
	//*  35   73:goto            99
			{
				if(u1.c < i1)
					continue;
	//   36   76:aload           6
	//   37   78:getfield        #1196 <Field int RecyclerView$u.c>
	//   38   81:iload_1         
	//   39   82:icmplt          99
				u1.a(i1 - 1, -j1, flag);
	//   40   85:aload           6
	//   41   87:iload_1         
	//   42   88:iconst_1        
	//   43   89:isub            
	//   44   90:iload_2         
	//   45   91:ineg            
	//   46   92:iload_3         
	//   47   93:invokevirtual   #1248 <Method void android.support.v7.widget.RecyclerView$u.a(int, int, boolean)>
			}
			B.e = true;
		}

	//   48   96:goto            65
	//   49   99:iload           4
	//   50  101:iconst_1        
	//   51  102:iadd            
	//   52  103:istore          4
	//*  53  105:goto            12
		d.a(i1, j1, flag);
	//   54  108:aload_0         
	//   55  109:getfield        #268 <Field RecyclerView$n d>
	//   56  112:iload_1         
	//   57  113:iload_2         
	//   58  114:iload_3         
	//   59  115:invokevirtual   #1249 <Method void android.support.v7.widget.RecyclerView$n.a(int, int, boolean)>
		requestLayout();
	//   60  118:aload_0         
	//   61  119:invokevirtual   #1252 <Method void requestLayout()>
	//   62  122:return          
	}

	void a(StateListDrawable statelistdrawable, Drawable drawable, StateListDrawable statelistdrawable1, Drawable drawable1)
	{
		if(statelistdrawable != null && drawable != null && statelistdrawable1 != null && drawable1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          68
	//*   2    4:aload_2         
	//*   3    5:ifnull          68
	//*   4    8:aload_3         
	//*   5    9:ifnull          68
	//*   6   12:aload           4
	//*   7   14:ifnonnull       20
	//*   8   17:goto            68
		{
			Resources resources = getContext().getResources();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #431 <Method Context getContext()>
	//   11   24:invokevirtual   #1256 <Method Resources Context.getResources()>
	//   12   27:astore          5
			new aa(this, statelistdrawable, drawable, statelistdrawable1, drawable1, resources.getDimensionPixelSize(android.support.v7.e.a.a.fastscroll_default_thickness), resources.getDimensionPixelSize(android.support.v7.e.a.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(android.support.v7.e.a.a.fastscroll_margin));
	//   13   29:new             #1258 <Class aa>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:getstatic       #1263 <Field int android.support.v7.e.a$a.fastscroll_default_thickness>
	//   22   44:invokevirtual   #1268 <Method int Resources.getDimensionPixelSize(int)>
	//   23   47:aload           5
	//   24   49:getstatic       #1271 <Field int android.support.v7.e.a$a.fastscroll_minimum_range>
	//   25   52:invokevirtual   #1268 <Method int Resources.getDimensionPixelSize(int)>
	//   26   55:aload           5
	//   27   57:getstatic       #1274 <Field int android.support.v7.e.a$a.fastscroll_margin>
	//   28   60:invokevirtual   #1277 <Method int Resources.getDimensionPixelOffset(int)>
	//   29   63:invokespecial   #1280 <Method void aa(RecyclerView, StateListDrawable, Drawable, StateListDrawable, Drawable, int, int, int)>
	//   30   66:pop             
			return;
	//   31   67:return          
		} else
		{
			statelistdrawable = ((StateListDrawable) (new StringBuilder()));
	//   32   68:new             #816 <Class StringBuilder>
	//   33   71:dup             
	//   34   72:invokespecial   #817 <Method void StringBuilder()>
	//   35   75:astore_1        
			((StringBuilder) (statelistdrawable)).append("Trying to set fast scroller without both required drawables.");
	//   36   76:aload_1         
	//   37   77:ldc2            #1282 <String "Trying to set fast scroller without both required drawables.">
	//   38   80:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			((StringBuilder) (statelistdrawable)).append(a());
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:invokevirtual   #875 <Method String a()>
	//   43   89:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
			throw new IllegalArgumentException(((StringBuilder) (statelistdrawable)).toString());
	//   45   93:new             #1126 <Class IllegalArgumentException>
	//   46   96:dup             
	//   47   97:aload_1         
	//   48   98:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   49  101:invokespecial   #1127 <Method void IllegalArgumentException(String)>
	//   50  104:athrow          
		}
	}

	public void a(g g1)
	{
		a(g1, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1286 <Method void a(RecyclerView$g, int)>
	//    4    6:return          
	}

	public void a(g g1, int i1)
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnull          17
			m.a("Cannot add item decoration during a scroll  or layout");
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:ldc2            #1288 <String "Cannot add item decoration during a scroll  or layout">
	//    6   14:invokevirtual   #1290 <Method void android.support.v7.widget.RecyclerView$h.a(String)>
		if(o.isEmpty())
	//*   7   17:aload_0         
	//*   8   18:getfield        #293 <Field ArrayList o>
	//*   9   21:invokevirtual   #1291 <Method boolean ArrayList.isEmpty()>
	//*  10   24:ifeq            32
			setWillNotDraw(false);
	//   11   27:aload_0         
	//   12   28:iconst_0        
	//   13   29:invokevirtual   #412 <Method void setWillNotDraw(boolean)>
		if(i1 < 0)
	//*  14   32:iload_2         
	//*  15   33:ifge            48
			o.add(((Object) (g1)));
	//   16   36:aload_0         
	//   17   37:getfield        #293 <Field ArrayList o>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #1295 <Method boolean ArrayList.add(Object)>
	//   20   44:pop             
		else
	//*  21   45:goto            57
			o.add(i1, ((Object) (g1)));
	//   22   48:aload_0         
	//   23   49:getfield        #293 <Field ArrayList o>
	//   24   52:iload_2         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #1298 <Method void ArrayList.add(int, Object)>
		r();
	//   27   57:aload_0         
	//   28   58:invokevirtual   #1300 <Method void r()>
		requestLayout();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #1252 <Method void requestLayout()>
	//   31   65:return          
	}

	public void a(i i1)
	{
		if(aa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1303 <Field List aa>
	//*   2    4:ifnonnull       18
			aa = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #290 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #291 <Method void ArrayList()>
	//    7   15:putfield        #1303 <Field List aa>
		aa.add(((Object) (i1)));
	//    8   18:aload_0         
	//    9   19:getfield        #1303 <Field List aa>
	//   10   22:aload_1         
	//   11   23:invokeinterface #1306 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void a(k k1)
	{
		R.add(((Object) (k1)));
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field ArrayList R>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1295 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void a(l l1)
	{
		if(aw == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1310 <Field List aw>
	//*   2    4:ifnonnull       18
			aw = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #290 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #291 <Method void ArrayList()>
	//    7   15:putfield        #1310 <Field List aw>
		aw.add(((Object) (l1)));
	//    8   18:aload_0         
	//    9   19:getfield        #1310 <Field List aw>
	//   10   22:aload_1         
	//   11   23:invokeinterface #1306 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	final void a(r r1)
	{
		if(getScrollState() == 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1313 <Method int getScrollState()>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          43
		{
			OverScroller overscroller = android.support.v7.widget.t.a(y);
	//    4    8:aload_0         
	//    5    9:getfield        #322 <Field RecyclerView$t y>
	//    6   12:invokestatic    #1316 <Method OverScroller android.support.v7.widget.RecyclerView$t.a(RecyclerView$t)>
	//    7   15:astore_2        
			r1.n = overscroller.getFinalX() - overscroller.getCurrX();
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #1321 <Method int OverScroller.getFinalX()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #1324 <Method int OverScroller.getCurrX()>
	//   13   25:isub            
	//   14   26:putfield        #1326 <Field int RecyclerView$r.n>
			r1.o = overscroller.getFinalY() - overscroller.getCurrY();
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1329 <Method int OverScroller.getFinalY()>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #1332 <Method int OverScroller.getCurrY()>
	//   20   38:isub            
	//   21   39:putfield        #1334 <Field int RecyclerView$r.o>
			return;
	//   22   42:return          
		} else
		{
			r1.n = 0;
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:putfield        #1326 <Field int RecyclerView$r.n>
			r1.o = 0;
	//   26   48:aload_1         
	//   27   49:iconst_0        
	//   28   50:putfield        #1334 <Field int RecyclerView$r.o>
			return;
	//   29   53:return          
		}
	}

	void a(u u1, e.c c1)
	{
		u1.a(0, 8192);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:sipush          8192
	//    3    5:invokevirtual   #1336 <Method void android.support.v7.widget.RecyclerView$u.a(int, int)>
		if(B.g && u1.x() && !u1.q() && !u1.c())
	//*   4    8:aload_0         
	//*   5    9:getfield        #330 <Field RecyclerView$r B>
	//*   6   12:getfield        #708 <Field boolean android.support.v7.widget.RecyclerView$r.g>
	//*   7   15:ifeq            54
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #525 <Method boolean RecyclerView$u.x()>
	//*  10   22:ifeq            54
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//*  13   29:ifne            54
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  16   36:ifne            54
		{
			long l1 = a(u1);
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:invokevirtual   #732 <Method long a(RecyclerView$u)>
	//   20   44:lstore_3        
			g.a(l1, u1);
	//   21   45:aload_0         
	//   22   46:getfield        #273 <Field bc g>
	//   23   49:lload_3         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #735 <Method void android.support.v7.widget.bc.a(long, RecyclerView$u)>
		}
		g.a(u1, c1);
	//   26   54:aload_0         
	//   27   55:getfield        #273 <Field bc g>
	//   28   58:aload_1         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #729 <Method void android.support.v7.widget.bc.a(RecyclerView$u, RecyclerView$e$c)>
	//   31   63:return          
	}

	void a(u u1, e.c c1, e.c c2)
	{
		u1.a(false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #997 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
		if(x.b(u1, c1, c2))
	//*   3    5:aload_0         
	//*   4    6:getfield        #308 <Field RecyclerView$e x>
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #1340 <Method boolean android.support.v7.widget.RecyclerView$e.b(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//*   9   15:ifeq            22
			p();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #1012 <Method void p()>
	//   12   22:return          
	}

	public void a(View view, Rect rect)
	{
		b(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #1342 <Method void b(View, Rect)>
	//    3    5:return          
	}

	void a(String s1)
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1344 <Method boolean o()>
	//*   2    4:ifeq            57
			if(s1 == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       48
			{
				s1 = ((String) (new StringBuilder()));
	//    5   11:new             #816 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #817 <Method void StringBuilder()>
	//    8   18:astore_1        
				((StringBuilder) (s1)).append("Cannot call this method while RecyclerView is computing a layout or scrolling");
	//    9   19:aload_1         
	//   10   20:ldc2            #1346 <String "Cannot call this method while RecyclerView is computing a layout or scrolling">
	//   11   23:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
				((StringBuilder) (s1)).append(a());
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #875 <Method String a()>
	//   16   32:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
				throw new IllegalStateException(((StringBuilder) (s1)).toString());
	//   18   36:new             #877 <Class IllegalStateException>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   22   44:invokespecial   #880 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			} else
			{
				throw new IllegalStateException(s1);
	//   24   48:new             #877 <Class IllegalStateException>
	//   25   51:dup             
	//   26   52:aload_1         
	//   27   53:invokespecial   #880 <Method void IllegalStateException(String)>
	//   28   56:athrow          
			}
		if(ac > 0)
	//*  29   57:aload_0         
	//*  30   58:getfield        #303 <Field int ac>
	//*  31   61:ifle            110
		{
			s1 = ((String) (new StringBuilder()));
	//   32   64:new             #816 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #817 <Method void StringBuilder()>
	//   35   71:astore_1        
			((StringBuilder) (s1)).append("");
	//   36   72:aload_1         
	//   37   73:ldc2            #1348 <String "">
	//   38   76:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			((StringBuilder) (s1)).append(a());
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:invokevirtual   #875 <Method String a()>
	//   43   85:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", ((Throwable) (new IllegalStateException(((StringBuilder) (s1)).toString()))));
	//   45   89:ldc2            #887 <String "RecyclerView">
	//   46   92:ldc2            #1350 <String "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.">
	//   47   95:new             #877 <Class IllegalStateException>
	//   48   98:dup             
	//   49   99:aload_1         
	//   50  100:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   51  103:invokespecial   #880 <Method void IllegalStateException(String)>
	//   52  106:invokestatic    #1353 <Method int Log.w(String, String, Throwable)>
	//   53  109:pop             
		}
	//   54  110:return          
	}

	void a(boolean flag)
	{
		if(T < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #297 <Field int T>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          13
			T = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #297 <Field int T>
		if(!flag)
	//*   7   13:iload_1         
	//*   8   14:ifne            22
			t = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #1355 <Field boolean t>
		if(T == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #297 <Field int T>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          78
		{
			if(flag && t && !u && m != null && l != null)
	//*  16   30:iload_1         
	//*  17   31:ifeq            66
	//*  18   34:aload_0         
	//*  19   35:getfield        #1355 <Field boolean t>
	//*  20   38:ifeq            66
	//*  21   41:aload_0         
	//*  22   42:getfield        #1219 <Field boolean u>
	//*  23   45:ifne            66
	//*  24   48:aload_0         
	//*  25   49:getfield        #528 <Field RecyclerView$h m>
	//*  26   52:ifnull          66
	//*  27   55:aload_0         
	//*  28   56:getfield        #608 <Field RecyclerView$a l>
	//*  29   59:ifnull          66
				q();
	//   30   62:aload_0         
	//   31   63:invokevirtual   #1357 <Method void q()>
			if(!u)
	//*  32   66:aload_0         
	//*  33   67:getfield        #1219 <Field boolean u>
	//*  34   70:ifne            78
				t = false;
	//   35   73:aload_0         
	//   36   74:iconst_0        
	//   37   75:putfield        #1355 <Field boolean t>
		}
		T = T - 1;
	//   38   78:aload_0         
	//   39   79:aload_0         
	//   40   80:getfield        #297 <Field int T>
	//   41   83:iconst_1        
	//   42   84:isub            
	//   43   85:putfield        #297 <Field int T>
	//   44   88:return          
	}

	public boolean a(int i1, int j1, int k1, int l1, int ai1[], int i2)
	{
		return getScrollingChildHelper().a(i1, j1, k1, l1, ai1, i2);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #1362 <Method boolean k.a(int, int, int, int, int[], int)>
	//    9   16:ireturn         
	}

	boolean a(int i1, int j1, MotionEvent motionevent)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1365 <Method void d()>
		a a1 = l;
	//    2    4:aload_0         
	//    3    5:getfield        #608 <Field RecyclerView$a l>
	//    4    8:astore          9
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          8
		int k1;
		int l1;
		int i2;
		int j2;
		if(a1 != null)
	//*   7   13:aload           9
	//*   8   15:ifnull          133
		{
			e();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #699 <Method void e()>
			l();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #702 <Method void l()>
			android.support.v4.os.b.a("RV Scroll");
	//   13   26:ldc2            #1367 <String "RV Scroll">
	//   14   29:invokestatic    #1370 <Method void b.a(String)>
			a(B);
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #330 <Field RecyclerView$r B>
	//   18   37:invokevirtual   #697 <Method void a(RecyclerView$r)>
			if(i1 != 0)
	//*  19   40:iload_1         
	//*  20   41:ifeq            71
			{
				l1 = m.a(i1, d, B);
	//   21   44:aload_0         
	//   22   45:getfield        #528 <Field RecyclerView$h m>
	//   23   48:iload_1         
	//   24   49:aload_0         
	//   25   50:getfield        #268 <Field RecyclerView$n d>
	//   26   53:aload_0         
	//   27   54:getfield        #330 <Field RecyclerView$r B>
	//   28   57:invokevirtual   #1373 <Method int android.support.v7.widget.RecyclerView$h.a(int, RecyclerView$n, RecyclerView$r)>
	//   29   60:istore          5
				k1 = i1 - l1;
	//   30   62:iload_1         
	//   31   63:iload           5
	//   32   65:isub            
	//   33   66:istore          4
			} else
	//*  34   68:goto            77
			{
				l1 = 0;
	//   35   71:iconst_0        
	//   36   72:istore          5
				k1 = 0;
	//   37   74:iconst_0        
	//   38   75:istore          4
			}
			if(j1 != 0)
	//*  39   77:iload_2         
	//*  40   78:ifeq            108
			{
				j2 = m.b(j1, d, B);
	//   41   81:aload_0         
	//   42   82:getfield        #528 <Field RecyclerView$h m>
	//   43   85:iload_2         
	//   44   86:aload_0         
	//   45   87:getfield        #268 <Field RecyclerView$n d>
	//   46   90:aload_0         
	//   47   91:getfield        #330 <Field RecyclerView$r B>
	//   48   94:invokevirtual   #1375 <Method int android.support.v7.widget.RecyclerView$h.b(int, RecyclerView$n, RecyclerView$r)>
	//   49   97:istore          7
				i2 = j1 - j2;
	//   50   99:iload_2         
	//   51  100:iload           7
	//   52  102:isub            
	//   53  103:istore          6
			} else
	//*  54  105:goto            114
			{
				j2 = 0;
	//   55  108:iconst_0        
	//   56  109:istore          7
				i2 = 0;
	//   57  111:iconst_0        
	//   58  112:istore          6
			}
			android.support.v4.os.b.a();
	//   59  114:invokestatic    #1376 <Method void b.a()>
			x();
	//   60  117:aload_0         
	//   61  118:invokevirtual   #1378 <Method void x()>
			m();
	//   62  121:aload_0         
	//   63  122:invokevirtual   #755 <Method void m()>
			a(false);
	//   64  125:aload_0         
	//   65  126:iconst_0        
	//   66  127:invokevirtual   #757 <Method void a(boolean)>
		} else
	//*  67  130:goto            145
		{
			l1 = 0;
	//   68  133:iconst_0        
	//   69  134:istore          5
			k1 = 0;
	//   70  136:iconst_0        
	//   71  137:istore          4
			j2 = 0;
	//   72  139:iconst_0        
	//   73  140:istore          7
			i2 = 0;
	//   74  142:iconst_0        
	//   75  143:istore          6
		}
		if(!o.isEmpty())
	//*  76  145:aload_0         
	//*  77  146:getfield        #293 <Field ArrayList o>
	//*  78  149:invokevirtual   #1291 <Method boolean ArrayList.isEmpty()>
	//*  79  152:ifne            159
			invalidate();
	//   80  155:aload_0         
	//   81  156:invokevirtual   #1381 <Method void invalidate()>
		if(a(l1, j2, k1, i2, aB, 0))
	//*  82  159:aload_0         
	//*  83  160:iload           5
	//*  84  162:iload           7
	//*  85  164:iload           4
	//*  86  166:iload           6
	//*  87  168:aload_0         
	//*  88  169:getfield        #343 <Field int[] aB>
	//*  89  172:iconst_0        
	//*  90  173:invokevirtual   #1382 <Method boolean a(int, int, int, int, int[], int)>
	//*  91  176:ifeq            270
		{
			am = am - aB[0];
	//   92  179:aload_0         
	//   93  180:aload_0         
	//   94  181:getfield        #1150 <Field int am>
	//   95  184:aload_0         
	//   96  185:getfield        #343 <Field int[] aB>
	//   97  188:iconst_0        
	//   98  189:iaload          
	//   99  190:isub            
	//  100  191:putfield        #1150 <Field int am>
			an = an - aB[1];
	//  101  194:aload_0         
	//  102  195:aload_0         
	//  103  196:getfield        #1157 <Field int an>
	//  104  199:aload_0         
	//  105  200:getfield        #343 <Field int[] aB>
	//  106  203:iconst_1        
	//  107  204:iaload          
	//  108  205:isub            
	//  109  206:putfield        #1157 <Field int an>
			if(motionevent != null)
	//* 110  209:aload_3         
	//* 111  210:ifnull          231
				motionevent.offsetLocation(aB[0], aB[1]);
	//  112  213:aload_3         
	//  113  214:aload_0         
	//  114  215:getfield        #343 <Field int[] aB>
	//  115  218:iconst_0        
	//  116  219:iaload          
	//  117  220:i2f             
	//  118  221:aload_0         
	//  119  222:getfield        #343 <Field int[] aB>
	//  120  225:iconst_1        
	//  121  226:iaload          
	//  122  227:i2f             
	//  123  228:invokevirtual   #1386 <Method void MotionEvent.offsetLocation(float, float)>
			motionevent = ((MotionEvent) (aD));
	//  124  231:aload_0         
	//  125  232:getfield        #347 <Field int[] aD>
	//  126  235:astore_3        
			motionevent[0] = motionevent[0] + aB[0];
	//  127  236:aload_3         
	//  128  237:iconst_0        
	//  129  238:aload_3         
	//  130  239:iconst_0        
	//  131  240:iaload          
	//  132  241:aload_0         
	//  133  242:getfield        #343 <Field int[] aB>
	//  134  245:iconst_0        
	//  135  246:iaload          
	//  136  247:iadd            
	//  137  248:iastore         
			motionevent = ((MotionEvent) (aD));
	//  138  249:aload_0         
	//  139  250:getfield        #347 <Field int[] aD>
	//  140  253:astore_3        
			motionevent[1] = motionevent[1] + aB[1];
	//  141  254:aload_3         
	//  142  255:iconst_1        
	//  143  256:aload_3         
	//  144  257:iconst_1        
	//  145  258:iaload          
	//  146  259:aload_0         
	//  147  260:getfield        #343 <Field int[] aB>
	//  148  263:iconst_1        
	//  149  264:iaload          
	//  150  265:iadd            
	//  151  266:iastore         
		} else
	//* 152  267:goto            316
		if(getOverScrollMode() != 2)
	//* 153  270:aload_0         
	//* 154  271:invokevirtual   #409 <Method int getOverScrollMode()>
	//* 155  274:iconst_2        
	//* 156  275:icmpeq          316
		{
			if(motionevent != null && !android.support.v4.view.h.a(motionevent, 8194))
	//* 157  278:aload_3         
	//* 158  279:ifnull          310
	//* 159  282:aload_3         
	//* 160  283:sipush          8194
	//* 161  286:invokestatic    #1391 <Method boolean h.a(MotionEvent, int)>
	//* 162  289:ifne            310
				a(motionevent.getX(), k1, motionevent.getY(), i2);
	//  163  292:aload_0         
	//  164  293:aload_3         
	//  165  294:invokevirtual   #1393 <Method float MotionEvent.getX()>
	//  166  297:iload           4
	//  167  299:i2f             
	//  168  300:aload_3         
	//  169  301:invokevirtual   #1395 <Method float MotionEvent.getY()>
	//  170  304:iload           6
	//  171  306:i2f             
	//  172  307:invokespecial   #1397 <Method void a(float, float, float, float)>
			c(i1, j1);
	//  173  310:aload_0         
	//  174  311:iload_1         
	//  175  312:iload_2         
	//  176  313:invokevirtual   #1398 <Method void c(int, int)>
		}
		if(l1 != 0 || j2 != 0)
	//* 177  316:iload           5
	//* 178  318:ifne            326
	//* 179  321:iload           7
	//* 180  323:ifeq            334
			i(l1, j2);
	//  181  326:aload_0         
	//  182  327:iload           5
	//  183  329:iload           7
	//  184  331:invokevirtual   #805 <Method void i(int, int)>
		if(!awakenScrollBars())
	//* 185  334:aload_0         
	//* 186  335:invokevirtual   #1116 <Method boolean awakenScrollBars()>
	//* 187  338:ifne            345
			invalidate();
	//  188  341:aload_0         
	//  189  342:invokevirtual   #1381 <Method void invalidate()>
		if(l1 != 0 || j2 != 0)
	//* 190  345:iload           5
	//* 191  347:ifne            355
	//* 192  350:iload           7
	//* 193  352:ifeq            358
			flag = true;
	//  194  355:iconst_1        
	//  195  356:istore          8
		return flag;
	//  196  358:iload           8
	//  197  360:ireturn         
	}

	public boolean a(int i1, int j1, int ai1[], int ai2[], int k1)
	{
		return getScrollingChildHelper().a(i1, j1, ai1, ai2, k1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #1401 <Method boolean k.a(int, int, int[], int[], int)>
	//    8   14:ireturn         
	}

	boolean a(u u1, int i1)
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1344 <Method boolean o()>
	//*   2    4:ifeq            25
		{
			u1.l = i1;
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:putfield        #1404 <Field int RecyclerView$u.l>
			G.add(((Object) (u1)));
	//    6   12:aload_0         
	//    7   13:getfield        #349 <Field List G>
	//    8   16:aload_1         
	//    9   17:invokeinterface #1306 <Method boolean List.add(Object)>
	//   10   22:pop             
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		} else
		{
			android.support.v4.view.s.a(u1.a, i1);
	//   13   25:aload_1         
	//   14   26:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   15   29:iload_2         
	//   16   30:invokestatic    #427 <Method void s.a(View, int)>
			return true;
	//   17   33:iconst_1        
	//   18   34:ireturn         
		}
	}

	boolean a(View view)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #699 <Method void e()>
		boolean flag = f.f(view);
	//    2    4:aload_0         
	//    3    5:getfield        #512 <Field android.support.v7.widget.t f>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1406 <Method boolean t.f(View)>
	//    6   12:istore_2        
		if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            38
		{
			view = ((View) (e(view)));
	//    9   17:aload_1         
	//   10   18:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   11   21:astore_1        
			d.c(((u) (view)));
	//   12   22:aload_0         
	//   13   23:getfield        #268 <Field RecyclerView$n d>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #1005 <Method void RecyclerView$n.c(RecyclerView$u)>
			d.b(((u) (view)));
	//   16   30:aload_0         
	//   17   31:getfield        #268 <Field RecyclerView$n d>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #1408 <Method void android.support.v7.widget.RecyclerView$n.b(RecyclerView$u)>
		}
		a(flag ^ true);
	//   20   38:aload_0         
	//   21   39:iload_2         
	//   22   40:iconst_1        
	//   23   41:ixor            
	//   24   42:invokevirtual   #757 <Method void a(boolean)>
		return flag;
	//   25   45:iload_2         
	//   26   46:ireturn         
	}

	boolean a(AccessibilityEvent accessibilityevent)
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1344 <Method boolean o()>
	//*   2    4:ifeq            41
		{
			int i1;
			if(accessibilityevent != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          19
				i1 = android.support.v4.view.a.a.a(accessibilityevent);
	//    5   11:aload_1         
	//    6   12:invokestatic    #1412 <Method int a.a(AccessibilityEvent)>
	//    7   15:istore_2        
			else
	//*   8   16:goto            21
				i1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore_2        
			int j1 = i1;
	//   11   21:iload_2         
	//   12   22:istore_3        
			if(i1 == 0)
	//*  13   23:iload_2         
	//*  14   24:ifne            29
				j1 = 0;
	//   15   27:iconst_0        
	//   16   28:istore_3        
			V = j1 | V;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:aload_0         
	//   20   32:getfield        #567 <Field int V>
	//   21   35:ior             
	//   22   36:putfield        #567 <Field int V>
			return true;
	//   23   39:iconst_1        
	//   24   40:ireturn         
		} else
		{
			return false;
	//   25   41:iconst_0        
	//   26   42:ireturn         
		}
	}

	public void addFocusables(ArrayList arraylist, int i1, int j1)
	{
		if(m == null || !m.a(this, arraylist, i1, j1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #528 <Field RecyclerView$h m>
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:iload_2         
	//*   8   14:iload_3         
	//*   9   15:invokevirtual   #1417 <Method boolean android.support.v7.widget.RecyclerView$h.a(RecyclerView, ArrayList, int, int)>
	//*  10   18:ifne            28
			super.addFocusables(arraylist, i1, j1);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #1419 <Method void ViewGroup.addFocusables(ArrayList, int, int)>
	//   16   28:return          
	}

	public u b(View view)
	{
		ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #673 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
		if(viewparent != null && viewparent != this)
	//*   3    5:aload_2         
	//*   4    6:ifnull          62
	//*   5    9:aload_2         
	//*   6   10:aload_0         
	//*   7   11:if_acmpeq       62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #816 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #817 <Method void StringBuilder()>
	//   11   21:astore_2        
			stringbuilder.append("View ");
	//   12   22:aload_2         
	//   13   23:ldc2            #1423 <String "View ">
	//   14   26:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(((Object) (view)));
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   19   35:pop             
			stringbuilder.append(" is not a direct child of ");
	//   20   36:aload_2         
	//   21   37:ldc2            #1425 <String " is not a direct child of ">
	//   22   40:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (this)));
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   27   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   50:new             #1126 <Class IllegalArgumentException>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #1127 <Method void IllegalArgumentException(String)>
	//   33   61:athrow          
		} else
		{
			return e(view);
	//   34   62:aload_1         
	//   35   63:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   36   66:areturn         
		}
	}

	void b()
	{
		e = new android.support.v7.widget.e(new e.a() {

			public u a(int i1)
			{
				u u1 = a.a(i1, true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iconst_1        
			//    4    6:invokevirtual   #24  <Method RecyclerView$u android.support.v7.widget.RecyclerView.a(int, boolean)>
			//    5    9:astore_2        
				if(u1 == null)
			//*   6   10:aload_2         
			//*   7   11:ifnonnull       16
					return null;
			//    8   14:aconst_null     
			//    9   15:areturn         
				if(a.f.c(u1.a))
			//*  10   16:aload_0         
			//*  11   17:getfield        #17  <Field RecyclerView a>
			//*  12   20:getfield        #28  <Field android.support.v7.widget.t RecyclerView.f>
			//*  13   23:aload_2         
			//*  14   24:getfield        #33  <Field View android.support.v7.widget.RecyclerView$u.a>
			//*  15   27:invokevirtual   #39  <Method boolean t.c(View)>
			//*  16   30:ifeq            35
					return null;
			//   17   33:aconst_null     
			//   18   34:areturn         
				else
					return u1;
			//   19   35:aload_2         
			//   20   36:areturn         
			}

			public void a(int i1, int j1)
			{
				a.a(i1, j1, true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:iconst_1        
			//    5    7:invokevirtual   #43  <Method void android.support.v7.widget.RecyclerView.a(int, int, boolean)>
				a.C = true;
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field RecyclerView a>
			//    8   14:iconst_1        
			//    9   15:putfield        #47  <Field boolean RecyclerView.C>
				r r1 = a.B;
			//   10   18:aload_0         
			//   11   19:getfield        #17  <Field RecyclerView a>
			//   12   22:getfield        #51  <Field RecyclerView$r RecyclerView.B>
			//   13   25:astore_3        
				r1.b = r1.b + j1;
			//   14   26:aload_3         
			//   15   27:aload_3         
			//   16   28:getfield        #56  <Field int android.support.v7.widget.RecyclerView$r.b>
			//   17   31:iload_2         
			//   18   32:iadd            
			//   19   33:putfield        #56  <Field int android.support.v7.widget.RecyclerView$r.b>
			//   20   36:return          
			}

			public void a(int i1, int j1, Object obj)
			{
				a.a(i1, j1, obj);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #59  <Method void android.support.v7.widget.RecyclerView.a(int, int, Object)>
				a.D = true;
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field RecyclerView a>
			//    8   14:iconst_1        
			//    9   15:putfield        #62  <Field boolean RecyclerView.D>
			//   10   18:return          
			}

			public void a(e.b b1)
			{
				c(b1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #65  <Method void c(e$b)>
			//    3    5:return          
			}

			public void b(int i1, int j1)
			{
				a.a(i1, j1, false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:iconst_0        
			//    5    7:invokevirtual   #43  <Method void android.support.v7.widget.RecyclerView.a(int, int, boolean)>
				a.C = true;
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field RecyclerView a>
			//    8   14:iconst_1        
			//    9   15:putfield        #47  <Field boolean RecyclerView.C>
			//   10   18:return          
			}

			public void b(e.b b1)
			{
				c(b1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #65  <Method void c(e$b)>
			//    3    5:return          
			}

			public void c(int i1, int j1)
			{
				a.g(i1, j1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #68  <Method void android.support.v7.widget.RecyclerView.g(int, int)>
				a.C = true;
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field RecyclerView a>
			//    7   13:iconst_1        
			//    8   14:putfield        #47  <Field boolean RecyclerView.C>
			//    9   17:return          
			}

			void c(e.b b1)
			{
				int i1 = b1.a;
			//    0    0:aload_1         
			//    1    1:getfield        #72  <Field int android.support.v7.widget.e$b.a>
			//    2    4:istore_2        
				if(i1 != 4)
			//*   3    5:iload_2         
			//*   4    6:iconst_4        
			//*   5    7:icmpeq          111
				{
					if(i1 != 8)
			//*   6   10:iload_2         
			//*   7   11:bipush          8
			//*   8   13:icmpeq          87
					{
						switch(i1)
			//*   9   16:iload_2         
						{
			//*  10   17:tableswitch     1 2: default 40
			//			               1 64
			//			               2 41
						default:
							return;
			//   11   40:return          

						case 2: // '\002'
							a.m.b(a, b1.b, b1.d);
			//   12   41:aload_0         
			//   13   42:getfield        #17  <Field RecyclerView a>
			//   14   45:getfield        #76  <Field RecyclerView$h RecyclerView.m>
			//   15   48:aload_0         
			//   16   49:getfield        #17  <Field RecyclerView a>
			//   17   52:aload_1         
			//   18   53:getfield        #77  <Field int android.support.v7.widget.e$b.b>
			//   19   56:aload_1         
			//   20   57:getfield        #80  <Field int e$b.d>
			//   21   60:invokevirtual   #85  <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView, int, int)>
							return;
			//   22   63:return          

						case 1: // '\001'
							a.m.a(a, b1.b, b1.d);
			//   23   64:aload_0         
			//   24   65:getfield        #17  <Field RecyclerView a>
			//   25   68:getfield        #76  <Field RecyclerView$h RecyclerView.m>
			//   26   71:aload_0         
			//   27   72:getfield        #17  <Field RecyclerView a>
			//   28   75:aload_1         
			//   29   76:getfield        #77  <Field int android.support.v7.widget.e$b.b>
			//   30   79:aload_1         
			//   31   80:getfield        #80  <Field int e$b.d>
			//   32   83:invokevirtual   #87  <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView, int, int)>
							return;
			//   33   86:return          
						}
					} else
					{
						a.m.a(a, b1.b, b1.d, 1);
			//   34   87:aload_0         
			//   35   88:getfield        #17  <Field RecyclerView a>
			//   36   91:getfield        #76  <Field RecyclerView$h RecyclerView.m>
			//   37   94:aload_0         
			//   38   95:getfield        #17  <Field RecyclerView a>
			//   39   98:aload_1         
			//   40   99:getfield        #77  <Field int android.support.v7.widget.e$b.b>
			//   41  102:aload_1         
			//   42  103:getfield        #80  <Field int e$b.d>
			//   43  106:iconst_1        
			//   44  107:invokevirtual   #90  <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView, int, int, int)>
						return;
			//   45  110:return          
					}
				} else
				{
					a.m.a(a, b1.b, b1.d, b1.c);
			//   46  111:aload_0         
			//   47  112:getfield        #17  <Field RecyclerView a>
			//   48  115:getfield        #76  <Field RecyclerView$h RecyclerView.m>
			//   49  118:aload_0         
			//   50  119:getfield        #17  <Field RecyclerView a>
			//   51  122:aload_1         
			//   52  123:getfield        #77  <Field int android.support.v7.widget.e$b.b>
			//   53  126:aload_1         
			//   54  127:getfield        #80  <Field int e$b.d>
			//   55  130:aload_1         
			//   56  131:getfield        #93  <Field Object e$b.c>
			//   57  134:invokevirtual   #96  <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView, int, int, Object)>
					return;
			//   58  137:return          
				}
			}

			public void d(int i1, int j1)
			{
				a.f(i1, j1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RecyclerView a>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #98  <Method void RecyclerView.f(int, int)>
				a.C = true;
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field RecyclerView a>
			//    7   13:iconst_1        
			//    8   14:putfield        #47  <Field boolean RecyclerView.C>
			//    9   17:return          
			}

			final RecyclerView a;

			
			{
				a = RecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #593 <Class e>
	//    2    4:dup             
	//    3    5:new             #18  <Class RecyclerView$6>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #1426 <Method void RecyclerView$6(RecyclerView)>
	//    7   13:invokespecial   #1429 <Method void e(e$a)>
	//    8   16:putfield        #591 <Field e e>
	//    9   19:return          
	}

	void b(int i1)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			m.d(i1);
	//    4    8:aload_0         
	//    5    9:getfield        #528 <Field RecyclerView$h m>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #1225 <Method void RecyclerView$h.d(int)>
			awakenScrollBars();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1116 <Method boolean awakenScrollBars()>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
	}

	public void b(g g1)
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnull          17
			m.a("Cannot remove item decoration during a scroll  or layout");
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:ldc2            #1431 <String "Cannot remove item decoration during a scroll  or layout">
	//    6   14:invokevirtual   #1290 <Method void android.support.v7.widget.RecyclerView$h.a(String)>
		o.remove(((Object) (g1)));
	//    7   17:aload_0         
	//    8   18:getfield        #293 <Field ArrayList o>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #1434 <Method boolean ArrayList.remove(Object)>
	//   11   25:pop             
		if(o.isEmpty())
	//*  12   26:aload_0         
	//*  13   27:getfield        #293 <Field ArrayList o>
	//*  14   30:invokevirtual   #1291 <Method boolean ArrayList.isEmpty()>
	//*  15   33:ifeq            56
		{
			boolean flag;
			if(getOverScrollMode() == 2)
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #409 <Method int getOverScrollMode()>
	//*  18   40:iconst_2        
	//*  19   41:icmpne          49
				flag = true;
	//   20   44:iconst_1        
	//   21   45:istore_2        
			else
	//*  22   46:goto            51
				flag = false;
	//   23   49:iconst_0        
	//   24   50:istore_2        
			setWillNotDraw(flag);
	//   25   51:aload_0         
	//   26   52:iload_2         
	//   27   53:invokevirtual   #412 <Method void setWillNotDraw(boolean)>
		}
		r();
	//   28   56:aload_0         
	//   29   57:invokevirtual   #1300 <Method void r()>
		requestLayout();
	//   30   60:aload_0         
	//   31   61:invokevirtual   #1252 <Method void requestLayout()>
	//   32   64:return          
	}

	public void b(i i1)
	{
		if(aa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1303 <Field List aa>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			aa.remove(((Object) (i1)));
	//    4    8:aload_0         
	//    5    9:getfield        #1303 <Field List aa>
	//    6   12:aload_1         
	//    7   13:invokeinterface #1435 <Method boolean List.remove(Object)>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
	}

	public void b(k k1)
	{
		R.remove(((Object) (k1)));
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field ArrayList R>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1434 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		if(S == k1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #1073 <Field RecyclerView$k S>
	//*   7   13:aload_1         
	//*   8   14:if_acmpne       22
			S = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #1073 <Field RecyclerView$k S>
	//   12   22:return          
	}

	public void b(l l1)
	{
		if(aw != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1310 <Field List aw>
	//*   2    4:ifnull          18
			aw.remove(((Object) (l1)));
	//    3    7:aload_0         
	//    4    8:getfield        #1310 <Field List aw>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1435 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	void b(u u1, e.c c1, e.c c2)
	{
		e(u1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1000 <Method void e(RecyclerView$u)>
		u1.a(false);
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #997 <Method void android.support.v7.widget.RecyclerView$u.a(boolean)>
		if(x.a(u1, c1, c2))
	//*   6   10:aload_0         
	//*   7   11:getfield        #308 <Field RecyclerView$e x>
	//*   8   14:aload_1         
	//*   9   15:aload_2         
	//*  10   16:aload_3         
	//*  11   17:invokevirtual   #1437 <Method boolean android.support.v7.widget.RecyclerView$e.a(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//*  12   20:ifeq            27
			p();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #1012 <Method void p()>
	//   15   27:return          
	}

	void b(boolean flag)
	{
		ab = ab - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #301 <Field int ab>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #301 <Field int ab>
		if(ab < 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #301 <Field int ab>
	//*   8   14:iconst_1        
	//*   9   15:icmpge          35
		{
			ab = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #301 <Field int ab>
			if(flag)
	//*  13   23:iload_1         
	//*  14   24:ifeq            35
			{
				G();
	//   15   27:aload_0         
	//   16   28:invokespecial   #1438 <Method void G()>
				y();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #1440 <Method void y()>
			}
		}
	//   19   35:return          
	}

	public boolean b(int i1, int j1)
	{
		int k1;
		boolean flag;
		boolean flag2;
		boolean flag3;
label0:
		{
			h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore          11
			flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
			if(h1 == null)
	//*   5    9:aload           11
	//*   6   11:ifnonnull       26
			{
				Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	//    7   14:ldc2            #887 <String "RecyclerView">
	//    8   17:ldc2            #1442 <String "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.">
	//    9   20:invokestatic    #892 <Method int Log.e(String, String)>
	//   10   23:pop             
				return false;
	//   11   24:iconst_0        
	//   12   25:ireturn         
			}
			if(u)
	//*  13   26:aload_0         
	//*  14   27:getfield        #1219 <Field boolean u>
	//*  15   30:ifeq            35
				return false;
	//   16   33:iconst_0        
	//   17   34:ireturn         
			flag2 = m.d();
	//   18   35:aload_0         
	//   19   36:getfield        #528 <Field RecyclerView$h m>
	//   20   39:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//   21   42:istore          9
			flag3 = m.e();
	//   22   44:aload_0         
	//   23   45:getfield        #528 <Field RecyclerView$h m>
	//   24   48:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//   25   51:istore          10
			if(flag2)
	//*  26   53:iload           9
	//*  27   55:ifeq            72
			{
				k1 = i1;
	//   28   58:iload_1         
	//   29   59:istore          5
				if(Math.abs(i1) >= aq)
					break label0;
	//   30   61:iload_1         
	//   31   62:invokestatic    #1445 <Method int Math.abs(int)>
	//   32   65:aload_0         
	//   33   66:getfield        #401 <Field int aq>
	//   34   69:icmpge          75
			}
			k1 = 0;
	//   35   72:iconst_0        
	//   36   73:istore          5
		}
		int l1;
label1:
		{
			if(flag3)
	//*  37   75:iload           10
	//*  38   77:ifeq            94
			{
				l1 = j1;
	//   39   80:iload_2         
	//   40   81:istore          6
				if(Math.abs(j1) >= aq)
					break label1;
	//   41   83:iload_2         
	//   42   84:invokestatic    #1445 <Method int Math.abs(int)>
	//   43   87:aload_0         
	//   44   88:getfield        #401 <Field int aq>
	//   45   91:icmpge          97
			}
			l1 = 0;
	//   46   94:iconst_0        
	//   47   95:istore          6
		}
		if(k1 == 0 && l1 == 0)
	//*  48   97:iload           5
	//*  49   99:ifne            109
	//*  50  102:iload           6
	//*  51  104:ifne            109
			return false;
	//   52  107:iconst_0        
	//   53  108:ireturn         
		float f1 = k1;
	//   54  109:iload           5
	//   55  111:i2f             
	//   56  112:fstore_3        
		float f2 = l1;
	//   57  113:iload           6
	//   58  115:i2f             
	//   59  116:fstore          4
		if(!dispatchNestedPreFling(f1, f2))
	//*  60  118:aload_0         
	//*  61  119:fload_3         
	//*  62  120:fload           4
	//*  63  122:invokevirtual   #1449 <Method boolean dispatchNestedPreFling(float, float)>
	//*  64  125:ifne            263
		{
			boolean flag1;
			if(!flag2 && !flag3)
	//*  65  128:iload           9
	//*  66  130:ifne            147
	//*  67  133:iload           10
	//*  68  135:ifeq            141
	//*  69  138:goto            147
				flag1 = false;
	//   70  141:iconst_0        
	//   71  142:istore          8
			else
	//*  72  144:goto            150
				flag1 = true;
	//   73  147:iconst_1        
	//   74  148:istore          8
			dispatchNestedFling(f1, f2, flag1);
	//   75  150:aload_0         
	//   76  151:fload_3         
	//   77  152:fload           4
	//   78  154:iload           8
	//   79  156:invokevirtual   #1453 <Method boolean dispatchNestedFling(float, float, boolean)>
	//   80  159:pop             
			if(ap != null && ap.a(k1, l1))
	//*  81  160:aload_0         
	//*  82  161:getfield        #1455 <Field RecyclerView$j ap>
	//*  83  164:ifnull          183
	//*  84  167:aload_0         
	//*  85  168:getfield        #1455 <Field RecyclerView$j ap>
	//*  86  171:iload           5
	//*  87  173:iload           6
	//*  88  175:invokevirtual   #1457 <Method boolean android.support.v7.widget.RecyclerView$j.a(int, int)>
	//*  89  178:ifeq            183
				return true;
	//   90  181:iconst_1        
	//   91  182:ireturn         
			if(flag1)
	//*  92  183:iload           8
	//*  93  185:ifeq            263
			{
				i1 = ((int) (flag));
	//   94  188:iload           7
	//   95  190:istore_1        
				if(flag2)
	//*  96  191:iload           9
	//*  97  193:ifeq            198
					i1 = 1;
	//   98  196:iconst_1        
	//   99  197:istore_1        
				j1 = i1;
	//  100  198:iload_1         
	//  101  199:istore_2        
				if(flag3)
	//* 102  200:iload           10
	//* 103  202:ifeq            209
					j1 = i1 | 2;
	//  104  205:iload_1         
	//  105  206:iconst_2        
	//  106  207:ior             
	//  107  208:istore_2        
				j(j1, 1);
	//  108  209:aload_0         
	//  109  210:iload_2         
	//  110  211:iconst_1        
	//  111  212:invokevirtual   #1459 <Method boolean j(int, int)>
	//  112  215:pop             
				i1 = Math.max(-ar, Math.min(k1, ar));
	//  113  216:aload_0         
	//  114  217:getfield        #406 <Field int ar>
	//  115  220:ineg            
	//  116  221:iload           5
	//  117  223:aload_0         
	//  118  224:getfield        #406 <Field int ar>
	//  119  227:invokestatic    #661 <Method int Math.min(int, int)>
	//  120  230:invokestatic    #1462 <Method int Math.max(int, int)>
	//  121  233:istore_1        
				j1 = Math.max(-ar, Math.min(l1, ar));
	//  122  234:aload_0         
	//  123  235:getfield        #406 <Field int ar>
	//  124  238:ineg            
	//  125  239:iload           6
	//  126  241:aload_0         
	//  127  242:getfield        #406 <Field int ar>
	//  128  245:invokestatic    #661 <Method int Math.min(int, int)>
	//  129  248:invokestatic    #1462 <Method int Math.max(int, int)>
	//  130  251:istore_2        
				y.a(i1, j1);
	//  131  252:aload_0         
	//  132  253:getfield        #322 <Field RecyclerView$t y>
	//  133  256:iload_1         
	//  134  257:iload_2         
	//  135  258:invokevirtual   #1463 <Method void android.support.v7.widget.RecyclerView$t.a(int, int)>
				return true;
	//  136  261:iconst_1        
	//  137  262:ireturn         
			}
		}
		return false;
	//  138  263:iconst_0        
	//  139  264:ireturn         
	}

	boolean b(u u1)
	{
		return x == null || x.a(u1, u1.u());
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field RecyclerView$e x>
	//    2    4:ifnull          27
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field RecyclerView$e x>
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #723 <Method List RecyclerView$u.u()>
	//    8   16:invokevirtual   #1466 <Method boolean android.support.v7.widget.RecyclerView$e.a(RecyclerView$u, List)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public u c(int i1)
	{
		boolean flag = w;
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field boolean w>
	//    2    4:istore          4
		u u1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          5
		if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		int k1 = f.c();
	//    9   16:aload_0         
	//   10   17:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   20:invokevirtual   #1199 <Method int t.c()>
	//   12   23:istore_3        
		for(int j1 = 0; j1 < k1;)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:iload_3         
	//*  17   28:icmpge          115
		{
			u u3 = e(f.d(j1));
	//   18   31:aload_0         
	//   19   32:getfield        #512 <Field android.support.v7.widget.t f>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #1201 <Method View t.d(int)>
	//   22   39:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   23   42:astore          7
			u u2 = u1;
	//   24   44:aload           5
	//   25   46:astore          6
			if(u3 != null)
	//*  26   48:aload           7
	//*  27   50:ifnull          104
			{
				u2 = u1;
	//   28   53:aload           5
	//   29   55:astore          6
				if(!u3.q())
	//*  30   57:aload           7
	//*  31   59:invokevirtual   #634 <Method boolean RecyclerView$u.q()>
	//*  32   62:ifne            104
				{
					u2 = u1;
	//   33   65:aload           5
	//   34   67:astore          6
					if(d(u3) == i1)
	//*  35   69:aload_0         
	//*  36   70:aload           7
	//*  37   72:invokevirtual   #1468 <Method int d(RecyclerView$u)>
	//*  38   75:iload_1         
	//*  39   76:icmpne          104
						if(f.c(u3.a))
	//*  40   79:aload_0         
	//*  41   80:getfield        #512 <Field android.support.v7.widget.t f>
	//*  42   83:aload           7
	//*  43   85:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  44   88:invokevirtual   #680 <Method boolean t.c(View)>
	//*  45   91:ifeq            101
							u2 = u3;
	//   46   94:aload           7
	//   47   96:astore          6
						else
	//*  48   98:goto            104
							return u3;
	//   49  101:aload           7
	//   50  103:areturn         
				}
			}
			j1++;
	//   51  104:iload_2         
	//   52  105:iconst_1        
	//   53  106:iadd            
	//   54  107:istore_2        
			u1 = u2;
	//   55  108:aload           6
	//   56  110:astore          5
		}

	//*  57  112:goto            26
		return u1;
	//   58  115:aload           5
	//   59  117:areturn         
	}

	public View c(View view)
	{
		ViewParent viewparent;
		do
		{
			viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #673 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
			if(viewparent == null || viewparent == this || !(viewparent instanceof View))
				break;
	//    3    5:aload_2         
	//    4    6:ifnull          29
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:if_acmpeq       29
	//    8   14:aload_2         
	//    9   15:instanceof      #653 <Class View>
	//   10   18:ifeq            29
			view = (View)viewparent;
	//   11   21:aload_2         
	//   12   22:checkcast       #653 <Class View>
	//   13   25:astore_1        
		} while(true);
	//   14   26:goto            0
		if(viewparent == this)
	//*  15   29:aload_2         
	//*  16   30:aload_0         
	//*  17   31:if_acmpne       36
			return view;
	//   18   34:aload_1         
	//   19   35:areturn         
		else
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	void c()
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #308 <Field RecyclerView$e x>
	//*   2    4:ifnull          14
			x.d();
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field RecyclerView$e x>
	//    5   11:invokevirtual   #1470 <Method void RecyclerView$e.d()>
		if(m != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #528 <Field RecyclerView$h m>
	//*   8   18:ifnull          43
		{
			m.c(d);
	//    9   21:aload_0         
	//   10   22:getfield        #528 <Field RecyclerView$h m>
	//   11   25:aload_0         
	//   12   26:getfield        #268 <Field RecyclerView$n d>
	//   13   29:invokevirtual   #1472 <Method void RecyclerView$h.c(RecyclerView$n)>
			m.b(d);
	//   14   32:aload_0         
	//   15   33:getfield        #528 <Field RecyclerView$h m>
	//   16   36:aload_0         
	//   17   37:getfield        #268 <Field RecyclerView$n d>
	//   18   40:invokevirtual   #788 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView$n)>
		}
		d.a();
	//   19   43:aload_0         
	//   20   44:getfield        #268 <Field RecyclerView$n d>
	//   21   47:invokevirtual   #1473 <Method void android.support.v7.widget.RecyclerView$n.a()>
	//   22   50:return          
	}

	void c(int i1, int j1)
	{
		boolean flag1;
		if(ad != null && !ad.isFinished() && i1 > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #532 <Field EdgeEffect ad>
	//*   2    4:ifnull          40
	//*   3    7:aload_0         
	//*   4    8:getfield        #532 <Field EdgeEffect ad>
	//*   5   11:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*   6   14:ifne            40
	//*   7   17:iload_1         
	//*   8   18:ifle            40
		{
			ad.onRelease();
	//    9   21:aload_0         
	//   10   22:getfield        #532 <Field EdgeEffect ad>
	//   11   25:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
			flag1 = ad.isFinished();
	//   12   28:aload_0         
	//   13   29:getfield        #532 <Field EdgeEffect ad>
	//   14   32:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   15   35:istore          4
		} else
	//*  16   37:goto            43
		{
			flag1 = false;
	//   17   40:iconst_0        
	//   18   41:istore          4
		}
		boolean flag = flag1;
	//   19   43:iload           4
	//   20   45:istore_3        
		if(af != null)
	//*  21   46:aload_0         
	//*  22   47:getfield        #544 <Field EdgeEffect af>
	//*  23   50:ifnull          91
		{
			flag = flag1;
	//   24   53:iload           4
	//   25   55:istore_3        
			if(!af.isFinished())
	//*  26   56:aload_0         
	//*  27   57:getfield        #544 <Field EdgeEffect af>
	//*  28   60:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*  29   63:ifne            91
			{
				flag = flag1;
	//   30   66:iload           4
	//   31   68:istore_3        
				if(i1 < 0)
	//*  32   69:iload_1         
	//*  33   70:ifge            91
				{
					af.onRelease();
	//   34   73:aload_0         
	//   35   74:getfield        #544 <Field EdgeEffect af>
	//   36   77:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
					flag = flag1 | af.isFinished();
	//   37   80:iload           4
	//   38   82:aload_0         
	//   39   83:getfield        #544 <Field EdgeEffect af>
	//   40   86:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   41   89:ior             
	//   42   90:istore_3        
				}
			}
		}
		flag1 = flag;
	//   43   91:iload_3         
	//   44   92:istore          4
		if(ae != null)
	//*  45   94:aload_0         
	//*  46   95:getfield        #542 <Field EdgeEffect ae>
	//*  47   98:ifnull          139
		{
			flag1 = flag;
	//   48  101:iload_3         
	//   49  102:istore          4
			if(!ae.isFinished())
	//*  50  104:aload_0         
	//*  51  105:getfield        #542 <Field EdgeEffect ae>
	//*  52  108:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*  53  111:ifne            139
			{
				flag1 = flag;
	//   54  114:iload_3         
	//   55  115:istore          4
				if(j1 > 0)
	//*  56  117:iload_2         
	//*  57  118:ifle            139
				{
					ae.onRelease();
	//   58  121:aload_0         
	//   59  122:getfield        #542 <Field EdgeEffect ae>
	//   60  125:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
					flag1 = flag | ae.isFinished();
	//   61  128:iload_3         
	//   62  129:aload_0         
	//   63  130:getfield        #542 <Field EdgeEffect ae>
	//   64  133:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   65  136:ior             
	//   66  137:istore          4
				}
			}
		}
		flag = flag1;
	//   67  139:iload           4
	//   68  141:istore_3        
		if(ag != null)
	//*  69  142:aload_0         
	//*  70  143:getfield        #546 <Field EdgeEffect ag>
	//*  71  146:ifnull          187
		{
			flag = flag1;
	//   72  149:iload           4
	//   73  151:istore_3        
			if(!ag.isFinished())
	//*  74  152:aload_0         
	//*  75  153:getfield        #546 <Field EdgeEffect ag>
	//*  76  156:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*  77  159:ifne            187
			{
				flag = flag1;
	//   78  162:iload           4
	//   79  164:istore_3        
				if(j1 < 0)
	//*  80  165:iload_2         
	//*  81  166:ifge            187
				{
					ag.onRelease();
	//   82  169:aload_0         
	//   83  170:getfield        #546 <Field EdgeEffect ag>
	//   84  173:invokevirtual   #537 <Method void EdgeEffect.onRelease()>
					flag = flag1 | ag.isFinished();
	//   85  176:iload           4
	//   86  178:aload_0         
	//   87  179:getfield        #546 <Field EdgeEffect ag>
	//   88  182:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//   89  185:ior             
	//   90  186:istore_3        
				}
			}
		}
		if(flag)
	//*  91  187:iload_3         
	//*  92  188:ifeq            195
			android.support.v4.view.s.c(((View) (this)));
	//   93  191:aload_0         
	//   94  192:invokestatic    #549 <Method void s.c(View)>
	//   95  195:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && m.a((LayoutParams)layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class RecyclerView$LayoutParams>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:aload_1         
	//    6   12:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    7   15:invokevirtual   #1478 <Method boolean android.support.v7.widget.RecyclerView$h.a(RecyclerView$LayoutParams)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int computeHorizontalScrollExtent()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.d())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  12   20:ifeq            35
			i1 = m.e(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1482 <Method int RecyclerView$h.e(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.d())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  12   20:ifeq            35
			i1 = m.c(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1485 <Method int RecyclerView$h.c(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.d())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  12   20:ifeq            35
			i1 = m.g(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1488 <Method int android.support.v7.widget.RecyclerView$h.g(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public int computeVerticalScrollExtent()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.e())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  12   20:ifeq            35
			i1 = m.f(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1491 <Method int RecyclerView$h.f(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.e())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  12   20:ifeq            35
			i1 = m.d(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1494 <Method int RecyclerView$h.d(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		h h1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:astore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(h1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(m.e())
	//*   9   13:aload_0         
	//*  10   14:getfield        #528 <Field RecyclerView$h m>
	//*  11   17:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  12   20:ifeq            35
			i1 = m.h(B);
	//   13   23:aload_0         
	//   14   24:getfield        #528 <Field RecyclerView$h m>
	//   15   27:aload_0         
	//   16   28:getfield        #330 <Field RecyclerView$r B>
	//   17   31:invokevirtual   #1497 <Method int android.support.v7.widget.RecyclerView$h.h(RecyclerView$r)>
	//   18   34:istore_1        
		return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	int d(u u1)
	{
		if(!u1.a(524) && u1.p())
	//*   0    0:aload_1         
	//*   1    1:sipush          524
	//*   2    4:invokevirtual   #748 <Method boolean android.support.v7.widget.RecyclerView$u.a(int)>
	//*   3    7:ifne            32
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #1499 <Method boolean RecyclerView$u.p()>
	//*   6   14:ifne            20
	//*   7   17:goto            32
			return e.c(u1.c);
	//    8   20:aload_0         
	//    9   21:getfield        #591 <Field e e>
	//   10   24:aload_1         
	//   11   25:getfield        #1196 <Field int RecyclerView$u.c>
	//   12   28:invokevirtual   #1501 <Method int e.c(int)>
	//   13   31:ireturn         
		else
			return -1;
	//   14   32:iconst_m1       
	//   15   33:ireturn         
	}

	public u d(View view)
	{
		view = c(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1503 <Method View c(View)>
	//    3    5:astore_1        
		if(view == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return b(view);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #1163 <Method RecyclerView$u b(View)>
	//   11   17:areturn         
	}

	void d()
	{
label0:
		{
label1:
			{
				if(!s || w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #604 <Field boolean s>
	//*   2    4:ifeq            136
	//*   3    7:aload_0         
	//*   4    8:getfield        #299 <Field boolean w>
	//*   5   11:ifeq            17
					break label0;
	//    6   14:goto            136
				if(!e.d())
	//*   7   17:aload_0         
	//*   8   18:getfield        #591 <Field e e>
	//*   9   21:invokevirtual   #1504 <Method boolean e.d()>
	//*  10   24:ifne            28
					return;
	//   11   27:return          
				if(e.a(4) && !e.a(11))
	//*  12   28:aload_0         
	//*  13   29:getfield        #591 <Field e e>
	//*  14   32:iconst_4        
	//*  15   33:invokevirtual   #1505 <Method boolean android.support.v7.widget.e.a(int)>
	//*  16   36:ifeq            112
	//*  17   39:aload_0         
	//*  18   40:getfield        #591 <Field e e>
	//*  19   43:bipush          11
	//*  20   45:invokevirtual   #1505 <Method boolean android.support.v7.widget.e.a(int)>
	//*  21   48:ifne            112
				{
					android.support.v4.os.b.a("RV PartialInvalidate");
	//   22   51:ldc2            #1507 <String "RV PartialInvalidate">
	//   23   54:invokestatic    #1370 <Method void b.a(String)>
					e();
	//   24   57:aload_0         
	//   25   58:invokevirtual   #699 <Method void e()>
					l();
	//   26   61:aload_0         
	//   27   62:invokevirtual   #702 <Method void l()>
					e.b();
	//   28   65:aload_0         
	//   29   66:getfield        #591 <Field e e>
	//   30   69:invokevirtual   #600 <Method void android.support.v7.widget.e.b()>
					if(!t)
	//*  31   72:aload_0         
	//*  32   73:getfield        #1355 <Field boolean t>
	//*  33   76:ifne            100
						if(B())
	//*  34   79:aload_0         
	//*  35   80:invokespecial   #1509 <Method boolean B()>
	//*  36   83:ifeq            93
							q();
	//   37   86:aload_0         
	//   38   87:invokevirtual   #1357 <Method void q()>
						else
	//*  39   90:goto            100
							e.c();
	//   40   93:aload_0         
	//   41   94:getfield        #591 <Field e e>
	//   42   97:invokevirtual   #1510 <Method void e.c()>
					a(true);
	//   43  100:aload_0         
	//   44  101:iconst_1        
	//   45  102:invokevirtual   #757 <Method void a(boolean)>
					m();
	//   46  105:aload_0         
	//   47  106:invokevirtual   #755 <Method void m()>
				} else
	//*  48  109:goto            132
				{
					if(!e.d())
						break label1;
	//   49  112:aload_0         
	//   50  113:getfield        #591 <Field e e>
	//   51  116:invokevirtual   #1504 <Method boolean e.d()>
	//   52  119:ifeq            135
					android.support.v4.os.b.a("RV FullInvalidate");
	//   53  122:ldc2            #1512 <String "RV FullInvalidate">
	//   54  125:invokestatic    #1370 <Method void b.a(String)>
					q();
	//   55  128:aload_0         
	//   56  129:invokevirtual   #1357 <Method void q()>
				}
				android.support.v4.os.b.a();
	//   57  132:invokestatic    #1376 <Method void b.a()>
			}
			return;
	//   58  135:return          
		}
		android.support.v4.os.b.a("RV FullInvalidate");
	//   59  136:ldc2            #1512 <String "RV FullInvalidate">
	//   60  139:invokestatic    #1370 <Method void b.a(String)>
		q();
	//   61  142:aload_0         
	//   62  143:invokevirtual   #1357 <Method void q()>
		android.support.v4.os.b.a();
	//   63  146:invokestatic    #1376 <Method void b.a()>
	//   64  149:return          
	}

	public void d(int i1)
	{
		int k1 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          34
			f.b(j1).offsetTopAndBottom(i1);
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #1515 <Method void View.offsetTopAndBottom(int)>

	//   15   27:iload_2         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:istore_2        
	//*  19   31:goto            10
	//   20   34:return          
	}

	void d(int i1, int j1)
	{
		if(i1 < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            20
		{
			g();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #849 <Method void g()>
			ad.onAbsorb(-i1);
	//    4    8:aload_0         
	//    5    9:getfield        #532 <Field EdgeEffect ad>
	//    6   12:iload_1         
	//    7   13:ineg            
	//    8   14:invokevirtual   #1518 <Method void EdgeEffect.onAbsorb(int)>
		} else
	//*   9   17:goto            36
		if(i1 > 0)
	//*  10   20:iload_1         
	//*  11   21:ifle            36
		{
			h();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #862 <Method void h()>
			af.onAbsorb(i1);
	//   14   28:aload_0         
	//   15   29:getfield        #544 <Field EdgeEffect af>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #1518 <Method void EdgeEffect.onAbsorb(int)>
		}
		if(j1 < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            56
		{
			i();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #864 <Method void i()>
			ae.onAbsorb(-j1);
	//   22   44:aload_0         
	//   23   45:getfield        #542 <Field EdgeEffect ae>
	//   24   48:iload_2         
	//   25   49:ineg            
	//   26   50:invokevirtual   #1518 <Method void EdgeEffect.onAbsorb(int)>
		} else
	//*  27   53:goto            72
		if(j1 > 0)
	//*  28   56:iload_2         
	//*  29   57:ifle            72
		{
			j();
	//   30   60:aload_0         
	//   31   61:invokevirtual   #866 <Method void j()>
			ag.onAbsorb(j1);
	//   32   64:aload_0         
	//   33   65:getfield        #546 <Field EdgeEffect ag>
	//   34   68:iload_2         
	//   35   69:invokevirtual   #1518 <Method void EdgeEffect.onAbsorb(int)>
		}
		if(i1 != 0 || j1 != 0)
	//*  36   72:iload_1         
	//*  37   73:ifne            80
	//*  38   76:iload_2         
	//*  39   77:ifeq            84
			android.support.v4.view.s.c(((View) (this)));
	//   40   80:aload_0         
	//   41   81:invokestatic    #549 <Method void s.c(View)>
	//   42   84:return          
	}

	public boolean dispatchNestedFling(float f1, float f2, boolean flag)
	{
		return getScrollingChildHelper().a(f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #1520 <Method boolean k.a(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f1, float f2)
	{
		return getScrollingChildHelper().a(f1, f2);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #1522 <Method boolean k.a(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
	{
		return getScrollingChildHelper().a(i1, j1, ai1, ai2);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #1526 <Method boolean k.a(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
	{
		return getScrollingChildHelper().a(i1, j1, k1, l1, ai1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #1530 <Method boolean k.a(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		dispatchThawSelfOnly(sparsearray);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1535 <Method void dispatchThawSelfOnly(SparseArray)>
	//    3    5:return          
	}

	protected void dispatchSaveInstanceState(SparseArray sparsearray)
	{
		dispatchFreezeSelfOnly(sparsearray);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1540 <Method void dispatchFreezeSelfOnly(SparseArray)>
	//    3    5:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1544 <Method void ViewGroup.draw(Canvas)>
		int l1 = o.size();
	//    3    5:aload_0         
	//    4    6:getfield        #293 <Field ArrayList o>
	//    5    9:invokevirtual   #1076 <Method int ArrayList.size()>
	//    6   12:istore          4
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		for(int i1 = 0; i1 < l1; i1++)
	//*   9   17:iconst_0        
	//*  10   18:istore_3        
	//*  11   19:iload_3         
	//*  12   20:iload           4
	//*  13   22:icmpge          52
			((g)o.get(i1)).b(canvas, this, B);
	//   14   25:aload_0         
	//   15   26:getfield        #293 <Field ArrayList o>
	//   16   29:iload_3         
	//   17   30:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   18   33:checkcast       #52  <Class RecyclerView$g>
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #330 <Field RecyclerView$r B>
	//   23   42:invokevirtual   #1547 <Method void android.support.v7.widget.RecyclerView$g.b(Canvas, RecyclerView, RecyclerView$r)>

	//   24   45:iload_3         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_3        
	//*  28   49:goto            19
		if(ad != null && !ad.isFinished())
	//*  29   52:aload_0         
	//*  30   53:getfield        #532 <Field EdgeEffect ad>
	//*  31   56:ifnull          148
	//*  32   59:aload_0         
	//*  33   60:getfield        #532 <Field EdgeEffect ad>
	//*  34   63:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*  35   66:ifne            148
		{
			int i2 = canvas.save();
	//   36   69:aload_1         
	//   37   70:invokevirtual   #1552 <Method int Canvas.save()>
	//   38   73:istore          6
			int j1;
			if(h)
	//*  39   75:aload_0         
	//*  40   76:getfield        #367 <Field boolean h>
	//*  41   79:ifeq            90
				j1 = getPaddingBottom();
	//   42   82:aload_0         
	//   43   83:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   44   86:istore_3        
			else
	//*  45   87:goto            92
				j1 = 0;
	//   46   90:iconst_0        
	//   47   91:istore_3        
			canvas.rotate(270F);
	//   48   92:aload_1         
	//   49   93:ldc2            #1556 <Float 270F>
	//   50   96:invokevirtual   #1560 <Method void Canvas.rotate(float)>
			canvas.translate(-getHeight() + j1, 0.0F);
	//   51   99:aload_1         
	//   52  100:aload_0         
	//   53  101:invokevirtual   #855 <Method int getHeight()>
	//   54  104:ineg            
	//   55  105:iload_3         
	//   56  106:iadd            
	//   57  107:i2f             
	//   58  108:fconst_0        
	//   59  109:invokevirtual   #1563 <Method void Canvas.translate(float, float)>
			if(ad != null && ad.draw(canvas))
	//*  60  112:aload_0         
	//*  61  113:getfield        #532 <Field EdgeEffect ad>
	//*  62  116:ifnull          136
	//*  63  119:aload_0         
	//*  64  120:getfield        #532 <Field EdgeEffect ad>
	//*  65  123:aload_1         
	//*  66  124:invokevirtual   #1566 <Method boolean EdgeEffect.draw(Canvas)>
	//*  67  127:ifeq            136
				l1 = 1;
	//   68  130:iconst_1        
	//   69  131:istore          4
			else
	//*  70  133:goto            139
				l1 = 0;
	//   71  136:iconst_0        
	//   72  137:istore          4
			canvas.restoreToCount(i2);
	//   73  139:aload_1         
	//   74  140:iload           6
	//   75  142:invokevirtual   #1569 <Method void Canvas.restoreToCount(int)>
		} else
	//*  76  145:goto            151
		{
			l1 = 0;
	//   77  148:iconst_0        
	//   78  149:istore          4
		}
		int k1 = l1;
	//   79  151:iload           4
	//   80  153:istore_3        
		if(ae != null)
	//*  81  154:aload_0         
	//*  82  155:getfield        #542 <Field EdgeEffect ae>
	//*  83  158:ifnull          237
		{
			k1 = l1;
	//   84  161:iload           4
	//   85  163:istore_3        
			if(!ae.isFinished())
	//*  86  164:aload_0         
	//*  87  165:getfield        #542 <Field EdgeEffect ae>
	//*  88  168:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//*  89  171:ifne            237
			{
				int j2 = canvas.save();
	//   90  174:aload_1         
	//   91  175:invokevirtual   #1552 <Method int Canvas.save()>
	//   92  178:istore          6
				if(h)
	//*  93  180:aload_0         
	//*  94  181:getfield        #367 <Field boolean h>
	//*  95  184:ifeq            201
					canvas.translate(getPaddingLeft(), getPaddingTop());
	//   96  187:aload_1         
	//   97  188:aload_0         
	//   98  189:invokevirtual   #1572 <Method int getPaddingLeft()>
	//   99  192:i2f             
	//  100  193:aload_0         
	//  101  194:invokevirtual   #1575 <Method int getPaddingTop()>
	//  102  197:i2f             
	//  103  198:invokevirtual   #1563 <Method void Canvas.translate(float, float)>
				if(ae != null && ae.draw(canvas))
	//* 104  201:aload_0         
	//* 105  202:getfield        #542 <Field EdgeEffect ae>
	//* 106  205:ifnull          224
	//* 107  208:aload_0         
	//* 108  209:getfield        #542 <Field EdgeEffect ae>
	//* 109  212:aload_1         
	//* 110  213:invokevirtual   #1566 <Method boolean EdgeEffect.draw(Canvas)>
	//* 111  216:ifeq            224
					k1 = 1;
	//  112  219:iconst_1        
	//  113  220:istore_3        
				else
	//* 114  221:goto            226
					k1 = 0;
	//  115  224:iconst_0        
	//  116  225:istore_3        
				k1 = ((int) (l1 | k1));
	//  117  226:iload           4
	//  118  228:iload_3         
	//  119  229:ior             
	//  120  230:istore_3        
				canvas.restoreToCount(j2);
	//  121  231:aload_1         
	//  122  232:iload           6
	//  123  234:invokevirtual   #1569 <Method void Canvas.restoreToCount(int)>
			}
		}
		l1 = k1;
	//  124  237:iload_3         
	//  125  238:istore          4
		if(af != null)
	//* 126  240:aload_0         
	//* 127  241:getfield        #544 <Field EdgeEffect af>
	//* 128  244:ifnull          349
		{
			l1 = k1;
	//  129  247:iload_3         
	//  130  248:istore          4
			if(!af.isFinished())
	//* 131  250:aload_0         
	//* 132  251:getfield        #544 <Field EdgeEffect af>
	//* 133  254:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//* 134  257:ifne            349
			{
				int k2 = canvas.save();
	//  135  260:aload_1         
	//  136  261:invokevirtual   #1552 <Method int Canvas.save()>
	//  137  264:istore          6
				int i3 = getWidth();
	//  138  266:aload_0         
	//  139  267:invokevirtual   #852 <Method int getWidth()>
	//  140  270:istore          7
				if(h)
	//* 141  272:aload_0         
	//* 142  273:getfield        #367 <Field boolean h>
	//* 143  276:ifeq            288
					l1 = getPaddingTop();
	//  144  279:aload_0         
	//  145  280:invokevirtual   #1575 <Method int getPaddingTop()>
	//  146  283:istore          4
				else
	//* 147  285:goto            291
					l1 = 0;
	//  148  288:iconst_0        
	//  149  289:istore          4
				canvas.rotate(90F);
	//  150  291:aload_1         
	//  151  292:ldc2            #1576 <Float 90F>
	//  152  295:invokevirtual   #1560 <Method void Canvas.rotate(float)>
				canvas.translate(-l1, -i3);
	//  153  298:aload_1         
	//  154  299:iload           4
	//  155  301:ineg            
	//  156  302:i2f             
	//  157  303:iload           7
	//  158  305:ineg            
	//  159  306:i2f             
	//  160  307:invokevirtual   #1563 <Method void Canvas.translate(float, float)>
				if(af != null && af.draw(canvas))
	//* 161  310:aload_0         
	//* 162  311:getfield        #544 <Field EdgeEffect af>
	//* 163  314:ifnull          334
	//* 164  317:aload_0         
	//* 165  318:getfield        #544 <Field EdgeEffect af>
	//* 166  321:aload_1         
	//* 167  322:invokevirtual   #1566 <Method boolean EdgeEffect.draw(Canvas)>
	//* 168  325:ifeq            334
					l1 = 1;
	//  169  328:iconst_1        
	//  170  329:istore          4
				else
	//* 171  331:goto            337
					l1 = 0;
	//  172  334:iconst_0        
	//  173  335:istore          4
				l1 = k1 | l1;
	//  174  337:iload_3         
	//  175  338:iload           4
	//  176  340:ior             
	//  177  341:istore          4
				canvas.restoreToCount(k2);
	//  178  343:aload_1         
	//  179  344:iload           6
	//  180  346:invokevirtual   #1569 <Method void Canvas.restoreToCount(int)>
			}
		}
		if(ag != null && !ag.isFinished())
	//* 181  349:aload_0         
	//* 182  350:getfield        #546 <Field EdgeEffect ag>
	//* 183  353:ifnull          475
	//* 184  356:aload_0         
	//* 185  357:getfield        #546 <Field EdgeEffect ag>
	//* 186  360:invokevirtual   #540 <Method boolean EdgeEffect.isFinished()>
	//* 187  363:ifne            475
		{
			int l2 = canvas.save();
	//  188  366:aload_1         
	//  189  367:invokevirtual   #1552 <Method int Canvas.save()>
	//  190  370:istore          6
			canvas.rotate(180F);
	//  191  372:aload_1         
	//  192  373:ldc2            #1577 <Float 180F>
	//  193  376:invokevirtual   #1560 <Method void Canvas.rotate(float)>
			float f1;
			if(h)
	//* 194  379:aload_0         
	//* 195  380:getfield        #367 <Field boolean h>
	//* 196  383:ifeq            419
			{
				f1 = -getWidth() + getPaddingRight();
	//  197  386:aload_0         
	//  198  387:invokevirtual   #852 <Method int getWidth()>
	//  199  390:ineg            
	//  200  391:aload_0         
	//  201  392:invokevirtual   #1580 <Method int getPaddingRight()>
	//  202  395:iadd            
	//  203  396:i2f             
	//  204  397:fstore_2        
				k1 = -getHeight() + getPaddingBottom();
	//  205  398:aload_0         
	//  206  399:invokevirtual   #855 <Method int getHeight()>
	//  207  402:ineg            
	//  208  403:aload_0         
	//  209  404:invokevirtual   #1555 <Method int getPaddingBottom()>
	//  210  407:iadd            
	//  211  408:istore_3        
			} else
	//* 212  409:aload_1         
	//* 213  410:fload_2         
	//* 214  411:iload_3         
	//* 215  412:i2f             
	//* 216  413:invokevirtual   #1563 <Method void Canvas.translate(float, float)>
	//* 217  416:goto            435
			{
				f1 = -getWidth();
	//  218  419:aload_0         
	//  219  420:invokevirtual   #852 <Method int getWidth()>
	//  220  423:ineg            
	//  221  424:i2f             
	//  222  425:fstore_2        
				k1 = -getHeight();
	//  223  426:aload_0         
	//  224  427:invokevirtual   #855 <Method int getHeight()>
	//  225  430:ineg            
	//  226  431:istore_3        
			}
			canvas.translate(f1, k1);
	//* 227  432:goto            409
			k1 = ((int) (flag));
	//  228  435:iload           5
	//  229  437:istore_3        
			if(ag != null)
	//* 230  438:aload_0         
	//* 231  439:getfield        #546 <Field EdgeEffect ag>
	//* 232  442:ifnull          461
			{
				k1 = ((int) (flag));
	//  233  445:iload           5
	//  234  447:istore_3        
				if(ag.draw(canvas))
	//* 235  448:aload_0         
	//* 236  449:getfield        #546 <Field EdgeEffect ag>
	//* 237  452:aload_1         
	//* 238  453:invokevirtual   #1566 <Method boolean EdgeEffect.draw(Canvas)>
	//* 239  456:ifeq            461
					k1 = 1;
	//  240  459:iconst_1        
	//  241  460:istore_3        
			}
			k1 |= l1;
	//  242  461:iload_3         
	//  243  462:iload           4
	//  244  464:ior             
	//  245  465:istore_3        
			canvas.restoreToCount(l2);
	//  246  466:aload_1         
	//  247  467:iload           6
	//  248  469:invokevirtual   #1569 <Method void Canvas.restoreToCount(int)>
		} else
	//* 249  472:goto            478
		{
			k1 = l1;
	//  250  475:iload           4
	//  251  477:istore_3        
		}
		l1 = k1;
	//  252  478:iload_3         
	//  253  479:istore          4
		if(k1 == 0)
	//* 254  481:iload_3         
	//* 255  482:ifne            524
		{
			l1 = k1;
	//  256  485:iload_3         
	//  257  486:istore          4
			if(x != null)
	//* 258  488:aload_0         
	//* 259  489:getfield        #308 <Field RecyclerView$e x>
	//* 260  492:ifnull          524
			{
				l1 = k1;
	//  261  495:iload_3         
	//  262  496:istore          4
				if(o.size() > 0)
	//* 263  498:aload_0         
	//* 264  499:getfield        #293 <Field ArrayList o>
	//* 265  502:invokevirtual   #1076 <Method int ArrayList.size()>
	//* 266  505:ifle            524
				{
					l1 = k1;
	//  267  508:iload_3         
	//  268  509:istore          4
					if(x.b())
	//* 269  511:aload_0         
	//* 270  512:getfield        #308 <Field RecyclerView$e x>
	//* 271  515:invokevirtual   #1581 <Method boolean android.support.v7.widget.RecyclerView$e.b()>
	//* 272  518:ifeq            524
						l1 = 1;
	//  273  521:iconst_1        
	//  274  522:istore          4
				}
			}
		}
		if(l1 != 0)
	//* 275  524:iload           4
	//* 276  526:ifeq            533
			android.support.v4.view.s.c(((View) (this)));
	//  277  529:aload_0         
	//  278  530:invokestatic    #549 <Method void s.c(View)>
	//  279  533:return          
	}

	public boolean drawChild(Canvas canvas, View view, long l1)
	{
		return super.drawChild(canvas, view, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:invokespecial   #1585 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//    5    7:ireturn         
	}

	void e()
	{
		T = T + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #297 <Field int T>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #297 <Field int T>
		if(T == 1 && !u)
	//*   6   10:aload_0         
	//*   7   11:getfield        #297 <Field int T>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          30
	//*  10   18:aload_0         
	//*  11   19:getfield        #1219 <Field boolean u>
	//*  12   22:ifne            30
			t = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #1355 <Field boolean t>
	//   16   30:return          
	}

	public void e(int i1)
	{
		int k1 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          34
			f.b(j1).offsetLeftAndRight(i1);
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #1588 <Method void View.offsetLeftAndRight(int)>

	//   15   27:iload_2         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:istore_2        
	//*  19   31:goto            10
	//   20   34:return          
	}

	void e(int i1, int j1)
	{
		setMeasuredDimension(android.support.v7.widget.h.a(i1, getPaddingLeft() + getPaddingRight(), android.support.v4.view.s.i(((View) (this)))), android.support.v7.widget.h.a(j1, getPaddingTop() + getPaddingBottom(), android.support.v4.view.s.j(((View) (this)))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #1572 <Method int getPaddingLeft()>
	//    4    6:aload_0         
	//    5    7:invokevirtual   #1580 <Method int getPaddingRight()>
	//    6   10:iadd            
	//    7   11:aload_0         
	//    8   12:invokestatic    #1590 <Method int s.i(View)>
	//    9   15:invokestatic    #1593 <Method int android.support.v7.widget.RecyclerView$h.a(int, int, int)>
	//   10   18:iload_2         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #1575 <Method int getPaddingTop()>
	//   13   23:aload_0         
	//   14   24:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   15   27:iadd            
	//   16   28:aload_0         
	//   17   29:invokestatic    #1595 <Method int s.j(View)>
	//   18   32:invokestatic    #1593 <Method int android.support.v7.widget.RecyclerView$h.a(int, int, int)>
	//   19   35:invokevirtual   #1020 <Method void setMeasuredDimension(int, int)>
	//   20   38:return          
	}

	public int f(View view)
	{
		view = ((View) (e(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #521 <Method RecyclerView$u e(View)>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((u) (view)).d();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1065 <Method int RecyclerView$u.d()>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	public void f()
	{
		setScrollState(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #565 <Method void setScrollState(int)>
		C();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1597 <Method void C()>
	//    5    9:return          
	}

	public void f(int i1)
	{
	//    0    0:return          
	}

	void f(int i1, int j1)
	{
		int j2 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore          7
		int k1;
		int l1;
		byte byte0;
		if(i1 < j1)
	//*   4    9:iload_1         
	//*   5   10:iload_2         
	//*   6   11:icmpge          25
		{
			k1 = i1;
	//    7   14:iload_1         
	//    8   15:istore_3        
			l1 = j1;
	//    9   16:iload_2         
	//   10   17:istore          4
			byte0 = -1;
	//   11   19:iconst_m1       
	//   12   20:istore          5
		} else
	//*  13   22:goto            33
		{
			l1 = i1;
	//   14   25:iload_1         
	//   15   26:istore          4
			k1 = j1;
	//   16   28:iload_2         
	//   17   29:istore_3        
			byte0 = 1;
	//   18   30:iconst_1        
	//   19   31:istore          5
		}
		for(int i2 = 0; i2 < j2; i2++)
	//*  20   33:iconst_0        
	//*  21   34:istore          6
	//*  22   36:iload           6
	//*  23   38:iload           7
	//*  24   40:icmpge          130
		{
			u u1 = e(f.d(i2));
	//   25   43:aload_0         
	//   26   44:getfield        #512 <Field android.support.v7.widget.t f>
	//   27   47:iload           6
	//   28   49:invokevirtual   #1201 <Method View t.d(int)>
	//   29   52:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   30   55:astore          8
			if(u1 == null || u1.c < k1 || u1.c > l1)
	//*  31   57:aload           8
	//*  32   59:ifnull          121
	//*  33   62:aload           8
	//*  34   64:getfield        #1196 <Field int RecyclerView$u.c>
	//*  35   67:iload_3         
	//*  36   68:icmplt          121
	//*  37   71:aload           8
	//*  38   73:getfield        #1196 <Field int RecyclerView$u.c>
	//*  39   76:iload           4
	//*  40   78:icmple          84
				continue;
	//   41   81:goto            121
			if(u1.c == i1)
	//*  42   84:aload           8
	//*  43   86:getfield        #1196 <Field int RecyclerView$u.c>
	//*  44   89:iload_1         
	//*  45   90:icmpne          105
				u1.a(j1 - i1, false);
	//   46   93:aload           8
	//   47   95:iload_2         
	//   48   96:iload_1         
	//   49   97:isub            
	//   50   98:iconst_0        
	//   51   99:invokevirtual   #1246 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
			else
	//*  52  102:goto            113
				u1.a(((int) (byte0)), false);
	//   53  105:aload           8
	//   54  107:iload           5
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #1246 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
			B.e = true;
	//   57  113:aload_0         
	//   58  114:getfield        #330 <Field RecyclerView$r B>
	//   59  117:iconst_1        
	//   60  118:putfield        #739 <Field boolean RecyclerView$r.e>
		}

	//   61  121:iload           6
	//   62  123:iconst_1        
	//   63  124:iadd            
	//   64  125:istore          6
	//*  65  127:goto            36
		d.a(i1, j1);
	//   66  130:aload_0         
	//   67  131:getfield        #268 <Field RecyclerView$n d>
	//   68  134:iload_1         
	//   69  135:iload_2         
	//   70  136:invokevirtual   #1598 <Method void android.support.v7.widget.RecyclerView$n.a(int, int)>
		requestLayout();
	//   71  139:aload_0         
	//   72  140:invokevirtual   #1252 <Method void requestLayout()>
	//   73  143:return          
	}

	public View focusSearch(View view, int i1)
	{
		Object obj = ((Object) (m.d(view, i1)));
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1602 <Method View RecyclerView$h.d(View, int)>
	//    5    9:astore          7
		if(obj != null)
	//*   6   11:aload           7
	//*   7   13:ifnull          19
			return ((View) (obj));
	//    8   16:aload           7
	//    9   18:areturn         
		byte byte0;
		if(l != null && m != null && !o() && !u)
	//*  10   19:aload_0         
	//*  11   20:getfield        #608 <Field RecyclerView$a l>
	//*  12   23:ifnull          52
	//*  13   26:aload_0         
	//*  14   27:getfield        #528 <Field RecyclerView$h m>
	//*  15   30:ifnull          52
	//*  16   33:aload_0         
	//*  17   34:invokevirtual   #1344 <Method boolean o()>
	//*  18   37:ifne            52
	//*  19   40:aload_0         
	//*  20   41:getfield        #1219 <Field boolean u>
	//*  21   44:ifne            52
			byte0 = 1;
	//   22   47:iconst_1        
	//   23   48:istore_3        
		else
	//*  24   49:goto            54
			byte0 = 0;
	//   25   52:iconst_0        
	//   26   53:istore_3        
		obj = ((Object) (FocusFinder.getInstance()));
	//   27   54:invokestatic    #1608 <Method FocusFinder FocusFinder.getInstance()>
	//   28   57:astore          7
		if(byte0 != 0 && (i1 == 2 || i1 == 1))
	//*  29   59:iload_3         
	//*  30   60:ifeq            319
	//*  31   63:iload_2         
	//*  32   64:iconst_2        
	//*  33   65:icmpeq          73
	//*  34   68:iload_2         
	//*  35   69:iconst_1        
	//*  36   70:icmpne          319
		{
			if(m.e())
	//*  37   73:aload_0         
	//*  38   74:getfield        #528 <Field RecyclerView$h m>
	//*  39   77:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  40   80:ifeq            139
			{
				char c1;
				if(i1 == 2)
	//*  41   83:iload_2         
	//*  42   84:iconst_2        
	//*  43   85:icmpne          96
					c1 = '\202';
	//   44   88:sipush          130
	//   45   91:istore          4
				else
	//*  46   93:goto            100
					c1 = '!';
	//   47   96:bipush          33
	//   48   98:istore          4
				boolean flag1;
				if(((FocusFinder) (obj)).findNextFocus(((ViewGroup) (this)), view, ((int) (c1))) == null)
	//*  49  100:aload           7
	//*  50  102:aload_0         
	//*  51  103:aload_1         
	//*  52  104:iload           4
	//*  53  106:invokevirtual   #1612 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//*  54  109:ifnonnull       118
					flag1 = true;
	//   55  112:iconst_1        
	//   56  113:istore          5
				else
	//*  57  115:goto            121
					flag1 = false;
	//   58  118:iconst_0        
	//   59  119:istore          5
				byte0 = ((byte) (flag1));
	//   60  121:iload           5
	//   61  123:istore_3        
				if(L)
	//*  62  124:getstatic       #230 <Field boolean L>
	//*  63  127:ifeq            141
				{
					i1 = ((int) (c1));
	//   64  130:iload           4
	//   65  132:istore_2        
					byte0 = ((byte) (flag1));
	//   66  133:iload           5
	//   67  135:istore_3        
				}
			} else
	//*  68  136:goto            141
			{
				byte0 = 0;
	//   69  139:iconst_0        
	//   70  140:istore_3        
			}
			byte byte1 = byte0;
	//   71  141:iload_3         
	//   72  142:istore          6
			int j1 = i1;
	//   73  144:iload_2         
	//   74  145:istore          5
			if(byte0 == 0)
	//*  75  147:iload_3         
	//*  76  148:ifne            255
			{
				byte1 = byte0;
	//   77  151:iload_3         
	//   78  152:istore          6
				j1 = i1;
	//   79  154:iload_2         
	//   80  155:istore          5
				if(m.d())
	//*  81  157:aload_0         
	//*  82  158:getfield        #528 <Field RecyclerView$h m>
	//*  83  161:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  84  164:ifeq            255
				{
					if(m.s() == 1)
	//*  85  167:aload_0         
	//*  86  168:getfield        #528 <Field RecyclerView$h m>
	//*  87  171:invokevirtual   #1087 <Method int android.support.v7.widget.RecyclerView$h.s()>
	//*  88  174:iconst_1        
	//*  89  175:icmpne          183
						byte0 = 1;
	//   90  178:iconst_1        
	//   91  179:istore_3        
					else
	//*  92  180:goto            185
						byte0 = 0;
	//   93  183:iconst_0        
	//   94  184:istore_3        
					boolean flag;
					if(i1 == 2)
	//*  95  185:iload_2         
	//*  96  186:iconst_2        
	//*  97  187:icmpne          196
						flag = true;
	//   98  190:iconst_1        
	//   99  191:istore          4
					else
	//* 100  193:goto            199
						flag = false;
	//  101  196:iconst_0        
	//  102  197:istore          4
					if((byte0 ^ flag) != 0)
	//* 103  199:iload_3         
	//* 104  200:iload           4
	//* 105  202:ixor            
	//* 106  203:ifeq            212
						byte0 = 66;
	//  107  206:bipush          66
	//  108  208:istore_3        
					else
	//* 109  209:goto            215
						byte0 = 17;
	//  110  212:bipush          17
	//  111  214:istore_3        
					if(((FocusFinder) (obj)).findNextFocus(((ViewGroup) (this)), view, ((int) (byte0))) == null)
	//* 112  215:aload           7
	//* 113  217:aload_0         
	//* 114  218:aload_1         
	//* 115  219:iload_3         
	//* 116  220:invokevirtual   #1612 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//* 117  223:ifnonnull       232
						flag = true;
	//  118  226:iconst_1        
	//  119  227:istore          4
					else
	//* 120  229:goto            235
						flag = false;
	//  121  232:iconst_0        
	//  122  233:istore          4
					byte1 = ((byte) (flag));
	//  123  235:iload           4
	//  124  237:istore          6
					j1 = i1;
	//  125  239:iload_2         
	//  126  240:istore          5
					if(L)
	//* 127  242:getstatic       #230 <Field boolean L>
	//* 128  245:ifeq            255
					{
						j1 = ((int) (byte0));
	//  129  248:iload_3         
	//  130  249:istore          5
						byte1 = ((byte) (flag));
	//  131  251:iload           4
	//  132  253:istore          6
					}
				}
			}
			if(byte1 != 0)
	//* 133  255:iload           6
	//* 134  257:ifeq            302
			{
				d();
	//  135  260:aload_0         
	//  136  261:invokevirtual   #1365 <Method void d()>
				if(c(view) == null)
	//* 137  264:aload_0         
	//* 138  265:aload_1         
	//* 139  266:invokevirtual   #1503 <Method View c(View)>
	//* 140  269:ifnonnull       274
					return null;
	//  141  272:aconst_null     
	//  142  273:areturn         
				e();
	//  143  274:aload_0         
	//  144  275:invokevirtual   #699 <Method void e()>
				m.a(view, j1, d, B);
	//  145  278:aload_0         
	//  146  279:getfield        #528 <Field RecyclerView$h m>
	//  147  282:aload_1         
	//  148  283:iload           5
	//  149  285:aload_0         
	//  150  286:getfield        #268 <Field RecyclerView$n d>
	//  151  289:aload_0         
	//  152  290:getfield        #330 <Field RecyclerView$r B>
	//  153  293:invokevirtual   #1615 <Method View android.support.v7.widget.RecyclerView$h.a(View, int, RecyclerView$n, RecyclerView$r)>
	//  154  296:pop             
				a(false);
	//  155  297:aload_0         
	//  156  298:iconst_0        
	//  157  299:invokevirtual   #757 <Method void a(boolean)>
			}
			obj = ((Object) (((FocusFinder) (obj)).findNextFocus(((ViewGroup) (this)), view, j1)));
	//  158  302:aload           7
	//  159  304:aload_0         
	//  160  305:aload_1         
	//  161  306:iload           5
	//  162  308:invokevirtual   #1612 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//  163  311:astore          7
			i1 = j1;
	//  164  313:iload           5
	//  165  315:istore_2        
		} else
	//* 166  316:goto            383
		{
			obj = ((Object) (((FocusFinder) (obj)).findNextFocus(((ViewGroup) (this)), view, i1)));
	//  167  319:aload           7
	//  168  321:aload_0         
	//  169  322:aload_1         
	//  170  323:iload_2         
	//  171  324:invokevirtual   #1612 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//  172  327:astore          7
			if(obj == null && byte0 != 0)
	//* 173  329:aload           7
	//* 174  331:ifnonnull       383
	//* 175  334:iload_3         
	//* 176  335:ifeq            383
			{
				d();
	//  177  338:aload_0         
	//  178  339:invokevirtual   #1365 <Method void d()>
				if(c(view) == null)
	//* 179  342:aload_0         
	//* 180  343:aload_1         
	//* 181  344:invokevirtual   #1503 <Method View c(View)>
	//* 182  347:ifnonnull       352
					return null;
	//  183  350:aconst_null     
	//  184  351:areturn         
				e();
	//  185  352:aload_0         
	//  186  353:invokevirtual   #699 <Method void e()>
				obj = ((Object) (m.a(view, i1, d, B)));
	//  187  356:aload_0         
	//  188  357:getfield        #528 <Field RecyclerView$h m>
	//  189  360:aload_1         
	//  190  361:iload_2         
	//  191  362:aload_0         
	//  192  363:getfield        #268 <Field RecyclerView$n d>
	//  193  366:aload_0         
	//  194  367:getfield        #330 <Field RecyclerView$r B>
	//  195  370:invokevirtual   #1615 <Method View android.support.v7.widget.RecyclerView$h.a(View, int, RecyclerView$n, RecyclerView$r)>
	//  196  373:astore          7
				a(false);
	//  197  375:aload_0         
	//  198  376:iconst_0        
	//  199  377:invokevirtual   #757 <Method void a(boolean)>
			}
		}
	//* 200  380:goto            383
		if(obj != null && !((View) (obj)).hasFocusable())
	//* 201  383:aload           7
	//* 202  385:ifnull          419
	//* 203  388:aload           7
	//* 204  390:invokevirtual   #656 <Method boolean View.hasFocusable()>
	//* 205  393:ifne            419
			if(getFocusedChild() == null)
	//* 206  396:aload_0         
	//* 207  397:invokevirtual   #621 <Method View getFocusedChild()>
	//* 208  400:ifnonnull       410
			{
				return super.focusSearch(view, i1);
	//  209  403:aload_0         
	//  210  404:aload_1         
	//  211  405:iload_2         
	//  212  406:invokespecial   #1617 <Method View ViewGroup.focusSearch(View, int)>
	//  213  409:areturn         
			} else
			{
				a(((View) (obj)), ((View) (null)));
	//  214  410:aload_0         
	//  215  411:aload           7
	//  216  413:aconst_null     
	//  217  414:invokespecial   #1619 <Method void a(View, View)>
				return view;
	//  218  417:aload_1         
	//  219  418:areturn         
			}
		if(a(view, ((View) (obj)), i1))
	//* 220  419:aload_0         
	//* 221  420:aload_1         
	//* 222  421:aload           7
	//* 223  423:iload_2         
	//* 224  424:invokespecial   #1621 <Method boolean a(View, View, int)>
	//* 225  427:ifeq            433
			return ((View) (obj));
	//  226  430:aload           7
	//  227  432:areturn         
		else
			return super.focusSearch(view, i1);
	//  228  433:aload_0         
	//  229  434:aload_1         
	//  230  435:iload_2         
	//  231  436:invokespecial   #1617 <Method View ViewGroup.focusSearch(View, int)>
	//  232  439:areturn         
	}

	void g()
	{
		if(ad != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #532 <Field EdgeEffect ad>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ad = new EdgeEffect(getContext());
	//    4    8:aload_0         
	//    5    9:new             #534 <Class EdgeEffect>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #431 <Method Context getContext()>
	//    9   17:invokespecial   #1623 <Method void EdgeEffect(Context)>
	//   10   20:putfield        #532 <Field EdgeEffect ad>
		int i1;
		int j1;
		EdgeEffect edgeeffect;
		if(h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #367 <Field boolean h>
	//*  13   27:ifeq            72
		{
			edgeeffect = ad;
	//   14   30:aload_0         
	//   15   31:getfield        #532 <Field EdgeEffect ad>
	//   16   34:astore_3        
			i1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1575 <Method int getPaddingTop()>
	//   21   43:isub            
	//   22   44:aload_0         
	//   23   45:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   24   48:isub            
	//   25   49:istore_1        
			j1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #1572 <Method int getPaddingLeft()>
	//   30   58:isub            
	//   31   59:aload_0         
	//   32   60:invokevirtual   #1580 <Method int getPaddingRight()>
	//   33   63:isub            
	//   34   64:istore_2        
		} else
	//*  35   65:aload_3         
	//*  36   66:iload_1         
	//*  37   67:iload_2         
	//*  38   68:invokevirtual   #1632 <Method void EdgeEffect.setSize(int, int)>
	//*  39   71:return          
		{
			edgeeffect = ad;
	//   40   72:aload_0         
	//   41   73:getfield        #532 <Field EdgeEffect ad>
	//   42   76:astore_3        
			i1 = getMeasuredHeight();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   45   81:istore_1        
			j1 = getMeasuredWidth();
	//   46   82:aload_0         
	//   47   83:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   48   86:istore_2        
		}
		edgeeffect.setSize(i1, j1);
	//*  49   87:goto            65
	}

	void g(int i1)
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnull          15
			m.k(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #1634 <Method void android.support.v7.widget.RecyclerView$h.k(int)>
		f(i1);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1636 <Method void f(int)>
		if(av != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #1638 <Field RecyclerView$l av>
	//*  12   24:ifnull          36
			av.a(this, i1);
	//   13   27:aload_0         
	//   14   28:getfield        #1638 <Field RecyclerView$l av>
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokevirtual   #1640 <Method void android.support.v7.widget.RecyclerView$l.a(RecyclerView, int)>
		if(aw != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #1310 <Field List aw>
	//*  20   40:ifnull          84
		{
			for(int j1 = aw.size() - 1; j1 >= 0; j1--)
	//*  21   43:aload_0         
	//*  22   44:getfield        #1310 <Field List aw>
	//*  23   47:invokeinterface #1641 <Method int List.size()>
	//*  24   52:iconst_1        
	//*  25   53:isub            
	//*  26   54:istore_2        
	//*  27   55:iload_2         
	//*  28   56:iflt            84
				((l)aw.get(j1)).a(this, i1);
	//   29   59:aload_0         
	//   30   60:getfield        #1310 <Field List aw>
	//   31   63:iload_2         
	//   32   64:invokeinterface #1642 <Method Object List.get(int)>
	//   33   69:checkcast       #75  <Class RecyclerView$l>
	//   34   72:aload_0         
	//   35   73:iload_1         
	//   36   74:invokevirtual   #1640 <Method void android.support.v7.widget.RecyclerView$l.a(RecyclerView, int)>

	//   37   77:iload_2         
	//   38   78:iconst_1        
	//   39   79:isub            
	//   40   80:istore_2        
		}
	//*  41   81:goto            55
	//   42   84:return          
	}

	void g(int i1, int j1)
	{
		int l1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore          4
		for(int k1 = 0; k1 < l1; k1++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          74
		{
			u u1 = e(f.d(k1));
	//    9   17:aload_0         
	//   10   18:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #1201 <Method View t.d(int)>
	//   13   25:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   28:astore          5
			if(u1 != null && !u1.c() && u1.c >= i1)
	//*  15   30:aload           5
	//*  16   32:ifnull          67
	//*  17   35:aload           5
	//*  18   37:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  19   40:ifne            67
	//*  20   43:aload           5
	//*  21   45:getfield        #1196 <Field int RecyclerView$u.c>
	//*  22   48:iload_1         
	//*  23   49:icmplt          67
			{
				u1.a(j1, false);
	//   24   52:aload           5
	//   25   54:iload_2         
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #1246 <Method void android.support.v7.widget.RecyclerView$u.a(int, boolean)>
				B.e = true;
	//   28   59:aload_0         
	//   29   60:getfield        #330 <Field RecyclerView$r B>
	//   30   63:iconst_1        
	//   31   64:putfield        #739 <Field boolean RecyclerView$r.e>
			}
		}

	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_3        
	//*  36   71:goto            11
		d.b(i1, j1);
	//   37   74:aload_0         
	//   38   75:getfield        #268 <Field RecyclerView$n d>
	//   39   78:iload_1         
	//   40   79:iload_2         
	//   41   80:invokevirtual   #1644 <Method void android.support.v7.widget.RecyclerView$n.b(int, int)>
		requestLayout();
	//   42   83:aload_0         
	//   43   84:invokevirtual   #1252 <Method void requestLayout()>
	//   44   87:return          
	}

	public void g(View view)
	{
	//    0    0:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #816 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #817 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("RecyclerView has no LayoutManager");
	//    7   15:aload_1         
	//    8   16:ldc2            #1647 <String "RecyclerView has no LayoutManager">
	//    9   19:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(a());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #875 <Method String a()>
	//   14   28:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   16   32:new             #877 <Class IllegalStateException>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   20   40:invokespecial   #880 <Method void IllegalStateException(String)>
	//   21   43:athrow          
		} else
		{
			return ((android.view.ViewGroup.LayoutParams) (m.a()));
	//   22   44:aload_0         
	//   23   45:getfield        #528 <Field RecyclerView$h m>
	//   24   48:invokevirtual   #1650 <Method RecyclerView$LayoutParams android.support.v7.widget.RecyclerView$h.a()>
	//   25   51:areturn         
		}
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       44
		{
			attributeset = ((AttributeSet) (new StringBuilder()));
	//    3    7:new             #816 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #817 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (attributeset)).append("RecyclerView has no LayoutManager");
	//    7   15:aload_1         
	//    8   16:ldc2            #1647 <String "RecyclerView has no LayoutManager">
	//    9   19:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (attributeset)).append(a());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #875 <Method String a()>
	//   14   28:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			throw new IllegalStateException(((StringBuilder) (attributeset)).toString());
	//   16   32:new             #877 <Class IllegalStateException>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   20   40:invokespecial   #880 <Method void IllegalStateException(String)>
	//   21   43:athrow          
		} else
		{
			return ((android.view.ViewGroup.LayoutParams) (m.a(getContext(), attributeset)));
	//   22   44:aload_0         
	//   23   45:getfield        #528 <Field RecyclerView$h m>
	//   24   48:aload_0         
	//   25   49:invokevirtual   #431 <Method Context getContext()>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #1655 <Method RecyclerView$LayoutParams android.support.v7.widget.RecyclerView$h.a(Context, AttributeSet)>
	//   28   56:areturn         
		}
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       44
		{
			layoutparams = ((android.view.ViewGroup.LayoutParams) (new StringBuilder()));
	//    3    7:new             #816 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #817 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (layoutparams)).append("RecyclerView has no LayoutManager");
	//    7   15:aload_1         
	//    8   16:ldc2            #1647 <String "RecyclerView has no LayoutManager">
	//    9   19:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (layoutparams)).append(a());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #875 <Method String a()>
	//   14   28:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			throw new IllegalStateException(((StringBuilder) (layoutparams)).toString());
	//   16   32:new             #877 <Class IllegalStateException>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   20   40:invokespecial   #880 <Method void IllegalStateException(String)>
	//   21   43:athrow          
		} else
		{
			return ((android.view.ViewGroup.LayoutParams) (m.a(layoutparams)));
	//   22   44:aload_0         
	//   23   45:getfield        #528 <Field RecyclerView$h m>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #1659 <Method RecyclerView$LayoutParams android.support.v7.widget.RecyclerView$h.a(android.view.ViewGroup$LayoutParams)>
	//   26   52:areturn         
		}
	}

	public a getAdapter()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field RecyclerView$a l>
	//    2    4:areturn         
	}

	public int getBaseline()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnull          15
			return m.t();
	//    3    7:aload_0         
	//    4    8:getfield        #528 <Field RecyclerView$h m>
	//    5   11:invokevirtual   #1664 <Method int android.support.v7.widget.RecyclerView$h.t()>
	//    6   14:ireturn         
		else
			return super.getBaseline();
	//    7   15:aload_0         
	//    8   16:invokespecial   #1666 <Method int ViewGroup.getBaseline()>
	//    9   19:ireturn         
	}

	protected int getChildDrawingOrder(int i1, int j1)
	{
		if(ay == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1669 <Field RecyclerView$d ay>
	//*   2    4:ifnonnull       14
			return super.getChildDrawingOrder(i1, j1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1671 <Method int ViewGroup.getChildDrawingOrder(int, int)>
	//    7   13:ireturn         
		else
			return ay.a(i1, j1);
	//    8   14:aload_0         
	//    9   15:getfield        #1669 <Field RecyclerView$d ay>
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokeinterface #1673 <Method int android.support.v7.widget.RecyclerView$d.a(int, int)>
	//   13   25:ireturn         
	}

	public boolean getClipToPadding()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field boolean h>
	//    2    4:ireturn         
	}

	public ai getCompatAccessibilityDelegate()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #1678 <Field ai F>
	//    2    4:areturn         
	}

	public e getItemAnimator()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field RecyclerView$e x>
	//    2    4:areturn         
	}

	public h getLayoutManager()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:areturn         
	}

	public int getMaxFlingVelocity()
	{
		return ar;
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field int ar>
	//    2    4:ireturn         
	}

	public int getMinFlingVelocity()
	{
		return aq;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field int aq>
	//    2    4:ireturn         
	}

	long getNanoTime()
	{
		if(K)
	//*   0    0:getstatic       #228 <Field boolean K>
	//*   1    3:ifeq            10
			return System.nanoTime();
	//    2    6:invokestatic    #1690 <Method long System.nanoTime()>
	//    3    9:lreturn         
		else
			return 0L;
	//    4   10:lconst_0        
	//    5   11:lreturn         
	}

	public j getOnFlingListener()
	{
		return ap;
	//    0    0:aload_0         
	//    1    1:getfield        #1455 <Field RecyclerView$j ap>
	//    2    4:areturn         
	}

	public boolean getPreserveFocusAfterLayout()
	{
		return au;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field boolean au>
	//    2    4:ireturn         
	}

	public m getRecycledViewPool()
	{
		return d.g();
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field RecyclerView$n d>
	//    2    4:invokevirtual   #1697 <Method RecyclerView$m android.support.v7.widget.RecyclerView$n.g()>
	//    3    7:areturn         
	}

	public int getScrollState()
	{
		return ah;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field int ah>
	//    2    4:ireturn         
	}

	void h()
	{
		if(af != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #544 <Field EdgeEffect af>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		af = new EdgeEffect(getContext());
	//    4    8:aload_0         
	//    5    9:new             #534 <Class EdgeEffect>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #431 <Method Context getContext()>
	//    9   17:invokespecial   #1623 <Method void EdgeEffect(Context)>
	//   10   20:putfield        #544 <Field EdgeEffect af>
		int i1;
		int j1;
		EdgeEffect edgeeffect;
		if(h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #367 <Field boolean h>
	//*  13   27:ifeq            72
		{
			edgeeffect = af;
	//   14   30:aload_0         
	//   15   31:getfield        #544 <Field EdgeEffect af>
	//   16   34:astore_3        
			i1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1575 <Method int getPaddingTop()>
	//   21   43:isub            
	//   22   44:aload_0         
	//   23   45:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   24   48:isub            
	//   25   49:istore_1        
			j1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #1572 <Method int getPaddingLeft()>
	//   30   58:isub            
	//   31   59:aload_0         
	//   32   60:invokevirtual   #1580 <Method int getPaddingRight()>
	//   33   63:isub            
	//   34   64:istore_2        
		} else
	//*  35   65:aload_3         
	//*  36   66:iload_1         
	//*  37   67:iload_2         
	//*  38   68:invokevirtual   #1632 <Method void EdgeEffect.setSize(int, int)>
	//*  39   71:return          
		{
			edgeeffect = af;
	//   40   72:aload_0         
	//   41   73:getfield        #544 <Field EdgeEffect af>
	//   42   76:astore_3        
			i1 = getMeasuredHeight();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   45   81:istore_1        
			j1 = getMeasuredWidth();
	//   46   82:aload_0         
	//   47   83:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   48   86:istore_2        
		}
		edgeeffect.setSize(i1, j1);
	//*  49   87:goto            65
	}

	public void h(int i1)
	{
		getScrollingChildHelper().c(i1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1699 <Method void k.c(int)>
	//    4    8:return          
	}

	public void h(int i1, int j1)
	{
	//    0    0:return          
	}

	public void h(View view)
	{
	//    0    0:return          
	}

	public boolean hasNestedScrollingParent()
	{
		return getScrollingChildHelper().b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:invokevirtual   #1701 <Method boolean k.b()>
	//    3    7:ireturn         
	}

	Rect i(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore          4
		if(!layoutparams.e)
	//*   4    9:aload           4
	//*   5   11:getfield        #1037 <Field boolean RecyclerView$LayoutParams.e>
	//*   6   14:ifne            23
			return layoutparams.d;
	//    7   17:aload           4
	//    8   19:getfield        #1039 <Field Rect RecyclerView$LayoutParams.d>
	//    9   22:areturn         
		if(B.a() && (layoutparams.e() || layoutparams.c()))
	//*  10   23:aload_0         
	//*  11   24:getfield        #330 <Field RecyclerView$r B>
	//*  12   27:invokevirtual   #1704 <Method boolean android.support.v7.widget.RecyclerView$r.a()>
	//*  13   30:ifeq            55
	//*  14   33:aload           4
	//*  15   35:invokevirtual   #1705 <Method boolean RecyclerView$LayoutParams.e()>
	//*  16   38:ifne            49
	//*  17   41:aload           4
	//*  18   43:invokevirtual   #1706 <Method boolean RecyclerView$LayoutParams.c()>
	//*  19   46:ifeq            55
			return layoutparams.d;
	//   20   49:aload           4
	//   21   51:getfield        #1039 <Field Rect RecyclerView$LayoutParams.d>
	//   22   54:areturn         
		Rect rect = layoutparams.d;
	//   23   55:aload           4
	//   24   57:getfield        #1039 <Field Rect RecyclerView$LayoutParams.d>
	//   25   60:astore          5
		rect.set(0, 0, 0, 0);
	//   26   62:aload           5
	//   27   64:iconst_0        
	//   28   65:iconst_0        
	//   29   66:iconst_0        
	//   30   67:iconst_0        
	//   31   68:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
		int j1 = o.size();
	//   32   71:aload_0         
	//   33   72:getfield        #293 <Field ArrayList o>
	//   34   75:invokevirtual   #1076 <Method int ArrayList.size()>
	//   35   78:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  36   79:iconst_0        
	//*  37   80:istore_2        
	//*  38   81:iload_2         
	//*  39   82:iload_3         
	//*  40   83:icmpge          200
		{
			j.set(0, 0, 0, 0);
	//   41   86:aload_0         
	//   42   87:getfield        #281 <Field Rect j>
	//   43   90:iconst_0        
	//   44   91:iconst_0        
	//   45   92:iconst_0        
	//   46   93:iconst_0        
	//   47   94:invokevirtual   #1032 <Method void Rect.set(int, int, int, int)>
			((g)o.get(i1)).a(j, view, this, B);
	//   48   97:aload_0         
	//   49   98:getfield        #293 <Field ArrayList o>
	//   50  101:iload_2         
	//   51  102:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   52  105:checkcast       #52  <Class RecyclerView$g>
	//   53  108:aload_0         
	//   54  109:getfield        #281 <Field Rect j>
	//   55  112:aload_1         
	//   56  113:aload_0         
	//   57  114:aload_0         
	//   58  115:getfield        #330 <Field RecyclerView$r B>
	//   59  118:invokevirtual   #1709 <Method void android.support.v7.widget.RecyclerView$g.a(Rect, View, RecyclerView, RecyclerView$r)>
			rect.left = rect.left + j.left;
	//   60  121:aload           5
	//   61  123:aload           5
	//   62  125:getfield        #1042 <Field int Rect.left>
	//   63  128:aload_0         
	//   64  129:getfield        #281 <Field Rect j>
	//   65  132:getfield        #1042 <Field int Rect.left>
	//   66  135:iadd            
	//   67  136:putfield        #1042 <Field int Rect.left>
			rect.top = rect.top + j.top;
	//   68  139:aload           5
	//   69  141:aload           5
	//   70  143:getfield        #1048 <Field int Rect.top>
	//   71  146:aload_0         
	//   72  147:getfield        #281 <Field Rect j>
	//   73  150:getfield        #1048 <Field int Rect.top>
	//   74  153:iadd            
	//   75  154:putfield        #1048 <Field int Rect.top>
			rect.right = rect.right + j.right;
	//   76  157:aload           5
	//   77  159:aload           5
	//   78  161:getfield        #1045 <Field int Rect.right>
	//   79  164:aload_0         
	//   80  165:getfield        #281 <Field Rect j>
	//   81  168:getfield        #1045 <Field int Rect.right>
	//   82  171:iadd            
	//   83  172:putfield        #1045 <Field int Rect.right>
			rect.bottom = rect.bottom + j.bottom;
	//   84  175:aload           5
	//   85  177:aload           5
	//   86  179:getfield        #1051 <Field int Rect.bottom>
	//   87  182:aload_0         
	//   88  183:getfield        #281 <Field Rect j>
	//   89  186:getfield        #1051 <Field int Rect.bottom>
	//   90  189:iadd            
	//   91  190:putfield        #1051 <Field int Rect.bottom>
		}

	//   92  193:iload_2         
	//   93  194:iconst_1        
	//   94  195:iadd            
	//   95  196:istore_2        
	//*  96  197:goto            81
		layoutparams.e = false;
	//   97  200:aload           4
	//   98  202:iconst_0        
	//   99  203:putfield        #1037 <Field boolean RecyclerView$LayoutParams.e>
		return rect;
	//  100  206:aload           5
	//  101  208:areturn         
	}

	void i()
	{
		if(ae != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #542 <Field EdgeEffect ae>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ae = new EdgeEffect(getContext());
	//    4    8:aload_0         
	//    5    9:new             #534 <Class EdgeEffect>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #431 <Method Context getContext()>
	//    9   17:invokespecial   #1623 <Method void EdgeEffect(Context)>
	//   10   20:putfield        #542 <Field EdgeEffect ae>
		int i1;
		int j1;
		EdgeEffect edgeeffect;
		if(h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #367 <Field boolean h>
	//*  13   27:ifeq            72
		{
			edgeeffect = ae;
	//   14   30:aload_0         
	//   15   31:getfield        #542 <Field EdgeEffect ae>
	//   16   34:astore_3        
			i1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1572 <Method int getPaddingLeft()>
	//   21   43:isub            
	//   22   44:aload_0         
	//   23   45:invokevirtual   #1580 <Method int getPaddingRight()>
	//   24   48:isub            
	//   25   49:istore_1        
			j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #1575 <Method int getPaddingTop()>
	//   30   58:isub            
	//   31   59:aload_0         
	//   32   60:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   33   63:isub            
	//   34   64:istore_2        
		} else
	//*  35   65:aload_3         
	//*  36   66:iload_1         
	//*  37   67:iload_2         
	//*  38   68:invokevirtual   #1632 <Method void EdgeEffect.setSize(int, int)>
	//*  39   71:return          
		{
			edgeeffect = ae;
	//   40   72:aload_0         
	//   41   73:getfield        #542 <Field EdgeEffect ae>
	//   42   76:astore_3        
			i1 = getMeasuredWidth();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   45   81:istore_1        
			j1 = getMeasuredHeight();
	//   46   82:aload_0         
	//   47   83:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   48   86:istore_2        
		}
		edgeeffect.setSize(i1, j1);
	//*  49   87:goto            65
	}

	void i(int i1, int j1)
	{
		ac = ac + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #303 <Field int ac>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #303 <Field int ac>
		int k1 = getScrollX();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #1712 <Method int getScrollX()>
	//    8   14:istore_3        
		int i2 = getScrollY();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #1715 <Method int getScrollY()>
	//   11   19:istore          4
		onScrollChanged(k1, i2, k1, i2);
	//   12   21:aload_0         
	//   13   22:iload_3         
	//   14   23:iload           4
	//   15   25:iload_3         
	//   16   26:iload           4
	//   17   28:invokevirtual   #1718 <Method void onScrollChanged(int, int, int, int)>
		h(i1, j1);
	//   18   31:aload_0         
	//   19   32:iload_1         
	//   20   33:iload_2         
	//   21   34:invokevirtual   #1720 <Method void h(int, int)>
		if(av != null)
	//*  22   37:aload_0         
	//*  23   38:getfield        #1638 <Field RecyclerView$l av>
	//*  24   41:ifnull          54
			av.a(this, i1, j1);
	//   25   44:aload_0         
	//   26   45:getfield        #1638 <Field RecyclerView$l av>
	//   27   48:aload_0         
	//   28   49:iload_1         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #1722 <Method void android.support.v7.widget.RecyclerView$l.a(RecyclerView, int, int)>
		if(aw != null)
	//*  31   54:aload_0         
	//*  32   55:getfield        #1310 <Field List aw>
	//*  33   58:ifnull          103
		{
			for(int l1 = aw.size() - 1; l1 >= 0; l1--)
	//*  34   61:aload_0         
	//*  35   62:getfield        #1310 <Field List aw>
	//*  36   65:invokeinterface #1641 <Method int List.size()>
	//*  37   70:iconst_1        
	//*  38   71:isub            
	//*  39   72:istore_3        
	//*  40   73:iload_3         
	//*  41   74:iflt            103
				((l)aw.get(l1)).a(this, i1, j1);
	//   42   77:aload_0         
	//   43   78:getfield        #1310 <Field List aw>
	//   44   81:iload_3         
	//   45   82:invokeinterface #1642 <Method Object List.get(int)>
	//   46   87:checkcast       #75  <Class RecyclerView$l>
	//   47   90:aload_0         
	//   48   91:iload_1         
	//   49   92:iload_2         
	//   50   93:invokevirtual   #1722 <Method void android.support.v7.widget.RecyclerView$l.a(RecyclerView, int, int)>

	//   51   96:iload_3         
	//   52   97:iconst_1        
	//   53   98:isub            
	//   54   99:istore_3        
		}
	//*  55  100:goto            73
		ac = ac - 1;
	//   56  103:aload_0         
	//   57  104:aload_0         
	//   58  105:getfield        #303 <Field int ac>
	//   59  108:iconst_1        
	//   60  109:isub            
	//   61  110:putfield        #303 <Field int ac>
	//   62  113:return          
	}

	public boolean i(int i1)
	{
		return getScrollingChildHelper().a(i1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1723 <Method boolean k.a(int)>
	//    4    8:ireturn         
	}

	public boolean isAttachedToWindow()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #1726 <Field boolean p>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return getScrollingChildHelper().a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:invokevirtual   #1728 <Method boolean k.a()>
	//    3    7:ireturn         
	}

	void j()
	{
		if(ag != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #546 <Field EdgeEffect ag>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ag = new EdgeEffect(getContext());
	//    4    8:aload_0         
	//    5    9:new             #534 <Class EdgeEffect>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #431 <Method Context getContext()>
	//    9   17:invokespecial   #1623 <Method void EdgeEffect(Context)>
	//   10   20:putfield        #546 <Field EdgeEffect ag>
		int i1;
		int j1;
		EdgeEffect edgeeffect;
		if(h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #367 <Field boolean h>
	//*  13   27:ifeq            72
		{
			edgeeffect = ag;
	//   14   30:aload_0         
	//   15   31:getfield        #546 <Field EdgeEffect ag>
	//   16   34:astore_3        
			i1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1572 <Method int getPaddingLeft()>
	//   21   43:isub            
	//   22   44:aload_0         
	//   23   45:invokevirtual   #1580 <Method int getPaddingRight()>
	//   24   48:isub            
	//   25   49:istore_1        
			j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #1575 <Method int getPaddingTop()>
	//   30   58:isub            
	//   31   59:aload_0         
	//   32   60:invokevirtual   #1555 <Method int getPaddingBottom()>
	//   33   63:isub            
	//   34   64:istore_2        
		} else
	//*  35   65:aload_3         
	//*  36   66:iload_1         
	//*  37   67:iload_2         
	//*  38   68:invokevirtual   #1632 <Method void EdgeEffect.setSize(int, int)>
	//*  39   71:return          
		{
			edgeeffect = ag;
	//   40   72:aload_0         
	//   41   73:getfield        #546 <Field EdgeEffect ag>
	//   42   76:astore_3        
			i1 = getMeasuredWidth();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   45   81:istore_1        
			j1 = getMeasuredHeight();
	//   46   82:aload_0         
	//   47   83:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   48   86:istore_2        
		}
		edgeeffect.setSize(i1, j1);
	//*  49   87:goto            65
	}

	public boolean j(int i1, int j1)
	{
		return getScrollingChildHelper().a(i1, j1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1729 <Method boolean k.a(int, int)>
	//    5    9:ireturn         
	}

	void k()
	{
		ag = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #546 <Field EdgeEffect ag>
		ae = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #542 <Field EdgeEffect ae>
		af = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #544 <Field EdgeEffect af>
		ad = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #532 <Field EdgeEffect ad>
	//   12   20:return          
	}

	void k(View view)
	{
		u u1 = e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #521 <Method RecyclerView$u e(View)>
	//    2    4:astore_3        
		h(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #1731 <Method void h(View)>
		if(l != null && u1 != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #608 <Field RecyclerView$a l>
	//*   8   14:ifnull          29
	//*   9   17:aload_3         
	//*  10   18:ifnull          29
			l.d(u1);
	//   11   21:aload_0         
	//   12   22:getfield        #608 <Field RecyclerView$a l>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #1733 <Method void RecyclerView$a.d(RecyclerView$u)>
		if(aa != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #1303 <Field List aa>
	//*  17   33:ifnull          78
		{
			for(int i1 = aa.size() - 1; i1 >= 0; i1--)
	//*  18   36:aload_0         
	//*  19   37:getfield        #1303 <Field List aa>
	//*  20   40:invokeinterface #1641 <Method int List.size()>
	//*  21   45:iconst_1        
	//*  22   46:isub            
	//*  23   47:istore_2        
	//*  24   48:iload_2         
	//*  25   49:iflt            78
				((i)aa.get(i1)).b(view);
	//   26   52:aload_0         
	//   27   53:getfield        #1303 <Field List aa>
	//   28   56:iload_2         
	//   29   57:invokeinterface #1642 <Method Object List.get(int)>
	//   30   62:checkcast       #66  <Class RecyclerView$i>
	//   31   65:aload_1         
	//   32   66:invokeinterface #1735 <Method void android.support.v7.widget.RecyclerView$i.b(View)>

	//   33   71:iload_2         
	//   34   72:iconst_1        
	//   35   73:isub            
	//   36   74:istore_2        
		}
	//*  37   75:goto            48
	//   38   78:return          
	}

	void l()
	{
		ab = ab + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #301 <Field int ab>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #301 <Field int ab>
	//    6   10:return          
	}

	void l(View view)
	{
		u u1 = e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #521 <Method RecyclerView$u e(View)>
	//    2    4:astore_3        
		g(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #1737 <Method void g(View)>
		if(l != null && u1 != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #608 <Field RecyclerView$a l>
	//*   8   14:ifnull          29
	//*   9   17:aload_3         
	//*  10   18:ifnull          29
			l.c(u1);
	//   11   21:aload_0         
	//   12   22:getfield        #608 <Field RecyclerView$a l>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #1738 <Method void RecyclerView$a.c(RecyclerView$u)>
		if(aa != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #1303 <Field List aa>
	//*  17   33:ifnull          78
		{
			for(int i1 = aa.size() - 1; i1 >= 0; i1--)
	//*  18   36:aload_0         
	//*  19   37:getfield        #1303 <Field List aa>
	//*  20   40:invokeinterface #1641 <Method int List.size()>
	//*  21   45:iconst_1        
	//*  22   46:isub            
	//*  23   47:istore_2        
	//*  24   48:iload_2         
	//*  25   49:iflt            78
				((i)aa.get(i1)).a(view);
	//   26   52:aload_0         
	//   27   53:getfield        #1303 <Field List aa>
	//   28   56:iload_2         
	//   29   57:invokeinterface #1642 <Method Object List.get(int)>
	//   30   62:checkcast       #66  <Class RecyclerView$i>
	//   31   65:aload_1         
	//   32   66:invokeinterface #1740 <Method void android.support.v7.widget.RecyclerView$i.a(View)>

	//   33   71:iload_2         
	//   34   72:iconst_1        
	//   35   73:isub            
	//   36   74:istore_2        
		}
	//*  37   75:goto            48
	//   38   78:return          
	}

	void m()
	{
		b(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1742 <Method void b(boolean)>
	//    3    5:return          
	}

	boolean n()
	{
		return W != null && W.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #441 <Field AccessibilityManager W>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #441 <Field AccessibilityManager W>
	//    5   11:invokevirtual   #1745 <Method boolean AccessibilityManager.isEnabled()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean o()
	{
		return ab > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field int ab>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected void onAttachedToWindow()
	{
label0:
		{
label1:
			{
				float f1;
label2:
				{
					super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1748 <Method void ViewGroup.onAttachedToWindow()>
					ab = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #301 <Field int ab>
					boolean flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
					p = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #1726 <Field boolean p>
					if(!s || isLayoutRequested())
	//*  10   16:aload_0         
	//*  11   17:getfield        #604 <Field boolean s>
	//*  12   20:ifeq            33
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #1751 <Method boolean isLayoutRequested()>
	//*  15   27:ifne            33
	//*  16   30:goto            35
						flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_2        
					s = flag;
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:putfield        #604 <Field boolean s>
					if(m != null)
	//*  22   40:aload_0         
	//*  23   41:getfield        #528 <Field RecyclerView$h m>
	//*  24   44:ifnull          55
						m.c(this);
	//   25   47:aload_0         
	//   26   48:getfield        #528 <Field RecyclerView$h m>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #1753 <Method void RecyclerView$h.c(RecyclerView)>
					E = false;
	//   29   55:aload_0         
	//   30   56:iconst_0        
	//   31   57:putfield        #339 <Field boolean E>
					if(!K)
						break label0;
	//   32   60:getstatic       #228 <Field boolean K>
	//   33   63:ifeq            164
					z = (ad)android.support.v7.widget.ad.a.get();
	//   34   66:aload_0         
	//   35   67:getstatic       #1758 <Field ThreadLocal android.support.v7.widget.ad.a>
	//   36   70:invokevirtual   #1761 <Method Object ThreadLocal.get()>
	//   37   73:checkcast       #1755 <Class ad>
	//   38   76:putfield        #1763 <Field ad z>
					if(z != null)
						break label1;
	//   39   79:aload_0         
	//   40   80:getfield        #1763 <Field ad z>
	//   41   83:ifnonnull       156
					z = new ad();
	//   42   86:aload_0         
	//   43   87:new             #1755 <Class ad>
	//   44   90:dup             
	//   45   91:invokespecial   #1764 <Method void ad()>
	//   46   94:putfield        #1763 <Field ad z>
					Display display = android.support.v4.view.s.C(((View) (this)));
	//   47   97:aload_0         
	//   48   98:invokestatic    #1767 <Method Display s.C(View)>
	//   49  101:astore_3        
					if(!isInEditMode() && display != null)
	//*  50  102:aload_0         
	//*  51  103:invokevirtual   #915 <Method boolean isInEditMode()>
	//*  52  106:ifne            129
	//*  53  109:aload_3         
	//*  54  110:ifnull          129
					{
						f1 = display.getRefreshRate();
	//   55  113:aload_3         
	//   56  114:invokevirtual   #1772 <Method float Display.getRefreshRate()>
	//   57  117:fstore_1        
						if(f1 >= 30F)
	//*  58  118:fload_1         
	//*  59  119:ldc2            #1773 <Float 30F>
	//*  60  122:fcmpl           
	//*  61  123:iflt            129
							break label2;
	//   62  126:goto            133
					}
					f1 = 60F;
	//   63  129:ldc2            #1774 <Float 60F>
	//   64  132:fstore_1        
				}
				z.d = (long)(1E+09F / f1);
	//   65  133:aload_0         
	//   66  134:getfield        #1763 <Field ad z>
	//   67  137:ldc2            #1775 <Float 1E+09F>
	//   68  140:fload_1         
	//   69  141:fdiv            
	//   70  142:f2l             
	//   71  143:putfield        #1777 <Field long ad.d>
				android.support.v7.widget.ad.a.set(((Object) (z)));
	//   72  146:getstatic       #1758 <Field ThreadLocal android.support.v7.widget.ad.a>
	//   73  149:aload_0         
	//   74  150:getfield        #1763 <Field ad z>
	//   75  153:invokevirtual   #1779 <Method void ThreadLocal.set(Object)>
			}
			z.a(this);
	//   76  156:aload_0         
	//   77  157:getfield        #1763 <Field ad z>
	//   78  160:aload_0         
	//   79  161:invokevirtual   #1780 <Method void android.support.v7.widget.ad.a(RecyclerView)>
		}
	//   80  164:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1783 <Method void ViewGroup.onDetachedFromWindow()>
		if(x != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #308 <Field RecyclerView$e x>
	//*   4    8:ifnull          18
			x.d();
	//    5   11:aload_0         
	//    6   12:getfield        #308 <Field RecyclerView$e x>
	//    7   15:invokevirtual   #1470 <Method void RecyclerView$e.d()>
		f();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #1221 <Method void f()>
		p = false;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #1726 <Field boolean p>
		if(m != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #528 <Field RecyclerView$h m>
	//*  15   31:ifnull          46
			m.b(this, d);
	//   16   34:aload_0         
	//   17   35:getfield        #528 <Field RecyclerView$h m>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #268 <Field RecyclerView$n d>
	//   21   43:invokevirtual   #1786 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView, RecyclerView$n)>
		G.clear();
	//   22   46:aload_0         
	//   23   47:getfield        #349 <Field List G>
	//   24   50:invokeinterface #1787 <Method void List.clear()>
		removeCallbacks(aE);
	//   25   55:aload_0         
	//   26   56:aload_0         
	//   27   57:getfield        #352 <Field Runnable aE>
	//   28   60:invokevirtual   #1791 <Method boolean removeCallbacks(Runnable)>
	//   29   63:pop             
		g.b();
	//   30   64:aload_0         
	//   31   65:getfield        #273 <Field bc g>
	//   32   68:invokevirtual   #1792 <Method void android.support.v7.widget.bc.b()>
		if(K)
	//*  33   71:getstatic       #228 <Field boolean K>
	//*  34   74:ifeq            90
		{
			z.b(this);
	//   35   77:aload_0         
	//   36   78:getfield        #1763 <Field ad z>
	//   37   81:aload_0         
	//   38   82:invokevirtual   #1793 <Method void android.support.v7.widget.ad.b(RecyclerView)>
			z = null;
	//   39   85:aload_0         
	//   40   86:aconst_null     
	//   41   87:putfield        #1763 <Field ad z>
		}
	//   42   90:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1796 <Method void ViewGroup.onDraw(Canvas)>
		int j1 = o.size();
	//    3    5:aload_0         
	//    4    6:getfield        #293 <Field ArrayList o>
	//    5    9:invokevirtual   #1076 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          47
			((g)o.get(i1)).a(canvas, this, B);
	//   12   20:aload_0         
	//   13   21:getfield        #293 <Field ArrayList o>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #52  <Class RecyclerView$g>
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #330 <Field RecyclerView$r B>
	//   21   37:invokevirtual   #1798 <Method void android.support.v7.widget.RecyclerView$g.a(Canvas, RecyclerView, RecyclerView$r)>

	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_2        
	//*  26   44:goto            15
	//   27   47:return          
	}

	public boolean onGenericMotionEvent(MotionEvent motionevent)
	{
label0:
		{
			float f1;
			float f2;
label1:
			{
label2:
				{
					if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       9
						return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
					if(u)
	//*   5    9:aload_0         
	//*   6   10:getfield        #1219 <Field boolean u>
	//*   7   13:ifeq            18
						return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
					if(motionevent.getAction() != 8)
						break label0;
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1071 <Method int MotionEvent.getAction()>
	//   12   22:bipush          8
	//   13   24:icmpne          172
					if((motionevent.getSource() & 2) != 0)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #1802 <Method int MotionEvent.getSource()>
	//*  16   31:iconst_2        
	//*  17   32:iand            
	//*  18   33:ifeq            87
					{
						if(m.e())
	//*  19   36:aload_0         
	//*  20   37:getfield        #528 <Field RecyclerView$h m>
	//*  21   40:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  22   43:ifeq            57
							f2 = -motionevent.getAxisValue(9);
	//   23   46:aload_1         
	//   24   47:bipush          9
	//   25   49:invokevirtual   #1805 <Method float MotionEvent.getAxisValue(int)>
	//   26   52:fneg            
	//   27   53:fstore_3        
						else
	//*  28   54:goto            59
							f2 = 0.0F;
	//   29   57:fconst_0        
	//   30   58:fstore_3        
						f1 = f2;
	//   31   59:fload_3         
	//   32   60:fstore_2        
						if(m.d())
	//*  33   61:aload_0         
	//*  34   62:getfield        #528 <Field RecyclerView$h m>
	//*  35   65:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  36   68:ifeq            138
						{
							float f3 = motionevent.getAxisValue(10);
	//   37   71:aload_1         
	//   38   72:bipush          10
	//   39   74:invokevirtual   #1805 <Method float MotionEvent.getAxisValue(int)>
	//   40   77:fstore          4
							f1 = f2;
	//   41   79:fload_3         
	//   42   80:fstore_2        
							f2 = f3;
	//   43   81:fload           4
	//   44   83:fstore_3        
							break label1;
	//   45   84:goto            140
						}
						break label2;
					}
					if((motionevent.getSource() & 0x400000) != 0)
	//*  46   87:aload_1         
	//*  47   88:invokevirtual   #1802 <Method int MotionEvent.getSource()>
	//*  48   91:ldc2            #1806 <Int 0x400000>
	//*  49   94:iand            
	//*  50   95:ifeq            136
					{
						f2 = motionevent.getAxisValue(26);
	//   51   98:aload_1         
	//   52   99:bipush          26
	//   53  101:invokevirtual   #1805 <Method float MotionEvent.getAxisValue(int)>
	//   54  104:fstore_3        
						if(m.e())
	//*  55  105:aload_0         
	//*  56  106:getfield        #528 <Field RecyclerView$h m>
	//*  57  109:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//*  58  112:ifeq            121
						{
							f1 = -f2;
	//   59  115:fload_3         
	//   60  116:fneg            
	//   61  117:fstore_2        
							break label2;
	//   62  118:goto            138
						}
						if(m.d())
	//*  63  121:aload_0         
	//*  64  122:getfield        #528 <Field RecyclerView$h m>
	//*  65  125:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//*  66  128:ifeq            136
						{
							f1 = 0.0F;
	//   67  131:fconst_0        
	//   68  132:fstore_2        
							break label1;
	//   69  133:goto            140
						}
					}
					f1 = 0.0F;
	//   70  136:fconst_0        
	//   71  137:fstore_2        
				}
				f2 = 0.0F;
	//   72  138:fconst_0        
	//   73  139:fstore_3        
			}
			if(f1 != 0.0F || f2 != 0.0F)
	//*  74  140:fload_2         
	//*  75  141:fconst_0        
	//*  76  142:fcmpl           
	//*  77  143:ifne            152
	//*  78  146:fload_3         
	//*  79  147:fconst_0        
	//*  80  148:fcmpl           
	//*  81  149:ifeq            172
				a((int)(f2 * as), (int)(f1 * at), motionevent);
	//   82  152:aload_0         
	//   83  153:fload_3         
	//   84  154:aload_0         
	//   85  155:getfield        #315 <Field float as>
	//   86  158:fmul            
	//   87  159:f2i             
	//   88  160:fload_2         
	//   89  161:aload_0         
	//   90  162:getfield        #317 <Field float at>
	//   91  165:fmul            
	//   92  166:f2i             
	//   93  167:aload_1         
	//   94  168:invokevirtual   #1808 <Method boolean a(int, int, MotionEvent)>
	//   95  171:pop             
		}
		return false;
	//   96  172:iconst_0        
	//   97  173:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		boolean flag2 = u;
	//    0    0:aload_0         
	//    1    1:getfield        #1219 <Field boolean u>
	//    2    4:istore          7
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
		if(flag2)
	//*   5    9:iload           7
	//*   6   11:ifeq            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		if(a(motionevent))
	//*   9   16:aload_0         
	//*  10   17:aload_1         
	//*  11   18:invokespecial   #1811 <Method boolean a(MotionEvent)>
	//*  12   21:ifeq            30
		{
			F();
	//   13   24:aload_0         
	//   14   25:invokespecial   #1813 <Method void F()>
			return true;
	//   15   28:iconst_1        
	//   16   29:ireturn         
		}
		if(m == null)
	//*  17   30:aload_0         
	//*  18   31:getfield        #528 <Field RecyclerView$h m>
	//*  19   34:ifnonnull       39
			return false;
	//   20   37:iconst_0        
	//   21   38:ireturn         
		flag2 = m.d();
	//   22   39:aload_0         
	//   23   40:getfield        #528 <Field RecyclerView$h m>
	//   24   43:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//   25   46:istore          7
		boolean flag3 = m.e();
	//   26   48:aload_0         
	//   27   49:getfield        #528 <Field RecyclerView$h m>
	//   28   52:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//   29   55:istore          8
		if(aj == null)
	//*  30   57:aload_0         
	//*  31   58:getfield        #551 <Field VelocityTracker aj>
	//*  32   61:ifnonnull       71
			aj = VelocityTracker.obtain();
	//   33   64:aload_0         
	//   34   65:invokestatic    #1816 <Method VelocityTracker VelocityTracker.obtain()>
	//   35   68:putfield        #551 <Field VelocityTracker aj>
		aj.addMovement(motionevent);
	//   36   71:aload_0         
	//   37   72:getfield        #551 <Field VelocityTracker aj>
	//   38   75:aload_1         
	//   39   76:invokevirtual   #1819 <Method void VelocityTracker.addMovement(MotionEvent)>
		int l1 = motionevent.getActionMasked();
	//   40   79:aload_1         
	//   41   80:invokevirtual   #1822 <Method int MotionEvent.getActionMasked()>
	//   42   83:istore_3        
		int i1 = motionevent.getActionIndex();
	//   43   84:aload_1         
	//   44   85:invokevirtual   #1139 <Method int MotionEvent.getActionIndex()>
	//   45   88:istore_2        
		switch(l1)
	//*  46   89:iload_3         
		{
	//*  47   90:tableswitch     0 6: default 132
	//	               0 394
	//	               1 379
	//	               2 204
	//	               3 197
	//	               4 132
	//	               5 143
	//	               6 135
	//*  48  132:goto            524
		case 6: // '\006'
			c(motionevent);
	//   49  135:aload_0         
	//   50  136:aload_1         
	//   51  137:invokespecial   #1824 <Method void c(MotionEvent)>
			break;

	//*  52  140:goto            524
		case 5: // '\005'
			ai = motionevent.getPointerId(i1);
	//   53  143:aload_0         
	//   54  144:aload_1         
	//   55  145:iload_2         
	//   56  146:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//   57  149:putfield        #312 <Field int ai>
			int i2 = (int)(motionevent.getX(i1) + 0.5F);
	//   58  152:aload_1         
	//   59  153:iload_2         
	//   60  154:invokevirtual   #1147 <Method float MotionEvent.getX(int)>
	//   61  157:ldc2            #1148 <Float 0.5F>
	//   62  160:fadd            
	//   63  161:f2i             
	//   64  162:istore_3        
			am = i2;
	//   65  163:aload_0         
	//   66  164:iload_3         
	//   67  165:putfield        #1150 <Field int am>
			ak = i2;
	//   68  168:aload_0         
	//   69  169:iload_3         
	//   70  170:putfield        #1152 <Field int ak>
			i1 = (int)(motionevent.getY(i1) + 0.5F);
	//   71  173:aload_1         
	//   72  174:iload_2         
	//   73  175:invokevirtual   #1155 <Method float MotionEvent.getY(int)>
	//   74  178:ldc2            #1148 <Float 0.5F>
	//   75  181:fadd            
	//   76  182:f2i             
	//   77  183:istore_2        
			an = i1;
	//   78  184:aload_0         
	//   79  185:iload_2         
	//   80  186:putfield        #1157 <Field int an>
			al = i1;
	//   81  189:aload_0         
	//   82  190:iload_2         
	//   83  191:putfield        #1159 <Field int al>
			break;

	//*  84  194:goto            524
		case 3: // '\003'
			F();
	//   85  197:aload_0         
	//   86  198:invokespecial   #1813 <Method void F()>
			break;

	//*  87  201:goto            524
		case 2: // '\002'
			int j2 = motionevent.findPointerIndex(ai);
	//   88  204:aload_1         
	//   89  205:aload_0         
	//   90  206:getfield        #312 <Field int ai>
	//   91  209:invokevirtual   #1827 <Method int MotionEvent.findPointerIndex(int)>
	//   92  212:istore_3        
			if(j2 < 0)
	//*  93  213:iload_3         
	//*  94  214:ifge            263
			{
				motionevent = ((MotionEvent) (new StringBuilder()));
	//   95  217:new             #816 <Class StringBuilder>
	//   96  220:dup             
	//   97  221:invokespecial   #817 <Method void StringBuilder()>
	//   98  224:astore_1        
				((StringBuilder) (motionevent)).append("Error processing scroll; pointer index for id ");
	//   99  225:aload_1         
	//  100  226:ldc2            #1829 <String "Error processing scroll; pointer index for id ">
	//  101  229:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  102  232:pop             
				((StringBuilder) (motionevent)).append(ai);
	//  103  233:aload_1         
	//  104  234:aload_0         
	//  105  235:getfield        #312 <Field int ai>
	//  106  238:invokevirtual   #1124 <Method StringBuilder StringBuilder.append(int)>
	//  107  241:pop             
				((StringBuilder) (motionevent)).append(" not found. Did any MotionEvents get skipped?");
	//  108  242:aload_1         
	//  109  243:ldc2            #1831 <String " not found. Did any MotionEvents get skipped?">
	//  110  246:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  111  249:pop             
				Log.e("RecyclerView", ((StringBuilder) (motionevent)).toString());
	//  112  250:ldc2            #887 <String "RecyclerView">
	//  113  253:aload_1         
	//  114  254:invokevirtual   #828 <Method String StringBuilder.toString()>
	//  115  257:invokestatic    #892 <Method int Log.e(String, String)>
	//  116  260:pop             
				return false;
	//  117  261:iconst_0        
	//  118  262:ireturn         
			}
			int j1 = (int)(motionevent.getX(j2) + 0.5F);
	//  119  263:aload_1         
	//  120  264:iload_3         
	//  121  265:invokevirtual   #1147 <Method float MotionEvent.getX(int)>
	//  122  268:ldc2            #1148 <Float 0.5F>
	//  123  271:fadd            
	//  124  272:f2i             
	//  125  273:istore_2        
			int i3 = (int)(motionevent.getY(j2) + 0.5F);
	//  126  274:aload_1         
	//  127  275:iload_3         
	//  128  276:invokevirtual   #1155 <Method float MotionEvent.getY(int)>
	//  129  279:ldc2            #1148 <Float 0.5F>
	//  130  282:fadd            
	//  131  283:f2i             
	//  132  284:istore          4
			if(ah != 1)
	//* 133  286:aload_0         
	//* 134  287:getfield        #310 <Field int ah>
	//* 135  290:iconst_1        
	//* 136  291:icmpeq          524
			{
				int k2 = ak;
	//  137  294:aload_0         
	//  138  295:getfield        #1152 <Field int ak>
	//  139  298:istore_3        
				int j3 = al;
	//  140  299:aload_0         
	//  141  300:getfield        #1159 <Field int al>
	//  142  303:istore          5
				if(flag2 && Math.abs(j1 - k2) > ao)
	//* 143  305:iload           7
	//* 144  307:ifeq            333
	//* 145  310:iload_2         
	//* 146  311:iload_3         
	//* 147  312:isub            
	//* 148  313:invokestatic    #1445 <Method int Math.abs(int)>
	//* 149  316:aload_0         
	//* 150  317:getfield        #389 <Field int ao>
	//* 151  320:icmple          333
				{
					am = j1;
	//  152  323:aload_0         
	//  153  324:iload_2         
	//  154  325:putfield        #1150 <Field int am>
					j1 = 1;
	//  155  328:iconst_1        
	//  156  329:istore_2        
				} else
	//* 157  330:goto            335
				{
					j1 = 0;
	//  158  333:iconst_0        
	//  159  334:istore_2        
				}
				boolean flag = ((boolean) (j1));
	//  160  335:iload_2         
	//  161  336:istore_3        
				if(flag3)
	//* 162  337:iload           8
	//* 163  339:ifeq            367
				{
					flag = ((boolean) (j1));
	//  164  342:iload_2         
	//  165  343:istore_3        
					if(Math.abs(i3 - j3) > ao)
	//* 166  344:iload           4
	//* 167  346:iload           5
	//* 168  348:isub            
	//* 169  349:invokestatic    #1445 <Method int Math.abs(int)>
	//* 170  352:aload_0         
	//* 171  353:getfield        #389 <Field int ao>
	//* 172  356:icmple          367
					{
						an = i3;
	//  173  359:aload_0         
	//  174  360:iload           4
	//  175  362:putfield        #1157 <Field int an>
						flag = true;
	//  176  365:iconst_1        
	//  177  366:istore_3        
					}
				}
				if(flag)
	//* 178  367:iload_3         
	//* 179  368:ifeq            524
					setScrollState(1);
	//  180  371:aload_0         
	//  181  372:iconst_1        
	//  182  373:invokevirtual   #565 <Method void setScrollState(int)>
			}
			break;

	//* 183  376:goto            524
		case 1: // '\001'
			aj.clear();
	//  184  379:aload_0         
	//  185  380:getfield        #551 <Field VelocityTracker aj>
	//  186  383:invokevirtual   #556 <Method void VelocityTracker.clear()>
			h(0);
	//  187  386:aload_0         
	//  188  387:iconst_0        
	//  189  388:invokevirtual   #558 <Method void h(int)>
			break;

	//* 190  391:goto            524
		case 0: // '\0'
			if(U)
	//* 191  394:aload_0         
	//* 192  395:getfield        #1833 <Field boolean U>
	//* 193  398:ifeq            406
				U = false;
	//  194  401:aload_0         
	//  195  402:iconst_0        
	//  196  403:putfield        #1833 <Field boolean U>
			ai = motionevent.getPointerId(0);
	//  197  406:aload_0         
	//  198  407:aload_1         
	//  199  408:iconst_0        
	//  200  409:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//  201  412:putfield        #312 <Field int ai>
			int k1 = (int)(motionevent.getX() + 0.5F);
	//  202  415:aload_1         
	//  203  416:invokevirtual   #1393 <Method float MotionEvent.getX()>
	//  204  419:ldc2            #1148 <Float 0.5F>
	//  205  422:fadd            
	//  206  423:f2i             
	//  207  424:istore_2        
			am = k1;
	//  208  425:aload_0         
	//  209  426:iload_2         
	//  210  427:putfield        #1150 <Field int am>
			ak = k1;
	//  211  430:aload_0         
	//  212  431:iload_2         
	//  213  432:putfield        #1152 <Field int ak>
			k1 = (int)(motionevent.getY() + 0.5F);
	//  214  435:aload_1         
	//  215  436:invokevirtual   #1395 <Method float MotionEvent.getY()>
	//  216  439:ldc2            #1148 <Float 0.5F>
	//  217  442:fadd            
	//  218  443:f2i             
	//  219  444:istore_2        
			an = k1;
	//  220  445:aload_0         
	//  221  446:iload_2         
	//  222  447:putfield        #1157 <Field int an>
			al = k1;
	//  223  450:aload_0         
	//  224  451:iload_2         
	//  225  452:putfield        #1159 <Field int al>
			if(ah == 2)
	//* 226  455:aload_0         
	//* 227  456:getfield        #310 <Field int ah>
	//* 228  459:iconst_2        
	//* 229  460:icmpne          478
			{
				getParent().requestDisallowInterceptTouchEvent(true);
	//  230  463:aload_0         
	//  231  464:invokevirtual   #1834 <Method ViewParent getParent()>
	//  232  467:iconst_1        
	//  233  468:invokeinterface #1839 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				setScrollState(1);
	//  234  473:aload_0         
	//  235  474:iconst_1        
	//  236  475:invokevirtual   #565 <Method void setScrollState(int)>
			}
			motionevent = ((MotionEvent) (aD));
	//  237  478:aload_0         
	//  238  479:getfield        #347 <Field int[] aD>
	//  239  482:astore_1        
			aD[1] = 0;
	//  240  483:aload_0         
	//  241  484:getfield        #347 <Field int[] aD>
	//  242  487:iconst_1        
	//  243  488:iconst_0        
	//  244  489:iastore         
			motionevent[0] = 0;
	//  245  490:aload_1         
	//  246  491:iconst_0        
	//  247  492:iconst_0        
	//  248  493:iastore         
			if(flag2)
	//* 249  494:iload           7
	//* 250  496:ifeq            504
				k1 = 1;
	//  251  499:iconst_1        
	//  252  500:istore_2        
			else
	//* 253  501:goto            506
				k1 = 0;
	//  254  504:iconst_0        
	//  255  505:istore_2        
			int l2 = k1;
	//  256  506:iload_2         
	//  257  507:istore_3        
			if(flag3)
	//* 258  508:iload           8
	//* 259  510:ifeq            517
				l2 = k1 | 2;
	//  260  513:iload_2         
	//  261  514:iconst_2        
	//  262  515:ior             
	//  263  516:istore_3        
			j(l2, 0);
	//  264  517:aload_0         
	//  265  518:iload_3         
	//  266  519:iconst_0        
	//  267  520:invokevirtual   #1459 <Method boolean j(int, int)>
	//  268  523:pop             
			break;
		}
		if(ah == 1)
	//* 269  524:aload_0         
	//* 270  525:getfield        #310 <Field int ah>
	//* 271  528:iconst_1        
	//* 272  529:icmpne          535
			flag1 = true;
	//  273  532:iconst_1        
	//  274  533:istore          6
		return flag1;
	//  275  535:iload           6
	//  276  537:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		android.support.v4.os.b.a("RV OnLayout");
	//    0    0:ldc2            #1843 <String "RV OnLayout">
	//    1    3:invokestatic    #1370 <Method void b.a(String)>
		q();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #1357 <Method void q()>
		android.support.v4.os.b.a();
	//    4   10:invokestatic    #1376 <Method void b.a()>
		s = true;
	//    5   13:aload_0         
	//    6   14:iconst_1        
	//    7   15:putfield        #604 <Field boolean s>
	//    8   18:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       14
		{
			e(i1, j1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #1846 <Method void e(int, int)>
			return;
	//    7   13:return          
		}
		boolean flag2 = m.w;
	//    8   14:aload_0         
	//    9   15:getfield        #528 <Field RecyclerView$h m>
	//   10   18:getfield        #1847 <Field boolean RecyclerView$h.w>
	//   11   21:istore          7
		boolean flag1 = false;
	//   12   23:iconst_0        
	//   13   24:istore          4
		if(flag2)
	//*  14   26:iload           7
	//*  15   28:ifeq            201
		{
			int k1 = android.view.View.MeasureSpec.getMode(i1);
	//   16   31:iload_1         
	//   17   32:invokestatic    #1852 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   18   35:istore          5
			int l1 = android.view.View.MeasureSpec.getMode(j1);
	//   19   37:iload_2         
	//   20   38:invokestatic    #1852 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   21   41:istore          6
			boolean flag = flag1;
	//   22   43:iload           4
	//   23   45:istore_3        
			if(k1 == 0x40000000)
	//*  24   46:iload           5
	//*  25   48:ldc2            #1853 <Int 0x40000000>
	//*  26   51:icmpne          67
			{
				flag = flag1;
	//   27   54:iload           4
	//   28   56:istore_3        
				if(l1 == 0x40000000)
	//*  29   57:iload           6
	//*  30   59:ldc2            #1853 <Int 0x40000000>
	//*  31   62:icmpne          67
					flag = true;
	//   32   65:iconst_1        
	//   33   66:istore_3        
			}
			m.a(d, B, i1, j1);
	//   34   67:aload_0         
	//   35   68:getfield        #528 <Field RecyclerView$h m>
	//   36   71:aload_0         
	//   37   72:getfield        #268 <Field RecyclerView$n d>
	//   38   75:aload_0         
	//   39   76:getfield        #330 <Field RecyclerView$r B>
	//   40   79:iload_1         
	//   41   80:iload_2         
	//   42   81:invokevirtual   #1856 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$n, RecyclerView$r, int, int)>
			if(!flag)
	//*  43   84:iload_3         
	//*  44   85:ifne            200
			{
				if(l == null)
	//*  45   88:aload_0         
	//*  46   89:getfield        #608 <Field RecyclerView$a l>
	//*  47   92:ifnonnull       96
					return;
	//   48   95:return          
				if(B.c == 1)
	//*  49   96:aload_0         
	//*  50   97:getfield        #330 <Field RecyclerView$r B>
	//*  51  100:getfield        #759 <Field int RecyclerView$r.c>
	//*  52  103:iconst_1        
	//*  53  104:icmpne          111
					N();
	//   54  107:aload_0         
	//   55  108:invokespecial   #1858 <Method void N()>
				m.d(i1, j1);
	//   56  111:aload_0         
	//   57  112:getfield        #528 <Field RecyclerView$h m>
	//   58  115:iload_1         
	//   59  116:iload_2         
	//   60  117:invokevirtual   #1860 <Method void RecyclerView$h.d(int, int)>
				B.h = true;
	//   61  120:aload_0         
	//   62  121:getfield        #330 <Field RecyclerView$r B>
	//   63  124:iconst_1        
	//   64  125:putfield        #698 <Field boolean android.support.v7.widget.RecyclerView$r.h>
				O();
	//   65  128:aload_0         
	//   66  129:invokespecial   #1862 <Method void O()>
				m.e(i1, j1);
	//   67  132:aload_0         
	//   68  133:getfield        #528 <Field RecyclerView$h m>
	//   69  136:iload_1         
	//   70  137:iload_2         
	//   71  138:invokevirtual   #1863 <Method void RecyclerView$h.e(int, int)>
				if(m.k())
	//*  72  141:aload_0         
	//*  73  142:getfield        #528 <Field RecyclerView$h m>
	//*  74  145:invokevirtual   #1865 <Method boolean android.support.v7.widget.RecyclerView$h.k()>
	//*  75  148:ifeq            387
				{
					m.d(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000));
	//   76  151:aload_0         
	//   77  152:getfield        #528 <Field RecyclerView$h m>
	//   78  155:aload_0         
	//   79  156:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//   80  159:ldc2            #1853 <Int 0x40000000>
	//   81  162:invokestatic    #1868 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   82  165:aload_0         
	//   83  166:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//   84  169:ldc2            #1853 <Int 0x40000000>
	//   85  172:invokestatic    #1868 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   86  175:invokevirtual   #1860 <Method void RecyclerView$h.d(int, int)>
					B.h = true;
	//   87  178:aload_0         
	//   88  179:getfield        #330 <Field RecyclerView$r B>
	//   89  182:iconst_1        
	//   90  183:putfield        #698 <Field boolean android.support.v7.widget.RecyclerView$r.h>
					O();
	//   91  186:aload_0         
	//   92  187:invokespecial   #1862 <Method void O()>
					m.e(i1, j1);
	//   93  190:aload_0         
	//   94  191:getfield        #528 <Field RecyclerView$h m>
	//   95  194:iload_1         
	//   96  195:iload_2         
	//   97  196:invokevirtual   #1863 <Method void RecyclerView$h.e(int, int)>
					return;
	//   98  199:return          
				}
			} else
			{
				return;
	//   99  200:return          
			}
		} else
		{
			if(q)
	//* 100  201:aload_0         
	//* 101  202:getfield        #1870 <Field boolean q>
	//* 102  205:ifeq            226
			{
				m.a(d, B, i1, j1);
	//  103  208:aload_0         
	//  104  209:getfield        #528 <Field RecyclerView$h m>
	//  105  212:aload_0         
	//  106  213:getfield        #268 <Field RecyclerView$n d>
	//  107  216:aload_0         
	//  108  217:getfield        #330 <Field RecyclerView$r B>
	//  109  220:iload_1         
	//  110  221:iload_2         
	//  111  222:invokevirtual   #1856 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$n, RecyclerView$r, int, int)>
				return;
	//  112  225:return          
			}
			if(v)
	//* 113  226:aload_0         
	//* 114  227:getfield        #1872 <Field boolean v>
	//* 115  230:ifeq            298
			{
				e();
	//  116  233:aload_0         
	//  117  234:invokevirtual   #699 <Method void e()>
				l();
	//  118  237:aload_0         
	//  119  238:invokevirtual   #702 <Method void l()>
				I();
	//  120  241:aload_0         
	//  121  242:invokespecial   #704 <Method void I()>
				m();
	//  122  245:aload_0         
	//  123  246:invokevirtual   #755 <Method void m()>
				if(B.j)
	//* 124  249:aload_0         
	//* 125  250:getfield        #330 <Field RecyclerView$r B>
	//* 126  253:getfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
	//* 127  256:ifeq            270
				{
					B.f = true;
	//  128  259:aload_0         
	//  129  260:getfield        #330 <Field RecyclerView$r B>
	//  130  263:iconst_1        
	//  131  264:putfield        #710 <Field boolean RecyclerView$r.f>
				} else
	//* 132  267:goto            285
				{
					e.e();
	//  133  270:aload_0         
	//  134  271:getfield        #591 <Field e e>
	//  135  274:invokevirtual   #602 <Method void e.e()>
					B.f = false;
	//  136  277:aload_0         
	//  137  278:getfield        #330 <Field RecyclerView$r B>
	//  138  281:iconst_0        
	//  139  282:putfield        #710 <Field boolean RecyclerView$r.f>
				}
				v = false;
	//  140  285:aload_0         
	//  141  286:iconst_0        
	//  142  287:putfield        #1872 <Field boolean v>
				a(false);
	//  143  290:aload_0         
	//  144  291:iconst_0        
	//  145  292:invokevirtual   #757 <Method void a(boolean)>
			} else
	//* 146  295:goto            321
			if(B.j)
	//* 147  298:aload_0         
	//* 148  299:getfield        #330 <Field RecyclerView$r B>
	//* 149  302:getfield        #614 <Field boolean android.support.v7.widget.RecyclerView$r.j>
	//* 150  305:ifeq            321
			{
				setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
	//  151  308:aload_0         
	//  152  309:aload_0         
	//  153  310:invokevirtual   #1629 <Method int getMeasuredWidth()>
	//  154  313:aload_0         
	//  155  314:invokevirtual   #1626 <Method int getMeasuredHeight()>
	//  156  317:invokevirtual   #1020 <Method void setMeasuredDimension(int, int)>
				return;
	//  157  320:return          
			}
			if(l != null)
	//* 158  321:aload_0         
	//* 159  322:getfield        #608 <Field RecyclerView$a l>
	//* 160  325:ifnull          345
				B.d = l.a();
	//  161  328:aload_0         
	//  162  329:getfield        #330 <Field RecyclerView$r B>
	//  163  332:aload_0         
	//  164  333:getfield        #608 <Field RecyclerView$a l>
	//  165  336:invokevirtual   #712 <Method int android.support.v7.widget.RecyclerView$a.a()>
	//  166  339:putfield        #713 <Field int RecyclerView$r.d>
			else
	//* 167  342:goto            353
				B.d = 0;
	//  168  345:aload_0         
	//  169  346:getfield        #330 <Field RecyclerView$r B>
	//  170  349:iconst_0        
	//  171  350:putfield        #713 <Field int RecyclerView$r.d>
			e();
	//  172  353:aload_0         
	//  173  354:invokevirtual   #699 <Method void e()>
			m.a(d, B, i1, j1);
	//  174  357:aload_0         
	//  175  358:getfield        #528 <Field RecyclerView$h m>
	//  176  361:aload_0         
	//  177  362:getfield        #268 <Field RecyclerView$n d>
	//  178  365:aload_0         
	//  179  366:getfield        #330 <Field RecyclerView$r B>
	//  180  369:iload_1         
	//  181  370:iload_2         
	//  182  371:invokevirtual   #1856 <Method void android.support.v7.widget.RecyclerView$h.a(RecyclerView$n, RecyclerView$r, int, int)>
			a(false);
	//  183  374:aload_0         
	//  184  375:iconst_0        
	//  185  376:invokevirtual   #757 <Method void a(boolean)>
			B.f = false;
	//  186  379:aload_0         
	//  187  380:getfield        #330 <Field RecyclerView$r B>
	//  188  383:iconst_0        
	//  189  384:putfield        #710 <Field boolean RecyclerView$r.f>
		}
	//  190  387:return          
	}

	protected boolean onRequestFocusInDescendants(int i1, Rect rect)
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1344 <Method boolean o()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return super.onRequestFocusInDescendants(i1, rect);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #1876 <Method boolean ViewGroup.onRequestFocusInDescendants(int, Rect)>
	//    9   15:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #23  <Class RecyclerView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1880 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		P = (SavedState)parcelable;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:checkcast       #23  <Class RecyclerView$SavedState>
	//   10   18:putfield        #763 <Field RecyclerView$SavedState P>
		super.onRestoreInstanceState(P.a());
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #763 <Field RecyclerView$SavedState P>
	//   14   26:invokevirtual   #1883 <Method Parcelable android.support.v7.widget.RecyclerView$SavedState.a()>
	//   15   29:invokespecial   #1880 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(m != null && P.a != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #528 <Field RecyclerView$h m>
	//*  18   36:ifnull          63
	//*  19   39:aload_0         
	//*  20   40:getfield        #763 <Field RecyclerView$SavedState P>
	//*  21   43:getfield        #1886 <Field Parcelable android.support.v7.widget.RecyclerView$SavedState.a>
	//*  22   46:ifnull          63
			m.a(P.a);
	//   23   49:aload_0         
	//   24   50:getfield        #528 <Field RecyclerView$h m>
	//   25   53:aload_0         
	//   26   54:getfield        #763 <Field RecyclerView$SavedState P>
	//   27   57:getfield        #1886 <Field Parcelable android.support.v7.widget.RecyclerView$SavedState.a>
	//   28   60:invokevirtual   #1888 <Method void android.support.v7.widget.RecyclerView$h.a(Parcelable)>
	//   29   63:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #23  <Class RecyclerView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1891 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1893 <Method void RecyclerView$SavedState(Parcelable)>
	//    5   11:astore_2        
		if(P != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #763 <Field RecyclerView$SavedState P>
	//*   8   16:ifnull          29
		{
			savedstate.a(P);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #763 <Field RecyclerView$SavedState P>
	//   12   24:invokevirtual   #1896 <Method void android.support.v7.widget.RecyclerView$SavedState.a(RecyclerView$SavedState)>
			return ((Parcelable) (savedstate));
	//   13   27:aload_2         
	//   14   28:areturn         
		}
		Parcelable parcelable;
		if(m != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #528 <Field RecyclerView$h m>
	//*  17   33:ifnull          51
			parcelable = m.c();
	//   18   36:aload_0         
	//   19   37:getfield        #528 <Field RecyclerView$h m>
	//   20   40:invokevirtual   #1898 <Method Parcelable RecyclerView$h.c()>
	//   21   43:astore_1        
		else
	//*  22   44:aload_2         
	//*  23   45:aload_1         
	//*  24   46:putfield        #1886 <Field Parcelable android.support.v7.widget.RecyclerView$SavedState.a>
	//*  25   49:aload_2         
	//*  26   50:areturn         
			parcelable = null;
	//   27   51:aconst_null     
	//   28   52:astore_1        
		savedstate.a = parcelable;
		return ((Parcelable) (savedstate));
	//*  29   53:goto            44
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #1901 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i1 != k1 || j1 != l1)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpne          20
	//*   9   14:iload_2         
	//*  10   15:iload           4
	//*  11   17:icmpeq          24
			k();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #1903 <Method void k()>
	//   14   24:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag1 = u;
	//    0    0:aload_0         
	//    1    1:getfield        #1219 <Field boolean u>
	//    2    4:istore          13
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          10
		if(!flag1)
	//*   5    9:iload           13
	//*   6   11:ifne            1007
		{
			if(U)
	//*   7   14:aload_0         
	//*   8   15:getfield        #1833 <Field boolean U>
	//*   9   18:ifeq            23
				return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
			if(b(motionevent))
	//*  12   23:aload_0         
	//*  13   24:aload_1         
	//*  14   25:invokespecial   #1906 <Method boolean b(MotionEvent)>
	//*  15   28:ifeq            37
			{
				F();
	//   16   31:aload_0         
	//   17   32:invokespecial   #1813 <Method void F()>
				return true;
	//   18   35:iconst_1        
	//   19   36:ireturn         
			}
			if(m == null)
	//*  20   37:aload_0         
	//*  21   38:getfield        #528 <Field RecyclerView$h m>
	//*  22   41:ifnonnull       46
				return false;
	//   23   44:iconst_0        
	//   24   45:ireturn         
			boolean flag2 = m.d();
	//   25   46:aload_0         
	//   26   47:getfield        #528 <Field RecyclerView$h m>
	//   27   50:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//   28   53:istore          13
			boolean flag3 = m.e();
	//   29   55:aload_0         
	//   30   56:getfield        #528 <Field RecyclerView$h m>
	//   31   59:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//   32   62:istore          14
			if(aj == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #551 <Field VelocityTracker aj>
	//*  35   68:ifnonnull       78
				aj = VelocityTracker.obtain();
	//   36   71:aload_0         
	//   37   72:invokestatic    #1816 <Method VelocityTracker VelocityTracker.obtain()>
	//   38   75:putfield        #551 <Field VelocityTracker aj>
			MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
	//   39   78:aload_1         
	//   40   79:invokestatic    #1909 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//   41   82:astore          15
			int j1 = motionevent.getActionMasked();
	//   42   84:aload_1         
	//   43   85:invokevirtual   #1822 <Method int MotionEvent.getActionMasked()>
	//   44   88:istore          5
			int i1 = motionevent.getActionIndex();
	//   45   90:aload_1         
	//   46   91:invokevirtual   #1139 <Method int MotionEvent.getActionIndex()>
	//   47   94:istore          4
			if(j1 == 0)
	//*  48   96:iload           5
	//*  49   98:ifne            119
			{
				int ai1[] = aD;
	//   50  101:aload_0         
	//   51  102:getfield        #347 <Field int[] aD>
	//   52  105:astore          16
				aD[1] = 0;
	//   53  107:aload_0         
	//   54  108:getfield        #347 <Field int[] aD>
	//   55  111:iconst_1        
	//   56  112:iconst_0        
	//   57  113:iastore         
				ai1[0] = 0;
	//   58  114:aload           16
	//   59  116:iconst_0        
	//   60  117:iconst_0        
	//   61  118:iastore         
			}
			motionevent1.offsetLocation(aD[0], aD[1]);
	//   62  119:aload           15
	//   63  121:aload_0         
	//   64  122:getfield        #347 <Field int[] aD>
	//   65  125:iconst_0        
	//   66  126:iaload          
	//   67  127:i2f             
	//   68  128:aload_0         
	//   69  129:getfield        #347 <Field int[] aD>
	//   70  132:iconst_1        
	//   71  133:iaload          
	//   72  134:i2f             
	//   73  135:invokevirtual   #1386 <Method void MotionEvent.offsetLocation(float, float)>
			switch(j1)
	//*  74  138:iload           5
			{
	//*  75  140:tableswitch     0 6: default 184
	//	               0 890
	//	               1 782
	//	               2 281
	//	               3 270
	//	               4 184
	//	               5 203
	//	               6 191
			case 4: // '\004'
			default:
				i1 = ((int) (flag));
	//   76  184:iload           10
	//   77  186:istore          4
				break;
	//   78  188:goto            986

			case 6: // '\006'
				c(motionevent);
	//   79  191:aload_0         
	//   80  192:aload_1         
	//   81  193:invokespecial   #1824 <Method void c(MotionEvent)>
				i1 = ((int) (flag));
	//   82  196:iload           10
	//   83  198:istore          4
				break;
	//   84  200:goto            986

			case 5: // '\005'
				ai = motionevent.getPointerId(i1);
	//   85  203:aload_0         
	//   86  204:aload_1         
	//   87  205:iload           4
	//   88  207:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//   89  210:putfield        #312 <Field int ai>
				int k1 = (int)(motionevent.getX(i1) + 0.5F);
	//   90  213:aload_1         
	//   91  214:iload           4
	//   92  216:invokevirtual   #1147 <Method float MotionEvent.getX(int)>
	//   93  219:ldc2            #1148 <Float 0.5F>
	//   94  222:fadd            
	//   95  223:f2i             
	//   96  224:istore          5
				am = k1;
	//   97  226:aload_0         
	//   98  227:iload           5
	//   99  229:putfield        #1150 <Field int am>
				ak = k1;
	//  100  232:aload_0         
	//  101  233:iload           5
	//  102  235:putfield        #1152 <Field int ak>
				i1 = (int)(motionevent.getY(i1) + 0.5F);
	//  103  238:aload_1         
	//  104  239:iload           4
	//  105  241:invokevirtual   #1155 <Method float MotionEvent.getY(int)>
	//  106  244:ldc2            #1148 <Float 0.5F>
	//  107  247:fadd            
	//  108  248:f2i             
	//  109  249:istore          4
				an = i1;
	//  110  251:aload_0         
	//  111  252:iload           4
	//  112  254:putfield        #1157 <Field int an>
				al = i1;
	//  113  257:aload_0         
	//  114  258:iload           4
	//  115  260:putfield        #1159 <Field int al>
				i1 = ((int) (flag));
	//  116  263:iload           10
	//  117  265:istore          4
				break;
	//  118  267:goto            986

			case 3: // '\003'
				F();
	//  119  270:aload_0         
	//  120  271:invokespecial   #1813 <Method void F()>
				i1 = ((int) (flag));
	//  121  274:iload           10
	//  122  276:istore          4
				break;
	//  123  278:goto            986

			case 2: // '\002'
				i1 = motionevent.findPointerIndex(ai);
	//  124  281:aload_1         
	//  125  282:aload_0         
	//  126  283:getfield        #312 <Field int ai>
	//  127  286:invokevirtual   #1827 <Method int MotionEvent.findPointerIndex(int)>
	//  128  289:istore          4
				if(i1 < 0)
	//* 129  291:iload           4
	//* 130  293:ifge            342
				{
					motionevent = ((MotionEvent) (new StringBuilder()));
	//  131  296:new             #816 <Class StringBuilder>
	//  132  299:dup             
	//  133  300:invokespecial   #817 <Method void StringBuilder()>
	//  134  303:astore_1        
					((StringBuilder) (motionevent)).append("Error processing scroll; pointer index for id ");
	//  135  304:aload_1         
	//  136  305:ldc2            #1829 <String "Error processing scroll; pointer index for id ">
	//  137  308:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  138  311:pop             
					((StringBuilder) (motionevent)).append(ai);
	//  139  312:aload_1         
	//  140  313:aload_0         
	//  141  314:getfield        #312 <Field int ai>
	//  142  317:invokevirtual   #1124 <Method StringBuilder StringBuilder.append(int)>
	//  143  320:pop             
					((StringBuilder) (motionevent)).append(" not found. Did any MotionEvents get skipped?");
	//  144  321:aload_1         
	//  145  322:ldc2            #1831 <String " not found. Did any MotionEvents get skipped?">
	//  146  325:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//  147  328:pop             
					Log.e("RecyclerView", ((StringBuilder) (motionevent)).toString());
	//  148  329:ldc2            #887 <String "RecyclerView">
	//  149  332:aload_1         
	//  150  333:invokevirtual   #828 <Method String StringBuilder.toString()>
	//  151  336:invokestatic    #892 <Method int Log.e(String, String)>
	//  152  339:pop             
					return false;
	//  153  340:iconst_0        
	//  154  341:ireturn         
				}
				int j3 = (int)(motionevent.getX(i1) + 0.5F);
	//  155  342:aload_1         
	//  156  343:iload           4
	//  157  345:invokevirtual   #1147 <Method float MotionEvent.getX(int)>
	//  158  348:ldc2            #1148 <Float 0.5F>
	//  159  351:fadd            
	//  160  352:f2i             
	//  161  353:istore          11
				int k3 = (int)(motionevent.getY(i1) + 0.5F);
	//  162  355:aload_1         
	//  163  356:iload           4
	//  164  358:invokevirtual   #1155 <Method float MotionEvent.getY(int)>
	//  165  361:ldc2            #1148 <Float 0.5F>
	//  166  364:fadd            
	//  167  365:f2i             
	//  168  366:istore          12
				int k2 = am - j3;
	//  169  368:aload_0         
	//  170  369:getfield        #1150 <Field int am>
	//  171  372:iload           11
	//  172  374:isub            
	//  173  375:istore          7
				int j2 = an - k3;
	//  174  377:aload_0         
	//  175  378:getfield        #1157 <Field int an>
	//  176  381:iload           12
	//  177  383:isub            
	//  178  384:istore          6
				int l1 = k2;
	//  179  386:iload           7
	//  180  388:istore          5
				i1 = j2;
	//  181  390:iload           6
	//  182  392:istore          4
				if(a(k2, j2, aC, aB, 0))
	//* 183  394:aload_0         
	//* 184  395:iload           7
	//* 185  397:iload           6
	//* 186  399:aload_0         
	//* 187  400:getfield        #345 <Field int[] aC>
	//* 188  403:aload_0         
	//* 189  404:getfield        #343 <Field int[] aB>
	//* 190  407:iconst_0        
	//* 191  408:invokevirtual   #1910 <Method boolean a(int, int, int[], int[], int)>
	//* 192  411:ifeq            491
				{
					l1 = k2 - aC[0];
	//  193  414:iload           7
	//  194  416:aload_0         
	//  195  417:getfield        #345 <Field int[] aC>
	//  196  420:iconst_0        
	//  197  421:iaload          
	//  198  422:isub            
	//  199  423:istore          5
					i1 = j2 - aC[1];
	//  200  425:iload           6
	//  201  427:aload_0         
	//  202  428:getfield        #345 <Field int[] aC>
	//  203  431:iconst_1        
	//  204  432:iaload          
	//  205  433:isub            
	//  206  434:istore          4
					motionevent1.offsetLocation(aB[0], aB[1]);
	//  207  436:aload           15
	//  208  438:aload_0         
	//  209  439:getfield        #343 <Field int[] aB>
	//  210  442:iconst_0        
	//  211  443:iaload          
	//  212  444:i2f             
	//  213  445:aload_0         
	//  214  446:getfield        #343 <Field int[] aB>
	//  215  449:iconst_1        
	//  216  450:iaload          
	//  217  451:i2f             
	//  218  452:invokevirtual   #1386 <Method void MotionEvent.offsetLocation(float, float)>
					motionevent = ((MotionEvent) (aD));
	//  219  455:aload_0         
	//  220  456:getfield        #347 <Field int[] aD>
	//  221  459:astore_1        
					motionevent[0] = motionevent[0] + aB[0];
	//  222  460:aload_1         
	//  223  461:iconst_0        
	//  224  462:aload_1         
	//  225  463:iconst_0        
	//  226  464:iaload          
	//  227  465:aload_0         
	//  228  466:getfield        #343 <Field int[] aB>
	//  229  469:iconst_0        
	//  230  470:iaload          
	//  231  471:iadd            
	//  232  472:iastore         
					motionevent = ((MotionEvent) (aD));
	//  233  473:aload_0         
	//  234  474:getfield        #347 <Field int[] aD>
	//  235  477:astore_1        
					motionevent[1] = motionevent[1] + aB[1];
	//  236  478:aload_1         
	//  237  479:iconst_1        
	//  238  480:aload_1         
	//  239  481:iconst_1        
	//  240  482:iaload          
	//  241  483:aload_0         
	//  242  484:getfield        #343 <Field int[] aB>
	//  243  487:iconst_1        
	//  244  488:iaload          
	//  245  489:iadd            
	//  246  490:iastore         
				}
				j2 = l1;
	//  247  491:iload           5
	//  248  493:istore          6
				k2 = i1;
	//  249  495:iload           4
	//  250  497:istore          7
				if(ah != 1)
	//* 251  499:aload_0         
	//* 252  500:getfield        #310 <Field int ah>
	//* 253  503:iconst_1        
	//* 254  504:icmpeq          647
				{
					if(flag2 && Math.abs(l1) > ao)
	//* 255  507:iload           13
	//* 256  509:ifeq            556
	//* 257  512:iload           5
	//* 258  514:invokestatic    #1445 <Method int Math.abs(int)>
	//* 259  517:aload_0         
	//* 260  518:getfield        #389 <Field int ao>
	//* 261  521:icmple          556
					{
						if(l1 > 0)
	//* 262  524:iload           5
	//* 263  526:ifle            541
							l1 -= ao;
	//  264  529:iload           5
	//  265  531:aload_0         
	//  266  532:getfield        #389 <Field int ao>
	//  267  535:isub            
	//  268  536:istore          5
						else
	//* 269  538:goto            550
							l1 += ao;
	//  270  541:iload           5
	//  271  543:aload_0         
	//  272  544:getfield        #389 <Field int ao>
	//  273  547:iadd            
	//  274  548:istore          5
						j2 = 1;
	//  275  550:iconst_1        
	//  276  551:istore          6
					} else
	//* 277  553:goto            559
					{
						j2 = 0;
	//  278  556:iconst_0        
	//  279  557:istore          6
					}
					int i3 = j2;
	//  280  559:iload           6
	//  281  561:istore          9
					int l2 = i1;
	//  282  563:iload           4
	//  283  565:istore          8
					if(flag3)
	//* 284  567:iload           14
	//* 285  569:ifeq            621
					{
						i3 = j2;
	//  286  572:iload           6
	//  287  574:istore          9
						l2 = i1;
	//  288  576:iload           4
	//  289  578:istore          8
						if(Math.abs(i1) > ao)
	//* 290  580:iload           4
	//* 291  582:invokestatic    #1445 <Method int Math.abs(int)>
	//* 292  585:aload_0         
	//* 293  586:getfield        #389 <Field int ao>
	//* 294  589:icmple          621
						{
							if(i1 > 0)
	//* 295  592:iload           4
	//* 296  594:ifle            609
								l2 = i1 - ao;
	//  297  597:iload           4
	//  298  599:aload_0         
	//  299  600:getfield        #389 <Field int ao>
	//  300  603:isub            
	//  301  604:istore          8
							else
	//* 302  606:goto            618
								l2 = i1 + ao;
	//  303  609:iload           4
	//  304  611:aload_0         
	//  305  612:getfield        #389 <Field int ao>
	//  306  615:iadd            
	//  307  616:istore          8
							i3 = 1;
	//  308  618:iconst_1        
	//  309  619:istore          9
						}
					}
					j2 = l1;
	//  310  621:iload           5
	//  311  623:istore          6
					k2 = l2;
	//  312  625:iload           8
	//  313  627:istore          7
					if(i3 != 0)
	//* 314  629:iload           9
	//* 315  631:ifeq            647
					{
						setScrollState(1);
	//  316  634:aload_0         
	//  317  635:iconst_1        
	//  318  636:invokevirtual   #565 <Method void setScrollState(int)>
						k2 = l2;
	//  319  639:iload           8
	//  320  641:istore          7
						j2 = l1;
	//  321  643:iload           5
	//  322  645:istore          6
					}
				}
				i1 = ((int) (flag));
	//  323  647:iload           10
	//  324  649:istore          4
				if(ah != 1)
					break;
	//  325  651:aload_0         
	//  326  652:getfield        #310 <Field int ah>
	//  327  655:iconst_1        
	//  328  656:icmpne          986
				am = j3 - aB[0];
	//  329  659:aload_0         
	//  330  660:iload           11
	//  331  662:aload_0         
	//  332  663:getfield        #343 <Field int[] aB>
	//  333  666:iconst_0        
	//  334  667:iaload          
	//  335  668:isub            
	//  336  669:putfield        #1150 <Field int am>
				an = k3 - aB[1];
	//  337  672:aload_0         
	//  338  673:iload           12
	//  339  675:aload_0         
	//  340  676:getfield        #343 <Field int[] aB>
	//  341  679:iconst_1        
	//  342  680:iaload          
	//  343  681:isub            
	//  344  682:putfield        #1157 <Field int an>
				if(flag2)
	//* 345  685:iload           13
	//* 346  687:ifeq            697
					i1 = j2;
	//  347  690:iload           6
	//  348  692:istore          4
				else
	//* 349  694:goto            700
					i1 = 0;
	//  350  697:iconst_0        
	//  351  698:istore          4
				if(flag3)
	//* 352  700:iload           14
	//* 353  702:ifeq            712
					l1 = k2;
	//  354  705:iload           7
	//  355  707:istore          5
				else
	//* 356  709:goto            715
					l1 = 0;
	//  357  712:iconst_0        
	//  358  713:istore          5
				if(a(i1, l1, motionevent1))
	//* 359  715:aload_0         
	//* 360  716:iload           4
	//* 361  718:iload           5
	//* 362  720:aload           15
	//* 363  722:invokevirtual   #1808 <Method boolean a(int, int, MotionEvent)>
	//* 364  725:ifeq            738
					getParent().requestDisallowInterceptTouchEvent(true);
	//  365  728:aload_0         
	//  366  729:invokevirtual   #1834 <Method ViewParent getParent()>
	//  367  732:iconst_1        
	//  368  733:invokeinterface #1839 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				i1 = ((int) (flag));
	//  369  738:iload           10
	//  370  740:istore          4
				if(z == null)
					break;
	//  371  742:aload_0         
	//  372  743:getfield        #1763 <Field ad z>
	//  373  746:ifnull          986
				if(j2 == 0)
	//* 374  749:iload           6
	//* 375  751:ifne            763
				{
					i1 = ((int) (flag));
	//  376  754:iload           10
	//  377  756:istore          4
					if(k2 == 0)
						break;
	//  378  758:iload           7
	//  379  760:ifeq            986
				}
				z.a(this, j2, k2);
	//  380  763:aload_0         
	//  381  764:getfield        #1763 <Field ad z>
	//  382  767:aload_0         
	//  383  768:iload           6
	//  384  770:iload           7
	//  385  772:invokevirtual   #1911 <Method void android.support.v7.widget.ad.a(RecyclerView, int, int)>
				i1 = ((int) (flag));
	//  386  775:iload           10
	//  387  777:istore          4
				break;

	//* 388  779:goto            986
			case 1: // '\001'
				aj.addMovement(motionevent1);
	//  389  782:aload_0         
	//  390  783:getfield        #551 <Field VelocityTracker aj>
	//  391  786:aload           15
	//  392  788:invokevirtual   #1819 <Method void VelocityTracker.addMovement(MotionEvent)>
				aj.computeCurrentVelocity(1000, ar);
	//  393  791:aload_0         
	//  394  792:getfield        #551 <Field VelocityTracker aj>
	//  395  795:sipush          1000
	//  396  798:aload_0         
	//  397  799:getfield        #406 <Field int ar>
	//  398  802:i2f             
	//  399  803:invokevirtual   #1915 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f1;
				if(flag2)
	//* 400  806:iload           13
	//* 401  808:ifeq            827
					f1 = -aj.getXVelocity(ai);
	//  402  811:aload_0         
	//  403  812:getfield        #551 <Field VelocityTracker aj>
	//  404  815:aload_0         
	//  405  816:getfield        #312 <Field int ai>
	//  406  819:invokevirtual   #1918 <Method float VelocityTracker.getXVelocity(int)>
	//  407  822:fneg            
	//  408  823:fstore_2        
				else
	//* 409  824:goto            829
					f1 = 0.0F;
	//  410  827:fconst_0        
	//  411  828:fstore_2        
				float f2;
				if(flag3)
	//* 412  829:iload           14
	//* 413  831:ifeq            850
					f2 = -aj.getYVelocity(ai);
	//  414  834:aload_0         
	//  415  835:getfield        #551 <Field VelocityTracker aj>
	//  416  838:aload_0         
	//  417  839:getfield        #312 <Field int ai>
	//  418  842:invokevirtual   #1921 <Method float VelocityTracker.getYVelocity(int)>
	//  419  845:fneg            
	//  420  846:fstore_3        
				else
	//* 421  847:goto            852
					f2 = 0.0F;
	//  422  850:fconst_0        
	//  423  851:fstore_3        
				if(f1 == 0.0F && f2 == 0.0F || !b((int)f1, (int)f2))
	//* 424  852:fload_2         
	//* 425  853:fconst_0        
	//* 426  854:fcmpl           
	//* 427  855:ifne            864
	//* 428  858:fload_3         
	//* 429  859:fconst_0        
	//* 430  860:fcmpl           
	//* 431  861:ifeq            875
	//* 432  864:aload_0         
	//* 433  865:fload_2         
	//* 434  866:f2i             
	//* 435  867:fload_3         
	//* 436  868:f2i             
	//* 437  869:invokevirtual   #1923 <Method boolean b(int, int)>
	//* 438  872:ifne            880
					setScrollState(0);
	//  439  875:aload_0         
	//  440  876:iconst_0        
	//  441  877:invokevirtual   #565 <Method void setScrollState(int)>
				E();
	//  442  880:aload_0         
	//  443  881:invokespecial   #562 <Method void E()>
				i1 = 1;
	//  444  884:iconst_1        
	//  445  885:istore          4
				break;

	//* 446  887:goto            986
			case 0: // '\0'
				ai = motionevent.getPointerId(0);
	//  447  890:aload_0         
	//  448  891:aload_1         
	//  449  892:iconst_0        
	//  450  893:invokevirtual   #1143 <Method int MotionEvent.getPointerId(int)>
	//  451  896:putfield        #312 <Field int ai>
				i1 = (int)(motionevent.getX() + 0.5F);
	//  452  899:aload_1         
	//  453  900:invokevirtual   #1393 <Method float MotionEvent.getX()>
	//  454  903:ldc2            #1148 <Float 0.5F>
	//  455  906:fadd            
	//  456  907:f2i             
	//  457  908:istore          4
				am = i1;
	//  458  910:aload_0         
	//  459  911:iload           4
	//  460  913:putfield        #1150 <Field int am>
				ak = i1;
	//  461  916:aload_0         
	//  462  917:iload           4
	//  463  919:putfield        #1152 <Field int ak>
				i1 = (int)(motionevent.getY() + 0.5F);
	//  464  922:aload_1         
	//  465  923:invokevirtual   #1395 <Method float MotionEvent.getY()>
	//  466  926:ldc2            #1148 <Float 0.5F>
	//  467  929:fadd            
	//  468  930:f2i             
	//  469  931:istore          4
				an = i1;
	//  470  933:aload_0         
	//  471  934:iload           4
	//  472  936:putfield        #1157 <Field int an>
				al = i1;
	//  473  939:aload_0         
	//  474  940:iload           4
	//  475  942:putfield        #1159 <Field int al>
				if(flag2)
	//* 476  945:iload           13
	//* 477  947:ifeq            956
					i1 = 1;
	//  478  950:iconst_1        
	//  479  951:istore          4
				else
	//* 480  953:goto            959
					i1 = 0;
	//  481  956:iconst_0        
	//  482  957:istore          4
				int i2 = i1;
	//  483  959:iload           4
	//  484  961:istore          5
				if(flag3)
	//* 485  963:iload           14
	//* 486  965:ifeq            974
					i2 = i1 | 2;
	//  487  968:iload           4
	//  488  970:iconst_2        
	//  489  971:ior             
	//  490  972:istore          5
				j(i2, 0);
	//  491  974:aload_0         
	//  492  975:iload           5
	//  493  977:iconst_0        
	//  494  978:invokevirtual   #1459 <Method boolean j(int, int)>
	//  495  981:pop             
				i1 = ((int) (flag));
	//  496  982:iload           10
	//  497  984:istore          4
				break;
			}
			if(i1 == 0)
	//* 498  986:iload           4
	//* 499  988:ifne            1000
				aj.addMovement(motionevent1);
	//  500  991:aload_0         
	//  501  992:getfield        #551 <Field VelocityTracker aj>
	//  502  995:aload           15
	//  503  997:invokevirtual   #1819 <Method void VelocityTracker.addMovement(MotionEvent)>
			motionevent1.recycle();
	//  504 1000:aload           15
	//  505 1002:invokevirtual   #1924 <Method void MotionEvent.recycle()>
			return true;
	//  506 1005:iconst_1        
	//  507 1006:ireturn         
		} else
		{
			return false;
	//  508 1007:iconst_0        
	//  509 1008:ireturn         
		}
	}

	void p()
	{
		if(!E && p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #339 <Field boolean E>
	//*   2    4:ifne            27
	//*   3    7:aload_0         
	//*   4    8:getfield        #1726 <Field boolean p>
	//*   5   11:ifeq            27
		{
			android.support.v4.view.s.a(((View) (this)), aE);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #352 <Field Runnable aE>
	//    9   19:invokestatic    #1927 <Method void s.a(View, Runnable)>
			E = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #339 <Field boolean E>
		}
	//   13   27:return          
	}

	void q()
	{
		if(l != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field RecyclerView$a l>
	//    2    4:ifnonnull       20
_L1:
		String s1 = "No adapter attached; skipping layout";
	//    3    7:ldc2            #1929 <String "No adapter attached; skipping layout">
	//    4   10:astore_1        
_L4:
		Log.e("RecyclerView", s1);
	//    5   11:ldc2            #887 <String "RecyclerView">
	//    6   14:aload_1         
	//    7   15:invokestatic    #892 <Method int Log.e(String, String)>
	//    8   18:pop             
		return;
	//    9   19:return          
_L2:
		if(m != null)
			break; /* Loop/switch isn't completed */
	//   10   20:aload_0         
	//   11   21:getfield        #528 <Field RecyclerView$h m>
	//   12   24:ifnonnull       34
		s1 = "No layout manager attached; skipping layout";
	//   13   27:ldc2            #1931 <String "No layout manager attached; skipping layout">
	//   14   30:astore_1        
		if(true) goto _L4; else goto _L3
	//   15   31:goto            11
_L3:
		B.h = false;
	//   16   34:aload_0         
	//   17   35:getfield        #330 <Field RecyclerView$r B>
	//   18   38:iconst_0        
	//   19   39:putfield        #698 <Field boolean android.support.v7.widget.RecyclerView$r.h>
		if(B.c != 1) goto _L6; else goto _L5
	//   20   42:aload_0         
	//   21   43:getfield        #330 <Field RecyclerView$r B>
	//   22   46:getfield        #759 <Field int RecyclerView$r.c>
	//   23   49:iconst_1        
	//   24   50:icmpne          72
_L5:
		N();
	//   25   53:aload_0         
	//   26   54:invokespecial   #1858 <Method void N()>
_L8:
		m.f(this);
	//   27   57:aload_0         
	//   28   58:getfield        #528 <Field RecyclerView$h m>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #1933 <Method void RecyclerView$h.f(RecyclerView)>
		O();
	//   31   65:aload_0         
	//   32   66:invokespecial   #1862 <Method void O()>
		break; /* Loop/switch isn't completed */
	//   33   69:goto            121
_L6:
		if(e.f() || m.x() != getWidth() || m.y() != getHeight())
	//*  34   72:aload_0         
	//*  35   73:getfield        #591 <Field e e>
	//*  36   76:invokevirtual   #1935 <Method boolean e.f()>
	//*  37   79:ifne            57
	//*  38   82:aload_0         
	//*  39   83:getfield        #528 <Field RecyclerView$h m>
	//*  40   86:invokevirtual   #1937 <Method int RecyclerView$h.x()>
	//*  41   89:aload_0         
	//*  42   90:invokevirtual   #852 <Method int getWidth()>
	//*  43   93:icmpne          57
	//*  44   96:aload_0         
	//*  45   97:getfield        #528 <Field RecyclerView$h m>
	//*  46  100:invokevirtual   #1939 <Method int RecyclerView$h.y()>
	//*  47  103:aload_0         
	//*  48  104:invokevirtual   #855 <Method int getHeight()>
	//*  49  107:icmpeq          113
			continue; /* Loop/switch isn't completed */
	//   50  110:goto            57
		m.f(this);
	//   51  113:aload_0         
	//   52  114:getfield        #528 <Field RecyclerView$h m>
	//   53  117:aload_0         
	//   54  118:invokevirtual   #1933 <Method void RecyclerView$h.f(RecyclerView)>
		break; /* Loop/switch isn't completed */
		if(true) goto _L8; else goto _L7
_L7:
		P();
	//   55  121:aload_0         
	//   56  122:invokespecial   #1941 <Method void P()>
		return;
	//   57  125:return          
	}

	void r()
	{
		int j1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          40
			((LayoutParams)f.d(i1).getLayoutParams()).e = true;
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1201 <Method View t.d(int)>
	//   13   23:invokevirtual   #1036 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   14   26:checkcast       #20  <Class RecyclerView$LayoutParams>
	//   15   29:iconst_1        
	//   16   30:putfield        #1037 <Field boolean RecyclerView$LayoutParams.e>

	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_1        
	//*  21   37:goto            10
		d.j();
	//   22   40:aload_0         
	//   23   41:getfield        #268 <Field RecyclerView$n d>
	//   24   44:invokevirtual   #1942 <Method void android.support.v7.widget.RecyclerView$n.j()>
	//   25   47:return          
	}

	protected void removeDetachedView(View view, boolean flag)
	{
		u u1 = e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #521 <Method RecyclerView$u e(View)>
	//    2    4:astore_3        
		if(u1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          73
			if(u1.r())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #1165 <Method boolean RecyclerView$u.r()>
	//*   7   13:ifeq            23
				u1.m();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #1944 <Method void RecyclerView$u.m()>
			else
	//*  10   20:goto            73
			if(!u1.c())
	//*  11   23:aload_3         
	//*  12   24:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  13   27:ifne            73
			{
				view = ((View) (new StringBuilder()));
	//   14   30:new             #816 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #817 <Method void StringBuilder()>
	//   17   37:astore_1        
				((StringBuilder) (view)).append("Called removeDetachedView with a view which is not flagged as tmp detached.");
	//   18   38:aload_1         
	//   19   39:ldc2            #1946 <String "Called removeDetachedView with a view which is not flagged as tmp detached.">
	//   20   42:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
				((StringBuilder) (view)).append(((Object) (u1)));
	//   22   46:aload_1         
	//   23   47:aload_3         
	//   24   48:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   25   51:pop             
				((StringBuilder) (view)).append(a());
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #875 <Method String a()>
	//   29   57:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   31   61:new             #1126 <Class IllegalArgumentException>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #1127 <Method void IllegalArgumentException(String)>
	//   36   72:athrow          
			}
		view.clearAnimation();
	//   37   73:aload_1         
	//   38   74:invokevirtual   #1949 <Method void View.clearAnimation()>
		k(view);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #1951 <Method void k(View)>
		super.removeDetachedView(view, flag);
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:iload_2         
	//   45   85:invokespecial   #1953 <Method void ViewGroup.removeDetachedView(View, boolean)>
	//   46   88:return          
	}

	public void requestChildFocus(View view, View view1)
	{
		if(!m.a(this, B, view, view1) && view1 != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:aload_0         
	//*   3    5:aload_0         
	//*   4    6:getfield        #330 <Field RecyclerView$r B>
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #1957 <Method boolean android.support.v7.widget.RecyclerView$h.a(RecyclerView, RecyclerView$r, View, View)>
	//*   8   14:ifne            27
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			a(view, view1);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #1619 <Method void a(View, View)>
		super.requestChildFocus(view, view1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:invokespecial   #1959 <Method void ViewGroup.requestChildFocus(View, View)>
	//   19   33:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		return m.a(this, view, rect, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field RecyclerView$h m>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #1964 <Method boolean android.support.v7.widget.RecyclerView$h.a(RecyclerView, View, Rect, boolean)>
	//    7   11:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		int j1 = R.size();
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field ArrayList R>
	//    2    4:invokevirtual   #1076 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          39
			((k)R.get(i1)).a(flag);
	//    9   15:aload_0         
	//   10   16:getfield        #295 <Field ArrayList R>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #1079 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #72  <Class RecyclerView$k>
	//   14   26:iload_1         
	//   15   27:invokeinterface #1965 <Method void android.support.v7.widget.RecyclerView$k.a(boolean)>

	//   16   32:iload_2         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_2        
	//*  20   36:goto            10
		super.requestDisallowInterceptTouchEvent(flag);
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:invokespecial   #1966 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
	//   24   44:return          
	}

	public void requestLayout()
	{
		if(T == 0 && !u)
	//*   0    0:aload_0         
	//*   1    1:getfield        #297 <Field int T>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:getfield        #1219 <Field boolean u>
	//*   5   11:ifne            19
		{
			super.requestLayout();
	//    6   14:aload_0         
	//    7   15:invokespecial   #1967 <Method void ViewGroup.requestLayout()>
			return;
	//    8   18:return          
		} else
		{
			t = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #1355 <Field boolean t>
			return;
	//   12   24:return          
		}
	}

	void s()
	{
		int j1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          45
		{
			u u1 = e(f.d(i1));
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1201 <Method View t.d(int)>
	//   13   23:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   26:astore_3        
			if(!u1.c())
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  17   31:ifne            38
				u1.b();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #1968 <Method void android.support.v7.widget.RecyclerView$u.b()>
		}

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            10
	//   25   45:return          
	}

	public void scrollBy(int i1, int j1)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field RecyclerView$h m>
	//*   2    4:ifnonnull       18
		{
			Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	//    3    7:ldc2            #887 <String "RecyclerView">
	//    4   10:ldc2            #1971 <String "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.">
	//    5   13:invokestatic    #892 <Method int Log.e(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		}
		if(u)
	//*   8   18:aload_0         
	//*   9   19:getfield        #1219 <Field boolean u>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		boolean flag = m.d();
	//   12   26:aload_0         
	//   13   27:getfield        #528 <Field RecyclerView$h m>
	//   14   30:invokevirtual   #1231 <Method boolean RecyclerView$h.d()>
	//   15   33:istore_3        
		boolean flag1 = m.e();
	//   16   34:aload_0         
	//   17   35:getfield        #528 <Field RecyclerView$h m>
	//   18   38:invokevirtual   #1233 <Method boolean RecyclerView$h.e()>
	//   19   41:istore          4
		if(flag || flag1)
	//*  20   43:iload_3         
	//*  21   44:ifne            52
	//*  22   47:iload           4
	//*  23   49:ifeq            79
		{
			if(!flag)
	//*  24   52:iload_3         
	//*  25   53:ifeq            59
	//*  26   56:goto            61
				i1 = 0;
	//   27   59:iconst_0        
	//   28   60:istore_1        
			if(!flag1)
	//*  29   61:iload           4
	//*  30   63:ifeq            69
	//*  31   66:goto            71
				j1 = 0;
	//   32   69:iconst_0        
	//   33   70:istore_2        
			a(i1, j1, ((MotionEvent) (null)));
	//   34   71:aload_0         
	//   35   72:iload_1         
	//   36   73:iload_2         
	//   37   74:aconst_null     
	//   38   75:invokevirtual   #1808 <Method boolean a(int, int, MotionEvent)>
	//   39   78:pop             
		}
	//   40   79:return          
	}

	public void scrollTo(int i1, int j1)
	{
		Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
	//    0    0:ldc2            #887 <String "RecyclerView">
	//    1    3:ldc2            #1974 <String "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead">
	//    2    6:invokestatic    #1976 <Method int Log.w(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
	{
		if(a(accessibilityevent))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #1978 <Method boolean a(AccessibilityEvent)>
	//*   3    5:ifeq            9
		{
			return;
	//    4    8:return          
		} else
		{
			super.sendAccessibilityEventUnchecked(accessibilityevent);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #1979 <Method void ViewGroup.sendAccessibilityEventUnchecked(AccessibilityEvent)>
			return;
	//    8   14:return          
		}
	}

	public void setAccessibilityDelegateCompat(ai ai1)
	{
		F = ai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1678 <Field ai F>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (F)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #1678 <Field ai F>
	//    6   10:invokestatic    #1982 <Method void s.a(View, android.support.v4.view.a)>
	//    7   13:return          
	}

	public void setAdapter(a a1)
	{
		setLayoutFrozen(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #1987 <Method void setLayoutFrozen(boolean)>
		a(a1, false, true);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iconst_1        
	//    7    9:invokespecial   #1989 <Method void a(RecyclerView$a, boolean, boolean)>
		requestLayout();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #1252 <Method void requestLayout()>
	//   10   16:return          
	}

	public void setChildDrawingOrderCallback(d d1)
	{
		if(d1 == ay)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #1669 <Field RecyclerView$d ay>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		ay = d1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #1669 <Field RecyclerView$d ay>
		boolean flag;
		if(ay != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #1669 <Field RecyclerView$d ay>
	//*  10   18:ifnull          26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		setChildrenDrawingOrderEnabled(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #1994 <Method void setChildrenDrawingOrderEnabled(boolean)>
	//   19   33:return          
	}

	public void setClipToPadding(boolean flag)
	{
		if(flag != h)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #367 <Field boolean h>
	//*   3    5:icmpeq          12
			k();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1903 <Method void k()>
		h = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #367 <Field boolean h>
		super.setClipToPadding(flag);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #1997 <Method void ViewGroup.setClipToPadding(boolean)>
		if(s)
	//*  12   22:aload_0         
	//*  13   23:getfield        #604 <Field boolean s>
	//*  14   26:ifeq            33
			requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #1252 <Method void requestLayout()>
	//   17   33:return          
	}

	public void setHasFixedSize(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1870 <Field boolean q>
	//    3    5:return          
	}

	public void setItemAnimator(e e1)
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #308 <Field RecyclerView$e x>
	//*   2    4:ifnull          22
		{
			x.d();
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field RecyclerView$e x>
	//    5   11:invokevirtual   #1470 <Method void RecyclerView$e.d()>
			x.a(((e.b) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #308 <Field RecyclerView$e x>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #415 <Method void android.support.v7.widget.RecyclerView$e.a(RecyclerView$e$b)>
		}
		x = e1;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #308 <Field RecyclerView$e x>
		if(x != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #308 <Field RecyclerView$e x>
	//*  15   31:ifnull          45
			x.a(ax);
	//   16   34:aload_0         
	//   17   35:getfield        #308 <Field RecyclerView$e x>
	//   18   38:aload_0         
	//   19   39:getfield        #337 <Field RecyclerView$e$b ax>
	//   20   42:invokevirtual   #415 <Method void android.support.v7.widget.RecyclerView$e.a(RecyclerView$e$b)>
	//   21   45:return          
	}

	public void setItemViewCacheSize(int i1)
	{
		d.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field RecyclerView$n d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2002 <Method void android.support.v7.widget.RecyclerView$n.a(int)>
	//    4    8:return          
	}

	public void setLayoutFrozen(boolean flag)
	{
		if(flag != u)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #1219 <Field boolean u>
	//*   3    5:icmpeq          87
		{
			a("Do not setLayoutFrozen in layout or scroll");
	//    4    8:aload_0         
	//    5    9:ldc2            #2004 <String "Do not setLayoutFrozen in layout or scroll">
	//    6   12:invokevirtual   #2005 <Method void a(String)>
			if(!flag)
	//*   7   15:iload_1         
	//*   8   16:ifne            55
			{
				u = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #1219 <Field boolean u>
				if(t && m != null && l != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #1355 <Field boolean t>
	//*  14   28:ifeq            49
	//*  15   31:aload_0         
	//*  16   32:getfield        #528 <Field RecyclerView$h m>
	//*  17   35:ifnull          49
	//*  18   38:aload_0         
	//*  19   39:getfield        #608 <Field RecyclerView$a l>
	//*  20   42:ifnull          49
					requestLayout();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #1252 <Method void requestLayout()>
				t = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #1355 <Field boolean t>
				return;
	//   26   54:return          
			}
			long l1 = SystemClock.uptimeMillis();
	//   27   55:invokestatic    #2010 <Method long SystemClock.uptimeMillis()>
	//   28   58:lstore_2        
			onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
	//   29   59:aload_0         
	//   30   60:lload_2         
	//   31   61:lload_2         
	//   32   62:iconst_3        
	//   33   63:fconst_0        
	//   34   64:fconst_0        
	//   35   65:iconst_0        
	//   36   66:invokestatic    #2013 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   37   69:invokevirtual   #2015 <Method boolean onTouchEvent(MotionEvent)>
	//   38   72:pop             
			u = true;
	//   39   73:aload_0         
	//   40   74:iconst_1        
	//   41   75:putfield        #1219 <Field boolean u>
			U = true;
	//   42   78:aload_0         
	//   43   79:iconst_1        
	//   44   80:putfield        #1833 <Field boolean U>
			f();
	//   45   83:aload_0         
	//   46   84:invokevirtual   #1221 <Method void f()>
		}
	//   47   87:return          
	}

	public void setLayoutManager(h h1)
	{
		if(h1 == m)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #528 <Field RecyclerView$h m>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		f();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1221 <Method void f()>
		if(m != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #528 <Field RecyclerView$h m>
	//*   9   17:ifnull          98
		{
			if(x != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #308 <Field RecyclerView$e x>
	//*  12   24:ifnull          34
				x.d();
	//   13   27:aload_0         
	//   14   28:getfield        #308 <Field RecyclerView$e x>
	//   15   31:invokevirtual   #1470 <Method void RecyclerView$e.d()>
			m.c(d);
	//   16   34:aload_0         
	//   17   35:getfield        #528 <Field RecyclerView$h m>
	//   18   38:aload_0         
	//   19   39:getfield        #268 <Field RecyclerView$n d>
	//   20   42:invokevirtual   #1472 <Method void RecyclerView$h.c(RecyclerView$n)>
			m.b(d);
	//   21   45:aload_0         
	//   22   46:getfield        #528 <Field RecyclerView$h m>
	//   23   49:aload_0         
	//   24   50:getfield        #268 <Field RecyclerView$n d>
	//   25   53:invokevirtual   #788 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView$n)>
			d.a();
	//   26   56:aload_0         
	//   27   57:getfield        #268 <Field RecyclerView$n d>
	//   28   60:invokevirtual   #1473 <Method void android.support.v7.widget.RecyclerView$n.a()>
			if(p)
	//*  29   63:aload_0         
	//*  30   64:getfield        #1726 <Field boolean p>
	//*  31   67:ifeq            82
				m.b(this, d);
	//   32   70:aload_0         
	//   33   71:getfield        #528 <Field RecyclerView$h m>
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #268 <Field RecyclerView$n d>
	//   37   79:invokevirtual   #1786 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView, RecyclerView$n)>
			m.b(((RecyclerView) (null)));
	//   38   82:aload_0         
	//   39   83:getfield        #528 <Field RecyclerView$h m>
	//   40   86:aconst_null     
	//   41   87:invokevirtual   #2016 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView)>
			m = null;
	//   42   90:aload_0         
	//   43   91:aconst_null     
	//   44   92:putfield        #528 <Field RecyclerView$h m>
		} else
	//*  45   95:goto            105
		{
			d.a();
	//   46   98:aload_0         
	//   47   99:getfield        #268 <Field RecyclerView$n d>
	//   48  102:invokevirtual   #1473 <Method void android.support.v7.widget.RecyclerView$n.a()>
		}
		f.a();
	//   49  105:aload_0         
	//   50  106:getfield        #512 <Field android.support.v7.widget.t f>
	//   51  109:invokevirtual   #2017 <Method void android.support.v7.widget.t.a()>
		m = h1;
	//   52  112:aload_0         
	//   53  113:aload_1         
	//   54  114:putfield        #528 <Field RecyclerView$h m>
		if(h1 != null)
	//*  55  117:aload_1         
	//*  56  118:ifnull          205
		{
			if(h1.q != null)
	//*  57  121:aload_1         
	//*  58  122:getfield        #2020 <Field RecyclerView RecyclerView$h.q>
	//*  59  125:ifnull          182
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   60  128:new             #816 <Class StringBuilder>
	//   61  131:dup             
	//   62  132:invokespecial   #817 <Method void StringBuilder()>
	//   63  135:astore_2        
				stringbuilder.append("LayoutManager ");
	//   64  136:aload_2         
	//   65  137:ldc2            #2022 <String "LayoutManager ">
	//   66  140:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
				stringbuilder.append(((Object) (h1)));
	//   68  144:aload_2         
	//   69  145:aload_1         
	//   70  146:invokevirtual   #871 <Method StringBuilder StringBuilder.append(Object)>
	//   71  149:pop             
				stringbuilder.append(" is already attached to a RecyclerView:");
	//   72  150:aload_2         
	//   73  151:ldc2            #2024 <String " is already attached to a RecyclerView:">
	//   74  154:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   75  157:pop             
				stringbuilder.append(h1.q.a());
	//   76  158:aload_2         
	//   77  159:aload_1         
	//   78  160:getfield        #2020 <Field RecyclerView RecyclerView$h.q>
	//   79  163:invokevirtual   #875 <Method String a()>
	//   80  166:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//   81  169:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   82  170:new             #1126 <Class IllegalArgumentException>
	//   83  173:dup             
	//   84  174:aload_2         
	//   85  175:invokevirtual   #828 <Method String StringBuilder.toString()>
	//   86  178:invokespecial   #1127 <Method void IllegalArgumentException(String)>
	//   87  181:athrow          
			}
			m.b(this);
	//   88  182:aload_0         
	//   89  183:getfield        #528 <Field RecyclerView$h m>
	//   90  186:aload_0         
	//   91  187:invokevirtual   #2016 <Method void android.support.v7.widget.RecyclerView$h.b(RecyclerView)>
			if(p)
	//*  92  190:aload_0         
	//*  93  191:getfield        #1726 <Field boolean p>
	//*  94  194:ifeq            205
				m.c(this);
	//   95  197:aload_0         
	//   96  198:getfield        #528 <Field RecyclerView$h m>
	//   97  201:aload_0         
	//   98  202:invokevirtual   #1753 <Method void RecyclerView$h.c(RecyclerView)>
		}
		d.b();
	//   99  205:aload_0         
	//  100  206:getfield        #268 <Field RecyclerView$n d>
	//  101  209:invokevirtual   #798 <Method void android.support.v7.widget.RecyclerView$n.b()>
		requestLayout();
	//  102  212:aload_0         
	//  103  213:invokevirtual   #1252 <Method void requestLayout()>
	//  104  216:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		getScrollingChildHelper().a(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2025 <Method void k.a(boolean)>
	//    4    8:return          
	}

	public void setOnFlingListener(j j1)
	{
		ap = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1455 <Field RecyclerView$j ap>
	//    3    5:return          
	}

	public void setOnScrollListener(l l1)
	{
		av = l1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1638 <Field RecyclerView$l av>
	//    3    5:return          
	}

	public void setPreserveFocusAfterLayout(boolean flag)
	{
		au = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #319 <Field boolean au>
	//    3    5:return          
	}

	public void setRecycledViewPool(m m1)
	{
		d.a(m1);
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field RecyclerView$n d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2035 <Method void android.support.v7.widget.RecyclerView$n.a(RecyclerView$m)>
	//    4    8:return          
	}

	public void setRecyclerListener(o o1)
	{
		n = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #2039 <Field RecyclerView$o n>
	//    3    5:return          
	}

	void setScrollState(int i1)
	{
		if(i1 == ah)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #310 <Field int ah>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		ah = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #310 <Field int ah>
		if(i1 != 2)
	//*   8   14:iload_1         
	//*   9   15:iconst_2        
	//*  10   16:icmpeq          23
			C();
	//   11   19:aload_0         
	//   12   20:invokespecial   #1597 <Method void C()>
		g(i1);
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #2041 <Method void g(int)>
	//   16   28:return          
	}

	public void setScrollingTouchSlop(int i1)
	{
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #431 <Method Context getContext()>
	//    2    4:invokestatic    #383 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    3    7:astore_2        
		switch(i1)
	//*   4    8:iload_1         
		{
	//*   5    9:tableswitch     0 1: default 32
	//	               0 84
	//	               1 76
	//*   6   32:new             #816 <Class StringBuilder>
	//*   7   35:dup             
	//*   8   36:invokespecial   #817 <Method void StringBuilder()>
	//*   9   39:astore_3        
	//*  10   40:aload_3         
	//*  11   41:ldc2            #2044 <String "setScrollingTouchSlop(): bad argument constant ">
	//*  12   44:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//*  13   47:pop             
	//*  14   48:aload_3         
	//*  15   49:iload_1         
	//*  16   50:invokevirtual   #1124 <Method StringBuilder StringBuilder.append(int)>
	//*  17   53:pop             
	//*  18   54:aload_3         
	//*  19   55:ldc2            #2046 <String "; using default value">
	//*  20   58:invokevirtual   #825 <Method StringBuilder StringBuilder.append(String)>
	//*  21   61:pop             
	//*  22   62:ldc2            #887 <String "RecyclerView">
	//*  23   65:aload_3         
	//*  24   66:invokevirtual   #828 <Method String StringBuilder.toString()>
	//*  25   69:invokestatic    #1976 <Method int Log.w(String, String)>
	//*  26   72:pop             
	//*  27   73:goto            84
		case 1: // '\001'
			i1 = viewconfiguration.getScaledPagingTouchSlop();
	//   28   76:aload_2         
	//   29   77:invokevirtual   #2049 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   80:istore_1        
			break;

		default:
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("setScrollingTouchSlop(): bad argument constant ");
			stringbuilder.append(i1);
			stringbuilder.append("; using default value");
			Log.w("RecyclerView", stringbuilder.toString());
			// fall through

	//*  31   81:goto            89
		case 0: // '\0'
			i1 = viewconfiguration.getScaledTouchSlop();
	//   32   84:aload_2         
	//   33   85:invokevirtual   #387 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   34   88:istore_1        
			break;
		}
		ao = i1;
	//   35   89:aload_0         
	//   36   90:iload_1         
	//   37   91:putfield        #389 <Field int ao>
	//   38   94:return          
	}

	public void setViewCacheExtension(s s1)
	{
		d.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field RecyclerView$n d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2053 <Method void android.support.v7.widget.RecyclerView$n.a(RecyclerView$s)>
	//    4    8:return          
	}

	public boolean startNestedScroll(int i1)
	{
		return getScrollingChildHelper().b(i1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2056 <Method boolean k.b(int)>
	//    4    8:ireturn         
	}

	public void stopNestedScroll()
	{
		getScrollingChildHelper().c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1360 <Method k getScrollingChildHelper()>
	//    2    4:invokevirtual   #2058 <Method void k.c()>
	//    3    7:return          
	}

	void t()
	{
		int j1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          45
		{
			u u1 = e(f.d(i1));
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1201 <Method View t.d(int)>
	//   13   23:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   26:astore_3        
			if(!u1.c())
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  17   31:ifne            38
				u1.a();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #2059 <Method void android.support.v7.widget.RecyclerView$u.a()>
		}

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            10
		d.i();
	//   25   45:aload_0         
	//   26   46:getfield        #268 <Field RecyclerView$n d>
	//   27   49:invokevirtual   #2060 <Method void RecyclerView$n.i()>
	//   28   52:return          
	}

	void u()
	{
		w = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #299 <Field boolean w>
		v();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #2062 <Method void v()>
	//    5    9:return          
	}

	void v()
	{
		int j1 = f.c();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #1199 <Method int t.c()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          51
		{
			u u1 = e(f.d(i1));
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1201 <Method View t.d(int)>
	//   13   23:invokestatic    #521 <Method RecyclerView$u e(View)>
	//   14   26:astore_3        
			if(u1 != null && !u1.c())
	//*  15   27:aload_3         
	//*  16   28:ifnull          44
	//*  17   31:aload_3         
	//*  18   32:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  19   35:ifne            44
				u1.b(6);
	//   20   38:aload_3         
	//   21   39:bipush          6
	//   22   41:invokevirtual   #1237 <Method void android.support.v7.widget.RecyclerView$u.b(int)>
		}

	//   23   44:iload_1         
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore_1        
	//*  27   48:goto            10
		r();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #1300 <Method void r()>
		d.h();
	//   30   55:aload_0         
	//   31   56:getfield        #268 <Field RecyclerView$n d>
	//   32   59:invokevirtual   #2063 <Method void android.support.v7.widget.RecyclerView$n.h()>
	//   33   62:return          
	}

	public boolean w()
	{
		return !s || w || e.d();
	//    0    0:aload_0         
	//    1    1:getfield        #604 <Field boolean s>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #299 <Field boolean w>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #591 <Field e e>
	//    8   18:invokevirtual   #1504 <Method boolean e.d()>
	//    9   21:ifeq            27
	//   10   24:goto            29
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	void x()
	{
		int j1 = f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field android.support.v7.widget.t f>
	//    2    4:invokevirtual   #515 <Method int android.support.v7.widget.t.b()>
	//    3    7:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          118
		{
			View view = f.b(i1);
	//    9   15:aload_0         
	//   10   16:getfield        #512 <Field android.support.v7.widget.t f>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #518 <Method View android.support.v7.widget.t.b(int)>
	//   13   23:astore          5
			Object obj = ((Object) (b(view)));
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:invokevirtual   #1163 <Method RecyclerView$u b(View)>
	//   17   31:astore          6
			if(obj == null || ((u) (obj)).i == null)
				continue;
	//   18   33:aload           6
	//   19   35:ifnull          111
	//   20   38:aload           6
	//   21   40:getfield        #1007 <Field RecyclerView$u RecyclerView$u.i>
	//   22   43:ifnull          111
			obj = ((Object) (((u) (obj)).i.a));
	//   23   46:aload           6
	//   24   48:getfield        #1007 <Field RecyclerView$u RecyclerView$u.i>
	//   25   51:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   26   54:astore          6
			int k1 = view.getLeft();
	//   27   56:aload           5
	//   28   58:invokevirtual   #1091 <Method int View.getLeft()>
	//   29   61:istore_3        
			int l1 = view.getTop();
	//   30   62:aload           5
	//   31   64:invokevirtual   #1097 <Method int View.getTop()>
	//   32   67:istore          4
			if(k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
	//*  33   69:iload_3         
	//*  34   70:aload           6
	//*  35   72:invokevirtual   #1091 <Method int View.getLeft()>
	//*  36   75:icmpne          88
	//*  37   78:iload           4
	//*  38   80:aload           6
	//*  39   82:invokevirtual   #1097 <Method int View.getTop()>
	//*  40   85:icmpeq          111
				((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
	//   41   88:aload           6
	//   42   90:iload_3         
	//   43   91:iload           4
	//   44   93:aload           6
	//   45   95:invokevirtual   #1027 <Method int View.getWidth()>
	//   46   98:iload_3         
	//   47   99:iadd            
	//   48  100:aload           6
	//   49  102:invokevirtual   #1028 <Method int View.getHeight()>
	//   50  105:iload           4
	//   51  107:iadd            
	//   52  108:invokevirtual   #2066 <Method void View.layout(int, int, int, int)>
		}

	//   53  111:iload_1         
	//   54  112:iconst_1        
	//   55  113:iadd            
	//   56  114:istore_1        
	//*  57  115:goto            10
	//   58  118:return          
	}

	void y()
	{
		for(int i1 = G.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field List G>
	//*   2    4:invokeinterface #1641 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            81
		{
			u u1 = (u)G.get(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #349 <Field List G>
	//   10   20:iload_1         
	//   11   21:invokeinterface #1642 <Method Object List.get(int)>
	//   12   26:checkcast       #106 <Class RecyclerView$u>
	//   13   29:astore_3        
			if(u1.a.getParent() != this || u1.c())
	//*  14   30:aload_3         
	//*  15   31:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//*  16   34:invokevirtual   #673 <Method ViewParent View.getParent()>
	//*  17   37:aload_0         
	//*  18   38:if_acmpne       74
	//*  19   41:aload_3         
	//*  20   42:invokevirtual   #523 <Method boolean RecyclerView$u.c()>
	//*  21   45:ifeq            51
				continue;
	//   22   48:goto            74
			int j1 = u1.l;
	//   23   51:aload_3         
	//   24   52:getfield        #1404 <Field int RecyclerView$u.l>
	//   25   55:istore_2        
			if(j1 != -1)
	//*  26   56:iload_2         
	//*  27   57:iconst_m1       
	//*  28   58:icmpeq          74
			{
				android.support.v4.view.s.a(u1.a, j1);
	//   29   61:aload_3         
	//   30   62:getfield        #643 <Field View android.support.v7.widget.RecyclerView$u.a>
	//   31   65:iload_2         
	//   32   66:invokestatic    #427 <Method void s.a(View, int)>
				u1.l = -1;
	//   33   69:aload_3         
	//   34   70:iconst_m1       
	//   35   71:putfield        #1404 <Field int RecyclerView$u.l>
			}
		}

	//   36   74:iload_1         
	//   37   75:iconst_1        
	//   38   76:isub            
	//   39   77:istore_1        
	//*  40   78:goto            12
		G.clear();
	//   41   81:aload_0         
	//   42   82:getfield        #349 <Field List G>
	//   43   85:invokeinterface #1787 <Method void List.clear()>
	//   44   90:return          
	}

	static final Interpolator H = new Interpolator() {

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
	private static final int I[] = {
		0x1010436
	};
	private static final int J[] = {
		0x10100eb
	};
	private static final boolean K;
	private static final boolean L;
	private static final boolean M;
	private static final Class N[];
	static final boolean a;
	static final boolean b;
	static final boolean c;
	ad.a A;
	final r B;
	boolean C;
	boolean D;
	boolean E;
	ai F;
	final List G;
	private final p O;
	private SavedState P;
	private final Rect Q;
	private final ArrayList R;
	private k S;
	private int T;
	private boolean U;
	private int V;
	private final AccessibilityManager W;
	private android.support.v4.view.k aA;
	private final int aB[];
	private final int aC[];
	private final int aD[];
	private Runnable aE = new Runnable() {

		public void run()
		{
			if(a.x != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field RecyclerView a>
		//*   2    4:getfield        #23  <Field RecyclerView$e RecyclerView.x>
		//*   3    7:ifnull          20
				a.x.a();
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field RecyclerView a>
		//    6   14:getfield        #23  <Field RecyclerView$e RecyclerView.x>
		//    7   17:invokevirtual   #27  <Method void android.support.v7.widget.RecyclerView$e.a()>
			a.E = false;
		//    8   20:aload_0         
		//    9   21:getfield        #14  <Field RecyclerView a>
		//   10   24:iconst_0        
		//   11   25:putfield        #31  <Field boolean RecyclerView.E>
		//   12   28:return          
		}

		final RecyclerView a;

			
			{
				a = RecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final bc.b aF;
	private List aa;
	private int ab;
	private int ac;
	private EdgeEffect ad;
	private EdgeEffect ae;
	private EdgeEffect af;
	private EdgeEffect ag;
	private int ah;
	private int ai;
	private VelocityTracker aj;
	private int ak;
	private int al;
	private int am;
	private int an;
	private int ao;
	private j ap;
	private final int aq;
	private final int ar;
	private float as;
	private float at;
	private boolean au;
	private l av;
	private List aw;
	private e.b ax;
	private d ay;
	private final int az[];
	final n d;
	android.support.v7.widget.e e;
	android.support.v7.widget.t f;
	final bc g;
	boolean h;
	final Runnable i;
	final Rect j;
	final RectF k;
	a l;
	h m;
	o n;
	final ArrayList o;
	boolean p;
	boolean q;
	boolean r;
	boolean s;
	boolean t;
	boolean u;
	boolean v;
	boolean w;
	e x;
	final t y;
	ad z;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #210 <Int 0x1010436>
	//    5    7:iastore         
	//    6    8:putstatic       #212 <Field int[] I>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #213 <Int 0x10100eb>
	//   12   18:iastore         
	//   13   19:putstatic       #215 <Field int[] J>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT != 18 && android.os.Build.VERSION.SDK_INT != 19 && android.os.Build.VERSION.SDK_INT != 20)
	//*  14   22:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   25:bipush          18
	//*  16   27:icmpeq          54
	//*  17   30:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   33:bipush          19
	//*  19   35:icmpeq          54
	//*  20   38:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   41:bipush          20
	//*  22   43:icmpne          49
	//*  23   46:goto            54
			flag = false;
	//   24   49:iconst_0        
	//   25   50:istore_0        
		else
	//*  26   51:goto            56
			flag = true;
	//   27   54:iconst_1        
	//   28   55:istore_0        
		a = flag;
	//   29   56:iload_0         
	//   30   57:putstatic       #222 <Field boolean a>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  31   60:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  32   63:bipush          23
	//*  33   65:icmplt          73
			flag = true;
	//   34   68:iconst_1        
	//   35   69:istore_0        
		else
	//*  36   70:goto            75
			flag = false;
	//   37   73:iconst_0        
	//   38   74:istore_0        
		b = flag;
	//   39   75:iload_0         
	//   40   76:putstatic       #224 <Field boolean b>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  41   79:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  42   82:bipush          16
	//*  43   84:icmplt          92
			flag = true;
	//   44   87:iconst_1        
	//   45   88:istore_0        
		else
	//*  46   89:goto            94
			flag = false;
	//   47   92:iconst_0        
	//   48   93:istore_0        
		c = flag;
	//   49   94:iload_0         
	//   50   95:putstatic       #226 <Field boolean c>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  51   98:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  101:bipush          21
	//*  53  103:icmplt          111
			flag = true;
	//   54  106:iconst_1        
	//   55  107:istore_0        
		else
	//*  56  108:goto            113
			flag = false;
	//   57  111:iconst_0        
	//   58  112:istore_0        
		K = flag;
	//   59  113:iload_0         
	//   60  114:putstatic       #228 <Field boolean K>
		if(android.os.Build.VERSION.SDK_INT <= 15)
	//*  61  117:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  62  120:bipush          15
	//*  63  122:icmpgt          130
			flag = true;
	//   64  125:iconst_1        
	//   65  126:istore_0        
		else
	//*  66  127:goto            132
			flag = false;
	//   67  130:iconst_0        
	//   68  131:istore_0        
		L = flag;
	//   69  132:iload_0         
	//   70  133:putstatic       #230 <Field boolean L>
		if(android.os.Build.VERSION.SDK_INT <= 15)
	//*  71  136:getstatic       #220 <Field int android.os.Build$VERSION.SDK_INT>
	//*  72  139:bipush          15
	//*  73  141:icmpgt          149
			flag = true;
	//   74  144:iconst_1        
	//   75  145:istore_0        
		else
	//*  76  146:goto            151
			flag = false;
	//   77  149:iconst_0        
	//   78  150:istore_0        
		M = flag;
	//   79  151:iload_0         
	//   80  152:putstatic       #232 <Field boolean M>
		N = (new Class[] {
			android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
		});
	//   81  155:iconst_4        
	//   82  156:anewarray       Class[]
	//   83  159:dup             
	//   84  160:iconst_0        
	//   85  161:ldc1            #236 <Class Context>
	//   86  163:aastore         
	//   87  164:dup             
	//   88  165:iconst_1        
	//   89  166:ldc1            #238 <Class AttributeSet>
	//   90  168:aastore         
	//   91  169:dup             
	//   92  170:iconst_2        
	//   93  171:getstatic       #244 <Field Class Integer.TYPE>
	//   94  174:aastore         
	//   95  175:dup             
	//   96  176:iconst_3        
	//   97  177:getstatic       #244 <Field Class Integer.TYPE>
	//   98  180:aastore         
	//   99  181:putstatic       #246 <Field Class[] N>
	//  100  184:new             #12  <Class RecyclerView$3>
	//  101  187:dup             
	//  102  188:invokespecial   #249 <Method void RecyclerView$3()>
	//  103  191:putstatic       #251 <Field Interpolator H>
	//* 104  194:return          
	}

	// Unreferenced inner class android/support/v7/widget/RecyclerView$h$1

/* anonymous class */
	class h._cls1
		implements bb.b
	{

		public int a()
		{
			return a.z();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #25  <Method int RecyclerView$h.z()>
		//    3    7:ireturn         
		}

		public int a(View view)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.h(view) - layoutparams.leftMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #36  <Method int android.support.v7.widget.RecyclerView$h.h(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View a(int i1)
		{
			return a.h(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #43  <Method View android.support.v7.widget.RecyclerView$h.h(int)>
		//    4    8:areturn         
		}

		public int b()
		{
			return a.x() - a.B();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #47  <Method int RecyclerView$h.x()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$h a>
		//    5   11:invokevirtual   #50  <Method int RecyclerView$h.B()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int b(View view)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.j(view) + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #53  <Method int android.support.v7.widget.RecyclerView$h.j(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #56  <Field int RecyclerView$LayoutParams.rightMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		final h a;

			
			{
				a = h1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$h a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}


	// Unreferenced inner class android/support/v7/widget/RecyclerView$h$2

/* anonymous class */
	class h._cls2
		implements bb.b
	{

		public int a()
		{
			return a.A();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #25  <Method int RecyclerView$h.A()>
		//    3    7:ireturn         
		}

		public int a(View view)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.i(view) - layoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method int RecyclerView$h.i(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #41  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View a(int i1)
		{
			return a.h(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #44  <Method View android.support.v7.widget.RecyclerView$h.h(int)>
		//    4    8:areturn         
		}

		public int b()
		{
			return a.y() - a.C();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #48  <Method int RecyclerView$h.y()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$h a>
		//    5   11:invokevirtual   #51  <Method int RecyclerView$h.C()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int b(View view)
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.k(view) + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #54  <Method int android.support.v7.widget.RecyclerView$h.k(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #57  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		final h a;

			
			{
				a = h1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$h a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
