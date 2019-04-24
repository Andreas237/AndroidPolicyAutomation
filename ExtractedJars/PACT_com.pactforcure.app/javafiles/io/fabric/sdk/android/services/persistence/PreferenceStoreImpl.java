// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Kit;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//			PreferenceStore

public class PreferenceStoreImpl
	implements PreferenceStore
{

	public PreferenceStoreImpl(Context context1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		if(context1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
	//    4    8:new             #19  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #21  <String "Cannot get directory before context has been set. Call Fabric.with() first">
	//    7   14:invokespecial   #24  <Method void IllegalStateException(String)>
	//    8   17:athrow          
		} else
		{
			context = context1;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #26  <Field Context context>
			preferenceName = s;
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:putfield        #28  <Field String preferenceName>
			sharedPreferences = context.getSharedPreferences(preferenceName, 0);
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #26  <Field Context context>
	//   18   33:aload_0         
	//   19   34:getfield        #28  <Field String preferenceName>
	//   20   37:iconst_0        
	//   21   38:invokevirtual   #34  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   22   41:putfield        #36  <Field SharedPreferences sharedPreferences>
			return;
	//   23   44:return          
		}
	}

	public PreferenceStoreImpl(Kit kit)
	{
		this(kit.getContext(), ((Object) (kit)).getClass().getName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Context Kit.getContext()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #49  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #55  <Method String Class.getName()>
	//    6   12:invokespecial   #57  <Method void PreferenceStoreImpl(Context, String)>
	//    7   15:return          
	}

	public android.content.SharedPreferences.Editor edit()
	{
		return sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #64  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:areturn         
	}

	public SharedPreferences get()
	{
		return sharedPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SharedPreferences sharedPreferences>
	//    2    4:areturn         
	}

	public boolean save(android.content.SharedPreferences.Editor editor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*   0    0:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmplt          16
		{
			editor.apply();
	//    3    8:aload_1         
	//    4    9:invokeinterface #82  <Method void android.content.SharedPreferences$Editor.apply()>
			return true;
	//    5   14:iconst_1        
	//    6   15:ireturn         
		} else
		{
			return editor.commit();
	//    7   16:aload_1         
	//    8   17:invokeinterface #86  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    9   22:ireturn         
		}
	}

	private final Context context;
	private final String preferenceName;
	private final SharedPreferences sharedPreferences;
}
