// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;


// Referenced classes of package com.google.android.gms.ads:
//			VideoOptions

public static final class VideoOptions$Builder
{

	static boolean zza(VideoOptions$Builder videooptions$builder)
	{
		return videooptions$builder.zzuz;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean zzuz>
	//    2    4:ireturn         
	}

	static boolean zzb(VideoOptions$Builder videooptions$builder)
	{
		return videooptions$builder.zzva;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean zzva>
	//    2    4:ireturn         
	}

	static boolean zzc(VideoOptions$Builder videooptions$builder)
	{
		return videooptions$builder.zzvb;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean zzvb>
	//    2    4:ireturn         
	}

	public final VideoOptions build()
	{
		return new VideoOptions(this, ((zzc) (null)));
	//    0    0:new             #6   <Class VideoOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #31  <Method void VideoOptions(VideoOptions$Builder, zzc)>
	//    5    9:areturn         
	}

	public final VideoOptions$Builder setClickToExpandRequested(boolean flag)
	{
		zzvb = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field boolean zzvb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final VideoOptions$Builder setCustomControlsRequested(boolean flag)
	{
		zzva = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field boolean zzva>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final VideoOptions$Builder setStartMuted(boolean flag)
	{
		zzuz = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean zzuz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean zzuz;
	private boolean zzva;
	private boolean zzvb;

	public VideoOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzuz = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #17  <Field boolean zzuz>
		zzva = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field boolean zzva>
		zzvb = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field boolean zzvb>
	//   11   19:return          
	}
}
