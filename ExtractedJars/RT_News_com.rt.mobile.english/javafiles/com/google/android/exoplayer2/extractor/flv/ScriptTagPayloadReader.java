// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.flv:
//			TagPayloadReader

final class ScriptTagPayloadReader extends TagPayloadReader
{

	public ScriptTagPayloadReader()
	{
		super(((com.google.android.exoplayer2.extractor.TrackOutput) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #35  <Method void TagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput)>
		durationUs = 0x1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #36  <Long 0x1L>
	//    5    9:putfield        #39  <Field long durationUs>
	//    6   12:return          
	}

	private static Boolean readAmfBoolean(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
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
	//   12   18:invokestatic    #54  <Method Boolean Boolean.valueOf(boolean)>
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
	//   10   63:invokestatic    #60  <Method Date readAmfDate(ParsableByteArray)>
	//   11   66:areturn         

				case 10: // '\n'
					return ((Object) (readAmfStrictArray(parsablebytearray)));
	//   12   67:aload_0         
	//   13   68:invokestatic    #64  <Method ArrayList readAmfStrictArray(ParsableByteArray)>
	//   14   71:areturn         
				}

			case 3: // '\003'
				return ((Object) (readAmfObject(parsablebytearray)));
	//   15   72:aload_0         
	//   16   73:invokestatic    #68  <Method HashMap readAmfObject(ParsableByteArray)>
	//   17   76:areturn         

			case 2: // '\002'
				return ((Object) (readAmfString(parsablebytearray)));
	//   18   77:aload_0         
	//   19   78:invokestatic    #72  <Method String readAmfString(ParsableByteArray)>
	//   20   81:areturn         

			case 1: // '\001'
				return ((Object) (readAmfBoolean(parsablebytearray)));
	//   21   82:aload_0         
	//   22   83:invokestatic    #74  <Method Boolean readAmfBoolean(ParsableByteArray)>
	//   23   86:areturn         

			case 0: // '\0'
				return ((Object) (readAmfDouble(parsablebytearray)));
	//   24   87:aload_0         
	//   25   88:invokestatic    #78  <Method Double readAmfDouble(ParsableByteArray)>
	//   26   91:areturn         
			}
		else
			return ((Object) (readAmfEcmaArray(parsablebytearray)));
	//   27   92:aload_0         
	//   28   93:invokestatic    #81  <Method HashMap readAmfEcmaArray(ParsableByteArray)>
	//   29   96:areturn         
	}

