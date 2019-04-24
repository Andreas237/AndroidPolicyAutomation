// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			ExtractorsFactory, Extractor

public final class DefaultExtractorsFactory
	implements ExtractorsFactory
{

	public DefaultExtractorsFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		tsMode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field int tsMode>
	//    5    9:return          
	}

	public Extractor[] createExtractors()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte byte0;
		Object obj;
		Exception exception;
		Constructor constructor;
		if(FLAC_EXTRACTOR_CONSTRUCTOR == null)
	//*   2    2:getstatic       #50  <Field Constructor FLAC_EXTRACTOR_CONSTRUCTOR>
	//*   3    5:ifnonnull       218
			byte0 = 12;
	//    4    8:bipush          12
	//    5   10:istore_1        
		else
	//*   6   11:goto            14
	//*   7   14:iload_1         
	//*   8   15:anewarray       Extractor[]
	//*   9   18:astore_2        
	//*  10   19:aload_2         
	//*  11   20:iconst_0        
	//*  12   21:new             #59  <Class MatroskaExtractor>
	//*  13   24:dup             
	//*  14   25:aload_0         
	//*  15   26:getfield        #61  <Field int matroskaFlags>
	//*  16   29:invokespecial   #64  <Method void MatroskaExtractor(int)>
	//*  17   32:aastore         
	//*  18   33:aload_2         
	//*  19   34:iconst_1        
	//*  20   35:new             #66  <Class FragmentedMp4Extractor>
	//*  21   38:dup             
	//*  22   39:aload_0         
	//*  23   40:getfield        #68  <Field int fragmentedMp4Flags>
	//*  24   43:invokespecial   #69  <Method void FragmentedMp4Extractor(int)>
	//*  25   46:aastore         
	//*  26   47:aload_2         
	//*  27   48:iconst_2        
	//*  28   49:new             #71  <Class Mp4Extractor>
	//*  29   52:dup             
	//*  30   53:aload_0         
	//*  31   54:getfield        #73  <Field int mp4Flags>
	//*  32   57:invokespecial   #74  <Method void Mp4Extractor(int)>
	//*  33   60:aastore         
	//*  34   61:aload_2         
	//*  35   62:iconst_3        
	//*  36   63:new             #76  <Class Mp3Extractor>
	//*  37   66:dup             
	//*  38   67:aload_0         
	//*  39   68:getfield        #78  <Field int mp3Flags>
	//*  40   71:invokespecial   #79  <Method void Mp3Extractor(int)>
	//*  41   74:aastore         
	//*  42   75:aload_2         
	//*  43   76:iconst_4        
	//*  44   77:new             #81  <Class AdtsExtractor>
	//*  45   80:dup             
	//*  46   81:invokespecial   #82  <Method void AdtsExtractor()>
	//*  47   84:aastore         
	//*  48   85:aload_2         
	//*  49   86:iconst_5        
	//*  50   87:new             #84  <Class Ac3Extractor>
	//*  51   90:dup             
	//*  52   91:invokespecial   #85  <Method void Ac3Extractor()>
	//*  53   94:aastore         
	//*  54   95:aload_2         
	//*  55   96:bipush          6
	//*  56   98:new             #87  <Class TsExtractor>
	//*  57  101:dup             
	//*  58  102:aload_0         
	//*  59  103:getfield        #55  <Field int tsMode>
	//*  60  106:aload_0         
	//*  61  107:getfield        #89  <Field int tsFlags>
	//*  62  110:invokespecial   #92  <Method void TsExtractor(int, int)>
	//*  63  113:aastore         
	//*  64  114:aload_2         
	//*  65  115:bipush          7
	//*  66  117:new             #94  <Class FlvExtractor>
	//*  67  120:dup             
	//*  68  121:invokespecial   #95  <Method void FlvExtractor()>
	//*  69  124:aastore         
	//*  70  125:aload_2         
	//*  71  126:bipush          8
	//*  72  128:new             #97  <Class OggExtractor>
	//*  73  131:dup             
	//*  74  132:invokespecial   #98  <Method void OggExtractor()>
	//*  75  135:aastore         
	//*  76  136:aload_2         
	//*  77  137:bipush          9
	//*  78  139:new             #100 <Class PsExtractor>
	//*  79  142:dup             
	//*  80  143:invokespecial   #101 <Method void PsExtractor()>
	//*  81  146:aastore         
	//*  82  147:aload_2         
	//*  83  148:bipush          10
	//*  84  150:new             #103 <Class WavExtractor>
	//*  85  153:dup             
	//*  86  154:invokespecial   #104 <Method void WavExtractor()>
	//*  87  157:aastore         
	//*  88  158:aload_2         
	//*  89  159:bipush          11
	//*  90  161:new             #106 <Class AmrExtractor>
	//*  91  164:dup             
	//*  92  165:invokespecial   #107 <Method void AmrExtractor()>
	//*  93  168:aastore         
	//*  94  169:getstatic       #50  <Field Constructor FLAC_EXTRACTOR_CONSTRUCTOR>
	//*  95  172:astore_3        
	//*  96  173:aload_3         
	//*  97  174:ifnull          209
	//*  98  177:aload_2         
	//*  99  178:bipush          12
	//* 100  180:getstatic       #50  <Field Constructor FLAC_EXTRACTOR_CONSTRUCTOR>
	//* 101  183:iconst_0        
	//* 102  184:anewarray       Object[]
	//* 103  187:invokevirtual   #113 <Method Object Constructor.newInstance(Object[])>
	//* 104  190:checkcast       #32  <Class Extractor>
	//* 105  193:aastore         
	//* 106  194:goto            209
	//* 107  197:astore_2        
	//* 108  198:new             #115 <Class IllegalStateException>
	//* 109  201:dup             
	//* 110  202:ldc1            #117 <String "Unexpected error creating FLAC extractor">
	//* 111  204:aload_2         
	//* 112  205:invokespecial   #118 <Method void IllegalStateException(String, Throwable)>
	//* 113  208:athrow          
	//* 114  209:aload_0         
	//* 115  210:monitorexit     
	//* 116  211:aload_2         
	//* 117  212:areturn         
	//* 118  213:astore_2        
	//* 119  214:aload_0         
	//* 120  215:monitorexit     
	//* 121  216:aload_2         
	//* 122  217:athrow          
			byte0 = 13;
	//  123  218:bipush          13
	//  124  220:istore_1        
		obj = ((Object) (new Extractor[byte0]));
		obj[0] = ((Extractor) (new MatroskaExtractor(matroskaFlags)));
		obj[1] = ((Extractor) (new FragmentedMp4Extractor(fragmentedMp4Flags)));
		obj[2] = ((Extractor) (new Mp4Extractor(mp4Flags)));
		obj[3] = ((Extractor) (new Mp3Extractor(mp3Flags)));
		obj[4] = ((Extractor) (new AdtsExtractor()));
		obj[5] = ((Extractor) (new Ac3Extractor()));
		obj[6] = ((Extractor) (new TsExtractor(tsMode, tsFlags)));
		obj[7] = ((Extractor) (new FlvExtractor()));
		obj[8] = ((Extractor) (new OggExtractor()));
		obj[9] = ((Extractor) (new PsExtractor()));
		obj[10] = ((Extractor) (new WavExtractor()));
		obj[11] = ((Extractor) (new AmrExtractor()));
		constructor = FLAC_EXTRACTOR_CONSTRUCTOR;
		if(constructor == null)
			break MISSING_BLOCK_LABEL_209;
		try
		{
			obj[12] = (Extractor)FLAC_EXTRACTOR_CONSTRUCTOR.newInstance(new Object[0]);
			break MISSING_BLOCK_LABEL_209;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		throw new IllegalStateException("Unexpected error creating FLAC extractor", ((Throwable) (obj)));
		this;
		JVM INSTR monitorexit ;
		return ((Extractor []) (obj));
		exception;
		throw exception;
	//* 125  221:goto            14
	}

	public DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		fragmentedMp4Flags = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #68  <Field int fragmentedMp4Flags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public DefaultExtractorsFactory setMatroskaExtractorFlags(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		matroskaFlags = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #61  <Field int matroskaFlags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public DefaultExtractorsFactory setMp3ExtractorFlags(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mp3Flags = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #78  <Field int mp3Flags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public DefaultExtractorsFactory setMp4ExtractorFlags(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mp4Flags = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #73  <Field int mp4Flags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public DefaultExtractorsFactory setTsExtractorFlags(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		tsFlags = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #89  <Field int tsFlags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public DefaultExtractorsFactory setTsExtractorMode(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		tsMode = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #55  <Field int tsMode>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	private static final Constructor FLAC_EXTRACTOR_CONSTRUCTOR;
	private int fragmentedMp4Flags;
	private int matroskaFlags;
	private int mp3Flags;
	private int mp4Flags;
	private int tsFlags;
	private int tsMode;

	static 
	{
		ClassNotFoundException classnotfoundexception;
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(com/google/android/exoplayer2/extractor/Extractor).getConstructor(new Class[0])));
	//    0    0:ldc1            #24  <String "com.google.android.exoplayer2.ext.flac.FlacExtractor">
	//    1    2:invokestatic    #30  <Method Class Class.forName(String)>
	//    2    5:ldc1            #32  <Class Extractor>
	//    3    7:invokevirtual   #36  <Method Class Class.asSubclass(Class)>
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #40  <Method Constructor Class.getConstructor(Class[])>
	//    7   17:astore_0        
		}
	//*   8   18:goto            35
	//*   9   21:astore_0        
	//*  10   22:new             #42  <Class RuntimeException>
	//*  11   25:dup             
	//*  12   26:ldc1            #44  <String "Error instantiating FLAC extension">
	//*  13   28:aload_0         
	//*  14   29:invokespecial   #48  <Method void RuntimeException(String, Throwable)>
	//*  15   32:athrow          
	//*  16   33:aconst_null     
	//*  17   34:astore_0        
	//*  18   35:aload_0         
	//*  19   36:putstatic       #50  <Field Constructor FLAC_EXTRACTOR_CONSTRUCTOR>
	//*  20   39:return          
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			obj = null;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new RuntimeException("Error instantiating FLAC extension", ((Throwable) (obj)));
		}
		FLAC_EXTRACTOR_CONSTRUCTOR = ((Constructor) (obj));
	//*  21   40:astore_0        
	//*  22   41:goto            33
	}
}
