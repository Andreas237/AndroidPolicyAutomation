// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

class FilePickerActivity$1
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
		dialoginterface = ((DialogInterface) (((Object) (a.getText())).toString().trim()));
	//   11   24:aload_0         
	//   12   25:getfield        #20  <Field EditText a>
	//   13   28:invokevirtual   #48  <Method android.text.Editable EditText.getText()>
	//   14   31:invokevirtual   #52  <Method String Object.toString()>
	//   15   34:invokevirtual   #57  <Method String String.trim()>
	//   16   37:astore_1        
		if(((String) (dialoginterface)).length() == 0)
	//*  17   38:aload_1         
	//*  18   39:invokevirtual   #61  <Method int String.length()>
	//*  19   42:ifne            46
			return;
	//   20   45:return          
		dialoginterface = ((DialogInterface) (new File((new StringBuilder()).append(((Object) (b.a))).append("/").append(((String) (dialoginterface))).toString())));
	//   21   46:new             #63  <Class File>
	//   22   49:dup             
	//   23   50:new             #65  <Class StringBuilder>
	//   24   53:dup             
	//   25   54:invokespecial   #66  <Method void StringBuilder()>
	//   26   57:aload_0         
	//   27   58:getfield        #18  <Field FilePickerActivity b>
	//   28   61:getfield        #69  <Field File FilePickerActivity.a>
	//   29   64:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//   30   67:ldc1            #75  <String "/">
	//   31   69:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   34   76:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   35   79:invokespecial   #82  <Method void File(String)>
	//   36   82:astore_1        
		if(((File) (dialoginterface)).isDirectory())
	//*  37   83:aload_1         
	//*  38   84:invokevirtual   #86  <Method boolean File.isDirectory()>
	//*  39   87:ifeq            114
		{
			Toast.makeText(((android.content.Context) (b)), ((CharSequence) (b.getResources().getString(0x7f0d0073))), 1).show();
	//   40   90:aload_0         
	//   41   91:getfield        #18  <Field FilePickerActivity b>
	//   42   94:aload_0         
	//   43   95:getfield        #18  <Field FilePickerActivity b>
	//   44   98:invokevirtual   #90  <Method Resources FilePickerActivity.getResources()>
	//   45  101:ldc1            #91  <Int 0x7f0d0073>
	//   46  103:invokevirtual   #97  <Method String Resources.getString(int)>
	//   47  106:iconst_1        
	//   48  107:invokestatic    #103 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   49  110:invokevirtual   #106 <Method void Toast.show()>
			return;
	//   50  113:return          
		}
		if(((File) (dialoginterface)).mkdir() || ((File) (dialoginterface)).isDirectory())
	//*  51  114:aload_1         
	//*  52  115:invokevirtual   #109 <Method boolean File.mkdir()>
	//*  53  118:ifne            128
	//*  54  121:aload_1         
	//*  55  122:invokevirtual   #86  <Method boolean File.isDirectory()>
	//*  56  125:ifeq            136
		{
			b.a();
	//   57  128:aload_0         
	//   58  129:getfield        #18  <Field FilePickerActivity b>
	//   59  132:invokevirtual   #111 <Method void FilePickerActivity.a()>
			return;
	//   60  135:return          
		} else
		{
			Toast.makeText(((android.content.Context) (b)), ((CharSequence) (b.getResources().getString(0x7f0d0074))), 1).show();
	//   61  136:aload_0         
	//   62  137:getfield        #18  <Field FilePickerActivity b>
	//   63  140:aload_0         
	//   64  141:getfield        #18  <Field FilePickerActivity b>
	//   65  144:invokevirtual   #90  <Method Resources FilePickerActivity.getResources()>
	//   66  147:ldc1            #112 <Int 0x7f0d0074>
	//   67  149:invokevirtual   #97  <Method String Resources.getString(int)>
	//   68  152:iconst_1        
	//   69  153:invokestatic    #103 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   70  156:invokevirtual   #106 <Method void Toast.show()>
			return;
	//   71  159:return          
		}
	}

	final EditText a;
	final FilePickerActivity b;

	FilePickerActivity$1(FilePickerActivity filepickeractivity, EditText edittext)
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
