// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.lang.reflect.Array;

// Referenced classes of package cn.com.fmsh.util.algorithm:
//			DES

public class MAC
{

	public MAC()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] MAC4DESNoPadding(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		if(abyte2 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       21
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/MAC)).getName(), "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull");
	//    2    4:getstatic       #20  <Field FMLog log>
	//    3    7:ldc1            #2   <Class MAC>
	//    4    9:invokevirtual   #32  <Method String Class.getName()>
	//    5   12:ldc1            #34  <String "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull">
	//    6   14:invokeinterface #40  <Method void FMLog.error(String, String)>
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
		}
		if(abyte2.length % 8 != 0)
	//*   9   21:aload_2         
	//*  10   22:arraylength     
	//*  11   23:bipush          8
	//*  12   25:irem            
	//*  13   26:ifeq            46
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/MAC)).getName(), "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u957F\u5EA6\u4E0D\u662F8\u7684\u500D\u6570");
	//   14   29:getstatic       #20  <Field FMLog log>
	//   15   32:ldc1            #2   <Class MAC>
	//   16   34:invokevirtual   #32  <Method String Class.getName()>
	//   17   37:ldc1            #42  <String "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u957F\u5EA6\u4E0D\u662F8\u7684\u500D\u6570">
	//   18   39:invokeinterface #40  <Method void FMLog.error(String, String)>
			return null;
	//   19   44:aconst_null     
	//   20   45:areturn         
		}
		byte abyte3[] = abyte1;
	//   21   46:aload_1         
	//   22   47:astore          6
		if(abyte1 == null)
	//*  23   49:aload_1         
	//*  24   50:ifnonnull       59
			abyte3 = new byte[8];
	//   25   53:bipush          8
	//   26   55:newarray        byte[]
	//   27   57:astore          6
		int l = abyte2.length / 8;
	//   28   59:aload_2         
	//   29   60:arraylength     
	//   30   61:bipush          8
	//   31   63:idiv            
	//   32   64:istore          5
		byte abyte4[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
			l, 8
		});
	//   33   66:getstatic       #48  <Field Class Byte.TYPE>
	//   34   69:iconst_2        
	//   35   70:newarray        int[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:iload           5
	//   39   76:iastore         
	//   40   77:dup             
	//   41   78:iconst_1        
	//   42   79:bipush          8
	//   43   81:iastore         
	//   44   82:invokestatic    #54  <Method Object Array.newInstance(Class, int[])>
	//   45   85:checkcast       #56  <Class byte[][]>
	//   46   88:astore          7
		for(int i = 0; i < l; i++)
	//*  47   90:iconst_0        
	//*  48   91:istore_3        
	//*  49   92:goto            134
		{
			for(int k = 0; k < 8; k++)
	//*  50   95:iconst_0        
	//*  51   96:istore          4
	//*  52   98:goto            123
				abyte4[i][k] = abyte2[i * 8 + k];
	//   53  101:aload           7
	//   54  103:iload_3         
	//   55  104:aaload          
	//   56  105:iload           4
	//   57  107:aload_2         
	//   58  108:iload_3         
	//   59  109:bipush          8
	//   60  111:imul            
	//   61  112:iload           4
	//   62  114:iadd            
	//   63  115:baload          
	//   64  116:bastore         

	//   65  117:iload           4
	//   66  119:iconst_1        
	//   67  120:iadd            
	//   68  121:istore          4
	//   69  123:iload           4
	//   70  125:bipush          8
	//   71  127:icmplt          101
		}

	//   72  130:iload_3         
	//   73  131:iconst_1        
	//   74  132:iadd            
	//   75  133:istore_3        
	//   76  134:iload_3         
	//   77  135:iload           5
	//   78  137:icmplt          95
		abyte1 = FM_Bytes.xor(abyte3, abyte4[0]);
	//   79  140:aload           6
	//   80  142:aload           7
	//   81  144:iconst_0        
	//   82  145:aaload          
	//   83  146:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   84  149:astore_1        
		for(int j = 1; j < l; j++)
	//*  85  150:iconst_1        
	//*  86  151:istore_3        
	//*  87  152:goto            172
			abyte1 = FM_Bytes.xor(DES.encrypt4des(abyte0, abyte1), abyte4[j]);
	//   88  155:aload_0         
	//   89  156:aload_1         
	//   90  157:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//   91  160:aload           7
	//   92  162:iload_3         
	//   93  163:aaload          
	//   94  164:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   95  167:astore_1        

	//   96  168:iload_3         
	//   97  169:iconst_1        
	//   98  170:iadd            
	//   99  171:istore_3        
	//  100  172:iload_3         
	//  101  173:iload           5
	//  102  175:icmplt          155
		return DES.encrypt4des(abyte0, abyte1);
	//  103  178:aload_0         
	//  104  179:aload_1         
	//  105  180:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//  106  183:areturn         
	}

	public static byte[] calculateMAC4DES(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		byte abyte4[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore          7
		abyte4[0] = -128;
	//    3    6:aload           7
	//    4    8:iconst_0        
	//    5    9:bipush          -128
	//    6   11:bastore         
		if(abyte2 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       31
			log.error(((Class) (cn/com/fmsh/util/algorithm/MAC)).getName(), "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull");
	//    9   16:getstatic       #20  <Field FMLog log>
	//   10   19:ldc1            #2   <Class MAC>
	//   11   21:invokevirtual   #32  <Method String Class.getName()>
	//   12   24:ldc1            #34  <String "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull">
	//   13   26:invokeinterface #40  <Method void FMLog.error(String, String)>
		byte abyte3[] = abyte1;
	//   14   31:aload_1         
	//   15   32:astore          6
		if(abyte1 == null)
	//*  16   34:aload_1         
	//*  17   35:ifnonnull       44
			abyte3 = new byte[8];
	//   18   38:bipush          8
	//   19   40:newarray        byte[]
	//   20   42:astore          6
		int i;
		if(abyte2.length % 8 != 0)
	//*  21   44:aload_2         
	//*  22   45:arraylength     
	//*  23   46:bipush          8
	//*  24   48:irem            
	//*  25   49:ifeq            64
			i = 8 - abyte2.length % 8;
	//   26   52:bipush          8
	//   27   54:aload_2         
	//   28   55:arraylength     
	//   29   56:bipush          8
	//   30   58:irem            
	//   31   59:isub            
	//   32   60:istore_3        
		else
	//*  33   61:goto            67
			i = 8;
	//   34   64:bipush          8
	//   35   66:istore_3        
		abyte1 = FM_Bytes.join(abyte2, FM_Bytes.copyOf(abyte4, i));
	//   36   67:aload_2         
	//   37   68:aload           7
	//   38   70:iload_3         
	//   39   71:invokestatic    #72  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   40   74:invokestatic    #75  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   41   77:astore_1        
		int i1 = abyte1.length / 8;
	//   42   78:aload_1         
	//   43   79:arraylength     
	//   44   80:bipush          8
	//   45   82:idiv            
	//   46   83:istore          5
		abyte2 = ((byte []) ((byte[][])Array.newInstance(Byte.TYPE, new int[] {
			i1, 8
		})));
	//   47   85:getstatic       #48  <Field Class Byte.TYPE>
	//   48   88:iconst_2        
	//   49   89:newarray        int[]
	//   50   91:dup             
	//   51   92:iconst_0        
	//   52   93:iload           5
	//   53   95:iastore         
	//   54   96:dup             
	//   55   97:iconst_1        
	//   56   98:bipush          8
	//   57  100:iastore         
	//   58  101:invokestatic    #54  <Method Object Array.newInstance(Class, int[])>
	//   59  104:checkcast       #56  <Class byte[][]>
	//   60  107:astore_2        
		for(int j = 0; j < i1; j++)
	//*  61  108:iconst_0        
	//*  62  109:istore_3        
	//*  63  110:goto            151
		{
			for(int l = 0; l < 8; l++)
	//*  64  113:iconst_0        
	//*  65  114:istore          4
	//*  66  116:goto            140
				abyte2[j][l] = abyte1[j * 8 + l];
	//   67  119:aload_2         
	//   68  120:iload_3         
	//   69  121:aaload          
	//   70  122:iload           4
	//   71  124:aload_1         
	//   72  125:iload_3         
	//   73  126:bipush          8
	//   74  128:imul            
	//   75  129:iload           4
	//   76  131:iadd            
	//   77  132:baload          
	//   78  133:bastore         

	//   79  134:iload           4
	//   80  136:iconst_1        
	//   81  137:iadd            
	//   82  138:istore          4
	//   83  140:iload           4
	//   84  142:bipush          8
	//   85  144:icmplt          119
		}

	//   86  147:iload_3         
	//   87  148:iconst_1        
	//   88  149:iadd            
	//   89  150:istore_3        
	//   90  151:iload_3         
	//   91  152:iload           5
	//   92  154:icmplt          113
		abyte1 = FM_Bytes.xor(abyte3, ((byte []) (abyte2[0])));
	//   93  157:aload           6
	//   94  159:aload_2         
	//   95  160:iconst_0        
	//   96  161:aaload          
	//   97  162:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   98  165:astore_1        
		for(int k = 1; k < i1; k++)
	//*  99  166:iconst_1        
	//* 100  167:istore_3        
	//* 101  168:goto            187
			abyte1 = FM_Bytes.xor(DES.encrypt4des(abyte0, abyte1), ((byte []) (abyte2[k])));
	//  102  171:aload_0         
	//  103  172:aload_1         
	//  104  173:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//  105  176:aload_2         
	//  106  177:iload_3         
	//  107  178:aaload          
	//  108  179:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//  109  182:astore_1        

	//  110  183:iload_3         
	//  111  184:iconst_1        
	//  112  185:iadd            
	//  113  186:istore_3        
	//  114  187:iload_3         
	//  115  188:iload           5
	//  116  190:icmplt          171
		return DES.encrypt4des(abyte0, abyte1);
	//  117  193:aload_0         
	//  118  194:aload_1         
	//  119  195:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//  120  198:areturn         
	}

	public static byte[] calculateMAC4DES3(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		byte abyte4[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore          7
		abyte4[0] = -128;
	//    3    6:aload           7
	//    4    8:iconst_0        
	//    5    9:bipush          -128
	//    6   11:bastore         
		if(abyte2 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       31
			log.error(((Class) (cn/com/fmsh/util/algorithm/MAC)).getName(), "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull");
	//    9   16:getstatic       #20  <Field FMLog log>
	//   10   19:ldc1            #2   <Class MAC>
	//   11   21:invokevirtual   #32  <Method String Class.getName()>
	//   12   24:ldc1            #34  <String "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull">
	//   13   26:invokeinterface #40  <Method void FMLog.error(String, String)>
		byte abyte3[] = abyte1;
	//   14   31:aload_1         
	//   15   32:astore          6
		if(abyte1 == null)
	//*  16   34:aload_1         
	//*  17   35:ifnonnull       44
			abyte3 = new byte[8];
	//   18   38:bipush          8
	//   19   40:newarray        byte[]
	//   20   42:astore          6
		int i;
		if(abyte2.length % 8 != 0)
	//*  21   44:aload_2         
	//*  22   45:arraylength     
	//*  23   46:bipush          8
	//*  24   48:irem            
	//*  25   49:ifeq            64
			i = 8 - abyte2.length % 8;
	//   26   52:bipush          8
	//   27   54:aload_2         
	//   28   55:arraylength     
	//   29   56:bipush          8
	//   30   58:irem            
	//   31   59:isub            
	//   32   60:istore_3        
		else
	//*  33   61:goto            67
			i = 8;
	//   34   64:bipush          8
	//   35   66:istore_3        
		abyte1 = FM_Bytes.join(abyte2, FM_Bytes.copyOf(abyte4, i));
	//   36   67:aload_2         
	//   37   68:aload           7
	//   38   70:iload_3         
	//   39   71:invokestatic    #72  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   40   74:invokestatic    #75  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   41   77:astore_1        
		int i1 = abyte1.length / 8;
	//   42   78:aload_1         
	//   43   79:arraylength     
	//   44   80:bipush          8
	//   45   82:idiv            
	//   46   83:istore          5
		abyte2 = ((byte []) ((byte[][])Array.newInstance(Byte.TYPE, new int[] {
			i1, 8
		})));
	//   47   85:getstatic       #48  <Field Class Byte.TYPE>
	//   48   88:iconst_2        
	//   49   89:newarray        int[]
	//   50   91:dup             
	//   51   92:iconst_0        
	//   52   93:iload           5
	//   53   95:iastore         
	//   54   96:dup             
	//   55   97:iconst_1        
	//   56   98:bipush          8
	//   57  100:iastore         
	//   58  101:invokestatic    #54  <Method Object Array.newInstance(Class, int[])>
	//   59  104:checkcast       #56  <Class byte[][]>
	//   60  107:astore_2        
		for(int j = 0; j < i1; j++)
	//*  61  108:iconst_0        
	//*  62  109:istore_3        
	//*  63  110:goto            151
		{
			for(int l = 0; l < 8; l++)
	//*  64  113:iconst_0        
	//*  65  114:istore          4
	//*  66  116:goto            140
				abyte2[j][l] = abyte1[j * 8 + l];
	//   67  119:aload_2         
	//   68  120:iload_3         
	//   69  121:aaload          
	//   70  122:iload           4
	//   71  124:aload_1         
	//   72  125:iload_3         
	//   73  126:bipush          8
	//   74  128:imul            
	//   75  129:iload           4
	//   76  131:iadd            
	//   77  132:baload          
	//   78  133:bastore         

	//   79  134:iload           4
	//   80  136:iconst_1        
	//   81  137:iadd            
	//   82  138:istore          4
	//   83  140:iload           4
	//   84  142:bipush          8
	//   85  144:icmplt          119
		}

	//   86  147:iload_3         
	//   87  148:iconst_1        
	//   88  149:iadd            
	//   89  150:istore_3        
	//   90  151:iload_3         
	//   91  152:iload           5
	//   92  154:icmplt          113
		abyte1 = FM_Bytes.xor(abyte3, ((byte []) (abyte2[0])));
	//   93  157:aload           6
	//   94  159:aload_2         
	//   95  160:iconst_0        
	//   96  161:aaload          
	//   97  162:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   98  165:astore_1        
		for(int k = 1; k < i1; k++)
	//*  99  166:iconst_1        
	//* 100  167:istore_3        
	//* 101  168:goto            187
			abyte1 = FM_Bytes.xor(DES.encrypt4des(abyte0, abyte1), ((byte []) (abyte2[k])));
	//  102  171:aload_0         
	//  103  172:aload_1         
	//  104  173:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//  105  176:aload_2         
	//  106  177:iload_3         
	//  107  178:aaload          
	//  108  179:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//  109  182:astore_1        

	//  110  183:iload_3         
	//  111  184:iconst_1        
	//  112  185:iadd            
	//  113  186:istore_3        
	//  114  187:iload_3         
	//  115  188:iload           5
	//  116  190:icmplt          171
		return DES.encrypt4des3(abyte0, abyte1);
	//  117  193:aload_0         
	//  118  194:aload_1         
	//  119  195:invokestatic    #79  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//  120  198:areturn         
	}

	public static byte[] calculateMAC4DES3AN919(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		byte abyte4[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore          7
		if(abyte2 == null)
	//*   3    6:aload_2         
	//*   4    7:ifnonnull       25
			log.error(((Class) (cn/com/fmsh/util/algorithm/MAC)).getName(), "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull");
	//    5   10:getstatic       #20  <Field FMLog log>
	//    6   13:ldc1            #2   <Class MAC>
	//    7   15:invokevirtual   #32  <Method String Class.getName()>
	//    8   18:ldc1            #34  <String "MAC\u8BA1\u7B97\u65F6\uFF0C\u6570\u636E\u4E3Anull">
	//    9   20:invokeinterface #40  <Method void FMLog.error(String, String)>
		byte abyte3[] = abyte1;
	//   10   25:aload_1         
	//   11   26:astore          6
		if(abyte1 == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       38
			abyte3 = new byte[8];
	//   14   32:bipush          8
	//   15   34:newarray        byte[]
	//   16   36:astore          6
		int i;
		if(abyte2.length % 8 != 0)
	//*  17   38:aload_2         
	//*  18   39:arraylength     
	//*  19   40:bipush          8
	//*  20   42:irem            
	//*  21   43:ifeq            58
			i = 8 - abyte2.length % 8;
	//   22   46:bipush          8
	//   23   48:aload_2         
	//   24   49:arraylength     
	//   25   50:bipush          8
	//   26   52:irem            
	//   27   53:isub            
	//   28   54:istore_3        
		else
	//*  29   55:goto            60
			i = 0;
	//   30   58:iconst_0        
	//   31   59:istore_3        
		abyte1 = FM_Bytes.join(abyte2, FM_Bytes.copyOf(abyte4, i));
	//   32   60:aload_2         
	//   33   61:aload           7
	//   34   63:iload_3         
	//   35   64:invokestatic    #72  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   36   67:invokestatic    #75  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   37   70:astore_1        
		int i1 = abyte1.length / 8;
	//   38   71:aload_1         
	//   39   72:arraylength     
	//   40   73:bipush          8
	//   41   75:idiv            
	//   42   76:istore          5
		abyte2 = ((byte []) ((byte[][])Array.newInstance(Byte.TYPE, new int[] {
			i1, 8
		})));
	//   43   78:getstatic       #48  <Field Class Byte.TYPE>
	//   44   81:iconst_2        
	//   45   82:newarray        int[]
	//   46   84:dup             
	//   47   85:iconst_0        
	//   48   86:iload           5
	//   49   88:iastore         
	//   50   89:dup             
	//   51   90:iconst_1        
	//   52   91:bipush          8
	//   53   93:iastore         
	//   54   94:invokestatic    #54  <Method Object Array.newInstance(Class, int[])>
	//   55   97:checkcast       #56  <Class byte[][]>
	//   56  100:astore_2        
		for(int j = 0; j < i1; j++)
	//*  57  101:iconst_0        
	//*  58  102:istore_3        
	//*  59  103:goto            144
		{
			for(int l = 0; l < 8; l++)
	//*  60  106:iconst_0        
	//*  61  107:istore          4
	//*  62  109:goto            133
				abyte2[j][l] = abyte1[j * 8 + l];
	//   63  112:aload_2         
	//   64  113:iload_3         
	//   65  114:aaload          
	//   66  115:iload           4
	//   67  117:aload_1         
	//   68  118:iload_3         
	//   69  119:bipush          8
	//   70  121:imul            
	//   71  122:iload           4
	//   72  124:iadd            
	//   73  125:baload          
	//   74  126:bastore         

	//   75  127:iload           4
	//   76  129:iconst_1        
	//   77  130:iadd            
	//   78  131:istore          4
	//   79  133:iload           4
	//   80  135:bipush          8
	//   81  137:icmplt          112
		}

	//   82  140:iload_3         
	//   83  141:iconst_1        
	//   84  142:iadd            
	//   85  143:istore_3        
	//   86  144:iload_3         
	//   87  145:iload           5
	//   88  147:icmplt          106
		abyte1 = FM_Bytes.xor(abyte3, ((byte []) (abyte2[0])));
	//   89  150:aload           6
	//   90  152:aload_2         
	//   91  153:iconst_0        
	//   92  154:aaload          
	//   93  155:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   94  158:astore_1        
		for(int k = 1; k < i1; k++)
	//*  95  159:iconst_1        
	//*  96  160:istore_3        
	//*  97  161:goto            180
			abyte1 = FM_Bytes.xor(DES.encrypt4des(abyte0, abyte1), ((byte []) (abyte2[k])));
	//   98  164:aload_0         
	//   99  165:aload_1         
	//  100  166:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//  101  169:aload_2         
	//  102  170:iload_3         
	//  103  171:aaload          
	//  104  172:invokestatic    #62  <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//  105  175:astore_1        

	//  106  176:iload_3         
	//  107  177:iconst_1        
	//  108  178:iadd            
	//  109  179:istore_3        
	//  110  180:iload_3         
	//  111  181:iload           5
	//  112  183:icmplt          164
		return DES.encrypt4des3(abyte0, abyte1);
	//  113  186:aload_0         
	//  114  187:aload_1         
	//  115  188:invokestatic    #79  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//  116  191:areturn         
	}

	public static void main(String args[])
	{
		args = ((String []) (new byte[16]));
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore_0        
		args[1] = -106;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:bipush          -106
	//    6    9:bastore         
		args[2] = 43;
	//    7   10:aload_0         
	//    8   11:iconst_2        
	//    9   12:bipush          43
	//   10   14:bastore         
		args[3] = 96;
	//   11   15:aload_0         
	//   12   16:iconst_3        
	//   13   17:bipush          96
	//   14   19:bastore         
		args[4] = -86;
	//   15   20:aload_0         
	//   16   21:iconst_4        
	//   17   22:bipush          -86
	//   18   24:bastore         
		args[5] = 85;
	//   19   25:aload_0         
	//   20   26:iconst_5        
	//   21   27:bipush          85
	//   22   29:bastore         
		args[6] = 110;
	//   23   30:aload_0         
	//   24   31:bipush          6
	//   25   33:bipush          110
	//   26   35:bastore         
		args[7] = 101;
	//   27   36:aload_0         
	//   28   37:bipush          7
	//   29   39:bipush          101
	//   30   41:bastore         
		args[8] = 80;
	//   31   42:aload_0         
	//   32   43:bipush          8
	//   33   45:bipush          80
	//   34   47:bastore         
		args[9] = -12;
	//   35   48:aload_0         
	//   36   49:bipush          9
	//   37   51:bipush          -12
	//   38   53:bastore         
		args[10] = -105;
	//   39   54:aload_0         
	//   40   55:bipush          10
	//   41   57:bipush          -105
	//   42   59:bastore         
		args[11] = 72;
	//   43   60:aload_0         
	//   44   61:bipush          11
	//   45   63:bipush          72
	//   46   65:bastore         
		args[12] = 84;
	//   47   66:aload_0         
	//   48   67:bipush          12
	//   49   69:bipush          84
	//   50   71:bastore         
		args[13] = 99;
	//   51   72:aload_0         
	//   52   73:bipush          13
	//   53   75:bipush          99
	//   54   77:bastore         
		args[14] = -73;
	//   55   78:aload_0         
	//   56   79:bipush          14
	//   57   81:bipush          -73
	//   58   83:bastore         
		args[15] = 24;
	//   59   84:aload_0         
	//   60   85:bipush          15
	//   61   87:bipush          24
	//   62   89:bastore         
		args = ((String []) (calculateMAC4DES3AN919(FM_Bytes.hexStringToBytes("561F07C68A1C36F504D29C854B4C6B82"), new byte[8], ((byte []) (args)))));
	//   63   90:ldc1            #84  <String "561F07C68A1C36F504D29C854B4C6B82">
	//   64   92:invokestatic    #88  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   65   95:bipush          8
	//   66   97:newarray        byte[]
	//   67   99:aload_0         
	//   68  100:invokestatic    #90  <Method byte[] calculateMAC4DES3AN919(byte[], byte[], byte[])>
	//   69  103:astore_0        
		System.out.println((new StringBuilder("mac:")).append(FM_Bytes.bytesToHexString(((byte []) (args)))).toString());
	//   70  104:getstatic       #96  <Field PrintStream System.out>
	//   71  107:new             #98  <Class StringBuilder>
	//   72  110:dup             
	//   73  111:ldc1            #100 <String "mac:">
	//   74  113:invokespecial   #103 <Method void StringBuilder(String)>
	//   75  116:aload_0         
	//   76  117:invokestatic    #107 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   77  120:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   78  123:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   79  126:invokevirtual   #119 <Method void PrintStream.println(String)>
	//   80  129:return          
	}

	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #14  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #18  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #20  <Field FMLog log>
	//*   3    9:return          
	}
}
