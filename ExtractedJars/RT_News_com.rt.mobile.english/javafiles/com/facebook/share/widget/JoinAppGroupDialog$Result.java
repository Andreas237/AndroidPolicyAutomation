// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.widget:
//			JoinAppGroupDialog

public static final class JoinAppGroupDialog$Result
{

	public Bundle getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bundle data>
	//    2    4:areturn         
	}

	private final Bundle data;

	private JoinAppGroupDialog$Result(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		data = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Bundle data>
	//    5    9:return          
	}

	JoinAppGroupDialog$Result(Bundle bundle, JoinAppGroupDialog._cls1 _pcls1)
	{
		this(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void JoinAppGroupDialog$Result(Bundle)>
	//    3    5:return          
	}
}
