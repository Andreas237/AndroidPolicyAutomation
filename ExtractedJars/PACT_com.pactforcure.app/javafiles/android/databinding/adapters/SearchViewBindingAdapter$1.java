// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;


// Referenced classes of package android.databinding.adapters:
//			SearchViewBindingAdapter

static final class SearchViewBindingAdapter$1
	implements android.widget.ner
{

	public boolean onQueryTextChange(String s)
	{
		if(val$change != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
	//*   2    4:ifnull          18
			return val$change.onQueryTextChange(s);
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
		if(val$submit != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
	//*   2    4:ifnull          18
			return val$submit.onQueryTextSubmit(s);
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

	final QueryTextChange val$change;
	final QueryTextSubmit val$submit;

	SearchViewBindingAdapter$1(QueryTextSubmit querytextsubmit, QueryTextChange querytextchange)
	{
		val$submit = querytextsubmit;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
		val$change = querytextchange;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
