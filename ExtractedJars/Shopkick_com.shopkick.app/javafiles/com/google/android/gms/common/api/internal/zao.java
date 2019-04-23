// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Dialog;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabr, zan, zal

final class zao extends zabr
{

	zao(zan zan1, Dialog dialog)
	{
		zadl = zan1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zan zadl>
		zadk = dialog;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Dialog zadk>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void zabr()>
	//    8   14:return          
	}

	public final void zas()
	{
		zadl.zadj.zaq();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zan zadl>
	//    2    4:getfield        #25  <Field zal zan.zadj>
	//    3    7:invokevirtual   #30  <Method void zal.zaq()>
		if(zadk.isShowing())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field Dialog zadk>
	//*   6   14:invokevirtual   #36  <Method boolean Dialog.isShowing()>
	//*   7   17:ifeq            27
			zadk.dismiss();
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field Dialog zadk>
	//   10   24:invokevirtual   #39  <Method void Dialog.dismiss()>
	//   11   27:return          
	}

	private final Dialog zadk;
	private final zan zadl;
}
