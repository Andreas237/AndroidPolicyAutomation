// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.AudioAttributes;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesImplApi21, AudioAttributesImplBase, AudioAttributesImpl

public class AudioAttributesCompat
	implements VersionedParcelable
{
	public static interface AttributeContentType
		extends Annotation
	{
	}

	public static interface AttributeUsage
		extends Annotation
	{
	}

	static abstract class AudioManagerHidden
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
		//   31   64:invokevirtual   #71  <Method AudioAttributes android.media.AudioAttributes$Builder.build()>
		//   32   67:aload_0         
		//   33   68:getfield        #24  <Field int mLegacyStream>
		//   34   71:invokespecial   #74  <Method void AudioAttributesImplApi21(AudioAttributes, int)>
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

		public Builder setFlags(int i)
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

		Builder setInternalLegacyStreamType(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 10: default 60
		//		               0 196
		//		               1 188
		//		               2 180
		//		               3 172
		//		               4 164
		//		               5 156
		//		               6 138
		//		               7 125
		//		               8 117
		//		               9 109
		//		               10 101
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

		public Builder setLegacyStreamType(int i)
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

		public Builder()
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

		public Builder(AudioAttributesCompat audioattributescompat)
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


	AudioAttributesCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
	//    2    4:return          
	}

	AudioAttributesCompat(AudioAttributesImpl audioattributesimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		mImpl = audioattributesimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #128 <Field AudioAttributesImpl mImpl>
	//    5    9:return          
	}

	public static AudioAttributesCompat fromBundle(Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #139 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			bundle = ((Bundle) (AudioAttributesImplApi21.fromBundle(bundle)));
	//    3    8:aload_0         
	//    4    9:invokestatic    #144 <Method AudioAttributesImpl AudioAttributesImplApi21.fromBundle(Bundle)>
	//    5   12:astore_0        
		else
	//*   6   13:goto            21
			bundle = ((Bundle) (AudioAttributesImplBase.fromBundle(bundle)));
	//    7   16:aload_0         
	//    8   17:invokestatic    #147 <Method AudioAttributesImpl AudioAttributesImplBase.fromBundle(Bundle)>
	//    9   20:astore_0        
		if(bundle == null)
	//*  10   21:aload_0         
	//*  11   22:ifnonnull       27
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
		else
			return new AudioAttributesCompat(((AudioAttributesImpl) (bundle)));
	//   14   27:new             #2   <Class AudioAttributesCompat>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #149 <Method void AudioAttributesCompat(AudioAttributesImpl)>
	//   18   35:areturn         
	}

	public static void setForceLegacyBehavior(boolean flag)
	{
		sForceLegacyBehavior = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #154 <Field boolean sForceLegacyBehavior>
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
	//	               0 146
	//	               1 144
	//	               2 142
	//	               3 133
	//	               4 131
	//	               5 129
	//	               6 127
	//	               7 129
	//	               8 129
	//	               9 129
	//	               10 129
	//	               11 124
	//	               12 144
	//	               13 122
	//	               14 144
	//	               15 116
	//	               16 144
		case 15: // '\017'
		default:
			if(!flag)
	//*  26  116:iload_0         
	//*  27  117:ifne            155
			{
				return 3;
	//   28  120:iconst_3        
	//   29  121:ireturn         
			} else
	//*  30  122:iconst_1        
	//*  31  123:ireturn         
	//*  32  124:bipush          10
	//*  33  126:ireturn         
	//*  34  127:iconst_2        
	//*  35  128:ireturn         
	//*  36  129:iconst_5        
	//*  37  130:ireturn         
	//*  38  131:iconst_4        
	//*  39  132:ireturn         
	//*  40  133:iload_0         
	//*  41  134:ifeq            139
	//*  42  137:iconst_0        
	//*  43  138:ireturn         
	//*  44  139:bipush          8
	//*  45  141:ireturn         
	//*  46  142:iconst_0        
	//*  47  143:ireturn         
	//*  48  144:iconst_3        
	//*  49  145:ireturn         
	//*  50  146:iload_0         
	//*  51  147:ifeq            153
	//*  52  150:ldc1            #157 <Int 0x80000000>
	//*  53  152:istore_1        
	//*  54  153:iload_1         
	//*  55  154:ireturn         
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   56  155:new             #159 <Class StringBuilder>
	//   57  158:dup             
	//   58  159:invokespecial   #160 <Method void StringBuilder()>
	//   59  162:astore_3        
				stringbuilder.append("Unknown usage value ");
	//   60  163:aload_3         
	//   61  164:ldc1            #162 <String "Unknown usage value ">
	//   62  166:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   63  169:pop             
				stringbuilder.append(j);
	//   64  170:aload_3         
	//   65  171:iload_2         
	//   66  172:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   67  175:pop             
				stringbuilder.append(" in audio attributes");
	//   68  176:aload_3         
	//   69  177:ldc1            #171 <String " in audio attributes">
	//   70  179:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   71  182:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   72  183:new             #173 <Class IllegalArgumentException>
	//   73  186:dup             
	//   74  187:aload_3         
	//   75  188:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   76  191:invokespecial   #180 <Method void IllegalArgumentException(String)>
	//   77  194:athrow          
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
	//    2    2:invokevirtual   #185 <Method int getFlags()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #188 <Method int getUsage()>
	//    5    9:invokestatic    #190 <Method int toVolumeStreamType(boolean, int, int)>
	//    6   12:ireturn         
	}

	static int usageForStreamType(int i)
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
	//	               0 155
	//	               1 152
	//	               2 149
	//	               3 146
	//	               4 143
	//	               5 140
	//	               6 137
	//	               7 134
	//	               8 131
	//	               9 128
	//	               10 125
	//	               11 122
	//	               12 119
	//	               13 116
	//	               14 113
	//	               15 84
	//	               16 110
		case 15: // '\017'
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   84:new             #159 <Class StringBuilder>
	//    3   87:dup             
	//    4   88:invokespecial   #160 <Method void StringBuilder()>
	//    5   91:astore_1        
			stringbuilder.append("unknown usage ");
	//    6   92:aload_1         
	//    7   93:ldc1            #196 <String "unknown usage ">
	//    8   95:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//    9   98:pop             
			stringbuilder.append(i);
	//   10   99:aload_1         
	//   11  100:iload_0         
	//   12  101:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   13  104:pop             
			return stringbuilder.toString();
	//   14  105:aload_1         
	//   15  106:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   16  109:areturn         

		case 16: // '\020'
			return "USAGE_ASSISTANT";
	//   17  110:ldc1            #197 <String "USAGE_ASSISTANT">
	//   18  112:areturn         

		case 14: // '\016'
			return "USAGE_GAME";
	//   19  113:ldc1            #198 <String "USAGE_GAME">
	//   20  115:areturn         

		case 13: // '\r'
			return "USAGE_ASSISTANCE_SONIFICATION";
	//   21  116:ldc1            #199 <String "USAGE_ASSISTANCE_SONIFICATION">
	//   22  118:areturn         

		case 12: // '\f'
			return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
	//   23  119:ldc1            #200 <String "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE">
	//   24  121:areturn         

		case 11: // '\013'
			return "USAGE_ASSISTANCE_ACCESSIBILITY";
	//   25  122:ldc1            #201 <String "USAGE_ASSISTANCE_ACCESSIBILITY">
	//   26  124:areturn         

		case 10: // '\n'
			return "USAGE_NOTIFICATION_EVENT";
	//   27  125:ldc1            #202 <String "USAGE_NOTIFICATION_EVENT">
	//   28  127:areturn         

		case 9: // '\t'
			return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
	//   29  128:ldc1            #203 <String "USAGE_NOTIFICATION_COMMUNICATION_DELAYED">
	//   30  130:areturn         

		case 8: // '\b'
			return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
	//   31  131:ldc1            #204 <String "USAGE_NOTIFICATION_COMMUNICATION_INSTANT">
	//   32  133:areturn         

		case 7: // '\007'
			return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
	//   33  134:ldc1            #205 <String "USAGE_NOTIFICATION_COMMUNICATION_REQUEST">
	//   34  136:areturn         

		case 6: // '\006'
			return "USAGE_NOTIFICATION_RINGTONE";
	//   35  137:ldc1            #206 <String "USAGE_NOTIFICATION_RINGTONE">
	//   36  139:areturn         

		case 5: // '\005'
			return "USAGE_NOTIFICATION";
	//   37  140:ldc1            #207 <String "USAGE_NOTIFICATION">
	//   38  142:areturn         

		case 4: // '\004'
			return "USAGE_ALARM";
	//   39  143:ldc1            #208 <String "USAGE_ALARM">
	//   40  145:areturn         

		case 3: // '\003'
			return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
	//   41  146:ldc1            #209 <String "USAGE_VOICE_COMMUNICATION_SIGNALLING">
	//   42  148:areturn         

		case 2: // '\002'
			return "USAGE_VOICE_COMMUNICATION";
	//   43  149:ldc1            #210 <String "USAGE_VOICE_COMMUNICATION">
	//   44  151:areturn         

		case 1: // '\001'
			return "USAGE_MEDIA";
	//   45  152:ldc1            #211 <String "USAGE_MEDIA">
	//   46  154:areturn         

		case 0: // '\0'
			return "USAGE_UNKNOWN";
	//   47  155:ldc1            #212 <String "USAGE_UNKNOWN">
	//   48  157:areturn         
		}
	}

	public static AudioAttributesCompat wrap(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #139 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          41
	//*   3    8:getstatic       #154 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            41
		{
			obj = ((Object) (new AudioAttributesImplApi21((AudioAttributes)obj)));
	//    5   14:new             #141 <Class AudioAttributesImplApi21>
	//    6   17:dup             
	//    7   18:aload_0         
	//    8   19:checkcast       #218 <Class AudioAttributes>
	//    9   22:invokespecial   #221 <Method void AudioAttributesImplApi21(AudioAttributes)>
	//   10   25:astore_0        
			AudioAttributesCompat audioattributescompat = new AudioAttributesCompat();
	//   11   26:new             #2   <Class AudioAttributesCompat>
	//   12   29:dup             
	//   13   30:invokespecial   #222 <Method void AudioAttributesCompat()>
	//   14   33:astore_1        
			audioattributescompat.mImpl = ((AudioAttributesImpl) (obj));
	//   15   34:aload_1         
	//   16   35:aload_0         
	//   17   36:putfield        #128 <Field AudioAttributesImpl mImpl>
			return audioattributescompat;
	//   18   39:aload_1         
	//   19   40:areturn         
		} else
		{
			return null;
	//   20   41:aconst_null     
	//   21   42:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = obj instanceof AudioAttributesCompat;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AudioAttributesCompat>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(!flag1)
	//*   5    7:iload_3         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((AudioAttributesCompat)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class AudioAttributesCompat>
	//   11   17:astore_1        
		AudioAttributesImpl audioattributesimpl = mImpl;
	//   12   18:aload_0         
	//   13   19:getfield        #128 <Field AudioAttributesImpl mImpl>
	//   14   22:astore          4
		if(audioattributesimpl == null)
	//*  15   24:aload           4
	//*  16   26:ifnonnull       40
		{
			if(((AudioAttributesCompat) (obj)).mImpl == null)
	//*  17   29:aload_1         
	//*  18   30:getfield        #128 <Field AudioAttributesImpl mImpl>
	//*  19   33:ifnonnull       38
				flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_2        
			return flag;
	//   22   38:iload_2         
	//   23   39:ireturn         
		} else
		{
			return ((Object) (audioattributesimpl)).equals(((Object) (((AudioAttributesCompat) (obj)).mImpl)));
	//   24   40:aload           4
	//   25   42:aload_1         
	//   26   43:getfield        #128 <Field AudioAttributesImpl mImpl>
	//   27   46:invokevirtual   #227 <Method boolean Object.equals(Object)>
	//   28   49:ireturn         
		}
	}

	public int getContentType()
	{
		return mImpl.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #232 <Method int AudioAttributesImpl.getContentType()>
	//    3    9:ireturn         
	}

	public int getFlags()
	{
		return mImpl.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #233 <Method int AudioAttributesImpl.getFlags()>
	//    3    9:ireturn         
	}

	public int getLegacyStreamType()
	{
		return mImpl.getLegacyStreamType();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #236 <Method int AudioAttributesImpl.getLegacyStreamType()>
	//    3    9:ireturn         
	}

	int getRawLegacyStreamType()
	{
		return mImpl.getRawLegacyStreamType();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #239 <Method int AudioAttributesImpl.getRawLegacyStreamType()>
	//    3    9:ireturn         
	}

	public int getUsage()
	{
		return mImpl.getUsage();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #240 <Method int AudioAttributesImpl.getUsage()>
	//    3    9:ireturn         
	}

	public int getVolumeControlStream()
	{
		return mImpl.getVolumeControlStream();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #243 <Method int AudioAttributesImpl.getVolumeControlStream()>
	//    3    9:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (mImpl)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokevirtual   #246 <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public Bundle toBundle()
	{
		return mImpl.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #250 <Method Bundle AudioAttributesImpl.toBundle()>
	//    3    9:areturn         
	}

	public String toString()
	{
		return ((Object) (mImpl)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokevirtual   #251 <Method String Object.toString()>
	//    3    7:areturn         
	}

	public Object unwrap()
	{
		return mImpl.getAudioAttributes();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioAttributesImpl mImpl>
	//    2    4:invokeinterface #256 <Method Object AudioAttributesImpl.getAudioAttributes()>
	//    3    9:areturn         
	}

	static final String AUDIO_ATTRIBUTES_CONTENT_TYPE = "android.support.v4.media.audio_attrs.CONTENT_TYPE";
	static final String AUDIO_ATTRIBUTES_FLAGS = "android.support.v4.media.audio_attrs.FLAGS";
	static final String AUDIO_ATTRIBUTES_FRAMEWORKS = "android.support.v4.media.audio_attrs.FRAMEWORKS";
	static final String AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE = "android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE";
	static final String AUDIO_ATTRIBUTES_USAGE = "android.support.v4.media.audio_attrs.USAGE";
	public static final int CONTENT_TYPE_MOVIE = 3;
	public static final int CONTENT_TYPE_MUSIC = 2;
	public static final int CONTENT_TYPE_SONIFICATION = 4;
	public static final int CONTENT_TYPE_SPEECH = 1;
	public static final int CONTENT_TYPE_UNKNOWN = 0;
	static final int FLAG_ALL = 1023;
	static final int FLAG_ALL_PUBLIC = 273;
	public static final int FLAG_AUDIBILITY_ENFORCED = 1;
	static final int FLAG_BEACON = 8;
	static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
	static final int FLAG_BYPASS_MUTE = 128;
	static final int FLAG_DEEP_BUFFER = 512;
	public static final int FLAG_HW_AV_SYNC = 16;
	static final int FLAG_HW_HOTWORD = 32;
	static final int FLAG_LOW_LATENCY = 256;
	static final int FLAG_SCO = 4;
	static final int FLAG_SECURE = 2;
	static final int INVALID_STREAM_TYPE = -1;
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
	static boolean sForceLegacyBehavior;
	AudioAttributesImpl mImpl;

	static 
	{
		SUPPRESSIBLE_USAGES = new SparseIntArray();
	//    0    0:new             #112 <Class SparseIntArray>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void SparseIntArray()>
	//    3    7:putstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
		SUPPRESSIBLE_USAGES.put(5, 1);
	//    4   10:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    5   13:iconst_5        
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(6, 2);
	//    8   18:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    9   21:bipush          6
	//   10   23:iconst_2        
	//   11   24:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(7, 2);
	//   12   27:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   13   30:bipush          7
	//   14   32:iconst_2        
	//   15   33:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(8, 1);
	//   16   36:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   17   39:bipush          8
	//   18   41:iconst_1        
	//   19   42:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(9, 1);
	//   20   45:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   21   48:bipush          9
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(10, 1);
	//   24   54:getstatic       #117 <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   25   57:bipush          10
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #121 <Method void SparseIntArray.put(int, int)>
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
	//   94  151:putstatic       #123 <Field int[] SDK_USAGES>
	//*  95  154:return          
	}
}
