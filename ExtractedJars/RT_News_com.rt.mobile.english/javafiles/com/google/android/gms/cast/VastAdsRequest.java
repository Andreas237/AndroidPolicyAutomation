// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzbs

public class VastAdsRequest extends AbstractSafeParcelable
{
	public static class Builder
	{

		public VastAdsRequest build()
		{
			return new VastAdsRequest(zzgl, zzgm);
		//    0    0:new             #6   <Class VastAdsRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field String zzgl>
		//    4    8:aload_0         
		//    5    9:getfield        #18  <Field String zzgm>
		//    6   12:invokespecial   #24  <Method void VastAdsRequest(String, String)>
		//    7   15:areturn         
		}

		public Builder setAdTagUrl(String s)
		{
			zzgl = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field String zzgl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setAdsResponse(String s)
		{
			zzgm = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field String zzgm>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String zzgl;
		private String zzgm;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzgl = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #16  <Field String zzgl>
			zzgm = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #18  <Field String zzgm>
		//    8   14:return          
		}
	}


	VastAdsRequest(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		zzgl = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field String zzgl>
		zzgm = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field String zzgm>
	//    8   14:return          
	}

	public static VastAdsRequest fromJson(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new VastAdsRequest(jsonobject.optString("adTagUrl", ((String) (null))), jsonobject.optString("adsResponse", ((String) (null))));
	//    4    6:new             #2   <Class VastAdsRequest>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:ldc1            #50  <String "adTagUrl">
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #56  <Method String JSONObject.optString(String, String)>
	//   10   17:aload_0         
	//   11   18:ldc1            #58  <String "adsResponse">
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #56  <Method String JSONObject.optString(String, String)>
	//   14   24:invokespecial   #60  <Method void VastAdsRequest(String, String)>
	//   15   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof VastAdsRequest))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class VastAdsRequest>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((VastAdsRequest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class VastAdsRequest>
	//   12   20:astore_1        
		return zzcu.zza(((Object) (zzgl)), ((Object) (((VastAdsRequest) (obj)).zzgl))) && zzcu.zza(((Object) (zzgm)), ((Object) (((VastAdsRequest) (obj)).zzgm)));
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field String zzgl>
	//   15   25:aload_1         
	//   16   26:getfield        #42  <Field String zzgl>
	//   17   29:invokestatic    #68  <Method boolean zzcu.zza(Object, Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #44  <Field String zzgm>
	//   21   39:aload_1         
	//   22   40:getfield        #44  <Field String zzgm>
	//   23   43:invokestatic    #68  <Method boolean zzcu.zza(Object, Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public String getAdTagUrl()
	{
		return zzgl;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzgl>
	//    2    4:areturn         
	}

	public String getAdsResponse()
	{
		return zzgm;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzgm>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzgl, zzgm
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field String zzgl>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #44  <Field String zzgm>
	//   11   17:aastore         
	//   12   18:invokestatic    #78  <Method int Objects.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #52  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(zzgl != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #42  <Field String zzgl>
	//*   6   12:ifnull          26
				jsonobject.put("adTagUrl", ((Object) (zzgl)));
	//    7   15:aload_1         
	//    8   16:ldc1            #50  <String "adTagUrl">
	//    9   18:aload_0         
	//   10   19:getfield        #42  <Field String zzgl>
	//   11   22:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(zzgm != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #44  <Field String zzgm>
	//*  15   30:ifnull          44
				jsonobject.put("adsResponse", ((Object) (zzgm)));
	//   16   33:aload_1         
	//   17   34:ldc1            #58  <String "adsResponse">
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field String zzgm>
	//   20   40:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
		}
	//*  22   44:aload_1         
	//*  23   45:areturn         
		catch(JSONException jsonexception)
	//*  24   46:astore_2        
		{
			return jsonobject;
	//   25   47:aload_1         
	//   26   48:areturn         
		}
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, getAdTagUrl(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #97  <Method String getAdTagUrl()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #101 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getAdsResponse(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #103 <Method String getAdsResponse()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #101 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #106 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   18   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbs();
	private final String zzgl;
	private final String zzgm;

	static 
	{
	//    0    0:new             #30  <Class zzbs>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzbs()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
