// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import java.lang.annotation.Annotation;
import java.util.Arrays;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesCompatApi21

public class AudioAttributesCompat
{
	public static interface AttributeContentType
		extends Annotation
	{
	}

	public static interface AttributeUsage
		extends Annotation
	{
	}

	private static abstract class AudioManagerHidden
	{

		public static final int STREAM_ACCESSIBILITY = 10;
		public static final int STREAM_BLUETOOTH_SCO = 6;
		public static final int STREAM_SYSTEM_ENFORCED = 7;
		public static final int STREAM_TTS = 9;

		private AudioManagerHidden()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class Builder
	{

		public AudioAttributesCompat build()
		{
			if(!AudioAttributesCompat.sForceLegacyBehavior && android.os.Build.VERSION.SDK_INT >= 21)
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
		//   35   78:invokevirtual   #79  <Method AudioAttributes android.media.AudioAttributes$Builder.build()>
		//   36   81:invokestatic    #54  <Method AudioAttributesCompat AudioAttributesCompat.wrap(Object)>
		//   37   84:areturn         
			} else
			{
				AudioAttributesCompat audioattributescompat = new AudioAttributesCompat();
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
				audioattributescompat.mAudioAttributesWrapper = null;
		//   59  126:aload_1         
		//   60  127:aconst_null     
		//   61  128:invokestatic    #86  <Method AudioAttributesCompatApi21$Wrapper AudioAttributesCompat.access$202(AudioAttributesCompat, AudioAttributesCompatApi21$Wrapper)>
		//   62  131:pop             
				return audioattributescompat;
		//   63  132:aload_1         
		//   64  133:areturn         
			}
		}

		public Builder setContentType(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 4: default 36
		//		               0 43
		//		               1 43
		//		               2 43
		//		               3 43
		//		               4 43
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

		public Builder setFlags(int i)
		{
			mFlags = i & 0x3ff | mFlags;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:sipush          1023
		//    3    5:iand            
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field int mFlags>
		//    6   10:ior             
		//    7   11:putfield        #25  <Field int mFlags>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Builder setLegacyStreamType(int i)
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
				mUsage = AudioAttributesCompat.usageForStreamType(i);
		//   12   24:aload_0         
		//   13   25:iload_1         
		//   14   26:invokestatic    #102 <Method int AudioAttributesCompat.access$300(int)>
		//   15   29:putfield        #21  <Field int mUsage>
				return this;
		//   16   32:aload_0         
		//   17   33:areturn         
			}
		}

		public Builder setUsage(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 16: default 84
		//		               0 91
		//		               1 91
		//		               2 91
		//		               3 91
		//		               4 91
		//		               5 91
		//		               6 91
		//		               7 91
		//		               8 91
		//		               9 91
		//		               10 91
		//		               11 91
		//		               12 91
		//		               13 91
		//		               14 91
		//		               15 91
		//		               16 98
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
			if(!AudioAttributesCompat.sForceLegacyBehavior && android.os.Build.VERSION.SDK_INT > 25)
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

		public Builder()
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

		public Builder(AudioAttributesCompat audioattributescompat)
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


	private AudioAttributesCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #115 <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #117 <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #119 <Field int mFlags>
	//   11   19:return          
	}


	public static void setForceLegacyBehavior(boolean flag)
	{
		sForceLegacyBehavior = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #125 <Field boolean sForceLegacyBehavior>
	//    2    4:return          
	}

