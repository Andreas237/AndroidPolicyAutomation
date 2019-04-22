// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.*;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentCompat, DialogFragmentAccessor, FragmentAccessor, FragmentActivityAccessor, 
//			FragmentManagerAccessor

final class FragmentCompatFramework extends FragmentCompat
{
	private static class DialogFragmentAccessorFramework
		implements DialogFragmentAccessor
	{

		public FragmentManager getChildFragmentManager(Fragment fragment)
		{
			return (FragmentManager)mFragmentAccessor.getChildFragmentManager(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #31  <Method Object FragmentAccessor.getChildFragmentManager(Object)>
		//    4   10:checkcast       #33  <Class FragmentManager>
		//    5   13:areturn         
		}

		public volatile Object getChildFragmentManager(Object obj)
		{
			return ((Object) (getChildFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #38  <Method FragmentManager getChildFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public Dialog getDialog(DialogFragment dialogfragment)
		{
			return dialogfragment.getDialog();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method Dialog DialogFragment.getDialog()>
		//    2    4:areturn         
		}

		public volatile Dialog getDialog(Object obj)
		{
			return getDialog((DialogFragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #42  <Class DialogFragment>
		//    3    5:invokevirtual   #48  <Method Dialog getDialog(DialogFragment)>
		//    4    8:areturn         
		}

		public FragmentManager getFragmentManager(Fragment fragment)
		{
			return (FragmentManager)mFragmentAccessor.getFragmentManager(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #51  <Method Object FragmentAccessor.getFragmentManager(Object)>
		//    4   10:checkcast       #33  <Class FragmentManager>
		//    5   13:areturn         
		}

		public volatile Object getFragmentManager(Object obj)
		{
			return ((Object) (getFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #53  <Method FragmentManager getFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public int getId(Fragment fragment)
		{
			return mFragmentAccessor.getId(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #58  <Method int FragmentAccessor.getId(Object)>
		//    4   10:ireturn         
		}

		public volatile int getId(Object obj)
		{
			return getId((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #60  <Method int getId(Fragment)>
		//    4    8:ireturn         
		}

		public Resources getResources(Fragment fragment)
		{
			return mFragmentAccessor.getResources(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #65  <Method Resources FragmentAccessor.getResources(Object)>
		//    4   10:areturn         
		}

		public volatile Resources getResources(Object obj)
		{
			return getResources((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #67  <Method Resources getResources(Fragment)>
		//    4    8:areturn         
		}

		public String getTag(Fragment fragment)
		{
			return mFragmentAccessor.getTag(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #72  <Method String FragmentAccessor.getTag(Object)>
		//    4   10:areturn         
		}

		public volatile String getTag(Object obj)
		{
			return getTag((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #74  <Method String getTag(Fragment)>
		//    4    8:areturn         
		}

		public View getView(Fragment fragment)
		{
			return mFragmentAccessor.getView(((Object) (fragment)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    2    4:aload_1         
		//    3    5:invokeinterface #79  <Method View FragmentAccessor.getView(Object)>
		//    4   10:areturn         
		}

		public volatile View getView(Object obj)
		{
			return getView((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Fragment>
		//    3    5:invokevirtual   #81  <Method View getView(Fragment)>
		//    4    8:areturn         
		}

		private final FragmentAccessor mFragmentAccessor;

		public DialogFragmentAccessorFramework(FragmentAccessor fragmentaccessor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mFragmentAccessor = fragmentaccessor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field FragmentAccessor mFragmentAccessor>
		//    5    9:return          
		}
	}

	private static class FragmentAccessorFrameworkHoneycomb
		implements FragmentAccessor
	{

		public FragmentManager getChildFragmentManager(Fragment fragment)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object getChildFragmentManager(Object obj)
		{
			return ((Object) (getChildFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #26  <Method FragmentManager getChildFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public FragmentManager getFragmentManager(Fragment fragment)
		{
			return fragment.getFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #30  <Method FragmentManager Fragment.getFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getFragmentManager(Object obj)
		{
			return ((Object) (getFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #32  <Method FragmentManager getFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		public int getId(Fragment fragment)
		{
			return fragment.getId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #37  <Method int Fragment.getId()>
		//    2    4:ireturn         
		}

		public volatile int getId(Object obj)
		{
			return getId((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #40  <Method int getId(Fragment)>
		//    4    8:ireturn         
		}

		public Resources getResources(Fragment fragment)
		{
			return fragment.getResources();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method Resources Fragment.getResources()>
		//    2    4:areturn         
		}

		public volatile Resources getResources(Object obj)
		{
			return getResources((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #48  <Method Resources getResources(Fragment)>
		//    4    8:areturn         
		}

		public String getTag(Fragment fragment)
		{
			return fragment.getTag();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #53  <Method String Fragment.getTag()>
		//    2    4:areturn         
		}

		public volatile String getTag(Object obj)
		{
			return getTag((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #56  <Method String getTag(Fragment)>
		//    4    8:areturn         
		}

		public View getView(Fragment fragment)
		{
			return fragment.getView();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #61  <Method View Fragment.getView()>
		//    2    4:areturn         
		}

		public volatile View getView(Object obj)
		{
			return getView((Fragment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Fragment>
		//    3    5:invokevirtual   #64  <Method View getView(Fragment)>
		//    4    8:areturn         
		}

		private FragmentAccessorFrameworkHoneycomb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb
	{

		public FragmentManager getChildFragmentManager(Fragment fragment)
		{
			return fragment.getChildFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method FragmentManager Fragment.getChildFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getChildFragmentManager(Object obj)
		{
			return ((Object) (getChildFragmentManager((Fragment)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class Fragment>
		//    3    5:invokevirtual   #30  <Method FragmentManager getChildFragmentManager(Fragment)>
		//    4    8:areturn         
		}

		private FragmentAccessorFrameworkJellyBean()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb(FragmentCompatFramework$1)>
		//    3    5:return          
		}

	}

	private static class FragmentActivityAccessorFramework
		implements FragmentActivityAccessor
	{

		public FragmentManager getFragmentManager(Activity activity)
		{
			return activity.getFragmentManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method FragmentManager Activity.getFragmentManager()>
		//    2    4:areturn         
		}

		public volatile Object getFragmentManager(Activity activity)
		{
			return ((Object) (getFragmentManager(activity)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method FragmentManager getFragmentManager(Activity)>
		//    3    5:areturn         
		}

		private FragmentActivityAccessorFramework()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	FragmentCompatFramework()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void FragmentCompat()>
	//    2    4:return          
	}

	public volatile DialogFragmentAccessor forDialogFragment()
	{
		return ((DialogFragmentAccessor) (forDialogFragment()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method FragmentCompatFramework$DialogFragmentAccessorFramework forDialogFragment()>
	//    2    4:areturn         
	}

	public DialogFragmentAccessorFramework forDialogFragment()
	{
		return sDialogFragmentAccessor;
	//    0    0:getstatic       #60  <Field FragmentCompatFramework$DialogFragmentAccessorFramework sDialogFragmentAccessor>
	//    1    3:areturn         
	}

	public volatile FragmentAccessor forFragment()
	{
		return ((FragmentAccessor) (forFragment()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb forFragment()>
	//    2    4:areturn         
	}

	public FragmentAccessorFrameworkHoneycomb forFragment()
	{
		return sFragmentAccessor;
	//    0    0:getstatic       #54  <Field FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb sFragmentAccessor>
	//    1    3:areturn         
	}

	public volatile FragmentActivityAccessor forFragmentActivity()
	{
		return ((FragmentActivityAccessor) (forFragmentActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method FragmentCompatFramework$FragmentActivityAccessorFramework forFragmentActivity()>
	//    2    4:areturn         
	}

	public FragmentActivityAccessorFramework forFragmentActivity()
	{
		return sFragmentActivityAccessor;
	//    0    0:getstatic       #45  <Field FragmentCompatFramework$FragmentActivityAccessorFramework sFragmentActivityAccessor>
	//    1    3:areturn         
	}

	public FragmentCompat.FragmentManagerAccessorViaReflection forFragmentManager()
	{
		return sFragmentManagerAccessor;
	//    0    0:getstatic       #40  <Field FragmentCompat$FragmentManagerAccessorViaReflection sFragmentManagerAccessor>
	//    1    3:areturn         
	}

	public volatile FragmentManagerAccessor forFragmentManager()
	{
		return ((FragmentManagerAccessor) (forFragmentManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method FragmentCompat$FragmentManagerAccessorViaReflection forFragmentManager()>
	//    2    4:areturn         
	}

	public Class getDialogFragmentClass()
	{
		return android/app/DialogFragment;
	//    0    0:ldc1            #88  <Class DialogFragment>
	//    1    2:areturn         
	}

	public Class getFragmentActivityClass()
	{
		return android/app/Activity;
	//    0    0:ldc1            #92  <Class Activity>
	//    1    2:areturn         
	}

	public Class getFragmentClass()
	{
		return android/app/Fragment;
	//    0    0:ldc1            #96  <Class Fragment>
	//    1    2:areturn         
	}

	private static final DialogFragmentAccessorFramework sDialogFragmentAccessor;
	private static final FragmentAccessorFrameworkHoneycomb sFragmentAccessor;
	private static final FragmentActivityAccessorFramework sFragmentActivityAccessor = new FragmentActivityAccessorFramework();
	private static final FragmentCompat.FragmentManagerAccessorViaReflection sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection();

	static 
	{
	//    0    0:new             #35  <Class FragmentCompat$FragmentManagerAccessorViaReflection>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void FragmentCompat$FragmentManagerAccessorViaReflection()>
	//    3    7:putstatic       #40  <Field FragmentCompat$FragmentManagerAccessorViaReflection sFragmentManagerAccessor>
	//    4   10:new             #18  <Class FragmentCompatFramework$FragmentActivityAccessorFramework>
	//    5   13:dup             
	//    6   14:aconst_null     
	//    7   15:invokespecial   #43  <Method void FragmentCompatFramework$FragmentActivityAccessorFramework(FragmentCompatFramework$1)>
	//    8   18:putstatic       #45  <Field FragmentCompatFramework$FragmentActivityAccessorFramework sFragmentActivityAccessor>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   9   21:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   24:bipush          17
	//*  11   26:icmplt          43
			sFragmentAccessor = ((FragmentAccessorFrameworkHoneycomb) (new FragmentAccessorFrameworkJellyBean()));
	//   12   29:new             #15  <Class FragmentCompatFramework$FragmentAccessorFrameworkJellyBean>
	//   13   32:dup             
	//   14   33:aconst_null     
	//   15   34:invokespecial   #52  <Method void FragmentCompatFramework$FragmentAccessorFrameworkJellyBean(FragmentCompatFramework$1)>
	//   16   37:putstatic       #54  <Field FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb sFragmentAccessor>
		else
	//*  17   40:goto            54
			sFragmentAccessor = new FragmentAccessorFrameworkHoneycomb();
	//   18   43:new             #12  <Class FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb>
	//   19   46:dup             
	//   20   47:aconst_null     
	//   21   48:invokespecial   #55  <Method void FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb(FragmentCompatFramework$1)>
	//   22   51:putstatic       #54  <Field FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb sFragmentAccessor>
		sDialogFragmentAccessor = new DialogFragmentAccessorFramework(((FragmentAccessor) (sFragmentAccessor)));
	//   23   54:new             #9   <Class FragmentCompatFramework$DialogFragmentAccessorFramework>
	//   24   57:dup             
	//   25   58:getstatic       #54  <Field FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb sFragmentAccessor>
	//   26   61:invokespecial   #58  <Method void FragmentCompatFramework$DialogFragmentAccessorFramework(FragmentAccessor)>
	//   27   64:putstatic       #60  <Field FragmentCompatFramework$DialogFragmentAccessorFramework sDialogFragmentAccessor>
	//*  28   67:return          
	}
}
