// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzai extends zzi
{

	public zzai()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzi()>
	//    2    4:return          
	}

	public final String toString()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #19  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("network", ((Object) (zzvd)));
	//    4    8:aload_1         
	//    5    9:ldc1            #22  <String "network">
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field String zzvd>
	//    8   15:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("action", ((Object) (zzve)));
	//   10   21:aload_1         
	//   11   22:ldc1            #32  <String "action">
	//   12   24:aload_0         
	//   13   25:getfield        #34  <Field String zzve>
	//   14   28:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		((Map) (hashmap)).put("target", ((Object) (zzvf)));
	//   16   34:aload_1         
	//   17   35:ldc1            #36  <String "target">
	//   18   37:aload_0         
	//   19   38:getfield        #38  <Field String zzvf>
	//   20   41:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   21   46:pop             
		return zza(((Object) (hashmap)));
	//   22   47:aload_1         
	//   23   48:invokestatic    #42  <Method String zza(Object)>
	//   24   51:areturn         
	}

	public final void zzb(zzi zzi1)
	{
		zzi1 = ((zzi) ((zzai)zzi1));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzai>
	//    2    4:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (zzvd))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field String zzvd>
	//*   5    9:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifne            23
			zzi1.zzvd = zzvd;
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field String zzvd>
	//   10   20:putfield        #24  <Field String zzvd>
		if(!TextUtils.isEmpty(((CharSequence) (zzve))))
	//*  11   23:aload_0         
	//*  12   24:getfield        #34  <Field String zzve>
	//*  13   27:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   30:ifne            41
			zzi1.zzve = zzve;
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field String zzve>
	//   18   38:putfield        #34  <Field String zzve>
		if(!TextUtils.isEmpty(((CharSequence) (zzvf))))
	//*  19   41:aload_0         
	//*  20   42:getfield        #38  <Field String zzvf>
	//*  21   45:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  22   48:ifne            59
			zzi1.zzvf = zzvf;
	//   23   51:aload_1         
	//   24   52:aload_0         
	//   25   53:getfield        #38  <Field String zzvf>
	//   26   56:putfield        #38  <Field String zzvf>
	//   27   59:return          
	}

	public String zzvd;
	public String zzve;
	public String zzvf;
}
