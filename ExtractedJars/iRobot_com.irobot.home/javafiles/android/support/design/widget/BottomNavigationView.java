// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v7.c.a.b;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			n

public class BottomNavigationView extends FrameLayout
{
	static class SavedState extends AbsSavedState
	{

		private void a(Parcel parcel, ClassLoader classloader)
		{
			a = parcel.readBundle(classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #36  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    4    6:putfield        #38  <Field Bundle a>
		//    5    9:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #38  <Field Bundle a>
		//    7   11:invokevirtual   #46  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method BottomNavigationView$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method BottomNavigationView$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method BottomNavigationView$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		Bundle a;

		static 
		{
		//    0    0:new             #9   <Class BottomNavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			a(parcel, classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #27  <Method void a(Parcel, ClassLoader)>
		//    8   12:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static interface a
	{

		public abstract void a(MenuItem menuitem);
	}

	public static interface b
	{

		public abstract boolean a(MenuItem menuitem);
	}


	public BottomNavigationView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #44  <Method void BottomNavigationView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #47  <Method void BottomNavigationView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #48  <Method void FrameLayout(Context, AttributeSet, int)>
		e = new BottomNavigationPresenter();
	//    5    7:aload_0         
	//    6    8:new             #50  <Class BottomNavigationPresenter>
	//    7   11:dup             
	//    8   12:invokespecial   #52  <Method void BottomNavigationPresenter()>
	//    9   15:putfield        #54  <Field BottomNavigationPresenter e>
		android.support.design.widget.n.a(context);
	//   10   18:aload_1         
	//   11   19:invokestatic    #58  <Method void android.support.design.widget.n.a(Context)>
		c = ((h) (new android.support.design.internal.a(context)));
	//   12   22:aload_0         
	//   13   23:new             #60  <Class a>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #62  <Method void a(Context)>
	//   17   31:putfield        #64  <Field h c>
		d = new BottomNavigationMenuView(context);
	//   18   34:aload_0         
	//   19   35:new             #66  <Class BottomNavigationMenuView>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #67  <Method void BottomNavigationMenuView(Context)>
	//   23   43:putfield        #69  <Field BottomNavigationMenuView d>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
	//   24   46:new             #71  <Class android.widget.FrameLayout$LayoutParams>
	//   25   49:dup             
	//   26   50:bipush          -2
	//   27   52:bipush          -2
	//   28   54:invokespecial   #74  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   29   57:astore          5
		layoutparams.gravity = 17;
	//   30   59:aload           5
	//   31   61:bipush          17
	//   32   63:putfield        #78  <Field int android.widget.FrameLayout$LayoutParams.gravity>
		d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   66:aload_0         
	//   34   67:getfield        #69  <Field BottomNavigationMenuView d>
	//   35   70:aload           5
	//   36   72:invokevirtual   #82  <Method void BottomNavigationMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		e.a(d);
	//   37   75:aload_0         
	//   38   76:getfield        #54  <Field BottomNavigationPresenter e>
	//   39   79:aload_0         
	//   40   80:getfield        #69  <Field BottomNavigationMenuView d>
	//   41   83:invokevirtual   #85  <Method void BottomNavigationPresenter.a(BottomNavigationMenuView)>
		e.a(1);
	//   42   86:aload_0         
	//   43   87:getfield        #54  <Field BottomNavigationPresenter e>
	//   44   90:iconst_1        
	//   45   91:invokevirtual   #88  <Method void BottomNavigationPresenter.a(int)>
		d.setPresenter(e);
	//   46   94:aload_0         
	//   47   95:getfield        #69  <Field BottomNavigationMenuView d>
	//   48   98:aload_0         
	//   49   99:getfield        #54  <Field BottomNavigationPresenter e>
	//   50  102:invokevirtual   #92  <Method void BottomNavigationMenuView.setPresenter(BottomNavigationPresenter)>
		c.a(((android.support.v7.view.menu.o) (e)));
	//   51  105:aload_0         
	//   52  106:getfield        #64  <Field h c>
	//   53  109:aload_0         
	//   54  110:getfield        #54  <Field BottomNavigationPresenter e>
	//   55  113:invokevirtual   #97  <Method void h.a(android.support.v7.view.menu.o)>
		e.a(getContext(), c);
	//   56  116:aload_0         
	//   57  117:getfield        #54  <Field BottomNavigationPresenter e>
	//   58  120:aload_0         
	//   59  121:invokevirtual   #101 <Method Context getContext()>
	//   60  124:aload_0         
	//   61  125:getfield        #64  <Field h c>
	//   62  128:invokevirtual   #104 <Method void BottomNavigationPresenter.a(Context, h)>
		av av1 = av.a(context, attributeset, android.support.design.a.k.BottomNavigationView, i, android.support.design.a.j.Widget_Design_BottomNavigationView);
	//   63  131:aload_1         
	//   64  132:aload_2         
	//   65  133:getstatic       #109 <Field int[] android.support.design.a$k.BottomNavigationView>
	//   66  136:iload_3         
	//   67  137:getstatic       #114 <Field int android.support.design.a$j.Widget_Design_BottomNavigationView>
	//   68  140:invokestatic    #119 <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   69  143:astore          6
		BottomNavigationMenuView bottomnavigationmenuview;
		if(av1.g(android.support.design.a.k.BottomNavigationView_itemIconTint))
	//*  70  145:aload           6
	//*  71  147:getstatic       #122 <Field int android.support.design.a$k.BottomNavigationView_itemIconTint>
	//*  72  150:invokevirtual   #125 <Method boolean av.g(int)>
	//*  73  153:ifeq            180
		{
			bottomnavigationmenuview = d;
	//   74  156:aload_0         
	//   75  157:getfield        #69  <Field BottomNavigationMenuView d>
	//   76  160:astore          4
			attributeset = ((AttributeSet) (av1.e(android.support.design.a.k.BottomNavigationView_itemIconTint)));
	//   77  162:aload           6
	//   78  164:getstatic       #122 <Field int android.support.design.a$k.BottomNavigationView_itemIconTint>
	//   79  167:invokevirtual   #128 <Method ColorStateList av.e(int)>
	//   80  170:astore_2        
		} else
	//*  81  171:aload           4
	//*  82  173:aload_2         
	//*  83  174:invokevirtual   #132 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
	//*  84  177:goto            196
		{
			bottomnavigationmenuview = d;
	//   85  180:aload_0         
	//   86  181:getfield        #69  <Field BottomNavigationMenuView d>
	//   87  184:astore          4
			attributeset = ((AttributeSet) (b(0x1010038)));
	//   88  186:aload_0         
	//   89  187:ldc1            #133 <Int 0x1010038>
	//   90  189:invokespecial   #135 <Method ColorStateList b(int)>
	//   91  192:astore_2        
		}
		bottomnavigationmenuview.setIconTintList(((ColorStateList) (attributeset)));
	//*  92  193:goto            171
		if(av1.g(android.support.design.a.k.BottomNavigationView_itemTextColor))
	//*  93  196:aload           6
	//*  94  198:getstatic       #138 <Field int android.support.design.a$k.BottomNavigationView_itemTextColor>
	//*  95  201:invokevirtual   #125 <Method boolean av.g(int)>
	//*  96  204:ifeq            231
		{
			bottomnavigationmenuview = d;
	//   97  207:aload_0         
	//   98  208:getfield        #69  <Field BottomNavigationMenuView d>
	//   99  211:astore          4
			attributeset = ((AttributeSet) (av1.e(android.support.design.a.k.BottomNavigationView_itemTextColor)));
	//  100  213:aload           6
	//  101  215:getstatic       #138 <Field int android.support.design.a$k.BottomNavigationView_itemTextColor>
	//  102  218:invokevirtual   #128 <Method ColorStateList av.e(int)>
	//  103  221:astore_2        
		} else
	//* 104  222:aload           4
	//* 105  224:aload_2         
	//* 106  225:invokevirtual   #141 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
	//* 107  228:goto            247
		{
			bottomnavigationmenuview = d;
	//  108  231:aload_0         
	//  109  232:getfield        #69  <Field BottomNavigationMenuView d>
	//  110  235:astore          4
			attributeset = ((AttributeSet) (b(0x1010038)));
	//  111  237:aload_0         
	//  112  238:ldc1            #133 <Int 0x1010038>
	//  113  240:invokespecial   #135 <Method ColorStateList b(int)>
	//  114  243:astore_2        
		}
		bottomnavigationmenuview.setItemTextColor(((ColorStateList) (attributeset)));
	//* 115  244:goto            222
		if(av1.g(android.support.design.a.k.BottomNavigationView_elevation))
	//* 116  247:aload           6
	//* 117  249:getstatic       #144 <Field int android.support.design.a$k.BottomNavigationView_elevation>
	//* 118  252:invokevirtual   #125 <Method boolean av.g(int)>
	//* 119  255:ifeq            272
			s.a(((View) (this)), av1.e(android.support.design.a.k.BottomNavigationView_elevation, 0));
	//  120  258:aload_0         
	//  121  259:aload           6
	//  122  261:getstatic       #144 <Field int android.support.design.a$k.BottomNavigationView_elevation>
	//  123  264:iconst_0        
	//  124  265:invokevirtual   #147 <Method int av.e(int, int)>
	//  125  268:i2f             
	//  126  269:invokestatic    #152 <Method void s.a(View, float)>
		i = av1.g(android.support.design.a.k.BottomNavigationView_itemBackground, 0);
	//  127  272:aload           6
	//  128  274:getstatic       #155 <Field int android.support.design.a$k.BottomNavigationView_itemBackground>
	//  129  277:iconst_0        
	//  130  278:invokevirtual   #157 <Method int av.g(int, int)>
	//  131  281:istore_3        
		d.setItemBackgroundRes(i);
	//  132  282:aload_0         
	//  133  283:getfield        #69  <Field BottomNavigationMenuView d>
	//  134  286:iload_3         
	//  135  287:invokevirtual   #160 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
		if(av1.g(android.support.design.a.k.BottomNavigationView_menu))
	//* 136  290:aload           6
	//* 137  292:getstatic       #163 <Field int android.support.design.a$k.BottomNavigationView_menu>
	//* 138  295:invokevirtual   #125 <Method boolean av.g(int)>
	//* 139  298:ifeq            314
			a(av1.g(android.support.design.a.k.BottomNavigationView_menu, 0));
	//  140  301:aload_0         
	//  141  302:aload           6
	//  142  304:getstatic       #163 <Field int android.support.design.a$k.BottomNavigationView_menu>
	//  143  307:iconst_0        
	//  144  308:invokevirtual   #157 <Method int av.g(int, int)>
	//  145  311:invokevirtual   #164 <Method void a(int)>
		av1.a();
	//  146  314:aload           6
	//  147  316:invokevirtual   #166 <Method void av.a()>
		addView(((View) (d)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  148  319:aload_0         
	//  149  320:aload_0         
	//  150  321:getfield        #69  <Field BottomNavigationMenuView d>
	//  151  324:aload           5
	//  152  326:invokevirtual   #170 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 153  329:getstatic       #175 <Field int android.os.Build$VERSION.SDK_INT>
	//* 154  332:bipush          21
	//* 155  334:icmpge          342
			a(context);
	//  156  337:aload_0         
	//  157  338:aload_1         
	//  158  339:invokespecial   #176 <Method void a(Context)>
		c.a(new android.support.v7.view.menu.h.a() {

			public void a(h h1)
			{
			//    0    0:return          
			}

			public boolean a(h h1, MenuItem menuitem)
			{
				if(android.support.design.widget.BottomNavigationView.a(a) != null && menuitem.getItemId() == a.getSelectedItemId())
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field BottomNavigationView a>
			//*   2    4:invokestatic    #25  <Method BottomNavigationView$a android.support.design.widget.BottomNavigationView.a(BottomNavigationView)>
			//*   3    7:ifnull          41
			//*   4   10:aload_2         
			//*   5   11:invokeinterface #31  <Method int MenuItem.getItemId()>
			//*   6   16:aload_0         
			//*   7   17:getfield        #16  <Field BottomNavigationView a>
			//*   8   20:invokevirtual   #34  <Method int BottomNavigationView.getSelectedItemId()>
			//*   9   23:icmpne          41
				{
					android.support.design.widget.BottomNavigationView.a(a).a(menuitem);
			//   10   26:aload_0         
			//   11   27:getfield        #16  <Field BottomNavigationView a>
			//   12   30:invokestatic    #25  <Method BottomNavigationView$a android.support.design.widget.BottomNavigationView.a(BottomNavigationView)>
			//   13   33:aload_2         
			//   14   34:invokeinterface #39  <Method void android.support.design.widget.BottomNavigationView$a.a(MenuItem)>
					return true;
			//   15   39:iconst_1        
			//   16   40:ireturn         
				}
				return android.support.design.widget.BottomNavigationView.b(a) != null && !android.support.design.widget.BottomNavigationView.b(a).a(menuitem);
			//   17   41:aload_0         
			//   18   42:getfield        #16  <Field BottomNavigationView a>
			//   19   45:invokestatic    #43  <Method BottomNavigationView$b android.support.design.widget.BottomNavigationView.b(BottomNavigationView)>
			//   20   48:ifnull          69
			//   21   51:aload_0         
			//   22   52:getfield        #16  <Field BottomNavigationView a>
			//   23   55:invokestatic    #43  <Method BottomNavigationView$b android.support.design.widget.BottomNavigationView.b(BottomNavigationView)>
			//   24   58:aload_2         
			//   25   59:invokeinterface #48  <Method boolean android.support.design.widget.BottomNavigationView$b.a(MenuItem)>
			//   26   64:ifne            69
			//   27   67:iconst_1        
			//   28   68:ireturn         
			//   29   69:iconst_0        
			//   30   70:ireturn         
			}

			final BottomNavigationView a;

			
			{
				a = BottomNavigationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  159  342:aload_0         
	//  160  343:getfield        #64  <Field h c>
	//  161  346:new             #6   <Class BottomNavigationView$1>
	//  162  349:dup             
	//  163  350:aload_0         
	//  164  351:invokespecial   #179 <Method void BottomNavigationView$1(BottomNavigationView)>
	//  165  354:invokevirtual   #182 <Method void h.a(android.support.v7.view.menu.h$a)>
	//  166  357:return          
	}

	static a a(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.h;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field BottomNavigationView$a h>
	//    2    4:areturn         
	}

	private void a(Context context)
	{
		View view = new View(context);
	//    0    0:new             #187 <Class View>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #188 <Method void View(Context)>
	//    4    8:astore_2        
		view.setBackgroundColor(android.support.v4.content.a.getColor(context, android.support.design.a.c.design_bottom_navigation_shadow_color));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getstatic       #193 <Field int android.support.design.a$c.design_bottom_navigation_shadow_color>
	//    8   14:invokestatic    #199 <Method int android.support.v4.content.a.getColor(Context, int)>
	//    9   17:invokevirtual   #202 <Method void View.setBackgroundColor(int)>
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_shadow_height)))));
	//   10   20:aload_2         
	//   11   21:new             #71  <Class android.widget.FrameLayout$LayoutParams>
	//   12   24:dup             
	//   13   25:iconst_m1       
	//   14   26:aload_0         
	//   15   27:invokevirtual   #206 <Method Resources getResources()>
	//   16   30:getstatic       #211 <Field int android.support.design.a$d.design_bottom_navigation_shadow_height>
	//   17   33:invokevirtual   #217 <Method int Resources.getDimensionPixelSize(int)>
	//   18   36:invokespecial   #74  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   19   39:invokevirtual   #218 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(view);
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #221 <Method void addView(View)>
	//   23   47:return          
	}

	private ColorStateList b(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #223 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #101 <Method Context getContext()>
	//*   6   13:invokevirtual   #230 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #236 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = android.support.v7.c.a.b.a(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #101 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #239 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #244 <Method ColorStateList b.a(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.a.a.a.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #101 <Method Context getContext()>
	//*  22   46:invokevirtual   #230 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #249 <Field int android.support.v7.a.a$a.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #236 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			i = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #252 <Field int TypedValue.data>
	//   32   68:istore_1        
			int j = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #258 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = b;
	//   36   75:getstatic       #38  <Field int[] b>
	//   37   78:astore          5
			int ai1[] = a;
	//   38   80:getstatic       #35  <Field int[] a>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #261 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int k = colorstatelist.getColorForState(b, j);
	//   42   90:aload           4
	//   43   92:getstatic       #38  <Field int[] b>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #265 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				k, i, j
			});
	//   47  100:new             #254 <Class ColorStateList>
	//   48  103:dup             
	//   49  104:iconst_3        
	//   50  105:anewarray       int[][]
	//   51  108:dup             
	//   52  109:iconst_0        
	//   53  110:aload           5
	//   54  112:aastore         
	//   55  113:dup             
	//   56  114:iconst_1        
	//   57  115:aload           6
	//   58  117:aastore         
	//   59  118:dup             
	//   60  119:iconst_2        
	//   61  120:aload           7
	//   62  122:aastore         
	//   63  123:iconst_3        
	//   64  124:newarray        int[]
	//   65  126:dup             
	//   66  127:iconst_0        
	//   67  128:iload_3         
	//   68  129:iastore         
	//   69  130:dup             
	//   70  131:iconst_1        
	//   71  132:iload_1         
	//   72  133:iastore         
	//   73  134:dup             
	//   74  135:iconst_2        
	//   75  136:iload_2         
	//   76  137:iastore         
	//   77  138:invokespecial   #269 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	static b b(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.g;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field BottomNavigationView$b g>
	//    2    4:areturn         
	}

