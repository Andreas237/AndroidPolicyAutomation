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

		public AudioAttributes unwrap()
		{
			return mWrapped;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AudioAttributes mWrapped>
		//    2    4:areturn         
		}

		private AudioAttributes mWrapped;
	}


	public static int toLegacyStreamType(Wrapper wrapper)
	{
		wrapper = ((Wrapper) (wrapper.unwrap()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//    2    4:astore_0        
		int i;
		if(sAudioAttributesToLegacyStreamType == null)
	//*   3    5:getstatic       #28  <Field Method sAudioAttributesToLegacyStreamType>
	//*   4    8:ifnonnull       30
			sAudioAttributesToLegacyStreamType = ((Class) (android/media/AudioAttributes)).getMethod("toLegacyStreamType", new Class[] {
				android/media/AudioAttributes
			});
	//    5   11:ldc1            #30  <Class AudioAttributes>
	//    6   13:ldc1            #31  <String "toLegacyStreamType">
	//    7   15:iconst_1        
	//    8   16:anewarray       Class[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc1            #30  <Class AudioAttributes>
	//   12   23:aastore         
	//   13   24:invokevirtual   #37  <Method Method Class.getMethod(String, Class[])>
	//   14   27:putstatic       #28  <Field Method sAudioAttributesToLegacyStreamType>
		i = ((Integer)sAudioAttributesToLegacyStreamType.invoke(((Object) (null)), new Object[] {
			wrapper
		})).intValue();
	//   15   30:getstatic       #28  <Field Method sAudioAttributesToLegacyStreamType>
	//   16   33:aconst_null     
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:aastore         
	//   23   42:invokevirtual   #43  <Method Object Method.invoke(Object, Object[])>
	//   24   45:checkcast       #45  <Class Integer>
	//   25   48:invokevirtual   #49  <Method int Integer.intValue()>
	//   26   51:istore_1        
		return i;
	//   27   52:iload_1         
	//   28   53:ireturn         
		wrapper;
	//   29   54:astore_0        
		break MISSING_BLOCK_LABEL_67;
	//   30   55:goto            67
		wrapper;
	//   31   58:astore_0        
		break MISSING_BLOCK_LABEL_67;
	//   32   59:goto            67
		wrapper;
	//   33   62:astore_0        
		break MISSING_BLOCK_LABEL_67;
	//   34   63:goto            67
		wrapper;
	//   35   66:astore_0        
		Log.w("AudioAttributesCompat", "getLegacyStreamType() failed on API21+", ((Throwable) (wrapper)));
	//   36   67:ldc1            #51  <String "AudioAttributesCompat">
	//   37   69:ldc1            #53  <String "getLegacyStreamType() failed on API21+">
	//   38   71:aload_0         
	//   39   72:invokestatic    #59  <Method int Log.w(String, String, Throwable)>
	//   40   75:pop             
		return -1;
	//   41   76:iconst_m1       
	//   42   77:ireturn         
	}

	private static Method sAudioAttributesToLegacyStreamType;
}
