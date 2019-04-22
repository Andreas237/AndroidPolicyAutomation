// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.support.v4.app.*;
import android.view.View;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentCompat, DialogFragmentAccessor, FragmentAccessor, FragmentActivityAccessor, 
//			FragmentManagerAccessor

final class FragmentCompatSupportLib extends FragmentCompat
{
	private static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib
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

		private DialogFragmentAccessorSupportLib()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void FragmentCompatSupportLib$FragmentAccessorSupportLib(FragmentCompatSupportLib$1)>
		//    3    5:return          
		}

	}

	private static class FragmentAccessorSupportLib
		implements FragmentAccessor
	{

		public FragmentManager getChildFragmentManager(Fragment fragment)
		{
			return fragment.getChildFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method FragmentManager Fragment.getChildFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getChildFragmentManager(Object obj)
		{
			return ((Object) (getChildFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #29  <Method FragmentManager getChildFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public FragmentManager getFragmentManager(Fragment fragment)
		{
			return fragment.getFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method FragmentManager Fragment.getFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getFragmentManager(Object obj)
		{
			return ((Object) (getFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #34  <Method FragmentManager getFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public int getId(Fragment fragment)
		{
			return fragment.getId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #39  <Method int Fragment.getId()>
		//    2    4:ireturn         
		}

		public volatile int getId(Object obj)
		{
			return getId((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #42  <Method int getId(Fragment)>
		//    4    8:ireturn         
		}

		public Resources getResources(Fragment fragment)
		{
			return fragment.getResources();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #47  <Method Resources Fragment.getResources()>
		//    2    4:areturn         
		}

		public volatile Resources getResources(Object obj)
		{
			return getResources((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #50  <Method Resources getResources(Fragment)>
		//    4    8:areturn         
		}

		public String getTag(Fragment fragment)
		{
			return fragment.getTag();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #55  <Method String Fragment.getTag()>
		//    2    4:areturn         
		}

		public volatile String getTag(Object obj)
		{
			return getTag((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #58  <Method String getTag(Fragment)>
		//    4    8:areturn         
		}

		public View getView(Fragment fragment)
		{
			return fragment.getView();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #63  <Method View Fragment.getView()>
		//    2    4:areturn         
		}

		public volatile View getView(Object obj)
		{
			return getView((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Fragment>
		//    3    5:invokevirtual   #66  <Method View getView(Fragment)>
		//    4    8:areturn         
		}

		private FragmentAccessorSupportLib()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class FragmentActivityAccessorSupportLib
		implements FragmentActivityAccessor
	{

		public FragmentManager getFragmentManager(FragmentActivity fragmentactivity)
		{
			return fragmentactivity.getSupportFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getFragmentManager(Activity activity)
		{
			return ((Object) (getFragmentManager((FragmentActivity)activity)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class FragmentActivity>
		//    3    5:invokevirtual   #30  <Method FragmentManager getFragmentManager(FragmentActivity)>
		//    4    8:areturn         
		}

		private FragmentActivityAccessorSupportLib()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	FragmentCompatSupportLib()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void FragmentCompat()>
	//    2    4:return          
	}

	public volatile DialogFragmentAccessor forDialogFragment()
	{
		return ((DialogFragmentAccessor) (forDialogFragment()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method FragmentCompatSupportLib$DialogFragmentAccessorSupportLib forDialogFragment()>
	//    2    4:areturn         
	}

	public DialogFragmentAccessorSupportLib forDialogFragment()
	{
		return sDialogFragmentAccessor;
	//    0    0:getstatic       #36  <Field FragmentCompatSupportLib$DialogFragmentAccessorSupportLib sDialogFragmentAccessor>
	//    1    3:areturn         
	}

	public volatile FragmentAccessor forFragment()
	{
		return ((FragmentAccessor) (forFragment()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method FragmentCompatSupportLib$FragmentAccessorSupportLib forFragment()>
	//    2    4:areturn         
	}

	public FragmentAccessorSupportLib forFragment()
	{
		return sFragmentAccessor;
	//    0    0:getstatic       #33  <Field FragmentCompatSupportLib$FragmentAccessorSupportLib sFragmentAccessor>
	//    1    3:areturn         
	}

	public volatile FragmentActivityAccessor forFragmentActivity()
	{
		return ((FragmentActivityAccessor) (forFragmentActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method FragmentCompatSupportLib$FragmentActivityAccessorSupportLib forFragmentActivity()>
	//    2    4:areturn         
	}

	public FragmentActivityAccessorSupportLib forFragmentActivity()
	{
		return sFragmentActivityAccessor;
	//    0    0:getstatic       #45  <Field FragmentCompatSupportLib$FragmentActivityAccessorSupportLib sFragmentActivityAccessor>
	//    1    3:areturn         
	}

	public FragmentManagerAccessor forFragmentManager()
	{
		return ((FragmentManagerAccessor) (sFragmentManagerAccessor));
	//    0    0:getstatic       #42  <Field FragmentCompat$FragmentManagerAccessorViaReflection sFragmentManagerAccessor>
	//    1    3:areturn         
	}

	public Class getDialogFragmentClass()
	{
		return android/support/v4/app/DialogFragment;
	//    0    0:ldc1            #70  <Class DialogFragment>
	//    1    2:areturn         
	}

	public Class getFragmentActivityClass()
	{
		return android/support/v4/app/FragmentActivity;
	//    0    0:ldc1            #74  <Class FragmentActivity>
	//    1    2:areturn         
	}

	public Class getFragmentClass()
	{
		return android/support/v4/app/Fragment;
	//    0    0:ldc1            #78  <Class Fragment>
	//    1    2:areturn         
	}

	private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
	private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
	private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();
	private static final FragmentCompat.FragmentManagerAccessorViaReflection sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection();

	static 
	{
	//    0    0:new             #12  <Class FragmentCompatSupportLib$FragmentAccessorSupportLib>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #31  <Method void FragmentCompatSupportLib$FragmentAccessorSupportLib(FragmentCompatSupportLib$1)>
	//    4    8:putstatic       #33  <Field FragmentCompatSupportLib$FragmentAccessorSupportLib sFragmentAccessor>
	//    5   11:new             #9   <Class FragmentCompatSupportLib$DialogFragmentAccessorSupportLib>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #34  <Method void FragmentCompatSupportLib$DialogFragmentAccessorSupportLib(FragmentCompatSupportLib$1)>
	//    9   19:putstatic       #36  <Field FragmentCompatSupportLib$DialogFragmentAccessorSupportLib sDialogFragmentAccessor>
	//   10   22:new             #38  <Class FragmentCompat$FragmentManagerAccessorViaReflection>
	//   11   25:dup             
	//   12   26:invokespecial   #40  <Method void FragmentCompat$FragmentManagerAccessorViaReflection()>
	//   13   29:putstatic       #42  <Field FragmentCompat$FragmentManagerAccessorViaReflection sFragmentManagerAccessor>
	//   14   32:new             #15  <Class FragmentCompatSupportLib$FragmentActivityAccessorSupportLib>
	//   15   35:dup             
	//   16   36:aconst_null     
	//   17   37:invokespecial   #43  <Method void FragmentCompatSupportLib$FragmentActivityAccessorSupportLib(FragmentCompatSupportLib$1)>
	//   18   40:putstatic       #45  <Field FragmentCompatSupportLib$FragmentActivityAccessorSupportLib sFragmentActivityAccessor>
	//*  19   43:return          
	}
}