	static int toVolumeStreamType(boolean flag, int i, int j)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if((i & 1) != 1) goto _L2; else goto _L1
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:iand            
	//    5    5:iconst_1        
	//    6    6:icmpne          18
_L1:
		if(!flag) goto _L4; else goto _L3
	//    7    9:iload_0         
	//    8   10:ifeq            15
_L3:
		return 1;
	//    9   13:iconst_1        
	//   10   14:ireturn         
_L4:
		return 7;
	//   11   15:bipush          7
	//   12   17:ireturn         
_L2:
		if((i & 4) == 4)
	//*  13   18:iload_1         
	//*  14   19:iconst_4        
	//*  15   20:iand            
	//*  16   21:iconst_4        
	//*  17   22:icmpne          34
			return !flag ? 6 : 0;
	//   18   25:iload_0         
	//   19   26:ifeq            31
	//   20   29:iconst_0        
	//   21   30:ireturn         
	//   22   31:bipush          6
	//   23   33:ireturn         
		switch(j)
	//*  24   34:iload_2         
		{
	//*  25   35:tableswitch     0 16: default 116
	//	               0 179
	//	               1 152
	//	               2 154
	//	               3 156
	//	               4 170
	//	               5 174
	//	               6 172
	//	               7 174
	//	               8 174
	//	               9 174
	//	               10 174
	//	               11 176
	//	               12 152
	//	               13 13
	//	               14 152
	//	               15 116
	//	               16 152
		case 15: // '\017'
		default:
			if(flag)
	//*  26  116:iload_0         
	//*  27  117:ifeq            188
				throw new IllegalArgumentException((new StringBuilder()).append("Unknown usage value ").append(j).append(" in audio attributes").toString());
	//   28  120:new             #145 <Class IllegalArgumentException>
	//   29  123:dup             
	//   30  124:new             #147 <Class StringBuilder>
	//   31  127:dup             
	//   32  128:invokespecial   #148 <Method void StringBuilder()>
	//   33  131:ldc1            #150 <String "Unknown usage value ">
	//   34  133:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   35  136:iload_2         
	//   36  137:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   37  140:ldc1            #159 <String " in audio attributes">
	//   38  142:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   39  145:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   40  148:invokespecial   #166 <Method void IllegalArgumentException(String)>
	//   41  151:athrow          
			else
	//*  42  152:iconst_3        
	//*  43  153:ireturn         
	//*  44  154:iconst_0        
	//*  45  155:ireturn         
	//*  46  156:iload_0         
	//*  47  157:ifeq            164
	//*  48  160:iload_3         
	//*  49  161:istore_1        
	//*  50  162:iload_1         
	//*  51  163:ireturn         
	//*  52  164:bipush          8
	//*  53  166:istore_1        
	//*  54  167:goto            162
	//*  55  170:iconst_4        
	//*  56  171:ireturn         
	//*  57  172:iconst_2        
	//*  58  173:ireturn         
	//*  59  174:iconst_5        
	//*  60  175:ireturn         
	//*  61  176:bipush          10
	//*  62  178:ireturn         
	//*  63  179:iload_0         
	//*  64  180:ifeq            186
	//*  65  183:ldc1            #167 <Int 0x80000000>
	//*  66  185:ireturn         
	//*  67  186:iconst_3        
	//*  68  187:ireturn         
				return 3;
	//   69  188:iconst_3        
	//   70  189:ireturn         

		case 0: // '\0'
			break; /* Loop/switch isn't completed */

		case 13: // '\r'
			break;

		case 1: // '\001'
		case 12: // '\f'
		case 14: // '\016'
		case 16: // '\020'
			return 3;

		case 2: // '\002'
			return 0;

		case 3: // '\003'
			if(flag)
				i = ((int) (flag1));
			else
				i = 8;
			return i;

		case 4: // '\004'
			return 4;

		case 6: // '\006'
			return 2;

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;

		case 11: // '\013'
			return 10;
		}
		if(true) goto _L3; else goto _L5
_L5:
		return !flag ? 3 : 0x80000000;
	}

	static int toVolumeStreamType(boolean flag, AudioAttributesCompat audioattributescompat)
	{
		return toVolumeStreamType(flag, audioattributescompat.getFlags(), audioattributescompat.getUsage());
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method int getFlags()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #175 <Method int getUsage()>
	//    5    9:invokestatic    #177 <Method int toVolumeStreamType(boolean, int, int)>
	//    6   12:ireturn         
	}

	private static int usageForStreamType(int i)
	{
		byte byte0 = 2;
	//    0    0:iconst_2        
	//    1    1:istore_1        
		switch(i)
	//*   2    2:iload_0         
		{
	//*   3    3:tableswitch     0 10: default 60
	//	               0 62
	//	               1 64
	//	               2 67
	//	               3 70
	//	               4 72
	//	               5 74
	//	               6 62
	//	               7 64
	//	               8 76
	//	               9 60
	//	               10 78
		case 9: // '\t'
		default:
			byte0 = 0;
	//    4   60:iconst_0        
	//    5   61:istore_1        
			// fall through

		case 0: // '\0'
		case 6: // '\006'
			return ((int) (byte0));
	//    6   62:iload_1         
	//    7   63:ireturn         

		case 1: // '\001'
		case 7: // '\007'
			return 13;
	//    8   64:bipush          13
	//    9   66:ireturn         

		case 2: // '\002'
			return 6;
	//   10   67:bipush          6
	//   11   69:ireturn         

		case 3: // '\003'
			return 1;
	//   12   70:iconst_1        
	//   13   71:ireturn         

		case 4: // '\004'
			return 4;
	//   14   72:iconst_4        
	//   15   73:ireturn         

		case 5: // '\005'
			return 5;
	//   16   74:iconst_5        
	//   17   75:ireturn         

		case 8: // '\b'
			return 3;
	//   18   76:iconst_3        
	//   19   77:ireturn         

		case 10: // '\n'
			return 11;
	//   20   78:bipush          11
	//   21   80:ireturn         
		}
	}

