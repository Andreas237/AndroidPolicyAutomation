// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.Utils.a;

// Referenced classes of package com.startapp.android.publish.common.metaData:
//			MetaData

public static class MetaData$a
	implements com.startapp.common.a.a
{

	public void a(Bitmap bitmap, int i)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			com.startapp.android.publish.adsCommon.Utils.a.a(a, bitmap, b, ".png");
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context a>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field String b>
	//    7   13:ldc1            #25  <String ".png">
	//    8   15:invokestatic    #30  <Method void a.a(Context, Bitmap, String, String)>
	//    9   18:return          
	}

	Context a;
	String b;

	public MetaData$a(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String b>
	//    8   14:return          
	}
}
