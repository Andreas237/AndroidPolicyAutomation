// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog

public class AppCompatDialogFragment extends DialogFragment
{

	public AppCompatDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DialogFragment()>
	//    2    4:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		return ((Dialog) (new AppCompatDialog(getContext(), getTheme())));
	//    0    0:new             #13  <Class AppCompatDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method android.content.Context getContext()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #21  <Method int getTheme()>
	//    6   12:invokespecial   #24  <Method void AppCompatDialog(android.content.Context, int)>
	//    7   15:areturn         
	}

	public void setupDialog(Dialog dialog, int i)
	{
		if(dialog instanceof AppCompatDialog)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #13  <Class AppCompatDialog>
	//*   2    4:ifeq            59
		{
			AppCompatDialog appcompatdialog = (AppCompatDialog)dialog;
	//    3    7:aload_1         
	//    4    8:checkcast       #13  <Class AppCompatDialog>
	//    5   11:astore_3        
			switch(i)
	//*   6   12:iload_2         
			{
	//*   7   13:tableswitch     1 3: default 40
	//	               1 52
	//	               2 52
	//	               3 43
	//*   8   40:goto            58
			case 3: // '\003'
				dialog.getWindow().addFlags(24);
	//    9   43:aload_1         
	//   10   44:invokevirtual   #36  <Method Window Dialog.getWindow()>
	//   11   47:bipush          24
	//   12   49:invokevirtual   #42  <Method void Window.addFlags(int)>
				// fall through

			case 1: // '\001'
			case 2: // '\002'
				appcompatdialog.supportRequestWindowFeature(1);
	//   13   52:aload_3         
	//   14   53:iconst_1        
	//   15   54:invokevirtual   #46  <Method boolean AppCompatDialog.supportRequestWindowFeature(int)>
	//   16   57:pop             
				// fall through

			default:
				return;
	//   17   58:return          
			}
		} else
		{
			super.setupDialog(dialog, i);
	//   18   59:aload_0         
	//   19   60:aload_1         
	//   20   61:iload_2         
	//   21   62:invokespecial   #48  <Method void DialogFragment.setupDialog(Dialog, int)>
			return;
	//   22   65:return          
		}
	}
}