	static String usageToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 16: default 84
	//	               0 111
	//	               1 121
	//	               2 131
	//	               3 141
	//	               4 151
	//	               5 161
	//	               6 171
	//	               7 181
	//	               8 191
	//	               9 201
	//	               10 211
	//	               11 221
	//	               12 231
	//	               13 241
	//	               14 251
	//	               15 84
	//	               16 261
		case 15: // '\017'
		default:
			return new String((new StringBuilder()).append("unknown usage ").append(i).toString());
	//    2   84:new             #181 <Class String>
	//    3   87:dup             
	//    4   88:new             #147 <Class StringBuilder>
	//    5   91:dup             
	//    6   92:invokespecial   #148 <Method void StringBuilder()>
	//    7   95:ldc1            #183 <String "unknown usage ">
	//    8   97:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//    9  100:iload_0         
	//   10  101:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   11  104:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   12  107:invokespecial   #184 <Method void String(String)>
	//   13  110:areturn         

		case 0: // '\0'
			return new String("USAGE_UNKNOWN");
	//   14  111:new             #181 <Class String>
	//   15  114:dup             
	//   16  115:ldc1            #185 <String "USAGE_UNKNOWN">
	//   17  117:invokespecial   #184 <Method void String(String)>
	//   18  120:areturn         

		case 1: // '\001'
			return new String("USAGE_MEDIA");
	//   19  121:new             #181 <Class String>
	//   20  124:dup             
	//   21  125:ldc1            #186 <String "USAGE_MEDIA">
	//   22  127:invokespecial   #184 <Method void String(String)>
	//   23  130:areturn         

		case 2: // '\002'
			return new String("USAGE_VOICE_COMMUNICATION");
	//   24  131:new             #181 <Class String>
	//   25  134:dup             
	//   26  135:ldc1            #187 <String "USAGE_VOICE_COMMUNICATION">
	//   27  137:invokespecial   #184 <Method void String(String)>
	//   28  140:areturn         

		case 3: // '\003'
			return new String("USAGE_VOICE_COMMUNICATION_SIGNALLING");
	//   29  141:new             #181 <Class String>
	//   30  144:dup             
	//   31  145:ldc1            #188 <String "USAGE_VOICE_COMMUNICATION_SIGNALLING">
	//   32  147:invokespecial   #184 <Method void String(String)>
	//   33  150:areturn         

		case 4: // '\004'
			return new String("USAGE_ALARM");
	//   34  151:new             #181 <Class String>
	//   35  154:dup             
	//   36  155:ldc1            #189 <String "USAGE_ALARM">
	//   37  157:invokespecial   #184 <Method void String(String)>
	//   38  160:areturn         

		case 5: // '\005'
			return new String("USAGE_NOTIFICATION");
	//   39  161:new             #181 <Class String>
	//   40  164:dup             
	//   41  165:ldc1            #190 <String "USAGE_NOTIFICATION">
	//   42  167:invokespecial   #184 <Method void String(String)>
	//   43  170:areturn         

		case 6: // '\006'
			return new String("USAGE_NOTIFICATION_RINGTONE");
	//   44  171:new             #181 <Class String>
	//   45  174:dup             
	//   46  175:ldc1            #191 <String "USAGE_NOTIFICATION_RINGTONE">
	//   47  177:invokespecial   #184 <Method void String(String)>
	//   48  180:areturn         

		case 7: // '\007'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
	//   49  181:new             #181 <Class String>
	//   50  184:dup             
	//   51  185:ldc1            #192 <String "USAGE_NOTIFICATION_COMMUNICATION_REQUEST">
	//   52  187:invokespecial   #184 <Method void String(String)>
	//   53  190:areturn         

