// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.AudioAttributes;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesImpl, AudioAttributesCompat

class AudioAttributesImplApi21
	implements AudioAttributesImpl
{

	AudioAttributesImplApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mLegacyStreamType = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int mLegacyStreamType>
	//    5    9:return          
	}

	AudioAttributesImplApi21(AudioAttributes audioattributes)
	{
		this(audioattributes, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #30  <Method void AudioAttributesImplApi21(AudioAttributes, int)>
	//    4    6:return          
	}

	AudioAttributesImplApi21(AudioAttributes audioattributes, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mLegacyStreamType = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int mLegacyStreamType>
		mAudioAttributes = audioattributes;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #32  <Field AudioAttributes mAudioAttributes>
		mLegacyStreamType = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #25  <Field int mLegacyStreamType>
	//   11   19:return          
	}

	public static AudioAttributesImpl fromBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		AudioAttributes audioattributes = (AudioAttributes)bundle.getParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS");
	//    4    6:aload_0         
	//    5    7:ldc1            #36  <String "android.support.v4.media.audio_attrs.FRAMEWORKS">
	//    6    9:invokevirtual   #42  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    7   12:checkcast       #44  <Class AudioAttributes>
	//    8   15:astore_1        
		if(audioattributes == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       22
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		else
			return ((AudioAttributesImpl) (new AudioAttributesImplApi21(audioattributes, bundle.getInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", -1))));
	//   13   22:new             #2   <Class AudioAttributesImplApi21>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:aload_0         
	//   17   28:ldc1            #46  <String "android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE">
	//   18   30:iconst_m1       
	//   19   31:invokevirtual   #50  <Method int Bundle.getInt(String, int)>
	//   20   34:invokespecial   #30  <Method void AudioAttributesImplApi21(AudioAttributes, int)>
	//   21   37:areturn         
	}

	static Method getAudioAttributesToLegacyStreamTypeMethod()
	{
		NoSuchMethodException nosuchmethodexception;
		try
		{
			if(sAudioAttributesToLegacyStreamType == null)
	//*   0    0:getstatic       #56  <Field Method sAudioAttributesToLegacyStreamType>
	//*   1    3:ifnonnull       25
				sAudioAttributesToLegacyStreamType = ((Class) (android/media/AudioAttributes)).getMethod("toLegacyStreamType", new Class[] {
					android/media/AudioAttributes
				});
	//    2    6:ldc1            #44  <Class AudioAttributes>
	//    3    8:ldc1            #58  <String "toLegacyStreamType">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #44  <Class AudioAttributes>
	//    9   18:aastore         
	//   10   19:invokevirtual   #64  <Method Method Class.getMethod(String, Class[])>
	//   11   22:putstatic       #56  <Field Method sAudioAttributesToLegacyStreamType>
		}
	//*  12   25:getstatic       #56  <Field Method sAudioAttributesToLegacyStreamType>
	//*  13   28:areturn         
	//*  14   29:aconst_null     
	//*  15   30:areturn         
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			return null;
		}
		return sAudioAttributesToLegacyStreamType;
	//*  16   31:astore_0        
	//*  17   32:goto            29
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof AudioAttributesImplApi21))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class AudioAttributesImplApi21>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			obj = ((Object) ((AudioAttributesImplApi21)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class AudioAttributesImplApi21>
	//    7   13:astore_1        
			return mAudioAttributes.equals(((Object) (((AudioAttributesImplApi21) (obj)).mAudioAttributes)));
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//   10   18:aload_1         
	//   11   19:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//   12   22:invokevirtual   #68  <Method boolean AudioAttributes.equals(Object)>
	//   13   25:ireturn         
		}
	}

	public Object getAudioAttributes()
	{
		return ((Object) (mAudioAttributes));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    2    4:areturn         
	}

	public int getContentType()
	{
		return mAudioAttributes.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    2    4:invokevirtual   #74  <Method int AudioAttributes.getContentType()>
	//    3    7:ireturn         
	}

	public int getFlags()
	{
		return mAudioAttributes.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    2    4:invokevirtual   #77  <Method int AudioAttributes.getFlags()>
	//    3    7:ireturn         
	}

	public int getLegacyStreamType()
	{
		Object obj;
		int i = mLegacyStreamType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mLegacyStreamType>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		obj = ((Object) (getAudioAttributesToLegacyStreamTypeMethod()));
	//    8   12:invokestatic    #84  <Method Method getAudioAttributesToLegacyStreamTypeMethod()>
	//    9   15:astore_2        
		if(obj == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       55
		{
			obj = ((Object) (new StringBuilder()));
	//   12   20:new             #86  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #87  <Method void StringBuilder()>
	//   15   27:astore_2        
			((StringBuilder) (obj)).append("No AudioAttributes#toLegacyStreamType() on API: ");
	//   16   28:aload_2         
	//   17   29:ldc1            #89  <String "No AudioAttributes#toLegacyStreamType() on API: ">
	//   18   31:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			((StringBuilder) (obj)).append(android.os.Build.VERSION.SDK_INT);
	//   20   35:aload_2         
	//   21   36:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//   22   39:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   23   42:pop             
			Log.w("AudioAttributesCompat21", ((StringBuilder) (obj)).toString());
	//   24   43:ldc1            #13  <String "AudioAttributesCompat21">
	//   25   45:aload_2         
	//   26   46:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   27   49:invokestatic    #111 <Method int Log.w(String, String)>
	//   28   52:pop             
			return -1;
	//   29   53:iconst_m1       
	//   30   54:ireturn         
		}
		int j = ((Integer)((Method) (obj)).invoke(((Object) (null)), new Object[] {
			mAudioAttributes
		})).intValue();
	//   31   55:aload_2         
	//   32   56:aconst_null     
	//   33   57:iconst_1        
	//   34   58:anewarray       Object[]
	//   35   61:dup             
	//   36   62:iconst_0        
	//   37   63:aload_0         
	//   38   64:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//   39   67:aastore         
	//   40   68:invokevirtual   #117 <Method Object Method.invoke(Object, Object[])>
	//   41   71:checkcast       #119 <Class Integer>
	//   42   74:invokevirtual   #122 <Method int Integer.intValue()>
	//   43   77:istore_1        
		return j;
	//   44   78:iload_1         
	//   45   79:ireturn         
		Object obj1;
		obj1;
	//   46   80:astore_2        
		break MISSING_BLOCK_LABEL_85;
	//   47   81:goto            85
		obj1;
	//   48   84:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   49   85:new             #86  <Class StringBuilder>
	//   50   88:dup             
	//   51   89:invokespecial   #87  <Method void StringBuilder()>
	//   52   92:astore_3        
		stringbuilder.append("getLegacyStreamType() failed on API: ");
	//   53   93:aload_3         
	//   54   94:ldc1            #124 <String "getLegacyStreamType() failed on API: ">
	//   55   96:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   56   99:pop             
		stringbuilder.append(android.os.Build.VERSION.SDK_INT);
	//   57  100:aload_3         
	//   58  101:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//   59  104:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   60  107:pop             
		Log.w("AudioAttributesCompat21", stringbuilder.toString(), ((Throwable) (obj1)));
	//   61  108:ldc1            #13  <String "AudioAttributesCompat21">
	//   62  110:aload_3         
	//   63  111:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   64  114:aload_2         
	//   65  115:invokestatic    #127 <Method int Log.w(String, String, Throwable)>
	//   66  118:pop             
		return -1;
	//   67  119:iconst_m1       
	//   68  120:ireturn         
	}

	public int getRawLegacyStreamType()
	{
		return mLegacyStreamType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mLegacyStreamType>
	//    2    4:ireturn         
	}

	public int getUsage()
	{
		return mAudioAttributes.getUsage();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    2    4:invokevirtual   #131 <Method int AudioAttributes.getUsage()>
	//    3    7:ireturn         
	}

	public int getVolumeControlStream()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          16
			return mAudioAttributes.getVolumeControlStream();
	//    3    8:aload_0         
	//    4    9:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    5   12:invokevirtual   #134 <Method int AudioAttributes.getVolumeControlStream()>
	//    6   15:ireturn         
		else
			return AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
	//    7   16:iconst_1        
	//    8   17:aload_0         
	//    9   18:invokevirtual   #135 <Method int getFlags()>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #136 <Method int getUsage()>
	//   12   25:invokestatic    #142 <Method int AudioAttributesCompat.toVolumeStreamType(boolean, int, int)>
	//   13   28:ireturn         
	}

	public int hashCode()
	{
		return mAudioAttributes.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    2    4:invokevirtual   #145 <Method int AudioAttributes.hashCode()>
	//    3    7:ireturn         
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #38  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS", ((android.os.Parcelable) (mAudioAttributes)));
	//    4    8:aload_2         
	//    5    9:ldc1            #36  <String "android.support.v4.media.audio_attrs.FRAMEWORKS">
	//    6   11:aload_0         
	//    7   12:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//    8   15:invokevirtual   #153 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		int i = mLegacyStreamType;
	//    9   18:aload_0         
	//   10   19:getfield        #25  <Field int mLegacyStreamType>
	//   11   22:istore_1        
		if(i != -1)
	//*  12   23:iload_1         
	//*  13   24:iconst_m1       
	//*  14   25:icmpeq          35
			bundle.putInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", i);
	//   15   28:aload_2         
	//   16   29:ldc1            #46  <String "android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE">
	//   17   31:iload_1         
	//   18   32:invokevirtual   #157 <Method void Bundle.putInt(String, int)>
		return bundle;
	//   19   35:aload_2         
	//   20   36:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AudioAttributesCompat: audioattributes=");
	//    4    8:aload_1         
	//    5    9:ldc1            #160 <String "AudioAttributesCompat: audioattributes=">
	//    6   11:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mAudioAttributes)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #32  <Field AudioAttributes mAudioAttributes>
	//   11   20:invokevirtual   #163 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private static final String TAG = "AudioAttributesCompat21";
	static Method sAudioAttributesToLegacyStreamType;
	AudioAttributes mAudioAttributes;
	int mLegacyStreamType;
}
