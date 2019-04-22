// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.List;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentManagerAccessor, FragmentCompat

static class FragmentCompat$FragmentManagerAccessorViaReflection
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

	FragmentCompat$FragmentManagerAccessorViaReflection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
