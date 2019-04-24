// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.ts.*;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsExtractorFactory, WebvttExtractor

public final class DefaultHlsExtractorFactory
	implements HlsExtractorFactory
{

	public DefaultHlsExtractorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public Pair createExtractor(Extractor extractor, Uri uri, Format format, List list, DrmInitData drminitdata, TimestampAdjuster timestampadjuster)
	{
		boolean flag;
		boolean flag1;
		String s = uri.getLastPathSegment();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #45  <Method String Uri.getLastPathSegment()>
	//    2    4:astore          12
		uri = ((Uri) (s));
	//    3    6:aload           12
	//    4    8:astore_2        
		if(s == null)
	//*   5    9:aload           12
	//*   6   11:ifnonnull       17
			uri = "";
	//    7   14:ldc1            #47  <String "">
	//    8   16:astore_2        
		flag1 = "text/vtt".equals(((Object) (format.sampleMimeType)));
	//    9   17:ldc1            #49  <String "text/vtt">
	//   10   19:aload_3         
	//   11   20:getfield        #54  <Field String Format.sampleMimeType>
	//   12   23:invokevirtual   #60  <Method boolean String.equals(Object)>
	//   13   26:istore          11
		flag = false;
	//   14   28:iconst_0        
	//   15   29:istore          10
		if(!flag1 && !((String) (uri)).endsWith(".webvtt") && !((String) (uri)).endsWith(".vtt")) goto _L2; else goto _L1
	//   16   31:iload           11
	//   17   33:ifne            324
	//   18   36:aload_2         
	//   19   37:ldc1            #32  <String ".webvtt">
	//   20   39:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//   21   42:ifne            324
	//   22   45:aload_2         
	//   23   46:ldc1            #29  <String ".vtt">
	//   24   48:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//   25   51:ifeq            57
	//*  26   54:goto            324
_L2:
		if(!((String) (uri)).endsWith(".aac")) goto _L4; else goto _L3
	//   27   57:aload_2         
	//   28   58:ldc1            #10  <String ".aac">
	//   29   60:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//   30   63:ifeq            80
_L3:
		extractor = ((Extractor) (new AdtsExtractor()));
	//   31   66:new             #66  <Class AdtsExtractor>
	//   32   69:dup             
	//   33   70:invokespecial   #67  <Method void AdtsExtractor()>
	//   34   73:astore_1        
_L6:
		flag = true;
	//   35   74:iconst_1        
	//   36   75:istore          10
		break; /* Loop/switch isn't completed */
	//   37   77:goto            338
_L4:
		if(!((String) (uri)).endsWith(".ac3") && !((String) (uri)).endsWith(".ec3"))
	//*  38   80:aload_2         
	//*  39   81:ldc1            #13  <String ".ac3">
	//*  40   83:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//*  41   86:ifne            313
	//*  42   89:aload_2         
	//*  43   90:ldc1            #16  <String ".ec3">
	//*  44   92:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//*  45   95:ifeq            101
	//*  46   98:goto            313
		{
			if(((String) (uri)).endsWith(".mp3"))
	//*  47  101:aload_2         
	//*  48  102:ldc1            #22  <String ".mp3">
	//*  49  104:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//*  50  107:ifeq            123
			{
				extractor = ((Extractor) (new Mp3Extractor(0, 0L)));
	//   51  110:new             #69  <Class Mp3Extractor>
	//   52  113:dup             
	//   53  114:iconst_0        
	//   54  115:lconst_0        
	//   55  116:invokespecial   #72  <Method void Mp3Extractor(int, long)>
	//   56  119:astore_1        
				continue; /* Loop/switch isn't completed */
	//   57  120:goto            74
			}
			if(extractor == null)
	//*  58  123:aload_1         
	//*  59  124:ifnull          130
	//*  60  127:goto            338
				if(!((String) (uri)).endsWith(".mp4") && !((String) (uri)).startsWith(".m4", ((String) (uri)).length() - 4) && !((String) (uri)).startsWith(".mp4", ((String) (uri)).length() - 5))
	//*  61  130:aload_2         
	//*  62  131:ldc1            #25  <String ".mp4">
	//*  63  133:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//*  64  136:ifne            278
	//*  65  139:aload_2         
	//*  66  140:ldc1            #19  <String ".m4">
	//*  67  142:aload_2         
	//*  68  143:invokevirtual   #76  <Method int String.length()>
	//*  69  146:iconst_4        
	//*  70  147:isub            
	//*  71  148:invokevirtual   #80  <Method boolean String.startsWith(String, int)>
	//*  72  151:ifne            278
	//*  73  154:aload_2         
	//*  74  155:ldc1            #25  <String ".mp4">
	//*  75  157:aload_2         
	//*  76  158:invokevirtual   #76  <Method int String.length()>
	//*  77  161:iconst_5        
	//*  78  162:isub            
	//*  79  163:invokevirtual   #80  <Method boolean String.startsWith(String, int)>
	//*  80  166:ifeq            172
	//*  81  169:goto            278
				{
					byte byte0 = 16;
	//   82  172:bipush          16
	//   83  174:istore          7
					if(list != null)
	//*  84  176:aload           4
	//*  85  178:ifnull          188
						byte0 = 48;
	//   86  181:bipush          48
	//   87  183:istore          7
					else
	//*  88  185:goto            193
						list = Collections.emptyList();
	//   89  188:invokestatic    #86  <Method List Collections.emptyList()>
	//   90  191:astore          4
					extractor = ((Extractor) (format.codecs));
	//   91  193:aload_3         
	//   92  194:getfield        #89  <Field String Format.codecs>
	//   93  197:astore_1        
					int j = ((int) (byte0));
	//   94  198:iload           7
	//   95  200:istore          9
					if(!TextUtils.isEmpty(((CharSequence) (extractor))))
	//*  96  202:aload_1         
	//*  97  203:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  98  206:ifne            253
					{
						int i = ((int) (byte0));
	//   99  209:iload           7
	//  100  211:istore          8
						if(!"audio/mp4a-latm".equals(((Object) (MimeTypes.getAudioMediaMimeType(((String) (extractor)))))))
	//* 101  213:ldc1            #97  <String "audio/mp4a-latm">
	//* 102  215:aload_1         
	//* 103  216:invokestatic    #103 <Method String MimeTypes.getAudioMediaMimeType(String)>
	//* 104  219:invokevirtual   #60  <Method boolean String.equals(Object)>
	//* 105  222:ifne            231
							i = byte0 | 2;
	//  106  225:iload           7
	//  107  227:iconst_2        
	//  108  228:ior             
	//  109  229:istore          8
						j = i;
	//  110  231:iload           8
	//  111  233:istore          9
						if(!"video/avc".equals(((Object) (MimeTypes.getVideoMediaMimeType(((String) (extractor)))))))
	//* 112  235:ldc1            #105 <String "video/avc">
	//* 113  237:aload_1         
	//* 114  238:invokestatic    #108 <Method String MimeTypes.getVideoMediaMimeType(String)>
	//* 115  241:invokevirtual   #60  <Method boolean String.equals(Object)>
	//* 116  244:ifne            253
							j = i | 4;
	//  117  247:iload           8
	//  118  249:iconst_4        
	//  119  250:ior             
	//  120  251:istore          9
					}
					extractor = ((Extractor) (new TsExtractor(2, timestampadjuster, ((com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory) (new DefaultTsPayloadReaderFactory(j, list))))));
	//  121  253:new             #110 <Class TsExtractor>
	//  122  256:dup             
	//  123  257:iconst_2        
	//  124  258:aload           6
	//  125  260:new             #112 <Class DefaultTsPayloadReaderFactory>
	//  126  263:dup             
	//  127  264:iload           9
	//  128  266:aload           4
	//  129  268:invokespecial   #115 <Method void DefaultTsPayloadReaderFactory(int, List)>
	//  130  271:invokespecial   #118 <Method void TsExtractor(int, TimestampAdjuster, com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory)>
	//  131  274:astore_1        
				} else
	//* 132  275:goto            338
				{
					if(list == null)
	//* 133  278:aload           4
	//* 134  280:ifnull          286
	//* 135  283:goto            294
						list = Collections.emptyList();
	//  136  286:invokestatic    #86  <Method List Collections.emptyList()>
	//  137  289:astore          4
	//* 138  291:goto            283
					extractor = ((Extractor) (new FragmentedMp4Extractor(0, timestampadjuster, ((com.google.android.exoplayer2.extractor.mp4.Track) (null)), drminitdata, list)));
	//  139  294:new             #120 <Class FragmentedMp4Extractor>
	//  140  297:dup             
	//  141  298:iconst_0        
	//  142  299:aload           6
	//  143  301:aconst_null     
	//  144  302:aload           5
	//  145  304:aload           4
	//  146  306:invokespecial   #123 <Method void FragmentedMp4Extractor(int, TimestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track, DrmInitData, List)>
	//  147  309:astore_1        
				}
			break; /* Loop/switch isn't completed */
	//  148  310:goto            338
		}
		extractor = ((Extractor) (new Ac3Extractor()));
	//  149  313:new             #125 <Class Ac3Extractor>
	//  150  316:dup             
	//  151  317:invokespecial   #126 <Method void Ac3Extractor()>
	//  152  320:astore_1        
		if(true) goto _L6; else goto _L5
	//  153  321:goto            74
_L1:
		extractor = ((Extractor) (new WebvttExtractor(format.language, timestampadjuster)));
	//  154  324:new             #128 <Class WebvttExtractor>
	//  155  327:dup             
	//  156  328:aload_3         
	//  157  329:getfield        #131 <Field String Format.language>
	//  158  332:aload           6
	//  159  334:invokespecial   #134 <Method void WebvttExtractor(String, TimestampAdjuster)>
	//  160  337:astore_1        
_L5:
		return Pair.create(((Object) (extractor)), ((Object) (Boolean.valueOf(flag))));
	//  161  338:aload_1         
	//  162  339:iload           10
	//  163  341:invokestatic    #140 <Method Boolean Boolean.valueOf(boolean)>
	//  164  344:invokestatic    #146 <Method Pair Pair.create(Object, Object)>
	//  165  347:areturn         
	}

	public static final String AAC_FILE_EXTENSION = ".aac";
	public static final String AC3_FILE_EXTENSION = ".ac3";
	public static final String EC3_FILE_EXTENSION = ".ec3";
	public static final String M4_FILE_EXTENSION_PREFIX = ".m4";
	public static final String MP3_FILE_EXTENSION = ".mp3";
	public static final String MP4_FILE_EXTENSION = ".mp4";
	public static final String MP4_FILE_EXTENSION_PREFIX = ".mp4";
	public static final String VTT_FILE_EXTENSION = ".vtt";
	public static final String WEBVTT_FILE_EXTENSION = ".webvtt";
}
