// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.*;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.menu.*;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

protected static final class AppCompatDelegateImplV9$PanelFeatureState
{
	private static class SavedState
		implements Parcelable
	{

		static SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			SavedState savedstate = new SavedState();
		//    2    2:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    3    5:dup             
		//    4    6:invokespecial   #35  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
		//    5    9:astore_3        
			savedstate.featureId = parcel.readInt();
		//    6   10:aload_3         
		//    7   11:aload_0         
		//    8   12:invokevirtual   #41  <Method int Parcel.readInt()>
		//    9   15:putfield        #43  <Field int featureId>
			if(parcel.readInt() != 1)
		//*  10   18:aload_0         
		//*  11   19:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  12   22:iconst_1        
		//*  13   23:icmpne          49
		//*  14   26:aload_3         
		//*  15   27:iload_2         
		//*  16   28:putfield        #45  <Field boolean isOpen>
		//*  17   31:aload_3         
		//*  18   32:getfield        #45  <Field boolean isOpen>
		//*  19   35:ifeq            47
		//*  20   38:aload_3         
		//*  21   39:aload_0         
		//*  22   40:aload_1         
		//*  23   41:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
		//*  24   44:putfield        #51  <Field Bundle menuState>
		//*  25   47:aload_3         
		//*  26   48:areturn         
				flag = false;
		//   27   49:iconst_0        
		//   28   50:istore_2        
			savedstate.isOpen = flag;
			if(savedstate.isOpen)
				savedstate.menuState = parcel.readBundle(classloader);
			return savedstate;
		//*  29   51:goto            26
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(featureId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #43  <Field int featureId>
		//    3    5:invokevirtual   #58  <Method void Parcel.writeInt(int)>
			if(isOpen)
		//*   4    8:aload_0         
		//*   5    9:getfield        #45  <Field boolean isOpen>
		//*   6   12:ifeq            38
				i = 1;
		//    7   15:iconst_1        
		//    8   16:istore_2        
			else
		//*   9   17:aload_1         
		//*  10   18:iload_2         
		//*  11   19:invokevirtual   #58  <Method void Parcel.writeInt(int)>
		//*  12   22:aload_0         
		//*  13   23:getfield        #45  <Field boolean isOpen>
		//*  14   26:ifeq            37
		//*  15   29:aload_1         
		//*  16   30:aload_0         
		//*  17   31:getfield        #51  <Field Bundle menuState>
		//*  18   34:invokevirtual   #62  <Method void Parcel.writeBundle(Bundle)>
		//*  19   37:return          
				i = 0;
		//   20   38:iconst_0        
		//   21   39:istore_2        
			parcel.writeInt(i);
			if(isOpen)
				parcel.writeBundle(menuState);
		//*  22   40:goto            17
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
			//    0    0:aload_1         
			//    1    1:aconst_null     
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return SavedState.readFromParcel(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #37  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int featureId;
		boolean isOpen;
		Bundle menuState;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
		//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}
	}


	void applyFrozenState()
	{
		if(menu != null && frozenMenuState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field MenuBuilder menu>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field Bundle frozenMenuState>
	//*   5   11:ifnull          30
		{
			menu.restorePresenterStates(frozenMenuState);
	//    6   14:aload_0         
	//    7   15:getfield        #54  <Field MenuBuilder menu>
	//    8   18:aload_0         
	//    9   19:getfield        #56  <Field Bundle frozenMenuState>
	//   10   22:invokevirtual   #62  <Method void MenuBuilder.restorePresenterStates(Bundle)>
			frozenMenuState = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #56  <Field Bundle frozenMenuState>
		}
	//   14   30:return          
	}

	public void clearMenuPresenters()
	{
		if(menu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field MenuBuilder menu>
	//*   2    4:ifnull          18
			menu.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field MenuBuilder menu>
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//    7   15:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		listMenuPresenter = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   11   23:return          
	}

	MenuView getListMenuView(android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		if(menu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field MenuBuilder menu>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(listMenuPresenter == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//*   7   13:ifnonnull       53
		{
			listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
	//    8   16:aload_0         
	//    9   17:new             #73  <Class ListMenuPresenter>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #75  <Field Context listPresenterContext>
	//   13   25:getstatic       #80  <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
	//   14   28:invokespecial   #83  <Method void ListMenuPresenter(Context, int)>
	//   15   31:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
			listMenuPresenter.setCallback(callback);
	//   16   34:aload_0         
	//   17   35:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #87  <Method void ListMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			menu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//   20   42:aload_0         
	//   21   43:getfield        #54  <Field MenuBuilder menu>
	//   22   46:aload_0         
	//   23   47:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   24   50:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		}
		return listMenuPresenter.getMenuView(decorView);
	//   25   53:aload_0         
	//   26   54:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   27   57:aload_0         
	//   28   58:getfield        #92  <Field ViewGroup decorView>
	//   29   61:invokevirtual   #96  <Method MenuView ListMenuPresenter.getMenuView(ViewGroup)>
	//   30   64:areturn         
	}

	public boolean hasPanelItems()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag;
		if(shownPanelView == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #100 <Field View shownPanelView>
	//*   4    6:ifnonnull       13
		{
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		} else
	//*   7   11:iload_1         
	//*   8   12:ireturn         
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(createdPanelView == null)
	//*  11   15:aload_0         
	//*  12   16:getfield        #102 <Field View createdPanelView>
	//*  13   19:ifnonnull       11
			{
				flag = flag1;
	//   14   22:iload_2         
	//   15   23:istore_1        
				if(listMenuPresenter.getAdapter().getCount() <= 0)
	//*  16   24:aload_0         
	//*  17   25:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//*  18   28:invokevirtual   #106 <Method ListAdapter ListMenuPresenter.getAdapter()>
	//*  19   31:invokeinterface #112 <Method int ListAdapter.getCount()>
	//*  20   36:ifgt            11
					return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
			}
		}
		return flag;
	}

	void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #9   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
	//    2    4:astore_1        
		featureId = ((SavedState) (parcelable)).featureId;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #115 <Field int AppCompatDelegateImplV9$PanelFeatureState$SavedState.featureId>
	//    6   10:putfield        #48  <Field int featureId>
		wasLastOpen = ((SavedState) (parcelable)).isOpen;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #117 <Field boolean AppCompatDelegateImplV9$PanelFeatureState$SavedState.isOpen>
	//   10   18:putfield        #119 <Field boolean wasLastOpen>
		frozenMenuState = ((SavedState) (parcelable)).menuState;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
	//   14   26:putfield        #56  <Field Bundle frozenMenuState>
		shownPanelView = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #100 <Field View shownPanelView>
		decorView = null;
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:putfield        #92  <Field ViewGroup decorView>
	//   21   39:return          
	}

	Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #9   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
	//    3    7:astore_1        
		savedstate.featureId = featureId;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int featureId>
	//    7   13:putfield        #115 <Field int AppCompatDelegateImplV9$PanelFeatureState$SavedState.featureId>
		savedstate.isOpen = isOpen;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #126 <Field boolean isOpen>
	//   11   21:putfield        #117 <Field boolean AppCompatDelegateImplV9$PanelFeatureState$SavedState.isOpen>
		if(menu != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #54  <Field MenuBuilder menu>
	//*  14   28:ifnull          53
		{
			savedstate.menuState = new Bundle();
	//   15   31:aload_1         
	//   16   32:new             #128 <Class Bundle>
	//   17   35:dup             
	//   18   36:invokespecial   #129 <Method void Bundle()>
	//   19   39:putfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
			menu.savePresenterStates(savedstate.menuState);
	//   20   42:aload_0         
	//   21   43:getfield        #54  <Field MenuBuilder menu>
	//   22   46:aload_1         
	//   23   47:getfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
	//   24   50:invokevirtual   #132 <Method void MenuBuilder.savePresenterStates(Bundle)>
		}
		return ((Parcelable) (savedstate));
	//   25   53:aload_1         
	//   26   54:areturn         
	}

	void setMenu(MenuBuilder menubuilder)
	{
		if(menubuilder != menu)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #54  <Field MenuBuilder menu>
	//*   3    5:if_acmpne       9
	//*   4    8:return          
		{
			if(menu != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #54  <Field MenuBuilder menu>
	//*   7   13:ifnull          27
				menu.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//    8   16:aload_0         
	//    9   17:getfield        #54  <Field MenuBuilder menu>
	//   10   20:aload_0         
	//   11   21:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   12   24:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			menu = menubuilder;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #54  <Field MenuBuilder menu>
			if(menubuilder != null && listMenuPresenter != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          8
	//*  18   36:aload_0         
	//*  19   37:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//*  20   40:ifnull          8
			{
				menubuilder.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   24   48:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
				return;
	//   25   51:return          
			}
		}
	}

	void setStyle(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #138 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #139 <Method void TypedValue()>
	//    3    7:astore_3        
		android.content.res.Resources.Theme theme = context.getResources().newTheme();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #145 <Method Resources Context.getResources()>
	//    6   12:invokevirtual   #151 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//    7   15:astore_2        
		theme.setTo(context.getTheme());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   11   21:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
	//   12   24:aload_2         
	//   13   25:getstatic       #165 <Field int android.support.v7.appcompat.R$attr.actionBarPopupTheme>
	//   14   28:aload_3         
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #169 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   17   33:pop             
		if(typedvalue.resourceId != 0)
	//*  18   34:aload_3         
	//*  19   35:getfield        #172 <Field int TypedValue.resourceId>
	//*  20   38:ifeq            50
			theme.applyStyle(typedvalue.resourceId, true);
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:getfield        #172 <Field int TypedValue.resourceId>
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
	//   26   50:aload_2         
	//   27   51:getstatic       #179 <Field int android.support.v7.appcompat.R$attr.panelMenuListTheme>
	//   28   54:aload_3         
	//   29   55:iconst_1        
	//   30   56:invokevirtual   #169 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   31   59:pop             
		if(typedvalue.resourceId != 0)
	//*  32   60:aload_3         
	//*  33   61:getfield        #172 <Field int TypedValue.resourceId>
	//*  34   64:ifeq            136
			theme.applyStyle(typedvalue.resourceId, true);
	//   35   67:aload_2         
	//   36   68:aload_3         
	//   37   69:getfield        #172 <Field int TypedValue.resourceId>
	//   38   72:iconst_1        
	//   39   73:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		else
	//*  40   76:new             #181 <Class ContextThemeWrapper>
	//*  41   79:dup             
	//*  42   80:aload_1         
	//*  43   81:iconst_0        
	//*  44   82:invokespecial   #182 <Method void ContextThemeWrapper(Context, int)>
	//*  45   85:astore_1        
	//*  46   86:aload_1         
	//*  47   87:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  50   94:aload_0         
	//*  51   95:aload_1         
	//*  52   96:putfield        #75  <Field Context listPresenterContext>
	//*  53   99:aload_1         
	//*  54  100:getstatic       #188 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//*  55  103:invokevirtual   #192 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//*  56  106:astore_1        
	//*  57  107:aload_0         
	//*  58  108:aload_1         
	//*  59  109:getstatic       #195 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_panelBackground>
	//*  60  112:iconst_0        
	//*  61  113:invokevirtual   #201 <Method int TypedArray.getResourceId(int, int)>
	//*  62  116:putfield        #203 <Field int background>
	//*  63  119:aload_0         
	//*  64  120:aload_1         
	//*  65  121:getstatic       #206 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowAnimationStyle>
	//*  66  124:iconst_0        
	//*  67  125:invokevirtual   #201 <Method int TypedArray.getResourceId(int, int)>
	//*  68  128:putfield        #208 <Field int windowAnimations>
	//*  69  131:aload_1         
	//*  70  132:invokevirtual   #211 <Method void TypedArray.recycle()>
	//*  71  135:return          
			theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
	//   72  136:aload_2         
	//   73  137:getstatic       #216 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
	//   74  140:iconst_1        
	//   75  141:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		context = ((Context) (new ContextThemeWrapper(context, 0)));
		context.getTheme().setTo(theme);
		listPresenterContext = context;
		context = ((Context) (context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
		background = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
		windowAnimations = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
		((TypedArray) (context)).recycle();
	//*  76  144:goto            76
	}

	int background;
	View createdPanelView;
	ViewGroup decorView;
	int featureId;
	Bundle frozenActionViewState;
	Bundle frozenMenuState;
	int gravity;
	boolean isHandled;
	boolean isOpen;
	boolean isPrepared;
	ListMenuPresenter listMenuPresenter;
	Context listPresenterContext;
	MenuBuilder menu;
	public boolean qwertyMode;
	boolean refreshDecorView;
	boolean refreshMenuContent;
	View shownPanelView;
	boolean wasLastOpen;
	int windowAnimations;
	int x;
	int y;

	AppCompatDelegateImplV9$PanelFeatureState(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		featureId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int featureId>
		refreshDecorView = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #50  <Field boolean refreshDecorView>
	//    8   14:return          
	}
}
