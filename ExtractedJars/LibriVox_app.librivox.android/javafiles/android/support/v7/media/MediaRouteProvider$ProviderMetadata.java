// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.ComponentName;

public final class MediaRouteProvider$ProviderMetadata
{

	public ComponentName getComponentName()
	{
		return mComponentName;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ComponentName mComponentName>
	//    2    4:areturn         
	}

	public String getPackageName()
	{
		return mComponentName.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ComponentName mComponentName>
	//    2    4:invokevirtual   #29  <Method String ComponentName.getPackageName()>
	//    3    7:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ProviderMetadata{ componentName=");
	//    4    8:aload_1         
	//    5    9:ldc1            #35  <String "ProviderMetadata{ componentName=">
	//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mComponentName.flattenToShortString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field ComponentName mComponentName>
	//   11   20:invokevirtual   #42  <Method String ComponentName.flattenToShortString()>
	//   12   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" }");
	//   14   27:aload_1         
	//   15   28:ldc1            #44  <String " }">
	//   16   30:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	private final ComponentName mComponentName;

	MediaRouteProvider$ProviderMetadata(ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		if(componentname != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			mComponentName = componentname;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #13  <Field ComponentName mComponentName>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("componentName must not be null");
	//    8   14:new             #15  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #17  <String "componentName must not be null">
	//   11   20:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		}
	}
}
