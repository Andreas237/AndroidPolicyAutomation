// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.Collection;

public class DataFormatReaders
{
	protected class AccessorForReader extends com.fasterxml.jackson.core.format.InputAccessor.Std
	{

		public Match createMatcher(ObjectReader objectreader, MatchStrength matchstrength)
		{
			return new Match(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, objectreader, matchstrength);
		//    0    0:new             #29  <Class DataFormatReaders$Match>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #33  <Field InputStream _in>
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field byte[] _buffer>
		//    6   12:aload_0         
		//    7   13:getfield        #41  <Field int _bufferedStart>
		//    8   16:aload_0         
		//    9   17:getfield        #44  <Field int _bufferedEnd>
		//   10   20:aload_0         
		//   11   21:getfield        #41  <Field int _bufferedStart>
		//   12   24:isub            
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokespecial   #47  <Method void DataFormatReaders$Match(InputStream, byte[], int, int, ObjectReader, MatchStrength)>
		//   16   30:areturn         
		}

		final DataFormatReaders this$0;

		public AccessorForReader(InputStream inputstream, byte abyte0[])
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

		public AccessorForReader(byte abyte0[])
		{
			this$0 = DataFormatReaders.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field DataFormatReaders this$0>
			super(abyte0);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #21  <Method void com.fasterxml.jackson.core.format.InputAccessor$Std(byte[])>
		//    6   10:return          
		}

		public AccessorForReader(byte abyte0[], int i, int j)
		{
			this$0 = DataFormatReaders.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field DataFormatReaders this$0>
			super(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iload_3         
		//    6    8:iload           4
		//    7   10:invokespecial   #25  <Method void com.fasterxml.jackson.core.format.InputAccessor$Std(byte[], int, int)>
		//    8   13:return          
		}
	}

	public static class Match
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

		protected Match(InputStream inputstream, byte abyte0[], int i, int j, ObjectReader objectreader, MatchStrength matchstrength)
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


