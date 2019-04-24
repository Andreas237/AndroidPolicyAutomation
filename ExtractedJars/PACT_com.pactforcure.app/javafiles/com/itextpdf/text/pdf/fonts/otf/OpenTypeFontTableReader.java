// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.otf:
//			TableHeader, FontReadingException, Language

public abstract class OpenTypeFontTableReader
{

	public OpenTypeFontTableReader(RandomAccessFileOrArray randomaccessfileorarray, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		rf = randomaccessfileorarray;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field RandomAccessFileOrArray rf>
		tableLocation = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int tableLocation>
	//    8   14:return          
	}

	private void readFeatureListTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		LOG.debug((new StringBuilder()).append("featureCount=").append(((int) (word0))).toString());
	//    9   17:getstatic       #23  <Field Logger LOG>
	//   10   20:new             #49  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #50  <Method void StringBuilder()>
	//   13   27:ldc1            #52  <String "featureCount=">
	//   14   29:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_3         
	//   16   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #69  <Method void Logger.debug(String)>
		LinkedHashMap linkedhashmap = new LinkedHashMap(((int) (word0)));
	//   19   44:new             #71  <Class LinkedHashMap>
	//   20   47:dup             
	//   21   48:iload_3         
	//   22   49:invokespecial   #73  <Method void LinkedHashMap(int)>
	//   23   52:astore          4
		for(int j = 0; j < word0; j++)
	//*  24   54:iconst_0        
	//*  25   55:istore_2        
	//*  26   56:iload_2         
	//*  27   57:iload_3         
	//*  28   58:icmpge          96
			((Map) (linkedhashmap)).put(((Object) (rf.readString(4, "utf-8"))), ((Object) (Short.valueOf(rf.readShort()))));
	//   29   61:aload           4
	//   30   63:aload_0         
	//   31   64:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   32   67:iconst_4        
	//   33   68:ldc1            #75  <String "utf-8">
	//   34   70:invokevirtual   #79  <Method String RandomAccessFileOrArray.readString(int, String)>
	//   35   73:aload_0         
	//   36   74:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   37   77:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   38   80:invokestatic    #85  <Method Short Short.valueOf(short)>
	//   39   83:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   40   88:pop             

	//   41   89:iload_2         
	//   42   90:iconst_1        
	//   43   91:iadd            
	//   44   92:istore_2        
	//*  45   93:goto            56
		String s;
		for(Iterator iterator = ((Map) (linkedhashmap)).keySet().iterator(); iterator.hasNext(); readFeatureTable(((Short)((Map) (linkedhashmap)).get(((Object) (s)))).shortValue() + i))
	//*  46   96:aload           4
	//*  47   98:invokeinterface #95  <Method Set Map.keySet()>
	//*  48  103:invokeinterface #101 <Method Iterator Set.iterator()>
	//*  49  108:astore          5
	//*  50  110:aload           5
	//*  51  112:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*  52  117:ifeq            184
		{
			s = (String)iterator.next();
	//   53  120:aload           5
	//   54  122:invokeinterface #111 <Method Object Iterator.next()>
	//   55  127:checkcast       #113 <Class String>
	//   56  130:astore          6
			LOG.debug((new StringBuilder()).append("*************featureName=").append(s).toString());
	//   57  132:getstatic       #23  <Field Logger LOG>
	//   58  135:new             #49  <Class StringBuilder>
	//   59  138:dup             
	//   60  139:invokespecial   #50  <Method void StringBuilder()>
	//   61  142:ldc1            #115 <String "*************featureName=">
	//   62  144:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   63  147:aload           6
	//   64  149:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   65  152:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   66  155:invokeinterface #69  <Method void Logger.debug(String)>
		}

