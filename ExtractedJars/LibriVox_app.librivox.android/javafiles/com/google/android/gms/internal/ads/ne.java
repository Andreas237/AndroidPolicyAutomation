// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ng, wx, nf

public final class ne
{

	private ne(ng ng1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = ng.a(ng1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method boolean ng.a(ng)>
	//    5    9:putfield        #23  <Field boolean a>
		b = ng.b(ng1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #25  <Method boolean ng.b(ng)>
	//    9   17:putfield        #27  <Field boolean b>
		c = ng.c(ng1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #29  <Method boolean ng.c(ng)>
	//   13   25:putfield        #31  <Field boolean c>
		d = ng.d(ng1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #33  <Method boolean ng.d(ng)>
	//   17   33:putfield        #35  <Field boolean d>
		e = ng.e(ng1);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #37  <Method boolean ng.e(ng)>
	//   21   41:putfield        #39  <Field boolean e>
	//   22   44:return          
	}

	ne(ng ng1, nf nf)
	{
		this(ng1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void ne(ng)>
	//    3    5:return          
	}

	public final JSONObject a()
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = (new JSONObject()).put("sms", a).put("tel", b).put("calendar", c).put("storePicture", d).put("inlineVideo", e);
	//    0    0:new             #48  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void JSONObject()>
	//    3    7:ldc1            #51  <String "sms">
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field boolean a>
	//    6   13:invokevirtual   #55  <Method JSONObject JSONObject.put(String, boolean)>
	//    7   16:ldc1            #57  <String "tel">
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field boolean b>
	//   10   22:invokevirtual   #55  <Method JSONObject JSONObject.put(String, boolean)>
	//   11   25:ldc1            #59  <String "calendar">
	//   12   27:aload_0         
	//   13   28:getfield        #31  <Field boolean c>
	//   14   31:invokevirtual   #55  <Method JSONObject JSONObject.put(String, boolean)>
	//   15   34:ldc1            #61  <String "storePicture">
	//   16   36:aload_0         
	//   17   37:getfield        #35  <Field boolean d>
	//   18   40:invokevirtual   #55  <Method JSONObject JSONObject.put(String, boolean)>
	//   19   43:ldc1            #63  <String "inlineVideo">
	//   20   45:aload_0         
	//   21   46:getfield        #39  <Field boolean e>
	//   22   49:invokevirtual   #55  <Method JSONObject JSONObject.put(String, boolean)>
	//   23   52:astore_1        
		}
	//*  24   53:aload_1         
	//*  25   54:areturn         
		catch(JSONException jsonexception)
	//*  26   55:astore_1        
		{
			wx.b("Error occured while obtaining the MRAID capabilities.", ((Throwable) (jsonexception)));
	//   27   56:ldc1            #65  <String "Error occured while obtaining the MRAID capabilities.">
	//   28   58:aload_1         
	//   29   59:invokestatic    #70  <Method void wx.b(String, Throwable)>
			return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
		}
		return jsonobject;
	}

	private final boolean a;
	private final boolean b;
	private final boolean c;
	private final boolean d;
	private final boolean e;
}
