// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.Glyph;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.otf:
//			OpenTypeFontTableReader, FontReadingException

public class GlyphSubstitutionTableReader extends OpenTypeFontTableReader
{

	public GlyphSubstitutionTableReader(RandomAccessFileOrArray randomaccessfileorarray, int i, Map map, int ai[])
		throws IOException
	{
		super(randomaccessfileorarray, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #18  <Method void OpenTypeFontTableReader(RandomAccessFileOrArray, int)>
		glyphWidthsByIndex = ai;
	//    4    6:aload_0         
	//    5    7:aload           4
	//    6    9:putfield        #20  <Field int[] glyphWidthsByIndex>
		glyphToCharacterMap = map;
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:putfield        #22  <Field Map glyphToCharacterMap>
	//   10   17:return          
	}

	private String getTextFromGlyph(int i, Map map)
		throws FontReadingException
	{
		StringBuilder stringbuilder = new StringBuilder(1);
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #35  <Method void StringBuilder(int)>
	//    4    8:astore_3        
		Object obj = ((Object) ((Character)map.get(((Object) (Integer.valueOf(i))))));
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//    8   14:invokeinterface #47  <Method Object Map.get(Object)>
	//    9   19:checkcast       #49  <Class Character>
	//   10   22:astore          4
		if(obj == null)
	//*  11   24:aload           4
	//*  12   26:ifnonnull       134
		{
			obj = ((Object) ((List)rawLigatureSubstitutionMap.get(((Object) (Integer.valueOf(i))))));
	//   13   29:aload_0         
	//   14   30:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//   15   33:iload_1         
	//   16   34:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   17   37:invokeinterface #47  <Method Object Map.get(Object)>
	//   18   42:checkcast       #53  <Class List>
	//   19   45:astore          4
			if(obj == null || ((List) (obj)).isEmpty())
	//*  20   47:aload           4
	//*  21   49:ifnull          62
	//*  22   52:aload           4
	//*  23   54:invokeinterface #57  <Method boolean List.isEmpty()>
	//*  24   59:ifeq            89
				throw new FontReadingException((new StringBuilder()).append("No corresponding character or simple glyphs found for GlyphID=").append(i).toString());
	//   25   62:new             #30  <Class FontReadingException>
	//   26   65:dup             
	//   27   66:new             #32  <Class StringBuilder>
	//   28   69:dup             
	//   29   70:invokespecial   #60  <Method void StringBuilder()>
	//   30   73:ldc1            #62  <String "No corresponding character or simple glyphs found for GlyphID=">
	//   31   75:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:iload_1         
	//   33   79:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   34   82:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   35   85:invokespecial   #76  <Method void FontReadingException(String)>
	//   36   88:athrow          
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(getTextFromGlyph(((Integer)((Iterator) (obj)).next()).intValue(), map)));
	//   37   89:aload           4
	//   38   91:invokeinterface #80  <Method Iterator List.iterator()>
	//   39   96:astore          4
	//   40   98:aload           4
	//   41  100:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   42  105:ifeq            144
	//   43  108:aload_3         
	//   44  109:aload_0         
	//   45  110:aload           4
	//   46  112:invokeinterface #89  <Method Object Iterator.next()>
	//   47  117:checkcast       #37  <Class Integer>
	//   48  120:invokevirtual   #93  <Method int Integer.intValue()>
	//   49  123:aload_2         
	//   50  124:invokespecial   #95  <Method String getTextFromGlyph(int, Map)>
	//   51  127:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   52  130:pop             
		} else
	//*  53  131:goto            98
		{
			stringbuilder.append(((Character) (obj)).charValue());
	//   54  134:aload_3         
	//   55  135:aload           4
	//   56  137:invokevirtual   #99  <Method char Character.charValue()>
	//   57  140:invokevirtual   #102 <Method StringBuilder StringBuilder.append(char)>
	//   58  143:pop             
		}
		return stringbuilder.toString();
	//   59  144:aload_3         
	//   60  145:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   61  148:areturn         
	}

