// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.tagmanager.zzgj;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzri, zzb, zzp, zzrk, 
//			zzrh, zzrm

public final class zzrl
{

	private zzrl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzbox = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List zzbox>
		zzboy = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #26  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void HashMap()>
	//   11   23:putfield        #29  <Field Map zzboy>
		version = "";
	//   12   26:aload_0         
	//   13   27:ldc1            #31  <String "">
	//   14   29:putfield        #33  <Field String version>
		zzph = 0;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #35  <Field int zzph>
	//   18   37:return          
	}

	zzrl(zzrh zzrh)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zzrl()>
	//    2    4:return          
	}

	public final zzrl zzah(int i)
	{
		zzph = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int zzph>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzrl zzb(zzrm zzrm)
	{
		zzbox.add(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List zzbox>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final zzrl zzc(zzri zzri1)
	{
		String s = zzgj.zzc((zzp)zzri1.zzsi().get(((Object) (zzb.zzil.toString()))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method Map zzri.zzsi()>
	//    2    4:getstatic       #62  <Field zzb zzb.zzil>
	//    3    7:invokevirtual   #66  <Method String zzb.toString()>
	//    4   10:invokeinterface #72  <Method Object Map.get(Object)>
	//    5   15:checkcast       #74  <Class zzp>
	//    6   18:invokestatic    #79  <Method String zzgj.zzc(zzp)>
	//    7   21:astore          4
		List list = (List)zzboy.get(((Object) (s)));
	//    8   23:aload_0         
	//    9   24:getfield        #29  <Field Map zzboy>
	//   10   27:aload           4
	//   11   29:invokeinterface #72  <Method Object Map.get(Object)>
	//   12   34:checkcast       #44  <Class List>
	//   13   37:astore_3        
		Object obj = ((Object) (list));
	//   14   38:aload_3         
	//   15   39:astore_2        
		if(list == null)
	//*  16   40:aload_3         
	//*  17   41:ifnonnull       65
		{
			obj = ((Object) (new ArrayList()));
	//   18   44:new             #21  <Class ArrayList>
	//   19   47:dup             
	//   20   48:invokespecial   #22  <Method void ArrayList()>
	//   21   51:astore_2        
			zzboy.put(((Object) (s)), obj);
	//   22   52:aload_0         
	//   23   53:getfield        #29  <Field Map zzboy>
	//   24   56:aload           4
	//   25   58:aload_2         
	//   26   59:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   27   64:pop             
		}
		((List) (obj)).add(((Object) (zzri1)));
	//   28   65:aload_2         
	//   29   66:aload_1         
	//   30   67:invokeinterface #48  <Method boolean List.add(Object)>
	//   31   72:pop             
		return this;
	//   32   73:aload_0         
	//   33   74:areturn         
	}

	public final zzrl zzfi(String s)
	{
		version = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String version>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzrk zztd()
	{
		return new zzrk(zzbox, zzboy, version, zzph, ((zzrh) (null)));
	//    0    0:new             #89  <Class zzrk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field List zzbox>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Map zzboy>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field String version>
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field int zzph>
	//   10   20:aconst_null     
	//   11   21:invokespecial   #92  <Method void zzrk(List, Map, String, int, zzrh)>
	//   12   24:areturn         
	}

	private String version;
	private final List zzbox;
	private final Map zzboy;
	private int zzph;
}
