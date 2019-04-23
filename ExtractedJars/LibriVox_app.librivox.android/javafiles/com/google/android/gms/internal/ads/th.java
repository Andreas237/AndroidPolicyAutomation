// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			sr, zzbbi, ja, jf, 
//			ji, iz

public final class th
	implements sr
{

	public th(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = aw.t().a(context, zzbbi.a()).a("google.afma.request.getAdDictionary", ((jc) (jf.a)), ((jb) (jf.a)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method ja aw.t()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method zzbbi zzbbi.a()>
	//    6   12:invokevirtual   #31  <Method ji ja.a(Context, zzbbi)>
	//    7   15:ldc1            #33  <String "google.afma.request.getAdDictionary">
	//    8   17:getstatic       #38  <Field jd jf.a>
	//    9   20:getstatic       #38  <Field jd jf.a>
	//   10   23:invokevirtual   #43  <Method iz ji.a(String, jc, jb)>
	//   11   26:putfield        #45  <Field iz a>
		b = aw.t().a(context, zzbbi.a()).a("google.afma.sdkConstants.getSdkConstants", ((jc) (jf.a)), ((jb) (jf.a)));
	//   12   29:aload_0         
	//   13   30:invokestatic    #21  <Method ja aw.t()>
	//   14   33:aload_1         
	//   15   34:invokestatic    #26  <Method zzbbi zzbbi.a()>
	//   16   37:invokevirtual   #31  <Method ji ja.a(Context, zzbbi)>
	//   17   40:ldc1            #47  <String "google.afma.sdkConstants.getSdkConstants">
	//   18   42:getstatic       #38  <Field jd jf.a>
	//   19   45:getstatic       #38  <Field jd jf.a>
	//   20   48:invokevirtual   #43  <Method iz ji.a(String, jc, jb)>
	//   21   51:putfield        #49  <Field iz b>
	//   22   54:return          
	}

	public final iz a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field iz a>
	//    2    4:areturn         
	}

	public final iz b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field iz b>
	//    2    4:areturn         
	}

	private iz a;
	private iz b;
}
