// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaFormat
	implements Parcelable
{

	MediaFormat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		trackId = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #65  <Method String Parcel.readString()>
	//    5    9:putfield        #67  <Field String trackId>
		mimeType = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #65  <Method String Parcel.readString()>
	//    9   17:putfield        #69  <Field String mimeType>
		bitrate = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #73  <Method int Parcel.readInt()>
	//   13   25:putfield        #75  <Field int bitrate>
		maxInputSize = parcel.readInt();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #73  <Method int Parcel.readInt()>
	//   17   33:putfield        #77  <Field int maxInputSize>
		durationUs = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #81  <Method long Parcel.readLong()>
	//   21   41:putfield        #83  <Field long durationUs>
		width = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #73  <Method int Parcel.readInt()>
	//   25   49:putfield        #85  <Field int width>
		height = parcel.readInt();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #73  <Method int Parcel.readInt()>
	//   29   57:putfield        #87  <Field int height>
		rotationDegrees = parcel.readInt();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #73  <Method int Parcel.readInt()>
	//   33   65:putfield        #89  <Field int rotationDegrees>
		pixelWidthHeightRatio = parcel.readFloat();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #93  <Method float Parcel.readFloat()>
	//   37   73:putfield        #95  <Field float pixelWidthHeightRatio>
		channelCount = parcel.readInt();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #73  <Method int Parcel.readInt()>
	//   41   81:putfield        #97  <Field int channelCount>
		sampleRate = parcel.readInt();
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #73  <Method int Parcel.readInt()>
	//   45   89:putfield        #99  <Field int sampleRate>
		language = parcel.readString();
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #65  <Method String Parcel.readString()>
	//   49   97:putfield        #101 <Field String language>
		subsampleOffsetUs = parcel.readLong();
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokevirtual   #81  <Method long Parcel.readLong()>
	//   53  105:putfield        #103 <Field long subsampleOffsetUs>
		initializationData = ((List) (new ArrayList()));
	//   54  108:aload_0         
	//   55  109:new             #105 <Class ArrayList>
	//   56  112:dup             
	//   57  113:invokespecial   #106 <Method void ArrayList()>
	//   58  116:putfield        #108 <Field List initializationData>
		List list = initializationData;
	//   59  119:aload_0         
	//   60  120:getfield        #108 <Field List initializationData>
	//   61  123:astore          6
		byte abyte0[] = null;
	//   62  125:aconst_null     
	//   63  126:astore          5
		parcel.readList(list, ((ClassLoader) (null)));
	//   64  128:aload_1         
	//   65  129:aload           6
	//   66  131:aconst_null     
	//   67  132:invokevirtual   #112 <Method void Parcel.readList(List, ClassLoader)>
		int i = parcel.readInt();
	//   68  135:aload_1         
	//   69  136:invokevirtual   #73  <Method int Parcel.readInt()>
	//   70  139:istore_3        
		boolean flag = false;
	//   71  140:iconst_0        
	//   72  141:istore_2        
		boolean flag1;
		if(i == 1)
	//*  73  142:iload_3         
	//*  74  143:iconst_1        
	//*  75  144:icmpne          153
			flag1 = true;
	//   76  147:iconst_1        
	//   77  148:istore          4
		else
	//*  78  150:goto            156
			flag1 = false;
	//   79  153:iconst_0        
	//   80  154:istore          4
		adaptive = flag1;
	//   81  156:aload_0         
	//   82  157:iload           4
	//   83  159:putfield        #114 <Field boolean adaptive>
		maxWidth = parcel.readInt();
	//   84  162:aload_0         
	//   85  163:aload_1         
	//   86  164:invokevirtual   #73  <Method int Parcel.readInt()>
	//   87  167:putfield        #116 <Field int maxWidth>
		maxHeight = parcel.readInt();
	//   88  170:aload_0         
	//   89  171:aload_1         
	//   90  172:invokevirtual   #73  <Method int Parcel.readInt()>
	//   91  175:putfield        #118 <Field int maxHeight>
		pcmEncoding = parcel.readInt();
	//   92  178:aload_0         
	//   93  179:aload_1         
	//   94  180:invokevirtual   #73  <Method int Parcel.readInt()>
	//   95  183:putfield        #120 <Field int pcmEncoding>
		encoderDelay = parcel.readInt();
	//   96  186:aload_0         
	//   97  187:aload_1         
	//   98  188:invokevirtual   #73  <Method int Parcel.readInt()>
	//   99  191:putfield        #122 <Field int encoderDelay>
		encoderPadding = parcel.readInt();
	//  100  194:aload_0         
	//  101  195:aload_1         
	//  102  196:invokevirtual   #73  <Method int Parcel.readInt()>
	//  103  199:putfield        #124 <Field int encoderPadding>
		if(parcel.readInt() != 0)
	//* 104  202:aload_1         
	//* 105  203:invokevirtual   #73  <Method int Parcel.readInt()>
	//* 106  206:ifeq            211
			flag = true;
	//  107  209:iconst_1        
	//  108  210:istore_2        
		if(flag)
	//* 109  211:iload_2         
	//* 110  212:ifeq            221
			abyte0 = parcel.createByteArray();
	//  111  215:aload_1         
	//  112  216:invokevirtual   #128 <Method byte[] Parcel.createByteArray()>
	//  113  219:astore          5
		projectionData = abyte0;
	//  114  221:aload_0         
	//  115  222:aload           5
	//  116  224:putfield        #130 <Field byte[] projectionData>
		stereoMode = parcel.readInt();
	//  117  227:aload_0         
	//  118  228:aload_1         
	//  119  229:invokevirtual   #73  <Method int Parcel.readInt()>
	//  120  232:putfield        #132 <Field int stereoMode>
	//  121  235:return          
	}

	MediaFormat(String s, String s1, int i, int j, long l, int k, 
			int i1, int j1, float f, int k1, int l1, String s2, long l2, List list, boolean flag, int i2, int j2, int k2, int i3, 
			int j3, byte abyte0[], int k3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		trackId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #67  <Field String trackId>
		mimeType = Assertions.checkNotEmpty(s1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #139 <Method String Assertions.checkNotEmpty(String)>
	//    8   14:putfield        #69  <Field String mimeType>
		bitrate = i;
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:putfield        #75  <Field int bitrate>
		maxInputSize = j;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #77  <Field int maxInputSize>
		durationUs = l;
	//   15   28:aload_0         
	//   16   29:lload           5
	//   17   31:putfield        #83  <Field long durationUs>
		width = k;
	//   18   34:aload_0         
	//   19   35:iload           7
	//   20   37:putfield        #85  <Field int width>
		height = i1;
	//   21   40:aload_0         
	//   22   41:iload           8
	//   23   43:putfield        #87  <Field int height>
		rotationDegrees = j1;
	//   24   46:aload_0         
	//   25   47:iload           9
	//   26   49:putfield        #89  <Field int rotationDegrees>
		pixelWidthHeightRatio = f;
	//   27   52:aload_0         
	//   28   53:fload           10
	//   29   55:putfield        #95  <Field float pixelWidthHeightRatio>
		channelCount = k1;
	//   30   58:aload_0         
	//   31   59:iload           11
	//   32   61:putfield        #97  <Field int channelCount>
		sampleRate = l1;
	//   33   64:aload_0         
	//   34   65:iload           12
	//   35   67:putfield        #99  <Field int sampleRate>
		language = s2;
	//   36   70:aload_0         
	//   37   71:aload           13
	//   38   73:putfield        #101 <Field String language>
		subsampleOffsetUs = l2;
	//   39   76:aload_0         
	//   40   77:lload           14
	//   41   79:putfield        #103 <Field long subsampleOffsetUs>
		if(list == null)
	//*  42   82:aload           16
	//*  43   84:ifnonnull       95
			list = Collections.emptyList();
	//   44   87:invokestatic    #145 <Method List Collections.emptyList()>
	//   45   90:astore          16
	//*  46   92:goto            95
		initializationData = list;
	//   47   95:aload_0         
	//   48   96:aload           16
	//   49   98:putfield        #108 <Field List initializationData>
		adaptive = flag;
	//   50  101:aload_0         
	//   51  102:iload           17
	//   52  104:putfield        #114 <Field boolean adaptive>
		maxWidth = i2;
	//   53  107:aload_0         
	//   54  108:iload           18
	//   55  110:putfield        #116 <Field int maxWidth>
		maxHeight = j2;
	//   56  113:aload_0         
	//   57  114:iload           19
	//   58  116:putfield        #118 <Field int maxHeight>
		pcmEncoding = k2;
	//   59  119:aload_0         
	//   60  120:iload           20
	//   61  122:putfield        #120 <Field int pcmEncoding>
		encoderDelay = i3;
	//   62  125:aload_0         
	//   63  126:iload           21
	//   64  128:putfield        #122 <Field int encoderDelay>
		encoderPadding = j3;
	//   65  131:aload_0         
	//   66  132:iload           22
	//   67  134:putfield        #124 <Field int encoderPadding>
		projectionData = abyte0;
	//   68  137:aload_0         
	//   69  138:aload           23
	//   70  140:putfield        #130 <Field byte[] projectionData>
		stereoMode = k3;
	//   71  143:aload_0         
	//   72  144:iload           24
	//   73  146:putfield        #132 <Field int stereoMode>
	//   74  149:return          
	}

	public static MediaFormat createAudioFormat(String s, String s1, int i, int j, long l, int k, int i1, 
			List list, String s2)
	{
		return createAudioFormat(s, s1, i, j, l, k, i1, list, s2, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:iload           7
	//    7   10:aload           8
	//    8   12:aload           9
	//    9   14:iconst_m1       
	//   10   15:invokestatic    #152 <Method MediaFormat createAudioFormat(String, String, int, int, long, int, int, List, String, int)>
	//   11   18:areturn         
	}

	public static MediaFormat createAudioFormat(String s, String s1, int i, int j, long l, int k, int i1, 
			List list, String s2, int j1)
	{
		return new MediaFormat(s, s1, i, j, l, -1, -1, -1, -1F, k, i1, s2, 0xffffffffL, list, false, -1, -1, j1, -1, -1, ((byte []) (null)), -1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:lload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #154 <Float -1F>
	//   11   15:iload           6
	//   12   17:iload           7
	//   13   19:aload           9
	//   14   21:ldc2w           #17  <Long 0xffffffffL>
	//   15   24:aload           8
	//   16   26:iconst_0        
	//   17   27:iconst_m1       
	//   18   28:iconst_m1       
	//   19   29:iload           10
	//   20   31:iconst_m1       
	//   21   32:iconst_m1       
	//   22   33:aconst_null     
	//   23   34:iconst_m1       
	//   24   35:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   38:areturn         
	}

	public static MediaFormat createFormatForMimeType(String s, String s1, int i, long l)
	{
		return new MediaFormat(s, s1, i, -1, l, -1, -1, -1, -1F, -1, -1, ((String) (null)), 0xffffffffL, ((List) (null)), false, -1, -1, -1, -1, -1, ((byte []) (null)), -1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iconst_m1       
	//    6    8:lload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #154 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:iconst_m1       
	//   13   16:aconst_null     
	//   14   17:ldc2w           #17  <Long 0xffffffffL>
	//   15   20:aconst_null     
	//   16   21:iconst_0        
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iconst_m1       
	//   22   27:aconst_null     
	//   23   28:iconst_m1       
	//   24   29:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   32:areturn         
	}

	public static MediaFormat createId3Format()
	{
		return createFormatForMimeType(((String) (null)), "application/id3", -1, -1L);
	//    0    0:aconst_null     
	//    1    1:ldc1            #163 <String "application/id3">
	//    2    3:iconst_m1       
	//    3    4:ldc2w           #164 <Long -1L>
	//    4    7:invokestatic    #167 <Method MediaFormat createFormatForMimeType(String, String, int, long)>
	//    5   10:areturn         
	}

	public static MediaFormat createImageFormat(String s, String s1, int i, long l, List list, String s2)
	{
		return new MediaFormat(s, s1, i, -1, l, -1, -1, -1, -1F, -1, -1, s2, 0xffffffffL, list, false, -1, -1, -1, -1, -1, ((byte []) (null)), -1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iconst_m1       
	//    6    8:lload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #154 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:iconst_m1       
	//   13   16:aload           6
	//   14   18:ldc2w           #17  <Long 0xffffffffL>
	//   15   21:aload           5
	//   16   23:iconst_0        
	//   17   24:iconst_m1       
	//   18   25:iconst_m1       
	//   19   26:iconst_m1       
	//   20   27:iconst_m1       
	//   21   28:iconst_m1       
	//   22   29:aconst_null     
	//   23   30:iconst_m1       
	//   24   31:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   34:areturn         
	}

	public static MediaFormat createTextFormat(String s, String s1, int i, long l, String s2)
	{
		return createTextFormat(s, s1, i, l, s2, 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:ldc2w           #17  <Long 0xffffffffL>
	//    6    9:invokestatic    #175 <Method MediaFormat createTextFormat(String, String, int, long, String, long)>
	//    7   12:areturn         
	}

	public static MediaFormat createTextFormat(String s, String s1, int i, long l, String s2, long l1)
	{
		return new MediaFormat(s, s1, i, -1, l, -1, -1, -1, -1F, -1, -1, s2, l1, ((List) (null)), false, -1, -1, -1, -1, -1, ((byte []) (null)), -1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iconst_m1       
	//    6    8:lload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #154 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:iconst_m1       
	//   13   16:aload           5
	//   14   18:lload           6
	//   15   20:aconst_null     
	//   16   21:iconst_0        
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iconst_m1       
	//   22   27:aconst_null     
	//   23   28:iconst_m1       
	//   24   29:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   32:areturn         
	}

	public static MediaFormat createVideoFormat(String s, String s1, int i, int j, long l, int k, int i1, 
			List list)
	{
		return createVideoFormat(s, s1, i, j, l, k, i1, list, -1, -1F, ((byte []) (null)), -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:iload           7
	//    7   10:aload           8
	//    8   12:iconst_m1       
	//    9   13:ldc1            #154 <Float -1F>
	//   10   15:aconst_null     
	//   11   16:iconst_m1       
	//   12   17:invokestatic    #180 <Method MediaFormat createVideoFormat(String, String, int, int, long, int, int, List, int, float, byte[], int)>
	//   13   20:areturn         
	}

	public static MediaFormat createVideoFormat(String s, String s1, int i, int j, long l, int k, int i1, 
			List list, int j1, float f)
	{
		return new MediaFormat(s, s1, i, j, l, k, i1, j1, f, -1, -1, ((String) (null)), 0xffffffffL, list, false, -1, -1, -1, -1, -1, ((byte []) (null)), -1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:lload           4
	//    7   10:iload           6
	//    8   12:iload           7
	//    9   14:iload           9
	//   10   16:fload           10
	//   11   18:iconst_m1       
	//   12   19:iconst_m1       
	//   13   20:aconst_null     
	//   14   21:ldc2w           #17  <Long 0xffffffffL>
	//   15   24:aload           8
	//   16   26:iconst_0        
	//   17   27:iconst_m1       
	//   18   28:iconst_m1       
	//   19   29:iconst_m1       
	//   20   30:iconst_m1       
	//   21   31:iconst_m1       
	//   22   32:aconst_null     
	//   23   33:iconst_m1       
	//   24   34:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   37:areturn         
	}

	public static MediaFormat createVideoFormat(String s, String s1, int i, int j, long l, int k, int i1, 
			List list, int j1, float f, byte abyte0[], int k1)
	{
		return new MediaFormat(s, s1, i, j, l, k, i1, j1, f, -1, -1, ((String) (null)), 0xffffffffL, list, false, -1, -1, -1, -1, -1, abyte0, k1);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:lload           4
	//    7   10:iload           6
	//    8   12:iload           7
	//    9   14:iload           9
	//   10   16:fload           10
	//   11   18:iconst_m1       
	//   12   19:iconst_m1       
	//   13   20:aconst_null     
	//   14   21:ldc2w           #17  <Long 0xffffffffL>
	//   15   24:aload           8
	//   16   26:iconst_0        
	//   17   27:iconst_m1       
	//   18   28:iconst_m1       
	//   19   29:iconst_m1       
	//   20   30:iconst_m1       
	//   21   31:iconst_m1       
	//   22   32:aload           11
	//   23   34:iload           12
	//   24   36:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   25   39:areturn         
	}

	private static final void maybeSetIntegerV16(android.media.MediaFormat mediaformat, String s, int i)
	{
		if(i != -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          11
			mediaformat.setInteger(s, i);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #195 <Method void android.media.MediaFormat.setInteger(String, int)>
	//    7   11:return          
	}

	private static final void maybeSetStringV16(android.media.MediaFormat mediaformat, String s, String s1)
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			mediaformat.setString(s, s1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #202 <Method void android.media.MediaFormat.setString(String, String)>
	//    6   10:return          
	}

	public MediaFormat copyAsAdaptive(String s)
	{
		return new MediaFormat(s, mimeType, -1, -1, durationUs, -1, -1, -1, -1F, -1, -1, ((String) (null)), 0xffffffffL, ((List) (null)), true, maxWidth, maxHeight, -1, -1, -1, ((byte []) (null)), stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field String mimeType>
	//    5    9:iconst_m1       
	//    6   10:iconst_m1       
	//    7   11:aload_0         
	//    8   12:getfield        #83  <Field long durationUs>
	//    9   15:iconst_m1       
	//   10   16:iconst_m1       
	//   11   17:iconst_m1       
	//   12   18:ldc1            #154 <Float -1F>
	//   13   20:iconst_m1       
	//   14   21:iconst_m1       
	//   15   22:aconst_null     
	//   16   23:ldc2w           #17  <Long 0xffffffffL>
	//   17   26:aconst_null     
	//   18   27:iconst_1        
	//   19   28:aload_0         
	//   20   29:getfield        #116 <Field int maxWidth>
	//   21   32:aload_0         
	//   22   33:getfield        #118 <Field int maxHeight>
	//   23   36:iconst_m1       
	//   24   37:iconst_m1       
	//   25   38:iconst_m1       
	//   26   39:aconst_null     
	//   27   40:aload_0         
	//   28   41:getfield        #132 <Field int stereoMode>
	//   29   44:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   30   47:areturn         
	}

	public MediaFormat copyWithDurationUs(long l)
	{
		return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, l, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field int maxInputSize>
	//   10   20:lload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #85  <Field int width>
	//   13   25:aload_0         
	//   14   26:getfield        #87  <Field int height>
	//   15   29:aload_0         
	//   16   30:getfield        #89  <Field int rotationDegrees>
	//   17   33:aload_0         
	//   18   34:getfield        #95  <Field float pixelWidthHeightRatio>
	//   19   37:aload_0         
	//   20   38:getfield        #97  <Field int channelCount>
	//   21   41:aload_0         
	//   22   42:getfield        #99  <Field int sampleRate>
	//   23   45:aload_0         
	//   24   46:getfield        #101 <Field String language>
	//   25   49:aload_0         
	//   26   50:getfield        #103 <Field long subsampleOffsetUs>
	//   27   53:aload_0         
	//   28   54:getfield        #108 <Field List initializationData>
	//   29   57:aload_0         
	//   30   58:getfield        #114 <Field boolean adaptive>
	//   31   61:aload_0         
	//   32   62:getfield        #116 <Field int maxWidth>
	//   33   65:aload_0         
	//   34   66:getfield        #118 <Field int maxHeight>
	//   35   69:aload_0         
	//   36   70:getfield        #120 <Field int pcmEncoding>
	//   37   73:aload_0         
	//   38   74:getfield        #122 <Field int encoderDelay>
	//   39   77:aload_0         
	//   40   78:getfield        #124 <Field int encoderPadding>
	//   41   81:aload_0         
	//   42   82:getfield        #130 <Field byte[] projectionData>
	//   43   85:aload_0         
	//   44   86:getfield        #132 <Field int stereoMode>
	//   45   89:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   46   92:areturn         
	}

	public MediaFormat copyWithFixedTrackInfo(String s, int i, int j, int k, String s1)
	{
		return new MediaFormat(s, mimeType, i, maxInputSize, durationUs, j, k, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, s1, subsampleOffsetUs, initializationData, adaptive, -1, -1, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field String mimeType>
	//    5    9:iload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #77  <Field int maxInputSize>
	//    8   14:aload_0         
	//    9   15:getfield        #83  <Field long durationUs>
	//   10   18:iload_3         
	//   11   19:iload           4
	//   12   21:aload_0         
	//   13   22:getfield        #89  <Field int rotationDegrees>
	//   14   25:aload_0         
	//   15   26:getfield        #95  <Field float pixelWidthHeightRatio>
	//   16   29:aload_0         
	//   17   30:getfield        #97  <Field int channelCount>
	//   18   33:aload_0         
	//   19   34:getfield        #99  <Field int sampleRate>
	//   20   37:aload           5
	//   21   39:aload_0         
	//   22   40:getfield        #103 <Field long subsampleOffsetUs>
	//   23   43:aload_0         
	//   24   44:getfield        #108 <Field List initializationData>
	//   25   47:aload_0         
	//   26   48:getfield        #114 <Field boolean adaptive>
	//   27   51:iconst_m1       
	//   28   52:iconst_m1       
	//   29   53:aload_0         
	//   30   54:getfield        #120 <Field int pcmEncoding>
	//   31   57:aload_0         
	//   32   58:getfield        #122 <Field int encoderDelay>
	//   33   61:aload_0         
	//   34   62:getfield        #124 <Field int encoderPadding>
	//   35   65:aload_0         
	//   36   66:getfield        #130 <Field byte[] projectionData>
	//   37   69:aload_0         
	//   38   70:getfield        #132 <Field int stereoMode>
	//   39   73:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   40   76:areturn         
	}

	public MediaFormat copyWithGaplessInfo(int i, int j)
	{
		return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight, pcmEncoding, i, j, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field int maxInputSize>
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field long durationUs>
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int width>
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int height>
	//   16   32:aload_0         
	//   17   33:getfield        #89  <Field int rotationDegrees>
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field float pixelWidthHeightRatio>
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field int channelCount>
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field int sampleRate>
	//   24   48:aload_0         
	//   25   49:getfield        #101 <Field String language>
	//   26   52:aload_0         
	//   27   53:getfield        #103 <Field long subsampleOffsetUs>
	//   28   56:aload_0         
	//   29   57:getfield        #108 <Field List initializationData>
	//   30   60:aload_0         
	//   31   61:getfield        #114 <Field boolean adaptive>
	//   32   64:aload_0         
	//   33   65:getfield        #116 <Field int maxWidth>
	//   34   68:aload_0         
	//   35   69:getfield        #118 <Field int maxHeight>
	//   36   72:aload_0         
	//   37   73:getfield        #120 <Field int pcmEncoding>
	//   38   76:iload_1         
	//   39   77:iload_2         
	//   40   78:aload_0         
	//   41   79:getfield        #130 <Field byte[] projectionData>
	//   42   82:aload_0         
	//   43   83:getfield        #132 <Field int stereoMode>
	//   44   86:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   45   89:areturn         
	}

	public MediaFormat copyWithLanguage(String s)
	{
		return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, s, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field int maxInputSize>
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field long durationUs>
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int width>
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int height>
	//   16   32:aload_0         
	//   17   33:getfield        #89  <Field int rotationDegrees>
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field float pixelWidthHeightRatio>
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field int channelCount>
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field int sampleRate>
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #103 <Field long subsampleOffsetUs>
	//   27   53:aload_0         
	//   28   54:getfield        #108 <Field List initializationData>
	//   29   57:aload_0         
	//   30   58:getfield        #114 <Field boolean adaptive>
	//   31   61:aload_0         
	//   32   62:getfield        #116 <Field int maxWidth>
	//   33   65:aload_0         
	//   34   66:getfield        #118 <Field int maxHeight>
	//   35   69:aload_0         
	//   36   70:getfield        #120 <Field int pcmEncoding>
	//   37   73:aload_0         
	//   38   74:getfield        #122 <Field int encoderDelay>
	//   39   77:aload_0         
	//   40   78:getfield        #124 <Field int encoderPadding>
	//   41   81:aload_0         
	//   42   82:getfield        #130 <Field byte[] projectionData>
	//   43   85:aload_0         
	//   44   86:getfield        #132 <Field int stereoMode>
	//   45   89:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   46   92:areturn         
	}

	public MediaFormat copyWithMaxInputSize(int i)
	{
		return new MediaFormat(trackId, mimeType, bitrate, i, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:iload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field long durationUs>
	//   11   21:aload_0         
	//   12   22:getfield        #85  <Field int width>
	//   13   25:aload_0         
	//   14   26:getfield        #87  <Field int height>
	//   15   29:aload_0         
	//   16   30:getfield        #89  <Field int rotationDegrees>
	//   17   33:aload_0         
	//   18   34:getfield        #95  <Field float pixelWidthHeightRatio>
	//   19   37:aload_0         
	//   20   38:getfield        #97  <Field int channelCount>
	//   21   41:aload_0         
	//   22   42:getfield        #99  <Field int sampleRate>
	//   23   45:aload_0         
	//   24   46:getfield        #101 <Field String language>
	//   25   49:aload_0         
	//   26   50:getfield        #103 <Field long subsampleOffsetUs>
	//   27   53:aload_0         
	//   28   54:getfield        #108 <Field List initializationData>
	//   29   57:aload_0         
	//   30   58:getfield        #114 <Field boolean adaptive>
	//   31   61:aload_0         
	//   32   62:getfield        #116 <Field int maxWidth>
	//   33   65:aload_0         
	//   34   66:getfield        #118 <Field int maxHeight>
	//   35   69:aload_0         
	//   36   70:getfield        #120 <Field int pcmEncoding>
	//   37   73:aload_0         
	//   38   74:getfield        #122 <Field int encoderDelay>
	//   39   77:aload_0         
	//   40   78:getfield        #124 <Field int encoderPadding>
	//   41   81:aload_0         
	//   42   82:getfield        #130 <Field byte[] projectionData>
	//   43   85:aload_0         
	//   44   86:getfield        #132 <Field int stereoMode>
	//   45   89:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   46   92:areturn         
	}

	public MediaFormat copyWithMaxVideoDimensions(int i, int j)
	{
		return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, i, j, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field int maxInputSize>
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field long durationUs>
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int width>
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int height>
	//   16   32:aload_0         
	//   17   33:getfield        #89  <Field int rotationDegrees>
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field float pixelWidthHeightRatio>
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field int channelCount>
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field int sampleRate>
	//   24   48:aload_0         
	//   25   49:getfield        #101 <Field String language>
	//   26   52:aload_0         
	//   27   53:getfield        #103 <Field long subsampleOffsetUs>
	//   28   56:aload_0         
	//   29   57:getfield        #108 <Field List initializationData>
	//   30   60:aload_0         
	//   31   61:getfield        #114 <Field boolean adaptive>
	//   32   64:iload_1         
	//   33   65:iload_2         
	//   34   66:aload_0         
	//   35   67:getfield        #120 <Field int pcmEncoding>
	//   36   70:aload_0         
	//   37   71:getfield        #122 <Field int encoderDelay>
	//   38   74:aload_0         
	//   39   75:getfield        #124 <Field int encoderPadding>
	//   40   78:aload_0         
	//   41   79:getfield        #130 <Field byte[] projectionData>
	//   42   82:aload_0         
	//   43   83:getfield        #132 <Field int stereoMode>
	//   44   86:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   45   89:areturn         
	}

	public MediaFormat copyWithSubsampleOffsetUs(long l)
	{
		return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, l, initializationData, adaptive, maxWidth, maxHeight, pcmEncoding, encoderDelay, encoderPadding, projectionData, stereoMode);
	//    0    0:new             #2   <Class MediaFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field String trackId>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field String mimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int bitrate>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field int maxInputSize>
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field long durationUs>
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int width>
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int height>
	//   16   32:aload_0         
	//   17   33:getfield        #89  <Field int rotationDegrees>
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field float pixelWidthHeightRatio>
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field int channelCount>
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field int sampleRate>
	//   24   48:aload_0         
	//   25   49:getfield        #101 <Field String language>
	//   26   52:lload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #108 <Field List initializationData>
	//   29   57:aload_0         
	//   30   58:getfield        #114 <Field boolean adaptive>
	//   31   61:aload_0         
	//   32   62:getfield        #116 <Field int maxWidth>
	//   33   65:aload_0         
	//   34   66:getfield        #118 <Field int maxHeight>
	//   35   69:aload_0         
	//   36   70:getfield        #120 <Field int pcmEncoding>
	//   37   73:aload_0         
	//   38   74:getfield        #122 <Field int encoderDelay>
	//   39   77:aload_0         
	//   40   78:getfield        #124 <Field int encoderPadding>
	//   41   81:aload_0         
	//   42   82:getfield        #130 <Field byte[] projectionData>
	//   43   85:aload_0         
	//   44   86:getfield        #132 <Field int stereoMode>
	//   45   89:invokespecial   #156 <Method void MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, List, boolean, int, int, int, int, int, byte[], int)>
	//   46   92:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
	//*   6    8:ifnull          358
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #222 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #222 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((MediaFormat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class MediaFormat>
	//   16   28:astore_1        
			if(adaptive == ((MediaFormat) (obj)).adaptive && bitrate == ((MediaFormat) (obj)).bitrate && maxInputSize == ((MediaFormat) (obj)).maxInputSize && durationUs == ((MediaFormat) (obj)).durationUs && width == ((MediaFormat) (obj)).width && height == ((MediaFormat) (obj)).height && rotationDegrees == ((MediaFormat) (obj)).rotationDegrees && pixelWidthHeightRatio == ((MediaFormat) (obj)).pixelWidthHeightRatio && maxWidth == ((MediaFormat) (obj)).maxWidth && maxHeight == ((MediaFormat) (obj)).maxHeight && channelCount == ((MediaFormat) (obj)).channelCount && sampleRate == ((MediaFormat) (obj)).sampleRate && pcmEncoding == ((MediaFormat) (obj)).pcmEncoding && encoderDelay == ((MediaFormat) (obj)).encoderDelay && encoderPadding == ((MediaFormat) (obj)).encoderPadding && subsampleOffsetUs == ((MediaFormat) (obj)).subsampleOffsetUs && Util.areEqual(((Object) (trackId)), ((Object) (((MediaFormat) (obj)).trackId))) && Util.areEqual(((Object) (language)), ((Object) (((MediaFormat) (obj)).language))) && Util.areEqual(((Object) (mimeType)), ((Object) (((MediaFormat) (obj)).mimeType))) && initializationData.size() == ((MediaFormat) (obj)).initializationData.size() && Arrays.equals(projectionData, ((MediaFormat) (obj)).projectionData))
	//*  17   29:aload_0         
	//*  18   30:getfield        #114 <Field boolean adaptive>
	//*  19   33:aload_1         
	//*  20   34:getfield        #114 <Field boolean adaptive>
	//*  21   37:icmpne          356
	//*  22   40:aload_0         
	//*  23   41:getfield        #75  <Field int bitrate>
	//*  24   44:aload_1         
	//*  25   45:getfield        #75  <Field int bitrate>
	//*  26   48:icmpne          356
	//*  27   51:aload_0         
	//*  28   52:getfield        #77  <Field int maxInputSize>
	//*  29   55:aload_1         
	//*  30   56:getfield        #77  <Field int maxInputSize>
	//*  31   59:icmpne          356
	//*  32   62:aload_0         
	//*  33   63:getfield        #83  <Field long durationUs>
	//*  34   66:aload_1         
	//*  35   67:getfield        #83  <Field long durationUs>
	//*  36   70:lcmp            
	//*  37   71:ifne            356
	//*  38   74:aload_0         
	//*  39   75:getfield        #85  <Field int width>
	//*  40   78:aload_1         
	//*  41   79:getfield        #85  <Field int width>
	//*  42   82:icmpne          356
	//*  43   85:aload_0         
	//*  44   86:getfield        #87  <Field int height>
	//*  45   89:aload_1         
	//*  46   90:getfield        #87  <Field int height>
	//*  47   93:icmpne          356
	//*  48   96:aload_0         
	//*  49   97:getfield        #89  <Field int rotationDegrees>
	//*  50  100:aload_1         
	//*  51  101:getfield        #89  <Field int rotationDegrees>
	//*  52  104:icmpne          356
	//*  53  107:aload_0         
	//*  54  108:getfield        #95  <Field float pixelWidthHeightRatio>
	//*  55  111:aload_1         
	//*  56  112:getfield        #95  <Field float pixelWidthHeightRatio>
	//*  57  115:fcmpl           
	//*  58  116:ifne            356
	//*  59  119:aload_0         
	//*  60  120:getfield        #116 <Field int maxWidth>
	//*  61  123:aload_1         
	//*  62  124:getfield        #116 <Field int maxWidth>
	//*  63  127:icmpne          356
	//*  64  130:aload_0         
	//*  65  131:getfield        #118 <Field int maxHeight>
	//*  66  134:aload_1         
	//*  67  135:getfield        #118 <Field int maxHeight>
	//*  68  138:icmpne          356
	//*  69  141:aload_0         
	//*  70  142:getfield        #97  <Field int channelCount>
	//*  71  145:aload_1         
	//*  72  146:getfield        #97  <Field int channelCount>
	//*  73  149:icmpne          356
	//*  74  152:aload_0         
	//*  75  153:getfield        #99  <Field int sampleRate>
	//*  76  156:aload_1         
	//*  77  157:getfield        #99  <Field int sampleRate>
	//*  78  160:icmpne          356
	//*  79  163:aload_0         
	//*  80  164:getfield        #120 <Field int pcmEncoding>
	//*  81  167:aload_1         
	//*  82  168:getfield        #120 <Field int pcmEncoding>
	//*  83  171:icmpne          356
	//*  84  174:aload_0         
	//*  85  175:getfield        #122 <Field int encoderDelay>
	//*  86  178:aload_1         
	//*  87  179:getfield        #122 <Field int encoderDelay>
	//*  88  182:icmpne          356
	//*  89  185:aload_0         
	//*  90  186:getfield        #124 <Field int encoderPadding>
	//*  91  189:aload_1         
	//*  92  190:getfield        #124 <Field int encoderPadding>
	//*  93  193:icmpne          356
	//*  94  196:aload_0         
	//*  95  197:getfield        #103 <Field long subsampleOffsetUs>
	//*  96  200:aload_1         
	//*  97  201:getfield        #103 <Field long subsampleOffsetUs>
	//*  98  204:lcmp            
	//*  99  205:ifne            356
	//* 100  208:aload_0         
	//* 101  209:getfield        #67  <Field String trackId>
	//* 102  212:aload_1         
	//* 103  213:getfield        #67  <Field String trackId>
	//* 104  216:invokestatic    #228 <Method boolean Util.areEqual(Object, Object)>
	//* 105  219:ifeq            356
	//* 106  222:aload_0         
	//* 107  223:getfield        #101 <Field String language>
	//* 108  226:aload_1         
	//* 109  227:getfield        #101 <Field String language>
	//* 110  230:invokestatic    #228 <Method boolean Util.areEqual(Object, Object)>
	//* 111  233:ifeq            356
	//* 112  236:aload_0         
	//* 113  237:getfield        #69  <Field String mimeType>
	//* 114  240:aload_1         
	//* 115  241:getfield        #69  <Field String mimeType>
	//* 116  244:invokestatic    #228 <Method boolean Util.areEqual(Object, Object)>
	//* 117  247:ifeq            356
	//* 118  250:aload_0         
	//* 119  251:getfield        #108 <Field List initializationData>
	//* 120  254:invokeinterface #233 <Method int List.size()>
	//* 121  259:aload_1         
	//* 122  260:getfield        #108 <Field List initializationData>
	//* 123  263:invokeinterface #233 <Method int List.size()>
	//* 124  268:icmpne          356
	//* 125  271:aload_0         
	//* 126  272:getfield        #130 <Field byte[] projectionData>
	//* 127  275:aload_1         
	//* 128  276:getfield        #130 <Field byte[] projectionData>
	//* 129  279:invokestatic    #238 <Method boolean Arrays.equals(byte[], byte[])>
	//* 130  282:ifeq            356
			{
				if(stereoMode != ((MediaFormat) (obj)).stereoMode)
	//* 131  285:aload_0         
	//* 132  286:getfield        #132 <Field int stereoMode>
	//* 133  289:aload_1         
	//* 134  290:getfield        #132 <Field int stereoMode>
	//* 135  293:icmpeq          298
					return false;
	//  136  296:iconst_0        
	//  137  297:ireturn         
				for(int i = 0; i < initializationData.size(); i++)
	//* 138  298:iconst_0        
	//* 139  299:istore_2        
	//* 140  300:iload_2         
	//* 141  301:aload_0         
	//* 142  302:getfield        #108 <Field List initializationData>
	//* 143  305:invokeinterface #233 <Method int List.size()>
	//* 144  310:icmpge          354
					if(!Arrays.equals((byte[])initializationData.get(i), (byte[])((MediaFormat) (obj)).initializationData.get(i)))
	//* 145  313:aload_0         
	//* 146  314:getfield        #108 <Field List initializationData>
	//* 147  317:iload_2         
	//* 148  318:invokeinterface #242 <Method Object List.get(int)>
	//* 149  323:checkcast       #243 <Class byte[]>
	//* 150  326:aload_1         
	//* 151  327:getfield        #108 <Field List initializationData>
	//* 152  330:iload_2         
	//* 153  331:invokeinterface #242 <Method Object List.get(int)>
	//* 154  336:checkcast       #243 <Class byte[]>
	//* 155  339:invokestatic    #238 <Method boolean Arrays.equals(byte[], byte[])>
	//* 156  342:ifne            347
						return false;
	//  157  345:iconst_0        
	//  158  346:ireturn         

	//  159  347:iload_2         
	//  160  348:iconst_1        
	//  161  349:iadd            
	//  162  350:istore_2        
	//* 163  351:goto            300
				return true;
	//  164  354:iconst_1        
	//  165  355:ireturn         
			} else
			{
				return false;
	//  166  356:iconst_0        
	//  167  357:ireturn         
			}
		} else
		{
			return false;
	//  168  358:iconst_0        
	//  169  359:ireturn         
		}
	}

	public final android.media.MediaFormat getFrameworkMediaFormatV16()
	{
		if(frameworkMediaFormat == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field android.media.MediaFormat frameworkMediaFormat>
	//*   2    4:ifnonnull       259
		{
			android.media.MediaFormat mediaformat = new android.media.MediaFormat();
	//    3    7:new             #191 <Class android.media.MediaFormat>
	//    4   10:dup             
	//    5   11:invokespecial   #250 <Method void android.media.MediaFormat()>
	//    6   14:astore          4
			mediaformat.setString("mime", mimeType);
	//    7   16:aload           4
	//    8   18:ldc1            #252 <String "mime">
	//    9   20:aload_0         
	//   10   21:getfield        #69  <Field String mimeType>
	//   11   24:invokevirtual   #202 <Method void android.media.MediaFormat.setString(String, String)>
			maybeSetStringV16(mediaformat, "language", language);
	//   12   27:aload           4
	//   13   29:ldc1            #253 <String "language">
	//   14   31:aload_0         
	//   15   32:getfield        #101 <Field String language>
	//   16   35:invokestatic    #255 <Method void maybeSetStringV16(android.media.MediaFormat, String, String)>
			maybeSetIntegerV16(mediaformat, "max-input-size", maxInputSize);
	//   17   38:aload           4
	//   18   40:ldc2            #257 <String "max-input-size">
	//   19   43:aload_0         
	//   20   44:getfield        #77  <Field int maxInputSize>
	//   21   47:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "width", width);
	//   22   50:aload           4
	//   23   52:ldc2            #260 <String "width">
	//   24   55:aload_0         
	//   25   56:getfield        #85  <Field int width>
	//   26   59:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "height", height);
	//   27   62:aload           4
	//   28   64:ldc2            #261 <String "height">
	//   29   67:aload_0         
	//   30   68:getfield        #87  <Field int height>
	//   31   71:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "rotation-degrees", rotationDegrees);
	//   32   74:aload           4
	//   33   76:ldc2            #263 <String "rotation-degrees">
	//   34   79:aload_0         
	//   35   80:getfield        #89  <Field int rotationDegrees>
	//   36   83:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "max-width", maxWidth);
	//   37   86:aload           4
	//   38   88:ldc2            #265 <String "max-width">
	//   39   91:aload_0         
	//   40   92:getfield        #116 <Field int maxWidth>
	//   41   95:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "max-height", maxHeight);
	//   42   98:aload           4
	//   43  100:ldc2            #267 <String "max-height">
	//   44  103:aload_0         
	//   45  104:getfield        #118 <Field int maxHeight>
	//   46  107:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "channel-count", channelCount);
	//   47  110:aload           4
	//   48  112:ldc2            #269 <String "channel-count">
	//   49  115:aload_0         
	//   50  116:getfield        #97  <Field int channelCount>
	//   51  119:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "sample-rate", sampleRate);
	//   52  122:aload           4
	//   53  124:ldc2            #271 <String "sample-rate">
	//   54  127:aload_0         
	//   55  128:getfield        #99  <Field int sampleRate>
	//   56  131:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "encoder-delay", encoderDelay);
	//   57  134:aload           4
	//   58  136:ldc2            #273 <String "encoder-delay">
	//   59  139:aload_0         
	//   60  140:getfield        #122 <Field int encoderDelay>
	//   61  143:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			maybeSetIntegerV16(mediaformat, "encoder-padding", encoderPadding);
	//   62  146:aload           4
	//   63  148:ldc2            #275 <String "encoder-padding">
	//   64  151:aload_0         
	//   65  152:getfield        #124 <Field int encoderPadding>
	//   66  155:invokestatic    #259 <Method void maybeSetIntegerV16(android.media.MediaFormat, String, int)>
			for(int i = 0; i < initializationData.size(); i++)
	//*  67  158:iconst_0        
	//*  68  159:istore_1        
	//*  69  160:iload_1         
	//*  70  161:aload_0         
	//*  71  162:getfield        #108 <Field List initializationData>
	//*  72  165:invokeinterface #233 <Method int List.size()>
	//*  73  170:icmpge          231
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   74  173:new             #277 <Class StringBuilder>
	//   75  176:dup             
	//   76  177:invokespecial   #278 <Method void StringBuilder()>
	//   77  180:astore          5
				stringbuilder.append("csd-");
	//   78  182:aload           5
	//   79  184:ldc2            #280 <String "csd-">
	//   80  187:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   81  190:pop             
				stringbuilder.append(i);
	//   82  191:aload           5
	//   83  193:iload_1         
	//   84  194:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   85  197:pop             
				mediaformat.setByteBuffer(stringbuilder.toString(), ByteBuffer.wrap((byte[])initializationData.get(i)));
	//   86  198:aload           4
	//   87  200:aload           5
	//   88  202:invokevirtual   #290 <Method String StringBuilder.toString()>
	//   89  205:aload_0         
	//   90  206:getfield        #108 <Field List initializationData>
	//   91  209:iload_1         
	//   92  210:invokeinterface #242 <Method Object List.get(int)>
	//   93  215:checkcast       #243 <Class byte[]>
	//   94  218:invokestatic    #296 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   95  221:invokevirtual   #300 <Method void android.media.MediaFormat.setByteBuffer(String, ByteBuffer)>
			}

	//   96  224:iload_1         
	//   97  225:iconst_1        
	//   98  226:iadd            
	//   99  227:istore_1        
	//* 100  228:goto            160
			long l = durationUs;
	//  101  231:aload_0         
	//  102  232:getfield        #83  <Field long durationUs>
	//  103  235:lstore_2        
			if(l != -1L)
	//* 104  236:lload_2         
	//* 105  237:ldc2w           #164 <Long -1L>
	//* 106  240:lcmp            
	//* 107  241:ifeq            253
				mediaformat.setLong("durationUs", l);
	//  108  244:aload           4
	//  109  246:ldc2            #301 <String "durationUs">
	//  110  249:lload_2         
	//  111  250:invokevirtual   #305 <Method void android.media.MediaFormat.setLong(String, long)>
			frameworkMediaFormat = mediaformat;
	//  112  253:aload_0         
	//  113  254:aload           4
	//  114  256:putfield        #249 <Field android.media.MediaFormat frameworkMediaFormat>
		}
		return frameworkMediaFormat;
	//  115  259:aload_0         
	//  116  260:getfield        #249 <Field android.media.MediaFormat frameworkMediaFormat>
	//  117  263:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field int hashCode>
	//*   2    4:ifne            368
		{
			String s = trackId;
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field String trackId>
	//    5   11:astore          20
			boolean flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
			int i;
			if(s == null)
	//*   8   16:aload           20
	//*   9   18:ifnonnull       26
				i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
			else
	//*  12   23:goto            32
				i = s.hashCode();
	//   13   26:aload           20
	//   14   28:invokevirtual   #311 <Method int String.hashCode()>
	//   15   31:istore_1        
			s = mimeType;
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field String mimeType>
	//   18   36:astore          20
			int k;
			if(s == null)
	//*  19   38:aload           20
	//*  20   40:ifnonnull       48
				k = 0;
	//   21   43:iconst_0        
	//   22   44:istore_2        
			else
	//*  23   45:goto            54
				k = s.hashCode();
	//   24   48:aload           20
	//   25   50:invokevirtual   #311 <Method int String.hashCode()>
	//   26   53:istore_2        
			int i1 = bitrate;
	//   27   54:aload_0         
	//   28   55:getfield        #75  <Field int bitrate>
	//   29   58:istore          6
			int j1 = maxInputSize;
	//   30   60:aload_0         
	//   31   61:getfield        #77  <Field int maxInputSize>
	//   32   64:istore          7
			int k1 = width;
	//   33   66:aload_0         
	//   34   67:getfield        #85  <Field int width>
	//   35   70:istore          8
			int l1 = height;
	//   36   72:aload_0         
	//   37   73:getfield        #87  <Field int height>
	//   38   76:istore          9
			int i2 = rotationDegrees;
	//   39   78:aload_0         
	//   40   79:getfield        #89  <Field int rotationDegrees>
	//   41   82:istore          10
			int j2 = Float.floatToRawIntBits(pixelWidthHeightRatio);
	//   42   84:aload_0         
	//   43   85:getfield        #95  <Field float pixelWidthHeightRatio>
	//   44   88:invokestatic    #317 <Method int Float.floatToRawIntBits(float)>
	//   45   91:istore          11
			int k2 = (int)durationUs;
	//   46   93:aload_0         
	//   47   94:getfield        #83  <Field long durationUs>
	//   48   97:l2i             
	//   49   98:istore          12
			char c;
			if(adaptive)
	//*  50  100:aload_0         
	//*  51  101:getfield        #114 <Field boolean adaptive>
	//*  52  104:ifeq            114
				c = '\u04CF';
	//   53  107:sipush          1231
	//   54  110:istore_3        
			else
	//*  55  111:goto            118
				c = '\u04D5';
	//   56  114:sipush          1237
	//   57  117:istore_3        
			int l2 = maxWidth;
	//   58  118:aload_0         
	//   59  119:getfield        #116 <Field int maxWidth>
	//   60  122:istore          13
			int i3 = maxHeight;
	//   61  124:aload_0         
	//   62  125:getfield        #118 <Field int maxHeight>
	//   63  128:istore          14
			int j3 = channelCount;
	//   64  130:aload_0         
	//   65  131:getfield        #97  <Field int channelCount>
	//   66  134:istore          15
			int k3 = sampleRate;
	//   67  136:aload_0         
	//   68  137:getfield        #99  <Field int sampleRate>
	//   69  140:istore          16
			int l3 = pcmEncoding;
	//   70  142:aload_0         
	//   71  143:getfield        #120 <Field int pcmEncoding>
	//   72  146:istore          17
			int i4 = encoderDelay;
	//   73  148:aload_0         
	//   74  149:getfield        #122 <Field int encoderDelay>
	//   75  152:istore          18
			int j4 = encoderPadding;
	//   76  154:aload_0         
	//   77  155:getfield        #124 <Field int encoderPadding>
	//   78  158:istore          19
			s = language;
	//   79  160:aload_0         
	//   80  161:getfield        #101 <Field String language>
	//   81  164:astore          20
			int l;
			if(s == null)
	//*  82  166:aload           20
	//*  83  168:ifnonnull       177
				l = 0;
	//   84  171:iconst_0        
	//   85  172:istore          4
			else
	//*  86  174:goto            184
				l = s.hashCode();
	//   87  177:aload           20
	//   88  179:invokevirtual   #311 <Method int String.hashCode()>
	//   89  182:istore          4
			k = ((((((((((((((((((527 + i) * 31 + k) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + c) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + l) * 31 + (int)subsampleOffsetUs;
	//   90  184:sipush          527
	//   91  187:iload_1         
	//   92  188:iadd            
	//   93  189:bipush          31
	//   94  191:imul            
	//   95  192:iload_2         
	//   96  193:iadd            
	//   97  194:bipush          31
	//   98  196:imul            
	//   99  197:iload           6
	//  100  199:iadd            
	//  101  200:bipush          31
	//  102  202:imul            
	//  103  203:iload           7
	//  104  205:iadd            
	//  105  206:bipush          31
	//  106  208:imul            
	//  107  209:iload           8
	//  108  211:iadd            
	//  109  212:bipush          31
	//  110  214:imul            
	//  111  215:iload           9
	//  112  217:iadd            
	//  113  218:bipush          31
	//  114  220:imul            
	//  115  221:iload           10
	//  116  223:iadd            
	//  117  224:bipush          31
	//  118  226:imul            
	//  119  227:iload           11
	//  120  229:iadd            
	//  121  230:bipush          31
	//  122  232:imul            
	//  123  233:iload           12
	//  124  235:iadd            
	//  125  236:bipush          31
	//  126  238:imul            
	//  127  239:iload_3         
	//  128  240:iadd            
	//  129  241:bipush          31
	//  130  243:imul            
	//  131  244:iload           13
	//  132  246:iadd            
	//  133  247:bipush          31
	//  134  249:imul            
	//  135  250:iload           14
	//  136  252:iadd            
	//  137  253:bipush          31
	//  138  255:imul            
	//  139  256:iload           15
	//  140  258:iadd            
	//  141  259:bipush          31
	//  142  261:imul            
	//  143  262:iload           16
	//  144  264:iadd            
	//  145  265:bipush          31
	//  146  267:imul            
	//  147  268:iload           17
	//  148  270:iadd            
	//  149  271:bipush          31
	//  150  273:imul            
	//  151  274:iload           18
	//  152  276:iadd            
	//  153  277:bipush          31
	//  154  279:imul            
	//  155  280:iload           19
	//  156  282:iadd            
	//  157  283:bipush          31
	//  158  285:imul            
	//  159  286:iload           4
	//  160  288:iadd            
	//  161  289:bipush          31
	//  162  291:imul            
	//  163  292:aload_0         
	//  164  293:getfield        #103 <Field long subsampleOffsetUs>
	//  165  296:l2i             
	//  166  297:iadd            
	//  167  298:istore_2        
			for(int j = ((int) (flag)); j < initializationData.size(); j++)
	//* 168  299:iload           5
	//* 169  301:istore_1        
	//* 170  302:iload_1         
	//* 171  303:aload_0         
	//* 172  304:getfield        #108 <Field List initializationData>
	//* 173  307:invokeinterface #233 <Method int List.size()>
	//* 174  312:icmpge          344
				k = k * 31 + Arrays.hashCode((byte[])initializationData.get(j));
	//  175  315:iload_2         
	//  176  316:bipush          31
	//  177  318:imul            
	//  178  319:aload_0         
	//  179  320:getfield        #108 <Field List initializationData>
	//  180  323:iload_1         
	//  181  324:invokeinterface #242 <Method Object List.get(int)>
	//  182  329:checkcast       #243 <Class byte[]>
	//  183  332:invokestatic    #320 <Method int Arrays.hashCode(byte[])>
	//  184  335:iadd            
	//  185  336:istore_2        

	//  186  337:iload_1         
	//  187  338:iconst_1        
	//  188  339:iadd            
	//  189  340:istore_1        
	//* 190  341:goto            302
			hashCode = (k * 31 + Arrays.hashCode(projectionData)) * 31 + stereoMode;
	//  191  344:aload_0         
	//  192  345:iload_2         
	//  193  346:bipush          31
	//  194  348:imul            
	//  195  349:aload_0         
	//  196  350:getfield        #130 <Field byte[] projectionData>
	//  197  353:invokestatic    #320 <Method int Arrays.hashCode(byte[])>
	//  198  356:iadd            
	//  199  357:bipush          31
	//  200  359:imul            
	//  201  360:aload_0         
	//  202  361:getfield        #132 <Field int stereoMode>
	//  203  364:iadd            
	//  204  365:putfield        #307 <Field int hashCode>
		}
		return hashCode;
	//  205  368:aload_0         
	//  206  369:getfield        #307 <Field int hashCode>
	//  207  372:ireturn         
	}

	final void setFrameworkFormatV16(android.media.MediaFormat mediaformat)
	{
		frameworkMediaFormat = mediaformat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #249 <Field android.media.MediaFormat frameworkMediaFormat>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #277 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #278 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaFormat(");
	//    4    8:aload_1         
	//    5    9:ldc2            #326 <String "MediaFormat(">
	//    6   12:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(trackId);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field String trackId>
	//   11   21:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", ");
	//   13   25:aload_1         
	//   14   26:ldc2            #328 <String ", ">
	//   15   29:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(mimeType);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #69  <Field String mimeType>
	//   20   38:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(", ");
	//   22   42:aload_1         
	//   23   43:ldc2            #328 <String ", ">
	//   24   46:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(bitrate);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #75  <Field int bitrate>
	//   29   55:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   30   58:pop             
		stringbuilder.append(", ");
	//   31   59:aload_1         
	//   32   60:ldc2            #328 <String ", ">
	//   33   63:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(maxInputSize);
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #77  <Field int maxInputSize>
	//   38   72:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   39   75:pop             
		stringbuilder.append(", ");
	//   40   76:aload_1         
	//   41   77:ldc2            #328 <String ", ">
	//   42   80:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(width);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #85  <Field int width>
	//   47   89:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   48   92:pop             
		stringbuilder.append(", ");
	//   49   93:aload_1         
	//   50   94:ldc2            #328 <String ", ">
	//   51   97:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(height);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #87  <Field int height>
	//   56  106:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   57  109:pop             
		stringbuilder.append(", ");
	//   58  110:aload_1         
	//   59  111:ldc2            #328 <String ", ">
	//   60  114:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(rotationDegrees);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #89  <Field int rotationDegrees>
	//   65  123:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   66  126:pop             
		stringbuilder.append(", ");
	//   67  127:aload_1         
	//   68  128:ldc2            #328 <String ", ">
	//   69  131:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(pixelWidthHeightRatio);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #95  <Field float pixelWidthHeightRatio>
	//   74  140:invokevirtual   #331 <Method StringBuilder StringBuilder.append(float)>
	//   75  143:pop             
		stringbuilder.append(", ");
	//   76  144:aload_1         
	//   77  145:ldc2            #328 <String ", ">
	//   78  148:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(channelCount);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #97  <Field int channelCount>
	//   83  157:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   84  160:pop             
		stringbuilder.append(", ");
	//   85  161:aload_1         
	//   86  162:ldc2            #328 <String ", ">
	//   87  165:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(sampleRate);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #99  <Field int sampleRate>
	//   92  174:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append(", ");
	//   94  178:aload_1         
	//   95  179:ldc2            #328 <String ", ">
	//   96  182:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		stringbuilder.append(language);
	//   98  186:aload_1         
	//   99  187:aload_0         
	//  100  188:getfield        #101 <Field String language>
	//  101  191:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  102  194:pop             
		stringbuilder.append(", ");
	//  103  195:aload_1         
	//  104  196:ldc2            #328 <String ", ">
	//  105  199:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
		stringbuilder.append(durationUs);
	//  107  203:aload_1         
	//  108  204:aload_0         
	//  109  205:getfield        #83  <Field long durationUs>
	//  110  208:invokevirtual   #334 <Method StringBuilder StringBuilder.append(long)>
	//  111  211:pop             
		stringbuilder.append(", ");
	//  112  212:aload_1         
	//  113  213:ldc2            #328 <String ", ">
	//  114  216:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  115  219:pop             
		stringbuilder.append(adaptive);
	//  116  220:aload_1         
	//  117  221:aload_0         
	//  118  222:getfield        #114 <Field boolean adaptive>
	//  119  225:invokevirtual   #337 <Method StringBuilder StringBuilder.append(boolean)>
	//  120  228:pop             
		stringbuilder.append(", ");
	//  121  229:aload_1         
	//  122  230:ldc2            #328 <String ", ">
	//  123  233:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  124  236:pop             
		stringbuilder.append(maxWidth);
	//  125  237:aload_1         
	//  126  238:aload_0         
	//  127  239:getfield        #116 <Field int maxWidth>
	//  128  242:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//  129  245:pop             
		stringbuilder.append(", ");
	//  130  246:aload_1         
	//  131  247:ldc2            #328 <String ", ">
	//  132  250:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  133  253:pop             
		stringbuilder.append(maxHeight);
	//  134  254:aload_1         
	//  135  255:aload_0         
	//  136  256:getfield        #118 <Field int maxHeight>
	//  137  259:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//  138  262:pop             
		stringbuilder.append(", ");
	//  139  263:aload_1         
	//  140  264:ldc2            #328 <String ", ">
	//  141  267:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  142  270:pop             
		stringbuilder.append(pcmEncoding);
	//  143  271:aload_1         
	//  144  272:aload_0         
	//  145  273:getfield        #120 <Field int pcmEncoding>
	//  146  276:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//  147  279:pop             
		stringbuilder.append(", ");
	//  148  280:aload_1         
	//  149  281:ldc2            #328 <String ", ">
	//  150  284:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
		stringbuilder.append(encoderDelay);
	//  152  288:aload_1         
	//  153  289:aload_0         
	//  154  290:getfield        #122 <Field int encoderDelay>
	//  155  293:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//  156  296:pop             
		stringbuilder.append(", ");
	//  157  297:aload_1         
	//  158  298:ldc2            #328 <String ", ">
	//  159  301:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  160  304:pop             
		stringbuilder.append(encoderPadding);
	//  161  305:aload_1         
	//  162  306:aload_0         
	//  163  307:getfield        #124 <Field int encoderPadding>
	//  164  310:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//  165  313:pop             
		stringbuilder.append(")");
	//  166  314:aload_1         
	//  167  315:ldc2            #339 <String ")">
	//  168  318:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//  169  321:pop             
		return stringbuilder.toString();
	//  170  322:aload_1         
	//  171  323:invokevirtual   #290 <Method String StringBuilder.toString()>
	//  172  326:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #343 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #345 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #350 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaFormat createFromParcel(Parcel parcel)
		{
			return new MediaFormat(parcel);
		//    0    0:new             #9   <Class MediaFormat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MediaFormat(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method MediaFormat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaFormat[] newArray(int i)
		{
			return new MediaFormat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaFormat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method MediaFormat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final int NO_VALUE = -1;
	public static final long OFFSET_SAMPLE_RELATIVE = 0xffffffffL;
	public final boolean adaptive;
	public final int bitrate;
	public final int channelCount;
	public final long durationUs;
	public final int encoderDelay;
	public final int encoderPadding;
	private android.media.MediaFormat frameworkMediaFormat;
	private int hashCode;
	public final int height;
	public final List initializationData;
	public final String language;
	public final int maxHeight;
	public final int maxInputSize;
	public final int maxWidth;
	public final String mimeType;
	public final int pcmEncoding;
	public final float pixelWidthHeightRatio;
	public final byte projectionData[];
	public final int rotationDegrees;
	public final int sampleRate;
	public final int stereoMode;
	public final long subsampleOffsetUs;
	public final String trackId;
	public final int width;

	static 
	{
	//    0    0:new             #8   <Class MediaFormat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void MediaFormat$1()>
	//    3    7:putstatic       #56  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
