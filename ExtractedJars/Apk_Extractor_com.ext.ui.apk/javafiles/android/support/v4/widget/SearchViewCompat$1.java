// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			SearchViewCompat

static final class SearchViewCompat$1
	implements android.widget.extListener
{

	public boolean onQueryTextChange(String s)
	{
		return val$listener.onQueryTextChange(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method boolean SearchViewCompat$OnQueryTextListener.onQueryTextChange(String)>
	//    4   10:ireturn         
	}

	public boolean onQueryTextSubmit(String s)
	{
		return val$listener.onQueryTextSubmit(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method boolean SearchViewCompat$OnQueryTextListener.onQueryTextSubmit(String)>
	//    4   10:ireturn         
	}

	final QueryTextListener val$listener;

	SearchViewCompat$1(QueryTextListener querytextlistener)
	{
		val$listener = querytextlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SearchViewCompat$OnQueryTextListener val$listener>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
