// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuo, zzwc, zzwb, zzup, 
//			zzakb

public final class zzwd
	implements zzuo, zzwc
{

	public zzwd(zzwb zzwb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzbqz = zzwb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzwb zzbqz>
	//    5    9:aload_0         
	//    6   10:new             #23  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void HashSet()>
	//    9   17:putfield        #26  <Field HashSet zzbra>
	//   10   20:return          
	}

	public final void zza(String s, zzv zzv1)
	{
		zzbqz.zza(s, zzv1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzwb zzbqz>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #33  <Method void zzwb.zza(String, zzv)>
		zzbra.add(((Object) (new java.util.AbstractMap.SimpleEntry(((Object) (s)), ((Object) (zzv1))))));
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field HashSet zzbra>
	//    7   15:new             #35  <Class java.util.AbstractMap$SimpleEntry>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #38  <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//   12   24:invokevirtual   #42  <Method boolean HashSet.add(Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public final void zza(String s, Map map)
	{
		zzup.zza(((zzuo) (this)), s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #50  <Method void zzup.zza(zzuo, String, Map)>
	//    4    6:return          
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		zzup.zzb(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #55  <Method void zzup.zzb(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzb(String s, zzv zzv1)
	{
		zzbqz.zzb(s, zzv1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzwb zzbqz>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #57  <Method void zzwb.zzb(String, zzv)>
		zzbra.remove(((Object) (new java.util.AbstractMap.SimpleEntry(((Object) (s)), ((Object) (zzv1))))));
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field HashSet zzbra>
	//    7   15:new             #35  <Class java.util.AbstractMap$SimpleEntry>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #38  <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//   12   24:invokevirtual   #60  <Method boolean HashSet.remove(Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public final void zzb(String s, JSONObject jsonobject)
	{
		zzup.zza(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #62  <Method void zzup.zza(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzbe(String s)
	{
		zzbqz.zzbe(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzwb zzbqz>
	//    2    4:aload_1         
	//    3    5:invokeinterface #66  <Method void zzwb.zzbe(String)>
	//    4   10:return          
	}

	public final void zzf(String s, String s1)
	{
		zzup.zza(((zzuo) (this)), s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #71  <Method void zzup.zza(zzuo, String, String)>
	//    4    6:return          
	}

	public final void zzmd()
	{
		java.util.AbstractMap.SimpleEntry simpleentry;
		for(Iterator iterator = zzbra.iterator(); iterator.hasNext(); zzbqz.zzb((String)simpleentry.getKey(), (zzv)simpleentry.getValue()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field HashSet zzbra>
	//*   2    4:invokevirtual   #76  <Method Iterator HashSet.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            98
		{
			simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #86  <Method Object Iterator.next()>
	//    9   23:checkcast       #35  <Class java.util.AbstractMap$SimpleEntry>
	//   10   26:astore_3        
			String s = String.valueOf(((Object) (((Object) ((zzv)simpleentry.getValue())).toString())));
	//   11   27:aload_3         
	//   12   28:invokevirtual   #89  <Method Object java.util.AbstractMap$SimpleEntry.getValue()>
	//   13   31:checkcast       #91  <Class zzv>
	//   14   34:invokevirtual   #95  <Method String Object.toString()>
	//   15   37:invokestatic    #101 <Method String String.valueOf(Object)>
	//   16   40:astore_1        
			if(s.length() != 0)
	//*  17   41:aload_1         
	//*  18   42:invokevirtual   #105 <Method int String.length()>
	//*  19   45:ifeq            58
				s = "Unregistering eventhandler: ".concat(s);
	//   20   48:ldc1            #107 <String "Unregistering eventhandler: ">
	//   21   50:aload_1         
	//   22   51:invokevirtual   #111 <Method String String.concat(String)>
	//   23   54:astore_1        
			else
	//*  24   55:goto            68
				s = new String("Unregistering eventhandler: ");
	//   25   58:new             #97  <Class String>
	//   26   61:dup             
	//   27   62:ldc1            #107 <String "Unregistering eventhandler: ">
	//   28   64:invokespecial   #113 <Method void String(String)>
	//   29   67:astore_1        
			zzakb.v(s);
	//   30   68:aload_1         
	//   31   69:invokestatic    #118 <Method void zzakb.v(String)>
		}

	//   32   72:aload_0         
	//   33   73:getfield        #21  <Field zzwb zzbqz>
	//   34   76:aload_3         
	//   35   77:invokevirtual   #121 <Method Object java.util.AbstractMap$SimpleEntry.getKey()>
	//   36   80:checkcast       #97  <Class String>
	//   37   83:aload_3         
	//   38   84:invokevirtual   #89  <Method Object java.util.AbstractMap$SimpleEntry.getValue()>
	//   39   87:checkcast       #91  <Class zzv>
	//   40   90:invokeinterface #57  <Method void zzwb.zzb(String, zzv)>
	//*  41   95:goto            8
		zzbra.clear();
	//   42   98:aload_0         
	//   43   99:getfield        #26  <Field HashSet zzbra>
	//   44  102:invokevirtual   #124 <Method void HashSet.clear()>
	//   45  105:return          
	}

	private final zzwb zzbqz;
	private final HashSet zzbra = new HashSet();
}
