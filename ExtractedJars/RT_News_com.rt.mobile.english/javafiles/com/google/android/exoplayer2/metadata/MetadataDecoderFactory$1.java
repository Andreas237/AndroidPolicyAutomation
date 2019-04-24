// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

// Referenced classes of package com.google.android.exoplayer2.metadata:
//			MetadataDecoderFactory, MetadataDecoder

static final class MetadataDecoderFactory$1
	implements MetadataDecoderFactory
{

	public MetadataDecoder createDecoder(Format format)
	{
		int i;
label0:
		{
			format = ((Format) (format.sampleMimeType));
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field String Format.sampleMimeType>
	//    2    4:astore_1        
			i = ((String) (format)).hashCode();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method int String.hashCode()>
	//    5    9:istore_2        
			if(i != 0xb597d139)
	//*   6   10:iload_2         
	//*   7   11:ldc1            #26  <Int 0xb597d139>
	//*   8   13:icmpeq          59
			{
				if(i != 0x44ce7ed0)
	//*   9   16:iload_2         
	//*  10   17:ldc1            #27  <Int 0x44ce7ed0>
	//*  11   19:icmpeq          45
				{
					if(i == 0x62816bb7 && ((String) (format)).equals("application/x-scte35"))
	//*  12   22:iload_2         
	//*  13   23:ldc1            #28  <Int 0x62816bb7>
	//*  14   25:icmpeq          31
	//*  15   28:goto            73
	//*  16   31:aload_1         
	//*  17   32:ldc1            #30  <String "application/x-scte35">
	//*  18   34:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  19   37:ifeq            73
					{
						i = 2;
	//   20   40:iconst_2        
	//   21   41:istore_2        
						break label0;
	//   22   42:goto            75
					}
				} else
				if(((String) (format)).equals("application/x-emsg"))
	//*  23   45:aload_1         
	//*  24   46:ldc1            #36  <String "application/x-emsg">
	//*  25   48:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  26   51:ifeq            73
				{
					i = 1;
	//   27   54:iconst_1        
	//   28   55:istore_2        
					break label0;
	//   29   56:goto            75
				}
			} else
			if(((String) (format)).equals("application/id3"))
	//*  30   59:aload_1         
	//*  31   60:ldc1            #38  <String "application/id3">
	//*  32   62:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  33   65:ifeq            73
			{
				i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_2        
				break label0;
	//   36   70:goto            75
			}
			i = -1;
	//   37   73:iconst_m1       
	//   38   74:istore_2        
		}
		switch(i)
	//*  39   75:iload_2         
		{
	//*  40   76:tableswitch     0 2: default 104
	//	               0 130
	//	               1 122
	//	               2 114
		default:
			throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
	//   41  104:new             #40  <Class IllegalArgumentException>
	//   42  107:dup             
	//   43  108:ldc1            #42  <String "Attempted to create decoder for unsupported format">
	//   44  110:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   45  113:athrow          

		case 2: // '\002'
			return ((MetadataDecoder) (new SpliceInfoDecoder()));
	//   46  114:new             #47  <Class SpliceInfoDecoder>
	//   47  117:dup             
	//   48  118:invokespecial   #48  <Method void SpliceInfoDecoder()>
	//   49  121:areturn         

		case 1: // '\001'
			return ((MetadataDecoder) (new EventMessageDecoder()));
	//   50  122:new             #50  <Class EventMessageDecoder>
	//   51  125:dup             
	//   52  126:invokespecial   #51  <Method void EventMessageDecoder()>
	//   53  129:areturn         

		case 0: // '\0'
			return ((MetadataDecoder) (new Id3Decoder()));
	//   54  130:new             #53  <Class Id3Decoder>
	//   55  133:dup             
	//   56  134:invokespecial   #54  <Method void Id3Decoder()>
	//   57  137:areturn         
		}
	}

	public boolean supportsFormat(Format format)
	{
		format = ((Format) (format.sampleMimeType));
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field String Format.sampleMimeType>
	//    2    4:astore_1        
		return "application/id3".equals(((Object) (format))) || "application/x-emsg".equals(((Object) (format))) || "application/x-scte35".equals(((Object) (format)));
	//    3    5:ldc1            #38  <String "application/id3">
	//    4    7:aload_1         
	//    5    8:invokevirtual   #34  <Method boolean String.equals(Object)>
	//    6   11:ifne            37
	//    7   14:ldc1            #36  <String "application/x-emsg">
	//    8   16:aload_1         
	//    9   17:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   10   20:ifne            37
	//   11   23:ldc1            #30  <String "application/x-scte35">
	//   12   25:aload_1         
	//   13   26:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   14   29:ifeq            35
	//   15   32:goto            37
	//   16   35:iconst_0        
	//   17   36:ireturn         
	//   18   37:iconst_1        
	//   19   38:ireturn         
	}

	MetadataDecoderFactory$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
