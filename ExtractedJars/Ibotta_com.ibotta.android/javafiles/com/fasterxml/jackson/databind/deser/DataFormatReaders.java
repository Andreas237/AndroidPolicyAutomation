// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.*;

public class DataFormatReaders
{
	protected class AccessorForReader extends com.fasterxml.jackson.core.format.InputAccessor.Std
	{

		public Match createMatcher(ObjectReader objectreader, MatchStrength matchstrength)
		{
			return new Match(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, objectreader, matchstrength);
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
	}

	public static class Match
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


	private DataFormatReaders(ObjectReader aobjectreader[], MatchStrength matchstrength, MatchStrength matchstrength1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_readers = aobjectreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ObjectReader[] _readers>
		_optimalMatch = matchstrength;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field MatchStrength _optimalMatch>
		_minimalMatch = matchstrength1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field MatchStrength _minimalMatch>
		_maxInputLookahead = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #30  <Field int _maxInputLookahead>
	//   14   25:return          
	}

	private Match _findFormat(AccessorForReader accessorforreader)
		throws IOException
	{
		ObjectReader aobjectreader[] = _readers;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ObjectReader[] _readers>
	//    2    4:astore          10
		int j = aobjectreader.length;
	//    3    6:aload           10
	//    4    8:arraylength     
	//    5    9:istore_3        
		ObjectReader objectreader = null;
	//    6   10:aconst_null     
	//    7   11:astore          5
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		Object obj = null;
	//   10   15:aconst_null     
	//   11   16:astore          4
		Object obj1;
		Object obj2;
		do
		{
			obj1 = ((Object) (objectreader));
	//   12   18:aload           5
	//   13   20:astore          6
			obj2 = obj;
	//   14   22:aload           4
	//   15   24:astore          7
			if(i >= j)
				break;
	//   16   26:iload_2         
	//   17   27:iload_3         
	//   18   28:icmpge          169
			ObjectReader objectreader1 = aobjectreader[i];
	//   19   31:aload           10
	//   20   33:iload_2         
	//   21   34:aaload          
	//   22   35:astore          8
			accessorforreader.reset();
	//   23   37:aload_1         
	//   24   38:invokevirtual   #38  <Method void DataFormatReaders$AccessorForReader.reset()>
			obj1 = ((Object) (objectreader1.getFactory().hasFormat(((com.fasterxml.jackson.core.format.InputAccessor) (accessorforreader)))));
	//   25   41:aload           8
	//   26   43:invokevirtual   #44  <Method JsonFactory ObjectReader.getFactory()>
	//   27   46:aload_1         
	//   28   47:invokevirtual   #50  <Method MatchStrength JsonFactory.hasFormat(com.fasterxml.jackson.core.format.InputAccessor)>
	//   29   50:astore          6
			ObjectReader objectreader2 = objectreader;
	//   30   52:aload           5
	//   31   54:astore          9
			obj2 = obj;
	//   32   56:aload           4
	//   33   58:astore          7
			if(obj1 != null)
	//*  34   60:aload           6
	//*  35   62:ifnull          154
				if(((MatchStrength) (obj1)).ordinal() < _minimalMatch.ordinal())
	//*  36   65:aload           6
	//*  37   67:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  38   70:aload_0         
	//*  39   71:getfield        #28  <Field MatchStrength _minimalMatch>
	//*  40   74:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  41   77:icmpge          91
				{
					objectreader2 = objectreader;
	//   42   80:aload           5
	//   43   82:astore          9
					obj2 = obj;
	//   44   84:aload           4
	//   45   86:astore          7
				} else
	//*  46   88:goto            154
				if(objectreader != null && ((MatchStrength) (obj)).ordinal() >= ((MatchStrength) (obj1)).ordinal())
	//*  47   91:aload           5
	//*  48   93:ifnull          120
	//*  49   96:aload           4
	//*  50   98:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  51  101:aload           6
	//*  52  103:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  53  106:icmplt          120
				{
					objectreader2 = objectreader;
	//   54  109:aload           5
	//   55  111:astore          9
					obj2 = obj;
	//   56  113:aload           4
	//   57  115:astore          7
				} else
	//*  58  117:goto            154
				{
					if(((MatchStrength) (obj1)).ordinal() >= _optimalMatch.ordinal())
	//*  59  120:aload           6
	//*  60  122:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  61  125:aload_0         
	//*  62  126:getfield        #26  <Field MatchStrength _optimalMatch>
	//*  63  129:invokevirtual   #56  <Method int MatchStrength.ordinal()>
	//*  64  132:icmplt          146
					{
						obj2 = obj1;
	//   65  135:aload           6
	//   66  137:astore          7
						obj1 = ((Object) (objectreader1));
	//   67  139:aload           8
	//   68  141:astore          6
						break;
	//   69  143:goto            169
					}
					obj2 = obj1;
	//   70  146:aload           6
	//   71  148:astore          7
					objectreader2 = objectreader1;
	//   72  150:aload           8
	//   73  152:astore          9
				}
			i++;
	//   74  154:iload_2         
	//   75  155:iconst_1        
	//   76  156:iadd            
	//   77  157:istore_2        
			objectreader = objectreader2;
	//   78  158:aload           9
	//   79  160:astore          5
			obj = obj2;
	//   80  162:aload           7
	//   81  164:astore          4
		} while(true);
	//   82  166:goto            18
		return accessorforreader.createMatcher(((ObjectReader) (obj1)), ((MatchStrength) (obj2)));
	//   83  169:aload_1         
	//   84  170:aload           6
	//   85  172:aload           7
	//   86  174:invokevirtual   #60  <Method DataFormatReaders$Match DataFormatReaders$AccessorForReader.createMatcher(ObjectReader, MatchStrength)>
	//   87  177:areturn         
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
	//    6    8:getfield        #30  <Field int _maxInputLookahead>
	//    7   11:newarray        byte[]
	//    8   13:invokespecial   #66  <Method void DataFormatReaders$AccessorForReader(DataFormatReaders, InputStream, byte[])>
	//    9   16:invokespecial   #68  <Method DataFormatReaders$Match _findFormat(DataFormatReaders$AccessorForReader)>
	//   10   19:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append('[');
	//    4    8:aload_3         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		ObjectReader aobjectreader[] = _readers;
	//    8   15:aload_0         
	//    9   16:getfield        #24  <Field ObjectReader[] _readers>
	//   10   19:astore          4
		int j = aobjectreader.length;
	//   11   21:aload           4
	//   12   23:arraylength     
	//   13   24:istore_2        
		if(j > 0)
	//*  14   25:iload_2         
	//*  15   26:ifle            82
		{
			stringbuilder.append(aobjectreader[0].getFactory().getFormatName());
	//   16   29:aload_3         
	//   17   30:aload           4
	//   18   32:iconst_0        
	//   19   33:aaload          
	//   20   34:invokevirtual   #44  <Method JsonFactory ObjectReader.getFactory()>
	//   21   37:invokevirtual   #80  <Method String JsonFactory.getFormatName()>
	//   22   40:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			for(int i = 1; i < j; i++)
	//*  24   44:iconst_1        
	//*  25   45:istore_1        
	//*  26   46:iload_1         
	//*  27   47:iload_2         
	//*  28   48:icmpge          82
			{
				stringbuilder.append(", ");
	//   29   51:aload_3         
	//   30   52:ldc1            #85  <String ", ">
	//   31   54:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   32   57:pop             
				stringbuilder.append(_readers[i].getFactory().getFormatName());
	//   33   58:aload_3         
	//   34   59:aload_0         
	//   35   60:getfield        #24  <Field ObjectReader[] _readers>
	//   36   63:iload_1         
	//   37   64:aaload          
	//   38   65:invokevirtual   #44  <Method JsonFactory ObjectReader.getFactory()>
	//   39   68:invokevirtual   #80  <Method String JsonFactory.getFormatName()>
	//   40   71:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
			}

	//   42   75:iload_1         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_1        
		}
	//*  46   79:goto            46
		stringbuilder.append(']');
	//   47   82:aload_3         
	//   48   83:bipush          93
	//   49   85:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   50   88:pop             
		return stringbuilder.toString();
	//   51   89:aload_3         
	//   52   90:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   53   93:areturn         
	}

	public DataFormatReaders withType(JavaType javatype)
	{
		int j = _readers.length;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ObjectReader[] _readers>
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
	//   15   23:getfield        #24  <Field ObjectReader[] _readers>
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:aload_1         
	//   19   29:invokevirtual   #93  <Method ObjectReader ObjectReader.forType(JavaType)>
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
	//   30   47:getfield        #26  <Field MatchStrength _optimalMatch>
	//   31   50:aload_0         
	//   32   51:getfield        #28  <Field MatchStrength _minimalMatch>
	//   33   54:aload_0         
	//   34   55:getfield        #30  <Field int _maxInputLookahead>
	//   35   58:invokespecial   #95  <Method void DataFormatReaders(ObjectReader[], MatchStrength, MatchStrength, int)>
	//   36   61:areturn         
	}

	protected final int _maxInputLookahead;
	protected final MatchStrength _minimalMatch;
	protected final MatchStrength _optimalMatch;
	protected final ObjectReader _readers[];
}
