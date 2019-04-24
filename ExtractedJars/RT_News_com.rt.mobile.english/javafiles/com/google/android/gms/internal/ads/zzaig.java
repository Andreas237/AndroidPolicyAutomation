// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaih

public final class zzaig extends AbstractSafeParcelable
{

	public zzaig(RewardItem rewarditem)
	{
		this(rewarditem.getType(), rewarditem.getAmount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #39  <Method String RewardItem.getType()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #43  <Method int RewardItem.getAmount()>
	//    5   13:invokespecial   #46  <Method void zzaig(String, int)>
	//    6   16:return          
	}

	public zzaig(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		type = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field String type>
		zzcmk = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field int zzcmk>
	//    8   14:return          
	}

	public static zzaig zza(JSONArray jsonarray)
		throws JSONException
	{
		if(jsonarray != null && jsonarray.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          42
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #65  <Method int JSONArray.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            42
			return new zzaig(jsonarray.getJSONObject(0).optString("rb_type"), jsonarray.getJSONObject(0).optInt("rb_amount"));
	//    6   14:new             #2   <Class zzaig>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #69  <Method JSONObject JSONArray.getJSONObject(int)>
	//   11   23:ldc1            #71  <String "rb_type">
	//   12   25:invokevirtual   #77  <Method String JSONObject.optString(String)>
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #69  <Method JSONObject JSONArray.getJSONObject(int)>
	//   16   33:ldc1            #79  <String "rb_amount">
	//   17   35:invokevirtual   #83  <Method int JSONObject.optInt(String)>
	//   18   38:invokespecial   #46  <Method void zzaig(String, int)>
	//   19   41:areturn         
		else
			return null;
	//   20   42:aconst_null     
	//   21   43:areturn         
	}

	public static zzaig zzce(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #92  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		try
		{
			s = ((String) (zza(new JSONArray(s))));
	//    5    9:new             #62  <Class JSONArray>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #95  <Method void JSONArray(String)>
	//    9   17:invokestatic    #97  <Method zzaig zza(JSONArray)>
	//   10   20:astore_0        
		}
	//*  11   21:aload_0         
	//*  12   22:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   23:astore_0        
		{
			return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
		}
		return ((zzaig) (s));
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			if(!(obj instanceof zzaig))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class zzaig>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((zzaig)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class zzaig>
	//    9   17:astore_1        
			if(Objects.equal(((Object) (type)), ((Object) (((zzaig) (obj)).type))) && Objects.equal(((Object) (Integer.valueOf(zzcmk))), ((Object) (Integer.valueOf(((zzaig) (obj)).zzcmk)))))
	//*  10   18:aload_0         
	//*  11   19:getfield        #51  <Field String type>
	//*  12   22:aload_1         
	//*  13   23:getfield        #51  <Field String type>
	//*  14   26:invokestatic    #105 <Method boolean Objects.equal(Object, Object)>
	//*  15   29:ifeq            54
	//*  16   32:aload_0         
	//*  17   33:getfield        #53  <Field int zzcmk>
	//*  18   36:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//*  19   39:aload_1         
	//*  20   40:getfield        #53  <Field int zzcmk>
	//*  21   43:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//*  22   46:invokestatic    #105 <Method boolean Objects.equal(Object, Object)>
	//*  23   49:ifeq            54
				return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		}
		return false;
	//   26   54:iconst_0        
	//   27   55:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			type, Integer.valueOf(zzcmk)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field String type>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #53  <Field int zzcmk>
	//   11   17:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:invokestatic    #117 <Method int Objects.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #125 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, type, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field String type>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #129 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, zzcmk);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #53  <Field int zzcmk>
	//   13   21:invokestatic    #133 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #136 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaih();
	public final String type;
	public final int zzcmk;

	static 
	{
	//    0    0:new             #26  <Class zzaih>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzaih()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
