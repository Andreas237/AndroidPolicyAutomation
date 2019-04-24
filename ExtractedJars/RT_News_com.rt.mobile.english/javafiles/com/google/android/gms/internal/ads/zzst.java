// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakk, zztr, zzts, zztt

final class zzst
{

	zzst()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field List zzxo>
	//    7   15:return          
	}

	static List zza(zzst zzst1)
	{
		return zzst1.zzxo;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List zzxo>
	//    2    4:areturn         
	}

	final void zza(zztt zztt)
	{
		Handler handler = zzakk.zzcrm;
	//    0    0:getstatic       #27  <Field Handler zzakk.zzcrm>
	//    1    3:astore_2        
		for(Iterator iterator = zzxo.iterator(); iterator.hasNext(); handler.post(((Runnable) (new zztr(this, (zzts)iterator.next(), zztt)))));
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field List zzxo>
	//    4    8:invokeinterface #33  <Method Iterator List.iterator()>
	//    5   13:astore_3        
	//    6   14:aload_3         
	//    7   15:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            49
	//    9   23:aload_2         
	//   10   24:new             #41  <Class zztr>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:aload_3         
	//   14   30:invokeinterface #45  <Method Object Iterator.next()>
	//   15   35:checkcast       #47  <Class zzts>
	//   16   38:aload_1         
	//   17   39:invokespecial   #50  <Method void zztr(zzst, zzts, zztt)>
	//   18   42:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   19   45:pop             
	//*  20   46:goto            14
		zzxo.clear();
	//   21   49:aload_0         
	//   22   50:getfield        #17  <Field List zzxo>
	//   23   53:invokeinterface #59  <Method void List.clear()>
	//   24   58:return          
	}

	private final List zzxo = new ArrayList();
}
