// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfq, zzfn, zzfs, zzfo

final class zzfr
	implements zzfq
{

	private zzfr(zzfn zzfn1)
	{
		zzbgl = zzfn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzfn zzbgl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		handler = new Handler(zzfn.zza(zzbgl).getMainLooper(), ((android.os.Handler.Callback) (new zzfs(this))));
	//    5    9:aload_0         
	//    6   10:new             #19  <Class Handler>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #14  <Field zzfn zzbgl>
	//   10   18:invokestatic    #25  <Method Context zzfn.zza(zzfn)>
	//   11   21:invokevirtual   #31  <Method android.os.Looper Context.getMainLooper()>
	//   12   24:new             #33  <Class zzfs>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #36  <Method void zzfs(zzfr)>
	//   16   32:invokespecial   #39  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   17   35:putfield        #41  <Field Handler handler>
	//   18   38:return          
	}

	zzfr(zzfn zzfn1, zzfo zzfo)
	{
		this(zzfn1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void zzfr(zzfn)>
	//    3    5:return          
	}

	private final Message obtainMessage()
	{
		return handler.obtainMessage(1, zzfn.zzqg());
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #51  <Method Object zzfn.zzqg()>
	//    4    8:invokevirtual   #54  <Method Message Handler.obtainMessage(int, Object)>
	//    5   11:areturn         
	}

	public final void cancel()
	{
		handler.removeMessages(1, zzfn.zzqg());
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #51  <Method Object zzfn.zzqg()>
	//    4    8:invokevirtual   #59  <Method void Handler.removeMessages(int, Object)>
	//    5   11:return          
	}

	public final void zzh(long l)
	{
		handler.removeMessages(1, zzfn.zzqg());
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #51  <Method Object zzfn.zzqg()>
	//    4    8:invokevirtual   #59  <Method void Handler.removeMessages(int, Object)>
		handler.sendMessageDelayed(obtainMessage(), l);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field Handler handler>
	//    7   15:aload_0         
	//    8   16:invokespecial   #63  <Method Message obtainMessage()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #67  <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void zzqh()
	{
		handler.removeMessages(1, zzfn.zzqg());
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #51  <Method Object zzfn.zzqg()>
	//    4    8:invokevirtual   #59  <Method void Handler.removeMessages(int, Object)>
		handler.sendMessage(obtainMessage());
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field Handler handler>
	//    7   15:aload_0         
	//    8   16:invokespecial   #63  <Method Message obtainMessage()>
	//    9   19:invokevirtual   #72  <Method boolean Handler.sendMessage(Message)>
	//   10   22:pop             
	//   11   23:return          
	}

	private Handler handler;
	final zzfn zzbgl;
}
