// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.b;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			vc

public final class zzawd extends AbstractSafeParcelable
{

	public zzawd(b b1)
	{
		this(b1.a(), b1.b());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #27  <Method String b.a()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #30  <Method int b.b()>
	//    5   13:invokespecial   #33  <Method void zzawd(String, int)>
	//    6   16:return          
	}

	public zzawd(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #38  <Field int b>
	//    8   14:return          
	}

	public static zzawd a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		try
		{
			s = ((String) (a(new JSONArray(s))));
	//    5    9:new             #49  <Class JSONArray>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #52  <Method void JSONArray(String)>
	//    9   17:invokestatic    #55  <Method zzawd a(JSONArray)>
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
		return ((zzawd) (s));
	}

	public static zzawd a(JSONArray jsonarray)
	{
		if(jsonarray != null && jsonarray.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          42
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #58  <Method int JSONArray.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            42
			return new zzawd(jsonarray.getJSONObject(0).optString("rb_type"), jsonarray.getJSONObject(0).optInt("rb_amount"));
	//    6   14:new             #2   <Class zzawd>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #62  <Method JSONObject JSONArray.getJSONObject(int)>
	//   11   23:ldc1            #64  <String "rb_type">
	//   12   25:invokevirtual   #70  <Method String JSONObject.optString(String)>
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #62  <Method JSONObject JSONArray.getJSONObject(int)>
	//   16   33:ldc1            #72  <String "rb_amount">
	//   17   35:invokevirtual   #76  <Method int JSONObject.optInt(String)>
	//   18   38:invokespecial   #33  <Method void zzawd(String, int)>
	//   19   41:areturn         
		else
			return null;
	//   20   42:aconst_null     
	//   21   43:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(!(obj instanceof zzawd))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class zzawd>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((zzawd)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class zzawd>
	//    9   17:astore_1        
			return ak.a(((Object) (a)), ((Object) (((zzawd) (obj)).a))) && ak.a(((Object) (Integer.valueOf(b))), ((Object) (Integer.valueOf(((zzawd) (obj)).b))));
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field String a>
	//   12   22:aload_1         
	//   13   23:getfield        #36  <Field String a>
	//   14   26:invokestatic    #83  <Method boolean ak.a(Object, Object)>
	//   15   29:ifeq            54
	//   16   32:aload_0         
	//   17   33:getfield        #38  <Field int b>
	//   18   36:invokestatic    #89  <Method Integer Integer.valueOf(int)>
	//   19   39:aload_1         
	//   20   40:getfield        #38  <Field int b>
	//   21   43:invokestatic    #89  <Method Integer Integer.valueOf(int)>
	//   22   46:invokestatic    #83  <Method boolean ak.a(Object, Object)>
	//   23   49:ifeq            54
	//   24   52:iconst_1        
	//   25   53:ireturn         
	//   26   54:iconst_0        
	//   27   55:ireturn         
		} else
		{
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		}
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a, Integer.valueOf(b)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field String a>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #38  <Field int b>
	//   11   17:invokestatic    #89  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:invokestatic    #95  <Method int ak.a(Object[])>
	//   14   24:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #102 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, 3, b);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field int b>
	//   13   21:invokestatic    #108 <Method void c.a(Parcel, int, int)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #110 <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new vc();
	public final String a;
	public final int b;

	static 
	{
	//    0    0:new             #15  <Class vc>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void vc()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
