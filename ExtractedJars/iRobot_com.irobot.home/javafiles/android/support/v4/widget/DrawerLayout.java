// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

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
import android.support.v4.a.a.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			p

public class DrawerLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int a;
		float b;
		boolean c;
		int d;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int a>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int a>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v4.widget.DrawerLayout.a)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #27  <Field int[] android.support.v4.widget.DrawerLayout.a>
		//   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			a = ((TypedArray) (context)).getInt(0, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:iconst_0        
		//   16   24:invokevirtual   #39  <Method int TypedArray.getInt(int, int)>
		//   17   27:putfield        #20  <Field int a>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #43  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #47  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int a>
			a = layoutparams.a;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #20  <Field int a>
		//    9   15:putfield        #20  <Field int a>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #50  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int a>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #47  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int a>
		//    6   10:return          
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
		//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #31  <Field int a>
		//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(b);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field int b>
		//   11   19:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(c);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #41  <Field int c>
		//   15   27:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(e);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #43  <Field int e>
		//   19   35:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(f);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #45  <Field int f>
		//   23   43:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		//   24   46:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #28  <Method DrawerLayout$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method DrawerLayout$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method DrawerLayout$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		int b;
		int c;
		int e;
		int f;

		static 
		{
		//    0    0:new             #9   <Class DrawerLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void DrawerLayout$SavedState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #31  <Field int a>
			a = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #37  <Method int Parcel.readInt()>
		//   10   16:putfield        #31  <Field int a>
			b = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #37  <Method int Parcel.readInt()>
		//   14   24:putfield        #39  <Field int b>
			c = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #37  <Method int Parcel.readInt()>
		//   18   32:putfield        #41  <Field int c>
			e = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #37  <Method int Parcel.readInt()>
		//   22   40:putfield        #43  <Field int e>
			f = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #37  <Method int Parcel.readInt()>
		//   26   48:putfield        #45  <Field int f>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #31  <Field int a>
		//    6   10:return          
		}
	}

	class a extends android.support.v4.view.a
	{

		private void a(android.support.v4.view.a.b b1, android.support.v4.view.a.b b2)
		{
			Rect rect = c;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Rect c>
		//    2    4:astore_3        
			b2.a(rect);
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #29  <Method void android.support.v4.view.a.b.a(Rect)>
			b1.b(rect);
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:invokevirtual   #32  <Method void android.support.v4.view.a.b.b(Rect)>
			b2.c(rect);
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #34  <Method void android.support.v4.view.a.b.c(Rect)>
			b1.d(rect);
		//   12   20:aload_1         
		//   13   21:aload_3         
		//   14   22:invokevirtual   #37  <Method void android.support.v4.view.a.b.d(Rect)>
			b1.e(b2.h());
		//   15   25:aload_1         
		//   16   26:aload_2         
		//   17   27:invokevirtual   #41  <Method boolean android.support.v4.view.a.b.h()>
		//   18   30:invokevirtual   #45  <Method void android.support.v4.view.a.b.e(boolean)>
			b1.a(b2.p());
		//   19   33:aload_1         
		//   20   34:aload_2         
		//   21   35:invokevirtual   #49  <Method CharSequence android.support.v4.view.a.b.p()>
		//   22   38:invokevirtual   #52  <Method void android.support.v4.view.a.b.a(CharSequence)>
			b1.b(b2.q());
		//   23   41:aload_1         
		//   24   42:aload_2         
		//   25   43:invokevirtual   #55  <Method CharSequence android.support.v4.view.a.b.q()>
		//   26   46:invokevirtual   #57  <Method void android.support.v4.view.a.b.b(CharSequence)>
			b1.d(b2.s());
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #60  <Method CharSequence android.support.v4.view.a.b.s()>
		//   30   54:invokevirtual   #62  <Method void android.support.v4.view.a.b.d(CharSequence)>
			b1.j(b2.m());
		//   31   57:aload_1         
		//   32   58:aload_2         
		//   33   59:invokevirtual   #65  <Method boolean android.support.v4.view.a.b.m()>
		//   34   62:invokevirtual   #68  <Method void android.support.v4.view.a.b.j(boolean)>
			b1.h(b2.k());
		//   35   65:aload_1         
		//   36   66:aload_2         
		//   37   67:invokevirtual   #71  <Method boolean android.support.v4.view.a.b.k()>
		//   38   70:invokevirtual   #73  <Method void android.support.v4.view.a.b.h(boolean)>
			b1.c(b2.f());
		//   39   73:aload_1         
		//   40   74:aload_2         
		//   41   75:invokevirtual   #76  <Method boolean android.support.v4.view.a.b.f()>
		//   42   78:invokevirtual   #78  <Method void android.support.v4.view.a.b.c(boolean)>
			b1.d(b2.g());
		//   43   81:aload_1         
		//   44   82:aload_2         
		//   45   83:invokevirtual   #81  <Method boolean android.support.v4.view.a.b.g()>
		//   46   86:invokevirtual   #83  <Method void android.support.v4.view.a.b.d(boolean)>
			b1.f(b2.i());
		//   47   89:aload_1         
		//   48   90:aload_2         
		//   49   91:invokevirtual   #86  <Method boolean android.support.v4.view.a.b.i()>
		//   50   94:invokevirtual   #88  <Method void android.support.v4.view.a.b.f(boolean)>
			b1.g(b2.j());
		//   51   97:aload_1         
		//   52   98:aload_2         
		//   53   99:invokevirtual   #90  <Method boolean android.support.v4.view.a.b.j()>
		//   54  102:invokevirtual   #92  <Method void android.support.v4.view.a.b.g(boolean)>
			b1.i(b2.l());
		//   55  105:aload_1         
		//   56  106:aload_2         
		//   57  107:invokevirtual   #95  <Method boolean android.support.v4.view.a.b.l()>
		//   58  110:invokevirtual   #97  <Method void android.support.v4.view.a.b.i(boolean)>
			b1.a(b2.b());
		//   59  113:aload_1         
		//   60  114:aload_2         
		//   61  115:invokevirtual   #100 <Method int android.support.v4.view.a.b.b()>
		//   62  118:invokevirtual   #103 <Method void android.support.v4.view.a.b.a(int)>
		//   63  121:return          
		}

		private void a(android.support.v4.view.a.b b1, ViewGroup viewgroup)
		{
			int j1 = viewgroup.getChildCount();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #109 <Method int ViewGroup.getChildCount()>
		//    2    4:istore          4
			for(int i1 = 0; i1 < j1; i1++)
		//*   3    6:iconst_0        
		//*   4    7:istore_3        
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          42
			{
				View view = viewgroup.getChildAt(i1);
		//    8   14:aload_2         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #113 <Method View ViewGroup.getChildAt(int)>
		//   11   19:astore          5
				if(DrawerLayout.l(view))
		//*  12   21:aload           5
		//*  13   23:invokestatic    #116 <Method boolean DrawerLayout.l(View)>
		//*  14   26:ifeq            35
					b1.b(view);
		//   15   29:aload_1         
		//   16   30:aload           5
		//   17   32:invokevirtual   #119 <Method void android.support.v4.view.a.b.b(View)>
			}

		//   18   35:iload_3         
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:istore_3        
		//*  22   39:goto            8
		//   23   42:return          
		}

		public void a(View view, android.support.v4.view.a.b b1)
		{
			if(DrawerLayout.b)
		//*   0    0:getstatic       #123 <Field boolean DrawerLayout.b>
		//*   1    3:ifeq            15
			{
				super.a(view, b1);
		//    2    6:aload_0         
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokespecial   #125 <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			} else
		//*   6   12:goto            73
			{
				android.support.v4.view.a.b b2 = android.support.v4.view.a.b.a(b1);
		//    7   15:aload_2         
		//    8   16:invokestatic    #128 <Method android.support.v4.view.a.b android.support.v4.view.a.b.a(android.support.v4.view.a.b)>
		//    9   19:astore_3        
				super.a(view, b2);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_3         
		//   13   23:invokespecial   #125 <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
				b1.a(view);
		//   14   26:aload_2         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #130 <Method void android.support.v4.view.a.b.a(View)>
				android.view.ViewParent viewparent = android.support.v4.view.s.f(view);
		//   17   31:aload_1         
		//   18   32:invokestatic    #135 <Method android.view.ViewParent s.f(View)>
		//   19   35:astore          4
				if(viewparent instanceof View)
		//*  20   37:aload           4
		//*  21   39:instanceof      #137 <Class View>
		//*  22   42:ifeq            54
					b1.c((View)viewparent);
		//   23   45:aload_2         
		//   24   46:aload           4
		//   25   48:checkcast       #137 <Class View>
		//   26   51:invokevirtual   #139 <Method void android.support.v4.view.a.b.c(View)>
				a(b1, b2);
		//   27   54:aload_0         
		//   28   55:aload_2         
		//   29   56:aload_3         
		//   30   57:invokespecial   #141 <Method void a(android.support.v4.view.a.b, android.support.v4.view.a.b)>
				b2.t();
		//   31   60:aload_3         
		//   32   61:invokevirtual   #144 <Method void android.support.v4.view.a.b.t()>
				a(b1, (ViewGroup)view);
		//   33   64:aload_0         
		//   34   65:aload_2         
		//   35   66:aload_1         
		//   36   67:checkcast       #106 <Class ViewGroup>
		//   37   70:invokespecial   #146 <Method void a(android.support.v4.view.a.b, ViewGroup)>
			}
			b1.b(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
		//   38   73:aload_2         
		//   39   74:ldc1            #6   <Class DrawerLayout>
		//   40   76:invokevirtual   #152 <Method String Class.getName()>
		//   41   79:invokevirtual   #57  <Method void android.support.v4.view.a.b.b(CharSequence)>
			b1.c(false);
		//   42   82:aload_2         
		//   43   83:iconst_0        
		//   44   84:invokevirtual   #78  <Method void android.support.v4.view.a.b.c(boolean)>
			b1.d(false);
		//   45   87:aload_2         
		//   46   88:iconst_0        
		//   47   89:invokevirtual   #83  <Method void android.support.v4.view.a.b.d(boolean)>
			b1.a(android.support.v4.view.a.b.a.a);
		//   48   92:aload_2         
		//   49   93:getstatic       #157 <Field android.support.v4.view.a.b$a android.support.v4.view.a.b$a.a>
		//   50   96:invokevirtual   #160 <Method boolean android.support.v4.view.a.b.a(android.support.v4.view.a.b$a)>
		//   51   99:pop             
			b1.a(android.support.v4.view.a.b.a.b);
		//   52  100:aload_2         
		//   53  101:getstatic       #162 <Field android.support.v4.view.a.b$a android.support.v4.view.a.b$a.b>
		//   54  104:invokevirtual   #160 <Method boolean android.support.v4.view.a.b.a(android.support.v4.view.a.b$a)>
		//   55  107:pop             
		//   56  108:return          
		}

		public void a(View view, AccessibilityEvent accessibilityevent)
		{
			super.a(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #165 <Method void android.support.v4.view.a.a(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class DrawerLayout>
		//    6    9:invokevirtual   #152 <Method String Class.getName()>
		//    7   12:invokevirtual   #170 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
		{
			if(!DrawerLayout.b && !DrawerLayout.l(view))
		//*   0    0:getstatic       #123 <Field boolean DrawerLayout.b>
		//*   1    3:ifne            18
		//*   2    6:aload_2         
		//*   3    7:invokestatic    #116 <Method boolean DrawerLayout.l(View)>
		//*   4   10:ifeq            16
		//*   5   13:goto            18
				return false;
		//    6   16:iconst_0        
		//    7   17:ireturn         
			else
				return super.a(viewgroup, view, accessibilityevent);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:invokespecial   #173 <Method boolean android.support.v4.view.a.a(ViewGroup, View, AccessibilityEvent)>
		//   13   25:ireturn         
		}

		public boolean d(View view, AccessibilityEvent accessibilityevent)
		{
			if(accessibilityevent.getEventType() == 32)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #177 <Method int AccessibilityEvent.getEventType()>
		//*   2    4:bipush          32
		//*   3    6:icmpne          58
			{
				view = ((View) (accessibilityevent.getText()));
		//    4    9:aload_2         
		//    5   10:invokevirtual   #181 <Method List AccessibilityEvent.getText()>
		//    6   13:astore_1        
				accessibilityevent = ((AccessibilityEvent) (a.c()));
		//    7   14:aload_0         
		//    8   15:getfield        #14  <Field DrawerLayout a>
		//    9   18:invokevirtual   #184 <Method View DrawerLayout.c()>
		//   10   21:astore_2        
				if(accessibilityevent != null)
		//*  11   22:aload_2         
		//*  12   23:ifnull          56
				{
					int i1 = a.e(((View) (accessibilityevent)));
		//   13   26:aload_0         
		//   14   27:getfield        #14  <Field DrawerLayout a>
		//   15   30:aload_2         
		//   16   31:invokevirtual   #187 <Method int DrawerLayout.e(View)>
		//   17   34:istore_3        
					accessibilityevent = ((AccessibilityEvent) (a.b(i1)));
		//   18   35:aload_0         
		//   19   36:getfield        #14  <Field DrawerLayout a>
		//   20   39:iload_3         
		//   21   40:invokevirtual   #190 <Method CharSequence DrawerLayout.b(int)>
		//   22   43:astore_2        
					if(accessibilityevent != null)
		//*  23   44:aload_2         
		//*  24   45:ifnull          56
						((List) (view)).add(((Object) (accessibilityevent)));
		//   25   48:aload_1         
		//   26   49:aload_2         
		//   27   50:invokeinterface #196 <Method boolean List.add(Object)>
		//   28   55:pop             
				}
				return true;
		//   29   56:iconst_1        
		//   30   57:ireturn         
			} else
			{
				return super.d(view, accessibilityevent);
		//   31   58:aload_0         
		//   32   59:aload_1         
		//   33   60:aload_2         
		//   34   61:invokespecial   #198 <Method boolean android.support.v4.view.a.d(View, AccessibilityEvent)>
		//   35   64:ireturn         
			}
		}

		final DrawerLayout a;
		private final Rect c = new Rect();

		a()
		{
			a = DrawerLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field DrawerLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void android.support.v4.view.a()>
		//    5    9:aload_0         
		//    6   10:new             #19  <Class Rect>
		//    7   13:dup             
		//    8   14:invokespecial   #20  <Method void Rect()>
		//    9   17:putfield        #22  <Field Rect c>
		//   10   20:return          
		}
	}

	static final class b extends android.support.v4.view.a
	{

		public void a(View view, android.support.v4.view.a.b b1)
		{
			super.a(view, b1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			if(!DrawerLayout.l(view))
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #20  <Method boolean DrawerLayout.l(View)>
		//*   6   10:ifne            18
				b1.c(((View) (null)));
		//    7   13:aload_2         
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #26  <Method void android.support.v4.view.a.b.c(View)>
		//   10   18:return          
		}

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.view.a()>
		//    2    4:return          
		}
	}

	public static interface c
	{

		public abstract void onDrawerClosed(View view);

		public abstract void onDrawerOpened(View view);

		public abstract void onDrawerSlide(View view, float f1);

		public abstract void onDrawerStateChanged(int i1);
	}

	private class d extends p.a
	{

		private void c()
		{
			int i1 = b;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int b>
		//    2    4:istore_2        
			byte byte0 = 3;
		//    3    5:iconst_3        
		//    4    6:istore_1        
			if(i1 == 3)
		//*   5    7:iload_2         
		//*   6    8:iconst_3        
		//*   7    9:icmpne          14
				byte0 = 5;
		//    8   12:iconst_5        
		//    9   13:istore_1        
			View view = a.c(((int) (byte0)));
		//   10   14:aload_0         
		//   11   15:getfield        #20  <Field DrawerLayout a>
		//   12   18:iload_1         
		//   13   19:invokevirtual   #34  <Method View DrawerLayout.c(int)>
		//   14   22:astore_3        
			if(view != null)
		//*  15   23:aload_3         
		//*  16   24:ifnull          35
				a.i(view);
		//   17   27:aload_0         
		//   18   28:getfield        #20  <Field DrawerLayout a>
		//   19   31:aload_3         
		//   20   32:invokevirtual   #38  <Method void DrawerLayout.i(View)>
		//   21   35:return          
		}

		public int a(View view, int i1, int j1)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public void a()
		{
			a.removeCallbacks(d);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field DrawerLayout a>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Runnable d>
		//    4    8:invokevirtual   #49  <Method boolean DrawerLayout.removeCallbacks(Runnable)>
		//    5   11:pop             
		//    6   12:return          
		}

		public void a(int i1)
		{
			a.a(b, i1, c.c());
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field DrawerLayout a>
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field int b>
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #52  <Field p c>
		//    7   13:invokevirtual   #57  <Method View p.c()>
		//    8   16:invokevirtual   #60  <Method void android.support.v4.widget.DrawerLayout.a(int, int, View)>
		//    9   19:return          
		}

		public void a(int i1, int j1)
		{
			a.postDelayed(d, 160L);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field DrawerLayout a>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Runnable d>
		//    4    8:ldc2w           #62  <Long 160L>
		//    5   11:invokevirtual   #67  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
		//    6   14:pop             
		//    7   15:return          
		}

		public void a(p p1)
		{
			c = p1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field p c>
		//    3    5:return          
		}

		public void a(View view, float f1, float f2)
		{
			int i1;
label0:
			{
				f2 = a.d(view);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field DrawerLayout a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #72  <Method float android.support.v4.widget.DrawerLayout.d(View)>
		//    4    8:fstore_3        
				int k1 = view.getWidth();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #75  <Method int View.getWidth()>
		//    7   13:istore          6
				if(a.a(view, 3))
		//*   8   15:aload_0         
		//*   9   16:getfield        #20  <Field DrawerLayout a>
		//*  10   19:aload_1         
		//*  11   20:iconst_3        
		//*  12   21:invokevirtual   #78  <Method boolean android.support.v4.widget.DrawerLayout.a(View, int)>
		//*  13   24:ifeq            66
				{
					i1 = f1 != 0.0F;
		//   14   27:fload_2         
		//   15   28:fconst_0        
		//   16   29:fcmpl           
		//   17   30:istore          4
					if(i1 <= 0 && (i1 != 0 || f2 <= 0.5F))
		//*  18   32:iload           4
		//*  19   34:ifgt            60
		//*  20   37:iload           4
		//*  21   39:ifne            52
		//*  22   42:fload_3         
		//*  23   43:ldc1            #79  <Float 0.5F>
		//*  24   45:fcmpl           
		//*  25   46:ifle            52
		//*  26   49:goto            60
						i1 = -k1;
		//   27   52:iload           6
		//   28   54:ineg            
		//   29   55:istore          4
					else
		//*  30   57:goto            109
						i1 = 0;
		//   31   60:iconst_0        
		//   32   61:istore          4
					break label0;
		//   33   63:goto            109
				}
				int j1 = a.getWidth();
		//   34   66:aload_0         
		//   35   67:getfield        #20  <Field DrawerLayout a>
		//   36   70:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
		//   37   73:istore          5
				if(f1 >= 0.0F)
		//*  38   75:fload_2         
		//*  39   76:fconst_0        
		//*  40   77:fcmpg           
		//*  41   78:iflt            102
				{
					i1 = j1;
		//   42   81:iload           5
		//   43   83:istore          4
					if(f1 != 0.0F)
						break label0;
		//   44   85:fload_2         
		//   45   86:fconst_0        
		//   46   87:fcmpl           
		//   47   88:ifne            109
					i1 = j1;
		//   48   91:iload           5
		//   49   93:istore          4
					if(f2 <= 0.5F)
						break label0;
		//   50   95:fload_3         
		//   51   96:ldc1            #79  <Float 0.5F>
		//   52   98:fcmpl           
		//   53   99:ifle            109
				}
				i1 = j1 - k1;
		//   54  102:iload           5
		//   55  104:iload           6
		//   56  106:isub            
		//   57  107:istore          4
			}
			c.a(i1, view.getTop());
		//   58  109:aload_0         
		//   59  110:getfield        #52  <Field p c>
		//   60  113:iload           4
		//   61  115:aload_1         
		//   62  116:invokevirtual   #45  <Method int View.getTop()>
		//   63  119:invokevirtual   #83  <Method boolean android.support.v4.widget.p.a(int, int)>
		//   64  122:pop             
			a.invalidate();
		//   65  123:aload_0         
		//   66  124:getfield        #20  <Field DrawerLayout a>
		//   67  127:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
		//   68  130:return          
		}

		public void a(View view, int i1, int j1, int k1, int l1)
		{
			j1 = view.getWidth();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #75  <Method int View.getWidth()>
		//    2    4:istore_3        
			float f1;
			if(a.a(view, 3))
		//*   3    5:aload_0         
		//*   4    6:getfield        #20  <Field DrawerLayout a>
		//*   5    9:aload_1         
		//*   6   10:iconst_3        
		//*   7   11:invokevirtual   #78  <Method boolean android.support.v4.widget.DrawerLayout.a(View, int)>
		//*   8   14:ifeq            33
				f1 = i1 + j1;
		//    9   17:iload_2         
		//   10   18:iload_3         
		//   11   19:iadd            
		//   12   20:i2f             
		//   13   21:fstore          6
			else
		//*  14   23:fload           6
		//*  15   25:iload_3         
		//*  16   26:i2f             
		//*  17   27:fdiv            
		//*  18   28:fstore          6
		//*  19   30:goto            48
				f1 = a.getWidth() - i1;
		//   20   33:aload_0         
		//   21   34:getfield        #20  <Field DrawerLayout a>
		//   22   37:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
		//   23   40:iload_2         
		//   24   41:isub            
		//   25   42:i2f             
		//   26   43:fstore          6
			f1 /= j1;
		//*  27   45:goto            23
			a.b(view, f1);
		//   28   48:aload_0         
		//   29   49:getfield        #20  <Field DrawerLayout a>
		//   30   52:aload_1         
		//   31   53:fload           6
		//   32   55:invokevirtual   #90  <Method void DrawerLayout.b(View, float)>
			if(f1 == 0.0F)
		//*  33   58:fload           6
		//*  34   60:fconst_0        
		//*  35   61:fcmpl           
		//*  36   62:ifne            70
				i1 = 4;
		//   37   65:iconst_4        
		//   38   66:istore_2        
			else
		//*  39   67:goto            72
				i1 = 0;
		//   40   70:iconst_0        
		//   41   71:istore_2        
			view.setVisibility(i1);
		//   42   72:aload_1         
		//   43   73:iload_2         
		//   44   74:invokevirtual   #93  <Method void View.setVisibility(int)>
			a.invalidate();
		//   45   77:aload_0         
		//   46   78:getfield        #20  <Field DrawerLayout a>
		//   47   81:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
		//   48   84:return          
		}

		public boolean a(View view, int i1)
		{
			return a.g(view) && a.a(view, b) && a.a(view) == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field DrawerLayout a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #97  <Method boolean DrawerLayout.g(View)>
		//    4    8:ifeq            39
		//    5   11:aload_0         
		//    6   12:getfield        #20  <Field DrawerLayout a>
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #30  <Field int b>
		//   10   20:invokevirtual   #78  <Method boolean android.support.v4.widget.DrawerLayout.a(View, int)>
		//   11   23:ifeq            39
		//   12   26:aload_0         
		//   13   27:getfield        #20  <Field DrawerLayout a>
		//   14   30:aload_1         
		//   15   31:invokevirtual   #100 <Method int android.support.v4.widget.DrawerLayout.a(View)>
		//   16   34:ifne            39
		//   17   37:iconst_1        
		//   18   38:ireturn         
		//   19   39:iconst_0        
		//   20   40:ireturn         
		}

		public int b(View view)
		{
			if(a.g(view))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field DrawerLayout a>
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #97  <Method boolean DrawerLayout.g(View)>
		//*   4    8:ifeq            16
				return view.getWidth();
		//    5   11:aload_1         
		//    6   12:invokevirtual   #75  <Method int View.getWidth()>
		//    7   15:ireturn         
			else
				return 0;
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public int b(View view, int i1, int j1)
		{
			int k1;
			if(a.a(view, 3))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field DrawerLayout a>
		//*   2    4:aload_1         
		//*   3    5:iconst_3        
		//*   4    6:invokevirtual   #78  <Method boolean android.support.v4.widget.DrawerLayout.a(View, int)>
		//*   5    9:ifeq            32
			{
				j1 = -view.getWidth();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #75  <Method int View.getWidth()>
		//    8   16:ineg            
		//    9   17:istore_3        
				k1 = 0;
		//   10   18:iconst_0        
		//   11   19:istore          4
			} else
		//*  12   21:iload_3         
		//*  13   22:iload_2         
		//*  14   23:iload           4
		//*  15   25:invokestatic    #106 <Method int Math.min(int, int)>
		//*  16   28:invokestatic    #109 <Method int Math.max(int, int)>
		//*  17   31:ireturn         
			{
				k1 = a.getWidth();
		//   18   32:aload_0         
		//   19   33:getfield        #20  <Field DrawerLayout a>
		//   20   36:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
		//   21   39:istore          4
				j1 = k1 - view.getWidth();
		//   22   41:iload           4
		//   23   43:aload_1         
		//   24   44:invokevirtual   #75  <Method int View.getWidth()>
		//   25   47:isub            
		//   26   48:istore_3        
			}
			return Math.max(j1, Math.min(i1, k1));
		//*  27   49:goto            21
		}

		void b()
		{
			int k1 = c.b();
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field p c>
		//    2    4:invokevirtual   #111 <Method int p.b()>
		//    3    7:istore_3        
			int i1 = b;
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field int b>
		//    6   12:istore_1        
			int j1 = 0;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			boolean flag;
			if(i1 == 3)
		//*   9   15:iload_1         
		//*  10   16:iconst_3        
		//*  11   17:icmpne          25
				flag = true;
		//   12   20:iconst_1        
		//   13   21:istore_1        
			else
		//*  14   22:goto            27
				flag = false;
		//   15   25:iconst_0        
		//   16   26:istore_1        
			View view;
			if(flag)
		//*  17   27:iload_1         
		//*  18   28:ifeq            60
			{
				view = a.c(3);
		//   19   31:aload_0         
		//   20   32:getfield        #20  <Field DrawerLayout a>
		//   21   35:iconst_3        
		//   22   36:invokevirtual   #34  <Method View DrawerLayout.c(int)>
		//   23   39:astore          4
				if(view != null)
		//*  24   41:aload           4
		//*  25   43:ifnull          53
					j1 = -view.getWidth();
		//   26   46:aload           4
		//   27   48:invokevirtual   #75  <Method int View.getWidth()>
		//   28   51:ineg            
		//   29   52:istore_2        
				j1 += k1;
		//   30   53:iload_2         
		//   31   54:iload_3         
		//   32   55:iadd            
		//   33   56:istore_2        
			} else
		//*  34   57:goto            80
			{
				view = a.c(5);
		//   35   60:aload_0         
		//   36   61:getfield        #20  <Field DrawerLayout a>
		//   37   64:iconst_5        
		//   38   65:invokevirtual   #34  <Method View DrawerLayout.c(int)>
		//   39   68:astore          4
				j1 = a.getWidth() - k1;
		//   40   70:aload_0         
		//   41   71:getfield        #20  <Field DrawerLayout a>
		//   42   74:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
		//   43   77:iload_3         
		//   44   78:isub            
		//   45   79:istore_2        
			}
			if(view != null && (flag && view.getLeft() < j1 || !flag && view.getLeft() > j1) && a.a(view) == 0)
		//*  46   80:aload           4
		//*  47   82:ifnull          173
		//*  48   85:iload_1         
		//*  49   86:ifeq            98
		//*  50   89:aload           4
		//*  51   91:invokevirtual   #114 <Method int View.getLeft()>
		//*  52   94:iload_2         
		//*  53   95:icmplt          111
		//*  54   98:iload_1         
		//*  55   99:ifne            173
		//*  56  102:aload           4
		//*  57  104:invokevirtual   #114 <Method int View.getLeft()>
		//*  58  107:iload_2         
		//*  59  108:icmple          173
		//*  60  111:aload_0         
		//*  61  112:getfield        #20  <Field DrawerLayout a>
		//*  62  115:aload           4
		//*  63  117:invokevirtual   #100 <Method int android.support.v4.widget.DrawerLayout.a(View)>
		//*  64  120:ifne            173
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   65  123:aload           4
		//   66  125:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   67  128:checkcast       #120 <Class DrawerLayout$LayoutParams>
		//   68  131:astore          5
				c.a(view, j1, view.getTop());
		//   69  133:aload_0         
		//   70  134:getfield        #52  <Field p c>
		//   71  137:aload           4
		//   72  139:iload_2         
		//   73  140:aload           4
		//   74  142:invokevirtual   #45  <Method int View.getTop()>
		//   75  145:invokevirtual   #123 <Method boolean android.support.v4.widget.p.a(View, int, int)>
		//   76  148:pop             
				layoutparams.c = true;
		//   77  149:aload           5
		//   78  151:iconst_1        
		//   79  152:putfield        #126 <Field boolean DrawerLayout$LayoutParams.c>
				a.invalidate();
		//   80  155:aload_0         
		//   81  156:getfield        #20  <Field DrawerLayout a>
		//   82  159:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
				c();
		//   83  162:aload_0         
		//   84  163:invokespecial   #128 <Method void c()>
				a.d();
		//   85  166:aload_0         
		//   86  167:getfield        #20  <Field DrawerLayout a>
		//   87  170:invokevirtual   #130 <Method void android.support.v4.widget.DrawerLayout.d()>
			}
		//   88  173:return          
		}

		public void b(int i1, int j1)
		{
			Object obj;
			if((i1 & 1) == 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:iand            
		//*   3    3:iconst_1        
		//*   4    4:icmpne          23
			{
				obj = ((Object) (a));
		//    5    7:aload_0         
		//    6    8:getfield        #20  <Field DrawerLayout a>
		//    7   11:astore_3        
				i1 = 3;
		//    8   12:iconst_3        
		//    9   13:istore_1        
			} else
		//*  10   14:aload_3         
		//*  11   15:iload_1         
		//*  12   16:invokevirtual   #34  <Method View DrawerLayout.c(int)>
		//*  13   19:astore_3        
		//*  14   20:goto            33
			{
				obj = ((Object) (a));
		//   15   23:aload_0         
		//   16   24:getfield        #20  <Field DrawerLayout a>
		//   17   27:astore_3        
				i1 = 5;
		//   18   28:iconst_5        
		//   19   29:istore_1        
			}
			obj = ((Object) (((DrawerLayout) (obj)).c(i1)));
		//*  20   30:goto            14
			if(obj != null && a.a(((View) (obj))) == 0)
		//*  21   33:aload_3         
		//*  22   34:ifnull          57
		//*  23   37:aload_0         
		//*  24   38:getfield        #20  <Field DrawerLayout a>
		//*  25   41:aload_3         
		//*  26   42:invokevirtual   #100 <Method int android.support.v4.widget.DrawerLayout.a(View)>
		//*  27   45:ifne            57
				c.a(((View) (obj)), j1);
		//   28   48:aload_0         
		//   29   49:getfield        #52  <Field p c>
		//   30   52:aload_3         
		//   31   53:iload_2         
		//   32   54:invokevirtual   #133 <Method void android.support.v4.widget.p.a(View, int)>
		//   33   57:return          
		}

		public void b(View view, int i1)
		{
			((LayoutParams)view.getLayoutParams()).c = false;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #120 <Class DrawerLayout$LayoutParams>
		//    3    7:iconst_0        
		//    4    8:putfield        #126 <Field boolean DrawerLayout$LayoutParams.c>
			c();
		//    5   11:aload_0         
		//    6   12:invokespecial   #128 <Method void c()>
		//    7   15:return          
		}

		public boolean b(int i1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		final DrawerLayout a;
		private final int b;
		private p c;
		private final Runnable d = new _cls1(this);

		d(int i1)
		{
			a = DrawerLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field DrawerLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void p$a()>
		//    5    9:aload_0         
		//    6   10:new             #9   <Class DrawerLayout$d$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #26  <Method void DrawerLayout$d$1(DrawerLayout$d)>
		//   10   18:putfield        #28  <Field Runnable d>
			b = i1;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #30  <Field int b>
		//   14   26:return          
		}
	}


	public DrawerLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #100 <Method void DrawerLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #103 <Method void DrawerLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset, int i1)
	{
		float f1;
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #104 <Method void ViewGroup(Context, AttributeSet, int)>
		e = new b();
	//    5    7:aload_0         
	//    6    8:new             #19  <Class DrawerLayout$b>
	//    7   11:dup             
	//    8   12:invokespecial   #106 <Method void DrawerLayout$b()>
	//    9   15:putfield        #108 <Field DrawerLayout$b e>
		h = 0x99000000;
	//   10   18:aload_0         
	//   11   19:ldc1            #109 <Int 0x99000000>
	//   12   21:putfield        #111 <Field int h>
		j = new Paint();
	//   13   24:aload_0         
	//   14   25:new             #113 <Class Paint>
	//   15   28:dup             
	//   16   29:invokespecial   #114 <Method void Paint()>
	//   17   32:putfield        #116 <Field Paint j>
		q = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #118 <Field boolean q>
		r = 3;
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:putfield        #120 <Field int r>
		s = 3;
	//   24   45:aload_0         
	//   25   46:iconst_3        
	//   26   47:putfield        #122 <Field int s>
		t = 3;
	//   27   50:aload_0         
	//   28   51:iconst_3        
	//   29   52:putfield        #124 <Field int t>
		u = 3;
	//   30   55:aload_0         
	//   31   56:iconst_3        
	//   32   57:putfield        #126 <Field int u>
		I = null;
	//   33   60:aload_0         
	//   34   61:aconst_null     
	//   35   62:putfield        #128 <Field Drawable I>
		J = null;
	//   36   65:aload_0         
	//   37   66:aconst_null     
	//   38   67:putfield        #130 <Field Drawable J>
		K = null;
	//   39   70:aload_0         
	//   40   71:aconst_null     
	//   41   72:putfield        #132 <Field Drawable K>
		L = null;
	//   42   75:aload_0         
	//   43   76:aconst_null     
	//   44   77:putfield        #134 <Field Drawable L>
		setDescendantFocusability(0x40000);
	//   45   80:aload_0         
	//   46   81:ldc1            #135 <Int 0x40000>
	//   47   83:invokevirtual   #139 <Method void setDescendantFocusability(int)>
		f1 = getResources().getDisplayMetrics().density;
	//   48   86:aload_0         
	//   49   87:invokevirtual   #143 <Method Resources getResources()>
	//   50   90:invokevirtual   #149 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   51   93:getfield        #154 <Field float DisplayMetrics.density>
	//   52   96:fstore          4
		g = (int)(64F * f1 + 0.5F);
	//   53   98:aload_0         
	//   54   99:ldc1            #155 <Float 64F>
	//   55  101:fload           4
	//   56  103:fmul            
	//   57  104:ldc1            #156 <Float 0.5F>
	//   58  106:fadd            
	//   59  107:f2i             
	//   60  108:putfield        #158 <Field int g>
		float f2 = 400F * f1;
	//   61  111:ldc1            #159 <Float 400F>
	//   62  113:fload           4
	//   63  115:fmul            
	//   64  116:fstore          5
		m = new d(3);
	//   65  118:aload_0         
	//   66  119:new             #25  <Class DrawerLayout$d>
	//   67  122:dup             
	//   68  123:aload_0         
	//   69  124:iconst_3        
	//   70  125:invokespecial   #162 <Method void DrawerLayout$d(DrawerLayout, int)>
	//   71  128:putfield        #164 <Field DrawerLayout$d m>
		n = new d(5);
	//   72  131:aload_0         
	//   73  132:new             #25  <Class DrawerLayout$d>
	//   74  135:dup             
	//   75  136:aload_0         
	//   76  137:iconst_5        
	//   77  138:invokespecial   #162 <Method void DrawerLayout$d(DrawerLayout, int)>
	//   78  141:putfield        #166 <Field DrawerLayout$d n>
		k = android.support.v4.widget.p.a(((ViewGroup) (this)), 1.0F, ((p.a) (m)));
	//   79  144:aload_0         
	//   80  145:aload_0         
	//   81  146:fconst_1        
	//   82  147:aload_0         
	//   83  148:getfield        #164 <Field DrawerLayout$d m>
	//   84  151:invokestatic    #171 <Method p android.support.v4.widget.p.a(ViewGroup, float, p$a)>
	//   85  154:putfield        #173 <Field p k>
		k.a(1);
	//   86  157:aload_0         
	//   87  158:getfield        #173 <Field p k>
	//   88  161:iconst_1        
	//   89  162:invokevirtual   #175 <Method void android.support.v4.widget.p.a(int)>
		k.a(f2);
	//   90  165:aload_0         
	//   91  166:getfield        #173 <Field p k>
	//   92  169:fload           5
	//   93  171:invokevirtual   #178 <Method void android.support.v4.widget.p.a(float)>
		m.a(k);
	//   94  174:aload_0         
	//   95  175:getfield        #164 <Field DrawerLayout$d m>
	//   96  178:aload_0         
	//   97  179:getfield        #173 <Field p k>
	//   98  182:invokevirtual   #181 <Method void android.support.v4.widget.DrawerLayout$d.a(p)>
		l = android.support.v4.widget.p.a(((ViewGroup) (this)), 1.0F, ((p.a) (n)));
	//   99  185:aload_0         
	//  100  186:aload_0         
	//  101  187:fconst_1        
	//  102  188:aload_0         
	//  103  189:getfield        #166 <Field DrawerLayout$d n>
	//  104  192:invokestatic    #171 <Method p android.support.v4.widget.p.a(ViewGroup, float, p$a)>
	//  105  195:putfield        #183 <Field p l>
		l.a(2);
	//  106  198:aload_0         
	//  107  199:getfield        #183 <Field p l>
	//  108  202:iconst_2        
	//  109  203:invokevirtual   #175 <Method void android.support.v4.widget.p.a(int)>
		l.a(f2);
	//  110  206:aload_0         
	//  111  207:getfield        #183 <Field p l>
	//  112  210:fload           5
	//  113  212:invokevirtual   #178 <Method void android.support.v4.widget.p.a(float)>
		n.a(l);
	//  114  215:aload_0         
	//  115  216:getfield        #166 <Field DrawerLayout$d n>
	//  116  219:aload_0         
	//  117  220:getfield        #183 <Field p l>
	//  118  223:invokevirtual   #181 <Method void android.support.v4.widget.DrawerLayout$d.a(p)>
		setFocusableInTouchMode(true);
	//  119  226:aload_0         
	//  120  227:iconst_1        
	//  121  228:invokevirtual   #187 <Method void setFocusableInTouchMode(boolean)>
		android.support.v4.view.s.a(((View) (this)), 1);
	//  122  231:aload_0         
	//  123  232:iconst_1        
	//  124  233:invokestatic    #192 <Method void s.a(View, int)>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (new a())));
	//  125  236:aload_0         
	//  126  237:new             #16  <Class DrawerLayout$a>
	//  127  240:dup             
	//  128  241:aload_0         
	//  129  242:invokespecial   #195 <Method void DrawerLayout$a(DrawerLayout)>
	//  130  245:invokestatic    #198 <Method void s.a(View, android.support.v4.view.a)>
		android.support.v4.view.u.a(((ViewGroup) (this)), false);
	//  131  248:aload_0         
	//  132  249:iconst_0        
	//  133  250:invokestatic    #203 <Method void u.a(ViewGroup, boolean)>
		if(!android.support.v4.view.s.q(((View) (this))))
			break MISSING_BLOCK_LABEL_323;
	//  134  253:aload_0         
	//  135  254:invokestatic    #206 <Method boolean s.q(View)>
	//  136  257:ifeq            323
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_318;
	//  137  260:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//  138  263:bipush          21
	//  139  265:icmplt          318
		setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

			public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
			{
				view = ((View) ((DrawerLayout)view));
			//    0    0:aload_1         
			//    1    1:checkcast       #8   <Class DrawerLayout>
			//    2    4:astore_1        
				boolean flag;
				if(windowinsets.getSystemWindowInsetTop() > 0)
			//*   3    5:aload_2         
			//*   4    6:invokevirtual   #31  <Method int WindowInsets.getSystemWindowInsetTop()>
			//*   5    9:ifle            17
					flag = true;
			//    6   12:iconst_1        
			//    7   13:istore_3        
				else
			//*   8   14:goto            19
					flag = false;
			//    9   17:iconst_0        
			//   10   18:istore_3        
				((DrawerLayout) (view)).a(((Object) (windowinsets)), flag);
			//   11   19:aload_1         
			//   12   20:aload_2         
			//   13   21:iload_3         
			//   14   22:invokevirtual   #34  <Method void android.support.v4.widget.DrawerLayout.a(Object, boolean)>
				return windowinsets.consumeSystemWindowInsets();
			//   15   25:aload_2         
			//   16   26:invokevirtual   #38  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
			//   17   29:areturn         
			}

			final DrawerLayout a;

			
			{
				a = DrawerLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DrawerLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  140  268:aload_0         
	//  141  269:new             #6   <Class DrawerLayout$1>
	//  142  272:dup             
	//  143  273:aload_0         
	//  144  274:invokespecial   #207 <Method void DrawerLayout$1(DrawerLayout)>
	//  145  277:invokevirtual   #211 <Method void setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
		setSystemUiVisibility(1280);
	//  146  280:aload_0         
	//  147  281:sipush          1280
	//  148  284:invokevirtual   #214 <Method void setSystemUiVisibility(int)>
		context = ((Context) (context.obtainStyledAttributes(c)));
	//  149  287:aload_1         
	//  150  288:getstatic       #82  <Field int[] c>
	//  151  291:invokevirtual   #220 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//  152  294:astore_1        
		B = ((TypedArray) (context)).getDrawable(0);
	//  153  295:aload_0         
	//  154  296:aload_1         
	//  155  297:iconst_0        
	//  156  298:invokevirtual   #226 <Method Drawable TypedArray.getDrawable(int)>
	//  157  301:putfield        #228 <Field Drawable B>
		((TypedArray) (context)).recycle();
	//  158  304:aload_1         
	//  159  305:invokevirtual   #231 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_323;
	//  160  308:goto            323
		attributeset;
	//  161  311:astore_2        
		((TypedArray) (context)).recycle();
	//  162  312:aload_1         
	//  163  313:invokevirtual   #231 <Method void TypedArray.recycle()>
		throw attributeset;
	//  164  316:aload_2         
	//  165  317:athrow          
		B = null;
	//  166  318:aload_0         
	//  167  319:aconst_null     
	//  168  320:putfield        #228 <Field Drawable B>
		f = f1 * 10F;
	//  169  323:aload_0         
	//  170  324:fload           4
	//  171  326:ldc1            #232 <Float 10F>
	//  172  328:fmul            
	//  173  329:putfield        #234 <Field float f>
		M = new ArrayList();
	//  174  332:aload_0         
	//  175  333:new             #236 <Class ArrayList>
	//  176  336:dup             
	//  177  337:invokespecial   #237 <Method void ArrayList()>
	//  178  340:putfield        #239 <Field ArrayList M>
		return;
	//  179  343:return          
	}

	private boolean a(Drawable drawable, int i1)
	{
		if(drawable != null && android.support.v4.a.a.a.b(drawable))
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #245 <Method boolean a.b(Drawable)>
	//*   4    8:ifne            14
	//*   5   11:goto            22
		{
			android.support.v4.a.a.a.b(drawable, i1);
	//    6   14:aload_1         
	//    7   15:iload_2         
	//    8   16:invokestatic    #247 <Method boolean a.b(Drawable, int)>
	//    9   19:pop             
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	private void c(View view, boolean flag)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore          5
		int j1;
		for(int i1 = 0; i1 < k1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           5
	//*   7   11:icmpge          70
		{
			View view1 = getChildAt(i1);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #256 <Method View getChildAt(int)>
	//   11   19:astore          6
			if(!flag && !g(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           6
	//*  16   28:invokevirtual   #258 <Method boolean g(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            57
	//*  20   38:aload           6
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       57
				j1 = 1;
	//   23   44:iconst_1        
	//   24   45:istore          4
			else
	//*  25   47:aload           6
	//*  26   49:iload           4
	//*  27   51:invokestatic    #192 <Method void s.a(View, int)>
	//*  28   54:goto            63
				j1 = 4;
	//   29   57:iconst_4        
	//   30   58:istore          4
			android.support.v4.view.s.a(view1, j1);
		}

	//   31   60:goto            47
	//   32   63:iload_3         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_3        
	//*  36   67:goto            8
	//   37   70:return          
	}

	static String d(int i1)
	{
		if((i1 & 3) == 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:iconst_3        
	//*   4    4:icmpne          11
			return "LEFT";
	//    5    7:ldc2            #261 <String "LEFT">
	//    6   10:areturn         
		if((i1 & 5) == 5)
	//*   7   11:iload_0         
	//*   8   12:iconst_5        
	//*   9   13:iand            
	//*  10   14:iconst_5        
	//*  11   15:icmpne          22
			return "RIGHT";
	//   12   18:ldc2            #263 <String "RIGHT">
	//   13   21:areturn         
		else
			return Integer.toHexString(i1);
	//   14   22:iload_0         
	//   15   23:invokestatic    #268 <Method String Integer.toHexString(int)>
	//   16   26:areturn         
	}

	private void e()
	{
		if(d)
	//*   0    0:getstatic       #94  <Field boolean d>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			C = f();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #271 <Method Drawable f()>
	//    6   12:putfield        #273 <Field Drawable C>
			D = g();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #275 <Method Drawable g()>
	//   10   20:putfield        #277 <Field Drawable D>
			return;
	//   11   23:return          
		}
	}

	private Drawable f()
	{
		int i1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #280 <Method int s.e(View)>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(I != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #128 <Field Drawable I>
	//*   7   13:ifnull          53
			{
				a(I, i1);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #128 <Field Drawable I>
	//   11   21:iload_1         
	//   12   22:invokespecial   #282 <Method boolean a(Drawable, int)>
	//   13   25:pop             
				return I;
	//   14   26:aload_0         
	//   15   27:getfield        #128 <Field Drawable I>
	//   16   30:areturn         
			}
		} else
		if(J != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #130 <Field Drawable J>
	//*  19   35:ifnull          53
		{
			a(J, i1);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #130 <Field Drawable J>
	//   23   43:iload_1         
	//   24   44:invokespecial   #282 <Method boolean a(Drawable, int)>
	//   25   47:pop             
			return J;
	//   26   48:aload_0         
	//   27   49:getfield        #130 <Field Drawable J>
	//   28   52:areturn         
		}
		return K;
	//   29   53:aload_0         
	//   30   54:getfield        #132 <Field Drawable K>
	//   31   57:areturn         
	}

	private Drawable g()
	{
		int i1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #280 <Method int s.e(View)>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(J != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #130 <Field Drawable J>
	//*   7   13:ifnull          53
			{
				a(J, i1);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #130 <Field Drawable J>
	//   11   21:iload_1         
	//   12   22:invokespecial   #282 <Method boolean a(Drawable, int)>
	//   13   25:pop             
				return J;
	//   14   26:aload_0         
	//   15   27:getfield        #130 <Field Drawable J>
	//   16   30:areturn         
			}
		} else
		if(I != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #128 <Field Drawable I>
	//*  19   35:ifnull          53
		{
			a(I, i1);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #128 <Field Drawable I>
	//   23   43:iload_1         
	//   24   44:invokespecial   #282 <Method boolean a(Drawable, int)>
	//   25   47:pop             
			return I;
	//   26   48:aload_0         
	//   27   49:getfield        #128 <Field Drawable I>
	//   28   52:areturn         
		}
		return L;
	//   29   53:aload_0         
	//   30   54:getfield        #134 <Field Drawable L>
	//   31   57:areturn         
	}

	private boolean h()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((LayoutParams)getChildAt(i1).getLayoutParams()).c)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #256 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//*  13   23:getfield        #291 <Field boolean DrawerLayout$LayoutParams.c>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private boolean i()
	{
		return c() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method View c()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static boolean l(View view)
	{
		return android.support.v4.view.s.d(view) != 4 && android.support.v4.view.s.d(view) != 2;
	//    0    0:aload_0         
	//    1    1:invokestatic    #296 <Method int s.d(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #296 <Method int s.d(View)>
	//    6   12:iconst_2        
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static boolean m(View view)
	{
		view = ((View) (view.getBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #299 <Method Drawable View.getBackground()>
	//    2    4:astore_0        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(view != null)
	//*   7    9:aload_0         
	//*   8   10:ifnull          25
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(((Drawable) (view)).getOpacity() == -1)
	//*  11   15:aload_0         
	//*  12   16:invokevirtual   #304 <Method int Drawable.getOpacity()>
	//*  13   19:iconst_m1       
	//*  14   20:icmpne          25
				flag = true;
	//   15   23:iconst_1        
	//   16   24:istore_1        
		}
		return flag;
	//   17   25:iload_1         
	//   18   26:ireturn         
	}

	public int a(int i1)
	{
		int j1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #280 <Method int s.e(View)>
	//    2    4:istore_2        
		if(i1 != 3)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          143
		{
			if(i1 != 5)
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          106
			{
				if(i1 != 0x800003)
	//*   9   15:iload_1         
	//*  10   16:ldc2            #306 <Int 0x800003>
	//*  11   19:icmpeq          69
				{
					if(i1 == 0x800005)
	//*  12   22:iload_1         
	//*  13   23:ldc2            #307 <Int 0x800005>
	//*  14   26:icmpeq          32
	//*  15   29:goto            180
					{
						if(u != 3)
	//*  16   32:aload_0         
	//*  17   33:getfield        #126 <Field int u>
	//*  18   36:iconst_3        
	//*  19   37:icmpeq          45
							return u;
	//   20   40:aload_0         
	//   21   41:getfield        #126 <Field int u>
	//   22   44:ireturn         
						if(j1 == 0)
	//*  23   45:iload_2         
	//*  24   46:ifne            57
							i1 = s;
	//   25   49:aload_0         
	//   26   50:getfield        #122 <Field int s>
	//   27   53:istore_1        
						else
	//*  28   54:goto            62
							i1 = r;
	//   29   57:aload_0         
	//   30   58:getfield        #120 <Field int r>
	//   31   61:istore_1        
						if(i1 != 3)
	//*  32   62:iload_1         
	//*  33   63:iconst_3        
	//*  34   64:icmpeq          180
							return i1;
	//   35   67:iload_1         
	//   36   68:ireturn         
					}
				} else
				{
					if(t != 3)
	//*  37   69:aload_0         
	//*  38   70:getfield        #124 <Field int t>
	//*  39   73:iconst_3        
	//*  40   74:icmpeq          82
						return t;
	//   41   77:aload_0         
	//   42   78:getfield        #124 <Field int t>
	//   43   81:ireturn         
					if(j1 == 0)
	//*  44   82:iload_2         
	//*  45   83:ifne            94
						i1 = r;
	//   46   86:aload_0         
	//   47   87:getfield        #120 <Field int r>
	//   48   90:istore_1        
					else
	//*  49   91:goto            99
						i1 = s;
	//   50   94:aload_0         
	//   51   95:getfield        #122 <Field int s>
	//   52   98:istore_1        
					if(i1 != 3)
	//*  53   99:iload_1         
	//*  54  100:iconst_3        
	//*  55  101:icmpeq          180
						return i1;
	//   56  104:iload_1         
	//   57  105:ireturn         
				}
			} else
			{
				if(s != 3)
	//*  58  106:aload_0         
	//*  59  107:getfield        #122 <Field int s>
	//*  60  110:iconst_3        
	//*  61  111:icmpeq          119
					return s;
	//   62  114:aload_0         
	//   63  115:getfield        #122 <Field int s>
	//   64  118:ireturn         
				if(j1 == 0)
	//*  65  119:iload_2         
	//*  66  120:ifne            131
					i1 = u;
	//   67  123:aload_0         
	//   68  124:getfield        #126 <Field int u>
	//   69  127:istore_1        
				else
	//*  70  128:goto            136
					i1 = t;
	//   71  131:aload_0         
	//   72  132:getfield        #124 <Field int t>
	//   73  135:istore_1        
				if(i1 != 3)
	//*  74  136:iload_1         
	//*  75  137:iconst_3        
	//*  76  138:icmpeq          180
					return i1;
	//   77  141:iload_1         
	//   78  142:ireturn         
			}
		} else
		{
			if(r != 3)
	//*  79  143:aload_0         
	//*  80  144:getfield        #120 <Field int r>
	//*  81  147:iconst_3        
	//*  82  148:icmpeq          156
				return r;
	//   83  151:aload_0         
	//   84  152:getfield        #120 <Field int r>
	//   85  155:ireturn         
			if(j1 == 0)
	//*  86  156:iload_2         
	//*  87  157:ifne            168
				i1 = t;
	//   88  160:aload_0         
	//   89  161:getfield        #124 <Field int t>
	//   90  164:istore_1        
			else
	//*  91  165:goto            173
				i1 = u;
	//   92  168:aload_0         
	//   93  169:getfield        #126 <Field int u>
	//   94  172:istore_1        
			if(i1 != 3)
	//*  95  173:iload_1         
	//*  96  174:iconst_3        
	//*  97  175:icmpeq          180
				return i1;
	//   98  178:iload_1         
	//   99  179:ireturn         
		}
		return 0;
	//  100  180:iconst_0        
	//  101  181:ireturn         
	}

	public int a(View view)
	{
		if(!g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #258 <Method boolean g(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #309 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #310 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #312 <String "View ">
	//   10   20:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #321 <String " is not a drawer">
	//   18   34:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #323 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		} else
		{
			return a(((LayoutParams)view.getLayoutParams()).a);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   55:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   30   58:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//   31   61:invokevirtual   #334 <Method int a(int)>
	//   32   64:ireturn         
		}
	}

	View a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #256 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((LayoutParams)view.getLayoutParams()).d & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//*  15   25:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	public void a(int i1, int j1)
	{
		int k1 = android.support.v4.view.d.a(j1, android.support.v4.view.s.e(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #280 <Method int s.e(View)>
	//    3    5:invokestatic    #342 <Method int d.a(int, int)>
	//    4    8:istore_3        
		if(j1 != 3)
	//*   5    9:iload_2         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          60
		{
			if(j1 != 5)
	//*   8   14:iload_2         
	//*   9   15:iconst_5        
	//*  10   16:icmpeq          52
			{
				if(j1 != 0x800003)
	//*  11   19:iload_2         
	//*  12   20:ldc2            #306 <Int 0x800003>
	//*  13   23:icmpeq          44
				{
					if(j1 == 0x800005)
	//*  14   26:iload_2         
	//*  15   27:ldc2            #307 <Int 0x800005>
	//*  16   30:icmpeq          36
	//*  17   33:goto            65
						u = i1;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #126 <Field int u>
				} else
	//*  21   41:goto            65
				{
					t = i1;
	//   22   44:aload_0         
	//   23   45:iload_1         
	//   24   46:putfield        #124 <Field int t>
				}
			} else
	//*  25   49:goto            65
			{
				s = i1;
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:putfield        #122 <Field int s>
			}
		} else
	//*  29   57:goto            65
		{
			r = i1;
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:putfield        #120 <Field int r>
		}
		if(i1 != 0)
	//*  33   65:iload_1         
	//*  34   66:ifeq            94
		{
			p p1;
			if(k1 == 3)
	//*  35   69:iload_3         
	//*  36   70:iconst_3        
	//*  37   71:icmpne          83
				p1 = k;
	//   38   74:aload_0         
	//   39   75:getfield        #173 <Field p k>
	//   40   78:astore          4
			else
	//*  41   80:goto            89
				p1 = l;
	//   42   83:aload_0         
	//   43   84:getfield        #183 <Field p l>
	//   44   87:astore          4
			p1.e();
	//   45   89:aload           4
	//   46   91:invokevirtual   #344 <Method void p.e()>
		}
		switch(i1)
	//*  47   94:iload_1         
		{
	//*  48   95:tableswitch     1 2: default 116
	//	               1 136
	//	               2 117
		default:
			return;
	//   49  116:return          

		case 2: // '\002'
			View view = c(k1);
	//   50  117:aload_0         
	//   51  118:iload_3         
	//   52  119:invokevirtual   #346 <Method View c(int)>
	//   53  122:astore          4
			if(view != null)
	//*  54  124:aload           4
	//*  55  126:ifnull          154
			{
				h(view);
	//   56  129:aload_0         
	//   57  130:aload           4
	//   58  132:invokevirtual   #349 <Method void h(View)>
				return;
	//   59  135:return          
			}
			break;

		case 1: // '\001'
			View view1 = c(k1);
	//   60  136:aload_0         
	//   61  137:iload_3         
	//   62  138:invokevirtual   #346 <Method View c(int)>
	//   63  141:astore          4
			if(view1 != null)
	//*  64  143:aload           4
	//*  65  145:ifnull          154
				i(view1);
	//   66  148:aload_0         
	//   67  149:aload           4
	//   68  151:invokevirtual   #351 <Method void i(View)>
			break;
		}
	//   69  154:return          
	}

	void a(int i1, int j1, View view)
	{
		int k1 = k.a();
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field p k>
	//    2    4:invokevirtual   #354 <Method int android.support.v4.widget.p.a()>
	//    3    7:istore          5
		int l1 = l.a();
	//    4    9:aload_0         
	//    5   10:getfield        #183 <Field p l>
	//    6   13:invokevirtual   #354 <Method int android.support.v4.widget.p.a()>
	//    7   16:istore          6
		byte byte0 = 2;
	//    8   18:iconst_2        
	//    9   19:istore          4
		if(k1 != 1 && l1 != 1)
	//*  10   21:iload           5
	//*  11   23:iconst_1        
	//*  12   24:icmpeq          62
	//*  13   27:iload           6
	//*  14   29:iconst_1        
	//*  15   30:icmpne          36
	//*  16   33:goto            62
		{
			i1 = ((int) (byte0));
	//   17   36:iload           4
	//   18   38:istore_1        
			if(k1 != 2)
	//*  19   39:iload           5
	//*  20   41:iconst_2        
	//*  21   42:icmpeq          64
				if(l1 == 2)
	//*  22   45:iload           6
	//*  23   47:iconst_2        
	//*  24   48:icmpne          57
					i1 = ((int) (byte0));
	//   25   51:iload           4
	//   26   53:istore_1        
				else
	//*  27   54:goto            64
					i1 = 0;
	//   28   57:iconst_0        
	//   29   58:istore_1        
		} else
	//*  30   59:goto            64
		{
			i1 = 1;
	//   31   62:iconst_1        
	//   32   63:istore_1        
		}
		if(view != null && j1 == 0)
	//*  33   64:aload_3         
	//*  34   65:ifnull          114
	//*  35   68:iload_2         
	//*  36   69:ifne            114
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   76:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   40   79:astore          7
			if(layoutparams.b == 0.0F)
	//*  41   81:aload           7
	//*  42   83:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//*  43   86:fconst_0        
	//*  44   87:fcmpl           
	//*  45   88:ifne            99
				b(view);
	//   46   91:aload_0         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #358 <Method void b(View)>
			else
	//*  49   96:goto            114
			if(layoutparams.b == 1.0F)
	//*  50   99:aload           7
	//*  51  101:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//*  52  104:fconst_1        
	//*  53  105:fcmpl           
	//*  54  106:ifne            114
				c(view);
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #360 <Method void c(View)>
		}
		if(i1 != o)
	//*  58  114:iload_1         
	//*  59  115:aload_0         
	//*  60  116:getfield        #362 <Field int o>
	//*  61  119:icmpeq          176
		{
			o = i1;
	//   62  122:aload_0         
	//   63  123:iload_1         
	//   64  124:putfield        #362 <Field int o>
			if(y != null)
	//*  65  127:aload_0         
	//*  66  128:getfield        #364 <Field List y>
	//*  67  131:ifnull          176
				for(j1 = y.size() - 1; j1 >= 0; j1--)
	//*  68  134:aload_0         
	//*  69  135:getfield        #364 <Field List y>
	//*  70  138:invokeinterface #369 <Method int List.size()>
	//*  71  143:iconst_1        
	//*  72  144:isub            
	//*  73  145:istore_2        
	//*  74  146:iload_2         
	//*  75  147:iflt            176
					((c)y.get(j1)).onDrawerStateChanged(i1);
	//   76  150:aload_0         
	//   77  151:getfield        #364 <Field List y>
	//   78  154:iload_2         
	//   79  155:invokeinterface #373 <Method Object List.get(int)>
	//   80  160:checkcast       #22  <Class DrawerLayout$c>
	//   81  163:iload_1         
	//   82  164:invokeinterface #376 <Method void DrawerLayout$c.onDrawerStateChanged(int)>

	//   83  169:iload_2         
	//   84  170:iconst_1        
	//   85  171:isub            
	//   86  172:istore_2        
		}
	//*  87  173:goto            146
	//   88  176:return          
	}

	public void a(int i1, boolean flag)
	{
		Object obj = ((Object) (c(i1)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #346 <Method View c(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       47
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #309 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #310 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("No drawer view found with gravity ");
	//   10   18:aload_3         
	//   11   19:ldc2            #379 <String "No drawer view found with gravity ">
	//   12   22:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(d(i1));
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokestatic    #381 <Method String d(int)>
	//   17   31:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   19   35:new             #323 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			a(((View) (obj)), flag);
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:invokevirtual   #383 <Method void a(View, boolean)>
			return;
	//   29   53:return          
		}
	}

	public void a(c c1)
	{
		if(c1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(y == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #364 <Field List y>
	//*   5    9:ifnonnull       23
			y = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #236 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #237 <Method void ArrayList()>
	//   10   20:putfield        #364 <Field List y>
		y.add(((Object) (c1)));
	//   11   23:aload_0         
	//   12   24:getfield        #364 <Field List y>
	//   13   27:aload_1         
	//   14   28:invokeinterface #388 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	void a(View view, float f1)
	{
		if(y != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field List y>
	//*   2    4:ifnull          50
		{
			for(int i1 = y.size() - 1; i1 >= 0; i1--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #364 <Field List y>
	//*   5   11:invokeinterface #369 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_3        
	//*   9   19:iload_3         
	//*  10   20:iflt            50
				((c)y.get(i1)).onDrawerSlide(view, f1);
	//   11   23:aload_0         
	//   12   24:getfield        #364 <Field List y>
	//   13   27:iload_3         
	//   14   28:invokeinterface #373 <Method Object List.get(int)>
	//   15   33:checkcast       #22  <Class DrawerLayout$c>
	//   16   36:aload_1         
	//   17   37:fload_2         
	//   18   38:invokeinterface #392 <Method void DrawerLayout$c.onDrawerSlide(View, float)>

	//   19   43:iload_3         
	//   20   44:iconst_1        
	//   21   45:isub            
	//   22   46:istore_3        
		}
	//*  23   47:goto            19
	//   24   50:return          
	}

	public void a(View view, boolean flag)
	{
		if(!g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #258 <Method boolean g(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #309 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #310 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("View ");
	//    8   16:aload_3         
	//    9   17:ldc2            #312 <String "View ">
	//   10   20:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   16   30:aload_3         
	//   17   31:ldc2            #394 <String " is not a sliding drawer">
	//   18   34:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #323 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   29   57:astore_3        
		if(q)
	//*  30   58:aload_0         
	//*  31   59:getfield        #118 <Field boolean q>
	//*  32   62:ifeq            84
		{
			layoutparams.b = 1.0F;
	//   33   65:aload_3         
	//   34   66:fconst_1        
	//   35   67:putfield        #356 <Field float DrawerLayout$LayoutParams.b>
			layoutparams.d = 1;
	//   36   70:aload_3         
	//   37   71:iconst_1        
	//   38   72:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
			c(view, true);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:iconst_1        
	//   42   78:invokespecial   #396 <Method void c(View, boolean)>
		} else
	//*  43   81:goto            170
		if(flag)
	//*  44   84:iload_2         
	//*  45   85:ifeq            149
		{
			layoutparams.d = layoutparams.d | 2;
	//   46   88:aload_3         
	//   47   89:aload_3         
	//   48   90:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//   49   93:iconst_2        
	//   50   94:ior             
	//   51   95:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
			if(a(view, 3))
	//*  52   98:aload_0         
	//*  53   99:aload_1         
	//*  54  100:iconst_3        
	//*  55  101:invokevirtual   #399 <Method boolean a(View, int)>
	//*  56  104:ifeq            124
				k.a(view, 0, view.getTop());
	//   57  107:aload_0         
	//   58  108:getfield        #173 <Field p k>
	//   59  111:aload_1         
	//   60  112:iconst_0        
	//   61  113:aload_1         
	//   62  114:invokevirtual   #402 <Method int View.getTop()>
	//   63  117:invokevirtual   #405 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//   64  120:pop             
			else
	//*  65  121:goto            170
				l.a(view, getWidth() - view.getWidth(), view.getTop());
	//   66  124:aload_0         
	//   67  125:getfield        #183 <Field p l>
	//   68  128:aload_1         
	//   69  129:aload_0         
	//   70  130:invokevirtual   #408 <Method int getWidth()>
	//   71  133:aload_1         
	//   72  134:invokevirtual   #409 <Method int View.getWidth()>
	//   73  137:isub            
	//   74  138:aload_1         
	//   75  139:invokevirtual   #402 <Method int View.getTop()>
	//   76  142:invokevirtual   #405 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//   77  145:pop             
		} else
	//*  78  146:goto            170
		{
			c(view, 1.0F);
	//   79  149:aload_0         
	//   80  150:aload_1         
	//   81  151:fconst_1        
	//   82  152:invokevirtual   #411 <Method void c(View, float)>
			a(layoutparams.a, 0, view);
	//   83  155:aload_0         
	//   84  156:aload_3         
	//   85  157:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//   86  160:iconst_0        
	//   87  161:aload_1         
	//   88  162:invokevirtual   #413 <Method void a(int, int, View)>
			view.setVisibility(0);
	//   89  165:aload_1         
	//   90  166:iconst_0        
	//   91  167:invokevirtual   #416 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   92  170:aload_0         
	//   93  171:invokevirtual   #419 <Method void invalidate()>
	//   94  174:return          
	}

	public void a(Object obj, boolean flag)
	{
		G = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #422 <Field Object G>
		H = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #424 <Field boolean H>
		if(!flag && getBackground() == null)
	//*   6   10:iload_2         
	//*   7   11:ifne            26
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #425 <Method Drawable getBackground()>
	//*  10   18:ifnonnull       26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		setWillNotDraw(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #428 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #431 <Method void requestLayout()>
	//   21   37:return          
	}

	void a(boolean flag)
	{
		int l1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore          5
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int j1;
		int k1;
		for(j1 = 0; i1 < l1; j1 = k1)
	//*   5    8:iconst_0        
	//*   6    9:istore_3        
	//*   7   10:iload_2         
	//*   8   11:iload           5
	//*   9   13:icmpge          147
		{
			View view = getChildAt(i1);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #256 <Method View getChildAt(int)>
	//   13   21:astore          7
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   14   23:aload           7
	//   15   25:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   17   31:astore          8
			k1 = j1;
	//   18   33:iload_3         
	//   19   34:istore          4
			if(g(view))
	//*  20   36:aload_0         
	//*  21   37:aload           7
	//*  22   39:invokevirtual   #258 <Method boolean g(View)>
	//*  23   42:ifeq            137
				if(flag && !layoutparams.c)
	//*  24   45:iload_1         
	//*  25   46:ifeq            63
	//*  26   49:aload           8
	//*  27   51:getfield        #291 <Field boolean DrawerLayout$LayoutParams.c>
	//*  28   54:ifne            63
				{
					k1 = j1;
	//   29   57:iload_3         
	//   30   58:istore          4
				} else
	//*  31   60:goto            137
				{
					k1 = view.getWidth();
	//   32   63:aload           7
	//   33   65:invokevirtual   #409 <Method int View.getWidth()>
	//   34   68:istore          4
					boolean flag1;
					if(a(view, 3))
	//*  35   70:aload_0         
	//*  36   71:aload           7
	//*  37   73:iconst_3        
	//*  38   74:invokevirtual   #399 <Method boolean a(View, int)>
	//*  39   77:ifeq            108
						flag1 = k.a(view, -k1, view.getTop());
	//   40   80:aload_0         
	//   41   81:getfield        #173 <Field p k>
	//   42   84:aload           7
	//   43   86:iload           4
	//   44   88:ineg            
	//   45   89:aload           7
	//   46   91:invokevirtual   #402 <Method int View.getTop()>
	//   47   94:invokevirtual   #405 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//   48   97:istore          6
					else
	//*  49   99:iload_3         
	//*  50  100:iload           6
	//*  51  102:ior             
	//*  52  103:istore          4
	//*  53  105:goto            131
						flag1 = l.a(view, getWidth(), view.getTop());
	//   54  108:aload_0         
	//   55  109:getfield        #183 <Field p l>
	//   56  112:aload           7
	//   57  114:aload_0         
	//   58  115:invokevirtual   #408 <Method int getWidth()>
	//   59  118:aload           7
	//   60  120:invokevirtual   #402 <Method int View.getTop()>
	//   61  123:invokevirtual   #405 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//   62  126:istore          6
					k1 = j1 | flag1;
	//*  63  128:goto            99
					layoutparams.c = false;
	//   64  131:aload           8
	//   65  133:iconst_0        
	//   66  134:putfield        #291 <Field boolean DrawerLayout$LayoutParams.c>
				}
			i1++;
	//   67  137:iload_2         
	//   68  138:iconst_1        
	//   69  139:iadd            
	//   70  140:istore_2        
		}

	//   71  141:iload           4
	//   72  143:istore_3        
	//*  73  144:goto            10
		m.a();
	//   74  147:aload_0         
	//   75  148:getfield        #164 <Field DrawerLayout$d m>
	//   76  151:invokevirtual   #433 <Method void android.support.v4.widget.DrawerLayout$d.a()>
		n.a();
	//   77  154:aload_0         
	//   78  155:getfield        #166 <Field DrawerLayout$d n>
	//   79  158:invokevirtual   #433 <Method void android.support.v4.widget.DrawerLayout$d.a()>
		if(j1 != 0)
	//*  80  161:iload_3         
	//*  81  162:ifeq            169
			invalidate();
	//   82  165:aload_0         
	//   83  166:invokevirtual   #419 <Method void invalidate()>
	//   84  169:return          
	}

	boolean a(View view, int i1)
	{
		return (e(view) & i1) == i1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #434 <Method int e(View)>
	//    3    5:iload_2         
	//    4    6:iand            
	//    5    7:iload_2         
	//    6    8:icmpne          13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public void addFocusables(ArrayList arraylist, int i1, int j1)
	{
		if(getDescendantFocusability() == 0x60000)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #439 <Method int getDescendantFocusability()>
	//*   2    4:ldc2            #440 <Int 0x60000>
	//*   3    7:icmpne          11
			return;
	//    4   10:return          
		int j2 = getChildCount();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #252 <Method int getChildCount()>
	//    7   15:istore          7
		boolean flag1 = false;
	//    8   17:iconst_0        
	//    9   18:istore          6
		int k1 = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		boolean flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          5
		for(; k1 < j2; k1++)
	//*  14   26:iload           4
	//*  15   28:iload           7
	//*  16   30:icmpge          92
		{
			View view = getChildAt(k1);
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:invokevirtual   #256 <Method View getChildAt(int)>
	//   20   39:astore          8
			if(g(view))
	//*  21   41:aload_0         
	//*  22   42:aload           8
	//*  23   44:invokevirtual   #258 <Method boolean g(View)>
	//*  24   47:ifeq            73
			{
				if(j(view))
	//*  25   50:aload_0         
	//*  26   51:aload           8
	//*  27   53:invokevirtual   #442 <Method boolean j(View)>
	//*  28   56:ifeq            83
				{
					view.addFocusables(arraylist, i1, j1);
	//   29   59:aload           8
	//   30   61:aload_1         
	//   31   62:iload_2         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #444 <Method void View.addFocusables(ArrayList, int, int)>
					flag = true;
	//   34   67:iconst_1        
	//   35   68:istore          5
				}
			} else
	//*  36   70:goto            83
			{
				M.add(((Object) (view)));
	//   37   73:aload_0         
	//   38   74:getfield        #239 <Field ArrayList M>
	//   39   77:aload           8
	//   40   79:invokevirtual   #445 <Method boolean ArrayList.add(Object)>
	//   41   82:pop             
			}
		}

	//   42   83:iload           4
	//   43   85:iconst_1        
	//   44   86:iadd            
	//   45   87:istore          4
	//*  46   89:goto            26
		if(!flag)
	//*  47   92:iload           5
	//*  48   94:ifne            156
		{
			int i2 = M.size();
	//   49   97:aload_0         
	//   50   98:getfield        #239 <Field ArrayList M>
	//   51  101:invokevirtual   #446 <Method int ArrayList.size()>
	//   52  104:istore          5
			for(int l1 = ((int) (flag1)); l1 < i2; l1++)
	//*  53  106:iload           6
	//*  54  108:istore          4
	//*  55  110:iload           4
	//*  56  112:iload           5
	//*  57  114:icmpge          156
			{
				View view1 = (View)M.get(l1);
	//   58  117:aload_0         
	//   59  118:getfield        #239 <Field ArrayList M>
	//   60  121:iload           4
	//   61  123:invokevirtual   #447 <Method Object ArrayList.get(int)>
	//   62  126:checkcast       #285 <Class View>
	//   63  129:astore          8
				if(view1.getVisibility() == 0)
	//*  64  131:aload           8
	//*  65  133:invokevirtual   #450 <Method int View.getVisibility()>
	//*  66  136:ifne            147
					view1.addFocusables(arraylist, i1, j1);
	//   67  139:aload           8
	//   68  141:aload_1         
	//   69  142:iload_2         
	//   70  143:iload_3         
	//   71  144:invokevirtual   #444 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   72  147:iload           4
	//   73  149:iconst_1        
	//   74  150:iadd            
	//   75  151:istore          4
		}
	//*  76  153:goto            110
		M.clear();
	//   77  156:aload_0         
	//   78  157:getfield        #239 <Field ArrayList M>
	//   79  160:invokevirtual   #453 <Method void ArrayList.clear()>
	//   80  163:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i1, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #459 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(a() == null && !g(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #461 <Method View a()>
	//*   7   11:ifnonnull       30
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #258 <Method boolean g(View)>
	//*  11   19:ifeq            25
	//*  12   22:goto            30
			i1 = 1;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			i1 = 4;
	//   16   30:iconst_4        
	//   17   31:istore_2        
		android.support.v4.view.s.a(view, i1);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #192 <Method void s.a(View, int)>
		if(!b)
	//*  21   37:getstatic       #92  <Field boolean b>
	//*  22   40:ifne            51
			android.support.v4.view.s.a(view, ((android.support.v4.view.a) (e)));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #108 <Field DrawerLayout$b e>
	//   26   48:invokestatic    #198 <Method void s.a(View, android.support.v4.view.a)>
	//   27   51:return          
	}

	public CharSequence b(int i1)
	{
		i1 = android.support.v4.view.d.a(i1, android.support.v4.view.s.e(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #280 <Method int s.e(View)>
	//    3    5:invokestatic    #342 <Method int d.a(int, int)>
	//    4    8:istore_1        
		if(i1 == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          19
			return E;
	//    8   14:aload_0         
	//    9   15:getfield        #464 <Field CharSequence E>
	//   10   18:areturn         
		if(i1 == 5)
	//*  11   19:iload_1         
	//*  12   20:iconst_5        
	//*  13   21:icmpne          29
			return F;
	//   14   24:aload_0         
	//   15   25:getfield        #466 <Field CharSequence F>
	//   16   28:areturn         
		else
			return null;
	//   17   29:aconst_null     
	//   18   30:areturn         
	}

	public void b()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #468 <Method void a(boolean)>
	//    3    5:return          
	}

	public void b(int i1, boolean flag)
	{
		Object obj = ((Object) (c(i1)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #346 <Method View c(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       47
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #309 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #310 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("No drawer view found with gravity ");
	//   10   18:aload_3         
	//   11   19:ldc2            #379 <String "No drawer view found with gravity ">
	//   12   22:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(d(i1));
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokestatic    #381 <Method String d(int)>
	//   17   31:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   19   35:new             #323 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			b(((View) (obj)), flag);
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:invokevirtual   #470 <Method void b(View, boolean)>
			return;
	//   29   53:return          
		}
	}

	public void b(c c1)
	{
		if(c1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(y == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #364 <Field List y>
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			y.remove(((Object) (c1)));
	//    7   13:aload_0         
	//    8   14:getfield        #364 <Field List y>
	//    9   17:aload_1         
	//   10   18:invokeinterface #473 <Method boolean List.remove(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	void b(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.d & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          100
		{
			layoutparams.d = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
			if(y != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #364 <Field List y>
	//*  15   27:ifnull          72
			{
				for(int i1 = y.size() - 1; i1 >= 0; i1--)
	//*  16   30:aload_0         
	//*  17   31:getfield        #364 <Field List y>
	//*  18   34:invokeinterface #369 <Method int List.size()>
	//*  19   39:iconst_1        
	//*  20   40:isub            
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iflt            72
					((c)y.get(i1)).onDrawerClosed(view);
	//   24   46:aload_0         
	//   25   47:getfield        #364 <Field List y>
	//   26   50:iload_2         
	//   27   51:invokeinterface #373 <Method Object List.get(int)>
	//   28   56:checkcast       #22  <Class DrawerLayout$c>
	//   29   59:aload_1         
	//   30   60:invokeinterface #476 <Method void DrawerLayout$c.onDrawerClosed(View)>

	//   31   65:iload_2         
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:istore_2        
			}
	//*  35   69:goto            42
			c(view, false);
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:iconst_0        
	//   39   75:invokespecial   #396 <Method void c(View, boolean)>
			if(hasWindowFocus())
	//*  40   78:aload_0         
	//*  41   79:invokevirtual   #479 <Method boolean hasWindowFocus()>
	//*  42   82:ifeq            100
			{
				view = getRootView();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #482 <Method View getRootView()>
	//   45   89:astore_1        
				if(view != null)
	//*  46   90:aload_1         
	//*  47   91:ifnull          100
					view.sendAccessibilityEvent(32);
	//   48   94:aload_1         
	//   49   95:bipush          32
	//   50   97:invokevirtual   #485 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   51  100:return          
	}

	void b(View view, float f1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if(f1 == layoutparams.b)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//*   7   13:fcmpl           
	//*   8   14:ifne            18
		{
			return;
	//    9   17:return          
		} else
		{
			layoutparams.b = f1;
	//   10   18:aload_3         
	//   11   19:fload_2         
	//   12   20:putfield        #356 <Field float DrawerLayout$LayoutParams.b>
			a(view, f1);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #487 <Method void a(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void b(View view, boolean flag)
	{
		if(!g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #258 <Method boolean g(View)>
	//*   3    5:ifne            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #309 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #310 <Method void StringBuilder()>
	//    7   15:astore          4
			stringbuilder.append("View ");
	//    8   17:aload           4
	//    9   19:ldc2            #312 <String "View ">
	//   10   22:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(((Object) (view)));
	//   12   26:aload           4
	//   13   28:aload_1         
	//   14   29:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   15   32:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   16   33:aload           4
	//   17   35:ldc2            #394 <String " is not a sliding drawer">
	//   18   38:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   42:new             #323 <Class IllegalArgumentException>
	//   21   45:dup             
	//   22   46:aload           4
	//   23   48:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   25   54:athrow          
		}
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   26   55:aload_1         
	//   27   56:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   59:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   29   62:astore          4
		if(q)
	//*  30   64:aload_0         
	//*  31   65:getfield        #118 <Field boolean q>
	//*  32   68:ifeq            86
		{
			obj.b = 0.0F;
	//   33   71:aload           4
	//   34   73:fconst_0        
	//   35   74:putfield        #356 <Field float DrawerLayout$LayoutParams.b>
			obj.d = 0;
	//   36   77:aload           4
	//   37   79:iconst_0        
	//   38   80:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
		} else
	//*  39   83:goto            174
		if(flag)
	//*  40   86:iload_2         
	//*  41   87:ifeq            152
		{
			obj.d = ((LayoutParams) (obj)).d | 4;
	//   42   90:aload           4
	//   43   92:aload           4
	//   44   94:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//   45   97:iconst_4        
	//   46   98:ior             
	//   47   99:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
			int i1;
			if(a(view, 3))
	//*  48  102:aload_0         
	//*  49  103:aload_1         
	//*  50  104:iconst_3        
	//*  51  105:invokevirtual   #399 <Method boolean a(View, int)>
	//*  52  108:ifeq            138
			{
				obj = ((Object) (k));
	//   53  111:aload_0         
	//   54  112:getfield        #173 <Field p k>
	//   55  115:astore          4
				i1 = -view.getWidth();
	//   56  117:aload_1         
	//   57  118:invokevirtual   #409 <Method int View.getWidth()>
	//   58  121:ineg            
	//   59  122:istore_3        
			} else
	//*  60  123:aload           4
	//*  61  125:aload_1         
	//*  62  126:iload_3         
	//*  63  127:aload_1         
	//*  64  128:invokevirtual   #402 <Method int View.getTop()>
	//*  65  131:invokevirtual   #405 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//*  66  134:pop             
	//*  67  135:goto            174
			{
				obj = ((Object) (l));
	//   68  138:aload_0         
	//   69  139:getfield        #183 <Field p l>
	//   70  142:astore          4
				i1 = getWidth();
	//   71  144:aload_0         
	//   72  145:invokevirtual   #408 <Method int getWidth()>
	//   73  148:istore_3        
			}
			((p) (obj)).a(view, i1, view.getTop());
		} else
	//*  74  149:goto            123
		{
			c(view, 0.0F);
	//   75  152:aload_0         
	//   76  153:aload_1         
	//   77  154:fconst_0        
	//   78  155:invokevirtual   #411 <Method void c(View, float)>
			a(((LayoutParams) (obj)).a, 0, view);
	//   79  158:aload_0         
	//   80  159:aload           4
	//   81  161:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//   82  164:iconst_0        
	//   83  165:aload_1         
	//   84  166:invokevirtual   #413 <Method void a(int, int, View)>
			view.setVisibility(4);
	//   85  169:aload_1         
	//   86  170:iconst_4        
	//   87  171:invokevirtual   #416 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   88  174:aload_0         
	//   89  175:invokevirtual   #419 <Method void invalidate()>
	//   90  178:return          
	}

	View c()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #256 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(g(view) && k(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #258 <Method boolean g(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #489 <Method boolean k(View)>
	//*  19   31:ifeq            36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	View c(int i1)
	{
		int j1 = android.support.v4.view.d.a(i1, android.support.v4.view.s.e(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #280 <Method int s.e(View)>
	//    3    5:invokestatic    #342 <Method int d.a(int, int)>
	//    4    8:istore_2        
		int k1 = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #252 <Method int getChildCount()>
	//    7   13:istore_3        
		for(i1 = 0; i1 < k1; i1++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_3         
	//*  12   18:icmpge          54
		{
			View view = getChildAt(i1);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #256 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((e(view) & 7) == (j1 & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #434 <Method int e(View)>
	//*  20   34:bipush          7
	//*  21   36:iand            
	//*  22   37:iload_2         
	//*  23   38:bipush          7
	//*  24   40:iand            
	//*  25   41:icmpne          47
				return view;
	//   26   44:aload           4
	//   27   46:areturn         
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_1        
	//*  32   51:goto            16
		return null;
	//   33   54:aconst_null     
	//   34   55:areturn         
	}

	void c(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.d & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            90
		{
			layoutparams.d = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
			if(y != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #364 <Field List y>
	//*  14   26:ifnull          71
			{
				for(int i1 = y.size() - 1; i1 >= 0; i1--)
	//*  15   29:aload_0         
	//*  16   30:getfield        #364 <Field List y>
	//*  17   33:invokeinterface #369 <Method int List.size()>
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:iflt            71
					((c)y.get(i1)).onDrawerOpened(view);
	//   23   45:aload_0         
	//   24   46:getfield        #364 <Field List y>
	//   25   49:iload_2         
	//   26   50:invokeinterface #373 <Method Object List.get(int)>
	//   27   55:checkcast       #22  <Class DrawerLayout$c>
	//   28   58:aload_1         
	//   29   59:invokeinterface #492 <Method void DrawerLayout$c.onDrawerOpened(View)>

	//   30   64:iload_2         
	//   31   65:iconst_1        
	//   32   66:isub            
	//   33   67:istore_2        
			}
	//*  34   68:goto            41
			c(view, true);
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:iconst_1        
	//   38   74:invokespecial   #396 <Method void c(View, boolean)>
			if(hasWindowFocus())
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #479 <Method boolean hasWindowFocus()>
	//*  41   81:ifeq            90
				sendAccessibilityEvent(32);
	//   42   84:aload_0         
	//   43   85:bipush          32
	//   44   87:invokevirtual   #493 <Method void sendAccessibilityEvent(int)>
		}
	//   45   90:return          
	}

	void c(View view, float f1)
	{
		float f2 = d(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #496 <Method float d(View)>
	//    3    5:fstore_3        
		float f3 = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #409 <Method int View.getWidth()>
	//    6   10:i2f             
	//    7   11:fstore          4
		int i1 = (int)(f2 * f3);
	//    8   13:fload_3         
	//    9   14:fload           4
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:istore          5
		i1 = (int)(f3 * f1) - i1;
	//   13   20:fload           4
	//   14   22:fload_2         
	//   15   23:fmul            
	//   16   24:f2i             
	//   17   25:iload           5
	//   18   27:isub            
	//   19   28:istore          5
		if(!a(view, 3))
	//*  20   30:aload_0         
	//*  21   31:aload_1         
	//*  22   32:iconst_3        
	//*  23   33:invokevirtual   #399 <Method boolean a(View, int)>
	//*  24   36:ifeq            42
	//*  25   39:goto            47
			i1 = -i1;
	//   26   42:iload           5
	//   27   44:ineg            
	//   28   45:istore          5
		view.offsetLeftAndRight(i1);
	//   29   47:aload_1         
	//   30   48:iload           5
	//   31   50:invokevirtual   #499 <Method void View.offsetLeftAndRight(int)>
		b(view, f1);
	//   32   53:aload_0         
	//   33   54:aload_1         
	//   34   55:fload_2         
	//   35   56:invokevirtual   #501 <Method void b(View, float)>
	//   36   59:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #8   <Class DrawerLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #505 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method int getChildCount()>
	//    2    4:istore_3        
		float f1 = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_1        
		for(int i1 = 0; i1 < j1; i1++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          40
			f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
	//   10   14:fload_1         
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:invokevirtual   #256 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   16   26:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//   17   29:invokestatic    #512 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		i = f1;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #514 <Field float i>
		boolean flag = k.a(true);
	//   27   45:aload_0         
	//   28   46:getfield        #173 <Field p k>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #517 <Method boolean android.support.v4.widget.p.a(boolean)>
	//   31   53:istore          4
		boolean flag1 = l.a(true);
	//   32   55:aload_0         
	//   33   56:getfield        #183 <Field p l>
	//   34   59:iconst_1        
	//   35   60:invokevirtual   #517 <Method boolean android.support.v4.widget.p.a(boolean)>
	//   36   63:istore          5
		if(flag || flag1)
	//*  37   65:iload           4
	//*  38   67:ifne            75
	//*  39   70:iload           5
	//*  40   72:ifeq            79
			android.support.v4.view.s.c(((View) (this)));
	//   41   75:aload_0         
	//   42   76:invokestatic    #518 <Method void s.c(View)>
	//   43   79:return          
	}

	float d(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).b;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//    4   10:freturn         
	}

	void d()
	{
		if(!w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #520 <Field boolean w>
	//*   2    4:ifne            62
		{
			long l1 = SystemClock.uptimeMillis();
	//    3    7:invokestatic    #526 <Method long SystemClock.uptimeMillis()>
	//    4   10:lstore_3        
			MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//    5   11:lload_3         
	//    6   12:lload_3         
	//    7   13:iconst_3        
	//    8   14:fconst_0        
	//    9   15:fconst_0        
	//   10   16:iconst_0        
	//   11   17:invokestatic    #532 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   12   20:astore          5
			int j1 = getChildCount();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #252 <Method int getChildCount()>
	//   15   26:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
	//*  16   27:iconst_0        
	//*  17   28:istore_1        
	//*  18   29:iload_1         
	//*  19   30:iload_2         
	//*  20   31:icmpge          52
				getChildAt(i1).dispatchTouchEvent(motionevent);
	//   21   34:aload_0         
	//   22   35:iload_1         
	//   23   36:invokevirtual   #256 <Method View getChildAt(int)>
	//   24   39:aload           5
	//   25   41:invokevirtual   #536 <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//   26   44:pop             

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            29
			motionevent.recycle();
	//   32   52:aload           5
	//   33   54:invokevirtual   #537 <Method void MotionEvent.recycle()>
			w = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #520 <Field boolean w>
		}
	//   37   62:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		int k5 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #542 <Method int getHeight()>
	//    2    4:istore          13
		boolean flag = f(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #544 <Method boolean f(View)>
	//    6   11:istore          15
		int i1 = getWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #408 <Method int getWidth()>
	//    9   17:istore          6
		int j5 = canvas.save();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #549 <Method int Canvas.save()>
	//   12   23:istore          12
		int i2;
		if(flag)
	//*  13   25:iload           15
	//*  14   27:ifeq            248
		{
			int l5 = getChildCount();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #252 <Method int getChildCount()>
	//   17   34:istore          14
			int l2 = 0;
	//   18   36:iconst_0        
	//   19   37:istore          8
			i2 = 0;
	//   20   39:iconst_0        
	//   21   40:istore          7
			while(l2 < l5) 
	//*  22   42:iload           8
	//*  23   44:iload           14
	//*  24   46:icmpge          231
			{
				View view1 = getChildAt(l2);
	//   25   49:aload_0         
	//   26   50:iload           8
	//   27   52:invokevirtual   #256 <Method View getChildAt(int)>
	//   28   55:astore          17
				int l3 = i2;
	//   29   57:iload           7
	//   30   59:istore          9
				int k4 = i1;
	//   31   61:iload           6
	//   32   63:istore          10
				if(view1 != view)
	//*  33   65:aload           17
	//*  34   67:aload_2         
	//*  35   68:if_acmpeq       214
				{
					l3 = i2;
	//   36   71:iload           7
	//   37   73:istore          9
					k4 = i1;
	//   38   75:iload           6
	//   39   77:istore          10
					if(view1.getVisibility() == 0)
	//*  40   79:aload           17
	//*  41   81:invokevirtual   #450 <Method int View.getVisibility()>
	//*  42   84:ifne            214
					{
						l3 = i2;
	//   43   87:iload           7
	//   44   89:istore          9
						k4 = i1;
	//   45   91:iload           6
	//   46   93:istore          10
						if(m(view1))
	//*  47   95:aload           17
	//*  48   97:invokestatic    #551 <Method boolean m(View)>
	//*  49  100:ifeq            214
						{
							l3 = i2;
	//   50  103:iload           7
	//   51  105:istore          9
							k4 = i1;
	//   52  107:iload           6
	//   53  109:istore          10
							if(g(view1))
	//*  54  111:aload_0         
	//*  55  112:aload           17
	//*  56  114:invokevirtual   #258 <Method boolean g(View)>
	//*  57  117:ifeq            214
								if(view1.getHeight() < k5)
	//*  58  120:aload           17
	//*  59  122:invokevirtual   #552 <Method int View.getHeight()>
	//*  60  125:iload           13
	//*  61  127:icmpge          141
								{
									l3 = i2;
	//   62  130:iload           7
	//   63  132:istore          9
									k4 = i1;
	//   64  134:iload           6
	//   65  136:istore          10
								} else
	//*  66  138:goto            214
								if(a(view1, 3))
	//*  67  141:aload_0         
	//*  68  142:aload           17
	//*  69  144:iconst_3        
	//*  70  145:invokevirtual   #399 <Method boolean a(View, int)>
	//*  71  148:ifeq            184
								{
									int l4 = view1.getRight();
	//   72  151:aload           17
	//   73  153:invokevirtual   #555 <Method int View.getRight()>
	//   74  156:istore          11
									l3 = i2;
	//   75  158:iload           7
	//   76  160:istore          9
									k4 = i1;
	//   77  162:iload           6
	//   78  164:istore          10
									if(l4 > i2)
	//*  79  166:iload           11
	//*  80  168:iload           7
	//*  81  170:icmple          214
									{
										l3 = l4;
	//   82  173:iload           11
	//   83  175:istore          9
										k4 = i1;
	//   84  177:iload           6
	//   85  179:istore          10
									}
								} else
	//*  86  181:goto            214
								{
									int i5 = view1.getLeft();
	//   87  184:aload           17
	//   88  186:invokevirtual   #558 <Method int View.getLeft()>
	//   89  189:istore          11
									l3 = i2;
	//   90  191:iload           7
	//   91  193:istore          9
									k4 = i1;
	//   92  195:iload           6
	//   93  197:istore          10
									if(i5 < i1)
	//*  94  199:iload           11
	//*  95  201:iload           6
	//*  96  203:icmpge          214
									{
										k4 = i5;
	//   97  206:iload           11
	//   98  208:istore          10
										l3 = i2;
	//   99  210:iload           7
	//  100  212:istore          9
									}
								}
						}
					}
				}
				l2++;
	//  101  214:iload           8
	//  102  216:iconst_1        
	//  103  217:iadd            
	//  104  218:istore          8
				i2 = l3;
	//  105  220:iload           9
	//  106  222:istore          7
				i1 = k4;
	//  107  224:iload           10
	//  108  226:istore          6
			}
	//* 109  228:goto            42
			canvas.clipRect(i2, 0, i1, getHeight());
	//  110  231:aload_1         
	//  111  232:iload           7
	//  112  234:iconst_0        
	//  113  235:iload           6
	//  114  237:aload_0         
	//  115  238:invokevirtual   #542 <Method int getHeight()>
	//  116  241:invokevirtual   #562 <Method boolean Canvas.clipRect(int, int, int, int)>
	//  117  244:pop             
		} else
	//* 118  245:goto            251
		{
			i2 = 0;
	//  119  248:iconst_0        
	//  120  249:istore          7
		}
		boolean flag1 = super.drawChild(canvas, view, l1);
	//  121  251:aload_0         
	//  122  252:aload_1         
	//  123  253:aload_2         
	//  124  254:lload_3         
	//  125  255:invokespecial   #564 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  126  258:istore          16
		canvas.restoreToCount(j5);
	//  127  260:aload_1         
	//  128  261:iload           12
	//  129  263:invokevirtual   #567 <Method void Canvas.restoreToCount(int)>
		if(i > 0.0F && flag)
	//* 130  266:aload_0         
	//* 131  267:getfield        #514 <Field float i>
	//* 132  270:fconst_0        
	//* 133  271:fcmpl           
	//* 134  272:ifle            348
	//* 135  275:iload           15
	//* 136  277:ifeq            348
		{
			int i3 = (int)((float)((h & 0xff000000) >>> 24) * i);
	//  137  280:aload_0         
	//  138  281:getfield        #111 <Field int h>
	//  139  284:ldc2            #568 <Int 0xff000000>
	//  140  287:iand            
	//  141  288:bipush          24
	//  142  290:iushr           
	//  143  291:i2f             
	//  144  292:aload_0         
	//  145  293:getfield        #514 <Field float i>
	//  146  296:fmul            
	//  147  297:f2i             
	//  148  298:istore          8
			int i4 = h;
	//  149  300:aload_0         
	//  150  301:getfield        #111 <Field int h>
	//  151  304:istore          9
			j.setColor(i3 << 24 | i4 & 0xffffff);
	//  152  306:aload_0         
	//  153  307:getfield        #116 <Field Paint j>
	//  154  310:iload           8
	//  155  312:bipush          24
	//  156  314:ishl            
	//  157  315:iload           9
	//  158  317:ldc2            #569 <Int 0xffffff>
	//  159  320:iand            
	//  160  321:ior             
	//  161  322:invokevirtual   #572 <Method void Paint.setColor(int)>
			canvas.drawRect(i2, 0.0F, i1, getHeight(), j);
	//  162  325:aload_1         
	//  163  326:iload           7
	//  164  328:i2f             
	//  165  329:fconst_0        
	//  166  330:iload           6
	//  167  332:i2f             
	//  168  333:aload_0         
	//  169  334:invokevirtual   #542 <Method int getHeight()>
	//  170  337:i2f             
	//  171  338:aload_0         
	//  172  339:getfield        #116 <Field Paint j>
	//  173  342:invokevirtual   #576 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return flag1;
	//  174  345:iload           16
	//  175  347:ireturn         
		}
		if(C != null && a(view, 3))
	//* 176  348:aload_0         
	//* 177  349:getfield        #273 <Field Drawable C>
	//* 178  352:ifnull          454
	//* 179  355:aload_0         
	//* 180  356:aload_2         
	//* 181  357:iconst_3        
	//* 182  358:invokevirtual   #399 <Method boolean a(View, int)>
	//* 183  361:ifeq            454
		{
			int j1 = C.getIntrinsicWidth();
	//  184  364:aload_0         
	//  185  365:getfield        #273 <Field Drawable C>
	//  186  368:invokevirtual   #579 <Method int Drawable.getIntrinsicWidth()>
	//  187  371:istore          6
			int j2 = view.getRight();
	//  188  373:aload_2         
	//  189  374:invokevirtual   #555 <Method int View.getRight()>
	//  190  377:istore          7
			int j3 = k.b();
	//  191  379:aload_0         
	//  192  380:getfield        #173 <Field p k>
	//  193  383:invokevirtual   #581 <Method int p.b()>
	//  194  386:istore          8
			float f1 = Math.max(0.0F, Math.min((float)j2 / (float)j3, 1.0F));
	//  195  388:fconst_0        
	//  196  389:iload           7
	//  197  391:i2f             
	//  198  392:iload           8
	//  199  394:i2f             
	//  200  395:fdiv            
	//  201  396:fconst_1        
	//  202  397:invokestatic    #584 <Method float Math.min(float, float)>
	//  203  400:invokestatic    #512 <Method float Math.max(float, float)>
	//  204  403:fstore          5
			C.setBounds(j2, view.getTop(), j1 + j2, view.getBottom());
	//  205  405:aload_0         
	//  206  406:getfield        #273 <Field Drawable C>
	//  207  409:iload           7
	//  208  411:aload_2         
	//  209  412:invokevirtual   #402 <Method int View.getTop()>
	//  210  415:iload           6
	//  211  417:iload           7
	//  212  419:iadd            
	//  213  420:aload_2         
	//  214  421:invokevirtual   #587 <Method int View.getBottom()>
	//  215  424:invokevirtual   #591 <Method void Drawable.setBounds(int, int, int, int)>
			C.setAlpha((int)(f1 * 255F));
	//  216  427:aload_0         
	//  217  428:getfield        #273 <Field Drawable C>
	//  218  431:fload           5
	//  219  433:ldc2            #592 <Float 255F>
	//  220  436:fmul            
	//  221  437:f2i             
	//  222  438:invokevirtual   #595 <Method void Drawable.setAlpha(int)>
			view = ((View) (C));
	//  223  441:aload_0         
	//  224  442:getfield        #273 <Field Drawable C>
	//  225  445:astore_2        
		} else
	//* 226  446:aload_2         
	//* 227  447:aload_1         
	//* 228  448:invokevirtual   #599 <Method void Drawable.draw(Canvas)>
	//* 229  451:iload           16
	//* 230  453:ireturn         
		if(D != null && a(view, 5))
	//* 231  454:aload_0         
	//* 232  455:getfield        #277 <Field Drawable D>
	//* 233  458:ifnull          564
	//* 234  461:aload_0         
	//* 235  462:aload_2         
	//* 236  463:iconst_5        
	//* 237  464:invokevirtual   #399 <Method boolean a(View, int)>
	//* 238  467:ifeq            564
		{
			int k1 = D.getIntrinsicWidth();
	//  239  470:aload_0         
	//  240  471:getfield        #277 <Field Drawable D>
	//  241  474:invokevirtual   #579 <Method int Drawable.getIntrinsicWidth()>
	//  242  477:istore          6
			int k2 = view.getLeft();
	//  243  479:aload_2         
	//  244  480:invokevirtual   #558 <Method int View.getLeft()>
	//  245  483:istore          7
			int k3 = getWidth();
	//  246  485:aload_0         
	//  247  486:invokevirtual   #408 <Method int getWidth()>
	//  248  489:istore          8
			int j4 = l.b();
	//  249  491:aload_0         
	//  250  492:getfield        #183 <Field p l>
	//  251  495:invokevirtual   #581 <Method int p.b()>
	//  252  498:istore          9
			float f2 = Math.max(0.0F, Math.min((float)(k3 - k2) / (float)j4, 1.0F));
	//  253  500:fconst_0        
	//  254  501:iload           8
	//  255  503:iload           7
	//  256  505:isub            
	//  257  506:i2f             
	//  258  507:iload           9
	//  259  509:i2f             
	//  260  510:fdiv            
	//  261  511:fconst_1        
	//  262  512:invokestatic    #584 <Method float Math.min(float, float)>
	//  263  515:invokestatic    #512 <Method float Math.max(float, float)>
	//  264  518:fstore          5
			D.setBounds(k2 - k1, view.getTop(), k2, view.getBottom());
	//  265  520:aload_0         
	//  266  521:getfield        #277 <Field Drawable D>
	//  267  524:iload           7
	//  268  526:iload           6
	//  269  528:isub            
	//  270  529:aload_2         
	//  271  530:invokevirtual   #402 <Method int View.getTop()>
	//  272  533:iload           7
	//  273  535:aload_2         
	//  274  536:invokevirtual   #587 <Method int View.getBottom()>
	//  275  539:invokevirtual   #591 <Method void Drawable.setBounds(int, int, int, int)>
			D.setAlpha((int)(f2 * 255F));
	//  276  542:aload_0         
	//  277  543:getfield        #277 <Field Drawable D>
	//  278  546:fload           5
	//  279  548:ldc2            #592 <Float 255F>
	//  280  551:fmul            
	//  281  552:f2i             
	//  282  553:invokevirtual   #595 <Method void Drawable.setAlpha(int)>
			view = ((View) (D));
	//  283  556:aload_0         
	//  284  557:getfield        #277 <Field Drawable D>
	//  285  560:astore_2        
		} else
	//* 286  561:goto            446
		{
			return flag1;
	//  287  564:iload           16
	//  288  566:ireturn         
		}
		((Drawable) (view)).draw(canvas);
		return flag1;
	}

	int e(View view)
	{
		return android.support.v4.view.d.a(((LayoutParams)view.getLayoutParams()).a, android.support.v4.view.s.e(((View) (this))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//    4   10:aload_0         
	//    5   11:invokestatic    #280 <Method int s.e(View)>
	//    6   14:invokestatic    #342 <Method int d.a(int, int)>
	//    7   17:ireturn         
	}

	public void e(int i1)
	{
		a(i1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #601 <Method void a(int, boolean)>
	//    4    6:return          
	}

	public void f(int i1)
	{
		b(i1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #603 <Method void b(int, boolean)>
	//    4    6:return          
	}

	boolean f(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).a == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean g(int i1)
	{
		View view = c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #346 <Method View c(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return j(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #442 <Method boolean j(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	boolean g(View view)
	{
		int i1 = android.support.v4.view.d.a(((LayoutParams)view.getLayoutParams()).a, android.support.v4.view.s.e(view));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//    4   10:aload_1         
	//    5   11:invokestatic    #280 <Method int s.e(View)>
	//    6   14:invokestatic    #342 <Method int d.a(int, int)>
	//    7   17:istore_2        
		if((i1 & 3) != 0)
	//*   8   18:iload_2         
	//*   9   19:iconst_3        
	//*  10   20:iand            
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		return (i1 & 5) != 0;
	//   14   26:iload_2         
	//   15   27:iconst_5        
	//   16   28:iand            
	//   17   29:ifeq            34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(-1, -1)));
	//    0    0:new             #8   <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #607 <Method void DrawerLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #8   <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #613 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #614 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class DrawerLayout$LayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    3    7:new             #8   <Class DrawerLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//    7   15:invokespecial   #618 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #620 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #8   <Class DrawerLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #620 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #623 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   18   38:new             #8   <Class DrawerLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #626 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(d)
	//*   0    0:getstatic       #94  <Field boolean d>
	//*   1    3:ifeq            11
			return f;
	//    2    6:aload_0         
	//    3    7:getfield        #234 <Field float f>
	//    4   10:freturn         
		else
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field Drawable B>
	//    2    4:areturn         
	}

	public void h(View view)
	{
		a(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #383 <Method void a(View, boolean)>
	//    4    6:return          
	}

	public boolean h(int i1)
	{
		View view = c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #346 <Method View c(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return k(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #489 <Method boolean k(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public void i(View view)
	{
		b(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #470 <Method void b(View, boolean)>
	//    4    6:return          
	}

	public boolean j(View view)
	{
		if(!g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #258 <Method boolean g(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #309 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #310 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #312 <String "View ">
	//   10   20:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #321 <String " is not a drawer">
	//   18   34:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #323 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		return (((LayoutParams)view.getLayoutParams()).d & 1) == 1;
	//   26   50:aload_1         
	//   27   51:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   29   57:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//   30   60:iconst_1        
	//   31   61:iand            
	//   32   62:iconst_1        
	//   33   63:icmpne          68
	//   34   66:iconst_1        
	//   35   67:ireturn         
	//   36   68:iconst_0        
	//   37   69:ireturn         
	}

	public boolean k(View view)
	{
		if(!g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #258 <Method boolean g(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #309 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #310 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #312 <String "View ">
	//   10   20:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #321 <String " is not a drawer">
	//   18   34:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #323 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
	//   26   50:aload_1         
	//   27   51:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   29   57:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//   30   60:fconst_0        
	//   31   61:fcmpl           
	//   32   62:ifle            67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #632 <Method void ViewGroup.onAttachedToWindow()>
		q = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #118 <Field boolean q>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #635 <Method void ViewGroup.onDetachedFromWindow()>
		q = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #118 <Field boolean q>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #638 <Method void ViewGroup.onDraw(Canvas)>
		if(H && B != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #424 <Field boolean H>
	//*   5    9:ifeq            76
	//*   6   12:aload_0         
	//*   7   13:getfield        #228 <Field Drawable B>
	//*   8   16:ifnull          76
		{
			int i1;
			if(android.os.Build.VERSION.SDK_INT >= 21 && G != null)
	//*   9   19:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          21
	//*  11   24:icmplt          48
	//*  12   27:aload_0         
	//*  13   28:getfield        #422 <Field Object G>
	//*  14   31:ifnull          48
				i1 = ((WindowInsets)G).getSystemWindowInsetTop();
	//   15   34:aload_0         
	//   16   35:getfield        #422 <Field Object G>
	//   17   38:checkcast       #640 <Class WindowInsets>
	//   18   41:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//   19   44:istore_2        
			else
	//*  20   45:goto            50
				i1 = 0;
	//   21   48:iconst_0        
	//   22   49:istore_2        
			if(i1 > 0)
	//*  23   50:iload_2         
	//*  24   51:ifle            76
			{
				B.setBounds(0, 0, getWidth(), i1);
	//   25   54:aload_0         
	//   26   55:getfield        #228 <Field Drawable B>
	//   27   58:iconst_0        
	//   28   59:iconst_0        
	//   29   60:aload_0         
	//   30   61:invokevirtual   #408 <Method int getWidth()>
	//   31   64:iload_2         
	//   32   65:invokevirtual   #591 <Method void Drawable.setBounds(int, int, int, int)>
				B.draw(canvas);
	//   33   68:aload_0         
	//   34   69:getfield        #228 <Field Drawable B>
	//   35   72:aload_1         
	//   36   73:invokevirtual   #599 <Method void Drawable.draw(Canvas)>
			}
		}
	//   37   76:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #647 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		flag3 = k.a(motionevent);
	//    3    6:aload_0         
	//    4    7:getfield        #173 <Field p k>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #649 <Method boolean android.support.v4.widget.p.a(MotionEvent)>
	//    7   14:istore          7
		flag4 = l.a(motionevent);
	//    8   16:aload_0         
	//    9   17:getfield        #183 <Field p l>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #649 <Method boolean android.support.v4.widget.p.a(MotionEvent)>
	//   12   24:istore          8
		flag2 = true;
	//   13   26:iconst_1        
	//   14   27:istore          6
		i1;
	//   15   29:iload           4
		JVM INSTR tableswitch 0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91;
	//   16   31:tableswitch     0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   17   60:goto            184
_L4:
		if(k.d(3))
	//*  18   63:aload_0         
	//*  19   64:getfield        #173 <Field p k>
	//*  20   67:iconst_3        
	//*  21   68:invokevirtual   #651 <Method boolean android.support.v4.widget.p.d(int)>
	//*  22   71:ifeq            184
		{
			m.a();
	//   23   74:aload_0         
	//   24   75:getfield        #164 <Field DrawerLayout$d m>
	//   25   78:invokevirtual   #433 <Method void android.support.v4.widget.DrawerLayout$d.a()>
			n.a();
	//   26   81:aload_0         
	//   27   82:getfield        #166 <Field DrawerLayout$d n>
	//   28   85:invokevirtual   #433 <Method void android.support.v4.widget.DrawerLayout$d.a()>
		}
		break; /* Loop/switch isn't completed */
	//   29   88:goto            184
_L3:
		a(true);
	//   30   91:aload_0         
	//   31   92:iconst_1        
	//   32   93:invokevirtual   #468 <Method void a(boolean)>
		v = false;
	//   33   96:aload_0         
	//   34   97:iconst_0        
	//   35   98:putfield        #653 <Field boolean v>
		w = false;
	//   36  101:aload_0         
	//   37  102:iconst_0        
	//   38  103:putfield        #520 <Field boolean w>
		break; /* Loop/switch isn't completed */
	//   39  106:goto            184
_L2:
		float f1;
		float f2;
		f1 = motionevent.getX();
	//   40  109:aload_1         
	//   41  110:invokevirtual   #656 <Method float MotionEvent.getX()>
	//   42  113:fstore_2        
		f2 = motionevent.getY();
	//   43  114:aload_1         
	//   44  115:invokevirtual   #659 <Method float MotionEvent.getY()>
	//   45  118:fstore_3        
		z = f1;
	//   46  119:aload_0         
	//   47  120:fload_2         
	//   48  121:putfield        #661 <Field float z>
		A = f2;
	//   49  124:aload_0         
	//   50  125:fload_3         
	//   51  126:putfield        #663 <Field float A>
		if(i <= 0.0F) goto _L6; else goto _L5
	//   52  129:aload_0         
	//   53  130:getfield        #514 <Field float i>
	//   54  133:fconst_0        
	//   55  134:fcmpl           
	//   56  135:ifle            168
_L5:
		motionevent = ((MotionEvent) (k.d((int)f1, (int)f2)));
	//   57  138:aload_0         
	//   58  139:getfield        #173 <Field p k>
	//   59  142:fload_2         
	//   60  143:f2i             
	//   61  144:fload_3         
	//   62  145:f2i             
	//   63  146:invokevirtual   #666 <Method View android.support.v4.widget.p.d(int, int)>
	//   64  149:astore_1        
		if(motionevent == null || !f(((View) (motionevent)))) goto _L6; else goto _L7
	//   65  150:aload_1         
	//   66  151:ifnull          168
	//   67  154:aload_0         
	//   68  155:aload_1         
	//   69  156:invokevirtual   #544 <Method boolean f(View)>
	//   70  159:ifeq            168
_L7:
		boolean flag = true;
	//   71  162:iconst_1        
	//   72  163:istore          4
		  goto _L8
	//*  73  165:goto            171
_L6:
		flag = false;
	//   74  168:iconst_0        
	//   75  169:istore          4
_L8:
		v = false;
	//   76  171:aload_0         
	//   77  172:iconst_0        
	//   78  173:putfield        #653 <Field boolean v>
		w = false;
	//   79  176:aload_0         
	//   80  177:iconst_0        
	//   81  178:putfield        #520 <Field boolean w>
		break MISSING_BLOCK_LABEL_187;
	//   82  181:goto            187
		flag = false;
	//   83  184:iconst_0        
	//   84  185:istore          4
		boolean flag1 = flag2;
	//   85  187:iload           6
	//   86  189:istore          5
		if(!(flag3 | flag4))
	//*  87  191:iload           7
	//*  88  193:iload           8
	//*  89  195:ior             
	//*  90  196:ifne            231
		{
			flag1 = flag2;
	//   91  199:iload           6
	//   92  201:istore          5
			if(!flag)
	//*  93  203:iload           4
	//*  94  205:ifne            231
			{
				flag1 = flag2;
	//   95  208:iload           6
	//   96  210:istore          5
				if(!h())
	//*  97  212:aload_0         
	//*  98  213:invokespecial   #668 <Method boolean h()>
	//*  99  216:ifne            231
				{
					if(w)
	//* 100  219:aload_0         
	//* 101  220:getfield        #520 <Field boolean w>
	//* 102  223:ifeq            228
						return true;
	//  103  226:iconst_1        
	//  104  227:ireturn         
					flag1 = false;
	//  105  228:iconst_0        
	//  106  229:istore          5
				}
			}
		}
		return flag1;
	//  107  231:iload           5
	//  108  233:ireturn         
	}

	public boolean onKeyDown(int i1, KeyEvent keyevent)
	{
		if(i1 == 4 && i())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #672 <Method boolean i()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #677 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i1, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #679 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
	//   14   24:ireturn         
		}
	}

	public boolean onKeyUp(int i1, KeyEvent keyevent)
	{
		if(i1 == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          34
		{
			keyevent = ((KeyEvent) (c()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #294 <Method View c()>
	//    5    9:astore_2        
			if(keyevent != null && a(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #682 <Method int a(View)>
	//*  11   19:ifne            26
				b();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #684 <Method void b()>
			return keyevent != null;
	//   14   26:aload_2         
	//   15   27:ifnull          32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
		} else
		{
			return super.onKeyUp(i1, keyevent);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aload_2         
	//   23   37:invokespecial   #686 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		p = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #690 <Field boolean p>
		int k2 = k1 - i1;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		int l2 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #252 <Method int getChildCount()>
	//    9   15:istore          11
		for(k1 = 0; k1 < l2; k1++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           11
	//*  14   24:icmpge          442
		{
			View view = getChildAt(k1);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #256 <Method View getChildAt(int)>
	//   18   33:astore          15
			if(view.getVisibility() == 8)
	//*  19   35:aload           15
	//*  20   37:invokevirtual   #450 <Method int View.getVisibility()>
	//*  21   40:bipush          8
	//*  22   42:icmpne          48
				continue;
	//   23   45:goto            433
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   48:aload           15
	//   25   50:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   53:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   27   56:astore          16
			if(f(view))
	//*  28   58:aload_0         
	//*  29   59:aload           15
	//*  30   61:invokevirtual   #544 <Method boolean f(View)>
	//*  31   64:ifeq            107
			{
				view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
	//   32   67:aload           15
	//   33   69:aload           16
	//   34   71:getfield        #693 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   35   74:aload           16
	//   36   76:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//   37   79:aload           16
	//   38   81:getfield        #693 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   39   84:aload           15
	//   40   86:invokevirtual   #699 <Method int View.getMeasuredWidth()>
	//   41   89:iadd            
	//   42   90:aload           16
	//   43   92:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//   44   95:aload           15
	//   45   97:invokevirtual   #702 <Method int View.getMeasuredHeight()>
	//   46  100:iadd            
	//   47  101:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
				continue;
	//   48  104:goto            433
			}
			int i3 = view.getMeasuredWidth();
	//   49  107:aload           15
	//   50  109:invokevirtual   #699 <Method int View.getMeasuredWidth()>
	//   51  112:istore          12
			int j3 = view.getMeasuredHeight();
	//   52  114:aload           15
	//   53  116:invokevirtual   #702 <Method int View.getMeasuredHeight()>
	//   54  119:istore          13
			float f1;
			int i2;
			if(a(view, 3))
	//*  55  121:aload_0         
	//*  56  122:aload           15
	//*  57  124:iconst_3        
	//*  58  125:invokevirtual   #399 <Method boolean a(View, int)>
	//*  59  128:ifeq            167
			{
				i1 = -i3;
	//   60  131:iload           12
	//   61  133:ineg            
	//   62  134:istore_2        
				f1 = i3;
	//   63  135:iload           12
	//   64  137:i2f             
	//   65  138:fstore          6
				i2 = i1 + (int)(layoutparams.b * f1);
	//   66  140:iload_2         
	//   67  141:aload           16
	//   68  143:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//   69  146:fload           6
	//   70  148:fmul            
	//   71  149:f2i             
	//   72  150:iadd            
	//   73  151:istore          7
				f1 = (float)(i3 + i2) / f1;
	//   74  153:iload           12
	//   75  155:iload           7
	//   76  157:iadd            
	//   77  158:i2f             
	//   78  159:fload           6
	//   79  161:fdiv            
	//   80  162:fstore          6
			} else
	//*  81  164:goto            197
			{
				f1 = i3;
	//   82  167:iload           12
	//   83  169:i2f             
	//   84  170:fstore          6
				i2 = k2 - (int)(layoutparams.b * f1);
	//   85  172:iload           10
	//   86  174:aload           16
	//   87  176:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//   88  179:fload           6
	//   89  181:fmul            
	//   90  182:f2i             
	//   91  183:isub            
	//   92  184:istore          7
				f1 = (float)(k2 - i2) / f1;
	//   93  186:iload           10
	//   94  188:iload           7
	//   95  190:isub            
	//   96  191:i2f             
	//   97  192:fload           6
	//   98  194:fdiv            
	//   99  195:fstore          6
			}
			boolean flag1;
			if(f1 != layoutparams.b)
	//* 100  197:fload           6
	//* 101  199:aload           16
	//* 102  201:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//* 103  204:fcmpl           
	//* 104  205:ifeq            214
				flag1 = true;
	//  105  208:iconst_1        
	//  106  209:istore          8
			else
	//* 107  211:goto            217
				flag1 = false;
	//  108  214:iconst_0        
	//  109  215:istore          8
			i1 = layoutparams.a & 0x70;
	//  110  217:aload           16
	//  111  219:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//  112  222:bipush          112
	//  113  224:iand            
	//  114  225:istore_2        
			if(i1 != 16)
	//* 115  226:iload_2         
	//* 116  227:bipush          16
	//* 117  229:icmpeq          306
			{
				if(i1 != 80)
	//* 118  232:iload_2         
	//* 119  233:bipush          80
	//* 120  235:icmpeq          266
				{
					view.layout(i2, layoutparams.topMargin, i3 + i2, layoutparams.topMargin + j3);
	//  121  238:aload           15
	//  122  240:iload           7
	//  123  242:aload           16
	//  124  244:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//  125  247:iload           12
	//  126  249:iload           7
	//  127  251:iadd            
	//  128  252:aload           16
	//  129  254:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//  130  257:iload           13
	//  131  259:iadd            
	//  132  260:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
				} else
	//* 133  263:goto            388
				{
					i1 = l1 - j1;
	//  134  266:iload           5
	//  135  268:iload_3         
	//  136  269:isub            
	//  137  270:istore_2        
					view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
	//  138  271:aload           15
	//  139  273:iload           7
	//  140  275:iload_2         
	//  141  276:aload           16
	//  142  278:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  143  281:isub            
	//  144  282:aload           15
	//  145  284:invokevirtual   #702 <Method int View.getMeasuredHeight()>
	//  146  287:isub            
	//  147  288:iload           12
	//  148  290:iload           7
	//  149  292:iadd            
	//  150  293:iload_2         
	//  151  294:aload           16
	//  152  296:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  153  299:isub            
	//  154  300:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
				}
			} else
	//* 155  303:goto            388
			{
				int k3 = l1 - j1;
	//  156  306:iload           5
	//  157  308:iload_3         
	//  158  309:isub            
	//  159  310:istore          14
				int j2 = (k3 - j3) / 2;
	//  160  312:iload           14
	//  161  314:iload           13
	//  162  316:isub            
	//  163  317:iconst_2        
	//  164  318:idiv            
	//  165  319:istore          9
				if(j2 < layoutparams.topMargin)
	//* 166  321:iload           9
	//* 167  323:aload           16
	//* 168  325:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 169  328:icmpge          340
				{
					i1 = layoutparams.topMargin;
	//  170  331:aload           16
	//  171  333:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//  172  336:istore_2        
				} else
	//* 173  337:goto            371
				{
					i1 = j2;
	//  174  340:iload           9
	//  175  342:istore_2        
					if(j2 + j3 > k3 - layoutparams.bottomMargin)
	//* 176  343:iload           9
	//* 177  345:iload           13
	//* 178  347:iadd            
	//* 179  348:iload           14
	//* 180  350:aload           16
	//* 181  352:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 182  355:isub            
	//* 183  356:icmple          371
						i1 = k3 - layoutparams.bottomMargin - j3;
	//  184  359:iload           14
	//  185  361:aload           16
	//  186  363:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  187  366:isub            
	//  188  367:iload           13
	//  189  369:isub            
	//  190  370:istore_2        
				}
				view.layout(i2, i1, i3 + i2, j3 + i1);
	//  191  371:aload           15
	//  192  373:iload           7
	//  193  375:iload_2         
	//  194  376:iload           12
	//  195  378:iload           7
	//  196  380:iadd            
	//  197  381:iload           13
	//  198  383:iload_2         
	//  199  384:iadd            
	//  200  385:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
			}
			if(flag1)
	//* 201  388:iload           8
	//* 202  390:ifeq            401
				b(view, f1);
	//  203  393:aload_0         
	//  204  394:aload           15
	//  205  396:fload           6
	//  206  398:invokevirtual   #501 <Method void b(View, float)>
			if(layoutparams.b > 0.0F)
	//* 207  401:aload           16
	//* 208  403:getfield        #356 <Field float DrawerLayout$LayoutParams.b>
	//* 209  406:fconst_0        
	//* 210  407:fcmpl           
	//* 211  408:ifle            416
				i1 = 0;
	//  212  411:iconst_0        
	//  213  412:istore_2        
			else
	//* 214  413:goto            418
				i1 = 4;
	//  215  416:iconst_4        
	//  216  417:istore_2        
			if(view.getVisibility() != i1)
	//* 217  418:aload           15
	//* 218  420:invokevirtual   #450 <Method int View.getVisibility()>
	//* 219  423:iload_2         
	//* 220  424:icmpeq          433
				view.setVisibility(i1);
	//  221  427:aload           15
	//  222  429:iload_2         
	//  223  430:invokevirtual   #416 <Method void View.setVisibility(int)>
		}

	//  224  433:iload           4
	//  225  435:iconst_1        
	//  226  436:iadd            
	//  227  437:istore          4
	//* 228  439:goto            20
		p = false;
	//  229  442:aload_0         
	//  230  443:iconst_0        
	//  231  444:putfield        #690 <Field boolean p>
		q = false;
	//  232  447:aload_0         
	//  233  448:iconst_0        
	//  234  449:putfield        #118 <Field boolean q>
	//  235  452:return          
	}

	protected void onMeasure(int i1, int j1)
	{
label0:
		{
			int i2;
			int j2;
label1:
			{
				int l2 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #714 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
				int k2 = android.view.View.MeasureSpec.getMode(j1);
	//    3    6:iload_2         
	//    4    7:invokestatic    #714 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
				int k1 = android.view.View.MeasureSpec.getSize(i1);
	//    6   12:iload_1         
	//    7   13:invokestatic    #717 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore_3        
				int l1 = android.view.View.MeasureSpec.getSize(j1);
	//    9   17:iload_2         
	//   10   18:invokestatic    #717 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   21:istore          4
				if(l2 == 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #718 <Int 0x40000000>
	//*  14   28:icmpne          46
				{
					i2 = k1;
	//   15   31:iload_3         
	//   16   32:istore          5
					j2 = l1;
	//   17   34:iload           4
	//   18   36:istore          6
					if(k2 == 0x40000000)
						break label1;
	//   19   38:iload           7
	//   20   40:ldc2            #718 <Int 0x40000000>
	//   21   43:icmpeq          111
				}
				if(!isInEditMode())
					break label0;
	//   22   46:aload_0         
	//   23   47:invokevirtual   #721 <Method boolean isInEditMode()>
	//   24   50:ifeq            804
				if(l2 != 0x80000000 && l2 == 0)
	//*  25   53:iload           8
	//*  26   55:ldc2            #722 <Int 0x80000000>
	//*  27   58:icmpne          64
	//*  28   61:goto            73
	//*  29   64:iload           8
	//*  30   66:ifne            73
					k1 = 300;
	//   31   69:sipush          300
	//   32   72:istore_3        
				if(k2 == 0x80000000)
	//*  33   73:iload           7
	//*  34   75:ldc2            #722 <Int 0x80000000>
	//*  35   78:icmpne          91
				{
					i2 = k1;
	//   36   81:iload_3         
	//   37   82:istore          5
					j2 = l1;
	//   38   84:iload           4
	//   39   86:istore          6
				} else
	//*  40   88:goto            111
				{
					i2 = k1;
	//   41   91:iload_3         
	//   42   92:istore          5
					j2 = l1;
	//   43   94:iload           4
	//   44   96:istore          6
					if(k2 == 0)
	//*  45   98:iload           7
	//*  46  100:ifne            111
					{
						j2 = 300;
	//   47  103:sipush          300
	//   48  106:istore          6
						i2 = k1;
	//   49  108:iload_3         
	//   50  109:istore          5
					}
				}
			}
label2:
			{
				setMeasuredDimension(i2, j2);
	//   51  111:aload_0         
	//   52  112:iload           5
	//   53  114:iload           6
	//   54  116:invokevirtual   #725 <Method void setMeasuredDimension(int, int)>
				boolean flag2;
				if(G != null && android.support.v4.view.s.q(((View) (this))))
	//*  55  119:aload_0         
	//*  56  120:getfield        #422 <Field Object G>
	//*  57  123:ifnull          139
	//*  58  126:aload_0         
	//*  59  127:invokestatic    #206 <Method boolean s.q(View)>
	//*  60  130:ifeq            139
					flag2 = true;
	//   61  133:iconst_1        
	//   62  134:istore          7
				else
	//*  63  136:goto            142
					flag2 = false;
	//   64  139:iconst_0        
	//   65  140:istore          7
				int k3 = android.support.v4.view.s.e(((View) (this)));
	//   66  142:aload_0         
	//   67  143:invokestatic    #280 <Method int s.e(View)>
	//   68  146:istore          10
				int l3 = getChildCount();
	//   69  148:aload_0         
	//   70  149:invokevirtual   #252 <Method int getChildCount()>
	//   71  152:istore          11
				int i3 = 0;
	//   72  154:iconst_0        
	//   73  155:istore          8
				boolean flag1 = false;
	//   74  157:iconst_0        
	//   75  158:istore          4
				boolean flag = false;
	//   76  160:iconst_0        
	//   77  161:istore_3        
				View view;
				do
				{
					if(i3 >= l3)
						break label2;
	//   78  162:iload           8
	//   79  164:iload           11
	//   80  166:icmpge          803
					view = getChildAt(i3);
	//   81  169:aload_0         
	//   82  170:iload           8
	//   83  172:invokevirtual   #256 <Method View getChildAt(int)>
	//   84  175:astore          15
					if(view.getVisibility() != 8)
	//*  85  177:aload           15
	//*  86  179:invokevirtual   #450 <Method int View.getVisibility()>
	//*  87  182:bipush          8
	//*  88  184:icmpne          190
	//*  89  187:goto            494
					{
						LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   90  190:aload           15
	//   91  192:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   92  195:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   93  198:astore          16
						if(flag2)
	//*  94  200:iload           7
	//*  95  202:ifeq            440
						{
							int j3 = android.support.v4.view.d.a(layoutparams.a, k3);
	//   96  205:aload           16
	//   97  207:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//   98  210:iload           10
	//   99  212:invokestatic    #342 <Method int d.a(int, int)>
	//  100  215:istore          9
							if(android.support.v4.view.s.q(view))
	//* 101  217:aload           15
	//* 102  219:invokestatic    #206 <Method boolean s.q(View)>
	//* 103  222:ifeq            318
							{
								if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 104  225:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  228:bipush          21
	//* 106  230:icmplt          440
								{
									WindowInsets windowinsets2 = (WindowInsets)G;
	//  107  233:aload_0         
	//  108  234:getfield        #422 <Field Object G>
	//  109  237:checkcast       #640 <Class WindowInsets>
	//  110  240:astore          14
									WindowInsets windowinsets;
									if(j3 == 3)
	//* 111  242:iload           9
	//* 112  244:iconst_3        
	//* 113  245:icmpne          274
									{
										windowinsets = windowinsets2.replaceSystemWindowInsets(windowinsets2.getSystemWindowInsetLeft(), windowinsets2.getSystemWindowInsetTop(), 0, windowinsets2.getSystemWindowInsetBottom());
	//  114  248:aload           14
	//  115  250:aload           14
	//  116  252:invokevirtual   #728 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  117  255:aload           14
	//  118  257:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  119  260:iconst_0        
	//  120  261:aload           14
	//  121  263:invokevirtual   #731 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  122  266:invokevirtual   #735 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  123  269:astore          13
									} else
	//* 124  271:goto            307
									{
										windowinsets = windowinsets2;
	//  125  274:aload           14
	//  126  276:astore          13
										if(j3 == 5)
	//* 127  278:iload           9
	//* 128  280:iconst_5        
	//* 129  281:icmpne          307
											windowinsets = windowinsets2.replaceSystemWindowInsets(0, windowinsets2.getSystemWindowInsetTop(), windowinsets2.getSystemWindowInsetRight(), windowinsets2.getSystemWindowInsetBottom());
	//  130  284:aload           14
	//  131  286:iconst_0        
	//  132  287:aload           14
	//  133  289:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  134  292:aload           14
	//  135  294:invokevirtual   #738 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  136  297:aload           14
	//  137  299:invokevirtual   #731 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  138  302:invokevirtual   #735 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  139  305:astore          13
									}
									view.dispatchApplyWindowInsets(windowinsets);
	//  140  307:aload           15
	//  141  309:aload           13
	//  142  311:invokevirtual   #742 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//  143  314:pop             
								}
							} else
	//* 144  315:goto            440
							if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 145  318:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//* 146  321:bipush          21
	//* 147  323:icmplt          440
							{
								WindowInsets windowinsets3 = (WindowInsets)G;
	//  148  326:aload_0         
	//  149  327:getfield        #422 <Field Object G>
	//  150  330:checkcast       #640 <Class WindowInsets>
	//  151  333:astore          14
								WindowInsets windowinsets1;
								if(j3 == 3)
	//* 152  335:iload           9
	//* 153  337:iconst_3        
	//* 154  338:icmpne          367
								{
									windowinsets1 = windowinsets3.replaceSystemWindowInsets(windowinsets3.getSystemWindowInsetLeft(), windowinsets3.getSystemWindowInsetTop(), 0, windowinsets3.getSystemWindowInsetBottom());
	//  155  341:aload           14
	//  156  343:aload           14
	//  157  345:invokevirtual   #728 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  158  348:aload           14
	//  159  350:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  160  353:iconst_0        
	//  161  354:aload           14
	//  162  356:invokevirtual   #731 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  163  359:invokevirtual   #735 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  164  362:astore          13
								} else
	//* 165  364:goto            400
								{
									windowinsets1 = windowinsets3;
	//  166  367:aload           14
	//  167  369:astore          13
									if(j3 == 5)
	//* 168  371:iload           9
	//* 169  373:iconst_5        
	//* 170  374:icmpne          400
										windowinsets1 = windowinsets3.replaceSystemWindowInsets(0, windowinsets3.getSystemWindowInsetTop(), windowinsets3.getSystemWindowInsetRight(), windowinsets3.getSystemWindowInsetBottom());
	//  171  377:aload           14
	//  172  379:iconst_0        
	//  173  380:aload           14
	//  174  382:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  175  385:aload           14
	//  176  387:invokevirtual   #738 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  177  390:aload           14
	//  178  392:invokevirtual   #731 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  179  395:invokevirtual   #735 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  180  398:astore          13
								}
								layoutparams.leftMargin = windowinsets1.getSystemWindowInsetLeft();
	//  181  400:aload           16
	//  182  402:aload           13
	//  183  404:invokevirtual   #728 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  184  407:putfield        #693 <Field int DrawerLayout$LayoutParams.leftMargin>
								layoutparams.topMargin = windowinsets1.getSystemWindowInsetTop();
	//  185  410:aload           16
	//  186  412:aload           13
	//  187  414:invokevirtual   #643 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  188  417:putfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
								layoutparams.rightMargin = windowinsets1.getSystemWindowInsetRight();
	//  189  420:aload           16
	//  190  422:aload           13
	//  191  424:invokevirtual   #738 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  192  427:putfield        #745 <Field int DrawerLayout$LayoutParams.rightMargin>
								layoutparams.bottomMargin = windowinsets1.getSystemWindowInsetBottom();
	//  193  430:aload           16
	//  194  432:aload           13
	//  195  434:invokevirtual   #731 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  196  437:putfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
							}
						}
						if(f(view))
	//* 197  440:aload_0         
	//* 198  441:aload           15
	//* 199  443:invokevirtual   #544 <Method boolean f(View)>
	//* 200  446:ifeq            497
						{
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
	//  201  449:aload           15
	//  202  451:iload           5
	//  203  453:aload           16
	//  204  455:getfield        #693 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  205  458:isub            
	//  206  459:aload           16
	//  207  461:getfield        #745 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  208  464:isub            
	//  209  465:ldc2            #718 <Int 0x40000000>
	//  210  468:invokestatic    #748 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  471:iload           6
	//  212  473:aload           16
	//  213  475:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//  214  478:isub            
	//  215  479:aload           16
	//  216  481:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  217  484:isub            
	//  218  485:ldc2            #718 <Int 0x40000000>
	//  219  488:invokestatic    #748 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  220  491:invokevirtual   #751 <Method void View.measure(int, int)>
						} else
	//* 221  494:goto            720
						{
							if(!g(view))
								break;
	//  222  497:aload_0         
	//  223  498:aload           15
	//  224  500:invokevirtual   #258 <Method boolean g(View)>
	//  225  503:ifeq            729
							if(d && android.support.v4.view.s.l(view) != f)
	//* 226  506:getstatic       #94  <Field boolean d>
	//* 227  509:ifeq            534
	//* 228  512:aload           15
	//* 229  514:invokestatic    #753 <Method float s.l(View)>
	//* 230  517:aload_0         
	//* 231  518:getfield        #234 <Field float f>
	//* 232  521:fcmpl           
	//* 233  522:ifeq            534
								android.support.v4.view.s.a(view, f);
	//  234  525:aload           15
	//  235  527:aload_0         
	//  236  528:getfield        #234 <Field float f>
	//  237  531:invokestatic    #754 <Method void s.a(View, float)>
							int i4 = e(view) & 7;
	//  238  534:aload_0         
	//  239  535:aload           15
	//  240  537:invokevirtual   #434 <Method int e(View)>
	//  241  540:bipush          7
	//  242  542:iand            
	//  243  543:istore          12
							boolean flag3;
							if(i4 == 3)
	//* 244  545:iload           12
	//* 245  547:iconst_3        
	//* 246  548:icmpne          557
								flag3 = true;
	//  247  551:iconst_1        
	//  248  552:istore          9
							else
	//* 249  554:goto            560
								flag3 = false;
	//  250  557:iconst_0        
	//  251  558:istore          9
							if(flag3 && flag1 || !flag3 && flag)
	//* 252  560:iload           9
	//* 253  562:ifeq            570
	//* 254  565:iload           4
	//* 255  567:ifne            579
	//* 256  570:iload           9
	//* 257  572:ifne            657
	//* 258  575:iload_3         
	//* 259  576:ifeq            657
							{
								StringBuilder stringbuilder = new StringBuilder();
	//  260  579:new             #309 <Class StringBuilder>
	//  261  582:dup             
	//  262  583:invokespecial   #310 <Method void StringBuilder()>
	//  263  586:astore          13
								stringbuilder.append("Child drawer has absolute gravity ");
	//  264  588:aload           13
	//  265  590:ldc2            #756 <String "Child drawer has absolute gravity ">
	//  266  593:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  267  596:pop             
								stringbuilder.append(d(i4));
	//  268  597:aload           13
	//  269  599:iload           12
	//  270  601:invokestatic    #381 <Method String d(int)>
	//  271  604:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  272  607:pop             
								stringbuilder.append(" but this ");
	//  273  608:aload           13
	//  274  610:ldc2            #758 <String " but this ">
	//  275  613:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  276  616:pop             
								stringbuilder.append("DrawerLayout");
	//  277  617:aload           13
	//  278  619:ldc2            #760 <String "DrawerLayout">
	//  279  622:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  280  625:pop             
								stringbuilder.append(" already has a ");
	//  281  626:aload           13
	//  282  628:ldc2            #762 <String " already has a ">
	//  283  631:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  284  634:pop             
								stringbuilder.append("drawer view along that edge");
	//  285  635:aload           13
	//  286  637:ldc2            #764 <String "drawer view along that edge">
	//  287  640:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  288  643:pop             
								throw new IllegalStateException(stringbuilder.toString());
	//  289  644:new             #766 <Class IllegalStateException>
	//  290  647:dup             
	//  291  648:aload           13
	//  292  650:invokevirtual   #327 <Method String StringBuilder.toString()>
	//  293  653:invokespecial   #767 <Method void IllegalStateException(String)>
	//  294  656:athrow          
							}
							if(flag3)
	//* 295  657:iload           9
	//* 296  659:ifeq            668
								flag1 = true;
	//  297  662:iconst_1        
	//  298  663:istore          4
							else
	//* 299  665:goto            670
								flag = true;
	//  300  668:iconst_1        
	//  301  669:istore_3        
							view.measure(getChildMeasureSpec(i1, g + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
	//  302  670:aload           15
	//  303  672:iload_1         
	//  304  673:aload_0         
	//  305  674:getfield        #158 <Field int g>
	//  306  677:aload           16
	//  307  679:getfield        #693 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  308  682:iadd            
	//  309  683:aload           16
	//  310  685:getfield        #745 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  311  688:iadd            
	//  312  689:aload           16
	//  313  691:getfield        #770 <Field int DrawerLayout$LayoutParams.width>
	//  314  694:invokestatic    #774 <Method int getChildMeasureSpec(int, int, int)>
	//  315  697:iload_2         
	//  316  698:aload           16
	//  317  700:getfield        #696 <Field int DrawerLayout$LayoutParams.topMargin>
	//  318  703:aload           16
	//  319  705:getfield        #708 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  320  708:iadd            
	//  321  709:aload           16
	//  322  711:getfield        #777 <Field int DrawerLayout$LayoutParams.height>
	//  323  714:invokestatic    #774 <Method int getChildMeasureSpec(int, int, int)>
	//  324  717:invokevirtual   #751 <Method void View.measure(int, int)>
						}
					}
					i3++;
	//  325  720:iload           8
	//  326  722:iconst_1        
	//  327  723:iadd            
	//  328  724:istore          8
				} while(true);
	//  329  726:goto            162
				StringBuilder stringbuilder1 = new StringBuilder();
	//  330  729:new             #309 <Class StringBuilder>
	//  331  732:dup             
	//  332  733:invokespecial   #310 <Method void StringBuilder()>
	//  333  736:astore          13
				stringbuilder1.append("Child ");
	//  334  738:aload           13
	//  335  740:ldc2            #779 <String "Child ">
	//  336  743:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  337  746:pop             
				stringbuilder1.append(((Object) (view)));
	//  338  747:aload           13
	//  339  749:aload           15
	//  340  751:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//  341  754:pop             
				stringbuilder1.append(" at index ");
	//  342  755:aload           13
	//  343  757:ldc2            #781 <String " at index ">
	//  344  760:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  345  763:pop             
				stringbuilder1.append(i3);
	//  346  764:aload           13
	//  347  766:iload           8
	//  348  768:invokevirtual   #784 <Method StringBuilder StringBuilder.append(int)>
	//  349  771:pop             
				stringbuilder1.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
	//  350  772:aload           13
	//  351  774:ldc2            #786 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  352  777:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  353  780:pop             
				stringbuilder1.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
	//  354  781:aload           13
	//  355  783:ldc2            #788 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  356  786:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  357  789:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//  358  790:new             #766 <Class IllegalStateException>
	//  359  793:dup             
	//  360  794:aload           13
	//  361  796:invokevirtual   #327 <Method String StringBuilder.toString()>
	//  362  799:invokespecial   #767 <Method void IllegalStateException(String)>
	//  363  802:athrow          
			}
			return;
	//  364  803:return          
		}
		throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//  365  804:new             #323 <Class IllegalArgumentException>
	//  366  807:dup             
	//  367  808:ldc2            #790 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//  368  811:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//  369  814:athrow          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #11  <Class DrawerLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #794 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #11  <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #797 <Method Parcelable android.support.v4.widget.DrawerLayout$SavedState.a()>
	//   13   23:invokespecial   #794 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).a != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #798 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
	//*  16   30:ifeq            51
		{
			View view = c(((SavedState) (parcelable)).a);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #798 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
	//   20   38:invokevirtual   #346 <Method View c(int)>
	//   21   41:astore_2        
			if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
				h(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #349 <Method void h(View)>
		}
		if(((SavedState) (parcelable)).b != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #800 <Field int DrawerLayout$SavedState.b>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
			a(((SavedState) (parcelable)).b, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #800 <Field int DrawerLayout$SavedState.b>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #802 <Method void a(int, int)>
		if(((SavedState) (parcelable)).c != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #804 <Field int DrawerLayout$SavedState.c>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
			a(((SavedState) (parcelable)).c, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #804 <Field int DrawerLayout$SavedState.c>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #802 <Method void a(int, int)>
		if(((SavedState) (parcelable)).e != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #806 <Field int DrawerLayout$SavedState.e>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          104
			a(((SavedState) (parcelable)).e, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #806 <Field int DrawerLayout$SavedState.e>
	//   52   98:ldc2            #306 <Int 0x800003>
	//   53  101:invokevirtual   #802 <Method void a(int, int)>
		if(((SavedState) (parcelable)).f != 3)
	//*  54  104:aload_1         
	//*  55  105:getfield        #808 <Field int DrawerLayout$SavedState.f>
	//*  56  108:iconst_3        
	//*  57  109:icmpeq          123
			a(((SavedState) (parcelable)).f, 0x800005);
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:getfield        #808 <Field int DrawerLayout$SavedState.f>
	//   61  117:ldc2            #307 <Int 0x800005>
	//   62  120:invokevirtual   #802 <Method void a(int, int)>
	//   63  123:return          
	}

	public void onRtlPropertiesChanged(int i1)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #810 <Method void e()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate;
label0:
		{
			savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #11  <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #813 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #815 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
			int k1 = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #252 <Method int getChildCount()>
	//    8   17:istore          4
			int i1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
			LayoutParams layoutparams;
			do
			{
				if(i1 >= k1)
					break label0;
	//   11   21:iload_1         
	//   12   22:iload           4
	//   13   24:icmpge          102
				layoutparams = (LayoutParams)getChildAt(i1).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #256 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #289 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #8   <Class DrawerLayout$LayoutParams>
	//   19   38:astore          6
				int j1 = layoutparams.d;
	//   20   40:aload           6
	//   21   42:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//   22   45:istore_2        
				boolean flag1 = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				boolean flag;
				if(j1 == 1)
	//*  25   48:iload_2         
	//*  26   49:iconst_1        
	//*  27   50:icmpne          58
					flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_2        
				else
	//*  30   55:goto            60
					flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_2        
				if(layoutparams.d != 2)
	//*  33   60:aload           6
	//*  34   62:getfield        #336 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.d>
	//*  35   65:iconst_2        
	//*  36   66:icmpne          72
	//*  37   69:goto            74
					flag1 = false;
	//   38   72:iconst_0        
	//   39   73:istore_3        
				if(flag || flag1)
	//*  40   74:iload_2         
	//*  41   75:ifne            92
	//*  42   78:iload_3         
	//*  43   79:ifeq            85
					break;
	//   44   82:goto            92
				i1++;
	//   45   85:iload_1         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_1        
			} while(true);
	//   49   89:goto            21
			savedstate.a = layoutparams.a;
	//   50   92:aload           5
	//   51   94:aload           6
	//   52   96:getfield        #332 <Field int android.support.v4.widget.DrawerLayout$LayoutParams.a>
	//   53   99:putfield        #798 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
		}
		savedstate.b = r;
	//   54  102:aload           5
	//   55  104:aload_0         
	//   56  105:getfield        #120 <Field int r>
	//   57  108:putfield        #800 <Field int DrawerLayout$SavedState.b>
		savedstate.c = s;
	//   58  111:aload           5
	//   59  113:aload_0         
	//   60  114:getfield        #122 <Field int s>
	//   61  117:putfield        #804 <Field int DrawerLayout$SavedState.c>
		savedstate.e = t;
	//   62  120:aload           5
	//   63  122:aload_0         
	//   64  123:getfield        #124 <Field int t>
	//   65  126:putfield        #806 <Field int DrawerLayout$SavedState.e>
		savedstate.f = u;
	//   66  129:aload           5
	//   67  131:aload_0         
	//   68  132:getfield        #126 <Field int u>
	//   69  135:putfield        #808 <Field int DrawerLayout$SavedState.f>
		return ((Parcelable) (savedstate));
	//   70  138:aload           5
	//   71  140:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1;
		k.b(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field p k>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #819 <Method void p.b(MotionEvent)>
		l.b(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #183 <Field p l>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #819 <Method void p.b(MotionEvent)>
		i1 = motionevent.getAction() & 0xff;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #822 <Method int MotionEvent.getAction()>
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:istore          4
		if(i1 == 3) goto _L2; else goto _L1
	//   13   26:iload           4
	//   14   28:iconst_3        
	//   15   29:icmpeq          207
_L1:
		i1;
	//   16   32:iload           4
		JVM INSTR tableswitch 0 1: default 56
	//	               0 175
	//	               1 58;
	//   17   34:tableswitch     0 1: default 56
	//	               0 175
	//	               1 58
		   goto _L3 _L4 _L5
_L3:
		return true;
	//   18   56:iconst_1        
	//   19   57:ireturn         
_L5:
		float f1;
		float f3;
		f3 = motionevent.getX();
	//   20   58:aload_1         
	//   21   59:invokevirtual   #656 <Method float MotionEvent.getX()>
	//   22   62:fstore_3        
		f1 = motionevent.getY();
	//   23   63:aload_1         
	//   24   64:invokevirtual   #659 <Method float MotionEvent.getY()>
	//   25   67:fstore_2        
		motionevent = ((MotionEvent) (k.d((int)f3, (int)f1)));
	//   26   68:aload_0         
	//   27   69:getfield        #173 <Field p k>
	//   28   72:fload_3         
	//   29   73:f2i             
	//   30   74:fload_2         
	//   31   75:f2i             
	//   32   76:invokevirtual   #666 <Method View android.support.v4.widget.p.d(int, int)>
	//   33   79:astore_1        
		if(motionevent == null || !f(((View) (motionevent)))) goto _L7; else goto _L6
	//   34   80:aload_1         
	//   35   81:ifnull          159
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #544 <Method boolean f(View)>
	//   39   89:ifeq            159
_L6:
		f3 -= z;
	//   40   92:fload_3         
	//   41   93:aload_0         
	//   42   94:getfield        #661 <Field float z>
	//   43   97:fsub            
	//   44   98:fstore_3        
		f1 -= A;
	//   45   99:fload_2         
	//   46  100:aload_0         
	//   47  101:getfield        #663 <Field float A>
	//   48  104:fsub            
	//   49  105:fstore_2        
		i1 = k.d();
	//   50  106:aload_0         
	//   51  107:getfield        #173 <Field p k>
	//   52  110:invokevirtual   #824 <Method int android.support.v4.widget.p.d()>
	//   53  113:istore          4
		if(f3 * f3 + f1 * f1 >= (float)(i1 * i1)) goto _L7; else goto _L8
	//   54  115:fload_3         
	//   55  116:fload_3         
	//   56  117:fmul            
	//   57  118:fload_2         
	//   58  119:fload_2         
	//   59  120:fmul            
	//   60  121:fadd            
	//   61  122:iload           4
	//   62  124:iload           4
	//   63  126:imul            
	//   64  127:i2f             
	//   65  128:fcmpg           
	//   66  129:ifge            159
_L8:
		motionevent = ((MotionEvent) (a()));
	//   67  132:aload_0         
	//   68  133:invokevirtual   #461 <Method View a()>
	//   69  136:astore_1        
		if(motionevent != null && a(((View) (motionevent))) != 2) goto _L9; else goto _L7
	//   70  137:aload_1         
	//   71  138:ifnull          159
	//   72  141:aload_0         
	//   73  142:aload_1         
	//   74  143:invokevirtual   #682 <Method int a(View)>
	//   75  146:iconst_2        
	//   76  147:icmpne          153
	//*  77  150:goto            159
_L9:
		boolean flag = false;
	//   78  153:iconst_0        
	//   79  154:istore          5
		  goto _L10
	//*  80  156:goto            162
_L7:
		flag = true;
	//   81  159:iconst_1        
	//   82  160:istore          5
_L10:
		a(flag);
	//   83  162:aload_0         
	//   84  163:iload           5
	//   85  165:invokevirtual   #468 <Method void a(boolean)>
		v = false;
	//   86  168:aload_0         
	//   87  169:iconst_0        
	//   88  170:putfield        #653 <Field boolean v>
		return true;
	//   89  173:iconst_1        
	//   90  174:ireturn         
_L4:
		float f2 = motionevent.getX();
	//   91  175:aload_1         
	//   92  176:invokevirtual   #656 <Method float MotionEvent.getX()>
	//   93  179:fstore_2        
		float f4 = motionevent.getY();
	//   94  180:aload_1         
	//   95  181:invokevirtual   #659 <Method float MotionEvent.getY()>
	//   96  184:fstore_3        
		z = f2;
	//   97  185:aload_0         
	//   98  186:fload_2         
	//   99  187:putfield        #661 <Field float z>
		A = f4;
	//  100  190:aload_0         
	//  101  191:fload_3         
	//  102  192:putfield        #663 <Field float A>
_L12:
		v = false;
	//  103  195:aload_0         
	//  104  196:iconst_0        
	//  105  197:putfield        #653 <Field boolean v>
		w = false;
	//  106  200:aload_0         
	//  107  201:iconst_0        
	//  108  202:putfield        #520 <Field boolean w>
		return true;
	//  109  205:iconst_1        
	//  110  206:ireturn         
_L2:
		a(true);
	//  111  207:aload_0         
	//  112  208:iconst_1        
	//  113  209:invokevirtual   #468 <Method void a(boolean)>
		if(true) goto _L12; else goto _L11
	//  114  212:goto            195
_L11:
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #827 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		v = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #653 <Field boolean v>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			a(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #468 <Method void a(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #690 <Field boolean p>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #828 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setDrawerElevation(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #234 <Field float f>
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #252 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i1);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #256 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(g(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #258 <Method boolean g(View)>
	//*  16   26:ifeq            37
				android.support.v4.view.s.a(view, f);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #234 <Field float f>
	//   20   34:invokestatic    #754 <Method void s.a(View, float)>
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
	//   26   44:return          
	}

	public void setDrawerListener(c c1)
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #833 <Field DrawerLayout$c x>
	//*   2    4:ifnull          15
			b(x);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #833 <Field DrawerLayout$c x>
	//    6   12:invokevirtual   #835 <Method void b(DrawerLayout$c)>
		if(c1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			a(c1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #837 <Method void a(DrawerLayout$c)>
		x = c1;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #833 <Field DrawerLayout$c x>
	//   15   29:return          
	}

	public void setDrawerLockMode(int i1)
	{
		a(i1, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #802 <Method void a(int, int)>
		a(i1, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #802 <Method void a(int, int)>
	//    8   12:return          
	}

	public void setScrimColor(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field int h>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #419 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackground(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = android.support.v4.content.a.getDrawable(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #613 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #846 <Method Drawable android.support.v4.content.a.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		B = drawable;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #228 <Field Drawable B>
		invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #419 <Method void invalidate()>
	//   15   27:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		B = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #228 <Field Drawable B>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #419 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i1)
	{
		B = ((Drawable) (new ColorDrawable(i1)));
	//    0    0:aload_0         
	//    1    1:new             #850 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #852 <Method void ColorDrawable(int)>
	//    5    9:putfield        #228 <Field Drawable B>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #419 <Method void invalidate()>
	//    8   16:return          
	}

	static final int a[] = {
		0x10100b3
	};
	static final boolean b;
	private static final int c[] = {
		0x1010434
	};
	private static final boolean d;
	private float A;
	private Drawable B;
	private Drawable C;
	private Drawable D;
	private CharSequence E;
	private CharSequence F;
	private Object G;
	private boolean H;
	private Drawable I;
	private Drawable J;
	private Drawable K;
	private Drawable L;
	private final ArrayList M;
	private final b e;
	private float f;
	private int g;
	private int h;
	private float i;
	private Paint j;
	private final p k;
	private final p l;
	private final d m;
	private final d n;
	private int o;
	private boolean p;
	private boolean q;
	private int r;
	private int s;
	private int t;
	private int u;
	private boolean v;
	private boolean w;
	private c x;
	private List y;
	private float z;

	static 
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:ldc1            #80  <Int 0x1010434>
	//    7    9:iastore         
	//    8   10:putstatic       #82  <Field int[] c>
	//    9   13:iconst_1        
	//   10   14:newarray        int[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:ldc1            #83  <Int 0x10100b3>
	//   14   20:iastore         
	//   15   21:putstatic       #85  <Field int[] a>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   24:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   27:bipush          19
	//*  18   29:icmplt          37
			flag = true;
	//   19   32:iconst_1        
	//   20   33:istore_0        
		else
	//*  21   34:goto            39
			flag = false;
	//   22   37:iconst_0        
	//   23   38:istore_0        
		b = flag;
	//   24   39:iload_0         
	//   25   40:putstatic       #92  <Field boolean b>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   43:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   46:bipush          21
	//*  28   48:icmplt          56
			flag = flag1;
	//   29   51:iload_1         
	//   30   52:istore_0        
		else
	//*  31   53:goto            58
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_0        
		d = flag;
	//   34   58:iload_0         
	//   35   59:putstatic       #94  <Field boolean d>
	//*  36   62:return          
	}

	// Unreferenced inner class android/support/v4/widget/DrawerLayout$d$1

/* anonymous class */
	class d._cls1
		implements Runnable
	{

		public void run()
		{
			a.b();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field DrawerLayout$d a>
		//    2    4:invokevirtual   #25  <Method void DrawerLayout$d.b()>
		//    3    7:return          
		}

		final d a;

			
			{
				a = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawerLayout$d a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
