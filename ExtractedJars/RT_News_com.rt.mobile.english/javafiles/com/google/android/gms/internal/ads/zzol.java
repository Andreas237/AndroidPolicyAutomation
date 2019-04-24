// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzok, zzakb, zzro, zzane

final class zzol
	implements zzv
{

	zzol(zzok zzok1)
	{
		zzbhr = zzok1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzok zzbhr>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		try
		{
			zzbhr.zzbhp = Long.valueOf(Long.parseLong((String)map.get("timestamp")));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzok zzbhr>
	//    2    4:aload_2         
	//    3    5:ldc1            #25  <String "timestamp">
	//    4    7:invokeinterface #31  <Method Object Map.get(Object)>
	//    5   12:checkcast       #33  <Class String>
	//    6   15:invokestatic    #39  <Method long Long.parseLong(String)>
	//    7   18:invokestatic    #43  <Method Long Long.valueOf(long)>
	//    8   21:putfield        #49  <Field Long zzok.zzbhp>
		}
	//*   9   24:goto            32
	//*  10   27:ldc1            #51  <String "Failed to call parse unconfirmedClickTimestamp.">
	//*  11   29:invokestatic    #57  <Method void zzakb.e(String)>
	//*  12   32:aload_0         
	//*  13   33:getfield        #13  <Field zzok zzbhr>
	//*  14   36:aload_2         
	//*  15   37:ldc1            #59  <String "id">
	//*  16   39:invokeinterface #31  <Method Object Map.get(Object)>
	//*  17   44:checkcast       #33  <Class String>
	//*  18   47:putfield        #63  <Field String zzok.zzbho>
	//*  19   50:aload_2         
	//*  20   51:ldc1            #65  <String "asset_id">
	//*  21   53:invokeinterface #31  <Method Object Map.get(Object)>
	//*  22   58:checkcast       #33  <Class String>
	//*  23   61:astore_1        
	//*  24   62:aload_0         
	//*  25   63:getfield        #13  <Field zzok zzbhr>
	//*  26   66:invokestatic    #68  <Method zzro zzok.zza(zzok)>
	//*  27   69:ifnonnull       78
	//*  28   72:ldc1            #70  <String "Received unconfirmed click but UnconfirmedClickListener is null.">
	//*  29   74:invokestatic    #73  <Method void zzakb.zzck(String)>
	//*  30   77:return          
	//*  31   78:aload_0         
	//*  32   79:getfield        #13  <Field zzok zzbhr>
	//*  33   82:invokestatic    #68  <Method zzro zzok.zza(zzok)>
	//*  34   85:aload_1         
	//*  35   86:invokeinterface #78  <Method void zzro.onUnconfirmedClickReceived(String)>
	//*  36   91:return          
	//*  37   92:astore_1        
	//*  38   93:ldc1            #80  <String "#007 Could not call remote method.">
	//*  39   95:aload_1         
	//*  40   96:invokestatic    #86  <Method void zzane.zzd(String, Throwable)>
	//*  41   99:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			zzakb.e("Failed to call parse unconfirmedClickTimestamp.");
		}
		zzbhr.zzbho = (String)map.get("id");
		obj = ((Object) ((String)map.get("asset_id")));
		if(zzok.zza(zzbhr) == null)
		{
			zzakb.zzck("Received unconfirmed click but UnconfirmedClickListener is null.");
			return;
		}
		try
		{
			zzok.zza(zzbhr).onUnconfirmedClickReceived(((String) (obj)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (obj)));
		}
	//*  42  100:astore_1        
	//*  43  101:goto            27
	}

	private final zzok zzbhr;
}
