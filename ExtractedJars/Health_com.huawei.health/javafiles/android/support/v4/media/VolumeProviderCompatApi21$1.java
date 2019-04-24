// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.VolumeProvider;

// Referenced classes of package android.support.v4.media:
//			VolumeProviderCompatApi21

static final class VolumeProviderCompatApi21$1 extends VolumeProvider
{

	public void onAdjustVolume(int i)
	{
		val$delegate.onAdjustVolume(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field VolumeProviderCompatApi21$Delegate val$delegate>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method void VolumeProviderCompatApi21$Delegate.onAdjustVolume(int)>
	//    4   10:return          
	}

	public void onSetVolumeTo(int i)
	{
		val$delegate.onSetVolumeTo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field VolumeProviderCompatApi21$Delegate val$delegate>
	//    2    4:iload_1         
	//    3    5:invokeinterface #28  <Method void VolumeProviderCompatApi21$Delegate.onSetVolumeTo(int)>
	//    4   10:return          
	}

	final legate val$delegate;

	VolumeProviderCompatApi21$1(int i, int j, int k, legate legate)
	{
		val$delegate = legate;
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:putfield        #15  <Field VolumeProviderCompatApi21$Delegate val$delegate>
		super(i, j, k);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokespecial   #18  <Method void VolumeProvider(int, int, int)>
	//    8   13:return          
	}
}
