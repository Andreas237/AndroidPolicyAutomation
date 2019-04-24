// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznv, zznx

public final class zznw
{

	public zznw(zznx zznx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzvr = zznx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zznx zzvr>
	//    5    9:aload_0         
	//    6   10:new             #21  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void HashMap()>
	//    9   17:putfield        #24  <Field Map zzbgm>
	//   10   20:return          
	}

	public final void zza(String s, zznv zznv1)
	{
		zzbgm.put(((Object) (s)), ((Object) (zznv1)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zzbgm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public final void zza(String s, String s1, long l)
	{
		Object obj = ((Object) (zzvr));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zznx zzvr>
	//    2    4:astore          5
		s1 = ((String) ((zznv)zzbgm.get(((Object) (s1)))));
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field Map zzbgm>
	//    5   10:aload_2         
	//    6   11:invokeinterface #39  <Method Object Map.get(Object)>
	//    7   16:checkcast       #41  <Class zznv>
	//    8   19:astore_2        
		if(obj != null && s1 != null)
	//*   9   20:aload           5
	//*  10   22:ifnull          48
	//*  11   25:aload_2         
	//*  12   26:ifnonnull       32
	//*  13   29:goto            48
			((zznx) (obj)).zza(((zznv) (s1)), l, new String[] {
				s
			});
	//   14   32:aload           5
	//   15   34:aload_2         
	//   16   35:lload_3         
	//   17   36:iconst_1        
	//   18   37:anewarray       String[]
	//   19   40:dup             
	//   20   41:iconst_0        
	//   21   42:aload_1         
	//   22   43:aastore         
	//   23   44:invokevirtual   #48  <Method boolean zznx.zza(zznv, long, String[])>
	//   24   47:pop             
		obj = ((Object) (zzbgm));
	//   25   48:aload_0         
	//   26   49:getfield        #24  <Field Map zzbgm>
	//   27   52:astore          5
		s1 = ((String) (zzvr));
	//   28   54:aload_0         
	//   29   55:getfield        #19  <Field zznx zzvr>
	//   30   58:astore_2        
		if(s1 == null)
	//*  31   59:aload_2         
	//*  32   60:ifnonnull       68
			s1 = null;
	//   33   63:aconst_null     
	//   34   64:astore_2        
		else
	//*  35   65:goto            74
			s1 = ((String) (((zznx) (s1)).zzd(l)));
	//   36   68:aload_2         
	//   37   69:lload_3         
	//   38   70:invokevirtual   #52  <Method zznv zznx.zzd(long)>
	//   39   73:astore_2        
		((Map) (obj)).put(((Object) (s)), ((Object) (s1)));
	//   40   74:aload           5
	//   41   76:aload_1         
	//   42   77:aload_2         
	//   43   78:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   44   83:pop             
	//   45   84:return          
	}

	public final zznx zzji()
	{
		return zzvr;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zznx zzvr>
	//    2    4:areturn         
	}

	private final Map zzbgm = new HashMap();
	private final zznx zzvr;
}
