// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser, DvbSubtitle

public final class DvbDecoder extends SimpleSubtitleDecoder
{

	public DvbDecoder(List list)
	{
		super("DvbDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "DvbDecoder">
	//    2    3:invokespecial   #13  <Method void SimpleSubtitleDecoder(String)>
		list = ((List) (new ParsableByteArray((byte[])list.get(0))));
	//    3    6:new             #15  <Class ParsableByteArray>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:iconst_0        
	//    7   12:invokeinterface #21  <Method Object List.get(int)>
	//    8   17:checkcast       #23  <Class byte[]>
	//    9   20:invokespecial   #26  <Method void ParsableByteArray(byte[])>
	//   10   23:astore_1        
		parser = new DvbParser(((ParsableByteArray) (list)).readUnsignedShort(), ((ParsableByteArray) (list)).readUnsignedShort());
	//   11   24:aload_0         
	//   12   25:new             #28  <Class DvbParser>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokevirtual   #32  <Method int ParsableByteArray.readUnsignedShort()>
	//   16   33:aload_1         
	//   17   34:invokevirtual   #32  <Method int ParsableByteArray.readUnsignedShort()>
	//   18   37:invokespecial   #35  <Method void DvbParser(int, int)>
	//   19   40:putfield        #37  <Field DvbParser parser>
	//   20   43:return          
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #47  <Method DvbSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected DvbSubtitle decode(byte abyte0[], int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            11
			parser.reset();
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field DvbParser parser>
	//    4    8:invokevirtual   #52  <Method void DvbParser.reset()>
		return new DvbSubtitle(parser.decode(abyte0, i));
	//    5   11:new             #54  <Class DvbSubtitle>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field DvbParser parser>
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokevirtual   #57  <Method List DvbParser.decode(byte[], int)>
	//   12   24:invokespecial   #59  <Method void DvbSubtitle(List)>
	//   13   27:areturn         
	}

	private final DvbParser parser;
}
