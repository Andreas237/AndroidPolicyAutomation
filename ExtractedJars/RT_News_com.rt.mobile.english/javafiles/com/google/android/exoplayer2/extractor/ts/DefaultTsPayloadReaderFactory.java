// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			SeiReader, SectionReader, SpliceInfoSectionReader, PesReader, 
//			DtsReader, Ac3Reader, DvbSubtitleReader, H265Reader, 
//			H264Reader, Id3Reader, LatmReader, AdtsReader, 
//			MpegAudioReader, H262Reader, TsPayloadReader

public final class DefaultTsPayloadReaderFactory
	implements TsPayloadReader.Factory
{
	public static interface Flags
		extends Annotation
	{
	}


	public DefaultTsPayloadReaderFactory()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #33  <Method void DefaultTsPayloadReaderFactory(int)>
	//    3    5:return          
	}

	public DefaultTsPayloadReaderFactory(int i)
	{
		this(i, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method List Collections.emptyList()>
	//    3    5:invokespecial   #43  <Method void DefaultTsPayloadReaderFactory(int, List)>
	//    4    8:return          
	}

	public DefaultTsPayloadReaderFactory(int i, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		flags = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #47  <Field int flags>
		List list1 = list;
	//    5    9:aload_2         
	//    6   10:astore_3        
		if(!isSet(32))
	//*   7   11:aload_0         
	//*   8   12:bipush          32
	//*   9   14:invokespecial   #51  <Method boolean isSet(int)>
	//*  10   17:ifne            43
		{
			list1 = list;
	//   11   20:aload_2         
	//   12   21:astore_3        
			if(list.isEmpty())
	//*  13   22:aload_2         
	//*  14   23:invokeinterface #57  <Method boolean List.isEmpty()>
	//*  15   28:ifeq            43
				list1 = Collections.singletonList(((Object) (Format.createTextSampleFormat(((String) (null)), "application/cea-608", 0, ((String) (null))))));
	//   16   31:aconst_null     
	//   17   32:ldc1            #59  <String "application/cea-608">
	//   18   34:iconst_0        
	//   19   35:aconst_null     
	//   20   36:invokestatic    #65  <Method Format Format.createTextSampleFormat(String, String, int, String)>
	//   21   39:invokestatic    #69  <Method List Collections.singletonList(Object)>
	//   22   42:astore_3        
		}
		closedCaptionFormats = list1;
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:putfield        #71  <Field List closedCaptionFormats>
	//   26   48:return          
	}

	private SeiReader buildSeiReader(TsPayloadReader.EsInfo esinfo)
	{
		if(isSet(32))
	//*   0    0:aload_0         
	//*   1    1:bipush          32
	//*   2    3:invokespecial   #51  <Method boolean isSet(int)>
	//*   3    6:ifeq            21
			return new SeiReader(closedCaptionFormats);
	//    4    9:new             #77  <Class SeiReader>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:getfield        #71  <Field List closedCaptionFormats>
	//    8   17:invokespecial   #80  <Method void SeiReader(List)>
	//    9   20:areturn         
		ParsableByteArray parsablebytearray = new ParsableByteArray(esinfo.descriptorBytes);
	//   10   21:new             #82  <Class ParsableByteArray>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:getfield        #88  <Field byte[] TsPayloadReader$EsInfo.descriptorBytes>
	//   14   29:invokespecial   #91  <Method void ParsableByteArray(byte[])>
	//   15   32:astore          9
		esinfo = ((TsPayloadReader.EsInfo) (closedCaptionFormats));
	//   16   34:aload_0         
	//   17   35:getfield        #71  <Field List closedCaptionFormats>
	//   18   38:astore_1        
		int k;
		int l;
label0:
		for(; parsablebytearray.bytesLeft() > 0; parsablebytearray.setPosition(l + k))
	//*  19   39:aload           9
	//*  20   41:invokevirtual   #95  <Method int ParsableByteArray.bytesLeft()>
	//*  21   44:ifle            202
		{
			int i = parsablebytearray.readUnsignedByte();
	//   22   47:aload           9
	//   23   49:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   24   52:istore_2        
			k = parsablebytearray.readUnsignedByte();
	//   25   53:aload           9
	//   26   55:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   27   58:istore          4
			l = parsablebytearray.getPosition();
	//   28   60:aload           9
	//   29   62:invokevirtual   #101 <Method int ParsableByteArray.getPosition()>
	//   30   65:istore          5
			if(i != 134)
				continue;
	//   31   67:iload_2         
	//   32   68:sipush          134
	//   33   71:icmpne          189
			ArrayList arraylist = new ArrayList();
	//   34   74:new             #103 <Class ArrayList>
	//   35   77:dup             
	//   36   78:invokespecial   #104 <Method void ArrayList()>
	//   37   81:astore          8
			int i1 = parsablebytearray.readUnsignedByte();
	//   38   83:aload           9
	//   39   85:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   40   88:istore          6
			i = 0;
	//   41   90:iconst_0        
	//   42   91:istore_2        
			do
			{
				esinfo = ((TsPayloadReader.EsInfo) (arraylist));
	//   43   92:aload           8
	//   44   94:astore_1        
				if(i >= (i1 & 0x1f))
					continue label0;
	//   45   95:iload_2         
	//   46   96:iload           6
	//   47   98:bipush          31
	//   48  100:iand            
	//   49  101:icmpge          189
				String s = parsablebytearray.readString(3);
	//   50  104:aload           9
	//   51  106:iconst_3        
	//   52  107:invokevirtual   #108 <Method String ParsableByteArray.readString(int)>
	//   53  110:astore          10
				int j1 = parsablebytearray.readUnsignedByte();
	//   54  112:aload           9
	//   55  114:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   56  117:istore          7
				boolean flag;
				if((j1 & 0x80) != 0)
	//*  57  119:iload           7
	//*  58  121:sipush          128
	//*  59  124:iand            
	//*  60  125:ifeq            133
					flag = true;
	//   61  128:iconst_1        
	//   62  129:istore_3        
				else
	//*  63  130:goto            135
					flag = false;
	//   64  133:iconst_0        
	//   65  134:istore_3        
				int j;
				if(flag)
	//*  66  135:iload_3         
	//*  67  136:ifeq            151
				{
					j = j1 & 0x3f;
	//   68  139:iload           7
	//   69  141:bipush          63
	//   70  143:iand            
	//   71  144:istore_3        
					esinfo = "application/cea-708";
	//   72  145:ldc1            #110 <String "application/cea-708">
	//   73  147:astore_1        
				} else
	//*  74  148:goto            156
				{
					j = 1;
	//   75  151:iconst_1        
	//   76  152:istore_3        
					esinfo = "application/cea-608";
	//   77  153:ldc1            #59  <String "application/cea-608">
	//   78  155:astore_1        
				}
				((List) (arraylist)).add(((Object) (Format.createTextSampleFormat(((String) (null)), ((String) (esinfo)), ((String) (null)), -1, 0, s, j, ((com.google.android.exoplayer2.drm.DrmInitData) (null))))));
	//   79  156:aload           8
	//   80  158:aconst_null     
	//   81  159:aload_1         
	//   82  160:aconst_null     
	//   83  161:iconst_m1       
	//   84  162:iconst_0        
	//   85  163:aload           10
	//   86  165:iload_3         
	//   87  166:aconst_null     
	//   88  167:invokestatic    #113 <Method Format Format.createTextSampleFormat(String, String, String, int, int, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   89  170:invokeinterface #117 <Method boolean List.add(Object)>
	//   90  175:pop             
				parsablebytearray.skipBytes(2);
	//   91  176:aload           9
	//   92  178:iconst_2        
	//   93  179:invokevirtual   #120 <Method void ParsableByteArray.skipBytes(int)>
				i++;
	//   94  182:iload_2         
	//   95  183:iconst_1        
	//   96  184:iadd            
	//   97  185:istore_2        
			} while(true);
	//   98  186:goto            92
		}

	//   99  189:aload           9
	//  100  191:iload           5
	//  101  193:iload           4
	//  102  195:iadd            
	//  103  196:invokevirtual   #123 <Method void ParsableByteArray.setPosition(int)>
	//* 104  199:goto            39
		return new SeiReader(((List) (esinfo)));
	//  105  202:new             #77  <Class SeiReader>
	//  106  205:dup             
	//  107  206:aload_1         
	//  108  207:invokespecial   #80  <Method void SeiReader(List)>
	//  109  210:areturn         
	}

	private boolean isSet(int i)
	{
		return (i & flags) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field int flags>
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public SparseArray createInitialPayloadReaders()
	{
		return new SparseArray();
	//    0    0:new             #127 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void SparseArray()>
	//    3    7:areturn         
	}

	public TsPayloadReader createPayloadReader(int i, TsPayloadReader.EsInfo esinfo)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    14: default 124
	//	               2: 363
	//	               3: 344
	//	               4: 344
	//	               15: 314
	//	               17: 285
	//	               21: 270
	//	               27: 229
	//	               36: 209
	//	               89: 190
	//	               129: 171
	//	               130: 152
	//	               134: 126
	//	               135: 171
	//	               138: 152
		default:
			return null;
	//    2  124:aconst_null     
	//    3  125:areturn         

		case 134: 
			if(isSet(16))
	//*   4  126:aload_0         
	//*   5  127:bipush          16
	//*   6  129:invokespecial   #51  <Method boolean isSet(int)>
	//*   7  132:ifeq            137
				return null;
	//    8  135:aconst_null     
	//    9  136:areturn         
			else
				return ((TsPayloadReader) (new SectionReader(((SectionPayloadReader) (new SpliceInfoSectionReader())))));
	//   10  137:new             #133 <Class SectionReader>
	//   11  140:dup             
	//   12  141:new             #135 <Class SpliceInfoSectionReader>
	//   13  144:dup             
	//   14  145:invokespecial   #136 <Method void SpliceInfoSectionReader()>
	//   15  148:invokespecial   #139 <Method void SectionReader(SectionPayloadReader)>
	//   16  151:areturn         

		case 130: 
		case 138: 
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new DtsReader(esinfo.language))))));
	//   17  152:new             #141 <Class PesReader>
	//   18  155:dup             
	//   19  156:new             #143 <Class DtsReader>
	//   20  159:dup             
	//   21  160:aload_2         
	//   22  161:getfield        #147 <Field String TsPayloadReader$EsInfo.language>
	//   23  164:invokespecial   #150 <Method void DtsReader(String)>
	//   24  167:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   25  170:areturn         

		case 129: 
		case 135: 
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new Ac3Reader(esinfo.language))))));
	//   26  171:new             #141 <Class PesReader>
	//   27  174:dup             
	//   28  175:new             #155 <Class Ac3Reader>
	//   29  178:dup             
	//   30  179:aload_2         
	//   31  180:getfield        #147 <Field String TsPayloadReader$EsInfo.language>
	//   32  183:invokespecial   #156 <Method void Ac3Reader(String)>
	//   33  186:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   34  189:areturn         

		case 89: // 'Y'
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new DvbSubtitleReader(esinfo.dvbSubtitleInfos))))));
	//   35  190:new             #141 <Class PesReader>
	//   36  193:dup             
	//   37  194:new             #158 <Class DvbSubtitleReader>
	//   38  197:dup             
	//   39  198:aload_2         
	//   40  199:getfield        #161 <Field List TsPayloadReader$EsInfo.dvbSubtitleInfos>
	//   41  202:invokespecial   #162 <Method void DvbSubtitleReader(List)>
	//   42  205:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   43  208:areturn         

		case 36: // '$'
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new H265Reader(buildSeiReader(esinfo)))))));
	//   44  209:new             #141 <Class PesReader>
	//   45  212:dup             
	//   46  213:new             #164 <Class H265Reader>
	//   47  216:dup             
	//   48  217:aload_0         
	//   49  218:aload_2         
	//   50  219:invokespecial   #166 <Method SeiReader buildSeiReader(TsPayloadReader$EsInfo)>
	//   51  222:invokespecial   #169 <Method void H265Reader(SeiReader)>
	//   52  225:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   53  228:areturn         

		case 27: // '\033'
			if(isSet(4))
	//*  54  229:aload_0         
	//*  55  230:iconst_4        
	//*  56  231:invokespecial   #51  <Method boolean isSet(int)>
	//*  57  234:ifeq            239
				return null;
	//   58  237:aconst_null     
	//   59  238:areturn         
			else
				return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new H264Reader(buildSeiReader(esinfo), isSet(1), isSet(8)))))));
	//   60  239:new             #141 <Class PesReader>
	//   61  242:dup             
	//   62  243:new             #171 <Class H264Reader>
	//   63  246:dup             
	//   64  247:aload_0         
	//   65  248:aload_2         
	//   66  249:invokespecial   #166 <Method SeiReader buildSeiReader(TsPayloadReader$EsInfo)>
	//   67  252:aload_0         
	//   68  253:iconst_1        
	//   69  254:invokespecial   #51  <Method boolean isSet(int)>
	//   70  257:aload_0         
	//   71  258:bipush          8
	//   72  260:invokespecial   #51  <Method boolean isSet(int)>
	//   73  263:invokespecial   #174 <Method void H264Reader(SeiReader, boolean, boolean)>
	//   74  266:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   75  269:areturn         

		case 21: // '\025'
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new Id3Reader())))));
	//   76  270:new             #141 <Class PesReader>
	//   77  273:dup             
	//   78  274:new             #176 <Class Id3Reader>
	//   79  277:dup             
	//   80  278:invokespecial   #177 <Method void Id3Reader()>
	//   81  281:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   82  284:areturn         

		case 17: // '\021'
			if(isSet(2))
	//*  83  285:aload_0         
	//*  84  286:iconst_2        
	//*  85  287:invokespecial   #51  <Method boolean isSet(int)>
	//*  86  290:ifeq            295
				return null;
	//   87  293:aconst_null     
	//   88  294:areturn         
			else
				return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new LatmReader(esinfo.language))))));
	//   89  295:new             #141 <Class PesReader>
	//   90  298:dup             
	//   91  299:new             #179 <Class LatmReader>
	//   92  302:dup             
	//   93  303:aload_2         
	//   94  304:getfield        #147 <Field String TsPayloadReader$EsInfo.language>
	//   95  307:invokespecial   #180 <Method void LatmReader(String)>
	//   96  310:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//   97  313:areturn         

		case 15: // '\017'
			if(isSet(2))
	//*  98  314:aload_0         
	//*  99  315:iconst_2        
	//* 100  316:invokespecial   #51  <Method boolean isSet(int)>
	//* 101  319:ifeq            324
				return null;
	//  102  322:aconst_null     
	//  103  323:areturn         
			else
				return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new AdtsReader(false, esinfo.language))))));
	//  104  324:new             #141 <Class PesReader>
	//  105  327:dup             
	//  106  328:new             #182 <Class AdtsReader>
	//  107  331:dup             
	//  108  332:iconst_0        
	//  109  333:aload_2         
	//  110  334:getfield        #147 <Field String TsPayloadReader$EsInfo.language>
	//  111  337:invokespecial   #185 <Method void AdtsReader(boolean, String)>
	//  112  340:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//  113  343:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new MpegAudioReader(esinfo.language))))));
	//  114  344:new             #141 <Class PesReader>
	//  115  347:dup             
	//  116  348:new             #187 <Class MpegAudioReader>
	//  117  351:dup             
	//  118  352:aload_2         
	//  119  353:getfield        #147 <Field String TsPayloadReader$EsInfo.language>
	//  120  356:invokespecial   #188 <Method void MpegAudioReader(String)>
	//  121  359:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//  122  362:areturn         

		case 2: // '\002'
			return ((TsPayloadReader) (new PesReader(((ElementaryStreamReader) (new H262Reader())))));
	//  123  363:new             #141 <Class PesReader>
	//  124  366:dup             
	//  125  367:new             #190 <Class H262Reader>
	//  126  370:dup             
	//  127  371:invokespecial   #191 <Method void H262Reader()>
	//  128  374:invokespecial   #153 <Method void PesReader(ElementaryStreamReader)>
	//  129  377:areturn         
		}
	}

	private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
	public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
	public static final int FLAG_DETECT_ACCESS_UNITS = 8;
	public static final int FLAG_IGNORE_AAC_STREAM = 2;
	public static final int FLAG_IGNORE_H264_STREAM = 4;
	public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
	public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
	private final List closedCaptionFormats;
	private final int flags;
}
