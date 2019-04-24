// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			MediaLoadOptions

public static class MediaLoadOptions$Builder
{

	public MediaLoadOptions build()
	{
		return new MediaLoadOptions(zzdj, zzdk, zzdl, zzdm, zzp, zzdn, zzdo, ((zzaj) (null)));
	//    0    0:new             #6   <Class MediaLoadOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field boolean zzdj>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field long zzdk>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field double zzdl>
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field long[] zzdm>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field JSONObject zzp>
	//   12   24:aload_0         
	//   13   25:getfield        #36  <Field String zzdn>
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field String zzdo>
	//   16   32:aconst_null     
	//   17   33:invokespecial   #44  <Method void MediaLoadOptions(boolean, long, double, long[], JSONObject, String, String, zzaj)>
	//   18   36:areturn         
	}

	public MediaLoadOptions$Builder setActiveTrackIds(long al[])
	{
		zzdm = al;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field long[] zzdm>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setAutoplay(boolean flag)
	{
		zzdj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean zzdj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setCredentials(String s)
	{
		zzdn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String zzdn>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setCredentialsType(String s)
	{
		zzdo = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String zzdo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setCustomData(JSONObject jsonobject)
	{
		zzp = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field JSONObject zzp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setPlayPosition(long l)
	{
		zzdk = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #28  <Field long zzdk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaLoadOptions$Builder setPlaybackRate(double d)
	{
		if(Double.compare(d, 2D) <= 0 && Double.compare(d, 0.5D) >= 0)
	//*   0    0:dload_1         
	//*   1    1:ldc2w           #58  <Double 2D>
	//*   2    4:invokestatic    #65  <Method int Double.compare(double, double)>
	//*   3    7:ifgt            30
	//*   4   10:dload_1         
	//*   5   11:ldc2w           #66  <Double 0.5D>
	//*   6   14:invokestatic    #65  <Method int Double.compare(double, double)>
	//*   7   17:ifge            23
	//*   8   20:goto            30
		{
			zzdl = d;
	//    9   23:aload_0         
	//   10   24:dload_1         
	//   11   25:putfield        #30  <Field double zzdl>
			return this;
	//   12   28:aload_0         
	//   13   29:areturn         
		} else
		{
			throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
	//   14   30:new             #69  <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc1            #71  <String "playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX">
	//   17   36:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
		}
	}

	private boolean zzdj;
	private long zzdk;
	private double zzdl;
	private long zzdm[];
	private String zzdn;
	private String zzdo;
	private JSONObject zzp;

	public MediaLoadOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzdj = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #26  <Field boolean zzdj>
		zzdk = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #28  <Field long zzdk>
		zzdl = 1.0D;
	//    8   14:aload_0         
	//    9   15:dconst_1        
	//   10   16:putfield        #30  <Field double zzdl>
		zzdm = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #32  <Field long[] zzdm>
		zzp = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #34  <Field JSONObject zzp>
		zzdn = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #36  <Field String zzdn>
		zzdo = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #38  <Field String zzdo>
	//   23   39:return          
	}
}
