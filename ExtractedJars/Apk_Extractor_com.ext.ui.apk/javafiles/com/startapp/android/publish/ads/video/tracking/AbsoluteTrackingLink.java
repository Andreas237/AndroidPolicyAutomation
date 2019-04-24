// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;

import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoTrackingLink

public class AbsoluteTrackingLink extends VideoTrackingLink
	implements Serializable
{

	public AbsoluteTrackingLink()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void VideoTrackingLink()>
	//    2    4:return          
	}

	public int getVideoOffsetMillis()
	{
		return videoOffsetMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int videoOffsetMillis>
	//    2    4:ireturn         
	}

	public void setVideoOffsetMillis(int i)
	{
		videoOffsetMillis = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int videoOffsetMillis>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append(", videoOffsetMillis=").append(videoOffsetMillis).toString();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #33  <Method String VideoTrackingLink.toString()>
	//    5   11:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #39  <String ", videoOffsetMillis=">
	//    7   16:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #24  <Field int videoOffsetMillis>
	//   10   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   11   26:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	private static final long serialVersionUID = 1L;
	private int videoOffsetMillis;
}
