// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.chunk.*;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.mp4.*;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest, SmoothStreamingTrackSelector

public class SmoothStreamingChunkSource
	implements ChunkSource, SmoothStreamingTrackSelector.Output
{
	private static final class ExposedTrack
	{

		public boolean isAdaptive()
		{
			return adaptiveFormats != null;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		private final Format adaptiveFormats[];
		private final int adaptiveMaxHeight;
		private final int adaptiveMaxWidth;
		private final int elementIndex;
		private final Format fixedFormat;
		public final MediaFormat trackFormat;


/*
		static int access$000(ExposedTrack exposedtrack)
		{
			return exposedtrack.elementIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int elementIndex>
		//    2    4:ireturn         
		}

*/


/*
		static Format[] access$100(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveFormats;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
		//    2    4:areturn         
		}

*/


/*
		static Format access$200(ExposedTrack exposedtrack)
		{
			return exposedtrack.fixedFormat;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Format fixedFormat>
		//    2    4:areturn         
		}

*/


/*
		static int access$300(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveMaxWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int adaptiveMaxWidth>
		//    2    4:ireturn         
		}

*/


/*
		static int access$400(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveMaxHeight;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int adaptiveMaxHeight>
		//    2    4:ireturn         
		}

*/

		public ExposedTrack(MediaFormat mediaformat, int i, Format format)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			trackFormat = mediaformat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field MediaFormat trackFormat>
			elementIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int elementIndex>
			fixedFormat = format;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Format fixedFormat>
			adaptiveFormats = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #30  <Field Format[] adaptiveFormats>
			adaptiveMaxWidth = -1;
		//   14   24:aload_0         
		//   15   25:iconst_m1       
		//   16   26:putfield        #32  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = -1;
		//   17   29:aload_0         
		//   18   30:iconst_m1       
		//   19   31:putfield        #34  <Field int adaptiveMaxHeight>
		//   20   34:return          
		}

		public ExposedTrack(MediaFormat mediaformat, int i, Format aformat[], int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			trackFormat = mediaformat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field MediaFormat trackFormat>
			elementIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int elementIndex>
			adaptiveFormats = aformat;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field Format[] adaptiveFormats>
			adaptiveMaxWidth = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = k;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #34  <Field int adaptiveMaxHeight>
			fixedFormat = null;
		//   17   31:aload_0         
		//   18   32:aconst_null     
		//   19   33:putfield        #28  <Field Format fixedFormat>
		//   20   36:return          
		}
	}


	public SmoothStreamingChunkSource(SmoothStreamingManifest smoothstreamingmanifest, SmoothStreamingTrackSelector smoothstreamingtrackselector, DataSource datasource, FormatEvaluator formatevaluator)
	{
		this(((ManifestFetcher) (null)), smoothstreamingmanifest, smoothstreamingtrackselector, datasource, formatevaluator, 0L);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:lconst_0        
	//    7    8:invokespecial   #57  <Method void SmoothStreamingChunkSource(ManifestFetcher, SmoothStreamingManifest, SmoothStreamingTrackSelector, DataSource, FormatEvaluator, long)>
	//    8   11:return          
	}

	private SmoothStreamingChunkSource(ManifestFetcher manifestfetcher, SmoothStreamingManifest smoothstreamingmanifest, SmoothStreamingTrackSelector smoothstreamingtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		manifestFetcher = manifestfetcher;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #63  <Field ManifestFetcher manifestFetcher>
		currentManifest = smoothstreamingmanifest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #65  <Field SmoothStreamingManifest currentManifest>
		trackSelector = smoothstreamingtrackselector;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #67  <Field SmoothStreamingTrackSelector trackSelector>
		dataSource = datasource;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #69  <Field DataSource dataSource>
		adaptiveFormatEvaluator = formatevaluator;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #71  <Field FormatEvaluator adaptiveFormatEvaluator>
		liveEdgeLatencyUs = l * 1000L;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:ldc2w           #72  <Long 1000L>
	//   20   37:lmul            
	//   21   38:putfield        #75  <Field long liveEdgeLatencyUs>
		evaluation = new com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation();
	//   22   41:aload_0         
	//   23   42:new             #77  <Class com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation>
	//   24   45:dup             
	//   25   46:invokespecial   #78  <Method void com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation()>
	//   26   49:putfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
		tracks = new ArrayList();
	//   27   52:aload_0         
	//   28   53:new             #82  <Class ArrayList>
	//   29   56:dup             
	//   30   57:invokespecial   #83  <Method void ArrayList()>
	//   31   60:putfield        #85  <Field ArrayList tracks>
		extractorWrappers = new SparseArray();
	//   32   63:aload_0         
	//   33   64:new             #87  <Class SparseArray>
	//   34   67:dup             
	//   35   68:invokespecial   #88  <Method void SparseArray()>
	//   36   71:putfield        #90  <Field SparseArray extractorWrappers>
		mediaFormats = new SparseArray();
	//   37   74:aload_0         
	//   38   75:new             #87  <Class SparseArray>
	//   39   78:dup             
	//   40   79:invokespecial   #88  <Method void SparseArray()>
	//   41   82:putfield        #92  <Field SparseArray mediaFormats>
		live = smoothstreamingmanifest.isLive;
	//   42   85:aload_0         
	//   43   86:aload_2         
	//   44   87:getfield        #97  <Field boolean SmoothStreamingManifest.isLive>
	//   45   90:putfield        #99  <Field boolean live>
		manifestfetcher = ((ManifestFetcher) (smoothstreamingmanifest.protectionElement));
	//   46   93:aload_2         
	//   47   94:getfield        #103 <Field SmoothStreamingManifest$ProtectionElement SmoothStreamingManifest.protectionElement>
	//   48   97:astore_1        
		if(manifestfetcher != null)
	//*  49   98:aload_1         
	//*  50   99:ifnull          171
		{
			smoothstreamingmanifest = ((SmoothStreamingManifest) (getProtectionElementKeyId(((SmoothStreamingManifest.ProtectionElement) (manifestfetcher)).data)));
	//   51  102:aload_1         
	//   52  103:getfield        #109 <Field byte[] SmoothStreamingManifest$ProtectionElement.data>
	//   53  106:invokestatic    #113 <Method byte[] getProtectionElementKeyId(byte[])>
	//   54  109:astore_2        
			trackEncryptionBoxes = new TrackEncryptionBox[1];
	//   55  110:aload_0         
	//   56  111:iconst_1        
	//   57  112:anewarray       TrackEncryptionBox[]
	//   58  115:putfield        #117 <Field TrackEncryptionBox[] trackEncryptionBoxes>
			trackEncryptionBoxes[0] = new TrackEncryptionBox(true, 8, ((byte []) (smoothstreamingmanifest)));
	//   59  118:aload_0         
	//   60  119:getfield        #117 <Field TrackEncryptionBox[] trackEncryptionBoxes>
	//   61  122:iconst_0        
	//   62  123:new             #115 <Class TrackEncryptionBox>
	//   63  126:dup             
	//   64  127:iconst_1        
	//   65  128:bipush          8
	//   66  130:aload_2         
	//   67  131:invokespecial   #120 <Method void TrackEncryptionBox(boolean, int, byte[])>
	//   68  134:aastore         
			drmInitData = new com.google.android.exoplayer.drm.DrmInitData.Mapped();
	//   69  135:aload_0         
	//   70  136:new             #122 <Class com.google.android.exoplayer.drm.DrmInitData$Mapped>
	//   71  139:dup             
	//   72  140:invokespecial   #123 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped()>
	//   73  143:putfield        #125 <Field com.google.android.exoplayer.drm.DrmInitData$Mapped drmInitData>
			drmInitData.put(((SmoothStreamingManifest.ProtectionElement) (manifestfetcher)).uuid, new com.google.android.exoplayer.drm.DrmInitData.SchemeInitData("video/mp4", ((SmoothStreamingManifest.ProtectionElement) (manifestfetcher)).data));
	//   74  146:aload_0         
	//   75  147:getfield        #125 <Field com.google.android.exoplayer.drm.DrmInitData$Mapped drmInitData>
	//   76  150:aload_1         
	//   77  151:getfield        #129 <Field java.util.UUID SmoothStreamingManifest$ProtectionElement.uuid>
	//   78  154:new             #131 <Class com.google.android.exoplayer.drm.DrmInitData$SchemeInitData>
	//   79  157:dup             
	//   80  158:ldc1            #133 <String "video/mp4">
	//   81  160:aload_1         
	//   82  161:getfield        #109 <Field byte[] SmoothStreamingManifest$ProtectionElement.data>
	//   83  164:invokespecial   #136 <Method void com.google.android.exoplayer.drm.DrmInitData$SchemeInitData(String, byte[])>
	//   84  167:invokevirtual   #140 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped.put(java.util.UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
			return;
	//   85  170:return          
		} else
		{
			trackEncryptionBoxes = null;
	//   86  171:aload_0         
	//   87  172:aconst_null     
	//   88  173:putfield        #117 <Field TrackEncryptionBox[] trackEncryptionBoxes>
			drmInitData = null;
	//   89  176:aload_0         
	//   90  177:aconst_null     
	//   91  178:putfield        #125 <Field com.google.android.exoplayer.drm.DrmInitData$Mapped drmInitData>
			return;
	//   92  181:return          
		}
	}

	public SmoothStreamingChunkSource(ManifestFetcher manifestfetcher, SmoothStreamingTrackSelector smoothstreamingtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l)
	{
		this(manifestfetcher, (SmoothStreamingManifest)manifestfetcher.getManifest(), smoothstreamingtrackselector, datasource, formatevaluator, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #149 <Method Object ManifestFetcher.getManifest()>
	//    4    6:checkcast       #94  <Class SmoothStreamingManifest>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:lload           5
	//    9   15:invokespecial   #57  <Method void SmoothStreamingChunkSource(ManifestFetcher, SmoothStreamingManifest, SmoothStreamingTrackSelector, DataSource, FormatEvaluator, long)>
	//   10   18:return          
	}

	private static long getLiveSeekPosition(SmoothStreamingManifest smoothstreamingmanifest, long l)
	{
		long l1 = 0x0L;
	//    0    0:ldc2w           #153 <Long 0x0L>
	//    1    3:lstore          4
		for(int i = 0; i < smoothstreamingmanifest.streamElements.length;)
	//*   2    5:iconst_0        
	//*   3    6:istore_3        
	//*   4    7:iload_3         
	//*   5    8:aload_0         
	//*   6    9:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//*   7   12:arraylength     
	//*   8   13:icmpge          79
		{
			SmoothStreamingManifest.StreamElement streamelement = smoothstreamingmanifest.streamElements[i];
	//    9   16:aload_0         
	//   10   17:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          8
			long l2 = l1;
	//   14   24:lload           4
	//   15   26:lstore          6
			if(streamelement.chunkCount > 0)
	//*  16   28:aload           8
	//*  17   30:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//*  18   33:ifle            68
				l2 = Math.max(l1, streamelement.getStartTimeUs(streamelement.chunkCount - 1) + streamelement.getChunkDurationUs(streamelement.chunkCount - 1));
	//   19   36:lload           4
	//   20   38:aload           8
	//   21   40:aload           8
	//   22   42:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:invokevirtual   #167 <Method long SmoothStreamingManifest$StreamElement.getStartTimeUs(int)>
	//   26   50:aload           8
	//   27   52:aload           8
	//   28   54:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//   29   57:iconst_1        
	//   30   58:isub            
	//   31   59:invokevirtual   #170 <Method long SmoothStreamingManifest$StreamElement.getChunkDurationUs(int)>
	//   32   62:ladd            
	//   33   63:invokestatic    #176 <Method long Math.max(long, long)>
	//   34   66:lstore          6
			i++;
	//   35   68:iload_3         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_3        
			l1 = l2;
	//   39   72:lload           6
	//   40   74:lstore          4
		}

	//*  41   76:goto            7
		return l1 - l;
	//   42   79:lload           4
	//   43   81:lload_1         
	//   44   82:lsub            
	//   45   83:lreturn         
	}

	private static int getManifestTrackIndex(SmoothStreamingManifest.StreamElement streamelement, Format format)
	{
		streamelement = ((SmoothStreamingManifest.StreamElement) (streamelement.tracks));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//    2    4:astore_0        
		for(int i = 0; i < streamelement.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmpge          35
			if(((SmoothStreamingManifest.TrackElement) (streamelement[i])).format.equals(((Object) (format))))
	//*   9   13:aload_0         
	//*  10   14:iload_2         
	//*  11   15:aaload          
	//*  12   16:getfield        #187 <Field Format SmoothStreamingManifest$TrackElement.format>
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #193 <Method boolean Format.equals(Object)>
	//*  15   23:ifeq            28
				return i;
	//   16   26:iload_2         
	//   17   27:ireturn         

	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
	//*  22   32:goto            7
		streamelement = ((SmoothStreamingManifest.StreamElement) (new StringBuilder()));
	//   23   35:new             #195 <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #196 <Method void StringBuilder()>
	//   26   42:astore_0        
		((StringBuilder) (streamelement)).append("Invalid format: ");
	//   27   43:aload_0         
	//   28   44:ldc1            #198 <String "Invalid format: ">
	//   29   46:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   30   49:pop             
		((StringBuilder) (streamelement)).append(((Object) (format)));
	//   31   50:aload_0         
	//   32   51:aload_1         
	//   33   52:invokevirtual   #205 <Method StringBuilder StringBuilder.append(Object)>
	//   34   55:pop             
		throw new IllegalStateException(((StringBuilder) (streamelement)).toString());
	//   35   56:new             #207 <Class IllegalStateException>
	//   36   59:dup             
	//   37   60:aload_0         
	//   38   61:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   39   64:invokespecial   #214 <Method void IllegalStateException(String)>
	//   40   67:athrow          
	}

	private static int getManifestTrackKey(int i, int j)
	{
		boolean flag;
		if(i <= 0x10000 && j <= 0x10000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #217 <Int 0x10000>
	//*   2    3:icmpgt          17
	//*   3    6:iload_1         
	//*   4    7:ldc1            #217 <Int 0x10000>
	//*   5    9:icmpgt          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		Assertions.checkState(flag);
	//   11   19:iload_2         
	//   12   20:invokestatic    #223 <Method void Assertions.checkState(boolean)>
		return i << 16 | j;
	//   13   23:iload_0         
	//   14   24:bipush          16
	//   15   26:ishl            
	//   16   27:iload_1         
	//   17   28:ior             
	//   18   29:ireturn         
	}

	private static byte[] getProtectionElementKeyId(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #195 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < abyte0.length; i += 2)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          32
			stringbuilder.append((char)abyte0[i]);
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:int2char        
	//   15   21:invokevirtual   #226 <Method StringBuilder StringBuilder.append(char)>
	//   16   24:pop             

	//   17   25:iload_1         
	//   18   26:iconst_2        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            10
		abyte0 = ((byte []) (stringbuilder.toString()));
	//   22   32:aload_2         
	//   23   33:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   24   36:astore_0        
		abyte0 = Base64.decode(((String) (abyte0)).substring(((String) (abyte0)).indexOf("<KID>") + 5, ((String) (abyte0)).indexOf("</KID>")), 0);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:ldc1            #228 <String "<KID>">
	//   28   41:invokevirtual   #234 <Method int String.indexOf(String)>
	//   29   44:iconst_5        
	//   30   45:iadd            
	//   31   46:aload_0         
	//   32   47:ldc1            #236 <String "</KID>">
	//   33   49:invokevirtual   #234 <Method int String.indexOf(String)>
	//   34   52:invokevirtual   #240 <Method String String.substring(int, int)>
	//   35   55:iconst_0        
	//   36   56:invokestatic    #246 <Method byte[] Base64.decode(String, int)>
	//   37   59:astore_0        
		swap(abyte0, 0, 3);
	//   38   60:aload_0         
	//   39   61:iconst_0        
	//   40   62:iconst_3        
	//   41   63:invokestatic    #250 <Method void swap(byte[], int, int)>
		swap(abyte0, 1, 2);
	//   42   66:aload_0         
	//   43   67:iconst_1        
	//   44   68:iconst_2        
	//   45   69:invokestatic    #250 <Method void swap(byte[], int, int)>
		swap(abyte0, 4, 5);
	//   46   72:aload_0         
	//   47   73:iconst_4        
	//   48   74:iconst_5        
	//   49   75:invokestatic    #250 <Method void swap(byte[], int, int)>
		swap(abyte0, 6, 7);
	//   50   78:aload_0         
	//   51   79:bipush          6
	//   52   81:bipush          7
	//   53   83:invokestatic    #250 <Method void swap(byte[], int, int)>
		return abyte0;
	//   54   86:aload_0         
	//   55   87:areturn         
	}

	private MediaFormat initManifestTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int j)
	{
		int k = getManifestTrackKey(i, j);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #254 <Method int getManifestTrackKey(int, int)>
	//    3    5:istore          5
		Object obj = ((Object) ((MediaFormat)mediaFormats.get(k)));
	//    4    7:aload_0         
	//    5    8:getfield        #92  <Field SparseArray mediaFormats>
	//    6   11:iload           5
	//    7   13:invokevirtual   #258 <Method Object SparseArray.get(int)>
	//    8   16:checkcast       #260 <Class MediaFormat>
	//    9   19:astore          10
		if(obj != null)
	//*  10   21:aload           10
	//*  11   23:ifnull          29
			return ((MediaFormat) (obj));
	//   12   26:aload           10
	//   13   28:areturn         
		long l;
		if(live)
	//*  14   29:aload_0         
	//*  15   30:getfield        #99  <Field boolean live>
	//*  16   33:ifeq            44
			l = -1L;
	//   17   36:ldc2w           #261 <Long -1L>
	//   18   39:lstore          6
		else
	//*  19   41:goto            50
			l = smoothstreamingmanifest.durationUs;
	//   20   44:aload_1         
	//   21   45:getfield        #265 <Field long SmoothStreamingManifest.durationUs>
	//   22   48:lstore          6
		obj = ((Object) (smoothstreamingmanifest.streamElements[i]));
	//   23   50:aload_1         
	//   24   51:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   25   54:iload_2         
	//   26   55:aaload          
	//   27   56:astore          10
		Format format = ((SmoothStreamingManifest.StreamElement) (obj)).tracks[j].format;
	//   28   58:aload           10
	//   29   60:getfield        #181 <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//   30   63:iload_3         
	//   31   64:aaload          
	//   32   65:getfield        #187 <Field Format SmoothStreamingManifest$TrackElement.format>
	//   33   68:astore          11
		smoothstreamingmanifest = ((SmoothStreamingManifest) (((SmoothStreamingManifest.StreamElement) (obj)).tracks[j].csd));
	//   34   70:aload           10
	//   35   72:getfield        #181 <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//   36   75:iload_3         
	//   37   76:aaload          
	//   38   77:getfield        #269 <Field byte[][] SmoothStreamingManifest$TrackElement.csd>
	//   39   80:astore_1        
		switch(((SmoothStreamingManifest.StreamElement) (obj)).type)
	//*  40   81:aload           10
	//*  41   83:getfield        #272 <Field int SmoothStreamingManifest$StreamElement.type>
		{
	//*  42   86:tableswitch     0 2: default 112
	//	               0 226
	//	               1 183
	//	               2 150
		default:
			smoothstreamingmanifest = ((SmoothStreamingManifest) (new StringBuilder()));
	//   43  112:new             #195 <Class StringBuilder>
	//   44  115:dup             
	//   45  116:invokespecial   #196 <Method void StringBuilder()>
	//   46  119:astore_1        
			((StringBuilder) (smoothstreamingmanifest)).append("Invalid type: ");
	//   47  120:aload_1         
	//   48  121:ldc2            #274 <String "Invalid type: ">
	//   49  124:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   50  127:pop             
			((StringBuilder) (smoothstreamingmanifest)).append(((SmoothStreamingManifest.StreamElement) (obj)).type);
	//   51  128:aload_1         
	//   52  129:aload           10
	//   53  131:getfield        #272 <Field int SmoothStreamingManifest$StreamElement.type>
	//   54  134:invokevirtual   #277 <Method StringBuilder StringBuilder.append(int)>
	//   55  137:pop             
			throw new IllegalStateException(((StringBuilder) (smoothstreamingmanifest)).toString());
	//   56  138:new             #207 <Class IllegalStateException>
	//   57  141:dup             
	//   58  142:aload_1         
	//   59  143:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   60  146:invokespecial   #214 <Method void IllegalStateException(String)>
	//   61  149:athrow          

		case 2: // '\002'
			smoothstreamingmanifest = ((SmoothStreamingManifest) (MediaFormat.createTextFormat(format.id, format.mimeType, format.bitrate, l, format.language)));
	//   62  150:aload           11
	//   63  152:getfield        #281 <Field String Format.id>
	//   64  155:aload           11
	//   65  157:getfield        #284 <Field String Format.mimeType>
	//   66  160:aload           11
	//   67  162:getfield        #287 <Field int Format.bitrate>
	//   68  165:lload           6
	//   69  167:aload           11
	//   70  169:getfield        #290 <Field String Format.language>
	//   71  172:invokestatic    #294 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//   72  175:astore_1        
			i = Track.TYPE_text;
	//   73  176:getstatic       #299 <Field int Track.TYPE_text>
	//   74  179:istore_2        
			break;
	//   75  180:goto            297

		case 1: // '\001'
			smoothstreamingmanifest = ((SmoothStreamingManifest) (MediaFormat.createVideoFormat(format.id, format.mimeType, format.bitrate, -1, l, format.width, format.height, Arrays.asList(((Object []) (smoothstreamingmanifest))))));
	//   76  183:aload           11
	//   77  185:getfield        #281 <Field String Format.id>
	//   78  188:aload           11
	//   79  190:getfield        #284 <Field String Format.mimeType>
	//   80  193:aload           11
	//   81  195:getfield        #287 <Field int Format.bitrate>
	//   82  198:iconst_m1       
	//   83  199:lload           6
	//   84  201:aload           11
	//   85  203:getfield        #302 <Field int Format.width>
	//   86  206:aload           11
	//   87  208:getfield        #305 <Field int Format.height>
	//   88  211:aload_1         
	//   89  212:invokestatic    #311 <Method List Arrays.asList(Object[])>
	//   90  215:invokestatic    #315 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List)>
	//   91  218:astore_1        
			i = Track.TYPE_vide;
	//   92  219:getstatic       #318 <Field int Track.TYPE_vide>
	//   93  222:istore_2        
			break;
	//   94  223:goto            297

		case 0: // '\0'
			if(smoothstreamingmanifest != null)
	//*  95  226:aload_1         
	//*  96  227:ifnull          238
				smoothstreamingmanifest = ((SmoothStreamingManifest) (Arrays.asList(((Object []) (smoothstreamingmanifest)))));
	//   97  230:aload_1         
	//   98  231:invokestatic    #311 <Method List Arrays.asList(Object[])>
	//   99  234:astore_1        
			else
	//* 100  235:goto            255
				smoothstreamingmanifest = ((SmoothStreamingManifest) (Collections.singletonList(((Object) (CodecSpecificDataUtil.buildAacAudioSpecificConfig(format.audioSamplingRate, format.audioChannels))))));
	//  101  238:aload           11
	//  102  240:getfield        #321 <Field int Format.audioSamplingRate>
	//  103  243:aload           11
	//  104  245:getfield        #324 <Field int Format.audioChannels>
	//  105  248:invokestatic    #330 <Method byte[] CodecSpecificDataUtil.buildAacAudioSpecificConfig(int, int)>
	//  106  251:invokestatic    #336 <Method List Collections.singletonList(Object)>
	//  107  254:astore_1        
			smoothstreamingmanifest = ((SmoothStreamingManifest) (MediaFormat.createAudioFormat(format.id, format.mimeType, format.bitrate, -1, l, format.audioChannels, format.audioSamplingRate, ((List) (smoothstreamingmanifest)), format.language)));
	//  108  255:aload           11
	//  109  257:getfield        #281 <Field String Format.id>
	//  110  260:aload           11
	//  111  262:getfield        #284 <Field String Format.mimeType>
	//  112  265:aload           11
	//  113  267:getfield        #287 <Field int Format.bitrate>
	//  114  270:iconst_m1       
	//  115  271:lload           6
	//  116  273:aload           11
	//  117  275:getfield        #324 <Field int Format.audioChannels>
	//  118  278:aload           11
	//  119  280:getfield        #321 <Field int Format.audioSamplingRate>
	//  120  283:aload_1         
	//  121  284:aload           11
	//  122  286:getfield        #290 <Field String Format.language>
	//  123  289:invokestatic    #340 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String)>
	//  124  292:astore_1        
			i = Track.TYPE_soun;
	//  125  293:getstatic       #343 <Field int Track.TYPE_soun>
	//  126  296:istore_2        
			break;
		}
		long l1 = ((SmoothStreamingManifest.StreamElement) (obj)).timescale;
	//  127  297:aload           10
	//  128  299:getfield        #346 <Field long SmoothStreamingManifest$StreamElement.timescale>
	//  129  302:lstore          8
		TrackEncryptionBox atrackencryptionbox[] = trackEncryptionBoxes;
	//  130  304:aload_0         
	//  131  305:getfield        #117 <Field TrackEncryptionBox[] trackEncryptionBoxes>
	//  132  308:astore          10
		byte byte0;
		if(i == Track.TYPE_vide)
	//* 133  310:iload_2         
	//* 134  311:getstatic       #318 <Field int Track.TYPE_vide>
	//* 135  314:icmpne          323
			byte0 = 4;
	//  136  317:iconst_4        
	//  137  318:istore          4
		else
	//* 138  320:goto            326
			byte0 = -1;
	//  139  323:iconst_m1       
	//  140  324:istore          4
		atrackencryptionbox = ((TrackEncryptionBox []) (new FragmentedMp4Extractor(3, new Track(j, i, l1, -1L, l, ((MediaFormat) (smoothstreamingmanifest)), atrackencryptionbox, ((int) (byte0)), ((long []) (null)), ((long []) (null))))));
	//  141  326:new             #348 <Class FragmentedMp4Extractor>
	//  142  329:dup             
	//  143  330:iconst_3        
	//  144  331:new             #296 <Class Track>
	//  145  334:dup             
	//  146  335:iload_3         
	//  147  336:iload_2         
	//  148  337:lload           8
	//  149  339:ldc2w           #261 <Long -1L>
	//  150  342:lload           6
	//  151  344:aload_1         
	//  152  345:aload           10
	//  153  347:iload           4
	//  154  349:aconst_null     
	//  155  350:aconst_null     
	//  156  351:invokespecial   #351 <Method void Track(int, int, long, long, long, MediaFormat, TrackEncryptionBox[], int, long[], long[])>
	//  157  354:invokespecial   #354 <Method void FragmentedMp4Extractor(int, Track)>
	//  158  357:astore          10
		mediaFormats.put(k, ((Object) (smoothstreamingmanifest)));
	//  159  359:aload_0         
	//  160  360:getfield        #92  <Field SparseArray mediaFormats>
	//  161  363:iload           5
	//  162  365:aload_1         
	//  163  366:invokevirtual   #357 <Method void SparseArray.put(int, Object)>
		extractorWrappers.put(k, ((Object) (new ChunkExtractorWrapper(((com.google.android.exoplayer.extractor.Extractor) (atrackencryptionbox))))));
	//  164  369:aload_0         
	//  165  370:getfield        #90  <Field SparseArray extractorWrappers>
	//  166  373:iload           5
	//  167  375:new             #359 <Class ChunkExtractorWrapper>
	//  168  378:dup             
	//  169  379:aload           10
	//  170  381:invokespecial   #362 <Method void ChunkExtractorWrapper(com.google.android.exoplayer.extractor.Extractor)>
	//  171  384:invokevirtual   #357 <Method void SparseArray.put(int, Object)>
		return ((MediaFormat) (smoothstreamingmanifest));
	//  172  387:aload_1         
	//  173  388:areturn         
	}

	private static MediaChunk newMediaChunk(Format format, Uri uri, String s, ChunkExtractorWrapper chunkextractorwrapper, DrmInitData drminitdata, DataSource datasource, int i, long l, long l1, int j, MediaFormat mediaformat, int k, int i1)
	{
		return ((MediaChunk) (new ContainerMediaChunk(datasource, new DataSpec(uri, 0L, -1L, s), j, format, l, l1, i, l, chunkextractorwrapper, mediaformat, k, i1, drminitdata, true, -1)));
	//    0    0:new             #366 <Class ContainerMediaChunk>
	//    1    3:dup             
	//    2    4:aload           5
	//    3    6:new             #368 <Class DataSpec>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:lconst_0        
	//    7   12:ldc2w           #261 <Long -1L>
	//    8   15:aload_2         
	//    9   16:invokespecial   #371 <Method void DataSpec(Uri, long, long, String)>
	//   10   19:iload           11
	//   11   21:aload_0         
	//   12   22:lload           7
	//   13   24:lload           9
	//   14   26:iload           6
	//   15   28:lload           7
	//   16   30:aload_3         
	//   17   31:aload           12
	//   18   33:iload           13
	//   19   35:iload           14
	//   20   37:aload           4
	//   21   39:iconst_1        
	//   22   40:iconst_m1       
	//   23   41:invokespecial   #374 <Method void ContainerMediaChunk(DataSource, DataSpec, int, Format, long, long, int, long, ChunkExtractorWrapper, MediaFormat, int, int, DrmInitData, boolean, int)>
	//   24   44:areturn         
	}

	private static void swap(byte abyte0[], int i, int j)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_3        
		abyte0[i] = abyte0[j];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:aload_0         
	//    7    7:iload_2         
	//    8    8:baload          
	//    9    9:bastore         
		abyte0[j] = byte0;
	//   10   10:aload_0         
	//   11   11:iload_2         
	//   12   12:iload_3         
	//   13   13:bastore         
	//   14   14:return          
	}

	public void adaptiveTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int ai[])
	{
		if(adaptiveFormatEvaluator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field FormatEvaluator adaptiveFormatEvaluator>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		SmoothStreamingManifest.StreamElement streamelement = smoothstreamingmanifest.streamElements[i];
	//    4    8:aload_1         
	//    5    9:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//    6   12:iload_2         
	//    7   13:aaload          
	//    8   14:astore          11
		Format aformat[] = new Format[ai.length];
	//    9   16:aload_3         
	//   10   17:arraylength     
	//   11   18:anewarray       Format[]
	//   12   21:astore          10
		int k = 0;
	//   13   23:iconst_0        
	//   14   24:istore          5
		int l = -1;
	//   15   26:iconst_m1       
	//   16   27:istore          6
		int j = l;
	//   17   29:iload           6
	//   18   31:istore          4
		MediaFormat mediaformat = null;
	//   19   33:aconst_null     
	//   20   34:astore          8
		for(; k < aformat.length; k++)
	//*  21   36:iload           5
	//*  22   38:aload           10
	//*  23   40:arraylength     
	//*  24   41:icmpge          128
		{
			int i1 = ai[k];
	//   25   44:aload_3         
	//   26   45:iload           5
	//   27   47:iaload          
	//   28   48:istore          7
			aformat[k] = streamelement.tracks[i1].format;
	//   29   50:aload           10
	//   30   52:iload           5
	//   31   54:aload           11
	//   32   56:getfield        #181 <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//   33   59:iload           7
	//   34   61:aaload          
	//   35   62:getfield        #187 <Field Format SmoothStreamingManifest$TrackElement.format>
	//   36   65:aastore         
			MediaFormat mediaformat1 = initManifestTrack(smoothstreamingmanifest, i, i1);
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:iload_2         
	//   40   69:iload           7
	//   41   71:invokespecial   #378 <Method MediaFormat initManifestTrack(SmoothStreamingManifest, int, int)>
	//   42   74:astore          9
			if(mediaformat == null || mediaformat1.height > j)
	//*  43   76:aload           8
	//*  44   78:ifnull          91
	//*  45   81:aload           9
	//*  46   83:getfield        #379 <Field int MediaFormat.height>
	//*  47   86:iload           4
	//*  48   88:icmple          95
				mediaformat = mediaformat1;
	//   49   91:aload           9
	//   50   93:astore          8
			l = Math.max(l, mediaformat1.width);
	//   51   95:iload           6
	//   52   97:aload           9
	//   53   99:getfield        #380 <Field int MediaFormat.width>
	//   54  102:invokestatic    #382 <Method int Math.max(int, int)>
	//   55  105:istore          6
			j = Math.max(j, mediaformat1.height);
	//   56  107:iload           4
	//   57  109:aload           9
	//   58  111:getfield        #379 <Field int MediaFormat.height>
	//   59  114:invokestatic    #382 <Method int Math.max(int, int)>
	//   60  117:istore          4
		}

	//   61  119:iload           5
	//   62  121:iconst_1        
	//   63  122:iadd            
	//   64  123:istore          5
	//*  65  125:goto            36
		Arrays.sort(((Object []) (aformat)), ((java.util.Comparator) (new com.google.android.exoplayer.chunk.Format.DecreasingBandwidthComparator())));
	//   66  128:aload           10
	//   67  130:new             #384 <Class com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator>
	//   68  133:dup             
	//   69  134:invokespecial   #385 <Method void com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator()>
	//   70  137:invokestatic    #389 <Method void Arrays.sort(Object[], java.util.Comparator)>
		smoothstreamingmanifest = ((SmoothStreamingManifest) (mediaformat.copyAsAdaptive(((String) (null)))));
	//   71  140:aload           8
	//   72  142:aconst_null     
	//   73  143:invokevirtual   #393 <Method MediaFormat MediaFormat.copyAsAdaptive(String)>
	//   74  146:astore_1        
		tracks.add(((Object) (new ExposedTrack(((MediaFormat) (smoothstreamingmanifest)), i, aformat, l, j))));
	//   75  147:aload_0         
	//   76  148:getfield        #85  <Field ArrayList tracks>
	//   77  151:new             #10  <Class SmoothStreamingChunkSource$ExposedTrack>
	//   78  154:dup             
	//   79  155:aload_1         
	//   80  156:iload_2         
	//   81  157:aload           10
	//   82  159:iload           6
	//   83  161:iload           4
	//   84  163:invokespecial   #396 <Method void SmoothStreamingChunkSource$ExposedTrack(MediaFormat, int, Format[], int, int)>
	//   85  166:invokevirtual   #399 <Method boolean ArrayList.add(Object)>
	//   86  169:pop             
	//   87  170:return          
	}

	public void continueBuffering(long l)
	{
		if(manifestFetcher != null && currentManifest.isLive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//*   2    4:ifnull          232
	//*   3    7:aload_0         
	//*   4    8:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//*   5   11:getfield        #97  <Field boolean SmoothStreamingManifest.isLive>
	//*   6   14:ifeq            232
		{
			if(fatalError != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #403 <Field IOException fatalError>
	//*   9   21:ifnull          25
				return;
	//   10   24:return          
			SmoothStreamingManifest smoothstreamingmanifest = (SmoothStreamingManifest)manifestFetcher.getManifest();
	//   11   25:aload_0         
	//   12   26:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//   13   29:invokevirtual   #149 <Method Object ManifestFetcher.getManifest()>
	//   14   32:checkcast       #94  <Class SmoothStreamingManifest>
	//   15   35:astore          9
			Object obj = ((Object) (currentManifest));
	//   16   37:aload_0         
	//   17   38:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//   18   41:astore          10
			if(obj != smoothstreamingmanifest && smoothstreamingmanifest != null)
	//*  19   43:aload           10
	//*  20   45:aload           9
	//*  21   47:if_acmpeq       199
	//*  22   50:aload           9
	//*  23   52:ifnull          199
			{
				obj = ((Object) (((SmoothStreamingManifest) (obj)).streamElements[enabledTrack.elementIndex]));
	//   24   55:aload           10
	//   25   57:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   26   60:aload_0         
	//   27   61:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//   28   64:invokestatic    #409 <Method int SmoothStreamingChunkSource$ExposedTrack.access$000(SmoothStreamingChunkSource$ExposedTrack)>
	//   29   67:aaload          
	//   30   68:astore          10
				int i = ((SmoothStreamingManifest.StreamElement) (obj)).chunkCount;
	//   31   70:aload           10
	//   32   72:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//   33   75:istore_3        
				SmoothStreamingManifest.StreamElement streamelement = smoothstreamingmanifest.streamElements[enabledTrack.elementIndex];
	//   34   76:aload           9
	//   35   78:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   36   81:aload_0         
	//   37   82:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//   38   85:invokestatic    #409 <Method int SmoothStreamingChunkSource$ExposedTrack.access$000(SmoothStreamingChunkSource$ExposedTrack)>
	//   39   88:aaload          
	//   40   89:astore          11
				if(i != 0 && streamelement.chunkCount != 0)
	//*  41   91:iload_3         
	//*  42   92:ifeq            178
	//*  43   95:aload           11
	//*  44   97:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//*  45  100:ifne            106
	//*  46  103:goto            178
				{
					int j = i - 1;
	//   47  106:iload_3         
	//   48  107:iconst_1        
	//   49  108:isub            
	//   50  109:istore          4
					l = ((SmoothStreamingManifest.StreamElement) (obj)).getStartTimeUs(j);
	//   51  111:aload           10
	//   52  113:iload           4
	//   53  115:invokevirtual   #167 <Method long SmoothStreamingManifest$StreamElement.getStartTimeUs(int)>
	//   54  118:lstore_1        
					long l1 = ((SmoothStreamingManifest.StreamElement) (obj)).getChunkDurationUs(j);
	//   55  119:aload           10
	//   56  121:iload           4
	//   57  123:invokevirtual   #170 <Method long SmoothStreamingManifest$StreamElement.getChunkDurationUs(int)>
	//   58  126:lstore          5
					long l2 = streamelement.getStartTimeUs(0);
	//   59  128:aload           11
	//   60  130:iconst_0        
	//   61  131:invokevirtual   #167 <Method long SmoothStreamingManifest$StreamElement.getStartTimeUs(int)>
	//   62  134:lstore          7
					if(l + l1 <= l2)
	//*  63  136:lload_1         
	//*  64  137:lload           5
	//*  65  139:ladd            
	//*  66  140:lload           7
	//*  67  142:lcmp            
	//*  68  143:ifgt            159
						currentManifestChunkOffset = currentManifestChunkOffset + i;
	//   69  146:aload_0         
	//   70  147:aload_0         
	//   71  148:getfield        #411 <Field int currentManifestChunkOffset>
	//   72  151:iload_3         
	//   73  152:iadd            
	//   74  153:putfield        #411 <Field int currentManifestChunkOffset>
					else
	//*  75  156:goto            188
						currentManifestChunkOffset = currentManifestChunkOffset + ((SmoothStreamingManifest.StreamElement) (obj)).getChunkIndex(l2);
	//   76  159:aload_0         
	//   77  160:aload_0         
	//   78  161:getfield        #411 <Field int currentManifestChunkOffset>
	//   79  164:aload           10
	//   80  166:lload           7
	//   81  168:invokevirtual   #415 <Method int SmoothStreamingManifest$StreamElement.getChunkIndex(long)>
	//   82  171:iadd            
	//   83  172:putfield        #411 <Field int currentManifestChunkOffset>
				} else
	//*  84  175:goto            188
				{
					currentManifestChunkOffset = currentManifestChunkOffset + i;
	//   85  178:aload_0         
	//   86  179:aload_0         
	//   87  180:getfield        #411 <Field int currentManifestChunkOffset>
	//   88  183:iload_3         
	//   89  184:iadd            
	//   90  185:putfield        #411 <Field int currentManifestChunkOffset>
				}
				currentManifest = smoothstreamingmanifest;
	//   91  188:aload_0         
	//   92  189:aload           9
	//   93  191:putfield        #65  <Field SmoothStreamingManifest currentManifest>
				needManifestRefresh = false;
	//   94  194:aload_0         
	//   95  195:iconst_0        
	//   96  196:putfield        #417 <Field boolean needManifestRefresh>
			}
			if(needManifestRefresh && SystemClock.elapsedRealtime() > manifestFetcher.getManifestLoadStartTimestamp() + 5000L)
	//*  97  199:aload_0         
	//*  98  200:getfield        #417 <Field boolean needManifestRefresh>
	//*  99  203:ifeq            231
	//* 100  206:invokestatic    #423 <Method long SystemClock.elapsedRealtime()>
	//* 101  209:aload_0         
	//* 102  210:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//* 103  213:invokevirtual   #426 <Method long ManifestFetcher.getManifestLoadStartTimestamp()>
	//* 104  216:ldc2w           #427 <Long 5000L>
	//* 105  219:ladd            
	//* 106  220:lcmp            
	//* 107  221:ifle            231
				manifestFetcher.requestRefresh();
	//  108  224:aload_0         
	//  109  225:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//  110  228:invokevirtual   #431 <Method void ManifestFetcher.requestRefresh()>
			return;
	//  111  231:return          
		} else
		{
			return;
	//  112  232:return          
		}
	}

	public void disable(List list)
	{
		if(enabledTrack.isAdaptive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//*   2    4:invokevirtual   #437 <Method boolean SmoothStreamingChunkSource$ExposedTrack.isAdaptive()>
	//*   3    7:ifeq            19
			adaptiveFormatEvaluator.disable();
	//    4   10:aload_0         
	//    5   11:getfield        #71  <Field FormatEvaluator adaptiveFormatEvaluator>
	//    6   14:invokeinterface #441 <Method void FormatEvaluator.disable()>
		list = ((List) (manifestFetcher));
	//    7   19:aload_0         
	//    8   20:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//    9   23:astore_1        
		if(list != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          32
			((ManifestFetcher) (list)).disable();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #442 <Method void ManifestFetcher.disable()>
		evaluation.format = null;
	//   14   32:aload_0         
	//   15   33:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   16   36:aconst_null     
	//   17   37:putfield        #443 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
		fatalError = null;
	//   18   40:aload_0         
	//   19   41:aconst_null     
	//   20   42:putfield        #403 <Field IOException fatalError>
	//   21   45:return          
	}

	public void enable(int i)
	{
		enabledTrack = (ExposedTrack)tracks.get(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #85  <Field ArrayList tracks>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #447 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #10  <Class SmoothStreamingChunkSource$ExposedTrack>
	//    6   12:putfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
		if(enabledTrack.isAdaptive())
	//*   7   15:aload_0         
	//*   8   16:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//*   9   19:invokevirtual   #437 <Method boolean SmoothStreamingChunkSource$ExposedTrack.isAdaptive()>
	//*  10   22:ifeq            34
			adaptiveFormatEvaluator.enable();
	//   11   25:aload_0         
	//   12   26:getfield        #71  <Field FormatEvaluator adaptiveFormatEvaluator>
	//   13   29:invokeinterface #449 <Method void FormatEvaluator.enable()>
		ManifestFetcher manifestfetcher = manifestFetcher;
	//   14   34:aload_0         
	//   15   35:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//   16   38:astore_2        
		if(manifestfetcher != null)
	//*  17   39:aload_2         
	//*  18   40:ifnull          47
			manifestfetcher.enable();
	//   19   43:aload_2         
	//   20   44:invokevirtual   #450 <Method void ManifestFetcher.enable()>
	//   21   47:return          
	}

	public void fixedTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int j)
	{
		MediaFormat mediaformat = initManifestTrack(smoothstreamingmanifest, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #378 <Method MediaFormat initManifestTrack(SmoothStreamingManifest, int, int)>
	//    5    7:astore          4
		smoothstreamingmanifest = ((SmoothStreamingManifest) (smoothstreamingmanifest.streamElements[i].tracks[j].format));
	//    6    9:aload_1         
	//    7   10:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//    8   13:iload_2         
	//    9   14:aaload          
	//   10   15:getfield        #181 <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//   11   18:iload_3         
	//   12   19:aaload          
	//   13   20:getfield        #187 <Field Format SmoothStreamingManifest$TrackElement.format>
	//   14   23:astore_1        
		tracks.add(((Object) (new ExposedTrack(mediaformat, i, ((Format) (smoothstreamingmanifest))))));
	//   15   24:aload_0         
	//   16   25:getfield        #85  <Field ArrayList tracks>
	//   17   28:new             #10  <Class SmoothStreamingChunkSource$ExposedTrack>
	//   18   31:dup             
	//   19   32:aload           4
	//   20   34:iload_2         
	//   21   35:aload_1         
	//   22   36:invokespecial   #455 <Method void SmoothStreamingChunkSource$ExposedTrack(MediaFormat, int, Format)>
	//   23   39:invokevirtual   #399 <Method boolean ArrayList.add(Object)>
	//   24   42:pop             
	//   25   43:return          
	}

	public final void getChunkOperation(List list, long l, ChunkOperationHolder chunkoperationholder)
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #403 <Field IOException fatalError>
	//*   2    4:ifnull          14
		{
			chunkoperationholder.chunk = null;
	//    3    7:aload           4
	//    4    9:aconst_null     
	//    5   10:putfield        #463 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//    6   13:return          
		}
		evaluation.queueSize = list.size();
	//    7   14:aload_0         
	//    8   15:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//    9   18:aload_1         
	//   10   19:invokeinterface #469 <Method int List.size()>
	//   11   24:putfield        #472 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.queueSize>
		if(enabledTrack.isAdaptive())
	//*  12   27:aload_0         
	//*  13   28:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//*  14   31:invokevirtual   #437 <Method boolean SmoothStreamingChunkSource$ExposedTrack.isAdaptive()>
	//*  15   34:ifeq            62
		{
			adaptiveFormatEvaluator.evaluate(list, l, enabledTrack.adaptiveFormats, evaluation);
	//   16   37:aload_0         
	//   17   38:getfield        #71  <Field FormatEvaluator adaptiveFormatEvaluator>
	//   18   41:aload_1         
	//   19   42:lload_2         
	//   20   43:aload_0         
	//   21   44:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//   22   47:invokestatic    #476 <Method Format[] SmoothStreamingChunkSource$ExposedTrack.access$100(SmoothStreamingChunkSource$ExposedTrack)>
	//   23   50:aload_0         
	//   24   51:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   25   54:invokeinterface #480 <Method void FormatEvaluator.evaluate(List, long, Format[], com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation)>
		} else
	//*  26   59:goto            84
		{
			evaluation.format = enabledTrack.fixedFormat;
	//   27   62:aload_0         
	//   28   63:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   29   66:aload_0         
	//   30   67:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//   31   70:invokestatic    #484 <Method Format SmoothStreamingChunkSource$ExposedTrack.access$200(SmoothStreamingChunkSource$ExposedTrack)>
	//   32   73:putfield        #443 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
			evaluation.trigger = 2;
	//   33   76:aload_0         
	//   34   77:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   35   80:iconst_2        
	//   36   81:putfield        #487 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.trigger>
		}
		Format format = evaluation.format;
	//   37   84:aload_0         
	//   38   85:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   39   88:getfield        #443 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
	//   40   91:astore          11
		chunkoperationholder.queueSize = evaluation.queueSize;
	//   41   93:aload           4
	//   42   95:aload_0         
	//   43   96:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   44   99:getfield        #472 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.queueSize>
	//   45  102:putfield        #488 <Field int ChunkOperationHolder.queueSize>
		if(format == null)
	//*  46  105:aload           11
	//*  47  107:ifnonnull       117
		{
			chunkoperationholder.chunk = null;
	//   48  110:aload           4
	//   49  112:aconst_null     
	//   50  113:putfield        #463 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//   51  116:return          
		}
		if(chunkoperationholder.queueSize == list.size() && chunkoperationholder.chunk != null && chunkoperationholder.chunk.format.equals(((Object) (format))))
	//*  52  117:aload           4
	//*  53  119:getfield        #488 <Field int ChunkOperationHolder.queueSize>
	//*  54  122:aload_1         
	//*  55  123:invokeinterface #469 <Method int List.size()>
	//*  56  128:icmpne          156
	//*  57  131:aload           4
	//*  58  133:getfield        #463 <Field Chunk ChunkOperationHolder.chunk>
	//*  59  136:ifnull          156
	//*  60  139:aload           4
	//*  61  141:getfield        #463 <Field Chunk ChunkOperationHolder.chunk>
	//*  62  144:getfield        #491 <Field Format Chunk.format>
	//*  63  147:aload           11
	//*  64  149:invokevirtual   #193 <Method boolean Format.equals(Object)>
	//*  65  152:ifeq            156
			return;
	//   66  155:return          
		chunkoperationholder.chunk = null;
	//   67  156:aload           4
	//   68  158:aconst_null     
	//   69  159:putfield        #463 <Field Chunk ChunkOperationHolder.chunk>
		SmoothStreamingManifest.StreamElement streamelement = currentManifest.streamElements[enabledTrack.elementIndex];
	//   70  162:aload_0         
	//   71  163:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//   72  166:getfield        #158 <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   73  169:aload_0         
	//   74  170:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//   75  173:invokestatic    #409 <Method int SmoothStreamingChunkSource$ExposedTrack.access$000(SmoothStreamingChunkSource$ExposedTrack)>
	//   76  176:aaload          
	//   77  177:astore          12
		int i = streamelement.chunkCount;
	//   78  179:aload           12
	//   79  181:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//   80  184:istore          5
		boolean flag = true;
	//   81  186:iconst_1        
	//   82  187:istore          6
		if(i == 0)
	//*  83  189:iload           5
	//*  84  191:ifne            217
			if(currentManifest.isLive)
	//*  85  194:aload_0         
	//*  86  195:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//*  87  198:getfield        #97  <Field boolean SmoothStreamingManifest.isLive>
	//*  88  201:ifeq            210
			{
				needManifestRefresh = true;
	//   89  204:aload_0         
	//   90  205:iconst_1        
	//   91  206:putfield        #417 <Field boolean needManifestRefresh>
				return;
	//   92  209:return          
			} else
			{
				chunkoperationholder.endOfStream = true;
	//   93  210:aload           4
	//   94  212:iconst_1        
	//   95  213:putfield        #494 <Field boolean ChunkOperationHolder.endOfStream>
				return;
	//   96  216:return          
			}
		if(list.isEmpty())
	//*  97  217:aload_1         
	//*  98  218:invokeinterface #497 <Method boolean List.isEmpty()>
	//*  99  223:ifeq            259
		{
			if(live)
	//* 100  226:aload_0         
	//* 101  227:getfield        #99  <Field boolean live>
	//* 102  230:ifeq            248
				l = getLiveSeekPosition(currentManifest, liveEdgeLatencyUs);
	//  103  233:aload_0         
	//  104  234:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//  105  237:aload_0         
	//  106  238:getfield        #75  <Field long liveEdgeLatencyUs>
	//  107  241:invokestatic    #499 <Method long getLiveSeekPosition(SmoothStreamingManifest, long)>
	//  108  244:lstore_2        
	//* 109  245:goto            248
			i = streamelement.getChunkIndex(l);
	//  110  248:aload           12
	//  111  250:lload_2         
	//  112  251:invokevirtual   #415 <Method int SmoothStreamingManifest$StreamElement.getChunkIndex(long)>
	//  113  254:istore          5
		} else
	//* 114  256:goto            287
		{
			i = (((MediaChunk)list.get(chunkoperationholder.queueSize - 1)).chunkIndex + 1) - currentManifestChunkOffset;
	//  115  259:aload_1         
	//  116  260:aload           4
	//  117  262:getfield        #488 <Field int ChunkOperationHolder.queueSize>
	//  118  265:iconst_1        
	//  119  266:isub            
	//  120  267:invokeinterface #500 <Method Object List.get(int)>
	//  121  272:checkcast       #502 <Class MediaChunk>
	//  122  275:getfield        #505 <Field int MediaChunk.chunkIndex>
	//  123  278:iconst_1        
	//  124  279:iadd            
	//  125  280:aload_0         
	//  126  281:getfield        #411 <Field int currentManifestChunkOffset>
	//  127  284:isub            
	//  128  285:istore          5
		}
		if(live && i < 0)
	//* 129  287:aload_0         
	//* 130  288:getfield        #99  <Field boolean live>
	//* 131  291:ifeq            311
	//* 132  294:iload           5
	//* 133  296:ifge            311
		{
			fatalError = ((IOException) (new BehindLiveWindowException()));
	//  134  299:aload_0         
	//  135  300:new             #507 <Class BehindLiveWindowException>
	//  136  303:dup             
	//  137  304:invokespecial   #508 <Method void BehindLiveWindowException()>
	//  138  307:putfield        #403 <Field IOException fatalError>
			return;
	//  139  310:return          
		}
		if(currentManifest.isLive)
	//* 140  311:aload_0         
	//* 141  312:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//* 142  315:getfield        #97  <Field boolean SmoothStreamingManifest.isLive>
	//* 143  318:ifeq            357
		{
			if(i >= streamelement.chunkCount)
	//* 144  321:iload           5
	//* 145  323:aload           12
	//* 146  325:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//* 147  328:icmplt          337
			{
				needManifestRefresh = true;
	//  148  331:aload_0         
	//  149  332:iconst_1        
	//  150  333:putfield        #417 <Field boolean needManifestRefresh>
				return;
	//  151  336:return          
			}
			if(i == streamelement.chunkCount - 1)
	//* 152  337:iload           5
	//* 153  339:aload           12
	//* 154  341:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//* 155  344:iconst_1        
	//* 156  345:isub            
	//* 157  346:icmpne          374
				needManifestRefresh = true;
	//  158  349:aload_0         
	//  159  350:iconst_1        
	//  160  351:putfield        #417 <Field boolean needManifestRefresh>
		} else
	//* 161  354:goto            374
		if(i >= streamelement.chunkCount)
	//* 162  357:iload           5
	//* 163  359:aload           12
	//* 164  361:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//* 165  364:icmplt          374
		{
			chunkoperationholder.endOfStream = true;
	//  166  367:aload           4
	//  167  369:iconst_1        
	//  168  370:putfield        #494 <Field boolean ChunkOperationHolder.endOfStream>
			return;
	//  169  373:return          
		}
		if(currentManifest.isLive || i != streamelement.chunkCount - 1)
	//* 170  374:aload_0         
	//* 171  375:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//* 172  378:getfield        #97  <Field boolean SmoothStreamingManifest.isLive>
	//* 173  381:ifne            399
	//* 174  384:iload           5
	//* 175  386:aload           12
	//* 176  388:getfield        #163 <Field int SmoothStreamingManifest$StreamElement.chunkCount>
	//* 177  391:iconst_1        
	//* 178  392:isub            
	//* 179  393:icmpne          399
	//* 180  396:goto            402
			flag = false;
	//  181  399:iconst_0        
	//  182  400:istore          6
		long l1 = streamelement.getStartTimeUs(i);
	//  183  402:aload           12
	//  184  404:iload           5
	//  185  406:invokevirtual   #167 <Method long SmoothStreamingManifest$StreamElement.getStartTimeUs(int)>
	//  186  409:lstore          9
		if(flag)
	//* 187  411:iload           6
	//* 188  413:ifeq            423
			l = -1L;
	//  189  416:ldc2w           #261 <Long -1L>
	//  190  419:lstore_2        
		else
	//* 191  420:goto            434
			l = streamelement.getChunkDurationUs(i) + l1;
	//  192  423:aload           12
	//  193  425:iload           5
	//  194  427:invokevirtual   #170 <Method long SmoothStreamingManifest$StreamElement.getChunkDurationUs(int)>
	//  195  430:lload           9
	//  196  432:ladd            
	//  197  433:lstore_2        
		int j = currentManifestChunkOffset;
	//  198  434:aload_0         
	//  199  435:getfield        #411 <Field int currentManifestChunkOffset>
	//  200  438:istore          6
		int k = getManifestTrackIndex(streamelement, format);
	//  201  440:aload           12
	//  202  442:aload           11
	//  203  444:invokestatic    #510 <Method int getManifestTrackIndex(SmoothStreamingManifest$StreamElement, Format)>
	//  204  447:istore          7
		int i1 = getManifestTrackKey(enabledTrack.elementIndex, k);
	//  205  449:aload_0         
	//  206  450:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//  207  453:invokestatic    #409 <Method int SmoothStreamingChunkSource$ExposedTrack.access$000(SmoothStreamingChunkSource$ExposedTrack)>
	//  208  456:iload           7
	//  209  458:invokestatic    #254 <Method int getManifestTrackKey(int, int)>
	//  210  461:istore          8
		chunkoperationholder.chunk = ((Chunk) (newMediaChunk(format, streamelement.buildRequestUri(k, i), ((String) (null)), (ChunkExtractorWrapper)extractorWrappers.get(i1), ((DrmInitData) (drmInitData)), dataSource, i + j, l1, l, evaluation.trigger, (MediaFormat)mediaFormats.get(i1), enabledTrack.adaptiveMaxWidth, enabledTrack.adaptiveMaxHeight)));
	//  211  463:aload           4
	//  212  465:aload           11
	//  213  467:aload           12
	//  214  469:iload           7
	//  215  471:iload           5
	//  216  473:invokevirtual   #514 <Method Uri SmoothStreamingManifest$StreamElement.buildRequestUri(int, int)>
	//  217  476:aconst_null     
	//  218  477:aload_0         
	//  219  478:getfield        #90  <Field SparseArray extractorWrappers>
	//  220  481:iload           8
	//  221  483:invokevirtual   #258 <Method Object SparseArray.get(int)>
	//  222  486:checkcast       #359 <Class ChunkExtractorWrapper>
	//  223  489:aload_0         
	//  224  490:getfield        #125 <Field com.google.android.exoplayer.drm.DrmInitData$Mapped drmInitData>
	//  225  493:aload_0         
	//  226  494:getfield        #69  <Field DataSource dataSource>
	//  227  497:iload           5
	//  228  499:iload           6
	//  229  501:iadd            
	//  230  502:lload           9
	//  231  504:lload_2         
	//  232  505:aload_0         
	//  233  506:getfield        #80  <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//  234  509:getfield        #487 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.trigger>
	//  235  512:aload_0         
	//  236  513:getfield        #92  <Field SparseArray mediaFormats>
	//  237  516:iload           8
	//  238  518:invokevirtual   #258 <Method Object SparseArray.get(int)>
	//  239  521:checkcast       #260 <Class MediaFormat>
	//  240  524:aload_0         
	//  241  525:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//  242  528:invokestatic    #517 <Method int SmoothStreamingChunkSource$ExposedTrack.access$300(SmoothStreamingChunkSource$ExposedTrack)>
	//  243  531:aload_0         
	//  244  532:getfield        #405 <Field SmoothStreamingChunkSource$ExposedTrack enabledTrack>
	//  245  535:invokestatic    #520 <Method int SmoothStreamingChunkSource$ExposedTrack.access$400(SmoothStreamingChunkSource$ExposedTrack)>
	//  246  538:invokestatic    #522 <Method MediaChunk newMediaChunk(Format, Uri, String, ChunkExtractorWrapper, DrmInitData, DataSource, int, long, long, int, MediaFormat, int, int)>
	//  247  541:putfield        #463 <Field Chunk ChunkOperationHolder.chunk>
	//  248  544:return          
	}

	public final MediaFormat getFormat(int i)
	{
		return ((ExposedTrack)tracks.get(i)).trackFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ArrayList tracks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #447 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #10  <Class SmoothStreamingChunkSource$ExposedTrack>
	//    5   11:getfield        #529 <Field MediaFormat SmoothStreamingChunkSource$ExposedTrack.trackFormat>
	//    6   14:areturn         
	}

	public int getTrackCount()
	{
		return tracks.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ArrayList tracks>
	//    2    4:invokevirtual   #531 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = fatalError;
	//    0    0:aload_0         
	//    1    1:getfield        #403 <Field IOException fatalError>
	//    2    4:astore_1        
		if(ioexception == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
		{
			manifestFetcher.maybeThrowError();
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field ManifestFetcher manifestFetcher>
	//    7   13:invokevirtual   #536 <Method void ManifestFetcher.maybeThrowError()>
			return;
	//    8   16:return          
		} else
		{
			throw ioexception;
	//    9   17:aload_1         
	//   10   18:athrow          
		}
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
	//    0    0:return          
	}

	public void onChunkLoadError(Chunk chunk, Exception exception)
	{
	//    0    0:return          
	}

	public boolean prepare()
	{
		if(!prepareCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #544 <Field boolean prepareCalled>
	//*   2    4:ifne            35
		{
			prepareCalled = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #544 <Field boolean prepareCalled>
			try
			{
				trackSelector.selectTracks(currentManifest, ((SmoothStreamingTrackSelector.Output) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field SmoothStreamingTrackSelector trackSelector>
	//    8   16:aload_0         
	//    9   17:getfield        #65  <Field SmoothStreamingManifest currentManifest>
	//   10   20:aload_0         
	//   11   21:invokeinterface #550 <Method void SmoothStreamingTrackSelector.selectTracks(SmoothStreamingManifest, SmoothStreamingTrackSelector$Output)>
			}
	//*  12   26:goto            35
			catch(IOException ioexception)
	//*  13   29:astore_1        
			{
				fatalError = ioexception;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:putfield        #403 <Field IOException fatalError>
			}
		}
		return fatalError == null;
	//   17   35:aload_0         
	//   18   36:getfield        #403 <Field IOException fatalError>
	//   19   39:ifnonnull       44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	private static final int INITIALIZATION_VECTOR_SIZE = 8;
	private static final int MINIMUM_MANIFEST_REFRESH_PERIOD_MS = 5000;
	private final FormatEvaluator adaptiveFormatEvaluator;
	private SmoothStreamingManifest currentManifest;
	private int currentManifestChunkOffset;
	private final DataSource dataSource;
	private final com.google.android.exoplayer.drm.DrmInitData.Mapped drmInitData;
	private ExposedTrack enabledTrack;
	private final com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation;
	private final SparseArray extractorWrappers;
	private IOException fatalError;
	private final boolean live;
	private final long liveEdgeLatencyUs;
	private final ManifestFetcher manifestFetcher;
	private final SparseArray mediaFormats;
	private boolean needManifestRefresh;
	private boolean prepareCalled;
	private final TrackEncryptionBox trackEncryptionBoxes[];
	private final SmoothStreamingTrackSelector trackSelector;
	private final ArrayList tracks;
}
