// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplay, CastDevice

public static final class CastRemoteDisplay$CastRemoteDisplayOptions$Builder
{

	public final CastRemoteDisplay.CastRemoteDisplayOptions build()
	{
		return new CastRemoteDisplay.CastRemoteDisplayOptions(this, ((zzo) (null)));
	//    0    0:new             #6   <Class CastRemoteDisplay$CastRemoteDisplayOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #42  <Method void CastRemoteDisplay$CastRemoteDisplayOptions(CastRemoteDisplay$CastRemoteDisplayOptions$Builder, zzo)>
	//    5    9:areturn         
	}

	public final CastRemoteDisplay$CastRemoteDisplayOptions$Builder setConfigPreset(int i)
	{
		zzbb = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int zzbb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	CastDevice zzai;
	int zzbb;
	 zzbc;

	public CastRemoteDisplay$CastRemoteDisplayOptions$Builder(CastDevice castdevice,  )
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		Preconditions.checkNotNull(((Object) (castdevice)), "CastDevice parameter cannot be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #24  <String "CastDevice parameter cannot be null">
	//    4    7:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		zzai = castdevice;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #32  <Field CastDevice zzai>
		zzbc = ;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #34  <Field CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzbc>
		zzbb = 2;
	//   12   21:aload_0         
	//   13   22:iconst_2        
	//   14   23:putfield        #36  <Field int zzbb>
	//   15   26:return          
	}
}
