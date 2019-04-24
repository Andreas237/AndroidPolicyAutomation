// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			MediaInfo, MediaMetadata, TextTrackStyle

public static class MediaInfo$Builder
{

	public MediaInfo build()
	{
		return zzdi;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:areturn         
	}

	public MediaInfo$Builder setAdBreakClips(List list)
	{
		zzdi.zzc(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void MediaInfo.zzc(List)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setAdBreaks(List list)
	{
		zzdi.zzb(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void MediaInfo.zzb(List)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setContentType(String s)
	{
		zzdi.setContentType(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void MediaInfo.setContentType(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setCustomData(JSONObject jsonobject)
	{
		zzdi.setCustomData(jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method void MediaInfo.setCustomData(JSONObject)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setEntity(String s)
	{
		zzdi.zzd(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method void MediaInfo.zzd(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setMediaTracks(List list)
	{
		zzdi.zza(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method void MediaInfo.zza(List)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setMetadata(MediaMetadata mediametadata)
	{
		zzdi.zza(mediametadata);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method void MediaInfo.zza(MediaMetadata)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setStreamDuration(long l)
		throws IllegalArgumentException
	{
		zzdi.zza(l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #69  <Method void MediaInfo.zza(long)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setStreamType(int i)
		throws IllegalArgumentException
	{
		zzdi.setStreamType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #74  <Method void MediaInfo.setStreamType(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaInfo$Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
	{
		zzdi.setTextTrackStyle(texttrackstyle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaInfo zzdi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method void MediaInfo.setTextTrackStyle(TextTrackStyle)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final MediaInfo zzdi;

	public MediaInfo$Builder(String s)
		throws IllegalArgumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzdi = new MediaInfo(s);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaInfo>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void MediaInfo(String)>
	//    7   13:putfield        #21  <Field MediaInfo zzdi>
	//    8   16:return          
	}

	public MediaInfo$Builder(String s, String s1)
		throws IllegalArgumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzdi = new MediaInfo(s, s1);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaInfo>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #26  <Method void MediaInfo(String, String)>
	//    8   14:putfield        #21  <Field MediaInfo zzdi>
	//    9   17:return          
	}
}
