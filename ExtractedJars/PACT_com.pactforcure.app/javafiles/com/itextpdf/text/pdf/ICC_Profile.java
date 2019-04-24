// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;
import java.util.HashMap;

public class ICC_Profile
{

	protected ICC_Profile()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:return          
	}

	public static ICC_Profile GetInstance(String s)
	{
		Object obj;
		Object obj1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		s = ((String) (new FileInputStream(s)));
	//    4    4:new             #88  <Class FileInputStream>
	//    5    7:dup             
	//    6    8:aload_0         
	//    7    9:invokespecial   #91  <Method void FileInputStream(String)>
	//    8   12:astore_0        
		obj = ((Object) (getInstance(((InputStream) (s)))));
	//    9   13:aload_0         
	//   10   14:invokestatic    #95  <Method ICC_Profile getInstance(InputStream)>
	//   11   17:astore_1        
		try
		{
			((FileInputStream) (s)).close();
	//   12   18:aload_0         
	//   13   19:invokevirtual   #98  <Method void FileInputStream.close()>
		}
	//*  14   22:aload_1         
	//*  15   23:areturn         
	//*  16   24:astore_0        
	//*  17   25:aload_2         
	//*  18   26:astore_1        
	//*  19   27:new             #100 <Class ExceptionConverter>
	//*  20   30:dup             
	//*  21   31:aload_0         
	//*  22   32:invokespecial   #103 <Method void ExceptionConverter(Exception)>
	//*  23   35:athrow          
	//*  24   36:astore_0        
	//*  25   37:aload_1         
	//*  26   38:invokevirtual   #98  <Method void FileInputStream.close()>
	//*  27   41:aload_0         
	//*  28   42:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   43:astore_0        
		{
			return ((ICC_Profile) (obj));
	//   30   44:aload_1         
	//   31   45:areturn         
		}
		return ((ICC_Profile) (obj));
		s;
		obj = ((Object) (obj1));
_L4:
		throw new ExceptionConverter(((Exception) (s)));
		s;
_L2:
		try
		{
			((FileInputStream) (obj)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   32   46:astore_1        
		throw s;
	//*  33   47:goto            41
		Object obj2;
		obj2;
	//   34   50:astore_2        
		obj = ((Object) (s));
	//   35   51:aload_0         
	//   36   52:astore_1        
		s = ((String) (obj2));
	//   37   53:aload_2         
	//   38   54:astore_0        
		if(true) goto _L2; else goto _L1
	//   39   55:goto            37
_L1:
		obj2;
	//   40   58:astore_2        
		obj = ((Object) (s));
	//   41   59:aload_0         
	//   42   60:astore_1        
		s = ((String) (obj2));
	//   43   61:aload_2         
	//   44   62:astore_0        
		if(true) goto _L4; else goto _L3
	//   45   63:goto            27
_L3:
	}

	public static ICC_Profile getInstance(InputStream inputstream)
	{
		int i;
		int j;
		int k;
		byte abyte0[];
		try
		{
			abyte0 = new byte[128];
	//    0    0:sipush          128
	//    1    3:newarray        byte[]
	//    2    5:astore          4
			j = abyte0.length;
	//    3    7:aload           4
	//    4    9:arraylength     
	//    5   10:istore_2        
		}
	//*   6   11:iconst_0        
	//*   7   12:istore_1        
	//*   8   13:iload_2         
	//*   9   14:ifle            68
	//*  10   17:aload_0         
	//*  11   18:aload           4
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:invokevirtual   #109 <Method int InputStream.read(byte[], int, int)>
	//*  15   25:istore_3        
	//*  16   26:iload_3         
	//*  17   27:ifge            57
	//*  18   30:new             #111 <Class IllegalArgumentException>
	//*  19   33:dup             
	//*  20   34:ldc1            #113 <String "invalid.icc.profile">
	//*  21   36:iconst_0        
	//*  22   37:anewarray       Object[]
	//*  23   40:invokestatic    #119 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  24   43:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//*  25   46:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  26   47:astore_0        
		{
			throw new ExceptionConverter(((Exception) (inputstream)));
	//   27   48:new             #100 <Class ExceptionConverter>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:invokespecial   #103 <Method void ExceptionConverter(Exception)>
	//   31   56:athrow          
		}
		i = 0;
_L2:
		if(j <= 0)
			break; /* Loop/switch isn't completed */
		k = inputstream.read(abyte0, i, j);
		if(k >= 0)
			break MISSING_BLOCK_LABEL_57;
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.icc.profile", new Object[0]));
		j -= k;
	//   32   57:iload_2         
	//   33   58:iload_3         
	//   34   59:isub            
	//   35   60:istore_2        
		i += k;
	//   36   61:iload_1         
	//   37   62:iload_3         
	//   38   63:iadd            
	//   39   64:istore_1        
		if(true) goto _L2; else goto _L1
	//   40   65:goto            13
_L1:
		if(abyte0[36] == 97 && abyte0[37] == 99 && abyte0[38] == 115 && abyte0[39] == 112)
			break MISSING_BLOCK_LABEL_125;
	//   41   68:aload           4
	//   42   70:bipush          36
	//   43   72:baload          
	//   44   73:bipush          97
	//   45   75:icmpne          108
	//   46   78:aload           4
	//   47   80:bipush          37
	//   48   82:baload          
	//   49   83:bipush          99
	//   50   85:icmpne          108
	//   51   88:aload           4
	//   52   90:bipush          38
	//   53   92:baload          
	//   54   93:bipush          115
	//   55   95:icmpne          108
	//   56   98:aload           4
	//   57  100:bipush          39
	//   58  102:baload          
	//   59  103:bipush          112
	//   60  105:icmpeq          125
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.icc.profile", new Object[0]));
	//   61  108:new             #111 <Class IllegalArgumentException>
	//   62  111:dup             
	//   63  112:ldc1            #113 <String "invalid.icc.profile">
	//   64  114:iconst_0        
	//   65  115:anewarray       Object[]
	//   66  118:invokestatic    #119 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   67  121:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   68  124:athrow          
		i = (abyte0[0] & 0xff) << 24 | (abyte0[1] & 0xff) << 16 | (abyte0[2] & 0xff) << 8 | abyte0[3] & 0xff;
	//   69  125:aload           4
	//   70  127:iconst_0        
	//   71  128:baload          
	//   72  129:sipush          255
	//   73  132:iand            
	//   74  133:bipush          24
	//   75  135:ishl            
	//   76  136:aload           4
	//   77  138:iconst_1        
	//   78  139:baload          
	//   79  140:sipush          255
	//   80  143:iand            
	//   81  144:bipush          16
	//   82  146:ishl            
	//   83  147:ior             
	//   84  148:aload           4
	//   85  150:iconst_2        
	//   86  151:baload          
	//   87  152:sipush          255
	//   88  155:iand            
	//   89  156:bipush          8
	//   90  158:ishl            
	//   91  159:ior             
	//   92  160:aload           4
	//   93  162:iconst_3        
	//   94  163:baload          
	//   95  164:sipush          255
	//   96  167:iand            
	//   97  168:ior             
	//   98  169:istore_1        
		byte abyte1[];
		abyte1 = new byte[i];
	//   99  170:iload_1         
	//  100  171:newarray        byte[]
	//  101  173:astore          5
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//  102  175:aload           4
	//  103  177:iconst_0        
	//  104  178:aload           5
	//  105  180:iconst_0        
	//  106  181:aload           4
	//  107  183:arraylength     
	//  108  184:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		j = i - abyte0.length;
	//  109  187:iload_1         
	//  110  188:aload           4
	//  111  190:arraylength     
	//  112  191:isub            
	//  113  192:istore_2        
		i = abyte0.length;
	//  114  193:aload           4
	//  115  195:arraylength     
	//  116  196:istore_1        
_L4:
		if(j <= 0)
			break MISSING_BLOCK_LABEL_231;
	//  117  197:iload_2         
	//  118  198:ifle            231
		k = inputstream.read(abyte1, i, j);
	//  119  201:aload_0         
	//  120  202:aload           5
	//  121  204:iload_1         
	//  122  205:iload_2         
	//  123  206:invokevirtual   #109 <Method int InputStream.read(byte[], int, int)>
	//  124  209:istore_3        
		if(k >= 0)
			break MISSING_BLOCK_LABEL_239;
	//  125  210:iload_3         
	//  126  211:ifge            239
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.icc.profile", new Object[0]));
	//  127  214:new             #111 <Class IllegalArgumentException>
	//  128  217:dup             
	//  129  218:ldc1            #113 <String "invalid.icc.profile">
	//  130  220:iconst_0        
	//  131  221:anewarray       Object[]
	//  132  224:invokestatic    #119 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  133  227:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//  134  230:athrow          
		inputstream = ((InputStream) (getInstance(abyte1)));
	//  135  231:aload           5
	//  136  233:invokestatic    #129 <Method ICC_Profile getInstance(byte[])>
	//  137  236:astore_0        
		return ((ICC_Profile) (inputstream));
	//  138  237:aload_0         
	//  139  238:areturn         
		j -= k;
	//  140  239:iload_2         
	//  141  240:iload_3         
	//  142  241:isub            
	//  143  242:istore_2        
		i += k;
	//  144  243:iload_1         
	//  145  244:iload_3         
	//  146  245:iadd            
	//  147  246:istore_1        
		if(true) goto _L4; else goto _L3
	//  148  247:goto            197
_L3:
	}

	public static ICC_Profile getInstance(byte abyte0[])
	{
		int i;
		Integer integer;
		try
		{
			integer = (Integer)cstags.get(((Object) (new String(abyte0, 16, 4, "US-ASCII"))));
	//    0    0:getstatic       #20  <Field HashMap cstags>
	//    1    3:new             #133 <Class String>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:bipush          16
	//    5   10:iconst_4        
	//    6   11:ldc1            #135 <String "US-ASCII">
	//    7   13:invokespecial   #138 <Method void String(byte[], int, int, String)>
	//    8   16:invokevirtual   #142 <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #24  <Class Integer>
	//   10   22:astore_2        
		}
	//*  11   23:aload_2         
	//*  12   24:ifnonnull       35
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:aload_0         
	//*  16   30:iload_1         
	//*  17   31:invokestatic    #145 <Method ICC_Profile getInstance(byte[], int)>
	//*  18   34:areturn         
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #149 <Method int Integer.intValue()>
	//*  21   39:istore_1        
	//*  22   40:goto            29
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  23   43:astore_0        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   24   44:new             #100 <Class ExceptionConverter>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #103 <Method void ExceptionConverter(Exception)>
	//   28   52:athrow          
		}
		if(integer != null) goto _L2; else goto _L1
_L1:
		i = 0;
_L4:
		return getInstance(abyte0, i);
_L2:
		i = integer.intValue();
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static ICC_Profile getInstance(byte abyte0[], int i)
	{
		int j;
		ICC_Profile icc_profile;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(abyte0.length < 128 || abyte0[36] != 97 || abyte0[37] != 99 || abyte0[38] != 115 || abyte0[39] != 112)
	//*   2    2:aload_0         
	//*   3    3:arraylength     
	//*   4    4:sipush          128
	//*   5    7:icmplt          46
	//*   6   10:aload_0         
	//*   7   11:bipush          36
	//*   8   13:baload          
	//*   9   14:bipush          97
	//*  10   16:icmpne          46
	//*  11   19:aload_0         
	//*  12   20:bipush          37
	//*  13   22:baload          
	//*  14   23:bipush          99
	//*  15   25:icmpne          46
	//*  16   28:aload_0         
	//*  17   29:bipush          38
	//*  18   31:baload          
	//*  19   32:bipush          115
	//*  20   34:icmpne          46
	//*  21   37:aload_0         
	//*  22   38:bipush          39
	//*  23   40:baload          
	//*  24   41:bipush          112
	//*  25   43:icmpeq          63
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.icc.profile", new Object[0]));
	//   26   46:new             #111 <Class IllegalArgumentException>
	//   27   49:dup             
	//   28   50:ldc1            #113 <String "invalid.icc.profile">
	//   29   52:iconst_0        
	//   30   53:anewarray       Object[]
	//   31   56:invokestatic    #119 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   32   59:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   33   62:athrow          
		try
		{
			icc_profile = new ICC_Profile();
	//   34   63:new             #2   <Class ICC_Profile>
	//   35   66:dup             
	//   36   67:invokespecial   #150 <Method void ICC_Profile()>
	//   37   70:astore_3        
			icc_profile.data = abyte0;
	//   38   71:aload_3         
	//   39   72:aload_0         
	//   40   73:putfield        #152 <Field byte[] data>
			abyte0 = ((byte []) ((Integer)cstags.get(((Object) (new String(abyte0, 16, 4, "US-ASCII"))))));
	//   41   76:getstatic       #20  <Field HashMap cstags>
	//   42   79:new             #133 <Class String>
	//   43   82:dup             
	//   44   83:aload_0         
	//   45   84:bipush          16
	//   46   86:iconst_4        
	//   47   87:ldc1            #135 <String "US-ASCII">
	//   48   89:invokespecial   #138 <Method void String(byte[], int, int, String)>
	//   49   92:invokevirtual   #142 <Method Object HashMap.get(Object)>
	//   50   95:checkcast       #24  <Class Integer>
	//   51   98:astore_0        
		}
	//*  52   99:aload_0         
	//*  53  100:ifnonnull       164
	//*  54  103:aload_3         
	//*  55  104:iload_2         
	//*  56  105:putfield        #154 <Field int numComponents>
	//*  57  108:iload_2         
	//*  58  109:iload_1         
	//*  59  110:icmpeq          172
	//*  60  113:new             #111 <Class IllegalArgumentException>
	//*  61  116:dup             
	//*  62  117:new             #156 <Class StringBuilder>
	//*  63  120:dup             
	//*  64  121:invokespecial   #157 <Method void StringBuilder()>
	//*  65  124:ldc1            #159 <String "ICC profile contains ">
	//*  66  126:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  67  129:iload_2         
	//*  68  130:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//*  69  133:ldc1            #168 <String " component(s), the image data contains ">
	//*  70  135:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  71  138:iload_1         
	//*  72  139:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//*  73  142:ldc1            #170 <String " component(s)">
	//*  74  144:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  75  147:invokevirtual   #174 <Method String StringBuilder.toString()>
	//*  76  150:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//*  77  153:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  78  154:astore_0        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   79  155:new             #100 <Class ExceptionConverter>
	//   80  158:dup             
	//   81  159:aload_0         
	//   82  160:invokespecial   #103 <Method void ExceptionConverter(Exception)>
	//   83  163:athrow          
		}
		if(abyte0 != null) goto _L2; else goto _L1
_L1:
		icc_profile.numComponents = j;
		if(j == i)
			break; /* Loop/switch isn't completed */
		throw new IllegalArgumentException((new StringBuilder()).append("ICC profile contains ").append(j).append(" component(s), the image data contains ").append(i).append(" component(s)").toString());
_L2:
		j = ((Integer) (abyte0)).intValue();
	//   84  164:aload_0         
	//   85  165:invokevirtual   #149 <Method int Integer.intValue()>
	//   86  168:istore_2        
		if(true) goto _L1; else goto _L3
	//   87  169:goto            103
_L3:
		return icc_profile;
	//   88  172:aload_3         
	//   89  173:areturn         
	}

	public byte[] getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field byte[] data>
	//    2    4:areturn         
	}

	public int getNumComponents()
	{
		return numComponents;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field int numComponents>
	//    2    4:ireturn         
	}

	private static HashMap cstags;
	protected byte data[];
	protected int numComponents;

	static 
	{
		cstags = new HashMap();
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field HashMap cstags>
		cstags.put("XYZ ", ((Object) (Integer.valueOf(3))));
	//    4   10:getstatic       #20  <Field HashMap cstags>
	//    5   13:ldc1            #22  <String "XYZ ">
	//    6   15:iconst_3        
	//    7   16:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//    9   22:pop             
		cstags.put("Lab ", ((Object) (Integer.valueOf(3))));
	//   10   23:getstatic       #20  <Field HashMap cstags>
	//   11   26:ldc1            #34  <String "Lab ">
	//   12   28:iconst_3        
	//   13   29:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   15   35:pop             
		cstags.put("Luv ", ((Object) (Integer.valueOf(3))));
	//   16   36:getstatic       #20  <Field HashMap cstags>
	//   17   39:ldc1            #36  <String "Luv ">
	//   18   41:iconst_3        
	//   19   42:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   21   48:pop             
		cstags.put("YCbr", ((Object) (Integer.valueOf(3))));
	//   22   49:getstatic       #20  <Field HashMap cstags>
	//   23   52:ldc1            #38  <String "YCbr">
	//   24   54:iconst_3        
	//   25   55:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   27   61:pop             
		cstags.put("Yxy ", ((Object) (Integer.valueOf(3))));
	//   28   62:getstatic       #20  <Field HashMap cstags>
	//   29   65:ldc1            #40  <String "Yxy ">
	//   30   67:iconst_3        
	//   31   68:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   33   74:pop             
		cstags.put("RGB ", ((Object) (Integer.valueOf(3))));
	//   34   75:getstatic       #20  <Field HashMap cstags>
	//   35   78:ldc1            #42  <String "RGB ">
	//   36   80:iconst_3        
	//   37   81:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   39   87:pop             
		cstags.put("GRAY", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #20  <Field HashMap cstags>
	//   41   91:ldc1            #44  <String "GRAY">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   45  100:pop             
		cstags.put("HSV ", ((Object) (Integer.valueOf(3))));
	//   46  101:getstatic       #20  <Field HashMap cstags>
	//   47  104:ldc1            #46  <String "HSV ">
	//   48  106:iconst_3        
	//   49  107:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   51  113:pop             
		cstags.put("HLS ", ((Object) (Integer.valueOf(3))));
	//   52  114:getstatic       #20  <Field HashMap cstags>
	//   53  117:ldc1            #48  <String "HLS ">
	//   54  119:iconst_3        
	//   55  120:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   57  126:pop             
		cstags.put("CMYK", ((Object) (Integer.valueOf(4))));
	//   58  127:getstatic       #20  <Field HashMap cstags>
	//   59  130:ldc1            #50  <String "CMYK">
	//   60  132:iconst_4        
	//   61  133:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   63  139:pop             
		cstags.put("CMY ", ((Object) (Integer.valueOf(3))));
	//   64  140:getstatic       #20  <Field HashMap cstags>
	//   65  143:ldc1            #52  <String "CMY ">
	//   66  145:iconst_3        
	//   67  146:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   69  152:pop             
		cstags.put("2CLR", ((Object) (Integer.valueOf(2))));
	//   70  153:getstatic       #20  <Field HashMap cstags>
	//   71  156:ldc1            #54  <String "2CLR">
	//   72  158:iconst_2        
	//   73  159:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   75  165:pop             
		cstags.put("3CLR", ((Object) (Integer.valueOf(3))));
	//   76  166:getstatic       #20  <Field HashMap cstags>
	//   77  169:ldc1            #56  <String "3CLR">
	//   78  171:iconst_3        
	//   79  172:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   81  178:pop             
		cstags.put("4CLR", ((Object) (Integer.valueOf(4))));
	//   82  179:getstatic       #20  <Field HashMap cstags>
	//   83  182:ldc1            #58  <String "4CLR">
	//   84  184:iconst_4        
	//   85  185:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   87  191:pop             
		cstags.put("5CLR", ((Object) (Integer.valueOf(5))));
	//   88  192:getstatic       #20  <Field HashMap cstags>
	//   89  195:ldc1            #60  <String "5CLR">
	//   90  197:iconst_5        
	//   91  198:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   93  204:pop             
		cstags.put("6CLR", ((Object) (Integer.valueOf(6))));
	//   94  205:getstatic       #20  <Field HashMap cstags>
	//   95  208:ldc1            #62  <String "6CLR">
	//   96  210:bipush          6
	//   97  212:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   98  215:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//   99  218:pop             
		cstags.put("7CLR", ((Object) (Integer.valueOf(7))));
	//  100  219:getstatic       #20  <Field HashMap cstags>
	//  101  222:ldc1            #64  <String "7CLR">
	//  102  224:bipush          7
	//  103  226:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  104  229:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  105  232:pop             
		cstags.put("8CLR", ((Object) (Integer.valueOf(8))));
	//  106  233:getstatic       #20  <Field HashMap cstags>
	//  107  236:ldc1            #66  <String "8CLR">
	//  108  238:bipush          8
	//  109  240:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  110  243:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  111  246:pop             
		cstags.put("9CLR", ((Object) (Integer.valueOf(9))));
	//  112  247:getstatic       #20  <Field HashMap cstags>
	//  113  250:ldc1            #68  <String "9CLR">
	//  114  252:bipush          9
	//  115  254:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  116  257:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  117  260:pop             
		cstags.put("ACLR", ((Object) (Integer.valueOf(10))));
	//  118  261:getstatic       #20  <Field HashMap cstags>
	//  119  264:ldc1            #70  <String "ACLR">
	//  120  266:bipush          10
	//  121  268:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  122  271:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  123  274:pop             
		cstags.put("BCLR", ((Object) (Integer.valueOf(11))));
	//  124  275:getstatic       #20  <Field HashMap cstags>
	//  125  278:ldc1            #72  <String "BCLR">
	//  126  280:bipush          11
	//  127  282:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  128  285:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  129  288:pop             
		cstags.put("CCLR", ((Object) (Integer.valueOf(12))));
	//  130  289:getstatic       #20  <Field HashMap cstags>
	//  131  292:ldc1            #74  <String "CCLR">
	//  132  294:bipush          12
	//  133  296:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  134  299:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  135  302:pop             
		cstags.put("DCLR", ((Object) (Integer.valueOf(13))));
	//  136  303:getstatic       #20  <Field HashMap cstags>
	//  137  306:ldc1            #76  <String "DCLR">
	//  138  308:bipush          13
	//  139  310:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  140  313:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  141  316:pop             
		cstags.put("ECLR", ((Object) (Integer.valueOf(14))));
	//  142  317:getstatic       #20  <Field HashMap cstags>
	//  143  320:ldc1            #78  <String "ECLR">
	//  144  322:bipush          14
	//  145  324:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  146  327:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  147  330:pop             
		cstags.put("FCLR", ((Object) (Integer.valueOf(15))));
	//  148  331:getstatic       #20  <Field HashMap cstags>
	//  149  334:ldc1            #80  <String "FCLR">
	//  150  336:bipush          15
	//  151  338:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  152  341:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//  153  344:pop             
	//* 154  345:return          
	}
}
