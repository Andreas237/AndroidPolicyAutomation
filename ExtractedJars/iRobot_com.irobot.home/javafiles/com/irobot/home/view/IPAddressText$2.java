// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.irobot.home.view:
//			IPAddressText

class IPAddressText$2
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
	//    0    0:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		boolean flag;
		if(b >= k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int b>
	//*   2    4:iload           4
	//*   3    6:icmplt          15
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore          5
		else
	//*   6   12:goto            18
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          5
		a = flag;
	//    9   18:aload_0         
	//   10   19:iload           5
	//   11   21:putfield        #24  <Field boolean a>
	//   12   24:return          
	}

	boolean a;
	int b;
	final IPAddressText c;

	IPAddressText$2(IPAddressText ipaddresstext)
	{
		c = ipaddresstext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field IPAddressText c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		a = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean a>
		b = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field int b>
	//   11   19:return          
	}
}
