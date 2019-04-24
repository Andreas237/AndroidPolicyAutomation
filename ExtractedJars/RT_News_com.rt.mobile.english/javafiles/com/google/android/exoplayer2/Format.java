// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.*;

public final class Format
	implements Parcelable
{

	Format(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		id = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method String Parcel.readString()>
	//    5    9:putfield        #72  <Field String id>
		containerMimeType = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #70  <Method String Parcel.readString()>
	//    9   17:putfield        #74  <Field String containerMimeType>
		sampleMimeType = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #70  <Method String Parcel.readString()>
	//   13   25:putfield        #76  <Field String sampleMimeType>
		codecs = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #70  <Method String Parcel.readString()>
	//   17   33:putfield        #78  <Field String codecs>
		bitrate = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #82  <Method int Parcel.readInt()>
	//   21   41:putfield        #84  <Field int bitrate>
		maxInputSize = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #82  <Method int Parcel.readInt()>
	//   25   49:putfield        #86  <Field int maxInputSize>
		width = parcel.readInt();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #82  <Method int Parcel.readInt()>
	//   29   57:putfield        #88  <Field int width>
		height = parcel.readInt();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #82  <Method int Parcel.readInt()>
	//   33   65:putfield        #90  <Field int height>
		frameRate = parcel.readFloat();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #94  <Method float Parcel.readFloat()>
	//   37   73:putfield        #96  <Field float frameRate>
		rotationDegrees = parcel.readInt();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #82  <Method int Parcel.readInt()>
	//   41   81:putfield        #98  <Field int rotationDegrees>
		pixelWidthHeightRatio = parcel.readFloat();
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #94  <Method float Parcel.readFloat()>
	//   45   89:putfield        #100 <Field float pixelWidthHeightRatio>
		byte abyte0[];
		if(Util.readBoolean(parcel))
	//*  46   92:aload_1         
	//*  47   93:invokestatic    #106 <Method boolean Util.readBoolean(Parcel)>
	//*  48   96:ifeq            108
			abyte0 = parcel.createByteArray();
	//   49   99:aload_1         
	//   50  100:invokevirtual   #110 <Method byte[] Parcel.createByteArray()>
	//   51  103:astore          4
		else
	//*  52  105:goto            111
			abyte0 = null;
	//   53  108:aconst_null     
	//   54  109:astore          4
		projectionData = abyte0;
	//   55  111:aload_0         
	//   56  112:aload           4
	//   57  114:putfield        #112 <Field byte[] projectionData>
		stereoMode = parcel.readInt();
	//   58  117:aload_0         
	//   59  118:aload_1         
	//   60  119:invokevirtual   #82  <Method int Parcel.readInt()>
	//   61  122:putfield        #114 <Field int stereoMode>
		colorInfo = (ColorInfo)parcel.readParcelable(((Class) (com/google/android/exoplayer2/video/ColorInfo)).getClassLoader());
	//   62  125:aload_0         
	//   63  126:aload_1         
	//   64  127:ldc1            #116 <Class ColorInfo>
	//   65  129:invokevirtual   #122 <Method ClassLoader Class.getClassLoader()>
	//   66  132:invokevirtual   #126 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   67  135:checkcast       #116 <Class ColorInfo>
	//   68  138:putfield        #128 <Field ColorInfo colorInfo>
		channelCount = parcel.readInt();
	//   69  141:aload_0         
	//   70  142:aload_1         
	//   71  143:invokevirtual   #82  <Method int Parcel.readInt()>
	//   72  146:putfield        #130 <Field int channelCount>
		sampleRate = parcel.readInt();
	//   73  149:aload_0         
	//   74  150:aload_1         
	//   75  151:invokevirtual   #82  <Method int Parcel.readInt()>
	//   76  154:putfield        #132 <Field int sampleRate>
		pcmEncoding = parcel.readInt();
	//   77  157:aload_0         
	//   78  158:aload_1         
	//   79  159:invokevirtual   #82  <Method int Parcel.readInt()>
	//   80  162:putfield        #134 <Field int pcmEncoding>
		encoderDelay = parcel.readInt();
	//   81  165:aload_0         
	//   82  166:aload_1         
	//   83  167:invokevirtual   #82  <Method int Parcel.readInt()>
	//   84  170:putfield        #136 <Field int encoderDelay>
		encoderPadding = parcel.readInt();
	//   85  173:aload_0         
	//   86  174:aload_1         
	//   87  175:invokevirtual   #82  <Method int Parcel.readInt()>
	//   88  178:putfield        #138 <Field int encoderPadding>
		selectionFlags = parcel.readInt();
	//   89  181:aload_0         
	//   90  182:aload_1         
	//   91  183:invokevirtual   #82  <Method int Parcel.readInt()>
	//   92  186:putfield        #140 <Field int selectionFlags>
		language = parcel.readString();
	//   93  189:aload_0         
	//   94  190:aload_1         
	//   95  191:invokevirtual   #70  <Method String Parcel.readString()>
	//   96  194:putfield        #142 <Field String language>
		accessibilityChannel = parcel.readInt();
	//   97  197:aload_0         
	//   98  198:aload_1         
	//   99  199:invokevirtual   #82  <Method int Parcel.readInt()>
	//  100  202:putfield        #144 <Field int accessibilityChannel>
		subsampleOffsetUs = parcel.readLong();
	//  101  205:aload_0         
	//  102  206:aload_1         
	//  103  207:invokevirtual   #148 <Method long Parcel.readLong()>
	//  104  210:putfield        #150 <Field long subsampleOffsetUs>
		int j = parcel.readInt();
	//  105  213:aload_1         
	//  106  214:invokevirtual   #82  <Method int Parcel.readInt()>
	//  107  217:istore_3        
		initializationData = ((List) (new ArrayList(j)));
	//  108  218:aload_0         
	//  109  219:new             #152 <Class ArrayList>
	//  110  222:dup             
	//  111  223:iload_3         
	//  112  224:invokespecial   #155 <Method void ArrayList(int)>
	//  113  227:putfield        #157 <Field List initializationData>
		for(int i = 0; i < j; i++)
	//* 114  230:iconst_0        
	//* 115  231:istore_2        
	//* 116  232:iload_2         
	//* 117  233:iload_3         
	//* 118  234:icmpge          258
			initializationData.add(((Object) (parcel.createByteArray())));
	//  119  237:aload_0         
	//  120  238:getfield        #157 <Field List initializationData>
	//  121  241:aload_1         
	//  122  242:invokevirtual   #110 <Method byte[] Parcel.createByteArray()>
	//  123  245:invokeinterface #163 <Method boolean List.add(Object)>
	//  124  250:pop             

	//  125  251:iload_2         
	//  126  252:iconst_1        
	//  127  253:iadd            
	//  128  254:istore_2        
	//* 129  255:goto            232
		drmInitData = (DrmInitData)parcel.readParcelable(((Class) (com/google/android/exoplayer2/drm/DrmInitData)).getClassLoader());
	//  130  258:aload_0         
	//  131  259:aload_1         
	//  132  260:ldc1            #165 <Class DrmInitData>
	//  133  262:invokevirtual   #122 <Method ClassLoader Class.getClassLoader()>
	//  134  265:invokevirtual   #126 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//  135  268:checkcast       #165 <Class DrmInitData>
	//  136  271:putfield        #167 <Field DrmInitData drmInitData>
		metadata = (Metadata)parcel.readParcelable(((Class) (com/google/android/exoplayer2/metadata/Metadata)).getClassLoader());
	//  137  274:aload_0         
	//  138  275:aload_1         
	//  139  276:ldc1            #169 <Class Metadata>
	//  140  278:invokevirtual   #122 <Method ClassLoader Class.getClassLoader()>
	//  141  281:invokevirtual   #126 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//  142  284:checkcast       #169 <Class Metadata>
	//  143  287:putfield        #171 <Field Metadata metadata>
	//  144  290:return          
	}

	Format(String s, String s1, String s2, String s3, int i, int j, int k, 
			int l, float f, int i1, float f1, byte abyte0[], int j1, ColorInfo colorinfo, 
			int k1, int l1, int i2, int j2, int k2, int l2, String s4, 
			int i3, long l3, List list, DrmInitData drminitdata, Metadata metadata1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #72  <Field String id>
		containerMimeType = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #74  <Field String containerMimeType>
		sampleMimeType = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #76  <Field String sampleMimeType>
		codecs = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #78  <Field String codecs>
		bitrate = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #84  <Field int bitrate>
		maxInputSize = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #86  <Field int maxInputSize>
		width = k;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #88  <Field int width>
		height = l;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #90  <Field int height>
		frameRate = f;
	//   26   49:aload_0         
	//   27   50:fload           9
	//   28   52:putfield        #96  <Field float frameRate>
		i = i1;
	//   29   55:iload           10
	//   30   57:istore          5
		if(i1 == -1)
	//*  31   59:iload           10
	//*  32   61:iconst_m1       
	//*  33   62:icmpne          68
			i = 0;
	//   34   65:iconst_0        
	//   35   66:istore          5
		rotationDegrees = i;
	//   36   68:aload_0         
	//   37   69:iload           5
	//   38   71:putfield        #98  <Field int rotationDegrees>
		if(f1 == -1F)
	//*  39   74:fload           11
	//*  40   76:ldc1            #173 <Float -1F>
	//*  41   78:fcmpl           
	//*  42   79:ifne            88
			f1 = 1.0F;
	//   43   82:fconst_1        
	//   44   83:fstore          11
	//*  45   85:goto            88
		pixelWidthHeightRatio = f1;
	//   46   88:aload_0         
	//   47   89:fload           11
	//   48   91:putfield        #100 <Field float pixelWidthHeightRatio>
		projectionData = abyte0;
	//   49   94:aload_0         
	//   50   95:aload           12
	//   51   97:putfield        #112 <Field byte[] projectionData>
		stereoMode = j1;
	//   52  100:aload_0         
	//   53  101:iload           13
	//   54  103:putfield        #114 <Field int stereoMode>
		colorInfo = colorinfo;
	//   55  106:aload_0         
	//   56  107:aload           14
	//   57  109:putfield        #128 <Field ColorInfo colorInfo>
		channelCount = k1;
	//   58  112:aload_0         
	//   59  113:iload           15
	//   60  115:putfield        #130 <Field int channelCount>
		sampleRate = l1;
	//   61  118:aload_0         
	//   62  119:iload           16
	//   63  121:putfield        #132 <Field int sampleRate>
		pcmEncoding = i2;
	//   64  124:aload_0         
	//   65  125:iload           17
	//   66  127:putfield        #134 <Field int pcmEncoding>
		i = j2;
	//   67  130:iload           18
	//   68  132:istore          5
		if(j2 == -1)
	//*  69  134:iload           18
	//*  70  136:iconst_m1       
	//*  71  137:icmpne          143
			i = 0;
	//   72  140:iconst_0        
	//   73  141:istore          5
		encoderDelay = i;
	//   74  143:aload_0         
	//   75  144:iload           5
	//   76  146:putfield        #136 <Field int encoderDelay>
		i = k2;
	//   77  149:iload           19
	//   78  151:istore          5
		if(k2 == -1)
	//*  79  153:iload           19
	//*  80  155:iconst_m1       
	//*  81  156:icmpne          162
			i = 0;
	//   82  159:iconst_0        
	//   83  160:istore          5
		encoderPadding = i;
	//   84  162:aload_0         
	//   85  163:iload           5
	//   86  165:putfield        #138 <Field int encoderPadding>
		selectionFlags = l2;
	//   87  168:aload_0         
	//   88  169:iload           20
	//   89  171:putfield        #140 <Field int selectionFlags>
		language = s4;
	//   90  174:aload_0         
	//   91  175:aload           21
	//   92  177:putfield        #142 <Field String language>
		accessibilityChannel = i3;
	//   93  180:aload_0         
	//   94  181:iload           22
	//   95  183:putfield        #144 <Field int accessibilityChannel>
		subsampleOffsetUs = l3;
	//   96  186:aload_0         
	//   97  187:lload           23
	//   98  189:putfield        #150 <Field long subsampleOffsetUs>
		if(list == null)
	//*  99  192:aload           25
	//* 100  194:ifnonnull       205
			list = Collections.emptyList();
	//  101  197:invokestatic    #179 <Method List Collections.emptyList()>
	//  102  200:astore          25
	//* 103  202:goto            205
		initializationData = list;
	//  104  205:aload_0         
	//  105  206:aload           25
	//  106  208:putfield        #157 <Field List initializationData>
		drmInitData = drminitdata;
	//  107  211:aload_0         
	//  108  212:aload           26
	//  109  214:putfield        #167 <Field DrmInitData drmInitData>
		metadata = metadata1;
	//  110  217:aload_0         
	//  111  218:aload           27
	//  112  220:putfield        #171 <Field Metadata metadata>
	//  113  223:return          
	}

	public static Format createAudioContainerFormat(String s, String s1, String s2, String s3, int i, int j, int k, List list, 
			int l, String s4)
	{
		return new Format(s, s1, s2, s3, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), j, k, -1, -1, -1, l, s4, -1, 0xffffffffL, list, ((DrmInitData) (null)), ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #173 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #173 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iload           5
	//   17   23:iload           6
	//   18   25:iconst_m1       
	//   19   26:iconst_m1       
	//   20   27:iconst_m1       
	//   21   28:iload           8
	//   22   30:aload           9
	//   23   32:iconst_m1       
	//   24   33:ldc2w           #17  <Long 0xffffffffL>
	//   25   36:aload           7
	//   26   38:aconst_null     
	//   27   39:aconst_null     
	//   28   40:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   43:areturn         
	}

	public static Format createAudioSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, int i1, 
			int j1, int k1, List list, DrmInitData drminitdata, int l1, String s3, Metadata metadata1)
	{
		return new Format(s, ((String) (null)), s1, s2, i, j, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), k, l, i1, j1, k1, l1, s3, -1, 0xffffffffL, list, drminitdata, metadata1);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #173 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #173 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iload           5
	//   17   23:iload           6
	//   18   25:iload           7
	//   19   27:iload           8
	//   20   29:iload           9
	//   21   31:iload           12
	//   22   33:aload           13
	//   23   35:iconst_m1       
	//   24   36:ldc2w           #17  <Long 0xffffffffL>
	//   25   39:aload           10
	//   26   41:aload           11
	//   27   43:aload           14
	//   28   45:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   48:areturn         
	}

	public static Format createAudioSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, int i1, 
			List list, DrmInitData drminitdata, int j1, String s3)
	{
		return createAudioSampleFormat(s, s1, s2, i, j, k, l, i1, -1, -1, list, drminitdata, j1, s3, ((Metadata) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iconst_m1       
	//    9   13:iconst_m1       
	//   10   14:aload           8
	//   11   16:aload           9
	//   12   18:iload           10
	//   13   20:aload           11
	//   14   22:aconst_null     
	//   15   23:invokestatic    #193 <Method Format createAudioSampleFormat(String, String, String, int, int, int, int, int, int, int, List, DrmInitData, int, String, Metadata)>
	//   16   26:areturn         
	}

	public static Format createAudioSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, List list, 
			DrmInitData drminitdata, int i1, String s3)
	{
		return createAudioSampleFormat(s, s1, s2, i, j, k, l, -1, list, drminitdata, i1, s3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_m1       
	//    8   11:aload           7
	//    9   13:aload           8
	//   10   15:iload           9
	//   11   17:aload           10
	//   12   19:invokestatic    #197 <Method Format createAudioSampleFormat(String, String, String, int, int, int, int, int, List, DrmInitData, int, String)>
	//   13   22:areturn         
	}

	public static Format createContainerFormat(String s, String s1, String s2, String s3, int i, int j, String s4)
	{
		return new Format(s, s1, s2, s3, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, j, s4, -1, 0xffffffffL, ((List) (null)), ((DrmInitData) (null)), ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #173 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #173 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iconst_m1       
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iload           5
	//   22   28:aload           6
	//   23   30:iconst_m1       
	//   24   31:ldc2w           #17  <Long 0xffffffffL>
	//   25   34:aconst_null     
	//   26   35:aconst_null     
	//   27   36:aconst_null     
	//   28   37:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   40:areturn         
	}

	public static Format createImageSampleFormat(String s, String s1, String s2, int i, int j, List list, String s3, DrmInitData drminitdata)
	{
		return new Format(s, ((String) (null)), s1, s2, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, j, s3, -1, 0xffffffffL, list, drminitdata, ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #173 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #173 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iload           4
	//   22   27:aload           6
	//   23   29:iconst_m1       
	//   24   30:ldc2w           #17  <Long 0xffffffffL>
	//   25   33:aload           5
	//   26   35:aload           7
	//   27   37:aconst_null     
	//   28   38:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   41:areturn         
	}

	public static Format createSampleFormat(String s, String s1, long l)
	{
		return new Format(s, ((String) (null)), s1, ((String) (null)), -1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, 0, ((String) (null)), -1, l, ((List) (null)), ((DrmInitData) (null)), ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #173 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #173 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iconst_0        
	//   22   26:aconst_null     
	//   23   27:iconst_m1       
	//   24   28:lload_2         
	//   25   29:aconst_null     
	//   26   30:aconst_null     
	//   27   31:aconst_null     
	//   28   32:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   35:areturn         
	}

	public static Format createSampleFormat(String s, String s1, String s2, int i, DrmInitData drminitdata)
	{
		return new Format(s, ((String) (null)), s1, s2, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, 0, ((String) (null)), -1, 0xffffffffL, ((List) (null)), drminitdata, ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #173 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #173 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iconst_0        
	//   22   26:aconst_null     
	//   23   27:iconst_m1       
	//   24   28:ldc2w           #17  <Long 0xffffffffL>
	//   25   31:aconst_null     
	//   26   32:aload           4
	//   27   34:aconst_null     
	//   28   35:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   38:areturn         
	}

	public static Format createTextContainerFormat(String s, String s1, String s2, String s3, int i, int j, String s4)
	{
		return createTextContainerFormat(s, s1, s2, s3, i, j, s4, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:iconst_m1       
	//    8   11:invokestatic    #210 <Method Format createTextContainerFormat(String, String, String, String, int, int, String, int)>
	//    9   14:areturn         
	}

	public static Format createTextContainerFormat(String s, String s1, String s2, String s3, int i, int j, String s4, int k)
	{
		return new Format(s, s1, s2, s3, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, j, s4, k, 0xffffffffL, ((List) (null)), ((DrmInitData) (null)), ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #173 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #173 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iconst_m1       
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iload           5
	//   22   28:aload           6
	//   23   30:iload           7
	//   24   32:ldc2w           #17  <Long 0xffffffffL>
	//   25   35:aconst_null     
	//   26   36:aconst_null     
	//   27   37:aconst_null     
	//   28   38:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   41:areturn         
	}

	public static Format createTextSampleFormat(String s, String s1, int i, String s2)
	{
		return createTextSampleFormat(s, s1, i, s2, ((DrmInitData) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokestatic    #215 <Method Format createTextSampleFormat(String, String, int, String, DrmInitData)>
	//    6    8:areturn         
	}

	public static Format createTextSampleFormat(String s, String s1, int i, String s2, DrmInitData drminitdata)
	{
		return createTextSampleFormat(s, s1, ((String) (null)), -1, i, s2, -1, drminitdata, 0xffffffffL, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_m1       
	//    4    4:iload_2         
	//    5    5:aload_3         
	//    6    6:iconst_m1       
	//    7    7:aload           4
	//    8    9:ldc2w           #17  <Long 0xffffffffL>
	//    9   12:invokestatic    #179 <Method List Collections.emptyList()>
	//   10   15:invokestatic    #218 <Method Format createTextSampleFormat(String, String, String, int, int, String, int, DrmInitData, long, List)>
	//   11   18:areturn         
	}

	public static Format createTextSampleFormat(String s, String s1, String s2, int i, int j, String s3, int k, DrmInitData drminitdata)
	{
		return createTextSampleFormat(s, s1, s2, i, j, s3, k, drminitdata, 0xffffffffL, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:ldc2w           #17  <Long 0xffffffffL>
	//    9   15:invokestatic    #179 <Method List Collections.emptyList()>
	//   10   18:invokestatic    #218 <Method Format createTextSampleFormat(String, String, String, int, int, String, int, DrmInitData, long, List)>
	//   11   21:areturn         
	}

	public static Format createTextSampleFormat(String s, String s1, String s2, int i, int j, String s3, int k, DrmInitData drminitdata, 
			long l, List list)
	{
		return new Format(s, ((String) (null)), s1, s2, i, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, j, s3, k, l, list, drminitdata, ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #173 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #173 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iload           4
	//   22   27:aload           5
	//   23   29:iload           6
	//   24   31:lload           8
	//   25   33:aload           10
	//   26   35:aload           7
	//   27   37:aconst_null     
	//   28   38:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   41:areturn         
	}

	public static Format createTextSampleFormat(String s, String s1, String s2, int i, int j, String s3, DrmInitData drminitdata, long l)
	{
		return createTextSampleFormat(s, s1, s2, i, j, s3, -1, drminitdata, l, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_m1       
	//    7    9:aload           6
	//    8   11:lload           7
	//    9   13:invokestatic    #179 <Method List Collections.emptyList()>
	//   10   16:invokestatic    #218 <Method Format createTextSampleFormat(String, String, String, int, int, String, int, DrmInitData, long, List)>
	//   11   19:areturn         
	}

	public static Format createVideoContainerFormat(String s, String s1, String s2, String s3, int i, int j, int k, float f, 
			List list, int l)
	{
		return new Format(s, s1, s2, s3, i, -1, j, k, f, -1, -1F, ((byte []) (null)), -1, ((ColorInfo) (null)), -1, -1, -1, -1, -1, l, ((String) (null)), -1, 0xffffffffL, list, ((DrmInitData) (null)), ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iload           5
	//    9   13:iload           6
	//   10   15:fload           7
	//   11   17:iconst_m1       
	//   12   18:ldc1            #173 <Float -1F>
	//   13   20:aconst_null     
	//   14   21:iconst_m1       
	//   15   22:aconst_null     
	//   16   23:iconst_m1       
	//   17   24:iconst_m1       
	//   18   25:iconst_m1       
	//   19   26:iconst_m1       
	//   20   27:iconst_m1       
	//   21   28:iload           9
	//   22   30:aconst_null     
	//   23   31:iconst_m1       
	//   24   32:ldc2w           #17  <Long 0xffffffffL>
	//   25   35:aload           8
	//   26   37:aconst_null     
	//   27   38:aconst_null     
	//   28   39:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   42:areturn         
	}

	public static Format createVideoSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, float f, 
			List list, int i1, float f1, DrmInitData drminitdata)
	{
		return createVideoSampleFormat(s, s1, s2, i, j, k, l, f, list, i1, f1, ((byte []) (null)), -1, ((ColorInfo) (null)), drminitdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:fload           7
	//    8   12:aload           8
	//    9   14:iload           9
	//   10   16:fload           10
	//   11   18:aconst_null     
	//   12   19:iconst_m1       
	//   13   20:aconst_null     
	//   14   21:aload           11
	//   15   23:invokestatic    #229 <Method Format createVideoSampleFormat(String, String, String, int, int, int, int, float, List, int, float, byte[], int, ColorInfo, DrmInitData)>
	//   16   26:areturn         
	}

	public static Format createVideoSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, float f, 
			List list, int i1, float f1, byte abyte0[], int j1, ColorInfo colorinfo, DrmInitData drminitdata)
	{
		return new Format(s, ((String) (null)), s1, s2, i, j, k, l, f, i1, f1, abyte0, j1, colorinfo, -1, -1, -1, -1, -1, 0, ((String) (null)), -1, 0xffffffffL, list, drminitdata, ((Metadata) (null)));
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:iload           5
	//    9   13:iload           6
	//   10   15:fload           7
	//   11   17:iload           9
	//   12   19:fload           10
	//   13   21:aload           11
	//   14   23:iload           12
	//   15   25:aload           13
	//   16   27:iconst_m1       
	//   17   28:iconst_m1       
	//   18   29:iconst_m1       
	//   19   30:iconst_m1       
	//   20   31:iconst_m1       
	//   21   32:iconst_0        
	//   22   33:aconst_null     
	//   23   34:iconst_m1       
	//   24   35:ldc2w           #17  <Long 0xffffffffL>
	//   25   38:aload           8
	//   26   40:aload           14
	//   27   42:aconst_null     
	//   28   43:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   29   46:areturn         
	}

	public static Format createVideoSampleFormat(String s, String s1, String s2, int i, int j, int k, int l, float f, 
			List list, DrmInitData drminitdata)
	{
		return createVideoSampleFormat(s, s1, s2, i, j, k, l, f, list, -1, -1F, drminitdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:fload           7
	//    8   12:aload           8
	//    9   14:iconst_m1       
	//   10   15:ldc1            #173 <Float -1F>
	//   11   17:aload           9
	//   12   19:invokestatic    #234 <Method Format createVideoSampleFormat(String, String, String, int, int, int, int, float, List, int, float, DrmInitData)>
	//   13   22:areturn         
	}

	public static String toLogString(Format format)
	{
		if(format == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "null";
	//    2    4:ldc1            #239 <String "null">
	//    3    6:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #241 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #242 <Method void StringBuilder()>
	//    7   14:astore_1        
		stringbuilder.append("id=");
	//    8   15:aload_1         
	//    9   16:ldc1            #244 <String "id=">
	//   10   18:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(format.id);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #72  <Field String id>
	//   15   27:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(", mimeType=");
	//   17   31:aload_1         
	//   18   32:ldc1            #250 <String ", mimeType=">
	//   19   34:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(format.sampleMimeType);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #76  <Field String sampleMimeType>
	//   24   43:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		if(format.bitrate != -1)
	//*  26   47:aload_0         
	//*  27   48:getfield        #84  <Field int bitrate>
	//*  28   51:iconst_m1       
	//*  29   52:icmpeq          71
		{
			stringbuilder.append(", bitrate=");
	//   30   55:aload_1         
	//   31   56:ldc1            #252 <String ", bitrate=">
	//   32   58:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			stringbuilder.append(format.bitrate);
	//   34   62:aload_1         
	//   35   63:aload_0         
	//   36   64:getfield        #84  <Field int bitrate>
	//   37   67:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   38   70:pop             
		}
		if(format.width != -1 && format.height != -1)
	//*  39   71:aload_0         
	//*  40   72:getfield        #88  <Field int width>
	//*  41   75:iconst_m1       
	//*  42   76:icmpeq          121
	//*  43   79:aload_0         
	//*  44   80:getfield        #90  <Field int height>
	//*  45   83:iconst_m1       
	//*  46   84:icmpeq          121
		{
			stringbuilder.append(", res=");
	//   47   87:aload_1         
	//   48   88:ldc2            #257 <String ", res=">
	//   49   91:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
			stringbuilder.append(format.width);
	//   51   95:aload_1         
	//   52   96:aload_0         
	//   53   97:getfield        #88  <Field int width>
	//   54  100:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   55  103:pop             
			stringbuilder.append("x");
	//   56  104:aload_1         
	//   57  105:ldc2            #259 <String "x">
	//   58  108:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
			stringbuilder.append(format.height);
	//   60  112:aload_1         
	//   61  113:aload_0         
	//   62  114:getfield        #90  <Field int height>
	//   63  117:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   64  120:pop             
		}
		if(format.frameRate != -1F)
	//*  65  121:aload_0         
	//*  66  122:getfield        #96  <Field float frameRate>
	//*  67  125:ldc1            #173 <Float -1F>
	//*  68  127:fcmpl           
	//*  69  128:ifeq            148
		{
			stringbuilder.append(", fps=");
	//   70  131:aload_1         
	//   71  132:ldc2            #261 <String ", fps=">
	//   72  135:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   73  138:pop             
			stringbuilder.append(format.frameRate);
	//   74  139:aload_1         
	//   75  140:aload_0         
	//   76  141:getfield        #96  <Field float frameRate>
	//   77  144:invokevirtual   #264 <Method StringBuilder StringBuilder.append(float)>
	//   78  147:pop             
		}
		if(format.channelCount != -1)
	//*  79  148:aload_0         
	//*  80  149:getfield        #130 <Field int channelCount>
	//*  81  152:iconst_m1       
	//*  82  153:icmpeq          173
		{
			stringbuilder.append(", channels=");
	//   83  156:aload_1         
	//   84  157:ldc2            #266 <String ", channels=">
	//   85  160:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   86  163:pop             
			stringbuilder.append(format.channelCount);
	//   87  164:aload_1         
	//   88  165:aload_0         
	//   89  166:getfield        #130 <Field int channelCount>
	//   90  169:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   91  172:pop             
		}
		if(format.sampleRate != -1)
	//*  92  173:aload_0         
	//*  93  174:getfield        #132 <Field int sampleRate>
	//*  94  177:iconst_m1       
	//*  95  178:icmpeq          198
		{
			stringbuilder.append(", sample_rate=");
	//   96  181:aload_1         
	//   97  182:ldc2            #268 <String ", sample_rate=">
	//   98  185:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   99  188:pop             
			stringbuilder.append(format.sampleRate);
	//  100  189:aload_1         
	//  101  190:aload_0         
	//  102  191:getfield        #132 <Field int sampleRate>
	//  103  194:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//  104  197:pop             
		}
		if(format.language != null)
	//* 105  198:aload_0         
	//* 106  199:getfield        #142 <Field String language>
	//* 107  202:ifnull          222
		{
			stringbuilder.append(", language=");
	//  108  205:aload_1         
	//  109  206:ldc2            #270 <String ", language=">
	//  110  209:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  111  212:pop             
			stringbuilder.append(format.language);
	//  112  213:aload_1         
	//  113  214:aload_0         
	//  114  215:getfield        #142 <Field String language>
	//  115  218:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  116  221:pop             
		}
		return stringbuilder.toString();
	//  117  222:aload_1         
	//  118  223:invokevirtual   #273 <Method String StringBuilder.toString()>
	//  119  226:areturn         
	}

	public Format copyWithContainerInfo(String s, String s1, String s2, int i, int j, int k, int l, 
			String s3)
	{
		return new Format(s, containerMimeType, s1, s2, i, maxInputSize, j, k, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, l, s3, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field String containerMimeType>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:aload_0         
	//    9   14:getfield        #86  <Field int maxInputSize>
	//   10   17:iload           5
	//   11   19:iload           6
	//   12   21:aload_0         
	//   13   22:getfield        #96  <Field float frameRate>
	//   14   25:aload_0         
	//   15   26:getfield        #98  <Field int rotationDegrees>
	//   16   29:aload_0         
	//   17   30:getfield        #100 <Field float pixelWidthHeightRatio>
	//   18   33:aload_0         
	//   19   34:getfield        #112 <Field byte[] projectionData>
	//   20   37:aload_0         
	//   21   38:getfield        #114 <Field int stereoMode>
	//   22   41:aload_0         
	//   23   42:getfield        #128 <Field ColorInfo colorInfo>
	//   24   45:aload_0         
	//   25   46:getfield        #130 <Field int channelCount>
	//   26   49:aload_0         
	//   27   50:getfield        #132 <Field int sampleRate>
	//   28   53:aload_0         
	//   29   54:getfield        #134 <Field int pcmEncoding>
	//   30   57:aload_0         
	//   31   58:getfield        #136 <Field int encoderDelay>
	//   32   61:aload_0         
	//   33   62:getfield        #138 <Field int encoderPadding>
	//   34   65:iload           7
	//   35   67:aload           8
	//   36   69:aload_0         
	//   37   70:getfield        #144 <Field int accessibilityChannel>
	//   38   73:aload_0         
	//   39   74:getfield        #150 <Field long subsampleOffsetUs>
	//   40   77:aload_0         
	//   41   78:getfield        #157 <Field List initializationData>
	//   42   81:aload_0         
	//   43   82:getfield        #167 <Field DrmInitData drmInitData>
	//   44   85:aload_0         
	//   45   86:getfield        #171 <Field Metadata metadata>
	//   46   89:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   47   92:areturn         
	}

	public Format copyWithDrmInitData(DrmInitData drminitdata)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drminitdata, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field int maxInputSize>
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field int width>
	//   16   32:aload_0         
	//   17   33:getfield        #90  <Field int height>
	//   18   36:aload_0         
	//   19   37:getfield        #96  <Field float frameRate>
	//   20   40:aload_0         
	//   21   41:getfield        #98  <Field int rotationDegrees>
	//   22   44:aload_0         
	//   23   45:getfield        #100 <Field float pixelWidthHeightRatio>
	//   24   48:aload_0         
	//   25   49:getfield        #112 <Field byte[] projectionData>
	//   26   52:aload_0         
	//   27   53:getfield        #114 <Field int stereoMode>
	//   28   56:aload_0         
	//   29   57:getfield        #128 <Field ColorInfo colorInfo>
	//   30   60:aload_0         
	//   31   61:getfield        #130 <Field int channelCount>
	//   32   64:aload_0         
	//   33   65:getfield        #132 <Field int sampleRate>
	//   34   68:aload_0         
	//   35   69:getfield        #134 <Field int pcmEncoding>
	//   36   72:aload_0         
	//   37   73:getfield        #136 <Field int encoderDelay>
	//   38   76:aload_0         
	//   39   77:getfield        #138 <Field int encoderPadding>
	//   40   80:aload_0         
	//   41   81:getfield        #140 <Field int selectionFlags>
	//   42   84:aload_0         
	//   43   85:getfield        #142 <Field String language>
	//   44   88:aload_0         
	//   45   89:getfield        #144 <Field int accessibilityChannel>
	//   46   92:aload_0         
	//   47   93:getfield        #150 <Field long subsampleOffsetUs>
	//   48   96:aload_0         
	//   49   97:getfield        #157 <Field List initializationData>
	//   50  100:aload_1         
	//   51  101:aload_0         
	//   52  102:getfield        #171 <Field Metadata metadata>
	//   53  105:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   54  108:areturn         
	}

	public Format copyWithGaplessInfo(int i, int j)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, i, j, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field int maxInputSize>
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field int width>
	//   16   32:aload_0         
	//   17   33:getfield        #90  <Field int height>
	//   18   36:aload_0         
	//   19   37:getfield        #96  <Field float frameRate>
	//   20   40:aload_0         
	//   21   41:getfield        #98  <Field int rotationDegrees>
	//   22   44:aload_0         
	//   23   45:getfield        #100 <Field float pixelWidthHeightRatio>
	//   24   48:aload_0         
	//   25   49:getfield        #112 <Field byte[] projectionData>
	//   26   52:aload_0         
	//   27   53:getfield        #114 <Field int stereoMode>
	//   28   56:aload_0         
	//   29   57:getfield        #128 <Field ColorInfo colorInfo>
	//   30   60:aload_0         
	//   31   61:getfield        #130 <Field int channelCount>
	//   32   64:aload_0         
	//   33   65:getfield        #132 <Field int sampleRate>
	//   34   68:aload_0         
	//   35   69:getfield        #134 <Field int pcmEncoding>
	//   36   72:iload_1         
	//   37   73:iload_2         
	//   38   74:aload_0         
	//   39   75:getfield        #140 <Field int selectionFlags>
	//   40   78:aload_0         
	//   41   79:getfield        #142 <Field String language>
	//   42   82:aload_0         
	//   43   83:getfield        #144 <Field int accessibilityChannel>
	//   44   86:aload_0         
	//   45   87:getfield        #150 <Field long subsampleOffsetUs>
	//   46   90:aload_0         
	//   47   91:getfield        #157 <Field List initializationData>
	//   48   94:aload_0         
	//   49   95:getfield        #167 <Field DrmInitData drmInitData>
	//   50   98:aload_0         
	//   51   99:getfield        #171 <Field Metadata metadata>
	//   52  102:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   53  105:areturn         
	}

	public Format copyWithManifestFormatInfo(Format format)
	{
		if(this == format)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		String s2 = format.id;
	//    5    7:aload_1         
	//    6    8:getfield        #72  <Field String id>
	//    7   11:astore          8
		String s;
		if(codecs == null)
	//*   8   13:aload_0         
	//*   9   14:getfield        #78  <Field String codecs>
	//*  10   17:ifnonnull       29
			s = format.codecs;
	//   11   20:aload_1         
	//   12   21:getfield        #78  <Field String codecs>
	//   13   24:astore          6
		else
	//*  14   26:goto            38
			s = codecs;
	//   15   29:aload_0         
	//   16   30:getfield        #78  <Field String codecs>
	//   17   33:astore          6
	//*  18   35:goto            26
		int i;
		if(bitrate == -1)
	//*  19   38:aload_0         
	//*  20   39:getfield        #84  <Field int bitrate>
	//*  21   42:iconst_m1       
	//*  22   43:icmpne          54
			i = format.bitrate;
	//   23   46:aload_1         
	//   24   47:getfield        #84  <Field int bitrate>
	//   25   50:istore_3        
		else
	//*  26   51:goto            62
			i = bitrate;
	//   27   54:aload_0         
	//   28   55:getfield        #84  <Field int bitrate>
	//   29   58:istore_3        
	//*  30   59:goto            51
		float f;
		if(frameRate == -1F)
	//*  31   62:aload_0         
	//*  32   63:getfield        #96  <Field float frameRate>
	//*  33   66:ldc1            #173 <Float -1F>
	//*  34   68:fcmpl           
	//*  35   69:ifne            80
			f = format.frameRate;
	//   36   72:aload_1         
	//   37   73:getfield        #96  <Field float frameRate>
	//   38   76:fstore_2        
		else
	//*  39   77:goto            88
			f = frameRate;
	//   40   80:aload_0         
	//   41   81:getfield        #96  <Field float frameRate>
	//   42   84:fstore_2        
	//*  43   85:goto            77
		int j = selectionFlags;
	//   44   88:aload_0         
	//   45   89:getfield        #140 <Field int selectionFlags>
	//   46   92:istore          4
		int k = format.selectionFlags;
	//   47   94:aload_1         
	//   48   95:getfield        #140 <Field int selectionFlags>
	//   49   98:istore          5
		String s1;
		if(language == null)
	//*  50  100:aload_0         
	//*  51  101:getfield        #142 <Field String language>
	//*  52  104:ifnonnull       116
			s1 = format.language;
	//   53  107:aload_1         
	//   54  108:getfield        #142 <Field String language>
	//   55  111:astore          7
		else
	//*  56  113:goto            125
			s1 = language;
	//   57  116:aload_0         
	//   58  117:getfield        #142 <Field String language>
	//   59  120:astore          7
	//*  60  122:goto            113
		format = ((Format) (DrmInitData.createSessionCreationData(format.drmInitData, drmInitData)));
	//   61  125:aload_1         
	//   62  126:getfield        #167 <Field DrmInitData drmInitData>
	//   63  129:aload_0         
	//   64  130:getfield        #167 <Field DrmInitData drmInitData>
	//   65  133:invokestatic    #285 <Method DrmInitData DrmInitData.createSessionCreationData(DrmInitData, DrmInitData)>
	//   66  136:astore_1        
		return new Format(s2, containerMimeType, sampleMimeType, s, i, maxInputSize, width, height, f, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, j | k, s1, accessibilityChannel, subsampleOffsetUs, initializationData, ((DrmInitData) (format)), metadata);
	//   67  137:new             #2   <Class Format>
	//   68  140:dup             
	//   69  141:aload           8
	//   70  143:aload_0         
	//   71  144:getfield        #74  <Field String containerMimeType>
	//   72  147:aload_0         
	//   73  148:getfield        #76  <Field String sampleMimeType>
	//   74  151:aload           6
	//   75  153:iload_3         
	//   76  154:aload_0         
	//   77  155:getfield        #86  <Field int maxInputSize>
	//   78  158:aload_0         
	//   79  159:getfield        #88  <Field int width>
	//   80  162:aload_0         
	//   81  163:getfield        #90  <Field int height>
	//   82  166:fload_2         
	//   83  167:aload_0         
	//   84  168:getfield        #98  <Field int rotationDegrees>
	//   85  171:aload_0         
	//   86  172:getfield        #100 <Field float pixelWidthHeightRatio>
	//   87  175:aload_0         
	//   88  176:getfield        #112 <Field byte[] projectionData>
	//   89  179:aload_0         
	//   90  180:getfield        #114 <Field int stereoMode>
	//   91  183:aload_0         
	//   92  184:getfield        #128 <Field ColorInfo colorInfo>
	//   93  187:aload_0         
	//   94  188:getfield        #130 <Field int channelCount>
	//   95  191:aload_0         
	//   96  192:getfield        #132 <Field int sampleRate>
	//   97  195:aload_0         
	//   98  196:getfield        #134 <Field int pcmEncoding>
	//   99  199:aload_0         
	//  100  200:getfield        #136 <Field int encoderDelay>
	//  101  203:aload_0         
	//  102  204:getfield        #138 <Field int encoderPadding>
	//  103  207:iload           4
	//  104  209:iload           5
	//  105  211:ior             
	//  106  212:aload           7
	//  107  214:aload_0         
	//  108  215:getfield        #144 <Field int accessibilityChannel>
	//  109  218:aload_0         
	//  110  219:getfield        #150 <Field long subsampleOffsetUs>
	//  111  222:aload_0         
	//  112  223:getfield        #157 <Field List initializationData>
	//  113  226:aload_1         
	//  114  227:aload_0         
	//  115  228:getfield        #171 <Field Metadata metadata>
	//  116  231:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//  117  234:areturn         
	}

	public Format copyWithMaxInputSize(int i)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, i, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:iload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field int width>
	//   15   29:aload_0         
	//   16   30:getfield        #90  <Field int height>
	//   17   33:aload_0         
	//   18   34:getfield        #96  <Field float frameRate>
	//   19   37:aload_0         
	//   20   38:getfield        #98  <Field int rotationDegrees>
	//   21   41:aload_0         
	//   22   42:getfield        #100 <Field float pixelWidthHeightRatio>
	//   23   45:aload_0         
	//   24   46:getfield        #112 <Field byte[] projectionData>
	//   25   49:aload_0         
	//   26   50:getfield        #114 <Field int stereoMode>
	//   27   53:aload_0         
	//   28   54:getfield        #128 <Field ColorInfo colorInfo>
	//   29   57:aload_0         
	//   30   58:getfield        #130 <Field int channelCount>
	//   31   61:aload_0         
	//   32   62:getfield        #132 <Field int sampleRate>
	//   33   65:aload_0         
	//   34   66:getfield        #134 <Field int pcmEncoding>
	//   35   69:aload_0         
	//   36   70:getfield        #136 <Field int encoderDelay>
	//   37   73:aload_0         
	//   38   74:getfield        #138 <Field int encoderPadding>
	//   39   77:aload_0         
	//   40   78:getfield        #140 <Field int selectionFlags>
	//   41   81:aload_0         
	//   42   82:getfield        #142 <Field String language>
	//   43   85:aload_0         
	//   44   86:getfield        #144 <Field int accessibilityChannel>
	//   45   89:aload_0         
	//   46   90:getfield        #150 <Field long subsampleOffsetUs>
	//   47   93:aload_0         
	//   48   94:getfield        #157 <Field List initializationData>
	//   49   97:aload_0         
	//   50   98:getfield        #167 <Field DrmInitData drmInitData>
	//   51  101:aload_0         
	//   52  102:getfield        #171 <Field Metadata metadata>
	//   53  105:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   54  108:areturn         
	}

	public Format copyWithMetadata(Metadata metadata1)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata1);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field int maxInputSize>
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field int width>
	//   16   32:aload_0         
	//   17   33:getfield        #90  <Field int height>
	//   18   36:aload_0         
	//   19   37:getfield        #96  <Field float frameRate>
	//   20   40:aload_0         
	//   21   41:getfield        #98  <Field int rotationDegrees>
	//   22   44:aload_0         
	//   23   45:getfield        #100 <Field float pixelWidthHeightRatio>
	//   24   48:aload_0         
	//   25   49:getfield        #112 <Field byte[] projectionData>
	//   26   52:aload_0         
	//   27   53:getfield        #114 <Field int stereoMode>
	//   28   56:aload_0         
	//   29   57:getfield        #128 <Field ColorInfo colorInfo>
	//   30   60:aload_0         
	//   31   61:getfield        #130 <Field int channelCount>
	//   32   64:aload_0         
	//   33   65:getfield        #132 <Field int sampleRate>
	//   34   68:aload_0         
	//   35   69:getfield        #134 <Field int pcmEncoding>
	//   36   72:aload_0         
	//   37   73:getfield        #136 <Field int encoderDelay>
	//   38   76:aload_0         
	//   39   77:getfield        #138 <Field int encoderPadding>
	//   40   80:aload_0         
	//   41   81:getfield        #140 <Field int selectionFlags>
	//   42   84:aload_0         
	//   43   85:getfield        #142 <Field String language>
	//   44   88:aload_0         
	//   45   89:getfield        #144 <Field int accessibilityChannel>
	//   46   92:aload_0         
	//   47   93:getfield        #150 <Field long subsampleOffsetUs>
	//   48   96:aload_0         
	//   49   97:getfield        #157 <Field List initializationData>
	//   50  100:aload_0         
	//   51  101:getfield        #167 <Field DrmInitData drmInitData>
	//   52  104:aload_1         
	//   53  105:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   54  108:areturn         
	}

	public Format copyWithRotationDegrees(int i)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, i, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field int maxInputSize>
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field int width>
	//   16   32:aload_0         
	//   17   33:getfield        #90  <Field int height>
	//   18   36:aload_0         
	//   19   37:getfield        #96  <Field float frameRate>
	//   20   40:iload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #100 <Field float pixelWidthHeightRatio>
	//   23   45:aload_0         
	//   24   46:getfield        #112 <Field byte[] projectionData>
	//   25   49:aload_0         
	//   26   50:getfield        #114 <Field int stereoMode>
	//   27   53:aload_0         
	//   28   54:getfield        #128 <Field ColorInfo colorInfo>
	//   29   57:aload_0         
	//   30   58:getfield        #130 <Field int channelCount>
	//   31   61:aload_0         
	//   32   62:getfield        #132 <Field int sampleRate>
	//   33   65:aload_0         
	//   34   66:getfield        #134 <Field int pcmEncoding>
	//   35   69:aload_0         
	//   36   70:getfield        #136 <Field int encoderDelay>
	//   37   73:aload_0         
	//   38   74:getfield        #138 <Field int encoderPadding>
	//   39   77:aload_0         
	//   40   78:getfield        #140 <Field int selectionFlags>
	//   41   81:aload_0         
	//   42   82:getfield        #142 <Field String language>
	//   43   85:aload_0         
	//   44   86:getfield        #144 <Field int accessibilityChannel>
	//   45   89:aload_0         
	//   46   90:getfield        #150 <Field long subsampleOffsetUs>
	//   47   93:aload_0         
	//   48   94:getfield        #157 <Field List initializationData>
	//   49   97:aload_0         
	//   50   98:getfield        #167 <Field DrmInitData drmInitData>
	//   51  101:aload_0         
	//   52  102:getfield        #171 <Field Metadata metadata>
	//   53  105:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   54  108:areturn         
	}

	public Format copyWithSubsampleOffsetUs(long l)
	{
		return new Format(id, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, l, initializationData, drmInitData, metadata);
	//    0    0:new             #2   <Class Format>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field String id>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String containerMimeType>
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field String sampleMimeType>
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field String codecs>
	//   10   20:aload_0         
	//   11   21:getfield        #84  <Field int bitrate>
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field int maxInputSize>
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field int width>
	//   16   32:aload_0         
	//   17   33:getfield        #90  <Field int height>
	//   18   36:aload_0         
	//   19   37:getfield        #96  <Field float frameRate>
	//   20   40:aload_0         
	//   21   41:getfield        #98  <Field int rotationDegrees>
	//   22   44:aload_0         
	//   23   45:getfield        #100 <Field float pixelWidthHeightRatio>
	//   24   48:aload_0         
	//   25   49:getfield        #112 <Field byte[] projectionData>
	//   26   52:aload_0         
	//   27   53:getfield        #114 <Field int stereoMode>
	//   28   56:aload_0         
	//   29   57:getfield        #128 <Field ColorInfo colorInfo>
	//   30   60:aload_0         
	//   31   61:getfield        #130 <Field int channelCount>
	//   32   64:aload_0         
	//   33   65:getfield        #132 <Field int sampleRate>
	//   34   68:aload_0         
	//   35   69:getfield        #134 <Field int pcmEncoding>
	//   36   72:aload_0         
	//   37   73:getfield        #136 <Field int encoderDelay>
	//   38   76:aload_0         
	//   39   77:getfield        #138 <Field int encoderPadding>
	//   40   80:aload_0         
	//   41   81:getfield        #140 <Field int selectionFlags>
	//   42   84:aload_0         
	//   43   85:getfield        #142 <Field String language>
	//   44   88:aload_0         
	//   45   89:getfield        #144 <Field int accessibilityChannel>
	//   46   92:lload_1         
	//   47   93:aload_0         
	//   48   94:getfield        #157 <Field List initializationData>
	//   49   97:aload_0         
	//   50   98:getfield        #167 <Field DrmInitData drmInitData>
	//   51  101:aload_0         
	//   52  102:getfield        #171 <Field Metadata metadata>
	//   53  105:invokespecial   #186 <Method void Format(String, String, String, String, int, int, int, int, float, int, float, byte[], int, ColorInfo, int, int, int, int, int, int, String, int, long, List, DrmInitData, Metadata)>
	//   54  108:areturn         
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
	//*   6    8:ifnull          346
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #298 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #298 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Format)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Format>
	//   16   28:astore_1        
			return bitrate == ((Format) (obj)).bitrate && maxInputSize == ((Format) (obj)).maxInputSize && width == ((Format) (obj)).width && height == ((Format) (obj)).height && frameRate == ((Format) (obj)).frameRate && rotationDegrees == ((Format) (obj)).rotationDegrees && pixelWidthHeightRatio == ((Format) (obj)).pixelWidthHeightRatio && stereoMode == ((Format) (obj)).stereoMode && channelCount == ((Format) (obj)).channelCount && sampleRate == ((Format) (obj)).sampleRate && pcmEncoding == ((Format) (obj)).pcmEncoding && encoderDelay == ((Format) (obj)).encoderDelay && encoderPadding == ((Format) (obj)).encoderPadding && subsampleOffsetUs == ((Format) (obj)).subsampleOffsetUs && selectionFlags == ((Format) (obj)).selectionFlags && Util.areEqual(((Object) (id)), ((Object) (((Format) (obj)).id))) && Util.areEqual(((Object) (language)), ((Object) (((Format) (obj)).language))) && accessibilityChannel == ((Format) (obj)).accessibilityChannel && Util.areEqual(((Object) (containerMimeType)), ((Object) (((Format) (obj)).containerMimeType))) && Util.areEqual(((Object) (sampleMimeType)), ((Object) (((Format) (obj)).sampleMimeType))) && Util.areEqual(((Object) (codecs)), ((Object) (((Format) (obj)).codecs))) && Util.areEqual(((Object) (drmInitData)), ((Object) (((Format) (obj)).drmInitData))) && Util.areEqual(((Object) (metadata)), ((Object) (((Format) (obj)).metadata))) && Util.areEqual(((Object) (colorInfo)), ((Object) (((Format) (obj)).colorInfo))) && Arrays.equals(projectionData, ((Format) (obj)).projectionData) && initializationDataEquals(((Format) (obj)));
	//   17   29:aload_0         
	//   18   30:getfield        #84  <Field int bitrate>
	//   19   33:aload_1         
	//   20   34:getfield        #84  <Field int bitrate>
	//   21   37:icmpne          344
	//   22   40:aload_0         
	//   23   41:getfield        #86  <Field int maxInputSize>
	//   24   44:aload_1         
	//   25   45:getfield        #86  <Field int maxInputSize>
	//   26   48:icmpne          344
	//   27   51:aload_0         
	//   28   52:getfield        #88  <Field int width>
	//   29   55:aload_1         
	//   30   56:getfield        #88  <Field int width>
	//   31   59:icmpne          344
	//   32   62:aload_0         
	//   33   63:getfield        #90  <Field int height>
	//   34   66:aload_1         
	//   35   67:getfield        #90  <Field int height>
	//   36   70:icmpne          344
	//   37   73:aload_0         
	//   38   74:getfield        #96  <Field float frameRate>
	//   39   77:aload_1         
	//   40   78:getfield        #96  <Field float frameRate>
	//   41   81:fcmpl           
	//   42   82:ifne            344
	//   43   85:aload_0         
	//   44   86:getfield        #98  <Field int rotationDegrees>
	//   45   89:aload_1         
	//   46   90:getfield        #98  <Field int rotationDegrees>
	//   47   93:icmpne          344
	//   48   96:aload_0         
	//   49   97:getfield        #100 <Field float pixelWidthHeightRatio>
	//   50  100:aload_1         
	//   51  101:getfield        #100 <Field float pixelWidthHeightRatio>
	//   52  104:fcmpl           
	//   53  105:ifne            344
	//   54  108:aload_0         
	//   55  109:getfield        #114 <Field int stereoMode>
	//   56  112:aload_1         
	//   57  113:getfield        #114 <Field int stereoMode>
	//   58  116:icmpne          344
	//   59  119:aload_0         
	//   60  120:getfield        #130 <Field int channelCount>
	//   61  123:aload_1         
	//   62  124:getfield        #130 <Field int channelCount>
	//   63  127:icmpne          344
	//   64  130:aload_0         
	//   65  131:getfield        #132 <Field int sampleRate>
	//   66  134:aload_1         
	//   67  135:getfield        #132 <Field int sampleRate>
	//   68  138:icmpne          344
	//   69  141:aload_0         
	//   70  142:getfield        #134 <Field int pcmEncoding>
	//   71  145:aload_1         
	//   72  146:getfield        #134 <Field int pcmEncoding>
	//   73  149:icmpne          344
	//   74  152:aload_0         
	//   75  153:getfield        #136 <Field int encoderDelay>
	//   76  156:aload_1         
	//   77  157:getfield        #136 <Field int encoderDelay>
	//   78  160:icmpne          344
	//   79  163:aload_0         
	//   80  164:getfield        #138 <Field int encoderPadding>
	//   81  167:aload_1         
	//   82  168:getfield        #138 <Field int encoderPadding>
	//   83  171:icmpne          344
	//   84  174:aload_0         
	//   85  175:getfield        #150 <Field long subsampleOffsetUs>
	//   86  178:aload_1         
	//   87  179:getfield        #150 <Field long subsampleOffsetUs>
	//   88  182:lcmp            
	//   89  183:ifne            344
	//   90  186:aload_0         
	//   91  187:getfield        #140 <Field int selectionFlags>
	//   92  190:aload_1         
	//   93  191:getfield        #140 <Field int selectionFlags>
	//   94  194:icmpne          344
	//   95  197:aload_0         
	//   96  198:getfield        #72  <Field String id>
	//   97  201:aload_1         
	//   98  202:getfield        #72  <Field String id>
	//   99  205:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  100  208:ifeq            344
	//  101  211:aload_0         
	//  102  212:getfield        #142 <Field String language>
	//  103  215:aload_1         
	//  104  216:getfield        #142 <Field String language>
	//  105  219:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  106  222:ifeq            344
	//  107  225:aload_0         
	//  108  226:getfield        #144 <Field int accessibilityChannel>
	//  109  229:aload_1         
	//  110  230:getfield        #144 <Field int accessibilityChannel>
	//  111  233:icmpne          344
	//  112  236:aload_0         
	//  113  237:getfield        #74  <Field String containerMimeType>
	//  114  240:aload_1         
	//  115  241:getfield        #74  <Field String containerMimeType>
	//  116  244:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  117  247:ifeq            344
	//  118  250:aload_0         
	//  119  251:getfield        #76  <Field String sampleMimeType>
	//  120  254:aload_1         
	//  121  255:getfield        #76  <Field String sampleMimeType>
	//  122  258:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  123  261:ifeq            344
	//  124  264:aload_0         
	//  125  265:getfield        #78  <Field String codecs>
	//  126  268:aload_1         
	//  127  269:getfield        #78  <Field String codecs>
	//  128  272:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  129  275:ifeq            344
	//  130  278:aload_0         
	//  131  279:getfield        #167 <Field DrmInitData drmInitData>
	//  132  282:aload_1         
	//  133  283:getfield        #167 <Field DrmInitData drmInitData>
	//  134  286:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  135  289:ifeq            344
	//  136  292:aload_0         
	//  137  293:getfield        #171 <Field Metadata metadata>
	//  138  296:aload_1         
	//  139  297:getfield        #171 <Field Metadata metadata>
	//  140  300:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  141  303:ifeq            344
	//  142  306:aload_0         
	//  143  307:getfield        #128 <Field ColorInfo colorInfo>
	//  144  310:aload_1         
	//  145  311:getfield        #128 <Field ColorInfo colorInfo>
	//  146  314:invokestatic    #302 <Method boolean Util.areEqual(Object, Object)>
	//  147  317:ifeq            344
	//  148  320:aload_0         
	//  149  321:getfield        #112 <Field byte[] projectionData>
	//  150  324:aload_1         
	//  151  325:getfield        #112 <Field byte[] projectionData>
	//  152  328:invokestatic    #307 <Method boolean Arrays.equals(byte[], byte[])>
	//  153  331:ifeq            344
	//  154  334:aload_0         
	//  155  335:aload_1         
	//  156  336:invokevirtual   #311 <Method boolean initializationDataEquals(Format)>
	//  157  339:ifeq            344
	//  158  342:iconst_1        
	//  159  343:ireturn         
	//  160  344:iconst_0        
	//  161  345:ireturn         
		} else
		{
			return false;
	//  162  346:iconst_0        
	//  163  347:ireturn         
		}
	}

	public int getPixelCount()
	{
		int j = width;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int width>
	//    2    4:istore_2        
		int i = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_1        
		if(j != -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          34
		{
			if(height == -1)
	//*   8   12:aload_0         
	//*   9   13:getfield        #90  <Field int height>
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          22
				return -1;
	//   12   20:iconst_m1       
	//   13   21:ireturn         
			i = width;
	//   14   22:aload_0         
	//   15   23:getfield        #88  <Field int width>
	//   16   26:istore_1        
			i = height * i;
	//   17   27:aload_0         
	//   18   28:getfield        #90  <Field int height>
	//   19   31:iload_1         
	//   20   32:imul            
	//   21   33:istore_1        
		}
		return i;
	//   22   34:iload_1         
	//   23   35:ireturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #314 <Field int hashCode>
	//*   2    4:ifne            274
		{
			String s = id;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field String id>
	//    5   11:astore          14
			int k1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          7
			int i;
			if(s == null)
	//*   8   16:aload           14
	//*   9   18:ifnonnull       26
				i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
			else
	//*  12   23:goto            34
				i = id.hashCode();
	//   13   26:aload_0         
	//   14   27:getfield        #72  <Field String id>
	//   15   30:invokevirtual   #318 <Method int String.hashCode()>
	//   16   33:istore_1        
			int j;
			if(containerMimeType == null)
	//*  17   34:aload_0         
	//*  18   35:getfield        #74  <Field String containerMimeType>
	//*  19   38:ifnonnull       46
				j = 0;
	//   20   41:iconst_0        
	//   21   42:istore_2        
			else
	//*  22   43:goto            54
				j = containerMimeType.hashCode();
	//   23   46:aload_0         
	//   24   47:getfield        #74  <Field String containerMimeType>
	//   25   50:invokevirtual   #318 <Method int String.hashCode()>
	//   26   53:istore_2        
			int k;
			if(sampleMimeType == null)
	//*  27   54:aload_0         
	//*  28   55:getfield        #76  <Field String sampleMimeType>
	//*  29   58:ifnonnull       66
				k = 0;
	//   30   61:iconst_0        
	//   31   62:istore_3        
			else
	//*  32   63:goto            74
				k = sampleMimeType.hashCode();
	//   33   66:aload_0         
	//   34   67:getfield        #76  <Field String sampleMimeType>
	//   35   70:invokevirtual   #318 <Method int String.hashCode()>
	//   36   73:istore_3        
			int l;
			if(codecs == null)
	//*  37   74:aload_0         
	//*  38   75:getfield        #78  <Field String codecs>
	//*  39   78:ifnonnull       87
				l = 0;
	//   40   81:iconst_0        
	//   41   82:istore          4
			else
	//*  42   84:goto            96
				l = codecs.hashCode();
	//   43   87:aload_0         
	//   44   88:getfield        #78  <Field String codecs>
	//   45   91:invokevirtual   #318 <Method int String.hashCode()>
	//   46   94:istore          4
			int l1 = bitrate;
	//   47   96:aload_0         
	//   48   97:getfield        #84  <Field int bitrate>
	//   49  100:istore          8
			int i2 = width;
	//   50  102:aload_0         
	//   51  103:getfield        #88  <Field int width>
	//   52  106:istore          9
			int j2 = height;
	//   53  108:aload_0         
	//   54  109:getfield        #90  <Field int height>
	//   55  112:istore          10
			int k2 = channelCount;
	//   56  114:aload_0         
	//   57  115:getfield        #130 <Field int channelCount>
	//   58  118:istore          11
			int l2 = sampleRate;
	//   59  120:aload_0         
	//   60  121:getfield        #132 <Field int sampleRate>
	//   61  124:istore          12
			int i1;
			if(language == null)
	//*  62  126:aload_0         
	//*  63  127:getfield        #142 <Field String language>
	//*  64  130:ifnonnull       139
				i1 = 0;
	//   65  133:iconst_0        
	//   66  134:istore          5
			else
	//*  67  136:goto            148
				i1 = language.hashCode();
	//   68  139:aload_0         
	//   69  140:getfield        #142 <Field String language>
	//   70  143:invokevirtual   #318 <Method int String.hashCode()>
	//   71  146:istore          5
			int i3 = accessibilityChannel;
	//   72  148:aload_0         
	//   73  149:getfield        #144 <Field int accessibilityChannel>
	//   74  152:istore          13
			int j1;
			if(drmInitData == null)
	//*  75  154:aload_0         
	//*  76  155:getfield        #167 <Field DrmInitData drmInitData>
	//*  77  158:ifnonnull       167
				j1 = 0;
	//   78  161:iconst_0        
	//   79  162:istore          6
			else
	//*  80  164:goto            176
				j1 = drmInitData.hashCode();
	//   81  167:aload_0         
	//   82  168:getfield        #167 <Field DrmInitData drmInitData>
	//   83  171:invokevirtual   #319 <Method int DrmInitData.hashCode()>
	//   84  174:istore          6
			if(metadata != null)
	//*  85  176:aload_0         
	//*  86  177:getfield        #171 <Field Metadata metadata>
	//*  87  180:ifnonnull       186
	//*  88  183:goto            195
				k1 = metadata.hashCode();
	//   89  186:aload_0         
	//   90  187:getfield        #171 <Field Metadata metadata>
	//   91  190:invokevirtual   #320 <Method int Metadata.hashCode()>
	//   92  193:istore          7
			hashCode = 31 * ((((((((((((527 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i1) * 31 + i3) * 31 + j1) + k1;
	//   93  195:aload_0         
	//   94  196:bipush          31
	//   95  198:sipush          527
	//   96  201:iload_1         
	//   97  202:iadd            
	//   98  203:bipush          31
	//   99  205:imul            
	//  100  206:iload_2         
	//  101  207:iadd            
	//  102  208:bipush          31
	//  103  210:imul            
	//  104  211:iload_3         
	//  105  212:iadd            
	//  106  213:bipush          31
	//  107  215:imul            
	//  108  216:iload           4
	//  109  218:iadd            
	//  110  219:bipush          31
	//  111  221:imul            
	//  112  222:iload           8
	//  113  224:iadd            
	//  114  225:bipush          31
	//  115  227:imul            
	//  116  228:iload           9
	//  117  230:iadd            
	//  118  231:bipush          31
	//  119  233:imul            
	//  120  234:iload           10
	//  121  236:iadd            
	//  122  237:bipush          31
	//  123  239:imul            
	//  124  240:iload           11
	//  125  242:iadd            
	//  126  243:bipush          31
	//  127  245:imul            
	//  128  246:iload           12
	//  129  248:iadd            
	//  130  249:bipush          31
	//  131  251:imul            
	//  132  252:iload           5
	//  133  254:iadd            
	//  134  255:bipush          31
	//  135  257:imul            
	//  136  258:iload           13
	//  137  260:iadd            
	//  138  261:bipush          31
	//  139  263:imul            
	//  140  264:iload           6
	//  141  266:iadd            
	//  142  267:imul            
	//  143  268:iload           7
	//  144  270:iadd            
	//  145  271:putfield        #314 <Field int hashCode>
		}
		return hashCode;
	//  146  274:aload_0         
	//  147  275:getfield        #314 <Field int hashCode>
	//  148  278:ireturn         
	}

	public boolean initializationDataEquals(Format format)
	{
		if(initializationData.size() != format.initializationData.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field List initializationData>
	//*   2    4:invokeinterface #323 <Method int List.size()>
	//*   3    9:aload_1         
	//*   4   10:getfield        #157 <Field List initializationData>
	//*   5   13:invokeinterface #323 <Method int List.size()>
	//*   6   18:icmpeq          23
			return false;
	//    7   21:iconst_0        
	//    8   22:ireturn         
		for(int i = 0; i < initializationData.size(); i++)
	//*   9   23:iconst_0        
	//*  10   24:istore_2        
	//*  11   25:iload_2         
	//*  12   26:aload_0         
	//*  13   27:getfield        #157 <Field List initializationData>
	//*  14   30:invokeinterface #323 <Method int List.size()>
	//*  15   35:icmpge          79
			if(!Arrays.equals((byte[])initializationData.get(i), (byte[])format.initializationData.get(i)))
	//*  16   38:aload_0         
	//*  17   39:getfield        #157 <Field List initializationData>
	//*  18   42:iload_2         
	//*  19   43:invokeinterface #327 <Method Object List.get(int)>
	//*  20   48:checkcast       #328 <Class byte[]>
	//*  21   51:aload_1         
	//*  22   52:getfield        #157 <Field List initializationData>
	//*  23   55:iload_2         
	//*  24   56:invokeinterface #327 <Method Object List.get(int)>
	//*  25   61:checkcast       #328 <Class byte[]>
	//*  26   64:invokestatic    #307 <Method boolean Arrays.equals(byte[], byte[])>
	//*  27   67:ifne            72
				return false;
	//   28   70:iconst_0        
	//   29   71:ireturn         

	//   30   72:iload_2         
	//   31   73:iconst_1        
	//   32   74:iadd            
	//   33   75:istore_2        
	//*  34   76:goto            25
		return true;
	//   35   79:iconst_1        
	//   36   80:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #241 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #242 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Format(");
	//    4    8:aload_1         
	//    5    9:ldc2            #330 <String "Format(">
	//    6   12:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(id);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field String id>
	//   11   21:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", ");
	//   13   25:aload_1         
	//   14   26:ldc2            #332 <String ", ">
	//   15   29:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(containerMimeType);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #74  <Field String containerMimeType>
	//   20   38:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(", ");
	//   22   42:aload_1         
	//   23   43:ldc2            #332 <String ", ">
	//   24   46:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(sampleMimeType);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #76  <Field String sampleMimeType>
	//   29   55:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		stringbuilder.append(", ");
	//   31   59:aload_1         
	//   32   60:ldc2            #332 <String ", ">
	//   33   63:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(bitrate);
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #84  <Field int bitrate>
	//   38   72:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   39   75:pop             
		stringbuilder.append(", ");
	//   40   76:aload_1         
	//   41   77:ldc2            #332 <String ", ">
	//   42   80:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(language);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #142 <Field String language>
	//   47   89:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		stringbuilder.append(", [");
	//   49   93:aload_1         
	//   50   94:ldc2            #334 <String ", [">
	//   51   97:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(width);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #88  <Field int width>
	//   56  106:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   57  109:pop             
		stringbuilder.append(", ");
	//   58  110:aload_1         
	//   59  111:ldc2            #332 <String ", ">
	//   60  114:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(height);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #90  <Field int height>
	//   65  123:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   66  126:pop             
		stringbuilder.append(", ");
	//   67  127:aload_1         
	//   68  128:ldc2            #332 <String ", ">
	//   69  131:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(frameRate);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #96  <Field float frameRate>
	//   74  140:invokevirtual   #264 <Method StringBuilder StringBuilder.append(float)>
	//   75  143:pop             
		stringbuilder.append("], [");
	//   76  144:aload_1         
	//   77  145:ldc2            #336 <String "], [">
	//   78  148:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(channelCount);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #130 <Field int channelCount>
	//   83  157:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   84  160:pop             
		stringbuilder.append(", ");
	//   85  161:aload_1         
	//   86  162:ldc2            #332 <String ", ">
	//   87  165:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(sampleRate);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #132 <Field int sampleRate>
	//   92  174:invokevirtual   #255 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append("])");
	//   94  178:aload_1         
	//   95  179:ldc2            #338 <String "])">
	//   96  182:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		return stringbuilder.toString();
	//   98  186:aload_1         
	//   99  187:invokevirtual   #273 <Method String StringBuilder.toString()>
	//  100  190:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field String id>
	//    3    5:invokevirtual   #344 <Method void Parcel.writeString(String)>
		parcel.writeString(containerMimeType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field String containerMimeType>
	//    7   13:invokevirtual   #344 <Method void Parcel.writeString(String)>
		parcel.writeString(sampleMimeType);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field String sampleMimeType>
	//   11   21:invokevirtual   #344 <Method void Parcel.writeString(String)>
		parcel.writeString(codecs);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #78  <Field String codecs>
	//   15   29:invokevirtual   #344 <Method void Parcel.writeString(String)>
		parcel.writeInt(bitrate);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #84  <Field int bitrate>
	//   19   37:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxInputSize);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #86  <Field int maxInputSize>
	//   23   45:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(width);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #88  <Field int width>
	//   27   53:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(height);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #90  <Field int height>
	//   31   61:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(frameRate);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #96  <Field float frameRate>
	//   35   69:invokevirtual   #351 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(rotationDegrees);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #98  <Field int rotationDegrees>
	//   39   77:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(pixelWidthHeightRatio);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #100 <Field float pixelWidthHeightRatio>
	//   43   85:invokevirtual   #351 <Method void Parcel.writeFloat(float)>
		boolean flag;
		if(projectionData != null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #112 <Field byte[] projectionData>
	//*  46   92:ifnull          101
			flag = true;
	//   47   95:iconst_1        
	//   48   96:istore          4
		else
	//*  49   98:goto            104
			flag = false;
	//   50  101:iconst_0        
	//   51  102:istore          4
		Util.writeBoolean(parcel, flag);
	//   52  104:aload_1         
	//   53  105:iload           4
	//   54  107:invokestatic    #355 <Method void Util.writeBoolean(Parcel, boolean)>
		if(projectionData != null)
	//*  55  110:aload_0         
	//*  56  111:getfield        #112 <Field byte[] projectionData>
	//*  57  114:ifnull          125
			parcel.writeByteArray(projectionData);
	//   58  117:aload_1         
	//   59  118:aload_0         
	//   60  119:getfield        #112 <Field byte[] projectionData>
	//   61  122:invokevirtual   #359 <Method void Parcel.writeByteArray(byte[])>
		parcel.writeInt(stereoMode);
	//   62  125:aload_1         
	//   63  126:aload_0         
	//   64  127:getfield        #114 <Field int stereoMode>
	//   65  130:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (colorInfo)), i);
	//   66  133:aload_1         
	//   67  134:aload_0         
	//   68  135:getfield        #128 <Field ColorInfo colorInfo>
	//   69  138:iload_2         
	//   70  139:invokevirtual   #363 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(channelCount);
	//   71  142:aload_1         
	//   72  143:aload_0         
	//   73  144:getfield        #130 <Field int channelCount>
	//   74  147:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(sampleRate);
	//   75  150:aload_1         
	//   76  151:aload_0         
	//   77  152:getfield        #132 <Field int sampleRate>
	//   78  155:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(pcmEncoding);
	//   79  158:aload_1         
	//   80  159:aload_0         
	//   81  160:getfield        #134 <Field int pcmEncoding>
	//   82  163:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(encoderDelay);
	//   83  166:aload_1         
	//   84  167:aload_0         
	//   85  168:getfield        #136 <Field int encoderDelay>
	//   86  171:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(encoderPadding);
	//   87  174:aload_1         
	//   88  175:aload_0         
	//   89  176:getfield        #138 <Field int encoderPadding>
	//   90  179:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeInt(selectionFlags);
	//   91  182:aload_1         
	//   92  183:aload_0         
	//   93  184:getfield        #140 <Field int selectionFlags>
	//   94  187:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeString(language);
	//   95  190:aload_1         
	//   96  191:aload_0         
	//   97  192:getfield        #142 <Field String language>
	//   98  195:invokevirtual   #344 <Method void Parcel.writeString(String)>
		parcel.writeInt(accessibilityChannel);
	//   99  198:aload_1         
	//  100  199:aload_0         
	//  101  200:getfield        #144 <Field int accessibilityChannel>
	//  102  203:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		parcel.writeLong(subsampleOffsetUs);
	//  103  206:aload_1         
	//  104  207:aload_0         
	//  105  208:getfield        #150 <Field long subsampleOffsetUs>
	//  106  211:invokevirtual   #367 <Method void Parcel.writeLong(long)>
		int j = initializationData.size();
	//  107  214:aload_0         
	//  108  215:getfield        #157 <Field List initializationData>
	//  109  218:invokeinterface #323 <Method int List.size()>
	//  110  223:istore_3        
		parcel.writeInt(j);
	//  111  224:aload_1         
	//  112  225:iload_3         
	//  113  226:invokevirtual   #347 <Method void Parcel.writeInt(int)>
		for(i = 0; i < j; i++)
	//* 114  229:iconst_0        
	//* 115  230:istore_2        
	//* 116  231:iload_2         
	//* 117  232:iload_3         
	//* 118  233:icmpge          260
			parcel.writeByteArray((byte[])initializationData.get(i));
	//  119  236:aload_1         
	//  120  237:aload_0         
	//  121  238:getfield        #157 <Field List initializationData>
	//  122  241:iload_2         
	//  123  242:invokeinterface #327 <Method Object List.get(int)>
	//  124  247:checkcast       #328 <Class byte[]>
	//  125  250:invokevirtual   #359 <Method void Parcel.writeByteArray(byte[])>

	//  126  253:iload_2         
	//  127  254:iconst_1        
	//  128  255:iadd            
	//  129  256:istore_2        
	//* 130  257:goto            231
		parcel.writeParcelable(((Parcelable) (drmInitData)), 0);
	//  131  260:aload_1         
	//  132  261:aload_0         
	//  133  262:getfield        #167 <Field DrmInitData drmInitData>
	//  134  265:iconst_0        
	//  135  266:invokevirtual   #363 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (metadata)), 0);
	//  136  269:aload_1         
	//  137  270:aload_0         
	//  138  271:getfield        #171 <Field Metadata metadata>
	//  139  274:iconst_0        
	//  140  275:invokevirtual   #363 <Method void Parcel.writeParcelable(Parcelable, int)>
	//  141  278:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Format createFromParcel(Parcel parcel)
		{
			return new Format(parcel);
		//    0    0:new             #9   <Class Format>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Format(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method Format createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Format[] newArray(int i)
		{
			return new Format[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Format[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method Format[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final int NO_VALUE = -1;
	public static final long OFFSET_SAMPLE_RELATIVE = 0xffffffffL;
	public final int accessibilityChannel;
	public final int bitrate;
	public final int channelCount;
	public final String codecs;
	public final ColorInfo colorInfo;
	public final String containerMimeType;
	public final DrmInitData drmInitData;
	public final int encoderDelay;
	public final int encoderPadding;
	public final float frameRate;
	private int hashCode;
	public final int height;
	public final String id;
	public final List initializationData;
	public final String language;
	public final int maxInputSize;
	public final Metadata metadata;
	public final int pcmEncoding;
	public final float pixelWidthHeightRatio;
	public final byte projectionData[];
	public final int rotationDegrees;
	public final String sampleMimeType;
	public final int sampleRate;
	public final int selectionFlags;
	public final int stereoMode;
	public final long subsampleOffsetUs;
	public final int width;

	static 
	{
	//    0    0:new             #8   <Class Format$1>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void Format$1()>
	//    3    7:putstatic       #61  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
