// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;


// Referenced classes of package android.databinding.adapters:
//			SearchViewBindingAdapter

static final class SearchViewBindingAdapter$2
	implements android.widget.ener
{

	public boolean onSuggestionClick(int i)
	{
		SuggestionClick suggestionclick = val$change;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
	//    2    4:astore_2        
		if(suggestionclick != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return suggestionclick.onSuggestionClick(i);
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
		SuggestionSelect suggestionselect = val$submit;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
	//    2    4:astore_2        
		if(suggestionselect != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return suggestionselect.onSuggestionSelect(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnSuggestionSelect.onSuggestionSelect(int)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	final SuggestionClick val$change;
	final SuggestionSelect val$submit;

	SearchViewBindingAdapter$2(SuggestionSelect suggestionselect, SuggestionClick suggestionclick)
	{
		val$submit = suggestionselect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
		val$change = suggestionclick;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
