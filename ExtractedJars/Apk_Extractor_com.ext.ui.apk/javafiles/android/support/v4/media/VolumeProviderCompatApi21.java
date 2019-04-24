// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.VolumeProvider;

class VolumeProviderCompatApi21
{
	public static interface Delegate
	{

		public abstract void onAdjustVolume(int i);

		public abstract void onSetVolumeTo(int i);
	}


	VolumeProviderCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Object createVolumeProvider(int i, int j, int k, Delegate delegate1)
	{
		return ((Object) (new VolumeProvider(i, j, k, delegate1) {

			public void onAdjustVolume(int l)
			{
				delegate.onAdjustVolume(l);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field VolumeProviderCompatApi21$Delegate val$delegate>
			//    2    4:iload_1         
			//    3    5:invokeinterface #25  <Method void VolumeProviderCompatApi21$Delegate.onAdjustVolume(int)>
			//    4   10:return          
			}

			public void onSetVolumeTo(int l)
			{
				delegate.onSetVolumeTo(l);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field VolumeProviderCompatApi21$Delegate val$delegate>
			//    2    4:iload_1         
			//    3    5:invokeinterface #28  <Method void VolumeProviderCompatApi21$Delegate.onSetVolumeTo(int)>
			//    4   10:return          
			}

			final Delegate val$delegate;

			
			{
				delegate = delegate1;
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
));
	//    0    0:new             #6   <Class VolumeProviderCompatApi21$1>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #22  <Method void VolumeProviderCompatApi21$1(int, int, int, VolumeProviderCompatApi21$Delegate)>
	//    7   11:areturn         
	}

	public static void setCurrentVolume(Object obj, int i)
	{
		((VolumeProvider)obj).setCurrentVolume(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #26  <Class VolumeProvider>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #29  <Method void VolumeProvider.setCurrentVolume(int)>
	//    4    8:return          
	}
}
