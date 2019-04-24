// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Filter;
import com.irobot.home.b.k;

// Referenced classes of package com.irobot.home:
//			CountryPickerActivity

class CountryPickerActivity$2
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		CountryPickerActivity.a(a).getFilter().filter(((CharSequence) (editable)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CountryPickerActivity a>
	//    2    4:invokestatic    #25  <Method k CountryPickerActivity.a(CountryPickerActivity)>
	//    3    7:invokevirtual   #31  <Method Filter k.getFilter()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void Filter.filter(CharSequence)>
	//    6   14:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int l)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int l)
	{
	//    0    0:return          
	}

	final CountryPickerActivity a;

	CountryPickerActivity$2(CountryPickerActivity countrypickeractivity)
	{
		a = countrypickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CountryPickerActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
