// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import java.lang.ref.WeakReference;

final class RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper
	implements MediaRouterJellybean.VolumeCallback
{

	public void onVolumeSetRequest(Object obj, int i)
	{
		obj = ((Object) ((RemoteControlClientCompat.JellybeanImpl)mImplWeak.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference mImplWeak>
	//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
	//    3    7:checkcast       #29  <Class RemoteControlClientCompat$JellybeanImpl>
	//    4   10:astore_1        
		if(obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          32
	//*   7   15:aload_1         
	//*   8   16:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
	//*   9   19:ifnull          32
			((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeSetRequest(i);
	//   10   22:aload_1         
	//   11   23:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
	//   12   26:iload_2         
	//   13   27:invokeinterface #38  <Method void RemoteControlClientCompat$VolumeCallback.onVolumeSetRequest(int)>
	//   14   32:return          
	}

	public void onVolumeUpdateRequest(Object obj, int i)
	{
		obj = ((Object) ((RemoteControlClientCompat.JellybeanImpl)mImplWeak.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference mImplWeak>
	//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
	//    3    7:checkcast       #29  <Class RemoteControlClientCompat$JellybeanImpl>
	//    4   10:astore_1        
		if(obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          32
	//*   7   15:aload_1         
	//*   8   16:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
	//*   9   19:ifnull          32
			((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeUpdateRequest(i);
	//   10   22:aload_1         
	//   11   23:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
	//   12   26:iload_2         
	//   13   27:invokeinterface #41  <Method void RemoteControlClientCompat$VolumeCallback.onVolumeUpdateRequest(int)>
	//   14   32:return          
	}

	private final WeakReference mImplWeak;

	public RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper(RemoteControlClientCompat.JellybeanImpl jellybeanimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mImplWeak = new WeakReference(((Object) (jellybeanimpl)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void WeakReference(Object)>
	//    7   13:putfield        #20  <Field WeakReference mImplWeak>
	//    8   16:return          
	}
}
