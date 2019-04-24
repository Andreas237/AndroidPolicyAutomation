// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzair, zzamd

public final class zzaiq extends AbstractSafeParcelable
{

	public zzaiq(String s, String s1, boolean flag, boolean flag1, List list, boolean flag2, boolean flag3, 
			List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbstractSafeParcelable()>
		zzcnd = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field String zzcnd>
		zzcne = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #54  <Field String zzcne>
		zzcnf = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #56  <Field boolean zzcnf>
		zzcng = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #58  <Field boolean zzcng>
		zzcnh = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #60  <Field List zzcnh>
		zzcni = flag2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #62  <Field boolean zzcni>
		zzcnj = flag3;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #64  <Field boolean zzcnj>
		s = ((String) (list1));
	//   23   43:aload           8
	//   24   45:astore_1        
		if(list1 == null)
	//*  25   46:aload           8
	//*  26   48:ifnonnull       59
			s = ((String) (new ArrayList()));
	//   27   51:new             #66  <Class ArrayList>
	//   28   54:dup             
	//   29   55:invokespecial   #67  <Method void ArrayList()>
	//   30   58:astore_1        
		zzcnk = ((List) (s));
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:putfield        #69  <Field List zzcnk>
	//   34   64:return          
	}

	public static zzaiq zzo(JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			String s = jsonobject.optString("click_string", "");
	//    4    6:aload_0         
	//    5    7:ldc1            #80  <String "click_string">
	//    6    9:ldc1            #82  <String "">
	//    7   11:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
	//    8   14:astore_3        
			String s1 = jsonobject.optString("report_url", "");
	//    9   15:aload_0         
	//   10   16:ldc1            #90  <String "report_url">
	//   11   18:ldc1            #82  <String "">
	//   12   20:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
	//   13   23:astore          4
			boolean flag = jsonobject.optBoolean("rendered_ad_enabled", false);
	//   14   25:aload_0         
	//   15   26:ldc1            #92  <String "rendered_ad_enabled">
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   18   32:istore_1        
			boolean flag1 = jsonobject.optBoolean("non_malicious_reporting_enabled", false);
	//   19   33:aload_0         
	//   20   34:ldc1            #98  <String "non_malicious_reporting_enabled">
	//   21   36:iconst_0        
	//   22   37:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   23   40:istore_2        
			List list = zzamd.zza(jsonobject.optJSONArray("allowed_headers"), ((List) (null)));
	//   24   41:aload_0         
	//   25   42:ldc1            #100 <String "allowed_headers">
	//   26   44:invokevirtual   #104 <Method org.json.JSONArray JSONObject.optJSONArray(String)>
	//   27   47:aconst_null     
	//   28   48:invokestatic    #110 <Method List zzamd.zza(org.json.JSONArray, List)>
	//   29   51:astore          5
			List list1 = zzamd.zza(jsonobject.optJSONArray("webview_permissions"), ((List) (null)));
	//   30   53:aload_0         
	//   31   54:ldc1            #112 <String "webview_permissions">
	//   32   56:invokevirtual   #104 <Method org.json.JSONArray JSONObject.optJSONArray(String)>
	//   33   59:aconst_null     
	//   34   60:invokestatic    #110 <Method List zzamd.zza(org.json.JSONArray, List)>
	//   35   63:astore          6
			return new zzaiq(s, s1, flag, flag1, list, jsonobject.optBoolean("protection_enabled", false), jsonobject.optBoolean("malicious_reporting_enabled", false), list1);
	//   36   65:new             #2   <Class zzaiq>
	//   37   68:dup             
	//   38   69:aload_3         
	//   39   70:aload           4
	//   40   72:iload_1         
	//   41   73:iload_2         
	//   42   74:aload           5
	//   43   76:aload_0         
	//   44   77:ldc1            #114 <String "protection_enabled">
	//   45   79:iconst_0        
	//   46   80:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   47   83:aload_0         
	//   48   84:ldc1            #116 <String "malicious_reporting_enabled">
	//   49   86:iconst_0        
	//   50   87:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   51   90:aload           6
	//   52   92:invokespecial   #118 <Method void zzaiq(String, String, boolean, boolean, List, boolean, boolean, List)>
	//   53   95:areturn         
		}
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #127 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzcnd, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #52  <Field String zzcnd>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #131 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zzcne, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #54  <Field String zzcne>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #131 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzcnf);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #56  <Field boolean zzcnf>
	//   19   31:invokestatic    #135 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, zzcng);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:getfield        #58  <Field boolean zzcng>
	//   24   40:invokestatic    #135 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 6, zzcnh, false);
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:getfield        #60  <Field List zzcnh>
	//   29   50:iconst_0        
	//   30   51:invokestatic    #139 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 7, zzcni);
	//   31   54:aload_1         
	//   32   55:bipush          7
	//   33   57:aload_0         
	//   34   58:getfield        #62  <Field boolean zzcni>
	//   35   61:invokestatic    #135 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzcnj);
	//   36   64:aload_1         
	//   37   65:bipush          8
	//   38   67:aload_0         
	//   39   68:getfield        #64  <Field boolean zzcnj>
	//   40   71:invokestatic    #135 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 9, zzcnk, false);
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:getfield        #69  <Field List zzcnk>
	//   45   81:iconst_0        
	//   46   82:invokestatic    #139 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   47   85:aload_1         
	//   48   86:iload_2         
	//   49   87:invokestatic    #142 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   50   90:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzair();
	public final String zzcnd;
	public final String zzcne;
	public final boolean zzcnf;
	public final boolean zzcng;
	public final List zzcnh;
	public final boolean zzcni;
	public final boolean zzcnj;
	public final List zzcnk;

	static 
	{
	//    0    0:new             #40  <Class zzair>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void zzair()>
	//    3    7:putstatic       #45  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
