// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaem, zzakb

public final class zzael extends AbstractSafeParcelable
{

	public zzael()
	{
		this(false, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #41  <Method List Collections.emptyList()>
	//    3    5:invokespecial   #44  <Method void zzael(boolean, List)>
	//    4    8:return          
	}

	public zzael(boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void AbstractSafeParcelable()>
		zzcfr = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #49  <Field boolean zzcfr>
		zzcfs = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field List zzcfs>
	//    8   14:return          
	}

	public static zzael zzl(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return new zzael();
	//    2    4:new             #2   <Class zzael>
	//    3    7:dup             
	//    4    8:invokespecial   #60  <Method void zzael()>
	//    5   11:areturn         
		JSONArray jsonarray = jsonobject.optJSONArray("reporting_urls");
	//    6   12:aload_0         
	//    7   13:ldc1            #62  <String "reporting_urls">
	//    8   15:invokevirtual   #68  <Method JSONArray JSONObject.optJSONArray(String)>
	//    9   18:astore_2        
		ArrayList arraylist = new ArrayList();
	//   10   19:new             #70  <Class ArrayList>
	//   11   22:dup             
	//   12   23:invokespecial   #71  <Method void ArrayList()>
	//   13   26:astore_3        
		if(jsonarray != null)
	//*  14   27:aload_2         
	//*  15   28:ifnull          70
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*  16   31:iconst_0        
	//*  17   32:istore_1        
	//*  18   33:iload_1         
	//*  19   34:aload_2         
	//*  20   35:invokevirtual   #77  <Method int JSONArray.length()>
	//*  21   38:icmpge          70
				try
				{
					arraylist.add(((Object) (jsonarray.getString(i))));
	//   22   41:aload_3         
	//   23   42:aload_2         
	//   24   43:iload_1         
	//   25   44:invokevirtual   #81  <Method String JSONArray.getString(int)>
	//   26   47:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   27   50:pop             
				}
	//*  28   51:goto            63
				catch(JSONException jsonexception)
	//*  29   54:astore          4
				{
					zzakb.zzc("Error grabbing url from json.", ((Throwable) (jsonexception)));
	//   30   56:ldc1            #87  <String "Error grabbing url from json.">
	//   31   58:aload           4
	//   32   60:invokestatic    #93  <Method void zzakb.zzc(String, Throwable)>
				}

	//   33   63:iload_1         
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:istore_1        
		}
	//*  37   67:goto            33
		return new zzael(jsonobject.optBoolean("enable_protection"), ((List) (arraylist)));
	//   38   70:new             #2   <Class zzael>
	//   39   73:dup             
	//   40   74:aload_0         
	//   41   75:ldc1            #95  <String "enable_protection">
	//   42   77:invokevirtual   #99  <Method boolean JSONObject.optBoolean(String)>
	//   43   80:aload_3         
	//   44   81:invokespecial   #44  <Method void zzael(boolean, List)>
	//   45   84:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #107 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 2, zzcfr);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field boolean zzcfr>
	//    7   11:invokestatic    #111 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 3, zzcfs, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #51  <Field List zzcfs>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #115 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #118 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaem();
	public final boolean zzcfr;
	public final List zzcfs;

	static 
	{
	//    0    0:new             #29  <Class zzaem>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzaem()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
