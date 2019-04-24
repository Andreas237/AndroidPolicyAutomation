// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Dialog;

// Referenced classes of package com.google.android.gms.internal:
//			zzaae

class zzaae$zza$1 extends zzaaz.zza
{

	public void zzvE()
	{
		zzaAf.zzaAd.zzvD();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaae$zza zzaAf>
	//    2    4:getfield        #30  <Field zzaae zzaae$zza.zzaAd>
	//    3    7:invokevirtual   #33  <Method void zzaae.zzvD()>
		if(zzaAe.isShowing())
	//*   4   10:aload_0         
	//*   5   11:getfield        #22  <Field Dialog zzaAe>
	//*   6   14:invokevirtual   #39  <Method boolean Dialog.isShowing()>
	//*   7   17:ifeq            27
			zzaAe.dismiss();
	//    8   20:aload_0         
	//    9   21:getfield        #22  <Field Dialog zzaAe>
	//   10   24:invokevirtual   #42  <Method void Dialog.dismiss()>
	//   11   27:return          
	}

	final Dialog zzaAe;
	final zzaae.zza zzaAf;

	zzaae$zza$1(zzaae.zza zza1, Dialog dialog)
	{
		zzaAf = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaae$zza zzaAf>
		zzaAe = dialog;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Dialog zzaAe>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void zzaaz$zza()>
	//    8   14:return          
	}
}