	private static Date readAmfDate(ParsableByteArray parsablebytearray)
	{
		Date date = new Date((long)readAmfDouble(parsablebytearray).doubleValue());
	//    0    0:new             #83  <Class Date>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #78  <Method Double readAmfDouble(ParsableByteArray)>
	//    4    8:invokevirtual   #89  <Method double Double.doubleValue()>
	//    5   11:d2l             
	//    6   12:invokespecial   #92  <Method void Date(long)>
	//    7   15:astore_1        
		parsablebytearray.skipBytes(2);
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:invokevirtual   #96  <Method void ParsableByteArray.skipBytes(int)>
		return date;
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	private static Double readAmfDouble(ParsableByteArray parsablebytearray)
	{
		return Double.valueOf(Double.longBitsToDouble(parsablebytearray.readLong()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method long ParsableByteArray.readLong()>
	//    2    4:invokestatic    #104 <Method double Double.longBitsToDouble(long)>
	//    3    7:invokestatic    #107 <Method Double Double.valueOf(double)>
	//    4   10:areturn         
	}

	private static HashMap readAmfEcmaArray(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedIntToInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    2    4:istore_2        
		HashMap hashmap = new HashMap(j);
	//    3    5:new             #112 <Class HashMap>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #114 <Method void HashMap(int)>
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
	//   15   23:invokestatic    #72  <Method String readAmfString(ParsableByteArray)>
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:invokestatic    #118 <Method int readAmfType(ParsableByteArray)>
	//   19   31:invokestatic    #120 <Method Object readAmfData(ParsableByteArray, int)>
	//   20   34:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
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
	//    0    0:new             #112 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void HashMap()>
	//    3    7:astore_2        
		do
		{
			String s = readAmfString(parsablebytearray);
	//    4    8:aload_0         
	//    5    9:invokestatic    #72  <Method String readAmfString(ParsableByteArray)>
	//    6   12:astore_3        
			int i = readAmfType(parsablebytearray);
	//    7   13:aload_0         
	//    8   14:invokestatic    #118 <Method int readAmfType(ParsableByteArray)>
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
	//   19   30:invokestatic    #120 <Method Object readAmfData(ParsableByteArray, int)>
	//   20   33:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
	//   21   36:pop             
		} while(true);
	//   22   37:goto            8
	}

	private static ArrayList readAmfStrictArray(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedIntToInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    2    4:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    3    5:new             #130 <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #131 <Method void ArrayList(int)>
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
	//   16   24:invokestatic    #118 <Method int readAmfType(ParsableByteArray)>
	//   17   27:invokestatic    #120 <Method Object readAmfData(ParsableByteArray, int)>
	//   18   30:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokevirtual   #139 <Method int ParsableByteArray.readUnsignedShort()>
	//    2    4:istore_1        
		int j = parsablebytearray.getPosition();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method int ParsableByteArray.getPosition()>
	//    5    9:istore_2        
		parsablebytearray.skipBytes(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #96  <Method void ParsableByteArray.skipBytes(int)>
		return new String(parsablebytearray.data, j, i);
	//    9   15:new             #144 <Class String>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #148 <Field byte[] ParsableByteArray.data>
	//   13   23:iload_2         
	//   14   24:iload_1         
	//   15   25:invokespecial   #151 <Method void String(byte[], int, int)>
	//   16   28:areturn         
	}

	private static int readAmfType(ParsableByteArray parsablebytearray)
	{
		return parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:ireturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long durationUs>
	//    2    4:lreturn         
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
		if(readAmfType(parsablebytearray) != 2)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #118 <Method int readAmfType(ParsableByteArray)>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          16
			throw new ParserException();
	//    4    8:new             #158 <Class ParserException>
	//    5   11:dup             
	//    6   12:invokespecial   #159 <Method void ParserException()>
	//    7   15:athrow          
		if(!"onMetaData".equals(((Object) (readAmfString(parsablebytearray)))))
	//*   8   16:ldc1            #28  <String "onMetaData">
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #72  <Method String readAmfString(ParsableByteArray)>
	//*  11   22:invokevirtual   #162 <Method boolean String.equals(Object)>
	//*  12   25:ifne            29
			return;
	//   13   28:return          
		if(readAmfType(parsablebytearray) != 8)
	//*  14   29:aload_1         
	//*  15   30:invokestatic    #118 <Method int readAmfType(ParsableByteArray)>
	//*  16   33:bipush          8
	//*  17   35:icmpeq          39
			return;
	//   18   38:return          
		parsablebytearray = ((ParsableByteArray) (readAmfEcmaArray(parsablebytearray)));
	//   19   39:aload_1         
	//   20   40:invokestatic    #81  <Method HashMap readAmfEcmaArray(ParsableByteArray)>
	//   21   43:astore_1        
		if(((Map) (parsablebytearray)).containsKey("duration"))
	//*  22   44:aload_1         
	//*  23   45:ldc1            #25  <String "duration">
	//*  24   47:invokeinterface #167 <Method boolean Map.containsKey(Object)>
	//*  25   52:ifeq            89
		{
			double d = ((Double)((Map) (parsablebytearray)).get("duration")).doubleValue();
	//   26   55:aload_1         
	//   27   56:ldc1            #25  <String "duration">
	//   28   58:invokeinterface #171 <Method Object Map.get(Object)>
	//   29   63:checkcast       #85  <Class Double>
	//   30   66:invokevirtual   #89  <Method double Double.doubleValue()>
	//   31   69:dstore          4
			if(d > 0.0D)
	//*  32   71:dload           4
	//*  33   73:dconst_0        
	//*  34   74:dcmpl           
	//*  35   75:ifle            89
				durationUs = (long)(d * 1000000D);
	//   36   78:aload_0         
	//   37   79:dload           4
	//   38   81:ldc2w           #172 <Double 1000000D>
	//   39   84:dmul            
	//   40   85:d2l             
	//   41   86:putfield        #39  <Field long durationUs>
		}
	//   42   89:return          
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
	private long durationUs;
}