	//   67  160:aload_0         
	//   68  161:aload           4
	//   69  163:aload           6
	//   70  165:invokeinterface #119 <Method Object Map.get(Object)>
	//   71  170:checkcast       #81  <Class Short>
	//   72  173:invokevirtual   #122 <Method short Short.shortValue()>
	//   73  176:iload_1         
	//   74  177:iadd            
	//   75  178:invokespecial   #125 <Method void readFeatureTable(int)>
	//*  76  181:goto            110
	//   77  184:return          
	}

	private void readFeatureTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		i = ((int) (rf.readShort()));
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_1        
		LOG.debug((new StringBuilder()).append("featureParamsOffset=").append(i).toString());
	//    9   17:getstatic       #23  <Field Logger LOG>
	//   10   20:new             #49  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #50  <Method void StringBuilder()>
	//   13   27:ldc1            #127 <String "featureParamsOffset=">
	//   14   29:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_1         
	//   16   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #69  <Method void Logger.debug(String)>
		short word0 = rf.readShort();
	//   19   44:aload_0         
	//   20   45:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   21   48:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   22   51:istore_2        
		LOG.debug((new StringBuilder()).append("lookupCount=").append(((int) (word0))).toString());
	//   23   52:getstatic       #23  <Field Logger LOG>
	//   24   55:new             #49  <Class StringBuilder>
	//   25   58:dup             
	//   26   59:invokespecial   #50  <Method void StringBuilder()>
	//   27   62:ldc1            #129 <String "lookupCount=">
	//   28   64:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   29   67:iload_2         
	//   30   68:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   31   71:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   32   74:invokeinterface #69  <Method void Logger.debug(String)>
		ArrayList arraylist = new ArrayList(((int) (word0)));
	//   33   79:new             #131 <Class ArrayList>
	//   34   82:dup             
	//   35   83:iload_2         
	//   36   84:invokespecial   #132 <Method void ArrayList(int)>
	//   37   87:astore_3        
		for(i = 0; i < word0; i++)
	//*  38   88:iconst_0        
	//*  39   89:istore_1        
	//*  40   90:iload_1         
	//*  41   91:iload_2         
	//*  42   92:icmpge          119
			((List) (arraylist)).add(((Object) (Short.valueOf(rf.readShort()))));
	//   43   95:aload_3         
	//   44   96:aload_0         
	//   45   97:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   46  100:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   47  103:invokestatic    #85  <Method Short Short.valueOf(short)>
	//   48  106:invokeinterface #138 <Method boolean List.add(Object)>
	//   49  111:pop             

	//   50  112:iload_1         
	//   51  113:iconst_1        
	//   52  114:iadd            
	//   53  115:istore_1        
	//*  54  116:goto            90
	//   55  119:return          
	}

	private TableHeader readHeader()
		throws IOException
	{
		rf.seek(tableLocation);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field int tableLocation>
	//    4    8:i2l             
	//    5    9:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		return new TableHeader(rf.readInt(), rf.readUnsignedShort(), rf.readUnsignedShort(), rf.readUnsignedShort());
	//    6   12:new             #142 <Class TableHeader>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   10   20:invokevirtual   #146 <Method int RandomAccessFileOrArray.readInt()>
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   13   27:invokevirtual   #149 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   14   30:aload_0         
	//   15   31:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   16   34:invokevirtual   #149 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   17   37:aload_0         
	//   18   38:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   19   41:invokevirtual   #149 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   20   44:invokespecial   #152 <Method void TableHeader(int, int, int, int)>
	//   21   47:areturn         
	}

	private void readLangSysRecord(Map map)
		throws IOException
	{
		map.put(((Object) (rf.readString(4, "utf-8"))), ((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    3    5:iconst_4        
	//    4    6:ldc1            #75  <String "utf-8">
	//    5    8:invokevirtual   #79  <Method String RandomAccessFileOrArray.readString(int, String)>
	//    6   11:aload_0         
	//    7   12:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    8   15:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    9   18:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   10   21:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   11   26:pop             
	//   12   27:return          
	}

	private void readLangSysTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		i = ((int) (rf.readShort()));
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_1        
		LOG.debug((new StringBuilder()).append("lookupOrderOffset=").append(i).toString());
	//    9   17:getstatic       #23  <Field Logger LOG>
	//   10   20:new             #49  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #50  <Method void StringBuilder()>
	//   13   27:ldc1            #164 <String "lookupOrderOffset=">
	//   14   29:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_1         
	//   16   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #69  <Method void Logger.debug(String)>
		i = ((int) (rf.readShort()));
	//   19   44:aload_0         
	//   20   45:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   21   48:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   22   51:istore_1        
		LOG.debug((new StringBuilder()).append("reqFeatureIndex=").append(i).toString());
	//   23   52:getstatic       #23  <Field Logger LOG>
	//   24   55:new             #49  <Class StringBuilder>
	//   25   58:dup             
	//   26   59:invokespecial   #50  <Method void StringBuilder()>
	//   27   62:ldc1            #166 <String "reqFeatureIndex=">
	//   28   64:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   29   67:iload_1         
	//   30   68:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   31   71:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   32   74:invokeinterface #69  <Method void Logger.debug(String)>
		short word0 = rf.readShort();
	//   33   79:aload_0         
	//   34   80:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   35   83:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   36   86:istore_2        
		ArrayList arraylist = new ArrayList(((int) (word0)));
	//   37   87:new             #131 <Class ArrayList>
	//   38   90:dup             
	//   39   91:iload_2         
	//   40   92:invokespecial   #132 <Method void ArrayList(int)>
	//   41   95:astore_3        
		for(i = 0; i < word0; i++)
	//*  42   96:iconst_0        
	//*  43   97:istore_1        
	//*  44   98:iload_1         
	//*  45   99:iload_2         
	//*  46  100:icmpge          127
			((List) (arraylist)).add(((Object) (Short.valueOf(rf.readShort()))));
	//   47  103:aload_3         
	//   48  104:aload_0         
	//   49  105:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   50  108:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   51  111:invokestatic    #85  <Method Short Short.valueOf(short)>
	//   52  114:invokeinterface #138 <Method boolean List.add(Object)>
	//   53  119:pop             

	//   54  120:iload_1         
	//   55  121:iconst_1        
	//   56  122:iadd            
	//   57  123:istore_1        
	//*  58  124:goto            98
		LOG.debug((new StringBuilder()).append("featureListIndices=").append(((Object) (arraylist))).toString());
	//   59  127:getstatic       #23  <Field Logger LOG>
	//   60  130:new             #49  <Class StringBuilder>
	//   61  133:dup             
	//   62  134:invokespecial   #50  <Method void StringBuilder()>
	//   63  137:ldc1            #168 <String "featureListIndices=">
	//   64  139:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   65  142:aload_3         
	//   66  143:invokevirtual   #171 <Method StringBuilder StringBuilder.append(Object)>
	//   67  146:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   68  149:invokeinterface #69  <Method void Logger.debug(String)>
	//   69  154:return          
	}

	private void readLookupListTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		ArrayList arraylist = new ArrayList();
	//    9   17:new             #131 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #173 <Method void ArrayList()>
	//   12   24:astore          4
		for(int j = 0; j < word0; j++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload_3         
	//*  17   30:icmpge          58
			((List) (arraylist)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   18   33:aload           4
	//   19   35:aload_0         
	//   20   36:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   21   39:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   22   42:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   23   45:invokeinterface #138 <Method boolean List.add(Object)>
	//   24   50:pop             

	//   25   51:iload_2         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_2        
	//*  29   55:goto            28
		for(int k = 0; k < word0; k++)
	//*  30   58:iconst_0        
	//*  31   59:istore_2        
	//*  32   60:iload_2         
	//*  33   61:iload_3         
	//*  34   62:icmpge          92
			readLookupTable(i + ((Integer)((List) (arraylist)).get(k)).intValue());
	//   35   65:aload_0         
	//   36   66:iload_1         
	//   37   67:aload           4
	//   38   69:iload_2         
	//   39   70:invokeinterface #176 <Method Object List.get(int)>
	//   40   75:checkcast       #156 <Class Integer>
	//   41   78:invokevirtual   #179 <Method int Integer.intValue()>
	//   42   81:iadd            
	//   43   82:invokespecial   #182 <Method void readLookupTable(int)>

	//   44   85:iload_2         
	//   45   86:iconst_1        
	//   46   87:iadd            
	//   47   88:istore_2        
	//*  48   89:goto            60
	//   49   92:return          
	}

	private void readLookupTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		rf.skipBytes(2);
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #186 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   13   25:pop             
		short word1 = rf.readShort();
	//   14   26:aload_0         
	//   15   27:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   16   30:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   17   33:istore          4
		Object obj = ((Object) (new ArrayList()));
	//   18   35:new             #131 <Class ArrayList>
	//   19   38:dup             
	//   20   39:invokespecial   #173 <Method void ArrayList()>
	//   21   42:astore          5
		for(int j = 0; j < word1; j++)
	//*  22   44:iconst_0        
	//*  23   45:istore_2        
	//*  24   46:iload_2         
	//*  25   47:iload           4
	//*  26   49:icmpge          77
			((List) (obj)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   27   52:aload           5
	//   28   54:aload_0         
	//   29   55:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   30   58:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   31   61:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   32   64:invokeinterface #138 <Method boolean List.add(Object)>
	//   33   69:pop             

	//   34   70:iload_2         
	//   35   71:iconst_1        
	//   36   72:iadd            
	//   37   73:istore_2        
	//*  38   74:goto            46
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); readSubTable(((int) (word0)), i + ((Integer)((Iterator) (obj)).next()).intValue()));
	//   39   77:aload           5
	//   40   79:invokeinterface #187 <Method Iterator List.iterator()>
	//   41   84:astore          5
	//   42   86:aload           5
	//   43   88:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   44   93:ifeq            119
	//   45   96:aload_0         
	//   46   97:iload_3         
	//   47   98:iload_1         
	//   48   99:aload           5
	//   49  101:invokeinterface #111 <Method Object Iterator.next()>
	//   50  106:checkcast       #156 <Class Integer>
	//   51  109:invokevirtual   #179 <Method int Integer.intValue()>
	//   52  112:iadd            
	//   53  113:invokevirtual   #191 <Method void readSubTable(int, int)>
	//*  54  116:goto            86
	//   55  119:return          
	}

	private void readRangeRecord(List list)
		throws IOException
	{
		int i = ((int) (rf.readShort()));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    3    7:istore_2        
		short word0 = rf.readShort();
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    6   12:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    7   15:istore_3        
		rf.readShort();
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   10   20:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   11   23:pop             
		for(; i <= word0; i++)
	//*  12   24:iload_2         
	//*  13   25:iload_3         
	//*  14   26:icmpgt          47
			list.add(((Object) (Integer.valueOf(i))));
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   18   34:invokeinterface #138 <Method boolean List.add(Object)>
	//   19   39:pop             

	//   20   40:iload_2         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_2        
	//*  24   44:goto            24
	//   25   47:return          
	}

	private void readScriptListTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		HashMap hashmap = new HashMap(((int) (word0)));
	//    9   17:new             #197 <Class HashMap>
	//   10   20:dup             
	//   11   21:iload_3         
	//   12   22:invokespecial   #198 <Method void HashMap(int)>
	//   13   25:astore          4
		for(int j = 0; j < word0; j++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload_3         
	//*  18   31:icmpge          48
			readScriptRecord(i, ((Map) (hashmap)));
	//   19   34:aload_0         
	//   20   35:iload_1         
	//   21   36:aload           4
	//   22   38:invokespecial   #202 <Method void readScriptRecord(int, Map)>

	//   23   41:iload_2         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_2        
	//*  27   45:goto            29
		ArrayList arraylist = new ArrayList(((int) (word0)));
	//   28   48:new             #131 <Class ArrayList>
	//   29   51:dup             
	//   30   52:iload_3         
	//   31   53:invokespecial   #132 <Method void ArrayList(int)>
	//   32   56:astore          5
		String s;
		for(Iterator iterator = ((Map) (hashmap)).keySet().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (s))))
	//*  33   58:aload           4
	//*  34   60:invokeinterface #95  <Method Set Map.keySet()>
	//*  35   65:invokeinterface #101 <Method Iterator Set.iterator()>
	//*  36   70:astore          6
	//*  37   72:aload           6
	//*  38   74:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*  39   79:ifeq            126
		{
			s = (String)iterator.next();
	//   40   82:aload           6
	//   41   84:invokeinterface #111 <Method Object Iterator.next()>
	//   42   89:checkcast       #113 <Class String>
	//   43   92:astore          7
			readScriptTable(((Integer)((Map) (hashmap)).get(((Object) (s)))).intValue());
	//   44   94:aload_0         
	//   45   95:aload           4
	//   46   97:aload           7
	//   47   99:invokeinterface #119 <Method Object Map.get(Object)>
	//   48  104:checkcast       #156 <Class Integer>
	//   49  107:invokevirtual   #179 <Method int Integer.intValue()>
	//   50  110:invokespecial   #205 <Method void readScriptTable(int)>
		}

	//   51  113:aload           5
	//   52  115:aload           7
	//   53  117:invokeinterface #138 <Method boolean List.add(Object)>
	//   54  122:pop             
	//*  55  123:goto            72
		supportedLanguages = Collections.unmodifiableList(((List) (arraylist)));
	//   56  126:aload_0         
	//   57  127:aload           5
	//   58  129:invokestatic    #211 <Method List Collections.unmodifiableList(List)>
	//   59  132:putfield        #213 <Field List supportedLanguages>
	//   60  135:return          
	}

	private void readScriptRecord(int i, Map map)
		throws IOException
	{
		map.put(((Object) (rf.readString(4, "utf-8"))), ((Object) (Integer.valueOf(i + rf.readShort()))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    3    5:iconst_4        
	//    4    6:ldc1            #75  <String "utf-8">
	//    5    8:invokevirtual   #79  <Method String RandomAccessFileOrArray.readString(int, String)>
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    9   16:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   10   19:iadd            
	//   11   20:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   12   23:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   13   28:pop             
	//   14   29:return          
	}

	private void readScriptTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		short word1 = rf.readShort();
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   11   21:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   12   24:istore          4
		if(word1 > 0)
	//*  13   26:iload           4
	//*  14   28:ifle            119
		{
			LinkedHashMap linkedhashmap = new LinkedHashMap(((int) (word1)));
	//   15   31:new             #71  <Class LinkedHashMap>
	//   16   34:dup             
	//   17   35:iload           4
	//   18   37:invokespecial   #73  <Method void LinkedHashMap(int)>
	//   19   40:astore          5
			for(int j = 0; j < word1; j++)
	//*  20   42:iconst_0        
	//*  21   43:istore_2        
	//*  22   44:iload_2         
	//*  23   45:iload           4
	//*  24   47:icmpge          63
				readLangSysRecord(((Map) (linkedhashmap)));
	//   25   50:aload_0         
	//   26   51:aload           5
	//   27   53:invokespecial   #216 <Method void readLangSysRecord(Map)>

	//   28   56:iload_2         
	//   29   57:iconst_1        
	//   30   58:iadd            
	//   31   59:istore_2        
	//*  32   60:goto            44
			for(Iterator iterator = ((Map) (linkedhashmap)).keySet().iterator(); iterator.hasNext(); readLangSysTable(((Integer)((Map) (linkedhashmap)).get(((Object) ((String)iterator.next())))).intValue() + i));
	//   33   63:aload           5
	//   34   65:invokeinterface #95  <Method Set Map.keySet()>
	//   35   70:invokeinterface #101 <Method Iterator Set.iterator()>
	//   36   75:astore          6
	//   37   77:aload           6
	//   38   79:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   39   84:ifeq            119
	//   40   87:aload_0         
	//   41   88:aload           5
	//   42   90:aload           6
	//   43   92:invokeinterface #111 <Method Object Iterator.next()>
	//   44   97:checkcast       #113 <Class String>
	//   45  100:invokeinterface #119 <Method Object Map.get(Object)>
	//   46  105:checkcast       #156 <Class Integer>
	//   47  108:invokevirtual   #179 <Method int Integer.intValue()>
	//   48  111:iload_1         
	//   49  112:iadd            
	//   50  113:invokespecial   #218 <Method void readLangSysTable(int)>
		}
	//*  51  116:goto            77
		readLangSysTable(i + word0);
	//   52  119:aload_0         
	//   53  120:iload_1         
	//   54  121:iload_3         
	//   55  122:iadd            
	//   56  123:invokespecial   #218 <Method void readLangSysTable(int)>
	//   57  126:return          
	}

	public Language getSupportedLanguage()
		throws FontReadingException
	{
		Language alanguage[] = Language.values();
	//    0    0:invokestatic    #228 <Method Language[] Language.values()>
	//    1    3:astore_3        
		for(Iterator iterator = supportedLanguages.iterator(); iterator.hasNext();)
	//*   2    4:aload_0         
	//*   3    5:getfield        #213 <Field List supportedLanguages>
	//*   4    8:invokeinterface #187 <Method Iterator List.iterator()>
	//*   5   13:astore          4
	//*   6   15:aload           4
	//*   7   17:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*   8   22:ifeq            72
		{
			String s = (String)iterator.next();
	//    9   25:aload           4
	//   10   27:invokeinterface #111 <Method Object Iterator.next()>
	//   11   32:checkcast       #113 <Class String>
	//   12   35:astore          5
			int j = alanguage.length;
	//   13   37:aload_3         
	//   14   38:arraylength     
	//   15   39:istore_2        
			int i = 0;
	//   16   40:iconst_0        
	//   17   41:istore_1        
			while(i < j) 
	//*  18   42:iload_1         
	//*  19   43:iload_2         
	//*  20   44:icmpge          15
			{
				Language language = alanguage[i];
	//   21   47:aload_3         
	//   22   48:iload_1         
	//   23   49:aaload          
	//   24   50:astore          6
				if(language.isSupported(s))
	//*  25   52:aload           6
	//*  26   54:aload           5
	//*  27   56:invokevirtual   #232 <Method boolean Language.isSupported(String)>
	//*  28   59:ifeq            65
					return language;
	//   29   62:aload           6
	//   30   64:areturn         
				i++;
	//   31   65:iload_1         
	//   32   66:iconst_1        
	//   33   67:iadd            
	//   34   68:istore_1        
			}
		}

	//*  35   69:goto            42
		throw new FontReadingException((new StringBuilder()).append("Unsupported languages ").append(((Object) (supportedLanguages))).toString());
	//   36   72:new             #222 <Class FontReadingException>
	//   37   75:dup             
	//   38   76:new             #49  <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #50  <Method void StringBuilder()>
	//   41   83:ldc1            #234 <String "Unsupported languages ">
	//   42   85:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:aload_0         
	//   44   89:getfield        #213 <Field List supportedLanguages>
	//   45   92:invokevirtual   #171 <Method StringBuilder StringBuilder.append(Object)>
	//   46   95:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   47   98:invokespecial   #236 <Method void FontReadingException(String)>
	//   48  101:athrow          
	}

	protected final List readCoverageFormat(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #43  <Method void RandomAccessFileOrArray.seek(long)>
		i = ((int) (rf.readShort()));
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_1        
		ArrayList arraylist;
		if(i == 1)
	//*   9   17:iload_1         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          75
		{
			short word0 = rf.readShort();
	//   12   22:aload_0         
	//   13   23:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   14   26:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   15   29:istore_2        
			ArrayList arraylist1 = new ArrayList(((int) (word0)));
	//   16   30:new             #131 <Class ArrayList>
	//   17   33:dup             
	//   18   34:iload_2         
	//   19   35:invokespecial   #132 <Method void ArrayList(int)>
	//   20   38:astore          4
			i = 0;
	//   21   40:iconst_0        
	//   22   41:istore_1        
			do
			{
				arraylist = arraylist1;
	//   23   42:aload           4
	//   24   44:astore_3        
				if(i >= word0)
					break;
	//   25   45:iload_1         
	//   26   46:iload_2         
	//   27   47:icmpge          147
				((List) (arraylist1)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   28   50:aload           4
	//   29   52:aload_0         
	//   30   53:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   31   56:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   32   59:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   33   62:invokeinterface #138 <Method boolean List.add(Object)>
	//   34   67:pop             
				i++;
	//   35   68:iload_1         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_1        
			} while(true);
	//   39   72:goto            42
		} else
		if(i == 2)
	//*  40   75:iload_1         
	//*  41   76:iconst_2        
	//*  42   77:icmpne          120
		{
			short word1 = rf.readShort();
	//   43   80:aload_0         
	//   44   81:getfield        #32  <Field RandomAccessFileOrArray rf>
	//   45   84:invokevirtual   #47  <Method short RandomAccessFileOrArray.readShort()>
	//   46   87:istore_2        
			ArrayList arraylist2 = new ArrayList();
	//   47   88:new             #131 <Class ArrayList>
	//   48   91:dup             
	//   49   92:invokespecial   #173 <Method void ArrayList()>
	//   50   95:astore          4
			i = 0;
	//   51   97:iconst_0        
	//   52   98:istore_1        
			do
			{
				arraylist = arraylist2;
	//   53   99:aload           4
	//   54  101:astore_3        
				if(i >= word1)
					break;
	//   55  102:iload_1         
	//   56  103:iload_2         
	//   57  104:icmpge          147
				readRangeRecord(((List) (arraylist2)));
	//   58  107:aload_0         
	//   59  108:aload           4
	//   60  110:invokespecial   #240 <Method void readRangeRecord(List)>
				i++;
	//   61  113:iload_1         
	//   62  114:iconst_1        
	//   63  115:iadd            
	//   64  116:istore_1        
			} while(true);
	//   65  117:goto            99
		} else
		{
			throw new UnsupportedOperationException((new StringBuilder()).append("Invalid coverage format: ").append(i).toString());
	//   66  120:new             #242 <Class UnsupportedOperationException>
	//   67  123:dup             
	//   68  124:new             #49  <Class StringBuilder>
	//   69  127:dup             
	//   70  128:invokespecial   #50  <Method void StringBuilder()>
	//   71  131:ldc1            #244 <String "Invalid coverage format: ">
	//   72  133:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   73  136:iload_1         
	//   74  137:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   75  140:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   76  143:invokespecial   #245 <Method void UnsupportedOperationException(String)>
	//   77  146:athrow          
		}
		return Collections.unmodifiableList(((List) (arraylist)));
	//   78  147:aload_3         
	//   79  148:invokestatic    #211 <Method List Collections.unmodifiableList(List)>
	//   80  151:areturn         
	}

	protected abstract void readSubTable(int i, int j)
		throws IOException;

	protected final void startReadingTable()
		throws FontReadingException
	{
		try
		{
			TableHeader tableheader = readHeader();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method TableHeader readHeader()>
	//    2    4:astore_1        
			readScriptListTable(tableLocation + tableheader.scriptListOffset);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field int tableLocation>
	//    6   10:aload_1         
	//    7   11:getfield        #252 <Field int TableHeader.scriptListOffset>
	//    8   14:iadd            
	//    9   15:invokespecial   #254 <Method void readScriptListTable(int)>
			readFeatureListTable(tableLocation + tableheader.featureListOffset);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field int tableLocation>
	//   13   23:aload_1         
	//   14   24:getfield        #257 <Field int TableHeader.featureListOffset>
	//   15   27:iadd            
	//   16   28:invokespecial   #259 <Method void readFeatureListTable(int)>
			readLookupListTable(tableLocation + tableheader.lookupListOffset);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field int tableLocation>
	//   20   36:aload_1         
	//   21   37:getfield        #262 <Field int TableHeader.lookupListOffset>
	//   22   40:iadd            
	//   23   41:invokespecial   #264 <Method void readLookupListTable(int)>
			return;
	//   24   44:return          
		}
		catch(IOException ioexception)
	//*  25   45:astore_1        
		{
			throw new FontReadingException("Error reading font file", ((Exception) (ioexception)));
	//   26   46:new             #222 <Class FontReadingException>
	//   27   49:dup             
	//   28   50:ldc2            #266 <String "Error reading font file">
	//   29   53:aload_1         
	//   30   54:invokespecial   #269 <Method void FontReadingException(String, Exception)>
	//   31   57:athrow          
		}
	}

	protected static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/text/pdf/fonts/otf/OpenTypeFontTableReader);
	protected final RandomAccessFileOrArray rf;
	private List supportedLanguages;
	protected final int tableLocation;

	static 
	{
	//    0    0:ldc1            #2   <Class OpenTypeFontTableReader>
	//    1    2:invokestatic    #21  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #23  <Field Logger LOG>
	//*   3    8:return          
	}
}