	public DataFormatReaders(Collection collection)
	{
		this((ObjectReader[])collection.toArray(((Object []) (new ObjectReader[collection.size()]))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokeinterface #27  <Method int Collection.size()>
	//    4    8:anewarray       ObjectReader[]
	//    5   11:invokeinterface #33  <Method Object[] Collection.toArray(Object[])>
	//    6   16:checkcast       #34  <Class ObjectReader[]>
	//    7   19:invokespecial   #37  <Method void DataFormatReaders(ObjectReader[])>
	//    8   22:return          
	}

	public transient DataFormatReaders(ObjectReader aobjectreader[])
	{
		this(aobjectreader, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #45  <Field MatchStrength MatchStrength.SOLID_MATCH>
	//    3    5:getstatic       #48  <Field MatchStrength MatchStrength.WEAK_MATCH>
	//    4    8:bipush          64
	//    5   10:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//    6   13:return          
	}

	private DataFormatReaders(ObjectReader aobjectreader[], MatchStrength matchstrength, MatchStrength matchstrength1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		_readers = aobjectreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field ObjectReader[] _readers>
		_optimalMatch = matchstrength;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #58  <Field MatchStrength _optimalMatch>
		_minimalMatch = matchstrength1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #60  <Field MatchStrength _minimalMatch>
		_maxInputLookahead = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #62  <Field int _maxInputLookahead>
	//   14   25:return          
	}

	private Match _findFormat(AccessorForReader accessorforreader)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		Object obj1;
		ObjectReader aobjectreader[];
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		aobjectreader = _readers;
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field ObjectReader[] _readers>
	//    6   10:astore          10
		j = aobjectreader.length;
	//    7   12:aload           10
	//    8   14:arraylength     
	//    9   15:istore_3        
		i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_2        
_L2:
		Object obj2;
		Object obj3;
		MatchStrength matchstrength;
		ObjectReader objectreader;
		obj3 = obj1;
	//   12   18:aload           5
	//   13   20:astore          7
		obj2 = obj;
	//   14   22:aload           4
	//   15   24:astore          6
		if(i >= j)
			break MISSING_BLOCK_LABEL_168;
	//   16   26:iload_2         
	//   17   27:iload_3         
	//   18   28:icmpge          168
		objectreader = aobjectreader[i];
	//   19   31:aload           10
	//   20   33:iload_2         
	//   21   34:aaload          
	//   22   35:astore          9
		accessorforreader.reset();
	//   23   37:aload_1         
	//   24   38:invokevirtual   #69  <Method void DataFormatReaders$AccessorForReader.reset()>
		matchstrength = objectreader.getFactory().hasFormat(((com.fasterxml.jackson.core.format.InputAccessor) (accessorforreader)));
	//   25   41:aload           9
	//   26   43:invokevirtual   #73  <Method JsonFactory ObjectReader.getFactory()>
	//   27   46:aload_1         
	//   28   47:invokevirtual   #79  <Method MatchStrength JsonFactory.hasFormat(com.fasterxml.jackson.core.format.InputAccessor)>
	//   29   50:astore          8
		obj2 = obj1;
	//   30   52:aload           5
	//   31   54:astore          6
		obj3 = obj;
	//   32   56:aload           4
	//   33   58:astore          7
		if(matchstrength != null)
	//*  34   60:aload           8
	//*  35   62:ifnull          88
		{
			if(matchstrength.ordinal() >= _minimalMatch.ordinal())
				break; /* Loop/switch isn't completed */
	//   36   65:aload           8
	//   37   67:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   38   70:aload_0         
	//   39   71:getfield        #60  <Field MatchStrength _minimalMatch>
	//   40   74:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   41   77:icmpge          103
			obj3 = obj;
	//   42   80:aload           4
	//   43   82:astore          7
			obj2 = obj1;
	//   44   84:aload           5
	//   45   86:astore          6
		}
_L4:
		i++;
	//   46   88:iload_2         
	//   47   89:iconst_1        
	//   48   90:iadd            
	//   49   91:istore_2        
		obj1 = obj2;
	//   50   92:aload           6
	//   51   94:astore          5
		obj = obj3;
	//   52   96:aload           7
	//   53   98:astore          4
		if(true) goto _L2; else goto _L1
	//   54  100:goto            18
_L1:
		if(obj1 == null)
			break; /* Loop/switch isn't completed */
	//   55  103:aload           5
	//   56  105:ifnull          129
		obj2 = obj1;
	//   57  108:aload           5
	//   58  110:astore          6
		obj3 = obj;
	//   59  112:aload           4
	//   60  114:astore          7
		if(((MatchStrength) (obj)).ordinal() >= matchstrength.ordinal()) goto _L4; else goto _L3
	//   61  116:aload           4
	//   62  118:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   63  121:aload           8
	//   64  123:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   65  126:icmpge          88
_L3:
		obj = ((Object) (objectreader));
	//   66  129:aload           9
	//   67  131:astore          4
		obj1 = ((Object) (matchstrength));
	//   68  133:aload           8
	//   69  135:astore          5
		obj2 = obj;
	//   70  137:aload           4
	//   71  139:astore          6
		obj3 = obj1;
	//   72  141:aload           5
	//   73  143:astore          7
		if(matchstrength.ordinal() < _optimalMatch.ordinal()) goto _L4; else goto _L5
	//   74  145:aload           8
	//   75  147:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   76  150:aload_0         
	//   77  151:getfield        #58  <Field MatchStrength _optimalMatch>
	//   78  154:invokevirtual   #82  <Method int MatchStrength.ordinal()>
	//   79  157:icmplt          88
_L5:
		obj2 = obj1;
	//   80  160:aload           5
	//   81  162:astore          6
		obj3 = obj;
	//   82  164:aload           4
	//   83  166:astore          7
		return accessorforreader.createMatcher(((ObjectReader) (obj3)), ((MatchStrength) (obj2)));
	//   84  168:aload_1         
	//   85  169:aload           7
	//   86  171:aload           6
	//   87  173:invokevirtual   #86  <Method DataFormatReaders$Match DataFormatReaders$AccessorForReader.createMatcher(ObjectReader, MatchStrength)>
	//   88  176:areturn         
	}

	public Match findFormat(InputStream inputstream)
		throws IOException
	{
		return _findFormat(new AccessorForReader(inputstream, new byte[_maxInputLookahead]));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class DataFormatReaders$AccessorForReader>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field int _maxInputLookahead>
	//    7   11:newarray        byte[]
	//    8   13:invokespecial   #92  <Method void DataFormatReaders$AccessorForReader(DataFormatReaders, InputStream, byte[])>
	//    9   16:invokespecial   #94  <Method DataFormatReaders$Match _findFormat(DataFormatReaders$AccessorForReader)>
	//   10   19:areturn         
	}

	public Match findFormat(byte abyte0[])
		throws IOException
	{
		return _findFormat(new AccessorForReader(abyte0));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class DataFormatReaders$AccessorForReader>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #98  <Method void DataFormatReaders$AccessorForReader(DataFormatReaders, byte[])>
	//    6   10:invokespecial   #94  <Method DataFormatReaders$Match _findFormat(DataFormatReaders$AccessorForReader)>
	//    7   13:areturn         
	}

	public Match findFormat(byte abyte0[], int i, int j)
		throws IOException
	{
		return _findFormat(new AccessorForReader(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class DataFormatReaders$AccessorForReader>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #102 <Method void DataFormatReaders$AccessorForReader(DataFormatReaders, byte[], int, int)>
	//    8   12:invokespecial   #94  <Method DataFormatReaders$Match _findFormat(DataFormatReaders$AccessorForReader)>
	//    9   15:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #106 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append('[');
	//    4    8:aload_3         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		int j = _readers.length;
	//    8   15:aload_0         
	//    9   16:getfield        #56  <Field ObjectReader[] _readers>
	//   10   19:arraylength     
	//   11   20:istore_2        
		if(j > 0)
	//*  12   21:iload_2         
	//*  13   22:ifle            80
		{
			stringbuilder.append(_readers[0].getFactory().getFormatName());
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:getfield        #56  <Field ObjectReader[] _readers>
	//   17   30:iconst_0        
	//   18   31:aaload          
	//   19   32:invokevirtual   #73  <Method JsonFactory ObjectReader.getFactory()>
	//   20   35:invokevirtual   #114 <Method String JsonFactory.getFormatName()>
	//   21   38:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			for(int i = 1; i < j; i++)
	//*  23   42:iconst_1        
	//*  24   43:istore_1        
	//*  25   44:iload_1         
	//*  26   45:iload_2         
	//*  27   46:icmpge          80
			{
				stringbuilder.append(", ");
	//   28   49:aload_3         
	//   29   50:ldc1            #119 <String ", ">
	//   30   52:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
				stringbuilder.append(_readers[i].getFactory().getFormatName());
	//   32   56:aload_3         
	//   33   57:aload_0         
	//   34   58:getfield        #56  <Field ObjectReader[] _readers>
	//   35   61:iload_1         
	//   36   62:aaload          
	//   37   63:invokevirtual   #73  <Method JsonFactory ObjectReader.getFactory()>
	//   38   66:invokevirtual   #114 <Method String JsonFactory.getFormatName()>
	//   39   69:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   40   72:pop             
			}

	//   41   73:iload_1         
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:istore_1        
		}
	//*  45   77:goto            44
		stringbuilder.append(']');
	//   46   80:aload_3         
	//   47   81:bipush          93
	//   48   83:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//   49   86:pop             
		return stringbuilder.toString();
	//   50   87:aload_3         
	//   51   88:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   52   91:areturn         
	}

	public DataFormatReaders with(DeserializationConfig deserializationconfig)
	{
		int j = _readers.length;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ObjectReader[] _readers>
	//    2    4:arraylength     
	//    3    5:istore_3        
		ObjectReader aobjectreader[] = new ObjectReader[j];
	//    4    6:iload_3         
	//    5    7:anewarray       ObjectReader[]
	//    6   10:astore          4
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_3         
	//*  11   16:icmpge          40
			aobjectreader[i] = _readers[i].with(deserializationconfig);
	//   12   19:aload           4
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #56  <Field ObjectReader[] _readers>
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:aload_1         
	//   19   29:invokevirtual   #126 <Method ObjectReader ObjectReader.with(DeserializationConfig)>
	//   20   32:aastore         

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            14
		return new DataFormatReaders(aobjectreader, _optimalMatch, _minimalMatch, _maxInputLookahead);
	//   26   40:new             #2   <Class DataFormatReaders>
	//   27   43:dup             
	//   28   44:aload           4
	//   29   46:aload_0         
	//   30   47:getfield        #58  <Field MatchStrength _optimalMatch>
	//   31   50:aload_0         
	//   32   51:getfield        #60  <Field MatchStrength _minimalMatch>
	//   33   54:aload_0         
	//   34   55:getfield        #62  <Field int _maxInputLookahead>
	//   35   58:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   36   61:areturn         
	}

	public DataFormatReaders with(ObjectReader aobjectreader[])
	{
		return new DataFormatReaders(aobjectreader, _optimalMatch, _minimalMatch, _maxInputLookahead);
	//    0    0:new             #2   <Class DataFormatReaders>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field MatchStrength _optimalMatch>
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field MatchStrength _minimalMatch>
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field int _maxInputLookahead>
	//    9   17:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   10   20:areturn         
	}

	public DataFormatReaders withMaxInputLookahead(int i)
	{
		if(i == _maxInputLookahead)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #62  <Field int _maxInputLookahead>
	//*   3    5:icmpne          10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatReaders(_readers, _optimalMatch, _minimalMatch, i);
	//    6   10:new             #2   <Class DataFormatReaders>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field ObjectReader[] _readers>
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field MatchStrength _optimalMatch>
	//   12   22:aload_0         
	//   13   23:getfield        #60  <Field MatchStrength _minimalMatch>
	//   14   26:iload_1         
	//   15   27:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public DataFormatReaders withMinimalMatch(MatchStrength matchstrength)
	{
		if(matchstrength == _minimalMatch)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #60  <Field MatchStrength _minimalMatch>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatReaders(_readers, _optimalMatch, matchstrength, _maxInputLookahead);
	//    6   10:new             #2   <Class DataFormatReaders>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field ObjectReader[] _readers>
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field MatchStrength _optimalMatch>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #62  <Field int _maxInputLookahead>
	//   15   27:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public DataFormatReaders withOptimalMatch(MatchStrength matchstrength)
	{
		if(matchstrength == _optimalMatch)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #58  <Field MatchStrength _optimalMatch>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatReaders(_readers, matchstrength, _minimalMatch, _maxInputLookahead);
	//    6   10:new             #2   <Class DataFormatReaders>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field ObjectReader[] _readers>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #60  <Field MatchStrength _minimalMatch>
	//   13   23:aload_0         
	//   14   24:getfield        #62  <Field int _maxInputLookahead>
	//   15   27:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public DataFormatReaders withType(JavaType javatype)
	{
		int j = _readers.length;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ObjectReader[] _readers>
	//    2    4:arraylength     
	//    3    5:istore_3        
		ObjectReader aobjectreader[] = new ObjectReader[j];
	//    4    6:iload_3         
	//    5    7:anewarray       ObjectReader[]
	//    6   10:astore          4
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_3         
	//*  11   16:icmpge          40
			aobjectreader[i] = _readers[i].forType(javatype);
	//   12   19:aload           4
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #56  <Field ObjectReader[] _readers>
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:aload_1         
	//   19   29:invokevirtual   #138 <Method ObjectReader ObjectReader.forType(JavaType)>
	//   20   32:aastore         

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            14
		return new DataFormatReaders(aobjectreader, _optimalMatch, _minimalMatch, _maxInputLookahead);
	//   26   40:new             #2   <Class DataFormatReaders>
	//   27   43:dup             
	//   28   44:aload           4
	//   29   46:aload_0         
	//   30   47:getfield        #58  <Field MatchStrength _optimalMatch>
	//   31   50:aload_0         
	//   32   51:getfield        #60  <Field MatchStrength _minimalMatch>
	//   33   54:aload_0         
	//   34   55:getfield        #62  <Field int _maxInputLookahead>
	//   35   58:invokespecial   #51  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   36   61:areturn         
	}

	public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
	protected final int _maxInputLookahead;
	protected final MatchStrength _minimalMatch;
	protected final MatchStrength _optimalMatch;
	protected final ObjectReader _readers[];
}
