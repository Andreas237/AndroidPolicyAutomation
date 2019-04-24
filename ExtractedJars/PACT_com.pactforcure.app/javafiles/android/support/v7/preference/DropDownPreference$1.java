// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.preference:
//			DropDownPreference

class DropDownPreference$1
	implements android.widget.ectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		if(i >= 0)
	//*   0    0:iload_3         
	//*   1    1:iflt            52
		{
			adapterview = ((AdapterView) (getEntryValues()[i].toString()));
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field DropDownPreference this$0>
	//    4    8:invokevirtual   #24  <Method CharSequence[] DropDownPreference.getEntryValues()>
	//    5   11:iload_3         
	//    6   12:aaload          
	//    7   13:invokeinterface #30  <Method String CharSequence.toString()>
	//    8   18:astore_1        
			if(!((String) (adapterview)).equals(((Object) (getValue()))) && callChangeListener(((Object) (adapterview))))
	//*   9   19:aload_1         
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field DropDownPreference this$0>
	//*  12   24:invokevirtual   #33  <Method String DropDownPreference.getValue()>
	//*  13   27:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*  14   30:ifne            52
	//*  15   33:aload_0         
	//*  16   34:getfield        #14  <Field DropDownPreference this$0>
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #42  <Method boolean DropDownPreference.callChangeListener(Object)>
	//*  19   41:ifeq            52
				setValue(((String) (adapterview)));
	//   20   44:aload_0         
	//   21   45:getfield        #14  <Field DropDownPreference this$0>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #46  <Method void DropDownPreference.setValue(String)>
		}
	//   24   52:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	final DropDownPreference this$0;

	DropDownPreference$1()
	{
		this$0 = DropDownPreference.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DropDownPreference this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
