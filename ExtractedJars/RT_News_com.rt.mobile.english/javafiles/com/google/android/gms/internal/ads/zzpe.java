// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzpa

public final class zzpe
	implements zzv
{

	public zzpe(zzpa zzpa1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzyg = new WeakReference(((Object) (zzpa1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference zzyg>
		zzaae = s;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #26  <Field String zzaae>
	//   11   21:return          
	}

	public final void zza(Object obj, Map map)
	{
		String s = (String)map.get("ads_id");
	//    0    0:aload_2         
	//    1    1:ldc1            #33  <String "ads_id">
	//    2    3:invokeinterface #39  <Method Object Map.get(Object)>
	//    3    8:checkcast       #41  <Class String>
	//    4   11:astore_3        
		obj = ((Object) ((String)map.get("eventName")));
	//    5   12:aload_2         
	//    6   13:ldc1            #43  <String "eventName">
	//    7   15:invokeinterface #39  <Method Object Map.get(Object)>
	//    8   20:checkcast       #41  <Class String>
	//    9   23:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  10   24:aload_3         
	//*  11   25:invokestatic    #49  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   28:ifne            129
		{
			if(!zzaae.equals(((Object) (s))))
	//*  13   31:aload_0         
	//*  14   32:getfield        #26  <Field String zzaae>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  17   39:ifne            43
				return;
	//   18   42:return          
			try
			{
				Integer.parseInt((String)map.get("eventType"));
	//   19   43:aload_2         
	//   20   44:ldc1            #55  <String "eventType">
	//   21   46:invokeinterface #39  <Method Object Map.get(Object)>
	//   22   51:checkcast       #41  <Class String>
	//   23   54:invokestatic    #61  <Method int Integer.parseInt(String)>
	//   24   57:pop             
			}
	//*  25   58:goto            68
			// Misplaced declaration of an exception variable
			catch(Map map)
	//*  26   61:astore_2        
			{
				zzakb.zzb("Parse Scion log event type error", ((Throwable) (map)));
	//   27   62:ldc1            #63  <String "Parse Scion log event type error">
	//   28   64:aload_2         
	//   29   65:invokestatic    #69  <Method void zzakb.zzb(String, Throwable)>
			}
			if("_ai".equals(obj))
	//*  30   68:ldc1            #71  <String "_ai">
	//*  31   70:aload_1         
	//*  32   71:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  33   74:ifeq            99
			{
				obj = ((Object) ((zzpa)zzyg.get()));
	//   34   77:aload_0         
	//   35   78:getfield        #24  <Field WeakReference zzyg>
	//   36   81:invokevirtual   #74  <Method Object WeakReference.get()>
	//   37   84:checkcast       #76  <Class zzpa>
	//   38   87:astore_1        
				if(obj != null)
	//*  39   88:aload_1         
	//*  40   89:ifnull          98
					((zzpa) (obj)).zzbr();
	//   41   92:aload_1         
	//   42   93:invokeinterface #79  <Method void zzpa.zzbr()>
				return;
	//   43   98:return          
			}
			if("_ac".equals(obj))
	//*  44   99:ldc1            #81  <String "_ac">
	//*  45  101:aload_1         
	//*  46  102:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  47  105:ifeq            129
			{
				obj = ((Object) ((zzpa)zzyg.get()));
	//   48  108:aload_0         
	//   49  109:getfield        #24  <Field WeakReference zzyg>
	//   50  112:invokevirtual   #74  <Method Object WeakReference.get()>
	//   51  115:checkcast       #76  <Class zzpa>
	//   52  118:astore_1        
				if(obj != null)
	//*  53  119:aload_1         
	//*  54  120:ifnull          129
					((zzpa) (obj)).zzbs();
	//   55  123:aload_1         
	//   56  124:invokeinterface #84  <Method void zzpa.zzbs()>
			}
		}
	//   57  129:return          
	}

	private final String zzaae;
	private final WeakReference zzyg;
}
