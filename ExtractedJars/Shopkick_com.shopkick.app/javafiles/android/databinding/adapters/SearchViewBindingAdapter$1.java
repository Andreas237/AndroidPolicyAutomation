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
		QueryTextChange querytextchange = val$change;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SearchViewBindingAdapter$OnQueryTextChange val$change>
	//    2    4:astore_2        
		if(querytextchange != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return querytextchange.onQueryTextChange(s);
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
		QueryTextSubmit querytextsubmit = val$submit;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SearchViewBindingAdapter$OnQueryTextSubmit val$submit>
	//    2    4:astore_2        
		if(querytextsubmit != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return querytextsubmit.onQueryTextSubmit(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #36  <Method boolean SearchViewBindingAdapter$OnQueryTextSubmit.onQueryTextSubmit(String)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
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
