// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			VolumeProviderCompat

class VolumeProviderCompat$1
	implements Delegate
{

	public void onAdjustVolume(int i)
	{
		VolumeProviderCompat.this.onAdjustVolume(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field VolumeProviderCompat this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #25  <Method void VolumeProviderCompat.onAdjustVolume(int)>
	//    4    8:return          
	}

	public void onSetVolumeTo(int i)
	{
		VolumeProviderCompat.this.onSetVolumeTo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field VolumeProviderCompat this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #28  <Method void VolumeProviderCompat.onSetVolumeTo(int)>
	//    4    8:return          
	}

	final VolumeProviderCompat this$0;

	VolumeProviderCompat$1()
	{
		this$0 = VolumeProviderCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field VolumeProviderCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
