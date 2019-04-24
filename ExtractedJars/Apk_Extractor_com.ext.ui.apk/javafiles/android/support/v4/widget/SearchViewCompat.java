// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.widget.SearchView;

public final class SearchViewCompat
{
	public static interface OnCloseListener
	{

		public abstract boolean onClose();
	}

	public static abstract class OnCloseListenerCompat
		implements OnCloseListener
	{

		public boolean onClose()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public OnCloseListenerCompat()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface OnQueryTextListener
	{

		public abstract boolean onQueryTextChange(String s);

		public abstract boolean onQueryTextSubmit(String s);
	}

	public static abstract class OnQueryTextListenerCompat
		implements OnQueryTextListener
	{

		public boolean onQueryTextChange(String s)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onQueryTextSubmit(String s)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public OnQueryTextListenerCompat()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private SearchViewCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private static void checkIfLegalArg(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("searchView must be non-null");
	//    2    4:new             #31  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #33  <String "searchView must be non-null">
	//    5   10:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!(view instanceof SearchView))
	//*   7   14:aload_0         
	//*   8   15:instanceof      #38  <Class SearchView>
	//*   9   18:ifne            31
			throw new IllegalArgumentException("searchView must be an instance of android.widget.SearchView");
	//   10   21:new             #31  <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #40  <String "searchView must be an instance of android.widget.SearchView">
	//   13   27:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		else
			return;
	//   15   31:return          
	}

	public static CharSequence getQuery(View view)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		return ((SearchView)view).getQuery();
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:invokevirtual   #47  <Method CharSequence SearchView.getQuery()>
	//    5   11:areturn         
	}

	public static boolean isIconified(View view)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		return ((SearchView)view).isIconified();
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:invokevirtual   #53  <Method boolean SearchView.isIconified()>
	//    5   11:ireturn         
	}

	public static boolean isQueryRefinementEnabled(View view)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		return ((SearchView)view).isQueryRefinementEnabled();
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:invokevirtual   #56  <Method boolean SearchView.isQueryRefinementEnabled()>
	//    5   11:ireturn         
	}

	public static boolean isSubmitButtonEnabled(View view)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		return ((SearchView)view).isSubmitButtonEnabled();
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:invokevirtual   #59  <Method boolean SearchView.isSubmitButtonEnabled()>
	//    5   11:ireturn         
	}

	private static android.widget.SearchView.OnCloseListener newOnCloseListener(OnCloseListener oncloselistener)
	{
		return new android.widget.SearchView.OnCloseListener(oncloselistener) {

			public boolean onClose()
			{
				return listener.onClose();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchViewCompat$OnCloseListener val$listener>
			//    2    4:invokeinterface #27  <Method boolean SearchViewCompat$OnCloseListener.onClose()>
			//    3    9:ireturn         
			}

			final OnCloseListener val$listener;

			
			{
				listener = oncloselistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchViewCompat$OnCloseListener val$listener>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class SearchViewCompat$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #64  <Method void SearchViewCompat$2(SearchViewCompat$OnCloseListener)>
	//    4    8:areturn         
	}

	private static android.widget.SearchView.OnQueryTextListener newOnQueryTextListener(OnQueryTextListener onquerytextlistener)
	{
		return new android.widget.SearchView.OnQueryTextListener(onquerytextlistener) {

			public boolean onQueryTextChange(String s)
			{
				return listener.onQueryTextChange(s);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #27  <Method boolean SearchViewCompat$OnQueryTextListener.onQueryTextChange(String)>
			//    4   10:ireturn         
			}

			public boolean onQueryTextSubmit(String s)
			{
				return listener.onQueryTextSubmit(s);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #30  <Method boolean SearchViewCompat$OnQueryTextListener.onQueryTextSubmit(String)>
			//    4   10:ireturn         
			}

			final OnQueryTextListener val$listener;

			
			{
				listener = onquerytextlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class SearchViewCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void SearchViewCompat$1(SearchViewCompat$OnQueryTextListener)>
	//    4    8:areturn         
	}

	public static View newSearchView(Context context)
	{
		return ((View) (new SearchView(context)));
	//    0    0:new             #38  <Class SearchView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #73  <Method void SearchView(Context)>
	//    4    8:areturn         
	}

	public static void setIconified(View view, boolean flag)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setIconified(flag);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #78  <Method void SearchView.setIconified(boolean)>
	//    6   12:return          
	}

	public static void setImeOptions(View view, int i)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setImeOptions(i);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #83  <Method void SearchView.setImeOptions(int)>
	//    6   12:return          
	}

	public static void setInputType(View view, int i)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setInputType(i);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #86  <Method void SearchView.setInputType(int)>
	//    6   12:return          
	}

	public static void setMaxWidth(View view, int i)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setMaxWidth(i);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #89  <Method void SearchView.setMaxWidth(int)>
	//    6   12:return          
	}

	public static void setOnCloseListener(View view, OnCloseListener oncloselistener)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setOnCloseListener(newOnCloseListener(oncloselistener));
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:aload_1         
	//    5    9:invokestatic    #93  <Method android.widget.SearchView$OnCloseListener newOnCloseListener(SearchViewCompat$OnCloseListener)>
	//    6   12:invokevirtual   #96  <Method void SearchView.setOnCloseListener(android.widget.SearchView$OnCloseListener)>
	//    7   15:return          
	}

	public static void setOnQueryTextListener(View view, OnQueryTextListener onquerytextlistener)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setOnQueryTextListener(newOnQueryTextListener(onquerytextlistener));
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:aload_1         
	//    5    9:invokestatic    #100 <Method android.widget.SearchView$OnQueryTextListener newOnQueryTextListener(SearchViewCompat$OnQueryTextListener)>
	//    6   12:invokevirtual   #103 <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
	//    7   15:return          
	}

	public static void setQuery(View view, CharSequence charsequence, boolean flag)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setQuery(charsequence, flag);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #108 <Method void SearchView.setQuery(CharSequence, boolean)>
	//    7   13:return          
	}

	public static void setQueryHint(View view, CharSequence charsequence)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setQueryHint(charsequence);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method void SearchView.setQueryHint(CharSequence)>
	//    6   12:return          
	}

	public static void setQueryRefinementEnabled(View view, boolean flag)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setQueryRefinementEnabled(flag);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #116 <Method void SearchView.setQueryRefinementEnabled(boolean)>
	//    6   12:return          
	}

	public static void setSearchableInfo(View view, ComponentName componentname)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		SearchManager searchmanager = (SearchManager)view.getContext().getSystemService("search");
	//    2    4:aload_0         
	//    3    5:invokevirtual   #124 <Method Context View.getContext()>
	//    4    8:ldc1            #126 <String "search">
	//    5   10:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    6   13:checkcast       #134 <Class SearchManager>
	//    7   16:astore_2        
		((SearchView)view).setSearchableInfo(searchmanager.getSearchableInfo(componentname));
	//    8   17:aload_0         
	//    9   18:checkcast       #38  <Class SearchView>
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #138 <Method android.app.SearchableInfo SearchManager.getSearchableInfo(ComponentName)>
	//   13   26:invokevirtual   #141 <Method void SearchView.setSearchableInfo(android.app.SearchableInfo)>
	//   14   29:return          
	}

	public static void setSubmitButtonEnabled(View view, boolean flag)
	{
		checkIfLegalArg(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void checkIfLegalArg(View)>
		((SearchView)view).setSubmitButtonEnabled(flag);
	//    2    4:aload_0         
	//    3    5:checkcast       #38  <Class SearchView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #144 <Method void SearchView.setSubmitButtonEnabled(boolean)>
	//    6   12:return          
	}
}
