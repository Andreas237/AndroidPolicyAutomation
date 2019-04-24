// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.media:
//			VolumeProviderCompatApi21

public abstract class VolumeProviderCompat
{
	public static abstract class Callback
	{

		public abstract void onVolumeChanged(VolumeProviderCompat volumeprovidercompat);

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface ControlType
		extends Annotation
	{
	}


	public VolumeProviderCompat(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mControlType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int mControlType>
		mMaxVolume = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #35  <Field int mMaxVolume>
		mCurrentVolume = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #37  <Field int mCurrentVolume>
	//   11   19:return          
	}

	public final int getCurrentVolume()
	{
		return mCurrentVolume;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mCurrentVolume>
	//    2    4:ireturn         
	}

	public final int getMaxVolume()
	{
		return mMaxVolume;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mMaxVolume>
	//    2    4:ireturn         
	}

	public final int getVolumeControl()
	{
		return mControlType;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mControlType>
	//    2    4:ireturn         
	}

	public Object getVolumeProvider()
	{
		if(mVolumeProviderObj != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field Object mVolumeProviderObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
		{
			return mVolumeProviderObj;
	//    6   15:aload_0         
	//    7   16:getfield        #46  <Field Object mVolumeProviderObj>
	//    8   19:areturn         
		} else
		{
			mVolumeProviderObj = VolumeProviderCompatApi21.createVolumeProvider(mControlType, mMaxVolume, mCurrentVolume, new VolumeProviderCompatApi21.Delegate() {

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
);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #33  <Field int mControlType>
	//   12   25:aload_0         
	//   13   26:getfield        #35  <Field int mMaxVolume>
	//   14   29:aload_0         
	//   15   30:getfield        #37  <Field int mCurrentVolume>
	//   16   33:new             #6   <Class VolumeProviderCompat$1>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:invokespecial   #54  <Method void VolumeProviderCompat$1(VolumeProviderCompat)>
	//   20   41:invokestatic    #60  <Method Object VolumeProviderCompatApi21.createVolumeProvider(int, int, int, VolumeProviderCompatApi21$Delegate)>
	//   21   44:putfield        #46  <Field Object mVolumeProviderObj>
			return mVolumeProviderObj;
	//   22   47:aload_0         
	//   23   48:getfield        #46  <Field Object mVolumeProviderObj>
	//   24   51:areturn         
		}
	}

	public void onAdjustVolume(int i)
	{
	//    0    0:return          
	}

	public void onSetVolumeTo(int i)
	{
	//    0    0:return          
	}

	public void setCallback(Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field VolumeProviderCompat$Callback mCallback>
	//    3    5:return          
	}

	public final void setCurrentVolume(int i)
	{
		mCurrentVolume = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int mCurrentVolume>
		Object obj = getVolumeProvider();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #70  <Method Object getVolumeProvider()>
	//    5    9:astore_2        
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			VolumeProviderCompatApi21.setCurrentVolume(obj, i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokestatic    #73  <Method void VolumeProviderCompatApi21.setCurrentVolume(Object, int)>
		if(mCallback != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #67  <Field VolumeProviderCompat$Callback mCallback>
	//*  13   23:ifnull          34
			mCallback.onVolumeChanged(this);
	//   14   26:aload_0         
	//   15   27:getfield        #67  <Field VolumeProviderCompat$Callback mCallback>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #76  <Method void VolumeProviderCompat$Callback.onVolumeChanged(VolumeProviderCompat)>
	//   18   34:return          
	}

	public static final int VOLUME_CONTROL_ABSOLUTE = 2;
	public static final int VOLUME_CONTROL_FIXED = 0;
	public static final int VOLUME_CONTROL_RELATIVE = 1;
	private Callback mCallback;
	private final int mControlType;
	private int mCurrentVolume;
	private final int mMaxVolume;
	private Object mVolumeProviderObj;
}
