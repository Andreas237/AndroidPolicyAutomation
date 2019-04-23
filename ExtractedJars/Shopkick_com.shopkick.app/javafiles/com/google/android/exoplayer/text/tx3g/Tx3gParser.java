// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.tx3g;

import com.google.android.exoplayer.text.*;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.text.tx3g:
//			Tx3gSubtitle

public final class Tx3gParser
	implements SubtitleParser
{

	public Tx3gParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ParsableByteArray()>
	//    6   12:putfield        #17  <Field ParsableByteArray parsableByteArray>
	//    7   15:return          
	}

	public boolean canParse(String s)
	{
		return "application/x-quicktime-tx3g".equals(((Object) (s)));
	//    0    0:ldc1            #22  <String "application/x-quicktime-tx3g">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #28  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public Subtitle parse(byte abyte0[], int i, int j)
	{
		parsableByteArray.reset(abyte0, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ParsableByteArray parsableByteArray>
	//    2    4:aload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #34  <Method void ParsableByteArray.reset(byte[], int)>
		i = parsableByteArray.readUnsignedShort();
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field ParsableByteArray parsableByteArray>
	//    7   13:invokevirtual   #38  <Method int ParsableByteArray.readUnsignedShort()>
	//    8   16:istore_2        
		if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            25
			return ((Subtitle) (Tx3gSubtitle.EMPTY));
	//   11   21:getstatic       #44  <Field Tx3gSubtitle Tx3gSubtitle.EMPTY>
	//   12   24:areturn         
		else
			return ((Subtitle) (new Tx3gSubtitle(new Cue(((CharSequence) (parsableByteArray.readString(i)))))));
	//   13   25:new             #40  <Class Tx3gSubtitle>
	//   14   28:dup             
	//   15   29:new             #46  <Class Cue>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #17  <Field ParsableByteArray parsableByteArray>
	//   19   37:iload_2         
	//   20   38:invokevirtual   #50  <Method String ParsableByteArray.readString(int)>
	//   21   41:invokespecial   #53  <Method void Cue(CharSequence)>
	//   22   44:invokespecial   #56  <Method void Tx3gSubtitle(Cue)>
	//   23   47:areturn         
	}

	private final ParsableByteArray parsableByteArray = new ParsableByteArray();
}
