// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.facebook.stetho.common.android:
//			DialogFragmentAccessor, FragmentCompatSupportLib

private static class FragmentCompatSupportLib$DialogFragmentAccessorSupportLib extends FragmentCompatSupportLib.FragmentAccessorSupportLib
	implements DialogFragmentAccessor
{

	public Dialog getDialog(DialogFragment dialogfragment)
	{
		return dialogfragment.getDialog();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method Dialog DialogFragment.getDialog()>
	//    2    4:areturn         
	}

	public volatile Dialog getDialog(Object obj)
	{
		return getDialog((DialogFragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class DialogFragment>
	//    3    5:invokevirtual   #28  <Method Dialog getDialog(DialogFragment)>
	//    4    8:areturn         
	}

	private FragmentCompatSupportLib$DialogFragmentAccessorSupportLib()
	{
		super(((FragmentCompatSupportLib._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void FragmentCompatSupportLib$FragmentAccessorSupportLib(FragmentCompatSupportLib$1)>
	//    3    5:return          
	}

	FragmentCompatSupportLib$DialogFragmentAccessorSupportLib(FragmentCompatSupportLib._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void FragmentCompatSupportLib$DialogFragmentAccessorSupportLib()>
	//    2    4:return          
	}
}