	private MenuInflater getMenuInflater()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field MenuInflater f>
	//*   2    4:ifnonnull       22
			f = ((MenuInflater) (new g(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #278 <Class g>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #101 <Method Context getContext()>
	//    8   16:invokespecial   #279 <Method void g(Context)>
	//    9   19:putfield        #276 <Field MenuInflater f>
		return f;
	//   10   22:aload_0         
	//   11   23:getfield        #276 <Field MenuInflater f>
	//   12   26:areturn         
	}

	public void a(int i)
	{
		e.b(true);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field BottomNavigationPresenter e>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #282 <Method void BottomNavigationPresenter.b(boolean)>
		getMenuInflater().inflate(i, ((Menu) (c)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #284 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field h c>
	//    9   17:invokevirtual   #290 <Method void MenuInflater.inflate(int, Menu)>
		e.b(false);
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field BottomNavigationPresenter e>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #282 <Method void BottomNavigationPresenter.b(boolean)>
		e.a(true);
	//   14   28:aload_0         
	//   15   29:getfield        #54  <Field BottomNavigationPresenter e>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #292 <Method void BottomNavigationPresenter.a(boolean)>
	//   18   36:return          
	}

	public int getItemBackgroundResource()
	{
		return d.getItemBackgroundRes();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:invokevirtual   #296 <Method int BottomNavigationMenuView.getItemBackgroundRes()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return d.getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:invokevirtual   #301 <Method ColorStateList BottomNavigationMenuView.getIconTintList()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return d.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:invokevirtual   #304 <Method ColorStateList BottomNavigationMenuView.getItemTextColor()>
	//    3    7:areturn         
	}

	public int getMaxItemCount()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field h c>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return d.getSelectedItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:invokevirtual   #310 <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    3    7:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class BottomNavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #314 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class BottomNavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #317 <Method Parcelable android.support.design.widget.BottomNavigationView$SavedState.a()>
	//   13   23:invokespecial   #314 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			c.b(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field h c>
	//   16   30:aload_1         
	//   17   31:getfield        #320 <Field Bundle android.support.design.widget.BottomNavigationView$SavedState.a>
	//   18   34:invokevirtual   #323 <Method void h.b(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #8   <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #326 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #328 <Method void BottomNavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #330 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #331 <Method void Bundle()>
	//   10   20:putfield        #320 <Field Bundle android.support.design.widget.BottomNavigationView$SavedState.a>
		c.a(savedstate.a);
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field h c>
	//   13   27:aload_1         
	//   14   28:getfield        #320 <Field Bundle android.support.design.widget.BottomNavigationView$SavedState.a>
	//   15   31:invokevirtual   #333 <Method void h.a(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setItemBackgroundResource(int i)
	{
		d.setItemBackgroundRes(i);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #160 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
	//    4    8:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		d.setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		d.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field BottomNavigationMenuView d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setOnNavigationItemReselectedListener(a a1)
	{
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #185 <Field BottomNavigationView$a h>
	//    3    5:return          
	}

	public void setOnNavigationItemSelectedListener(b b1)
	{
		g = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #272 <Field BottomNavigationView$b g>
	//    3    5:return          
	}

	public void setSelectedItemId(int i)
	{
		MenuItem menuitem = c.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field h c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #344 <Method MenuItem h.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null && !c.a(menuitem, ((android.support.v7.view.menu.o) (e)), 0))
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_0         
	//*   8   14:getfield        #64  <Field h c>
	//*   9   17:aload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #54  <Field BottomNavigationPresenter e>
	//*  12   22:iconst_0        
	//*  13   23:invokevirtual   #347 <Method boolean h.a(MenuItem, android.support.v7.view.menu.o, int)>
	//*  14   26:ifne            37
			menuitem.setChecked(true);
	//   15   29:aload_2         
	//   16   30:iconst_1        
	//   17   31:invokeinterface #353 <Method MenuItem MenuItem.setChecked(boolean)>
	//   18   36:pop             
	//   19   37:return          
	}

	private static final int a[] = {
		0x10100a0
	};
	private static final int b[] = {
		0xfefeff62
	};
	private final h c;
	private final BottomNavigationMenuView d;
	private final BottomNavigationPresenter e;
	private MenuInflater f;
	private b g;
	private a h;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #33  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #35  <Field int[] a>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #36  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #38  <Field int[] b>
	//*  14   22:return          
	}
}
