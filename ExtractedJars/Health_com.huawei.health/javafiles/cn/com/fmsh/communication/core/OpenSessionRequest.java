// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.util.*;
import cn.com.fmsh.util.algorithm.RSA;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

class OpenSessionRequest
{

	OpenSessionRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #58  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #62  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #64  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class OpenSessionRequest>
	//    8   17:invokevirtual   #70  <Method String Class.getName()>
	//    9   20:putfield        #72  <Field String logTag>
	//   10   23:return          
	}

	private byte[] exportPlainText()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag = true;
	//    2    2:iconst_1        
	//    3    3:istore_3        
		int i = j;
	//    4    4:iload_2         
	//    5    5:istore_1        
		if(securityCode != null)
	//*   6    6:aload_0         
	//*   7    7:getfield        #77  <Field byte[] securityCode>
	//*   8   10:ifnull          31
		{
			i = j;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(securityCode.length > 0)
	//*  11   15:aload_0         
	//*  12   16:getfield        #77  <Field byte[] securityCode>
	//*  13   19:arraylength     
	//*  14   20:ifle            31
				i = securityCode.length + 1;
	//   15   23:aload_0         
	//   16   24:getfield        #77  <Field byte[] securityCode>
	//   17   27:arraylength     
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_1        
		}
		j = ((int) (flag));
	//   21   31:iload_3         
	//   22   32:istore_2        
		if(append != null)
	//*  23   33:aload_0         
	//*  24   34:getfield        #79  <Field byte[] append>
	//*  25   37:ifnull          58
		{
			j = ((int) (flag));
	//   26   40:iload_3         
	//   27   41:istore_2        
			if(append.length > 0)
	//*  28   42:aload_0         
	//*  29   43:getfield        #79  <Field byte[] append>
	//*  30   46:arraylength     
	//*  31   47:ifle            58
				j = append.length + 1;
	//   32   50:aload_0         
	//   33   51:getfield        #79  <Field byte[] append>
	//   34   54:arraylength     
	//   35   55:iconst_1        
	//   36   56:iadd            
	//   37   57:istore_2        
		}
		int i2 = i + 63 + j + 1;
	//   38   58:iload_1         
	//   39   59:bipush          63
	//   40   61:iadd            
	//   41   62:iload_2         
	//   42   63:iadd            
	//   43   64:iconst_1        
	//   44   65:iadd            
	//   45   66:istore          4
		byte abyte0[] = new byte[i2];
	//   46   68:iload           4
	//   47   70:newarray        byte[]
	//   48   72:astore          5
		for(int k = 0; k < 8; k++)
	//*  49   74:iconst_0        
	//*  50   75:istore_3        
	//*  51   76:goto            95
			abyte0[k + 0] = terminalRandom[k];
	//   52   79:aload           5
	//   53   81:iload_3         
	//   54   82:iconst_0        
	//   55   83:iadd            
	//   56   84:aload_0         
	//   57   85:getfield        #81  <Field byte[] terminalRandom>
	//   58   88:iload_3         
	//   59   89:baload          
	//   60   90:bastore         

	//   61   91:iload_3         
	//   62   92:iconst_1        
	//   63   93:iadd            
	//   64   94:istore_3        
	//   65   95:iload_3         
	//   66   96:bipush          8
	//   67   98:icmplt          79
		if(terminalNumber == null || terminalNumber.length != 32)
	//*  68  101:aload_0         
	//*  69  102:getfield        #83  <Field byte[] terminalNumber>
	//*  70  105:ifnull          118
	//*  71  108:aload_0         
	//*  72  109:getfield        #83  <Field byte[] terminalNumber>
	//*  73  112:arraylength     
	//*  74  113:bipush          32
	//*  75  115:icmpeq          140
		{
			if(fmLog != null)
	//*  76  118:aload_0         
	//*  77  119:getfield        #64  <Field FMLog fmLog>
	//*  78  122:ifnull          138
				fmLog.warn("OpenSessionRequest", "OpenSessionRequest toByte,\u7EC8\u7AEF\u7F16\u53F7\u6570\u636E\u4E0D\u5408\u6CD5");
	//   79  125:aload_0         
	//   80  126:getfield        #64  <Field FMLog fmLog>
	//   81  129:ldc1            #85  <String "OpenSessionRequest">
	//   82  131:ldc1            #87  <String "OpenSessionRequest toByte,\u7EC8\u7AEF\u7F16\u53F7\u6570\u636E\u4E0D\u5408\u6CD5">
	//   83  133:invokeinterface #93  <Method void FMLog.warn(String, String)>
			return null;
	//   84  138:aconst_null     
	//   85  139:areturn         
		}
		for(int l = 0; l < 32; l++)
	//*  86  140:iconst_0        
	//*  87  141:istore_3        
	//*  88  142:goto            162
			abyte0[l + 8] = terminalNumber[l];
	//   89  145:aload           5
	//   90  147:iload_3         
	//   91  148:bipush          8
	//   92  150:iadd            
	//   93  151:aload_0         
	//   94  152:getfield        #83  <Field byte[] terminalNumber>
	//   95  155:iload_3         
	//   96  156:baload          
	//   97  157:bastore         

	//   98  158:iload_3         
	//   99  159:iconst_1        
	//  100  160:iadd            
	//  101  161:istore_3        
	//  102  162:iload_3         
	//  103  163:bipush          32
	//  104  165:icmplt          145
		if(terminalTime == null || terminalTime.length < 1)
	//* 105  168:aload_0         
	//* 106  169:getfield        #95  <Field byte[] terminalTime>
	//* 107  172:ifnull          184
	//* 108  175:aload_0         
	//* 109  176:getfield        #95  <Field byte[] terminalTime>
	//* 110  179:arraylength     
	//* 111  180:iconst_1        
	//* 112  181:icmpge          196
			terminalTime = FM_CN.string2Bcd(Util4Java.date2string("yyyyMMddHHmmss"));
	//  113  184:aload_0         
	//  114  185:ldc1            #97  <String "yyyyMMddHHmmss">
	//  115  187:invokestatic    #103 <Method String Util4Java.date2string(String)>
	//  116  190:invokestatic    #109 <Method byte[] FM_CN.string2Bcd(String)>
	//  117  193:putfield        #95  <Field byte[] terminalTime>
		if(terminalTime.length != 7)
	//* 118  196:aload_0         
	//* 119  197:getfield        #95  <Field byte[] terminalTime>
	//* 120  200:arraylength     
	//* 121  201:bipush          7
	//* 122  203:icmpeq          228
		{
			if(fmLog != null)
	//* 123  206:aload_0         
	//* 124  207:getfield        #64  <Field FMLog fmLog>
	//* 125  210:ifnull          226
				fmLog.warn("OpenSessionRequest", "OpenSessionRequest toByte,\u7EC8\u7AEF\u65F6\u95F4\u6570\u636E\u4E0D\u5408\u6CD5");
	//  126  213:aload_0         
	//  127  214:getfield        #64  <Field FMLog fmLog>
	//  128  217:ldc1            #85  <String "OpenSessionRequest">
	//  129  219:ldc1            #111 <String "OpenSessionRequest toByte,\u7EC8\u7AEF\u65F6\u95F4\u6570\u636E\u4E0D\u5408\u6CD5">
	//  130  221:invokeinterface #93  <Method void FMLog.warn(String, String)>
			return null;
	//  131  226:aconst_null     
	//  132  227:areturn         
		}
		for(int i1 = 0; i1 < 7; i1++)
	//* 133  228:iconst_0        
	//* 134  229:istore_3        
	//* 135  230:goto            250
			abyte0[i1 + 40] = terminalTime[i1];
	//  136  233:aload           5
	//  137  235:iload_3         
	//  138  236:bipush          40
	//  139  238:iadd            
	//  140  239:aload_0         
	//  141  240:getfield        #95  <Field byte[] terminalTime>
	//  142  243:iload_3         
	//  143  244:baload          
	//  144  245:bastore         

	//  145  246:iload_3         
	//  146  247:iconst_1        
	//  147  248:iadd            
	//  148  249:istore_3        
	//  149  250:iload_3         
	//  150  251:bipush          7
	//  151  253:icmplt          233
		for(int j1 = 0; j1 < 16; j1++)
	//* 152  256:iconst_0        
	//* 153  257:istore_3        
	//* 154  258:goto            278
			abyte0[j1 + 47] = tempKey[j1];
	//  155  261:aload           5
	//  156  263:iload_3         
	//  157  264:bipush          47
	//  158  266:iadd            
	//  159  267:aload_0         
	//  160  268:getfield        #113 <Field byte[] tempKey>
	//  161  271:iload_3         
	//  162  272:baload          
	//  163  273:bastore         

	//  164  274:iload_3         
	//  165  275:iconst_1        
	//  166  276:iadd            
	//  167  277:istore_3        
	//  168  278:iload_3         
	//  169  279:bipush          16
	//  170  281:icmplt          261
		if(i > 1)
	//* 171  284:iload_1         
	//* 172  285:iconst_1        
	//* 173  286:icmple          330
		{
			abyte0[63] = (byte)(i - 1);
	//  174  289:aload           5
	//  175  291:bipush          63
	//  176  293:iload_1         
	//  177  294:iconst_1        
	//  178  295:isub            
	//  179  296:int2byte        
	//  180  297:bastore         
			for(int k1 = 1; k1 < i; k1++)
	//* 181  298:iconst_1        
	//* 182  299:istore_3        
	//* 183  300:goto            322
				abyte0[k1 + 63] = securityCode[k1 - 1];
	//  184  303:aload           5
	//  185  305:iload_3         
	//  186  306:bipush          63
	//  187  308:iadd            
	//  188  309:aload_0         
	//  189  310:getfield        #77  <Field byte[] securityCode>
	//  190  313:iload_3         
	//  191  314:iconst_1        
	//  192  315:isub            
	//  193  316:baload          
	//  194  317:bastore         

	//  195  318:iload_3         
	//  196  319:iconst_1        
	//  197  320:iadd            
	//  198  321:istore_3        
	//  199  322:iload_3         
	//  200  323:iload_1         
	//  201  324:icmplt          303
		} else
	//* 202  327:goto            336
		{
			abyte0[63] = 0;
	//  203  330:aload           5
	//  204  332:bipush          63
	//  205  334:iconst_0        
	//  206  335:bastore         
		}
		if(j > 1)
	//* 207  336:iload_2         
	//* 208  337:iconst_1        
	//* 209  338:icmple          386
		{
			abyte0[i + 63] = (byte)(j - 1);
	//  210  341:aload           5
	//  211  343:iload_1         
	//  212  344:bipush          63
	//  213  346:iadd            
	//  214  347:iload_2         
	//  215  348:iconst_1        
	//  216  349:isub            
	//  217  350:int2byte        
	//  218  351:bastore         
			for(int l1 = 1; l1 < j; l1++)
	//* 219  352:iconst_1        
	//* 220  353:istore_3        
	//* 221  354:goto            378
				abyte0[i + 63 + l1] = append[l1 - 1];
	//  222  357:aload           5
	//  223  359:iload_1         
	//  224  360:bipush          63
	//  225  362:iadd            
	//  226  363:iload_3         
	//  227  364:iadd            
	//  228  365:aload_0         
	//  229  366:getfield        #79  <Field byte[] append>
	//  230  369:iload_3         
	//  231  370:iconst_1        
	//  232  371:isub            
	//  233  372:baload          
	//  234  373:bastore         

	//  235  374:iload_3         
	//  236  375:iconst_1        
	//  237  376:iadd            
	//  238  377:istore_3        
	//  239  378:iload_3         
	//  240  379:iload_2         
	//  241  380:icmplt          357
		} else
	//* 242  383:goto            394
		{
			abyte0[i + 63] = 0;
	//  243  386:aload           5
	//  244  388:iload_1         
	//  245  389:bipush          63
	//  246  391:iadd            
	//  247  392:iconst_0        
	//  248  393:bastore         
		}
		abyte0[i2 - 1] = BCCUtil.calculateBCC(abyte0);
	//  249  394:aload           5
	//  250  396:iload           4
	//  251  398:iconst_1        
	//  252  399:isub            
	//  253  400:aload           5
	//  254  402:invokestatic    #119 <Method byte BCCUtil.calculateBCC(byte[])>
	//  255  405:bastore         
		return abyte0;
	//  256  406:aload           5
	//  257  408:areturn         
	}

	public byte[] getAppend()
	{
		return append;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field byte[] append>
	//    2    4:areturn         
	}

	public byte getBusinessVersion()
	{
		return businessVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field byte businessVersion>
	//    2    4:ireturn         
	}

	public byte[] getExponent()
	{
		return exponent;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field byte[] exponent>
	//    2    4:areturn         
	}

	public byte getKeyIndex()
	{
		return keyIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field byte keyIndex>
	//    2    4:ireturn         
	}

	public byte[] getModulus()
	{
		return modulus;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field byte[] modulus>
	//    2    4:areturn         
	}

	public byte[] getSecurityCode()
	{
		return securityCode;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field byte[] securityCode>
	//    2    4:areturn         
	}

	public byte[] getTempKey()
	{
		return tempKey;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field byte[] tempKey>
	//    2    4:areturn         
	}

	public byte[] getTerminalNumber()
	{
		return terminalNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field byte[] terminalNumber>
	//    2    4:areturn         
	}

	public byte[] getTerminalRandom()
	{
		return terminalRandom;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field byte[] terminalRandom>
	//    2    4:areturn         
	}

	public byte[] getTerminalTime()
	{
		return terminalTime;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field byte[] terminalTime>
	//    2    4:areturn         
	}

	public byte[] getTerminalType()
	{
		return terminalType;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field byte[] terminalType>
	//    2    4:areturn         
	}

	public void setAppend(byte abyte0[])
	{
		append = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field byte[] append>
	//    3    5:return          
	}

	public void setBusinessVersion(byte byte0)
	{
		businessVersion = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field byte businessVersion>
	//    3    5:return          
	}

	public void setExponent(byte abyte0[])
	{
		exponent = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field byte[] exponent>
	//    3    5:return          
	}

	public void setKeyIndex(byte byte0)
	{
		keyIndex = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field byte keyIndex>
	//    3    5:return          
	}

	public void setModulus(byte abyte0[])
	{
		modulus = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field byte[] modulus>
	//    3    5:return          
	}

	public void setSecurityCode(byte abyte0[])
	{
		securityCode = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field byte[] securityCode>
	//    3    5:return          
	}

	public void setTempKey(byte abyte0[])
	{
		tempKey = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field byte[] tempKey>
	//    3    5:return          
	}

	public void setTerminalNumber(byte abyte0[])
	{
		terminalNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field byte[] terminalNumber>
	//    3    5:return          
	}

	public void setTerminalRandom(byte abyte0[])
	{
		terminalRandom = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field byte[] terminalRandom>
	//    3    5:return          
	}

	public void setTerminalTime(byte abyte0[])
	{
		terminalTime = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field byte[] terminalTime>
	//    3    5:return          
	}

	public void setTerminalType(byte abyte0[])
	{
		terminalType = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field byte[] terminalType>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		byte abyte0[] = exportPlainText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method byte[] exportPlainText()>
	//    2    4:astore_3        
		abyte0 = RSA.encrtyByPublic(modulus, exponent, abyte0, true);
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field byte[] modulus>
	//    5    9:aload_0         
	//    6   10:getfield        #127 <Field byte[] exponent>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #163 <Method byte[] RSA.encrtyByPublic(byte[], byte[], byte[], boolean)>
	//   10   18:astore_3        
		if(abyte0 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		int j = abyte0.length;
	//   15   25:aload_3         
	//   16   26:arraylength     
	//   17   27:istore_2        
		byte abyte1[] = new byte[j + 5];
	//   18   28:iload_2         
	//   19   29:iconst_5        
	//   20   30:iadd            
	//   21   31:newarray        byte[]
	//   22   33:astore          4
		if(terminalType.length != 2)
	//*  23   35:aload_0         
	//*  24   36:getfield        #141 <Field byte[] terminalType>
	//*  25   39:arraylength     
	//*  26   40:iconst_2        
	//*  27   41:icmpeq          85
		{
			if(fmLog != null)
	//*  28   44:aload_0         
	//*  29   45:getfield        #64  <Field FMLog fmLog>
	//*  30   48:ifnull          83
				fmLog.debug(logTag, (new StringBuilder(" cipherText:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   31   51:aload_0         
	//   32   52:getfield        #64  <Field FMLog fmLog>
	//   33   55:aload_0         
	//   34   56:getfield        #72  <Field String logTag>
	//   35   59:new             #165 <Class StringBuilder>
	//   36   62:dup             
	//   37   63:ldc1            #167 <String " cipherText:">
	//   38   65:invokespecial   #170 <Method void StringBuilder(String)>
	//   39   68:aload_3         
	//   40   69:invokestatic    #176 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   41   72:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   42   75:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   43   78:invokeinterface #185 <Method void FMLog.debug(String, String)>
			return null;
	//   44   83:aconst_null     
	//   45   84:areturn         
		}
		abyte1[0] = 0;
	//   46   85:aload           4
	//   47   87:iconst_0        
	//   48   88:iconst_0        
	//   49   89:bastore         
		abyte1[1] = terminalType[0];
	//   50   90:aload           4
	//   51   92:iconst_1        
	//   52   93:aload_0         
	//   53   94:getfield        #141 <Field byte[] terminalType>
	//   54   97:iconst_0        
	//   55   98:baload          
	//   56   99:bastore         
		abyte1[2] = terminalType[1];
	//   57  100:aload           4
	//   58  102:iconst_2        
	//   59  103:aload_0         
	//   60  104:getfield        #141 <Field byte[] terminalType>
	//   61  107:iconst_1        
	//   62  108:baload          
	//   63  109:bastore         
		abyte1[3] = getBusinessVersion();
	//   64  110:aload           4
	//   65  112:iconst_3        
	//   66  113:aload_0         
	//   67  114:invokevirtual   #187 <Method byte getBusinessVersion()>
	//   68  117:bastore         
		abyte1[4] = keyIndex;
	//   69  118:aload           4
	//   70  120:iconst_4        
	//   71  121:aload_0         
	//   72  122:getfield        #130 <Field byte keyIndex>
	//   73  125:bastore         
		for(int i = 0; i < j; i++)
	//*  74  126:iconst_0        
	//*  75  127:istore_1        
	//*  76  128:goto            144
			abyte1[i + 5] = abyte0[i];
	//   77  131:aload           4
	//   78  133:iload_1         
	//   79  134:iconst_5        
	//   80  135:iadd            
	//   81  136:aload_3         
	//   82  137:iload_1         
	//   83  138:baload          
	//   84  139:bastore         

	//   85  140:iload_1         
	//   86  141:iconst_1        
	//   87  142:iadd            
	//   88  143:istore_1        
	//   89  144:iload_1         
	//   90  145:iload_2         
	//   91  146:icmplt          131
		return abyte1;
	//   92  149:aload           4
	//   93  151:areturn         
	}

	private static final int CIPHERTEXT_OFFSET = 5;
	private static final int KEY_INDEX_OFFSET = 4;
	private static final int PLAIN_TEST_FIXED_LENGTH = 63;
	private static final int SECURITY_CODE_OFFSET = 63;
	public static final int TEMP_KEY_LENGTH = 16;
	private static final int TEMP_KEY_OFFSET = 47;
	private static final int TERMINAL_NUMBER_LENGTH = 32;
	private static final int TERMINAL_NUMBER_OFFSET = 8;
	public static final int TERMINAL_RANDOM_LENGTH = 8;
	private static final int TERMINAL_RANDOM_OFFSET = 0;
	private static final int TERMINAL_TIME_LENGTH = 7;
	private static final int TERMINAL_TIME_OFFSET = 40;
	private static final byte TERMINAL_TYPE_FIRST = 0;
	private static final int TERMINAL_TYPE_LENGTH = 2;
	private static final int TERMINAL_TYPE_OFFSET = 0;
	private byte append[];
	private byte businessVersion;
	private byte exponent[];
	private FMLog fmLog;
	private byte keyIndex;
	private final String logTag = ((Class) (cn/com/fmsh/communication/core/OpenSessionRequest)).getName();
	private byte modulus[];
	private byte securityCode[];
	private byte tempKey[];
	private byte terminalNumber[];
	private byte terminalRandom[];
	private byte terminalTime[];
	private byte terminalType[];
}
