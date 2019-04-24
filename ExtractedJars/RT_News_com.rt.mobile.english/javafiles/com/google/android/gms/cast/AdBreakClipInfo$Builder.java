// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//			AdBreakClipInfo, VastAdsRequest

public static class AdBreakClipInfo$Builder
{

	public AdBreakClipInfo build()
	{
		return new AdBreakClipInfo(zze, zzf, zzg, zzh, mimeType, zzi, zzj, zzk, zzl, zzm, zzn, zzo);
	//    0    0:new             #6   <Class AdBreakClipInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field String zze>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field String zzf>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field long zzg>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field String zzh>
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field String mimeType>
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field String zzi>
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field String zzj>
	//   16   32:aload_0         
	//   17   33:getfield        #44  <Field String zzk>
	//   18   36:aload_0         
	//   19   37:getfield        #46  <Field String zzl>
	//   20   40:aload_0         
	//   21   41:getfield        #50  <Field long zzm>
	//   22   44:aload_0         
	//   23   45:getfield        #57  <Field String zzn>
	//   24   48:aload_0         
	//   25   49:getfield        #52  <Field VastAdsRequest zzo>
	//   26   52:invokespecial   #60  <Method void AdBreakClipInfo(String, String, long, String, String, String, String, String, String, long, String, VastAdsRequest)>
	//   27   55:areturn         
	}

	public AdBreakClipInfo$Builder setClickThroughUrl(String s)
	{
		zzi = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String zzi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setContentId(String s)
	{
		zzk = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String zzk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setContentUrl(String s)
	{
		zzh = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String zzh>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setCustomDataJsonString(String s)
	{
		zzj = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String zzj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setDurationInMs(long l)
	{
		zzg = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #34  <Field long zzg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setHlsSegmentFormat(String s)
	{
		zzn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String zzn>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setImageUrl(String s)
	{
		zzl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String zzl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setMimeType(String s)
	{
		mimeType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String mimeType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setTitle(String s)
	{
		zzf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String zzf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setVastAdsRequest(VastAdsRequest vastadsrequest)
	{
		zzo = vastadsrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field VastAdsRequest zzo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakClipInfo$Builder setWhenSkippableInMs(long l)
	{
		zzm = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #50  <Field long zzm>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String mimeType;
	private String zze;
	private String zzf;
	private long zzg;
	private String zzh;
	private String zzi;
	private String zzj;
	private String zzk;
	private String zzl;
	private long zzm;
	private String zzn;
	private VastAdsRequest zzo;

	public AdBreakClipInfo$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zze = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field String zze>
		zzf = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #32  <Field String zzf>
		zzg = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #34  <Field long zzg>
		zzh = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #36  <Field String zzh>
		mimeType = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #38  <Field String mimeType>
		zzi = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #40  <Field String zzi>
		zzj = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #42  <Field String zzj>
		zzk = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #44  <Field String zzk>
		zzl = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #46  <Field String zzl>
		zzm = -1L;
	//   29   49:aload_0         
	//   30   50:ldc2w           #47  <Long -1L>
	//   31   53:putfield        #50  <Field long zzm>
		zzo = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #52  <Field VastAdsRequest zzo>
		zze = s;
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:putfield        #30  <Field String zze>
	//   38   66:return          
	}
}
