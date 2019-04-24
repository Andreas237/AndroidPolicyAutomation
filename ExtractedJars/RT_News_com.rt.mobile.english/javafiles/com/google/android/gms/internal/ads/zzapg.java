// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqa, zzapp, zzapz, zzapf

public abstract class zzapg extends TextureView
	implements zzaqa
{

	public zzapg(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void TextureView(Context)>
	//    3    5:aload_0         
	//    4    6:new             #20  <Class zzapp>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void zzapp()>
	//    7   13:putfield        #25  <Field zzapp zzcxk>
		zzcxl = new zzapz(context, ((zzaqa) (this)));
	//    8   16:aload_0         
	//    9   17:new             #27  <Class zzapz>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokespecial   #30  <Method void zzapz(Context, zzaqa)>
	//   14   26:putfield        #32  <Field zzapz zzcxl>
	//   15   29:return          
	}

	public abstract int getCurrentPosition();

	public abstract int getDuration();

	public abstract int getVideoHeight();

	public abstract int getVideoWidth();

	public abstract void pause();

	public abstract void play();

	public abstract void seekTo(int i);

	public abstract void setVideoPath(String s);

	public abstract void stop();

	public abstract void zza(float f, float f1);

	public abstract void zza(zzapf zzapf);

	public abstract String zzsp();

	public abstract void zzst();

	protected final zzapp zzcxk = new zzapp();
	protected final zzapz zzcxl;
}
