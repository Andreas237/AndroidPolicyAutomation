// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.List;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentCompatFramework, FragmentCompatSupportLib, DialogFragmentAccessor, FragmentAccessor, 
//			FragmentActivityAccessor, FragmentManagerAccessor

public abstract class FragmentCompat
{
	static class FragmentManagerAccessorViaReflection
		implements FragmentManagerAccessor
	{

		public List getAddedFragments(Object obj)
		{
			if(mFieldMAdded == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Field mFieldMAdded>
		//*   2    4:ifnonnull       31
			{
				Field field = ReflectionUtil.tryGetDeclaredField(obj.getClass(), "mAdded");
		//    3    7:aload_1         
		//    4    8:invokevirtual   #26  <Method Class Object.getClass()>
		//    5   11:ldc1            #28  <String "mAdded">
		//    6   13:invokestatic    #34  <Method Field ReflectionUtil.tryGetDeclaredField(Class, String)>
		//    7   16:astore_2        
				if(field != null)
		//*   8   17:aload_2         
		//*   9   18:ifnull          31
				{
					field.setAccessible(true);
		//   10   21:aload_2         
		//   11   22:iconst_1        
		//   12   23:invokevirtual   #40  <Method void Field.setAccessible(boolean)>
					mFieldMAdded = field;
		//   13   26:aload_0         
		//   14   27:aload_2         
		//   15   28:putfield        #22  <Field Field mFieldMAdded>
				}
			}
			Field field1 = mFieldMAdded;
		//   16   31:aload_0         
		//   17   32:getfield        #22  <Field Field mFieldMAdded>
		//   18   35:astore_2        
			if(field1 != null)
		//*  19   36:aload_2         
		//*  20   37:ifnull          49
				return (List)ReflectionUtil.getFieldValue(field1, obj);
		//   21   40:aload_2         
		//   22   41:aload_1         
		//   23   42:invokestatic    #44  <Method Object ReflectionUtil.getFieldValue(Field, Object)>
		//   24   45:checkcast       #46  <Class List>
		//   25   48:areturn         
			else
				return null;
		//   26   49:aconst_null     
		//   27   50:areturn         
		}

		private Field mFieldMAdded;

		FragmentManagerAccessorViaReflection()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	FragmentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static FragmentCompat getFrameworkInstance()
	{
		if(sFrameworkInstance == null && android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #35  <Field FragmentCompat sFrameworkInstance>
	//*   1    3:ifnonnull       24
	//*   2    6:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    9:bipush          11
	//*   4   11:icmplt          24
			sFrameworkInstance = ((FragmentCompat) (new FragmentCompatFramework()));
	//    5   14:new             #43  <Class FragmentCompatFramework>
	//    6   17:dup             
	//    7   18:invokespecial   #44  <Method void FragmentCompatFramework()>
	//    8   21:putstatic       #35  <Field FragmentCompat sFrameworkInstance>
		return sFrameworkInstance;
	//    9   24:getstatic       #35  <Field FragmentCompat sFrameworkInstance>
	//   10   27:areturn         
	}

	public static FragmentCompat getSupportLibInstance()
	{
		if(sSupportInstance == null && sHasSupportFragment)
	//*   0    0:getstatic       #48  <Field FragmentCompat sSupportInstance>
	//*   1    3:ifnonnull       22
	//*   2    6:getstatic       #26  <Field boolean sHasSupportFragment>
	//*   3    9:ifeq            22
			sSupportInstance = ((FragmentCompat) (new FragmentCompatSupportLib()));
	//    4   12:new             #50  <Class FragmentCompatSupportLib>
	//    5   15:dup             
	//    6   16:invokespecial   #51  <Method void FragmentCompatSupportLib()>
	//    7   19:putstatic       #48  <Field FragmentCompat sSupportInstance>
		return sSupportInstance;
	//    8   22:getstatic       #48  <Field FragmentCompat sSupportInstance>
	//    9   25:areturn         
	}

	public abstract DialogFragmentAccessor forDialogFragment();

	public abstract FragmentAccessor forFragment();

	public abstract FragmentActivityAccessor forFragmentActivity();

	public abstract FragmentManagerAccessor forFragmentManager();

	public abstract Class getDialogFragmentClass();

	public abstract Class getFragmentActivityClass();

	public abstract Class getFragmentClass();

	private static FragmentCompat sFrameworkInstance;
	private static final boolean sHasSupportFragment;
	private static FragmentCompat sSupportInstance;

	static 
	{
		boolean flag;
		if(ReflectionUtil.tryGetClassForName("android.support.v4.app.Fragment") != null)
	//*   0    0:ldc1            #18  <String "android.support.v4.app.Fragment">
	//*   1    2:invokestatic    #24  <Method Class ReflectionUtil.tryGetClassForName(String)>
	//*   2    5:ifnull          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		sHasSupportFragment = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #26  <Field boolean sHasSupportFragment>
	//*  10   19:return          
	}
}
