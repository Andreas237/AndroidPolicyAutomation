// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.b;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			v, u

public class BottomNavigationView extends FrameLayout
{

	private MenuInflater getMenuInflater()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MenuInflater d>
	//*   2    4:ifnonnull       22
			d = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #22  <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method android.content.Context getContext()>
	//    8   16:invokespecial   #30  <Method void SupportMenuInflater(android.content.Context)>
	//    9   19:putfield        #20  <Field MenuInflater d>
		return d;
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field MenuInflater d>
	//   12   26:areturn         
	}

	public Drawable getItemBackground()
	{
		return b.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #39  <Method Drawable b.getItemBackground()>
	//    3    7:areturn         
	}

	public int getItemBackgroundResource()
	{
		return b.getItemBackgroundRes();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #45  <Method int b.getItemBackgroundRes()>
	//    3    7:ireturn         
	}

	public int getItemIconSize()
	{
		return b.getItemIconSize();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #49  <Method int b.getItemIconSize()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return b.getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #54  <Method ColorStateList b.getIconTintList()>
	//    3    7:areturn         
	}

	public int getItemTextAppearanceActive()
	{
		return b.getItemTextAppearanceActive();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #57  <Method int b.getItemTextAppearanceActive()>
	//    3    7:ireturn         
	}

	public int getItemTextAppearanceInactive()
	{
		return b.getItemTextAppearanceInactive();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #60  <Method int b.getItemTextAppearanceInactive()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return b.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #63  <Method ColorStateList b.getItemTextColor()>
	//    3    7:areturn         
	}

	public int getLabelVisibilityMode()
	{
		return b.getLabelVisibilityMode();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #66  <Method int b.getLabelVisibilityMode()>
	//    3    7:ireturn         
	}

	public int getMaxItemCount()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MenuBuilder a>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return b.getSelectedItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:invokevirtual   #74  <Method int b.getSelectedItemId()>
	//    3    7:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #78  <Class BottomNavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #80  <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #78  <Class BottomNavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #84  <Method Parcelable BottomNavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #80  <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			a.b(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:getfield        #71  <Field MenuBuilder a>
	//   16   30:aload_1         
	//   17   31:getfield        #87  <Field Bundle BottomNavigationView$SavedState.a>
	//   18   34:invokevirtual   #92  <Method void MenuBuilder.b(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #78  <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #95  <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #97  <Method void BottomNavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #99  <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #102 <Method void Bundle()>
	//   10   20:putfield        #87  <Field Bundle BottomNavigationView$SavedState.a>
		a.a(savedstate.a);
	//   11   23:aload_0         
	//   12   24:getfield        #71  <Field MenuBuilder a>
	//   13   27:aload_1         
	//   14   28:getfield        #87  <Field Bundle BottomNavigationView$SavedState.a>
	//   15   31:invokevirtual   #104 <Method void MenuBuilder.a(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setItemBackground(Drawable drawable)
	{
		b.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #108 <Method void b.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		b.setItemBackgroundRes(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #113 <Method void b.setItemBackgroundRes(int)>
	//    4    8:return          
	}

	public void setItemHorizontalTranslationEnabled(boolean flag)
	{
		if(b.a() != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field b b>
	//*   2    4:invokevirtual   #118 <Method boolean b.a()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			b.setItemHorizontalTranslationEnabled(flag);
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field b b>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #120 <Method void b.setItemHorizontalTranslationEnabled(boolean)>
			c.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #122 <Field BottomNavigationPresenter c>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #127 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setItemIconSize(int i)
	{
		b.setItemIconSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #130 <Method void b.setItemIconSize(int)>
	//    4    8:return          
	}

	public void setItemIconSizeRes(int i)
	{
		setItemIconSize(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #135 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #141 <Method int Resources.getDimensionPixelSize(int)>
	//    5    9:invokevirtual   #142 <Method void setItemIconSize(int)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		b.setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method void b.setIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearanceActive(int i)
	{
		b.setItemTextAppearanceActive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #150 <Method void b.setItemTextAppearanceActive(int)>
	//    4    8:return          
	}

	public void setItemTextAppearanceInactive(int i)
	{
		b.setItemTextAppearanceInactive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #153 <Method void b.setItemTextAppearanceInactive(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		b.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method void b.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setLabelVisibilityMode(int i)
	{
		if(b.getLabelVisibilityMode() != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field b b>
	//*   2    4:invokevirtual   #66  <Method int b.getLabelVisibilityMode()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			b.setLabelVisibilityMode(i);
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field b b>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #159 <Method void b.setLabelVisibilityMode(int)>
			c.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #122 <Field BottomNavigationPresenter c>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #127 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setOnNavigationItemReselectedListener(u u)
	{
		f = u;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field u f>
	//    3    5:return          
	}

	public void setOnNavigationItemSelectedListener(v v)
	{
		e = v;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field v e>
	//    3    5:return          
	}

	public void setSelectedItemId(int i)
	{
		MenuItem menuitem = a.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MenuBuilder a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #172 <Method MenuItem MenuBuilder.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null && !a.a(menuitem, ((android.support.v7.view.menu.MenuPresenter) (c)), 0))
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_0         
	//*   8   14:getfield        #71  <Field MenuBuilder a>
	//*   9   17:aload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #122 <Field BottomNavigationPresenter c>
	//*  12   22:iconst_0        
	//*  13   23:invokevirtual   #175 <Method boolean MenuBuilder.a(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//*  14   26:ifne            37
			menuitem.setChecked(true);
	//   15   29:aload_2         
	//   16   30:iconst_1        
	//   17   31:invokeinterface #181 <Method MenuItem MenuItem.setChecked(boolean)>
	//   18   36:pop             
	//   19   37:return          
	}

	private final MenuBuilder a;
	private final b b;
	private final BottomNavigationPresenter c;
	private MenuInflater d;
	private v e;
	private u f;

	private class SavedState extends AbsSavedState
	{

		private void a(Parcel parcel, ClassLoader classloader)
		{
			a = parcel.readBundle(classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    4    6:putfield        #34  <Field Bundle a>
		//    5    9:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #38  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #34  <Field Bundle a>
		//    7   11:invokevirtual   #42  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new w();
		Bundle a;

		static 
		{
		//    0    0:new             #12  <Class w>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void w()>
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
			a(parcel, classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #23  <Method void a(Parcel, ClassLoader)>
		//    8   12:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
