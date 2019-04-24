// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.text.dvb.DvbDecoder;
import com.google.android.exoplayer2.text.pgs.PgsDecoder;
import com.google.android.exoplayer2.text.ssa.SsaDecoder;
import com.google.android.exoplayer2.text.subrip.SubripDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlDecoder;
import com.google.android.exoplayer2.text.tx3g.Tx3gDecoder;
import com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.google.android.exoplayer2.text.webvtt.WebvttDecoder;

// Referenced classes of package com.google.android.exoplayer2.text:
//			SubtitleDecoderFactory, SubtitleDecoder

static final class SubtitleDecoderFactory$1
	implements SubtitleDecoderFactory
{

	public SubtitleDecoder createDecoder(Format format)
	{
		byte byte0;
label0:
		{
			String s = format.sampleMimeType;
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field String Format.sampleMimeType>
	//    2    4:astore_3        
			switch(s.hashCode())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #25  <Method int String.hashCode()>
			{
			default:
				break;

	//*   5    9:lookupswitch    11: default 108
	//	               -1351681404: 255
	//	               -1248334819: 240
	//	               -1026075066: 226
	//	               -1004728940: 212
	//	               691401887: 198
	//	               822864842: 184
	//	               930165504: 169
	//	               1566015601: 154
	//	               1566016562: 139
	//	               1668750253: 125
	//	               1693976202: 111
	//*   6  108:goto            270
			case 1693976202: 
				if(s.equals("application/ttml+xml"))
	//*   7  111:aload_3         
	//*   8  112:ldc1            #27  <String "application/ttml+xml">
	//*   9  114:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  10  117:ifeq            270
				{
					byte0 = 3;
	//   11  120:iconst_3        
	//   12  121:istore_2        
					break label0;
	//   13  122:goto            272
				}
				break;

			case 1668750253: 
				if(!s.equals("application/x-subrip"))
					break;
	//   14  125:aload_3         
	//   15  126:ldc1            #33  <String "application/x-subrip">
	//   16  128:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   17  131:ifeq            270
				byte0 = 4;
	//   18  134:iconst_4        
	//   19  135:istore_2        
				break label0;
	//   20  136:goto            272

			case 1566016562: 
				if(!s.equals("application/cea-708"))
					break;
	//   21  139:aload_3         
	//   22  140:ldc1            #35  <String "application/cea-708">
	//   23  142:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   24  145:ifeq            270
				byte0 = 8;
	//   25  148:bipush          8
	//   26  150:istore_2        
				break label0;
	//   27  151:goto            272

			case 1566015601: 
				if(!s.equals("application/cea-608"))
					break;
	//   28  154:aload_3         
	//   29  155:ldc1            #37  <String "application/cea-608">
	//   30  157:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   31  160:ifeq            270
				byte0 = 6;
	//   32  163:bipush          6
	//   33  165:istore_2        
				break label0;
	//   34  166:goto            272

			case 930165504: 
				if(!s.equals("application/x-mp4-cea-608"))
					break;
	//   35  169:aload_3         
	//   36  170:ldc1            #39  <String "application/x-mp4-cea-608">
	//   37  172:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   38  175:ifeq            270
				byte0 = 7;
	//   39  178:bipush          7
	//   40  180:istore_2        
				break label0;
	//   41  181:goto            272

			case 822864842: 
				if(!s.equals("text/x-ssa"))
					break;
	//   42  184:aload_3         
	//   43  185:ldc1            #41  <String "text/x-ssa">
	//   44  187:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   45  190:ifeq            270
				byte0 = 1;
	//   46  193:iconst_1        
	//   47  194:istore_2        
				break label0;
	//   48  195:goto            272

			case 691401887: 
				if(!s.equals("application/x-quicktime-tx3g"))
					break;
	//   49  198:aload_3         
	//   50  199:ldc1            #43  <String "application/x-quicktime-tx3g">
	//   51  201:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   52  204:ifeq            270
				byte0 = 5;
	//   53  207:iconst_5        
	//   54  208:istore_2        
				break label0;
	//   55  209:goto            272

			case -1004728940: 
				if(!s.equals("text/vtt"))
					break;
	//   56  212:aload_3         
	//   57  213:ldc1            #45  <String "text/vtt">
	//   58  215:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   59  218:ifeq            270
				byte0 = 0;
	//   60  221:iconst_0        
	//   61  222:istore_2        
				break label0;
	//   62  223:goto            272

			case -1026075066: 
				if(!s.equals("application/x-mp4-vtt"))
					break;
	//   63  226:aload_3         
	//   64  227:ldc1            #47  <String "application/x-mp4-vtt">
	//   65  229:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   66  232:ifeq            270
				byte0 = 2;
	//   67  235:iconst_2        
	//   68  236:istore_2        
				break label0;
	//   69  237:goto            272

			case -1248334819: 
				if(!s.equals("application/pgs"))
					break;
	//   70  240:aload_3         
	//   71  241:ldc1            #49  <String "application/pgs">
	//   72  243:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   73  246:ifeq            270
				byte0 = 10;
	//   74  249:bipush          10
	//   75  251:istore_2        
				break label0;
	//   76  252:goto            272

			case -1351681404: 
				if(!s.equals("application/dvbsubs"))
					break;
	//   77  255:aload_3         
	//   78  256:ldc1            #51  <String "application/dvbsubs">
	//   79  258:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   80  261:ifeq            270
				byte0 = 9;
	//   81  264:bipush          9
	//   82  266:istore_2        
				break label0;
	//   83  267:goto            272
			}
			byte0 = -1;
	//   84  270:iconst_m1       
	//   85  271:istore_2        
		}
		switch(byte0)
	//*  86  272:iload_2         
		{
	//*  87  273:tableswitch     0 10: default 332
	//	               0 438
	//	               1 426
	//	               2 418
	//	               3 410
	//	               4 402
	//	               5 390
	//	               6 374
	//	               7 374
	//	               8 362
	//	               9 350
	//	               10 342
		default:
			throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
	//   88  332:new             #53  <Class IllegalArgumentException>
	//   89  335:dup             
	//   90  336:ldc1            #55  <String "Attempted to create decoder for unsupported format">
	//   91  338:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   92  341:athrow          

		case 10: // '\n'
			return ((SubtitleDecoder) (new PgsDecoder()));
	//   93  342:new             #60  <Class PgsDecoder>
	//   94  345:dup             
	//   95  346:invokespecial   #61  <Method void PgsDecoder()>
	//   96  349:areturn         

		case 9: // '\t'
			return ((SubtitleDecoder) (new DvbDecoder(format.initializationData)));
	//   97  350:new             #63  <Class DvbDecoder>
	//   98  353:dup             
	//   99  354:aload_1         
	//  100  355:getfield        #67  <Field java.util.List Format.initializationData>
	//  101  358:invokespecial   #70  <Method void DvbDecoder(java.util.List)>
	//  102  361:areturn         

		case 8: // '\b'
			return ((SubtitleDecoder) (new Cea708Decoder(format.accessibilityChannel)));
	//  103  362:new             #72  <Class Cea708Decoder>
	//  104  365:dup             
	//  105  366:aload_1         
	//  106  367:getfield        #76  <Field int Format.accessibilityChannel>
	//  107  370:invokespecial   #79  <Method void Cea708Decoder(int)>
	//  108  373:areturn         

		case 6: // '\006'
		case 7: // '\007'
			return ((SubtitleDecoder) (new Cea608Decoder(format.sampleMimeType, format.accessibilityChannel)));
	//  109  374:new             #81  <Class Cea608Decoder>
	//  110  377:dup             
	//  111  378:aload_1         
	//  112  379:getfield        #19  <Field String Format.sampleMimeType>
	//  113  382:aload_1         
	//  114  383:getfield        #76  <Field int Format.accessibilityChannel>
	//  115  386:invokespecial   #84  <Method void Cea608Decoder(String, int)>
	//  116  389:areturn         

		case 5: // '\005'
			return ((SubtitleDecoder) (new Tx3gDecoder(format.initializationData)));
	//  117  390:new             #86  <Class Tx3gDecoder>
	//  118  393:dup             
	//  119  394:aload_1         
	//  120  395:getfield        #67  <Field java.util.List Format.initializationData>
	//  121  398:invokespecial   #87  <Method void Tx3gDecoder(java.util.List)>
	//  122  401:areturn         

		case 4: // '\004'
			return ((SubtitleDecoder) (new SubripDecoder()));
	//  123  402:new             #89  <Class SubripDecoder>
	//  124  405:dup             
	//  125  406:invokespecial   #90  <Method void SubripDecoder()>
	//  126  409:areturn         

		case 3: // '\003'
			return ((SubtitleDecoder) (new TtmlDecoder()));
	//  127  410:new             #92  <Class TtmlDecoder>
	//  128  413:dup             
	//  129  414:invokespecial   #93  <Method void TtmlDecoder()>
	//  130  417:areturn         

		case 2: // '\002'
			return ((SubtitleDecoder) (new Mp4WebvttDecoder()));
	//  131  418:new             #95  <Class Mp4WebvttDecoder>
	//  132  421:dup             
	//  133  422:invokespecial   #96  <Method void Mp4WebvttDecoder()>
	//  134  425:areturn         

		case 1: // '\001'
			return ((SubtitleDecoder) (new SsaDecoder(format.initializationData)));
	//  135  426:new             #98  <Class SsaDecoder>
	//  136  429:dup             
	//  137  430:aload_1         
	//  138  431:getfield        #67  <Field java.util.List Format.initializationData>
	//  139  434:invokespecial   #99  <Method void SsaDecoder(java.util.List)>
	//  140  437:areturn         

		case 0: // '\0'
			return ((SubtitleDecoder) (new WebvttDecoder()));
	//  141  438:new             #101 <Class WebvttDecoder>
	//  142  441:dup             
	//  143  442:invokespecial   #102 <Method void WebvttDecoder()>
	//  144  445:areturn         
		}
	}

	public boolean supportsFormat(Format format)
	{
		format = ((Format) (format.sampleMimeType));
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field String Format.sampleMimeType>
	//    2    4:astore_1        
		return "text/vtt".equals(((Object) (format))) || "text/x-ssa".equals(((Object) (format))) || "application/ttml+xml".equals(((Object) (format))) || "application/x-mp4-vtt".equals(((Object) (format))) || "application/x-subrip".equals(((Object) (format))) || "application/x-quicktime-tx3g".equals(((Object) (format))) || "application/cea-608".equals(((Object) (format))) || "application/x-mp4-cea-608".equals(((Object) (format))) || "application/cea-708".equals(((Object) (format))) || "application/dvbsubs".equals(((Object) (format))) || "application/pgs".equals(((Object) (format)));
	//    3    5:ldc1            #45  <String "text/vtt">
	//    4    7:aload_1         
	//    5    8:invokevirtual   #31  <Method boolean String.equals(Object)>
	//    6   11:ifne            109
	//    7   14:ldc1            #41  <String "text/x-ssa">
	//    8   16:aload_1         
	//    9   17:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   10   20:ifne            109
	//   11   23:ldc1            #27  <String "application/ttml+xml">
	//   12   25:aload_1         
	//   13   26:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   14   29:ifne            109
	//   15   32:ldc1            #47  <String "application/x-mp4-vtt">
	//   16   34:aload_1         
	//   17   35:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   18   38:ifne            109
	//   19   41:ldc1            #33  <String "application/x-subrip">
	//   20   43:aload_1         
	//   21   44:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   22   47:ifne            109
	//   23   50:ldc1            #43  <String "application/x-quicktime-tx3g">
	//   24   52:aload_1         
	//   25   53:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   26   56:ifne            109
	//   27   59:ldc1            #37  <String "application/cea-608">
	//   28   61:aload_1         
	//   29   62:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   30   65:ifne            109
	//   31   68:ldc1            #39  <String "application/x-mp4-cea-608">
	//   32   70:aload_1         
	//   33   71:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   34   74:ifne            109
	//   35   77:ldc1            #35  <String "application/cea-708">
	//   36   79:aload_1         
	//   37   80:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   38   83:ifne            109
	//   39   86:ldc1            #51  <String "application/dvbsubs">
	//   40   88:aload_1         
	//   41   89:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   42   92:ifne            109
	//   43   95:ldc1            #49  <String "application/pgs">
	//   44   97:aload_1         
	//   45   98:invokevirtual   #31  <Method boolean String.equals(Object)>
	//   46  101:ifeq            107
	//   47  104:goto            109
	//   48  107:iconst_0        
	//   49  108:ireturn         
	//   50  109:iconst_1        
	//   51  110:ireturn         
	}

	SubtitleDecoderFactory$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
