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
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnQueryTextListener(SearchView searchview, OnQueryTextSubmit onquerytextsubmit, OnQueryTextChange onquerytextchange)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          21
			{
				if(onquerytextsubmit != null || onquerytextchange != null)
					break label0;
	//    3    8:aload_1         
	//    4    9:ifnonnull       22
	//    5   12:aload_2         
	//    6   13:ifnonnull       22
				searchview.setOnQueryTextListener(((android.widget.SearchView.OnQueryTextListener) (null)));
	//    7   16:aload_0         
	//    8   17:aconst_null     
	//    9   18:invokevirtual   #56  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
			}
			return;
	//   10   21:return          
		}
		searchview.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener(onquerytextsubmit, onquerytextchange) {

			public boolean onQueryTextChange(String s)
			{
				if(change != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
			//*   2    4:ifnull          18
					return change.onQueryTextChange(s);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
			//    5   11:aload_1         
			//    6   12:invokeinterface #31  <Method boolean SearchViewBindingAdapter$OnQueryTextChange.onQueryTextChange(String)>
			//    7   17:ireturn         
				else
					return false;
			//    8   18:iconst_0        
			//    9   19:ireturn         
			}

			public boolean onQueryTextSubmit(String s)
			{
				if(submit != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
			//*   2    4:ifnull          18
					return submit.onQueryTextSubmit(s);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
			//    5   11:aload_1         
			//    6   12:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnQueryTextSubmit.onQueryTextSubmit(String)>
			//    7   17:ireturn         
				else
					return false;
			//    8   18:iconst_0        
			//    9   19:ireturn         
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
	//   16   29:invokespecial   #59  <Method void SearchViewBindingAdapter$1(SearchViewBindingAdapter$OnQueryTextSubmit, SearchViewBindingAdapter$OnQueryTextChange)>
	//   17   32:invokevirtual   #56  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
	//   18   35:return          
	}

	public static void setOnSuggestListener(SearchView searchview, OnSuggestionSelect onsuggestionselect, OnSuggestionClick onsuggestionclick)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          21
			{
				if(onsuggestionselect != null || onsuggestionclick != null)
					break label0;
	//    3    8:aload_1         
	//    4    9:ifnonnull       22
	//    5   12:aload_2         
	//    6   13:ifnonnull       22
				searchview.setOnSuggestionListener(((android.widget.SearchView.OnSuggestionListener) (null)));
	//    7   16:aload_0         
	//    8   17:aconst_null     
	//    9   18:invokevirtual   #68  <Method void SearchView.setOnSuggestionListener(android.widget.SearchView$OnSuggestionListener)>
			}
			return;
	//   10   21:return          
		}
		searchview.setOnSuggestionListener(new android.widget.SearchView.OnSuggestionListener(onsuggestionselect, onsuggestionclick) {

			public boolean onSuggestionClick(int i)
			{
				if(change != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
			//*   2    4:ifnull          18
					return change.onSuggestionClick(i);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
			//    5   11:iload_1         
			//    6   12:invokeinterface #31  <Method boolean SearchViewBindingAdapter$OnSuggestionClick.onSuggestionClick(int)>
			//    7   17:ireturn         
				else
					return false;
			//    8   18:iconst_0        
			//    9   19:ireturn         
			}

			public boolean onSuggestionSelect(int i)
			{
				if(submit != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
			//*   2    4:ifnull          18
					return submit.onSuggestionSelect(i);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
			//    5   11:iload_1         
			//    6   12:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnSuggestionSelect.onSuggestionSelect(int)>
			//    7   17:ireturn         
				else
					return false;
			//    8   18:iconst_0        
			//    9   19:ireturn         
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
	//   16   29:invokespecial   #71  <Method void SearchViewBindingAdapter$2(SearchViewBindingAdapter$OnSuggestionSelect, SearchViewBindingAdapter$OnSuggestionClick)>
	//   17   32:invokevirtual   #68  <Method void SearchView.setOnSuggestionListener(android.widget.SearchView$OnSuggestionListener)>
	//   18   35:return          
	}
}
