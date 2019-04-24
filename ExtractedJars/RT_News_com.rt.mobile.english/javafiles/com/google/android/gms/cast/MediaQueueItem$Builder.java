// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			MediaQueueItem, MediaInfo

public static class MediaQueueItem$Builder
{

	public MediaQueueItem build()
	{
		zzeb.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:invokevirtual   #38  <Method void MediaQueueItem.zzi()>
		return zzeb;
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field MediaQueueItem zzeb>
	//    5   11:areturn         
	}

	public MediaQueueItem$Builder clearItemId()
	{
		zzeb.zza(0);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #44  <Method void MediaQueueItem.zza(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setActiveTrackIds(long al[])
	{
		zzeb.zza(al);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void MediaQueueItem.zza(long[])>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setAutoplay(boolean flag)
	{
		zzeb.zze(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #55  <Method void MediaQueueItem.zze(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setCustomData(JSONObject jsonobject)
	{
		zzeb.setCustomData(jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method void MediaQueueItem.setCustomData(JSONObject)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setPlaybackDuration(double d)
	{
		zzeb.zzb(d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #65  <Method void MediaQueueItem.zzb(double)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setPreloadTime(double d)
		throws IllegalArgumentException
	{
		zzeb.zzc(d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #69  <Method void MediaQueueItem.zzc(double)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MediaQueueItem$Builder setStartTime(double d)
		throws IllegalArgumentException
	{
		zzeb.zza(d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #72  <Method void MediaQueueItem.zza(double)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final MediaQueueItem zzeb;

	public MediaQueueItem$Builder(MediaInfo mediainfo)
		throws IllegalArgumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzeb = new MediaQueueItem(mediainfo, ((zzal) (null)));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaQueueItem>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #20  <Method void MediaQueueItem(MediaInfo, zzal)>
	//    8   14:putfield        #22  <Field MediaQueueItem zzeb>
	//    9   17:return          
	}

	public MediaQueueItem$Builder(MediaQueueItem mediaqueueitem)
		throws IllegalArgumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzeb = new MediaQueueItem(mediaqueueitem, ((zzal) (null)));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaQueueItem>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #28  <Method void MediaQueueItem(MediaQueueItem, zzal)>
	//    8   14:putfield        #22  <Field MediaQueueItem zzeb>
	//    9   17:return          
	}

	public MediaQueueItem$Builder(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzeb = new MediaQueueItem(jsonobject);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaQueueItem>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #33  <Method void MediaQueueItem(JSONObject)>
	//    7   13:putfield        #22  <Field MediaQueueItem zzeb>
	//    8   16:return          
	}
}
