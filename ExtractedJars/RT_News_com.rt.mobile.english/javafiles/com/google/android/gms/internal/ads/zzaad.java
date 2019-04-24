// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzakq, zzaqw

public final class zzaad
{

	public zzaad(zzaqw zzaqw1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzbnd = zzaqw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzaqw zzbnd>
		zzbwn = (String)map.get("forceOrientation");
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:ldc1            #20  <String "forceOrientation">
	//    8   13:invokeinterface #26  <Method Object Map.get(Object)>
	//    9   18:checkcast       #28  <Class String>
	//   10   21:putfield        #30  <Field String zzbwn>
		boolean flag;
		if(map.containsKey("allowOrientationChange"))
	//*  11   24:aload_2         
	//*  12   25:ldc1            #32  <String "allowOrientationChange">
	//*  13   27:invokeinterface #36  <Method boolean Map.containsKey(Object)>
	//*  14   32:ifeq            56
			flag = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
	//   15   35:aload_2         
	//   16   36:ldc1            #32  <String "allowOrientationChange">
	//   17   38:invokeinterface #26  <Method Object Map.get(Object)>
	//   18   43:checkcast       #28  <Class String>
	//   19   46:invokestatic    #42  <Method boolean Boolean.parseBoolean(String)>
	//   20   49:istore_3        
		else
	//*  21   50:aload_0         
	//*  22   51:iload_3         
	//*  23   52:putfield        #44  <Field boolean zzbwm>
	//*  24   55:return          
			flag = true;
	//   25   56:iconst_1        
	//   26   57:istore_3        
		zzbwm = flag;
	//*  27   58:goto            50
	}

	public final void execute()
	{
		if(zzbnd == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field zzaqw zzbnd>
	//*   2    4:ifnonnull       13
		{
			zzakb.zzdk("AdWebView is null");
	//    3    7:ldc1            #50  <String "AdWebView is null">
	//    4    9:invokestatic    #56  <Method void zzakb.zzdk(String)>
			return;
	//    5   12:return          
		}
		int i;
		if("portrait".equalsIgnoreCase(zzbwn))
	//*   6   13:ldc1            #58  <String "portrait">
	//*   7   15:aload_0         
	//*   8   16:getfield        #30  <Field String zzbwn>
	//*   9   19:invokevirtual   #61  <Method boolean String.equalsIgnoreCase(String)>
	//*  10   22:ifeq            35
			i = zzbv.zzem().zzrm();
	//   11   25:invokestatic    #67  <Method zzakq zzbv.zzem()>
	//   12   28:invokevirtual   #73  <Method int zzakq.zzrm()>
	//   13   31:istore_1        
		else
	//*  14   32:goto            76
		if("landscape".equalsIgnoreCase(zzbwn))
	//*  15   35:ldc1            #75  <String "landscape">
	//*  16   37:aload_0         
	//*  17   38:getfield        #30  <Field String zzbwn>
	//*  18   41:invokevirtual   #61  <Method boolean String.equalsIgnoreCase(String)>
	//*  19   44:ifeq            57
			i = zzbv.zzem().zzrl();
	//   20   47:invokestatic    #67  <Method zzakq zzbv.zzem()>
	//   21   50:invokevirtual   #78  <Method int zzakq.zzrl()>
	//   22   53:istore_1        
		else
	//*  23   54:goto            76
		if(zzbwm)
	//*  24   57:aload_0         
	//*  25   58:getfield        #44  <Field boolean zzbwm>
	//*  26   61:ifeq            69
			i = -1;
	//   27   64:iconst_m1       
	//   28   65:istore_1        
		else
	//*  29   66:goto            76
			i = zzbv.zzem().zzrn();
	//   30   69:invokestatic    #67  <Method zzakq zzbv.zzem()>
	//   31   72:invokevirtual   #81  <Method int zzakq.zzrn()>
	//   32   75:istore_1        
		zzbnd.setRequestedOrientation(i);
	//   33   76:aload_0         
	//   34   77:getfield        #18  <Field zzaqw zzbnd>
	//   35   80:iload_1         
	//   36   81:invokeinterface #87  <Method void zzaqw.setRequestedOrientation(int)>
	//   37   86:return          
	}

	private final zzaqw zzbnd;
	private final boolean zzbwm;
	private final String zzbwn;
}
