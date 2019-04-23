// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.Arrays;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesImpl, AudioAttributesCompat

class AudioAttributesImplBase
	implements AudioAttributesImpl
{

	AudioAttributesImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int mFlags>
		mLegacyStream = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #23  <Field int mLegacyStream>
	//   14   24:return          
	}

	AudioAttributesImplBase(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int mFlags>
		mLegacyStream = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #23  <Field int mLegacyStream>
		mContentType = i;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:putfield        #19  <Field int mContentType>
		mFlags = j;
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:putfield        #21  <Field int mFlags>
		mUsage = k;
	//   20   34:aload_0         
	//   21   35:iload_3         
	//   22   36:putfield        #17  <Field int mUsage>
		mLegacyStream = l;
	//   23   39:aload_0         
	//   24   40:iload           4
	//   25   42:putfield        #23  <Field int mLegacyStream>
	//   26   45:return          
	}

	public static AudioAttributesImpl fromBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			int i = bundle.getInt("android.support.v4.media.audio_attrs.USAGE", 0);
	//    4    6:aload_0         
	//    5    7:ldc1            #29  <String "android.support.v4.media.audio_attrs.USAGE">
	//    6    9:iconst_0        
	//    7   10:invokevirtual   #35  <Method int Bundle.getInt(String, int)>
	//    8   13:istore_1        
			return ((AudioAttributesImpl) (new AudioAttributesImplBase(bundle.getInt("android.support.v4.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("android.support.v4.media.audio_attrs.FLAGS", 0), i, bundle.getInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", -1))));
	//    9   14:new             #2   <Class AudioAttributesImplBase>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:ldc1            #37  <String "android.support.v4.media.audio_attrs.CONTENT_TYPE">
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #35  <Method int Bundle.getInt(String, int)>
	//   15   25:aload_0         
	//   16   26:ldc1            #39  <String "android.support.v4.media.audio_attrs.FLAGS">
	//   17   28:iconst_0        
	//   18   29:invokevirtual   #35  <Method int Bundle.getInt(String, int)>
	//   19   32:iload_1         
	//   20   33:aload_0         
	//   21   34:ldc1            #41  <String "android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE">
	//   22   36:iconst_m1       
	//   23   37:invokevirtual   #35  <Method int Bundle.getInt(String, int)>
	//   24   40:invokespecial   #43  <Method void AudioAttributesImplBase(int, int, int, int)>
	//   25   43:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof AudioAttributesImplBase;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AudioAttributesImplBase>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((AudioAttributesImplBase)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class AudioAttributesImplBase>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mContentType == ((AudioAttributesImplBase) (obj)).getContentType())
	//*  14   20:aload_0         
	//*  15   21:getfield        #19  <Field int mContentType>
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #49  <Method int getContentType()>
	//*  18   28:icmpne          72
		{
			flag = flag1;
	//   19   31:iload_3         
	//   20   32:istore_2        
			if(mFlags == ((AudioAttributesImplBase) (obj)).getFlags())
	//*  21   33:aload_0         
	//*  22   34:getfield        #21  <Field int mFlags>
	//*  23   37:aload_1         
	//*  24   38:invokevirtual   #52  <Method int getFlags()>
	//*  25   41:icmpne          72
			{
				flag = flag1;
	//   26   44:iload_3         
	//   27   45:istore_2        
				if(mUsage == ((AudioAttributesImplBase) (obj)).getUsage())
	//*  28   46:aload_0         
	//*  29   47:getfield        #17  <Field int mUsage>
	//*  30   50:aload_1         
	//*  31   51:invokevirtual   #55  <Method int getUsage()>
	//*  32   54:icmpne          72
				{
					flag = flag1;
	//   33   57:iload_3         
	//   34   58:istore_2        
					if(mLegacyStream == ((AudioAttributesImplBase) (obj)).mLegacyStream)
	//*  35   59:aload_0         
	//*  36   60:getfield        #23  <Field int mLegacyStream>
	//*  37   63:aload_1         
	//*  38   64:getfield        #23  <Field int mLegacyStream>
	//*  39   67:icmpne          72
						flag = true;
	//   40   70:iconst_1        
	//   41   71:istore_2        
				}
			}
		}
		return flag;
	//   42   72:iload_2         
	//   43   73:ireturn         
	}

	public Object getAudioAttributes()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getContentType()
	{
		return mContentType;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mContentType>
	//    2    4:ireturn         
	}

	public int getFlags()
	{
		int j = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mFlags>
	//    2    4:istore_2        
		int k = getLegacyStreamType();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #60  <Method int getLegacyStreamType()>
	//    5    9:istore_3        
		int i;
		if(k == 6)
	//*   6   10:iload_3         
	//*   7   11:bipush          6
	//*   8   13:icmpne          23
		{
			i = j | 4;
	//    9   16:iload_2         
	//   10   17:iconst_4        
	//   11   18:ior             
	//   12   19:istore_1        
		} else
	//*  13   20:goto            35
		{
			i = j;
	//   14   23:iload_2         
	//   15   24:istore_1        
			if(k == 7)
	//*  16   25:iload_3         
	//*  17   26:bipush          7
	//*  18   28:icmpne          35
				i = j | 1;
	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:ior             
	//   22   34:istore_1        
		}
		return i & 0x111;
	//   23   35:iload_1         
	//   24   36:sipush          273
	//   25   39:iand            
	//   26   40:ireturn         
	}

	public int getLegacyStreamType()
	{
		int i = mLegacyStream;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mLegacyStream>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		else
			return AudioAttributesCompat.toVolumeStreamType(false, mFlags, mUsage);
	//    8   12:iconst_0        
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field int mFlags>
	//   11   17:aload_0         
	//   12   18:getfield        #17  <Field int mUsage>
	//   13   21:invokestatic    #66  <Method int AudioAttributesCompat.toVolumeStreamType(boolean, int, int)>
	//   14   24:ireturn         
	}

	public int getRawLegacyStreamType()
	{
		return mLegacyStream;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mLegacyStream>
	//    2    4:ireturn         
	}

	public int getUsage()
	{
		return mUsage;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mUsage>
	//    2    4:ireturn         
	}

	public int getVolumeControlStream()
	{
		return AudioAttributesCompat.toVolumeStreamType(true, mFlags, mUsage);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int mFlags>
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field int mUsage>
	//    5    9:invokestatic    #66  <Method int AudioAttributesCompat.toVolumeStreamType(boolean, int, int)>
	//    6   12:ireturn         
	}

	public int hashCode()
	{
		return Arrays.hashCode(new Object[] {
			Integer.valueOf(mContentType), Integer.valueOf(mFlags), Integer.valueOf(mUsage), Integer.valueOf(mLegacyStream)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field int mContentType>
	//    6   10:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field int mFlags>
	//   12   20:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #17  <Field int mUsage>
	//   18   30:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #23  <Field int mLegacyStream>
	//   24   40:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   25   43:aastore         
	//   26   44:invokestatic    #80  <Method int Arrays.hashCode(Object[])>
	//   27   47:ireturn         
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #31  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putInt("android.support.v4.media.audio_attrs.USAGE", mUsage);
	//    4    8:aload_2         
	//    5    9:ldc1            #29  <String "android.support.v4.media.audio_attrs.USAGE">
	//    6   11:aload_0         
	//    7   12:getfield        #17  <Field int mUsage>
	//    8   15:invokevirtual   #88  <Method void Bundle.putInt(String, int)>
		bundle.putInt("android.support.v4.media.audio_attrs.CONTENT_TYPE", mContentType);
	//    9   18:aload_2         
	//   10   19:ldc1            #37  <String "android.support.v4.media.audio_attrs.CONTENT_TYPE">
	//   11   21:aload_0         
	//   12   22:getfield        #19  <Field int mContentType>
	//   13   25:invokevirtual   #88  <Method void Bundle.putInt(String, int)>
		bundle.putInt("android.support.v4.media.audio_attrs.FLAGS", mFlags);
	//   14   28:aload_2         
	//   15   29:ldc1            #39  <String "android.support.v4.media.audio_attrs.FLAGS">
	//   16   31:aload_0         
	//   17   32:getfield        #21  <Field int mFlags>
	//   18   35:invokevirtual   #88  <Method void Bundle.putInt(String, int)>
		int i = mLegacyStream;
	//   19   38:aload_0         
	//   20   39:getfield        #23  <Field int mLegacyStream>
	//   21   42:istore_1        
		if(i != -1)
	//*  22   43:iload_1         
	//*  23   44:iconst_m1       
	//*  24   45:icmpeq          55
			bundle.putInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", i);
	//   25   48:aload_2         
	//   26   49:ldc1            #41  <String "android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE">
	//   27   51:iload_1         
	//   28   52:invokevirtual   #88  <Method void Bundle.putInt(String, int)>
		return bundle;
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("AudioAttributesCompat:");
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #95  <String "AudioAttributesCompat:">
	//    3    6:invokespecial   #98  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		if(mLegacyStream != -1)
	//*   5   10:aload_0         
	//*   6   11:getfield        #23  <Field int mLegacyStream>
	//*   7   14:iconst_m1       
	//*   8   15:icmpeq          41
		{
			stringbuilder.append(" stream=");
	//    9   18:aload_1         
	//   10   19:ldc1            #100 <String " stream=">
	//   11   21:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder.append(mLegacyStream);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field int mLegacyStream>
	//   16   30:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   17   33:pop             
			stringbuilder.append(" derived");
	//   18   34:aload_1         
	//   19   35:ldc1            #109 <String " derived">
	//   20   37:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		}
		stringbuilder.append(" usage=");
	//   22   41:aload_1         
	//   23   42:ldc1            #111 <String " usage=">
	//   24   44:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(AudioAttributesCompat.usageToString(mUsage));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:getfield        #17  <Field int mUsage>
	//   29   53:invokestatic    #115 <Method String AudioAttributesCompat.usageToString(int)>
	//   30   56:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append(" content=");
	//   32   60:aload_1         
	//   33   61:ldc1            #117 <String " content=">
	//   34   63:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(mContentType);
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:getfield        #19  <Field int mContentType>
	//   39   72:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   40   75:pop             
		stringbuilder.append(" flags=0x");
	//   41   76:aload_1         
	//   42   77:ldc1            #119 <String " flags=0x">
	//   43   79:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		stringbuilder.append(Integer.toHexString(mFlags).toUpperCase());
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:getfield        #21  <Field int mFlags>
	//   48   88:invokestatic    #122 <Method String Integer.toHexString(int)>
	//   49   91:invokevirtual   #127 <Method String String.toUpperCase()>
	//   50   94:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		return stringbuilder.toString();
	//   52   98:aload_1         
	//   53   99:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   54  102:areturn         
	}

	int mContentType;
	int mFlags;
	int mLegacyStream;
	int mUsage;
}
