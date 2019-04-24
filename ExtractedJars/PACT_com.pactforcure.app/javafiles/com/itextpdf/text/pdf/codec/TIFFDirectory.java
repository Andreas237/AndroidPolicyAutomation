// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TIFFField

public class TIFFDirectory
	implements Serializable
{

	TIFFDirectory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		fieldIndex = new Hashtable();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Hashtable>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Hashtable()>
	//    6   12:putfield        #36  <Field Hashtable fieldIndex>
		IFDOffset = 8L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #37  <Long 8L>
	//    9   19:putfield        #40  <Field long IFDOffset>
		nextIFDOffset = 0L;
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:putfield        #42  <Field long nextIFDOffset>
	//   13   27:return          
	}

	public TIFFDirectory(RandomAccessFileOrArray randomaccessfileorarray, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		fieldIndex = new Hashtable();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Hashtable>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Hashtable()>
	//    6   12:putfield        #36  <Field Hashtable fieldIndex>
		IFDOffset = 8L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #37  <Long 8L>
	//    9   19:putfield        #40  <Field long IFDOffset>
		nextIFDOffset = 0L;
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:putfield        #42  <Field long nextIFDOffset>
		long l1 = randomaccessfileorarray.getFilePointer();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #51  <Method long RandomAccessFileOrArray.getFilePointer()>
	//   15   31:lstore          6
		randomaccessfileorarray.seek(0L);
	//   16   33:aload_1         
	//   17   34:lconst_0        
	//   18   35:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		int j = randomaccessfileorarray.readUnsignedShort();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #59  <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   21   42:istore_3        
		if(!isValidEndianTag(j))
	//*  22   43:iload_3         
	//*  23   44:invokestatic    #63  <Method boolean isValidEndianTag(int)>
	//*  24   47:ifne            67
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bad.endianness.tag.not.0x4949.or.0x4d4d", new Object[0]));
	//   25   50:new             #65  <Class IllegalArgumentException>
	//   26   53:dup             
	//   27   54:ldc1            #67  <String "bad.endianness.tag.not.0x4949.or.0x4d4d">
	//   28   56:iconst_0        
	//   29   57:anewarray       Object[]
	//   30   60:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   63:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		boolean flag;
		if(j == 19789)
	//*  33   67:iload_3         
	//*  34   68:sipush          19789
	//*  35   71:icmpne          110
			flag = true;
	//   36   74:iconst_1        
	//   37   75:istore          8
		else
	//*  38   77:aload_0         
	//*  39   78:iload           8
	//*  40   80:putfield        #78  <Field boolean isBigEndian>
	//*  41   83:aload_0         
	//*  42   84:aload_1         
	//*  43   85:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//*  44   88:bipush          42
	//*  45   90:icmpeq          116
	//*  46   93:new             #65  <Class IllegalArgumentException>
	//*  47   96:dup             
	//*  48   97:ldc1            #83  <String "bad.magic.number.should.be.42">
	//*  49   99:iconst_0        
	//*  50  100:anewarray       Object[]
	//*  51  103:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  52  106:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//*  53  109:athrow          
			flag = false;
	//   54  110:iconst_0        
	//   55  111:istore          8
		isBigEndian = flag;
		if(readUnsignedShort(randomaccessfileorarray) != 42)
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bad.magic.number.should.be.42", new Object[0]));
	//*  56  113:goto            77
		long l = readUnsignedInt(randomaccessfileorarray);
	//   57  116:aload_0         
	//   58  117:aload_1         
	//   59  118:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//   60  121:lstore          4
		for(int k = 0; k < i; k++)
	//*  61  123:iconst_0        
	//*  62  124:istore_3        
	//*  63  125:iload_3         
	//*  64  126:iload_2         
	//*  65  127:icmpge          188
		{
			if(l == 0L)
	//*  66  130:lload           4
	//*  67  132:lconst_0        
	//*  68  133:lcmp            
	//*  69  134:ifne            154
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("directory.number.too.large", new Object[0]));
	//   70  137:new             #65  <Class IllegalArgumentException>
	//   71  140:dup             
	//   72  141:ldc1            #89  <String "directory.number.too.large">
	//   73  143:iconst_0        
	//   74  144:anewarray       Object[]
	//   75  147:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   76  150:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   77  153:athrow          
			randomaccessfileorarray.seek(l);
	//   78  154:aload_1         
	//   79  155:lload           4
	//   80  157:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
			randomaccessfileorarray.skip(readUnsignedShort(randomaccessfileorarray) * 12);
	//   81  160:aload_1         
	//   82  161:aload_0         
	//   83  162:aload_1         
	//   84  163:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//   85  166:bipush          12
	//   86  168:imul            
	//   87  169:i2l             
	//   88  170:invokevirtual   #93  <Method long RandomAccessFileOrArray.skip(long)>
	//   89  173:pop2            
			l = readUnsignedInt(randomaccessfileorarray);
	//   90  174:aload_0         
	//   91  175:aload_1         
	//   92  176:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//   93  179:lstore          4
		}

	//   94  181:iload_3         
	//   95  182:iconst_1        
	//   96  183:iadd            
	//   97  184:istore_3        
	//*  98  185:goto            125
		randomaccessfileorarray.seek(l);
	//   99  188:aload_1         
	//  100  189:lload           4
	//  101  191:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		initialize(randomaccessfileorarray);
	//  102  194:aload_0         
	//  103  195:aload_1         
	//  104  196:invokespecial   #97  <Method void initialize(RandomAccessFileOrArray)>
		randomaccessfileorarray.seek(l1);
	//  105  199:aload_1         
	//  106  200:lload           6
	//  107  202:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
	//  108  205:return          
	}

	public TIFFDirectory(RandomAccessFileOrArray randomaccessfileorarray, long l, int i)
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #31  <Method void Object()>
		fieldIndex = new Hashtable();
	//    4    7:aload_0         
	//    5    8:new             #33  <Class Hashtable>
	//    6   11:dup             
	//    7   12:invokespecial   #34  <Method void Hashtable()>
	//    8   15:putfield        #36  <Field Hashtable fieldIndex>
		IFDOffset = 8L;
	//    9   18:aload_0         
	//   10   19:ldc2w           #37  <Long 8L>
	//   11   22:putfield        #40  <Field long IFDOffset>
		nextIFDOffset = 0L;
	//   12   25:aload_0         
	//   13   26:lconst_0        
	//   14   27:putfield        #42  <Field long nextIFDOffset>
		long l1 = randomaccessfileorarray.getFilePointer();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #51  <Method long RandomAccessFileOrArray.getFilePointer()>
	//   17   34:lstore          6
		randomaccessfileorarray.seek(0L);
	//   18   36:aload_1         
	//   19   37:lconst_0        
	//   20   38:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		int j = randomaccessfileorarray.readUnsignedShort();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #59  <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   23   45:istore          5
		if(!isValidEndianTag(j))
	//*  24   47:iload           5
	//*  25   49:invokestatic    #63  <Method boolean isValidEndianTag(int)>
	//*  26   52:ifne            72
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bad.endianness.tag.not.0x4949.or.0x4d4d", new Object[0]));
	//   27   55:new             #65  <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:ldc1            #67  <String "bad.endianness.tag.not.0x4949.or.0x4d4d">
	//   30   61:iconst_0        
	//   31   62:anewarray       Object[]
	//   32   65:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   68:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   34   71:athrow          
		if(j == 19789)
	//*  35   72:iload           5
	//*  36   74:sipush          19789
	//*  37   77:icmpne          83
			flag = true;
	//   38   80:iconst_1        
	//   39   81:istore          8
		isBigEndian = flag;
	//   40   83:aload_0         
	//   41   84:iload           8
	//   42   86:putfield        #78  <Field boolean isBigEndian>
		randomaccessfileorarray.seek(l);
	//   43   89:aload_1         
	//   44   90:lload_2         
	//   45   91:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		for(int k = 0; k < i; k++)
	//*  46   94:iconst_0        
	//*  47   95:istore          5
	//*  48   97:iload           5
	//*  49   99:iload           4
	//*  50  101:icmpge          139
		{
			randomaccessfileorarray.seek((long)(readUnsignedShort(randomaccessfileorarray) * 12) + l);
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:aload_1         
	//   54  107:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//   55  110:bipush          12
	//   56  112:imul            
	//   57  113:i2l             
	//   58  114:lload_2         
	//   59  115:ladd            
	//   60  116:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
			l = readUnsignedInt(randomaccessfileorarray);
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//   64  124:lstore_2        
			randomaccessfileorarray.seek(l);
	//   65  125:aload_1         
	//   66  126:lload_2         
	//   67  127:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		}

	//   68  130:iload           5
	//   69  132:iconst_1        
	//   70  133:iadd            
	//   71  134:istore          5
	//*  72  136:goto            97
		initialize(randomaccessfileorarray);
	//   73  139:aload_0         
	//   74  140:aload_1         
	//   75  141:invokespecial   #97  <Method void initialize(RandomAccessFileOrArray)>
		randomaccessfileorarray.seek(l1);
	//   76  144:aload_1         
	//   77  145:lload           6
	//   78  147:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
	//   79  150:return          
	}

	public static int getNumDirectories(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		int i;
		long l;
		long l1;
		boolean flag;
		l1 = randomaccessfileorarray.getFilePointer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method long RandomAccessFileOrArray.getFilePointer()>
	//    2    4:lstore          5
		randomaccessfileorarray.seek(0L);
	//    3    6:aload_0         
	//    4    7:lconst_0        
	//    5    8:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		i = randomaccessfileorarray.readUnsignedShort();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #59  <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//    8   15:istore_1        
		if(!isValidEndianTag(i))
	//*   9   16:iload_1         
	//*  10   17:invokestatic    #63  <Method boolean isValidEndianTag(int)>
	//*  11   20:ifne            40
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bad.endianness.tag.not.0x4949.or.0x4d4d", new Object[0]));
	//   12   23:new             #65  <Class IllegalArgumentException>
	//   13   26:dup             
	//   14   27:ldc1            #67  <String "bad.endianness.tag.not.0x4949.or.0x4d4d">
	//   15   29:iconst_0        
	//   16   30:anewarray       Object[]
	//   17   33:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   18   36:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   19   39:athrow          
		if(i == 19789)
	//*  20   40:iload_1         
	//*  21   41:sipush          19789
	//*  22   44:icmpne          78
			flag = true;
	//   23   47:iconst_1        
	//   24   48:istore          7
		else
	//*  25   50:aload_0         
	//*  26   51:iload           7
	//*  27   53:invokestatic    #105 <Method int readUnsignedShort(RandomAccessFileOrArray, boolean)>
	//*  28   56:bipush          42
	//*  29   58:icmpeq          84
	//*  30   61:new             #65  <Class IllegalArgumentException>
	//*  31   64:dup             
	//*  32   65:ldc1            #83  <String "bad.magic.number.should.be.42">
	//*  33   67:iconst_0        
	//*  34   68:anewarray       Object[]
	//*  35   71:invokestatic    #73  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  36   74:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//*  37   77:athrow          
			flag = false;
	//   38   78:iconst_0        
	//   39   79:istore          7
		if(readUnsignedShort(randomaccessfileorarray, flag) != 42)
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bad.magic.number.should.be.42", new Object[0]));
	//*  40   81:goto            50
		randomaccessfileorarray.seek(4L);
	//   41   84:aload_0         
	//   42   85:ldc2w           #106 <Long 4L>
	//   43   88:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		l = readUnsignedInt(randomaccessfileorarray, flag);
	//   44   91:aload_0         
	//   45   92:iload           7
	//   46   94:invokestatic    #110 <Method long readUnsignedInt(RandomAccessFileOrArray, boolean)>
	//   47   97:lstore_3        
		i = 0;
	//   48   98:iconst_0        
	//   49   99:istore_1        
_L2:
		int j;
		j = i;
	//   50  100:iload_1         
	//   51  101:istore_2        
		if(l == 0L)
			break; /* Loop/switch isn't completed */
	//   52  102:lload_3         
	//   53  103:lconst_0        
	//   54  104:lcmp            
	//   55  105:ifeq            148
		i++;
	//   56  108:iload_1         
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore_1        
		randomaccessfileorarray.seek(l);
	//   60  112:aload_0         
	//   61  113:lload_3         
	//   62  114:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		randomaccessfileorarray.skip(readUnsignedShort(randomaccessfileorarray, flag) * 12);
	//   63  117:aload_0         
	//   64  118:aload_0         
	//   65  119:iload           7
	//   66  121:invokestatic    #105 <Method int readUnsignedShort(RandomAccessFileOrArray, boolean)>
	//   67  124:bipush          12
	//   68  126:imul            
	//   69  127:i2l             
	//   70  128:invokevirtual   #93  <Method long RandomAccessFileOrArray.skip(long)>
	//   71  131:pop2            
		l = readUnsignedInt(randomaccessfileorarray, flag);
	//   72  132:aload_0         
	//   73  133:iload           7
	//   74  135:invokestatic    #110 <Method long readUnsignedInt(RandomAccessFileOrArray, boolean)>
	//   75  138:lstore_3        
		if(true) goto _L2; else goto _L1
	//   76  139:goto            100
		EOFException eofexception;
		eofexception;
	//   77  142:astore          8
		j = i - 1;
	//   78  144:iload_1         
	//   79  145:iconst_1        
	//   80  146:isub            
	//   81  147:istore_2        
_L1:
		randomaccessfileorarray.seek(l1);
	//   82  148:aload_0         
	//   83  149:lload           5
	//   84  151:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		return j;
	//   85  154:iload_2         
	//   86  155:ireturn         
	}

	private void initialize(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		int l;
		long l2;
		long l3;
		l2 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          10
		l3 = randomaccessfileorarray.length();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #117 <Method long RandomAccessFileOrArray.length()>
	//    4    7:lstore          12
		IFDOffset = randomaccessfileorarray.getFilePointer();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #51  <Method long RandomAccessFileOrArray.getFilePointer()>
	//    8   14:putfield        #40  <Field long IFDOffset>
		numEntries = readUnsignedShort(randomaccessfileorarray);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//   13   23:putfield        #119 <Field int numEntries>
		fields = new TIFFField[numEntries];
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #119 <Field int numEntries>
	//   17   31:anewarray       TIFFField[]
	//   18   34:putfield        #123 <Field TIFFField[] fields>
		l = 0;
	//   19   37:iconst_0        
	//   20   38:istore          4
_L19:
		int i;
		boolean flag;
		int k1;
		int l1;
		int i2;
		if(l >= numEntries || l2 >= l3)
			break MISSING_BLOCK_LABEL_769;
	//   21   40:iload           4
	//   22   42:aload_0         
	//   23   43:getfield        #119 <Field int numEntries>
	//   24   46:icmpge          769
	//   25   49:lload           10
	//   26   51:lload           12
	//   27   53:lcmp            
	//   28   54:ifge            769
		l1 = readUnsignedShort(randomaccessfileorarray);
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//   32   62:istore          8
		i2 = readUnsignedShort(randomaccessfileorarray);
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//   36   69:istore          9
		k1 = (int)readUnsignedInt(randomaccessfileorarray);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//   40   76:l2i             
	//   41   77:istore          7
		flag = true;
	//   42   79:iconst_1        
	//   43   80:istore_3        
		l2 = randomaccessfileorarray.getFilePointer() + 4L;
	//   44   81:aload_1         
	//   45   82:invokevirtual   #51  <Method long RandomAccessFileOrArray.getFilePointer()>
	//   46   85:ldc2w           #106 <Long 4L>
	//   47   88:ladd            
	//   48   89:lstore          10
		i = ((int) (flag));
	//   49   91:iload_3         
	//   50   92:istore_2        
		if(sizeOfType[i2] * k1 <= 4) goto _L2; else goto _L1
	//   51   93:getstatic       #27  <Field int[] sizeOfType>
	//   52   96:iload           9
	//   53   98:iaload          
	//   54   99:iload           7
	//   55  101:imul            
	//   56  102:iconst_4        
	//   57  103:icmple          129
_L1:
		long l4 = readUnsignedInt(randomaccessfileorarray);
	//   58  106:aload_0         
	//   59  107:aload_1         
	//   60  108:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//   61  111:lstore          14
		if(l4 >= l3) goto _L4; else goto _L3
	//   62  113:lload           14
	//   63  115:lload           12
	//   64  117:lcmp            
	//   65  118:ifge            259
_L3:
		randomaccessfileorarray.seek(l4);
	//   66  121:aload_1         
	//   67  122:lload           14
	//   68  124:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		i = ((int) (flag));
	//   69  127:iload_3         
	//   70  128:istore_2        
_L2:
		if(i == 0) goto _L6; else goto _L5
	//   71  129:iload_2         
	//   72  130:ifeq            244
_L5:
		Object obj;
		fieldIndex.put(((Object) (Integer.valueOf(l1))), ((Object) (Integer.valueOf(l))));
	//   73  133:aload_0         
	//   74  134:getfield        #36  <Field Hashtable fieldIndex>
	//   75  137:iload           8
	//   76  139:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   77  142:iload           4
	//   78  144:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   79  147:invokevirtual   #133 <Method Object Hashtable.put(Object, Object)>
	//   80  150:pop             
		obj = null;
	//   81  151:aconst_null     
	//   82  152:astore          16
		i2;
	//   83  154:iload           9
		JVM INSTR tableswitch 1 12: default 220
	//	               1 271
	//	               2 271
	//	               3 420
	//	               4 457
	//	               5 493
	//	               6 271
	//	               7 271
	//	               8 559
	//	               9 595
	//	               10 631
	//	               11 697
	//	               12 733;
	//   84  156:tableswitch     1 12: default 220
	//	               1 271
	//	               2 271
	//	               3 420
	//	               4 457
	//	               5 493
	//	               6 271
	//	               7 271
	//	               8 559
	//	               9 595
	//	               10 631
	//	               11 697
	//	               12 733
		   goto _L7 _L8 _L8 _L9 _L10 _L11 _L8 _L8 _L12 _L13 _L14 _L15 _L16
_L16:
		break MISSING_BLOCK_LABEL_733;
_L7:
		i = k1;
	//   85  220:iload           7
	//   86  222:istore_2        
_L17:
		fields[l] = new TIFFField(l1, i2, i, obj);
	//   87  223:aload_0         
	//   88  224:getfield        #123 <Field TIFFField[] fields>
	//   89  227:iload           4
	//   90  229:new             #121 <Class TIFFField>
	//   91  232:dup             
	//   92  233:iload           8
	//   93  235:iload           9
	//   94  237:iload_2         
	//   95  238:aload           16
	//   96  240:invokespecial   #136 <Method void TIFFField(int, int, int, Object)>
	//   97  243:aastore         
_L6:
		randomaccessfileorarray.seek(l2);
	//   98  244:aload_1         
	//   99  245:lload           10
	//  100  247:invokevirtual   #55  <Method void RandomAccessFileOrArray.seek(long)>
		l++;
	//  101  250:iload           4
	//  102  252:iconst_1        
	//  103  253:iadd            
	//  104  254:istore          4
		continue; /* Loop/switch isn't completed */
	//  105  256:goto            40
_L4:
		i = 0;
	//  106  259:iconst_0        
	//  107  260:istore_2        
		  goto _L2
	//* 108  261:goto            129
		obj;
	//  109  264:astore          16
		i = 0;
	//  110  266:iconst_0        
	//  111  267:istore_2        
		  goto _L2
	//* 112  268:goto            129
_L8:
label0:
		{
			obj = ((Object) (new byte[k1]));
	//  113  271:iload           7
	//  114  273:newarray        byte[]
	//  115  275:astore          16
			randomaccessfileorarray.readFully(((byte []) (obj)), 0, k1);
	//  116  277:aload_1         
	//  117  278:aload           16
	//  118  280:iconst_0        
	//  119  281:iload           7
	//  120  283:invokevirtual   #140 <Method void RandomAccessFileOrArray.readFully(byte[], int, int)>
			if(i2 != 2)
				break label0;
	//  121  286:iload           9
	//  122  288:iconst_2        
	//  123  289:icmpne          414
			i = 0;
	//  124  292:iconst_0        
	//  125  293:istore_2        
			int i1 = 0;
	//  126  294:iconst_0        
	//  127  295:istore          5
			ArrayList arraylist = new ArrayList();
	//  128  297:new             #142 <Class ArrayList>
	//  129  300:dup             
	//  130  301:invokespecial   #143 <Method void ArrayList()>
	//  131  304:astore          17
			while(i < k1) 
	//* 132  306:iload_2         
	//* 133  307:iload           7
	//* 134  309:icmpge          370
			{
label1:
				{
					int j;
					int j1;
					for(j = i; j < k1; j = j1)
	//* 135  312:iload_2         
	//* 136  313:istore_3        
	//* 137  314:iload_3         
	//* 138  315:iload           7
	//* 139  317:icmpge          341
					{
						j1 = j + 1;
	//  140  320:iload_3         
	//  141  321:iconst_1        
	//  142  322:iadd            
	//  143  323:istore          6
						i = j1;
	//  144  325:iload           6
	//  145  327:istore_2        
						if(obj[j] == 0)
							break label1;
	//  146  328:aload           16
	//  147  330:iload_3         
	//  148  331:baload          
	//  149  332:ifeq            343
					}

	//  150  335:iload           6
	//  151  337:istore_3        
	//* 152  338:goto            314
					i = j;
	//  153  341:iload_3         
	//  154  342:istore_2        
				}
				arraylist.add(((Object) (new String(((byte []) (obj)), i1, i - i1))));
	//  155  343:aload           17
	//  156  345:new             #145 <Class String>
	//  157  348:dup             
	//  158  349:aload           16
	//  159  351:iload           5
	//  160  353:iload_2         
	//  161  354:iload           5
	//  162  356:isub            
	//  163  357:invokespecial   #147 <Method void String(byte[], int, int)>
	//  164  360:invokevirtual   #151 <Method boolean ArrayList.add(Object)>
	//  165  363:pop             
				i1 = i;
	//  166  364:iload_2         
	//  167  365:istore          5
			}
	//* 168  367:goto            306
			int k = arraylist.size();
	//  169  370:aload           17
	//  170  372:invokevirtual   #154 <Method int ArrayList.size()>
	//  171  375:istore_3        
			obj = ((Object) (new String[k]));
	//  172  376:iload_3         
	//  173  377:anewarray       String[]
	//  174  380:astore          16
			for(i = 0; i < k; i++)
	//* 175  382:iconst_0        
	//* 176  383:istore_2        
	//* 177  384:iload_2         
	//* 178  385:iload_3         
	//* 179  386:icmpge          409
				obj[i] = ((Object) ((String)arraylist.get(i)));
	//  180  389:aload           16
	//  181  391:iload_2         
	//  182  392:aload           17
	//  183  394:iload_2         
	//  184  395:invokevirtual   #158 <Method Object ArrayList.get(int)>
	//  185  398:checkcast       #145 <Class String>
	//  186  401:aastore         

	//  187  402:iload_2         
	//  188  403:iconst_1        
	//  189  404:iadd            
	//  190  405:istore_2        
	//* 191  406:goto            384
			i = k;
	//  192  409:iload_3         
	//  193  410:istore_2        
		}
		  goto _L17
	//* 194  411:goto            223
		i = k1;
	//  195  414:iload           7
	//  196  416:istore_2        
		  goto _L17
	//* 197  417:goto            223
_L9:
		obj = ((Object) (new char[k1]));
	//  198  420:iload           7
	//  199  422:newarray        char[]
	//  200  424:astore          16
		for(i = 0; i < k1; i++)
	//* 201  426:iconst_0        
	//* 202  427:istore_2        
	//* 203  428:iload_2         
	//* 204  429:iload           7
	//* 205  431:icmpge          451
			obj[i] = ((Object) ((char)readUnsignedShort(randomaccessfileorarray)));
	//  206  434:aload           16
	//  207  436:iload_2         
	//  208  437:aload_0         
	//  209  438:aload_1         
	//  210  439:invokespecial   #81  <Method int readUnsignedShort(RandomAccessFileOrArray)>
	//  211  442:int2char        
	//  212  443:castore         

	//  213  444:iload_2         
	//  214  445:iconst_1        
	//  215  446:iadd            
	//  216  447:istore_2        
	//* 217  448:goto            428
		i = k1;
	//  218  451:iload           7
	//  219  453:istore_2        
		  goto _L17
	//* 220  454:goto            223
_L10:
		obj = ((Object) (new long[k1]));
	//  221  457:iload           7
	//  222  459:newarray        long[]
	//  223  461:astore          16
		for(i = 0; i < k1; i++)
	//* 224  463:iconst_0        
	//* 225  464:istore_2        
	//* 226  465:iload_2         
	//* 227  466:iload           7
	//* 228  468:icmpge          487
			obj[i] = ((Object) (readUnsignedInt(randomaccessfileorarray)));
	//  229  471:aload           16
	//  230  473:iload_2         
	//  231  474:aload_0         
	//  232  475:aload_1         
	//  233  476:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//  234  479:lastore         

	//  235  480:iload_2         
	//  236  481:iconst_1        
	//  237  482:iadd            
	//  238  483:istore_2        
	//* 239  484:goto            465
		i = k1;
	//  240  487:iload           7
	//  241  489:istore_2        
		  goto _L17
	//* 242  490:goto            223
_L11:
		obj = ((Object) ((long[][])Array.newInstance(Long.TYPE, new int[] {
			k1, 2
		})));
	//  243  493:getstatic       #164 <Field Class Long.TYPE>
	//  244  496:iconst_2        
	//  245  497:newarray        int[]
	//  246  499:dup             
	//  247  500:iconst_0        
	//  248  501:iload           7
	//  249  503:iastore         
	//  250  504:dup             
	//  251  505:iconst_1        
	//  252  506:iconst_2        
	//  253  507:iastore         
	//  254  508:invokestatic    #170 <Method Object Array.newInstance(Class, int[])>
	//  255  511:checkcast       #172 <Class long[][]>
	//  256  514:astore          16
		for(i = 0; i < k1; i++)
	//* 257  516:iconst_0        
	//* 258  517:istore_2        
	//* 259  518:iload_2         
	//* 260  519:iload           7
	//* 261  521:icmpge          553
		{
			obj[i][0] = readUnsignedInt(randomaccessfileorarray);
	//  262  524:aload           16
	//  263  526:iload_2         
	//  264  527:aaload          
	//  265  528:iconst_0        
	//  266  529:aload_0         
	//  267  530:aload_1         
	//  268  531:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//  269  534:lastore         
			obj[i][1] = readUnsignedInt(randomaccessfileorarray);
	//  270  535:aload           16
	//  271  537:iload_2         
	//  272  538:aaload          
	//  273  539:iconst_1        
	//  274  540:aload_0         
	//  275  541:aload_1         
	//  276  542:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//  277  545:lastore         
		}

	//  278  546:iload_2         
	//  279  547:iconst_1        
	//  280  548:iadd            
	//  281  549:istore_2        
	//* 282  550:goto            518
		i = k1;
	//  283  553:iload           7
	//  284  555:istore_2        
		  goto _L17
	//* 285  556:goto            223
_L12:
		obj = ((Object) (new short[k1]));
	//  286  559:iload           7
	//  287  561:newarray        short[]
	//  288  563:astore          16
		for(i = 0; i < k1; i++)
	//* 289  565:iconst_0        
	//* 290  566:istore_2        
	//* 291  567:iload_2         
	//* 292  568:iload           7
	//* 293  570:icmpge          589
			obj[i] = readShort(randomaccessfileorarray);
	//  294  573:aload           16
	//  295  575:iload_2         
	//  296  576:aload_0         
	//  297  577:aload_1         
	//  298  578:invokespecial   #176 <Method short readShort(RandomAccessFileOrArray)>
	//  299  581:sastore         

	//  300  582:iload_2         
	//  301  583:iconst_1        
	//  302  584:iadd            
	//  303  585:istore_2        
	//* 304  586:goto            567
		i = k1;
	//  305  589:iload           7
	//  306  591:istore_2        
		  goto _L17
	//* 307  592:goto            223
_L13:
		obj = ((Object) (new int[k1]));
	//  308  595:iload           7
	//  309  597:newarray        int[]
	//  310  599:astore          16
		for(i = 0; i < k1; i++)
	//* 311  601:iconst_0        
	//* 312  602:istore_2        
	//* 313  603:iload_2         
	//* 314  604:iload           7
	//* 315  606:icmpge          625
			obj[i] = readInt(randomaccessfileorarray);
	//  316  609:aload           16
	//  317  611:iload_2         
	//  318  612:aload_0         
	//  319  613:aload_1         
	//  320  614:invokespecial   #179 <Method int readInt(RandomAccessFileOrArray)>
	//  321  617:iastore         

	//  322  618:iload_2         
	//  323  619:iconst_1        
	//  324  620:iadd            
	//  325  621:istore_2        
	//* 326  622:goto            603
		i = k1;
	//  327  625:iload           7
	//  328  627:istore_2        
		  goto _L17
	//* 329  628:goto            223
_L14:
		obj = ((Object) ((int[][])Array.newInstance(Integer.TYPE, new int[] {
			k1, 2
		})));
	//  330  631:getstatic       #180 <Field Class Integer.TYPE>
	//  331  634:iconst_2        
	//  332  635:newarray        int[]
	//  333  637:dup             
	//  334  638:iconst_0        
	//  335  639:iload           7
	//  336  641:iastore         
	//  337  642:dup             
	//  338  643:iconst_1        
	//  339  644:iconst_2        
	//  340  645:iastore         
	//  341  646:invokestatic    #170 <Method Object Array.newInstance(Class, int[])>
	//  342  649:checkcast       #182 <Class int[][]>
	//  343  652:astore          16
		for(i = 0; i < k1; i++)
	//* 344  654:iconst_0        
	//* 345  655:istore_2        
	//* 346  656:iload_2         
	//* 347  657:iload           7
	//* 348  659:icmpge          691
		{
			obj[i][0] = readInt(randomaccessfileorarray);
	//  349  662:aload           16
	//  350  664:iload_2         
	//  351  665:aaload          
	//  352  666:iconst_0        
	//  353  667:aload_0         
	//  354  668:aload_1         
	//  355  669:invokespecial   #179 <Method int readInt(RandomAccessFileOrArray)>
	//  356  672:iastore         
			obj[i][1] = readInt(randomaccessfileorarray);
	//  357  673:aload           16
	//  358  675:iload_2         
	//  359  676:aaload          
	//  360  677:iconst_1        
	//  361  678:aload_0         
	//  362  679:aload_1         
	//  363  680:invokespecial   #179 <Method int readInt(RandomAccessFileOrArray)>
	//  364  683:iastore         
		}

	//  365  684:iload_2         
	//  366  685:iconst_1        
	//  367  686:iadd            
	//  368  687:istore_2        
	//* 369  688:goto            656
		i = k1;
	//  370  691:iload           7
	//  371  693:istore_2        
		  goto _L17
	//* 372  694:goto            223
_L15:
		obj = ((Object) (new float[k1]));
	//  373  697:iload           7
	//  374  699:newarray        float[]
	//  375  701:astore          16
		for(i = 0; i < k1; i++)
	//* 376  703:iconst_0        
	//* 377  704:istore_2        
	//* 378  705:iload_2         
	//* 379  706:iload           7
	//* 380  708:icmpge          727
			obj[i] = readFloat(randomaccessfileorarray);
	//  381  711:aload           16
	//  382  713:iload_2         
	//  383  714:aload_0         
	//  384  715:aload_1         
	//  385  716:invokespecial   #186 <Method float readFloat(RandomAccessFileOrArray)>
	//  386  719:fastore         

	//  387  720:iload_2         
	//  388  721:iconst_1        
	//  389  722:iadd            
	//  390  723:istore_2        
	//* 391  724:goto            705
		i = k1;
	//  392  727:iload           7
	//  393  729:istore_2        
		  goto _L17
	//* 394  730:goto            223
		obj = ((Object) (new double[k1]));
	//  395  733:iload           7
	//  396  735:newarray        double[]
	//  397  737:astore          16
		for(i = 0; i < k1; i++)
	//* 398  739:iconst_0        
	//* 399  740:istore_2        
	//* 400  741:iload_2         
	//* 401  742:iload           7
	//* 402  744:icmpge          763
			obj[i] = readDouble(randomaccessfileorarray);
	//  403  747:aload           16
	//  404  749:iload_2         
	//  405  750:aload_0         
	//  406  751:aload_1         
	//  407  752:invokespecial   #190 <Method double readDouble(RandomAccessFileOrArray)>
	//  408  755:dastore         

	//  409  756:iload_2         
	//  410  757:iconst_1        
	//  411  758:iadd            
	//  412  759:istore_2        
	//* 413  760:goto            741
		i = k1;
	//  414  763:iload           7
	//  415  765:istore_2        
		  goto _L17
	//* 416  766:goto            223
		try
		{
			nextIFDOffset = readUnsignedInt(randomaccessfileorarray);
	//  417  769:aload_0         
	//  418  770:aload_0         
	//  419  771:aload_1         
	//  420  772:invokespecial   #87  <Method long readUnsignedInt(RandomAccessFileOrArray)>
	//  421  775:putfield        #42  <Field long nextIFDOffset>
			return;
	//  422  778:return          
		}
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//* 423  779:astore_1        
		{
			nextIFDOffset = 0L;
	//  424  780:aload_0         
	//  425  781:lconst_0        
	//  426  782:putfield        #42  <Field long nextIFDOffset>
		}
		return;
	//  427  785:return          
		if(true) goto _L19; else goto _L18
_L18:
	}

	private static boolean isValidEndianTag(int i)
	{
		return i == 18761 || i == 19789;
	//    0    0:iload_0         
	//    1    1:sipush          18761
	//    2    4:icmpeq          14
	//    3    7:iload_0         
	//    4    8:sipush          19789
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private double readDouble(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readDouble();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #193 <Method double RandomAccessFileOrArray.readDouble()>
	//    5   11:dreturn         
		else
			return randomaccessfileorarray.readDoubleLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #196 <Method double RandomAccessFileOrArray.readDoubleLE()>
	//    8   16:dreturn         
	}

	private float readFloat(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readFloat();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #199 <Method float RandomAccessFileOrArray.readFloat()>
	//    5   11:freturn         
		else
			return randomaccessfileorarray.readFloatLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #202 <Method float RandomAccessFileOrArray.readFloatLE()>
	//    8   16:freturn         
	}

	private int readInt(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readInt();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #204 <Method int RandomAccessFileOrArray.readInt()>
	//    5   11:ireturn         
		else
			return randomaccessfileorarray.readIntLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #207 <Method int RandomAccessFileOrArray.readIntLE()>
	//    8   16:ireturn         
	}

	private long readLong(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readLong();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #210 <Method long RandomAccessFileOrArray.readLong()>
	//    5   11:lreturn         
		else
			return randomaccessfileorarray.readLongLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #213 <Method long RandomAccessFileOrArray.readLongLE()>
	//    8   16:lreturn         
	}

	private short readShort(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readShort();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #216 <Method short RandomAccessFileOrArray.readShort()>
	//    5   11:ireturn         
		else
			return randomaccessfileorarray.readShortLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #219 <Method short RandomAccessFileOrArray.readShortLE()>
	//    8   16:ireturn         
	}

	private long readUnsignedInt(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readUnsignedInt();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #221 <Method long RandomAccessFileOrArray.readUnsignedInt()>
	//    5   11:lreturn         
		else
			return randomaccessfileorarray.readUnsignedIntLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #224 <Method long RandomAccessFileOrArray.readUnsignedIntLE()>
	//    8   16:lreturn         
	}

	private static long readUnsignedInt(RandomAccessFileOrArray randomaccessfileorarray, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			return randomaccessfileorarray.readUnsignedInt();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #221 <Method long RandomAccessFileOrArray.readUnsignedInt()>
	//    4    8:lreturn         
		else
			return randomaccessfileorarray.readUnsignedIntLE();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #224 <Method long RandomAccessFileOrArray.readUnsignedIntLE()>
	//    7   13:lreturn         
	}

	private int readUnsignedShort(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		if(isBigEndian)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean isBigEndian>
	//*   2    4:ifeq            12
			return randomaccessfileorarray.readUnsignedShort();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #59  <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//    5   11:ireturn         
		else
			return randomaccessfileorarray.readUnsignedShortLE();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #227 <Method int RandomAccessFileOrArray.readUnsignedShortLE()>
	//    8   16:ireturn         
	}

	private static int readUnsignedShort(RandomAccessFileOrArray randomaccessfileorarray, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			return randomaccessfileorarray.readUnsignedShort();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #59  <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//    4    8:ireturn         
		else
			return randomaccessfileorarray.readUnsignedShortLE();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #227 <Method int RandomAccessFileOrArray.readUnsignedShortLE()>
	//    7   13:ireturn         
	}

	public TIFFField getField(int i)
	{
		Integer integer = (Integer)fieldIndex.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #232 <Method Object Hashtable.get(Object)>
	//    5   11:checkcast       #125 <Class Integer>
	//    6   14:astore_2        
		if(integer == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		else
			return fields[integer.intValue()];
	//   11   21:aload_0         
	//   12   22:getfield        #123 <Field TIFFField[] fields>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #235 <Method int Integer.intValue()>
	//   15   29:aaload          
	//   16   30:areturn         
	}

	public byte getFieldAsByte(int i)
	{
		return getFieldAsByte(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #240 <Method byte getFieldAsByte(int, int)>
	//    4    6:ireturn         
	}

	public byte getFieldAsByte(int i, int j)
	{
		Integer integer = (Integer)fieldIndex.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #232 <Method Object Hashtable.get(Object)>
	//    5   11:checkcast       #125 <Class Integer>
	//    6   14:astore_3        
		return fields[integer.intValue()].getAsBytes()[j];
	//    7   15:aload_0         
	//    8   16:getfield        #123 <Field TIFFField[] fields>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #235 <Method int Integer.intValue()>
	//   11   23:aaload          
	//   12   24:invokevirtual   #244 <Method byte[] TIFFField.getAsBytes()>
	//   13   27:iload_2         
	//   14   28:baload          
	//   15   29:ireturn         
	}

	public double getFieldAsDouble(int i)
	{
		return getFieldAsDouble(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #249 <Method double getFieldAsDouble(int, int)>
	//    4    6:dreturn         
	}

	public double getFieldAsDouble(int i, int j)
	{
		Integer integer = (Integer)fieldIndex.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #232 <Method Object Hashtable.get(Object)>
	//    5   11:checkcast       #125 <Class Integer>
	//    6   14:astore_3        
		return fields[integer.intValue()].getAsDouble(j);
	//    7   15:aload_0         
	//    8   16:getfield        #123 <Field TIFFField[] fields>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #235 <Method int Integer.intValue()>
	//   11   23:aaload          
	//   12   24:iload_2         
	//   13   25:invokevirtual   #252 <Method double TIFFField.getAsDouble(int)>
	//   14   28:dreturn         
	}

	public float getFieldAsFloat(int i)
	{
		return getFieldAsFloat(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #257 <Method float getFieldAsFloat(int, int)>
	//    4    6:freturn         
	}

	public float getFieldAsFloat(int i, int j)
	{
		Integer integer = (Integer)fieldIndex.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #232 <Method Object Hashtable.get(Object)>
	//    5   11:checkcast       #125 <Class Integer>
	//    6   14:astore_3        
		return fields[integer.intValue()].getAsFloat(j);
	//    7   15:aload_0         
	//    8   16:getfield        #123 <Field TIFFField[] fields>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #235 <Method int Integer.intValue()>
	//   11   23:aaload          
	//   12   24:iload_2         
	//   13   25:invokevirtual   #260 <Method float TIFFField.getAsFloat(int)>
	//   14   28:freturn         
	}

	public long getFieldAsLong(int i)
	{
		return getFieldAsLong(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #265 <Method long getFieldAsLong(int, int)>
	//    4    6:lreturn         
	}

	public long getFieldAsLong(int i, int j)
	{
		Integer integer = (Integer)fieldIndex.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #232 <Method Object Hashtable.get(Object)>
	//    5   11:checkcast       #125 <Class Integer>
	//    6   14:astore_3        
		return fields[integer.intValue()].getAsLong(j);
	//    7   15:aload_0         
	//    8   16:getfield        #123 <Field TIFFField[] fields>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #235 <Method int Integer.intValue()>
	//   11   23:aaload          
	//   12   24:iload_2         
	//   13   25:invokevirtual   #268 <Method long TIFFField.getAsLong(int)>
	//   14   28:lreturn         
	}

	public TIFFField[] getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field TIFFField[] fields>
	//    2    4:areturn         
	}

	public long getIFDOffset()
	{
		return IFDOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field long IFDOffset>
	//    2    4:lreturn         
	}

	public long getNextIFDOffset()
	{
		return nextIFDOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long nextIFDOffset>
	//    2    4:lreturn         
	}

	public int getNumEntries()
	{
		return numEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int numEntries>
	//    2    4:ireturn         
	}

	public int[] getTags()
	{
		int ai[] = new int[fieldIndex.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:invokevirtual   #276 <Method int Hashtable.size()>
	//    3    7:newarray        int[]
	//    4    9:astore_2        
		Enumeration enumeration = fieldIndex.keys();
	//    5   10:aload_0         
	//    6   11:getfield        #36  <Field Hashtable fieldIndex>
	//    7   14:invokevirtual   #280 <Method Enumeration Hashtable.keys()>
	//    8   17:astore_3        
		for(int i = 0; enumeration.hasMoreElements(); i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_1        
	//*  11   20:aload_3         
	//*  12   21:invokeinterface #286 <Method boolean Enumeration.hasMoreElements()>
	//*  13   26:ifeq            51
			ai[i] = ((Integer)enumeration.nextElement()).intValue();
	//   14   29:aload_2         
	//   15   30:iload_1         
	//   16   31:aload_3         
	//   17   32:invokeinterface #290 <Method Object Enumeration.nextElement()>
	//   18   37:checkcast       #125 <Class Integer>
	//   19   40:invokevirtual   #235 <Method int Integer.intValue()>
	//   20   43:iastore         

	//   21   44:iload_1         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_1        
	//*  25   48:goto            20
		return ai;
	//   26   51:aload_2         
	//   27   52:areturn         
	}

	public boolean isBigEndian()
	{
		return isBigEndian;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean isBigEndian>
	//    2    4:ireturn         
	}

	public boolean isTagPresent(int i)
	{
		return fieldIndex.containsKey(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Hashtable fieldIndex>
	//    2    4:iload_1         
	//    3    5:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #294 <Method boolean Hashtable.containsKey(Object)>
	//    5   11:ireturn         
	}

	private static final long serialVersionUID = 0x2ef4938cL;
	private static final int sizeOfType[] = {
		0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
		8, 4, 8
	};
	long IFDOffset;
	Hashtable fieldIndex;
	TIFFField fields[];
	boolean isBigEndian;
	long nextIFDOffset;
	int numEntries;

	static 
	{
	//    0    0:bipush          13
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_1        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_1        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_2        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_4        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:bipush          8
	//   25   28:iastore         
	//   26   29:dup             
	//   27   30:bipush          6
	//   28   32:iconst_1        
	//   29   33:iastore         
	//   30   34:dup             
	//   31   35:bipush          7
	//   32   37:iconst_1        
	//   33   38:iastore         
	//   34   39:dup             
	//   35   40:bipush          8
	//   36   42:iconst_2        
	//   37   43:iastore         
	//   38   44:dup             
	//   39   45:bipush          9
	//   40   47:iconst_4        
	//   41   48:iastore         
	//   42   49:dup             
	//   43   50:bipush          10
	//   44   52:bipush          8
	//   45   54:iastore         
	//   46   55:dup             
	//   47   56:bipush          11
	//   48   58:iconst_4        
	//   49   59:iastore         
	//   50   60:dup             
	//   51   61:bipush          12
	//   52   63:bipush          8
	//   53   65:iastore         
	//   54   66:putstatic       #27  <Field int[] sizeOfType>
	//*  55   69:return          
	}
}
