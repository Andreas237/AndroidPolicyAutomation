// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.widget.SearchView;

public class SearchViewBindingAdapter
{
	public static interface OnQueryTextChange
	{

		public abstract boolean onQueryTextChange(String s);
	}

	public static interface OnQueryTextSubmit
	{

		public abstract boolean onQueryTextSubmit(String s);
	}

	public static interface OnSuggestionClick
	{

		public abstract boolean onSuggestionClick(int i);
	}

	public static interface OnSuggestionSelect
	{

		public abstract boolean onSuggestionSelect(int i);
	}


	public SearchViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnQueryTextListener(SearchView searchview, OnQueryTextSubmit onquerytextsubmit, OnQueryTextChange onquerytextchange)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #54  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          35
		{
			if(onquerytextsubmit == null && onquerytextchange == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       22
	//*   5   12:aload_2         
	//*   6   13:ifnonnull       22
			{
				searchview.setOnQueryTextListener(((android.widget.SearchView.OnQueryTextListener) (null)));
	//    7   16:aload_0         
	//    8   17:aconst_null     
	//    9   18:invokevirtual   #59  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
				return;
	//   10   21:return          
			}
			searchview.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener(onquerytextsubmit, onquerytextchange) {

				public boolean onQueryTextChange(String s)
				{
					OnQueryTextChange onquerytextchange1 = change;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
				//    2    4:astore_2        
					if(onquerytextchange1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return onquerytextchange1.onQueryTextChange(s);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #31  <Method boolean SearchViewBindingAdapter$OnQueryTextChange.onQueryTextChange(String)>
				//    8   16:ireturn         
					else
						return false;
				//    9   17:iconst_0        
				//   10   18:ireturn         
				}

				public boolean onQueryTextSubmit(String s)
				{
					OnQueryTextSubmit onquerytextsubmit1 = submit;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
				//    2    4:astore_2        
					if(onquerytextsubmit1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return onquerytextsubmit1.onQueryTextSubmit(s);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnQueryTextSubmit.onQueryTextSubmit(String)>
				//    8   16:ireturn         
					else
						return false;
				//    9   17:iconst_0        
				//   10   18:ireturn         
				}

				final OnQueryTextChange val$change;
				final OnQueryTextSubmit val$submit;

			
			{
				submit = onquerytextsubmit;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
				change = onquerytextchange;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   22:aload_0         
	//   12   23:new             #6   <Class SearchViewBindingAdapter$1>
	//   13   26:dup             
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokespecial   #62  <Method void SearchViewBindingAdapter$1(SearchViewBindingAdapter$OnQueryTextSubmit, SearchViewBindingAdapter$OnQueryTextChange)>
	//   17   32:invokevirtual   #59  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
		}
	//   18   35:return          
	}

	public static void setOnSuggestListener(SearchView searchview, OnSuggestionSelect onsuggestionselect, OnSuggestionClick onsuggestionclick)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #54  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          35
		{
			if(onsuggestionselect == null && onsuggestionclick == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       22
	//*   5   12:aload_2         
	//*   6   13:ifnonnull       22
			{
				searchview.setOnSuggestionListener(((android.widget.SearchView.OnSuggestionListener) (null)));
	//    7   16:aload_0         
	//    8   17:aconst_null     
	//    9   18:invokevirtual   #71  <Method void SearchView.setOnSuggestionListener(android.widget.SearchView$OnSuggestionListener)>
				return;
	//   10   21:return          
			}
			searchview.setOnSuggestionListener(new android.widget.SearchView.OnSuggestionListener(onsuggestionselect, onsuggestionclick) {

				public boolean onSuggestionClick(int i)
				{
					OnSuggestionClick onsuggestionclick1 = change;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
				//    2    4:astore_2        
					if(onsuggestionclick1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return onsuggestionclick1.onSuggestionClick(i);
				//    5    9:aload_2         
				//    6   10:iload_1         
				//    7   11:invokeinterface #31  <Method boolean SearchViewBindingAdapter$OnSuggestionClick.onSuggestionClick(int)>
				//    8   16:ireturn         
					else
						return false;
				//    9   17:iconst_0        
				//   10   18:ireturn         
				}

				public boolean onSuggestionSelect(int i)
				{
					OnSuggestionSelect onsuggestionselect1 = submit;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
				//    2    4:astore_2        
					if(onsuggestionselect1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return onsuggestionselect1.onSuggestionSelect(i);
				//    5    9:aload_2         
				//    6   10:iload_1         
				//    7   11:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnSuggestionSelect.onSuggestionSelect(int)>
				//    8   16:ireturn         
					else
						return false;
				//    9   17:iconst_0        
				//   10   18:ireturn         
				}

				final OnSuggestionClick val$change;
				final OnSuggestionSelect val$submit;

			
			{
				submit = onsuggestionselect;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
				change = onsuggestionclick;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   22:aload_0         
	//   12   23:new             #8   <Class SearchViewBindingAdapter$2>
	//   13   26:dup             
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokespecial   #74  <Method void SearchViewBindingAdapter$2(SearchViewBindingAdapter$OnSuggestionSelect, SearchViewBindingAdapter$OnSuggestionClick)>
	//   17   32:invokevirtual   #71  <Method void SearchView.setOnSuggestionListener(android.widget.SearchView$OnSuggestionListener)>
		}
	//   18   35:return          
	}
}
