// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.*;
import android.support.v4.a.c;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.*;

// Referenced classes of package android.support.design.widget:
//			bo

public class NavigationView extends t
{

	private MenuInflater getMenuInflater()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field MenuInflater i>
	//*   2    4:ifnonnull       22
			i = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #32  <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #36  <Method android.content.Context getContext()>
	//    8   16:invokespecial   #40  <Method void SupportMenuInflater(android.content.Context)>
	//    9   19:putfield        #30  <Field MenuInflater i>
		return i;
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field MenuInflater i>
	//   12   26:areturn         
	}

	public MenuItem getCheckedItem()
	{
		return ((MenuItem) (g.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #50  <Method MenuItemImpl g.a()>
	//    3    7:areturn         
	}

	public int getHeaderCount()
	{
		return g.b();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #55  <Method int g.b()>
	//    3    7:ireturn         
	}

	public Drawable getItemBackground()
	{
		return g.e();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #59  <Method Drawable g.e()>
	//    3    7:areturn         
	}

	public int getItemHorizontalPadding()
	{
		return g.f();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #62  <Method int g.f()>
	//    3    7:ireturn         
	}

	public int getItemIconPadding()
	{
		return g.g();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #65  <Method int g.g()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return g.c();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #69  <Method ColorStateList g.c()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return g.d();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:invokevirtual   #72  <Method ColorStateList g.d()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field e f>
	//    2    4:areturn         
	}

	protected void onMeasure(int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #84  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		if(l != 0x80000000)
	//*   3    5:iload_3         
	//*   4    6:ldc1            #85  <Int 0x80000000>
	//*   5    8:icmpeq          31
		{
			if(l == 0)
	//*   6   11:iload_3         
	//*   7   12:ifeq            18
	//*   8   15:goto            48
				j = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
	//    9   18:aload_0         
	//   10   19:getfield        #87  <Field int h>
	//   11   22:ldc1            #88  <Int 0x40000000>
	//   12   24:invokestatic    #92  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   27:istore_1        
		} else
	//*  14   28:goto            48
		{
			j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(j), h), 0x40000000);
	//   15   31:iload_1         
	//   16   32:invokestatic    #95  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   35:aload_0         
	//   18   36:getfield        #87  <Field int h>
	//   19   39:invokestatic    #100 <Method int Math.min(int, int)>
	//   20   42:ldc1            #88  <Int 0x40000000>
	//   21   44:invokestatic    #92  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   47:istore_1        
		}
		super.onMeasure(j, k);
	//   23   48:aload_0         
	//   24   49:iload_1         
	//   25   50:iload_2         
	//   26   51:invokespecial   #102 <Method void t.onMeasure(int, int)>
	//   27   54:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #106 <Class NavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #108 <Method void t.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #106 <Class NavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #112 <Method Parcelable NavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #108 <Method void t.onRestoreInstanceState(Parcelable)>
			f.b(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:getfield        #76  <Field e f>
	//   16   30:aload_1         
	//   17   31:getfield        #115 <Field Bundle NavigationView$SavedState.a>
	//   18   34:invokevirtual   #120 <Method void e.b(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #106 <Class NavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #123 <Method Parcelable t.onSaveInstanceState()>
	//    4    8:invokespecial   #125 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #127 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #129 <Method void Bundle()>
	//   10   20:putfield        #115 <Field Bundle NavigationView$SavedState.a>
		f.a(savedstate.a);
	//   11   23:aload_0         
	//   12   24:getfield        #76  <Field e f>
	//   13   27:aload_1         
	//   14   28:getfield        #115 <Field Bundle NavigationView$SavedState.a>
	//   15   31:invokevirtual   #131 <Method void e.a(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setCheckedItem(int j)
	{
		MenuItem menuitem = f.findItem(j);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field e f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #137 <Method MenuItem e.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			g.a((MenuItemImpl)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field g g>
	//    9   17:aload_2         
	//   10   18:checkcast       #139 <Class MenuItemImpl>
	//   11   21:invokevirtual   #142 <Method void g.a(MenuItemImpl)>
	//   12   24:return          
	}

	public void setCheckedItem(MenuItem menuitem)
	{
		menuitem = f.findItem(menuitem.getItemId());
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field e f>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method int MenuItem.getItemId()>
	//    4   10:invokevirtual   #137 <Method MenuItem e.findItem(int)>
	//    5   13:astore_1        
		if(menuitem != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          30
		{
			g.a((MenuItemImpl)menuitem);
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field g g>
	//   10   22:aload_1         
	//   11   23:checkcast       #139 <Class MenuItemImpl>
	//   12   26:invokevirtual   #142 <Method void g.a(MenuItemImpl)>
			return;
	//   13   29:return          
		} else
		{
			throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
	//   14   30:new             #150 <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc1            #152 <String "Called setCheckedItem(MenuItem) with an item that is not in the current menu.">
	//   17   36:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
		}
	}

	public void setItemBackground(Drawable drawable)
	{
		g.a(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method void g.a(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int j)
	{
		setItemBackground(android.support.v4.a.c.a(getContext(), j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #36  <Method android.content.Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #165 <Method Drawable c.a(android.content.Context, int)>
	//    5    9:invokevirtual   #167 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemHorizontalPadding(int j)
	{
		g.b(j);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #170 <Method void g.b(int)>
	//    4    8:return          
	}

	public void setItemHorizontalPaddingResource(int j)
	{
		g.b(getResources().getDimensionPixelSize(j));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #175 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #180 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #170 <Method void g.b(int)>
	//    7   15:return          
	}

	public void setItemIconPadding(int j)
	{
		g.c(j);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #183 <Method void g.c(int)>
	//    4    8:return          
	}

	public void setItemIconPaddingResource(int j)
	{
		g.c(getResources().getDimensionPixelSize(j));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #175 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #180 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #183 <Method void g.c(int)>
	//    7   15:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		g.a(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method void g.a(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int j)
	{
		g.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #191 <Method void g.a(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		g.b(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #194 <Method void g.b(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(bo bo)
	{
		c = bo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #198 <Field bo c>
	//    3    5:return          
	}

	private static final int d[] = {
		0x10100a0
	};
	private static final int e[] = {
		0xfefeff62
	};
	bo c;
	private final e f;
	private final g g;
	private final int h;
	private MenuInflater i;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #20  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #22  <Field int[] d>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #23  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #25  <Field int[] e>
	//*  14   22:return          
	}

	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int j)
		{
			super.writeToParcel(parcel, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #29  <Field Bundle a>
		//    7   11:invokevirtual   #40  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new bp();
		public Bundle a;

		static 
		{
		//    0    0:new             #12  <Class bp>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bp()>
		//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readBundle(classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #27  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    8   12:putfield        #29  <Field Bundle a>
		//    9   15:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #32  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
