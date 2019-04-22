// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			DataFormatReaders

public static class DataFormatReaders$Match
{

	public JsonParser createParserWithMatch()
		throws IOException
	{
		Object obj = ((Object) (_match));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ObjectReader _match>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		obj = ((Object) (((ObjectReader) (obj)).getFactory()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #46  <Method JsonFactory ObjectReader.getFactory()>
	//    9   15:astore_1        
		if(_originalStream == null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #25  <Field InputStream _originalStream>
	//*  12   20:ifnonnull       40
			return ((JsonFactory) (obj)).createParser(_bufferedData, _bufferedStart, _bufferedLength);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #27  <Field byte[] _bufferedData>
	//   16   28:aload_0         
	//   17   29:getfield        #29  <Field int _bufferedStart>
	//   18   32:aload_0         
	//   19   33:getfield        #31  <Field int _bufferedLength>
	//   20   36:invokevirtual   #52  <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//   21   39:areturn         
		else
			return ((JsonFactory) (obj)).createParser(getDataStream());
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:invokevirtual   #56  <Method InputStream getDataStream()>
	//   25   45:invokevirtual   #59  <Method JsonParser JsonFactory.createParser(InputStream)>
	//   26   48:areturn         
	}

	public InputStream getDataStream()
	{
		InputStream inputstream = _originalStream;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field InputStream _originalStream>
	//    2    4:astore_1        
		if(inputstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       29
			return ((InputStream) (new ByteArrayInputStream(_bufferedData, _bufferedStart, _bufferedLength)));
	//    5    9:new             #62  <Class ByteArrayInputStream>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field byte[] _bufferedData>
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field int _bufferedStart>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field int _bufferedLength>
	//   13   25:invokespecial   #65  <Method void ByteArrayInputStream(byte[], int, int)>
	//   14   28:areturn         
		else
			return ((InputStream) (new MergedStream(((com.fasterxml.jackson.core.io.IOContext) (null)), inputstream, _bufferedData, _bufferedStart, _bufferedLength)));
	//   15   29:new             #67  <Class MergedStream>
	//   16   32:dup             
	//   17   33:aconst_null     
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field byte[] _bufferedData>
	//   21   39:aload_0         
	//   22   40:getfield        #29  <Field int _bufferedStart>
	//   23   43:aload_0         
	//   24   44:getfield        #31  <Field int _bufferedLength>
	//   25   47:invokespecial   #70  <Method void MergedStream(com.fasterxml.jackson.core.io.IOContext, InputStream, byte[], int, int)>
	//   26   50:areturn         
	}

	public ObjectReader getReader()
	{
		return _match;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ObjectReader _match>
	//    2    4:areturn         
	}

	public boolean hasMatch()
	{
		return _match != null;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ObjectReader _match>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected final byte _bufferedData[];
	protected final int _bufferedLength;
	protected final int _bufferedStart;
	protected final ObjectReader _match;
	protected final MatchStrength _matchStrength;
	protected final InputStream _originalStream;

	protected DataFormatReaders$Match(InputStream inputstream, byte abyte0[], int i, int j, ObjectReader objectreader, MatchStrength matchstrength)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_originalStream = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field InputStream _originalStream>
		_bufferedData = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field byte[] _bufferedData>
		_bufferedStart = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field int _bufferedStart>
		_bufferedLength = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #31  <Field int _bufferedLength>
		_match = objectreader;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field ObjectReader _match>
		_matchStrength = matchstrength;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #35  <Field MatchStrength _matchStrength>
	//   20   37:return          
	}
}
