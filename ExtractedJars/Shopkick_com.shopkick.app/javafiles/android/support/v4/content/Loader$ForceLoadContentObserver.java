// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package android.support.v4.content:
//			Loader

public final class Loader$ForceLoadContentObserver extends ContentObserver
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
	//    1    1:getfield        #13  <Field Loader this$0>
	//    2    4:invokevirtual   #29  <Method void Loader.onContentChanged()>
	//    3    7:return          
	}

	final Loader this$0;

	public Loader$ForceLoadContentObserver()
	{
		this$0 = Loader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Loader this$0>
		super(new Handler());
	//    3    5:aload_0         
	//    4    6:new             #15  <Class Handler>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void Handler()>
	//    7   13:invokespecial   #21  <Method void ContentObserver(Handler)>
	//    8   16:return          
	}
}
