// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox.support;

import android.content.Context;
import biz.bookdesign.librivox.BookActivity;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.media.a;
import java.util.List;

public class CastOptionsProvider
	implements k
{

	public CastOptionsProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public CastOptions a(Context context)
	{
		com.google.android.gms.cast.framework.media.CastMediaOptions castmediaoptions = (new a()).a(((com.google.android.gms.cast.framework.media.NotificationOptions) (null))).a(((Class) (biz/bookdesign/librivox/BookActivity)).getName()).a();
	//    0    0:new             #15  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void a()>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #19  <Method a a.a(com.google.android.gms.cast.framework.media.NotificationOptions)>
	//    5   11:ldc1            #21  <Class BookActivity>
	//    6   13:invokevirtual   #27  <Method String Class.getName()>
	//    7   16:invokevirtual   #30  <Method a a.a(String)>
	//    8   19:invokevirtual   #33  <Method com.google.android.gms.cast.framework.media.CastMediaOptions a.a()>
	//    9   22:astore_2        
		return (new d()).a(context.getString(biz.bookdesign.librivox.a.k.cast_app_id)).a(castmediaoptions).a();
	//   10   23:new             #35  <Class d>
	//   11   26:dup             
	//   12   27:invokespecial   #36  <Method void d()>
	//   13   30:aload_1         
	//   14   31:getstatic       #42  <Field int biz.bookdesign.librivox.a.k.cast_app_id>
	//   15   34:invokevirtual   #48  <Method String Context.getString(int)>
	//   16   37:invokevirtual   #51  <Method d d.a(String)>
	//   17   40:aload_2         
	//   18   41:invokevirtual   #54  <Method d d.a(com.google.android.gms.cast.framework.media.CastMediaOptions)>
	//   19   44:invokevirtual   #57  <Method CastOptions d.a()>
	//   20   47:areturn         
	}

	public List b(Context context)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