		case 8: // '\b'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
	//   54  191:new             #181 <Class String>
	//   55  194:dup             
	//   56  195:ldc1            #193 <String "USAGE_NOTIFICATION_COMMUNICATION_INSTANT">
	//   57  197:invokespecial   #184 <Method void String(String)>
	//   58  200:areturn         

		case 9: // '\t'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
	//   59  201:new             #181 <Class String>
	//   60  204:dup             
	//   61  205:ldc1            #194 <String "USAGE_NOTIFICATION_COMMUNICATION_DELAYED">
	//   62  207:invokespecial   #184 <Method void String(String)>
	//   63  210:areturn         

		case 10: // '\n'
			return new String("USAGE_NOTIFICATION_EVENT");
	//   64  211:new             #181 <Class String>
	//   65  214:dup             
	//   66  215:ldc1            #195 <String "USAGE_NOTIFICATION_EVENT">
	//   67  217:invokespecial   #184 <Method void String(String)>
	//   68  220:areturn         

		case 11: // '\013'
			return new String("USAGE_ASSISTANCE_ACCESSIBILITY");
	//   69  221:new             #181 <Class String>
	//   70  224:dup             
	//   71  225:ldc1            #196 <String "USAGE_ASSISTANCE_ACCESSIBILITY">
	//   72  227:invokespecial   #184 <Method void String(String)>
	//   73  230:areturn         

