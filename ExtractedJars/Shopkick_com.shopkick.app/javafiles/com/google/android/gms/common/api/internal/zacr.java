// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zacs, BasePendingResult, zacq

final class zacr
	implements android.os.IBinder.DeathRecipient, zacs
{

	private zacr(BasePendingResult basependingresult, zac zac1, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zalc = new WeakReference(((Object) (zac1)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference zalc>
		zalb = new WeakReference(((Object) (basependingresult)));
	//    8   16:aload_0         
	//    9   17:new             #22  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #25  <Method void WeakReference(Object)>
	//   13   25:putfield        #29  <Field WeakReference zalb>
		zald = new WeakReference(((Object) (ibinder)));
	//   14   28:aload_0         
	//   15   29:new             #22  <Class WeakReference>
	//   16   32:dup             
	//   17   33:aload_3         
	//   18   34:invokespecial   #25  <Method void WeakReference(Object)>
	//   19   37:putfield        #31  <Field WeakReference zald>
	//   20   40:return          
	}

	zacr(BasePendingResult basependingresult, zac zac1, IBinder ibinder, zacq zacq)
	{
		this(basependingresult, ((zac) (null)), ibinder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_3         
	//    4    4:invokespecial   #37  <Method void zacr(BasePendingResult, zac, IBinder)>
	//    5    7:return          
	}

	private final void zaby()
	{
		Object obj = ((Object) ((BasePendingResult)zalb.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WeakReference zalb>
	//    2    4:invokevirtual   #44  <Method Object WeakReference.get()>
	//    3    7:checkcast       #46  <Class BasePendingResult>
	//    4   10:astore_1        
		zac zac1 = (zac)zalc.get();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field WeakReference zalc>
	//    7   15:invokevirtual   #44  <Method Object WeakReference.get()>
	//    8   18:checkcast       #48  <Class zac>
	//    9   21:astore_2        
		if(zac1 != null && obj != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          41
	//*  12   26:aload_1         
	//*  13   27:ifnull          41
			zac1.remove(((PendingResult) (obj)).zam().intValue());
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #54  <Method Integer PendingResult.zam()>
	//   17   35:invokevirtual   #60  <Method int Integer.intValue()>
	//   18   38:invokevirtual   #64  <Method void zac.remove(int)>
		obj = ((Object) ((IBinder)zald.get()));
	//   19   41:aload_0         
	//   20   42:getfield        #31  <Field WeakReference zald>
	//   21   45:invokevirtual   #44  <Method Object WeakReference.get()>
	//   22   48:checkcast       #66  <Class IBinder>
	//   23   51:astore_1        
		if(obj != null)
	//*  24   52:aload_1         
	//*  25   53:ifnull          66
			try
			{
				((IBinder) (obj)).unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:invokeinterface #70  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   30   64:pop             
				return;
	//   31   65:return          
			}
	//*  32   66:return          
			catch(NoSuchElementException nosuchelementexception)
	//*  33   67:astore_1        
			{
				return;
	//   34   68:return          
			}
		else
			return;
	}

	public final void binderDied()
	{
		zaby();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zaby()>
	//    2    4:return          
	}

	public final void zac(BasePendingResult basependingresult)
	{
		zaby();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zaby()>
	//    2    4:return          
	}

	private final WeakReference zalb;
	private final WeakReference zalc;
	private final WeakReference zald;
}
