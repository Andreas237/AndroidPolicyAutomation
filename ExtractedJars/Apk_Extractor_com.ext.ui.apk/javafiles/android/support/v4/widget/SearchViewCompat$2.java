// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			SearchViewCompat

static final class SearchViewCompat$2
	implements android.widget.istener
{

	public boolean onClose()
	{
		return val$listener.onClose();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SearchViewCompat$OnCloseListener val$listener>
	//    2    4:invokeinterface #27  <Method boolean SearchViewCompat$OnCloseListener.onClose()>
	//    3    9:ireturn         
	}

	final CloseListener val$listener;

	SearchViewCompat$2(CloseListener closelistener)
	{
		val$listener = closelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SearchViewCompat$OnCloseListener val$listener>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
