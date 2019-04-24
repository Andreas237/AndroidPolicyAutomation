// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			AudioAttributesCompat

public static class AudioAttributesCompat$Builder
{

	public AudioAttributesCompat build()
	{
		if(!AudioAttributesCompat.access$000() && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:invokestatic    #45  <Method boolean AudioAttributesCompat.access$000()>
	//*   1    3:ifne            85
	//*   2    6:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    9:bipush          21
	//*   4   11:icmplt          85
		{
			if(mAAObject != null)
	//*   5   14:aload_0         
	//*   6   15:getfield        #39  <Field Object mAAObject>
	//*   7   18:ifnull          29
				return AudioAttributesCompat.wrap(mAAObject);
	//    8   21:aload_0         
	//    9   22:getfield        #39  <Field Object mAAObject>
	//   10   25:invokestatic    #54  <Method AudioAttributesCompat AudioAttributesCompat.wrap(Object)>
	//   11   28:areturn         
			android.media.AudioAttributes.Builder builder = (new android.media.AudioAttributes.Builder()).setContentType(mContentType).setFlags(mFlags).setUsage(mUsage);
	//   12   29:new             #56  <Class android.media.AudioAttributes$Builder>
	//   13   32:dup             
	//   14   33:invokespecial   #57  <Method void android.media.AudioAttributes$Builder()>
	//   15   36:aload_0         
	//   16   37:getfield        #23  <Field int mContentType>
	//   17   40:invokevirtual   #61  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   18   43:aload_0         
	//   19   44:getfield        #25  <Field int mFlags>
	//   20   47:invokevirtual   #64  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setFlags(int)>
	//   21   50:aload_0         
	//   22   51:getfield        #21  <Field int mUsage>
	//   23   54:invokevirtual   #67  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   24   57:astore_1        
			if(mLegacyStream != null)
	//*  25   58:aload_0         
	//*  26   59:getfield        #33  <Field Integer mLegacyStream>
	//*  27   62:ifnull          77
				builder.setLegacyStreamType(mLegacyStream.intValue());
	//   28   65:aload_1         
	//   29   66:aload_0         
	//   30   67:getfield        #33  <Field Integer mLegacyStream>
	//   31   70:invokevirtual   #73  <Method int Integer.intValue()>
	//   32   73:invokevirtual   #76  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setLegacyStreamType(int)>
	//   33   76:pop             
			return AudioAttributesCompat.wrap(((Object) (builder.build())));
	//   34   77:aload_1         
	//   35   78:invokevirtual   #79  <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   36   81:invokestatic    #54  <Method AudioAttributesCompat AudioAttributesCompat.wrap(Object)>
	//   37   84:areturn         
		} else
		{
			AudioAttributesCompat audioattributescompat = new AudioAttributesCompat(((AudioAttributesCompat._cls1) (null)));
	//   38   85:new             #6   <Class AudioAttributesCompat>
	//   39   88:dup             
	//   40   89:aconst_null     
	//   41   90:invokespecial   #82  <Method void AudioAttributesCompat(AudioAttributesCompat$1)>
	//   42   93:astore_1        
			audioattributescompat.mContentType = mContentType;
	//   43   94:aload_1         
	//   44   95:aload_0         
	//   45   96:getfield        #23  <Field int mContentType>
	//   46   99:putfield        #29  <Field int AudioAttributesCompat.mContentType>
			audioattributescompat.mFlags = mFlags;
	//   47  102:aload_1         
	//   48  103:aload_0         
	//   49  104:getfield        #25  <Field int mFlags>
	//   50  107:putfield        #30  <Field int AudioAttributesCompat.mFlags>
			audioattributescompat.mUsage = mUsage;
	//   51  110:aload_1         
	//   52  111:aload_0         
	//   53  112:getfield        #21  <Field int mUsage>
	//   54  115:putfield        #28  <Field int AudioAttributesCompat.mUsage>
			audioattributescompat.mLegacyStream = mLegacyStream;
	//   55  118:aload_1         
	//   56  119:aload_0         
	//   57  120:getfield        #33  <Field Integer mLegacyStream>
	//   58  123:putfield        #32  <Field Integer AudioAttributesCompat.mLegacyStream>
			AudioAttributesCompat.access$202(audioattributescompat, ((pper) (null)));
	//   59  126:aload_1         
	//   60  127:aconst_null     
	//   61  128:invokestatic    #86  <Method AudioAttributesCompatApi21$Wrapper AudioAttributesCompat.access$202(AudioAttributesCompat, AudioAttributesCompatApi21$Wrapper)>
	//   62  131:pop             
			return audioattributescompat;
	//   63  132:aload_1         
	//   64  133:areturn         
		}
	}

	public AudioAttributesCompat$Builder setContentType(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 43
	//	               1 43
	//	               2 43
	//	               3 43
	//	               4 43
		default:
			mUsage = 0;
	//    2   36:aload_0         
	//    3   37:iconst_0        
	//    4   38:putfield        #21  <Field int mUsage>
			return this;
	//    5   41:aload_0         
	//    6   42:areturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			mContentType = i;
	//    7   43:aload_0         
	//    8   44:iload_1         
	//    9   45:putfield        #23  <Field int mContentType>
			break;
		}
		return this;
	//   10   48:aload_0         
	//   11   49:areturn         
	}

