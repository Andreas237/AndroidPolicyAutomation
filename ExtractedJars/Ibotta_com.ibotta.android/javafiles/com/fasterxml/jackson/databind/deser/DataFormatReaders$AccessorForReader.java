// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			DataFormatReaders

protected class DataFormatReaders$AccessorForReader extends com.fasterxml.jackson.core.format.InputAccessor.Std
{

	public DataFormatReaders.Match createMatcher(ObjectReader objectreader, MatchStrength matchstrength)
	{
		return new DataFormatReaders.Match(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, objectreader, matchstrength);
	//    0    0:new             #21  <Class DataFormatReaders$Match>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field InputStream _in>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field byte[] _buffer>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field int _bufferedStart>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field int _bufferedEnd>
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field int _bufferedStart>
	//   12   24:isub            
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #39  <Method void DataFormatReaders$Match(InputStream, byte[], int, int, ObjectReader, MatchStrength)>
	//   16   30:areturn         
	}

	final DataFormatReaders this$0;

	public DataFormatReaders$AccessorForReader(InputStream inputstream, byte abyte0[])
	{
		this$0 = DataFormatReaders.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field DataFormatReaders this$0>
		super(inputstream, abyte0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #16  <Method void com.fasterxml.jackson.core.format.InputAccessor$Std(InputStream, byte[])>
	//    7   11:return          
	}
}
