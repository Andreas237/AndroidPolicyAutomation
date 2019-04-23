// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import io.radar.shadow.dagger.internal.Preconditions;

// Referenced classes of package io.radar.sdk.di:
//			DaggerRadarComponent, CoreModule, RadarComponent, LocationModule

public static final class DaggerRadarComponent$Builder
{

	public RadarComponent build()
	{
		if(coreModule != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CoreModule coreModule>
	//*   2    4:ifnull          17
		{
			return ((RadarComponent) (new DaggerRadarComponent(this, ((DaggerRadarComponent._cls1) (null)))));
	//    3    7:new             #6   <Class DaggerRadarComponent>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokespecial   #25  <Method void DaggerRadarComponent(DaggerRadarComponent$Builder, DaggerRadarComponent$1)>
	//    8   16:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #27  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void StringBuilder()>
	//   12   24:astore_1        
			stringbuilder.append(((Class) (io/radar/sdk/di/CoreModule)).getCanonicalName());
	//   13   25:aload_1         
	//   14   26:ldc1            #30  <Class CoreModule>
	//   15   28:invokevirtual   #36  <Method String Class.getCanonicalName()>
	//   16   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(" must be set");
	//   18   35:aload_1         
	//   19   36:ldc1            #42  <String " must be set">
	//   20   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   22   42:new             #44  <Class IllegalStateException>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   26   50:invokespecial   #50  <Method void IllegalStateException(String)>
	//   27   53:athrow          
		}
	}

	public DaggerRadarComponent$Builder coreModule(CoreModule coremodule)
	{
		coreModule = (CoreModule)Preconditions.checkNotNull(((Object) (coremodule)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #30  <Class CoreModule>
	//    4    8:putfield        #20  <Field CoreModule coreModule>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public DaggerRadarComponent$Builder locationModule(LocationModule locationmodule)
	{
		Preconditions.checkNotNull(((Object) (locationmodule)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private CoreModule coreModule;


/*
	static CoreModule access$100(DaggerRadarComponent$Builder daggerradarcomponent$builder)
	{
		return daggerradarcomponent$builder.coreModule;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CoreModule coreModule>
	//    2    4:areturn         
	}

*/

	private DaggerRadarComponent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	DaggerRadarComponent$Builder(DaggerRadarComponent._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void DaggerRadarComponent$Builder()>
	//    2    4:return          
	}
}