	private void readLigatureSetTable(int i, int j)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #115 <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore          4
		LOG.debug((new StringBuilder()).append("ligatureCount=").append(((int) (word0))).toString());
	//    9   18:getstatic       #123 <Field Logger LOG>
	//   10   21:new             #32  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #60  <Method void StringBuilder()>
	//   13   28:ldc1            #125 <String "ligatureCount=">
	//   14   30:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:iload           4
	//   16   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   17   38:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   18   41:invokeinterface #130 <Method void Logger.debug(String)>
		Object obj = ((Object) (new ArrayList(((int) (word0)))));
	//   19   46:new             #132 <Class ArrayList>
	//   20   49:dup             
	//   21   50:iload           4
	//   22   52:invokespecial   #133 <Method void ArrayList(int)>
	//   23   55:astore          5
		for(int k = 0; k < word0; k++)
	//*  24   57:iconst_0        
	//*  25   58:istore_3        
	//*  26   59:iload_3         
	//*  27   60:iload           4
	//*  28   62:icmpge          90
			((List) (obj)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   29   65:aload           5
	//   30   67:aload_0         
	//   31   68:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   32   71:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   33   74:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   34   77:invokeinterface #137 <Method boolean List.add(Object)>
	//   35   82:pop             

	//   36   83:iload_3         
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore_3        
	//*  40   87:goto            59
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); readLigatureTable(i + ((Integer)((Iterator) (obj)).next()).intValue(), j));
	//   41   90:aload           5
	//   42   92:invokeinterface #80  <Method Iterator List.iterator()>
	//   43   97:astore          5
	//   44   99:aload           5
	//   45  101:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   46  106:ifeq            132
	//   47  109:aload_0         
	//   48  110:iload_1         
	//   49  111:aload           5
	//   50  113:invokeinterface #89  <Method Object Iterator.next()>
	//   51  118:checkcast       #37  <Class Integer>
	//   52  121:invokevirtual   #93  <Method int Integer.intValue()>
	//   53  124:iadd            
	//   54  125:iload_2         
	//   55  126:invokespecial   #140 <Method void readLigatureTable(int, int)>
	//*  56  129:goto            99
	//   57  132:return          
	}

	private void readLigatureSubstitutionSubtable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #115 <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_2        
		LOG.debug((new StringBuilder()).append("substFormat=").append(((int) (word0))).toString());
	//    9   17:getstatic       #123 <Field Logger LOG>
	//   10   20:new             #32  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #60  <Method void StringBuilder()>
	//   13   27:ldc1            #143 <String "substFormat=">
	//   14   29:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_2         
	//   16   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #130 <Method void Logger.debug(String)>
		if(word0 != 1)
	//*  19   44:iload_2         
	//*  20   45:iconst_1        
	//*  21   46:icmpeq          59
			throw new IllegalArgumentException("The expected SubstFormat is 1");
	//   22   49:new             #145 <Class IllegalArgumentException>
	//   23   52:dup             
	//   24   53:ldc1            #147 <String "The expected SubstFormat is 1">
	//   25   55:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   26   58:athrow          
		short word2 = rf.readShort();
	//   27   59:aload_0         
	//   28   60:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   29   63:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   30   66:istore          4
		LOG.debug((new StringBuilder()).append("coverage=").append(((int) (word2))).toString());
	//   31   68:getstatic       #123 <Field Logger LOG>
	//   32   71:new             #32  <Class StringBuilder>
	//   33   74:dup             
	//   34   75:invokespecial   #60  <Method void StringBuilder()>
	//   35   78:ldc1            #150 <String "coverage=">
	//   36   80:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:iload           4
	//   38   85:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   39   88:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   40   91:invokeinterface #130 <Method void Logger.debug(String)>
		short word1 = rf.readShort();
	//   41   96:aload_0         
	//   42   97:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   43  100:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   44  103:istore_3        
		ArrayList arraylist = new ArrayList(((int) (word1)));
	//   45  104:new             #132 <Class ArrayList>
	//   46  107:dup             
	//   47  108:iload_3         
	//   48  109:invokespecial   #133 <Method void ArrayList(int)>
	//   49  112:astore          6
		for(int j = 0; j < word1; j++)
	//*  50  114:iconst_0        
	//*  51  115:istore_2        
	//*  52  116:iload_2         
	//*  53  117:iload_3         
	//*  54  118:icmpge          146
			((List) (arraylist)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   55  121:aload           6
	//   56  123:aload_0         
	//   57  124:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   58  127:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   59  130:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   60  133:invokeinterface #137 <Method boolean List.add(Object)>
	//   61  138:pop             

	//   62  139:iload_2         
	//   63  140:iconst_1        
	//   64  141:iadd            
	//   65  142:istore_2        
	//*  66  143:goto            116
		List list = readCoverageFormat(i + word2);
	//   67  146:aload_0         
	//   68  147:iload_1         
	//   69  148:iload           4
	//   70  150:iadd            
	//   71  151:invokevirtual   #154 <Method List readCoverageFormat(int)>
	//   72  154:astore          7
		if(word1 != list.size())
	//*  73  156:iload_3         
	//*  74  157:aload           7
	//*  75  159:invokeinterface #157 <Method int List.size()>
	//*  76  164:icmpeq          177
			throw new IllegalArgumentException("According to the OpenTypeFont specifications, the coverage count should be equal to the no. of LigatureSetTables");
	//   77  167:new             #145 <Class IllegalArgumentException>
	//   78  170:dup             
	//   79  171:ldc1            #159 <String "According to the OpenTypeFont specifications, the coverage count should be equal to the no. of LigatureSetTables">
	//   80  173:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   81  176:athrow          
		for(int k = 0; k < word1; k++)
	//*  82  177:iconst_0        
	//*  83  178:istore_2        
	//*  84  179:iload_2         
	//*  85  180:iload_3         
	//*  86  181:icmpge          261
		{
			int l = ((Integer)list.get(k)).intValue();
	//   87  184:aload           7
	//   88  186:iload_2         
	//   89  187:invokeinterface #162 <Method Object List.get(int)>
	//   90  192:checkcast       #37  <Class Integer>
	//   91  195:invokevirtual   #93  <Method int Integer.intValue()>
	//   92  198:istore          4
			int i1 = ((Integer)((List) (arraylist)).get(k)).intValue();
	//   93  200:aload           6
	//   94  202:iload_2         
	//   95  203:invokeinterface #162 <Method Object List.get(int)>
	//   96  208:checkcast       #37  <Class Integer>
	//   97  211:invokevirtual   #93  <Method int Integer.intValue()>
	//   98  214:istore          5
			LOG.debug((new StringBuilder()).append("ligatureOffset=").append(i1).toString());
	//   99  216:getstatic       #123 <Field Logger LOG>
	//  100  219:new             #32  <Class StringBuilder>
	//  101  222:dup             
	//  102  223:invokespecial   #60  <Method void StringBuilder()>
	//  103  226:ldc1            #164 <String "ligatureOffset=">
	//  104  228:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//  105  231:iload           5
	//  106  233:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//  107  236:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  108  239:invokeinterface #130 <Method void Logger.debug(String)>
			readLigatureSetTable(i + i1, l);
	//  109  244:aload_0         
	//  110  245:iload_1         
	//  111  246:iload           5
	//  112  248:iadd            
	//  113  249:iload           4
	//  114  251:invokespecial   #166 <Method void readLigatureSetTable(int, int)>
		}

	//  115  254:iload_2         
	//  116  255:iconst_1        
	//  117  256:iadd            
	//  118  257:istore_2        
	//* 119  258:goto            179
	//  120  261:return          
	}

	private void readLigatureTable(int i, int j)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #115 <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		LOG.debug((new StringBuilder()).append("ligGlyph=").append(((int) (word0))).toString());
	//    9   17:getstatic       #123 <Field Logger LOG>
	//   10   20:new             #32  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #60  <Method void StringBuilder()>
	//   13   27:ldc1            #168 <String "ligGlyph=">
	//   14   29:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_3         
	//   16   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #130 <Method void Logger.debug(String)>
		short word1 = rf.readShort();
	//   19   44:aload_0         
	//   20   45:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   21   48:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   22   51:istore          4
		ArrayList arraylist = new ArrayList();
	//   23   53:new             #132 <Class ArrayList>
	//   24   56:dup             
	//   25   57:invokespecial   #169 <Method void ArrayList()>
	//   26   60:astore          5
		((List) (arraylist)).add(((Object) (Integer.valueOf(j))));
	//   27   62:aload           5
	//   28   64:iload_2         
	//   29   65:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   30   68:invokeinterface #137 <Method boolean List.add(Object)>
	//   31   73:pop             
		for(i = 0; i < word1 - 1; i++)
	//*  32   74:iconst_0        
	//*  33   75:istore_1        
	//*  34   76:iload_1         
	//*  35   77:iload           4
	//*  36   79:iconst_1        
	//*  37   80:isub            
	//*  38   81:icmpge          109
			((List) (arraylist)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   39   84:aload           5
	//   40   86:aload_0         
	//   41   87:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   42   90:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   43   93:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   44   96:invokeinterface #137 <Method boolean List.add(Object)>
	//   45  101:pop             

	//   46  102:iload_1         
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:istore_1        
	//*  50  106:goto            76
		LOG.debug((new StringBuilder()).append("glyphIdList=").append(((Object) (arraylist))).toString());
	//   51  109:getstatic       #123 <Field Logger LOG>
	//   52  112:new             #32  <Class StringBuilder>
	//   53  115:dup             
	//   54  116:invokespecial   #60  <Method void StringBuilder()>
	//   55  119:ldc1            #171 <String "glyphIdList=">
	//   56  121:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   57  124:aload           5
	//   58  126:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   59  129:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   60  132:invokeinterface #130 <Method void Logger.debug(String)>
		List list = (List)rawLigatureSubstitutionMap.put(((Object) (Integer.valueOf(((int) (word0))))), ((Object) (arraylist)));
	//   61  137:aload_0         
	//   62  138:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//   63  141:iload_3         
	//   64  142:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   65  145:aload           5
	//   66  147:invokeinterface #178 <Method Object Map.put(Object, Object)>
	//   67  152:checkcast       #53  <Class List>
	//   68  155:astore          6
		if(list != null)
	//*  69  157:aload           6
	//*  70  159:ifnull          209
			LOG.warn((new StringBuilder()).append("!!!!!!!!!!glyphId=").append(((int) (word0))).append(",\npreviousValue=").append(((Object) (list))).append(",\ncurrentVal=").append(((Object) (arraylist))).toString());
	//   71  162:getstatic       #123 <Field Logger LOG>
	//   72  165:new             #32  <Class StringBuilder>
	//   73  168:dup             
	//   74  169:invokespecial   #60  <Method void StringBuilder()>
	//   75  172:ldc1            #180 <String "!!!!!!!!!!glyphId=">
	//   76  174:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   77  177:iload_3         
	//   78  178:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   79  181:ldc1            #182 <String ",\npreviousValue=">
	//   80  183:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   81  186:aload           6
	//   82  188:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   83  191:ldc1            #184 <String ",\ncurrentVal=">
	//   84  193:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   85  196:aload           5
	//   86  198:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   87  201:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   88  204:invokeinterface #187 <Method void Logger.warn(String)>
	//   89  209:return          
	}

	private void readSingleSubstitutionSubtable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #115 <Method void RandomAccessFileOrArray.seek(long)>
		int j = ((int) (rf.readShort()));
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_2        
		LOG.debug((new StringBuilder()).append("substFormat=").append(j).toString());
	//    9   17:getstatic       #123 <Field Logger LOG>
	//   10   20:new             #32  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #60  <Method void StringBuilder()>
	//   13   27:ldc1            #143 <String "substFormat=">
	//   14   29:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_2         
	//   16   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   18   39:invokeinterface #130 <Method void Logger.debug(String)>
		if(j == 1)
	//*  19   44:iload_2         
	//*  20   45:iconst_1        
	//*  21   46:icmpne          190
		{
			short word0 = rf.readShort();
	//   22   49:aload_0         
	//   23   50:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   24   53:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   25   56:istore_3        
			LOG.debug((new StringBuilder()).append("coverage=").append(((int) (word0))).toString());
	//   26   57:getstatic       #123 <Field Logger LOG>
	//   27   60:new             #32  <Class StringBuilder>
	//   28   63:dup             
	//   29   64:invokespecial   #60  <Method void StringBuilder()>
	//   30   67:ldc1            #150 <String "coverage=">
	//   31   69:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:iload_3         
	//   33   73:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   34   76:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   35   79:invokeinterface #130 <Method void Logger.debug(String)>
			j = ((int) (rf.readShort()));
	//   36   84:aload_0         
	//   37   85:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   38   88:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   39   91:istore_2        
			LOG.debug((new StringBuilder()).append("deltaGlyphID=").append(j).toString());
	//   40   92:getstatic       #123 <Field Logger LOG>
	//   41   95:new             #32  <Class StringBuilder>
	//   42   98:dup             
	//   43   99:invokespecial   #60  <Method void StringBuilder()>
	//   44  102:ldc1            #190 <String "deltaGlyphID=">
	//   45  104:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   46  107:iload_2         
	//   47  108:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   48  111:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   49  114:invokeinterface #130 <Method void Logger.debug(String)>
			for(Iterator iterator = readCoverageFormat(i + word0).iterator(); iterator.hasNext(); rawLigatureSubstitutionMap.put(((Object) (Integer.valueOf(i + j))), ((Object) (Arrays.asList(((Object []) (new Integer[] {
	Integer.valueOf(i)
})))))))
	//*  50  119:aload_0         
	//*  51  120:iload_1         
	//*  52  121:iload_3         
	//*  53  122:iadd            
	//*  54  123:invokevirtual   #154 <Method List readCoverageFormat(int)>
	//*  55  126:invokeinterface #80  <Method Iterator List.iterator()>
	//*  56  131:astore          5
	//*  57  133:aload           5
	//*  58  135:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*  59  140:ifeq            359
				i = ((Integer)iterator.next()).intValue();
	//   60  143:aload           5
	//   61  145:invokeinterface #89  <Method Object Iterator.next()>
	//   62  150:checkcast       #37  <Class Integer>
	//   63  153:invokevirtual   #93  <Method int Integer.intValue()>
	//   64  156:istore_1        

	//   65  157:aload_0         
	//   66  158:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//   67  161:iload_1         
	//   68  162:iload_2         
	//   69  163:iadd            
	//   70  164:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   71  167:iconst_1        
	//   72  168:anewarray       Integer[]
	//   73  171:dup             
	//   74  172:iconst_0        
	//   75  173:iload_1         
	//   76  174:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   77  177:aastore         
	//   78  178:invokestatic    #196 <Method List Arrays.asList(Object[])>
	//   79  181:invokeinterface #178 <Method Object Map.put(Object, Object)>
	//   80  186:pop             
		} else
	//*  81  187:goto            133
		if(j == 2)
	//*  82  190:iload_2         
	//*  83  191:iconst_2        
	//*  84  192:icmpne          332
		{
			short word1 = rf.readShort();
	//   85  195:aload_0         
	//   86  196:getfield        #109 <Field RandomAccessFileOrArray rf>
	//   87  199:invokevirtual   #119 <Method short RandomAccessFileOrArray.readShort()>
	//   88  202:istore          4
			LOG.debug((new StringBuilder()).append("coverage=").append(((int) (word1))).toString());
	//   89  204:getstatic       #123 <Field Logger LOG>
	//   90  207:new             #32  <Class StringBuilder>
	//   91  210:dup             
	//   92  211:invokespecial   #60  <Method void StringBuilder()>
	//   93  214:ldc1            #150 <String "coverage=">
	//   94  216:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   95  219:iload           4
	//   96  221:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   97  224:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   98  227:invokeinterface #130 <Method void Logger.debug(String)>
			int k = rf.readUnsignedShort();
	//   99  232:aload_0         
	//  100  233:getfield        #109 <Field RandomAccessFileOrArray rf>
	//  101  236:invokevirtual   #199 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  102  239:istore_3        
			int ai[] = new int[k];
	//  103  240:iload_3         
	//  104  241:newarray        int[]
	//  105  243:astore          5
			for(j = 0; j < k; j++)
	//* 106  245:iconst_0        
	//* 107  246:istore_2        
	//* 108  247:iload_2         
	//* 109  248:iload_3         
	//* 110  249:icmpge          270
				ai[j] = rf.readUnsignedShort();
	//  111  252:aload           5
	//  112  254:iload_2         
	//  113  255:aload_0         
	//  114  256:getfield        #109 <Field RandomAccessFileOrArray rf>
	//  115  259:invokevirtual   #199 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  116  262:iastore         

	//  117  263:iload_2         
	//  118  264:iconst_1        
	//  119  265:iadd            
	//  120  266:istore_2        
	//* 121  267:goto            247
			List list = readCoverageFormat(i + word1);
	//  122  270:aload_0         
	//  123  271:iload_1         
	//  124  272:iload           4
	//  125  274:iadd            
	//  126  275:invokevirtual   #154 <Method List readCoverageFormat(int)>
	//  127  278:astore          6
			for(i = 0; i < k; i++)
	//* 128  280:iconst_0        
	//* 129  281:istore_1        
	//* 130  282:iload_1         
	//* 131  283:iload_3         
	//* 132  284:icmpge          359
				rawLigatureSubstitutionMap.put(((Object) (Integer.valueOf(ai[i]))), ((Object) (Arrays.asList(((Object []) (new Integer[] {
					(Integer)list.get(i)
				}))))));
	//  133  287:aload_0         
	//  134  288:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//  135  291:aload           5
	//  136  293:iload_1         
	//  137  294:iaload          
	//  138  295:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//  139  298:iconst_1        
	//  140  299:anewarray       Integer[]
	//  141  302:dup             
	//  142  303:iconst_0        
	//  143  304:aload           6
	//  144  306:iload_1         
	//  145  307:invokeinterface #162 <Method Object List.get(int)>
	//  146  312:checkcast       #37  <Class Integer>
	//  147  315:aastore         
	//  148  316:invokestatic    #196 <Method List Arrays.asList(Object[])>
	//  149  319:invokeinterface #178 <Method Object Map.put(Object, Object)>
	//  150  324:pop             

	//  151  325:iload_1         
	//  152  326:iconst_1        
	//  153  327:iadd            
	//  154  328:istore_1        
		} else
	//* 155  329:goto            282
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Bad substFormat: ").append(j).toString());
	//  156  332:new             #145 <Class IllegalArgumentException>
	//  157  335:dup             
	//  158  336:new             #32  <Class StringBuilder>
	//  159  339:dup             
	//  160  340:invokespecial   #60  <Method void StringBuilder()>
	//  161  343:ldc1            #201 <String "Bad substFormat: ">
	//  162  345:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//  163  348:iload_2         
	//  164  349:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//  165  352:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  166  355:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//  167  358:athrow          
		}
	//  168  359:return          
	}

	public Map getGlyphSubstitutionMap()
		throws FontReadingException
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #205 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #206 <Method void LinkedHashMap()>
	//    3    7:astore_1        
		Object obj;
		for(Iterator iterator = rawLigatureSubstitutionMap.keySet().iterator(); iterator.hasNext(); ((Map) (linkedhashmap)).put(((Object) (((Glyph) (obj)).chars)), obj))
	//*   4    8:aload_0         
	//*   5    9:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//*   6   12:invokeinterface #210 <Method Set Map.keySet()>
	//*   7   17:invokeinterface #213 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            163
		{
			obj = ((Object) ((Integer)iterator.next()));
	//   12   32:aload_2         
	//   13   33:invokeinterface #89  <Method Object Iterator.next()>
	//   14   38:checkcast       #37  <Class Integer>
	//   15   41:astore_3        
			Object obj1 = ((Object) ((List)rawLigatureSubstitutionMap.get(obj)));
	//   16   42:aload_0         
	//   17   43:getfield        #51  <Field Map rawLigatureSubstitutionMap>
	//   18   46:aload_3         
	//   19   47:invokeinterface #47  <Method Object Map.get(Object)>
	//   20   52:checkcast       #53  <Class List>
	//   21   55:astore          5
			StringBuilder stringbuilder = new StringBuilder(((List) (obj1)).size());
	//   22   57:new             #32  <Class StringBuilder>
	//   23   60:dup             
	//   24   61:aload           5
	//   25   63:invokeinterface #157 <Method int List.size()>
	//   26   68:invokespecial   #35  <Method void StringBuilder(int)>
	//   27   71:astore          4
			for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); stringbuilder.append(getTextFromGlyph(((Integer)((Iterator) (obj1)).next()).intValue(), glyphToCharacterMap)));
	//   28   73:aload           5
	//   29   75:invokeinterface #80  <Method Iterator List.iterator()>
	//   30   80:astore          5
	//   31   82:aload           5
	//   32   84:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   33   89:ifeq            122
	//   34   92:aload           4
	//   35   94:aload_0         
	//   36   95:aload           5
	//   37   97:invokeinterface #89  <Method Object Iterator.next()>
	//   38  102:checkcast       #37  <Class Integer>
	//   39  105:invokevirtual   #93  <Method int Integer.intValue()>
	//   40  108:aload_0         
	//   41  109:getfield        #22  <Field Map glyphToCharacterMap>
	//   42  112:invokespecial   #95  <Method String getTextFromGlyph(int, Map)>
	//   43  115:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   44  118:pop             
	//*  45  119:goto            82
			obj = ((Object) (new Glyph(((Integer) (obj)).intValue(), glyphWidthsByIndex[((Integer) (obj)).intValue()], stringbuilder.toString())));
	//   46  122:new             #215 <Class Glyph>
	//   47  125:dup             
	//   48  126:aload_3         
	//   49  127:invokevirtual   #93  <Method int Integer.intValue()>
	//   50  130:aload_0         
	//   51  131:getfield        #20  <Field int[] glyphWidthsByIndex>
	//   52  134:aload_3         
	//   53  135:invokevirtual   #93  <Method int Integer.intValue()>
	//   54  138:iaload          
	//   55  139:aload           4
	//   56  141:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   57  144:invokespecial   #218 <Method void Glyph(int, int, String)>
	//   58  147:astore_3        
		}

	//   59  148:aload_1         
	//   60  149:aload_3         
	//   61  150:getfield        #222 <Field String Glyph.chars>
	//   62  153:aload_3         
	//   63  154:invokeinterface #178 <Method Object Map.put(Object, Object)>
	//   64  159:pop             
	//*  65  160:goto            23
		return Collections.unmodifiableMap(((Map) (linkedhashmap)));
	//   66  163:aload_1         
	//   67  164:invokestatic    #228 <Method Map Collections.unmodifiableMap(Map)>
	//   68  167:areturn         
	}

	public void read()
		throws FontReadingException
	{
		rawLigatureSubstitutionMap = ((Map) (new LinkedHashMap()));
	//    0    0:aload_0         
	//    1    1:new             #205 <Class LinkedHashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #206 <Method void LinkedHashMap()>
	//    4    8:putfield        #51  <Field Map rawLigatureSubstitutionMap>
		startReadingTable();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #233 <Method void startReadingTable()>
	//    7   15:return          
	}

	protected void readSubTable(int i, int j)
		throws IOException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          11
		{
			readSingleSubstitutionSubtable(j);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #236 <Method void readSingleSubstitutionSubtable(int)>
			return;
	//    6   10:return          
		}
		if(i == 4)
	//*   7   11:iload_1         
	//*   8   12:iconst_4        
	//*   9   13:icmpne          22
		{
			readLigatureSubstitutionSubtable(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokespecial   #238 <Method void readLigatureSubstitutionSubtable(int)>
			return;
	//   13   21:return          
		} else
		{
			System.err.println((new StringBuilder()).append("LookupType ").append(i).append(" is not yet handled for ").append(((Class) (com/itextpdf/text/pdf/fonts/otf/GlyphSubstitutionTableReader)).getSimpleName()).toString());
	//   14   22:getstatic       #244 <Field PrintStream System.err>
	//   15   25:new             #32  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #60  <Method void StringBuilder()>
	//   18   32:ldc1            #246 <String "LookupType ">
	//   19   34:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:iload_1         
	//   21   38:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   22   41:ldc1            #248 <String " is not yet handled for ">
	//   23   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:ldc1            #2   <Class GlyphSubstitutionTableReader>
	//   25   48:invokevirtual   #253 <Method String Class.getSimpleName()>
	//   26   51:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   28   57:invokevirtual   #258 <Method void PrintStream.println(String)>
			return;
	//   29   60:return          
		}
	}

	private final Map glyphToCharacterMap;
	private final int glyphWidthsByIndex[];
	private Map rawLigatureSubstitutionMap;
}
