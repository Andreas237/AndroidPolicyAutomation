// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.DialogInterface;

// Referenced classes of package android.support.v14.preference:
//			ListPreferenceDialogFragment

class ListPreferenceDialogFragment$1
	implements android.content.
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		ListPreferenceDialogFragment.access$002(ListPreferenceDialogFragment.this, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ListPreferenceDialogFragment this$0>
	//    2    4:iload_2         
	//    3    5:invokestatic    #27  <Method int ListPreferenceDialogFragment.access$002(ListPreferenceDialogFragment, int)>
	//    4    8:pop             
		ListPreferenceDialogFragment.this.onClick(dialoginterface, -1);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field ListPreferenceDialogFragment this$0>
	//    7   13:aload_1         
	//    8   14:iconst_m1       
	//    9   15:invokevirtual   #29  <Method void ListPreferenceDialogFragment.onClick(DialogInterface, int)>
		dialoginterface.dismiss();
	//   10   18:aload_1         
	//   11   19:invokeinterface #34  <Method void DialogInterface.dismiss()>
	//   12   24:return          
	}

	final ListPreferenceDialogFragment this$0;

	ListPreferenceDialogFragment$1()
	{
		this$0 = ListPreferenceDialogFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ListPreferenceDialogFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
