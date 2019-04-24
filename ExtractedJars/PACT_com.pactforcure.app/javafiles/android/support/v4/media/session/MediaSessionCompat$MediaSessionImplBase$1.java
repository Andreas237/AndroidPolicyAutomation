// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.support.v4.media.VolumeProviderCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, ParcelableVolumeInfo

class MediaSessionCompat$MediaSessionImplBase$1 extends android.support.v4.media.VolumeProviderCompat.Callback
{

	public void onVolumeChanged(VolumeProviderCompat volumeprovidercompat)
	{
		if(mVolumeProvider != volumeprovidercompat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*   2    4:getfield        #25  <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
	//*   3    7:aload_1         
	//*   4    8:if_acmpeq       12
		{
			return;
	//    5   11:return          
		} else
		{
			volumeprovidercompat = ((VolumeProviderCompat) (new ParcelableVolumeInfo(mVolumeType, mLocalStream, volumeprovidercompat.getVolumeControl(), volumeprovidercompat.getMaxVolume(), volumeprovidercompat.getCurrentVolume())));
	//    6   12:new             #27  <Class ParcelableVolumeInfo>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   10   20:getfield        #31  <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   13   27:getfield        #34  <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #40  <Method int VolumeProviderCompat.getVolumeControl()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #43  <Method int VolumeProviderCompat.getMaxVolume()>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #46  <Method int VolumeProviderCompat.getCurrentVolume()>
	//   20   42:invokespecial   #49  <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   21   45:astore_1        
			sendVolumeInfoChanged(((ParcelableVolumeInfo) (volumeprovidercompat)));
	//   22   46:aload_0         
	//   23   47:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #53  <Method void MediaSessionCompat$MediaSessionImplBase.sendVolumeInfoChanged(ParcelableVolumeInfo)>
			return;
	//   26   54:return          
		}
	}

	final MediaSessionCompat.MediaSessionImplBase this$0;

	MediaSessionCompat$MediaSessionImplBase$1()
	{
		this$0 = MediaSessionCompat.MediaSessionImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.support.v4.media.VolumeProviderCompat$Callback()>
	//    5    9:return          
	}
}
