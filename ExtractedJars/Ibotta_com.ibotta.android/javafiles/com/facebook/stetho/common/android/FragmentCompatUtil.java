// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.view.View;
import java.util.List;

// Referenced classes of package com.facebook.stetho.common.android:
//			ViewUtil, FragmentCompat, FragmentActivityAccessor, FragmentAccessor, 
//			FragmentManagerAccessor

public final class FragmentCompatUtil
{

	private FragmentCompatUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object findFragmentForView(View view)
	{
		Activity activity = ViewUtil.tryGetActivity(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #18  <Method Activity ViewUtil.tryGetActivity(View)>
	//    2    4:astore_1        
		if(activity == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return findFragmentForViewInActivity(activity, view);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokestatic    #22  <Method Object findFragmentForViewInActivity(Activity, View)>
	//   10   16:areturn         
	}

	private static Object findFragmentForViewInActivity(Activity activity, View view)
	{
		Object obj = ((Object) (FragmentCompat.getSupportLibInstance()));
	//    0    0:invokestatic    #29  <Method FragmentCompat FragmentCompat.getSupportLibInstance()>
	//    1    3:astore_2        
		if(obj != null && ((FragmentCompat) (obj)).getFragmentActivityClass().isInstance(((Object) (activity))))
	//*   2    4:aload_2         
	//*   3    5:ifnull          32
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #33  <Method Class FragmentCompat.getFragmentActivityClass()>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #39  <Method boolean Class.isInstance(Object)>
	//*   8   16:ifeq            32
		{
			obj = findFragmentForViewInActivity(((FragmentCompat) (obj)), activity, view);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #42  <Method Object findFragmentForViewInActivity(FragmentCompat, Activity, View)>
	//   13   25:astore_2        
			if(obj != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          32
				return obj;
	//   16   30:aload_2         
	//   17   31:areturn         
		}
		obj = ((Object) (FragmentCompat.getFrameworkInstance()));
	//   18   32:invokestatic    #45  <Method FragmentCompat FragmentCompat.getFrameworkInstance()>
	//   19   35:astore_2        
		if(obj != null)
	//*  20   36:aload_2         
	//*  21   37:ifnull          53
		{
			activity = ((Activity) (findFragmentForViewInActivity(((FragmentCompat) (obj)), activity, view)));
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:invokestatic    #42  <Method Object findFragmentForViewInActivity(FragmentCompat, Activity, View)>
	//   26   46:astore_0        
			if(activity != null)
	//*  27   47:aload_0         
	//*  28   48:ifnull          53
				return ((Object) (activity));
	//   29   51:aload_0         
	//   30   52:areturn         
		}
		return ((Object) (null));
	//   31   53:aconst_null     
	//   32   54:areturn         
	}

	private static Object findFragmentForViewInActivity(FragmentCompat fragmentcompat, Activity activity, View view)
	{
		activity = ((Activity) (fragmentcompat.forFragmentActivity().getFragmentManager(activity)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method FragmentActivityAccessor FragmentCompat.forFragmentActivity()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method Object FragmentActivityAccessor.getFragmentManager(Activity)>
	//    4   10:astore_1        
		if(activity != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return findFragmentForViewInFragmentManager(fragmentcompat, ((Object) (activity)), view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokestatic    #59  <Method Object findFragmentForViewInFragmentManager(FragmentCompat, Object, View)>
	//   11   21:areturn         
		else
			return ((Object) (null));
	//   12   22:aconst_null     
	//   13   23:areturn         
	}

	private static Object findFragmentForViewInFragment(FragmentCompat fragmentcompat, Object obj, View view)
	{
		FragmentAccessor fragmentaccessor = fragmentcompat.forFragment();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method FragmentAccessor FragmentCompat.forFragment()>
	//    2    4:astore_3        
		if(fragmentaccessor.getView(obj) == view)
	//*   3    5:aload_3         
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #70  <Method View FragmentAccessor.getView(Object)>
	//*   6   12:aload_2         
	//*   7   13:if_acmpne       18
			return obj;
	//    8   16:aload_1         
	//    9   17:areturn         
		obj = fragmentaccessor.getChildFragmentManager(obj);
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokeinterface #74  <Method Object FragmentAccessor.getChildFragmentManager(Object)>
	//   13   25:astore_1        
		if(obj != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          37
			return findFragmentForViewInFragmentManager(fragmentcompat, obj, view);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokestatic    #59  <Method Object findFragmentForViewInFragmentManager(FragmentCompat, Object, View)>
	//   20   36:areturn         
		else
			return ((Object) (null));
	//   21   37:aconst_null     
	//   22   38:areturn         
	}

	private static Object findFragmentForViewInFragmentManager(FragmentCompat fragmentcompat, Object obj, View view)
	{
		obj = ((Object) (fragmentcompat.forFragmentManager().getAddedFragments(obj)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method FragmentManagerAccessor FragmentCompat.forFragmentManager()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #84  <Method List FragmentManagerAccessor.getAddedFragments(Object)>
	//    4   10:astore_1        
		if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          60
		{
			int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
			for(int j = ((List) (obj)).size(); i < j; i++)
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #90  <Method int List.size()>
	//*  11   23:istore          4
	//*  12   25:iload_3         
	//*  13   26:iload           4
	//*  14   28:icmpge          60
			{
				Object obj1 = findFragmentForViewInFragment(fragmentcompat, ((List) (obj)).get(i), view);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:iload_3         
	//   18   34:invokeinterface #94  <Method Object List.get(int)>
	//   19   39:aload_2         
	//   20   40:invokestatic    #96  <Method Object findFragmentForViewInFragment(FragmentCompat, Object, View)>
	//   21   43:astore          5
				if(obj1 != null)
	//*  22   45:aload           5
	//*  23   47:ifnull          53
					return obj1;
	//   24   50:aload           5
	//   25   52:areturn         
			}

	//   26   53:iload_3         
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:istore_3        
		}
	//*  30   57:goto            25
		return ((Object) (null));
	//   31   60:aconst_null     
	//   32   61:areturn         
	}

	public static boolean isDialogFragment(Object obj)
	{
		FragmentCompat fragmentcompat = FragmentCompat.getSupportLibInstance();
	//    0    0:invokestatic    #29  <Method FragmentCompat FragmentCompat.getSupportLibInstance()>
	//    1    3:astore_1        
		if(fragmentcompat != null && fragmentcompat.getDialogFragmentClass().isInstance(obj))
	//*   2    4:aload_1         
	//*   3    5:ifnull          21
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #100 <Method Class FragmentCompat.getDialogFragmentClass()>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #39  <Method boolean Class.isInstance(Object)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		fragmentcompat = FragmentCompat.getFrameworkInstance();
	//   11   21:invokestatic    #45  <Method FragmentCompat FragmentCompat.getFrameworkInstance()>
	//   12   24:astore_1        
		return fragmentcompat != null && fragmentcompat.getDialogFragmentClass().isInstance(obj);
	//   13   25:aload_1         
	//   14   26:ifnull          42
	//   15   29:aload_1         
	//   16   30:invokevirtual   #100 <Method Class FragmentCompat.getDialogFragmentClass()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #39  <Method boolean Class.isInstance(Object)>
	//   19   37:ifeq            42
	//   20   40:iconst_1        
	//   21   41:ireturn         
	//   22   42:iconst_0        
	//   23   43:ireturn         
	}
}
