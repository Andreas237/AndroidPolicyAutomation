// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			TrueTypeFont, RandomAccessFileOrArray

class EnumerateTTC extends TrueTypeFont
{

	EnumerateTTC(String s)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void TrueTypeFont()>
		fileName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String fileName>
		rf = new RandomAccessFileOrArray(s);
	//    5    9:aload_0         
	//    6   10:new             #21  <Class RandomAccessFileOrArray>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #23  <Method void RandomAccessFileOrArray(String)>
	//   10   18:putfield        #27  <Field RandomAccessFileOrArray rf>
		findNames();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #30  <Method void findNames()>
	//   13   25:return          
	}

	EnumerateTTC(byte abyte0[])
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void TrueTypeFont()>
		fileName = "Byte array TTC";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "Byte array TTC">
	//    4    7:putfield        #19  <Field String fileName>
		rf = new RandomAccessFileOrArray(abyte0);
	//    5   10:aload_0         
	//    6   11:new             #21  <Class RandomAccessFileOrArray>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:invokespecial   #37  <Method void RandomAccessFileOrArray(byte[])>
	//   10   19:putfield        #27  <Field RandomAccessFileOrArray rf>
		findNames();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #30  <Method void findNames()>
	//   13   26:return          
	}

	void findNames()
		throws DocumentException, IOException
	{
		tables = new HashMap();
	//    0    0:aload_0         
	//    1    1:new             #39  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #40  <Method void HashMap()>
	//    4    8:putfield        #44  <Field HashMap tables>
		if(!readStandardString(4).equals("ttcf"))
	//*   5   11:aload_0         
	//*   6   12:iconst_4        
	//*   7   13:invokevirtual   #48  <Method String readStandardString(int)>
	//*   8   16:ldc1            #50  <String "ttcf">
	//*   9   18:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  10   21:ifne            67
			throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.valid.ttc.file", new Object[] {
				fileName
			}));
	//   11   24:new             #10  <Class DocumentException>
	//   12   27:dup             
	//   13   28:ldc1            #58  <String "1.is.not.a.valid.ttc.file">
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field String fileName>
	//   20   40:aastore         
	//   21   41:invokestatic    #66  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   44:invokespecial   #67  <Method void DocumentException(String)>
	//   23   47:athrow          
		break MISSING_BLOCK_LABEL_67;
		Exception exception;
		exception;
	//   24   48:astore          8
		if(rf != null)
	//*  25   50:aload_0         
	//*  26   51:getfield        #27  <Field RandomAccessFileOrArray rf>
	//*  27   54:ifnull          64
			rf.close();
	//   28   57:aload_0         
	//   29   58:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   30   61:invokevirtual   #70  <Method void RandomAccessFileOrArray.close()>
		throw exception;
	//   31   64:aload           8
	//   32   66:athrow          
		int k;
		int l;
		rf.skipBytes(4);
	//   33   67:aload_0         
	//   34   68:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   35   71:iconst_4        
	//   36   72:invokevirtual   #74  <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   37   75:pop             
		k = rf.readInt();
	//   38   76:aload_0         
	//   39   77:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   40   80:invokevirtual   #78  <Method int RandomAccessFileOrArray.readInt()>
	//   41   83:istore_3        
		names = new String[k];
	//   42   84:aload_0         
	//   43   85:iload_3         
	//   44   86:anewarray       String[]
	//   45   89:putfield        #80  <Field String[] names>
		l = (int)rf.getFilePointer();
	//   46   92:aload_0         
	//   47   93:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   48   96:invokevirtual   #84  <Method long RandomAccessFileOrArray.getFilePointer()>
	//   49   99:l2i             
	//   50  100:istore          4
		int i = 0;
	//   51  102:iconst_0        
	//   52  103:istore_1        
