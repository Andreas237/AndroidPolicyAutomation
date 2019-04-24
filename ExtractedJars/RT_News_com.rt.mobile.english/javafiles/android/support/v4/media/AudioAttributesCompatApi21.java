// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.AudioAttributes;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AudioAttributesCompatApi21
{
	static final class Wrapper
	{

		public static Wrapper wrap(AudioAttributes audioattributes)
		{
			if(audioattributes == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("AudioAttributesApi21.Wrapper cannot wrap null");
		//    2    4:new             #22  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #24  <String "AudioAttributesApi21.Wrapper cannot wrap null">
		//    5   10:invokespecial   #27  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			else
				return new Wrapper(audioattributes);
		//    7   14:new             #2   <Class AudioAttributesCompatApi21$Wrapper>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:invokespecial   #29  <Method void AudioAttributesCompatApi21$Wrapper(AudioAttributes)>
		//   11   22:areturn         
		}

		public AudioAttributes unwrap()
		{
			return mWrapped;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AudioAttributes mWrapped>
		//    2    4:areturn         
		}

		private AudioAttributes mWrapped;

		private Wrapper(AudioAttributes audioattributes)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			mWrapped = audioattributes;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field AudioAttributes mWrapped>
		//    5    9:return          
		}
	}


	AudioAttributesCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static int toLegacyStreamType(Wrapper wrapper)
	{
		wrapper = ((Wrapper) (wrapper.unwrap()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//    2    4:astore_0        
		int i;
		try
		{
			if(sAudioAttributesToLegacyStreamType == null)
	//*   3    5:getstatic       #37  <Field Method sAudioAttributesToLegacyStreamType>
	//*   4    8:ifnonnull       30
				sAudioAttributesToLegacyStreamType = ((Class) (android/media/AudioAttributes)).getMethod("toLegacyStreamType", new Class[] {
					android/media/AudioAttributes
				});
	//    5   11:ldc1            #39  <Class AudioAttributes>
	//    6   13:ldc1            #40  <String "toLegacyStreamType">
	//    7   15:iconst_1        
	//    8   16:anewarray       Class[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc1            #39  <Class AudioAttributes>
	//   12   23:aastore         
	//   13   24:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   14   27:putstatic       #37  <Field Method sAudioAttributesToLegacyStreamType>
			i = ((Integer)sAudioAttributesToLegacyStreamType.invoke(((Object) (null)), new Object[] {
				wrapper
			})).intValue();
	//   15   30:getstatic       #37  <Field Method sAudioAttributesToLegacyStreamType>
	//   16   33:aconst_null     
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:aastore         
	//   23   42:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   24   45:checkcast       #54  <Class Integer>
	//   25   48:invokevirtual   #58  <Method int Integer.intValue()>
	//   26   51:istore_1        
		}
	//*  27   52:iload_1         
	//*  28   53:ireturn         
		// Misplaced declaration of an exception variable
		catch(Wrapper wrapper)
	//*  29   54:astore_0        
		{
			Log.w("AudioAttributesCompat", "getLegacyStreamType() failed on API21+", ((Throwable) (wrapper)));
	//   30   55:ldc1            #14  <String "AudioAttributesCompat">
	//   31   57:ldc1            #60  <String "getLegacyStreamType() failed on API21+">
	//   32   59:aload_0         
	//   33   60:invokestatic    #66  <Method int Log.w(String, String, Throwable)>
	//   34   63:pop             
			return -1;
	//   35   64:iconst_m1       
	//   36   65:ireturn         
		}
		return i;
	}

	private static final String TAG = "AudioAttributesCompat";
	private static Method sAudioAttributesToLegacyStreamType;
}
