// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.DialogInterface;

// Referenced classes of package com.ext.ui:
//			ListPreferenceMultiSelect

class ListPreferenceMultiSelect$1
	implements android.content.eClickListener
{

	public void onClick(DialogInterface dialoginterface, int i, boolean flag)
	{
		ListPreferenceMultiSelect.a(a)[i] = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ListPreferenceMultiSelect a>
	//    2    4:invokestatic    #26  <Method boolean[] ListPreferenceMultiSelect.a(ListPreferenceMultiSelect)>
	//    3    7:iload_2         
	//    4    8:iload_3         
	//    5    9:bastore         
	//    6   10:return          
	}

	final ListPreferenceMultiSelect a;

	ListPreferenceMultiSelect$1(ListPreferenceMultiSelect listpreferencemultiselect)
	{
		a = listpreferencemultiselect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ListPreferenceMultiSelect a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
