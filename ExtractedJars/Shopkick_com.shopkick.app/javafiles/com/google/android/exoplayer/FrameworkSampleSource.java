// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer:
//			SampleSource, MediaFormat, MediaFormatHolder, SampleHolder, 
//			CryptoInfo

public final class FrameworkSampleSource
	implements SampleSource, SampleSource.SampleSourceReader
{

	public FrameworkSampleSource(Context context1, Uri uri1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		boolean flag;
		if(Util.SDK_INT >= 16)
	//*   2    4:getstatic       #58  <Field int Util.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          18
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore          4
		else
	//*   7   15:goto            21
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		Assertions.checkState(flag);
	//   10   21:iload           4
	//   11   23:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		context = (Context)Assertions.checkNotNull(((Object) (context1)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokestatic    #68  <Method Object Assertions.checkNotNull(Object)>
	//   15   31:checkcast       #70  <Class Context>
	//   16   34:putfield        #72  <Field Context context>
		uri = (Uri)Assertions.checkNotNull(((Object) (uri1)));
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:invokestatic    #68  <Method Object Assertions.checkNotNull(Object)>
	//   20   42:checkcast       #74  <Class Uri>
	//   21   45:putfield        #76  <Field Uri uri>
		headers = map;
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:putfield        #78  <Field Map headers>
		fileDescriptor = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #80  <Field FileDescriptor fileDescriptor>
		fileDescriptorOffset = 0L;
	//   28   58:aload_0         
	//   29   59:lconst_0        
	//   30   60:putfield        #82  <Field long fileDescriptorOffset>
		fileDescriptorLength = 0L;
	//   31   63:aload_0         
	//   32   64:lconst_0        
	//   33   65:putfield        #84  <Field long fileDescriptorLength>
	//   34   68:return          
	}

	public FrameworkSampleSource(FileDescriptor filedescriptor, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		boolean flag;
		if(Util.SDK_INT >= 16)
	//*   2    4:getstatic       #58  <Field int Util.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          18
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore          6
		else
	//*   7   15:goto            21
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          6
		Assertions.checkState(flag);
	//   10   21:iload           6
	//   11   23:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		fileDescriptor = (FileDescriptor)Assertions.checkNotNull(((Object) (filedescriptor)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokestatic    #68  <Method Object Assertions.checkNotNull(Object)>
	//   15   31:checkcast       #90  <Class FileDescriptor>
	//   16   34:putfield        #80  <Field FileDescriptor fileDescriptor>
		fileDescriptorOffset = l;
	//   17   37:aload_0         
	//   18   38:lload_2         
	//   19   39:putfield        #82  <Field long fileDescriptorOffset>
		fileDescriptorLength = l1;
	//   20   42:aload_0         
	//   21   43:lload           4
	//   22   45:putfield        #84  <Field long fileDescriptorLength>
		context = null;
	//   23   48:aload_0         
	//   24   49:aconst_null     
	//   25   50:putfield        #72  <Field Context context>
		uri = null;
	//   26   53:aload_0         
	//   27   54:aconst_null     
	//   28   55:putfield        #76  <Field Uri uri>
		headers = null;
	//   29   58:aload_0         
	//   30   59:aconst_null     
	//   31   60:putfield        #78  <Field Map headers>
	//   32   63:return          
	}

	private static com.google.android.exoplayer.MediaFormat createMediaFormat(MediaFormat mediaformat)
	{
		Object obj = ((Object) (mediaformat.getString("mime")));
	//    0    0:aload_0         
	//    1    1:ldc1            #96  <String "mime">
	//    2    3:invokevirtual   #102 <Method String MediaFormat.getString(String)>
	//    3    6:astore          12
		String s = getOptionalStringV16(mediaformat, "language");
	//    4    8:aload_0         
	//    5    9:ldc1            #104 <String "language">
	//    6   11:invokestatic    #108 <Method String getOptionalStringV16(MediaFormat, String)>
	//    7   14:astore          13
		int j = getOptionalIntegerV16(mediaformat, "max-input-size");
	//    8   16:aload_0         
	//    9   17:ldc1            #110 <String "max-input-size">
	//   10   19:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   11   22:istore_2        
		int k = getOptionalIntegerV16(mediaformat, "width");
	//   12   23:aload_0         
	//   13   24:ldc1            #116 <String "width">
	//   14   26:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   15   29:istore_3        
		int l = getOptionalIntegerV16(mediaformat, "height");
	//   16   30:aload_0         
	//   17   31:ldc1            #118 <String "height">
	//   18   33:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   19   36:istore          4
		int i1 = getOptionalIntegerV16(mediaformat, "rotation-degrees");
	//   20   38:aload_0         
	//   21   39:ldc1            #120 <String "rotation-degrees">
	//   22   41:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   23   44:istore          5
		int j1 = getOptionalIntegerV16(mediaformat, "channel-count");
	//   24   46:aload_0         
	//   25   47:ldc1            #122 <String "channel-count">
	//   26   49:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   27   52:istore          6
		int k1 = getOptionalIntegerV16(mediaformat, "sample-rate");
	//   28   54:aload_0         
	//   29   55:ldc1            #124 <String "sample-rate">
	//   30   57:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   31   60:istore          7
		int l1 = getOptionalIntegerV16(mediaformat, "encoder-delay");
	//   32   62:aload_0         
	//   33   63:ldc1            #126 <String "encoder-delay">
	//   34   65:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   35   68:istore          8
		int i2 = getOptionalIntegerV16(mediaformat, "encoder-padding");
	//   36   70:aload_0         
	//   37   71:ldc1            #128 <String "encoder-padding">
	//   38   73:invokestatic    #114 <Method int getOptionalIntegerV16(MediaFormat, String)>
	//   39   76:istore          9
		ArrayList arraylist = new ArrayList();
	//   40   78:new             #130 <Class ArrayList>
	//   41   81:dup             
	//   42   82:invokespecial   #131 <Method void ArrayList()>
	//   43   85:astore          14
		int i = 0;
	//   44   87:iconst_0        
	//   45   88:istore_1        
		do
		{
			Object obj1 = ((Object) (new StringBuilder()));
	//   46   89:new             #133 <Class StringBuilder>
	//   47   92:dup             
	//   48   93:invokespecial   #134 <Method void StringBuilder()>
	//   49   96:astore          15
			((StringBuilder) (obj1)).append("csd-");
	//   50   98:aload           15
	//   51  100:ldc1            #136 <String "csd-">
	//   52  102:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			((StringBuilder) (obj1)).append(i);
	//   54  106:aload           15
	//   55  108:iload_1         
	//   56  109:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   57  112:pop             
			if(!mediaformat.containsKey(((StringBuilder) (obj1)).toString()))
				break;
	//   58  113:aload_0         
	//   59  114:aload           15
	//   60  116:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   61  119:invokevirtual   #151 <Method boolean MediaFormat.containsKey(String)>
	//   62  122:ifeq            198
			obj1 = ((Object) (new StringBuilder()));
	//   63  125:new             #133 <Class StringBuilder>
	//   64  128:dup             
	//   65  129:invokespecial   #134 <Method void StringBuilder()>
	//   66  132:astore          15
			((StringBuilder) (obj1)).append("csd-");
	//   67  134:aload           15
	//   68  136:ldc1            #136 <String "csd-">
	//   69  138:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   70  141:pop             
			((StringBuilder) (obj1)).append(i);
	//   71  142:aload           15
	//   72  144:iload_1         
	//   73  145:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   74  148:pop             
			obj1 = ((Object) (mediaformat.getByteBuffer(((StringBuilder) (obj1)).toString())));
	//   75  149:aload_0         
	//   76  150:aload           15
	//   77  152:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   78  155:invokevirtual   #155 <Method ByteBuffer MediaFormat.getByteBuffer(String)>
	//   79  158:astore          15
			byte abyte0[] = new byte[((ByteBuffer) (obj1)).limit()];
	//   80  160:aload           15
	//   81  162:invokevirtual   #161 <Method int ByteBuffer.limit()>
	//   82  165:newarray        byte[]
	//   83  167:astore          16
			((ByteBuffer) (obj1)).get(abyte0);
	//   84  169:aload           15
	//   85  171:aload           16
	//   86  173:invokevirtual   #165 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   87  176:pop             
			arraylist.add(((Object) (abyte0)));
	//   88  177:aload           14
	//   89  179:aload           16
	//   90  181:invokevirtual   #169 <Method boolean ArrayList.add(Object)>
	//   91  184:pop             
			((ByteBuffer) (obj1)).flip();
	//   92  185:aload           15
	//   93  187:invokevirtual   #173 <Method java.nio.Buffer ByteBuffer.flip()>
	//   94  190:pop             
			i++;
	//   95  191:iload_1         
	//   96  192:iconst_1        
	//   97  193:iadd            
	//   98  194:istore_1        
		} while(true);
	//   99  195:goto            89
		long l2;
		if(mediaformat.containsKey("durationUs"))
	//* 100  198:aload_0         
	//* 101  199:ldc1            #175 <String "durationUs">
	//* 102  201:invokevirtual   #151 <Method boolean MediaFormat.containsKey(String)>
	//* 103  204:ifeq            218
			l2 = mediaformat.getLong("durationUs");
	//  104  207:aload_0         
	//  105  208:ldc1            #175 <String "durationUs">
	//  106  210:invokevirtual   #179 <Method long MediaFormat.getLong(String)>
	//  107  213:lstore          10
		else
	//* 108  215:goto            223
			l2 = -1L;
	//  109  218:ldc2w           #180 <Long -1L>
	//  110  221:lstore          10
		if("audio/raw".equals(obj))
	//* 111  223:ldc1            #183 <String "audio/raw">
	//* 112  225:aload           12
	//* 113  227:invokevirtual   #188 <Method boolean String.equals(Object)>
	//* 114  230:ifeq            238
			i = 2;
	//  115  233:iconst_2        
	//  116  234:istore_1        
		else
	//* 117  235:goto            240
			i = -1;
	//  118  238:iconst_m1       
	//  119  239:istore_1        
		obj = ((Object) (new com.google.android.exoplayer.MediaFormat(((String) (null)), ((String) (obj)), -1, j, l2, k, l, i1, -1F, j1, k1, s, 0xffffffffL, ((java.util.List) (arraylist)), false, -1, -1, i, l1, i2, ((byte []) (null)), -1)));
	//  120  240:new             #190 <Class com.google.android.exoplayer.MediaFormat>
	//  121  243:dup             
	//  122  244:aconst_null     
	//  123  245:aload           12
	//  124  247:iconst_m1       
	//  125  248:iload_2         
	//  126  249:lload           10
	//  127  251:iload_3         
	//  128  252:iload           4
	//  129  254:iload           5
	//  130  256:ldc1            #191 <Float -1F>
	//  131  258:iload           6
	//  132  260:iload           7
	//  133  262:aload           13
	//  134  264:ldc2w           #192 <Long 0xffffffffL>
	//  135  267:aload           14
	//  136  269:iconst_0        
	//  137  270:iconst_m1       
	//  138  271:iconst_m1       
	//  139  272:iload_1         
	//  140  273:iload           8
	//  141  275:iload           9
	//  142  277:aconst_null     
	//  143  278:iconst_m1       
	//  144  279:invokespecial   #196 <Method void com.google.android.exoplayer.MediaFormat(String, String, int, int, long, int, int, int, float, int, int, String, long, java.util.List, boolean, int, int, int, int, int, byte[], int)>
	//  145  282:astore          12
		((com.google.android.exoplayer.MediaFormat) (obj)).setFrameworkFormatV16(mediaformat);
	//  146  284:aload           12
	//  147  286:aload_0         
	//  148  287:invokevirtual   #200 <Method void MediaFormat.setFrameworkFormatV16(MediaFormat)>
		return ((com.google.android.exoplayer.MediaFormat) (obj));
	//  149  290:aload           12
	//  150  292:areturn         
	}

	private DrmInitData getDrmInitDataV18()
	{
		Map map = extractor.getPsshInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field MediaExtractor extractor>
	//    2    4:invokevirtual   #212 <Method Map MediaExtractor.getPsshInfo()>
	//    3    7:astore_1        
		if(map != null && !map.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:ifnull          100
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #218 <Method boolean Map.isEmpty()>
	//*   8   18:ifeq            24
	//*   9   21:goto            100
		{
			com.google.android.exoplayer.drm.DrmInitData.Mapped mapped = new com.google.android.exoplayer.drm.DrmInitData.Mapped();
	//   10   24:new             #220 <Class com.google.android.exoplayer.drm.DrmInitData$Mapped>
	//   11   27:dup             
	//   12   28:invokespecial   #221 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped()>
	//   13   31:astore_2        
			UUID uuid;
			for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); mapped.put(uuid, new com.google.android.exoplayer.drm.DrmInitData.SchemeInitData("video/mp4", PsshAtomUtil.buildPsshAtom(uuid, (byte[])map.get(((Object) (uuid)))))))
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #225 <Method Set Map.keySet()>
	//*  16   38:invokeinterface #231 <Method Iterator Set.iterator()>
	//*  17   43:astore_3        
	//*  18   44:aload_3         
	//*  19   45:invokeinterface #236 <Method boolean Iterator.hasNext()>
	//*  20   50:ifeq            98
				uuid = (UUID)iterator.next();
	//   21   53:aload_3         
	//   22   54:invokeinterface #240 <Method Object Iterator.next()>
	//   23   59:checkcast       #242 <Class UUID>
	//   24   62:astore          4

	//   25   64:aload_2         
	//   26   65:aload           4
	//   27   67:new             #244 <Class com.google.android.exoplayer.drm.DrmInitData$SchemeInitData>
	//   28   70:dup             
	//   29   71:ldc1            #246 <String "video/mp4">
	//   30   73:aload           4
	//   31   75:aload_1         
	//   32   76:aload           4
	//   33   78:invokeinterface #248 <Method Object Map.get(Object)>
	//   34   83:checkcast       #250 <Class byte[]>
	//   35   86:invokestatic    #256 <Method byte[] PsshAtomUtil.buildPsshAtom(UUID, byte[])>
	//   36   89:invokespecial   #259 <Method void com.google.android.exoplayer.drm.DrmInitData$SchemeInitData(String, byte[])>
	//   37   92:invokevirtual   #263 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped.put(UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
	//*  38   95:goto            44
			return ((DrmInitData) (mapped));
	//   39   98:aload_2         
	//   40   99:areturn         
		} else
		{
			return null;
	//   41  100:aconst_null     
	//   42  101:areturn         
		}
	}

	private static final int getOptionalIntegerV16(MediaFormat mediaformat, String s)
	{
		if(mediaformat.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #151 <Method boolean MediaFormat.containsKey(String)>
	//*   3    5:ifeq            14
			return mediaformat.getInteger(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #267 <Method int MediaFormat.getInteger(String)>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	private static final String getOptionalStringV16(MediaFormat mediaformat, String s)
	{
		if(mediaformat.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #151 <Method boolean MediaFormat.containsKey(String)>
	//*   3    5:ifeq            14
			return mediaformat.getString(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #102 <Method String MediaFormat.getString(String)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private void seekToUsInternal(long l, boolean flag)
	{
		if(flag || pendingSeekPositionUs != l)
	//*   0    0:iload_3         
	//*   1    1:ifne            13
	//*   2    4:aload_0         
	//*   3    5:getfield        #271 <Field long pendingSeekPositionUs>
	//*   4    8:lload_1         
	//*   5    9:lcmp            
	//*   6   10:ifeq            78
		{
			lastSeekPositionUs = l;
	//    7   13:aload_0         
	//    8   14:lload_1         
	//    9   15:putfield        #273 <Field long lastSeekPositionUs>
			pendingSeekPositionUs = l;
	//   10   18:aload_0         
	//   11   19:lload_1         
	//   12   20:putfield        #271 <Field long pendingSeekPositionUs>
			MediaExtractor mediaextractor = extractor;
	//   13   23:aload_0         
	//   14   24:getfield        #206 <Field MediaExtractor extractor>
	//   15   27:astore          5
			int i = 0;
	//   16   29:iconst_0        
	//   17   30:istore          4
			mediaextractor.seekTo(l, 0);
	//   18   32:aload           5
	//   19   34:lload_1         
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #277 <Method void MediaExtractor.seekTo(long, int)>
			do
			{
				int ai[] = trackStates;
	//   22   39:aload_0         
	//   23   40:getfield        #279 <Field int[] trackStates>
	//   24   43:astore          5
				if(i >= ai.length)
					break;
	//   25   45:iload           4
	//   26   47:aload           5
	//   27   49:arraylength     
	//   28   50:icmpge          78
				if(ai[i] != 0)
	//*  29   53:aload           5
	//*  30   55:iload           4
	//*  31   57:iaload          
	//*  32   58:ifeq            69
					pendingDiscontinuities[i] = true;
	//   33   61:aload_0         
	//   34   62:getfield        #281 <Field boolean[] pendingDiscontinuities>
	//   35   65:iload           4
	//   36   67:iconst_1        
	//   37   68:bastore         
				i++;
	//   38   69:iload           4
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore          4
			} while(true);
	//   42   75:goto            39
		}
	//   43   78:return          
	}

	public boolean continueBuffering(int i, long l)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void disable(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		boolean flag;
		if(trackStates[i] != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field int[] trackStates>
	//*   5   11:iload_1         
	//*   6   12:iaload          
	//*   7   13:ifeq            21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		Assertions.checkState(flag);
	//   13   23:iload_2         
	//   14   24:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		extractor.unselectTrack(i);
	//   15   27:aload_0         
	//   16   28:getfield        #206 <Field MediaExtractor extractor>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #290 <Method void MediaExtractor.unselectTrack(int)>
		pendingDiscontinuities[i] = false;
	//   19   35:aload_0         
	//   20   36:getfield        #281 <Field boolean[] pendingDiscontinuities>
	//   21   39:iload_1         
	//   22   40:iconst_0        
	//   23   41:bastore         
		trackStates[i] = 0;
	//   24   42:aload_0         
	//   25   43:getfield        #279 <Field int[] trackStates>
	//   26   46:iload_1         
	//   27   47:iconst_0        
	//   28   48:iastore         
	//   29   49:return          
	}

	public void enable(int i, long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		int j = trackStates[i];
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field int[] trackStates>
	//    5   11:iload_1         
	//    6   12:iaload          
	//    7   13:istore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore          6
		boolean flag;
		if(j == 0)
	//*  10   18:iload           4
	//*  11   20:ifne            29
			flag = true;
	//   12   23:iconst_1        
	//   13   24:istore          5
		else
	//*  14   26:goto            32
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore          5
		Assertions.checkState(flag);
	//   17   32:iload           5
	//   18   34:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		trackStates[i] = 1;
	//   19   37:aload_0         
	//   20   38:getfield        #279 <Field int[] trackStates>
	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iastore         
		extractor.selectTrack(i);
	//   24   44:aload_0         
	//   25   45:getfield        #206 <Field MediaExtractor extractor>
	//   26   48:iload_1         
	//   27   49:invokevirtual   #295 <Method void MediaExtractor.selectTrack(int)>
		flag = flag1;
	//   28   52:iload           6
	//   29   54:istore          5
		if(l != 0L)
	//*  30   56:lload_2         
	//*  31   57:lconst_0        
	//*  32   58:lcmp            
	//*  33   59:ifeq            65
			flag = true;
	//   34   62:iconst_1        
	//   35   63:istore          5
		seekToUsInternal(l, flag);
	//   36   65:aload_0         
	//   37   66:lload_2         
	//   38   67:iload           5
	//   39   69:invokespecial   #297 <Method void seekToUsInternal(long, boolean)>
	//   40   72:return          
	}

	public long getBufferedPositionUs()
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		long l = extractor.getCachedDuration();
	//    3    7:aload_0         
	//    4    8:getfield        #206 <Field MediaExtractor extractor>
	//    5   11:invokevirtual   #302 <Method long MediaExtractor.getCachedDuration()>
	//    6   14:lstore_1        
		if(l == -1L)
	//*   7   15:lload_1         
	//*   8   16:ldc2w           #180 <Long -1L>
	//*   9   19:lcmp            
	//*  10   20:ifne            27
			return -1L;
	//   11   23:ldc2w           #180 <Long -1L>
	//   12   26:lreturn         
		long l1 = extractor.getSampleTime();
	//   13   27:aload_0         
	//   14   28:getfield        #206 <Field MediaExtractor extractor>
	//   15   31:invokevirtual   #305 <Method long MediaExtractor.getSampleTime()>
	//   16   34:lstore_3        
		if(l1 == -1L)
	//*  17   35:lload_3         
	//*  18   36:ldc2w           #180 <Long -1L>
	//*  19   39:lcmp            
	//*  20   40:ifne            47
			return -3L;
	//   21   43:ldc2w           #306 <Long -3L>
	//   22   46:lreturn         
		else
			return l + l1;
	//   23   47:lload_1         
	//   24   48:lload_3         
	//   25   49:ladd            
	//   26   50:lreturn         
	}

	public com.google.android.exoplayer.MediaFormat getFormat(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		return trackFormats[i];
	//    3    7:aload_0         
	//    4    8:getfield        #311 <Field com.google.android.exoplayer.MediaFormat[] trackFormats>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:areturn         
	}

	public int getTrackCount()
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		return trackStates.length;
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field int[] trackStates>
	//    5   11:arraylength     
	//    6   12:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = preparationError;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field IOException preparationError>
	//    2    4:astore_1        
		if(ioexception == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		else
			throw ioexception;
	//    6   10:aload_1         
	//    7   11:athrow          
	}

	public boolean prepare(long l)
	{
		int i;
		if(prepared)
			break MISSING_BLOCK_LABEL_169;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:ifne            169
		IOException ioexception = preparationError;
	//    3    7:aload_0         
	//    4    8:getfield        #317 <Field IOException preparationError>
	//    5   11:astore          4
		i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_3        
		if(ioexception != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		extractor = new MediaExtractor();
	//   12   22:aload_0         
	//   13   23:new             #208 <Class MediaExtractor>
	//   14   26:dup             
	//   15   27:invokespecial   #321 <Method void MediaExtractor()>
	//   16   30:putfield        #206 <Field MediaExtractor extractor>
label0:
		{
			if(context != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #72  <Field Context context>
	//*  19   37:ifnull          62
			{
				extractor.setDataSource(context, uri, headers);
	//   20   40:aload_0         
	//   21   41:getfield        #206 <Field MediaExtractor extractor>
	//   22   44:aload_0         
	//   23   45:getfield        #72  <Field Context context>
	//   24   48:aload_0         
	//   25   49:getfield        #76  <Field Uri uri>
	//   26   52:aload_0         
	//   27   53:getfield        #78  <Field Map headers>
	//   28   56:invokevirtual   #324 <Method void MediaExtractor.setDataSource(Context, Uri, Map)>
				break label0;
	//   29   59:goto            81
			}
			int ai[];
			try
			{
				extractor.setDataSource(fileDescriptor, fileDescriptorOffset, fileDescriptorLength);
	//   30   62:aload_0         
	//   31   63:getfield        #206 <Field MediaExtractor extractor>
	//   32   66:aload_0         
	//   33   67:getfield        #80  <Field FileDescriptor fileDescriptor>
	//   34   70:aload_0         
	//   35   71:getfield        #82  <Field long fileDescriptorOffset>
	//   36   74:aload_0         
	//   37   75:getfield        #84  <Field long fileDescriptorLength>
	//   38   78:invokevirtual   #326 <Method void MediaExtractor.setDataSource(FileDescriptor, long, long)>
			}
	//*  39   81:aload_0         
	//*  40   82:aload_0         
	//*  41   83:getfield        #206 <Field MediaExtractor extractor>
	//*  42   86:invokevirtual   #328 <Method int MediaExtractor.getTrackCount()>
	//*  43   89:newarray        int[]
	//*  44   91:putfield        #279 <Field int[] trackStates>
	//*  45   94:aload_0         
	//*  46   95:getfield        #279 <Field int[] trackStates>
	//*  47   98:astore          4
	//*  48  100:aload_0         
	//*  49  101:aload           4
	//*  50  103:arraylength     
	//*  51  104:newarray        boolean[]
	//*  52  106:putfield        #281 <Field boolean[] pendingDiscontinuities>
	//*  53  109:aload_0         
	//*  54  110:aload           4
	//*  55  112:arraylength     
	//*  56  113:anewarray       com.google.android.exoplayer.MediaFormat[]
	//*  57  116:putfield        #311 <Field com.google.android.exoplayer.MediaFormat[] trackFormats>
	//*  58  119:iload_3         
	//*  59  120:aload_0         
	//*  60  121:getfield        #279 <Field int[] trackStates>
	//*  61  124:arraylength     
	//*  62  125:icmpge          152
	//*  63  128:aload_0         
	//*  64  129:getfield        #311 <Field com.google.android.exoplayer.MediaFormat[] trackFormats>
	//*  65  132:iload_3         
	//*  66  133:aload_0         
	//*  67  134:getfield        #206 <Field MediaExtractor extractor>
	//*  68  137:iload_3         
	//*  69  138:invokevirtual   #332 <Method MediaFormat MediaExtractor.getTrackFormat(int)>
	//*  70  141:invokestatic    #334 <Method com.google.android.exoplayer.MediaFormat createMediaFormat(MediaFormat)>
	//*  71  144:aastore         
	//*  72  145:iload_3         
	//*  73  146:iconst_1        
	//*  74  147:iadd            
	//*  75  148:istore_3        
	//*  76  149:goto            119
	//*  77  152:aload_0         
	//*  78  153:iconst_1        
	//*  79  154:putfield        #287 <Field boolean prepared>
	//*  80  157:iconst_1        
	//*  81  158:ireturn         
			catch(IOException ioexception1)
	//*  82  159:astore          4
			{
				preparationError = ioexception1;
	//   83  161:aload_0         
	//   84  162:aload           4
	//   85  164:putfield        #317 <Field IOException preparationError>
				return false;
	//   86  167:iconst_0        
	//   87  168:ireturn         
			}
		}
		trackStates = new int[extractor.getTrackCount()];
		ai = trackStates;
		pendingDiscontinuities = new boolean[ai.length];
		trackFormats = new com.google.android.exoplayer.MediaFormat[ai.length];
		for(; i < trackStates.length; i++)
			trackFormats[i] = createMediaFormat(extractor.getTrackFormat(i));

		prepared = true;
		return true;
		return true;
	//   88  169:iconst_1        
	//   89  170:ireturn         
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		boolean flag;
		if(trackStates[i] != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field int[] trackStates>
	//*   5   11:iload_1         
	//*   6   12:iaload          
	//*   7   13:ifeq            22
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore          8
		else
	//*  10   19:goto            25
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore          8
		Assertions.checkState(flag);
	//   13   25:iload           8
	//   14   27:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		flag = pendingDiscontinuities[i];
	//   15   30:aload_0         
	//   16   31:getfield        #281 <Field boolean[] pendingDiscontinuities>
	//   17   34:iload_1         
	//   18   35:baload          
	//   19   36:istore          8
		byte byte0 = -2;
	//   20   38:bipush          -2
	//   21   40:istore          6
		if(flag)
	//*  22   42:iload           8
	//*  23   44:ifeq            50
			return -2;
	//   24   47:bipush          -2
	//   25   49:ireturn         
		if(trackStates[i] != 2)
	//*  26   50:aload_0         
	//*  27   51:getfield        #279 <Field int[] trackStates>
	//*  28   54:iload_1         
	//*  29   55:iaload          
	//*  30   56:iconst_2        
	//*  31   57:icmpeq          108
		{
			mediaformatholder.format = trackFormats[i];
	//   32   60:aload           4
	//   33   62:aload_0         
	//   34   63:getfield        #311 <Field com.google.android.exoplayer.MediaFormat[] trackFormats>
	//   35   66:iload_1         
	//   36   67:aaload          
	//   37   68:putfield        #342 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
			if(Util.SDK_INT >= 18)
	//*  38   71:getstatic       #58  <Field int Util.SDK_INT>
	//*  39   74:bipush          18
	//*  40   76:icmplt          88
				sampleholder = ((SampleHolder) (getDrmInitDataV18()));
	//   41   79:aload_0         
	//   42   80:invokespecial   #344 <Method DrmInitData getDrmInitDataV18()>
	//   43   83:astore          5
			else
	//*  44   85:goto            91
				sampleholder = null;
	//   45   88:aconst_null     
	//   46   89:astore          5
			mediaformatholder.drmInitData = ((DrmInitData) (sampleholder));
	//   47   91:aload           4
	//   48   93:aload           5
	//   49   95:putfield        #348 <Field DrmInitData MediaFormatHolder.drmInitData>
			trackStates[i] = 2;
	//   50   98:aload_0         
	//   51   99:getfield        #279 <Field int[] trackStates>
	//   52  102:iload_1         
	//   53  103:iconst_2        
	//   54  104:iastore         
			return -4;
	//   55  105:bipush          -4
	//   56  107:ireturn         
		}
		int j = extractor.getSampleTrackIndex();
	//   57  108:aload_0         
	//   58  109:getfield        #206 <Field MediaExtractor extractor>
	//   59  112:invokevirtual   #351 <Method int MediaExtractor.getSampleTrackIndex()>
	//   60  115:istore          7
		if(j == i)
	//*  61  117:iload           7
	//*  62  119:iload_1         
	//*  63  120:icmpne          247
		{
			if(sampleholder.data != null)
	//*  64  123:aload           5
	//*  65  125:getfield        #357 <Field ByteBuffer SampleHolder.data>
	//*  66  128:ifnull          177
			{
				i = sampleholder.data.position();
	//   67  131:aload           5
	//   68  133:getfield        #357 <Field ByteBuffer SampleHolder.data>
	//   69  136:invokevirtual   #360 <Method int ByteBuffer.position()>
	//   70  139:istore_1        
				sampleholder.size = extractor.readSampleData(sampleholder.data, i);
	//   71  140:aload           5
	//   72  142:aload_0         
	//   73  143:getfield        #206 <Field MediaExtractor extractor>
	//   74  146:aload           5
	//   75  148:getfield        #357 <Field ByteBuffer SampleHolder.data>
	//   76  151:iload_1         
	//   77  152:invokevirtual   #364 <Method int MediaExtractor.readSampleData(ByteBuffer, int)>
	//   78  155:putfield        #367 <Field int SampleHolder.size>
				sampleholder.data.position(i + sampleholder.size);
	//   79  158:aload           5
	//   80  160:getfield        #357 <Field ByteBuffer SampleHolder.data>
	//   81  163:iload_1         
	//   82  164:aload           5
	//   83  166:getfield        #367 <Field int SampleHolder.size>
	//   84  169:iadd            
	//   85  170:invokevirtual   #370 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   86  173:pop             
			} else
	//*  87  174:goto            183
			{
				sampleholder.size = 0;
	//   88  177:aload           5
	//   89  179:iconst_0        
	//   90  180:putfield        #367 <Field int SampleHolder.size>
			}
			sampleholder.timeUs = extractor.getSampleTime();
	//   91  183:aload           5
	//   92  185:aload_0         
	//   93  186:getfield        #206 <Field MediaExtractor extractor>
	//   94  189:invokevirtual   #305 <Method long MediaExtractor.getSampleTime()>
	//   95  192:putfield        #373 <Field long SampleHolder.timeUs>
			sampleholder.flags = extractor.getSampleFlags() & 3;
	//   96  195:aload           5
	//   97  197:aload_0         
	//   98  198:getfield        #206 <Field MediaExtractor extractor>
	//   99  201:invokevirtual   #376 <Method int MediaExtractor.getSampleFlags()>
	//  100  204:iconst_3        
	//  101  205:iand            
	//  102  206:putfield        #379 <Field int SampleHolder.flags>
			if(sampleholder.isEncrypted())
	//* 103  209:aload           5
	//* 104  211:invokevirtual   #382 <Method boolean SampleHolder.isEncrypted()>
	//* 105  214:ifeq            229
				sampleholder.cryptoInfo.setFromExtractorV16(extractor);
	//  106  217:aload           5
	//  107  219:getfield        #386 <Field CryptoInfo SampleHolder.cryptoInfo>
	//  108  222:aload_0         
	//  109  223:getfield        #206 <Field MediaExtractor extractor>
	//  110  226:invokevirtual   #392 <Method void CryptoInfo.setFromExtractorV16(MediaExtractor)>
			pendingSeekPositionUs = -1L;
	//  111  229:aload_0         
	//  112  230:ldc2w           #180 <Long -1L>
	//  113  233:putfield        #271 <Field long pendingSeekPositionUs>
			extractor.advance();
	//  114  236:aload_0         
	//  115  237:getfield        #206 <Field MediaExtractor extractor>
	//  116  240:invokevirtual   #395 <Method boolean MediaExtractor.advance()>
	//  117  243:pop             
			return -3;
	//  118  244:bipush          -3
	//  119  246:ireturn         
		}
		i = ((int) (byte0));
	//  120  247:iload           6
	//  121  249:istore_1        
		if(j < 0)
	//* 122  250:iload           7
	//* 123  252:ifge            257
			i = -1;
	//  124  255:iconst_m1       
	//  125  256:istore_1        
		return i;
	//  126  257:iload_1         
	//  127  258:ireturn         
	}

	public long readDiscontinuity(int i)
	{
		boolean aflag[] = pendingDiscontinuities;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field boolean[] pendingDiscontinuities>
	//    2    4:astore_2        
		if(aflag[i])
	//*   3    5:aload_2         
	//*   4    6:iload_1         
	//*   5    7:baload          
	//*   6    8:ifeq            20
		{
			aflag[i] = false;
	//    7   11:aload_2         
	//    8   12:iload_1         
	//    9   13:iconst_0        
	//   10   14:bastore         
			return lastSeekPositionUs;
	//   11   15:aload_0         
	//   12   16:getfield        #273 <Field long lastSeekPositionUs>
	//   13   19:lreturn         
		} else
		{
			return 0x0L;
	//   14   20:ldc2w           #398 <Long 0x0L>
	//   15   23:lreturn         
		}
	}

	public SampleSource.SampleSourceReader register()
	{
		remainingReleaseCount = remainingReleaseCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #403 <Field int remainingReleaseCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #403 <Field int remainingReleaseCount>
		return ((SampleSource.SampleSourceReader) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public void release()
	{
		boolean flag;
		if(remainingReleaseCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #403 <Field int remainingReleaseCount>
	//*   2    4:ifle            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		int i = remainingReleaseCount - 1;
	//   10   18:aload_0         
	//   11   19:getfield        #403 <Field int remainingReleaseCount>
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:istore_1        
		remainingReleaseCount = i;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:putfield        #403 <Field int remainingReleaseCount>
		if(i == 0)
	//*  18   30:iload_1         
	//*  19   31:ifne            52
		{
			MediaExtractor mediaextractor = extractor;
	//   20   34:aload_0         
	//   21   35:getfield        #206 <Field MediaExtractor extractor>
	//   22   38:astore_3        
			if(mediaextractor != null)
	//*  23   39:aload_3         
	//*  24   40:ifnull          52
			{
				mediaextractor.release();
	//   25   43:aload_3         
	//   26   44:invokevirtual   #406 <Method void MediaExtractor.release()>
				extractor = null;
	//   27   47:aload_0         
	//   28   48:aconst_null     
	//   29   49:putfield        #206 <Field MediaExtractor extractor>
			}
		}
	//   30   52:return          
	}

	public void seekToUs(long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field boolean prepared>
	//    2    4:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		seekToUsInternal(l, false);
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #297 <Method void seekToUsInternal(long, boolean)>
	//    7   13:return          
	}

	private static final int ALLOWED_FLAGS_MASK = 3;
	private static final int TRACK_STATE_DISABLED = 0;
	private static final int TRACK_STATE_ENABLED = 1;
	private static final int TRACK_STATE_FORMAT_SENT = 2;
	private final Context context;
	private MediaExtractor extractor;
	private final FileDescriptor fileDescriptor;
	private final long fileDescriptorLength;
	private final long fileDescriptorOffset;
	private final Map headers;
	private long lastSeekPositionUs;
	private boolean pendingDiscontinuities[];
	private long pendingSeekPositionUs;
	private IOException preparationError;
	private boolean prepared;
	private int remainingReleaseCount;
	private com.google.android.exoplayer.MediaFormat trackFormats[];
	private int trackStates[];
	private final Uri uri;
}
