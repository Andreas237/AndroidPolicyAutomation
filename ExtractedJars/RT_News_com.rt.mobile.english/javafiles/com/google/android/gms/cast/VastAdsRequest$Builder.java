// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//			VastAdsRequest

public static class VastAdsRequest$Builder
{

	public VastAdsRequest build()
	{
		return new VastAdsRequest(zzgl, zzgm);
	//    0    0:new             #6   <Class VastAdsRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String zzgl>
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field String zzgm>
	//    6   12:invokespecial   #24  <Method void VastAdsRequest(String, String)>
	//    7   15:areturn         
	}

	public VastAdsRequest$Builder setAdTagUrl(String s)
	{
		zzgl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String zzgl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public VastAdsRequest$Builder setAdsResponse(String s)
	{
		zzgm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String zzgm>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zzgl;
	private String zzgm;

	public VastAdsRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzgl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field String zzgl>
		zzgm = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field String zzgm>
	//    8   14:return          
	}
}
