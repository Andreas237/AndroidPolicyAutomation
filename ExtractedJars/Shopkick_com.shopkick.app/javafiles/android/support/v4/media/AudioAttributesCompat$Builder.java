// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesCompat, AudioAttributesImplApi21, AudioAttributesImplBase

public static class AudioAttributesCompat$Builder
{

	public AudioAttributesCompat build()
	{
		Object obj;
		if(!AudioAttributesCompat.sForceLegacyBehavior && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #45  <Field boolean AudioAttributesCompat.sForceLegacyBehavior>
	//*   1    3:ifne            78
	//*   2    6:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    9:bipush          21
	//*   4   11:icmplt          78
		{
			obj = ((Object) ((new android.media.AudioAttributes.Builder()).setContentType(mContentType).setFlags(mFlags).setUsage(mUsage)));
	//    5   14:new             #52  <Class android.media.AudioAttributes$Builder>
	//    6   17:dup             
	//    7   18:invokespecial   #53  <Method void android.media.AudioAttributes$Builder()>
	//    8   21:aload_0         
	//    9   22:getfield        #20  <Field int mContentType>
	//   10   25:invokevirtual   #57  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   11   28:aload_0         
	//   12   29:getfield        #22  <Field int mFlags>
	//   13   32:invokevirtual   #60  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setFlags(int)>
	//   14   35:aload_0         
	//   15   36:getfield        #18  <Field int mUsage>
	//   16   39:invokevirtual   #63  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   17   42:astore_2        
			int i = mLegacyStream;
	//   18   43:aload_0         
	//   19   44:getfield        #24  <Field int mLegacyStream>
	//   20   47:istore_1        
			if(i != -1)
	//*  21   48:iload_1         
	//*  22   49:iconst_m1       
	//*  23   50:icmpeq          59
				((android.media.AudioAttributes.Builder) (obj)).setLegacyStreamType(i);
	//   24   53:aload_2         
	//   25   54:iload_1         
	//   26   55:invokevirtual   #66  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setLegacyStreamType(int)>
	//   27   58:pop             
			obj = ((Object) (new AudioAttributesImplApi21(((android.media.AudioAttributes.Builder) (obj)).build(), mLegacyStream)));
	//   28   59:new             #68  <Class AudioAttributesImplApi21>
	//   29   62:dup             
	//   30   63:aload_2         
	//   31   64:invokevirtual   #71  <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   32   67:aload_0         
	//   33   68:getfield        #24  <Field int mLegacyStream>
	//   34   71:invokespecial   #74  <Method void AudioAttributesImplApi21(android.media.AudioAttributes, int)>
	//   35   74:astore_2        
		} else
	//*  36   75:goto            102
		{
			obj = ((Object) (new AudioAttributesImplBase(mContentType, mFlags, mUsage, mLegacyStream)));
	//   37   78:new             #76  <Class AudioAttributesImplBase>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:getfield        #20  <Field int mContentType>
	//   41   86:aload_0         
	//   42   87:getfield        #22  <Field int mFlags>
	//   43   90:aload_0         
	//   44   91:getfield        #18  <Field int mUsage>
	//   45   94:aload_0         
	//   46   95:getfield        #24  <Field int mLegacyStream>
	//   47   98:invokespecial   #79  <Method void AudioAttributesImplBase(int, int, int, int)>
	//   48  101:astore_2        
		}
		return new AudioAttributesCompat(((AudioAttributesImpl) (obj)));
	//   49  102:new             #6   <Class AudioAttributesCompat>
	//   50  105:dup             
	//   51  106:aload_2         
	//   52  107:invokespecial   #82  <Method void AudioAttributesCompat(AudioAttributesImpl)>
	//   53  110:areturn         
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
	//    4   38:putfield        #18  <Field int mUsage>
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
	//    9   45:putfield        #20  <Field int mContentType>
			break;
		}
		return this;
	//   10   48:aload_0         
	//   11   49:areturn         
	}

