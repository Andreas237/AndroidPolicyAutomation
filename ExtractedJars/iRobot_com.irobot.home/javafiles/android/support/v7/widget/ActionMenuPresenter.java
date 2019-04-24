// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.s;
import android.support.v7.view.menu.u;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView, AppCompatImageView, ax, ac

class ActionMenuPresenter extends android.support.v7.view.menu.b
	implements android.support.v4.view.b.a
{
	private static class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			parcel.writeInt(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field int a>
		//    3    5:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class ActionMenuPresenter$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void ActionMenuPresenter$SavedState(Parcel)>
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
			//    2    2:invokevirtual   #27  <Method ActionMenuPresenter$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method ActionMenuPresenter$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		public int a;

		static 
		{
		//    0    0:new             #11  <Class ActionMenuPresenter$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void ActionMenuPresenter$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
		//    5    9:putfield        #34  <Field int a>
		//    6   12:return          
		}
	}

	private class a extends n
	{

		protected void e()
		{
			a.i = null;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ActionMenuPresenter a>
		//    2    4:aconst_null     
		//    3    5:putfield        #60  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
			a.l = 0;
		//    4    8:aload_0         
		//    5    9:getfield        #12  <Field ActionMenuPresenter a>
		//    6   12:iconst_0        
		//    7   13:putfield        #63  <Field int ActionMenuPresenter.l>
			super.e();
		//    8   16:aload_0         
		//    9   17:invokespecial   #65  <Method void n.e()>
		//   10   20:return          
		}

		final ActionMenuPresenter a;

		public a(Context context, u u1, View view)
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ActionMenuPresenter a>
			super(context, ((h) (u1)), view, false, android.support.v7.a.a.a.actionOverflowMenuStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:iconst_0        
		//    8   11:getstatic       #18  <Field int android.support.v7.a.a$a.actionOverflowMenuStyle>
		//    9   14:invokespecial   #21  <Method void n(Context, h, View, boolean, int)>
			if(!((j)u1.getItem()).j())
		//*  10   17:aload_3         
		//*  11   18:invokevirtual   #27  <Method MenuItem u.getItem()>
		//*  12   21:checkcast       #29  <Class j>
		//*  13   24:invokevirtual   #33  <Method boolean j.j()>
		//*  14   27:ifne            58
			{
				if(g == null)
		//*  15   30:aload_1         
		//*  16   31:getfield        #37  <Field ActionMenuPresenter$d ActionMenuPresenter.g>
		//*  17   34:ifnonnull       48
					context = ((Context) ((View)ActionMenuPresenter.c(ActionMenuPresenter.this)));
		//   18   37:aload_1         
		//   19   38:invokestatic    #41  <Method p ActionMenuPresenter.c(ActionMenuPresenter)>
		//   20   41:checkcast       #43  <Class View>
		//   21   44:astore_2        
				else
		//*  22   45:goto            53
					context = ((Context) (g));
		//   23   48:aload_1         
		//   24   49:getfield        #37  <Field ActionMenuPresenter$d ActionMenuPresenter.g>
		//   25   52:astore_2        
				a(((View) (context)));
		//   26   53:aload_0         
		//   27   54:aload_2         
		//   28   55:invokevirtual   #46  <Method void a(View)>
			}
			a(((android.support.v7.view.menu.o.a) (k)));
		//   29   58:aload_0         
		//   30   59:aload_1         
		//   31   60:getfield        #50  <Field ActionMenuPresenter$f ActionMenuPresenter.k>
		//   32   63:invokevirtual   #53  <Method void a(android.support.v7.view.menu.o$a)>
		//   33   66:return          
		}
	}

	private class b extends android.support.v7.view.menu.ActionMenuItemView.b
	{

		public s a()
		{
			if(a.i != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ActionMenuPresenter a>
		//*   2    4:getfield        #22  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
		//*   3    7:ifnull          21
				return ((s) (a.i.b()));
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ActionMenuPresenter a>
		//    6   14:getfield        #22  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
		//    7   17:invokevirtual   #27  <Method android.support.v7.view.menu.m android.support.v7.widget.ActionMenuPresenter$a.b()>
		//    8   20:areturn         
			else
				return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
		}

		final ActionMenuPresenter a;

		b()
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ActionMenuPresenter a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v7.view.menu.ActionMenuItemView$b()>
		//    5    9:return          
		}
	}

	private class c
		implements Runnable
	{

		public void run()
		{
			if(ActionMenuPresenter.d(a) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field ActionMenuPresenter a>
		//*   2    4:invokestatic    #28  <Method h ActionMenuPresenter.d(ActionMenuPresenter)>
		//*   3    7:ifnull          20
				ActionMenuPresenter.e(a).f();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field ActionMenuPresenter a>
		//    6   14:invokestatic    #31  <Method h ActionMenuPresenter.e(ActionMenuPresenter)>
		//    7   17:invokevirtual   #36  <Method void h.f()>
			View view = (View)ActionMenuPresenter.f(a);
		//    8   20:aload_0         
		//    9   21:getfield        #17  <Field ActionMenuPresenter a>
		//   10   24:invokestatic    #39  <Method p ActionMenuPresenter.f(ActionMenuPresenter)>
		//   11   27:checkcast       #41  <Class View>
		//   12   30:astore_1        
			if(view != null && view.getWindowToken() != null && b.c())
		//*  13   31:aload_1         
		//*  14   32:ifnull          63
		//*  15   35:aload_1         
		//*  16   36:invokevirtual   #45  <Method android.os.IBinder View.getWindowToken()>
		//*  17   39:ifnull          63
		//*  18   42:aload_0         
		//*  19   43:getfield        #22  <Field ActionMenuPresenter$e b>
		//*  20   46:invokevirtual   #50  <Method boolean ActionMenuPresenter$e.c()>
		//*  21   49:ifeq            63
				a.h = b;
		//   22   52:aload_0         
		//   23   53:getfield        #17  <Field ActionMenuPresenter a>
		//   24   56:aload_0         
		//   25   57:getfield        #22  <Field ActionMenuPresenter$e b>
		//   26   60:putfield        #53  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
			a.j = null;
		//   27   63:aload_0         
		//   28   64:getfield        #17  <Field ActionMenuPresenter a>
		//   29   67:aconst_null     
		//   30   68:putfield        #57  <Field ActionMenuPresenter$c android.support.v7.widget.ActionMenuPresenter.j>
		//   31   71:return          
		}

		final ActionMenuPresenter a;
		private e b;

		public c(e e1)
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ActionMenuPresenter a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			b = e1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ActionMenuPresenter$e b>
		//    8   14:return          
		}
	}

	private class d extends AppCompatImageView
		implements ActionMenuView.a
	{

		public boolean c()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean d()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean performClick()
		{
			if(super.performClick())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #66  <Method boolean AppCompatImageView.performClick()>
		//*   2    4:ifeq            9
			{
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			} else
			{
				playSoundEffect(0);
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:invokevirtual   #69  <Method void playSoundEffect(int)>
				a.f();
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field ActionMenuPresenter a>
		//   10   18:invokevirtual   #72  <Method boolean ActionMenuPresenter.f()>
		//   11   21:pop             
				return true;
		//   12   22:iconst_1        
		//   13   23:ireturn         
			}
		}

		protected boolean setFrame(int i1, int j1, int k1, int l1)
		{
			boolean flag = super.setFrame(i1, j1, k1, l1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:invokespecial   #76  <Method boolean AppCompatImageView.setFrame(int, int, int, int)>
		//    6    9:istore          8
			Drawable drawable = getDrawable();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #80  <Method Drawable getDrawable()>
		//    9   15:astore          9
			Drawable drawable1 = getBackground();
		//   10   17:aload_0         
		//   11   18:invokevirtual   #83  <Method Drawable getBackground()>
		//   12   21:astore          10
			if(drawable != null && drawable1 != null)
		//*  13   23:aload           9
		//*  14   25:ifnull          116
		//*  15   28:aload           10
		//*  16   30:ifnull          116
			{
				int i2 = getWidth();
		//   17   33:aload_0         
		//   18   34:invokevirtual   #87  <Method int getWidth()>
		//   19   37:istore          5
				j1 = getHeight();
		//   20   39:aload_0         
		//   21   40:invokevirtual   #90  <Method int getHeight()>
		//   22   43:istore_2        
				i1 = Math.max(i2, j1) / 2;
		//   23   44:iload           5
		//   24   46:iload_2         
		//   25   47:invokestatic    #96  <Method int Math.max(int, int)>
		//   26   50:iconst_2        
		//   27   51:idiv            
		//   28   52:istore_1        
				int j2 = getPaddingLeft();
		//   29   53:aload_0         
		//   30   54:invokevirtual   #99  <Method int getPaddingLeft()>
		//   31   57:istore          6
				int k2 = getPaddingRight();
		//   32   59:aload_0         
		//   33   60:invokevirtual   #102 <Method int getPaddingRight()>
		//   34   63:istore          7
				k1 = getPaddingTop();
		//   35   65:aload_0         
		//   36   66:invokevirtual   #105 <Method int getPaddingTop()>
		//   37   69:istore_3        
				l1 = getPaddingBottom();
		//   38   70:aload_0         
		//   39   71:invokevirtual   #108 <Method int getPaddingBottom()>
		//   40   74:istore          4
				i2 = (i2 + (j2 - k2)) / 2;
		//   41   76:iload           5
		//   42   78:iload           6
		//   43   80:iload           7
		//   44   82:isub            
		//   45   83:iadd            
		//   46   84:iconst_2        
		//   47   85:idiv            
		//   48   86:istore          5
				j1 = (j1 + (k1 - l1)) / 2;
		//   49   88:iload_2         
		//   50   89:iload_3         
		//   51   90:iload           4
		//   52   92:isub            
		//   53   93:iadd            
		//   54   94:iconst_2        
		//   55   95:idiv            
		//   56   96:istore_2        
				android.support.v4.a.a.a.a(drawable1, i2 - i1, j1 - i1, i2 + i1, j1 + i1);
		//   57   97:aload           10
		//   58   99:iload           5
		//   59  101:iload_1         
		//   60  102:isub            
		//   61  103:iload_2         
		//   62  104:iload_1         
		//   63  105:isub            
		//   64  106:iload           5
		//   65  108:iload_1         
		//   66  109:iadd            
		//   67  110:iload_2         
		//   68  111:iload_1         
		//   69  112:iadd            
		//   70  113:invokestatic    #113 <Method void android.support.v4.a.a.a.a(Drawable, int, int, int, int)>
			}
			return flag;
		//   71  116:iload           8
		//   72  118:ireturn         
		}

		final ActionMenuPresenter a;
		private final float b[] = new float[2];

		public d(Context context)
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ActionMenuPresenter a>
			super(context, ((android.util.AttributeSet) (null)), android.support.v7.a.a.a.actionOverflowButtonStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aconst_null     
		//    6    8:getstatic       #25  <Field int android.support.v7.a.a$a.actionOverflowButtonStyle>
		//    7   11:invokespecial   #28  <Method void AppCompatImageView(Context, android.util.AttributeSet, int)>
		//    8   14:aload_0         
		//    9   15:iconst_2        
		//   10   16:newarray        float[]
		//   11   18:putfield        #30  <Field float[] b>
			setClickable(true);
		//   12   21:aload_0         
		//   13   22:iconst_1        
		//   14   23:invokevirtual   #34  <Method void setClickable(boolean)>
			setFocusable(true);
		//   15   26:aload_0         
		//   16   27:iconst_1        
		//   17   28:invokevirtual   #37  <Method void setFocusable(boolean)>
			setVisibility(0);
		//   18   31:aload_0         
		//   19   32:iconst_0        
		//   20   33:invokevirtual   #41  <Method void setVisibility(int)>
			setEnabled(true);
		//   21   36:aload_0         
		//   22   37:iconst_1        
		//   23   38:invokevirtual   #44  <Method void setEnabled(boolean)>
			android.support.v7.widget.ax.a(((View) (this)), getContentDescription());
		//   24   41:aload_0         
		//   25   42:aload_0         
		//   26   43:invokevirtual   #48  <Method CharSequence getContentDescription()>
		//   27   46:invokestatic    #53  <Method void android.support.v7.widget.ax.a(View, CharSequence)>
			setOnTouchListener(((android.view.View.OnTouchListener) (new _cls1(this, ((View) (this)), ActionMenuPresenter.this))));
		//   28   49:aload_0         
		//   29   50:new             #11  <Class ActionMenuPresenter$d$1>
		//   30   53:dup             
		//   31   54:aload_0         
		//   32   55:aload_0         
		//   33   56:aload_1         
		//   34   57:invokespecial   #56  <Method void ActionMenuPresenter$d$1(ActionMenuPresenter$d, View, ActionMenuPresenter)>
		//   35   60:invokevirtual   #60  <Method void setOnTouchListener(android.view.View$OnTouchListener)>
		//   36   63:return          
		}
	}

	private class e extends n
	{

		protected void e()
		{
			if(android.support.v7.widget.ActionMenuPresenter.a(a) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ActionMenuPresenter a>
		//*   2    4:invokestatic    #38  <Method h android.support.v7.widget.ActionMenuPresenter.a(ActionMenuPresenter)>
		//*   3    7:ifnull          20
				android.support.v7.widget.ActionMenuPresenter.b(a).close();
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ActionMenuPresenter a>
		//    6   14:invokestatic    #41  <Method h android.support.v7.widget.ActionMenuPresenter.b(ActionMenuPresenter)>
		//    7   17:invokevirtual   #46  <Method void h.close()>
			a.h = null;
		//    8   20:aload_0         
		//    9   21:getfield        #13  <Field ActionMenuPresenter a>
		//   10   24:aconst_null     
		//   11   25:putfield        #50  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
			super.e();
		//   12   28:aload_0         
		//   13   29:invokespecial   #52  <Method void n.e()>
		//   14   32:return          
		}

		final ActionMenuPresenter a;

		public e(Context context, h h1, View view, boolean flag)
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ActionMenuPresenter a>
			super(context, h1, view, flag, android.support.v7.a.a.a.actionOverflowMenuStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:iload           5
		//    8   12:getstatic       #19  <Field int android.support.v7.a.a$a.actionOverflowMenuStyle>
		//    9   15:invokespecial   #22  <Method void n(Context, h, View, boolean, int)>
			a(0x800005);
		//   10   18:aload_0         
		//   11   19:ldc1            #23  <Int 0x800005>
		//   12   21:invokevirtual   #26  <Method void a(int)>
			a(((android.support.v7.view.menu.o.a) (k)));
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:getfield        #30  <Field ActionMenuPresenter$f ActionMenuPresenter.k>
		//   16   29:invokevirtual   #33  <Method void a(android.support.v7.view.menu.o$a)>
		//   17   32:return          
		}
	}

	private class f
		implements android.support.v7.view.menu.o.a
	{

		public void a(h h1, boolean flag)
		{
			if(h1 instanceof u)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #22  <Class u>
		//*   2    4:ifeq            15
				h1.p().b(false);
		//    3    7:aload_1         
		//    4    8:invokevirtual   #28  <Method h h.p()>
		//    5   11:iconst_0        
		//    6   12:invokevirtual   #32  <Method void h.b(boolean)>
			android.support.v7.view.menu.o.a a1 = a.d();
		//    7   15:aload_0         
		//    8   16:getfield        #15  <Field ActionMenuPresenter a>
		//    9   19:invokevirtual   #36  <Method android.support.v7.view.menu.o$a ActionMenuPresenter.d()>
		//   10   22:astore_3        
			if(a1 != null)
		//*  11   23:aload_3         
		//*  12   24:ifnull          35
				a1.a(h1, flag);
		//   13   27:aload_3         
		//   14   28:aload_1         
		//   15   29:iload_2         
		//   16   30:invokeinterface #38  <Method void android.support.v7.view.menu.o$a.a(h, boolean)>
		//   17   35:return          
		}

		public boolean a(h h1)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			if(h1 == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       8
				return false;
		//    4    6:iconst_0        
		//    5    7:ireturn         
			a.l = ((u)h1).getItem().getItemId();
		//    6    8:aload_0         
		//    7    9:getfield        #15  <Field ActionMenuPresenter a>
		//    8   12:aload_1         
		//    9   13:checkcast       #22  <Class u>
		//   10   16:invokevirtual   #43  <Method MenuItem u.getItem()>
		//   11   19:invokeinterface #49  <Method int MenuItem.getItemId()>
		//   12   24:putfield        #53  <Field int ActionMenuPresenter.l>
			android.support.v7.view.menu.o.a a1 = a.d();
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field ActionMenuPresenter a>
		//   15   31:invokevirtual   #36  <Method android.support.v7.view.menu.o$a ActionMenuPresenter.d()>
		//   16   34:astore_3        
			if(a1 != null)
		//*  17   35:aload_3         
		//*  18   36:ifnull          47
				flag = a1.a(h1);
		//   19   39:aload_3         
		//   20   40:aload_1         
		//   21   41:invokeinterface #55  <Method boolean android.support.v7.view.menu.o$a.a(h)>
		//   22   46:istore_2        
			return flag;
		//   23   47:iload_2         
		//   24   48:ireturn         
		}

		final ActionMenuPresenter a;

		f()
		{
			a = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ActionMenuPresenter a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public ActionMenuPresenter(Context context)
	{
		super(context, android.support.v7.a.a.g.abc_action_menu_layout, android.support.v7.a.a.g.abc_action_menu_item_layout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #70  <Field int android.support.v7.a.a$g.abc_action_menu_layout>
	//    3    5:getstatic       #73  <Field int android.support.v7.a.a$g.abc_action_menu_item_layout>
	//    4    8:invokespecial   #76  <Method void b(Context, int, int)>
	//    5   11:aload_0         
	//    6   12:new             #78  <Class SparseBooleanArray>
	//    7   15:dup             
	//    8   16:invokespecial   #81  <Method void SparseBooleanArray()>
	//    9   19:putfield        #83  <Field SparseBooleanArray y>
	//   10   22:aload_0         
	//   11   23:new             #30  <Class ActionMenuPresenter$f>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #86  <Method void ActionMenuPresenter$f(ActionMenuPresenter)>
	//   15   31:putfield        #88  <Field ActionMenuPresenter$f k>
	//   16   34:return          
	}

	static h a(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.c;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field h c>
	//    2    4:areturn         
	}

	private View a(MenuItem menuitem)
	{
		ViewGroup viewgroup = (ViewGroup)f;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field p f>
	//    2    4:checkcast       #99  <Class ViewGroup>
	//    3    7:astore          4
		if(viewgroup == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		int j1 = viewgroup.getChildCount();
	//    8   16:aload           4
	//    9   18:invokevirtual   #103 <Method int ViewGroup.getChildCount()>
	//   10   21:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          69
		{
			View view = viewgroup.getChildAt(i1);
	//   16   29:aload           4
	//   17   31:iload_2         
	//   18   32:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//   19   35:astore          5
			if((view instanceof android.support.v7.view.menu.p.a) && ((android.support.v7.view.menu.p.a)view).getItemData() == menuitem)
	//*  20   37:aload           5
	//*  21   39:instanceof      #109 <Class android.support.v7.view.menu.p$a>
	//*  22   42:ifeq            62
	//*  23   45:aload           5
	//*  24   47:checkcast       #109 <Class android.support.v7.view.menu.p$a>
	//*  25   50:invokeinterface #113 <Method j android.support.v7.view.menu.p$a.getItemData()>
	//*  26   55:aload_1         
	//*  27   56:if_acmpne       62
				return view;
	//   28   59:aload           5
	//   29   61:areturn         
		}

	//   30   62:iload_2         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore_2        
	//*  34   66:goto            24
		return null;
	//   35   69:aconst_null     
	//   36   70:areturn         
	}

	static h b(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.c;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field h c>
	//    2    4:areturn         
	}

	static p c(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.f;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field p f>
	//    2    4:areturn         
	}

	static h d(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.c;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field h c>
	//    2    4:areturn         
	}

	static h e(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.c;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field h c>
	//    2    4:areturn         
	}

	static p f(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.f;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field p f>
	//    2    4:areturn         
	}

	public p a(ViewGroup viewgroup)
	{
		p p1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field p f>
	//    2    4:astore_2        
		viewgroup = ((ViewGroup) (super.a(viewgroup)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #117 <Method p b.a(ViewGroup)>
	//    6   10:astore_1        
		if(p1 != viewgroup)
	//*   7   11:aload_2         
	//*   8   12:aload_1         
	//*   9   13:if_acmpeq       24
			((ActionMenuView)viewgroup).setPresenter(this);
	//   10   16:aload_1         
	//   11   17:checkcast       #119 <Class ActionMenuView>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #122 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		return ((p) (viewgroup));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public View a(j j1, View view, ViewGroup viewgroup)
	{
		View view1 = j1.getActionView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #129 <Method View j.getActionView()>
	//    2    4:astore          5
		if(view1 == null || j1.n())
	//*   3    6:aload           5
	//*   4    8:ifnull          18
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #132 <Method boolean j.n()>
	//*   7   15:ifeq            27
			view1 = super.a(j1, view, viewgroup);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #134 <Method View b.a(j, View, ViewGroup)>
	//   13   25:astore          5
		byte byte0;
		if(j1.isActionViewExpanded())
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #137 <Method boolean j.isActionViewExpanded()>
	//*  16   31:ifeq            41
			byte0 = 8;
	//   17   34:bipush          8
	//   18   36:istore          4
		else
	//*  19   38:goto            44
			byte0 = 0;
	//   20   41:iconst_0        
	//   21   42:istore          4
		view1.setVisibility(((int) (byte0)));
	//   22   44:aload           5
	//   23   46:iload           4
	//   24   48:invokevirtual   #143 <Method void View.setVisibility(int)>
		j1 = ((j) ((ActionMenuView)viewgroup));
	//   25   51:aload_3         
	//   26   52:checkcast       #119 <Class ActionMenuView>
	//   27   55:astore_1        
		view = ((View) (view1.getLayoutParams()));
	//   28   56:aload           5
	//   29   58:invokevirtual   #147 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   61:astore_2        
		if(!((ActionMenuView) (j1)).checkLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #151 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  34   67:ifne            80
			view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (j1)).a(((android.view.ViewGroup.LayoutParams) (view))))));
	//   35   70:aload           5
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #154 <Method ActionMenuView$LayoutParams android.support.v7.widget.ActionMenuView.a(android.view.ViewGroup$LayoutParams)>
	//   39   77:invokevirtual   #158 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return view1;
	//   40   80:aload           5
	//   41   82:areturn         
	}

	public void a(Context context, h h1)
	{
		super.a(context, h1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #161 <Method void b.a(Context, h)>
		h1 = ((h) (context.getResources()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #167 <Method Resources Context.getResources()>
	//    6   10:astore_2        
		context = ((Context) (android.support.v7.view.a.a(context)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #172 <Method a a.a(Context)>
	//    9   15:astore_1        
		if(!p)
	//*  10   16:aload_0         
	//*  11   17:getfield        #174 <Field boolean p>
	//*  12   20:ifne            31
			o = ((android.support.v7.view.a) (context)).b();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #176 <Method boolean a.b()>
	//   16   28:putfield        #178 <Field boolean o>
		if(!v)
	//*  17   31:aload_0         
	//*  18   32:getfield        #180 <Field boolean v>
	//*  19   35:ifne            46
			q = ((android.support.v7.view.a) (context)).c();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #182 <Method int a.c()>
	//   23   43:putfield        #184 <Field int q>
		if(!t)
	//*  24   46:aload_0         
	//*  25   47:getfield        #186 <Field boolean t>
	//*  26   50:ifne            61
			s = ((android.support.v7.view.a) (context)).a();
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #188 <Method int a.a()>
	//   30   58:putfield        #190 <Field int s>
		int i1 = q;
	//   31   61:aload_0         
	//   32   62:getfield        #184 <Field int q>
	//   33   65:istore_3        
		if(o)
	//*  34   66:aload_0         
	//*  35   67:getfield        #178 <Field boolean o>
	//*  36   70:ifeq            155
		{
			if(g == null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #192 <Field ActionMenuPresenter$d g>
	//*  39   77:ifnonnull       142
			{
				g = new d(a);
	//   40   80:aload_0         
	//   41   81:new             #22  <Class ActionMenuPresenter$d>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #195 <Field Context a>
	//   46   90:invokespecial   #198 <Method void ActionMenuPresenter$d(ActionMenuPresenter, Context)>
	//   47   93:putfield        #192 <Field ActionMenuPresenter$d g>
				if(n)
	//*  48   96:aload_0         
	//*  49   97:getfield        #200 <Field boolean n>
	//*  50  100:ifeq            124
				{
					g.setImageDrawable(m);
	//   51  103:aload_0         
	//   52  104:getfield        #192 <Field ActionMenuPresenter$d g>
	//   53  107:aload_0         
	//   54  108:getfield        #202 <Field Drawable m>
	//   55  111:invokevirtual   #206 <Method void ActionMenuPresenter$d.setImageDrawable(Drawable)>
					m = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #202 <Field Drawable m>
					n = false;
	//   59  119:aload_0         
	//   60  120:iconst_0        
	//   61  121:putfield        #200 <Field boolean n>
				}
				int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   62  124:iconst_0        
	//   63  125:iconst_0        
	//   64  126:invokestatic    #212 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   65  129:istore          4
				g.measure(j1, j1);
	//   66  131:aload_0         
	//   67  132:getfield        #192 <Field ActionMenuPresenter$d g>
	//   68  135:iload           4
	//   69  137:iload           4
	//   70  139:invokevirtual   #216 <Method void ActionMenuPresenter$d.measure(int, int)>
			}
			i1 -= g.getMeasuredWidth();
	//   71  142:iload_3         
	//   72  143:aload_0         
	//   73  144:getfield        #192 <Field ActionMenuPresenter$d g>
	//   74  147:invokevirtual   #219 <Method int ActionMenuPresenter$d.getMeasuredWidth()>
	//   75  150:isub            
	//   76  151:istore_3        
		} else
	//*  77  152:goto            160
		{
			g = null;
	//   78  155:aload_0         
	//   79  156:aconst_null     
	//   80  157:putfield        #192 <Field ActionMenuPresenter$d g>
		}
		r = i1;
	//   81  160:aload_0         
	//   82  161:iload_3         
	//   83  162:putfield        #221 <Field int r>
		x = (int)(((Resources) (h1)).getDisplayMetrics().density * 56F);
	//   84  165:aload_0         
	//   85  166:aload_2         
	//   86  167:invokevirtual   #227 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   87  170:getfield        #233 <Field float DisplayMetrics.density>
	//   88  173:ldc1            #234 <Float 56F>
	//   89  175:fmul            
	//   90  176:f2i             
	//   91  177:putfield        #236 <Field int x>
		z = null;
	//   92  180:aload_0         
	//   93  181:aconst_null     
	//   94  182:putfield        #238 <Field View z>
	//   95  185:return          
	}

	public void a(Configuration configuration)
	{
		if(!t)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field boolean t>
	//*   2    4:ifne            21
			s = android.support.v7.view.a.a(b).a();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #241 <Field Context b>
	//    6   12:invokestatic    #172 <Method a a.a(Context)>
	//    7   15:invokevirtual   #188 <Method int a.a()>
	//    8   18:putfield        #190 <Field int s>
		if(c != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #93  <Field h c>
	//*  11   25:ifnull          36
			c.a(true);
	//   12   28:aload_0         
	//   13   29:getfield        #93  <Field h c>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #246 <Method void h.a(boolean)>
	//   16   36:return          
	}

	public void a(Drawable drawable)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field ActionMenuPresenter$d g>
	//*   2    4:ifnull          16
		{
			g.setImageDrawable(drawable);
	//    3    7:aload_0         
	//    4    8:getfield        #192 <Field ActionMenuPresenter$d g>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #206 <Method void ActionMenuPresenter$d.setImageDrawable(Drawable)>
			return;
	//    7   15:return          
		} else
		{
			n = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #200 <Field boolean n>
			m = drawable;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #202 <Field Drawable m>
			return;
	//   14   26:return          
		}
	}

	public void a(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class ActionMenuPresenter$SavedState>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    4    8:aload_1         
	//    5    9:checkcast       #8   <Class ActionMenuPresenter$SavedState>
	//    6   12:astore_1        
		if(((SavedState) (parcelable)).a > 0)
	//*   7   13:aload_1         
	//*   8   14:getfield        #249 <Field int android.support.v7.widget.ActionMenuPresenter$SavedState.a>
	//*   9   17:ifle            50
		{
			parcelable = ((Parcelable) (c.findItem(((SavedState) (parcelable)).a)));
	//   10   20:aload_0         
	//   11   21:getfield        #93  <Field h c>
	//   12   24:aload_1         
	//   13   25:getfield        #249 <Field int android.support.v7.widget.ActionMenuPresenter$SavedState.a>
	//   14   28:invokevirtual   #253 <Method MenuItem h.findItem(int)>
	//   15   31:astore_1        
			if(parcelable != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          50
				a((u)((MenuItem) (parcelable)).getSubMenu());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokeinterface #259 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//   21   43:checkcast       #261 <Class u>
	//   22   46:invokevirtual   #264 <Method boolean a(u)>
	//   23   49:pop             
		}
	//   24   50:return          
	}

	public void a(h h1, boolean flag)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method boolean h()>
	//    2    4:pop             
		super.a(h1, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #269 <Method void b.a(h, boolean)>
	//    7   11:return          
	}

	public void a(j j1, android.support.v7.view.menu.p.a a1)
	{
		a1.a(j1, 0);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokeinterface #273 <Method void android.support.v7.view.menu.p$a.a(j, int)>
		j1 = ((j) ((ActionMenuView)f));
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field p f>
	//    6   12:checkcast       #119 <Class ActionMenuView>
	//    7   15:astore_1        
		a1 = ((android.support.v7.view.menu.p.a) ((ActionMenuItemView)a1));
	//    8   16:aload_2         
	//    9   17:checkcast       #275 <Class ActionMenuItemView>
	//   10   20:astore_2        
		((ActionMenuItemView) (a1)).setItemInvoker(((android.support.v7.view.menu.h.b) (j1)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #279 <Method void ActionMenuItemView.setItemInvoker(android.support.v7.view.menu.h$b)>
		if(A == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #281 <Field ActionMenuPresenter$b A>
	//*  16   30:ifnonnull       45
			A = new b();
	//   17   33:aload_0         
	//   18   34:new             #16  <Class ActionMenuPresenter$b>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #282 <Method void ActionMenuPresenter$b(ActionMenuPresenter)>
	//   22   42:putfield        #281 <Field ActionMenuPresenter$b A>
		((ActionMenuItemView) (a1)).setPopupCallback(((android.support.v7.view.menu.ActionMenuItemView.b) (A)));
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #281 <Field ActionMenuPresenter$b A>
	//   26   50:invokevirtual   #286 <Method void ActionMenuItemView.setPopupCallback(android.support.v7.view.menu.ActionMenuItemView$b)>
	//   27   53:return          
	}

	public void a(ActionMenuView actionmenuview)
	{
		f = ((p) (actionmenuview));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field p f>
		actionmenuview.a(c);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #93  <Field h c>
	//    6   10:invokevirtual   #290 <Method void android.support.v7.widget.ActionMenuView.a(h)>
	//    7   13:return          
	}

	public void a(boolean flag)
	{
		super.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #291 <Method void b.a(boolean)>
		((View)f).requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field p f>
	//    5    9:checkcast       #139 <Class View>
	//    6   12:invokevirtual   #294 <Method void View.requestLayout()>
		Object obj = ((Object) (c));
	//    7   15:aload_0         
	//    8   16:getfield        #93  <Field h c>
	//    9   19:astore          5
		boolean flag2 = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
		if(obj != null)
	//*  12   23:aload           5
	//*  13   25:ifnull          84
		{
			obj = ((Object) (c.k()));
	//   14   28:aload_0         
	//   15   29:getfield        #93  <Field h c>
	//   16   32:invokevirtual   #297 <Method ArrayList h.k()>
	//   17   35:astore          5
			int j1 = ((ArrayList) (obj)).size();
	//   18   37:aload           5
	//   19   39:invokevirtual   #302 <Method int ArrayList.size()>
	//   20   42:istore          4
			for(int i1 = 0; i1 < j1; i1++)
	//*  21   44:iconst_0        
	//*  22   45:istore_2        
	//*  23   46:iload_2         
	//*  24   47:iload           4
	//*  25   49:icmpge          84
			{
				android.support.v4.view.b b1 = ((j)((ArrayList) (obj)).get(i1)).a();
	//   26   52:aload           5
	//   27   54:iload_2         
	//   28   55:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   29   58:checkcast       #125 <Class j>
	//   30   61:invokevirtual   #309 <Method android.support.v4.view.b j.a()>
	//   31   64:astore          6
				if(b1 != null)
	//*  32   66:aload           6
	//*  33   68:ifnull          77
					b1.a(((android.support.v4.view.b.a) (this)));
	//   34   71:aload           6
	//   35   73:aload_0         
	//   36   74:invokevirtual   #314 <Method void android.support.v4.view.b.a(android.support.v4.view.b$a)>
			}

	//   37   77:iload_2         
	//   38   78:iconst_1        
	//   39   79:iadd            
	//   40   80:istore_2        
		}
	//*  41   81:goto            46
		if(c != null)
	//*  42   84:aload_0         
	//*  43   85:getfield        #93  <Field h c>
	//*  44   88:ifnull          103
			obj = ((Object) (c.l()));
	//   45   91:aload_0         
	//   46   92:getfield        #93  <Field h c>
	//   47   95:invokevirtual   #316 <Method ArrayList h.l()>
	//   48   98:astore          5
		else
	//*  49  100:goto            106
			obj = null;
	//   50  103:aconst_null     
	//   51  104:astore          5
		boolean flag1 = flag2;
	//   52  106:iload_3         
	//   53  107:istore_2        
		if(o)
	//*  54  108:aload_0         
	//*  55  109:getfield        #178 <Field boolean o>
	//*  56  112:ifeq            162
		{
			flag1 = flag2;
	//   57  115:iload_3         
	//   58  116:istore_2        
			if(obj != null)
	//*  59  117:aload           5
	//*  60  119:ifnull          162
			{
				int k1 = ((ArrayList) (obj)).size();
	//   61  122:aload           5
	//   62  124:invokevirtual   #302 <Method int ArrayList.size()>
	//   63  127:istore          4
				if(k1 == 1)
	//*  64  129:iload           4
	//*  65  131:iconst_1        
	//*  66  132:icmpne          153
				{
					flag1 = ((j)((ArrayList) (obj)).get(0)).isActionViewExpanded() ^ true;
	//   67  135:aload           5
	//   68  137:iconst_0        
	//   69  138:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   70  141:checkcast       #125 <Class j>
	//   71  144:invokevirtual   #137 <Method boolean j.isActionViewExpanded()>
	//   72  147:iconst_1        
	//   73  148:ixor            
	//   74  149:istore_2        
				} else
	//*  75  150:goto            162
				{
					flag1 = flag2;
	//   76  153:iload_3         
	//   77  154:istore_2        
					if(k1 > 0)
	//*  78  155:iload           4
	//*  79  157:ifle            162
						flag1 = true;
	//   80  160:iconst_1        
	//   81  161:istore_2        
				}
			}
		}
		if(flag1)
	//*  82  162:iload_2         
	//*  83  163:ifeq            250
		{
			if(g == null)
	//*  84  166:aload_0         
	//*  85  167:getfield        #192 <Field ActionMenuPresenter$d g>
	//*  86  170:ifnonnull       189
				g = new d(a);
	//   87  173:aload_0         
	//   88  174:new             #22  <Class ActionMenuPresenter$d>
	//   89  177:dup             
	//   90  178:aload_0         
	//   91  179:aload_0         
	//   92  180:getfield        #195 <Field Context a>
	//   93  183:invokespecial   #198 <Method void ActionMenuPresenter$d(ActionMenuPresenter, Context)>
	//   94  186:putfield        #192 <Field ActionMenuPresenter$d g>
			Object obj1 = ((Object) ((ViewGroup)g.getParent()));
	//   95  189:aload_0         
	//   96  190:getfield        #192 <Field ActionMenuPresenter$d g>
	//   97  193:invokevirtual   #320 <Method android.view.ViewParent ActionMenuPresenter$d.getParent()>
	//   98  196:checkcast       #99  <Class ViewGroup>
	//   99  199:astore          5
			if(obj1 != f)
	//* 100  201:aload           5
	//* 101  203:aload_0         
	//* 102  204:getfield        #97  <Field p f>
	//* 103  207:if_acmpeq       285
			{
				if(obj1 != null)
	//* 104  210:aload           5
	//* 105  212:ifnull          224
					((ViewGroup) (obj1)).removeView(((View) (g)));
	//  106  215:aload           5
	//  107  217:aload_0         
	//  108  218:getfield        #192 <Field ActionMenuPresenter$d g>
	//  109  221:invokevirtual   #324 <Method void ViewGroup.removeView(View)>
				obj1 = ((Object) ((ActionMenuView)f));
	//  110  224:aload_0         
	//  111  225:getfield        #97  <Field p f>
	//  112  228:checkcast       #119 <Class ActionMenuView>
	//  113  231:astore          5
				((ActionMenuView) (obj1)).addView(((View) (g)), ((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (obj1)).c())));
	//  114  233:aload           5
	//  115  235:aload_0         
	//  116  236:getfield        #192 <Field ActionMenuPresenter$d g>
	//  117  239:aload           5
	//  118  241:invokevirtual   #327 <Method ActionMenuView$LayoutParams ActionMenuView.c()>
	//  119  244:invokevirtual   #331 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} else
	//* 120  247:goto            285
		if(g != null && g.getParent() == f)
	//* 121  250:aload_0         
	//* 122  251:getfield        #192 <Field ActionMenuPresenter$d g>
	//* 123  254:ifnull          285
	//* 124  257:aload_0         
	//* 125  258:getfield        #192 <Field ActionMenuPresenter$d g>
	//* 126  261:invokevirtual   #320 <Method android.view.ViewParent ActionMenuPresenter$d.getParent()>
	//* 127  264:aload_0         
	//* 128  265:getfield        #97  <Field p f>
	//* 129  268:if_acmpne       285
			((ViewGroup)f).removeView(((View) (g)));
	//  130  271:aload_0         
	//  131  272:getfield        #97  <Field p f>
	//  132  275:checkcast       #99  <Class ViewGroup>
	//  133  278:aload_0         
	//  134  279:getfield        #192 <Field ActionMenuPresenter$d g>
	//  135  282:invokevirtual   #324 <Method void ViewGroup.removeView(View)>
		((ActionMenuView)f).setOverflowReserved(o);
	//  136  285:aload_0         
	//  137  286:getfield        #97  <Field p f>
	//  138  289:checkcast       #119 <Class ActionMenuView>
	//  139  292:aload_0         
	//  140  293:getfield        #178 <Field boolean o>
	//  141  296:invokevirtual   #334 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//  142  299:return          
	}

	public boolean a()
	{
		int j2;
		int k2;
		int l3;
		int l4;
		int i6;
		ArrayList arraylist;
		ActionMenuPresenter actionmenupresenter;
		ViewGroup viewgroup;
label0:
		{
			actionmenupresenter = this;
	//    0    0:aload_0         
	//    1    1:astore          15
			if(actionmenupresenter.c != null)
	//*   2    3:aload           15
	//*   3    5:getfield        #93  <Field h c>
	//*   4    8:ifnull          31
			{
				arraylist = actionmenupresenter.c.i();
	//    5   11:aload           15
	//    6   13:getfield        #93  <Field h c>
	//    7   16:invokevirtual   #336 <Method ArrayList h.i()>
	//    8   19:astore          14
				k2 = arraylist.size();
	//    9   21:aload           14
	//   10   23:invokevirtual   #302 <Method int ArrayList.size()>
	//   11   26:istore          4
			} else
	//*  12   28:goto            37
			{
				arraylist = null;
	//   13   31:aconst_null     
	//   14   32:astore          14
				k2 = 0;
	//   15   34:iconst_0        
	//   16   35:istore          4
			}
			int i1 = actionmenupresenter.s;
	//   17   37:aload           15
	//   18   39:getfield        #190 <Field int s>
	//   19   42:istore_1        
			l4 = actionmenupresenter.r;
	//   20   43:aload           15
	//   21   45:getfield        #221 <Field int r>
	//   22   48:istore          8
			i6 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   23   50:iconst_0        
	//   24   51:iconst_0        
	//   25   52:invokestatic    #212 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   55:istore          10
			viewgroup = (ViewGroup)actionmenupresenter.f;
	//   27   57:aload           15
	//   28   59:getfield        #97  <Field p f>
	//   29   62:checkcast       #99  <Class ViewGroup>
	//   30   65:astore          16
			j2 = 0;
	//   31   67:iconst_0        
	//   32   68:istore_3        
			l3 = 0;
	//   33   69:iconst_0        
	//   34   70:istore          5
			boolean flag = false;
	//   35   72:iconst_0        
	//   36   73:istore          6
			int k1 = 0;
	//   37   75:iconst_0        
	//   38   76:istore_2        
			while(j2 < k2) 
	//*  39   77:iload_3         
	//*  40   78:iload           4
	//*  41   80:icmpge          164
			{
				j j8 = (j)arraylist.get(j2);
	//   42   83:aload           14
	//   43   85:iload_3         
	//   44   86:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//   45   89:checkcast       #125 <Class j>
	//   46   92:astore          17
				if(j8.l())
	//*  47   94:aload           17
	//*  48   96:invokevirtual   #338 <Method boolean j.l()>
	//*  49   99:ifeq            111
					l3++;
	//   50  102:iload           5
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore          5
				else
	//*  54  108:goto            129
				if(j8.k())
	//*  55  111:aload           17
	//*  56  113:invokevirtual   #340 <Method boolean j.k()>
	//*  57  116:ifeq            126
					k1++;
	//   58  119:iload_2         
	//   59  120:iconst_1        
	//   60  121:iadd            
	//   61  122:istore_2        
				else
	//*  62  123:goto            129
					flag = true;
	//   63  126:iconst_1        
	//   64  127:istore          6
				int j4 = i1;
	//   65  129:iload_1         
	//   66  130:istore          7
				if(actionmenupresenter.w)
	//*  67  132:aload           15
	//*  68  134:getfield        #342 <Field boolean w>
	//*  69  137:ifeq            154
				{
					j4 = i1;
	//   70  140:iload_1         
	//   71  141:istore          7
					if(j8.isActionViewExpanded())
	//*  72  143:aload           17
	//*  73  145:invokevirtual   #137 <Method boolean j.isActionViewExpanded()>
	//*  74  148:ifeq            154
						j4 = 0;
	//   75  151:iconst_0        
	//   76  152:istore          7
				}
				j2++;
	//   77  154:iload_3         
	//   78  155:iconst_1        
	//   79  156:iadd            
	//   80  157:istore_3        
				i1 = j4;
	//   81  158:iload           7
	//   82  160:istore_1        
			}
	//*  83  161:goto            77
			j2 = i1;
	//   84  164:iload_1         
	//   85  165:istore_3        
			if(!actionmenupresenter.o)
				break label0;
	//   86  166:aload           15
	//   87  168:getfield        #178 <Field boolean o>
	//   88  171:ifeq            193
			if(!flag)
	//*  89  174:iload           6
	//*  90  176:ifne            189
			{
				j2 = i1;
	//   91  179:iload_1         
	//   92  180:istore_3        
				if(k1 + l3 <= i1)
					break label0;
	//   93  181:iload_2         
	//   94  182:iload           5
	//   95  184:iadd            
	//   96  185:iload_1         
	//   97  186:icmple          193
			}
			j2 = i1 - 1;
	//   98  189:iload_1         
	//   99  190:iconst_1        
	//  100  191:isub            
	//  101  192:istore_3        
		}
		int j1 = j2 - l3;
	//  102  193:iload_3         
	//  103  194:iload           5
	//  104  196:isub            
	//  105  197:istore_1        
		SparseBooleanArray sparsebooleanarray = actionmenupresenter.y;
	//  106  198:aload           15
	//  107  200:getfield        #83  <Field SparseBooleanArray y>
	//  108  203:astore          17
		sparsebooleanarray.clear();
	//  109  205:aload           17
	//  110  207:invokevirtual   #345 <Method void SparseBooleanArray.clear()>
		int i4;
		if(actionmenupresenter.u)
	//* 111  210:aload           15
	//* 112  212:getfield        #347 <Field boolean u>
	//* 113  215:ifeq            254
		{
			j2 = l4 / actionmenupresenter.x;
	//  114  218:iload           8
	//  115  220:aload           15
	//  116  222:getfield        #236 <Field int x>
	//  117  225:idiv            
	//  118  226:istore_3        
			int l1 = actionmenupresenter.x;
	//  119  227:aload           15
	//  120  229:getfield        #236 <Field int x>
	//  121  232:istore_2        
			l3 = actionmenupresenter.x;
	//  122  233:aload           15
	//  123  235:getfield        #236 <Field int x>
	//  124  238:istore          5
			i4 = (l4 % l1) / j2 + l3;
	//  125  240:iload           8
	//  126  242:iload_2         
	//  127  243:irem            
	//  128  244:iload_3         
	//  129  245:idiv            
	//  130  246:iload           5
	//  131  248:iadd            
	//  132  249:istore          6
		} else
	//* 133  251:goto            259
		{
			j2 = 0;
	//  134  254:iconst_0        
	//  135  255:istore_3        
			i4 = 0;
	//  136  256:iconst_0        
	//  137  257:istore          6
		}
		l3 = l4;
	//  138  259:iload           8
	//  139  261:istore          5
		l4 = 0;
	//  140  263:iconst_0        
	//  141  264:istore          8
		int i2 = 0;
	//  142  266:iconst_0        
	//  143  267:istore_2        
		int k4 = k2;
	//  144  268:iload           4
	//  145  270:istore          7
		do
		{
			ActionMenuPresenter actionmenupresenter1 = this;
	//  146  272:aload_0         
	//  147  273:astore          15
			if(l4 < k4)
	//* 148  275:iload           8
	//* 149  277:iload           7
	//* 150  279:icmpge          790
			{
				j j9 = (j)arraylist.get(l4);
	//  151  282:aload           14
	//  152  284:iload           8
	//  153  286:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//  154  289:checkcast       #125 <Class j>
	//  155  292:astore          18
				if(j9.l())
	//* 156  294:aload           18
	//* 157  296:invokevirtual   #338 <Method boolean j.l()>
	//* 158  299:ifeq            424
				{
					View view = actionmenupresenter1.a(j9, actionmenupresenter1.z, viewgroup);
	//  159  302:aload           15
	//  160  304:aload           18
	//  161  306:aload           15
	//  162  308:getfield        #238 <Field View z>
	//  163  311:aload           16
	//  164  313:invokevirtual   #348 <Method View a(j, View, ViewGroup)>
	//  165  316:astore          19
					if(actionmenupresenter1.z == null)
	//* 166  318:aload           15
	//* 167  320:getfield        #238 <Field View z>
	//* 168  323:ifnonnull       333
						actionmenupresenter1.z = view;
	//  169  326:aload           15
	//  170  328:aload           19
	//  171  330:putfield        #238 <Field View z>
					if(actionmenupresenter1.u)
	//* 172  333:aload           15
	//* 173  335:getfield        #347 <Field boolean u>
	//* 174  338:ifeq            358
						j2 -= android.support.v7.widget.ActionMenuView.a(view, i4, j2, i6, 0);
	//  175  341:iload_3         
	//  176  342:aload           19
	//  177  344:iload           6
	//  178  346:iload_3         
	//  179  347:iload           10
	//  180  349:iconst_0        
	//  181  350:invokestatic    #351 <Method int android.support.v7.widget.ActionMenuView.a(View, int, int, int, int)>
	//  182  353:isub            
	//  183  354:istore_3        
					else
	//* 184  355:goto            367
						view.measure(i6, i6);
	//  185  358:aload           19
	//  186  360:iload           10
	//  187  362:iload           10
	//  188  364:invokevirtual   #352 <Method void View.measure(int, int)>
					int i5 = view.getMeasuredWidth();
	//  189  367:aload           19
	//  190  369:invokevirtual   #353 <Method int View.getMeasuredWidth()>
	//  191  372:istore          9
					l3 -= i5;
	//  192  374:iload           5
	//  193  376:iload           9
	//  194  378:isub            
	//  195  379:istore          5
					int l2 = i2;
	//  196  381:iload_2         
	//  197  382:istore          4
					if(i2 == 0)
	//* 198  384:iload_2         
	//* 199  385:ifne            392
						l2 = i5;
	//  200  388:iload           9
	//  201  390:istore          4
					i2 = j9.getGroupId();
	//  202  392:aload           18
	//  203  394:invokevirtual   #356 <Method int j.getGroupId()>
	//  204  397:istore_2        
					if(i2 != 0)
	//* 205  398:iload_2         
	//* 206  399:ifeq            412
						sparsebooleanarray.put(i2, true);
	//  207  402:aload           17
	//  208  404:iload_2         
	//  209  405:iconst_1        
	//  210  406:invokevirtual   #360 <Method void SparseBooleanArray.put(int, boolean)>
	//* 211  409:goto            412
					j9.d(true);
	//  212  412:aload           18
	//  213  414:iconst_1        
	//  214  415:invokevirtual   #362 <Method void j.d(boolean)>
					i2 = l2;
	//  215  418:iload           4
	//  216  420:istore_2        
				} else
	//* 217  421:goto            781
				if(j9.k())
	//* 218  424:aload           18
	//* 219  426:invokevirtual   #340 <Method boolean j.k()>
	//* 220  429:ifeq            775
				{
					int j6 = j9.getGroupId();
	//  221  432:aload           18
	//  222  434:invokevirtual   #356 <Method int j.getGroupId()>
	//  223  437:istore          11
					boolean flag2 = sparsebooleanarray.get(j6);
	//  224  439:aload           17
	//  225  441:iload           11
	//  226  443:invokevirtual   #365 <Method boolean SparseBooleanArray.get(int)>
	//  227  446:istore          13
					boolean flag1;
					if((j1 > 0 || flag2) && l3 > 0 && (!actionmenupresenter1.u || j2 > 0))
	//* 228  448:iload_1         
	//* 229  449:ifgt            457
	//* 230  452:iload           13
	//* 231  454:ifeq            480
	//* 232  457:iload           5
	//* 233  459:ifle            480
	//* 234  462:aload           15
	//* 235  464:getfield        #347 <Field boolean u>
	//* 236  467:ifeq            474
	//* 237  470:iload_3         
	//* 238  471:ifle            480
						flag1 = true;
	//  239  474:iconst_1        
	//  240  475:istore          12
					else
	//* 241  477:goto            483
						flag1 = false;
	//  242  480:iconst_0        
	//  243  481:istore          12
					if(flag1)
	//* 244  483:iload           12
	//* 245  485:ifeq            640
					{
						View view1 = actionmenupresenter1.a(j9, actionmenupresenter1.z, viewgroup);
	//  246  488:aload           15
	//  247  490:aload           18
	//  248  492:aload           15
	//  249  494:getfield        #238 <Field View z>
	//  250  497:aload           16
	//  251  499:invokevirtual   #348 <Method View a(j, View, ViewGroup)>
	//  252  502:astore          19
						if(actionmenupresenter1.z == null)
	//* 253  504:aload           15
	//* 254  506:getfield        #238 <Field View z>
	//* 255  509:ifnonnull       519
							actionmenupresenter1.z = view1;
	//  256  512:aload           15
	//  257  514:aload           19
	//  258  516:putfield        #238 <Field View z>
						if(actionmenupresenter1.u)
	//* 259  519:aload           15
	//* 260  521:getfield        #347 <Field boolean u>
	//* 261  524:ifeq            563
						{
							int j5 = android.support.v7.widget.ActionMenuView.a(view1, i4, j2, i6, 0);
	//  262  527:aload           19
	//  263  529:iload           6
	//  264  531:iload_3         
	//  265  532:iload           10
	//  266  534:iconst_0        
	//  267  535:invokestatic    #351 <Method int android.support.v7.widget.ActionMenuView.a(View, int, int, int, int)>
	//  268  538:istore          9
							int i3 = j2 - j5;
	//  269  540:iload_3         
	//  270  541:iload           9
	//  271  543:isub            
	//  272  544:istore          4
							j2 = i3;
	//  273  546:iload           4
	//  274  548:istore_3        
							if(j5 == 0)
	//* 275  549:iload           9
	//* 276  551:ifne            572
							{
								flag1 = false;
	//  277  554:iconst_0        
	//  278  555:istore          12
								j2 = i3;
	//  279  557:iload           4
	//  280  559:istore_3        
							}
						} else
	//* 281  560:goto            572
						{
							view1.measure(i6, i6);
	//  282  563:aload           19
	//  283  565:iload           10
	//  284  567:iload           10
	//  285  569:invokevirtual   #352 <Method void View.measure(int, int)>
						}
						int k5 = view1.getMeasuredWidth();
	//  286  572:aload           19
	//  287  574:invokevirtual   #353 <Method int View.getMeasuredWidth()>
	//  288  577:istore          9
						l3 -= k5;
	//  289  579:iload           5
	//  290  581:iload           9
	//  291  583:isub            
	//  292  584:istore          5
						int j3 = i2;
	//  293  586:iload_2         
	//  294  587:istore          4
						if(i2 == 0)
	//* 295  589:iload_2         
	//* 296  590:ifne            597
							j3 = k5;
	//  297  593:iload           9
	//  298  595:istore          4
						if(actionmenupresenter1.u ? l3 >= 0 : l3 + j3 > 0)
	//* 299  597:aload           15
	//* 300  599:getfield        #347 <Field boolean u>
	//* 301  602:ifeq            629
	//* 302  605:iload           5
	//* 303  607:iflt            615
							i2 = 1;
	//  304  610:iconst_1        
	//  305  611:istore_2        
						else
	//* 306  612:goto            617
							i2 = 0;
	//  307  615:iconst_0        
	//  308  616:istore_2        
	//  309  617:iload           12
	//  310  619:iload_2         
	//  311  620:iand            
	//  312  621:istore          12
	//  313  623:iload           4
	//  314  625:istore_2        
	//  315  626:goto            640
	//  316  629:iload           5
	//  317  631:iload           4
	//  318  633:iadd            
	//  319  634:ifle            615
						flag1 &= ((boolean) (i2));
						i2 = j3;
					}
	//* 320  637:goto            610
					int k3;
					if(flag1 && j6 != 0)
	//* 321  640:iload           12
	//* 322  642:ifeq            664
	//* 323  645:iload           11
	//* 324  647:ifeq            664
					{
						sparsebooleanarray.put(j6, true);
	//  325  650:aload           17
	//  326  652:iload           11
	//  327  654:iconst_1        
	//  328  655:invokevirtual   #360 <Method void SparseBooleanArray.put(int, boolean)>
						k3 = j1;
	//  329  658:iload_1         
	//  330  659:istore          4
					} else
	//* 331  661:goto            752
					{
						k3 = j1;
	//  332  664:iload_1         
	//  333  665:istore          4
						if(flag2)
	//* 334  667:iload           13
	//* 335  669:ifeq            752
						{
							sparsebooleanarray.put(j6, false);
	//  336  672:aload           17
	//  337  674:iload           11
	//  338  676:iconst_0        
	//  339  677:invokevirtual   #360 <Method void SparseBooleanArray.put(int, boolean)>
							int l5 = 0;
	//  340  680:iconst_0        
	//  341  681:istore          9
							do
							{
								k3 = j1;
	//  342  683:iload_1         
	//  343  684:istore          4
								if(l5 >= l4)
									break;
	//  344  686:iload           9
	//  345  688:iload           8
	//  346  690:icmpge          752
								j j7 = (j)arraylist.get(l5);
	//  347  693:aload           14
	//  348  695:iload           9
	//  349  697:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//  350  700:checkcast       #125 <Class j>
	//  351  703:astore          15
								k3 = j1;
	//  352  705:iload_1         
	//  353  706:istore          4
								if(j7.getGroupId() == j6)
	//* 354  708:aload           15
	//* 355  710:invokevirtual   #356 <Method int j.getGroupId()>
	//* 356  713:iload           11
	//* 357  715:icmpne          740
								{
									k3 = j1;
	//  358  718:iload_1         
	//  359  719:istore          4
									if(j7.j())
	//* 360  721:aload           15
	//* 361  723:invokevirtual   #367 <Method boolean j.j()>
	//* 362  726:ifeq            734
										k3 = j1 + 1;
	//  363  729:iload_1         
	//  364  730:iconst_1        
	//  365  731:iadd            
	//  366  732:istore          4
									j7.d(false);
	//  367  734:aload           15
	//  368  736:iconst_0        
	//  369  737:invokevirtual   #362 <Method void j.d(boolean)>
								}
								l5++;
	//  370  740:iload           9
	//  371  742:iconst_1        
	//  372  743:iadd            
	//  373  744:istore          9
								j1 = k3;
	//  374  746:iload           4
	//  375  748:istore_1        
							} while(true);
	//  376  749:goto            683
						}
					}
					j1 = k3;
	//  377  752:iload           4
	//  378  754:istore_1        
					if(flag1)
	//* 379  755:iload           12
	//* 380  757:ifeq            765
						j1 = k3 - 1;
	//  381  760:iload           4
	//  382  762:iconst_1        
	//  383  763:isub            
	//  384  764:istore_1        
					j9.d(flag1);
	//  385  765:aload           18
	//  386  767:iload           12
	//  387  769:invokevirtual   #362 <Method void j.d(boolean)>
				} else
	//* 388  772:goto            421
				{
					j9.d(false);
	//  389  775:aload           18
	//  390  777:iconst_0        
	//  391  778:invokevirtual   #362 <Method void j.d(boolean)>
				}
				l4++;
	//  392  781:iload           8
	//  393  783:iconst_1        
	//  394  784:iadd            
	//  395  785:istore          8
			} else
	//* 396  787:goto            272
			{
				return true;
	//  397  790:iconst_1        
	//  398  791:ireturn         
			}
		} while(true);
	}

	public boolean a(int i1, j j1)
	{
		return j1.j();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #367 <Method boolean j.j()>
	//    2    4:ireturn         
	}

	public boolean a(u u1)
	{
		boolean flag = u1.hasVisibleItems();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #371 <Method boolean u.hasVisibleItems()>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		Object obj;
		for(obj = ((Object) (u1)); ((u) (obj)).s() != c; obj = ((Object) ((u)((u) (obj)).s())));
	//    9   16:aload_1         
	//   10   17:astore          6
	//   11   19:aload           6
	//   12   21:invokevirtual   #374 <Method android.view.Menu u.s()>
	//   13   24:aload_0         
	//   14   25:getfield        #93  <Field h c>
	//   15   28:if_acmpeq       44
	//   16   31:aload           6
	//   17   33:invokevirtual   #374 <Method android.view.Menu u.s()>
	//   18   36:checkcast       #261 <Class u>
	//   19   39:astore          6
	//*  20   41:goto            19
		obj = ((Object) (a(((u) (obj)).getItem())));
	//   21   44:aload_0         
	//   22   45:aload           6
	//   23   47:invokevirtual   #378 <Method MenuItem u.getItem()>
	//   24   50:invokespecial   #380 <Method View a(MenuItem)>
	//   25   53:astore          6
		if(obj == null)
	//*  26   55:aload           6
	//*  27   57:ifnonnull       62
			return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
		l = u1.getItem().getItemId();
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #378 <Method MenuItem u.getItem()>
	//   33   67:invokeinterface #383 <Method int MenuItem.getItemId()>
	//   34   72:putfield        #385 <Field int l>
		int j1 = u1.size();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #386 <Method int u.size()>
	//   37   79:istore_3        
		int i1 = 0;
	//   38   80:iconst_0        
	//   39   81:istore_2        
		do
		{
			flag = flag1;
	//   40   82:iload           5
	//   41   84:istore          4
			if(i1 >= j1)
				break;
	//   42   86:iload_2         
	//   43   87:iload_3         
	//   44   88:icmpge          131
			MenuItem menuitem = u1.getItem(i1);
	//   45   91:aload_1         
	//   46   92:iload_2         
	//   47   93:invokevirtual   #388 <Method MenuItem u.getItem(int)>
	//   48   96:astore          7
			if(menuitem.isVisible() && menuitem.getIcon() != null)
	//*  49   98:aload           7
	//*  50  100:invokeinterface #391 <Method boolean MenuItem.isVisible()>
	//*  51  105:ifeq            124
	//*  52  108:aload           7
	//*  53  110:invokeinterface #395 <Method Drawable MenuItem.getIcon()>
	//*  54  115:ifnull          124
			{
				flag = true;
	//   55  118:iconst_1        
	//   56  119:istore          4
				break;
	//   57  121:goto            131
			}
			i1++;
	//   58  124:iload_2         
	//   59  125:iconst_1        
	//   60  126:iadd            
	//   61  127:istore_2        
		} while(true);
	//   62  128:goto            82
		i = new a(b, u1, ((View) (obj)));
	//   63  131:aload_0         
	//   64  132:new             #13  <Class ActionMenuPresenter$a>
	//   65  135:dup             
	//   66  136:aload_0         
	//   67  137:aload_0         
	//   68  138:getfield        #241 <Field Context b>
	//   69  141:aload_1         
	//   70  142:aload           6
	//   71  144:invokespecial   #398 <Method void ActionMenuPresenter$a(ActionMenuPresenter, Context, u, View)>
	//   72  147:putfield        #400 <Field ActionMenuPresenter$a i>
		i.a(flag);
	//   73  150:aload_0         
	//   74  151:getfield        #400 <Field ActionMenuPresenter$a i>
	//   75  154:iload           4
	//   76  156:invokevirtual   #401 <Method void android.support.v7.widget.ActionMenuPresenter$a.a(boolean)>
		i.a();
	//   77  159:aload_0         
	//   78  160:getfield        #400 <Field ActionMenuPresenter$a i>
	//   79  163:invokevirtual   #403 <Method void android.support.v7.widget.ActionMenuPresenter$a.a()>
		super.a(u1);
	//   80  166:aload_0         
	//   81  167:aload_1         
	//   82  168:invokespecial   #404 <Method boolean b.a(u)>
	//   83  171:pop             
		return true;
	//   84  172:iconst_1        
	//   85  173:ireturn         
	}

	public boolean a(ViewGroup viewgroup, int i1)
	{
		if(viewgroup.getChildAt(i1) == g)
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #107 <Method View ViewGroup.getChildAt(int)>
	//*   3    5:aload_0         
	//*   4    6:getfield        #192 <Field ActionMenuPresenter$d g>
	//*   5    9:if_acmpne       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		else
			return super.a(viewgroup, i1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #407 <Method boolean b.a(ViewGroup, int)>
	//   12   20:ireturn         
	}

	public void b(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
		{
			super.a(((u) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #404 <Method boolean b.a(u)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		if(c != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #93  <Field h c>
	//*   9   15:ifnull          26
			c.b(false);
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field h c>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #409 <Method void h.b(boolean)>
	//   14   26:return          
	}

	public Parcelable c()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #8   <Class ActionMenuPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #411 <Method void ActionMenuPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.a = l;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #385 <Field int l>
	//    7   13:putfield        #249 <Field int android.support.v7.widget.ActionMenuPresenter$SavedState.a>
		return ((Parcelable) (savedstate));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public void c(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #178 <Field boolean o>
		p = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #174 <Field boolean p>
	//    6   10:return          
	}

	public void d(boolean flag)
	{
		w = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #342 <Field boolean w>
	//    3    5:return          
	}

	public Drawable e()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field ActionMenuPresenter$d g>
	//*   2    4:ifnull          15
			return g.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #192 <Field ActionMenuPresenter$d g>
	//    5   11:invokevirtual   #414 <Method Drawable ActionMenuPresenter$d.getDrawable()>
	//    6   14:areturn         
		if(n)
	//*   7   15:aload_0         
	//*   8   16:getfield        #200 <Field boolean n>
	//*   9   19:ifeq            27
			return m;
	//   10   22:aload_0         
	//   11   23:getfield        #202 <Field Drawable m>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public boolean f()
	{
		if(o && !j() && c != null && f != null && j == null && !c.l().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field boolean o>
	//*   2    4:ifeq            104
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #415 <Method boolean j()>
	//*   5   11:ifne            104
	//*   6   14:aload_0         
	//*   7   15:getfield        #93  <Field h c>
	//*   8   18:ifnull          104
	//*   9   21:aload_0         
	//*  10   22:getfield        #97  <Field p f>
	//*  11   25:ifnull          104
	//*  12   28:aload_0         
	//*  13   29:getfield        #417 <Field ActionMenuPresenter$c j>
	//*  14   32:ifnonnull       104
	//*  15   35:aload_0         
	//*  16   36:getfield        #93  <Field h c>
	//*  17   39:invokevirtual   #316 <Method ArrayList h.l()>
	//*  18   42:invokevirtual   #420 <Method boolean ArrayList.isEmpty()>
	//*  19   45:ifne            104
		{
			j = new c(new e(b, c, ((View) (g)), true));
	//   20   48:aload_0         
	//   21   49:new             #19  <Class ActionMenuPresenter$c>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:new             #27  <Class ActionMenuPresenter$e>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #241 <Field Context b>
	//   29   63:aload_0         
	//   30   64:getfield        #93  <Field h c>
	//   31   67:aload_0         
	//   32   68:getfield        #192 <Field ActionMenuPresenter$d g>
	//   33   71:iconst_1        
	//   34   72:invokespecial   #423 <Method void ActionMenuPresenter$e(ActionMenuPresenter, Context, h, View, boolean)>
	//   35   75:invokespecial   #426 <Method void ActionMenuPresenter$c(ActionMenuPresenter, ActionMenuPresenter$e)>
	//   36   78:putfield        #417 <Field ActionMenuPresenter$c j>
			((View)f).post(((Runnable) (j)));
	//   37   81:aload_0         
	//   38   82:getfield        #97  <Field p f>
	//   39   85:checkcast       #139 <Class View>
	//   40   88:aload_0         
	//   41   89:getfield        #417 <Field ActionMenuPresenter$c j>
	//   42   92:invokevirtual   #430 <Method boolean View.post(Runnable)>
	//   43   95:pop             
			super.a(((u) (null)));
	//   44   96:aload_0         
	//   45   97:aconst_null     
	//   46   98:invokespecial   #404 <Method boolean b.a(u)>
	//   47  101:pop             
			return true;
	//   48  102:iconst_1        
	//   49  103:ireturn         
		} else
		{
			return false;
	//   50  104:iconst_0        
	//   51  105:ireturn         
		}
	}

	public boolean g()
	{
		if(j != null && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ActionMenuPresenter$c j>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #97  <Field p f>
	//*   5   11:ifnull          36
		{
			((View)f).removeCallbacks(((Runnable) (j)));
	//    6   14:aload_0         
	//    7   15:getfield        #97  <Field p f>
	//    8   18:checkcast       #139 <Class View>
	//    9   21:aload_0         
	//   10   22:getfield        #417 <Field ActionMenuPresenter$c j>
	//   11   25:invokevirtual   #433 <Method boolean View.removeCallbacks(Runnable)>
	//   12   28:pop             
			j = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #417 <Field ActionMenuPresenter$c j>
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		e e1 = h;
	//   18   36:aload_0         
	//   19   37:getfield        #435 <Field ActionMenuPresenter$e h>
	//   20   40:astore_1        
		if(e1 != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          51
		{
			((n) (e1)).d();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #439 <Method void n.d()>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		} else
		{
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
	}

	public boolean h()
	{
		return g() | i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #441 <Method boolean g()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #443 <Method boolean i()>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public boolean i()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #400 <Field ActionMenuPresenter$a i>
	//*   2    4:ifnull          16
		{
			i.d();
	//    3    7:aload_0         
	//    4    8:getfield        #400 <Field ActionMenuPresenter$a i>
	//    5   11:invokevirtual   #444 <Method void ActionMenuPresenter$a.d()>
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		} else
		{
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
	}

	public boolean j()
	{
		return h != null && h.f();
	//    0    0:aload_0         
	//    1    1:getfield        #435 <Field ActionMenuPresenter$e h>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #435 <Field ActionMenuPresenter$e h>
	//    5   11:invokevirtual   #446 <Method boolean ActionMenuPresenter$e.f()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean k()
	{
		return j != null || j();
	//    0    0:aload_0         
	//    1    1:getfield        #417 <Field ActionMenuPresenter$c j>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #415 <Method boolean j()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private b A;
	d g;
	e h;
	a i;
	c j;
	final f k = new f();
	int l;
	private Drawable m;
	private boolean n;
	private boolean o;
	private boolean p;
	private int q;
	private int r;
	private int s;
	private boolean t;
	private boolean u;
	private boolean v;
	private boolean w;
	private int x;
	private final SparseBooleanArray y = new SparseBooleanArray();
	private View z;

	// Unreferenced inner class android/support/v7/widget/ActionMenuPresenter$d$1

/* anonymous class */
	class d._cls1 extends ac
	{

		public s a()
		{
			if(b.a.h == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field ActionMenuPresenter$d b>
		//*   2    4:getfield        #27  <Field ActionMenuPresenter android.support.v7.widget.ActionMenuPresenter$d.a>
		//*   3    7:getfield        #31  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
		//*   4   10:ifnonnull       15
				return null;
		//    5   13:aconst_null     
		//    6   14:areturn         
			else
				return ((s) (b.a.h.b()));
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field ActionMenuPresenter$d b>
		//    9   19:getfield        #27  <Field ActionMenuPresenter android.support.v7.widget.ActionMenuPresenter$d.a>
		//   10   22:getfield        #31  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
		//   11   25:invokevirtual   #36  <Method android.support.v7.view.menu.m android.support.v7.widget.ActionMenuPresenter$e.b()>
		//   12   28:areturn         
		}

		public boolean b()
		{
			b.a.f();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ActionMenuPresenter$d b>
		//    2    4:getfield        #27  <Field ActionMenuPresenter android.support.v7.widget.ActionMenuPresenter$d.a>
		//    3    7:invokevirtual   #40  <Method boolean ActionMenuPresenter.f()>
		//    4   10:pop             
			return true;
		//    5   11:iconst_1        
		//    6   12:ireturn         
		}

		public boolean c()
		{
			if(b.a.j != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field ActionMenuPresenter$d b>
		//*   2    4:getfield        #27  <Field ActionMenuPresenter android.support.v7.widget.ActionMenuPresenter$d.a>
		//*   3    7:getfield        #45  <Field ActionMenuPresenter$c android.support.v7.widget.ActionMenuPresenter.j>
		//*   4   10:ifnull          15
			{
				return false;
		//    5   13:iconst_0        
		//    6   14:ireturn         
			} else
			{
				b.a.g();
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field ActionMenuPresenter$d b>
		//    9   19:getfield        #27  <Field ActionMenuPresenter android.support.v7.widget.ActionMenuPresenter$d.a>
		//   10   22:invokevirtual   #48  <Method boolean ActionMenuPresenter.g()>
		//   11   25:pop             
				return true;
		//   12   26:iconst_1        
		//   13   27:ireturn         
			}
		}

		final ActionMenuPresenter a;
		final d b;

			
			{
				b = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ActionMenuPresenter$d b>
				a = actionmenupresenter;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field ActionMenuPresenter a>
				super(view);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #24  <Method void ac(View)>
			//    9   15:return          
			}
	}

}