		case 12: // '\f'
			return new String("USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
	//   74  231:new             #181 <Class String>
	//   75  234:dup             
	//   76  235:ldc1            #197 <String "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE">
	//   77  237:invokespecial   #184 <Method void String(String)>
	//   78  240:areturn         

		case 13: // '\r'
			return new String("USAGE_ASSISTANCE_SONIFICATION");
	//   79  241:new             #181 <Class String>
	//   80  244:dup             
	//   81  245:ldc1            #198 <String "USAGE_ASSISTANCE_SONIFICATION">
	//   82  247:invokespecial   #184 <Method void String(String)>
	//   83  250:areturn         

		case 14: // '\016'
			return new String("USAGE_GAME");
	//   84  251:new             #181 <Class String>
	//   85  254:dup             
	//   86  255:ldc1            #199 <String "USAGE_GAME">
	//   87  257:invokespecial   #184 <Method void String(String)>
	//   88  260:areturn         

		case 16: // '\020'
			return new String("USAGE_ASSISTANT");
	//   89  261:new             #181 <Class String>
	//   90  264:dup             
	//   91  265:ldc1            #200 <String "USAGE_ASSISTANT">
	//   92  267:invokespecial   #184 <Method void String(String)>
	//   93  270:areturn         
		}
	}

	public static AudioAttributesCompat wrap(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          35
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            35
		{
			AudioAttributesCompat audioattributescompat = new AudioAttributesCompat();
	//    5   14:new             #2   <Class AudioAttributesCompat>
	//    6   17:dup             
	//    7   18:invokespecial   #121 <Method void AudioAttributesCompat()>
	//    8   21:astore_1        
			audioattributescompat.mAudioAttributesWrapper = AudioAttributesCompatApi21.Wrapper.wrap((AudioAttributes)obj);
	//    9   22:aload_1         
	//   10   23:aload_0         
	//   11   24:checkcast       #211 <Class AudioAttributes>
	//   12   27:invokestatic    #216 <Method AudioAttributesCompatApi21$Wrapper AudioAttributesCompatApi21$Wrapper.wrap(AudioAttributes)>
	//   13   30:putfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
			return audioattributescompat;
	//   14   33:aload_1         
	//   15   34:areturn         
		} else
		{
			return null;
	//   16   35:aconst_null     
	//   17   36:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(this != obj) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #223 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #223 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((AudioAttributesCompat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AudioAttributesCompat>
	//   16   28:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior && mAudioAttributesWrapper != null)
	//*  17   29:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   32:bipush          21
	//*  19   34:icmplt          65
	//*  20   37:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*  21   40:ifne            65
	//*  22   43:aload_0         
	//*  23   44:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*  24   47:ifnull          65
			return mAudioAttributesWrapper.unwrap().equals(((AudioAttributesCompat) (obj)).unwrap());
	//   25   50:aload_0         
	//   26   51:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   27   54:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #230 <Method Object unwrap()>
	//   30   61:invokevirtual   #232 <Method boolean AudioAttributes.equals(Object)>
	//   31   64:ireturn         
		if(mContentType != ((AudioAttributesCompat) (obj)).getContentType() || mFlags != ((AudioAttributesCompat) (obj)).getFlags() || mUsage != ((AudioAttributesCompat) (obj)).getUsage())
			break; /* Loop/switch isn't completed */
	//   32   65:aload_0         
	//   33   66:getfield        #117 <Field int mContentType>
	//   34   69:aload_1         
	//   35   70:invokevirtual   #235 <Method int getContentType()>
	//   36   73:icmpne          119
	//   37   76:aload_0         
	//   38   77:getfield        #119 <Field int mFlags>
	//   39   80:aload_1         
	//   40   81:invokevirtual   #172 <Method int getFlags()>
	//   41   84:icmpne          119
	//   42   87:aload_0         
	//   43   88:getfield        #115 <Field int mUsage>
	//   44   91:aload_1         
	//   45   92:invokevirtual   #175 <Method int getUsage()>
	//   46   95:icmpne          119
		if(mLegacyStream == null) goto _L4; else goto _L3
	//   47   98:aload_0         
	//   48   99:getfield        #237 <Field Integer mLegacyStream>
	//   49  102:ifnull          121
_L3:
		if(mLegacyStream.equals(((Object) (((AudioAttributesCompat) (obj)).mLegacyStream)))) goto _L1; else goto _L5
	//   50  105:aload_0         
	//   51  106:getfield        #237 <Field Integer mLegacyStream>
	//   52  109:aload_1         
	//   53  110:getfield        #237 <Field Integer mLegacyStream>
	//   54  113:invokevirtual   #240 <Method boolean Integer.equals(Object)>
	//   55  116:ifne            5
_L5:
		return false;
	//   56  119:iconst_0        
	//   57  120:ireturn         
_L4:
		if(((AudioAttributesCompat) (obj)).mLegacyStream == null)
	//*  58  121:aload_1         
	//*  59  122:getfield        #237 <Field Integer mLegacyStream>
	//*  60  125:ifnonnull       119
			return true;
	//   61  128:iconst_1        
	//   62  129:ireturn         
		if(true) goto _L5; else goto _L6
_L6:
	}

	public int getContentType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior && mAudioAttributesWrapper != null)
	//*   0    0:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          32
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            32
	//*   5   14:aload_0         
	//*   6   15:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*   7   18:ifnull          32
			return mAudioAttributesWrapper.unwrap().getContentType();
	//    8   21:aload_0         
	//    9   22:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   10   25:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   11   28:invokevirtual   #241 <Method int AudioAttributes.getContentType()>
	//   12   31:ireturn         
		else
			return mContentType;
	//   13   32:aload_0         
	//   14   33:getfield        #117 <Field int mContentType>
	//   15   36:ireturn         
	}

	public int getFlags()
	{
		int j;
		int k;
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior && mAudioAttributesWrapper != null)
	//*   0    0:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          32
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            32
	//*   5   14:aload_0         
	//*   6   15:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*   7   18:ifnull          32
			return mAudioAttributesWrapper.unwrap().getFlags();
	//    8   21:aload_0         
	//    9   22:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   10   25:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   11   28:invokevirtual   #242 <Method int AudioAttributes.getFlags()>
	//   12   31:ireturn         
		j = mFlags;
	//   13   32:aload_0         
	//   14   33:getfield        #119 <Field int mFlags>
	//   15   36:istore_2        
		k = getLegacyStreamType();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #245 <Method int getLegacyStreamType()>
	//   18   41:istore_3        
		if(k != 6) goto _L2; else goto _L1
	//   19   42:iload_3         
	//   20   43:bipush          6
	//   21   45:icmpne          58
_L1:
		int i = j | 4;
	//   22   48:iload_2         
	//   23   49:iconst_4        
	//   24   50:ior             
	//   25   51:istore_1        
_L4:
		return i & 0x111;
	//   26   52:iload_1         
	//   27   53:sipush          273
	//   28   56:iand            
	//   29   57:ireturn         
_L2:
		i = j;
	//   30   58:iload_2         
	//   31   59:istore_1        
		if(k == 7)
	//*  32   60:iload_3         
	//*  33   61:bipush          7
	//*  34   63:icmpne          52
			i = j | 1;
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:ior             
	//   38   69:istore_1        
		if(true) goto _L4; else goto _L3
	//   39   70:goto            52
