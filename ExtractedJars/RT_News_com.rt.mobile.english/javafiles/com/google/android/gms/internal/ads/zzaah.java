// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaaj, zzakb, zzaai

public final class zzaah
{

	private zzaah(zzaaj zzaaj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzbwr = zzaaj.zza(zzaaj1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method boolean zzaaj.zza(zzaaj)>
	//    5    9:putfield        #24  <Field boolean zzbwr>
		zzbws = zzaaj.zzb(zzaaj1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #27  <Method boolean zzaaj.zzb(zzaaj)>
	//    9   17:putfield        #29  <Field boolean zzbws>
		zzbwt = zzaaj.zzc(zzaaj1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #32  <Method boolean zzaaj.zzc(zzaaj)>
	//   13   25:putfield        #34  <Field boolean zzbwt>
		zzbwu = zzaaj.zzd(zzaaj1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #37  <Method boolean zzaaj.zzd(zzaaj)>
	//   17   33:putfield        #39  <Field boolean zzbwu>
		zzbwv = zzaaj.zze(zzaaj1);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #42  <Method boolean zzaaj.zze(zzaaj)>
	//   21   41:putfield        #44  <Field boolean zzbwv>
	//   22   44:return          
	}

	zzaah(zzaaj zzaaj1, zzaai zzaai)
	{
		this(zzaaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void zzaah(zzaaj)>
	//    3    5:return          
	}

	public final JSONObject zzng()
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = (new JSONObject()).put("sms", zzbwr).put("tel", zzbws).put("calendar", zzbwt).put("storePicture", zzbwu).put("inlineVideo", zzbwv);
	//    0    0:new             #54  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void JSONObject()>
	//    3    7:ldc1            #57  <String "sms">
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field boolean zzbwr>
	//    6   13:invokevirtual   #61  <Method JSONObject JSONObject.put(String, boolean)>
	//    7   16:ldc1            #63  <String "tel">
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field boolean zzbws>
	//   10   22:invokevirtual   #61  <Method JSONObject JSONObject.put(String, boolean)>
	//   11   25:ldc1            #65  <String "calendar">
	//   12   27:aload_0         
	//   13   28:getfield        #34  <Field boolean zzbwt>
	//   14   31:invokevirtual   #61  <Method JSONObject JSONObject.put(String, boolean)>
	//   15   34:ldc1            #67  <String "storePicture">
	//   16   36:aload_0         
	//   17   37:getfield        #39  <Field boolean zzbwu>
	//   18   40:invokevirtual   #61  <Method JSONObject JSONObject.put(String, boolean)>
	//   19   43:ldc1            #69  <String "inlineVideo">
	//   20   45:aload_0         
	//   21   46:getfield        #44  <Field boolean zzbwv>
	//   22   49:invokevirtual   #61  <Method JSONObject JSONObject.put(String, boolean)>
	//   23   52:astore_1        
		}
	//*  24   53:aload_1         
	//*  25   54:areturn         
		catch(JSONException jsonexception)
	//*  26   55:astore_1        
		{
			zzakb.zzb("Error occured while obtaining the MRAID capabilities.", ((Throwable) (jsonexception)));
	//   27   56:ldc1            #71  <String "Error occured while obtaining the MRAID capabilities.">
	//   28   58:aload_1         
	//   29   59:invokestatic    #76  <Method void zzakb.zzb(String, Throwable)>
			return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
		}
		return jsonobject;
	}

	private final boolean zzbwr;
	private final boolean zzbws;
	private final boolean zzbwt;
	private final boolean zzbwu;
	private final boolean zzbwv;
}
