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
		if(val$change != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field SearchViewBindingAdapter$OnSuggestionClick val$change>
	//*   2    4:ifnull          18
			return val$change.onSuggestionClick(i);
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
		if(val$submit != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field SearchViewBindingAdapter$OnSuggestionSelect val$submit>
	//*   2    4:ifnull          18
			return val$submit.onSuggestionSelect(i);
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
