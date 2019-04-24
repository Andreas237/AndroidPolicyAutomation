// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzan, Container, zzu

final class Container$zza
	implements zzan
{

	public final Object zza(String s, Map map)
	{
		tionCallMacroCallback tioncallmacrocallback = zzazx.zzdc(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Container zzazx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Container$FunctionCallMacroCallback Container.zzdc(String)>
	//    4    8:astore_3        
		if(tioncallmacrocallback == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       15
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return tioncallmacrocallback.getValue(s, map);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokeinterface #32  <Method Object Container$FunctionCallMacroCallback.getValue(String, Map)>
	//   13   23:areturn         
	}

	private final Container zzazx;

	private Container$zza(Container container)
	{
		zzazx = container;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Container zzazx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Container$zza(Container container, zzu zzu)
	{
		this(container);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Container$zza(Container)>
	//    3    5:return          
	}
}
