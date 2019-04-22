// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.*;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			ListenerHolder

private final class ListenerHolder$zza extends Handler
{

	public final void handleMessage(Message message)
	{
		int i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #25  <Field int Message.what>
	//    2    4:istore_2        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(i != 1)
	//*   5    7:iload_2         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		Preconditions.checkArgument(flag);
	//   11   17:iload_3         
	//   12   18:invokestatic    #31  <Method void Preconditions.checkArgument(boolean)>
		zzlk.notifyListenerInternal((fier)message.obj);
	//   13   21:aload_0         
	//   14   22:getfield        #13  <Field ListenerHolder zzlk>
	//   15   25:aload_1         
	//   16   26:getfield        #35  <Field Object Message.obj>
	//   17   29:checkcast       #37  <Class ListenerHolder$Notifier>
	//   18   32:invokevirtual   #41  <Method void ListenerHolder.notifyListenerInternal(ListenerHolder$Notifier)>
	//   19   35:return          
	}

	private final ListenerHolder zzlk;

	public ListenerHolder$zza(ListenerHolder listenerholder, Looper looper)
	{
		zzlk = listenerholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ListenerHolder zzlk>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