	public AudioAttributesCompat$Builder setFlags(int i)
	{
		mFlags = mFlags | i & 0x3ff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int mFlags>
	//    3    5:iload_1         
	//    4    6:sipush          1023
	//    5    9:iand            
	//    6   10:ior             
	//    7   11:putfield        #25  <Field int mFlags>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public AudioAttributesCompat$Builder setLegacyStreamType(int i)
	{
		if(i == 10)
	//*   0    0:iload_1         
	//*   1    1:bipush          10
	//*   2    3:icmpne          16
		{
			throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
	//    3    6:new             #89  <Class IllegalArgumentException>
	//    4    9:dup             
	//    5   10:ldc1            #91  <String "STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback">
	//    6   12:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			mLegacyStream = Integer.valueOf(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   11   21:putfield        #33  <Field Integer mLegacyStream>
			mUsage = AudioAttributesCompat.access$300(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokestatic    #102 <Method int AudioAttributesCompat.access$300(int)>
	//   15   29:putfield        #21  <Field int mUsage>
			return this;
	//   16   32:aload_0         
	//   17   33:areturn         
		}
	}

	public AudioAttributesCompat$Builder setUsage(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 16: default 84
	//	               0 91
	//	               1 91
	//	               2 91
	//	               3 91
	//	               4 91
	//	               5 91
	//	               6 91
	//	               7 91
	//	               8 91
	//	               9 91
	//	               10 91
	//	               11 91
	//	               12 91
	//	               13 91
	//	               14 91
	//	               15 91
	//	               16 98
		default:
			mUsage = 0;
	//    2   84:aload_0         
	//    3   85:iconst_0        
	//    4   86:putfield        #21  <Field int mUsage>
			return this;
	//    5   89:aload_0         
	//    6   90:areturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
		case 15: // '\017'
			mUsage = i;
	//    7   91:aload_0         
	//    8   92:iload_1         
	//    9   93:putfield        #21  <Field int mUsage>
			return this;
	//   10   96:aload_0         
	//   11   97:areturn         

		case 16: // '\020'
			break;
		}
		if(!AudioAttributesCompat.access$000() && android.os.Build.VERSION.SDK_INT > 25)
	//*  12   98:invokestatic    #45  <Method boolean AudioAttributesCompat.access$000()>
	//*  13  101:ifne            119
	//*  14  104:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15  107:bipush          25
	//*  16  109:icmple          119
		{
			mUsage = i;
	//   17  112:aload_0         
	//   18  113:iload_1         
	//   19  114:putfield        #21  <Field int mUsage>
			return this;
	//   20  117:aload_0         
	//   21  118:areturn         
		} else
		{
			mUsage = 12;
	//   22  119:aload_0         
	//   23  120:bipush          12
	//   24  122:putfield        #21  <Field int mUsage>
			return this;
	//   25  125:aload_0         
	//   26  126:areturn         
		}
	}

	private Object mAAObject;
	private int mContentType;
	private int mFlags;
	private Integer mLegacyStream;
	private int mUsage;

	public AudioAttributesCompat$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int mFlags>
	//   11   19:return          
	}

	public AudioAttributesCompat$Builder(AudioAttributesCompat audioattributescompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int mFlags>
		mUsage = audioattributescompat.mUsage;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getfield        #28  <Field int AudioAttributesCompat.mUsage>
	//   14   24:putfield        #21  <Field int mUsage>
		mContentType = audioattributescompat.mContentType;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getfield        #29  <Field int AudioAttributesCompat.mContentType>
	//   18   32:putfield        #23  <Field int mContentType>
		mFlags = audioattributescompat.mFlags;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:getfield        #30  <Field int AudioAttributesCompat.mFlags>
	//   22   40:putfield        #25  <Field int mFlags>
		mLegacyStream = audioattributescompat.mLegacyStream;
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:getfield        #32  <Field Integer AudioAttributesCompat.mLegacyStream>
	//   26   48:putfield        #33  <Field Integer mLegacyStream>
		mAAObject = audioattributescompat.unwrap();
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #37  <Method Object AudioAttributesCompat.unwrap()>
	//   30   56:putfield        #39  <Field Object mAAObject>
	//   31   59:return          
	}
}
