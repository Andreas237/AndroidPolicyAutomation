// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			MediaTrack

public static class MediaTrack$Builder
{

	public MediaTrack build()
	{
		return zzet;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:areturn         
	}

	public MediaTrack$Builder setContentId(String s)
	{
		zzet.setContentId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void MediaTrack.setContentId(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaTrack$Builder setContentType(String s)
	{
		zzet.setContentType(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void MediaTrack.setContentType(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaTrack$Builder setCustomData(JSONObject jsonobject)
	{
		zzet.setCustomData(jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void MediaTrack.setCustomData(JSONObject)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaTrack$Builder setLanguage(String s)
	{
		zzet.setLanguage(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method void MediaTrack.setLanguage(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaTrack$Builder setLanguage(Locale locale)
	{
		zzet.setLanguage(zzcu.zza(locale));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokestatic    #48  <Method String zzcu.zza(Locale)>
	//    4    8:invokevirtual   #41  <Method void MediaTrack.setLanguage(String)>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public MediaTrack$Builder setName(String s)
	{
		zzet.setName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method void MediaTrack.setName(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaTrack$Builder setSubtype(int i)
		throws IllegalArgumentException
	{
		zzet.zzb(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaTrack zzet>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #57  <Method void MediaTrack.zzb(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final MediaTrack zzet;

	public MediaTrack$Builder(long l, int i)
		throws IllegalArgumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzet = new MediaTrack(l, i);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaTrack>
	//    4    8:dup             
	//    5    9:lload_1         
	//    6   10:iload_3         
	//    7   11:invokespecial   #19  <Method void MediaTrack(long, int)>
	//    8   14:putfield        #21  <Field MediaTrack zzet>
	//    9   17:return          
	}
}
