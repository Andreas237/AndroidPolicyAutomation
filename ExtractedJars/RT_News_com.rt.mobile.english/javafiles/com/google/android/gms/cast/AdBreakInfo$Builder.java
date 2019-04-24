// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//			AdBreakInfo

public static class AdBreakInfo$Builder
{

	public AdBreakInfo build()
	{
		return new AdBreakInfo(zzq, zze, zzg, zzr, zzs, zzt);
	//    0    0:new             #6   <Class AdBreakInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field long zzq>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String zze>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field long zzg>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field boolean zzr>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field String[] zzs>
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field boolean zzt>
	//   14   28:invokespecial   #40  <Method void AdBreakInfo(long, String, long, boolean, String[], boolean)>
	//   15   31:areturn         
	}

	public AdBreakInfo$Builder setBreakClipIds(String as[])
	{
		zzs = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String[] zzs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakInfo$Builder setDurationInMs(long l)
	{
		zzg = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #28  <Field long zzg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakInfo$Builder setId(String s)
	{
		zze = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String zze>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakInfo$Builder setIsEmbedded(boolean flag)
	{
		zzt = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field boolean zzt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdBreakInfo$Builder setIsWatched(boolean flag)
	{
		zzr = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean zzr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zze;
	private long zzg;
	private long zzq;
	private boolean zzr;
	private String zzs[];
	private boolean zzt;

	public AdBreakInfo$Builder(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzq = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #24  <Field long zzq>
		zze = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #26  <Field String zze>
		zzg = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #28  <Field long zzg>
		zzr = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #30  <Field boolean zzr>
		zzt = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #32  <Field boolean zzt>
		zzs = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #34  <Field String[] zzs>
		zzq = l;
	//   20   34:aload_0         
	//   21   35:lload_1         
	//   22   36:putfield        #24  <Field long zzq>
	//   23   39:return          
	}
}
