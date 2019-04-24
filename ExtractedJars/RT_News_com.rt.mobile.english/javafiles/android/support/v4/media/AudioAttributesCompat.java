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
		//		               0 120
		//		               1 120
		//		               2 120
		//		               3 120
		//		               4 120
		//		               5 120
		//		               6 120
		//		               7 120
		//		               8 120
		//		               9 120
		//		               10 120
		//		               11 120
		//		               12 120
		//		               13 120
		//		               14 120
		//		               15 120
		//		               16 91
			default:
				mUsage = 0;
		//    2   84:aload_0         
		//    3   85:iconst_0        
		//    4   86:putfield        #21  <Field int mUsage>
				return this;
		//    5   89:aload_0         
		//    6   90:areturn         

			case 16: // '\020'
				if(!AudioAttributesCompat.sForceLegacyBehavior && android.os.Build.VERSION.SDK_INT > 25)
		//*   7   91:invokestatic    #45  <Method boolean AudioAttributesCompat.access$000()>
		//*   8   94:ifne            112
		//*   9   97:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
		//*  10  100:bipush          25
		//*  11  102:icmple          112
				{
					mUsage = i;
		//   12  105:aload_0         
		//   13  106:iload_1         
		//   14  107:putfield        #21  <Field int mUsage>
					return this;
		//   15  110:aload_0         
		//   16  111:areturn         
				} else
				{
					mUsage = 12;
		//   17  112:aload_0         
		//   18  113:bipush          12
		//   19  115:putfield        #21  <Field int mUsage>
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
		if((i & 1) == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:iconst_1        
	//*   4    4:icmpne          16
			return !flag ? 7 : 1;
	//    5    7:iload_0         
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:bipush          7
	//   10   15:ireturn         
		if((i & 4) == 4)
	//*  11   16:iload_1         
	//*  12   17:iconst_4        
	//*  13   18:iand            
	//*  14   19:iconst_4        
	//*  15   20:icmpne          32
			return !flag ? 6 : 0;
	//   16   23:iload_0         
	//   17   24:ifeq            29
	//   18   27:iconst_0        
	//   19   28:ireturn         
	//   20   29:bipush          6
	//   21   31:ireturn         
		i = 3;
	//   22   32:iconst_3        
	//   23   33:istore_1        
		switch(j)
	//*  24   34:iload_2         
		{
	//*  25   35:tableswitch     0 16: default 116
	//	               0 184
	//	               1 182
	//	               2 180
	//	               3 171
	//	               4 169
	//	               5 167
	//	               6 165
	//	               7 167
	//	               8 167
	//	               9 167
	//	               10 167
	//	               11 162
	//	               12 182
	//	               13 160
	//	               14 182
	//	               15 116
	//	               16 182
		case 15: // '\017'
		default:
			if(flag)
	//*  26  116:iload_0         
	//*  27  117:ifeq            193
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   28  120:new             #145 <Class StringBuilder>
	//   29  123:dup             
	//   30  124:invokespecial   #146 <Method void StringBuilder()>
	//   31  127:astore_3        
				stringbuilder.append("Unknown usage value ");
	//   32  128:aload_3         
	//   33  129:ldc1            #148 <String "Unknown usage value ">
	//   34  131:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   35  134:pop             
				stringbuilder.append(j);
	//   36  135:aload_3         
	//   37  136:iload_2         
	//   38  137:invokevirtual   #155 <Method StringBuilder StringBuilder.append(int)>
	//   39  140:pop             
				stringbuilder.append(" in audio attributes");
	//   40  141:aload_3         
	//   41  142:ldc1            #157 <String " in audio attributes">
	//   42  144:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   43  147:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   44  148:new             #159 <Class IllegalArgumentException>
	//   45  151:dup             
	//   46  152:aload_3         
	//   47  153:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   48  156:invokespecial   #166 <Method void IllegalArgumentException(String)>
	//   49  159:athrow          
			} else
	//*  50  160:iconst_1        
	//*  51  161:ireturn         
	//*  52  162:bipush          10
	//*  53  164:ireturn         
	//*  54  165:iconst_2        
	//*  55  166:ireturn         
	//*  56  167:iconst_5        
	//*  57  168:ireturn         
	//*  58  169:iconst_4        
	//*  59  170:ireturn         
	//*  60  171:iload_0         
	//*  61  172:ifeq            177
	//*  62  175:iconst_0        
	//*  63  176:ireturn         
	//*  64  177:bipush          8
	//*  65  179:ireturn         
	//*  66  180:iconst_0        
	//*  67  181:ireturn         
	//*  68  182:iconst_3        
	//*  69  183:ireturn         
	//*  70  184:iload_0         
	//*  71  185:ifeq            191
	//*  72  188:ldc1            #167 <Int 0x80000000>
	//*  73  190:istore_1        
	//*  74  191:iload_1         
	//*  75  192:ireturn         
			{
				return 3;
	//   76  193:iconst_3        
	//   77  194:ireturn         
			}

		case 13: // '\r'
			return 1;

		case 11: // '\013'
			return 10;

		case 6: // '\006'
			return 2;

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;

		case 4: // '\004'
			return 4;

		case 3: // '\003'
			return !flag ? 8 : 0;

		case 2: // '\002'
			return 0;

		case 1: // '\001'
		case 12: // '\f'
		case 14: // '\016'
		case 16: // '\020'
			return 3;

		case 0: // '\0'
			break;
		}
		if(flag)
			i = 0x80000000;
		return i;
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
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 10: default 60
	//	               0 81
	//	               1 78
	//	               2 75
	//	               3 73
	//	               4 71
	//	               5 69
	//	               6 67
	//	               7 78
	//	               8 65
	//	               9 60
	//	               10 62
		case 9: // '\t'
		default:
			return 0;
	//    2   60:iconst_0        
	//    3   61:ireturn         

		case 10: // '\n'
			return 11;
	//    4   62:bipush          11
	//    5   64:ireturn         

		case 8: // '\b'
			return 3;
	//    6   65:iconst_3        
	//    7   66:ireturn         

		case 6: // '\006'
			return 2;
	//    8   67:iconst_2        
	//    9   68:ireturn         

		case 5: // '\005'
			return 5;
	//   10   69:iconst_5        
	//   11   70:ireturn         

		case 4: // '\004'
			return 4;
	//   12   71:iconst_4        
	//   13   72:ireturn         

		case 3: // '\003'
			return 1;
	//   14   73:iconst_1        
	//   15   74:ireturn         

		case 2: // '\002'
			return 6;
	//   16   75:bipush          6
	//   17   77:ireturn         

		case 1: // '\001'
		case 7: // '\007'
			return 13;
	//   18   78:bipush          13
	//   19   80:ireturn         

		case 0: // '\0'
			return 2;
	//   20   81:iconst_2        
	//   21   82:ireturn         
		}
	}

	static String usageToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 16: default 84
	//	               0 267
	//	               1 257
	//	               2 247
	//	               3 237
	//	               4 227
	//	               5 217
	//	               6 207
	//	               7 197
	//	               8 187
	//	               9 177
	//	               10 167
	//	               11 157
	//	               12 147
	//	               13 137
	//	               14 127
	//	               15 84
	//	               16 117
		case 15: // '\017'
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   84:new             #145 <Class StringBuilder>
	//    3   87:dup             
	//    4   88:invokespecial   #146 <Method void StringBuilder()>
	//    5   91:astore_1        
			stringbuilder.append("unknown usage ");
	//    6   92:aload_1         
	//    7   93:ldc1            #181 <String "unknown usage ">
	//    8   95:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    9   98:pop             
			stringbuilder.append(i);
	//   10   99:aload_1         
	//   11  100:iload_0         
	//   12  101:invokevirtual   #155 <Method StringBuilder StringBuilder.append(int)>
	//   13  104:pop             
			return new String(stringbuilder.toString());
	//   14  105:new             #183 <Class String>
	//   15  108:dup             
	//   16  109:aload_1         
	//   17  110:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   18  113:invokespecial   #184 <Method void String(String)>
	//   19  116:areturn         

		case 16: // '\020'
			return new String("USAGE_ASSISTANT");
	//   20  117:new             #183 <Class String>
	//   21  120:dup             
	//   22  121:ldc1            #185 <String "USAGE_ASSISTANT">
	//   23  123:invokespecial   #184 <Method void String(String)>
	//   24  126:areturn         

		case 14: // '\016'
			return new String("USAGE_GAME");
	//   25  127:new             #183 <Class String>
	//   26  130:dup             
	//   27  131:ldc1            #186 <String "USAGE_GAME">
	//   28  133:invokespecial   #184 <Method void String(String)>
	//   29  136:areturn         

		case 13: // '\r'
			return new String("USAGE_ASSISTANCE_SONIFICATION");
	//   30  137:new             #183 <Class String>
	//   31  140:dup             
	//   32  141:ldc1            #187 <String "USAGE_ASSISTANCE_SONIFICATION">
	//   33  143:invokespecial   #184 <Method void String(String)>
	//   34  146:areturn         

		case 12: // '\f'
			return new String("USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
	//   35  147:new             #183 <Class String>
	//   36  150:dup             
	//   37  151:ldc1            #188 <String "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE">
	//   38  153:invokespecial   #184 <Method void String(String)>
	//   39  156:areturn         

		case 11: // '\013'
			return new String("USAGE_ASSISTANCE_ACCESSIBILITY");
	//   40  157:new             #183 <Class String>
	//   41  160:dup             
	//   42  161:ldc1            #189 <String "USAGE_ASSISTANCE_ACCESSIBILITY">
	//   43  163:invokespecial   #184 <Method void String(String)>
	//   44  166:areturn         

		case 10: // '\n'
			return new String("USAGE_NOTIFICATION_EVENT");
	//   45  167:new             #183 <Class String>
	//   46  170:dup             
	//   47  171:ldc1            #190 <String "USAGE_NOTIFICATION_EVENT">
	//   48  173:invokespecial   #184 <Method void String(String)>
	//   49  176:areturn         

		case 9: // '\t'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
	//   50  177:new             #183 <Class String>
	//   51  180:dup             
	//   52  181:ldc1            #191 <String "USAGE_NOTIFICATION_COMMUNICATION_DELAYED">
	//   53  183:invokespecial   #184 <Method void String(String)>
	//   54  186:areturn         

		case 8: // '\b'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
	//   55  187:new             #183 <Class String>
	//   56  190:dup             
	//   57  191:ldc1            #192 <String "USAGE_NOTIFICATION_COMMUNICATION_INSTANT">
	//   58  193:invokespecial   #184 <Method void String(String)>
	//   59  196:areturn         

		case 7: // '\007'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
	//   60  197:new             #183 <Class String>
	//   61  200:dup             
	//   62  201:ldc1            #193 <String "USAGE_NOTIFICATION_COMMUNICATION_REQUEST">
	//   63  203:invokespecial   #184 <Method void String(String)>
	//   64  206:areturn         

		case 6: // '\006'
			return new String("USAGE_NOTIFICATION_RINGTONE");
	//   65  207:new             #183 <Class String>
	//   66  210:dup             
	//   67  211:ldc1            #194 <String "USAGE_NOTIFICATION_RINGTONE">
	//   68  213:invokespecial   #184 <Method void String(String)>
	//   69  216:areturn         

		case 5: // '\005'
			return new String("USAGE_NOTIFICATION");
	//   70  217:new             #183 <Class String>
	//   71  220:dup             
	//   72  221:ldc1            #195 <String "USAGE_NOTIFICATION">
	//   73  223:invokespecial   #184 <Method void String(String)>
	//   74  226:areturn         

		case 4: // '\004'
			return new String("USAGE_ALARM");
	//   75  227:new             #183 <Class String>
	//   76  230:dup             
	//   77  231:ldc1            #196 <String "USAGE_ALARM">
	//   78  233:invokespecial   #184 <Method void String(String)>
	//   79  236:areturn         

		case 3: // '\003'
			return new String("USAGE_VOICE_COMMUNICATION_SIGNALLING");
	//   80  237:new             #183 <Class String>
	//   81  240:dup             
	//   82  241:ldc1            #197 <String "USAGE_VOICE_COMMUNICATION_SIGNALLING">
	//   83  243:invokespecial   #184 <Method void String(String)>
	//   84  246:areturn         

		case 2: // '\002'
			return new String("USAGE_VOICE_COMMUNICATION");
	//   85  247:new             #183 <Class String>
	//   86  250:dup             
	//   87  251:ldc1            #198 <String "USAGE_VOICE_COMMUNICATION">
	//   88  253:invokespecial   #184 <Method void String(String)>
	//   89  256:areturn         

		case 1: // '\001'
			return new String("USAGE_MEDIA");
	//   90  257:new             #183 <Class String>
	//   91  260:dup             
	//   92  261:ldc1            #199 <String "USAGE_MEDIA">
	//   93  263:invokespecial   #184 <Method void String(String)>
	//   94  266:areturn         

		case 0: // '\0'
			return new String("USAGE_UNKNOWN");
	//   95  267:new             #183 <Class String>
	//   96  270:dup             
	//   97  271:ldc1            #200 <String "USAGE_UNKNOWN">
	//   98  273:invokespecial   #184 <Method void String(String)>
	//   99  276:areturn         
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
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          132
		{
			if(((Object)this).getClass() != obj.getClass())
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
			if(mContentType == ((AudioAttributesCompat) (obj)).getContentType() && mFlags == ((AudioAttributesCompat) (obj)).getFlags() && mUsage == ((AudioAttributesCompat) (obj)).getUsage())
	//*  32   65:aload_0         
	//*  33   66:getfield        #117 <Field int mContentType>
	//*  34   69:aload_1         
	//*  35   70:invokevirtual   #235 <Method int getContentType()>
	//*  36   73:icmpne          130
	//*  37   76:aload_0         
	//*  38   77:getfield        #119 <Field int mFlags>
	//*  39   80:aload_1         
	//*  40   81:invokevirtual   #172 <Method int getFlags()>
	//*  41   84:icmpne          130
	//*  42   87:aload_0         
	//*  43   88:getfield        #115 <Field int mUsage>
	//*  44   91:aload_1         
	//*  45   92:invokevirtual   #175 <Method int getUsage()>
	//*  46   95:icmpne          130
				if(mLegacyStream != null)
	//*  47   98:aload_0         
	//*  48   99:getfield        #237 <Field Integer mLegacyStream>
	//*  49  102:ifnull          121
				{
					if(mLegacyStream.equals(((Object) (((AudioAttributesCompat) (obj)).mLegacyStream))))
	//*  50  105:aload_0         
	//*  51  106:getfield        #237 <Field Integer mLegacyStream>
	//*  52  109:aload_1         
	//*  53  110:getfield        #237 <Field Integer mLegacyStream>
	//*  54  113:invokevirtual   #240 <Method boolean Integer.equals(Object)>
	//*  55  116:ifeq            130
						return true;
	//   56  119:iconst_1        
	//   57  120:ireturn         
				} else
				if(((AudioAttributesCompat) (obj)).mLegacyStream == null)
	//*  58  121:aload_1         
	//*  59  122:getfield        #237 <Field Integer mLegacyStream>
	//*  60  125:ifnonnull       130
					return true;
	//   61  128:iconst_1        
	//   62  129:ireturn         
			return false;
	//   63  130:iconst_0        
	//   64  131:ireturn         
		} else
		{
			return false;
	//   65  132:iconst_0        
	//   66  133:ireturn         
		}
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
		int j = mFlags;
	//   13   32:aload_0         
	//   14   33:getfield        #119 <Field int mFlags>
	//   15   36:istore_2        
		int k = getLegacyStreamType();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #245 <Method int getLegacyStreamType()>
	//   18   41:istore_3        
		int i;
		if(k == 6)
	//*  19   42:iload_3         
	//*  20   43:bipush          6
	//*  21   45:icmpne          55
		{
			i = j | 4;
	//   22   48:iload_2         
	//   23   49:iconst_4        
	//   24   50:ior             
	//   25   51:istore_1        
		} else
	//*  26   52:goto            67
		{
			i = j;
	//   27   55:iload_2         
	//   28   56:istore_1        
			if(k == 7)
	//*  29   57:iload_3         
	//*  30   58:bipush          7
	//*  31   60:icmpne          67
				i = j | 1;
	//   32   63:iload_2         
	//   33   64:iconst_1        
	//   34   65:ior             
	//   35   66:istore_1        
		}
		return i & 0x111;
	//   36   67:iload_1         
	//   37   68:sipush          273
	//   38   71:iand            
	//   39   72:ireturn         
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
	//    2    4:new             #159 <Class IllegalArgumentException>
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
	//    0    0:new             #145 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #276 <String "AudioAttributesCompat:">
	//    3    7:invokespecial   #277 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		if(unwrap() != null)
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #230 <Method Object unwrap()>
	//*   7   15:ifnull          38
		{
			stringbuilder.append(" audioattributes=");
	//    8   18:aload_1         
	//    9   19:ldc2            #279 <String " audioattributes=">
	//   10   22:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(unwrap());
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:invokevirtual   #230 <Method Object unwrap()>
	//   15   31:invokevirtual   #282 <Method StringBuilder StringBuilder.append(Object)>
	//   16   34:pop             
		} else
	//*  17   35:goto            127
		{
			if(mLegacyStream != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #237 <Field Integer mLegacyStream>
	//*  20   42:ifnull          70
			{
				stringbuilder.append(" stream=");
	//   21   45:aload_1         
	//   22   46:ldc2            #284 <String " stream=">
	//   23   49:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
				stringbuilder.append(((Object) (mLegacyStream)));
	//   25   53:aload_1         
	//   26   54:aload_0         
	//   27   55:getfield        #237 <Field Integer mLegacyStream>
	//   28   58:invokevirtual   #282 <Method StringBuilder StringBuilder.append(Object)>
	//   29   61:pop             
				stringbuilder.append(" derived");
	//   30   62:aload_1         
	//   31   63:ldc2            #286 <String " derived">
	//   32   66:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			}
			stringbuilder.append(" usage=");
	//   34   70:aload_1         
	//   35   71:ldc2            #288 <String " usage=">
	//   36   74:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append(usageToString());
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #290 <Method String usageToString()>
	//   41   83:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			stringbuilder.append(" content=");
	//   43   87:aload_1         
	//   44   88:ldc2            #292 <String " content=">
	//   45   91:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
			stringbuilder.append(mContentType);
	//   47   95:aload_1         
	//   48   96:aload_0         
	//   49   97:getfield        #117 <Field int mContentType>
	//   50  100:invokevirtual   #155 <Method StringBuilder StringBuilder.append(int)>
	//   51  103:pop             
			stringbuilder.append(" flags=0x");
	//   52  104:aload_1         
	//   53  105:ldc2            #294 <String " flags=0x">
	//   54  108:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
			stringbuilder.append(Integer.toHexString(mFlags).toUpperCase());
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #119 <Field int mFlags>
	//   59  117:invokestatic    #297 <Method String Integer.toHexString(int)>
	//   60  120:invokevirtual   #300 <Method String String.toUpperCase()>
	//   61  123:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   62  126:pop             
		}
		return stringbuilder.toString();
	//   63  127:aload_1         
	//   64  128:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   65  131:areturn         
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
