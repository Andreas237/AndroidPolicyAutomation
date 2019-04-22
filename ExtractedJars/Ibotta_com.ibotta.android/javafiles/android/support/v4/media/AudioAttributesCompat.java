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


	private AudioAttributesCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mUsage = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #43  <Field int mUsage>
		mContentType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #45  <Field int mContentType>
		mFlags = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #47  <Field int mFlags>
	//   11   19:return          
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
	//*  52  150:ldc1            #50  <Int 0x80000000>
	//*  53  152:istore_1        
	//*  54  153:iload_1         
	//*  55  154:ireturn         
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   56  155:new             #52  <Class StringBuilder>
	//   57  158:dup             
	//   58  159:invokespecial   #53  <Method void StringBuilder()>
	//   59  162:astore_3        
				stringbuilder.append("Unknown usage value ");
	//   60  163:aload_3         
	//   61  164:ldc1            #55  <String "Unknown usage value ">
	//   62  166:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   63  169:pop             
				stringbuilder.append(j);
	//   64  170:aload_3         
	//   65  171:iload_2         
	//   66  172:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   67  175:pop             
				stringbuilder.append(" in audio attributes");
	//   68  176:aload_3         
	//   69  177:ldc1            #64  <String " in audio attributes">
	//   70  179:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   71  182:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   72  183:new             #66  <Class IllegalArgumentException>
	//   73  186:dup             
	//   74  187:aload_3         
	//   75  188:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   76  191:invokespecial   #73  <Method void IllegalArgumentException(String)>
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
	//    2   84:new             #52  <Class StringBuilder>
	//    3   87:dup             
	//    4   88:invokespecial   #53  <Method void StringBuilder()>
	//    5   91:astore_1        
			stringbuilder.append("unknown usage ");
	//    6   92:aload_1         
	//    7   93:ldc1            #77  <String "unknown usage ">
	//    8   95:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    9   98:pop             
			stringbuilder.append(i);
	//   10   99:aload_1         
	//   11  100:iload_0         
	//   12  101:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   13  104:pop             
			return new String(stringbuilder.toString());
	//   14  105:new             #79  <Class String>
	//   15  108:dup             
	//   16  109:aload_1         
	//   17  110:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   18  113:invokespecial   #80  <Method void String(String)>
	//   19  116:areturn         

		case 16: // '\020'
			return new String("USAGE_ASSISTANT");
	//   20  117:new             #79  <Class String>
	//   21  120:dup             
	//   22  121:ldc1            #82  <String "USAGE_ASSISTANT">
	//   23  123:invokespecial   #80  <Method void String(String)>
	//   24  126:areturn         

		case 14: // '\016'
			return new String("USAGE_GAME");
	//   25  127:new             #79  <Class String>
	//   26  130:dup             
	//   27  131:ldc1            #84  <String "USAGE_GAME">
	//   28  133:invokespecial   #80  <Method void String(String)>
	//   29  136:areturn         

		case 13: // '\r'
			return new String("USAGE_ASSISTANCE_SONIFICATION");
	//   30  137:new             #79  <Class String>
	//   31  140:dup             
	//   32  141:ldc1            #86  <String "USAGE_ASSISTANCE_SONIFICATION">
	//   33  143:invokespecial   #80  <Method void String(String)>
	//   34  146:areturn         

		case 12: // '\f'
			return new String("USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
	//   35  147:new             #79  <Class String>
	//   36  150:dup             
	//   37  151:ldc1            #88  <String "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE">
	//   38  153:invokespecial   #80  <Method void String(String)>
	//   39  156:areturn         

		case 11: // '\013'
			return new String("USAGE_ASSISTANCE_ACCESSIBILITY");
	//   40  157:new             #79  <Class String>
	//   41  160:dup             
	//   42  161:ldc1            #90  <String "USAGE_ASSISTANCE_ACCESSIBILITY">
	//   43  163:invokespecial   #80  <Method void String(String)>
	//   44  166:areturn         

		case 10: // '\n'
			return new String("USAGE_NOTIFICATION_EVENT");
	//   45  167:new             #79  <Class String>
	//   46  170:dup             
	//   47  171:ldc1            #92  <String "USAGE_NOTIFICATION_EVENT">
	//   48  173:invokespecial   #80  <Method void String(String)>
	//   49  176:areturn         

		case 9: // '\t'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
	//   50  177:new             #79  <Class String>
	//   51  180:dup             
	//   52  181:ldc1            #94  <String "USAGE_NOTIFICATION_COMMUNICATION_DELAYED">
	//   53  183:invokespecial   #80  <Method void String(String)>
	//   54  186:areturn         

		case 8: // '\b'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
	//   55  187:new             #79  <Class String>
	//   56  190:dup             
	//   57  191:ldc1            #96  <String "USAGE_NOTIFICATION_COMMUNICATION_INSTANT">
	//   58  193:invokespecial   #80  <Method void String(String)>
	//   59  196:areturn         

		case 7: // '\007'
			return new String("USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
	//   60  197:new             #79  <Class String>
	//   61  200:dup             
	//   62  201:ldc1            #98  <String "USAGE_NOTIFICATION_COMMUNICATION_REQUEST">
	//   63  203:invokespecial   #80  <Method void String(String)>
	//   64  206:areturn         

		case 6: // '\006'
			return new String("USAGE_NOTIFICATION_RINGTONE");
	//   65  207:new             #79  <Class String>
	//   66  210:dup             
	//   67  211:ldc1            #100 <String "USAGE_NOTIFICATION_RINGTONE">
	//   68  213:invokespecial   #80  <Method void String(String)>
	//   69  216:areturn         

		case 5: // '\005'
			return new String("USAGE_NOTIFICATION");
	//   70  217:new             #79  <Class String>
	//   71  220:dup             
	//   72  221:ldc1            #102 <String "USAGE_NOTIFICATION">
	//   73  223:invokespecial   #80  <Method void String(String)>
	//   74  226:areturn         

		case 4: // '\004'
			return new String("USAGE_ALARM");
	//   75  227:new             #79  <Class String>
	//   76  230:dup             
	//   77  231:ldc1            #104 <String "USAGE_ALARM">
	//   78  233:invokespecial   #80  <Method void String(String)>
	//   79  236:areturn         

		case 3: // '\003'
			return new String("USAGE_VOICE_COMMUNICATION_SIGNALLING");
	//   80  237:new             #79  <Class String>
	//   81  240:dup             
	//   82  241:ldc1            #106 <String "USAGE_VOICE_COMMUNICATION_SIGNALLING">
	//   83  243:invokespecial   #80  <Method void String(String)>
	//   84  246:areturn         

		case 2: // '\002'
			return new String("USAGE_VOICE_COMMUNICATION");
	//   85  247:new             #79  <Class String>
	//   86  250:dup             
	//   87  251:ldc1            #108 <String "USAGE_VOICE_COMMUNICATION">
	//   88  253:invokespecial   #80  <Method void String(String)>
	//   89  256:areturn         

		case 1: // '\001'
			return new String("USAGE_MEDIA");
	//   90  257:new             #79  <Class String>
	//   91  260:dup             
	//   92  261:ldc1            #110 <String "USAGE_MEDIA">
	//   93  263:invokespecial   #80  <Method void String(String)>
	//   94  266:areturn         

		case 0: // '\0'
			return new String("USAGE_UNKNOWN");
	//   95  267:new             #79  <Class String>
	//   96  270:dup             
	//   97  271:ldc1            #112 <String "USAGE_UNKNOWN">
	//   98  273:invokespecial   #80  <Method void String(String)>
	//   99  276:areturn         
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
	//*   6    8:ifnull          130
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #118 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #118 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AudioAttributesCompat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AudioAttributesCompat>
	//   16   28:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*  17   29:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   32:bipush          21
	//*  19   34:icmplt          64
	//*  20   37:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*  21   40:ifne            64
			{
				AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//   22   43:aload_0         
	//   23   44:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   24   47:astore_2        
				if(wrapper != null)
	//*  25   48:aload_2         
	//*  26   49:ifnull          64
					return wrapper.unwrap().equals(((AudioAttributesCompat) (obj)).unwrap());
	//   27   52:aload_2         
	//   28   53:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   29   56:aload_1         
	//   30   57:invokevirtual   #136 <Method Object unwrap()>
	//   31   60:invokevirtual   #140 <Method boolean AudioAttributes.equals(Object)>
	//   32   63:ireturn         
			}
			if(mContentType == ((AudioAttributesCompat) (obj)).getContentType() && mFlags == ((AudioAttributesCompat) (obj)).getFlags() && mUsage == ((AudioAttributesCompat) (obj)).getUsage())
	//*  33   64:aload_0         
	//*  34   65:getfield        #45  <Field int mContentType>
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #144 <Method int getContentType()>
	//*  37   72:icmpne          128
	//*  38   75:aload_0         
	//*  39   76:getfield        #47  <Field int mFlags>
	//*  40   79:aload_1         
	//*  41   80:invokevirtual   #147 <Method int getFlags()>
	//*  42   83:icmpne          128
	//*  43   86:aload_0         
	//*  44   87:getfield        #43  <Field int mUsage>
	//*  45   90:aload_1         
	//*  46   91:invokevirtual   #150 <Method int getUsage()>
	//*  47   94:icmpne          128
			{
				Integer integer = mLegacyStream;
	//   48   97:aload_0         
	//   49   98:getfield        #152 <Field Integer mLegacyStream>
	//   50  101:astore_2        
				if(integer != null)
	//*  51  102:aload_2         
	//*  52  103:ifnull          119
				{
					if(integer.equals(((Object) (((AudioAttributesCompat) (obj)).mLegacyStream))))
	//*  53  106:aload_2         
	//*  54  107:aload_1         
	//*  55  108:getfield        #152 <Field Integer mLegacyStream>
	//*  56  111:invokevirtual   #155 <Method boolean Integer.equals(Object)>
	//*  57  114:ifeq            128
						return true;
	//   58  117:iconst_1        
	//   59  118:ireturn         
				} else
				if(((AudioAttributesCompat) (obj)).mLegacyStream == null)
	//*  60  119:aload_1         
	//*  61  120:getfield        #152 <Field Integer mLegacyStream>
	//*  62  123:ifnonnull       128
					return true;
	//   63  126:iconst_1        
	//   64  127:ireturn         
			}
			return false;
	//   65  128:iconst_0        
	//   66  129:ireturn         
		} else
		{
			return false;
	//   67  130:iconst_0        
	//   68  131:ireturn         
		}
	}

	public int getContentType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          31
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            31
		{
			AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//    5   14:aload_0         
	//    6   15:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    7   18:astore_1        
			if(wrapper != null)
	//*   8   19:aload_1         
	//*   9   20:ifnull          31
				return wrapper.unwrap().getContentType();
	//   10   23:aload_1         
	//   11   24:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   12   27:invokevirtual   #156 <Method int AudioAttributes.getContentType()>
	//   13   30:ireturn         
		}
		return mContentType;
	//   14   31:aload_0         
	//   15   32:getfield        #45  <Field int mContentType>
	//   16   35:ireturn         
	}

	public int getFlags()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          34
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            34
		{
			AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//    5   14:aload_0         
	//    6   15:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    7   18:astore          4
			if(wrapper != null)
	//*   8   20:aload           4
	//*   9   22:ifnull          34
				return wrapper.unwrap().getFlags();
	//   10   25:aload           4
	//   11   27:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   12   30:invokevirtual   #157 <Method int AudioAttributes.getFlags()>
	//   13   33:ireturn         
		}
		int j = mFlags;
	//   14   34:aload_0         
	//   15   35:getfield        #47  <Field int mFlags>
	//   16   38:istore_2        
		int k = getLegacyStreamType();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #160 <Method int getLegacyStreamType()>
	//   19   43:istore_3        
		int i;
		if(k == 6)
	//*  20   44:iload_3         
	//*  21   45:bipush          6
	//*  22   47:icmpne          57
		{
			i = j | 4;
	//   23   50:iload_2         
	//   24   51:iconst_4        
	//   25   52:ior             
	//   26   53:istore_1        
		} else
	//*  27   54:goto            69
		{
			i = j;
	//   28   57:iload_2         
	//   29   58:istore_1        
			if(k == 7)
	//*  30   59:iload_3         
	//*  31   60:bipush          7
	//*  32   62:icmpne          69
				i = j | 1;
	//   33   65:iload_2         
	//   34   66:iconst_1        
	//   35   67:ior             
	//   36   68:istore_1        
		}
		return i & 0x111;
	//   37   69:iload_1         
	//   38   70:sipush          273
	//   39   73:iand            
	//   40   74:ireturn         
	}

	public int getLegacyStreamType()
	{
		Integer integer = mLegacyStream;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field Integer mLegacyStream>
	//    2    4:astore_1        
		if(integer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return integer.intValue();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #163 <Method int Integer.intValue()>
	//    7   13:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   8   14:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   17:bipush          21
	//*  10   19:icmplt          36
	//*  11   22:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*  12   25:ifne            36
			return AudioAttributesCompatApi21.toLegacyStreamType(mAudioAttributesWrapper);
	//   13   28:aload_0         
	//   14   29:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//   15   32:invokestatic    #169 <Method int AudioAttributesCompatApi21.toLegacyStreamType(AudioAttributesCompatApi21$Wrapper)>
	//   16   35:ireturn         
		else
			return toVolumeStreamType(false, mFlags, mUsage);
	//   17   36:iconst_0        
	//   18   37:aload_0         
	//   19   38:getfield        #47  <Field int mFlags>
	//   20   41:aload_0         
	//   21   42:getfield        #43  <Field int mUsage>
	//   22   45:invokestatic    #171 <Method int toVolumeStreamType(boolean, int, int)>
	//   23   48:ireturn         
	}

	public int getUsage()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          31
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            31
		{
			AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//    5   14:aload_0         
	//    6   15:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    7   18:astore_1        
			if(wrapper != null)
	//*   8   19:aload_1         
	//*   9   20:ifnull          31
				return wrapper.unwrap().getUsage();
	//   10   23:aload_1         
	//   11   24:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   12   27:invokevirtual   #172 <Method int AudioAttributes.getUsage()>
	//   13   30:ireturn         
		}
		return mUsage;
	//   14   31:aload_0         
	//   15   32:getfield        #43  <Field int mUsage>
	//   16   35:ireturn         
	}

	public int hashCode()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && !sForceLegacyBehavior)
	//*   0    0:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          31
	//*   3    8:getstatic       #125 <Field boolean sForceLegacyBehavior>
	//*   4   11:ifne            31
		{
			AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//    5   14:aload_0         
	//    6   15:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    7   18:astore_1        
			if(wrapper != null)
	//*   8   19:aload_1         
	//*   9   20:ifnull          31
				return wrapper.unwrap().hashCode();
	//   10   23:aload_1         
	//   11   24:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//   12   27:invokevirtual   #175 <Method int AudioAttributes.hashCode()>
	//   13   30:ireturn         
		}
		return Arrays.hashCode(new Object[] {
			Integer.valueOf(mContentType), Integer.valueOf(mFlags), Integer.valueOf(mUsage), mLegacyStream
		});
	//   14   31:iconst_4        
	//   15   32:anewarray       Object[]
	//   16   35:dup             
	//   17   36:iconst_0        
	//   18   37:aload_0         
	//   19   38:getfield        #45  <Field int mContentType>
	//   20   41:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   21   44:aastore         
	//   22   45:dup             
	//   23   46:iconst_1        
	//   24   47:aload_0         
	//   25   48:getfield        #47  <Field int mFlags>
	//   26   51:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:aload_0         
	//   31   58:getfield        #43  <Field int mUsage>
	//   32   61:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   33   64:aastore         
	//   34   65:dup             
	//   35   66:iconst_3        
	//   36   67:aload_0         
	//   37   68:getfield        #152 <Field Integer mLegacyStream>
	//   38   71:aastore         
	//   39   72:invokestatic    #184 <Method int Arrays.hashCode(Object[])>
	//   40   75:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("AudioAttributesCompat:");
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #186 <String "AudioAttributesCompat:">
	//    3    6:invokespecial   #187 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		if(unwrap() != null)
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #136 <Method Object unwrap()>
	//*   7   14:ifnull          36
		{
			stringbuilder.append(" audioattributes=");
	//    8   17:aload_1         
	//    9   18:ldc1            #189 <String " audioattributes=">
	//   10   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(unwrap());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #136 <Method Object unwrap()>
	//   15   29:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:pop             
		} else
	//*  17   33:goto            120
		{
			if(mLegacyStream != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #152 <Field Integer mLegacyStream>
	//*  20   40:ifnull          66
			{
				stringbuilder.append(" stream=");
	//   21   43:aload_1         
	//   22   44:ldc1            #194 <String " stream=">
	//   23   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
				stringbuilder.append(((Object) (mLegacyStream)));
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:getfield        #152 <Field Integer mLegacyStream>
	//   28   55:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//   29   58:pop             
				stringbuilder.append(" derived");
	//   30   59:aload_1         
	//   31   60:ldc1            #196 <String " derived">
	//   32   62:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
			}
			stringbuilder.append(" usage=");
	//   34   66:aload_1         
	//   35   67:ldc1            #198 <String " usage=">
	//   36   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
			stringbuilder.append(usageToString());
	//   38   73:aload_1         
	//   39   74:aload_0         
	//   40   75:invokevirtual   #200 <Method String usageToString()>
	//   41   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
			stringbuilder.append(" content=");
	//   43   82:aload_1         
	//   44   83:ldc1            #202 <String " content=">
	//   45   85:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
			stringbuilder.append(mContentType);
	//   47   89:aload_1         
	//   48   90:aload_0         
	//   49   91:getfield        #45  <Field int mContentType>
	//   50   94:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   51   97:pop             
			stringbuilder.append(" flags=0x");
	//   52   98:aload_1         
	//   53   99:ldc1            #204 <String " flags=0x">
	//   54  101:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
			stringbuilder.append(Integer.toHexString(mFlags).toUpperCase());
	//   56  105:aload_1         
	//   57  106:aload_0         
	//   58  107:getfield        #47  <Field int mFlags>
	//   59  110:invokestatic    #207 <Method String Integer.toHexString(int)>
	//   60  113:invokevirtual   #210 <Method String String.toUpperCase()>
	//   61  116:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
		}
		return stringbuilder.toString();
	//   63  120:aload_1         
	//   64  121:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   65  124:areturn         
	}

	public Object unwrap()
	{
		AudioAttributesCompatApi21.Wrapper wrapper = mAudioAttributesWrapper;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field AudioAttributesCompatApi21$Wrapper mAudioAttributesWrapper>
	//    2    4:astore_1        
		if(wrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((Object) (wrapper.unwrap()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #133 <Method AudioAttributes AudioAttributesCompatApi21$Wrapper.unwrap()>
	//    7   13:areturn         
		else
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	String usageToString()
	{
		return usageToString(mUsage);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mUsage>
	//    2    4:invokestatic    #214 <Method String usageToString(int)>
	//    3    7:areturn         
	}

	private static final int SDK_USAGES[] = {
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		10, 11, 12, 13, 14, 16
	};
	private static final SparseIntArray SUPPRESSIBLE_USAGES;
	private static boolean sForceLegacyBehavior;
	private AudioAttributesCompatApi21.Wrapper mAudioAttributesWrapper;
	int mContentType;
	int mFlags;
	Integer mLegacyStream;
	int mUsage;

	static 
	{
		SUPPRESSIBLE_USAGES = new SparseIntArray();
	//    0    0:new             #28  <Class SparseIntArray>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void SparseIntArray()>
	//    3    7:putstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
		SUPPRESSIBLE_USAGES.put(5, 1);
	//    4   10:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    5   13:iconst_5        
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(6, 2);
	//    8   18:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//    9   21:bipush          6
	//   10   23:iconst_2        
	//   11   24:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(7, 2);
	//   12   27:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   13   30:bipush          7
	//   14   32:iconst_2        
	//   15   33:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(8, 1);
	//   16   36:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   17   39:bipush          8
	//   18   41:iconst_1        
	//   19   42:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(9, 1);
	//   20   45:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   21   48:bipush          9
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
		SUPPRESSIBLE_USAGES.put(10, 1);
	//   24   54:getstatic       #33  <Field SparseIntArray SUPPRESSIBLE_USAGES>
	//   25   57:bipush          10
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #37  <Method void SparseIntArray.put(int, int)>
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
	//   94  151:putstatic       #39  <Field int[] SDK_USAGES>
	//*  95  154:return          
	}
}
