// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzame, zzamf

public final class zzamd
{

	public static List zza(JSONArray jsonarray, List list)
		throws JSONException
	{
		list = ((List) (new ArrayList()));
	//    0    0:new             #26  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ArrayList()>
	//    3    7:astore_1        
		if(jsonarray == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return list;
	//    6   12:aload_1         
	//    7   13:areturn         
		for(int i = 0; i < jsonarray.length(); i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #33  <Method int JSONArray.length()>
	//*  13   21:icmpge          43
			list.add(((Object) (jsonarray.getString(i))));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #37  <Method String JSONArray.getString(int)>
	//   18   30:invokeinterface #43  <Method boolean List.add(Object)>
	//   19   35:pop             

	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
	//*  24   40:goto            16
		return list;
	//   25   43:aload_1         
	//   26   44:areturn         
	}

	private static final zzamf zzctr = new zzame();

	static 
	{
	//    0    0:new             #12  <Class zzame>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzame()>
	//    3    7:putstatic       #17  <Field zzamf zzctr>
	//*   4   10:return          
	}
}
