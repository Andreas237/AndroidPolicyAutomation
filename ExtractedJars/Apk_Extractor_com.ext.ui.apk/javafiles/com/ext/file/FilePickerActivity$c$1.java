// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.view.View;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

class FilePickerActivity$c$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		FilePickerActivity.c.a(b).onAdapterViewClick(a);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FilePickerActivity$c b>
	//    2    4:invokestatic    #32  <Method android.support.v7.bv$b FilePickerActivity$c.a(FilePickerActivity$c)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field View a>
	//    5   11:invokeinterface #37  <Method void android.support.v7.bv$b.onAdapterViewClick(View)>
	//    6   16:return          
	}

	final View a;
	final FilePickerActivity.c b;

	FilePickerActivity$c$1(FilePickerActivity.c c1, View view)
	{
		b = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FilePickerActivity$c b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
