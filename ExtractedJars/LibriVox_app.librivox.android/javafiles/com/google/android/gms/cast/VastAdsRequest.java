// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			ak

public class VastAdsRequest extends AbstractSafeParcelable
{

	VastAdsRequest(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String b>
	//    8   14:return          
	}

	public static VastAdsRequest a(JSONObject jsonobject)
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
	//    7   11:ldc1            #28  <String "adTagUrl">
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #34  <Method String JSONObject.optString(String, String)>
	//   10   17:aload_0         
	//   11   18:ldc1            #36  <String "adsResponse">
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #34  <Method String JSONObject.optString(String, String)>
	//   14   24:invokespecial   #38  <Method void VastAdsRequest(String, String)>
	//   15   27:areturn         
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String b>
	//    2    4:areturn         
	}

	public final JSONObject c()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(a != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field String a>
	//*   6   12:ifnull          26
				jsonobject.put("adTagUrl", ((Object) (a)));
	//    7   15:aload_1         
	//    8   16:ldc1            #28  <String "adTagUrl">
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field String a>
	//   11   22:invokevirtual   #48  <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(b != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #25  <Field String b>
	//*  15   30:ifnull          44
				jsonobject.put("adsResponse", ((Object) (b)));
	//   16   33:aload_1         
	//   17   34:ldc1            #36  <String "adsResponse">
	//   18   36:aload_0         
	//   19   37:getfield        #25  <Field String b>
	//   20   40:invokevirtual   #48  <Method JSONObject JSONObject.put(String, Object)>
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
		return aj.a(((Object) (a)), ((Object) (((VastAdsRequest) (obj)).a))) && aj.a(((Object) (b)), ((Object) (((VastAdsRequest) (obj)).b)));
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #23  <Field String a>
	//   17   29:invokestatic    #55  <Method boolean aj.a(Object, Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field String b>
	//   21   39:aload_1         
	//   22   40:getfield        #25  <Field String b>
	//   23   43:invokestatic    #55  <Method boolean aj.a(Object, Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, b
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field String a>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #25  <Field String b>
	//   11   17:aastore         
	//   12   18:invokestatic    #64  <Method int ak.a(Object[])>
	//   13   21:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #71  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #73  <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #76  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #78  <Method String b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #76  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #80  <Method void c.a(Parcel, int)>
	//   18   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.cast.ak();
	private final String a;
	private final String b;

	static 
	{
	//    0    0:new             #13  <Class com.google.android.gms.cast.ak>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void com.google.android.gms.cast.ak()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
