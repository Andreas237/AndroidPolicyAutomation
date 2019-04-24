// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//			zzaax

class zzaax$1
	implements a
{

	public void zzat(boolean flag)
	{
		zzaax.zza(zzaCx).sendMessage(zzaax.zza(zzaCx).obtainMessage(1, ((Object) (Boolean.valueOf(flag)))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaax zzaCx>
	//    2    4:invokestatic    #26  <Method Handler zzaax.zza(zzaax)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field zzaax zzaCx>
	//    5   11:invokestatic    #26  <Method Handler zzaax.zza(zzaax)>
	//    6   14:iconst_1        
	//    7   15:iload_1         
	//    8   16:invokestatic    #32  <Method Boolean Boolean.valueOf(boolean)>
	//    9   19:invokevirtual   #38  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//   10   22:invokevirtual   #42  <Method boolean Handler.sendMessage(android.os.Message)>
	//   11   25:pop             
	//   12   26:return          
	}

	final zzaax zzaCx;

	zzaax$1(zzaax zzaax1)
	{
		zzaCx = zzaax1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaax zzaCx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
