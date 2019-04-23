// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzii, zzib, zzhz, zzia

final class zzic extends zzii
{

	private zzic(zzhz zzhz)
	{
		zzaal = zzhz;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzhz zzaal>
		super(zzhz, ((zzia) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #14  <Method void zzii(zzhz, zzia)>
	//    7   11:return          
	}

	zzic(zzhz zzhz, zzia zzia)
	{
		this(zzhz);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzic(zzhz)>
	//    3    5:return          
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzib(zzaal, ((zzia) (null)))));
	//    0    0:new             #21  <Class zzib>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #11  <Field zzhz zzaal>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #22  <Method void zzib(zzhz, zzia)>
	//    6   12:areturn         
	}

	private final zzhz zzaal;
}
