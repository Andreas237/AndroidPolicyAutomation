// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.MergedStream;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.format:
//			MatchStrength

public class DataFormatMatcher
{

	protected DataFormatMatcher(InputStream inputstream, byte abyte0[], int i, int j, JsonFactory jsonfactory, MatchStrength matchstrength)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_originalStream = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field InputStream _originalStream>
		_bufferedData = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field byte[] _bufferedData>
		_bufferedStart = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int _bufferedStart>
		_bufferedLength = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field int _bufferedLength>
		_match = jsonfactory;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #30  <Field JsonFactory _match>
		_matchStrength = matchstrength;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #32  <Field MatchStrength _matchStrength>
	//   20   37:return          
	}

	public JsonParser createParserWithMatch()
		throws IOException
	{
		if(_match == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field JsonFactory _match>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(_originalStream == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #22  <Field InputStream _originalStream>
	//*   7   13:ifnonnull       36
			return _match.createParser(_bufferedData, _bufferedStart, _bufferedLength);
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field JsonFactory _match>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field byte[] _bufferedData>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field int _bufferedStart>
	//   14   28:aload_0         
	//   15   29:getfield        #28  <Field int _bufferedLength>
	//   16   32:invokevirtual   #43  <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//   17   35:areturn         
		else
			return _match.createParser(getDataStream());
	//   18   36:aload_0         
	//   19   37:getfield        #30  <Field JsonFactory _match>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #47  <Method InputStream getDataStream()>
	//   22   44:invokevirtual   #50  <Method JsonParser JsonFactory.createParser(InputStream)>
	//   23   47:areturn         
	}

	public InputStream getDataStream()
	{
		if(_originalStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field InputStream _originalStream>
	//*   2    4:ifnonnull       27
			return ((InputStream) (new ByteArrayInputStream(_bufferedData, _bufferedStart, _bufferedLength)));
	//    3    7:new             #53  <Class ByteArrayInputStream>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field byte[] _bufferedData>
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field int _bufferedStart>
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field int _bufferedLength>
	//   11   23:invokespecial   #56  <Method void ByteArrayInputStream(byte[], int, int)>
	//   12   26:areturn         
		else
			return ((InputStream) (new MergedStream(((com.fasterxml.jackson.core.io.IOContext) (null)), _originalStream, _bufferedData, _bufferedStart, _bufferedLength)));
	//   13   27:new             #58  <Class MergedStream>
	//   14   30:dup             
	//   15   31:aconst_null     
	//   16   32:aload_0         
	//   17   33:getfield        #22  <Field InputStream _originalStream>
	//   18   36:aload_0         
	//   19   37:getfield        #24  <Field byte[] _bufferedData>
	//   20   40:aload_0         
	//   21   41:getfield        #26  <Field int _bufferedStart>
	//   22   44:aload_0         
	//   23   45:getfield        #28  <Field int _bufferedLength>
	//   24   48:invokespecial   #61  <Method void MergedStream(com.fasterxml.jackson.core.io.IOContext, InputStream, byte[], int, int)>
	//   25   51:areturn         
	}

	public JsonFactory getMatch()
	{
		return _match;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JsonFactory _match>
	//    2    4:areturn         
	}

	public MatchStrength getMatchStrength()
	{
		if(_matchStrength == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field MatchStrength _matchStrength>
	//*   2    4:ifnonnull       11
			return MatchStrength.INCONCLUSIVE;
	//    3    7:getstatic       #70  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//    4   10:areturn         
		else
			return _matchStrength;
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field MatchStrength _matchStrength>
	//    7   15:areturn         
	}

	public String getMatchedFormatName()
	{
		return _match.getFormatName();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JsonFactory _match>
	//    2    4:invokevirtual   #75  <Method String JsonFactory.getFormatName()>
	//    3    7:areturn         
	}

	public boolean hasMatch()
	{
		return _match != null;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JsonFactory _match>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected final byte _bufferedData[];
	protected final int _bufferedLength;
	protected final int _bufferedStart;
	protected final JsonFactory _match;
	protected final MatchStrength _matchStrength;
	protected final InputStream _originalStream;
}