_L3:
	}

	public int getLegacyStreamType()
	{
		if(mLegacyStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field Integer mLegacyStream>
	//*   2    4:ifnull          15
			return mLegacyStream.intValue();
	//    3    7:aload_0         
	//    4    8:getfield        #237 <Field Integer mLegacyStream>
	//    5   11:invokevirtual   #248 <Method int Integer.intValue()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   7   15:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmplt          37
	//*  10   23:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*  11   26:ifne            37
			return AudioAttributesCompatApi21.toLegacyStreamType(mAudioAttributesWrapper);
	//   12   29:aload_0         
	//   13   30:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   14   33:invokestatic    #254 <Method int AudioAttributesCompatApi21.toLegacyStreamType(AudioAttributesCompatApi21$Wrapper)>
	//   15   36:ireturn         
		else
			return toVolumeStreamType(false, mFlags, mUsage);
	//   16   37:iconst_0        
	//   17   38:aload_0         
	//   18   39:getfield        #119 <Field int mFlags>
	//   19   42:aload_0         
	//   20   43:getfield        #115 <Field int mUsage>
	//   21   46:invokestatic    #177 <Method int toVolumeStreamType(boolean, int, int)>
	//   22   49:ireturn         
	}

	public int getUsage()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior && mAudioAttributesWrapper != null)
	//*   0    0:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          32
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            32
	//*   5   14:aload_0         
	//*   6   15:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*   7   18:ifnull          32
			return mAudioAttributesWrapper.unwrap().getUsage();
	//    8   21:aload_0         
	//    9   22:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   10   25:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   11   28:invokevirtual   #255 <Method int AudioAttributes.getUsage()>
	//   12   31:ireturn         
		else
			return mUsage;
	//   13   32:aload_0         
	//   14   33:getfield        #115 <Field int mUsage>
	//   15   36:ireturn         
	}

	public int getVolumeControlStream()
	{
		if(this == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Invalid null audio attributes");
	//    2    4:new             #145 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #258 <String "Invalid null audio attributes">
	//    5   11:invokespecial   #166 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(android.os.Build.VERSION.SDK_INT >= 26 && !sForceLegacyBehavior && unwrap() != null)
	//*   7   15:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          26
	//*   9   20:icmplt          47
	//*  10   23:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*  11   26:ifne            47
	//*  12   29:aload_0         
	//*  13   30:invokevirtual   #230 <Method Object unwrap()>
	//*  14   33:ifnull          47
			return ((AudioAttributes)unwrap()).getVolumeControlStream();
	//   15   36:aload_0         
	//   16   37:invokevirtual   #230 <Method Object unwrap()>
	//   17   40:checkcast       #211 <Class AudioAttributes>
	//   18   43:invokevirtual   #260 <Method int AudioAttributes.getVolumeControlStream()>
	//   19   46:ireturn         
		else
			return toVolumeStreamType(true, this);
	//   20   47:iconst_1        
	//   21   48:aload_0         
	//   22   49:invokestatic    #262 <Method int toVolumeStreamType(boolean, AudioAttributesCompat)>
	//   23   52:ireturn         
	}

	public int hashCode()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior && mAudioAttributesWrapper != null)
	//*   0    0:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          32
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            32
	//*   5   14:aload_0         
	//*   6   15:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*   7   18:ifnull          32
			return mAudioAttributesWrapper.unwrap().hashCode();
	//    8   21:aload_0         
	//    9   22:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   10   25:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   11   28:invokevirtual   #265 <Method int AudioAttributes.hashCode()>
	//   12   31:ireturn         
		else
			return Arrays.hashCode(new Object[] {
				Integer.valueOf(mContentType), Integer.valueOf(mFlags), Integer.valueOf(mUsage), mLegacyStream
			});
	//   13   32:iconst_4        
	//   14   33:anewarray       Object[]
	//   15   36:dup             
	//   16   37:iconst_0        
	//   17   38:aload_0         
	//   18   39:getfield        #117 <Field int mContentType>
	//   19   42:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   20   45:aastore         
	//   21   46:dup             
	//   22   47:iconst_1        
	//   23   48:aload_0         
	//   24   49:getfield        #119 <Field int mFlags>
	//   25   52:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   26   55:aastore         
	//   27   56:dup             
	//   28   57:iconst_2        
	//   29   58:aload_0         
	//   30   59:getfield        #115 <Field int mUsage>
	//   31   62:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   32   65:aastore         
	//   33   66:dup             
	//   34   67:iconst_3        
	//   35   68:aload_0         
	//   36   69:getfield        #237 <Field Integer mLegacyStream>
	//   37   72:aastore         
	//   38   73:invokestatic    #274 <Method int Arrays.hashCode(Object[])>
	//   39   76:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("AudioAttributesCompat:");
	//    0    0:new             #147 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #276 <String "AudioAttributesCompat:">
	//    3    7:invokespecial   #277 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		if(unwrap() != null)
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #230 <Method Object unwrap()>
	//*   7   15:ifnull          38
		{
			stringbuilder.append(" audioattributes=").append(unwrap());
	//    8   18:aload_1         
	//    9   19:ldc2            #279 <String " audioattributes=">
	//   10   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #230 <Method Object unwrap()>
	//   13   29:invokevirtual   #282 <Method StringBuilder StringBuilder.append(Object)>
	//   14   32:pop             
		} else
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #163 <Method String StringBuilder.toString()>
	//*  17   37:areturn         
		{
			if(mLegacyStream != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #237 <Field Integer mLegacyStream>
	//*  20   42:ifnull          68
			{
				stringbuilder.append(" stream=").append(((Object) (mLegacyStream)));
	//   21   45:aload_1         
	//   22   46:ldc2            #284 <String " stream=">
	//   23   49:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:getfield        #237 <Field Integer mLegacyStream>
	//   26   56:invokevirtual   #282 <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:pop             
				stringbuilder.append(" derived");
	//   28   60:aload_1         
	//   29   61:ldc2            #286 <String " derived">
	//   30   64:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
			}
			stringbuilder.append(" usage=").append(usageToString()).append(" content=").append(mContentType).append(" flags=0x").append(Integer.toHexString(mFlags).toUpperCase());
	//   32   68:aload_1         
	//   33   69:ldc2            #288 <String " usage=">
	//   34   72:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:aload_0         
	//   36   76:invokevirtual   #290 <Method String usageToString()>
	//   37   79:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:ldc2            #292 <String " content=">
	//   39   85:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:aload_0         
	//   41   89:getfield        #117 <Field int mContentType>
	//   42   92:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   43   95:ldc2            #294 <String " flags=0x">
	//   44   98:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:aload_0         
	//   46  102:getfield        #119 <Field int mFlags>
	//   47  105:invokestatic    #297 <Method String Integer.toHexString(int)>
	//   48  108:invokevirtual   #300 <Method String String.toUpperCase()>
	//   49  111:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   50  114:pop             
		}
		return stringbuilder.toString();
	//*  51  115:goto            33
	}

	public Object unwrap()
	{
		if(mAudioAttributesWrapper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//*   2    4:ifnull          15
			return ((Object) (mAudioAttributesWrapper.unwrap()));
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    5   11:invokevirtual   #227 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//    6   14:areturn         
		else
			return ((Object) (null));
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	String usageToString()
	{
		return usageToString(mUsage);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int mUsage>
	//    2    4:invokestatic    #302 <Method String usageToString(int)>
	//    3    7:areturn         
	}

	public static final int CONTENT_TYPE_MOVIE = 3;
	public static final int CONTENT_TYPE_MUSIC = 2;
	public static final int CONTENT_TYPE_SONIFICATION = 4;
	public static final int CONTENT_TYPE_SPEECH = 1;
	public static final int CONTENT_TYPE_UNKNOWN = 0;
	private static final int FLAG_ALL = 1023;
	private static final int FLAG_ALL_PUBLIC = 273;
	public static final int FLAG_AUDIBILITY_ENFORCED = 1;
	private static final int FLAG_BEACON = 8;
	private static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
	private static final int FLAG_BYPASS_MUTE = 128;
	private static final int FLAG_DEEP_BUFFER = 512;
	public static final int FLAG_HW_AV_SYNC = 16;
	private static final int FLAG_HW_HOTWORD = 32;
	private static final int FLAG_LOW_LATENCY = 256;
	private static final int FLAG_SCO = 4;
	private static final int FLAG_SECURE = 2;
	private static final int SDK_USAGES[] = {
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		10, 11, 12, 13, 14, 16
	};
	private static final int SUPPRESSIBLE_CALL = 2;
	private static final int SUPPRESSIBLE_NOTIFICATION = 1;
	private static final SparseIntArray SUPPRESSIBLE_USAGES;
	private static final String TAG = "AudioAttributesCompat";
	public static final int USAGE_ALARM = 4;
	public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
	public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
	public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
	public static final int USAGE_ASSISTANT = 16;
	public static final int USAGE_GAME = 14;
	public static final int USAGE_MEDIA = 1;
	public static final int USAGE_NOTIFICATION = 5;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
	public static final int USAGE_NOTIFICATION_EVENT = 10;
	public static final int USAGE_NOTIFICATION_RINGTONE = 6;
	public static final int USAGE_UNKNOWN = 0;
	private static final int USAGE_VIRTUAL_SOURCE = 15;
	public static final int USAGE_VOICE_COMMUNICATION = 2;
	public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
	private static boolean sForceLegacyBehavior;
	private AudioAttributesCompatApi21.Wrapper mAudioAttributesWrapper;
	int mContentType;
	int mFlags;
	Integer mLegacyStream;
	int mUsage;

	static 
	{
		SUPPRESSIBLE_USAGES = new SparseIntArray();
	//    0    0:new             #100 <Class SparseIntArray>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void SparseIntArray()>
	//    3    7:putstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
		SUPPRESSIBLE_USAGES.put(5, 1);
	//    4   10:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    5   13:iconst_5        
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(6, 2);
	//    8   18:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    9   21:bipush          6
	//   10   23:iconst_2        
	//   11   24:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(7, 2);
	//   12   27:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   13   30:bipush          7
	//   14   32:iconst_2        
	//   15   33:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(8, 1);
	//   16   36:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   17   39:bipush          8
	//   18   41:iconst_1        
	//   19   42:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(9, 1);
	//   20   45:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   21   48:bipush          9
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(10, 1);
	//   24   54:getstatic       #105 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   25   57:bipush          10
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #109 <Method void SparseIntArray.put(int, int)>
	//   28   63:bipush          16
	//   29   65:newarray        int[]
	//   30   67:dup             
	//   31   68:iconst_0        
	//   32   69:iconst_0        
	//   33   70:iastore         
	//   34   71:dup             
	//   35   72:iconst_1        
	//   36   73:iconst_1        
	//   37   74:iastore         
	//   38   75:dup             
	//   39   76:iconst_2        
	//   40   77:iconst_2        
	//   41   78:iastore         
	//   42   79:dup             
	//   43   80:iconst_3        
	//   44   81:iconst_3        
	//   45   82:iastore         
	//   46   83:dup             
	//   47   84:iconst_4        
	//   48   85:iconst_4        
	//   49   86:iastore         
	//   50   87:dup             
	//   51   88:iconst_5        
	//   52   89:iconst_5        
	//   53   90:iastore         
	//   54   91:dup             
	//   55   92:bipush          6
	//   56   94:bipush          6
	//   57   96:iastore         
	//   58   97:dup             
	//   59   98:bipush          7
	//   60  100:bipush          7
	//   61  102:iastore         
	//   62  103:dup             
	//   63  104:bipush          8
	//   64  106:bipush          8
	//   65  108:iastore         
	//   66  109:dup             
	//   67  110:bipush          9
	//   68  112:bipush          9
	//   69  114:iastore         
	//   70  115:dup             
	//   71  116:bipush          10
	//   72  118:bipush          10
	//   73  120:iastore         
	//   74  121:dup             
	//   75  122:bipush          11
	//   76  124:bipush          11
	//   77  126:iastore         
	//   78  127:dup             
	//   79  128:bipush          12
	//   80  130:bipush          12
	//   81  132:iastore         
	//   82  133:dup             
	//   83  134:bipush          13
	//   84  136:bipush          13
	//   85  138:iastore         
	//   86  139:dup             
	//   87  140:bipush          14
	//   88  142:bipush          14
	//   89  144:iastore         
	//   90  145:dup             
	//   91  146:bipush          15
	//   92  148:bipush          16
	//   93  150:iastore         
	//   94  151:putstatic       #111 <Field int[] SDK_USAGES>
	//*  95  154:return          
	}


/*
	static boolean access$000()
	{
		return sForceLegacyBehavior;
	//    0    0:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//    1    3:ireturn         
	}

*/


/*
	static AudioAttributesCompatApi21.Wrapper access$202(AudioAttributesCompat audioattributescompat, AudioAttributesCompatApi21.Wrapper wrapper)
	{
		audioattributescompat.mAudioAttributesWrapper = wrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
		return wrapper;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$300(int i)
	{
		return usageForStreamType(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #134 <Method int usageForStreamType(int)>
	//    2    4:ireturn         
	}

*/
}
