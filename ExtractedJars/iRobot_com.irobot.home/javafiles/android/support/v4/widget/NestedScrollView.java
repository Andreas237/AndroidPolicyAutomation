// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.a.f;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			g

public class NestedScrollView extends FrameLayout
	implements j, l
{
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
			stringbuilder.append(a);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #33  <Field int a>
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

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #72  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int a>
		//    7   11:invokevirtual   #76  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class NestedScrollView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void NestedScrollView$SavedState(Parcel)>
			//    4    8:areturn         
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
			//    2    2:invokevirtual   #27  <Method NestedScrollView$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method NestedScrollView$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		public int a;

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
			a = parcel.readInt();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
		//    6   10:putfield        #33  <Field int a>
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

	static class a extends android.support.v4.view.a
	{

		public void a(View view, android.support.v4.view.a.b b1)
		{
			super.a(view, b1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			view = ((View) ((NestedScrollView)view));
		//    4    6:aload_1         
		//    5    7:checkcast       #6   <Class NestedScrollView>
		//    6   10:astore_1        
			b1.b(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
		//    7   11:aload_2         
		//    8   12:ldc1            #17  <Class ScrollView>
		//    9   14:invokevirtual   #23  <Method String Class.getName()>
		//   10   17:invokevirtual   #29  <Method void android.support.v4.view.a.b.b(CharSequence)>
			if(((NestedScrollView) (view)).isEnabled())
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #33  <Method boolean NestedScrollView.isEnabled()>
		//*  13   24:ifeq            70
			{
				int i1 = ((NestedScrollView) (view)).getScrollRange();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
		//   16   31:istore_3        
				if(i1 > 0)
		//*  17   32:iload_3         
		//*  18   33:ifle            70
				{
					b1.k(true);
		//   19   36:aload_2         
		//   20   37:iconst_1        
		//   21   38:invokevirtual   #41  <Method void android.support.v4.view.a.b.k(boolean)>
					if(((NestedScrollView) (view)).getScrollY() > 0)
		//*  22   41:aload_1         
		//*  23   42:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//*  24   45:ifle            55
						b1.a(8192);
		//   25   48:aload_2         
		//   26   49:sipush          8192
		//   27   52:invokevirtual   #47  <Method void android.support.v4.view.a.b.a(int)>
					if(((NestedScrollView) (view)).getScrollY() < i1)
		//*  28   55:aload_1         
		//*  29   56:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//*  30   59:iload_3         
		//*  31   60:icmpge          70
						b1.a(4096);
		//   32   63:aload_2         
		//   33   64:sipush          4096
		//   34   67:invokevirtual   #47  <Method void android.support.v4.view.a.b.a(int)>
				}
			}
		//   35   70:return          
		}

		public void a(View view, AccessibilityEvent accessibilityevent)
		{
			super.a(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #50  <Method void android.support.v4.view.a.a(View, AccessibilityEvent)>
			view = ((View) ((NestedScrollView)view));
		//    4    6:aload_1         
		//    5    7:checkcast       #6   <Class NestedScrollView>
		//    6   10:astore_1        
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
		//    7   11:aload_2         
		//    8   12:ldc1            #17  <Class ScrollView>
		//    9   14:invokevirtual   #23  <Method String Class.getName()>
		//   10   17:invokevirtual   #55  <Method void AccessibilityEvent.setClassName(CharSequence)>
			boolean flag;
			if(((NestedScrollView) (view)).getScrollRange() > 0)
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
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
		//   21   36:invokevirtual   #58  <Method void AccessibilityEvent.setScrollable(boolean)>
			accessibilityevent.setScrollX(((NestedScrollView) (view)).getScrollX());
		//   22   39:aload_2         
		//   23   40:aload_1         
		//   24   41:invokevirtual   #61  <Method int NestedScrollView.getScrollX()>
		//   25   44:invokevirtual   #64  <Method void AccessibilityEvent.setScrollX(int)>
			accessibilityevent.setScrollY(((NestedScrollView) (view)).getScrollY());
		//   26   47:aload_2         
		//   27   48:aload_1         
		//   28   49:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//   29   52:invokevirtual   #67  <Method void AccessibilityEvent.setScrollY(int)>
			android.support.v4.view.a.f.a(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollX());
		//   30   55:aload_2         
		//   31   56:aload_1         
		//   32   57:invokevirtual   #61  <Method int NestedScrollView.getScrollX()>
		//   33   60:invokestatic    #72  <Method void f.a(android.view.accessibility.AccessibilityRecord, int)>
			android.support.v4.view.a.f.b(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollRange());
		//   34   63:aload_2         
		//   35   64:aload_1         
		//   36   65:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
		//   37   68:invokestatic    #74  <Method void f.b(android.view.accessibility.AccessibilityRecord, int)>
		//   38   71:return          
		}

		public boolean a(View view, int i1, Bundle bundle)
		{
			if(super.a(view, i1, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #77  <Method boolean android.support.v4.view.a.a(View, int, Bundle)>
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
		//*  12   18:invokevirtual   #33  <Method boolean NestedScrollView.isEnabled()>
		//*  13   21:ifne            26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			if(i1 != 4096)
		//*  16   26:iload_2         
		//*  17   27:sipush          4096
		//*  18   30:icmpeq          94
			{
				if(i1 != 8192)
		//*  19   33:iload_2         
		//*  20   34:sipush          8192
		//*  21   37:icmpeq          42
					return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
				i1 = ((NestedScrollView) (view)).getHeight();
		//   24   42:aload_1         
		//   25   43:invokevirtual   #80  <Method int NestedScrollView.getHeight()>
		//   26   46:istore_2        
				int j1 = ((NestedScrollView) (view)).getPaddingBottom();
		//   27   47:aload_1         
		//   28   48:invokevirtual   #83  <Method int NestedScrollView.getPaddingBottom()>
		//   29   51:istore          4
				int l1 = ((NestedScrollView) (view)).getPaddingTop();
		//   30   53:aload_1         
		//   31   54:invokevirtual   #86  <Method int NestedScrollView.getPaddingTop()>
		//   32   57:istore          5
				i1 = Math.max(((NestedScrollView) (view)).getScrollY() - (i1 - j1 - l1), 0);
		//   33   59:aload_1         
		//   34   60:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//   35   63:iload_2         
		//   36   64:iload           4
		//   37   66:isub            
		//   38   67:iload           5
		//   39   69:isub            
		//   40   70:isub            
		//   41   71:iconst_0        
		//   42   72:invokestatic    #92  <Method int Math.max(int, int)>
		//   43   75:istore_2        
				if(i1 != ((NestedScrollView) (view)).getScrollY())
		//*  44   76:iload_2         
		//*  45   77:aload_1         
		//*  46   78:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//*  47   81:icmpeq          92
				{
					((NestedScrollView) (view)).c(0, i1);
		//   48   84:aload_1         
		//   49   85:iconst_0        
		//   50   86:iload_2         
		//   51   87:invokevirtual   #96  <Method void NestedScrollView.c(int, int)>
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
			i1 = ((NestedScrollView) (view)).getHeight();
		//   56   94:aload_1         
		//   57   95:invokevirtual   #80  <Method int NestedScrollView.getHeight()>
		//   58   98:istore_2        
			int k1 = ((NestedScrollView) (view)).getPaddingBottom();
		//   59   99:aload_1         
		//   60  100:invokevirtual   #83  <Method int NestedScrollView.getPaddingBottom()>
		//   61  103:istore          4
			int i2 = ((NestedScrollView) (view)).getPaddingTop();
		//   62  105:aload_1         
		//   63  106:invokevirtual   #86  <Method int NestedScrollView.getPaddingTop()>
		//   64  109:istore          5
			i1 = Math.min(((NestedScrollView) (view)).getScrollY() + (i1 - k1 - i2), ((NestedScrollView) (view)).getScrollRange());
		//   65  111:aload_1         
		//   66  112:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//   67  115:iload_2         
		//   68  116:iload           4
		//   69  118:isub            
		//   70  119:iload           5
		//   71  121:isub            
		//   72  122:iadd            
		//   73  123:aload_1         
		//   74  124:invokevirtual   #37  <Method int NestedScrollView.getScrollRange()>
		//   75  127:invokestatic    #99  <Method int Math.min(int, int)>
		//   76  130:istore_2        
			if(i1 != ((NestedScrollView) (view)).getScrollY())
		//*  77  131:iload_2         
		//*  78  132:aload_1         
		//*  79  133:invokevirtual   #44  <Method int NestedScrollView.getScrollY()>
		//*  80  136:icmpeq          147
			{
				((NestedScrollView) (view)).c(0, i1);
		//   81  139:aload_1         
		//   82  140:iconst_0        
		//   83  141:iload_2         
		//   84  142:invokevirtual   #96  <Method void NestedScrollView.c(int, int)>
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

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.view.a()>
		//    2    4:return          
		}
	}

	public static interface b
	{

		public abstract void a(NestedScrollView nestedscrollview, int i1, int j1, int k1, int l1);
	}


	public NestedScrollView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #75  <Method void NestedScrollView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #78  <Method void NestedScrollView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #79  <Method void FrameLayout(Context, AttributeSet, int)>
		b = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #81  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #82  <Method void Rect()>
	//    9   15:putfield        #84  <Field Rect b>
		g = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #86  <Field boolean g>
		h = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #88  <Field boolean h>
		i = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #90  <Field View i>
		j = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #92  <Field boolean j>
		m = true;
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:putfield        #94  <Field boolean m>
		q = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #96  <Field int q>
		r = new int[2];
	//   28   48:aload_0         
	//   29   49:iconst_2        
	//   30   50:newarray        int[]
	//   31   52:putfield        #98  <Field int[] r>
		s = new int[2];
	//   32   55:aload_0         
	//   33   56:iconst_2        
	//   34   57:newarray        int[]
	//   35   59:putfield        #100 <Field int[] s>
		a();
	//   36   62:aload_0         
	//   37   63:invokespecial   #102 <Method void a()>
		context = ((Context) (context.obtainStyledAttributes(attributeset, x, i1, 0)));
	//   38   66:aload_1         
	//   39   67:aload_2         
	//   40   68:getstatic       #70  <Field int[] x>
	//   41   71:iload_3         
	//   42   72:iconst_0        
	//   43   73:invokevirtual   #108 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   44   76:astore_1        
		setFillViewport(((TypedArray) (context)).getBoolean(0, false));
	//   45   77:aload_0         
	//   46   78:aload_1         
	//   47   79:iconst_0        
	//   48   80:iconst_0        
	//   49   81:invokevirtual   #114 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   50   84:invokevirtual   #118 <Method void setFillViewport(boolean)>
		((TypedArray) (context)).recycle();
	//   51   87:aload_1         
	//   52   88:invokevirtual   #121 <Method void TypedArray.recycle()>
		y = new n(((ViewGroup) (this)));
	//   53   91:aload_0         
	//   54   92:new             #123 <Class n>
	//   55   95:dup             
	//   56   96:aload_0         
	//   57   97:invokespecial   #126 <Method void n(ViewGroup)>
	//   58  100:putfield        #128 <Field n y>
		z = new k(((View) (this)));
	//   59  103:aload_0         
	//   60  104:new             #130 <Class k>
	//   61  107:dup             
	//   62  108:aload_0         
	//   63  109:invokespecial   #133 <Method void k(View)>
	//   64  112:putfield        #135 <Field k z>
		setNestedScrollingEnabled(true);
	//   65  115:aload_0         
	//   66  116:iconst_1        
	//   67  117:invokevirtual   #138 <Method void setNestedScrollingEnabled(boolean)>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (w)));
	//   68  120:aload_0         
	//   69  121:getstatic       #67  <Field NestedScrollView$a w>
	//   70  124:invokestatic    #143 <Method void s.a(View, android.support.v4.view.a)>
	//   71  127:return          
	}

	private View a(boolean flag, int i1, int j1)
	{
		java.util.ArrayList arraylist = getFocusables(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #148 <Method java.util.ArrayList getFocusables(int)>
	//    3    5:astore          14
		int i2 = ((List) (arraylist)).size();
	//    4    7:aload           14
	//    5    9:invokeinterface #154 <Method int List.size()>
	//    6   14:istore          9
		View view2 = null;
	//    7   16:aconst_null     
	//    8   17:astore          13
		int k1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore          6
		boolean flag2;
		for(boolean flag3 = false; k1 < i2; flag3 = flag2)
	//*  11   22:iconst_0        
	//*  12   23:istore          7
	//*  13   25:iload           6
	//*  14   27:iload           9
	//*  15   29:icmpge          249
		{
			View view;
label0:
			{
				View view1 = (View)((List) (arraylist)).get(k1);
	//   16   32:aload           14
	//   17   34:iload           6
	//   18   36:invokeinterface #158 <Method Object List.get(int)>
	//   19   41:checkcast       #160 <Class View>
	//   20   44:astore          12
				int l1 = view1.getTop();
	//   21   46:aload           12
	//   22   48:invokevirtual   #163 <Method int View.getTop()>
	//   23   51:istore          8
				int j2 = view1.getBottom();
	//   24   53:aload           12
	//   25   55:invokevirtual   #166 <Method int View.getBottom()>
	//   26   58:istore          10
				view = view2;
	//   27   60:aload           13
	//   28   62:astore          11
				flag2 = flag3;
	//   29   64:iload           7
	//   30   66:istore          5
				if(i1 >= j2)
					break label0;
	//   31   68:iload_2         
	//   32   69:iload           10
	//   33   71:icmpge          232
				view = view2;
	//   34   74:aload           13
	//   35   76:astore          11
				flag2 = flag3;
	//   36   78:iload           7
	//   37   80:istore          5
				if(l1 >= j1)
					break label0;
	//   38   82:iload           8
	//   39   84:iload_3         
	//   40   85:icmpge          232
				boolean flag1;
				if(i1 < l1 && j2 < j1)
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
					break label0;
	//   58  122:goto            232
				}
				if(flag && l1 < view2.getTop() || !flag && j2 > view2.getBottom())
	//*  59  125:iload_1         
	//*  60  126:ifeq            139
	//*  61  129:iload           8
	//*  62  131:aload           13
	//*  63  133:invokevirtual   #163 <Method int View.getTop()>
	//*  64  136:icmplt          153
	//*  65  139:iload_1         
	//*  66  140:ifne            159
	//*  67  143:iload           10
	//*  68  145:aload           13
	//*  69  147:invokevirtual   #166 <Method int View.getBottom()>
	//*  70  150:icmple          159
					l1 = 1;
	//   71  153:iconst_1        
	//   72  154:istore          8
				else
	//*  73  156:goto            162
					l1 = 0;
	//   74  159:iconst_0        
	//   75  160:istore          8
				if(flag3)
	//*  76  162:iload           7
	//*  77  164:ifeq            196
				{
					view = view2;
	//   78  167:aload           13
	//   79  169:astore          11
					flag2 = flag3;
	//   80  171:iload           7
	//   81  173:istore          5
					if(!flag1)
						break label0;
	//   82  175:iload           4
	//   83  177:ifeq            232
					view = view2;
	//   84  180:aload           13
	//   85  182:astore          11
					flag2 = flag3;
	//   86  184:iload           7
	//   87  186:istore          5
					if(!l1)
	//*  88  188:iload           8
	//*  89  190:ifeq            232
						break label0;
	//   90  193:goto            224
				} else
				{
					if(flag1)
	//*  91  196:iload           4
	//*  92  198:ifeq            211
					{
						view = view1;
	//   93  201:aload           12
	//   94  203:astore          11
						flag2 = true;
	//   95  205:iconst_1        
	//   96  206:istore          5
						break label0;
	//   97  208:goto            232
					}
					view = view2;
	//   98  211:aload           13
	//   99  213:astore          11
					flag2 = flag3;
	//  100  215:iload           7
	//  101  217:istore          5
					if(!l1)
						break label0;
	//  102  219:iload           8
	//  103  221:ifeq            232
				}
				view = view1;
	//  104  224:aload           12
	//  105  226:astore          11
				flag2 = flag3;
	//  106  228:iload           7
	//  107  230:istore          5
			}
			k1++;
	//  108  232:iload           6
	//  109  234:iconst_1        
	//  110  235:iadd            
	//  111  236:istore          6
			view2 = view;
	//  112  238:aload           11
	//  113  240:astore          13
		}

	//  114  242:iload           5
	//  115  244:istore          7
	//* 116  246:goto            25
		return view2;
	//  117  249:aload           13
	//  118  251:areturn         
	}

	private void a()
	{
		c = new OverScroller(getContext());
	//    0    0:aload_0         
	//    1    1:new             #168 <Class OverScroller>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #172 <Method Context getContext()>
	//    5    9:invokespecial   #174 <Method void OverScroller(Context)>
	//    6   12:putfield        #176 <Field OverScroller c>
		setFocusable(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #179 <Method void setFocusable(boolean)>
		setDescendantFocusability(0x40000);
	//   10   20:aload_0         
	//   11   21:ldc1            #180 <Int 0x40000>
	//   12   23:invokevirtual   #184 <Method void setDescendantFocusability(int)>
		setWillNotDraw(false);
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #187 <Method void setWillNotDraw(boolean)>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//   16   31:aload_0         
	//   17   32:invokevirtual   #172 <Method Context getContext()>
	//   18   35:invokestatic    #192 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   19   38:astore_1        
		n = viewconfiguration.getScaledTouchSlop();
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #195 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   23   44:putfield        #197 <Field int n>
		o = viewconfiguration.getScaledMinimumFlingVelocity();
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #200 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   27   52:putfield        #202 <Field int o>
		p = viewconfiguration.getScaledMaximumFlingVelocity();
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:invokevirtual   #205 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   31   60:putfield        #207 <Field int p>
	//   32   63:return          
	}

	private void a(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #213 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i1) == q)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #217 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #96  <Field int q>
	//*   8   14:icmpne          61
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
			f = (int)motionevent.getY(i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #221 <Method float MotionEvent.getY(int)>
	//   20   34:f2i             
	//   21   35:putfield        #223 <Field int f>
			q = motionevent.getPointerId(i1);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:invokevirtual   #217 <Method int MotionEvent.getPointerId(int)>
	//   26   44:putfield        #96  <Field int q>
			if(k != null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #225 <Field VelocityTracker k>
	//*  29   51:ifnull          61
				k.clear();
	//   30   54:aload_0         
	//   31   55:getfield        #225 <Field VelocityTracker k>
	//   32   58:invokevirtual   #230 <Method void VelocityTracker.clear()>
		}
	//   33   61:return          
	}

	private boolean a(int i1, int j1, int k1)
	{
		int i2 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method int getHeight()>
	//    2    4:istore          5
		int l1 = getScrollY();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #237 <Method int getScrollY()>
	//    5   10:istore          4
		i2 += l1;
	//    6   12:iload           5
	//    7   14:iload           4
	//    8   16:iadd            
	//    9   17:istore          5
		boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          7
		boolean flag;
		if(i1 == 33)
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
		View view = a(flag, j1, k1);
	//   20   37:aload_0         
	//   21   38:iload           6
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:invokespecial   #239 <Method View a(boolean, int, int)>
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
		if(j1 >= l1 && k1 <= i2)
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
				j1 -= l1;
	//   43   83:iload_2         
	//   44   84:iload           4
	//   45   86:isub            
	//   46   87:istore_2        
			else
	//*  47   88:goto            96
				j1 = k1 - i2;
	//   48   91:iload_3         
	//   49   92:iload           5
	//   50   94:isub            
	//   51   95:istore_2        
			g(j1);
	//   52   96:aload_0         
	//   53   97:iload_2         
	//   54   98:invokespecial   #241 <Method void g(int)>
			flag = true;
	//   55  101:iconst_1        
	//   56  102:istore          6
		}
		if(obj != findFocus())
	//*  57  104:aload           8
	//*  58  106:aload_0         
	//*  59  107:invokevirtual   #245 <Method View findFocus()>
	//*  60  110:if_acmpeq       120
			((View) (obj)).requestFocus(i1);
	//   61  113:aload           8
	//   62  115:iload_1         
	//   63  116:invokevirtual   #249 <Method boolean View.requestFocus(int)>
	//   64  119:pop             
		return flag;
	//   65  120:iload           6
	//   66  122:ireturn         
	}

	private boolean a(Rect rect, boolean flag)
	{
		int i1 = a(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #253 <Method int a(Rect)>
	//    3    5:istore_3        
		boolean flag1;
		if(i1 != 0)
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
				scrollBy(0, i1);
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:iload_3         
	//   18   31:invokevirtual   #257 <Method void scrollBy(int, int)>
				return flag1;
	//   19   34:iload           4
	//   20   36:ireturn         
			}
			b(0, i1);
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:iload_3         
	//   24   40:invokevirtual   #259 <Method void b(int, int)>
		}
		return flag1;
	//   25   43:iload           4
	//   26   45:ireturn         
	}

	private boolean a(View view)
	{
		return a(view, 0, getHeight()) ^ true;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #234 <Method int getHeight()>
	//    5    7:invokespecial   #263 <Method boolean a(View, int, int)>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:ireturn         
	}

	private boolean a(View view, int i1, int j1)
	{
		view.getDrawingRect(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #84  <Field Rect b>
	//    3    5:invokevirtual   #267 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, b);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #84  <Field Rect b>
	//    8   14:invokevirtual   #271 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		return b.bottom + i1 >= getScrollY() && b.top - i1 <= getScrollY() + j1;
	//    9   17:aload_0         
	//   10   18:getfield        #84  <Field Rect b>
	//   11   21:getfield        #274 <Field int Rect.bottom>
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #237 <Method int getScrollY()>
	//   16   30:icmplt          53
	//   17   33:aload_0         
	//   18   34:getfield        #84  <Field Rect b>
	//   19   37:getfield        #277 <Field int Rect.top>
	//   20   40:iload_2         
	//   21   41:isub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #237 <Method int getScrollY()>
	//   24   46:iload_3         
	//   25   47:iadd            
	//   26   48:icmpgt          53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	private static boolean a(View view, View view1)
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
	//    6    8:invokevirtual   #282 <Method ViewParent View.getParent()>
	//    7   11:astore_0        
		return (view instanceof ViewGroup) && a((View)view, view1);
	//    8   12:aload_0         
	//    9   13:instanceof      #284 <Class ViewGroup>
	//   10   16:ifeq            32
	//   11   19:aload_0         
	//   12   20:checkcast       #160 <Class View>
	//   13   23:aload_1         
	//   14   24:invokestatic    #286 <Method boolean a(View, View)>
	//   15   27:ifeq            32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
	}

	private static int b(int i1, int j1, int k1)
	{
		if(j1 < k1 && i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          25
	//*   3    5:iload_0         
	//*   4    6:ifge            12
	//*   5    9:goto            25
		{
			if(j1 + i1 > k1)
	//*   6   12:iload_1         
	//*   7   13:iload_0         
	//*   8   14:iadd            
	//*   9   15:iload_2         
	//*  10   16:icmple          23
				return k1 - j1;
	//   11   19:iload_2         
	//   12   20:iload_1         
	//   13   21:isub            
	//   14   22:ireturn         
			else
				return i1;
	//   15   23:iload_0         
	//   16   24:ireturn         
		} else
		{
			return 0;
	//   17   25:iconst_0        
	//   18   26:ireturn         
		}
	}

	private void b(View view)
	{
		view.getDrawingRect(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #84  <Field Rect b>
	//    3    5:invokevirtual   #267 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, b);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #84  <Field Rect b>
	//    8   14:invokevirtual   #271 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		int i1 = a(b);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #84  <Field Rect b>
	//   12   22:invokevirtual   #253 <Method int a(Rect)>
	//   13   25:istore_2        
		if(i1 != 0)
	//*  14   26:iload_2         
	//*  15   27:ifeq            36
			scrollBy(0, i1);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:iload_2         
	//   19   33:invokevirtual   #257 <Method void scrollBy(int, int)>
	//   20   36:return          
	}

	private boolean b()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		View view = getChildAt(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #292 <Method View getChildAt(int)>
	//    5    7:astore          4
		boolean flag = flag1;
	//    6    9:iload_3         
	//    7   10:istore_2        
		if(view != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          44
		{
			int i1 = view.getHeight();
	//   10   16:aload           4
	//   11   18:invokevirtual   #293 <Method int View.getHeight()>
	//   12   21:istore_1        
			flag = flag1;
	//   13   22:iload_3         
	//   14   23:istore_2        
			if(getHeight() < i1 + getPaddingTop() + getPaddingBottom())
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #234 <Method int getHeight()>
	//*  17   28:iload_1         
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #296 <Method int getPaddingTop()>
	//*  20   33:iadd            
	//*  21   34:aload_0         
	//*  22   35:invokevirtual   #299 <Method int getPaddingBottom()>
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

	private void c()
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field VelocityTracker k>
	//*   2    4:ifnonnull       15
		{
			k = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #303 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #225 <Field VelocityTracker k>
			return;
	//    6   14:return          
		} else
		{
			k.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #225 <Field VelocityTracker k>
	//    9   19:invokevirtual   #230 <Method void VelocityTracker.clear()>
			return;
	//   10   22:return          
		}
	}

	private void d()
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field VelocityTracker k>
	//*   2    4:ifnonnull       14
			k = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #303 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #225 <Field VelocityTracker k>
	//    6   14:return          
	}

	private boolean d(int i1, int j1)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #307 <Method int getChildCount()>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		boolean flag = flag1;
	//    5    8:iload           5
	//    6   10:istore          4
		if(k1 > 0)
	//*   7   12:iload_3         
	//*   8   13:ifle            87
		{
			int l1 = getScrollY();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #237 <Method int getScrollY()>
	//   11   20:istore_3        
			View view = getChildAt(0);
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #292 <Method View getChildAt(int)>
	//   15   26:astore          6
			flag = flag1;
	//   16   28:iload           5
	//   17   30:istore          4
			if(j1 >= view.getTop() - l1)
	//*  18   32:iload_2         
	//*  19   33:aload           6
	//*  20   35:invokevirtual   #163 <Method int View.getTop()>
	//*  21   38:iload_3         
	//*  22   39:isub            
	//*  23   40:icmplt          87
			{
				flag = flag1;
	//   24   43:iload           5
	//   25   45:istore          4
				if(j1 < view.getBottom() - l1)
	//*  26   47:iload_2         
	//*  27   48:aload           6
	//*  28   50:invokevirtual   #166 <Method int View.getBottom()>
	//*  29   53:iload_3         
	//*  30   54:isub            
	//*  31   55:icmpge          87
				{
					flag = flag1;
	//   32   58:iload           5
	//   33   60:istore          4
					if(i1 >= view.getLeft())
	//*  34   62:iload_1         
	//*  35   63:aload           6
	//*  36   65:invokevirtual   #310 <Method int View.getLeft()>
	//*  37   68:icmplt          87
					{
						flag = flag1;
	//   38   71:iload           5
	//   39   73:istore          4
						if(i1 < view.getRight())
	//*  40   75:iload_1         
	//*  41   76:aload           6
	//*  42   78:invokevirtual   #313 <Method int View.getRight()>
	//*  43   81:icmpge          87
							flag = true;
	//   44   84:iconst_1        
	//   45   85:istore          4
					}
				}
			}
		}
		return flag;
	//   46   87:iload           4
	//   47   89:ireturn         
	}

	private void e()
	{
		if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field VelocityTracker k>
	//*   2    4:ifnull          19
		{
			k.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field VelocityTracker k>
	//    5   11:invokevirtual   #314 <Method void VelocityTracker.recycle()>
			k = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #225 <Field VelocityTracker k>
		}
	//    9   19:return          
	}

	private void f()
	{
		j = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #92  <Field boolean j>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #316 <Method void e()>
		a(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #318 <Method void a(int)>
		if(d != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #320 <Field EdgeEffect d>
	//*  10   18:ifnull          35
		{
			d.onRelease();
	//   11   21:aload_0         
	//   12   22:getfield        #320 <Field EdgeEffect d>
	//   13   25:invokevirtual   #325 <Method void EdgeEffect.onRelease()>
			e.onRelease();
	//   14   28:aload_0         
	//   15   29:getfield        #327 <Field EdgeEffect e>
	//   16   32:invokevirtual   #325 <Method void EdgeEffect.onRelease()>
		}
	//   17   35:return          
	}

	private void g()
	{
		if(getOverScrollMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #330 <Method int getOverScrollMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          45
		{
			if(d == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #320 <Field EdgeEffect d>
	//*   6   12:ifnonnull       55
			{
				Context context = getContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #172 <Method Context getContext()>
	//    9   19:astore_1        
				d = new EdgeEffect(context);
	//   10   20:aload_0         
	//   11   21:new             #322 <Class EdgeEffect>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #331 <Method void EdgeEffect(Context)>
	//   15   29:putfield        #320 <Field EdgeEffect d>
				e = new EdgeEffect(context);
	//   16   32:aload_0         
	//   17   33:new             #322 <Class EdgeEffect>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #331 <Method void EdgeEffect(Context)>
	//   21   41:putfield        #327 <Field EdgeEffect e>
				return;
	//   22   44:return          
			}
		} else
		{
			d = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #320 <Field EdgeEffect d>
			e = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #327 <Field EdgeEffect e>
		}
	//   29   55:return          
	}

	private void g(int i1)
	{
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            24
		{
			if(m)
	//*   2    4:aload_0         
	//*   3    5:getfield        #94  <Field boolean m>
	//*   4    8:ifeq            18
			{
				b(0, i1);
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #259 <Method void b(int, int)>
				return;
	//    9   17:return          
			}
			scrollBy(0, i1);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iload_1         
	//   13   21:invokevirtual   #257 <Method void scrollBy(int, int)>
		}
	//   14   24:return          
	}

	private float getVerticalScrollFactorCompat()
	{
		if(A == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #335 <Field float A>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            63
		{
			TypedValue typedvalue = new TypedValue();
	//    5    9:new             #337 <Class TypedValue>
	//    6   12:dup             
	//    7   13:invokespecial   #338 <Method void TypedValue()>
	//    8   16:astore_1        
			Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #172 <Method Context getContext()>
	//   11   21:astore_2        
			if(!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #342 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  14   26:ldc2            #343 <Int 0x101004d>
	//*  15   29:aload_1         
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #349 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  18   34:ifne            48
				throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
	//   19   37:new             #351 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #353 <String "Expected theme to define listPreferredItemHeight.">
	//   22   44:invokespecial   #356 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			A = typedvalue.getDimension(context.getResources().getDisplayMetrics());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #360 <Method Resources Context.getResources()>
	//   28   54:invokevirtual   #366 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   29   57:invokevirtual   #370 <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   30   60:putfield        #335 <Field float A>
		}
		return A;
	//   31   63:aload_0         
	//   32   64:getfield        #335 <Field float A>
	//   33   67:freturn         
	}

	private void h(int i1)
	{
		int j1 = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method int getScrollY()>
	//    2    4:istore_3        
		boolean flag;
		if(j1 <= 0 && i1 <= 0 || j1 >= getScrollRange() && i1 >= 0)
	//*   3    5:iload_3         
	//*   4    6:ifgt            13
	//*   5    9:iload_1         
	//*   6   10:ifle            28
	//*   7   13:iload_3         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #373 <Method int getScrollRange()>
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
		float f1 = i1;
	//   19   37:iload_1         
	//   20   38:i2f             
	//   21   39:fstore_2        
		if(!dispatchNestedPreFling(0.0F, f1))
	//*  22   40:aload_0         
	//*  23   41:fconst_0        
	//*  24   42:fload_2         
	//*  25   43:invokevirtual   #377 <Method boolean dispatchNestedPreFling(float, float)>
	//*  26   46:ifne            63
		{
			dispatchNestedFling(0.0F, f1, flag);
	//   27   49:aload_0         
	//   28   50:fconst_0        
	//   29   51:fload_2         
	//   30   52:iload           4
	//   31   54:invokevirtual   #381 <Method boolean dispatchNestedFling(float, float, boolean)>
	//   32   57:pop             
			f(i1);
	//   33   58:aload_0         
	//   34   59:iload_1         
	//   35   60:invokevirtual   #383 <Method void f(int)>
		}
	//   36   63:return          
	}

	protected int a(Rect rect)
	{
		int i1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #307 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		if(i1 == 0)
	//*   5    8:iload_2         
	//*   6    9:ifne            14
			return 0;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		int l1 = getHeight();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #234 <Method int getHeight()>
	//   11   18:istore          6
		i1 = getScrollY();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #237 <Method int getScrollY()>
	//   14   24:istore_2        
		int k1 = i1 + l1;
	//   15   25:iload_2         
	//   16   26:iload           6
	//   17   28:iadd            
	//   18   29:istore          4
		int i2 = getVerticalFadingEdgeLength();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #386 <Method int getVerticalFadingEdgeLength()>
	//   21   35:istore          7
		int j1 = i1;
	//   22   37:iload_2         
	//   23   38:istore_3        
		if(rect.top > 0)
	//*  24   39:aload_1         
	//*  25   40:getfield        #277 <Field int Rect.top>
	//*  26   43:ifle            51
			j1 = i1 + i2;
	//   27   46:iload_2         
	//   28   47:iload           7
	//   29   49:iadd            
	//   30   50:istore_3        
		i1 = k1;
	//   31   51:iload           4
	//   32   53:istore_2        
		if(rect.bottom < getChildAt(0).getHeight())
	//*  33   54:aload_1         
	//*  34   55:getfield        #274 <Field int Rect.bottom>
	//*  35   58:aload_0         
	//*  36   59:iconst_0        
	//*  37   60:invokevirtual   #292 <Method View getChildAt(int)>
	//*  38   63:invokevirtual   #293 <Method int View.getHeight()>
	//*  39   66:icmpge          75
			i1 = k1 - i2;
	//   40   69:iload           4
	//   41   71:iload           7
	//   42   73:isub            
	//   43   74:istore_2        
		if(rect.bottom > i1 && rect.top > j1)
	//*  44   75:aload_1         
	//*  45   76:getfield        #274 <Field int Rect.bottom>
	//*  46   79:iload_2         
	//*  47   80:icmple          137
	//*  48   83:aload_1         
	//*  49   84:getfield        #277 <Field int Rect.top>
	//*  50   87:iload_3         
	//*  51   88:icmple          137
		{
			if(rect.height() > l1)
	//*  52   91:aload_1         
	//*  53   92:invokevirtual   #389 <Method int Rect.height()>
	//*  54   95:iload           6
	//*  55   97:icmple          110
				j1 = rect.top - j1;
	//   56  100:aload_1         
	//   57  101:getfield        #277 <Field int Rect.top>
	//   58  104:iload_3         
	//   59  105:isub            
	//   60  106:istore_3        
			else
	//*  61  107:goto            120
				j1 = rect.bottom - i1;
	//   62  110:aload_1         
	//   63  111:getfield        #274 <Field int Rect.bottom>
	//   64  114:iload_2         
	//   65  115:isub            
	//   66  116:istore_3        
	//*  67  117:goto            107
			return Math.min(j1 + 0, getChildAt(0).getBottom() - i1);
	//   68  120:iload_3         
	//   69  121:iconst_0        
	//   70  122:iadd            
	//   71  123:aload_0         
	//   72  124:iconst_0        
	//   73  125:invokevirtual   #292 <Method View getChildAt(int)>
	//   74  128:invokevirtual   #166 <Method int View.getBottom()>
	//   75  131:iload_2         
	//   76  132:isub            
	//   77  133:invokestatic    #395 <Method int Math.min(int, int)>
	//   78  136:ireturn         
		}
		k1 = ((int) (flag));
	//   79  137:iload           5
	//   80  139:istore          4
		if(rect.top < j1)
	//*  81  141:aload_1         
	//*  82  142:getfield        #277 <Field int Rect.top>
	//*  83  145:iload_3         
	//*  84  146:icmpge          202
		{
			k1 = ((int) (flag));
	//   85  149:iload           5
	//   86  151:istore          4
			if(rect.bottom < i1)
	//*  87  153:aload_1         
	//*  88  154:getfield        #274 <Field int Rect.bottom>
	//*  89  157:iload_2         
	//*  90  158:icmpge          202
			{
				if(rect.height() > l1)
	//*  91  161:aload_1         
	//*  92  162:invokevirtual   #389 <Method int Rect.height()>
	//*  93  165:iload           6
	//*  94  167:icmple          182
					i1 = 0 - (i1 - rect.bottom);
	//   95  170:iconst_0        
	//   96  171:iload_2         
	//   97  172:aload_1         
	//   98  173:getfield        #274 <Field int Rect.bottom>
	//   99  176:isub            
	//  100  177:isub            
	//  101  178:istore_2        
				else
	//* 102  179:goto            191
					i1 = 0 - (j1 - rect.top);
	//  103  182:iconst_0        
	//  104  183:iload_3         
	//  105  184:aload_1         
	//  106  185:getfield        #277 <Field int Rect.top>
	//  107  188:isub            
	//  108  189:isub            
	//  109  190:istore_2        
				k1 = Math.max(i1, -getScrollY());
	//  110  191:iload_2         
	//  111  192:aload_0         
	//  112  193:invokevirtual   #237 <Method int getScrollY()>
	//  113  196:ineg            
	//  114  197:invokestatic    #398 <Method int Math.max(int, int)>
	//  115  200:istore          4
			}
		}
		return k1;
	//  116  202:iload           4
	//  117  204:ireturn         
	}

	public void a(int i1)
	{
		z.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #400 <Method void k.c(int)>
	//    4    8:return          
	}

	public boolean a(int i1, int j1)
	{
		return z.a(i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #402 <Method boolean k.a(int, int)>
	//    5    9:ireturn         
	}

	boolean a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
			int l2, boolean flag)
	{
		boolean flag4;
		int k3 = getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method int getOverScrollMode()>
	//    2    4:istore          12
		int i3 = computeHorizontalScrollRange();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #406 <Method int computeHorizontalScrollRange()>
	//    5   10:istore          10
		int j3 = computeHorizontalScrollExtent();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #409 <Method int computeHorizontalScrollExtent()>
	//    8   16:istore          11
		flag4 = false;
	//    9   18:iconst_0        
	//   10   19:istore          14
		if(i3 > j3)
	//*  11   21:iload           10
	//*  12   23:iload           11
	//*  13   25:icmple          34
			i3 = 1;
	//   14   28:iconst_1        
	//   15   29:istore          10
		else
	//*  16   31:goto            37
			i3 = 0;
	//   17   34:iconst_0        
	//   18   35:istore          10
		if(computeVerticalScrollRange() > computeVerticalScrollExtent())
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #412 <Method int computeVerticalScrollRange()>
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #415 <Method int computeVerticalScrollExtent()>
	//*  23   45:icmple          54
			j3 = 1;
	//   24   48:iconst_1        
	//   25   49:istore          11
		else
	//*  26   51:goto            57
			j3 = 0;
	//   27   54:iconst_0        
	//   28   55:istore          11
		boolean flag1;
		if(k3 != 0 && (k3 != 1 || !i3))
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
		if(k3 != 0 && (k3 != 1 || !j3))
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
		k1 += i1;
	//   55  113:iload_3         
	//   56  114:iload_1         
	//   57  115:iadd            
	//   58  116:istore_3        
		if(!flag1)
	//*  59  117:iload           10
	//*  60  119:ifne            127
			i1 = 0;
	//   61  122:iconst_0        
	//   62  123:istore_1        
		else
	//*  63  124:goto            130
			i1 = k2;
	//   64  127:iload           7
	//   65  129:istore_1        
		l1 += j1;
	//   66  130:iload           4
	//   67  132:iload_2         
	//   68  133:iadd            
	//   69  134:istore          4
		if(!flag2)
	//*  70  136:iload           11
	//*  71  138:ifne            146
			j1 = 0;
	//   72  141:iconst_0        
	//   73  142:istore_2        
		else
	//*  74  143:goto            149
			j1 = l2;
	//   75  146:iload           8
	//   76  148:istore_2        
		k2 = -i1;
	//   77  149:iload_1         
	//   78  150:ineg            
	//   79  151:istore          7
		i1 += i2;
	//   80  153:iload_1         
	//   81  154:iload           5
	//   82  156:iadd            
	//   83  157:istore_1        
		i2 = -j1;
	//   84  158:iload_2         
	//   85  159:ineg            
	//   86  160:istore          5
		j2 = j1 + j2;
	//   87  162:iload_2         
	//   88  163:iload           6
	//   89  165:iadd            
	//   90  166:istore          6
		if(k1 <= i1) goto _L2; else goto _L1
	//   91  168:iload_3         
	//   92  169:iload_1         
	//   93  170:icmple          181
_L1:
		flag = true;
	//   94  173:iconst_1        
	//   95  174:istore          9
		j1 = i1;
	//   96  176:iload_1         
	//   97  177:istore_2        
		break MISSING_BLOCK_LABEL_198;
	//   98  178:goto            198
_L2:
		if(k1 >= k2)
			break; /* Loop/switch isn't completed */
	//   99  181:iload_3         
	//  100  182:iload           7
	//  101  184:icmpge          193
		i1 = k2;
	//  102  187:iload           7
	//  103  189:istore_1        
		if(true) goto _L1; else goto _L3
	//  104  190:goto            173
_L3:
		j1 = k1;
	//  105  193:iload_3         
	//  106  194:istore_2        
		flag = false;
	//  107  195:iconst_0        
	//  108  196:istore          9
		if(l1 <= j2) goto _L5; else goto _L4
	//  109  198:iload           4
	//  110  200:iload           6
	//  111  202:icmple          214
_L4:
		i1 = j2;
	//  112  205:iload           6
	//  113  207:istore_1        
_L7:
		boolean flag3;
		flag3 = true;
	//  114  208:iconst_1        
	//  115  209:istore          13
		break MISSING_BLOCK_LABEL_233;
	//  116  211:goto            233
_L5:
		if(l1 >= i2)
			break; /* Loop/switch isn't completed */
	//  117  214:iload           4
	//  118  216:iload           5
	//  119  218:icmpge          227
		i1 = i2;
	//  120  221:iload           5
	//  121  223:istore_1        
		if(true) goto _L7; else goto _L6
	//  122  224:goto            208
_L6:
		i1 = l1;
	//  123  227:iload           4
	//  124  229:istore_1        
		flag3 = false;
	//  125  230:iconst_0        
	//  126  231:istore          13
label0:
		{
			if(flag3 && !b(1))
	//* 127  233:iload           13
	//* 128  235:ifeq            263
	//* 129  238:aload_0         
	//* 130  239:iconst_1        
	//* 131  240:invokevirtual   #417 <Method boolean b(int)>
	//* 132  243:ifne            263
				c.springBack(j1, i1, 0, 0, 0, getScrollRange());
	//  133  246:aload_0         
	//  134  247:getfield        #176 <Field OverScroller c>
	//  135  250:iload_2         
	//  136  251:iload_1         
	//  137  252:iconst_0        
	//  138  253:iconst_0        
	//  139  254:iconst_0        
	//  140  255:aload_0         
	//  141  256:invokevirtual   #373 <Method int getScrollRange()>
	//  142  259:invokevirtual   #421 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//  143  262:pop             
			onOverScrolled(j1, i1, flag, flag3);
	//  144  263:aload_0         
	//  145  264:iload_2         
	//  146  265:iload_1         
	//  147  266:iload           9
	//  148  268:iload           13
	//  149  270:invokevirtual   #425 <Method void onOverScrolled(int, int, boolean, boolean)>
			if(!flag)
	//* 150  273:iload           9
	//* 151  275:ifne            287
			{
				flag = flag4;
	//  152  278:iload           14
	//  153  280:istore          9
				if(!flag3)
					break label0;
	//  154  282:iload           13
	//  155  284:ifeq            290
			}
			flag = true;
	//  156  287:iconst_1        
	//  157  288:istore          9
		}
		return flag;
	//  158  290:iload           9
	//  159  292:ireturn         
	}

	public boolean a(int i1, int j1, int k1, int l1, int ai[], int i2)
	{
		return z.a(i1, j1, k1, l1, ai, i2);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #428 <Method boolean k.a(int, int, int, int, int[], int)>
	//    9   16:ireturn         
	}

	public boolean a(int i1, int j1, int ai[], int ai1[], int k1)
	{
		return z.a(i1, j1, ai, ai1, k1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #431 <Method boolean k.a(int, int, int[], int[], int)>
	//    8   14:ireturn         
	}

	public boolean a(KeyEvent keyevent)
	{
		b.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Rect b>
	//    2    4:invokevirtual   #435 <Method void Rect.setEmpty()>
		boolean flag = b();
	//    3    7:aload_0         
	//    4    8:invokespecial   #437 <Method boolean b()>
	//    5   11:istore          4
		boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		char c1 = '\202';
	//    8   16:sipush          130
	//    9   19:istore_2        
		if(!flag)
	//*  10   20:iload           4
	//*  11   22:ifne            114
		{
			boolean flag1 = flag2;
	//   12   25:iload           5
	//   13   27:istore          4
			if(isFocused())
	//*  14   29:aload_0         
	//*  15   30:invokevirtual   #440 <Method boolean isFocused()>
	//*  16   33:ifeq            111
			{
				flag1 = flag2;
	//   17   36:iload           5
	//   18   38:istore          4
				if(keyevent.getKeyCode() != 4)
	//*  19   40:aload_1         
	//*  20   41:invokevirtual   #445 <Method int KeyEvent.getKeyCode()>
	//*  21   44:iconst_4        
	//*  22   45:icmpeq          111
				{
					View view = findFocus();
	//   23   48:aload_0         
	//   24   49:invokevirtual   #245 <Method View findFocus()>
	//   25   52:astore          6
					keyevent = ((KeyEvent) (view));
	//   26   54:aload           6
	//   27   56:astore_1        
					if(view == this)
	//*  28   57:aload           6
	//*  29   59:aload_0         
	//*  30   60:if_acmpne       65
						keyevent = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
					keyevent = ((KeyEvent) (FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (keyevent)), 130)));
	//   33   65:invokestatic    #451 <Method FocusFinder FocusFinder.getInstance()>
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:sipush          130
	//   37   73:invokevirtual   #455 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   38   76:astore_1        
					flag1 = flag2;
	//   39   77:iload           5
	//   40   79:istore          4
					if(keyevent != null)
	//*  41   81:aload_1         
	//*  42   82:ifnull          111
					{
						flag1 = flag2;
	//   43   85:iload           5
	//   44   87:istore          4
						if(keyevent != this)
	//*  45   89:aload_1         
	//*  46   90:aload_0         
	//*  47   91:if_acmpeq       111
						{
							flag1 = flag2;
	//   48   94:iload           5
	//   49   96:istore          4
							if(((View) (keyevent)).requestFocus(130))
	//*  50   98:aload_1         
	//*  51   99:sipush          130
	//*  52  102:invokevirtual   #249 <Method boolean View.requestFocus(int)>
	//*  53  105:ifeq            111
								flag1 = true;
	//   54  108:iconst_1        
	//   55  109:istore          4
						}
					}
				}
			}
			return flag1;
	//   56  111:iload           4
	//   57  113:ireturn         
		}
		if(keyevent.getAction() == 0)
	//*  58  114:aload_1         
	//*  59  115:invokevirtual   #458 <Method int KeyEvent.getAction()>
	//*  60  118:ifne            218
		{
			int i1 = keyevent.getKeyCode();
	//   61  121:aload_1         
	//   62  122:invokevirtual   #445 <Method int KeyEvent.getKeyCode()>
	//   63  125:istore_3        
			if(i1 != 62)
	//*  64  126:iload_3         
	//*  65  127:bipush          62
	//*  66  129:icmpeq          202
			{
				switch(i1)
	//*  67  132:iload_3         
				{
	//*  68  133:tableswitch     19 20: default 156
	//	               19 181
	//	               20 158
				default:
					return false;
	//   69  156:iconst_0        
	//   70  157:ireturn         

				case 20: // '\024'
					if(!keyevent.isAltPressed())
	//*  71  158:aload_1         
	//*  72  159:invokevirtual   #461 <Method boolean KeyEvent.isAltPressed()>
	//*  73  162:ifne            173
						return e(130);
	//   74  165:aload_0         
	//   75  166:sipush          130
	//   76  169:invokevirtual   #463 <Method boolean e(int)>
	//   77  172:ireturn         
					else
						return d(130);
	//   78  173:aload_0         
	//   79  174:sipush          130
	//   80  177:invokevirtual   #465 <Method boolean d(int)>
	//   81  180:ireturn         

				case 19: // '\023'
					break;
				}
				if(!keyevent.isAltPressed())
	//*  82  181:aload_1         
	//*  83  182:invokevirtual   #461 <Method boolean KeyEvent.isAltPressed()>
	//*  84  185:ifne            195
					return e(33);
	//   85  188:aload_0         
	//   86  189:bipush          33
	//   87  191:invokevirtual   #463 <Method boolean e(int)>
	//   88  194:ireturn         
				else
					return d(33);
	//   89  195:aload_0         
	//   90  196:bipush          33
	//   91  198:invokevirtual   #465 <Method boolean d(int)>
	//   92  201:ireturn         
			}
			if(keyevent.isShiftPressed())
	//*  93  202:aload_1         
	//*  94  203:invokevirtual   #468 <Method boolean KeyEvent.isShiftPressed()>
	//*  95  206:ifeq            212
				c1 = '!';
	//   96  209:bipush          33
	//   97  211:istore_2        
			c(((int) (c1)));
	//   98  212:aload_0         
	//   99  213:iload_2         
	//  100  214:invokevirtual   #470 <Method boolean c(int)>
	//  101  217:pop             
		}
		return false;
	//  102  218:iconst_0        
	//  103  219:ireturn         
	}

	public void addView(View view)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #351 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #473 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #356 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #475 <Method void FrameLayout.addView(View)>
			return;
	//   11   23:return          
		}
	}

	public void addView(View view, int i1)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #351 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #473 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #356 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i1);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokespecial   #478 <Method void FrameLayout.addView(View, int)>
			return;
	//   12   24:return          
		}
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #351 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #473 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #356 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i1, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #481 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   13   25:return          
		}
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #351 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #473 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #356 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #484 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   12   24:return          
		}
	}

	public final void b(int i1, int j1)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(AnimationUtils.currentAnimationTimeMillis() - a > 250L)
	//*   4    8:invokestatic    #490 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #492 <Field long a>
	//*   7   15:lsub            
	//*   8   16:ldc2w           #493 <Long 250L>
	//*   9   19:lcmp            
	//*  10   20:ifle            99
		{
			i1 = getHeight();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #234 <Method int getHeight()>
	//   13   27:istore_1        
			int k1 = getPaddingBottom();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #299 <Method int getPaddingBottom()>
	//   16   32:istore_3        
			int l1 = getPaddingTop();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #296 <Method int getPaddingTop()>
	//   19   37:istore          4
			k1 = Math.max(0, getChildAt(0).getHeight() - (i1 - k1 - l1));
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #292 <Method View getChildAt(int)>
	//   24   45:invokevirtual   #293 <Method int View.getHeight()>
	//   25   48:iload_1         
	//   26   49:iload_3         
	//   27   50:isub            
	//   28   51:iload           4
	//   29   53:isub            
	//   30   54:isub            
	//   31   55:invokestatic    #398 <Method int Math.max(int, int)>
	//   32   58:istore_3        
			i1 = getScrollY();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #237 <Method int getScrollY()>
	//   35   63:istore_1        
			j1 = Math.max(0, Math.min(j1 + i1, k1));
	//   36   64:iconst_0        
	//   37   65:iload_2         
	//   38   66:iload_1         
	//   39   67:iadd            
	//   40   68:iload_3         
	//   41   69:invokestatic    #395 <Method int Math.min(int, int)>
	//   42   72:invokestatic    #398 <Method int Math.max(int, int)>
	//   43   75:istore_2        
			c.startScroll(getScrollX(), i1, 0, j1 - i1);
	//   44   76:aload_0         
	//   45   77:getfield        #176 <Field OverScroller c>
	//   46   80:aload_0         
	//   47   81:invokevirtual   #497 <Method int getScrollX()>
	//   48   84:iload_1         
	//   49   85:iconst_0        
	//   50   86:iload_2         
	//   51   87:iload_1         
	//   52   88:isub            
	//   53   89:invokevirtual   #501 <Method void OverScroller.startScroll(int, int, int, int)>
			android.support.v4.view.s.c(((View) (this)));
	//   54   92:aload_0         
	//   55   93:invokestatic    #503 <Method void s.c(View)>
		} else
	//*  56   96:goto            122
		{
			if(!c.isFinished())
	//*  57   99:aload_0         
	//*  58  100:getfield        #176 <Field OverScroller c>
	//*  59  103:invokevirtual   #506 <Method boolean OverScroller.isFinished()>
	//*  60  106:ifne            116
				c.abortAnimation();
	//   61  109:aload_0         
	//   62  110:getfield        #176 <Field OverScroller c>
	//   63  113:invokevirtual   #509 <Method void OverScroller.abortAnimation()>
			scrollBy(i1, j1);
	//   64  116:aload_0         
	//   65  117:iload_1         
	//   66  118:iload_2         
	//   67  119:invokevirtual   #257 <Method void scrollBy(int, int)>
		}
		a = AnimationUtils.currentAnimationTimeMillis();
	//   68  122:aload_0         
	//   69  123:invokestatic    #490 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   70  126:putfield        #492 <Field long a>
	//   71  129:return          
	}

	public boolean b(int i1)
	{
		return z.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #511 <Method boolean k.a(int)>
	//    4    8:ireturn         
	}

	public final void c(int i1, int j1)
	{
		b(i1 - getScrollX(), j1 - getScrollY());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #497 <Method int getScrollX()>
	//    4    6:isub            
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #237 <Method int getScrollY()>
	//    8   12:isub            
	//    9   13:invokevirtual   #259 <Method void b(int, int)>
	//   10   16:return          
	}

	public boolean c(int i1)
	{
		int k1;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			boolean flag;
			if(i1 == 130)
	//*   2    2:iload_1         
	//*   3    3:sipush          130
	//*   4    6:icmpne          14
				flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
			else
	//*   7   11:goto            16
				flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			k1 = getHeight();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #234 <Method int getHeight()>
	//   12   20:istore          4
			int j1;
			Rect rect;
			if(flag)
	//*  13   22:iload_2         
	//*  14   23:ifeq            94
			{
				b.top = getScrollY() + k1;
	//   15   26:aload_0         
	//   16   27:getfield        #84  <Field Rect b>
	//   17   30:aload_0         
	//   18   31:invokevirtual   #237 <Method int getScrollY()>
	//   19   34:iload           4
	//   20   36:iadd            
	//   21   37:putfield        #277 <Field int Rect.top>
				j1 = getChildCount();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #307 <Method int getChildCount()>
	//   24   44:istore_2        
				if(j1 <= 0)
					break label0;
	//   25   45:iload_2         
	//   26   46:ifle            132
				View view = getChildAt(j1 - 1);
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:iconst_1        
	//   30   52:isub            
	//   31   53:invokevirtual   #292 <Method View getChildAt(int)>
	//   32   56:astore          6
				if(b.top + k1 <= view.getBottom())
					break label0;
	//   33   58:aload_0         
	//   34   59:getfield        #84  <Field Rect b>
	//   35   62:getfield        #277 <Field int Rect.top>
	//   36   65:iload           4
	//   37   67:iadd            
	//   38   68:aload           6
	//   39   70:invokevirtual   #166 <Method int View.getBottom()>
	//   40   73:icmple          132
				rect = b;
	//   41   76:aload_0         
	//   42   77:getfield        #84  <Field Rect b>
	//   43   80:astore          5
				j1 = view.getBottom() - k1;
	//   44   82:aload           6
	//   45   84:invokevirtual   #166 <Method int View.getBottom()>
	//   46   87:iload           4
	//   47   89:isub            
	//   48   90:istore_2        
			} else
	//*  49   91:goto            126
			{
				b.top = getScrollY() - k1;
	//   50   94:aload_0         
	//   51   95:getfield        #84  <Field Rect b>
	//   52   98:aload_0         
	//   53   99:invokevirtual   #237 <Method int getScrollY()>
	//   54  102:iload           4
	//   55  104:isub            
	//   56  105:putfield        #277 <Field int Rect.top>
				if(b.top >= 0)
					break label0;
	//   57  108:aload_0         
	//   58  109:getfield        #84  <Field Rect b>
	//   59  112:getfield        #277 <Field int Rect.top>
	//   60  115:ifge            132
				rect = b;
	//   61  118:aload_0         
	//   62  119:getfield        #84  <Field Rect b>
	//   63  122:astore          5
				j1 = ((int) (flag1));
	//   64  124:iload_3         
	//   65  125:istore_2        
			}
			rect.top = j1;
	//   66  126:aload           5
	//   67  128:iload_2         
	//   68  129:putfield        #277 <Field int Rect.top>
		}
		b.bottom = b.top + k1;
	//   69  132:aload_0         
	//   70  133:getfield        #84  <Field Rect b>
	//   71  136:aload_0         
	//   72  137:getfield        #84  <Field Rect b>
	//   73  140:getfield        #277 <Field int Rect.top>
	//   74  143:iload           4
	//   75  145:iadd            
	//   76  146:putfield        #274 <Field int Rect.bottom>
		return a(i1, b.top, b.bottom);
	//   77  149:aload_0         
	//   78  150:iload_1         
	//   79  151:aload_0         
	//   80  152:getfield        #84  <Field Rect b>
	//   81  155:getfield        #277 <Field int Rect.top>
	//   82  158:aload_0         
	//   83  159:getfield        #84  <Field Rect b>
	//   84  162:getfield        #274 <Field int Rect.bottom>
	//   85  165:invokespecial   #513 <Method boolean a(int, int, int)>
	//   86  168:ireturn         
	}

	public int computeHorizontalScrollExtent()
	{
		return super.computeHorizontalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #514 <Method int FrameLayout.computeHorizontalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		return super.computeHorizontalScrollOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #517 <Method int FrameLayout.computeHorizontalScrollOffset()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		return super.computeHorizontalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #518 <Method int FrameLayout.computeHorizontalScrollRange()>
	//    2    4:ireturn         
	}

	public void computeScroll()
	{
		int i1;
		int l1;
		if(!c.computeScrollOffset())
			break MISSING_BLOCK_LABEL_215;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field OverScroller c>
	//    2    4:invokevirtual   #522 <Method boolean OverScroller.computeScrollOffset()>
	//    3    7:ifeq            215
		c.getCurrX();
	//    4   10:aload_0         
	//    5   11:getfield        #176 <Field OverScroller c>
	//    6   14:invokevirtual   #525 <Method int OverScroller.getCurrX()>
	//    7   17:pop             
		l1 = c.getCurrY();
	//    8   18:aload_0         
	//    9   19:getfield        #176 <Field OverScroller c>
	//   10   22:invokevirtual   #528 <Method int OverScroller.getCurrY()>
	//   11   25:istore_3        
		int j1 = l1 - u;
	//   12   26:iload_3         
	//   13   27:aload_0         
	//   14   28:getfield        #530 <Field int u>
	//   15   31:isub            
	//   16   32:istore_2        
		i1 = j1;
	//   17   33:iload_2         
	//   18   34:istore_1        
		if(a(0, j1, s, ((int []) (null)), 1))
	//*  19   35:aload_0         
	//*  20   36:iconst_0        
	//*  21   37:iload_2         
	//*  22   38:aload_0         
	//*  23   39:getfield        #100 <Field int[] s>
	//*  24   42:aconst_null     
	//*  25   43:iconst_1        
	//*  26   44:invokevirtual   #531 <Method boolean a(int, int, int[], int[], int)>
	//*  27   47:ifeq            59
			i1 = j1 - s[1];
	//   28   50:iload_2         
	//   29   51:aload_0         
	//   30   52:getfield        #100 <Field int[] s>
	//   31   55:iconst_1        
	//   32   56:iaload          
	//   33   57:isub            
	//   34   58:istore_1        
		if(i1 == 0) goto _L2; else goto _L1
	//   35   59:iload_1         
	//   36   60:ifeq            205
_L1:
		int k1;
		int i2;
		int j2;
		k1 = getScrollRange();
	//   37   63:aload_0         
	//   38   64:invokevirtual   #373 <Method int getScrollRange()>
	//   39   67:istore_2        
		i2 = getScrollY();
	//   40   68:aload_0         
	//   41   69:invokevirtual   #237 <Method int getScrollY()>
	//   42   72:istore          4
		a(0, i1, getScrollX(), i2, 0, k1, 0, 0, false);
	//   43   74:aload_0         
	//   44   75:iconst_0        
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:invokevirtual   #497 <Method int getScrollX()>
	//   48   81:iload           4
	//   49   83:iconst_0        
	//   50   84:iload_2         
	//   51   85:iconst_0        
	//   52   86:iconst_0        
	//   53   87:iconst_0        
	//   54   88:invokevirtual   #533 <Method boolean a(int, int, int, int, int, int, int, int, boolean)>
	//   55   91:pop             
		j2 = getScrollY() - i2;
	//   56   92:aload_0         
	//   57   93:invokevirtual   #237 <Method int getScrollY()>
	//   58   96:iload           4
	//   59   98:isub            
	//   60   99:istore          5
		if(a(0, j2, 0, i1 - j2, ((int []) (null)), 1)) goto _L2; else goto _L3
	//   61  101:aload_0         
	//   62  102:iconst_0        
	//   63  103:iload           5
	//   64  105:iconst_0        
	//   65  106:iload_1         
	//   66  107:iload           5
	//   67  109:isub            
	//   68  110:aconst_null     
	//   69  111:iconst_1        
	//   70  112:invokevirtual   #534 <Method boolean a(int, int, int, int, int[], int)>
	//   71  115:ifne            205
_L3:
		i1 = getOverScrollMode();
	//   72  118:aload_0         
	//   73  119:invokevirtual   #330 <Method int getOverScrollMode()>
	//   74  122:istore_1        
		if(i1 != 0 && (i1 != 1 || k1 <= 0))
	//*  75  123:iload_1         
	//*  76  124:ifeq            144
	//*  77  127:iload_1         
	//*  78  128:iconst_1        
	//*  79  129:icmpne          139
	//*  80  132:iload_2         
	//*  81  133:ifle            139
	//*  82  136:goto            144
			i1 = 0;
	//   83  139:iconst_0        
	//   84  140:istore_1        
		else
	//*  85  141:goto            146
			i1 = 1;
	//   86  144:iconst_1        
	//   87  145:istore_1        
		if(!i1) goto _L2; else goto _L4
	//   88  146:iload_1         
	//   89  147:ifeq            205
_L4:
		g();
	//   90  150:aload_0         
	//   91  151:invokespecial   #536 <Method void g()>
		if(l1 > 0 || i2 <= 0) goto _L6; else goto _L5
	//   92  154:iload_3         
	//   93  155:ifgt            185
	//   94  158:iload           4
	//   95  160:ifle            185
_L5:
		EdgeEffect edgeeffect = d;
	//   96  163:aload_0         
	//   97  164:getfield        #320 <Field EdgeEffect d>
	//   98  167:astore          6
_L7:
		edgeeffect.onAbsorb((int)c.getCurrVelocity());
	//   99  169:aload           6
	//  100  171:aload_0         
	//  101  172:getfield        #176 <Field OverScroller c>
	//  102  175:invokevirtual   #539 <Method float OverScroller.getCurrVelocity()>
	//  103  178:f2i             
	//  104  179:invokevirtual   #542 <Method void EdgeEffect.onAbsorb(int)>
		break; /* Loop/switch isn't completed */
	//  105  182:goto            205
_L6:
		if(l1 < k1 || i2 >= k1)
			break; /* Loop/switch isn't completed */
	//  106  185:iload_3         
	//  107  186:iload_2         
	//  108  187:icmplt          205
	//  109  190:iload           4
	//  110  192:iload_2         
	//  111  193:icmpge          205
		edgeeffect = e;
	//  112  196:aload_0         
	//  113  197:getfield        #327 <Field EdgeEffect e>
	//  114  200:astore          6
		if(true) goto _L7; else goto _L2
	//  115  202:goto            169
_L2:
		u = l1;
	//  116  205:aload_0         
	//  117  206:iload_3         
	//  118  207:putfield        #530 <Field int u>
		android.support.v4.view.s.c(((View) (this)));
	//  119  210:aload_0         
	//  120  211:invokestatic    #503 <Method void s.c(View)>
		return;
	//  121  214:return          
		if(b(1))
	//* 122  215:aload_0         
	//* 123  216:iconst_1        
	//* 124  217:invokevirtual   #417 <Method boolean b(int)>
	//* 125  220:ifeq            228
			a(1);
	//  126  223:aload_0         
	//  127  224:iconst_1        
	//  128  225:invokevirtual   #318 <Method void a(int)>
		u = 0;
	//  129  228:aload_0         
	//  130  229:iconst_0        
	//  131  230:putfield        #530 <Field int u>
		return;
	//  132  233:return          
	}

	public int computeVerticalScrollExtent()
	{
		return super.computeVerticalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #543 <Method int FrameLayout.computeVerticalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		return Math.max(0, super.computeVerticalScrollOffset());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokespecial   #546 <Method int FrameLayout.computeVerticalScrollOffset()>
	//    3    5:invokestatic    #398 <Method int Math.max(int, int)>
	//    4    8:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #307 <Method int getChildCount()>
	//    2    4:istore_2        
		int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #234 <Method int getHeight()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #299 <Method int getPaddingBottom()>
	//    7   13:isub            
	//    8   14:aload_0         
	//    9   15:invokevirtual   #296 <Method int getPaddingTop()>
	//   10   18:isub            
	//   11   19:istore_1        
		if(j1 == 0)
	//*  12   20:iload_2         
	//*  13   21:ifne            26
			return i1;
	//   14   24:iload_1         
	//   15   25:ireturn         
		j1 = getChildAt(0).getBottom();
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #292 <Method View getChildAt(int)>
	//   19   31:invokevirtual   #166 <Method int View.getBottom()>
	//   20   34:istore_2        
		int k1 = getScrollY();
	//   21   35:aload_0         
	//   22   36:invokevirtual   #237 <Method int getScrollY()>
	//   23   39:istore_3        
		int l1 = Math.max(0, j1 - i1);
	//   24   40:iconst_0        
	//   25   41:iload_2         
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:invokestatic    #398 <Method int Math.max(int, int)>
	//   29   47:istore          4
		if(k1 < 0)
	//*  30   49:iload_3         
	//*  31   50:ifge            57
			return j1 - k1;
	//   32   53:iload_2         
	//   33   54:iload_3         
	//   34   55:isub            
	//   35   56:ireturn         
		i1 = j1;
	//   36   57:iload_2         
	//   37   58:istore_1        
		if(k1 > l1)
	//*  38   59:iload_3         
	//*  39   60:iload           4
	//*  40   62:icmple          72
			i1 = j1 + (k1 - l1);
	//   41   65:iload_2         
	//   42   66:iload_3         
	//   43   67:iload           4
	//   44   69:isub            
	//   45   70:iadd            
	//   46   71:istore_1        
		return i1;
	//   47   72:iload_1         
	//   48   73:ireturn         
	}

	public boolean d(int i1)
	{
		boolean flag;
		if(i1 == 130)
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
		int k1 = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #234 <Method int getHeight()>
	//   10   18:istore_3        
		b.top = 0;
	//   11   19:aload_0         
	//   12   20:getfield        #84  <Field Rect b>
	//   13   23:iconst_0        
	//   14   24:putfield        #277 <Field int Rect.top>
		b.bottom = k1;
	//   15   27:aload_0         
	//   16   28:getfield        #84  <Field Rect b>
	//   17   31:iload_3         
	//   18   32:putfield        #274 <Field int Rect.bottom>
		if(flag)
	//*  19   35:iload_2         
	//*  20   36:ifeq            90
		{
			int j1 = getChildCount();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #307 <Method int getChildCount()>
	//   23   43:istore_2        
			if(j1 > 0)
	//*  24   44:iload_2         
	//*  25   45:ifle            90
			{
				View view = getChildAt(j1 - 1);
	//   26   48:aload_0         
	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:isub            
	//   30   52:invokevirtual   #292 <Method View getChildAt(int)>
	//   31   55:astore          4
				b.bottom = view.getBottom() + getPaddingBottom();
	//   32   57:aload_0         
	//   33   58:getfield        #84  <Field Rect b>
	//   34   61:aload           4
	//   35   63:invokevirtual   #166 <Method int View.getBottom()>
	//   36   66:aload_0         
	//   37   67:invokevirtual   #299 <Method int getPaddingBottom()>
	//   38   70:iadd            
	//   39   71:putfield        #274 <Field int Rect.bottom>
				b.top = b.bottom - k1;
	//   40   74:aload_0         
	//   41   75:getfield        #84  <Field Rect b>
	//   42   78:aload_0         
	//   43   79:getfield        #84  <Field Rect b>
	//   44   82:getfield        #274 <Field int Rect.bottom>
	//   45   85:iload_3         
	//   46   86:isub            
	//   47   87:putfield        #277 <Field int Rect.top>
			}
		}
		return a(i1, b.top, b.bottom);
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #84  <Field Rect b>
	//   52   96:getfield        #277 <Field int Rect.top>
	//   53   99:aload_0         
	//   54  100:getfield        #84  <Field Rect b>
	//   55  103:getfield        #274 <Field int Rect.bottom>
	//   56  106:invokespecial   #513 <Method boolean a(int, int, int)>
	//   57  109:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || a(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #549 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #551 <Method boolean a(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchNestedFling(float f1, float f2, boolean flag)
	{
		return z.a(f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #553 <Method boolean k.a(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f1, float f2)
	{
		return z.a(f1, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #555 <Method boolean k.a(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
	{
		return z.a(i1, j1, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #559 <Method boolean k.a(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
	{
		return z.a(i1, j1, k1, l1, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #563 <Method boolean k.a(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #567 <Method void FrameLayout.draw(Canvas)>
		if(d != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #320 <Field EdgeEffect d>
	//*   5    9:ifnull          208
		{
			int i1 = getScrollY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #237 <Method int getScrollY()>
	//    8   16:istore_2        
			if(!d.isFinished())
	//*   9   17:aload_0         
	//*  10   18:getfield        #320 <Field EdgeEffect d>
	//*  11   21:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//*  12   24:ifne            104
			{
				int j1 = canvas.save();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #573 <Method int Canvas.save()>
	//   15   31:istore_3        
				int l1 = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #576 <Method int getWidth()>
	//   18   36:istore          4
				int j2 = getPaddingLeft();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #579 <Method int getPaddingLeft()>
	//   21   42:istore          5
				int l2 = getPaddingRight();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #582 <Method int getPaddingRight()>
	//   24   48:istore          6
				canvas.translate(getPaddingLeft(), Math.min(0, i1));
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:invokevirtual   #579 <Method int getPaddingLeft()>
	//   28   55:i2f             
	//   29   56:iconst_0        
	//   30   57:iload_2         
	//   31   58:invokestatic    #395 <Method int Math.min(int, int)>
	//   32   61:i2f             
	//   33   62:invokevirtual   #586 <Method void Canvas.translate(float, float)>
				d.setSize(l1 - j2 - l2, getHeight());
	//   34   65:aload_0         
	//   35   66:getfield        #320 <Field EdgeEffect d>
	//   36   69:iload           4
	//   37   71:iload           5
	//   38   73:isub            
	//   39   74:iload           6
	//   40   76:isub            
	//   41   77:aload_0         
	//   42   78:invokevirtual   #234 <Method int getHeight()>
	//   43   81:invokevirtual   #589 <Method void EdgeEffect.setSize(int, int)>
				if(d.draw(canvas))
	//*  44   84:aload_0         
	//*  45   85:getfield        #320 <Field EdgeEffect d>
	//*  46   88:aload_1         
	//*  47   89:invokevirtual   #592 <Method boolean EdgeEffect.draw(Canvas)>
	//*  48   92:ifeq            99
					android.support.v4.view.s.c(((View) (this)));
	//   49   95:aload_0         
	//   50   96:invokestatic    #503 <Method void s.c(View)>
				canvas.restoreToCount(j1);
	//   51   99:aload_1         
	//   52  100:iload_3         
	//   53  101:invokevirtual   #595 <Method void Canvas.restoreToCount(int)>
			}
			if(!e.isFinished())
	//*  54  104:aload_0         
	//*  55  105:getfield        #327 <Field EdgeEffect e>
	//*  56  108:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//*  57  111:ifne            208
			{
				int k1 = canvas.save();
	//   58  114:aload_1         
	//   59  115:invokevirtual   #573 <Method int Canvas.save()>
	//   60  118:istore_3        
				int i2 = getWidth() - getPaddingLeft() - getPaddingRight();
	//   61  119:aload_0         
	//   62  120:invokevirtual   #576 <Method int getWidth()>
	//   63  123:aload_0         
	//   64  124:invokevirtual   #579 <Method int getPaddingLeft()>
	//   65  127:isub            
	//   66  128:aload_0         
	//   67  129:invokevirtual   #582 <Method int getPaddingRight()>
	//   68  132:isub            
	//   69  133:istore          4
				int k2 = getHeight();
	//   70  135:aload_0         
	//   71  136:invokevirtual   #234 <Method int getHeight()>
	//   72  139:istore          5
				canvas.translate(-i2 + getPaddingLeft(), Math.max(getScrollRange(), i1) + k2);
	//   73  141:aload_1         
	//   74  142:iload           4
	//   75  144:ineg            
	//   76  145:aload_0         
	//   77  146:invokevirtual   #579 <Method int getPaddingLeft()>
	//   78  149:iadd            
	//   79  150:i2f             
	//   80  151:aload_0         
	//   81  152:invokevirtual   #373 <Method int getScrollRange()>
	//   82  155:iload_2         
	//   83  156:invokestatic    #398 <Method int Math.max(int, int)>
	//   84  159:iload           5
	//   85  161:iadd            
	//   86  162:i2f             
	//   87  163:invokevirtual   #586 <Method void Canvas.translate(float, float)>
				canvas.rotate(180F, i2, 0.0F);
	//   88  166:aload_1         
	//   89  167:ldc2            #596 <Float 180F>
	//   90  170:iload           4
	//   91  172:i2f             
	//   92  173:fconst_0        
	//   93  174:invokevirtual   #600 <Method void Canvas.rotate(float, float, float)>
				e.setSize(i2, k2);
	//   94  177:aload_0         
	//   95  178:getfield        #327 <Field EdgeEffect e>
	//   96  181:iload           4
	//   97  183:iload           5
	//   98  185:invokevirtual   #589 <Method void EdgeEffect.setSize(int, int)>
				if(e.draw(canvas))
	//*  99  188:aload_0         
	//* 100  189:getfield        #327 <Field EdgeEffect e>
	//* 101  192:aload_1         
	//* 102  193:invokevirtual   #592 <Method boolean EdgeEffect.draw(Canvas)>
	//* 103  196:ifeq            203
					android.support.v4.view.s.c(((View) (this)));
	//  104  199:aload_0         
	//  105  200:invokestatic    #503 <Method void s.c(View)>
				canvas.restoreToCount(k1);
	//  106  203:aload_1         
	//  107  204:iload_3         
	//  108  205:invokevirtual   #595 <Method void Canvas.restoreToCount(int)>
			}
		}
	//  109  208:return          
	}

	public boolean e(int i1)
	{
		View view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method View findFocus()>
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
		view1 = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), view, i1);
	//   10   19:invokestatic    #451 <Method FocusFinder FocusFinder.getInstance()>
	//   11   22:aload_0         
	//   12   23:aload           5
	//   13   25:iload_1         
	//   14   26:invokevirtual   #455 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   15   29:astore          6
		int k1 = getMaxScrollAmount();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #603 <Method int getMaxScrollAmount()>
	//   18   35:istore_3        
		if(view1 != null && a(view1, k1, getHeight()))
	//*  19   36:aload           6
	//*  20   38:ifnull          96
	//*  21   41:aload_0         
	//*  22   42:aload           6
	//*  23   44:iload_3         
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #234 <Method int getHeight()>
	//*  26   49:invokespecial   #263 <Method boolean a(View, int, int)>
	//*  27   52:ifeq            96
		{
			view1.getDrawingRect(b);
	//   28   55:aload           6
	//   29   57:aload_0         
	//   30   58:getfield        #84  <Field Rect b>
	//   31   61:invokevirtual   #267 <Method void View.getDrawingRect(Rect)>
			offsetDescendantRectToMyCoords(view1, b);
	//   32   64:aload_0         
	//   33   65:aload           6
	//   34   67:aload_0         
	//   35   68:getfield        #84  <Field Rect b>
	//   36   71:invokevirtual   #271 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			g(a(b));
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:aload_0         
	//   40   77:getfield        #84  <Field Rect b>
	//   41   80:invokevirtual   #253 <Method int a(Rect)>
	//   42   83:invokespecial   #241 <Method void g(int)>
			view1.requestFocus(i1);
	//   43   86:aload           6
	//   44   88:iload_1         
	//   45   89:invokevirtual   #249 <Method boolean View.requestFocus(int)>
	//   46   92:pop             
		} else
	//*  47   93:goto            196
		{
			int j1;
			if(i1 == 33 && getScrollY() < k1)
	//*  48   96:iload_1         
	//*  49   97:bipush          33
	//*  50   99:icmpne          118
	//*  51  102:aload_0         
	//*  52  103:invokevirtual   #237 <Method int getScrollY()>
	//*  53  106:iload_3         
	//*  54  107:icmpge          118
			{
				j1 = getScrollY();
	//   55  110:aload_0         
	//   56  111:invokevirtual   #237 <Method int getScrollY()>
	//   57  114:istore_2        
			} else
	//*  58  115:goto            172
			{
				j1 = k1;
	//   59  118:iload_3         
	//   60  119:istore_2        
				if(i1 == 130)
	//*  61  120:iload_1         
	//*  62  121:sipush          130
	//*  63  124:icmpne          172
				{
					j1 = k1;
	//   64  127:iload_3         
	//   65  128:istore_2        
					if(getChildCount() > 0)
	//*  66  129:aload_0         
	//*  67  130:invokevirtual   #307 <Method int getChildCount()>
	//*  68  133:ifle            172
					{
						int l1 = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
	//   69  136:aload_0         
	//   70  137:iconst_0        
	//   71  138:invokevirtual   #292 <Method View getChildAt(int)>
	//   72  141:invokevirtual   #166 <Method int View.getBottom()>
	//   73  144:aload_0         
	//   74  145:invokevirtual   #237 <Method int getScrollY()>
	//   75  148:aload_0         
	//   76  149:invokevirtual   #234 <Method int getHeight()>
	//   77  152:iadd            
	//   78  153:aload_0         
	//   79  154:invokevirtual   #299 <Method int getPaddingBottom()>
	//   80  157:isub            
	//   81  158:isub            
	//   82  159:istore          4
						j1 = k1;
	//   83  161:iload_3         
	//   84  162:istore_2        
						if(l1 < k1)
	//*  85  163:iload           4
	//*  86  165:iload_3         
	//*  87  166:icmpge          172
							j1 = l1;
	//   88  169:iload           4
	//   89  171:istore_2        
					}
				}
			}
			if(j1 == 0)
	//*  90  172:iload_2         
	//*  91  173:ifne            178
				return false;
	//   92  176:iconst_0        
	//   93  177:ireturn         
			if(i1 != 130)
	//*  94  178:iload_1         
	//*  95  179:sipush          130
	//*  96  182:icmpne          188
	//*  97  185:goto            191
				j1 = -j1;
	//   98  188:iload_2         
	//   99  189:ineg            
	//  100  190:istore_2        
			g(j1);
	//  101  191:aload_0         
	//  102  192:iload_2         
	//  103  193:invokespecial   #241 <Method void g(int)>
		}
		if(view != null && view.isFocused() && a(view))
	//* 104  196:aload           5
	//* 105  198:ifnull          240
	//* 106  201:aload           5
	//* 107  203:invokevirtual   #604 <Method boolean View.isFocused()>
	//* 108  206:ifeq            240
	//* 109  209:aload_0         
	//* 110  210:aload           5
	//* 111  212:invokespecial   #606 <Method boolean a(View)>
	//* 112  215:ifeq            240
		{
			i1 = getDescendantFocusability();
	//  113  218:aload_0         
	//  114  219:invokevirtual   #609 <Method int getDescendantFocusability()>
	//  115  222:istore_1        
			setDescendantFocusability(0x20000);
	//  116  223:aload_0         
	//  117  224:ldc2            #610 <Int 0x20000>
	//  118  227:invokevirtual   #184 <Method void setDescendantFocusability(int)>
			requestFocus();
	//  119  230:aload_0         
	//  120  231:invokevirtual   #612 <Method boolean requestFocus()>
	//  121  234:pop             
			setDescendantFocusability(i1);
	//  122  235:aload_0         
	//  123  236:iload_1         
	//  124  237:invokevirtual   #184 <Method void setDescendantFocusability(int)>
		}
		return true;
	//  125  240:iconst_1        
	//  126  241:ireturn         
	}

	public void f(int i1)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            53
		{
			a(2, 1);
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #613 <Method boolean a(int, int)>
	//    7   13:pop             
			c.fling(getScrollX(), getScrollY(), 0, i1, 0, 0, 0x80000000, 0x7fffffff, 0, 0);
	//    8   14:aload_0         
	//    9   15:getfield        #176 <Field OverScroller c>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #497 <Method int getScrollX()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #237 <Method int getScrollY()>
	//   14   26:iconst_0        
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:ldc2            #614 <Int 0x80000000>
	//   19   33:ldc2            #615 <Int 0x7fffffff>
	//   20   36:iconst_0        
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #619 <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
			u = getScrollY();
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #237 <Method int getScrollY()>
	//   26   46:putfield        #530 <Field int u>
			android.support.v4.view.s.c(((View) (this)));
	//   27   49:aload_0         
	//   28   50:invokestatic    #503 <Method void s.c(View)>
		}
	//   29   53:return          
	}

	protected float getBottomFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i1 = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #386 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j1 = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #234 <Method int getHeight()>
	//   10   18:istore_2        
		int k1 = getPaddingBottom();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #299 <Method int getPaddingBottom()>
	//   13   23:istore_3        
		j1 = getChildAt(0).getBottom() - getScrollY() - (j1 - k1);
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #292 <Method View getChildAt(int)>
	//   17   29:invokevirtual   #166 <Method int View.getBottom()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #237 <Method int getScrollY()>
	//   20   36:isub            
	//   21   37:iload_2         
	//   22   38:iload_3         
	//   23   39:isub            
	//   24   40:isub            
	//   25   41:istore_2        
		if(j1 < i1)
	//*  26   42:iload_2         
	//*  27   43:iload_1         
	//*  28   44:icmpge          53
			return (float)j1 / (float)i1;
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
	//    1    1:invokevirtual   #234 <Method int getHeight()>
	//    2    4:i2f             
	//    3    5:ldc2            #621 <Float 0.5F>
	//    4    8:fmul            
	//    5    9:f2i             
	//    6   10:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return y.a();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field n y>
	//    2    4:invokevirtual   #624 <Method int n.a()>
	//    3    7:ireturn         
	}

	int getScrollRange()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #307 <Method int getChildCount()>
	//    2    4:istore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(j1 > 0)
	//*   5    7:iload_2         
	//*   6    8:ifle            39
			i1 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #292 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #293 <Method int View.getHeight()>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #234 <Method int getHeight()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #299 <Method int getPaddingBottom()>
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:invokevirtual   #296 <Method int getPaddingTop()>
	//   19   33:isub            
	//   20   34:isub            
	//   21   35:invokestatic    #398 <Method int Math.max(int, int)>
	//   22   38:istore_1        
		return i1;
	//   23   39:iload_1         
	//   24   40:ireturn         
	}

	protected float getTopFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i1 = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #386 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j1 = getScrollY();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #237 <Method int getScrollY()>
	//   10   18:istore_2        
		if(j1 < i1)
	//*  11   19:iload_2         
	//*  12   20:iload_1         
	//*  13   21:icmpge          30
			return (float)j1 / (float)i1;
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
		return z.b();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:invokevirtual   #627 <Method boolean k.b()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return z.a();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:invokevirtual   #630 <Method boolean k.a()>
	//    3    7:ireturn         
	}

	protected void measureChild(View view, int i1, int j1)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #636 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          4
		view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_0         
	//    6    9:invokevirtual   #579 <Method int getPaddingLeft()>
	//    7   12:aload_0         
	//    8   13:invokevirtual   #582 <Method int getPaddingRight()>
	//    9   16:iadd            
	//   10   17:aload           4
	//   11   19:getfield        #641 <Field int android.view.ViewGroup$LayoutParams.width>
	//   12   22:invokestatic    #644 <Method int getChildMeasureSpec(int, int, int)>
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:invokestatic    #649 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   30:invokevirtual   #652 <Method void View.measure(int, int)>
	//   17   33:return          
	}

	protected void measureChildWithMargins(View view, int i1, int j1, int k1, int l1)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #636 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #656 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          6
		view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #579 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #582 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:aload           6
	//   12   22:getfield        #659 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:iadd            
	//   14   26:aload           6
	//   15   28:getfield        #662 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   16   31:iadd            
	//   17   32:iload_3         
	//   18   33:iadd            
	//   19   34:aload           6
	//   20   36:getfield        #663 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   21   39:invokestatic    #644 <Method int getChildMeasureSpec(int, int, int)>
	//   22   42:aload           6
	//   23   44:getfield        #666 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   24   47:aload           6
	//   25   49:getfield        #669 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   26   52:iadd            
	//   27   53:iconst_0        
	//   28   54:invokestatic    #649 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   57:invokevirtual   #652 <Method void View.measure(int, int)>
	//   30   60:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #672 <Method void FrameLayout.onAttachedToWindow()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #88  <Field boolean h>
	//    5    9:return          
	}

	public boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #677 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            106
		{
			if(motionevent.getAction() != 8)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #678 <Method int MotionEvent.getAction()>
	//*   7   13:bipush          8
	//*   8   15:icmpeq          20
				return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
			if(!j)
	//*  11   20:aload_0         
	//*  12   21:getfield        #92  <Field boolean j>
	//*  13   24:ifne            106
			{
				float f1 = motionevent.getAxisValue(9);
	//   14   27:aload_1         
	//   15   28:bipush          9
	//   16   30:invokevirtual   #681 <Method float MotionEvent.getAxisValue(int)>
	//   17   33:fstore_2        
				if(f1 != 0.0F)
	//*  18   34:fload_2         
	//*  19   35:fconst_0        
	//*  20   36:fcmpl           
	//*  21   37:ifeq            106
				{
					int i1 = (int)(f1 * getVerticalScrollFactorCompat());
	//   22   40:fload_2         
	//   23   41:aload_0         
	//   24   42:invokespecial   #683 <Method float getVerticalScrollFactorCompat()>
	//   25   45:fmul            
	//   26   46:f2i             
	//   27   47:istore_3        
					int j1 = getScrollRange();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #373 <Method int getScrollRange()>
	//   30   52:istore          4
					int l1 = getScrollY();
	//   31   54:aload_0         
	//   32   55:invokevirtual   #237 <Method int getScrollY()>
	//   33   58:istore          6
					int k1 = l1 - i1;
	//   34   60:iload           6
	//   35   62:iload_3         
	//   36   63:isub            
	//   37   64:istore          5
					if(k1 < 0)
	//*  38   66:iload           5
	//*  39   68:ifge            76
					{
						i1 = 0;
	//   40   71:iconst_0        
	//   41   72:istore_3        
					} else
	//*  42   73:goto            89
					{
						i1 = k1;
	//   43   76:iload           5
	//   44   78:istore_3        
						if(k1 > j1)
	//*  45   79:iload           5
	//*  46   81:iload           4
	//*  47   83:icmple          89
							i1 = j1;
	//   48   86:iload           4
	//   49   88:istore_3        
					}
					if(i1 != l1)
	//*  50   89:iload_3         
	//*  51   90:iload           6
	//*  52   92:icmpeq          106
					{
						super.scrollTo(getScrollX(), i1);
	//   53   95:aload_0         
	//   54   96:aload_0         
	//   55   97:invokevirtual   #497 <Method int getScrollX()>
	//   56  100:iload_3         
	//   57  101:invokespecial   #686 <Method void FrameLayout.scrollTo(int, int)>
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
		int i1 = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #678 <Method int MotionEvent.getAction()>
	//    2    4:istore_2        
		if(i1 == 2 && j)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          19
	//*   6   10:aload_0         
	//*   7   11:getfield        #92  <Field boolean j>
	//*   8   14:ifeq            19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		i1 &= 0xff;
	//   11   19:iload_2         
	//   12   20:sipush          255
	//   13   23:iand            
	//   14   24:istore_2        
		if(i1 != 6)
	//*  15   25:iload_2         
	//*  16   26:bipush          6
	//*  17   28:icmpeq          352
			switch(i1)
	//*  18   31:iload_2         
			{
	//*  19   32:tableswitch     0 3: default 64
	//	               0 264
	//	               1 213
	//	               2 67
	//	               3 213
	//*  20   64:goto            357
			case 2: // '\002'
				int j1 = q;
	//   21   67:aload_0         
	//   22   68:getfield        #96  <Field int q>
	//   23   71:istore_2        
				if(j1 != -1)
	//*  24   72:iload_2         
	//*  25   73:iconst_m1       
	//*  26   74:icmpne          80
	//*  27   77:goto            357
				{
					int i2 = motionevent.findPointerIndex(j1);
	//   28   80:aload_1         
	//   29   81:iload_2         
	//   30   82:invokevirtual   #690 <Method int MotionEvent.findPointerIndex(int)>
	//   31   85:istore_3        
					if(i2 == -1)
	//*  32   86:iload_3         
	//*  33   87:iconst_m1       
	//*  34   88:icmpne          135
					{
						motionevent = ((MotionEvent) (new StringBuilder()));
	//   35   91:new             #692 <Class StringBuilder>
	//   36   94:dup             
	//   37   95:invokespecial   #693 <Method void StringBuilder()>
	//   38   98:astore_1        
						((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   39   99:aload_1         
	//   40  100:ldc2            #695 <String "Invalid pointerId=">
	//   41  103:invokevirtual   #699 <Method StringBuilder StringBuilder.append(String)>
	//   42  106:pop             
						((StringBuilder) (motionevent)).append(j1);
	//   43  107:aload_1         
	//   44  108:iload_2         
	//   45  109:invokevirtual   #702 <Method StringBuilder StringBuilder.append(int)>
	//   46  112:pop             
						((StringBuilder) (motionevent)).append(" in onInterceptTouchEvent");
	//   47  113:aload_1         
	//   48  114:ldc2            #704 <String " in onInterceptTouchEvent">
	//   49  117:invokevirtual   #699 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:pop             
						Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//   51  121:ldc2            #706 <String "NestedScrollView">
	//   52  124:aload_1         
	//   53  125:invokevirtual   #710 <Method String StringBuilder.toString()>
	//   54  128:invokestatic    #715 <Method int Log.e(String, String)>
	//   55  131:pop             
					} else
	//*  56  132:goto            357
					{
						int k1 = (int)motionevent.getY(i2);
	//   57  135:aload_1         
	//   58  136:iload_3         
	//   59  137:invokevirtual   #221 <Method float MotionEvent.getY(int)>
	//   60  140:f2i             
	//   61  141:istore_2        
						if(Math.abs(k1 - f) > n && (2 & getNestedScrollAxes()) == 0)
	//*  62  142:iload_2         
	//*  63  143:aload_0         
	//*  64  144:getfield        #223 <Field int f>
	//*  65  147:isub            
	//*  66  148:invokestatic    #718 <Method int Math.abs(int)>
	//*  67  151:aload_0         
	//*  68  152:getfield        #197 <Field int n>
	//*  69  155:icmple          357
	//*  70  158:iconst_2        
	//*  71  159:aload_0         
	//*  72  160:invokevirtual   #720 <Method int getNestedScrollAxes()>
	//*  73  163:iand            
	//*  74  164:ifne            357
						{
							j = true;
	//   75  167:aload_0         
	//   76  168:iconst_1        
	//   77  169:putfield        #92  <Field boolean j>
							f = k1;
	//   78  172:aload_0         
	//   79  173:iload_2         
	//   80  174:putfield        #223 <Field int f>
							d();
	//   81  177:aload_0         
	//   82  178:invokespecial   #722 <Method void d()>
							k.addMovement(motionevent);
	//   83  181:aload_0         
	//   84  182:getfield        #225 <Field VelocityTracker k>
	//   85  185:aload_1         
	//   86  186:invokevirtual   #725 <Method void VelocityTracker.addMovement(MotionEvent)>
							t = 0;
	//   87  189:aload_0         
	//   88  190:iconst_0        
	//   89  191:putfield        #727 <Field int t>
							motionevent = ((MotionEvent) (getParent()));
	//   90  194:aload_0         
	//   91  195:invokevirtual   #728 <Method ViewParent getParent()>
	//   92  198:astore_1        
							if(motionevent != null)
	//*  93  199:aload_1         
	//*  94  200:ifnull          357
								((ViewParent) (motionevent)).requestDisallowInterceptTouchEvent(true);
	//   95  203:aload_1         
	//   96  204:iconst_1        
	//   97  205:invokeinterface #733 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
						}
					}
				}
				break;

	//*  98  210:goto            357
			case 1: // '\001'
			case 3: // '\003'
				j = false;
	//   99  213:aload_0         
	//  100  214:iconst_0        
	//  101  215:putfield        #92  <Field boolean j>
				q = -1;
	//  102  218:aload_0         
	//  103  219:iconst_m1       
	//  104  220:putfield        #96  <Field int q>
				e();
	//  105  223:aload_0         
	//  106  224:invokespecial   #316 <Method void e()>
				if(c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 107  227:aload_0         
	//* 108  228:getfield        #176 <Field OverScroller c>
	//* 109  231:aload_0         
	//* 110  232:invokevirtual   #497 <Method int getScrollX()>
	//* 111  235:aload_0         
	//* 112  236:invokevirtual   #237 <Method int getScrollY()>
	//* 113  239:iconst_0        
	//* 114  240:iconst_0        
	//* 115  241:iconst_0        
	//* 116  242:aload_0         
	//* 117  243:invokevirtual   #373 <Method int getScrollRange()>
	//* 118  246:invokevirtual   #421 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 119  249:ifeq            256
					android.support.v4.view.s.c(((View) (this)));
	//  120  252:aload_0         
	//  121  253:invokestatic    #503 <Method void s.c(View)>
				a(0);
	//  122  256:aload_0         
	//  123  257:iconst_0        
	//  124  258:invokevirtual   #318 <Method void a(int)>
				break;

	//* 125  261:goto            357
			case 0: // '\0'
				int l1 = (int)motionevent.getY();
	//  126  264:aload_1         
	//  127  265:invokevirtual   #735 <Method float MotionEvent.getY()>
	//  128  268:f2i             
	//  129  269:istore_2        
				if(!d((int)motionevent.getX(), l1))
	//* 130  270:aload_0         
	//* 131  271:aload_1         
	//* 132  272:invokevirtual   #738 <Method float MotionEvent.getX()>
	//* 133  275:f2i             
	//* 134  276:iload_2         
	//* 135  277:invokespecial   #740 <Method boolean d(int, int)>
	//* 136  280:ifne            295
				{
					j = false;
	//  137  283:aload_0         
	//  138  284:iconst_0        
	//  139  285:putfield        #92  <Field boolean j>
					e();
	//  140  288:aload_0         
	//  141  289:invokespecial   #316 <Method void e()>
				} else
	//* 142  292:goto            357
				{
					f = l1;
	//  143  295:aload_0         
	//  144  296:iload_2         
	//  145  297:putfield        #223 <Field int f>
					q = motionevent.getPointerId(0);
	//  146  300:aload_0         
	//  147  301:aload_1         
	//  148  302:iconst_0        
	//  149  303:invokevirtual   #217 <Method int MotionEvent.getPointerId(int)>
	//  150  306:putfield        #96  <Field int q>
					c();
	//  151  309:aload_0         
	//  152  310:invokespecial   #742 <Method void c()>
					k.addMovement(motionevent);
	//  153  313:aload_0         
	//  154  314:getfield        #225 <Field VelocityTracker k>
	//  155  317:aload_1         
	//  156  318:invokevirtual   #725 <Method void VelocityTracker.addMovement(MotionEvent)>
					c.computeScrollOffset();
	//  157  321:aload_0         
	//  158  322:getfield        #176 <Field OverScroller c>
	//  159  325:invokevirtual   #522 <Method boolean OverScroller.computeScrollOffset()>
	//  160  328:pop             
					j = c.isFinished() ^ true;
	//  161  329:aload_0         
	//  162  330:aload_0         
	//  163  331:getfield        #176 <Field OverScroller c>
	//  164  334:invokevirtual   #506 <Method boolean OverScroller.isFinished()>
	//  165  337:iconst_1        
	//  166  338:ixor            
	//  167  339:putfield        #92  <Field boolean j>
					a(2, 0);
	//  168  342:aload_0         
	//  169  343:iconst_2        
	//  170  344:iconst_0        
	//  171  345:invokevirtual   #613 <Method boolean a(int, int)>
	//  172  348:pop             
				}
				break;
			}
		else
	//* 173  349:goto            357
			a(motionevent);
	//  174  352:aload_0         
	//  175  353:aload_1         
	//  176  354:invokespecial   #744 <Method void a(MotionEvent)>
		return j;
	//  177  357:aload_0         
	//  178  358:getfield        #92  <Field boolean j>
	//  179  361:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #748 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		g = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #86  <Field boolean g>
		if(i != null && a(i, ((View) (this))))
	//*  10   16:aload_0         
	//*  11   17:getfield        #90  <Field View i>
	//*  12   20:ifnull          42
	//*  13   23:aload_0         
	//*  14   24:getfield        #90  <Field View i>
	//*  15   27:aload_0         
	//*  16   28:invokestatic    #286 <Method boolean a(View, View)>
	//*  17   31:ifeq            42
			b(i);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #90  <Field View i>
	//   21   39:invokespecial   #750 <Method void b(View)>
		i = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #90  <Field View i>
		if(!h)
	//*  25   47:aload_0         
	//*  26   48:getfield        #88  <Field boolean h>
	//*  27   51:ifne            159
		{
			if(v != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #752 <Field NestedScrollView$SavedState v>
	//*  30   58:ifnull          81
			{
				scrollTo(getScrollX(), v.a);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #497 <Method int getScrollX()>
	//   34   66:aload_0         
	//   35   67:getfield        #752 <Field NestedScrollView$SavedState v>
	//   36   70:getfield        #754 <Field int NestedScrollView$SavedState.a>
	//   37   73:invokevirtual   #755 <Method void scrollTo(int, int)>
				v = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #752 <Field NestedScrollView$SavedState v>
			}
			if(getChildCount() > 0)
	//*  41   81:aload_0         
	//*  42   82:invokevirtual   #307 <Method int getChildCount()>
	//*  43   85:ifle            100
				i1 = getChildAt(0).getMeasuredHeight();
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #292 <Method View getChildAt(int)>
	//   47   93:invokevirtual   #758 <Method int View.getMeasuredHeight()>
	//   48   96:istore_2        
			else
	//*  49   97:goto            102
				i1 = 0;
	//   50  100:iconst_0        
	//   51  101:istore_2        
			i1 = Math.max(0, i1 - (l1 - j1 - getPaddingBottom() - getPaddingTop()));
	//   52  102:iconst_0        
	//   53  103:iload_2         
	//   54  104:iload           5
	//   55  106:iload_3         
	//   56  107:isub            
	//   57  108:aload_0         
	//   58  109:invokevirtual   #299 <Method int getPaddingBottom()>
	//   59  112:isub            
	//   60  113:aload_0         
	//   61  114:invokevirtual   #296 <Method int getPaddingTop()>
	//   62  117:isub            
	//   63  118:isub            
	//   64  119:invokestatic    #398 <Method int Math.max(int, int)>
	//   65  122:istore_2        
			if(getScrollY() > i1)
	//*  66  123:aload_0         
	//*  67  124:invokevirtual   #237 <Method int getScrollY()>
	//*  68  127:iload_2         
	//*  69  128:icmple          143
				scrollTo(getScrollX(), i1);
	//   70  131:aload_0         
	//   71  132:aload_0         
	//   72  133:invokevirtual   #497 <Method int getScrollX()>
	//   73  136:iload_2         
	//   74  137:invokevirtual   #755 <Method void scrollTo(int, int)>
			else
	//*  75  140:goto            159
			if(getScrollY() < 0)
	//*  76  143:aload_0         
	//*  77  144:invokevirtual   #237 <Method int getScrollY()>
	//*  78  147:ifge            159
				scrollTo(getScrollX(), 0);
	//   79  150:aload_0         
	//   80  151:aload_0         
	//   81  152:invokevirtual   #497 <Method int getScrollX()>
	//   82  155:iconst_0        
	//   83  156:invokevirtual   #755 <Method void scrollTo(int, int)>
		}
		scrollTo(getScrollX(), getScrollY());
	//   84  159:aload_0         
	//   85  160:aload_0         
	//   86  161:invokevirtual   #497 <Method int getScrollX()>
	//   87  164:aload_0         
	//   88  165:invokevirtual   #237 <Method int getScrollY()>
	//   89  168:invokevirtual   #755 <Method void scrollTo(int, int)>
		h = true;
	//   90  171:aload_0         
	//   91  172:iconst_1        
	//   92  173:putfield        #88  <Field boolean h>
	//   93  176:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		super.onMeasure(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #761 <Method void FrameLayout.onMeasure(int, int)>
		if(!l)
	//*   4    6:aload_0         
	//*   5    7:getfield        #763 <Field boolean l>
	//*   6   10:ifne            14
			return;
	//    7   13:return          
		if(android.view.View.MeasureSpec.getMode(j1) == 0)
	//*   8   14:iload_2         
	//*   9   15:invokestatic    #766 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  10   18:ifne            22
			return;
	//   11   21:return          
		if(getChildCount() > 0)
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #307 <Method int getChildCount()>
	//*  14   26:ifle            96
		{
			View view = getChildAt(0);
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #292 <Method View getChildAt(int)>
	//   18   34:astore_3        
			j1 = getMeasuredHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #767 <Method int getMeasuredHeight()>
	//   21   39:istore_2        
			if(view.getMeasuredHeight() < j1)
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #758 <Method int View.getMeasuredHeight()>
	//*  24   44:iload_2         
	//*  25   45:icmpge          96
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #636 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   52:checkcast       #769 <Class android.widget.FrameLayout$LayoutParams>
	//   29   55:astore          4
				view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j1 - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   30   57:aload_3         
	//   31   58:iload_1         
	//   32   59:aload_0         
	//   33   60:invokevirtual   #579 <Method int getPaddingLeft()>
	//   34   63:aload_0         
	//   35   64:invokevirtual   #582 <Method int getPaddingRight()>
	//   36   67:iadd            
	//   37   68:aload           4
	//   38   70:getfield        #770 <Field int android.widget.FrameLayout$LayoutParams.width>
	//   39   73:invokestatic    #644 <Method int getChildMeasureSpec(int, int, int)>
	//   40   76:iload_2         
	//   41   77:aload_0         
	//   42   78:invokevirtual   #296 <Method int getPaddingTop()>
	//   43   81:isub            
	//   44   82:aload_0         
	//   45   83:invokevirtual   #299 <Method int getPaddingBottom()>
	//   46   86:isub            
	//   47   87:ldc2            #771 <Int 0x40000000>
	//   48   90:invokestatic    #649 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   49   93:invokevirtual   #652 <Method void View.measure(int, int)>
			}
		}
	//   50   96:return          
	}

	public boolean onNestedFling(View view, float f1, float f2, boolean flag)
	{
		if(!flag)
	//*   0    0:iload           4
	//*   1    2:ifne            13
		{
			h((int)f2);
	//    2    5:aload_0         
	//    3    6:fload_3         
	//    4    7:f2i             
	//    5    8:invokespecial   #775 <Method void h(int)>
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

	public boolean onNestedPreFling(View view, float f1, float f2)
	{
		return dispatchNestedPreFling(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #377 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i1, int j1, int ai[])
	{
		dispatchNestedPreScroll(i1, j1, ai, ((int []) (null)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:invokevirtual   #781 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//    6    9:pop             
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
	{
		i1 = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method int getScrollY()>
	//    2    4:istore_2        
		scrollBy(0, l1);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iload           5
	//    6    9:invokevirtual   #257 <Method void scrollBy(int, int)>
		i1 = getScrollY() - i1;
	//    7   12:aload_0         
	//    8   13:invokevirtual   #237 <Method int getScrollY()>
	//    9   16:iload_2         
	//   10   17:isub            
	//   11   18:istore_2        
		dispatchNestedScroll(0, i1, 0, l1 - i1, ((int []) (null)));
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

	public void onNestedScrollAccepted(View view, View view1, int i1)
	{
		y.a(view, view1, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field n y>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #788 <Method void n.a(View, View, int)>
		startNestedScroll(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokevirtual   #791 <Method boolean startNestedScroll(int)>
	//    9   15:pop             
	//   10   16:return          
	}

	protected void onOverScrolled(int i1, int j1, boolean flag, boolean flag1)
	{
		super.scrollTo(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #686 <Method void FrameLayout.scrollTo(int, int)>
	//    4    6:return          
	}

	protected boolean onRequestFocusInDescendants(int i1, Rect rect)
	{
		int j1;
		if(i1 == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          12
		{
			j1 = 130;
	//    3    5:sipush          130
	//    4    8:istore_3        
		} else
	//*   5    9:goto            22
		{
			j1 = i1;
	//    6   12:iload_1         
	//    7   13:istore_3        
			if(i1 == 1)
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmpne          22
				j1 = 33;
	//   11   19:bipush          33
	//   12   21:istore_3        
		}
		View view;
		if(rect == null)
	//*  13   22:aload_2         
	//*  14   23:ifnonnull       40
			view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (null)), j1);
	//   15   26:invokestatic    #451 <Method FocusFinder FocusFinder.getInstance()>
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:iload_3         
	//   19   32:invokevirtual   #455 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   20   35:astore          4
		else
	//*  21   37:goto            51
			view = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup) (this)), rect, j1);
	//   22   40:invokestatic    #451 <Method FocusFinder FocusFinder.getInstance()>
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #797 <Method View FocusFinder.findNextFocusFromRect(ViewGroup, Rect, int)>
	//   27   49:astore          4
		if(view == null)
	//*  28   51:aload           4
	//*  29   53:ifnonnull       58
			return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		if(a(view))
	//*  32   58:aload_0         
	//*  33   59:aload           4
	//*  34   61:invokespecial   #606 <Method boolean a(View)>
	//*  35   64:ifeq            69
			return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
		else
			return view.requestFocus(j1, rect);
	//   38   69:aload           4
	//   39   71:iload_3         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #799 <Method boolean View.requestFocus(int, Rect)>
	//   42   76:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #10  <Class NestedScrollView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #803 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #10  <Class NestedScrollView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #807 <Method Parcelable NestedScrollView$SavedState.getSuperState()>
	//   13   23:invokespecial   #803 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			v = ((SavedState) (parcelable));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #752 <Field NestedScrollView$SavedState v>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #810 <Method void requestLayout()>
			return;
	//   19   35:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #10  <Class NestedScrollView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #813 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #815 <Method void NestedScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = getScrollY();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #237 <Method int getScrollY()>
	//    9   17:putfield        #754 <Field int NestedScrollView$SavedState.a>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	protected void onScrollChanged(int i1, int j1, int k1, int l1)
	{
		super.onScrollChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #818 <Method void FrameLayout.onScrollChanged(int, int, int, int)>
		if(B != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #820 <Field NestedScrollView$b B>
	//*   8   13:ifnull          31
			B.a(this, i1, j1, k1, l1);
	//    9   16:aload_0         
	//   10   17:getfield        #820 <Field NestedScrollView$b B>
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokeinterface #823 <Method void NestedScrollView$b.a(NestedScrollView, int, int, int, int)>
	//   17   31:return          
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #826 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		View view = findFocus();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #245 <Method View findFocus()>
	//    8   13:astore          5
		if(view != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          70
		{
			if(this == view)
	//*  11   20:aload_0         
	//*  12   21:aload           5
	//*  13   23:if_acmpne       27
				return;
	//   14   26:return          
			if(a(view, 0, l1))
	//*  15   27:aload_0         
	//*  16   28:aload           5
	//*  17   30:iconst_0        
	//*  18   31:iload           4
	//*  19   33:invokespecial   #263 <Method boolean a(View, int, int)>
	//*  20   36:ifeq            70
			{
				view.getDrawingRect(b);
	//   21   39:aload           5
	//   22   41:aload_0         
	//   23   42:getfield        #84  <Field Rect b>
	//   24   45:invokevirtual   #267 <Method void View.getDrawingRect(Rect)>
				offsetDescendantRectToMyCoords(view, b);
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:aload_0         
	//   28   52:getfield        #84  <Field Rect b>
	//   29   55:invokevirtual   #271 <Method void offsetDescendantRectToMyCoords(View, Rect)>
				g(a(b));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #84  <Field Rect b>
	//   34   64:invokevirtual   #253 <Method int a(Rect)>
	//   35   67:invokespecial   #241 <Method void g(int)>
			}
		}
	//   36   70:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i1)
	{
		return (i1 & 2) != 0;
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
		y.a(view);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field n y>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #831 <Method void n.a(View)>
		stopNestedScroll();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #834 <Method void stopNestedScroll()>
	//    6   12:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1;
		MotionEvent motionevent1;
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #722 <Method void d()>
		motionevent1 = MotionEvent.obtain(motionevent);
	//    2    4:aload_1         
	//    3    5:invokestatic    #838 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    4    8:astore          9
		i1 = motionevent.getActionMasked();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #841 <Method int MotionEvent.getActionMasked()>
	//    7   14:istore_2        
		if(i1 == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            24
			t = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #727 <Field int t>
		motionevent1.offsetLocation(0.0F, t);
	//   13   24:aload           9
	//   14   26:fconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #727 <Field int t>
	//   17   31:i2f             
	//   18   32:invokevirtual   #844 <Method void MotionEvent.offsetLocation(float, float)>
		i1;
	//   19   35:iload_2         
		JVM INSTR tableswitch 0 6: default 80
	//	               0 793
	//	               1 718
	//	               2 190
	//	               3 135
	//	               4 80
	//	               5 108
	//	               6 83;
	//   20   36:tableswitch     0 6: default 80
	//	               0 793
	//	               1 718
	//	               2 190
	//	               3 135
	//	               4 80
	//	               5 108
	//	               6 83
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
		break MISSING_BLOCK_LABEL_885;
	//   21   80:goto            885
_L7:
		a(motionevent);
	//   22   83:aload_0         
	//   23   84:aload_1         
	//   24   85:invokespecial   #744 <Method void a(MotionEvent)>
		f = (int)motionevent.getY(motionevent.findPointerIndex(q));
	//   25   88:aload_0         
	//   26   89:aload_1         
	//   27   90:aload_1         
	//   28   91:aload_0         
	//   29   92:getfield        #96  <Field int q>
	//   30   95:invokevirtual   #690 <Method int MotionEvent.findPointerIndex(int)>
	//   31   98:invokevirtual   #221 <Method float MotionEvent.getY(int)>
	//   32  101:f2i             
	//   33  102:putfield        #223 <Field int f>
		break MISSING_BLOCK_LABEL_885;
	//   34  105:goto            885
_L6:
		i1 = motionevent.getActionIndex();
	//   35  108:aload_1         
	//   36  109:invokevirtual   #213 <Method int MotionEvent.getActionIndex()>
	//   37  112:istore_2        
		f = (int)motionevent.getY(i1);
	//   38  113:aload_0         
	//   39  114:aload_1         
	//   40  115:iload_2         
	//   41  116:invokevirtual   #221 <Method float MotionEvent.getY(int)>
	//   42  119:f2i             
	//   43  120:putfield        #223 <Field int f>
		q = motionevent.getPointerId(i1);
	//   44  123:aload_0         
	//   45  124:aload_1         
	//   46  125:iload_2         
	//   47  126:invokevirtual   #217 <Method int MotionEvent.getPointerId(int)>
	//   48  129:putfield        #96  <Field int q>
		break MISSING_BLOCK_LABEL_885;
	//   49  132:goto            885
_L5:
		if(!j || getChildCount() <= 0 || !c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
			break; /* Loop/switch isn't completed */
	//   50  135:aload_0         
	//   51  136:getfield        #92  <Field boolean j>
	//   52  139:ifeq            178
	//   53  142:aload_0         
	//   54  143:invokevirtual   #307 <Method int getChildCount()>
	//   55  146:ifle            178
	//   56  149:aload_0         
	//   57  150:getfield        #176 <Field OverScroller c>
	//   58  153:aload_0         
	//   59  154:invokevirtual   #497 <Method int getScrollX()>
	//   60  157:aload_0         
	//   61  158:invokevirtual   #237 <Method int getScrollY()>
	//   62  161:iconst_0        
	//   63  162:iconst_0        
	//   64  163:iconst_0        
	//   65  164:aload_0         
	//   66  165:invokevirtual   #373 <Method int getScrollRange()>
	//   67  168:invokevirtual   #421 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//   68  171:ifeq            178
_L15:
		android.support.v4.view.s.c(((View) (this)));
	//   69  174:aload_0         
	//   70  175:invokestatic    #503 <Method void s.c(View)>
_L14:
		q = -1;
	//   71  178:aload_0         
	//   72  179:iconst_m1       
	//   73  180:putfield        #96  <Field int q>
		f();
	//   74  183:aload_0         
	//   75  184:invokespecial   #846 <Method void f()>
		break MISSING_BLOCK_LABEL_885;
	//   76  187:goto            885
_L4:
		int k1;
		int l1;
		int i2;
		l1 = motionevent.findPointerIndex(q);
	//   77  190:aload_1         
	//   78  191:aload_0         
	//   79  192:getfield        #96  <Field int q>
	//   80  195:invokevirtual   #690 <Method int MotionEvent.findPointerIndex(int)>
	//   81  198:istore          4
		if(l1 == -1)
	//*  82  200:iload           4
	//*  83  202:iconst_m1       
	//*  84  203:icmpne          253
		{
			motionevent = ((MotionEvent) (new StringBuilder()));
	//   85  206:new             #692 <Class StringBuilder>
	//   86  209:dup             
	//   87  210:invokespecial   #693 <Method void StringBuilder()>
	//   88  213:astore_1        
			((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   89  214:aload_1         
	//   90  215:ldc2            #695 <String "Invalid pointerId=">
	//   91  218:invokevirtual   #699 <Method StringBuilder StringBuilder.append(String)>
	//   92  221:pop             
			((StringBuilder) (motionevent)).append(q);
	//   93  222:aload_1         
	//   94  223:aload_0         
	//   95  224:getfield        #96  <Field int q>
	//   96  227:invokevirtual   #702 <Method StringBuilder StringBuilder.append(int)>
	//   97  230:pop             
			((StringBuilder) (motionevent)).append(" in onTouchEvent");
	//   98  231:aload_1         
	//   99  232:ldc2            #848 <String " in onTouchEvent">
	//  100  235:invokevirtual   #699 <Method StringBuilder StringBuilder.append(String)>
	//  101  238:pop             
			Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//  102  239:ldc2            #706 <String "NestedScrollView">
	//  103  242:aload_1         
	//  104  243:invokevirtual   #710 <Method String StringBuilder.toString()>
	//  105  246:invokestatic    #715 <Method int Log.e(String, String)>
	//  106  249:pop             
			break MISSING_BLOCK_LABEL_885;
	//  107  250:goto            885
		}
		i2 = (int)motionevent.getY(l1);
	//  108  253:aload_1         
	//  109  254:iload           4
	//  110  256:invokevirtual   #221 <Method float MotionEvent.getY(int)>
	//  111  259:f2i             
	//  112  260:istore          5
		i1 = f - i2;
	//  113  262:aload_0         
	//  114  263:getfield        #223 <Field int f>
	//  115  266:iload           5
	//  116  268:isub            
	//  117  269:istore_2        
		k1 = i1;
	//  118  270:iload_2         
	//  119  271:istore_3        
		if(a(0, i1, s, r, 0))
	//* 120  272:aload_0         
	//* 121  273:iconst_0        
	//* 122  274:iload_2         
	//* 123  275:aload_0         
	//* 124  276:getfield        #100 <Field int[] s>
	//* 125  279:aload_0         
	//* 126  280:getfield        #98  <Field int[] r>
	//* 127  283:iconst_0        
	//* 128  284:invokevirtual   #531 <Method boolean a(int, int, int[], int[], int)>
	//* 129  287:ifeq            327
		{
			k1 = i1 - s[1];
	//  130  290:iload_2         
	//  131  291:aload_0         
	//  132  292:getfield        #100 <Field int[] s>
	//  133  295:iconst_1        
	//  134  296:iaload          
	//  135  297:isub            
	//  136  298:istore_3        
			motionevent1.offsetLocation(0.0F, r[1]);
	//  137  299:aload           9
	//  138  301:fconst_0        
	//  139  302:aload_0         
	//  140  303:getfield        #98  <Field int[] r>
	//  141  306:iconst_1        
	//  142  307:iaload          
	//  143  308:i2f             
	//  144  309:invokevirtual   #844 <Method void MotionEvent.offsetLocation(float, float)>
			t = t + r[1];
	//  145  312:aload_0         
	//  146  313:aload_0         
	//  147  314:getfield        #727 <Field int t>
	//  148  317:aload_0         
	//  149  318:getfield        #98  <Field int[] r>
	//  150  321:iconst_1        
	//  151  322:iaload          
	//  152  323:iadd            
	//  153  324:putfield        #727 <Field int t>
		}
		i1 = k1;
	//  154  327:iload_3         
	//  155  328:istore_2        
		if(!j)
	//* 156  329:aload_0         
	//* 157  330:getfield        #92  <Field boolean j>
	//* 158  333:ifne            394
		{
			i1 = k1;
	//  159  336:iload_3         
	//  160  337:istore_2        
			if(Math.abs(k1) > n)
	//* 161  338:iload_3         
	//* 162  339:invokestatic    #718 <Method int Math.abs(int)>
	//* 163  342:aload_0         
	//* 164  343:getfield        #197 <Field int n>
	//* 165  346:icmple          394
			{
				ViewParent viewparent = getParent();
	//  166  349:aload_0         
	//  167  350:invokevirtual   #728 <Method ViewParent getParent()>
	//  168  353:astore          10
				if(viewparent != null)
	//* 169  355:aload           10
	//* 170  357:ifnull          368
					viewparent.requestDisallowInterceptTouchEvent(true);
	//  171  360:aload           10
	//  172  362:iconst_1        
	//  173  363:invokeinterface #733 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				j = true;
	//  174  368:aload_0         
	//  175  369:iconst_1        
	//  176  370:putfield        #92  <Field boolean j>
				if(k1 > 0)
	//* 177  373:iload_3         
	//* 178  374:ifle            387
					i1 = k1 - n;
	//  179  377:iload_3         
	//  180  378:aload_0         
	//  181  379:getfield        #197 <Field int n>
	//  182  382:isub            
	//  183  383:istore_2        
				else
	//* 184  384:goto            394
					i1 = k1 + n;
	//  185  387:iload_3         
	//  186  388:aload_0         
	//  187  389:getfield        #197 <Field int n>
	//  188  392:iadd            
	//  189  393:istore_2        
			}
		}
		if(!j)
			break MISSING_BLOCK_LABEL_885;
	//  190  394:aload_0         
	//  191  395:getfield        #92  <Field boolean j>
	//  192  398:ifeq            885
		f = i2 - r[1];
	//  193  401:aload_0         
	//  194  402:iload           5
	//  195  404:aload_0         
	//  196  405:getfield        #98  <Field int[] r>
	//  197  408:iconst_1        
	//  198  409:iaload          
	//  199  410:isub            
	//  200  411:putfield        #223 <Field int f>
		int j2 = getScrollY();
	//  201  414:aload_0         
	//  202  415:invokevirtual   #237 <Method int getScrollY()>
	//  203  418:istore          6
		i2 = getScrollRange();
	//  204  420:aload_0         
	//  205  421:invokevirtual   #373 <Method int getScrollRange()>
	//  206  424:istore          5
		k1 = getOverScrollMode();
	//  207  426:aload_0         
	//  208  427:invokevirtual   #330 <Method int getOverScrollMode()>
	//  209  430:istore_3        
		if(k1 != 0 && (k1 != 1 || i2 <= 0))
	//* 210  431:iload_3         
	//* 211  432:ifeq            453
	//* 212  435:iload_3         
	//* 213  436:iconst_1        
	//* 214  437:icmpne          448
	//* 215  440:iload           5
	//* 216  442:ifle            448
	//* 217  445:goto            453
			k1 = 0;
	//  218  448:iconst_0        
	//  219  449:istore_3        
		else
	//* 220  450:goto            455
			k1 = 1;
	//  221  453:iconst_1        
	//  222  454:istore_3        
		if(a(0, i1, 0, getScrollY(), 0, i2, 0, 0, true) && !b(0))
	//* 223  455:aload_0         
	//* 224  456:iconst_0        
	//* 225  457:iload_2         
	//* 226  458:iconst_0        
	//* 227  459:aload_0         
	//* 228  460:invokevirtual   #237 <Method int getScrollY()>
	//* 229  463:iconst_0        
	//* 230  464:iload           5
	//* 231  466:iconst_0        
	//* 232  467:iconst_0        
	//* 233  468:iconst_1        
	//* 234  469:invokevirtual   #533 <Method boolean a(int, int, int, int, int, int, int, int, boolean)>
	//* 235  472:ifeq            490
	//* 236  475:aload_0         
	//* 237  476:iconst_0        
	//* 238  477:invokevirtual   #417 <Method boolean b(int)>
	//* 239  480:ifne            490
			k.clear();
	//  240  483:aload_0         
	//  241  484:getfield        #225 <Field VelocityTracker k>
	//  242  487:invokevirtual   #230 <Method void VelocityTracker.clear()>
		int k2 = getScrollY() - j2;
	//  243  490:aload_0         
	//  244  491:invokevirtual   #237 <Method int getScrollY()>
	//  245  494:iload           6
	//  246  496:isub            
	//  247  497:istore          7
		if(a(0, k2, 0, i1 - k2, r, 0))
	//* 248  499:aload_0         
	//* 249  500:iconst_0        
	//* 250  501:iload           7
	//* 251  503:iconst_0        
	//* 252  504:iload_2         
	//* 253  505:iload           7
	//* 254  507:isub            
	//* 255  508:aload_0         
	//* 256  509:getfield        #98  <Field int[] r>
	//* 257  512:iconst_0        
	//* 258  513:invokevirtual   #534 <Method boolean a(int, int, int, int, int[], int)>
	//* 259  516:ifeq            565
		{
			f = f - r[1];
	//  260  519:aload_0         
	//  261  520:aload_0         
	//  262  521:getfield        #223 <Field int f>
	//  263  524:aload_0         
	//  264  525:getfield        #98  <Field int[] r>
	//  265  528:iconst_1        
	//  266  529:iaload          
	//  267  530:isub            
	//  268  531:putfield        #223 <Field int f>
			motionevent1.offsetLocation(0.0F, r[1]);
	//  269  534:aload           9
	//  270  536:fconst_0        
	//  271  537:aload_0         
	//  272  538:getfield        #98  <Field int[] r>
	//  273  541:iconst_1        
	//  274  542:iaload          
	//  275  543:i2f             
	//  276  544:invokevirtual   #844 <Method void MotionEvent.offsetLocation(float, float)>
			t = t + r[1];
	//  277  547:aload_0         
	//  278  548:aload_0         
	//  279  549:getfield        #727 <Field int t>
	//  280  552:aload_0         
	//  281  553:getfield        #98  <Field int[] r>
	//  282  556:iconst_1        
	//  283  557:iaload          
	//  284  558:iadd            
	//  285  559:putfield        #727 <Field int t>
			break MISSING_BLOCK_LABEL_885;
	//  286  562:goto            885
		}
		if(!k1)
			break MISSING_BLOCK_LABEL_885;
	//  287  565:iload_3         
	//  288  566:ifeq            885
		g();
	//  289  569:aload_0         
	//  290  570:invokespecial   #536 <Method void g()>
		k1 = j2 + i1;
	//  291  573:iload           6
	//  292  575:iload_2         
	//  293  576:iadd            
	//  294  577:istore_3        
		if(k1 >= 0) goto _L9; else goto _L8
	//  295  578:iload_3         
	//  296  579:ifge            631
_L8:
		android.support.v4.widget.g.a(d, (float)i1 / (float)getHeight(), motionevent.getX(l1) / (float)getWidth());
	//  297  582:aload_0         
	//  298  583:getfield        #320 <Field EdgeEffect d>
	//  299  586:iload_2         
	//  300  587:i2f             
	//  301  588:aload_0         
	//  302  589:invokevirtual   #234 <Method int getHeight()>
	//  303  592:i2f             
	//  304  593:fdiv            
	//  305  594:aload_1         
	//  306  595:iload           4
	//  307  597:invokevirtual   #850 <Method float MotionEvent.getX(int)>
	//  308  600:aload_0         
	//  309  601:invokevirtual   #576 <Method int getWidth()>
	//  310  604:i2f             
	//  311  605:fdiv            
	//  312  606:invokestatic    #855 <Method void g.a(EdgeEffect, float, float)>
		if(e.isFinished()) goto _L11; else goto _L10
	//  313  609:aload_0         
	//  314  610:getfield        #327 <Field EdgeEffect e>
	//  315  613:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//  316  616:ifne            684
_L10:
		motionevent = ((MotionEvent) (e));
	//  317  619:aload_0         
	//  318  620:getfield        #327 <Field EdgeEffect e>
	//  319  623:astore_1        
_L12:
		((EdgeEffect) (motionevent)).onRelease();
	//  320  624:aload_1         
	//  321  625:invokevirtual   #325 <Method void EdgeEffect.onRelease()>
		break; /* Loop/switch isn't completed */
	//  322  628:goto            684
_L9:
		if(k1 <= i2)
			break; /* Loop/switch isn't completed */
	//  323  631:iload_3         
	//  324  632:iload           5
	//  325  634:icmple          684
		android.support.v4.widget.g.a(e, (float)i1 / (float)getHeight(), 1.0F - motionevent.getX(l1) / (float)getWidth());
	//  326  637:aload_0         
	//  327  638:getfield        #327 <Field EdgeEffect e>
	//  328  641:iload_2         
	//  329  642:i2f             
	//  330  643:aload_0         
	//  331  644:invokevirtual   #234 <Method int getHeight()>
	//  332  647:i2f             
	//  333  648:fdiv            
	//  334  649:fconst_1        
	//  335  650:aload_1         
	//  336  651:iload           4
	//  337  653:invokevirtual   #850 <Method float MotionEvent.getX(int)>
	//  338  656:aload_0         
	//  339  657:invokevirtual   #576 <Method int getWidth()>
	//  340  660:i2f             
	//  341  661:fdiv            
	//  342  662:fsub            
	//  343  663:invokestatic    #855 <Method void g.a(EdgeEffect, float, float)>
		if(d.isFinished())
			break; /* Loop/switch isn't completed */
	//  344  666:aload_0         
	//  345  667:getfield        #320 <Field EdgeEffect d>
	//  346  670:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//  347  673:ifne            684
		motionevent = ((MotionEvent) (d));
	//  348  676:aload_0         
	//  349  677:getfield        #320 <Field EdgeEffect d>
	//  350  680:astore_1        
		if(true) goto _L12; else goto _L11
	//  351  681:goto            624
_L11:
		if(d != null && (!d.isFinished() || !e.isFinished()))
	//* 352  684:aload_0         
	//* 353  685:getfield        #320 <Field EdgeEffect d>
	//* 354  688:ifnull          885
	//* 355  691:aload_0         
	//* 356  692:getfield        #320 <Field EdgeEffect d>
	//* 357  695:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//* 358  698:ifeq            711
	//* 359  701:aload_0         
	//* 360  702:getfield        #327 <Field EdgeEffect e>
	//* 361  705:invokevirtual   #568 <Method boolean EdgeEffect.isFinished()>
	//* 362  708:ifne            885
			android.support.v4.view.s.c(((View) (this)));
	//  363  711:aload_0         
	//  364  712:invokestatic    #503 <Method void s.c(View)>
		break MISSING_BLOCK_LABEL_885;
	//  365  715:goto            885
_L3:
		motionevent = ((MotionEvent) (k));
	//  366  718:aload_0         
	//  367  719:getfield        #225 <Field VelocityTracker k>
	//  368  722:astore_1        
		((VelocityTracker) (motionevent)).computeCurrentVelocity(1000, p);
	//  369  723:aload_1         
	//  370  724:sipush          1000
	//  371  727:aload_0         
	//  372  728:getfield        #207 <Field int p>
	//  373  731:i2f             
	//  374  732:invokevirtual   #859 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		int j1 = (int)((VelocityTracker) (motionevent)).getYVelocity(q);
	//  375  735:aload_1         
	//  376  736:aload_0         
	//  377  737:getfield        #96  <Field int q>
	//  378  740:invokevirtual   #862 <Method float VelocityTracker.getYVelocity(int)>
	//  379  743:f2i             
	//  380  744:istore_2        
		if(Math.abs(j1) <= o)
			continue; /* Loop/switch isn't completed */
	//  381  745:iload_2         
	//  382  746:invokestatic    #718 <Method int Math.abs(int)>
	//  383  749:aload_0         
	//  384  750:getfield        #202 <Field int o>
	//  385  753:icmple          765
		h(-j1);
	//  386  756:aload_0         
	//  387  757:iload_2         
	//  388  758:ineg            
	//  389  759:invokespecial   #775 <Method void h(int)>
		if(true) goto _L14; else goto _L13
	//  390  762:goto            178
_L13:
		if(!c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) goto _L14; else goto _L15
	//  391  765:aload_0         
	//  392  766:getfield        #176 <Field OverScroller c>
	//  393  769:aload_0         
	//  394  770:invokevirtual   #497 <Method int getScrollX()>
	//  395  773:aload_0         
	//  396  774:invokevirtual   #237 <Method int getScrollY()>
	//  397  777:iconst_0        
	//  398  778:iconst_0        
	//  399  779:iconst_0        
	//  400  780:aload_0         
	//  401  781:invokevirtual   #373 <Method int getScrollRange()>
	//  402  784:invokevirtual   #421 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//  403  787:ifeq            178
	//* 404  790:goto            174
_L2:
		if(getChildCount() == 0)
	//* 405  793:aload_0         
	//* 406  794:invokevirtual   #307 <Method int getChildCount()>
	//* 407  797:ifne            802
			return false;
	//  408  800:iconst_0        
	//  409  801:ireturn         
		boolean flag = c.isFinished() ^ true;
	//  410  802:aload_0         
	//  411  803:getfield        #176 <Field OverScroller c>
	//  412  806:invokevirtual   #506 <Method boolean OverScroller.isFinished()>
	//  413  809:iconst_1        
	//  414  810:ixor            
	//  415  811:istore          8
		j = flag;
	//  416  813:aload_0         
	//  417  814:iload           8
	//  418  816:putfield        #92  <Field boolean j>
		if(flag)
	//* 419  819:iload           8
	//* 420  821:ifeq            843
		{
			ViewParent viewparent1 = getParent();
	//  421  824:aload_0         
	//  422  825:invokevirtual   #728 <Method ViewParent getParent()>
	//  423  828:astore          10
			if(viewparent1 != null)
	//* 424  830:aload           10
	//* 425  832:ifnull          843
				viewparent1.requestDisallowInterceptTouchEvent(true);
	//  426  835:aload           10
	//  427  837:iconst_1        
	//  428  838:invokeinterface #733 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		}
		if(!c.isFinished())
	//* 429  843:aload_0         
	//* 430  844:getfield        #176 <Field OverScroller c>
	//* 431  847:invokevirtual   #506 <Method boolean OverScroller.isFinished()>
	//* 432  850:ifne            860
			c.abortAnimation();
	//  433  853:aload_0         
	//  434  854:getfield        #176 <Field OverScroller c>
	//  435  857:invokevirtual   #509 <Method void OverScroller.abortAnimation()>
		f = (int)motionevent.getY();
	//  436  860:aload_0         
	//  437  861:aload_1         
	//  438  862:invokevirtual   #735 <Method float MotionEvent.getY()>
	//  439  865:f2i             
	//  440  866:putfield        #223 <Field int f>
		q = motionevent.getPointerId(0);
	//  441  869:aload_0         
	//  442  870:aload_1         
	//  443  871:iconst_0        
	//  444  872:invokevirtual   #217 <Method int MotionEvent.getPointerId(int)>
	//  445  875:putfield        #96  <Field int q>
		a(2, 0);
	//  446  878:aload_0         
	//  447  879:iconst_2        
	//  448  880:iconst_0        
	//  449  881:invokevirtual   #613 <Method boolean a(int, int)>
	//  450  884:pop             
		if(k != null)
	//* 451  885:aload_0         
	//* 452  886:getfield        #225 <Field VelocityTracker k>
	//* 453  889:ifnull          901
			k.addMovement(motionevent1);
	//  454  892:aload_0         
	//  455  893:getfield        #225 <Field VelocityTracker k>
	//  456  896:aload           9
	//  457  898:invokevirtual   #725 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent1.recycle();
	//  458  901:aload           9
	//  459  903:invokevirtual   #863 <Method void MotionEvent.recycle()>
		return true;
	//  460  906:iconst_1        
	//  461  907:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean g>
	//*   2    4:ifne            15
			b(view1);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokespecial   #750 <Method void b(View)>
		else
	//*   6   12:goto            20
			i = view1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #90  <Field View i>
		super.requestChildFocus(view, view1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #867 <Method void FrameLayout.requestChildFocus(View, View)>
	//   14   26:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #310 <Method int View.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #870 <Method int View.getScrollX()>
	//    5    9:isub            
	//    6   10:aload_1         
	//    7   11:invokevirtual   #163 <Method int View.getTop()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #871 <Method int View.getScrollY()>
	//   10   18:isub            
	//   11   19:invokevirtual   #874 <Method void Rect.offset(int, int)>
		return a(rect, flag);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #876 <Method boolean a(Rect, boolean)>
	//   16   28:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #316 <Method void e()>
		super.requestDisallowInterceptTouchEvent(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #877 <Method void FrameLayout.requestDisallowInterceptTouchEvent(boolean)>
	//    7   13:return          
	}

	public void requestLayout()
	{
		g = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #86  <Field boolean g>
		super.requestLayout();
	//    3    5:aload_0         
	//    4    6:invokespecial   #878 <Method void FrameLayout.requestLayout()>
	//    5    9:return          
	}

	public void scrollTo(int i1, int j1)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method int getChildCount()>
	//*   2    4:ifle            81
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #292 <Method View getChildAt(int)>
	//    6   12:astore_3        
			i1 = b(i1, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #576 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #582 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:invokevirtual   #579 <Method int getPaddingLeft()>
	//   15   27:isub            
	//   16   28:aload_3         
	//   17   29:invokevirtual   #879 <Method int View.getWidth()>
	//   18   32:invokestatic    #881 <Method int b(int, int, int)>
	//   19   35:istore_1        
			j1 = b(j1, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #234 <Method int getHeight()>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #299 <Method int getPaddingBottom()>
	//   25   45:isub            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #296 <Method int getPaddingTop()>
	//   28   50:isub            
	//   29   51:aload_3         
	//   30   52:invokevirtual   #293 <Method int View.getHeight()>
	//   31   55:invokestatic    #881 <Method int b(int, int, int)>
	//   32   58:istore_2        
			if(i1 != getScrollX() || j1 != getScrollY())
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #497 <Method int getScrollX()>
	//*  36   64:icmpne          75
	//*  37   67:iload_2         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #237 <Method int getScrollY()>
	//*  40   72:icmpeq          81
				super.scrollTo(i1, j1);
	//   41   75:aload_0         
	//   42   76:iload_1         
	//   43   77:iload_2         
	//   44   78:invokespecial   #686 <Method void FrameLayout.scrollTo(int, int)>
		}
	//   45   81:return          
	}

	public void setFillViewport(boolean flag)
	{
		if(flag != l)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #763 <Field boolean l>
	//*   3    5:icmpeq          17
		{
			l = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #763 <Field boolean l>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #810 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		z.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #883 <Method void k.a(boolean)>
	//    4    8:return          
	}

	public void setOnScrollChangeListener(b b1)
	{
		B = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #820 <Field NestedScrollView$b B>
	//    3    5:return          
	}

	public void setSmoothScrollingEnabled(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field boolean m>
	//    3    5:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean startNestedScroll(int i1)
	{
		return z.b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #888 <Method boolean k.b(int)>
	//    4    8:ireturn         
	}

	public void stopNestedScroll()
	{
		z.c();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field k z>
	//    2    4:invokevirtual   #889 <Method void k.c()>
	//    3    7:return          
	}

	private static final a w = new a();
	private static final int x[] = {
		0x101017a
	};
	private float A;
	private b B;
	private long a;
	private final Rect b;
	private OverScroller c;
	private EdgeEffect d;
	private EdgeEffect e;
	private int f;
	private boolean g;
	private boolean h;
	private View i;
	private boolean j;
	private VelocityTracker k;
	private boolean l;
	private boolean m;
	private int n;
	private int o;
	private int p;
	private int q;
	private final int r[];
	private final int s[];
	private int t;
	private int u;
	private SavedState v;
	private final n y;
	private final k z;

	static 
	{
	//    0    0:new             #15  <Class NestedScrollView$a>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void NestedScrollView$a()>
	//    3    7:putstatic       #67  <Field NestedScrollView$a w>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #68  <Int 0x101017a>
	//    9   17:iastore         
	//   10   18:putstatic       #70  <Field int[] x>
	//*  11   21:return          
	}
}
