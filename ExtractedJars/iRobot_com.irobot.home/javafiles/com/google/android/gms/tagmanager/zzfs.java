// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfn, zzfr, zzfm

final class zzfs
	implements android.os.Handler.Callback
{

	zzfs(zzfr zzfr1)
	{
		zzbgm = zzfr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzfr zzbgm>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final boolean handleMessage(Message message)
	{
		if(1 == message.what && zzfn.zzqg().equals(message.obj))
	//*   0    0:iconst_1        
	//*   1    1:aload_1         
	//*   2    2:getfield        #24  <Field int Message.what>
	//*   3    5:icmpne          62
	//*   4    8:invokestatic    #30  <Method Object zzfn.zzqg()>
	//*   5   11:aload_1         
	//*   6   12:getfield        #34  <Field Object Message.obj>
	//*   7   15:invokevirtual   #38  <Method boolean Object.equals(Object)>
	//*   8   18:ifeq            62
		{
			((zzfm) (zzbgm.zzbgl)).dispatch();
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field zzfr zzbgm>
	//   11   25:getfield        #44  <Field zzfn zzfr.zzbgl>
	//   12   28:invokevirtual   #49  <Method void zzfm.dispatch()>
			if(!zzfn.zzb(zzbgm.zzbgl))
	//*  13   31:aload_0         
	//*  14   32:getfield        #12  <Field zzfr zzbgm>
	//*  15   35:getfield        #44  <Field zzfn zzfr.zzbgl>
	//*  16   38:invokestatic    #53  <Method boolean zzfn.zzb(zzfn)>
	//*  17   41:ifne            62
				zzbgm.zzh(zzfn.zzc(zzbgm.zzbgl));
	//   18   44:aload_0         
	//   19   45:getfield        #12  <Field zzfr zzbgm>
	//   20   48:aload_0         
	//   21   49:getfield        #12  <Field zzfr zzbgm>
	//   22   52:getfield        #44  <Field zzfn zzfr.zzbgl>
	//   23   55:invokestatic    #57  <Method int zzfn.zzc(zzfn)>
	//   24   58:i2l             
	//   25   59:invokevirtual   #61  <Method void zzfr.zzh(long)>
		}
		return true;
	//   26   62:iconst_1        
	//   27   63:ireturn         
	}

	private final zzfr zzbgm;
}
