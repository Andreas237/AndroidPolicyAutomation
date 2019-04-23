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
//			AppCompatDelegateImpl

protected static final class AppCompatDelegateImpl$PanelFeatureState
{
	private static class SavedState
		implements Parcelable
	{

		static SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			SavedState savedstate = new SavedState();
		//    0    0:new             #2   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState()>
		//    3    7:astore          4
			savedstate.featureId = parcel.readInt();
		//    4    9:aload           4
		//    5   11:aload_0         
		//    6   12:invokevirtual   #41  <Method int Parcel.readInt()>
		//    7   15:putfield        #43  <Field int featureId>
			int i = parcel.readInt();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #41  <Method int Parcel.readInt()>
		//   10   22:istore_2        
			boolean flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_3        
			if(i != 1)
		//*  13   25:iload_2         
		//*  14   26:iconst_1        
		//*  15   27:icmpne          33
		//*  16   30:goto            35
				flag = false;
		//   17   33:iconst_0        
		//   18   34:istore_3        
			savedstate.isOpen = flag;
		//   19   35:aload           4
		//   20   37:iload_3         
		//   21   38:putfield        #45  <Field boolean isOpen>
			if(savedstate.isOpen)
		//*  22   41:aload           4
		//*  23   43:getfield        #45  <Field boolean isOpen>
		//*  24   46:ifeq            59
				savedstate.menuState = parcel.readBundle(classloader);
		//   25   49:aload           4
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   29   56:putfield        #51  <Field Bundle menuState>
			return savedstate;
		//   30   59:aload           4
		//   31   61:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #56  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #58  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #63  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
			//    0    0:aload_1         
			//    1    1:aconst_null     
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return SavedState.readFromParcel(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #37  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int featureId;
		boolean isOpen;
		Bundle menuState;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImpl$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState$1()>
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
		MenuBuilder menubuilder = menu;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MenuBuilder menu>
	//    2    4:astore_1        
		if(menubuilder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
		{
			Bundle bundle = frozenMenuState;
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field Bundle frozenMenuState>
	//    7   13:astore_2        
			if(bundle != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          28
			{
				menubuilder.restorePresenterStates(bundle);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #62  <Method void MenuBuilder.restorePresenterStates(Bundle)>
				frozenMenuState = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #56  <Field Bundle frozenMenuState>
			}
		}
	//   16   28:return          
	}

	public void clearMenuPresenters()
	{
		MenuBuilder menubuilder = menu;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MenuBuilder menu>
	//    2    4:astore_1        
		if(menubuilder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			menubuilder.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//    8   14:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		listMenuPresenter = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   12   22:return          
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
		View view = shownPanelView;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field View shownPanelView>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(view == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(createdPanelView != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #102 <Field View createdPanelView>
	//*  11   17:ifnull          22
			return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
		if(listMenuPresenter.getAdapter().getCount() > 0)
	//*  14   22:aload_0         
	//*  15   23:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//*  16   26:invokevirtual   #106 <Method ListAdapter ListMenuPresenter.getAdapter()>
	//*  17   29:invokeinterface #112 <Method int ListAdapter.getCount()>
	//*  18   34:ifle            39
			flag = true;
	//   19   37:iconst_1        
	//   20   38:istore_1        
		return flag;
	//   21   39:iload_1         
	//   22   40:ireturn         
	}

	void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #9   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
	//    2    4:astore_1        
		featureId = ((SavedState) (parcelable)).featureId;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #115 <Field int AppCompatDelegateImpl$PanelFeatureState$SavedState.featureId>
	//    6   10:putfield        #48  <Field int featureId>
		wasLastOpen = ((SavedState) (parcelable)).isOpen;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #117 <Field boolean AppCompatDelegateImpl$PanelFeatureState$SavedState.isOpen>
	//   10   18:putfield        #119 <Field boolean wasLastOpen>
		frozenMenuState = ((SavedState) (parcelable)).menuState;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
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
	//    0    0:new             #9   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState()>
	//    3    7:astore_1        
		savedstate.featureId = featureId;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int featureId>
	//    7   13:putfield        #115 <Field int AppCompatDelegateImpl$PanelFeatureState$SavedState.featureId>
		savedstate.isOpen = isOpen;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #126 <Field boolean isOpen>
	//   11   21:putfield        #117 <Field boolean AppCompatDelegateImpl$PanelFeatureState$SavedState.isOpen>
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
	//   19   39:putfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
			menu.savePresenterStates(savedstate.menuState);
	//   20   42:aload_0         
	//   21   43:getfield        #54  <Field MenuBuilder menu>
	//   22   46:aload_1         
	//   23   47:getfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
	//   24   50:invokevirtual   #132 <Method void MenuBuilder.savePresenterStates(Bundle)>
		}
		return ((Parcelable) (savedstate));
	//   25   53:aload_1         
	//   26   54:areturn         
	}

	void setMenu(MenuBuilder menubuilder)
	{
		MenuBuilder menubuilder1 = menu;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MenuBuilder menu>
	//    2    4:astore_2        
		if(menubuilder == menubuilder1)
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		if(menubuilder1 != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          23
			menubuilder1.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   12   20:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		menu = menubuilder;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #54  <Field MenuBuilder menu>
		if(menubuilder != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          46
		{
			ListMenuPresenter listmenupresenter = listMenuPresenter;
	//   18   32:aload_0         
	//   19   33:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
	//   20   36:astore_2        
			if(listmenupresenter != null)
	//*  21   37:aload_2         
	//*  22   38:ifnull          46
				menubuilder.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listmenupresenter)));
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		}
	//   26   46:return          
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
	//*  34   64:ifeq            79
			theme.applyStyle(typedvalue.resourceId, true);
	//   35   67:aload_2         
	//   36   68:aload_3         
	//   37   69:getfield        #172 <Field int TypedValue.resourceId>
	//   38   72:iconst_1        
	//   39   73:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		else
	//*  40   76:goto            87
			theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
	//   41   79:aload_2         
	//   42   80:getstatic       #184 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
	//   43   83:iconst_1        
	//   44   84:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		context = ((Context) (new ContextThemeWrapper(context, 0)));
	//   45   87:new             #186 <Class ContextThemeWrapper>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:iconst_0        
	//   49   93:invokespecial   #187 <Method void ContextThemeWrapper(Context, int)>
	//   50   96:astore_1        
		context.getTheme().setTo(theme);
	//   51   97:aload_1         
	//   52   98:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   53  101:aload_2         
	//   54  102:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		listPresenterContext = context;
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:putfield        #75  <Field Context listPresenterContext>
		context = ((Context) (context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
	//   58  110:aload_1         
	//   59  111:getstatic       #193 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//   60  114:invokevirtual   #197 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   61  117:astore_1        
		background = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
	//   62  118:aload_0         
	//   63  119:aload_1         
	//   64  120:getstatic       #200 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_panelBackground>
	//   65  123:iconst_0        
	//   66  124:invokevirtual   #206 <Method int TypedArray.getResourceId(int, int)>
	//   67  127:putfield        #208 <Field int background>
		windowAnimations = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
	//   68  130:aload_0         
	//   69  131:aload_1         
	//   70  132:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowAnimationStyle>
	//   71  135:iconst_0        
	//   72  136:invokevirtual   #206 <Method int TypedArray.getResourceId(int, int)>
	//   73  139:putfield        #213 <Field int windowAnimations>
		((TypedArray) (context)).recycle();
	//   74  142:aload_1         
	//   75  143:invokevirtual   #216 <Method void TypedArray.recycle()>
	//   76  146:return          
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

	AppCompatDelegateImpl$PanelFeatureState(int i)
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
