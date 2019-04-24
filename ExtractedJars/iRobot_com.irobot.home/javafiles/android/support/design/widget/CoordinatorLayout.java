// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.c.a;
import android.support.v4.f.i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.design.widget:
//			f, n, o

public class CoordinatorLayout extends ViewGroup
	implements m
{
	public static abstract class Behavior
	{

		public aa a(CoordinatorLayout coordinatorlayout, View view, aa aa1)
		{
			return aa1;
		//    0    0:aload_3         
		//    1    1:areturn         
		}

		public void a(c c1)
		{
		//    0    0:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
		{
		//    0    0:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1)
		{
			if(i1 == 0)
		//*   0    0:iload           4
		//*   1    2:ifne            12
				c(coordinatorlayout, view, view1);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:invokevirtual   #26  <Method void c(CoordinatorLayout, View, View)>
		//    7   12:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int k1, int l1)
		{
		//    0    0:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int k1, int l1, 
				int i2)
		{
			if(i2 == 0)
		//*   0    0:iload           8
		//*   1    2:ifne            20
				a(coordinatorlayout, view, view1, i1, j1, k1, l1);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:iload           4
		//    7   11:iload           5
		//    8   13:iload           6
		//    9   15:iload           7
		//   10   17:invokevirtual   #34  <Method void a(CoordinatorLayout, View, View, int, int, int, int)>
		//   11   20:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[])
		{
		//    0    0:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[], int k1)
		{
			if(k1 == 0)
		//*   0    0:iload           7
		//*   1    2:ifne            18
				a(coordinatorlayout, view, view1, i1, j1, ai);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:iload           4
		//    7   11:iload           5
		//    8   13:aload           6
		//    9   15:invokevirtual   #40  <Method void a(CoordinatorLayout, View, View, int, int, int[])>
		//   10   18:return          
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1, int j1, int k1, int l1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f1, float f2)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f1, float f2, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1, int j1)
		{
			if(j1 == 0)
		//*   0    0:iload           6
		//*   1    2:ifne            17
				return a(coordinatorlayout, view, view1, view2, i1);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:aload           4
		//    7   11:iload           5
		//    8   13:invokevirtual   #62  <Method boolean a(CoordinatorLayout, View, View, View, int)>
		//    9   16:ireturn         
			else
				return false;
		//   10   17:iconst_0        
		//   11   18:ireturn         
		}

		public Parcelable b(CoordinatorLayout coordinatorlayout, View view)
		{
			return ((Parcelable) (android.view.View.BaseSavedState.EMPTY_STATE));
		//    0    0:getstatic       #71  <Field android.view.AbsSavedState android.view.View$BaseSavedState.EMPTY_STATE>
		//    1    3:areturn         
		}

		public void b(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1)
		{
		//    0    0:return          
		}

		public void b(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1, int j1)
		{
			if(j1 == 0)
		//*   0    0:iload           6
		//*   1    2:ifne            16
				b(coordinatorlayout, view, view1, view2, i1);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:aload           4
		//    7   11:iload           5
		//    8   13:invokevirtual   #77  <Method void b(CoordinatorLayout, View, View, View, int)>
		//    9   16:return          
		}

		public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int c(CoordinatorLayout coordinatorlayout, View view)
		{
			return 0xff000000;
		//    0    0:ldc1            #80  <Int 0xff000000>
		//    1    2:ireturn         
		}

		public void c()
		{
		//    0    0:return          
		}

		public void c(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
		//    0    0:return          
		}

		public float d(CoordinatorLayout coordinatorlayout, View view)
		{
			return 0.0F;
		//    0    0:fconst_0        
		//    1    1:freturn         
		}

		public void d(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
		//    0    0:return          
		}

		public boolean e(CoordinatorLayout coordinatorlayout, View view)
		{
			return d(coordinatorlayout, view) > 0.0F;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #89  <Method float d(CoordinatorLayout, View)>
		//    4    6:fconst_0        
		//    5    7:fcmpl           
		//    6    8:ifle            13
		//    7   11:iconst_1        
		//    8   12:ireturn         
		//    9   13:iconst_0        
		//   10   14:ireturn         
		}

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #58  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			SparseArray sparsearray = a;
		//    4    6:aload_0         
		//    5    7:getfield        #47  <Field SparseArray a>
		//    6   10:astore          5
			int k1 = 0;
		//    7   12:iconst_0        
		//    8   13:istore          4
			int j1;
			if(sparsearray != null)
		//*   9   15:aload           5
		//*  10   17:ifnull          31
				j1 = a.size();
		//   11   20:aload_0         
		//   12   21:getfield        #47  <Field SparseArray a>
		//   13   24:invokevirtual   #61  <Method int SparseArray.size()>
		//   14   27:istore_3        
			else
		//*  15   28:goto            33
				j1 = 0;
		//   16   31:iconst_0        
		//   17   32:istore_3        
			parcel.writeInt(j1);
		//   18   33:aload_1         
		//   19   34:iload_3         
		//   20   35:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			int ai[] = new int[j1];
		//   21   38:iload_3         
		//   22   39:newarray        int[]
		//   23   41:astore          5
			Parcelable aparcelable[] = new Parcelable[j1];
		//   24   43:iload_3         
		//   25   44:anewarray       Parcelable[]
		//   26   47:astore          6
			for(; k1 < j1; k1++)
		//*  27   49:iload           4
		//*  28   51:iload_3         
		//*  29   52:icmpge          95
			{
				ai[k1] = a.keyAt(k1);
		//   30   55:aload           5
		//   31   57:iload           4
		//   32   59:aload_0         
		//   33   60:getfield        #47  <Field SparseArray a>
		//   34   63:iload           4
		//   35   65:invokevirtual   #70  <Method int SparseArray.keyAt(int)>
		//   36   68:iastore         
				aparcelable[k1] = (Parcelable)a.valueAt(k1);
		//   37   69:aload           6
		//   38   71:iload           4
		//   39   73:aload_0         
		//   40   74:getfield        #47  <Field SparseArray a>
		//   41   77:iload           4
		//   42   79:invokevirtual   #74  <Method Object SparseArray.valueAt(int)>
		//   43   82:checkcast       #66  <Class Parcelable>
		//   44   85:aastore         
			}

		//   45   86:iload           4
		//   46   88:iconst_1        
		//   47   89:iadd            
		//   48   90:istore          4
		//*  49   92:goto            49
			parcel.writeIntArray(ai);
		//   50   95:aload_1         
		//   51   96:aload           5
		//   52   98:invokevirtual   #77  <Method void Parcel.writeIntArray(int[])>
			parcel.writeParcelableArray(aparcelable, i1);
		//   53  101:aload_1         
		//   54  102:aload           6
		//   55  104:iload_2         
		//   56  105:invokevirtual   #81  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		//   57  108:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #28  <Method CoordinatorLayout$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method CoordinatorLayout$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method CoordinatorLayout$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		SparseArray a;

		static 
		{
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void CoordinatorLayout$SavedState$1()>
		//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void AbsSavedState(Parcel, ClassLoader)>
			int j1 = parcel.readInt();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #32  <Method int Parcel.readInt()>
		//    6   10:istore          4
			int ai[] = new int[j1];
		//    7   12:iload           4
		//    8   14:newarray        int[]
		//    9   16:astore          5
			parcel.readIntArray(ai);
		//   10   18:aload_1         
		//   11   19:aload           5
		//   12   21:invokevirtual   #36  <Method void Parcel.readIntArray(int[])>
			parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
		//   13   24:aload_1         
		//   14   25:aload_2         
		//   15   26:invokevirtual   #40  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
		//   16   29:astore_1        
			a = new SparseArray(j1);
		//   17   30:aload_0         
		//   18   31:new             #42  <Class SparseArray>
		//   19   34:dup             
		//   20   35:iload           4
		//   21   37:invokespecial   #45  <Method void SparseArray(int)>
		//   22   40:putfield        #47  <Field SparseArray a>
			for(int i1 = 0; i1 < j1; i1++)
		//*  23   43:iconst_0        
		//*  24   44:istore_3        
		//*  25   45:iload_3         
		//*  26   46:iload           4
		//*  27   48:icmpge          72
				a.append(ai[i1], ((Object) (parcel[i1])));
		//   28   51:aload_0         
		//   29   52:getfield        #47  <Field SparseArray a>
		//   30   55:aload           5
		//   31   57:iload_3         
		//   32   58:iaload          
		//   33   59:aload_1         
		//   34   60:iload_3         
		//   35   61:aaload          
		//   36   62:invokevirtual   #51  <Method void SparseArray.append(int, Object)>

		//   37   65:iload_3         
		//   38   66:iconst_1        
		//   39   67:iadd            
		//   40   68:istore_3        
		//*  41   69:goto            45
		//   42   72:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #54  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static interface a
		extends Annotation
	{

		public abstract Class a();
	}

	private class b
		implements android.view.ViewGroup.OnHierarchyChangeListener
	{

		public void onChildViewAdded(View view, View view1)
		{
			if(a.e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field CoordinatorLayout a>
		//*   2    4:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.e>
		//*   3    7:ifnull          24
				a.e.onChildViewAdded(view, view1);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field CoordinatorLayout a>
		//    6   14:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.e>
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokeinterface #27  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewAdded(View, View)>
		//   10   24:return          
		}

		public void onChildViewRemoved(View view, View view1)
		{
			a.a(2);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout a>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #31  <Method void android.support.design.widget.CoordinatorLayout.a(int)>
			if(a.e != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CoordinatorLayout a>
		//*   6   12:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.e>
		//*   7   15:ifnull          32
				a.e.onChildViewRemoved(view, view1);
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CoordinatorLayout a>
		//   10   22:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.e>
		//   11   25:aload_1         
		//   12   26:aload_2         
		//   13   27:invokeinterface #33  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewRemoved(View, View)>
		//   14   32:return          
		}

		final CoordinatorLayout a;

		b()
		{
			a = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static class c extends android.view.ViewGroup.MarginLayoutParams
	{

		private void a(View view, CoordinatorLayout coordinatorlayout)
		{
			k = coordinatorlayout.findViewById(f);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #44  <Field int f>
		//    4    6:invokevirtual   #136 <Method View CoordinatorLayout.findViewById(int)>
		//    5    9:putfield        #138 <Field View k>
			if(k == null) goto _L2; else goto _L1
		//    6   12:aload_0         
		//    7   13:getfield        #138 <Field View k>
		//    8   16:ifnull          133
_L1:
			if(k != coordinatorlayout) goto _L4; else goto _L3
		//    9   19:aload_0         
		//   10   20:getfield        #138 <Field View k>
		//   11   23:aload_2         
		//   12   24:if_acmpne       55
_L3:
			if(!coordinatorlayout.isInEditMode()) goto _L6; else goto _L5
		//   13   27:aload_2         
		//   14   28:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
		//   15   31:ifeq            45
_L5:
			l = null;
		//   16   34:aload_0         
		//   17   35:aconst_null     
		//   18   36:putfield        #144 <Field View l>
			k = null;
		//   19   39:aload_0         
		//   20   40:aconst_null     
		//   21   41:putfield        #138 <Field View k>
			return;
		//   22   44:return          
_L6:
			throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
		//   23   45:new             #146 <Class IllegalStateException>
		//   24   48:dup             
		//   25   49:ldc1            #148 <String "View can not be anchored to the the parent CoordinatorLayout">
		//   26   51:invokespecial   #151 <Method void IllegalStateException(String)>
		//   27   54:athrow          
_L4:
			View view1 = k;
		//   28   55:aload_0         
		//   29   56:getfield        #138 <Field View k>
		//   30   59:astore          4
			for(ViewParent viewparent = k.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
		//*  31   61:aload_0         
		//*  32   62:getfield        #138 <Field View k>
		//*  33   65:invokevirtual   #157 <Method ViewParent View.getParent()>
		//*  34   68:astore_3        
		//*  35   69:aload_3         
		//*  36   70:aload_2         
		//*  37   71:if_acmpeq       126
		//*  38   74:aload_3         
		//*  39   75:ifnull          126
			{
				if(viewparent == view)
		//*  40   78:aload_3         
		//*  41   79:aload_1         
		//*  42   80:if_acmpne       103
				{
					if(!coordinatorlayout.isInEditMode())
		//*  43   83:aload_2         
		//*  44   84:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  45   87:ifeq            93
		//*  46   90:goto            34
						throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
		//   47   93:new             #146 <Class IllegalStateException>
		//   48   96:dup             
		//   49   97:ldc1            #159 <String "Anchor must not be a descendant of the anchored view">
		//   50   99:invokespecial   #151 <Method void IllegalStateException(String)>
		//   51  102:athrow          
					continue; /* Loop/switch isn't completed */
				}
				if(viewparent instanceof View)
		//*  52  103:aload_3         
		//*  53  104:instanceof      #153 <Class View>
		//*  54  107:ifeq            116
					view1 = (View)viewparent;
		//   55  110:aload_3         
		//   56  111:checkcast       #153 <Class View>
		//   57  114:astore          4
			}

		//   58  116:aload_3         
		//   59  117:invokeinterface #162 <Method ViewParent ViewParent.getParent()>
		//   60  122:astore_3        
		//*  61  123:goto            69
			l = view1;
		//   62  126:aload_0         
		//   63  127:aload           4
		//   64  129:putfield        #144 <Field View l>
			return;
		//   65  132:return          
_L2:
			if(!coordinatorlayout.isInEditMode())
		//*  66  133:aload_2         
		//*  67  134:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  68  137:ifeq            143
		//*  69  140:goto            34
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   70  143:new             #164 <Class StringBuilder>
		//   71  146:dup             
		//   72  147:invokespecial   #165 <Method void StringBuilder()>
		//   73  150:astore_3        
				stringbuilder.append("Could not find CoordinatorLayout descendant view with id ");
		//   74  151:aload_3         
		//   75  152:ldc1            #167 <String "Could not find CoordinatorLayout descendant view with id ">
		//   76  154:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
		//   77  157:pop             
				stringbuilder.append(coordinatorlayout.getResources().getResourceName(f));
		//   78  158:aload_3         
		//   79  159:aload_2         
		//   80  160:invokevirtual   #175 <Method Resources CoordinatorLayout.getResources()>
		//   81  163:aload_0         
		//   82  164:getfield        #44  <Field int f>
		//   83  167:invokevirtual   #180 <Method String Resources.getResourceName(int)>
		//   84  170:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
		//   85  173:pop             
				stringbuilder.append(" to anchor view ");
		//   86  174:aload_3         
		//   87  175:ldc1            #182 <String " to anchor view ">
		//   88  177:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
		//   89  180:pop             
				stringbuilder.append(((Object) (view)));
		//   90  181:aload_3         
		//   91  182:aload_1         
		//   92  183:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
		//   93  186:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   94  187:new             #146 <Class IllegalStateException>
		//   95  190:dup             
		//   96  191:aload_3         
		//   97  192:invokevirtual   #189 <Method String StringBuilder.toString()>
		//   98  195:invokespecial   #151 <Method void IllegalStateException(String)>
		//   99  198:athrow          
			}
			if(true) goto _L5; else goto _L7
_L7:
		}

		private boolean a(View view, int i1)
		{
			int j1 = android.support.v4.view.d.a(((c)view.getLayoutParams()).g, i1);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #194 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #2   <Class CoordinatorLayout$c>
		//    3    7:getfield        #46  <Field int g>
		//    4   10:iload_2         
		//    5   11:invokestatic    #198 <Method int d.a(int, int)>
		//    6   14:istore_3        
			return j1 != 0 && (android.support.v4.view.d.a(h, i1) & j1) == j1;
		//    7   15:iload_3         
		//    8   16:ifeq            35
		//    9   19:aload_0         
		//   10   20:getfield        #48  <Field int h>
		//   11   23:iload_2         
		//   12   24:invokestatic    #198 <Method int d.a(int, int)>
		//   13   27:iload_3         
		//   14   28:iand            
		//   15   29:iload_3         
		//   16   30:icmpne          35
		//   17   33:iconst_1        
		//   18   34:ireturn         
		//   19   35:iconst_0        
		//   20   36:ireturn         
		}

		private boolean b(View view, CoordinatorLayout coordinatorlayout)
		{
			if(k.getId() != f)
		//*   0    0:aload_0         
		//*   1    1:getfield        #138 <Field View k>
		//*   2    4:invokevirtual   #203 <Method int View.getId()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field int f>
		//*   5   11:icmpeq          16
				return false;
		//    6   14:iconst_0        
		//    7   15:ireturn         
			View view1 = k;
		//    8   16:aload_0         
		//    9   17:getfield        #138 <Field View k>
		//   10   20:astore          4
			for(ViewParent viewparent = k.getParent(); viewparent != coordinatorlayout;)
		//*  11   22:aload_0         
		//*  12   23:getfield        #138 <Field View k>
		//*  13   26:invokevirtual   #157 <Method ViewParent View.getParent()>
		//*  14   29:astore_3        
		//*  15   30:aload_3         
		//*  16   31:aload_2         
		//*  17   32:if_acmpeq       82
				if(viewparent != null && viewparent != view)
		//*  18   35:aload_3         
		//*  19   36:ifnull          70
		//*  20   39:aload_3         
		//*  21   40:aload_1         
		//*  22   41:if_acmpne       47
		//*  23   44:goto            70
				{
					if(viewparent instanceof View)
		//*  24   47:aload_3         
		//*  25   48:instanceof      #153 <Class View>
		//*  26   51:ifeq            60
						view1 = (View)viewparent;
		//   27   54:aload_3         
		//   28   55:checkcast       #153 <Class View>
		//   29   58:astore          4
					viewparent = viewparent.getParent();
		//   30   60:aload_3         
		//   31   61:invokeinterface #162 <Method ViewParent ViewParent.getParent()>
		//   32   66:astore_3        
				} else
		//*  33   67:goto            30
				{
					l = null;
		//   34   70:aload_0         
		//   35   71:aconst_null     
		//   36   72:putfield        #144 <Field View l>
					k = null;
		//   37   75:aload_0         
		//   38   76:aconst_null     
		//   39   77:putfield        #138 <Field View k>
					return false;
		//   40   80:iconst_0        
		//   41   81:ireturn         
				}

			l = view1;
		//   42   82:aload_0         
		//   43   83:aload           4
		//   44   85:putfield        #144 <Field View l>
			return true;
		//   45   88:iconst_1        
		//   46   89:ireturn         
		}

		public int a()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int f>
		//    2    4:ireturn         
		}

		public void a(int i1)
		{
			i();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #206 <Method void i()>
			f = i1;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #44  <Field int f>
		//    5    9:return          
		}

		void a(int i1, boolean flag)
		{
			switch(i1)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 31
		//		               1 25
			default:
				return;
		//    2   24:return          

			case 1: // '\001'
				q = flag;
		//    3   25:aload_0         
		//    4   26:iload_2         
		//    5   27:putfield        #209 <Field boolean q>
				return;
		//    6   30:return          

			case 0: // '\0'
				p = flag;
		//    7   31:aload_0         
		//    8   32:iload_2         
		//    9   33:putfield        #211 <Field boolean p>
				return;
		//   10   36:return          
			}
		}

		void a(Rect rect)
		{
			m.set(rect);
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Rect m>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #215 <Method void Rect.set(Rect)>
		//    4    8:return          
		}

		public void a(Behavior behavior)
		{
			if(a != behavior)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       46
			{
				if(a != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//*   6   12:ifnull          22
					a.c();
		//    7   15:aload_0         
		//    8   16:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//    9   19:invokevirtual   #218 <Method void CoordinatorLayout$Behavior.c()>
				a = behavior;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #117 <Field CoordinatorLayout$Behavior a>
				n = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #220 <Field Object n>
				b = true;
		//   16   32:aload_0         
		//   17   33:iconst_1        
		//   18   34:putfield        #36  <Field boolean b>
				if(behavior != null)
		//*  19   37:aload_1         
		//*  20   38:ifnull          46
					behavior.a(this);
		//   21   41:aload_1         
		//   22   42:aload_0         
		//   23   43:invokevirtual   #125 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout$c)>
			}
		//   24   46:return          
		}

		void a(boolean flag)
		{
			r = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #223 <Field boolean r>
		//    3    5:return          
		}

		boolean a(CoordinatorLayout coordinatorlayout, View view)
		{
			if(o)
		//*   0    0:aload_0         
		//*   1    1:getfield        #226 <Field boolean o>
		//*   2    4:ifeq            9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			boolean flag1 = o;
		//    5    9:aload_0         
		//    6   10:getfield        #226 <Field boolean o>
		//    7   13:istore          4
			boolean flag;
			if(a != null)
		//*   8   15:aload_0         
		//*   9   16:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//*  10   19:ifnull          35
				flag = a.e(coordinatorlayout, view);
		//   11   22:aload_0         
		//   12   23:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:invokevirtual   #228 <Method boolean CoordinatorLayout$Behavior.e(CoordinatorLayout, View)>
		//   16   31:istore_3        
			else
		//*  17   32:goto            37
				flag = false;
		//   18   35:iconst_0        
		//   19   36:istore_3        
			flag |= flag1;
		//   20   37:iload_3         
		//   21   38:iload           4
		//   22   40:ior             
		//   23   41:istore_3        
			o = flag;
		//   24   42:aload_0         
		//   25   43:iload_3         
		//   26   44:putfield        #226 <Field boolean o>
			return flag;
		//   27   47:iload_3         
		//   28   48:ireturn         
		}

		boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return view1 == l || a(view1, android.support.v4.view.s.e(((View) (coordinatorlayout)))) || a != null && a.a(coordinatorlayout, view, view1);
		//    0    0:aload_3         
		//    1    1:aload_0         
		//    2    2:getfield        #144 <Field View l>
		//    3    5:if_acmpeq       45
		//    4    8:aload_0         
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:invokestatic    #234 <Method int s.e(View)>
		//    8   14:invokespecial   #236 <Method boolean a(View, int)>
		//    9   17:ifne            45
		//   10   20:aload_0         
		//   11   21:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//   12   24:ifnull          43
		//   13   27:aload_0         
		//   14   28:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//   15   31:aload_1         
		//   16   32:aload_2         
		//   17   33:aload_3         
		//   18   34:invokevirtual   #238 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View)>
		//   19   37:ifeq            43
		//   20   40:goto            45
		//   21   43:iconst_0        
		//   22   44:ireturn         
		//   23   45:iconst_1        
		//   24   46:ireturn         
		}

		public Behavior b()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//    2    4:areturn         
		}

		View b(CoordinatorLayout coordinatorlayout, View view)
		{
			if(f == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field int f>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          20
			{
				l = null;
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:putfield        #144 <Field View l>
				k = null;
		//    7   13:aload_0         
		//    8   14:aconst_null     
		//    9   15:putfield        #138 <Field View k>
				return null;
		//   10   18:aconst_null     
		//   11   19:areturn         
			}
			if(k == null || !b(view, coordinatorlayout))
		//*  12   20:aload_0         
		//*  13   21:getfield        #138 <Field View k>
		//*  14   24:ifnull          36
		//*  15   27:aload_0         
		//*  16   28:aload_2         
		//*  17   29:aload_1         
		//*  18   30:invokespecial   #242 <Method boolean b(View, CoordinatorLayout)>
		//*  19   33:ifne            42
				a(view, coordinatorlayout);
		//   20   36:aload_0         
		//   21   37:aload_2         
		//   22   38:aload_1         
		//   23   39:invokespecial   #244 <Method void a(View, CoordinatorLayout)>
			return k;
		//   24   42:aload_0         
		//   25   43:getfield        #138 <Field View k>
		//   26   46:areturn         
		}

		void b(int i1)
		{
			a(i1, false);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #246 <Method void a(int, boolean)>
		//    4    6:return          
		}

		Rect c()
		{
			return m;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Rect m>
		//    2    4:areturn         
		}

		boolean c(int i1)
		{
			switch(i1)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 31
		//		               1 26
			default:
				return false;
		//    2   24:iconst_0        
		//    3   25:ireturn         

			case 1: // '\001'
				return q;
		//    4   26:aload_0         
		//    5   27:getfield        #209 <Field boolean q>
		//    6   30:ireturn         

			case 0: // '\0'
				return p;
		//    7   31:aload_0         
		//    8   32:getfield        #211 <Field boolean p>
		//    9   35:ireturn         
			}
		}

		boolean d()
		{
			return k == null && f != -1;
		//    0    0:aload_0         
		//    1    1:getfield        #138 <Field View k>
		//    2    4:ifnonnull       17
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field int f>
		//    5   11:iconst_m1       
		//    6   12:icmpeq          17
		//    7   15:iconst_1        
		//    8   16:ireturn         
		//    9   17:iconst_0        
		//   10   18:ireturn         
		}

		boolean e()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//*   2    4:ifnonnull       12
				o = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #226 <Field boolean o>
			return o;
		//    6   12:aload_0         
		//    7   13:getfield        #226 <Field boolean o>
		//    8   16:ireturn         
		}

		void f()
		{
			o = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #226 <Field boolean o>
		//    3    5:return          
		}

		boolean g()
		{
			return r;
		//    0    0:aload_0         
		//    1    1:getfield        #223 <Field boolean r>
		//    2    4:ireturn         
		}

		void h()
		{
			r = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #223 <Field boolean r>
		//    3    5:return          
		}

		void i()
		{
			l = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #144 <Field View l>
			k = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #138 <Field View k>
		//    6   10:return          
		}

		Behavior a;
		boolean b;
		public int c;
		public int d;
		public int e;
		int f;
		public int g;
		public int h;
		int i;
		int j;
		View k;
		View l;
		final Rect m;
		Object n;
		private boolean o;
		private boolean p;
		private boolean q;
		private boolean r;

		public c(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			b = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #36  <Field boolean b>
			c = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #38  <Field int c>
			d = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #40  <Field int d>
			e = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #42  <Field int e>
			f = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #44  <Field int f>
			g = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #46  <Field int g>
			h = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #48  <Field int h>
			m = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #50  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #53  <Method void Rect()>
		//   29   49:putfield        #55  <Field Rect m>
		//   30   52:return          
		}

		c(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			b = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #36  <Field boolean b>
			c = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #38  <Field int c>
			d = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #40  <Field int d>
			e = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #42  <Field int e>
			f = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #44  <Field int f>
			g = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #46  <Field int g>
			h = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #48  <Field int h>
			m = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #50  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #53  <Method void Rect()>
		//   29   49:putfield        #55  <Field Rect m>
			TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.k.CoordinatorLayout_Layout);
		//   30   52:aload_1         
		//   31   53:aload_2         
		//   32   54:getstatic       #65  <Field int[] android.support.design.a$k.CoordinatorLayout_Layout>
		//   33   57:invokevirtual   #71  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   34   60:astore_3        
			c = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_android_layout_gravity, 0);
		//   35   61:aload_0         
		//   36   62:aload_3         
		//   37   63:getstatic       #74  <Field int android.support.design.a$k.CoordinatorLayout_Layout_android_layout_gravity>
		//   38   66:iconst_0        
		//   39   67:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   40   70:putfield        #38  <Field int c>
			f = typedarray.getResourceId(android.support.design.a.k.CoordinatorLayout_Layout_layout_anchor, -1);
		//   41   73:aload_0         
		//   42   74:aload_3         
		//   43   75:getstatic       #83  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_anchor>
		//   44   78:iconst_m1       
		//   45   79:invokevirtual   #86  <Method int TypedArray.getResourceId(int, int)>
		//   46   82:putfield        #44  <Field int f>
			d = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_layout_anchorGravity, 0);
		//   47   85:aload_0         
		//   48   86:aload_3         
		//   49   87:getstatic       #89  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_anchorGravity>
		//   50   90:iconst_0        
		//   51   91:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   52   94:putfield        #40  <Field int d>
			e = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_layout_keyline, -1);
		//   53   97:aload_0         
		//   54   98:aload_3         
		//   55   99:getstatic       #92  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_keyline>
		//   56  102:iconst_m1       
		//   57  103:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   58  106:putfield        #42  <Field int e>
			g = typedarray.getInt(android.support.design.a.k.CoordinatorLayout_Layout_layout_insetEdge, 0);
		//   59  109:aload_0         
		//   60  110:aload_3         
		//   61  111:getstatic       #95  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_insetEdge>
		//   62  114:iconst_0        
		//   63  115:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
		//   64  118:putfield        #46  <Field int g>
			h = typedarray.getInt(android.support.design.a.k.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
		//   65  121:aload_0         
		//   66  122:aload_3         
		//   67  123:getstatic       #101 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
		//   68  126:iconst_0        
		//   69  127:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
		//   70  130:putfield        #48  <Field int h>
			b = typedarray.hasValue(android.support.design.a.k.CoordinatorLayout_Layout_layout_behavior);
		//   71  133:aload_0         
		//   72  134:aload_3         
		//   73  135:getstatic       #104 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_behavior>
		//   74  138:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
		//   75  141:putfield        #36  <Field boolean b>
			if(b)
		//*  76  144:aload_0         
		//*  77  145:getfield        #36  <Field boolean b>
		//*  78  148:ifeq            167
				a = android.support.design.widget.CoordinatorLayout.a(context, attributeset, typedarray.getString(android.support.design.a.k.CoordinatorLayout_Layout_layout_behavior));
		//   79  151:aload_0         
		//   80  152:aload_1         
		//   81  153:aload_2         
		//   82  154:aload_3         
		//   83  155:getstatic       #104 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_behavior>
		//   84  158:invokevirtual   #112 <Method String TypedArray.getString(int)>
		//   85  161:invokestatic    #115 <Method CoordinatorLayout$Behavior android.support.design.widget.CoordinatorLayout.a(Context, AttributeSet, String)>
		//   86  164:putfield        #117 <Field CoordinatorLayout$Behavior a>
			typedarray.recycle();
		//   87  167:aload_3         
		//   88  168:invokevirtual   #120 <Method void TypedArray.recycle()>
			if(a != null)
		//*  89  171:aload_0         
		//*  90  172:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//*  91  175:ifnull          186
				a.a(this);
		//   92  178:aload_0         
		//   93  179:getfield        #117 <Field CoordinatorLayout$Behavior a>
		//   94  182:aload_0         
		//   95  183:invokevirtual   #125 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout$c)>
		//   96  186:return          
		}

		public c(c c1)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (c1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #128 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			b = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean b>
			c = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int c>
			d = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int d>
			e = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int e>
			f = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int f>
			g = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int g>
			h = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int h>
			m = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect m>
		//   29   51:return          
		}

		public c(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			b = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean b>
			c = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int c>
			d = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int d>
			e = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int e>
			f = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int f>
			g = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int g>
			h = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int h>
			m = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect m>
		//   29   51:return          
		}

		public c(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #128 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			b = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean b>
			c = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int c>
			d = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int d>
			e = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int e>
			f = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int f>
			g = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int g>
			h = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int h>
			m = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect m>
		//   29   51:return          
		}
	}

	class d
		implements android.view.ViewTreeObserver.OnPreDrawListener
	{

		public boolean onPreDraw()
		{
			a.a(0);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout a>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #24  <Method void android.support.design.widget.CoordinatorLayout.a(int)>
			return true;
		//    4    8:iconst_1        
		//    5    9:ireturn         
		}

		final CoordinatorLayout a;

		d()
		{
			a = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	static class e
		implements Comparator
	{

		public int a(View view, View view1)
		{
			float f1 = android.support.v4.view.s.y(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method float s.y(View)>
		//    2    4:fstore_3        
			float f2 = android.support.v4.view.s.y(view1);
		//    3    5:aload_2         
		//    4    6:invokestatic    #23  <Method float s.y(View)>
		//    5    9:fstore          4
			if(f1 > f2)
		//*   6   11:fload_3         
		//*   7   12:fload           4
		//*   8   14:fcmpl           
		//*   9   15:ifle            20
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
			return f1 >= f2 ? 0 : 1;
		//   12   20:fload_3         
		//   13   21:fload           4
		//   14   23:fcmpg           
		//   15   24:ifge            29
		//   16   27:iconst_1        
		//   17   28:ireturn         
		//   18   29:iconst_0        
		//   19   30:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return a((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #27  <Class View>
		//    5    9:invokevirtual   #29  <Method int a(View, View)>
		//    6   12:ireturn         
		}

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public CoordinatorLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #123 <Method void CoordinatorLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #126 <Method void CoordinatorLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #127 <Method void ViewGroup(Context, AttributeSet, int)>
		g = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #129 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #130 <Method void ArrayList()>
	//    9   15:putfield        #132 <Field List g>
		h = new f();
	//   10   18:aload_0         
	//   11   19:new             #134 <Class f>
	//   12   22:dup             
	//   13   23:invokespecial   #135 <Method void f()>
	//   14   26:putfield        #137 <Field f h>
		i = ((List) (new ArrayList()));
	//   15   29:aload_0         
	//   16   30:new             #129 <Class ArrayList>
	//   17   33:dup             
	//   18   34:invokespecial   #130 <Method void ArrayList()>
	//   19   37:putfield        #139 <Field List i>
		j = ((List) (new ArrayList()));
	//   20   40:aload_0         
	//   21   41:new             #129 <Class ArrayList>
	//   22   44:dup             
	//   23   45:invokespecial   #130 <Method void ArrayList()>
	//   24   48:putfield        #141 <Field List j>
		k = new int[2];
	//   25   51:aload_0         
	//   26   52:iconst_2        
	//   27   53:newarray        int[]
	//   28   55:putfield        #143 <Field int[] k>
		x = new n(((ViewGroup) (this)));
	//   29   58:aload_0         
	//   30   59:new             #145 <Class n>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokespecial   #148 <Method void n(ViewGroup)>
	//   34   67:putfield        #150 <Field n x>
		android.support.design.widget.n.a(context);
	//   35   70:aload_1         
	//   36   71:invokestatic    #154 <Method void android.support.design.widget.n.a(Context)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.CoordinatorLayout, i1, android.support.design.a.j.Widget_Design_CoordinatorLayout)));
	//   37   74:aload_1         
	//   38   75:aload_2         
	//   39   76:getstatic       #159 <Field int[] android.support.design.a$k.CoordinatorLayout>
	//   40   79:iload_3         
	//   41   80:getstatic       #164 <Field int android.support.design.a$j.Widget_Design_CoordinatorLayout>
	//   42   83:invokevirtual   #168 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   43   86:astore_2        
		int j1 = android.support.design.a.k.CoordinatorLayout_keylines;
	//   44   87:getstatic       #171 <Field int android.support.design.a$k.CoordinatorLayout_keylines>
	//   45   90:istore          5
		i1 = 0;
	//   46   92:iconst_0        
	//   47   93:istore_3        
		j1 = ((TypedArray) (attributeset)).getResourceId(j1, 0);
	//   48   94:aload_2         
	//   49   95:iload           5
	//   50   97:iconst_0        
	//   51   98:invokevirtual   #177 <Method int TypedArray.getResourceId(int, int)>
	//   52  101:istore          5
		if(j1 != 0)
	//*  53  103:iload           5
	//*  54  105:ifeq            169
		{
			context = ((Context) (context.getResources()));
	//   55  108:aload_1         
	//   56  109:invokevirtual   #181 <Method Resources Context.getResources()>
	//   57  112:astore_1        
			o = ((Resources) (context)).getIntArray(j1);
	//   58  113:aload_0         
	//   59  114:aload_1         
	//   60  115:iload           5
	//   61  117:invokevirtual   #187 <Method int[] Resources.getIntArray(int)>
	//   62  120:putfield        #189 <Field int[] o>
			float f1 = ((Resources) (context)).getDisplayMetrics().density;
	//   63  123:aload_1         
	//   64  124:invokevirtual   #193 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   65  127:getfield        #199 <Field float DisplayMetrics.density>
	//   66  130:fstore          4
			for(int k1 = o.length; i1 < k1; i1++)
	//*  67  132:aload_0         
	//*  68  133:getfield        #189 <Field int[] o>
	//*  69  136:arraylength     
	//*  70  137:istore          5
	//*  71  139:iload_3         
	//*  72  140:iload           5
	//*  73  142:icmpge          169
				o[i1] = (int)((float)o[i1] * f1);
	//   74  145:aload_0         
	//   75  146:getfield        #189 <Field int[] o>
	//   76  149:iload_3         
	//   77  150:aload_0         
	//   78  151:getfield        #189 <Field int[] o>
	//   79  154:iload_3         
	//   80  155:iaload          
	//   81  156:i2f             
	//   82  157:fload           4
	//   83  159:fmul            
	//   84  160:f2i             
	//   85  161:iastore         

	//   86  162:iload_3         
	//   87  163:iconst_1        
	//   88  164:iadd            
	//   89  165:istore_3        
		}
	//*  90  166:goto            139
		v = ((TypedArray) (attributeset)).getDrawable(android.support.design.a.k.CoordinatorLayout_statusBarBackground);
	//   91  169:aload_0         
	//   92  170:aload_2         
	//   93  171:getstatic       #202 <Field int android.support.design.a$k.CoordinatorLayout_statusBarBackground>
	//   94  174:invokevirtual   #206 <Method Drawable TypedArray.getDrawable(int)>
	//   95  177:putfield        #208 <Field Drawable v>
		((TypedArray) (attributeset)).recycle();
	//   96  180:aload_2         
	//   97  181:invokevirtual   #211 <Method void TypedArray.recycle()>
		h();
	//   98  184:aload_0         
	//   99  185:invokespecial   #213 <Method void h()>
		super.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (new b())));
	//  100  188:aload_0         
	//  101  189:new             #21  <Class CoordinatorLayout$b>
	//  102  192:dup             
	//  103  193:aload_0         
	//  104  194:invokespecial   #216 <Method void CoordinatorLayout$b(CoordinatorLayout)>
	//  105  197:invokespecial   #220 <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
	//  106  200:return          
	}

	static Behavior a(Context context, AttributeSet attributeset, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #229 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj;
		if(s1.startsWith("."))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #231 <String ".">
	//*   7   12:invokevirtual   #237 <Method boolean String.startsWith(String)>
	//*   8   15:ifeq            49
		{
			obj = ((Object) (new StringBuilder()));
	//    9   18:new             #239 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #240 <Method void StringBuilder()>
	//   12   25:astore_3        
			((StringBuilder) (obj)).append(context.getPackageName());
	//   13   26:aload_3         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #243 <Method String Context.getPackageName()>
	//   16   31:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			((StringBuilder) (obj)).append(s1);
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   41:aload_3         
	//   23   42:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   24   45:astore_3        
		} else
	//*  25   46:goto            108
		if(s1.indexOf('.') >= 0)
	//*  26   49:aload_2         
	//*  27   50:bipush          46
	//*  28   52:invokevirtual   #254 <Method int String.indexOf(int)>
	//*  29   55:iflt            63
		{
			obj = ((Object) (s1));
	//   30   58:aload_2         
	//   31   59:astore_3        
		} else
	//*  32   60:goto            108
		{
			obj = ((Object) (s1));
	//   33   63:aload_2         
	//   34   64:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (a))))
	//*  35   65:getstatic       #89  <Field String a>
	//*  36   68:invokestatic    #229 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   71:ifne            108
			{
				obj = ((Object) (new StringBuilder()));
	//   38   74:new             #239 <Class StringBuilder>
	//   39   77:dup             
	//   40   78:invokespecial   #240 <Method void StringBuilder()>
	//   41   81:astore_3        
				((StringBuilder) (obj)).append(a);
	//   42   82:aload_3         
	//   43   83:getstatic       #89  <Field String a>
	//   44   86:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
				((StringBuilder) (obj)).append('.');
	//   46   90:aload_3         
	//   47   91:bipush          46
	//   48   93:invokevirtual   #257 <Method StringBuilder StringBuilder.append(char)>
	//   49   96:pop             
				((StringBuilder) (obj)).append(s1);
	//   50   97:aload_3         
	//   51   98:aload_2         
	//   52   99:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  103:aload_3         
	//   55  104:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   56  107:astore_3        
			}
		}
		Object obj1;
		Constructor constructor;
		try
		{
			obj1 = ((Object) ((Map)c.get()));
	//   57  108:getstatic       #111 <Field ThreadLocal c>
	//   58  111:invokevirtual   #261 <Method Object ThreadLocal.get()>
	//   59  114:checkcast       #263 <Class Map>
	//   60  117:astore          4
		}
	//*  61  119:aload           4
	//*  62  121:astore_2        
	//*  63  122:aload           4
	//*  64  124:ifnonnull       142
	//*  65  127:new             #265 <Class HashMap>
	//*  66  130:dup             
	//*  67  131:invokespecial   #266 <Method void HashMap()>
	//*  68  134:astore_2        
	//*  69  135:getstatic       #111 <Field ThreadLocal c>
	//*  70  138:aload_2         
	//*  71  139:invokevirtual   #270 <Method void ThreadLocal.set(Object)>
	//*  72  142:aload_2         
	//*  73  143:aload_3         
	//*  74  144:invokeinterface #273 <Method Object Map.get(Object)>
	//*  75  149:checkcast       #275 <Class Constructor>
	//*  76  152:astore          5
	//*  77  154:aload           5
	//*  78  156:astore          4
	//*  79  158:aload           5
	//*  80  160:ifnonnull       196
	//*  81  163:aload_3         
	//*  82  164:iconst_1        
	//*  83  165:aload_0         
	//*  84  166:invokevirtual   #279 <Method ClassLoader Context.getClassLoader()>
	//*  85  169:invokestatic    #283 <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  86  172:getstatic       #106 <Field Class[] b>
	//*  87  175:invokevirtual   #287 <Method Constructor Class.getConstructor(Class[])>
	//*  88  178:astore          4
	//*  89  180:aload           4
	//*  90  182:iconst_1        
	//*  91  183:invokevirtual   #291 <Method void Constructor.setAccessible(boolean)>
	//*  92  186:aload_2         
	//*  93  187:aload_3         
	//*  94  188:aload           4
	//*  95  190:invokeinterface #295 <Method Object Map.put(Object, Object)>
	//*  96  195:pop             
	//*  97  196:aload           4
	//*  98  198:iconst_2        
	//*  99  199:anewarray       Object[]
	//* 100  202:dup             
	//* 101  203:iconst_0        
	//* 102  204:aload_0         
	//* 103  205:aastore         
	//* 104  206:dup             
	//* 105  207:iconst_1        
	//* 106  208:aload_1         
	//* 107  209:aastore         
	//* 108  210:invokevirtual   #301 <Method Object Constructor.newInstance(Object[])>
	//* 109  213:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//* 110  216:astore_0        
	//* 111  217:aload_0         
	//* 112  218:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 113  219:astore_0        
		{
			attributeset = ((AttributeSet) (new StringBuilder()));
	//  114  220:new             #239 <Class StringBuilder>
	//  115  223:dup             
	//  116  224:invokespecial   #240 <Method void StringBuilder()>
	//  117  227:astore_1        
			((StringBuilder) (attributeset)).append("Could not inflate Behavior subclass ");
	//  118  228:aload_1         
	//  119  229:ldc2            #303 <String "Could not inflate Behavior subclass ">
	//  120  232:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//  121  235:pop             
			((StringBuilder) (attributeset)).append(((String) (obj)));
	//  122  236:aload_1         
	//  123  237:aload_3         
	//  124  238:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//  125  241:pop             
			throw new RuntimeException(((StringBuilder) (attributeset)).toString(), ((Throwable) (context)));
	//  126  242:new             #305 <Class RuntimeException>
	//  127  245:dup             
	//  128  246:aload_1         
	//  129  247:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  130  250:aload_0         
	//  131  251:invokespecial   #308 <Method void RuntimeException(String, Throwable)>
	//  132  254:athrow          
		}
		s1 = ((String) (obj1));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_142;
		s1 = ((String) (new HashMap()));
		c.set(((Object) (s1)));
		constructor = (Constructor)((Map) (s1)).get(obj);
		obj1 = ((Object) (constructor));
		if(constructor != null)
			break MISSING_BLOCK_LABEL_196;
		obj1 = ((Object) (Class.forName(((String) (obj)), true, context.getClassLoader()).getConstructor(b)));
		((Constructor) (obj1)).setAccessible(true);
		((Map) (s1)).put(obj, obj1);
		context = ((Context) ((Behavior)((Constructor) (obj1)).newInstance(new Object[] {
			context, attributeset
		})));
		return ((Behavior) (context));
	}

	private static void a(Rect rect)
	{
		rect.setEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #314 <Method void Rect.setEmpty()>
		f.a(((Object) (rect)));
	//    2    4:getstatic       #118 <Field android.support.v4.f.k$a f>
	//    3    7:aload_0         
	//    4    8:invokeinterface #319 <Method boolean android.support.v4.f.k$a.a(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void a(c c1, Rect rect, int i1, int j1)
	{
		int l1 = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #324 <Method int getWidth()>
	//    2    4:istore          6
		int k1 = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #327 <Method int getHeight()>
	//    5   10:istore          5
		l1 = Math.max(getPaddingLeft() + c1.leftMargin, Math.min(rect.left, l1 - getPaddingRight() - i1 - c1.rightMargin));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #330 <Method int getPaddingLeft()>
	//    8   16:aload_1         
	//    9   17:getfield        #333 <Field int CoordinatorLayout$c.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #336 <Field int Rect.left>
	//   13   25:iload           6
	//   14   27:aload_0         
	//   15   28:invokevirtual   #339 <Method int getPaddingRight()>
	//   16   31:isub            
	//   17   32:iload_3         
	//   18   33:isub            
	//   19   34:aload_1         
	//   20   35:getfield        #342 <Field int CoordinatorLayout$c.rightMargin>
	//   21   38:isub            
	//   22   39:invokestatic    #347 <Method int Math.min(int, int)>
	//   23   42:invokestatic    #350 <Method int Math.max(int, int)>
	//   24   45:istore          6
		k1 = Math.max(getPaddingTop() + c1.topMargin, Math.min(rect.top, k1 - getPaddingBottom() - j1 - c1.bottomMargin));
	//   25   47:aload_0         
	//   26   48:invokevirtual   #353 <Method int getPaddingTop()>
	//   27   51:aload_1         
	//   28   52:getfield        #356 <Field int CoordinatorLayout$c.topMargin>
	//   29   55:iadd            
	//   30   56:aload_2         
	//   31   57:getfield        #359 <Field int Rect.top>
	//   32   60:iload           5
	//   33   62:aload_0         
	//   34   63:invokevirtual   #362 <Method int getPaddingBottom()>
	//   35   66:isub            
	//   36   67:iload           4
	//   37   69:isub            
	//   38   70:aload_1         
	//   39   71:getfield        #365 <Field int CoordinatorLayout$c.bottomMargin>
	//   40   74:isub            
	//   41   75:invokestatic    #347 <Method int Math.min(int, int)>
	//   42   78:invokestatic    #350 <Method int Math.max(int, int)>
	//   43   81:istore          5
		rect.set(l1, k1, i1 + l1, j1 + k1);
	//   44   83:aload_2         
	//   45   84:iload           6
	//   46   86:iload           5
	//   47   88:iload_3         
	//   48   89:iload           6
	//   49   91:iadd            
	//   50   92:iload           4
	//   51   94:iload           5
	//   52   96:iadd            
	//   53   97:invokevirtual   #368 <Method void Rect.set(int, int, int, int)>
	//   54  100:return          
	}

	private void a(View view, int i1, Rect rect, Rect rect1, c c1, int j1, int k1)
	{
		int l1 = android.support.v4.view.d.a(e(c1.c), i1);
	//    0    0:aload           5
	//    1    2:getfield        #371 <Field int CoordinatorLayout$c.c>
	//    2    5:invokestatic    #373 <Method int e(int)>
	//    3    8:iload_2         
	//    4    9:invokestatic    #377 <Method int d.a(int, int)>
	//    5   12:istore          8
		i1 = android.support.v4.view.d.a(c(c1.d), i1);
	//    6   14:aload           5
	//    7   16:getfield        #379 <Field int android.support.design.widget.CoordinatorLayout$c.d>
	//    8   19:invokestatic    #381 <Method int c(int)>
	//    9   22:iload_2         
	//   10   23:invokestatic    #377 <Method int d.a(int, int)>
	//   11   26:istore_2        
		int k2 = l1 & 7;
	//   12   27:iload           8
	//   13   29:bipush          7
	//   14   31:iand            
	//   15   32:istore          11
		int j2 = l1 & 0x70;
	//   16   34:iload           8
	//   17   36:bipush          112
	//   18   38:iand            
	//   19   39:istore          10
		int i2 = i1 & 7;
	//   20   41:iload_2         
	//   21   42:bipush          7
	//   22   44:iand            
	//   23   45:istore          9
		l1 = i1 & 0x70;
	//   24   47:iload_2         
	//   25   48:bipush          112
	//   26   50:iand            
	//   27   51:istore          8
		if(i2 != 1)
	//*  28   53:iload           9
	//*  29   55:iconst_1        
	//*  30   56:icmpeq          81
		{
			if(i2 != 5)
	//*  31   59:iload           9
	//*  32   61:iconst_5        
	//*  33   62:icmpeq          73
				i1 = rect.left;
	//   34   65:aload_3         
	//   35   66:getfield        #336 <Field int Rect.left>
	//   36   69:istore_2        
			else
	//*  37   70:goto            93
				i1 = rect.right;
	//   38   73:aload_3         
	//   39   74:getfield        #384 <Field int Rect.right>
	//   40   77:istore_2        
		} else
	//*  41   78:goto            93
		{
			i1 = rect.left + rect.width() / 2;
	//   42   81:aload_3         
	//   43   82:getfield        #336 <Field int Rect.left>
	//   44   85:aload_3         
	//   45   86:invokevirtual   #387 <Method int Rect.width()>
	//   46   89:iconst_2        
	//   47   90:idiv            
	//   48   91:iadd            
	//   49   92:istore_2        
		}
		if(l1 != 16)
	//*  50   93:iload           8
	//*  51   95:bipush          16
	//*  52   97:icmpeq          125
		{
			if(l1 != 80)
	//*  53  100:iload           8
	//*  54  102:bipush          80
	//*  55  104:icmpeq          116
				l1 = rect.top;
	//   56  107:aload_3         
	//   57  108:getfield        #359 <Field int Rect.top>
	//   58  111:istore          8
			else
	//*  59  113:goto            138
				l1 = rect.bottom;
	//   60  116:aload_3         
	//   61  117:getfield        #390 <Field int Rect.bottom>
	//   62  120:istore          8
		} else
	//*  63  122:goto            138
		{
			l1 = rect.top + rect.height() / 2;
	//   64  125:aload_3         
	//   65  126:getfield        #359 <Field int Rect.top>
	//   66  129:aload_3         
	//   67  130:invokevirtual   #393 <Method int Rect.height()>
	//   68  133:iconst_2        
	//   69  134:idiv            
	//   70  135:iadd            
	//   71  136:istore          8
		}
		if(k2 != 1)
	//*  72  138:iload           11
	//*  73  140:iconst_1        
	//*  74  141:icmpeq          162
		{
			i2 = i1;
	//   75  144:iload_2         
	//   76  145:istore          9
			if(k2 != 5)
	//*  77  147:iload           11
	//*  78  149:iconst_5        
	//*  79  150:icmpeq          170
				i2 = i1 - j1;
	//   80  153:iload_2         
	//   81  154:iload           6
	//   82  156:isub            
	//   83  157:istore          9
		} else
	//*  84  159:goto            170
		{
			i2 = i1 - j1 / 2;
	//   85  162:iload_2         
	//   86  163:iload           6
	//   87  165:iconst_2        
	//   88  166:idiv            
	//   89  167:isub            
	//   90  168:istore          9
		}
		if(j2 != 16)
	//*  91  170:iload           10
	//*  92  172:bipush          16
	//*  93  174:icmpeq          196
		{
			i1 = l1;
	//   94  177:iload           8
	//   95  179:istore_2        
			if(j2 != 80)
	//*  96  180:iload           10
	//*  97  182:bipush          80
	//*  98  184:icmpeq          204
				i1 = l1 - k1;
	//   99  187:iload           8
	//  100  189:iload           7
	//  101  191:isub            
	//  102  192:istore_2        
		} else
	//* 103  193:goto            204
		{
			i1 = l1 - k1 / 2;
	//  104  196:iload           8
	//  105  198:iload           7
	//  106  200:iconst_2        
	//  107  201:idiv            
	//  108  202:isub            
	//  109  203:istore_2        
		}
		rect1.set(i2, i1, j1 + i2, k1 + i1);
	//  110  204:aload           4
	//  111  206:iload           9
	//  112  208:iload_2         
	//  113  209:iload           6
	//  114  211:iload           9
	//  115  213:iadd            
	//  116  214:iload           7
	//  117  216:iload_2         
	//  118  217:iadd            
	//  119  218:invokevirtual   #368 <Method void Rect.set(int, int, int, int)>
	//  120  221:return          
	}

	private void a(View view, Rect rect, int i1)
	{
label0:
		{
			int l1;
			Rect rect1;
			c c1;
label1:
			{
				if(!android.support.v4.view.s.x(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #399 <Method boolean s.x(View)>
	//*   2    4:ifne            8
					return;
	//    3    7:return          
				if(view.getWidth() <= 0)
					break label0;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #402 <Method int View.getWidth()>
	//    6   12:ifle            449
				if(view.getHeight() <= 0)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #403 <Method int View.getHeight()>
	//*   9   19:ifgt            23
					return;
	//   10   22:return          
				c1 = (c)view.getLayoutParams();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   27:checkcast       #24  <Class CoordinatorLayout$c>
	//   14   30:astore          9
				Behavior behavior = c1.b();
	//   15   32:aload           9
	//   16   34:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   17   37:astore          10
				rect1 = e();
	//   18   39:invokestatic    #413 <Method Rect e()>
	//   19   42:astore          7
				Rect rect2 = e();
	//   20   44:invokestatic    #413 <Method Rect e()>
	//   21   47:astore          8
				rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   22   49:aload           8
	//   23   51:aload_1         
	//   24   52:invokevirtual   #416 <Method int View.getLeft()>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #419 <Method int View.getTop()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #422 <Method int View.getRight()>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #425 <Method int View.getBottom()>
	//   31   67:invokevirtual   #368 <Method void Rect.set(int, int, int, int)>
				if(behavior != null && behavior.a(this, view, rect1))
	//*  32   70:aload           10
	//*  33   72:ifnull          153
	//*  34   75:aload           10
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:aload           7
	//*  38   81:invokevirtual   #428 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, Rect)>
	//*  39   84:ifeq            153
				{
					if(!rect2.contains(rect1))
	//*  40   87:aload           8
	//*  41   89:aload           7
	//*  42   91:invokevirtual   #432 <Method boolean Rect.contains(Rect)>
	//*  43   94:ifne            160
					{
						view = ((View) (new StringBuilder()));
	//   44   97:new             #239 <Class StringBuilder>
	//   45  100:dup             
	//   46  101:invokespecial   #240 <Method void StringBuilder()>
	//   47  104:astore_1        
						((StringBuilder) (view)).append("Rect should be within the child's bounds. Rect:");
	//   48  105:aload_1         
	//   49  106:ldc2            #434 <String "Rect should be within the child's bounds. Rect:">
	//   50  109:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   51  112:pop             
						((StringBuilder) (view)).append(rect1.toShortString());
	//   52  113:aload_1         
	//   53  114:aload           7
	//   54  116:invokevirtual   #437 <Method String Rect.toShortString()>
	//   55  119:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
						((StringBuilder) (view)).append(" | Bounds:");
	//   57  123:aload_1         
	//   58  124:ldc2            #439 <String " | Bounds:">
	//   59  127:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   60  130:pop             
						((StringBuilder) (view)).append(rect2.toShortString());
	//   61  131:aload_1         
	//   62  132:aload           8
	//   63  134:invokevirtual   #437 <Method String Rect.toShortString()>
	//   64  137:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   65  140:pop             
						throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   66  141:new             #441 <Class IllegalArgumentException>
	//   67  144:dup             
	//   68  145:aload_1         
	//   69  146:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   70  149:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   71  152:athrow          
					}
				} else
				{
					rect1.set(rect2);
	//   72  153:aload           7
	//   73  155:aload           8
	//   74  157:invokevirtual   #446 <Method void Rect.set(Rect)>
				}
				a(rect2);
	//   75  160:aload           8
	//   76  162:invokestatic    #448 <Method void a(Rect)>
				if(rect1.isEmpty())
	//*  77  165:aload           7
	//*  78  167:invokevirtual   #451 <Method boolean Rect.isEmpty()>
	//*  79  170:ifeq            179
				{
					a(rect1);
	//   80  173:aload           7
	//   81  175:invokestatic    #448 <Method void a(Rect)>
					return;
	//   82  178:return          
				}
				l1 = android.support.v4.view.d.a(c1.h, i1);
	//   83  179:aload           9
	//   84  181:getfield        #453 <Field int CoordinatorLayout$c.h>
	//   85  184:iload_3         
	//   86  185:invokestatic    #377 <Method int d.a(int, int)>
	//   87  188:istore          5
				if((l1 & 0x30) == 48)
	//*  88  190:iload           5
	//*  89  192:bipush          48
	//*  90  194:iand            
	//*  91  195:bipush          48
	//*  92  197:icmpne          242
				{
					i1 = rect1.top - c1.topMargin - c1.j;
	//   93  200:aload           7
	//   94  202:getfield        #359 <Field int Rect.top>
	//   95  205:aload           9
	//   96  207:getfield        #356 <Field int CoordinatorLayout$c.topMargin>
	//   97  210:isub            
	//   98  211:aload           9
	//   99  213:getfield        #455 <Field int CoordinatorLayout$c.j>
	//  100  216:isub            
	//  101  217:istore_3        
					if(i1 < rect.top)
	//* 102  218:iload_3         
	//* 103  219:aload_2         
	//* 104  220:getfield        #359 <Field int Rect.top>
	//* 105  223:icmpge          242
					{
						f(view, rect.top - i1);
	//  106  226:aload_0         
	//  107  227:aload_1         
	//  108  228:aload_2         
	//  109  229:getfield        #359 <Field int Rect.top>
	//  110  232:iload_3         
	//  111  233:isub            
	//  112  234:invokespecial   #458 <Method void f(View, int)>
						i1 = 1;
	//  113  237:iconst_1        
	//  114  238:istore_3        
						break label1;
	//  115  239:goto            244
					}
				}
				i1 = 0;
	//  116  242:iconst_0        
	//  117  243:istore_3        
			}
label2:
			{
				int j1 = i1;
	//  118  244:iload_3         
	//  119  245:istore          4
				if((l1 & 0x50) == 80)
	//* 120  247:iload           5
	//* 121  249:bipush          80
	//* 122  251:iand            
	//* 123  252:bipush          80
	//* 124  254:icmpne          308
				{
					int j2 = (getHeight() - rect1.bottom - c1.bottomMargin) + c1.j;
	//  125  257:aload_0         
	//  126  258:invokevirtual   #327 <Method int getHeight()>
	//  127  261:aload           7
	//  128  263:getfield        #390 <Field int Rect.bottom>
	//  129  266:isub            
	//  130  267:aload           9
	//  131  269:getfield        #365 <Field int CoordinatorLayout$c.bottomMargin>
	//  132  272:isub            
	//  133  273:aload           9
	//  134  275:getfield        #455 <Field int CoordinatorLayout$c.j>
	//  135  278:iadd            
	//  136  279:istore          6
					j1 = i1;
	//  137  281:iload_3         
	//  138  282:istore          4
					if(j2 < rect.bottom)
	//* 139  284:iload           6
	//* 140  286:aload_2         
	//* 141  287:getfield        #390 <Field int Rect.bottom>
	//* 142  290:icmpge          308
					{
						f(view, j2 - rect.bottom);
	//  143  293:aload_0         
	//  144  294:aload_1         
	//  145  295:iload           6
	//  146  297:aload_2         
	//  147  298:getfield        #390 <Field int Rect.bottom>
	//  148  301:isub            
	//  149  302:invokespecial   #458 <Method void f(View, int)>
						j1 = 1;
	//  150  305:iconst_1        
	//  151  306:istore          4
					}
				}
				if(j1 == 0)
	//* 152  308:iload           4
	//* 153  310:ifne            319
					f(view, 0);
	//  154  313:aload_0         
	//  155  314:aload_1         
	//  156  315:iconst_0        
	//  157  316:invokespecial   #458 <Method void f(View, int)>
				if((l1 & 3) == 3)
	//* 158  319:iload           5
	//* 159  321:iconst_3        
	//* 160  322:iand            
	//* 161  323:iconst_3        
	//* 162  324:icmpne          369
				{
					i1 = rect1.left - c1.leftMargin - c1.i;
	//  163  327:aload           7
	//  164  329:getfield        #336 <Field int Rect.left>
	//  165  332:aload           9
	//  166  334:getfield        #333 <Field int CoordinatorLayout$c.leftMargin>
	//  167  337:isub            
	//  168  338:aload           9
	//  169  340:getfield        #460 <Field int android.support.design.widget.CoordinatorLayout$c.i>
	//  170  343:isub            
	//  171  344:istore_3        
					if(i1 < rect.left)
	//* 172  345:iload_3         
	//* 173  346:aload_2         
	//* 174  347:getfield        #336 <Field int Rect.left>
	//* 175  350:icmpge          369
					{
						e(view, rect.left - i1);
	//  176  353:aload_0         
	//  177  354:aload_1         
	//  178  355:aload_2         
	//  179  356:getfield        #336 <Field int Rect.left>
	//  180  359:iload_3         
	//  181  360:isub            
	//  182  361:invokespecial   #462 <Method void e(View, int)>
						i1 = 1;
	//  183  364:iconst_1        
	//  184  365:istore_3        
						break label2;
	//  185  366:goto            371
					}
				}
				i1 = 0;
	//  186  369:iconst_0        
	//  187  370:istore_3        
			}
			int k1 = i1;
	//  188  371:iload_3         
	//  189  372:istore          4
			if((l1 & 5) == 5)
	//* 190  374:iload           5
	//* 191  376:iconst_5        
	//* 192  377:iand            
	//* 193  378:iconst_5        
	//* 194  379:icmpne          433
			{
				int i2 = (getWidth() - rect1.right - c1.rightMargin) + c1.i;
	//  195  382:aload_0         
	//  196  383:invokevirtual   #324 <Method int getWidth()>
	//  197  386:aload           7
	//  198  388:getfield        #384 <Field int Rect.right>
	//  199  391:isub            
	//  200  392:aload           9
	//  201  394:getfield        #342 <Field int CoordinatorLayout$c.rightMargin>
	//  202  397:isub            
	//  203  398:aload           9
	//  204  400:getfield        #460 <Field int android.support.design.widget.CoordinatorLayout$c.i>
	//  205  403:iadd            
	//  206  404:istore          5
				k1 = i1;
	//  207  406:iload_3         
	//  208  407:istore          4
				if(i2 < rect.right)
	//* 209  409:iload           5
	//* 210  411:aload_2         
	//* 211  412:getfield        #384 <Field int Rect.right>
	//* 212  415:icmpge          433
				{
					e(view, i2 - rect.right);
	//  213  418:aload_0         
	//  214  419:aload_1         
	//  215  420:iload           5
	//  216  422:aload_2         
	//  217  423:getfield        #384 <Field int Rect.right>
	//  218  426:isub            
	//  219  427:invokespecial   #462 <Method void e(View, int)>
					k1 = 1;
	//  220  430:iconst_1        
	//  221  431:istore          4
				}
			}
			if(k1 == 0)
	//* 222  433:iload           4
	//* 223  435:ifne            444
				e(view, 0);
	//  224  438:aload_0         
	//  225  439:aload_1         
	//  226  440:iconst_0        
	//  227  441:invokespecial   #462 <Method void e(View, int)>
			a(rect1);
	//  228  444:aload           7
	//  229  446:invokestatic    #448 <Method void a(Rect)>
		}
	//  230  449:return          
	}

	private void a(View view, View view1, int i1)
	{
		Object obj;
		Rect rect;
		obj = ((Object) ((c)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          4
		obj = ((Object) (e()));
	//    4    9:invokestatic    #413 <Method Rect e()>
	//    5   12:astore          4
		rect = e();
	//    6   14:invokestatic    #413 <Method Rect e()>
	//    7   17:astore          5
		a(view1, ((Rect) (obj)));
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:aload           4
	//   11   23:invokevirtual   #466 <Method void a(View, Rect)>
		a(view, i1, ((Rect) (obj)), rect);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokevirtual   #469 <Method void a(View, int, Rect, Rect)>
		view.layout(rect.left, rect.top, rect.right, rect.bottom);
	//   18   36:aload_1         
	//   19   37:aload           5
	//   20   39:getfield        #336 <Field int Rect.left>
	//   21   42:aload           5
	//   22   44:getfield        #359 <Field int Rect.top>
	//   23   47:aload           5
	//   24   49:getfield        #384 <Field int Rect.right>
	//   25   52:aload           5
	//   26   54:getfield        #390 <Field int Rect.bottom>
	//   27   57:invokevirtual   #472 <Method void View.layout(int, int, int, int)>
		a(((Rect) (obj)));
	//   28   60:aload           4
	//   29   62:invokestatic    #448 <Method void a(Rect)>
		a(rect);
	//   30   65:aload           5
	//   31   67:invokestatic    #448 <Method void a(Rect)>
		return;
	//   32   70:return          
		view;
	//   33   71:astore_1        
		a(((Rect) (obj)));
	//   34   72:aload           4
	//   35   74:invokestatic    #448 <Method void a(Rect)>
		a(rect);
	//   36   77:aload           5
	//   37   79:invokestatic    #448 <Method void a(Rect)>
		throw view;
	//   38   82:aload_1         
	//   39   83:athrow          
	}

	private void a(List list)
	{
		list.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #478 <Method void List.clear()>
		boolean flag = isChildrenDrawingOrderEnabled();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #481 <Method boolean isChildrenDrawingOrderEnabled()>
	//    4   10:istore          5
		int k1 = getChildCount();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #484 <Method int getChildCount()>
	//    7   16:istore          4
		for(int i1 = k1 - 1; i1 >= 0; i1--)
	//*   8   18:iload           4
	//*   9   20:iconst_1        
	//*  10   21:isub            
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:iflt            64
		{
			int j1;
			if(flag)
	//*  14   27:iload           5
	//*  15   29:ifeq            43
				j1 = getChildDrawingOrder(k1, i1);
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #487 <Method int getChildDrawingOrder(int, int)>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				j1 = i1;
	//   22   43:iload_2         
	//   23   44:istore_3        
			list.add(((Object) (getChildAt(j1))));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:invokevirtual   #491 <Method View getChildAt(int)>
	//   28   51:invokeinterface #494 <Method boolean List.add(Object)>
	//   29   56:pop             
		}

	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:isub            
	//   33   60:istore_2        
	//*  34   61:goto            23
		if(d != null)
	//*  35   64:getstatic       #100 <Field Comparator d>
	//*  36   67:ifnull          77
			Collections.sort(list, d);
	//   37   70:aload_1         
	//   38   71:getstatic       #100 <Field Comparator d>
	//   39   74:invokestatic    #500 <Method void Collections.sort(List, Comparator)>
	//   40   77:return          
	}

	private boolean a(MotionEvent motionevent, int i1)
	{
		int k1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #508 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          6
		List list = i;
	//    3    6:aload_0         
	//    4    7:getfield        #139 <Field List i>
	//    5   10:astore          15
		a(list);
	//    6   12:aload_0         
	//    7   13:aload           15
	//    8   15:invokespecial   #510 <Method void a(List)>
		int l1 = list.size();
	//    9   18:aload           15
	//   10   20:invokeinterface #513 <Method int List.size()>
	//   11   25:istore          7
		Object obj = null;
	//   12   27:aconst_null     
	//   13   28:astore          13
		int j1 = 0;
	//   14   30:iconst_0        
	//   15   31:istore          4
		boolean flag2 = false;
	//   16   33:iconst_0        
	//   17   34:istore          8
		boolean flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		boolean flag3;
		do
		{
			flag3 = flag2;
	//   20   38:iload           8
	//   21   40:istore          9
			if(j1 >= l1)
				break;
	//   22   42:iload           4
	//   23   44:iload           7
	//   24   46:icmpge          387
			View view = (View)list.get(j1);
	//   25   49:aload           15
	//   26   51:iload           4
	//   27   53:invokeinterface #516 <Method Object List.get(int)>
	//   28   58:checkcast       #401 <Class View>
	//   29   61:astore          16
			Object obj1 = ((Object) ((c)view.getLayoutParams()));
	//   30   63:aload           16
	//   31   65:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   68:checkcast       #24  <Class CoordinatorLayout$c>
	//   33   71:astore          14
			Behavior behavior = ((c) (obj1)).b();
	//   34   73:aload           14
	//   35   75:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   36   78:astore          17
			boolean flag1;
			boolean flag4;
			if((flag2 || flag) && k1 != 0)
	//*  37   80:iload           8
	//*  38   82:ifne            89
	//*  39   85:iload_3         
	//*  40   86:ifeq            212
	//*  41   89:iload           6
	//*  42   91:ifeq            212
			{
				flag4 = flag2;
	//   43   94:iload           8
	//   44   96:istore          10
				flag1 = flag;
	//   45   98:iload_3         
	//   46   99:istore          5
				obj1 = obj;
	//   47  101:aload           13
	//   48  103:astore          14
				if(behavior != null)
	//*  49  105:aload           17
	//*  50  107:ifnull          367
				{
					obj1 = obj;
	//   51  110:aload           13
	//   52  112:astore          14
					if(obj == null)
	//*  53  114:aload           13
	//*  54  116:ifnonnull       137
					{
						long l2 = SystemClock.uptimeMillis();
	//   55  119:invokestatic    #522 <Method long SystemClock.uptimeMillis()>
	//   56  122:lstore          11
						obj1 = ((Object) (MotionEvent.obtain(l2, l2, 3, 0.0F, 0.0F, 0)));
	//   57  124:lload           11
	//   58  126:lload           11
	//   59  128:iconst_3        
	//   60  129:fconst_0        
	//   61  130:fconst_0        
	//   62  131:iconst_0        
	//   63  132:invokestatic    #526 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   64  135:astore          14
					}
					switch(i1)
	//*  65  137:iload_2         
					{
	//*  66  138:tableswitch     0 1: default 160
	//	               0 191
	//	               1 170
					default:
						flag4 = flag2;
	//   67  160:iload           8
	//   68  162:istore          10
						flag1 = flag;
	//   69  164:iload_3         
	//   70  165:istore          5
						break;

	//*  71  167:goto            367
					case 1: // '\001'
						behavior.b(this, view, ((MotionEvent) (obj1)));
	//   72  170:aload           17
	//   73  172:aload_0         
	//   74  173:aload           16
	//   75  175:aload           14
	//   76  177:invokevirtual   #529 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, MotionEvent)>
	//   77  180:pop             
						flag4 = flag2;
	//   78  181:iload           8
	//   79  183:istore          10
						flag1 = flag;
	//   80  185:iload_3         
	//   81  186:istore          5
						break;

	//*  82  188:goto            367
					case 0: // '\0'
						behavior.a(this, view, ((MotionEvent) (obj1)));
	//   83  191:aload           17
	//   84  193:aload_0         
	//   85  194:aload           16
	//   86  196:aload           14
	//   87  198:invokevirtual   #531 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, MotionEvent)>
	//   88  201:pop             
						flag4 = flag2;
	//   89  202:iload           8
	//   90  204:istore          10
						flag1 = flag;
	//   91  206:iload_3         
	//   92  207:istore          5
						break;
					}
				}
			} else
	//*  93  209:goto            367
			{
				flag3 = flag2;
	//   94  212:iload           8
	//   95  214:istore          9
				if(!flag2)
	//*  96  216:iload           8
	//*  97  218:ifne            299
				{
					flag3 = flag2;
	//   98  221:iload           8
	//   99  223:istore          9
					if(behavior != null)
	//* 100  225:aload           17
	//* 101  227:ifnull          299
					{
						switch(i1)
	//* 102  230:iload_2         
						{
	//* 103  231:tableswitch     0 1: default 252
	//	               0 269
	//	               1 255
	//* 104  252:goto            280
						case 1: // '\001'
							flag2 = behavior.b(this, view, motionevent);
	//  105  255:aload           17
	//  106  257:aload_0         
	//  107  258:aload           16
	//  108  260:aload_1         
	//  109  261:invokevirtual   #529 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, MotionEvent)>
	//  110  264:istore          8
							break;

	//* 111  266:goto            280
						case 0: // '\0'
							flag2 = behavior.a(this, view, motionevent);
	//  112  269:aload           17
	//  113  271:aload_0         
	//  114  272:aload           16
	//  115  274:aload_1         
	//  116  275:invokevirtual   #531 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, MotionEvent)>
	//  117  278:istore          8
							break;
						}
						flag3 = flag2;
	//  118  280:iload           8
	//  119  282:istore          9
						if(flag2)
	//* 120  284:iload           8
	//* 121  286:ifeq            299
						{
							p = view;
	//  122  289:aload_0         
	//  123  290:aload           16
	//  124  292:putfield        #533 <Field View p>
							flag3 = flag2;
	//  125  295:iload           8
	//  126  297:istore          9
						}
					}
				}
				flag4 = ((c) (obj1)).e();
	//  127  299:aload           14
	//  128  301:invokevirtual   #535 <Method boolean CoordinatorLayout$c.e()>
	//  129  304:istore          10
				flag2 = ((c) (obj1)).a(this, view);
	//  130  306:aload           14
	//  131  308:aload_0         
	//  132  309:aload           16
	//  133  311:invokevirtual   #538 <Method boolean android.support.design.widget.CoordinatorLayout$c.a(CoordinatorLayout, View)>
	//  134  314:istore          8
				if(flag2 && !flag4)
	//* 135  316:iload           8
	//* 136  318:ifeq            331
	//* 137  321:iload           10
	//* 138  323:ifne            331
					flag = true;
	//  139  326:iconst_1        
	//  140  327:istore_3        
				else
	//* 141  328:goto            333
					flag = false;
	//  142  331:iconst_0        
	//  143  332:istore_3        
				flag4 = flag3;
	//  144  333:iload           9
	//  145  335:istore          10
				flag1 = flag;
	//  146  337:iload_3         
	//  147  338:istore          5
				obj1 = obj;
	//  148  340:aload           13
	//  149  342:astore          14
				if(flag2)
	//* 150  344:iload           8
	//* 151  346:ifeq            367
				{
					flag4 = flag3;
	//  152  349:iload           9
	//  153  351:istore          10
					flag1 = flag;
	//  154  353:iload_3         
	//  155  354:istore          5
					obj1 = obj;
	//  156  356:aload           13
	//  157  358:astore          14
					if(!flag)
	//* 158  360:iload_3         
	//* 159  361:ifne            367
						break;
	//  160  364:goto            387
				}
			}
			j1++;
	//  161  367:iload           4
	//  162  369:iconst_1        
	//  163  370:iadd            
	//  164  371:istore          4
			flag2 = flag4;
	//  165  373:iload           10
	//  166  375:istore          8
			flag = flag1;
	//  167  377:iload           5
	//  168  379:istore_3        
			obj = obj1;
	//  169  380:aload           14
	//  170  382:astore          13
		} while(true);
	//  171  384:goto            38
		list.clear();
	//  172  387:aload           15
	//  173  389:invokeinterface #478 <Method void List.clear()>
		return flag3;
	//  174  394:iload           9
	//  175  396:ireturn         
	}

	private int b(int i1)
	{
		StringBuilder stringbuilder;
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field int[] o>
	//*   2    4:ifnonnull       56
		{
			stringbuilder = new StringBuilder();
	//    3    7:new             #239 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #240 <Method void StringBuilder()>
	//    6   14:astore_2        
			stringbuilder.append("No keylines defined for ");
	//    7   15:aload_2         
	//    8   16:ldc2            #540 <String "No keylines defined for ">
	//    9   19:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(((Object) (this)));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #543 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			stringbuilder.append(" - attempted index lookup ");
	//   15   29:aload_2         
	//   16   30:ldc2            #545 <String " - attempted index lookup ">
	//   17   33:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(i1);
	//   19   37:aload_2         
	//   20   38:iload_1         
	//   21   39:invokevirtual   #548 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		} else
	//*  23   43:ldc2            #549 <String "CoordinatorLayout">
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #250 <Method String StringBuilder.toString()>
	//*  26   50:invokestatic    #554 <Method int Log.e(String, String)>
	//*  27   53:pop             
	//*  28   54:iconst_0        
	//*  29   55:ireturn         
		{
			if(i1 >= 0 && i1 < o.length)
	//*  30   56:iload_1         
	//*  31   57:iflt            79
	//*  32   60:iload_1         
	//*  33   61:aload_0         
	//*  34   62:getfield        #189 <Field int[] o>
	//*  35   65:arraylength     
	//*  36   66:icmplt          72
	//*  37   69:goto            79
				return o[i1];
	//   38   72:aload_0         
	//   39   73:getfield        #189 <Field int[] o>
	//   40   76:iload_1         
	//   41   77:iaload          
	//   42   78:ireturn         
			stringbuilder = new StringBuilder();
	//   43   79:new             #239 <Class StringBuilder>
	//   44   82:dup             
	//   45   83:invokespecial   #240 <Method void StringBuilder()>
	//   46   86:astore_2        
			stringbuilder.append("Keyline index ");
	//   47   87:aload_2         
	//   48   88:ldc2            #556 <String "Keyline index ">
	//   49   91:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
			stringbuilder.append(i1);
	//   51   95:aload_2         
	//   52   96:iload_1         
	//   53   97:invokevirtual   #548 <Method StringBuilder StringBuilder.append(int)>
	//   54  100:pop             
			stringbuilder.append(" out of range for ");
	//   55  101:aload_2         
	//   56  102:ldc2            #558 <String " out of range for ">
	//   57  105:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
			stringbuilder.append(((Object) (this)));
	//   59  109:aload_2         
	//   60  110:aload_0         
	//   61  111:invokevirtual   #543 <Method StringBuilder StringBuilder.append(Object)>
	//   62  114:pop             
		}
		Log.e("CoordinatorLayout", stringbuilder.toString());
		return 0;
	//*  63  115:goto            43
	}

	private aa b(aa aa1)
	{
		if(aa1.f())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #563 <Method boolean aa.f()>
	//*   2    4:ifeq            9
			return aa1;
	//    3    7:aload_1         
	//    4    8:areturn         
		int i1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #484 <Method int getChildCount()>
	//    9   15:istore_3        
		aa aa2;
		for(aa2 = aa1; i1 < j1; aa2 = aa1)
	//*  10   16:aload_1         
	//*  11   17:astore          4
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          99
		{
			View view = getChildAt(i1);
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:invokevirtual   #491 <Method View getChildAt(int)>
	//   18   29:astore          5
			aa1 = aa2;
	//   19   31:aload           4
	//   20   33:astore_1        
			if(android.support.v4.view.s.q(view))
	//*  21   34:aload           5
	//*  22   36:invokestatic    #565 <Method boolean s.q(View)>
	//*  23   39:ifeq            89
			{
				Behavior behavior = ((c)view.getLayoutParams()).b();
	//   24   42:aload           5
	//   25   44:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   47:checkcast       #24  <Class CoordinatorLayout$c>
	//   27   50:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   28   53:astore          6
				aa1 = aa2;
	//   29   55:aload           4
	//   30   57:astore_1        
				if(behavior != null)
	//*  31   58:aload           6
	//*  32   60:ifnull          89
				{
					aa2 = behavior.a(this, view, aa2);
	//   33   63:aload           6
	//   34   65:aload_0         
	//   35   66:aload           5
	//   36   68:aload           4
	//   37   70:invokevirtual   #568 <Method aa android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, aa)>
	//   38   73:astore          4
					aa1 = aa2;
	//   39   75:aload           4
	//   40   77:astore_1        
					if(aa2.f())
	//*  41   78:aload           4
	//*  42   80:invokevirtual   #563 <Method boolean aa.f()>
	//*  43   83:ifeq            89
						return aa2;
	//   44   86:aload           4
	//   45   88:areturn         
				}
			}
			i1++;
	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
		}

	//   50   93:aload_1         
	//   51   94:astore          4
	//*  52   96:goto            19
		return aa2;
	//   53   99:aload           4
	//   54  101:areturn         
	}

	private void b(View view, int i1, int j1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          11
		int k1 = android.support.v4.view.d.a(d(c1.c), j1);
	//    4    9:aload           11
	//    5   11:getfield        #371 <Field int CoordinatorLayout$c.c>
	//    6   14:invokestatic    #571 <Method int d(int)>
	//    7   17:iload_3         
	//    8   18:invokestatic    #377 <Method int d.a(int, int)>
	//    9   21:istore          4
		int i3 = k1 & 7;
	//   10   23:iload           4
	//   11   25:bipush          7
	//   12   27:iand            
	//   13   28:istore          10
		int l2 = k1 & 0x70;
	//   14   30:iload           4
	//   15   32:bipush          112
	//   16   34:iand            
	//   17   35:istore          9
		int k2 = getWidth();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #324 <Method int getWidth()>
	//   20   41:istore          8
		int j2 = getHeight();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #327 <Method int getHeight()>
	//   23   47:istore          7
		int l1 = view.getMeasuredWidth();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #574 <Method int View.getMeasuredWidth()>
	//   26   53:istore          5
		int i2 = view.getMeasuredHeight();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #577 <Method int View.getMeasuredHeight()>
	//   29   59:istore          6
		k1 = i1;
	//   30   61:iload_2         
	//   31   62:istore          4
		if(j1 == 1)
	//*  32   64:iload_3         
	//*  33   65:iconst_1        
	//*  34   66:icmpne          75
			k1 = k2 - i1;
	//   35   69:iload           8
	//   36   71:iload_2         
	//   37   72:isub            
	//   38   73:istore          4
		i1 = b(k1) - l1;
	//   39   75:aload_0         
	//   40   76:iload           4
	//   41   78:invokespecial   #579 <Method int b(int)>
	//   42   81:iload           5
	//   43   83:isub            
	//   44   84:istore_2        
		j1 = 0;
	//   45   85:iconst_0        
	//   46   86:istore_3        
		if(i3 != 1)
	//*  47   87:iload           10
	//*  48   89:iconst_1        
	//*  49   90:icmpeq          110
		{
			if(i3 == 5)
	//*  50   93:iload           10
	//*  51   95:iconst_5        
	//*  52   96:icmpeq          102
	//*  53   99:goto            117
				i1 += l1;
	//   54  102:iload_2         
	//   55  103:iload           5
	//   56  105:iadd            
	//   57  106:istore_2        
		} else
	//*  58  107:goto            117
		{
			i1 += l1 / 2;
	//   59  110:iload_2         
	//   60  111:iload           5
	//   61  113:iconst_2        
	//   62  114:idiv            
	//   63  115:iadd            
	//   64  116:istore_2        
		}
		if(l2 != 16)
	//*  65  117:iload           9
	//*  66  119:bipush          16
	//*  67  121:icmpeq          142
		{
			if(l2 == 80)
	//*  68  124:iload           9
	//*  69  126:bipush          80
	//*  70  128:icmpeq          134
	//*  71  131:goto            149
				j1 = i2 + 0;
	//   72  134:iload           6
	//   73  136:iconst_0        
	//   74  137:iadd            
	//   75  138:istore_3        
		} else
	//*  76  139:goto            149
		{
			j1 = 0 + i2 / 2;
	//   77  142:iconst_0        
	//   78  143:iload           6
	//   79  145:iconst_2        
	//   80  146:idiv            
	//   81  147:iadd            
	//   82  148:istore_3        
		}
		i1 = Math.max(getPaddingLeft() + c1.leftMargin, Math.min(i1, k2 - getPaddingRight() - l1 - c1.rightMargin));
	//   83  149:aload_0         
	//   84  150:invokevirtual   #330 <Method int getPaddingLeft()>
	//   85  153:aload           11
	//   86  155:getfield        #333 <Field int CoordinatorLayout$c.leftMargin>
	//   87  158:iadd            
	//   88  159:iload_2         
	//   89  160:iload           8
	//   90  162:aload_0         
	//   91  163:invokevirtual   #339 <Method int getPaddingRight()>
	//   92  166:isub            
	//   93  167:iload           5
	//   94  169:isub            
	//   95  170:aload           11
	//   96  172:getfield        #342 <Field int CoordinatorLayout$c.rightMargin>
	//   97  175:isub            
	//   98  176:invokestatic    #347 <Method int Math.min(int, int)>
	//   99  179:invokestatic    #350 <Method int Math.max(int, int)>
	//  100  182:istore_2        
		j1 = Math.max(getPaddingTop() + c1.topMargin, Math.min(j1, j2 - getPaddingBottom() - i2 - c1.bottomMargin));
	//  101  183:aload_0         
	//  102  184:invokevirtual   #353 <Method int getPaddingTop()>
	//  103  187:aload           11
	//  104  189:getfield        #356 <Field int CoordinatorLayout$c.topMargin>
	//  105  192:iadd            
	//  106  193:iload_3         
	//  107  194:iload           7
	//  108  196:aload_0         
	//  109  197:invokevirtual   #362 <Method int getPaddingBottom()>
	//  110  200:isub            
	//  111  201:iload           6
	//  112  203:isub            
	//  113  204:aload           11
	//  114  206:getfield        #365 <Field int CoordinatorLayout$c.bottomMargin>
	//  115  209:isub            
	//  116  210:invokestatic    #347 <Method int Math.min(int, int)>
	//  117  213:invokestatic    #350 <Method int Math.max(int, int)>
	//  118  216:istore_3        
		view.layout(i1, j1, l1 + i1, i2 + j1);
	//  119  217:aload_1         
	//  120  218:iload_2         
	//  121  219:iload_3         
	//  122  220:iload           5
	//  123  222:iload_2         
	//  124  223:iadd            
	//  125  224:iload           6
	//  126  226:iload_3         
	//  127  227:iadd            
	//  128  228:invokevirtual   #472 <Method void View.layout(int, int, int, int)>
	//  129  231:return          
	}

	private static int c(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if((i1 & 7) == 0)
	//*   2    2:iload_0         
	//*   3    3:bipush          7
	//*   4    5:iand            
	//*   5    6:ifne            15
			j1 = i1 | 0x800003;
	//    6    9:iload_0         
	//    7   10:ldc2            #580 <Int 0x800003>
	//    8   13:ior             
	//    9   14:istore_1        
		i1 = j1;
	//   10   15:iload_1         
	//   11   16:istore_0        
		if((j1 & 0x70) == 0)
	//*  12   17:iload_1         
	//*  13   18:bipush          112
	//*  14   20:iand            
	//*  15   21:ifne            29
			i1 = j1 | 0x30;
	//   16   24:iload_1         
	//   17   25:bipush          48
	//   18   27:ior             
	//   19   28:istore_0        
		return i1;
	//   20   29:iload_0         
	//   21   30:ireturn         
	}

	private static int d(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i1 == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            10
			j1 = 0x800035;
	//    4    6:ldc2            #581 <Int 0x800035>
	//    5    9:istore_1        
		return j1;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	private void d(View view, int i1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore_3        
		Rect rect = e();
	//    4    8:invokestatic    #413 <Method Rect e()>
	//    5   11:astore          4
		rect.set(getPaddingLeft() + c1.leftMargin, getPaddingTop() + c1.topMargin, getWidth() - getPaddingRight() - c1.rightMargin, getHeight() - getPaddingBottom() - c1.bottomMargin);
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:invokevirtual   #330 <Method int getPaddingLeft()>
	//    9   19:aload_3         
	//   10   20:getfield        #333 <Field int CoordinatorLayout$c.leftMargin>
	//   11   23:iadd            
	//   12   24:aload_0         
	//   13   25:invokevirtual   #353 <Method int getPaddingTop()>
	//   14   28:aload_3         
	//   15   29:getfield        #356 <Field int CoordinatorLayout$c.topMargin>
	//   16   32:iadd            
	//   17   33:aload_0         
	//   18   34:invokevirtual   #324 <Method int getWidth()>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #339 <Method int getPaddingRight()>
	//   21   41:isub            
	//   22   42:aload_3         
	//   23   43:getfield        #342 <Field int CoordinatorLayout$c.rightMargin>
	//   24   46:isub            
	//   25   47:aload_0         
	//   26   48:invokevirtual   #327 <Method int getHeight()>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #362 <Method int getPaddingBottom()>
	//   29   55:isub            
	//   30   56:aload_3         
	//   31   57:getfield        #365 <Field int CoordinatorLayout$c.bottomMargin>
	//   32   60:isub            
	//   33   61:invokevirtual   #368 <Method void Rect.set(int, int, int, int)>
		if(t != null && android.support.v4.view.s.q(((View) (this))) && !android.support.v4.view.s.q(view))
	//*  34   64:aload_0         
	//*  35   65:getfield        #583 <Field aa t>
	//*  36   68:ifnull          157
	//*  37   71:aload_0         
	//*  38   72:invokestatic    #565 <Method boolean s.q(View)>
	//*  39   75:ifeq            157
	//*  40   78:aload_1         
	//*  41   79:invokestatic    #565 <Method boolean s.q(View)>
	//*  42   82:ifne            157
		{
			rect.left = rect.left + t.a();
	//   43   85:aload           4
	//   44   87:aload           4
	//   45   89:getfield        #336 <Field int Rect.left>
	//   46   92:aload_0         
	//   47   93:getfield        #583 <Field aa t>
	//   48   96:invokevirtual   #585 <Method int aa.a()>
	//   49   99:iadd            
	//   50  100:putfield        #336 <Field int Rect.left>
			rect.top = rect.top + t.b();
	//   51  103:aload           4
	//   52  105:aload           4
	//   53  107:getfield        #359 <Field int Rect.top>
	//   54  110:aload_0         
	//   55  111:getfield        #583 <Field aa t>
	//   56  114:invokevirtual   #587 <Method int aa.b()>
	//   57  117:iadd            
	//   58  118:putfield        #359 <Field int Rect.top>
			rect.right = rect.right - t.c();
	//   59  121:aload           4
	//   60  123:aload           4
	//   61  125:getfield        #384 <Field int Rect.right>
	//   62  128:aload_0         
	//   63  129:getfield        #583 <Field aa t>
	//   64  132:invokevirtual   #589 <Method int aa.c()>
	//   65  135:isub            
	//   66  136:putfield        #384 <Field int Rect.right>
			rect.bottom = rect.bottom - t.d();
	//   67  139:aload           4
	//   68  141:aload           4
	//   69  143:getfield        #390 <Field int Rect.bottom>
	//   70  146:aload_0         
	//   71  147:getfield        #583 <Field aa t>
	//   72  150:invokevirtual   #591 <Method int aa.d()>
	//   73  153:isub            
	//   74  154:putfield        #390 <Field int Rect.bottom>
		}
		Rect rect1 = e();
	//   75  157:invokestatic    #413 <Method Rect e()>
	//   76  160:astore          5
		android.support.v4.view.d.a(c(c1.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i1);
	//   77  162:aload_3         
	//   78  163:getfield        #371 <Field int CoordinatorLayout$c.c>
	//   79  166:invokestatic    #381 <Method int c(int)>
	//   80  169:aload_1         
	//   81  170:invokevirtual   #574 <Method int View.getMeasuredWidth()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #577 <Method int View.getMeasuredHeight()>
	//   84  177:aload           4
	//   85  179:aload           5
	//   86  181:iload_2         
	//   87  182:invokestatic    #594 <Method void d.a(int, int, int, Rect, Rect, int)>
		view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//   88  185:aload_1         
	//   89  186:aload           5
	//   90  188:getfield        #336 <Field int Rect.left>
	//   91  191:aload           5
	//   92  193:getfield        #359 <Field int Rect.top>
	//   93  196:aload           5
	//   94  198:getfield        #384 <Field int Rect.right>
	//   95  201:aload           5
	//   96  203:getfield        #390 <Field int Rect.bottom>
	//   97  206:invokevirtual   #472 <Method void View.layout(int, int, int, int)>
		a(rect);
	//   98  209:aload           4
	//   99  211:invokestatic    #448 <Method void a(Rect)>
		a(rect1);
	//  100  214:aload           5
	//  101  216:invokestatic    #448 <Method void a(Rect)>
	//  102  219:return          
	}

	private static int e(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i1 == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            9
			j1 = 17;
	//    4    6:bipush          17
	//    5    8:istore_1        
		return j1;
	//    6    9:iload_1         
	//    7   10:ireturn         
	}

	private static Rect e()
	{
		Rect rect1 = (Rect)f.a();
	//    0    0:getstatic       #118 <Field android.support.v4.f.k$a f>
	//    1    3:invokeinterface #596 <Method Object android.support.v4.f.k$a.a()>
	//    2    8:checkcast       #311 <Class Rect>
	//    3   11:astore_1        
		Rect rect = rect1;
	//    4   12:aload_1         
	//    5   13:astore_0        
		if(rect1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       26
			rect = new Rect();
	//    8   18:new             #311 <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #597 <Method void Rect()>
	//   11   25:astore_0        
		return rect;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private void e(View view, int i1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore_3        
		if(c1.i != i1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #460 <Field int android.support.design.widget.CoordinatorLayout$c.i>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			android.support.v4.view.s.d(view, i1 - c1.i);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #460 <Field int android.support.design.widget.CoordinatorLayout$c.i>
	//   12   22:isub            
	//   13   23:invokestatic    #599 <Method void s.d(View, int)>
			c1.i = i1;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #460 <Field int android.support.design.widget.CoordinatorLayout$c.i>
		}
	//   17   31:return          
	}

	private boolean e(View view)
	{
		return h.e(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field f h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #601 <Method boolean f.e(Object)>
	//    4    8:ireturn         
	}

	private void f()
	{
		if(p != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #533 <Field View p>
	//*   2    4:ifnull          65
		{
			Behavior behavior = ((c)p.getLayoutParams()).b();
	//    3    7:aload_0         
	//    4    8:getfield        #533 <Field View p>
	//    5   11:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   14:checkcast       #24  <Class CoordinatorLayout$c>
	//    7   17:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//    8   20:astore          5
			if(behavior != null)
	//*   9   22:aload           5
	//*  10   24:ifnull          60
			{
				long l1 = SystemClock.uptimeMillis();
	//   11   27:invokestatic    #522 <Method long SystemClock.uptimeMillis()>
	//   12   30:lstore_3        
				MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//   13   31:lload_3         
	//   14   32:lload_3         
	//   15   33:iconst_3        
	//   16   34:fconst_0        
	//   17   35:fconst_0        
	//   18   36:iconst_0        
	//   19   37:invokestatic    #526 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   20   40:astore          6
				behavior.b(this, p, motionevent);
	//   21   42:aload           5
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #533 <Field View p>
	//   25   49:aload           6
	//   26   51:invokevirtual   #529 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, MotionEvent)>
	//   27   54:pop             
				motionevent.recycle();
	//   28   55:aload           6
	//   29   57:invokevirtual   #602 <Method void MotionEvent.recycle()>
			}
			p = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #533 <Field View p>
		}
		int j1 = getChildCount();
	//   33   65:aload_0         
	//   34   66:invokevirtual   #484 <Method int getChildCount()>
	//   35   69:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  36   70:iconst_0        
	//*  37   71:istore_1        
	//*  38   72:iload_1         
	//*  39   73:iload_2         
	//*  40   74:icmpge          98
			((c)getChildAt(i1).getLayoutParams()).f();
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:invokevirtual   #491 <Method View getChildAt(int)>
	//   44   82:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   45   85:checkcast       #24  <Class CoordinatorLayout$c>
	//   46   88:invokevirtual   #604 <Method void CoordinatorLayout$c.f()>

	//   47   91:iload_1         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_1        
	//*  51   95:goto            72
		m = false;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #606 <Field boolean m>
	//   55  103:return          
	}

	private void f(View view, int i1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore_3        
		if(c1.j != i1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #455 <Field int CoordinatorLayout$c.j>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			android.support.v4.view.s.c(view, i1 - c1.j);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #455 <Field int CoordinatorLayout$c.j>
	//   12   22:isub            
	//   13   23:invokestatic    #608 <Method void s.c(View, int)>
			c1.j = i1;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #455 <Field int CoordinatorLayout$c.j>
		}
	//   17   31:return          
	}

	private void g()
	{
		g.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field List g>
	//    2    4:invokeinterface #478 <Method void List.clear()>
		h.a();
	//    3    9:aload_0         
	//    4   10:getfield        #137 <Field f h>
	//    5   13:invokevirtual   #610 <Method void android.support.design.widget.f.a()>
		int k1 = getChildCount();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #484 <Method int getChildCount()>
	//    8   20:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:iload_3         
	//*  13   25:icmpge          142
		{
			View view = getChildAt(i1);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #491 <Method View getChildAt(int)>
	//   17   33:astore          4
			c c1 = a(view);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokevirtual   #613 <Method CoordinatorLayout$c a(View)>
	//   21   41:astore          5
			c1.b(this, view);
	//   22   43:aload           5
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:invokevirtual   #616 <Method View CoordinatorLayout$c.b(CoordinatorLayout, View)>
	//   26   51:pop             
			h.a(((Object) (view)));
	//   27   52:aload_0         
	//   28   53:getfield        #137 <Field f h>
	//   29   56:aload           4
	//   30   58:invokevirtual   #618 <Method void android.support.design.widget.f.a(Object)>
			for(int j1 = 0; j1 < k1; j1++)
	//*  31   61:iconst_0        
	//*  32   62:istore_2        
	//*  33   63:iload_2         
	//*  34   64:iload_3         
	//*  35   65:icmpge          135
			{
				if(j1 == i1)
	//*  36   68:iload_2         
	//*  37   69:iload_1         
	//*  38   70:icmpne          76
					continue;
	//   39   73:goto            128
				View view1 = getChildAt(j1);
	//   40   76:aload_0         
	//   41   77:iload_2         
	//   42   78:invokevirtual   #491 <Method View getChildAt(int)>
	//   43   81:astore          6
				if(!c1.a(this, view, view1))
					continue;
	//   44   83:aload           5
	//   45   85:aload_0         
	//   46   86:aload           4
	//   47   88:aload           6
	//   48   90:invokevirtual   #621 <Method boolean android.support.design.widget.CoordinatorLayout$c.a(CoordinatorLayout, View, View)>
	//   49   93:ifeq            128
				if(!h.b(((Object) (view1))))
	//*  50   96:aload_0         
	//*  51   97:getfield        #137 <Field f h>
	//*  52  100:aload           6
	//*  53  102:invokevirtual   #623 <Method boolean f.b(Object)>
	//*  54  105:ifne            117
					h.a(((Object) (view1)));
	//   55  108:aload_0         
	//   56  109:getfield        #137 <Field f h>
	//   57  112:aload           6
	//   58  114:invokevirtual   #618 <Method void android.support.design.widget.f.a(Object)>
				h.a(((Object) (view1)), ((Object) (view)));
	//   59  117:aload_0         
	//   60  118:getfield        #137 <Field f h>
	//   61  121:aload           6
	//   62  123:aload           4
	//   63  125:invokevirtual   #626 <Method void android.support.design.widget.f.a(Object, Object)>
			}

	//   64  128:iload_2         
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:istore_2        
		}

	//   68  132:goto            63
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
	//*  73  139:goto            23
		g.addAll(((java.util.Collection) (h.b())));
	//   74  142:aload_0         
	//   75  143:getfield        #132 <Field List g>
	//   76  146:aload_0         
	//   77  147:getfield        #137 <Field f h>
	//   78  150:invokevirtual   #629 <Method ArrayList f.b()>
	//   79  153:invokeinterface #633 <Method boolean List.addAll(java.util.Collection)>
	//   80  158:pop             
		Collections.reverse(g);
	//   81  159:aload_0         
	//   82  160:getfield        #132 <Field List g>
	//   83  163:invokestatic    #636 <Method void Collections.reverse(List)>
	//   84  166:return          
	}

	private void h()
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(android.support.v4.view.s.q(((View) (this))))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #565 <Method boolean s.q(View)>
	//*   6   13:ifeq            51
		{
			if(w == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #638 <Field o w>
	//*   9   20:ifnonnull       35
				w = new o() {

					public aa a(View view, aa aa1)
					{
						return a.a(aa1);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field CoordinatorLayout a>
					//    2    4:aload_2         
					//    3    5:invokevirtual   #24  <Method aa android.support.design.widget.CoordinatorLayout.a(aa)>
					//    4    8:areturn         
					}

					final CoordinatorLayout a;

			
			{
				a = CoordinatorLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CoordinatorLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   10   23:aload_0         
	//   11   24:new             #8   <Class CoordinatorLayout$1>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:invokespecial   #639 <Method void CoordinatorLayout$1(CoordinatorLayout)>
	//   15   32:putfield        #638 <Field o w>
			android.support.v4.view.s.a(((View) (this)), w);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #638 <Field o w>
	//   19   40:invokestatic    #642 <Method void s.a(View, o)>
			setSystemUiVisibility(1280);
	//   20   43:aload_0         
	//   21   44:sipush          1280
	//   22   47:invokevirtual   #645 <Method void setSystemUiVisibility(int)>
			return;
	//   23   50:return          
		} else
		{
			android.support.v4.view.s.a(((View) (this)), ((o) (null)));
	//   24   51:aload_0         
	//   25   52:aconst_null     
	//   26   53:invokestatic    #642 <Method void s.a(View, o)>
			return;
	//   27   56:return          
		}
	}

	public c a(AttributeSet attributeset)
	{
		return new c(getContext(), attributeset);
	//    0    0:new             #24  <Class CoordinatorLayout$c>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #650 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #651 <Method void CoordinatorLayout$c(Context, AttributeSet)>
	//    6   12:areturn         
	}

	c a(View view)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          4
		if(!c1.b)
	//*   4    9:aload           4
	//*   5   11:getfield        #653 <Field boolean CoordinatorLayout$c.b>
	//*   6   14:ifne            146
		{
			Class class1 = ((Object) (view)).getClass();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #657 <Method Class Object.getClass()>
	//    9   21:astore_2        
			view = null;
	//   10   22:aconst_null     
	//   11   23:astore_1        
			do
			{
				if(class1 == null)
					break;
	//   12   24:aload_2         
	//   13   25:ifnull          54
				a a1 = (a)class1.getAnnotation(android/support/design/widget/CoordinatorLayout$a);
	//   14   28:aload_2         
	//   15   29:ldc1            #18  <Class CoordinatorLayout$a>
	//   16   31:invokevirtual   #661 <Method Annotation Class.getAnnotation(Class)>
	//   17   34:checkcast       #18  <Class CoordinatorLayout$a>
	//   18   37:astore_3        
				view = ((View) (a1));
	//   19   38:aload_3         
	//   20   39:astore_1        
				if(a1 != null)
					break;
	//   21   40:aload_3         
	//   22   41:ifnonnull       54
				class1 = class1.getSuperclass();
	//   23   44:aload_2         
	//   24   45:invokevirtual   #664 <Method Class Class.getSuperclass()>
	//   25   48:astore_2        
				view = ((View) (a1));
	//   26   49:aload_3         
	//   27   50:astore_1        
			} while(true);
	//   28   51:goto            24
			if(view != null)
	//*  29   54:aload_1         
	//*  30   55:ifnull          140
				try
				{
					c1.a((Behavior)((a) (view)).a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
	//   31   58:aload           4
	//   32   60:aload_1         
	//   33   61:invokeinterface #666 <Method Class android.support.design.widget.CoordinatorLayout$a.a()>
	//   34   66:iconst_0        
	//   35   67:anewarray       Class[]
	//   36   70:invokevirtual   #669 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   37   73:iconst_0        
	//   38   74:anewarray       Object[]
	//   39   77:invokevirtual   #301 <Method Object Constructor.newInstance(Object[])>
	//   40   80:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//   41   83:invokevirtual   #672 <Method void android.support.design.widget.CoordinatorLayout$c.a(CoordinatorLayout$Behavior)>
				}
	//*  42   86:goto            140
				catch(Exception exception)
	//*  43   89:astore_2        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   44   90:new             #239 <Class StringBuilder>
	//   45   93:dup             
	//   46   94:invokespecial   #240 <Method void StringBuilder()>
	//   47   97:astore_3        
					stringbuilder.append("Default behavior class ");
	//   48   98:aload_3         
	//   49   99:ldc2            #674 <String "Default behavior class ">
	//   50  102:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   51  105:pop             
					stringbuilder.append(((a) (view)).a().getName());
	//   52  106:aload_3         
	//   53  107:aload_1         
	//   54  108:invokeinterface #666 <Method Class android.support.design.widget.CoordinatorLayout$a.a()>
	//   55  113:invokevirtual   #675 <Method String Class.getName()>
	//   56  116:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
					stringbuilder.append(" could not be instantiated. Did you forget a default constructor?");
	//   58  120:aload_3         
	//   59  121:ldc2            #677 <String " could not be instantiated. Did you forget a default constructor?">
	//   60  124:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   61  127:pop             
					Log.e("CoordinatorLayout", stringbuilder.toString(), ((Throwable) (exception)));
	//   62  128:ldc2            #549 <String "CoordinatorLayout">
	//   63  131:aload_3         
	//   64  132:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   65  135:aload_2         
	//   66  136:invokestatic    #680 <Method int Log.e(String, String, Throwable)>
	//   67  139:pop             
				}
			c1.b = true;
	//   68  140:aload           4
	//   69  142:iconst_1        
	//   70  143:putfield        #653 <Field boolean CoordinatorLayout$c.b>
		}
		return c1;
	//   71  146:aload           4
	//   72  148:areturn         
	}

	protected c a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof c)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class CoordinatorLayout$c>
	//*   2    4:ifeq            19
			return new c((c)layoutparams);
	//    3    7:new             #24  <Class CoordinatorLayout$c>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #24  <Class CoordinatorLayout$c>
	//    7   15:invokespecial   #684 <Method void CoordinatorLayout$c(CoordinatorLayout$c)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #686 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new c((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   12   26:new             #24  <Class CoordinatorLayout$c>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #686 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #689 <Method void CoordinatorLayout$c(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new c(layoutparams);
	//   18   38:new             #24  <Class CoordinatorLayout$c>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #692 <Method void CoordinatorLayout$c(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	final aa a(aa aa1)
	{
		aa aa2 = aa1;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!android.support.v4.f.i.a(((Object) (t)), ((Object) (aa1))))
	//*   2    3:aload_0         
	//*   3    4:getfield        #583 <Field aa t>
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #697 <Method boolean i.a(Object, Object)>
	//*   6   11:ifne            80
		{
			t = aa1;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #583 <Field aa t>
			boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore_3        
			boolean flag;
			if(aa1 != null && aa1.b() > 0)
	//*  12   21:aload_1         
	//*  13   22:ifnull          37
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #587 <Method int aa.b()>
	//*  16   29:ifle            37
				flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
			else
	//*  19   34:goto            39
				flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_2        
			u = flag;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #699 <Field boolean u>
			flag = flag1;
	//   25   44:iload_3         
	//   26   45:istore_2        
			if(!u)
	//*  27   46:aload_0         
	//*  28   47:getfield        #699 <Field boolean u>
	//*  29   50:ifne            64
			{
				flag = flag1;
	//   30   53:iload_3         
	//   31   54:istore_2        
				if(getBackground() == null)
	//*  32   55:aload_0         
	//*  33   56:invokevirtual   #703 <Method Drawable getBackground()>
	//*  34   59:ifnonnull       64
					flag = true;
	//   35   62:iconst_1        
	//   36   63:istore_2        
			}
			setWillNotDraw(flag);
	//   37   64:aload_0         
	//   38   65:iload_2         
	//   39   66:invokevirtual   #706 <Method void setWillNotDraw(boolean)>
			aa2 = b(aa1);
	//   40   69:aload_0         
	//   41   70:aload_1         
	//   42   71:invokespecial   #708 <Method aa b(aa)>
	//   43   74:astore          4
			requestLayout();
	//   44   76:aload_0         
	//   45   77:invokevirtual   #711 <Method void requestLayout()>
		}
		return aa2;
	//   46   80:aload           4
	//   47   82:areturn         
	}

	void a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(i1 >= j1)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          42
			if(e(getChildAt(i1)))
	//*  12   18:aload_0         
	//*  13   19:aload_0         
	//*  14   20:iload_1         
	//*  15   21:invokevirtual   #491 <Method View getChildAt(int)>
	//*  16   24:invokespecial   #713 <Method boolean e(View)>
	//*  17   27:ifeq            35
			{
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
				break;
	//   20   32:goto            42
			}
			i1++;
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
		} while(true);
	//   25   39:goto            10
		if(flag != s)
	//*  26   42:iload_3         
	//*  27   43:aload_0         
	//*  28   44:getfield        #715 <Field boolean s>
	//*  29   47:icmpeq          63
		{
			if(flag)
	//*  30   50:iload_3         
	//*  31   51:ifeq            59
			{
				b();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #717 <Method void b()>
				return;
	//   34   58:return          
			}
			c();
	//   35   59:aload_0         
	//   36   60:invokevirtual   #719 <Method void c()>
		}
	//   37   63:return          
	}

	final void a(int i1)
	{
		int j2 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #722 <Method int s.e(View)>
	//    2    4:istore          4
		int k2 = g.size();
	//    3    6:aload_0         
	//    4    7:getfield        #132 <Field List g>
	//    5   10:invokeinterface #513 <Method int List.size()>
	//    6   15:istore          5
		Rect rect = e();
	//    7   17:invokestatic    #413 <Method Rect e()>
	//    8   20:astore          8
		Rect rect1 = e();
	//    9   22:invokestatic    #413 <Method Rect e()>
	//   10   25:astore          9
		Rect rect2 = e();
	//   11   27:invokestatic    #413 <Method Rect e()>
	//   12   30:astore          10
		for(int j1 = 0; j1 < k2; j1++)
	//*  13   32:iconst_0        
	//*  14   33:istore_2        
	//*  15   34:iload_2         
	//*  16   35:iload           5
	//*  17   37:icmpge          493
		{
			View view = (View)g.get(j1);
	//   18   40:aload_0         
	//   19   41:getfield        #132 <Field List g>
	//   20   44:iload_2         
	//   21   45:invokeinterface #516 <Method Object List.get(int)>
	//   22   50:checkcast       #401 <Class View>
	//   23   53:astore          11
			c c1 = (c)view.getLayoutParams();
	//   24   55:aload           11
	//   25   57:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   60:checkcast       #24  <Class CoordinatorLayout$c>
	//   27   63:astore          12
			if(i1 == 0 && view.getVisibility() == 8)
	//*  28   65:iload_1         
	//*  29   66:ifne            82
	//*  30   69:aload           11
	//*  31   71:invokevirtual   #725 <Method int View.getVisibility()>
	//*  32   74:bipush          8
	//*  33   76:icmpne          82
				continue;
	//   34   79:goto            486
			for(int k1 = 0; k1 < j1; k1++)
	//*  35   82:iconst_0        
	//*  36   83:istore_3        
	//*  37   84:iload_3         
	//*  38   85:iload_2         
	//*  39   86:icmpge          129
			{
				View view2 = (View)g.get(k1);
	//   40   89:aload_0         
	//   41   90:getfield        #132 <Field List g>
	//   42   93:iload_3         
	//   43   94:invokeinterface #516 <Method Object List.get(int)>
	//   44   99:checkcast       #401 <Class View>
	//   45  102:astore          13
				if(c1.l == view2)
	//*  46  104:aload           12
	//*  47  106:getfield        #727 <Field View CoordinatorLayout$c.l>
	//*  48  109:aload           13
	//*  49  111:if_acmpne       122
					b(view, j2);
	//   50  114:aload_0         
	//   51  115:aload           11
	//   52  117:iload           4
	//   53  119:invokevirtual   #729 <Method void b(View, int)>
			}

	//   54  122:iload_3         
	//   55  123:iconst_1        
	//   56  124:iadd            
	//   57  125:istore_3        
	//*  58  126:goto            84
			a(view, true, rect1);
	//   59  129:aload_0         
	//   60  130:aload           11
	//   61  132:iconst_1        
	//   62  133:aload           9
	//   63  135:invokevirtual   #732 <Method void a(View, boolean, Rect)>
			if(c1.g != 0 && !rect1.isEmpty())
	//*  64  138:aload           12
	//*  65  140:getfield        #734 <Field int CoordinatorLayout$c.g>
	//*  66  143:ifeq            294
	//*  67  146:aload           9
	//*  68  148:invokevirtual   #451 <Method boolean Rect.isEmpty()>
	//*  69  151:ifne            294
			{
				int l1 = android.support.v4.view.d.a(c1.g, j2);
	//   70  154:aload           12
	//   71  156:getfield        #734 <Field int CoordinatorLayout$c.g>
	//   72  159:iload           4
	//   73  161:invokestatic    #377 <Method int d.a(int, int)>
	//   74  164:istore_3        
				int l2 = l1 & 0x70;
	//   75  165:iload_3         
	//   76  166:bipush          112
	//   77  168:iand            
	//   78  169:istore          6
				if(l2 != 48)
	//*  79  171:iload           6
	//*  80  173:bipush          48
	//*  81  175:icmpeq          214
				{
					if(l2 == 80)
	//*  82  178:iload           6
	//*  83  180:bipush          80
	//*  84  182:icmpeq          188
	//*  85  185:goto            232
						rect.bottom = Math.max(rect.bottom, getHeight() - rect1.top);
	//   86  188:aload           8
	//   87  190:aload           8
	//   88  192:getfield        #390 <Field int Rect.bottom>
	//   89  195:aload_0         
	//   90  196:invokevirtual   #327 <Method int getHeight()>
	//   91  199:aload           9
	//   92  201:getfield        #359 <Field int Rect.top>
	//   93  204:isub            
	//   94  205:invokestatic    #350 <Method int Math.max(int, int)>
	//   95  208:putfield        #390 <Field int Rect.bottom>
				} else
	//*  96  211:goto            232
				{
					rect.top = Math.max(rect.top, rect1.bottom);
	//   97  214:aload           8
	//   98  216:aload           8
	//   99  218:getfield        #359 <Field int Rect.top>
	//  100  221:aload           9
	//  101  223:getfield        #390 <Field int Rect.bottom>
	//  102  226:invokestatic    #350 <Method int Math.max(int, int)>
	//  103  229:putfield        #359 <Field int Rect.top>
				}
				l1 &= 7;
	//  104  232:iload_3         
	//  105  233:bipush          7
	//  106  235:iand            
	//  107  236:istore_3        
				if(l1 != 3)
	//* 108  237:iload_3         
	//* 109  238:iconst_3        
	//* 110  239:icmpeq          276
				{
					if(l1 == 5)
	//* 111  242:iload_3         
	//* 112  243:iconst_5        
	//* 113  244:icmpeq          250
	//* 114  247:goto            294
						rect.right = Math.max(rect.right, getWidth() - rect1.left);
	//  115  250:aload           8
	//  116  252:aload           8
	//  117  254:getfield        #384 <Field int Rect.right>
	//  118  257:aload_0         
	//  119  258:invokevirtual   #324 <Method int getWidth()>
	//  120  261:aload           9
	//  121  263:getfield        #336 <Field int Rect.left>
	//  122  266:isub            
	//  123  267:invokestatic    #350 <Method int Math.max(int, int)>
	//  124  270:putfield        #384 <Field int Rect.right>
				} else
	//* 125  273:goto            294
				{
					rect.left = Math.max(rect.left, rect1.right);
	//  126  276:aload           8
	//  127  278:aload           8
	//  128  280:getfield        #336 <Field int Rect.left>
	//  129  283:aload           9
	//  130  285:getfield        #384 <Field int Rect.right>
	//  131  288:invokestatic    #350 <Method int Math.max(int, int)>
	//  132  291:putfield        #336 <Field int Rect.left>
				}
			}
			if(c1.h != 0 && view.getVisibility() == 0)
	//* 133  294:aload           12
	//* 134  296:getfield        #453 <Field int CoordinatorLayout$c.h>
	//* 135  299:ifeq            320
	//* 136  302:aload           11
	//* 137  304:invokevirtual   #725 <Method int View.getVisibility()>
	//* 138  307:ifne            320
				a(view, rect, j2);
	//  139  310:aload_0         
	//  140  311:aload           11
	//  141  313:aload           8
	//  142  315:iload           4
	//  143  317:invokespecial   #736 <Method void a(View, Rect, int)>
			if(i1 != 2)
	//* 144  320:iload_1         
	//* 145  321:iconst_2        
	//* 146  322:icmpeq          354
			{
				c(view, rect2);
	//  147  325:aload_0         
	//  148  326:aload           11
	//  149  328:aload           10
	//  150  330:invokevirtual   #738 <Method void c(View, Rect)>
				if(rect2.equals(((Object) (rect1))))
	//* 151  333:aload           10
	//* 152  335:aload           9
	//* 153  337:invokevirtual   #741 <Method boolean Rect.equals(Object)>
	//* 154  340:ifeq            346
					continue;
	//  155  343:goto            486
				b(view, rect1);
	//  156  346:aload_0         
	//  157  347:aload           11
	//  158  349:aload           9
	//  159  351:invokevirtual   #743 <Method void b(View, Rect)>
			}
			for(int i2 = j1 + 1; i2 < k2; i2++)
	//* 160  354:iload_2         
	//* 161  355:iconst_1        
	//* 162  356:iadd            
	//* 163  357:istore_3        
	//* 164  358:iload_3         
	//* 165  359:iload           5
	//* 166  361:icmpge          486
			{
				View view1 = (View)g.get(i2);
	//  167  364:aload_0         
	//  168  365:getfield        #132 <Field List g>
	//  169  368:iload_3         
	//  170  369:invokeinterface #516 <Method Object List.get(int)>
	//  171  374:checkcast       #401 <Class View>
	//  172  377:astore          12
				c c2 = (c)view1.getLayoutParams();
	//  173  379:aload           12
	//  174  381:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  384:checkcast       #24  <Class CoordinatorLayout$c>
	//  176  387:astore          13
				Behavior behavior = c2.b();
	//  177  389:aload           13
	//  178  391:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//  179  394:astore          14
				if(behavior == null || !behavior.a(this, view1, view))
					continue;
	//  180  396:aload           14
	//  181  398:ifnull          479
	//  182  401:aload           14
	//  183  403:aload_0         
	//  184  404:aload           12
	//  185  406:aload           11
	//  186  408:invokevirtual   #744 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View)>
	//  187  411:ifeq            479
				if(i1 == 0 && c2.g())
	//* 188  414:iload_1         
	//* 189  415:ifne            434
	//* 190  418:aload           13
	//* 191  420:invokevirtual   #746 <Method boolean CoordinatorLayout$c.g()>
	//* 192  423:ifeq            434
				{
					c2.h();
	//  193  426:aload           13
	//  194  428:invokevirtual   #747 <Method void CoordinatorLayout$c.h()>
					continue;
	//  195  431:goto            479
				}
				boolean flag;
				if(i1 != 2)
	//* 196  434:iload_1         
	//* 197  435:iconst_2        
	//* 198  436:icmpeq          454
				{
					flag = behavior.b(this, view1, view);
	//  199  439:aload           14
	//  200  441:aload_0         
	//  201  442:aload           12
	//  202  444:aload           11
	//  203  446:invokevirtual   #749 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, View)>
	//  204  449:istore          7
				} else
	//* 205  451:goto            467
				{
					behavior.d(this, view1, view);
	//  206  454:aload           14
	//  207  456:aload_0         
	//  208  457:aload           12
	//  209  459:aload           11
	//  210  461:invokevirtual   #752 <Method void android.support.design.widget.CoordinatorLayout$Behavior.d(CoordinatorLayout, View, View)>
					flag = true;
	//  211  464:iconst_1        
	//  212  465:istore          7
				}
				if(i1 == 1)
	//* 213  467:iload_1         
	//* 214  468:iconst_1        
	//* 215  469:icmpne          479
					c2.a(flag);
	//  216  472:aload           13
	//  217  474:iload           7
	//  218  476:invokevirtual   #754 <Method void android.support.design.widget.CoordinatorLayout$c.a(boolean)>
			}

	//  219  479:iload_3         
	//  220  480:iconst_1        
	//  221  481:iadd            
	//  222  482:istore_3        
		}

	//  223  483:goto            358
	//  224  486:iload_2         
	//  225  487:iconst_1        
	//  226  488:iadd            
	//  227  489:istore_2        
	//* 228  490:goto            34
		a(rect);
	//  229  493:aload           8
	//  230  495:invokestatic    #448 <Method void a(Rect)>
		a(rect1);
	//  231  498:aload           9
	//  232  500:invokestatic    #448 <Method void a(Rect)>
		a(rect2);
	//  233  503:aload           10
	//  234  505:invokestatic    #448 <Method void a(Rect)>
	//  235  508:return          
	}

	public void a(View view, int i1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore_3        
		if(c1.d())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #756 <Method boolean android.support.design.widget.CoordinatorLayout$c.d()>
	//*   6   12:ifeq            26
			throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
	//    7   15:new             #758 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #760 <String "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.">
	//   10   22:invokespecial   #761 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		if(c1.k != null)
	//*  12   26:aload_3         
	//*  13   27:getfield        #763 <Field View CoordinatorLayout$c.k>
	//*  14   30:ifnull          44
		{
			a(view, c1.k, i1);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:getfield        #763 <Field View CoordinatorLayout$c.k>
	//   19   39:iload_2         
	//   20   40:invokespecial   #765 <Method void a(View, View, int)>
			return;
	//   21   43:return          
		}
		if(c1.e >= 0)
	//*  22   44:aload_3         
	//*  23   45:getfield        #767 <Field int CoordinatorLayout$c.e>
	//*  24   48:iflt            62
		{
			b(view, c1.e, i1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_3         
	//   28   54:getfield        #767 <Field int CoordinatorLayout$c.e>
	//   29   57:iload_2         
	//   30   58:invokespecial   #769 <Method void b(View, int, int)>
			return;
	//   31   61:return          
		} else
		{
			d(view, i1);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #770 <Method void d(View, int)>
			return;
	//   36   68:return          
		}
	}

	public void a(View view, int i1, int j1, int k1, int l1)
	{
		measureChildWithMargins(view, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokevirtual   #774 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   11:return          
	}

	public void a(View view, int i1, int j1, int k1, int l1, int i2)
	{
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore          9
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          8
		for(int j2 = 0; j2 < k2; j2++)
	//*   5    9:iconst_0        
	//*   6   10:istore          7
	//*   7   12:iload           7
	//*   8   14:iload           9
	//*   9   16:icmpge          104
		{
			View view1 = getChildAt(j2);
	//   10   19:aload_0         
	//   11   20:iload           7
	//   12   22:invokevirtual   #491 <Method View getChildAt(int)>
	//   13   25:astore          10
			if(view1.getVisibility() == 8)
	//*  14   27:aload           10
	//*  15   29:invokevirtual   #725 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            95
			Object obj = ((Object) ((c)view1.getLayoutParams()));
	//   19   40:aload           10
	//   20   42:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #24  <Class CoordinatorLayout$c>
	//   22   48:astore          11
			if(!((c) (obj)).c(i2))
	//*  23   50:aload           11
	//*  24   52:iload           6
	//*  25   54:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  26   57:ifne            63
				continue;
	//   27   60:goto            95
			obj = ((Object) (((c) (obj)).b()));
	//   28   63:aload           11
	//   29   65:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   30   68:astore          11
			if(obj != null)
	//*  31   70:aload           11
	//*  32   72:ifnull          95
			{
				((Behavior) (obj)).a(this, view1, view, i1, j1, k1, l1, i2);
	//   33   75:aload           11
	//   34   77:aload_0         
	//   35   78:aload           10
	//   36   80:aload_1         
	//   37   81:iload_2         
	//   38   82:iload_3         
	//   39   83:iload           4
	//   40   85:iload           5
	//   41   87:iload           6
	//   42   89:invokevirtual   #781 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, int, int, int, int, int)>
				flag = true;
	//   43   92:iconst_1        
	//   44   93:istore          8
			}
		}

	//   45   95:iload           7
	//   46   97:iconst_1        
	//   47   98:iadd            
	//   48   99:istore          7
	//*  49  101:goto            12
		if(flag)
	//*  50  104:iload           8
	//*  51  106:ifeq            114
			a(1);
	//   52  109:aload_0         
	//   53  110:iconst_1        
	//   54  111:invokevirtual   #783 <Method void a(int)>
	//   55  114:return          
	}

	public void a(View view, int i1, int j1, int ai[], int k1)
	{
		int i3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore          12
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          11
		int j2 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          8
		int k2 = 0;
	//    7   12:iconst_0        
	//    8   13:istore          9
		int l1;
		int i2;
		for(i2 = 0; j2 < i3; i2 = l1)
	//*   9   15:iconst_0        
	//*  10   16:istore          7
	//*  11   18:iload           8
	//*  12   20:iload           12
	//*  13   22:icmpge          234
		{
			View view1 = getChildAt(j2);
	//   14   25:aload_0         
	//   15   26:iload           8
	//   16   28:invokevirtual   #491 <Method View getChildAt(int)>
	//   17   31:astore          13
			int l2;
			if(view1.getVisibility() == 8)
	//*  18   33:aload           13
	//*  19   35:invokevirtual   #725 <Method int View.getVisibility()>
	//*  20   38:bipush          8
	//*  21   40:icmpne          54
			{
				l2 = k2;
	//   22   43:iload           9
	//   23   45:istore          10
				l1 = i2;
	//   24   47:iload           7
	//   25   49:istore          6
			} else
	//*  26   51:goto            217
			{
				Object obj = ((Object) ((c)view1.getLayoutParams()));
	//   27   54:aload           13
	//   28   56:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   59:checkcast       #24  <Class CoordinatorLayout$c>
	//   30   62:astore          14
				if(!((c) (obj)).c(k1))
	//*  31   64:aload           14
	//*  32   66:iload           5
	//*  33   68:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  34   71:ifne            85
				{
					l2 = k2;
	//   35   74:iload           9
	//   36   76:istore          10
					l1 = i2;
	//   37   78:iload           7
	//   38   80:istore          6
				} else
	//*  39   82:goto            217
				{
					obj = ((Object) (((c) (obj)).b()));
	//   40   85:aload           14
	//   41   87:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   42   90:astore          14
					l2 = k2;
	//   43   92:iload           9
	//   44   94:istore          10
					l1 = i2;
	//   45   96:iload           7
	//   46   98:istore          6
					if(obj != null)
	//*  47  100:aload           14
	//*  48  102:ifnull          217
					{
						int ai1[] = k;
	//   49  105:aload_0         
	//   50  106:getfield        #143 <Field int[] k>
	//   51  109:astore          15
						k[1] = 0;
	//   52  111:aload_0         
	//   53  112:getfield        #143 <Field int[] k>
	//   54  115:iconst_1        
	//   55  116:iconst_0        
	//   56  117:iastore         
						ai1[0] = 0;
	//   57  118:aload           15
	//   58  120:iconst_0        
	//   59  121:iconst_0        
	//   60  122:iastore         
						((Behavior) (obj)).a(this, view1, view, i1, j1, k, k1);
	//   61  123:aload           14
	//   62  125:aload_0         
	//   63  126:aload           13
	//   64  128:aload_1         
	//   65  129:iload_2         
	//   66  130:iload_3         
	//   67  131:aload_0         
	//   68  132:getfield        #143 <Field int[] k>
	//   69  135:iload           5
	//   70  137:invokevirtual   #787 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, int, int, int[], int)>
						if(i1 > 0)
	//*  71  140:iload_2         
	//*  72  141:ifle            160
							l1 = Math.max(k2, k[0]);
	//   73  144:iload           9
	//   74  146:aload_0         
	//   75  147:getfield        #143 <Field int[] k>
	//   76  150:iconst_0        
	//   77  151:iaload          
	//   78  152:invokestatic    #350 <Method int Math.max(int, int)>
	//   79  155:istore          6
						else
	//*  80  157:goto            173
							l1 = Math.min(k2, k[0]);
	//   81  160:iload           9
	//   82  162:aload_0         
	//   83  163:getfield        #143 <Field int[] k>
	//   84  166:iconst_0        
	//   85  167:iaload          
	//   86  168:invokestatic    #347 <Method int Math.min(int, int)>
	//   87  171:istore          6
						if(j1 > 0)
	//*  88  173:iload_3         
	//*  89  174:ifle            193
							i2 = Math.max(i2, k[1]);
	//   90  177:iload           7
	//   91  179:aload_0         
	//   92  180:getfield        #143 <Field int[] k>
	//   93  183:iconst_1        
	//   94  184:iaload          
	//   95  185:invokestatic    #350 <Method int Math.max(int, int)>
	//   96  188:istore          7
						else
	//*  97  190:goto            206
							i2 = Math.min(i2, k[1]);
	//   98  193:iload           7
	//   99  195:aload_0         
	//  100  196:getfield        #143 <Field int[] k>
	//  101  199:iconst_1        
	//  102  200:iaload          
	//  103  201:invokestatic    #347 <Method int Math.min(int, int)>
	//  104  204:istore          7
						l2 = l1;
	//  105  206:iload           6
	//  106  208:istore          10
						l1 = i2;
	//  107  210:iload           7
	//  108  212:istore          6
						flag = true;
	//  109  214:iconst_1        
	//  110  215:istore          11
					}
				}
			}
			j2++;
	//  111  217:iload           8
	//  112  219:iconst_1        
	//  113  220:iadd            
	//  114  221:istore          8
			k2 = l2;
	//  115  223:iload           10
	//  116  225:istore          9
		}

	//  117  227:iload           6
	//  118  229:istore          7
	//* 119  231:goto            18
		ai[0] = k2;
	//  120  234:aload           4
	//  121  236:iconst_0        
	//  122  237:iload           9
	//  123  239:iastore         
		ai[1] = i2;
	//  124  240:aload           4
	//  125  242:iconst_1        
	//  126  243:iload           7
	//  127  245:iastore         
		if(flag)
	//* 128  246:iload           11
	//* 129  248:ifeq            256
			a(1);
	//  130  251:aload_0         
	//  131  252:iconst_1        
	//  132  253:invokevirtual   #783 <Method void a(int)>
	//  133  256:return          
	}

	void a(View view, int i1, Rect rect, Rect rect1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          7
		int j1 = view.getMeasuredWidth();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #574 <Method int View.getMeasuredWidth()>
	//    6   13:istore          5
		int k1 = view.getMeasuredHeight();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #577 <Method int View.getMeasuredHeight()>
	//    9   19:istore          6
		a(view, i1, rect, rect1, c1, j1, k1);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:aload_3         
	//   14   25:aload           4
	//   15   27:aload           7
	//   16   29:iload           5
	//   17   31:iload           6
	//   18   33:invokespecial   #789 <Method void a(View, int, Rect, Rect, CoordinatorLayout$c, int, int)>
		a(c1, rect1, j1, k1);
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:aload           4
	//   22   41:iload           5
	//   23   43:iload           6
	//   24   45:invokespecial   #791 <Method void a(CoordinatorLayout$c, Rect, int, int)>
	//   25   48:return          
	}

	void a(View view, Rect rect)
	{
		android.support.design.widget.o.b(((ViewGroup) (this)), view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #796 <Method void o.b(ViewGroup, View, Rect)>
	//    4    6:return          
	}

	void a(View view, boolean flag, Rect rect)
	{
		if(!view.isLayoutRequested() && view.getVisibility() != 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #799 <Method boolean View.isLayoutRequested()>
	//*   2    4:ifne            51
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #725 <Method int View.getVisibility()>
	//*   5   11:bipush          8
	//*   6   13:icmpne          19
	//*   7   16:goto            51
		{
			if(flag)
	//*   8   19:iload_2         
	//*   9   20:ifeq            30
			{
				a(view, rect);
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #466 <Method void a(View, Rect)>
				return;
	//   14   29:return          
			} else
			{
				rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #416 <Method int View.getLeft()>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #419 <Method int View.getTop()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #422 <Method int View.getRight()>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #425 <Method int View.getBottom()>
	//   24   47:invokevirtual   #368 <Method void Rect.set(int, int, int, int)>
				return;
	//   25   50:return          
			}
		} else
		{
			rect.setEmpty();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #314 <Method void Rect.setEmpty()>
			return;
	//   28   55:return          
		}
	}

	public boolean a(View view, int i1, int j1)
	{
		Rect rect;
		rect = e();
	//    0    0:invokestatic    #413 <Method Rect e()>
	//    1    3:astore          5
		a(view, rect);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokevirtual   #466 <Method void a(View, Rect)>
		boolean flag = rect.contains(i1, j1);
	//    6   12:aload           5
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #803 <Method boolean Rect.contains(int, int)>
	//   10   19:istore          4
		a(rect);
	//   11   21:aload           5
	//   12   23:invokestatic    #448 <Method void a(Rect)>
		return flag;
	//   13   26:iload           4
	//   14   28:ireturn         
		view;
	//   15   29:astore_1        
		a(rect);
	//   16   30:aload           5
	//   17   32:invokestatic    #448 <Method void a(Rect)>
		throw view;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	public boolean a(View view, View view1, int i1, int j1)
	{
		int l1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore          6
		int k1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
		for(; k1 < l1; k1++)
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          113
		{
			View view2 = getChildAt(k1);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #491 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view2.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #725 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            104
			c c1 = (c)view2.getLayoutParams();
	//   19   40:aload           9
	//   20   42:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #24  <Class CoordinatorLayout$c>
	//   22   48:astore          10
			Behavior behavior = c1.b();
	//   23   50:aload           10
	//   24   52:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   25   55:astore          11
			if(behavior != null)
	//*  26   57:aload           11
	//*  27   59:ifnull          96
			{
				boolean flag1 = behavior.a(this, view2, view, view1, i1, j1);
	//   28   62:aload           11
	//   29   64:aload_0         
	//   30   65:aload           9
	//   31   67:aload_1         
	//   32   68:aload_2         
	//   33   69:iload_3         
	//   34   70:iload           4
	//   35   72:invokevirtual   #807 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, View, int, int)>
	//   36   75:istore          8
				c1.a(j1, flag1);
	//   37   77:aload           10
	//   38   79:iload           4
	//   39   81:iload           8
	//   40   83:invokevirtual   #810 <Method void android.support.design.widget.CoordinatorLayout$c.a(int, boolean)>
				flag |= flag1;
	//   41   86:iload           7
	//   42   88:iload           8
	//   43   90:ior             
	//   44   91:istore          7
			} else
	//*  45   93:goto            104
			{
				c1.a(j1, false);
	//   46   96:aload           10
	//   47   98:iload           4
	//   48  100:iconst_0        
	//   49  101:invokevirtual   #810 <Method void android.support.design.widget.CoordinatorLayout$c.a(int, boolean)>
			}
		}

	//   50  104:iload           5
	//   51  106:iconst_1        
	//   52  107:iadd            
	//   53  108:istore          5
	//*  54  110:goto            12
		return flag;
	//   55  113:iload           7
	//   56  115:ireturn         
	}

	void b()
	{
		if(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #812 <Field boolean n>
	//*   2    4:ifeq            37
		{
			if(r == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #814 <Field CoordinatorLayout$d r>
	//*   5   11:ifnonnull       26
				r = new d();
	//    6   14:aload_0         
	//    7   15:new             #27  <Class CoordinatorLayout$d>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #815 <Method void CoordinatorLayout$d(CoordinatorLayout)>
	//   11   23:putfield        #814 <Field CoordinatorLayout$d r>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #819 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   30:aload_0         
	//   15   31:getfield        #814 <Field CoordinatorLayout$d r>
	//   16   34:invokevirtual   #825 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		s = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #715 <Field boolean s>
	//   20   42:return          
	}

	public void b(View view)
	{
		List list = h.c(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field f h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #829 <Method List f.c(Object)>
	//    4    8:astore_3        
		if(list != null && !list.isEmpty())
	//*   5    9:aload_3         
	//*   6   10:ifnull          81
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #830 <Method boolean List.isEmpty()>
	//*   9   19:ifne            81
		{
			for(int i1 = 0; i1 < list.size(); i1++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #513 <Method int List.size()>
	//*  15   31:icmpge          81
			{
				View view1 = (View)list.get(i1);
	//   16   34:aload_3         
	//   17   35:iload_2         
	//   18   36:invokeinterface #516 <Method Object List.get(int)>
	//   19   41:checkcast       #401 <Class View>
	//   20   44:astore          4
				Behavior behavior = ((c)view1.getLayoutParams()).b();
	//   21   46:aload           4
	//   22   48:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   51:checkcast       #24  <Class CoordinatorLayout$c>
	//   24   54:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   25   57:astore          5
				if(behavior != null)
	//*  26   59:aload           5
	//*  27   61:ifnull          74
					behavior.b(this, view1, view);
	//   28   64:aload           5
	//   29   66:aload_0         
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:invokevirtual   #749 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, View)>
	//   33   73:pop             
			}

	//   34   74:iload_2         
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore_2        
		}
	//*  38   78:goto            24
	//   39   81:return          
	}

	void b(View view, int i1)
	{
label0:
		{
			int k1;
			int l1;
			c c1;
			Rect rect;
			Rect rect1;
			Rect rect2;
label1:
			{
				c1 = (c)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          6
				if(c1.k == null)
					break label0;
	//    4    9:aload           6
	//    5   11:getfield        #763 <Field View CoordinatorLayout$c.k>
	//    6   14:ifnull          212
				rect = e();
	//    7   17:invokestatic    #413 <Method Rect e()>
	//    8   20:astore          7
				rect1 = e();
	//    9   22:invokestatic    #413 <Method Rect e()>
	//   10   25:astore          8
				rect2 = e();
	//   11   27:invokestatic    #413 <Method Rect e()>
	//   12   30:astore          9
				a(c1.k, rect);
	//   13   32:aload_0         
	//   14   33:aload           6
	//   15   35:getfield        #763 <Field View CoordinatorLayout$c.k>
	//   16   38:aload           7
	//   17   40:invokevirtual   #466 <Method void a(View, Rect)>
				boolean flag = false;
	//   18   43:iconst_0        
	//   19   44:istore_3        
				a(view, false, rect1);
	//   20   45:aload_0         
	//   21   46:aload_1         
	//   22   47:iconst_0        
	//   23   48:aload           8
	//   24   50:invokevirtual   #732 <Method void a(View, boolean, Rect)>
				k1 = view.getMeasuredWidth();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #574 <Method int View.getMeasuredWidth()>
	//   27   57:istore          4
				l1 = view.getMeasuredHeight();
	//   28   59:aload_1         
	//   29   60:invokevirtual   #577 <Method int View.getMeasuredHeight()>
	//   30   63:istore          5
				a(view, i1, rect, rect2, c1, k1, l1);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:iload_2         
	//   34   68:aload           7
	//   35   70:aload           9
	//   36   72:aload           6
	//   37   74:iload           4
	//   38   76:iload           5
	//   39   78:invokespecial   #789 <Method void a(View, int, Rect, Rect, CoordinatorLayout$c, int, int)>
				if(rect2.left == rect1.left)
	//*  40   81:aload           9
	//*  41   83:getfield        #336 <Field int Rect.left>
	//*  42   86:aload           8
	//*  43   88:getfield        #336 <Field int Rect.left>
	//*  44   91:icmpne          109
				{
					i1 = ((int) (flag));
	//   45   94:iload_3         
	//   46   95:istore_2        
					if(rect2.top == rect1.top)
						break label1;
	//   47   96:aload           9
	//   48   98:getfield        #359 <Field int Rect.top>
	//   49  101:aload           8
	//   50  103:getfield        #359 <Field int Rect.top>
	//   51  106:icmpeq          111
				}
				i1 = 1;
	//   52  109:iconst_1        
	//   53  110:istore_2        
			}
			a(c1, rect2, k1, l1);
	//   54  111:aload_0         
	//   55  112:aload           6
	//   56  114:aload           9
	//   57  116:iload           4
	//   58  118:iload           5
	//   59  120:invokespecial   #791 <Method void a(CoordinatorLayout$c, Rect, int, int)>
			int j1 = rect2.left - rect1.left;
	//   60  123:aload           9
	//   61  125:getfield        #336 <Field int Rect.left>
	//   62  128:aload           8
	//   63  130:getfield        #336 <Field int Rect.left>
	//   64  133:isub            
	//   65  134:istore_3        
			k1 = rect2.top - rect1.top;
	//   66  135:aload           9
	//   67  137:getfield        #359 <Field int Rect.top>
	//   68  140:aload           8
	//   69  142:getfield        #359 <Field int Rect.top>
	//   70  145:isub            
	//   71  146:istore          4
			if(j1 != 0)
	//*  72  148:iload_3         
	//*  73  149:ifeq            157
				android.support.v4.view.s.d(view, j1);
	//   74  152:aload_1         
	//   75  153:iload_3         
	//   76  154:invokestatic    #599 <Method void s.d(View, int)>
			if(k1 != 0)
	//*  77  157:iload           4
	//*  78  159:ifeq            168
				android.support.v4.view.s.c(view, k1);
	//   79  162:aload_1         
	//   80  163:iload           4
	//   81  165:invokestatic    #608 <Method void s.c(View, int)>
			if(i1 != 0)
	//*  82  168:iload_2         
	//*  83  169:ifeq            197
			{
				Behavior behavior = c1.b();
	//   84  172:aload           6
	//   85  174:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   86  177:astore          10
				if(behavior != null)
	//*  87  179:aload           10
	//*  88  181:ifnull          197
					behavior.b(this, view, c1.k);
	//   89  184:aload           10
	//   90  186:aload_0         
	//   91  187:aload_1         
	//   92  188:aload           6
	//   93  190:getfield        #763 <Field View CoordinatorLayout$c.k>
	//   94  193:invokevirtual   #749 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, View)>
	//   95  196:pop             
			}
			a(rect);
	//   96  197:aload           7
	//   97  199:invokestatic    #448 <Method void a(Rect)>
			a(rect1);
	//   98  202:aload           8
	//   99  204:invokestatic    #448 <Method void a(Rect)>
			a(rect2);
	//  100  207:aload           9
	//  101  209:invokestatic    #448 <Method void a(Rect)>
		}
	//  102  212:return          
	}

	void b(View view, Rect rect)
	{
		((c)view.getLayoutParams()).a(rect);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #831 <Method void android.support.design.widget.CoordinatorLayout$c.a(Rect)>
	//    5   11:return          
	}

	public void b(View view, View view1, int i1, int j1)
	{
		x.a(view, view1, i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field n x>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #834 <Method void n.a(View, View, int, int)>
		q = view1;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #836 <Field View q>
		int l1 = getChildCount();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #484 <Method int getChildCount()>
	//   12   21:istore          6
		for(int k1 = 0; k1 < l1; k1++)
	//*  13   23:iconst_0        
	//*  14   24:istore          5
	//*  15   26:iload           5
	//*  16   28:iload           6
	//*  17   30:icmpge          98
		{
			View view2 = getChildAt(k1);
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:invokevirtual   #491 <Method View getChildAt(int)>
	//   21   39:astore          7
			Object obj = ((Object) ((c)view2.getLayoutParams()));
	//   22   41:aload           7
	//   23   43:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   46:checkcast       #24  <Class CoordinatorLayout$c>
	//   25   49:astore          8
			if(!((c) (obj)).c(j1))
	//*  26   51:aload           8
	//*  27   53:iload           4
	//*  28   55:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  29   58:ifne            64
				continue;
	//   30   61:goto            89
			obj = ((Object) (((c) (obj)).b()));
	//   31   64:aload           8
	//   32   66:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   33   69:astore          8
			if(obj != null)
	//*  34   71:aload           8
	//*  35   73:ifnull          89
				((Behavior) (obj)).b(this, view2, view, view1, i1, j1);
	//   36   76:aload           8
	//   37   78:aload_0         
	//   38   79:aload           7
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:iload_3         
	//   42   84:iload           4
	//   43   86:invokevirtual   #839 <Method void CoordinatorLayout$Behavior.b(CoordinatorLayout, View, View, View, int, int)>
		}

	//   44   89:iload           5
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:istore          5
	//*  48   95:goto            26
	//   49   98:return          
	}

	public List c(View view)
	{
		view = ((View) (h.d(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field f h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #842 <Method List android.support.design.widget.f.d(Object)>
	//    4    8:astore_1        
		j.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #141 <Field List j>
	//    7   13:invokeinterface #478 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			j.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #141 <Field List j>
	//   12   26:aload_1         
	//   13   27:invokeinterface #633 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return j;
	//   15   33:aload_0         
	//   16   34:getfield        #141 <Field List j>
	//   17   37:areturn         
	}

	void c()
	{
		if(n && r != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #812 <Field boolean n>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #814 <Field CoordinatorLayout$d r>
	//*   5   11:ifnull          25
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #819 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #814 <Field CoordinatorLayout$d r>
	//   10   22:invokevirtual   #846 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		s = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #715 <Field boolean s>
	//   14   30:return          
	}

	public void c(View view, int i1)
	{
		x.a(view, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field n x>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #848 <Method void n.a(View, int)>
		int k1 = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #484 <Method int getChildCount()>
	//    7   13:istore          4
		for(int j1 = 0; j1 < k1; j1++)
	//*   8   15:iconst_0        
	//*   9   16:istore_3        
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          92
		{
			View view1 = getChildAt(j1);
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #491 <Method View getChildAt(int)>
	//   16   28:astore          5
			c c1 = (c)view1.getLayoutParams();
	//   17   30:aload           5
	//   18   32:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #24  <Class CoordinatorLayout$c>
	//   20   38:astore          6
			if(!c1.c(i1))
	//*  21   40:aload           6
	//*  22   42:iload_2         
	//*  23   43:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  24   46:ifne            52
				continue;
	//   25   49:goto            85
			Behavior behavior = c1.b();
	//   26   52:aload           6
	//   27   54:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   28   57:astore          7
			if(behavior != null)
	//*  29   59:aload           7
	//*  30   61:ifnull          74
				behavior.a(this, view1, view, i1);
	//   31   64:aload           7
	//   32   66:aload_0         
	//   33   67:aload           5
	//   34   69:aload_1         
	//   35   70:iload_2         
	//   36   71:invokevirtual   #851 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, int)>
			c1.b(i1);
	//   37   74:aload           6
	//   38   76:iload_2         
	//   39   77:invokevirtual   #853 <Method void CoordinatorLayout$c.b(int)>
			c1.h();
	//   40   80:aload           6
	//   41   82:invokevirtual   #747 <Method void CoordinatorLayout$c.h()>
		}

	//   42   85:iload_3         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_3        
	//*  46   89:goto            17
		q = null;
	//   47   92:aload_0         
	//   48   93:aconst_null     
	//   49   94:putfield        #836 <Field View q>
	//   50   97:return          
	}

	void c(View view, Rect rect)
	{
		rect.set(((c)view.getLayoutParams()).c());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #24  <Class CoordinatorLayout$c>
	//    4    8:invokevirtual   #855 <Method Rect CoordinatorLayout$c.c()>
	//    5   11:invokevirtual   #446 <Method void Rect.set(Rect)>
	//    6   14:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof c) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #24  <Class CoordinatorLayout$c>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #859 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	protected c d()
	{
		return new c(-2, -2);
	//    0    0:new             #24  <Class CoordinatorLayout$c>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #863 <Method void CoordinatorLayout$c(int, int)>
	//    5   11:areturn         
	}

	public List d(View view)
	{
		view = ((View) (h.c(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field f h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #829 <Method List f.c(Object)>
	//    4    8:astore_1        
		j.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #141 <Field List j>
	//    7   13:invokeinterface #478 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			j.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #141 <Field List j>
	//   12   26:aload_1         
	//   13   27:invokeinterface #633 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return j;
	//   15   33:aload_0         
	//   16   34:getfield        #141 <Field List j>
	//   17   37:areturn         
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		c c1 = (c)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:astore          7
		if(c1.a != null)
	//*   4    9:aload           7
	//*   5   11:getfield        #868 <Field CoordinatorLayout$Behavior android.support.design.widget.CoordinatorLayout$c.a>
	//*   6   14:ifnull          179
		{
			float f1 = c1.a.d(this, view);
	//    7   17:aload           7
	//    8   19:getfield        #868 <Field CoordinatorLayout$Behavior android.support.design.widget.CoordinatorLayout$c.a>
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #871 <Method float android.support.design.widget.CoordinatorLayout$Behavior.d(CoordinatorLayout, View)>
	//   12   27:fstore          5
			if(f1 > 0.0F)
	//*  13   29:fload           5
	//*  14   31:fconst_0        
	//*  15   32:fcmpl           
	//*  16   33:ifle            179
			{
				if(l == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #873 <Field Paint l>
	//*  19   40:ifnonnull       54
					l = new Paint();
	//   20   43:aload_0         
	//   21   44:new             #875 <Class Paint>
	//   22   47:dup             
	//   23   48:invokespecial   #876 <Method void Paint()>
	//   24   51:putfield        #873 <Field Paint l>
				l.setColor(c1.a.c(this, view));
	//   25   54:aload_0         
	//   26   55:getfield        #873 <Field Paint l>
	//   27   58:aload           7
	//   28   60:getfield        #868 <Field CoordinatorLayout$Behavior android.support.design.widget.CoordinatorLayout$c.a>
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #879 <Method int CoordinatorLayout$Behavior.c(CoordinatorLayout, View)>
	//   32   68:invokevirtual   #882 <Method void Paint.setColor(int)>
				l.setAlpha(android.support.v4.c.a.a(Math.round(f1 * 255F), 0, 255));
	//   33   71:aload_0         
	//   34   72:getfield        #873 <Field Paint l>
	//   35   75:fload           5
	//   36   77:ldc2            #883 <Float 255F>
	//   37   80:fmul            
	//   38   81:invokestatic    #887 <Method int Math.round(float)>
	//   39   84:iconst_0        
	//   40   85:sipush          255
	//   41   88:invokestatic    #892 <Method int a.a(int, int, int)>
	//   42   91:invokevirtual   #895 <Method void Paint.setAlpha(int)>
				int i1 = canvas.save();
	//   43   94:aload_1         
	//   44   95:invokevirtual   #900 <Method int Canvas.save()>
	//   45   98:istore          6
				if(view.isOpaque())
	//*  46  100:aload_2         
	//*  47  101:invokevirtual   #903 <Method boolean View.isOpaque()>
	//*  48  104:ifeq            135
					canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
	//   49  107:aload_1         
	//   50  108:aload_2         
	//   51  109:invokevirtual   #416 <Method int View.getLeft()>
	//   52  112:i2f             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #419 <Method int View.getTop()>
	//   55  117:i2f             
	//   56  118:aload_2         
	//   57  119:invokevirtual   #422 <Method int View.getRight()>
	//   58  122:i2f             
	//   59  123:aload_2         
	//   60  124:invokevirtual   #425 <Method int View.getBottom()>
	//   61  127:i2f             
	//   62  128:getstatic       #909 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   63  131:invokevirtual   #913 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
	//   64  134:pop             
				canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), l);
	//   65  135:aload_1         
	//   66  136:aload_0         
	//   67  137:invokevirtual   #330 <Method int getPaddingLeft()>
	//   68  140:i2f             
	//   69  141:aload_0         
	//   70  142:invokevirtual   #353 <Method int getPaddingTop()>
	//   71  145:i2f             
	//   72  146:aload_0         
	//   73  147:invokevirtual   #324 <Method int getWidth()>
	//   74  150:aload_0         
	//   75  151:invokevirtual   #339 <Method int getPaddingRight()>
	//   76  154:isub            
	//   77  155:i2f             
	//   78  156:aload_0         
	//   79  157:invokevirtual   #327 <Method int getHeight()>
	//   80  160:aload_0         
	//   81  161:invokevirtual   #362 <Method int getPaddingBottom()>
	//   82  164:isub            
	//   83  165:i2f             
	//   84  166:aload_0         
	//   85  167:getfield        #873 <Field Paint l>
	//   86  170:invokevirtual   #917 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i1);
	//   87  173:aload_1         
	//   88  174:iload           6
	//   89  176:invokevirtual   #920 <Method void Canvas.restoreToCount(int)>
			}
		}
		return super.drawChild(canvas, view, l1);
	//   90  179:aload_0         
	//   91  180:aload_1         
	//   92  181:aload_2         
	//   93  182:lload_3         
	//   94  183:invokespecial   #922 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   95  186:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #925 <Method void ViewGroup.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #929 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = v;
	//    5    9:aload_0         
	//    6   10:getfield        #208 <Field Drawable v>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #934 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #938 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            51
			invalidate();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #941 <Method void invalidate()>
	//   29   51:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #944 <Method CoordinatorLayout$c d()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #948 <Method CoordinatorLayout$c a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #951 <Method CoordinatorLayout$c a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	final List getDependencySortedChildren()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #955 <Method void g()>
		return Collections.unmodifiableList(g);
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field List g>
	//    4    8:invokestatic    #959 <Method List Collections.unmodifiableList(List)>
	//    5   11:areturn         
	}

	final aa getLastWindowInsets()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #583 <Field aa t>
	//    2    4:areturn         
	}

	public int getNestedScrollAxes()
	{
		return x.a();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field n x>
	//    2    4:invokevirtual   #964 <Method int n.a()>
	//    3    7:ireturn         
	}

	public Drawable getStatusBarBackground()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field Drawable v>
	//    2    4:areturn         
	}

	protected int getSuggestedMinimumHeight()
	{
		return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:invokespecial   #968 <Method int ViewGroup.getSuggestedMinimumHeight()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #353 <Method int getPaddingTop()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #362 <Method int getPaddingBottom()>
	//    6   12:iadd            
	//    7   13:invokestatic    #350 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	protected int getSuggestedMinimumWidth()
	{
		return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
	//    0    0:aload_0         
	//    1    1:invokespecial   #971 <Method int ViewGroup.getSuggestedMinimumWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #330 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #339 <Method int getPaddingRight()>
	//    6   12:iadd            
	//    7   13:invokestatic    #350 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #974 <Method void ViewGroup.onAttachedToWindow()>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #975 <Method void f()>
		if(s)
	//*   4    8:aload_0         
	//*   5    9:getfield        #715 <Field boolean s>
	//*   6   12:ifeq            45
		{
			if(r == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #814 <Field CoordinatorLayout$d r>
	//*   9   19:ifnonnull       34
				r = new d();
	//   10   22:aload_0         
	//   11   23:new             #27  <Class CoordinatorLayout$d>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #815 <Method void CoordinatorLayout$d(CoordinatorLayout)>
	//   15   31:putfield        #814 <Field CoordinatorLayout$d r>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   16   34:aload_0         
	//   17   35:invokevirtual   #819 <Method ViewTreeObserver getViewTreeObserver()>
	//   18   38:aload_0         
	//   19   39:getfield        #814 <Field CoordinatorLayout$d r>
	//   20   42:invokevirtual   #825 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		if(t == null && android.support.v4.view.s.q(((View) (this))))
	//*  21   45:aload_0         
	//*  22   46:getfield        #583 <Field aa t>
	//*  23   49:ifnonnull       63
	//*  24   52:aload_0         
	//*  25   53:invokestatic    #565 <Method boolean s.q(View)>
	//*  26   56:ifeq            63
			android.support.v4.view.s.p(((View) (this)));
	//   27   59:aload_0         
	//   28   60:invokestatic    #977 <Method void s.p(View)>
		n = true;
	//   29   63:aload_0         
	//   30   64:iconst_1        
	//   31   65:putfield        #812 <Field boolean n>
	//   32   68:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #980 <Method void ViewGroup.onDetachedFromWindow()>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #975 <Method void f()>
		if(s && r != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #715 <Field boolean s>
	//*   6   12:ifeq            33
	//*   7   15:aload_0         
	//*   8   16:getfield        #814 <Field CoordinatorLayout$d r>
	//*   9   19:ifnull          33
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #819 <Method ViewTreeObserver getViewTreeObserver()>
	//   12   26:aload_0         
	//   13   27:getfield        #814 <Field CoordinatorLayout$d r>
	//   14   30:invokevirtual   #846 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(q != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #836 <Field View q>
	//*  17   37:ifnull          48
			onStopNestedScroll(q);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #836 <Field View q>
	//   21   45:invokevirtual   #983 <Method void onStopNestedScroll(View)>
		n = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #812 <Field boolean n>
	//   25   53:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #987 <Method void ViewGroup.onDraw(Canvas)>
		if(u && v != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #699 <Field boolean u>
	//*   5    9:ifeq            65
	//*   6   12:aload_0         
	//*   7   13:getfield        #208 <Field Drawable v>
	//*   8   16:ifnull          65
		{
			int i1;
			if(t != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #583 <Field aa t>
	//*  11   23:ifnull          37
				i1 = t.b();
	//   12   26:aload_0         
	//   13   27:getfield        #583 <Field aa t>
	//   14   30:invokevirtual   #587 <Method int aa.b()>
	//   15   33:istore_2        
			else
	//*  16   34:goto            39
				i1 = 0;
	//   17   37:iconst_0        
	//   18   38:istore_2        
			if(i1 > 0)
	//*  19   39:iload_2         
	//*  20   40:ifle            65
			{
				v.setBounds(0, 0, getWidth(), i1);
	//   21   43:aload_0         
	//   22   44:getfield        #208 <Field Drawable v>
	//   23   47:iconst_0        
	//   24   48:iconst_0        
	//   25   49:aload_0         
	//   26   50:invokevirtual   #324 <Method int getWidth()>
	//   27   53:iload_2         
	//   28   54:invokevirtual   #990 <Method void Drawable.setBounds(int, int, int, int)>
				v.draw(canvas);
	//   29   57:aload_0         
	//   30   58:getfield        #208 <Field Drawable v>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #993 <Method void Drawable.draw(Canvas)>
			}
		}
	//   33   65:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #508 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i1 == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            13
			f();
	//    5    9:aload_0         
	//    6   10:invokespecial   #975 <Method void f()>
		boolean flag = a(motionevent, 0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #997 <Method boolean a(MotionEvent, int)>
	//   11   19:istore_3        
		if(i1 == 1 || i1 == 3)
	//*  12   20:iload_2         
	//*  13   21:iconst_1        
	//*  14   22:icmpeq          30
	//*  15   25:iload_2         
	//*  16   26:iconst_3        
	//*  17   27:icmpne          34
			f();
	//   18   30:aload_0         
	//   19   31:invokespecial   #975 <Method void f()>
		return flag;
	//   20   34:iload_3         
	//   21   35:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		j1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #722 <Method int s.e(View)>
	//    2    4:istore_3        
		k1 = g.size();
	//    3    5:aload_0         
	//    4    6:getfield        #132 <Field List g>
	//    5    9:invokeinterface #513 <Method int List.size()>
	//    6   14:istore          4
		for(i1 = 0; i1 < k1; i1++)
	//*   7   16:iconst_0        
	//*   8   17:istore_2        
	//*   9   18:iload_2         
	//*  10   19:iload           4
	//*  11   21:icmpge          96
		{
			View view = (View)g.get(i1);
	//   12   24:aload_0         
	//   13   25:getfield        #132 <Field List g>
	//   14   28:iload_2         
	//   15   29:invokeinterface #516 <Method Object List.get(int)>
	//   16   34:checkcast       #401 <Class View>
	//   17   37:astore          6
			if(view.getVisibility() == 8)
	//*  18   39:aload           6
	//*  19   41:invokevirtual   #725 <Method int View.getVisibility()>
	//*  20   44:bipush          8
	//*  21   46:icmpne          52
				continue;
	//   22   49:goto            89
			Behavior behavior = ((c)view.getLayoutParams()).b();
	//   23   52:aload           6
	//   24   54:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   57:checkcast       #24  <Class CoordinatorLayout$c>
	//   26   60:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   27   63:astore          7
			if(behavior == null || !behavior.a(this, view, j1))
	//*  28   65:aload           7
	//*  29   67:ifnull          82
	//*  30   70:aload           7
	//*  31   72:aload_0         
	//*  32   73:aload           6
	//*  33   75:iload_3         
	//*  34   76:invokevirtual   #1002 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, int)>
	//*  35   79:ifne            89
				a(view, j1);
	//   36   82:aload_0         
	//   37   83:aload           6
	//   38   85:iload_3         
	//   39   86:invokevirtual   #1003 <Method void a(View, int)>
		}

	//   40   89:iload_2         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_2        
	//*  44   93:goto            18
	//   45   96:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #955 <Method void g()>
		a();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1005 <Method void a()>
		int l3 = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #330 <Method int getPaddingLeft()>
	//    6   12:istore          13
		int i4 = getPaddingTop();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #353 <Method int getPaddingTop()>
	//    9   18:istore          14
		int j4 = getPaddingRight();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #339 <Method int getPaddingRight()>
	//   12   24:istore          15
		int k4 = getPaddingBottom();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #362 <Method int getPaddingBottom()>
	//   15   30:istore          16
		int l4 = android.support.v4.view.s.e(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #722 <Method int s.e(View)>
	//   18   36:istore          17
		boolean flag;
		if(l4 == 1)
	//*  19   38:iload           17
	//*  20   40:iconst_1        
	//*  21   41:icmpne          50
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore          6
		else
	//*  24   47:goto            53
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore          6
		int i5 = android.view.View.MeasureSpec.getMode(i1);
	//   27   53:iload_1         
	//   28   54:invokestatic    #1010 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   29   57:istore          18
		int j5 = android.view.View.MeasureSpec.getSize(i1);
	//   30   59:iload_1         
	//   31   60:invokestatic    #1013 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   32   63:istore          19
		int k5 = android.view.View.MeasureSpec.getMode(j1);
	//   33   65:iload_2         
	//   34   66:invokestatic    #1010 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   35   69:istore          20
		int l5 = android.view.View.MeasureSpec.getSize(j1);
	//   36   71:iload_2         
	//   37   72:invokestatic    #1013 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   38   75:istore          21
		int l2 = getSuggestedMinimumWidth();
	//   39   77:aload_0         
	//   40   78:invokevirtual   #1014 <Method int getSuggestedMinimumWidth()>
	//   41   81:istore          10
		int l1 = getSuggestedMinimumHeight();
	//   42   83:aload_0         
	//   43   84:invokevirtual   #1015 <Method int getSuggestedMinimumHeight()>
	//   44   87:istore          4
		boolean flag1;
		if(t != null && android.support.v4.view.s.q(((View) (this))))
	//*  45   89:aload_0         
	//*  46   90:getfield        #583 <Field aa t>
	//*  47   93:ifnull          109
	//*  48   96:aload_0         
	//*  49   97:invokestatic    #565 <Method boolean s.q(View)>
	//*  50  100:ifeq            109
			flag1 = true;
	//   51  103:iconst_1        
	//   52  104:istore          7
		else
	//*  53  106:goto            112
			flag1 = false;
	//   54  109:iconst_0        
	//   55  110:istore          7
		int j2 = g.size();
	//   56  112:aload_0         
	//   57  113:getfield        #132 <Field List g>
	//   58  116:invokeinterface #513 <Method int List.size()>
	//   59  121:istore          8
		int i2 = 0;
	//   60  123:iconst_0        
	//   61  124:istore          5
		for(int k2 = 0; k2 < j2; k2++)
	//*  62  126:iconst_0        
	//*  63  127:istore          9
	//*  64  129:iload           9
	//*  65  131:iload           8
	//*  66  133:icmpge          516
		{
			int k1;
			View view;
			c c1;
label0:
			{
				view = (View)g.get(k2);
	//   67  136:aload_0         
	//   68  137:getfield        #132 <Field List g>
	//   69  140:iload           9
	//   70  142:invokeinterface #516 <Method Object List.get(int)>
	//   71  147:checkcast       #401 <Class View>
	//   72  150:astore          24
				if(view.getVisibility() == 8)
	//*  73  152:aload           24
	//*  74  154:invokevirtual   #725 <Method int View.getVisibility()>
	//*  75  157:bipush          8
	//*  76  159:icmpne          165
					continue;
	//   77  162:goto            507
				c1 = (c)view.getLayoutParams();
	//   78  165:aload           24
	//   79  167:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   80  170:checkcast       #24  <Class CoordinatorLayout$c>
	//   81  173:astore          25
				if(c1.e >= 0 && i5 != 0)
	//*  82  175:aload           25
	//*  83  177:getfield        #767 <Field int CoordinatorLayout$c.e>
	//*  84  180:iflt            287
	//*  85  183:iload           18
	//*  86  185:ifeq            287
				{
					k1 = b(c1.e);
	//   87  188:aload_0         
	//   88  189:aload           25
	//   89  191:getfield        #767 <Field int CoordinatorLayout$c.e>
	//   90  194:invokespecial   #579 <Method int b(int)>
	//   91  197:istore_3        
					int i3 = android.support.v4.view.d.a(d(c1.c), l4) & 7;
	//   92  198:aload           25
	//   93  200:getfield        #371 <Field int CoordinatorLayout$c.c>
	//   94  203:invokestatic    #571 <Method int d(int)>
	//   95  206:iload           17
	//   96  208:invokestatic    #377 <Method int d.a(int, int)>
	//   97  211:bipush          7
	//   98  213:iand            
	//   99  214:istore          11
					if(i3 == 3 && !flag || i3 == 5 && flag)
	//* 100  216:iload           11
	//* 101  218:iconst_3        
	//* 102  219:icmpne          227
	//* 103  222:iload           6
	//* 104  224:ifeq            238
	//* 105  227:iload           11
	//* 106  229:iconst_5        
	//* 107  230:icmpne          253
	//* 108  233:iload           6
	//* 109  235:ifeq            253
					{
						k1 = Math.max(0, j5 - j4 - k1);
	//  110  238:iconst_0        
	//  111  239:iload           19
	//  112  241:iload           15
	//  113  243:isub            
	//  114  244:iload_3         
	//  115  245:isub            
	//  116  246:invokestatic    #350 <Method int Math.max(int, int)>
	//  117  249:istore_3        
						break label0;
	//  118  250:goto            289
					}
					if(i3 == 5 && !flag || i3 == 3 && flag)
	//* 119  253:iload           11
	//* 120  255:iconst_5        
	//* 121  256:icmpne          264
	//* 122  259:iload           6
	//* 123  261:ifeq            275
	//* 124  264:iload           11
	//* 125  266:iconst_3        
	//* 126  267:icmpne          287
	//* 127  270:iload           6
	//* 128  272:ifeq            287
					{
						k1 = Math.max(0, k1 - l3);
	//  129  275:iconst_0        
	//  130  276:iload_3         
	//  131  277:iload           13
	//  132  279:isub            
	//  133  280:invokestatic    #350 <Method int Math.max(int, int)>
	//  134  283:istore_3        
						break label0;
	//  135  284:goto            289
					}
				}
				k1 = 0;
	//  136  287:iconst_0        
	//  137  288:istore_3        
			}
			int j3 = i2;
	//  138  289:iload           5
	//  139  291:istore          11
			int k3 = l1;
	//  140  293:iload           4
	//  141  295:istore          12
			if(flag1 && !android.support.v4.view.s.q(view))
	//* 142  297:iload           7
	//* 143  299:ifeq            379
	//* 144  302:aload           24
	//* 145  304:invokestatic    #565 <Method boolean s.q(View)>
	//* 146  307:ifne            379
			{
				l1 = t.a();
	//  147  310:aload_0         
	//  148  311:getfield        #583 <Field aa t>
	//  149  314:invokevirtual   #585 <Method int aa.a()>
	//  150  317:istore          4
				int j6 = t.c();
	//  151  319:aload_0         
	//  152  320:getfield        #583 <Field aa t>
	//  153  323:invokevirtual   #589 <Method int aa.c()>
	//  154  326:istore          23
				i2 = t.b();
	//  155  328:aload_0         
	//  156  329:getfield        #583 <Field aa t>
	//  157  332:invokevirtual   #587 <Method int aa.b()>
	//  158  335:istore          5
				int i6 = t.d();
	//  159  337:aload_0         
	//  160  338:getfield        #583 <Field aa t>
	//  161  341:invokevirtual   #591 <Method int aa.d()>
	//  162  344:istore          22
				l1 = android.view.View.MeasureSpec.makeMeasureSpec(j5 - (l1 + j6), i5);
	//  163  346:iload           19
	//  164  348:iload           4
	//  165  350:iload           23
	//  166  352:iadd            
	//  167  353:isub            
	//  168  354:iload           18
	//  169  356:invokestatic    #1018 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  170  359:istore          4
				i2 = android.view.View.MeasureSpec.makeMeasureSpec(l5 - (i2 + i6), k5);
	//  171  361:iload           21
	//  172  363:iload           5
	//  173  365:iload           22
	//  174  367:iadd            
	//  175  368:isub            
	//  176  369:iload           20
	//  177  371:invokestatic    #1018 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  178  374:istore          5
			} else
	//* 179  376:goto            385
			{
				l1 = i1;
	//  180  379:iload_1         
	//  181  380:istore          4
				i2 = j1;
	//  182  382:iload_2         
	//  183  383:istore          5
			}
			Behavior behavior = c1.b();
	//  184  385:aload           25
	//  185  387:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//  186  390:astore          26
			if(behavior == null || !behavior.a(this, view, l1, k1, i2, 0))
	//* 187  392:aload           26
	//* 188  394:ifnull          420
	//* 189  397:aload           26
	//* 190  399:aload_0         
	//* 191  400:aload           24
	//* 192  402:iload           4
	//* 193  404:iload_3         
	//* 194  405:iload           5
	//* 195  407:iconst_0        
	//* 196  408:invokevirtual   #1021 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, int, int, int, int)>
	//* 197  411:ifne            417
	//* 198  414:goto            420
	//* 199  417:goto            435
				a(view, l1, k1, i2, 0);
	//  200  420:aload_0         
	//  201  421:aload           24
	//  202  423:iload           4
	//  203  425:iload_3         
	//  204  426:iload           5
	//  205  428:iconst_0        
	//  206  429:invokevirtual   #1023 <Method void a(View, int, int, int, int)>
	//* 207  432:goto            417
			l2 = Math.max(l2, l3 + j4 + view.getMeasuredWidth() + c1.leftMargin + c1.rightMargin);
	//  208  435:iload           10
	//  209  437:iload           13
	//  210  439:iload           15
	//  211  441:iadd            
	//  212  442:aload           24
	//  213  444:invokevirtual   #574 <Method int View.getMeasuredWidth()>
	//  214  447:iadd            
	//  215  448:aload           25
	//  216  450:getfield        #333 <Field int CoordinatorLayout$c.leftMargin>
	//  217  453:iadd            
	//  218  454:aload           25
	//  219  456:getfield        #342 <Field int CoordinatorLayout$c.rightMargin>
	//  220  459:iadd            
	//  221  460:invokestatic    #350 <Method int Math.max(int, int)>
	//  222  463:istore          10
			l1 = Math.max(k3, i4 + k4 + view.getMeasuredHeight() + c1.topMargin + c1.bottomMargin);
	//  223  465:iload           12
	//  224  467:iload           14
	//  225  469:iload           16
	//  226  471:iadd            
	//  227  472:aload           24
	//  228  474:invokevirtual   #577 <Method int View.getMeasuredHeight()>
	//  229  477:iadd            
	//  230  478:aload           25
	//  231  480:getfield        #356 <Field int CoordinatorLayout$c.topMargin>
	//  232  483:iadd            
	//  233  484:aload           25
	//  234  486:getfield        #365 <Field int CoordinatorLayout$c.bottomMargin>
	//  235  489:iadd            
	//  236  490:invokestatic    #350 <Method int Math.max(int, int)>
	//  237  493:istore          4
			i2 = View.combineMeasuredStates(j3, view.getMeasuredState());
	//  238  495:iload           11
	//  239  497:aload           24
	//  240  499:invokevirtual   #1026 <Method int View.getMeasuredState()>
	//  241  502:invokestatic    #1029 <Method int View.combineMeasuredStates(int, int)>
	//  242  505:istore          5
		}

	//  243  507:iload           9
	//  244  509:iconst_1        
	//  245  510:iadd            
	//  246  511:istore          9
	//* 247  513:goto            129
		setMeasuredDimension(View.resolveSizeAndState(l2, i1, 0xff000000 & i2), View.resolveSizeAndState(l1, j1, i2 << 16));
	//  248  516:aload_0         
	//  249  517:iload           10
	//  250  519:iload_1         
	//  251  520:ldc2            #1030 <Int 0xff000000>
	//  252  523:iload           5
	//  253  525:iand            
	//  254  526:invokestatic    #1033 <Method int View.resolveSizeAndState(int, int, int)>
	//  255  529:iload           4
	//  256  531:iload_2         
	//  257  532:iload           5
	//  258  534:bipush          16
	//  259  536:ishl            
	//  260  537:invokestatic    #1033 <Method int View.resolveSizeAndState(int, int, int)>
	//  261  540:invokevirtual   #1036 <Method void setMeasuredDimension(int, int)>
	//  262  543:return          
	}

	public boolean onNestedFling(View view, float f1, float f2, boolean flag)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore          6
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag1;
		boolean flag2;
		for(flag1 = false; i1 < j1; flag1 = flag2)
	//*   5    9:iconst_0        
	//*   6   10:istore          7
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          117
		{
			View view1 = getChildAt(i1);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #491 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view1.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #725 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag2 = flag1;
	//   18   37:iload           7
	//   19   39:istore          8
			} else
	//*  20   41:goto            104
			{
				Object obj = ((Object) ((c)view1.getLayoutParams()));
	//   21   44:aload           9
	//   22   46:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #24  <Class CoordinatorLayout$c>
	//   24   52:astore          10
				if(!((c) (obj)).c(0))
	//*  25   54:aload           10
	//*  26   56:iconst_0        
	//*  27   57:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  28   60:ifne            70
				{
					flag2 = flag1;
	//   29   63:iload           7
	//   30   65:istore          8
				} else
	//*  31   67:goto            104
				{
					obj = ((Object) (((c) (obj)).b()));
	//   32   70:aload           10
	//   33   72:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   34   75:astore          10
					flag2 = flag1;
	//   35   77:iload           7
	//   36   79:istore          8
					if(obj != null)
	//*  37   81:aload           10
	//*  38   83:ifnull          104
						flag2 = flag1 | ((Behavior) (obj)).a(this, view1, view, f1, f2, flag);
	//   39   86:iload           7
	//   40   88:aload           10
	//   41   90:aload_0         
	//   42   91:aload           9
	//   43   93:aload_1         
	//   44   94:fload_2         
	//   45   95:fload_3         
	//   46   96:iload           4
	//   47   98:invokevirtual   #1041 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, float, float, boolean)>
	//   48  101:ior             
	//   49  102:istore          8
				}
			}
			i1++;
	//   50  104:iload           5
	//   51  106:iconst_1        
	//   52  107:iadd            
	//   53  108:istore          5
		}

	//   54  110:iload           8
	//   55  112:istore          7
	//*  56  114:goto            12
		if(flag1)
	//*  57  117:iload           7
	//*  58  119:ifeq            127
			a(1);
	//   59  122:aload_0         
	//   60  123:iconst_1        
	//   61  124:invokevirtual   #783 <Method void a(int)>
		return flag1;
	//   62  127:iload           7
	//   63  129:ireturn         
	}

	public boolean onNestedPreFling(View view, float f1, float f2)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method int getChildCount()>
	//    2    4:istore          5
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		boolean flag;
		boolean flag1;
		for(flag = false; i1 < j1; flag = flag1)
	//*   5    9:iconst_0        
	//*   6   10:istore          6
	//*   7   12:iload           4
	//*   8   14:iload           5
	//*   9   16:icmpge          115
		{
			View view1 = getChildAt(i1);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #491 <Method View getChildAt(int)>
	//   13   25:astore          8
			if(view1.getVisibility() == 8)
	//*  14   27:aload           8
	//*  15   29:invokevirtual   #725 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag1 = flag;
	//   18   37:iload           6
	//   19   39:istore          7
			} else
	//*  20   41:goto            102
			{
				Object obj = ((Object) ((c)view1.getLayoutParams()));
	//   21   44:aload           8
	//   22   46:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #24  <Class CoordinatorLayout$c>
	//   24   52:astore          9
				if(!((c) (obj)).c(0))
	//*  25   54:aload           9
	//*  26   56:iconst_0        
	//*  27   57:invokevirtual   #778 <Method boolean CoordinatorLayout$c.c(int)>
	//*  28   60:ifne            70
				{
					flag1 = flag;
	//   29   63:iload           6
	//   30   65:istore          7
				} else
	//*  31   67:goto            102
				{
					obj = ((Object) (((c) (obj)).b()));
	//   32   70:aload           9
	//   33   72:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   34   75:astore          9
					flag1 = flag;
	//   35   77:iload           6
	//   36   79:istore          7
					if(obj != null)
	//*  37   81:aload           9
	//*  38   83:ifnull          102
						flag1 = flag | ((Behavior) (obj)).a(this, view1, view, f1, f2);
	//   39   86:iload           6
	//   40   88:aload           9
	//   41   90:aload_0         
	//   42   91:aload           8
	//   43   93:aload_1         
	//   44   94:fload_2         
	//   45   95:fload_3         
	//   46   96:invokevirtual   #1046 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, float, float)>
	//   47   99:ior             
	//   48  100:istore          7
				}
			}
			i1++;
	//   49  102:iload           4
	//   50  104:iconst_1        
	//   51  105:iadd            
	//   52  106:istore          4
		}

	//   53  108:iload           7
	//   54  110:istore          6
	//*  55  112:goto            12
		return flag;
	//   56  115:iload           6
	//   57  117:ireturn         
	}

	public void onNestedPreScroll(View view, int i1, int j1, int ai[])
	{
		a(view, i1, j1, ai, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #1050 <Method void a(View, int, int, int[], int)>
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
	{
		a(view, i1, j1, k1, l1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #1053 <Method void a(View, int, int, int, int, int)>
	//    8   12:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i1)
	{
		b(view, view1, i1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1056 <Method void b(View, View, int, int)>
	//    6    8:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #13  <Class CoordinatorLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1060 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #13  <Class CoordinatorLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1063 <Method Parcelable android.support.design.widget.CoordinatorLayout$SavedState.a()>
	//   13   23:invokespecial   #1060 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		parcelable = ((Parcelable) (((SavedState) (parcelable)).a));
	//   14   26:aload_1         
	//   15   27:getfield        #1066 <Field SparseArray android.support.design.widget.CoordinatorLayout$SavedState.a>
	//   16   30:astore_1        
		int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		for(int j1 = getChildCount(); i1 < j1; i1++)
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #484 <Method int getChildCount()>
	//*  21   37:istore_3        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          112
		{
			View view = getChildAt(i1);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #491 <Method View getChildAt(int)>
	//   28   48:astore          5
			int k1 = view.getId();
	//   29   50:aload           5
	//   30   52:invokevirtual   #1069 <Method int View.getId()>
	//   31   55:istore          4
			Behavior behavior = a(view).b();
	//   32   57:aload_0         
	//   33   58:aload           5
	//   34   60:invokevirtual   #613 <Method CoordinatorLayout$c a(View)>
	//   35   63:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   36   66:astore          6
			if(k1 == -1 || behavior == null)
				continue;
	//   37   68:iload           4
	//   38   70:iconst_m1       
	//   39   71:icmpeq          105
	//   40   74:aload           6
	//   41   76:ifnull          105
			Parcelable parcelable1 = (Parcelable)((SparseArray) (parcelable)).get(k1);
	//   42   79:aload_1         
	//   43   80:iload           4
	//   44   82:invokevirtual   #1072 <Method Object SparseArray.get(int)>
	//   45   85:checkcast       #1074 <Class Parcelable>
	//   46   88:astore          7
			if(parcelable1 != null)
	//*  47   90:aload           7
	//*  48   92:ifnull          105
				behavior.a(this, view, parcelable1);
	//   49   95:aload           6
	//   50   97:aload_0         
	//   51   98:aload           5
	//   52  100:aload           7
	//   53  102:invokevirtual   #1077 <Method void android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, Parcelable)>
		}

	//   54  105:iload_2         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_2        
	//*  58  109:goto            38
	//   59  112:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #13  <Class CoordinatorLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1080 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1082 <Method void CoordinatorLayout$SavedState(Parcelable)>
	//    5   11:astore          4
		SparseArray sparsearray = new SparseArray();
	//    6   13:new             #1071 <Class SparseArray>
	//    7   16:dup             
	//    8   17:invokespecial   #1083 <Method void SparseArray()>
	//    9   20:astore          5
		int j1 = getChildCount();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #484 <Method int getChildCount()>
	//   12   26:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          100
		{
			Object obj = ((Object) (getChildAt(i1)));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:invokevirtual   #491 <Method View getChildAt(int)>
	//   21   39:astore          6
			int k1 = ((View) (obj)).getId();
	//   22   41:aload           6
	//   23   43:invokevirtual   #1069 <Method int View.getId()>
	//   24   46:istore_3        
			Behavior behavior = ((c)((View) (obj)).getLayoutParams()).b();
	//   25   47:aload           6
	//   26   49:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #24  <Class CoordinatorLayout$c>
	//   28   55:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   29   58:astore          7
			if(k1 == -1 || behavior == null)
				continue;
	//   30   60:iload_3         
	//   31   61:iconst_m1       
	//   32   62:icmpeq          93
	//   33   65:aload           7
	//   34   67:ifnull          93
			obj = ((Object) (behavior.b(this, ((View) (obj)))));
	//   35   70:aload           7
	//   36   72:aload_0         
	//   37   73:aload           6
	//   38   75:invokevirtual   #1086 <Method Parcelable CoordinatorLayout$Behavior.b(CoordinatorLayout, View)>
	//   39   78:astore          6
			if(obj != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
				sparsearray.append(k1, obj);
	//   42   85:aload           5
	//   43   87:iload_3         
	//   44   88:aload           6
	//   45   90:invokevirtual   #1089 <Method void SparseArray.append(int, Object)>
		}

	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_1        
	//*  50   97:goto            29
		savedstate.a = sparsearray;
	//   51  100:aload           4
	//   52  102:aload           5
	//   53  104:putfield        #1066 <Field SparseArray android.support.design.widget.CoordinatorLayout$SavedState.a>
		return ((Parcelable) (savedstate));
	//   54  107:aload           4
	//   55  109:areturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i1)
	{
		return a(view, view1, i1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1093 <Method boolean a(View, View, int, int)>
	//    6    8:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		c(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1094 <Method void c(View, int)>
	//    4    6:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1;
		boolean flag;
		boolean flag3;
label0:
		{
			i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #508 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
			Object obj = ((Object) (p));
	//    3    5:aload_0         
	//    4    6:getfield        #533 <Field View p>
	//    5    9:astore          9
			boolean flag4 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
			boolean flag1;
			if(obj == null)
	//*   8   14:aload           9
	//*   9   16:ifnonnull       42
			{
				flag1 = a(motionevent, 1);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:iconst_1        
	//   13   22:invokespecial   #997 <Method boolean a(MotionEvent, int)>
	//   14   25:istore          4
				flag3 = flag1;
	//   15   27:iload           4
	//   16   29:istore          5
				flag = flag4;
	//   17   31:iload           6
	//   18   33:istore_3        
				if(!flag1)
	//*  19   34:iload           4
	//*  20   36:ifeq            88
					break label0;
	//   21   39:goto            45
			} else
			{
				flag1 = false;
	//   22   42:iconst_0        
	//   23   43:istore          4
			}
			obj = ((Object) (((c)p.getLayoutParams()).b()));
	//   24   45:aload_0         
	//   25   46:getfield        #533 <Field View p>
	//   26   49:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #24  <Class CoordinatorLayout$c>
	//   28   55:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   29   58:astore          9
			flag3 = flag1;
	//   30   60:iload           4
	//   31   62:istore          5
			flag = flag4;
	//   32   64:iload           6
	//   33   66:istore_3        
			if(obj != null)
	//*  34   67:aload           9
	//*  35   69:ifnull          88
			{
				flag = ((Behavior) (obj)).b(this, p, motionevent);
	//   36   72:aload           9
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:getfield        #533 <Field View p>
	//   40   79:aload_1         
	//   41   80:invokevirtual   #529 <Method boolean CoordinatorLayout$Behavior.b(CoordinatorLayout, View, MotionEvent)>
	//   42   83:istore_3        
				flag3 = flag1;
	//   43   84:iload           4
	//   44   86:istore          5
			}
		}
		View view = p;
	//   45   88:aload_0         
	//   46   89:getfield        #533 <Field View p>
	//   47   92:astore          10
		Object obj1 = null;
	//   48   94:aconst_null     
	//   49   95:astore          9
		boolean flag2;
		if(view == null)
	//*  50   97:aload           10
	//*  51   99:ifnonnull       117
		{
			flag2 = flag | super.onTouchEvent(motionevent);
	//   52  102:iload_3         
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:invokespecial   #1097 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   56  108:ior             
	//   57  109:istore          4
			motionevent = ((MotionEvent) (obj1));
	//   58  111:aload           9
	//   59  113:astore_1        
		} else
	//*  60  114:goto            154
		{
			flag2 = flag;
	//   61  117:iload_3         
	//   62  118:istore          4
			motionevent = ((MotionEvent) (obj1));
	//   63  120:aload           9
	//   64  122:astore_1        
			if(flag3)
	//*  65  123:iload           5
	//*  66  125:ifeq            154
			{
				long l1 = SystemClock.uptimeMillis();
	//   67  128:invokestatic    #522 <Method long SystemClock.uptimeMillis()>
	//   68  131:lstore          7
				motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//   69  133:lload           7
	//   70  135:lload           7
	//   71  137:iconst_3        
	//   72  138:fconst_0        
	//   73  139:fconst_0        
	//   74  140:iconst_0        
	//   75  141:invokestatic    #526 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   76  144:astore_1        
				super.onTouchEvent(motionevent);
	//   77  145:aload_0         
	//   78  146:aload_1         
	//   79  147:invokespecial   #1097 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   80  150:pop             
				flag2 = flag;
	//   81  151:iload_3         
	//   82  152:istore          4
			}
		}
		if(motionevent != null)
	//*  83  154:aload_1         
	//*  84  155:ifnull          162
			motionevent.recycle();
	//   85  158:aload_1         
	//   86  159:invokevirtual   #602 <Method void MotionEvent.recycle()>
		if(i1 == 1 || i1 == 3)
	//*  87  162:iload_2         
	//*  88  163:iconst_1        
	//*  89  164:icmpeq          172
	//*  90  167:iload_2         
	//*  91  168:iconst_3        
	//*  92  169:icmpne          176
			f();
	//   93  172:aload_0         
	//   94  173:invokespecial   #975 <Method void f()>
		return flag2;
	//   95  176:iload           4
	//   96  178:ireturn         
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		Behavior behavior = ((c)view.getLayoutParams()).b();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #407 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$c>
	//    3    7:invokevirtual   #410 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//    4   10:astore          4
		if(behavior != null && behavior.a(this, view, rect, flag))
	//*   5   12:aload           4
	//*   6   14:ifnull          31
	//*   7   17:aload           4
	//*   8   19:aload_0         
	//*   9   20:aload_1         
	//*  10   21:aload_2         
	//*  11   22:iload_3         
	//*  12   23:invokevirtual   #1102 <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.a(CoordinatorLayout, View, Rect, boolean)>
	//*  13   26:ifeq            31
			return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
		else
			return super.requestChildRectangleOnScreen(view, rect, flag);
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:invokespecial   #1104 <Method boolean ViewGroup.requestChildRectangleOnScreen(View, Rect, boolean)>
	//   21   38:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1107 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		if(flag && !m)
	//*   3    5:iload_1         
	//*   4    6:ifeq            25
	//*   5    9:aload_0         
	//*   6   10:getfield        #606 <Field boolean m>
	//*   7   13:ifne            25
		{
			f();
	//    8   16:aload_0         
	//    9   17:invokespecial   #975 <Method void f()>
			m = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #606 <Field boolean m>
		}
	//   13   25:return          
	}

	public void setFitsSystemWindows(boolean flag)
	{
		super.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1110 <Method void ViewGroup.setFitsSystemWindows(boolean)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #213 <Method void h()>
	//    5    9:return          
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		e = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1112 <Field android.view.ViewGroup$OnHierarchyChangeListener e>
	//    3    5:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		if(v != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field Drawable v>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       122
		{
			Drawable drawable2 = v;
	//    4    8:aload_0         
	//    5    9:getfield        #208 <Field Drawable v>
	//    6   12:astore          4
			Drawable drawable1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
			if(drawable2 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          29
				v.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #208 <Field Drawable v>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #1118 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          38
				drawable1 = drawable.mutate();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #1121 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
			v = drawable1;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #208 <Field Drawable v>
			if(v != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #208 <Field Drawable v>
	//*  25   47:ifnull          118
			{
				if(v.isStateful())
	//*  26   50:aload_0         
	//*  27   51:getfield        #208 <Field Drawable v>
	//*  28   54:invokevirtual   #934 <Method boolean Drawable.isStateful()>
	//*  29   57:ifeq            72
					v.setState(getDrawableState());
	//   30   60:aload_0         
	//   31   61:getfield        #208 <Field Drawable v>
	//   32   64:aload_0         
	//   33   65:invokevirtual   #929 <Method int[] getDrawableState()>
	//   34   68:invokevirtual   #938 <Method boolean Drawable.setState(int[])>
	//   35   71:pop             
				android.support.v4.a.a.a.b(v, android.support.v4.view.s.e(((View) (this))));
	//   36   72:aload_0         
	//   37   73:getfield        #208 <Field Drawable v>
	//   38   76:aload_0         
	//   39   77:invokestatic    #722 <Method int s.e(View)>
	//   40   80:invokestatic    #1126 <Method boolean android.support.v4.a.a.a.b(Drawable, int)>
	//   41   83:pop             
				drawable = v;
	//   42   84:aload_0         
	//   43   85:getfield        #208 <Field Drawable v>
	//   44   88:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #1127 <Method int getVisibility()>
	//*  47   93:ifne            101
					flag = true;
	//   48   96:iconst_1        
	//   49   97:istore_2        
				else
	//*  50   98:goto            103
					flag = false;
	//   51  101:iconst_0        
	//   52  102:istore_2        
				drawable.setVisible(flag, false);
	//   53  103:aload_1         
	//   54  104:iload_2         
	//   55  105:iconst_0        
	//   56  106:invokevirtual   #1131 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   57  109:pop             
				v.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   58  110:aload_0         
	//   59  111:getfield        #208 <Field Drawable v>
	//   60  114:aload_0         
	//   61  115:invokevirtual   #1118 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
			android.support.v4.view.s.c(((View) (this)));
	//   62  118:aload_0         
	//   63  119:invokestatic    #1133 <Method void s.c(View)>
		}
	//   64  122:return          
	}

	public void setStatusBarBackgroundColor(int i1)
	{
		setStatusBarBackground(((Drawable) (new ColorDrawable(i1))));
	//    0    0:aload_0         
	//    1    1:new             #1136 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1137 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #1139 <Method void setStatusBarBackground(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarBackgroundResource(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = android.support.v4.content.a.getDrawable(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #650 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1145 <Method Drawable android.support.v4.content.a.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setStatusBarBackground(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1139 <Method void setStatusBarBackground(Drawable)>
	//   13   23:return          
	}

	public void setVisibility(int i1)
	{
		super.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1148 <Method void ViewGroup.setVisibility(int)>
		boolean flag;
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(v != null && v.isVisible() != flag)
	//*  10   16:aload_0         
	//*  11   17:getfield        #208 <Field Drawable v>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #208 <Field Drawable v>
	//*  15   27:invokevirtual   #1151 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			v.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #208 <Field Drawable v>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #1131 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
	//   24   44:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == v;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1155 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #208 <Field Drawable v>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	static final String a;
	static final Class b[] = {
		android/content/Context, android/util/AttributeSet
	};
	static final ThreadLocal c = new ThreadLocal();
	static final Comparator d;
	private static final android.support.v4.f.k.a f = new android.support.v4.f.k.c(12);
	android.view.ViewGroup.OnHierarchyChangeListener e;
	private final List g;
	private final f h;
	private final List i;
	private final List j;
	private final int k[];
	private Paint l;
	private boolean m;
	private boolean n;
	private int o[];
	private View p;
	private View q;
	private d r;
	private boolean s;
	private aa t;
	private boolean u;
	private Drawable v;
	private o w;
	private final n x;

	static 
	{
		Object obj = ((Object) (((Class) (android/support/design/widget/CoordinatorLayout)).getPackage()));
	//    0    0:ldc1            #2   <Class CoordinatorLayout>
	//    1    2:invokevirtual   #81  <Method Package Class.getPackage()>
	//    2    5:astore_0        
		if(obj != null)
	//*   3    6:aload_0         
	//*   4    7:ifnull          18
			obj = ((Object) (((Package) (obj)).getName()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #87  <Method String Package.getName()>
	//    7   14:astore_0        
		else
	//*   8   15:goto            20
			obj = null;
	//    9   18:aconst_null     
	//   10   19:astore_0        
		a = ((String) (obj));
	//   11   20:aload_0         
	//   12   21:putstatic       #89  <Field String a>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   24:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   27:bipush          21
	//*  15   29:icmplt          45
			d = ((Comparator) (new e()));
	//   16   32:new             #30  <Class CoordinatorLayout$e>
	//   17   35:dup             
	//   18   36:invokespecial   #98  <Method void CoordinatorLayout$e()>
	//   19   39:putstatic       #100 <Field Comparator d>
		else
	//*  20   42:goto            49
			d = null;
	//   21   45:aconst_null     
	//   22   46:putstatic       #100 <Field Comparator d>
	//   23   49:iconst_2        
	//   24   50:anewarray       Class[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:ldc1            #102 <Class Context>
	//   28   57:aastore         
	//   29   58:dup             
	//   30   59:iconst_1        
	//   31   60:ldc1            #104 <Class AttributeSet>
	//   32   62:aastore         
	//   33   63:putstatic       #106 <Field Class[] b>
	//   34   66:new             #108 <Class ThreadLocal>
	//   35   69:dup             
	//   36   70:invokespecial   #109 <Method void ThreadLocal()>
	//   37   73:putstatic       #111 <Field ThreadLocal c>
	//   38   76:new             #113 <Class android.support.v4.f.k$c>
	//   39   79:dup             
	//   40   80:bipush          12
	//   41   82:invokespecial   #116 <Method void android.support.v4.f.k$c(int)>
	//   42   85:putstatic       #118 <Field android.support.v4.f.k$a f>
	//*  43   88:return          
	}
}
