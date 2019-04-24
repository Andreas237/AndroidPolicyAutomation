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
		if(_match == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ObjectReader _match>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JsonFactory jsonfactory = _match.getFactory();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field ObjectReader _match>
	//    7   13:invokevirtual   #46  <Method JsonFactory ObjectReader.getFactory()>
	//    8   16:astore_1        
		if(_originalStream == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #25  <Field InputStream _originalStream>
	//*  11   21:ifnonnull       41
			return jsonfactory.createParser(_bufferedData, _bufferedStart, _bufferedLength);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field byte[] _bufferedData>
	//   15   29:aload_0         
	//   16   30:getfield        #29  <Field int _bufferedStart>
	//   17   33:aload_0         
	//   18   34:getfield        #31  <Field int _bufferedLength>
	//   19   37:invokevirtual   #52  <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//   20   40:areturn         
		else
			return jsonfactory.createParser(getDataStream());
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #56  <Method InputStream getDataStream()>
	//   24   46:invokevirtual   #59  <Method JsonParser JsonFactory.createParser(InputStream)>
	//   25   49:areturn         
	}

	public InputStream getDataStream()
	{
		if(_originalStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field InputStream _originalStream>
	//*   2    4:ifnonnull       27
			return ((InputStream) (new ByteArrayInputStream(_bufferedData, _bufferedStart, _bufferedLength)));
	//    3    7:new             #62  <Class ByteArrayInputStream>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field byte[] _bufferedData>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field int _bufferedStart>
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field int _bufferedLength>
	//   11   23:invokespecial   #65  <Method void ByteArrayInputStream(byte[], int, int)>
	//   12   26:areturn         
		else
			return ((InputStream) (new MergedStream(((com.fasterxml.jackson.core.io.IOContext) (null)), _originalStream, _bufferedData, _bufferedStart, _bufferedLength)));
	//   13   27:new             #67  <Class MergedStream>
	//   14   30:dup             
	//   15   31:aconst_null     
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field InputStream _originalStream>
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field byte[] _bufferedData>
	//   20   40:aload_0         
	//   21   41:getfield        #29  <Field int _bufferedStart>
	//   22   44:aload_0         
	//   23   45:getfield        #31  <Field int _bufferedLength>
	//   24   48:invokespecial   #70  <Method void MergedStream(com.fasterxml.jackson.core.io.IOContext, InputStream, byte[], int, int)>
	//   25   51:areturn         
	}

	public MatchStrength getMatchStrength()
	{
		if(_matchStrength == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field MatchStrength _matchStrength>
	//*   2    4:ifnonnull       11
			return MatchStrength.INCONCLUSIVE;
	//    3    7:getstatic       #77  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//    4   10:areturn         
		else
			return _matchStrength;
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field MatchStrength _matchStrength>
	//    7   15:areturn         
	}

	public String getMatchedFormatName()
	{
		return _match.getFactory().getFormatName();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ObjectReader _match>
	//    2    4:invokevirtual   #46  <Method JsonFactory ObjectReader.getFactory()>
	//    3    7:invokevirtual   #82  <Method String JsonFactory.getFormatName()>
	//    4   10:areturn         
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
