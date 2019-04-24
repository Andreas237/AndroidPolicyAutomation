// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

class FilePickerActivity$2
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		((InputMethodManager)b.getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FilePickerActivity b>
	//    2    4:ldc1            #28  <String "input_method">
	//    3    6:invokevirtual   #32  <Method Object FilePickerActivity.getSystemService(String)>
	//    4    9:checkcast       #34  <Class InputMethodManager>
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field EditText a>
	//    7   16:invokevirtual   #40  <Method android.os.IBinder EditText.getWindowToken()>
	//    8   19:iconst_0        
	//    9   20:invokevirtual   #44  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   10   23:pop             
	//   11   24:return          
	}

	final EditText a;
	final FilePickerActivity b;

	FilePickerActivity$2(FilePickerActivity filepickeractivity, EditText edittext)
	{
		b = filepickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field FilePickerActivity b>
		a = edittext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field EditText a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
