// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzari, zzakb

final class zzarj
	implements zzv
{

	zzarj(zzari zzari1)
	{
		zzdec = zzari1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzari zzdec>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		if(map == null)
			break MISSING_BLOCK_LABEL_77;
	//    0    0:aload_2         
	//    1    1:ifnull          77
		obj = ((Object) ((String)map.get("height")));
	//    2    4:aload_2         
	//    3    5:ldc1            #23  <String "height">
	//    4    7:invokeinterface #29  <Method Object Map.get(Object)>
	//    5   12:checkcast       #31  <Class String>
	//    6   15:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_77;
	//    7   16:aload_1         
	//    8   17:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   20:ifne            77
		int i = Integer.parseInt(((String) (obj)));
	//   10   23:aload_1         
	//   11   24:invokestatic    #43  <Method int Integer.parseInt(String)>
	//   12   27:istore_3        
		synchronized(zzdec)
	//*  13   28:aload_0         
	//*  14   29:getfield        #13  <Field zzari zzdec>
	//*  15   32:astore_1        
	//*  16   33:aload_1         
	//*  17   34:monitorenter    
		{
			if(zzari.zza(zzdec) != i)
	//*  18   35:aload_0         
	//*  19   36:getfield        #13  <Field zzari zzdec>
	//*  20   39:invokestatic    #48  <Method int zzari.zza(zzari)>
	//*  21   42:iload_3         
	//*  22   43:icmpeq          62
			{
				zzari.zza(zzdec, i);
	//   23   46:aload_0         
	//   24   47:getfield        #13  <Field zzari zzdec>
	//   25   50:iload_3         
	//   26   51:invokestatic    #51  <Method int zzari.zza(zzari, int)>
	//   27   54:pop             
				zzdec.requestLayout();
	//   28   55:aload_0         
	//   29   56:getfield        #13  <Field zzari zzdec>
	//   30   59:invokevirtual   #54  <Method void zzari.requestLayout()>
			}
		}
	//   31   62:aload_1         
	//   32   63:monitorexit     
		return;
	//   33   64:return          
		map;
	//   34   65:astore_2        
		obj;
	//   35   66:aload_1         
		JVM INSTR monitorexit ;
	//   36   67:monitorexit     
		try
		{
			throw map;
	//   37   68:aload_2         
	//   38   69:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  39   70:astore_1        
		{
			zzakb.zzc("Exception occurred while getting webview content height", ((Throwable) (obj)));
	//   40   71:ldc1            #56  <String "Exception occurred while getting webview content height">
	//   41   73:aload_1         
	//   42   74:invokestatic    #62  <Method void zzakb.zzc(String, Throwable)>
		}
	//   43   77:return          
	}

	private final zzari zzdec;
}
