// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.flv:
//			TagPayloadReader

final class ScriptTagPayloadReader extends TagPayloadReader
{

	public ScriptTagPayloadReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void TagPayloadReader(TrackOutput)>
	//    3    5:return          
	}

	private static Boolean readAmfBoolean(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		return Boolean.valueOf(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//   13   21:areturn         
	}

	private static Object readAmfData(ParsableByteArray parsablebytearray, int i)
	{
		if(i != 8)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:icmpeq          92
			switch(i)
	//*   3    6:iload_1         
			{
	//*   4    7:tableswitch     0 3: default 36
	//	               0 87
	//	               1 82
	//	               2 77
	//	               3 72
			default:
				switch(i)
	//*   5   36:iload_1         
				{
	//*   6   37:tableswitch     10 11: default 60
	//	               10 67
	//	               11 62
				default:
					return ((Object) (null));
	//    7   60:aconst_null     
	//    8   61:areturn         

				case 11: // '\013'
					return ((Object) (readAmfDate(parsablebytearray)));
	//    9   62:aload_0         
	//   10   63:invokestatic    #53  <Method Date readAmfDate(ParsableByteArray)>
	//   11   66:areturn         

				case 10: // '\n'
					return ((Object) (readAmfStrictArray(parsablebytearray)));
	//   12   67:aload_0         
	//   13   68:invokestatic    #57  <Method ArrayList readAmfStrictArray(ParsableByteArray)>
	//   14   71:areturn         
				}

			case 3: // '\003'
				return ((Object) (readAmfObject(parsablebytearray)));
	//   15   72:aload_0         
	//   16   73:invokestatic    #61  <Method HashMap readAmfObject(ParsableByteArray)>
	//   17   76:areturn         

			case 2: // '\002'
				return ((Object) (readAmfString(parsablebytearray)));
	//   18   77:aload_0         
	//   19   78:invokestatic    #65  <Method String readAmfString(ParsableByteArray)>
	//   20   81:areturn         

			case 1: // '\001'
				return ((Object) (readAmfBoolean(parsablebytearray)));
	//   21   82:aload_0         
	//   22   83:invokestatic    #67  <Method Boolean readAmfBoolean(ParsableByteArray)>
	//   23   86:areturn         

			case 0: // '\0'
				return ((Object) (readAmfDouble(parsablebytearray)));
	//   24   87:aload_0         
	//   25   88:invokestatic    #71  <Method Double readAmfDouble(ParsableByteArray)>
	//   26   91:areturn         
			}
		else
			return ((Object) (readAmfEcmaArray(parsablebytearray)));
	//   27   92:aload_0         
	//   28   93:invokestatic    #74  <Method HashMap readAmfEcmaArray(ParsableByteArray)>
	//   29   96:areturn         
	}

	private static Date readAmfDate(ParsableByteArray parsablebytearray)
	{
		Date date = new Date((long)readAmfDouble(parsablebytearray).doubleValue());
	//    0    0:new             #76  <Class Date>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #71  <Method Double readAmfDouble(ParsableByteArray)>
	//    4    8:invokevirtual   #82  <Method double Double.doubleValue()>
	//    5   11:d2l             
	//    6   12:invokespecial   #85  <Method void Date(long)>
	//    7   15:astore_1        
		parsablebytearray.skipBytes(2);
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:invokevirtual   #89  <Method void ParsableByteArray.skipBytes(int)>
		return date;
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	private static Double readAmfDouble(ParsableByteArray parsablebytearray)
	{
		return Double.valueOf(Double.longBitsToDouble(parsablebytearray.readLong()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method long ParsableByteArray.readLong()>
	//    2    4:invokestatic    #97  <Method double Double.longBitsToDouble(long)>
	//    3    7:invokestatic    #100 <Method Double Double.valueOf(double)>
	//    4   10:areturn         
	}

	private static HashMap readAmfEcmaArray(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedIntToInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    2    4:istore_2        
		HashMap hashmap = new HashMap(j);
	//    3    5:new             #105 <Class HashMap>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #107 <Method void HashMap(int)>
	//    7   13:astore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          45
			hashmap.put(((Object) (readAmfString(parsablebytearray))), readAmfData(parsablebytearray, readAmfType(parsablebytearray)));
	//   13   21:aload_3         
	//   14   22:aload_0         
	//   15   23:invokestatic    #65  <Method String readAmfString(ParsableByteArray)>
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:invokestatic    #111 <Method int readAmfType(ParsableByteArray)>
	//   19   31:invokestatic    #113 <Method Object readAmfData(ParsableByteArray, int)>
	//   20   34:invokevirtual   #117 <Method Object HashMap.put(Object, Object)>
	//   21   37:pop             

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            16
		return hashmap;
	//   27   45:aload_3         
	//   28   46:areturn         
	}

	private static HashMap readAmfObject(ParsableByteArray parsablebytearray)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #105 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void HashMap()>
	//    3    7:astore_2        
		do
		{
			String s = readAmfString(parsablebytearray);
	//    4    8:aload_0         
	//    5    9:invokestatic    #65  <Method String readAmfString(ParsableByteArray)>
	//    6   12:astore_3        
			int i = readAmfType(parsablebytearray);
	//    7   13:aload_0         
	//    8   14:invokestatic    #111 <Method int readAmfType(ParsableByteArray)>
	//    9   17:istore_1        
			if(i == 9)
	//*  10   18:iload_1         
	//*  11   19:bipush          9
	//*  12   21:icmpne          26
				return hashmap;
	//   13   24:aload_2         
	//   14   25:areturn         
			hashmap.put(((Object) (s)), readAmfData(parsablebytearray, i));
	//   15   26:aload_2         
	//   16   27:aload_3         
	//   17   28:aload_0         
	//   18   29:iload_1         
	//   19   30:invokestatic    #113 <Method Object readAmfData(ParsableByteArray, int)>
	//   20   33:invokevirtual   #117 <Method Object HashMap.put(Object, Object)>
	//   21   36:pop             
		} while(true);
	//   22   37:goto            8
	}

	private static ArrayList readAmfStrictArray(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedIntToInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    2    4:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    3    5:new             #124 <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #125 <Method void ArrayList(int)>
	//    7   13:astore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          41
			arraylist.add(readAmfData(parsablebytearray, readAmfType(parsablebytearray)));
	//   13   21:aload_3         
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:invokestatic    #111 <Method int readAmfType(ParsableByteArray)>
	//   17   27:invokestatic    #113 <Method Object readAmfData(ParsableByteArray, int)>
	//   18   30:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   19   33:pop             

	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
	//*  24   38:goto            16
		return arraylist;
	//   25   41:aload_3         
	//   26   42:areturn         
	}

	private static String readAmfString(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readUnsignedShort();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method int ParsableByteArray.readUnsignedShort()>
	//    2    4:istore_1        
		int j = parsablebytearray.getPosition();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #136 <Method int ParsableByteArray.getPosition()>
	//    5    9:istore_2        
		parsablebytearray.skipBytes(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #89  <Method void ParsableByteArray.skipBytes(int)>
		return new String(parsablebytearray.data, j, i);
	//    9   15:new             #138 <Class String>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #142 <Field byte[] ParsableByteArray.data>
	//   13   23:iload_2         
	//   14   24:iload_1         
	//   15   25:invokespecial   #145 <Method void String(byte[], int, int)>
	//   16   28:areturn         
	}

	private static int readAmfType(ParsableByteArray parsablebytearray)
	{
		return parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:ireturn         
	}

	protected boolean parseHeader(ParsableByteArray parsablebytearray)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		if(readAmfType(parsablebytearray) == 2)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #111 <Method int readAmfType(ParsableByteArray)>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          89
		{
			if(!"onMetaData".equals(((Object) (readAmfString(parsablebytearray)))))
	//*   4    8:ldc1            #28  <String "onMetaData">
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #65  <Method String readAmfString(ParsableByteArray)>
	//*   7   14:invokevirtual   #154 <Method boolean String.equals(Object)>
	//*   8   17:ifne            21
				return;
	//    9   20:return          
			if(readAmfType(parsablebytearray) == 8)
	//*  10   21:aload_1         
	//*  11   22:invokestatic    #111 <Method int readAmfType(ParsableByteArray)>
	//*  12   25:bipush          8
	//*  13   27:icmpne          81
			{
				parsablebytearray = ((ParsableByteArray) (readAmfEcmaArray(parsablebytearray)));
	//   14   30:aload_1         
	//   15   31:invokestatic    #74  <Method HashMap readAmfEcmaArray(ParsableByteArray)>
	//   16   34:astore_1        
				if(((Map) (parsablebytearray)).containsKey("duration"))
	//*  17   35:aload_1         
	//*  18   36:ldc1            #25  <String "duration">
	//*  19   38:invokeinterface #159 <Method boolean Map.containsKey(Object)>
	//*  20   43:ifeq            80
				{
					double d = ((Double)((Map) (parsablebytearray)).get("duration")).doubleValue();
	//   21   46:aload_1         
	//   22   47:ldc1            #25  <String "duration">
	//   23   49:invokeinterface #163 <Method Object Map.get(Object)>
	//   24   54:checkcast       #78  <Class Double>
	//   25   57:invokevirtual   #82  <Method double Double.doubleValue()>
	//   26   60:dstore          4
					if(d > 0.0D)
	//*  27   62:dload           4
	//*  28   64:dconst_0        
	//*  29   65:dcmpl           
	//*  30   66:ifle            80
						setDurationUs((long)(d * 1000000D));
	//   31   69:aload_0         
	//   32   70:dload           4
	//   33   72:ldc2w           #164 <Double 1000000D>
	//   34   75:dmul            
	//   35   76:d2l             
	//   36   77:invokevirtual   #168 <Method void setDurationUs(long)>
				}
				return;
	//   37   80:return          
			} else
			{
				throw new ParserException();
	//   38   81:new             #151 <Class ParserException>
	//   39   84:dup             
	//   40   85:invokespecial   #169 <Method void ParserException()>
	//   41   88:athrow          
			}
		} else
		{
			throw new ParserException();
	//   42   89:new             #151 <Class ParserException>
	//   43   92:dup             
	//   44   93:invokespecial   #169 <Method void ParserException()>
	//   45   96:athrow          
		}
	}

	public void seek()
	{
	//    0    0:return          
	}

	private static final int AMF_TYPE_BOOLEAN = 1;
	private static final int AMF_TYPE_DATE = 11;
	private static final int AMF_TYPE_ECMA_ARRAY = 8;
	private static final int AMF_TYPE_END_MARKER = 9;
	private static final int AMF_TYPE_NUMBER = 0;
	private static final int AMF_TYPE_OBJECT = 3;
	private static final int AMF_TYPE_STRICT_ARRAY = 10;
	private static final int AMF_TYPE_STRING = 2;
	private static final String KEY_DURATION = "duration";
	private static final String NAME_METADATA = "onMetaData";
}
