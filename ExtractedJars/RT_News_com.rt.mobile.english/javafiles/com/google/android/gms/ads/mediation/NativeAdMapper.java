// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.Map;

public class NativeAdMapper
{

	public NativeAdMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mExtras = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Bundle()>
	//    6   12:putfield        #25  <Field Bundle mExtras>
	//    7   15:return          
	}

	public View getAdChoicesContent()
	{
		return mAdChoicesContent;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field View mAdChoicesContent>
	//    2    4:areturn         
	}

	public final Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public final boolean getOverrideClickHandling()
	{
		return mOverrideClickHandling;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean mOverrideClickHandling>
	//    2    4:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
	{
		return mOverrideImpressionRecording;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mOverrideImpressionRecording>
	//    2    4:ireturn         
	}

	public final VideoController getVideoController()
	{
		return zzasv;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field VideoController zzasv>
	//    2    4:areturn         
	}

	public void handleClick(View view)
	{
	//    0    0:return          
	}

	public boolean hasVideoContent()
	{
		return zzdfn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean zzdfn>
	//    2    4:ireturn         
	}

	public void recordImpression()
	{
	//    0    0:return          
	}

	public void setAdChoicesContent(View view)
	{
		mAdChoicesContent = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field View mAdChoicesContent>
	//    3    5:return          
	}

	public final void setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Bundle mExtras>
	//    3    5:return          
	}

	public void setHasVideoContent(boolean flag)
	{
		zzdfn = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean zzdfn>
	//    3    5:return          
	}

	public void setMediaView(View view)
	{
		zzdfm = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field View zzdfm>
	//    3    5:return          
	}

	public final void setOverrideClickHandling(boolean flag)
	{
		mOverrideClickHandling = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean mOverrideClickHandling>
	//    3    5:return          
	}

	public final void setOverrideImpressionRecording(boolean flag)
	{
		mOverrideImpressionRecording = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mOverrideImpressionRecording>
	//    3    5:return          
	}

	public void trackView(View view)
	{
	//    0    0:return          
	}

	public void trackViews(View view, Map map, Map map1)
	{
	//    0    0:return          
	}

	public void untrackView(View view)
	{
	//    0    0:return          
	}

	public final void zza(VideoController videocontroller)
	{
		zzasv = videocontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field VideoController zzasv>
	//    3    5:return          
	}

	public final View zzvy()
	{
		return zzdfm;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field View zzdfm>
	//    2    4:areturn         
	}

	protected View mAdChoicesContent;
	protected Bundle mExtras;
	protected boolean mOverrideClickHandling;
	protected boolean mOverrideImpressionRecording;
	private VideoController zzasv;
	private View zzdfm;
	private boolean zzdfn;
}
