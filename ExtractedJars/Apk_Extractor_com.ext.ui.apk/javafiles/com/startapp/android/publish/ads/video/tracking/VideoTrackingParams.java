// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.adsCommon.d.b;

public class VideoTrackingParams extends b
{

	public VideoTrackingParams(String s, int i, int j, String s1)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void b(String)>
		setOffset(j);
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #28  <Method b setOffset(int)>
	//    6   10:pop             
		completed = i;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #30  <Field int completed>
		videoPlayingMode = s1;
	//   10   16:aload_0         
	//   11   17:aload           4
	//   12   19:putfield        #32  <Field String videoPlayingMode>
	//   13   22:return          
	}

	public int getCompleted()
	{
		return completed;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int completed>
	//    2    4:ireturn         
	}

	protected String getCompletedQuery()
	{
		return (new StringBuilder()).append("&cp=").append(completed).toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:ldc1            #44  <String "&cp=">
	//    4    9:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #30  <Field int completed>
	//    7   16:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:invokevirtual   #54  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public boolean getInternalTrackingParamsIndicator()
	{
		return internalParamsIndicator;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean internalParamsIndicator>
	//    2    4:ireturn         
	}

	protected String getOffsetQuery()
	{
		if(shouldAppendOffset)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field boolean shouldAppendOffset>
	//*   2    4:ifeq            43
		{
			if(replayParameter != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #63  <Field String replayParameter>
	//*   5   11:ifnull          38
				return replayParameter.replace("%startapp_replay_count%", ((CharSequence) ((new Integer(getOffset())).toString())));
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field String replayParameter>
	//    8   18:ldc1            #8   <String "%startapp_replay_count%">
	//    9   20:new             #65  <Class Integer>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokevirtual   #68  <Method int getOffset()>
	//   13   28:invokespecial   #71  <Method void Integer(int)>
	//   14   31:invokevirtual   #72  <Method String Integer.toString()>
	//   15   34:invokevirtual   #78  <Method String String.replace(CharSequence, CharSequence)>
	//   16   37:areturn         
			else
				return super.getOffsetQuery();
	//   17   38:aload_0         
	//   18   39:invokespecial   #80  <Method String b.getOffsetQuery()>
	//   19   42:areturn         
		} else
		{
			return "";
	//   20   43:ldc1            #82  <String "">
	//   21   45:areturn         
		}
	}

	public String getQueryString()
	{
		return getQueryString((new StringBuilder()).append(getCompletedQuery()).append(getVideoPlayingModeQuery()).toString());
	//    0    0:aload_0         
	//    1    1:new             #39  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #42  <Method void StringBuilder()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #85  <Method String getCompletedQuery()>
	//    6   12:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #88  <Method String getVideoPlayingModeQuery()>
	//    9   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   11   25:invokevirtual   #91  <Method String getQueryString(String)>
	//   12   28:areturn         
	}

	protected String getQueryString(String s)
	{
		if(internalParamsIndicator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean internalParamsIndicator>
	//*   2    4:ifeq            29
			return (new StringBuilder()).append(super.getQueryString()).append(s).toString();
	//    3    7:new             #39  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #42  <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:invokespecial   #93  <Method String b.getQueryString()>
	//    8   18:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   12   28:areturn         
		else
			return getOffsetQuery();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #94  <Method String getOffsetQuery()>
	//   15   33:areturn         
	}

	protected String getVideoPlayingModeQuery()
	{
		return (new StringBuilder()).append("&vpm=").append(videoPlayingMode).toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:ldc1            #96  <String "&vpm=">
	//    4    9:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field String videoPlayingMode>
	//    7   16:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #54  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public VideoTrackingParams setInternalTrackingParamsIndicator(boolean flag)
	{
		internalParamsIndicator = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean internalParamsIndicator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public VideoTrackingParams setReplayParameter(String s)
	{
		replayParameter = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String replayParameter>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public VideoTrackingParams setShouldAppendOffset(boolean flag)
	{
		shouldAppendOffset = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean shouldAppendOffset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final String REPLAY_PARAMETER_PLACEHOLDER = "%startapp_replay_count%";
	private static final long serialVersionUID = 1L;
	private int completed;
	protected boolean internalParamsIndicator;
	private String replayParameter;
	private boolean shouldAppendOffset;
	private String videoPlayingMode;
}