	public AudioAttributesCompat$Builder setFlags(int i)
	{
		mFlags = i & 0x3ff | mFlags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          1023
	//    3    5:iand            
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field int mFlags>
	//    6   10:ior             
	//    7   11:putfield        #22  <Field int mFlags>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	AudioAttributesCompat$Builder setInternalLegacyStreamType(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 10: default 60
	//	               0 196
	//	               1 188
	//	               2 180
	//	               3 172
	//	               4 164
	//	               5 156
	//	               6 138
	//	               7 125
	//	               8 117
	//	               9 109
	//	               10 101
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   60:new             #86  <Class StringBuilder>
	//    3   63:dup             
	//    4   64:invokespecial   #87  <Method void StringBuilder()>
	//    5   67:astore_2        
			stringbuilder.append("Invalid stream type ");
	//    6   68:aload_2         
	//    7   69:ldc1            #89  <String "Invalid stream type ">
	//    8   71:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   74:pop             
			stringbuilder.append(i);
	//   10   75:aload_2         
	//   11   76:iload_1         
	//   12   77:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   13   80:pop             
			stringbuilder.append(" for AudioAttributesCompat");
	//   14   81:aload_2         
	//   15   82:ldc1            #98  <String " for AudioAttributesCompat">
	//   16   84:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   17   87:pop             
			Log.e("AudioAttributesCompat", stringbuilder.toString());
	//   18   88:ldc1            #100 <String "AudioAttributesCompat">
	//   19   90:aload_2         
	//   20   91:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   21   94:invokestatic    #110 <Method int Log.e(String, String)>
	//   22   97:pop             
			break;

	//*  23   98:goto            201
		case 10: // '\n'
			mContentType = 1;
	//   24  101:aload_0         
	//   25  102:iconst_1        
	//   26  103:putfield        #20  <Field int mContentType>
			break;

	//*  27  106:goto            201
		case 9: // '\t'
			mContentType = 4;
	//   28  109:aload_0         
	//   29  110:iconst_4        
	//   30  111:putfield        #20  <Field int mContentType>
			break;

	//*  31  114:goto            201
		case 8: // '\b'
			mContentType = 4;
	//   32  117:aload_0         
	//   33  118:iconst_4        
	//   34  119:putfield        #20  <Field int mContentType>
			break;

	//*  35  122:goto            201
	//*  36  125:aload_0         
	//*  37  126:iconst_1        
	//*  38  127:aload_0         
	//*  39  128:getfield        #22  <Field int mFlags>
	//*  40  131:ior             
	//*  41  132:putfield        #22  <Field int mFlags>
	//*  42  135:goto            188
		case 6: // '\006'
			mContentType = 1;
	//   43  138:aload_0         
	//   44  139:iconst_1        
	//   45  140:putfield        #20  <Field int mContentType>
			mFlags = mFlags | 4;
	//   46  143:aload_0         
	//   47  144:aload_0         
	//   48  145:getfield        #22  <Field int mFlags>
	//   49  148:iconst_4        
	//   50  149:ior             
	//   51  150:putfield        #22  <Field int mFlags>
			break;

	//*  52  153:goto            201
		case 5: // '\005'
			mContentType = 4;
	//   53  156:aload_0         
	//   54  157:iconst_4        
	//   55  158:putfield        #20  <Field int mContentType>
			break;

	//*  56  161:goto            201
		case 4: // '\004'
			mContentType = 4;
	//   57  164:aload_0         
	//   58  165:iconst_4        
	//   59  166:putfield        #20  <Field int mContentType>
			break;

	//*  60  169:goto            201
		case 3: // '\003'
			mContentType = 2;
	//   61  172:aload_0         
	//   62  173:iconst_2        
	//   63  174:putfield        #20  <Field int mContentType>
			break;

	//*  64  177:goto            201
		case 2: // '\002'
			mContentType = 4;
	//   65  180:aload_0         
	//   66  181:iconst_4        
	//   67  182:putfield        #20  <Field int mContentType>
			break;

		case 7: // '\007'
			mFlags = 1 | mFlags;
			// fall through

	//*  68  185:goto            201
		case 1: // '\001'
			mContentType = 4;
	//   69  188:aload_0         
	//   70  189:iconst_4        
	//   71  190:putfield        #20  <Field int mContentType>
			break;

	//*  72  193:goto            201
		case 0: // '\0'
			mContentType = 1;
	//   73  196:aload_0         
	//   74  197:iconst_1        
	//   75  198:putfield        #20  <Field int mContentType>
			break;
		}
		mUsage = AudioAttributesCompat.usageForStreamType(i);
	//   76  201:aload_0         
	//   77  202:iload_1         
	//   78  203:invokestatic    #114 <Method int AudioAttributesCompat.usageForStreamType(int)>
	//   79  206:putfield        #18  <Field int mUsage>
		return this;
	//   80  209:aload_0         
	//   81  210:areturn         
	}

	public AudioAttributesCompat$Builder setLegacyStreamType(int i)
	{
		if(i != 10)
	//*   0    0:iload_1         
	//*   1    1:bipush          10
	//*   2    3:icmpeq          27
		{
			mLegacyStream = i;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #24  <Field int mLegacyStream>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   11:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   14:bipush          21
	//*   8   16:icmplt          25
				return setInternalLegacyStreamType(i);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokevirtual   #116 <Method AudioAttributesCompat$Builder setInternalLegacyStreamType(int)>
	//   12   24:areturn         
			else
				return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		} else
		{
			throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
	//   15   27:new             #118 <Class IllegalArgumentException>
	//   16   30:dup             
	//   17   31:ldc1            #120 <String "STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback">
	//   18   33:invokespecial   #123 <Method void IllegalArgumentException(String)>
	//   19   36:athrow          
		}
	}

	public AudioAttributesCompat$Builder setUsage(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 16: default 84
	//	               0 120
	//	               1 120
	//	               2 120
	//	               3 120
	//	               4 120
	//	               5 120
	//	               6 120
	//	               7 120
	//	               8 120
	//	               9 120
	//	               10 120
	//	               11 120
	//	               12 120
	//	               13 120
	//	               14 120
	//	               15 120
	//	               16 91
		default:
			mUsage = 0;
	//    2   84:aload_0         
	//    3   85:iconst_0        
	//    4   86:putfield        #18  <Field int mUsage>
			return this;
	//    5   89:aload_0         
	//    6   90:areturn         

		case 16: // '\020'
			if(!AudioAttributesCompat.sForceLegacyBehavior && android.os.Build.VERSION.SDK_INT > 25)
	//*   7   91:getstatic       #45  <Field boolean AudioAttributesCompat.sForceLegacyBehavior>
	//*   8   94:ifne            112
	//*   9   97:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10  100:bipush          25
	//*  11  102:icmple          112
			{
				mUsage = i;
	//   12  105:aload_0         
	//   13  106:iload_1         
	//   14  107:putfield        #18  <Field int mUsage>
				return this;
	//   15  110:aload_0         
	//   16  111:areturn         
			} else
			{
				mUsage = 12;
	//   17  112:aload_0         
	//   18  113:bipush          12
	//   19  115:putfield        #18  <Field int mUsage>
				return this;
	//   20  118:aload_0         
	//   21  119:areturn         
			}

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
	//   22  120:aload_0         
	//   23  121:iload_1         
	//   24  122:putfield        #18  <Field int mUsage>
			return this;
	//   25  125:aload_0         
	//   26  126:areturn         
		}
	}

	private int mContentType;
	private int mFlags;
	private int mLegacyStream;
	private int mUsage;

	public AudioAttributesCompat$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #22  <Field int mFlags>
		mLegacyStream = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #24  <Field int mLegacyStream>
	//   14   24:return          
	}

	public AudioAttributesCompat$Builder(AudioAttributesCompat audioattributescompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #22  <Field int mFlags>
		mLegacyStream = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #24  <Field int mLegacyStream>
		mUsage = audioattributescompat.getUsage();
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #30  <Method int AudioAttributesCompat.getUsage()>
	//   17   29:putfield        #18  <Field int mUsage>
		mContentType = audioattributescompat.getContentType();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #33  <Method int AudioAttributesCompat.getContentType()>
	//   21   37:putfield        #20  <Field int mContentType>
		mFlags = audioattributescompat.getFlags();
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #36  <Method int AudioAttributesCompat.getFlags()>
	//   25   45:putfield        #22  <Field int mFlags>
		mLegacyStream = audioattributescompat.getRawLegacyStreamType();
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #39  <Method int AudioAttributesCompat.getRawLegacyStreamType()>
	//   29   53:putfield        #24  <Field int mLegacyStream>
	//   30   56:return          
	}
}
