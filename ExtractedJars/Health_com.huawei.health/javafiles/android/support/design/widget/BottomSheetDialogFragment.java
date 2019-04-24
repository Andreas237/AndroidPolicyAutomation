// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

// Referenced classes of package android.support.design.widget:
//			BottomSheetDialog

public class BottomSheetDialogFragment extends AppCompatDialogFragment
{

	public BottomSheetDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppCompatDialogFragment()>
	//    2    4:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		return ((Dialog) (new BottomSheetDialog(getContext(), getTheme())));
	//    0    0:new             #13  <Class BottomSheetDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method android.content.Context getContext()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #21  <Method int getTheme()>
	//    6   12:invokespecial   #24  <Method void BottomSheetDialog(android.content.Context, int)>
	//    7   15:areturn         
	}
}
