// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package android.support.v4.widget:
//			CursorAdapter

private class CursorAdapter$ChangeObserver extends ContentObserver
{

	public boolean deliverSelfNotifications()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onChange(boolean flag)
	{
		onContentChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CursorAdapter this$0>
	//    2    4:invokevirtual   #29  <Method void CursorAdapter.onContentChanged()>
	//    3    7:return          
	}

	final CursorAdapter this$0;

	CursorAdapter$ChangeObserver()
	{
		this$0 = CursorAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CursorAdapter this$0>
		super(new Handler());
	//    3    5:aload_0         
	//    4    6:new             #15  <Class Handler>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void Handler()>
	//    7   13:invokespecial   #21  <Method void ContentObserver(Handler)>
	//    8   16:return          
	}
}
