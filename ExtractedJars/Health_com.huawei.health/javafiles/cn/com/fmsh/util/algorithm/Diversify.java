// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.util.algorithm:
//			DES

public class Diversify
{

	public Diversify()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] doubleLength(byte abyte0[], byte abyte1[], int i)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
		{
			log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u662F\uFF0C\u7236\u5BC6\u94A5\u4E3Anull");
	//    2    4:getstatic       #20  <Field FMLog log>
	//    3    7:ldc1            #2   <Class Diversify>
	//    4    9:invokevirtual   #32  <Method String Class.getName()>
	//    5   12:ldc1            #34  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u662F\uFF0C\u7236\u5BC6\u94A5\u4E3Anull">
	//    6   14:invokeinterface #40  <Method void FMLog.warn(String, String)>
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
		}
		if(i == 0)
	//*   9   21:iload_2         
	//*  10   22:ifne            27
			return abyte0;
	//   11   25:aload_0         
	//   12   26:areturn         
		if(i > 0)
	//*  13   27:iload_2         
	//*  14   28:ifle            104
		{
			if(abyte1 == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       52
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u4E3Anull");
	//   17   35:getstatic       #20  <Field FMLog log>
	//   18   38:ldc1            #2   <Class Diversify>
	//   19   40:invokevirtual   #32  <Method String Class.getName()>
	//   20   43:ldc1            #42  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u4E3Anull">
	//   21   45:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   22   50:aconst_null     
	//   23   51:areturn         
			}
			int j = abyte1.length;
	//   24   52:aload_1         
	//   25   53:arraylength     
	//   26   54:istore_3        
			if(j % 8 != 0)
	//*  27   55:iload_3         
	//*  28   56:bipush          8
	//*  29   58:irem            
	//*  30   59:ifeq            79
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   31   62:getstatic       #20  <Field FMLog log>
	//   32   65:ldc1            #2   <Class Diversify>
	//   33   67:invokevirtual   #32  <Method String Class.getName()>
	//   34   70:ldc1            #44  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   35   72:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   36   77:aconst_null     
	//   37   78:areturn         
			}
			if(j / 8 != i)
	//*  38   79:iload_3         
	//*  39   80:bipush          8
	//*  40   82:idiv            
	//*  41   83:iload_2         
	//*  42   84:icmpeq          104
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   43   87:getstatic       #20  <Field FMLog log>
	//   44   90:ldc1            #2   <Class Diversify>
	//   45   92:invokevirtual   #32  <Method String Class.getName()>
	//   46   95:ldc1            #44  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   47   97:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   48  102:aconst_null     
	//   49  103:areturn         
			}
		}
		byte abyte2[] = FM_Bytes.copyOfRange(abyte1, 0, 8);
	//   50  104:aload_1         
	//   51  105:iconst_0        
	//   52  106:bipush          8
	//   53  108:invokestatic    #50  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   54  111:astore          4
		abyte0 = FM_Bytes.join(DES.encrypt4des3(abyte0, abyte2), DES.encrypt4des3(abyte0, FM_Bytes.not(abyte2)));
	//   55  113:aload_0         
	//   56  114:aload           4
	//   57  116:invokestatic    #56  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//   58  119:aload_0         
	//   59  120:aload           4
	//   60  122:invokestatic    #60  <Method byte[] FM_Bytes.not(byte[])>
	//   61  125:invokestatic    #56  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//   62  128:invokestatic    #63  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   63  131:astore_0        
		for(int k = 1; k < i; k++)
	//*  64  132:iconst_1        
	//*  65  133:istore_3        
	//*  66  134:goto            176
		{
			byte abyte3[] = FM_Bytes.copyOfRange(abyte1, k * 8, (k + 1) * 8);
	//   67  137:aload_1         
	//   68  138:iload_3         
	//   69  139:bipush          8
	//   70  141:imul            
	//   71  142:iload_3         
	//   72  143:iconst_1        
	//   73  144:iadd            
	//   74  145:bipush          8
	//   75  147:imul            
	//   76  148:invokestatic    #50  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   77  151:astore          4
			abyte0 = FM_Bytes.join(DES.encrypt4des3(abyte0, abyte3), DES.encrypt4des3(abyte0, FM_Bytes.not(abyte3)));
	//   78  153:aload_0         
	//   79  154:aload           4
	//   80  156:invokestatic    #56  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//   81  159:aload_0         
	//   82  160:aload           4
	//   83  162:invokestatic    #60  <Method byte[] FM_Bytes.not(byte[])>
	//   84  165:invokestatic    #56  <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//   85  168:invokestatic    #63  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   86  171:astore_0        
		}

	//   87  172:iload_3         
	//   88  173:iconst_1        
	//   89  174:iadd            
	//   90  175:istore_3        
	//   91  176:iload_3         
	//   92  177:iload_2         
	//   93  178:icmplt          137
		return abyte0;
	//   94  181:aload_0         
	//   95  182:areturn         
	}

	public static byte[] singleLength(byte abyte0[], byte abyte1[], int i)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
		{
			log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u662F\uFF0C\u7236\u5BC6\u94A5\u4E3Anull");
	//    2    4:getstatic       #20  <Field FMLog log>
	//    3    7:ldc1            #2   <Class Diversify>
	//    4    9:invokevirtual   #32  <Method String Class.getName()>
	//    5   12:ldc1            #34  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u662F\uFF0C\u7236\u5BC6\u94A5\u4E3Anull">
	//    6   14:invokeinterface #40  <Method void FMLog.warn(String, String)>
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
		}
		if(i == 0)
	//*   9   21:iload_2         
	//*  10   22:ifne            27
			return abyte0;
	//   11   25:aload_0         
	//   12   26:areturn         
		if(i > 0)
	//*  13   27:iload_2         
	//*  14   28:ifle            104
		{
			if(abyte1 == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       52
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u4E3Anull");
	//   17   35:getstatic       #20  <Field FMLog log>
	//   18   38:ldc1            #2   <Class Diversify>
	//   19   40:invokevirtual   #32  <Method String Class.getName()>
	//   20   43:ldc1            #42  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u4E3Anull">
	//   21   45:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   22   50:aconst_null     
	//   23   51:areturn         
			}
			int j = abyte1.length;
	//   24   52:aload_1         
	//   25   53:arraylength     
	//   26   54:istore_3        
			if(j % 8 != 0)
	//*  27   55:iload_3         
	//*  28   56:bipush          8
	//*  29   58:irem            
	//*  30   59:ifeq            79
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   31   62:getstatic       #20  <Field FMLog log>
	//   32   65:ldc1            #2   <Class Diversify>
	//   33   67:invokevirtual   #32  <Method String Class.getName()>
	//   34   70:ldc1            #44  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   35   72:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   36   77:aconst_null     
	//   37   78:areturn         
			}
			if(j / 8 != i)
	//*  38   79:iload_3         
	//*  39   80:bipush          8
	//*  40   82:idiv            
	//*  41   83:iload_2         
	//*  42   84:icmpeq          104
			{
				log.warn(((Class) (cn/com/fmsh/util/algorithm/Diversify)).getName(), "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   43   87:getstatic       #20  <Field FMLog log>
	//   44   90:ldc1            #2   <Class Diversify>
	//   45   92:invokevirtual   #32  <Method String Class.getName()>
	//   46   95:ldc1            #44  <String "\u5206\u6563\u4EA7\u751F\u5BC6\u94A5\u65F6\uFF0C\u5206\u6563\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   47   97:invokeinterface #40  <Method void FMLog.warn(String, String)>
				return null;
	//   48  102:aconst_null     
	//   49  103:areturn         
			}
		}
		abyte0 = DES.encrypt4des(abyte0, FM_Bytes.copyOfRange(abyte1, 0, 8));
	//   50  104:aload_0         
	//   51  105:aload_1         
	//   52  106:iconst_0        
	//   53  107:bipush          8
	//   54  109:invokestatic    #50  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   55  112:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//   56  115:astore_0        
		for(int k = 1; k < i; k++)
	//*  57  116:iconst_1        
	//*  58  117:istore_3        
	//*  59  118:goto            144
			abyte0 = DES.encrypt4des(abyte0, FM_Bytes.copyOfRange(abyte1, k * 8, (k + 1) * 8));
	//   60  121:aload_0         
	//   61  122:aload_1         
	//   62  123:iload_3         
	//   63  124:bipush          8
	//   64  126:imul            
	//   65  127:iload_3         
	//   66  128:iconst_1        
	//   67  129:iadd            
	//   68  130:bipush          8
	//   69  132:imul            
	//   70  133:invokestatic    #50  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   71  136:invokestatic    #67  <Method byte[] DES.encrypt4des(byte[], byte[])>
	//   72  139:astore_0        

	//   73  140:iload_3         
	//   74  141:iconst_1        
	//   75  142:iadd            
	//   76  143:istore_3        
	//   77  144:iload_3         
	//   78  145:iload_2         
	//   79  146:icmplt          121
		return abyte0;
	//   80  149:aload_0         
	//   81  150:areturn         
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