_L4:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   53  104:iload_1         
	//   54  105:iload_3         
	//   55  106:icmpge          304
		int i1;
		tables.clear();
	//   56  109:aload_0         
	//   57  110:getfield        #44  <Field HashMap tables>
	//   58  113:invokevirtual   #87  <Method void HashMap.clear()>
		rf.seek(l);
	//   59  116:aload_0         
	//   60  117:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   61  120:iload           4
	//   62  122:i2l             
	//   63  123:invokevirtual   #91  <Method void RandomAccessFileOrArray.seek(long)>
		rf.skipBytes(i * 4);
	//   64  126:aload_0         
	//   65  127:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   66  130:iload_1         
	//   67  131:iconst_4        
	//   68  132:imul            
	//   69  133:invokevirtual   #74  <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   70  136:pop             
		directoryOffset = rf.readInt();
	//   71  137:aload_0         
	//   72  138:aload_0         
	//   73  139:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   74  142:invokevirtual   #78  <Method int RandomAccessFileOrArray.readInt()>
	//   75  145:putfield        #95  <Field int directoryOffset>
		rf.seek(directoryOffset);
	//   76  148:aload_0         
	//   77  149:getfield        #27  <Field RandomAccessFileOrArray rf>
	//   78  152:aload_0         
	//   79  153:getfield        #95  <Field int directoryOffset>
	//   80  156:i2l             
	//   81  157:invokevirtual   #91  <Method void RandomAccessFileOrArray.seek(long)>
		if(rf.readInt() != 0x10000)
	//*  82  160:aload_0         
	//*  83  161:getfield        #27  <Field RandomAccessFileOrArray rf>
	//*  84  164:invokevirtual   #78  <Method int RandomAccessFileOrArray.readInt()>
	//*  85  167:ldc1            #96  <Int 0x10000>
	//*  86  169:icmpeq          196
			throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.valid.ttf.file", new Object[] {
				fileName
			}));
	//   87  172:new             #10  <Class DocumentException>
	//   88  175:dup             
	//   89  176:ldc1            #98  <String "1.is.not.a.valid.ttf.file">
	//   90  178:iconst_1        
	//   91  179:anewarray       Object[]
	//   92  182:dup             
	//   93  183:iconst_0        
	//   94  184:aload_0         
	//   95  185:getfield        #19  <Field String fileName>
	//   96  188:aastore         
	//   97  189:invokestatic    #66  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   98  192:invokespecial   #67  <Method void DocumentException(String)>
	//   99  195:athrow          
		i1 = rf.readUnsignedShort();
	//  100  196:aload_0         
	//  101  197:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  102  200:invokevirtual   #101 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  103  203:istore          5
		rf.skipBytes(6);
	//  104  205:aload_0         
	//  105  206:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  106  209:bipush          6
	//  107  211:invokevirtual   #74  <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  108  214:pop             
		int j = 0;
	//  109  215:iconst_0        
	//  110  216:istore_2        
_L2:
		if(j >= i1)
			break; /* Loop/switch isn't completed */
	//  111  217:iload_2         
	//  112  218:iload           5
	//  113  220:icmpge          287
		String s = readStandardString(4);
	//  114  223:aload_0         
	//  115  224:iconst_4        
	//  116  225:invokevirtual   #48  <Method String readStandardString(int)>
	//  117  228:astore          8
		rf.skipBytes(4);
	//  118  230:aload_0         
	//  119  231:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  120  234:iconst_4        
	//  121  235:invokevirtual   #74  <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  122  238:pop             
		int j1 = rf.readInt();
	//  123  239:aload_0         
	//  124  240:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  125  243:invokevirtual   #78  <Method int RandomAccessFileOrArray.readInt()>
	//  126  246:istore          6
		int k1 = rf.readInt();
	//  127  248:aload_0         
	//  128  249:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  129  252:invokevirtual   #78  <Method int RandomAccessFileOrArray.readInt()>
	//  130  255:istore          7
		tables.put(((Object) (s)), ((Object) (new int[] {
			j1, k1
		})));
	//  131  257:aload_0         
	//  132  258:getfield        #44  <Field HashMap tables>
	//  133  261:aload           8
	//  134  263:iconst_2        
	//  135  264:newarray        int[]
	//  136  266:dup             
	//  137  267:iconst_0        
	//  138  268:iload           6
	//  139  270:iastore         
	//  140  271:dup             
	//  141  272:iconst_1        
	//  142  273:iload           7
	//  143  275:iastore         
	//  144  276:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//  145  279:pop             
		j++;
	//  146  280:iload_2         
	//  147  281:iconst_1        
	//  148  282:iadd            
	//  149  283:istore_2        
		if(true) goto _L2; else goto _L1
	//  150  284:goto            217
_L1:
		names[i] = getBaseFont();
	//  151  287:aload_0         
	//  152  288:getfield        #80  <Field String[] names>
	//  153  291:iload_1         
	//  154  292:aload_0         
	//  155  293:invokevirtual   #109 <Method String getBaseFont()>
	//  156  296:aastore         
		i++;
	//  157  297:iload_1         
	//  158  298:iconst_1        
	//  159  299:iadd            
	//  160  300:istore_1        
		if(true) goto _L4; else goto _L3
	//  161  301:goto            104
_L3:
		if(rf != null)
	//* 162  304:aload_0         
	//* 163  305:getfield        #27  <Field RandomAccessFileOrArray rf>
	//* 164  308:ifnull          318
			rf.close();
	//  165  311:aload_0         
	//  166  312:getfield        #27  <Field RandomAccessFileOrArray rf>
	//  167  315:invokevirtual   #70  <Method void RandomAccessFileOrArray.close()>
		return;
	//  168  318:return          
	}

	String[] getNames()
	{
		return names;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String[] names>
	//    2    4:areturn         
	}

	protected String names[];
}
