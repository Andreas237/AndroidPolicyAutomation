// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.card.core;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.tsm.business.bean.CardAppRecord;
import cn.com.fmsh.tsm.business.card.base.CardManager;
import cn.com.fmsh.tsm.business.enums.EnumCardAppStatus;
import cn.com.fmsh.tsm.business.enums.EnumTradeType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

public class LntAppManager
	implements CardManager
{

	public LntAppManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #35  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class LntAppManager>
	//    8   17:invokevirtual   #41  <Method String Class.getName()>
	//    9   20:putfield        #43  <Field String logTag>
	//   10   23:aload_0         
	//   11   24:bipush          10
	//   12   26:putfield        #45  <Field int MAX_LOG>
	//   13   29:aload_0         
	//   14   30:bipush          8
	//   15   32:newarray        byte[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:ldc1            #46  <Int 89>
	//   19   38:bastore         
	//   20   39:dup             
	//   21   40:iconst_1        
	//   22   41:ldc1            #47  <Int 67>
	//   23   43:bastore         
	//   24   44:dup             
	//   25   45:iconst_2        
	//   26   46:ldc1            #48  <Int 84>
	//   27   48:bastore         
	//   28   49:dup             
	//   29   50:iconst_3        
	//   30   51:ldc1            #49  <Int 46>
	//   31   53:bastore         
	//   32   54:dup             
	//   33   55:iconst_4        
	//   34   56:ldc1            #50  <Int 85>
	//   35   58:bastore         
	//   36   59:dup             
	//   37   60:iconst_5        
	//   38   61:ldc1            #51  <Int 83>
	//   39   63:bastore         
	//   40   64:dup             
	//   41   65:bipush          6
	//   42   67:ldc1            #52  <Int 69>
	//   43   69:bastore         
	//   44   70:dup             
	//   45   71:bipush          7
	//   46   73:ldc1            #53  <Int 82>
	//   47   75:bastore         
	//   48   76:putfield        #55  <Field byte[] aid>
	//   49   79:aload_0         
	//   50   80:bipush          23
	//   51   82:putfield        #57  <Field int BYTE_COUNT_18>
	//   52   85:aload_0         
	//   53   86:iconst_2        
	//   54   87:putfield        #59  <Field byte PERSONALIZE_SUCESS_FLAG>
	//   55   90:return          
	}

	private EnumTradeType get18TradeType(byte byte0)
	{
		switch(byte0)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    3: default 36
	//	               2: 38
	//	               6: 42
	//	               9: 46
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 2: // '\002'
			return EnumTradeType.recharge;
	//    4   38:getstatic       #68  <Field EnumTradeType EnumTradeType.recharge>
	//    5   41:areturn         

		case 6: // '\006'
			return EnumTradeType.Consumption;
	//    6   42:getstatic       #71  <Field EnumTradeType EnumTradeType.Consumption>
	//    7   45:areturn         

		case 9: // '\t'
			return EnumTradeType.CompositeConsumption;
	//    8   46:getstatic       #74  <Field EnumTradeType EnumTradeType.CompositeConsumption>
	//    9   49:areturn         
		}
	}

	private byte[] transceive(byte abyte0[])
		throws BusinessException
	{
		try
		{
			abyte0 = apduHandler.transceive(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ApduHandler apduHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method byte[] ApduHandler.transceive(byte[])>
	//    4   10:astore_1        
		}
	//*   5   11:goto            83
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   6   14:astore_1        
		{
			if(fmLog != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field FMLog fmLog>
	//*   9   19:ifnull          54
				fmLog.warn(logTag, (new StringBuilder("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field FMLog fmLog>
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field String logTag>
	//   14   30:new             #88  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:ldc1            #90  <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   17   36:invokespecial   #93  <Method void StringBuilder(String)>
	//   18   39:aload_1         
	//   19   40:invokestatic    #99  <Method String Util4Java.getExceptionInfo(Exception)>
	//   20   43:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   22   49:invokeinterface #112 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  23   54:aload_0         
	//*  24   55:getfield        #82  <Field ApduHandler apduHandler>
	//*  25   58:ifnull          70
				apduHandler.close();
	//   26   61:aload_0         
	//   27   62:getfield        #82  <Field ApduHandler apduHandler>
	//   28   65:invokeinterface #115 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   29   70:new             #78  <Class BusinessException>
	//   30   73:dup             
	//   31   74:ldc1            #90  <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   32   76:getstatic       #121 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   33   79:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   34   82:athrow          
		}
		if(abyte0 == null || abyte0.length < 2)
	//*  35   83:aload_1         
	//*  36   84:ifnull          93
	//*  37   87:aload_1         
	//*  38   88:arraylength     
	//*  39   89:iconst_2        
	//*  40   90:icmpge          144
		{
			if(fmLog != null)
	//*  41   93:aload_0         
	//*  42   94:getfield        #35  <Field FMLog fmLog>
	//*  43   97:ifnull          115
				fmLog.warn(logTag, "Apdu\u6307\u4EE4\u6267\u884C\u7ED3\u679C\u4E3A\u7A7A");
	//   44  100:aload_0         
	//   45  101:getfield        #35  <Field FMLog fmLog>
	//   46  104:aload_0         
	//   47  105:getfield        #43  <Field String logTag>
	//   48  108:ldc1            #126 <String "Apdu\u6307\u4EE4\u6267\u884C\u7ED3\u679C\u4E3A\u7A7A">
	//   49  110:invokeinterface #112 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  50  115:aload_0         
	//*  51  116:getfield        #82  <Field ApduHandler apduHandler>
	//*  52  119:ifnull          131
				apduHandler.close();
	//   53  122:aload_0         
	//   54  123:getfield        #82  <Field ApduHandler apduHandler>
	//   55  126:invokeinterface #115 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   56  131:new             #78  <Class BusinessException>
	//   57  134:dup             
	//   58  135:ldc1            #128 <String "Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548">
	//   59  137:getstatic       #121 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   60  140:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   61  143:athrow          
		} else
		{
			return abyte0;
	//   62  144:aload_1         
	//   63  145:areturn         
		}
	}

	public byte[] getAid()
	{
		return aid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field byte[] aid>
	//    2    4:areturn         
	}

	public byte[] getAppNo()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #35  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #35  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.debug(logTag, "LNT getAppNo...");
	//   10   24:aload_0         
	//   11   25:getfield        #35  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field String logTag>
	//   14   32:ldc1            #134 <String "LNT getAppNo...">
	//   15   34:invokeinterface #137 <Method void FMLog.debug(String, String)>
		if(apduHandler == null)
	//*  16   39:aload_0         
	//*  17   40:getfield        #82  <Field ApduHandler apduHandler>
	//*  18   43:ifnonnull       81
		{
			if(fmLog != null)
	//*  19   46:aload_0         
	//*  20   47:getfield        #35  <Field FMLog fmLog>
	//*  21   50:ifnull          68
				fmLog.warn(logTag, "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   53:aload_0         
	//   23   54:getfield        #35  <Field FMLog fmLog>
	//   24   57:aload_0         
	//   25   58:getfield        #43  <Field String logTag>
	//   26   61:ldc1            #139 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   63:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   68:new             #78  <Class BusinessException>
	//   29   71:dup             
	//   30   72:ldc1            #139 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   74:getstatic       #142 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   77:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   80:athrow          
		}
		byte abyte0[] = new byte[13];
	//   34   81:bipush          13
	//   35   83:newarray        byte[]
	//   36   85:astore_1        
		abyte0[1] = -92;
	//   37   86:aload_1         
	//   38   87:iconst_1        
	//   39   88:bipush          -92
	//   40   90:bastore         
		abyte0[2] = 4;
	//   41   91:aload_1         
	//   42   92:iconst_2        
	//   43   93:iconst_4        
	//   44   94:bastore         
		abyte0[4] = 8;
	//   45   95:aload_1         
	//   46   96:iconst_4        
	//   47   97:bipush          8
	//   48   99:bastore         
		abyte0[5] = 80;
	//   49  100:aload_1         
	//   50  101:iconst_5        
	//   51  102:bipush          80
	//   52  104:bastore         
		abyte0[6] = 65;
	//   53  105:aload_1         
	//   54  106:bipush          6
	//   55  108:bipush          65
	//   56  110:bastore         
		abyte0[7] = 89;
	//   57  111:aload_1         
	//   58  112:bipush          7
	//   59  114:bipush          89
	//   60  116:bastore         
		abyte0[8] = 46;
	//   61  117:aload_1         
	//   62  118:bipush          8
	//   63  120:bipush          46
	//   64  122:bastore         
		abyte0[9] = 65;
	//   65  123:aload_1         
	//   66  124:bipush          9
	//   67  126:bipush          65
	//   68  128:bastore         
		abyte0[10] = 80;
	//   69  129:aload_1         
	//   70  130:bipush          10
	//   71  132:bipush          80
	//   72  134:bastore         
		abyte0[11] = 80;
	//   73  135:aload_1         
	//   74  136:bipush          11
	//   75  138:bipush          80
	//   76  140:bastore         
		abyte0[12] = 89;
	//   77  141:aload_1         
	//   78  142:bipush          12
	//   79  144:bipush          89
	//   80  146:bastore         
		if(!FM_Bytes.isEnd9000(transceive(abyte0)))
	//*  81  147:aload_0         
	//*  82  148:aload_1         
	//*  83  149:invokespecial   #143 <Method byte[] transceive(byte[])>
	//*  84  152:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  85  155:ifne            193
		{
			if(fmLog != null)
	//*  86  158:aload_0         
	//*  87  159:getfield        #35  <Field FMLog fmLog>
	//*  88  162:ifnull          180
				fmLog.warn(logTag, "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E95041592E41505059\u5931\u8D25");
	//   89  165:aload_0         
	//   90  166:getfield        #35  <Field FMLog fmLog>
	//   91  169:aload_0         
	//   92  170:getfield        #43  <Field String logTag>
	//   93  173:ldc1            #151 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E95041592E41505059\u5931\u8D25">
	//   94  175:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E95041592E41505059\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
	//   95  180:new             #78  <Class BusinessException>
	//   96  183:dup             
	//   97  184:ldc1            #151 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E95041592E41505059\u5931\u8D25">
	//   98  186:getstatic       #154 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//   99  189:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  100  192:athrow          
		}
		abyte0 = new byte[5];
	//  101  193:iconst_5        
	//  102  194:newarray        byte[]
	//  103  196:astore_1        
		abyte0[1] = -80;
	//  104  197:aload_1         
	//  105  198:iconst_1        
	//  106  199:bipush          -80
	//  107  201:bastore         
		abyte0[2] = -107;
	//  108  202:aload_1         
	//  109  203:iconst_2        
	//  110  204:bipush          -107
	//  111  206:bastore         
		abyte0[4] = 16;
	//  112  207:aload_1         
	//  113  208:iconst_4        
	//  114  209:bipush          16
	//  115  211:bastore         
		abyte0 = transceive(abyte0);
	//  116  212:aload_0         
	//  117  213:aload_1         
	//  118  214:invokespecial   #143 <Method byte[] transceive(byte[])>
	//  119  217:astore_1        
		if(abyte0 != null && abyte0.length > 10)
	//* 120  218:aload_1         
	//* 121  219:ifnull          250
	//* 122  222:aload_1         
	//* 123  223:arraylength     
	//* 124  224:bipush          10
	//* 125  226:icmple          250
			if(FM_Bytes.isEnd9000(abyte0))
	//* 126  229:aload_1         
	//* 127  230:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 128  233:ifeq            285
				return Arrays.copyOfRange(abyte0, abyte0.length - 10, abyte0.length - 2);
	//  129  236:aload_1         
	//  130  237:aload_1         
	//  131  238:arraylength     
	//  132  239:bipush          10
	//  133  241:isub            
	//  134  242:aload_1         
	//  135  243:arraylength     
	//  136  244:iconst_2        
	//  137  245:isub            
	//  138  246:invokestatic    #160 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  139  249:areturn         
			else
	//* 140  250:aload_0         
	//* 141  251:getfield        #35  <Field FMLog fmLog>
	//* 142  254:ifnull          272
	//* 143  257:aload_0         
	//* 144  258:getfield        #35  <Field FMLog fmLog>
	//* 145  261:aload_0         
	//* 146  262:getfield        #43  <Field String logTag>
	//* 147  265:ldc1            #162 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E9 00B0950010\u5931\u8D25">
	//* 148  267:invokeinterface #112 <Method void FMLog.warn(String, String)>
	//* 149  272:new             #78  <Class BusinessException>
	//* 150  275:dup             
	//* 151  276:ldc1            #162 <String "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E9 00B0950010\u5931\u8D25">
	//* 152  278:getstatic       #154 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//* 153  281:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//* 154  284:athrow          
				return null;
	//  155  285:aconst_null     
	//  156  286:areturn         
		if(fmLog != null)
			fmLog.warn(logTag, "\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E9 00B0950010\u5931\u8D25");
		throw new BusinessException("\u83B7\u53D6\u5CAD\u5357\u901A\u903B\u8F91\u5361\u53F7\uFF0C\u9009\u62E9 00B0950010\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
	}

	public CardAppRecord getAppRecord4bytes(byte abyte0[])
	{
		CardAppRecord cardapprecord = new CardAppRecord();
	//    0    0:new             #166 <Class CardAppRecord>
	//    1    3:dup             
	//    2    4:invokespecial   #167 <Method void CardAppRecord()>
	//    3    7:astore_2        
		cardapprecord.setTradeNo(FM_Bytes.bytesToInt(new byte[] {
			abyte0[0], abyte0[1]
		}));
	//    4    8:aload_2         
	//    5    9:iconst_2        
	//    6   10:newarray        byte[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:aload_1         
	//   10   15:iconst_0        
	//   11   16:baload          
	//   12   17:bastore         
	//   13   18:dup             
	//   14   19:iconst_1        
	//   15   20:aload_1         
	//   16   21:iconst_1        
	//   17   22:baload          
	//   18   23:bastore         
	//   19   24:invokestatic    #171 <Method int FM_Bytes.bytesToInt(byte[])>
	//   20   27:invokevirtual   #175 <Method void CardAppRecord.setTradeNo(int)>
		cardapprecord.setAmount(Integer.parseInt(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[5], abyte0[6], abyte0[7], abyte0[8]
		}), 16));
	//   21   30:aload_2         
	//   22   31:iconst_4        
	//   23   32:newarray        byte[]
	//   24   34:dup             
	//   25   35:iconst_0        
	//   26   36:aload_1         
	//   27   37:iconst_5        
	//   28   38:baload          
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:iconst_1        
	//   32   42:aload_1         
	//   33   43:bipush          6
	//   34   45:baload          
	//   35   46:bastore         
	//   36   47:dup             
	//   37   48:iconst_2        
	//   38   49:aload_1         
	//   39   50:bipush          7
	//   40   52:baload          
	//   41   53:bastore         
	//   42   54:dup             
	//   43   55:iconst_3        
	//   44   56:aload_1         
	//   45   57:bipush          8
	//   46   59:baload          
	//   47   60:bastore         
	//   48   61:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   49   64:bipush          16
	//   50   66:invokestatic    #185 <Method int Integer.parseInt(String, int)>
	//   51   69:invokevirtual   #188 <Method void CardAppRecord.setAmount(int)>
		cardapprecord.setTradeType(get18TradeType(abyte0[9]));
	//   52   72:aload_2         
	//   53   73:aload_0         
	//   54   74:aload_1         
	//   55   75:bipush          9
	//   56   77:baload          
	//   57   78:invokespecial   #190 <Method EnumTradeType get18TradeType(byte)>
	//   58   81:invokevirtual   #194 <Method void CardAppRecord.setTradeType(EnumTradeType)>
		cardapprecord.setTradeDevice(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[10], abyte0[11], abyte0[12], abyte0[13], abyte0[14], abyte0[15]
		}));
	//   59   84:aload_2         
	//   60   85:bipush          6
	//   61   87:newarray        byte[]
	//   62   89:dup             
	//   63   90:iconst_0        
	//   64   91:aload_1         
	//   65   92:bipush          10
	//   66   94:baload          
	//   67   95:bastore         
	//   68   96:dup             
	//   69   97:iconst_1        
	//   70   98:aload_1         
	//   71   99:bipush          11
	//   72  101:baload          
	//   73  102:bastore         
	//   74  103:dup             
	//   75  104:iconst_2        
	//   76  105:aload_1         
	//   77  106:bipush          12
	//   78  108:baload          
	//   79  109:bastore         
	//   80  110:dup             
	//   81  111:iconst_3        
	//   82  112:aload_1         
	//   83  113:bipush          13
	//   84  115:baload          
	//   85  116:bastore         
	//   86  117:dup             
	//   87  118:iconst_4        
	//   88  119:aload_1         
	//   89  120:bipush          14
	//   90  122:baload          
	//   91  123:bastore         
	//   92  124:dup             
	//   93  125:iconst_5        
	//   94  126:aload_1         
	//   95  127:bipush          15
	//   96  129:baload          
	//   97  130:bastore         
	//   98  131:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   99  134:invokevirtual   #197 <Method void CardAppRecord.setTradeDevice(String)>
		cardapprecord.setTradeDate(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[18], abyte0[19]
		}));
	//  100  137:aload_2         
	//  101  138:iconst_2        
	//  102  139:newarray        byte[]
	//  103  141:dup             
	//  104  142:iconst_0        
	//  105  143:aload_1         
	//  106  144:bipush          18
	//  107  146:baload          
	//  108  147:bastore         
	//  109  148:dup             
	//  110  149:iconst_1        
	//  111  150:aload_1         
	//  112  151:bipush          19
	//  113  153:baload          
	//  114  154:bastore         
	//  115  155:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  116  158:invokevirtual   #200 <Method void CardAppRecord.setTradeDate(String)>
		cardapprecord.setTradeTime(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[20], abyte0[21], abyte0[22]
		}));
	//  117  161:aload_2         
	//  118  162:iconst_3        
	//  119  163:newarray        byte[]
	//  120  165:dup             
	//  121  166:iconst_0        
	//  122  167:aload_1         
	//  123  168:bipush          20
	//  124  170:baload          
	//  125  171:bastore         
	//  126  172:dup             
	//  127  173:iconst_1        
	//  128  174:aload_1         
	//  129  175:bipush          21
	//  130  177:baload          
	//  131  178:bastore         
	//  132  179:dup             
	//  133  180:iconst_2        
	//  134  181:aload_1         
	//  135  182:bipush          22
	//  136  184:baload          
	//  137  185:bastore         
	//  138  186:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  139  189:invokevirtual   #203 <Method void CardAppRecord.setTradeTime(String)>
		return cardapprecord;
	//  140  192:aload_2         
	//  141  193:areturn         
	}

	public String getFaceID()
		throws BusinessException
	{
		return FM_Bytes.bytesToHexString(getAppNo());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method byte[] getAppNo()>
	//    2    4:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//    3    7:areturn         
	}

	public String getMOC()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #35  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #35  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.debug(logTag, "LNT getAppNo...");
	//   10   24:aload_0         
	//   11   25:getfield        #35  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field String logTag>
	//   14   32:ldc1            #134 <String "LNT getAppNo...">
	//   15   34:invokeinterface #137 <Method void FMLog.debug(String, String)>
		if(apduHandler == null)
	//*  16   39:aload_0         
	//*  17   40:getfield        #82  <Field ApduHandler apduHandler>
	//*  18   43:ifnonnull       81
		{
			if(fmLog != null)
	//*  19   46:aload_0         
	//*  20   47:getfield        #35  <Field FMLog fmLog>
	//*  21   50:ifnull          68
				fmLog.warn(logTag, "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   53:aload_0         
	//   23   54:getfield        #35  <Field FMLog fmLog>
	//   24   57:aload_0         
	//   25   58:getfield        #43  <Field String logTag>
	//   26   61:ldc1            #209 <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   63:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   68:new             #78  <Class BusinessException>
	//   29   71:dup             
	//   30   72:ldc1            #209 <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   74:getstatic       #142 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   77:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   80:athrow          
		}
		byte abyte0[] = new byte[5];
	//   34   81:iconst_5        
	//   35   82:newarray        byte[]
	//   36   84:astore_1        
		abyte0[0] = -60;
	//   37   85:aload_1         
	//   38   86:iconst_0        
	//   39   87:bipush          -60
	//   40   89:bastore         
		abyte0[1] = -2;
	//   41   90:aload_1         
	//   42   91:iconst_1        
	//   43   92:bipush          -2
	//   44   94:bastore         
		abyte0 = transceive(abyte0);
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   48  100:astore_1        
		if(FM_Bytes.isEnd9000(abyte0))
	//*  49  101:aload_1         
	//*  50  102:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  51  105:ifeq            119
			return FM_Bytes.bytesToHexString(Arrays.copyOfRange(abyte0, 0, 8));
	//   52  108:aload_1         
	//   53  109:iconst_0        
	//   54  110:bipush          8
	//   55  112:invokestatic    #160 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   56  115:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   57  118:areturn         
		else
			return null;
	//   58  119:aconst_null     
	//   59  120:areturn         
	}

	public EnumCardAppStatus getStatus()
		throws BusinessException
	{
		EnumCardAppStatus enumcardappstatus = EnumCardAppStatus.STATUS_INSTALL;
	//    0    0:getstatic       #217 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_INSTALL>
	//    1    3:astore_1        
		if(apduHandler == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #82  <Field ApduHandler apduHandler>
	//*   4    8:ifnonnull       46
		{
			if(fmLog != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #35  <Field FMLog fmLog>
	//*   7   15:ifnull          33
				fmLog.warn(logTag, "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field FMLog fmLog>
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field String logTag>
	//   12   26:ldc1            #219 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   13   28:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   14   33:new             #78  <Class BusinessException>
	//   15   36:dup             
	//   16   37:ldc1            #219 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   17   39:getstatic       #142 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   18   42:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   45:athrow          
		}
		byte abyte0[] = new byte[7];
	//   20   46:bipush          7
	//   21   48:newarray        byte[]
	//   22   50:astore_2        
		abyte0[1] = -92;
	//   23   51:aload_2         
	//   24   52:iconst_1        
	//   25   53:bipush          -92
	//   26   55:bastore         
		abyte0[4] = 2;
	//   27   56:aload_2         
	//   28   57:iconst_4        
	//   29   58:iconst_2        
	//   30   59:bastore         
		abyte0[5] = -35;
	//   31   60:aload_2         
	//   32   61:iconst_5        
	//   33   62:bipush          -35
	//   34   64:bastore         
		abyte0[6] = -15;
	//   35   65:aload_2         
	//   36   66:bipush          6
	//   37   68:bipush          -15
	//   38   70:bastore         
		Object obj;
		try
		{
			obj = ((Object) (apduHandler.transceive(abyte0)));
	//   39   71:aload_0         
	//   40   72:getfield        #82  <Field ApduHandler apduHandler>
	//   41   75:aload_2         
	//   42   76:invokeinterface #86  <Method byte[] ApduHandler.transceive(byte[])>
	//   43   81:astore_2        
		}
	//*  44   82:goto            127
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  45   85:astore_2        
		{
			if(fmLog != null)
	//*  46   86:aload_0         
	//*  47   87:getfield        #35  <Field FMLog fmLog>
	//*  48   90:ifnull          125
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C \u9009\u62E9DDF1\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   49   93:aload_0         
	//   50   94:getfield        #35  <Field FMLog fmLog>
	//   51   97:aload_0         
	//   52   98:getfield        #43  <Field String logTag>
	//   53  101:new             #88  <Class StringBuilder>
	//   54  104:dup             
	//   55  105:ldc1            #221 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C \u9009\u62E9DDF1\u5931\u8D25:">
	//   56  107:invokespecial   #93  <Method void StringBuilder(String)>
	//   57  110:aload_2         
	//   58  111:invokestatic    #99  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  114:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   60  117:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   61  120:invokeinterface #224 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//   62  125:aload_1         
	//   63  126:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//*  64  127:aload_2         
	//*  65  128:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  66  131:ifne            136
			return enumcardappstatus;
	//   67  134:aload_1         
	//   68  135:areturn         
		obj = ((Object) (new byte[7]));
	//   69  136:bipush          7
	//   70  138:newarray        byte[]
	//   71  140:astore_2        
		obj[1] = -92;
	//   72  141:aload_2         
	//   73  142:iconst_1        
	//   74  143:bipush          -92
	//   75  145:bastore         
		obj[4] = 2;
	//   76  146:aload_2         
	//   77  147:iconst_4        
	//   78  148:iconst_2        
	//   79  149:bastore         
		obj[5] = -83;
	//   80  150:aload_2         
	//   81  151:iconst_5        
	//   82  152:bipush          -83
	//   83  154:bastore         
		obj[6] = -13;
	//   84  155:aload_2         
	//   85  156:bipush          6
	//   86  158:bipush          -13
	//   87  160:bastore         
		try
		{
			obj = ((Object) (apduHandler.transceive(((byte []) (obj)))));
	//   88  161:aload_0         
	//   89  162:getfield        #82  <Field ApduHandler apduHandler>
	//   90  165:aload_2         
	//   91  166:invokeinterface #86  <Method byte[] ApduHandler.transceive(byte[])>
	//   92  171:astore_2        
		}
	//*  93  172:goto            217
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  94  175:astore_2        
		{
			if(fmLog != null)
	//*  95  176:aload_0         
	//*  96  177:getfield        #35  <Field FMLog fmLog>
	//*  97  180:ifnull          215
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C \u9009\u62E9ADF3\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   98  183:aload_0         
	//   99  184:getfield        #35  <Field FMLog fmLog>
	//  100  187:aload_0         
	//  101  188:getfield        #43  <Field String logTag>
	//  102  191:new             #88  <Class StringBuilder>
	//  103  194:dup             
	//  104  195:ldc1            #226 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C \u9009\u62E9ADF3\u5931\u8D25:">
	//  105  197:invokespecial   #93  <Method void StringBuilder(String)>
	//  106  200:aload_2         
	//  107  201:invokestatic    #99  <Method String Util4Java.getExceptionInfo(Exception)>
	//  108  204:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  109  207:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  110  210:invokeinterface #224 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//  111  215:aload_1         
	//  112  216:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//* 113  217:aload_2         
	//* 114  218:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 115  221:ifne            226
			return enumcardappstatus;
	//  116  224:aload_1         
	//  117  225:areturn         
		obj = ((Object) (new byte[5]));
	//  118  226:iconst_5        
	//  119  227:newarray        byte[]
	//  120  229:astore_2        
		obj[1] = 10;
	//  121  230:aload_2         
	//  122  231:iconst_1        
	//  123  232:bipush          10
	//  124  234:bastore         
		try
		{
			obj = ((Object) (apduHandler.transceive(((byte []) (obj)))));
	//  125  235:aload_0         
	//  126  236:getfield        #82  <Field ApduHandler apduHandler>
	//  127  239:aload_2         
	//  128  240:invokeinterface #86  <Method byte[] ApduHandler.transceive(byte[])>
	//  129  245:astore_2        
		}
	//* 130  246:goto            291
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 131  249:astore_2        
		{
			if(fmLog != null)
	//* 132  250:aload_0         
	//* 133  251:getfield        #35  <Field FMLog fmLog>
	//* 134  254:ifnull          289
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//  135  257:aload_0         
	//  136  258:getfield        #35  <Field FMLog fmLog>
	//  137  261:aload_0         
	//  138  262:getfield        #43  <Field String logTag>
	//  139  265:new             #88  <Class StringBuilder>
	//  140  268:dup             
	//  141  269:ldc1            #228 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:">
	//  142  271:invokespecial   #93  <Method void StringBuilder(String)>
	//  143  274:aload_2         
	//  144  275:invokestatic    #99  <Method String Util4Java.getExceptionInfo(Exception)>
	//  145  278:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  146  281:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  147  284:invokeinterface #224 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//  148  289:aload_1         
	//  149  290:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//* 150  291:aload_2         
	//* 151  292:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 152  295:ifne            300
			return enumcardappstatus;
	//  153  298:aload_1         
	//  154  299:areturn         
		if(obj.length < 5)
	//* 155  300:aload_2         
	//* 156  301:arraylength     
	//* 157  302:iconst_5        
	//* 158  303:icmpge          330
		{
			if(fmLog != null)
	//* 159  306:aload_0         
	//* 160  307:getfield        #35  <Field FMLog fmLog>
	//* 161  310:ifnull          328
				fmLog.error(logTag, "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u4E2A\u4EBA\u5316\u7ED3\u679C\u6307\u4EE4\u54CD\u5E94\u65E0\u6548");
	//  162  313:aload_0         
	//  163  314:getfield        #35  <Field FMLog fmLog>
	//  164  317:aload_0         
	//  165  318:getfield        #43  <Field String logTag>
	//  166  321:ldc1            #230 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u4E2A\u4EBA\u5316\u7ED3\u679C\u6307\u4EE4\u54CD\u5E94\u65E0\u6548">
	//  167  323:invokeinterface #224 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//  168  328:aload_1         
	//  169  329:areturn         
		}
		if(2 == obj[2])
	//* 170  330:iconst_2        
	//* 171  331:aload_2         
	//* 172  332:iconst_2        
	//* 173  333:baload          
	//* 174  334:icmpne          344
			enumcardappstatus = EnumCardAppStatus.STATUS_PERSONALIZED;
	//  175  337:getstatic       #233 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_PERSONALIZED>
	//  176  340:astore_1        
		else
	//* 177  341:goto            346
			return enumcardappstatus;
	//  178  344:aload_1         
	//  179  345:areturn         
		obj = ((Object) (new byte[16]));
	//  180  346:bipush          16
	//  181  348:newarray        byte[]
	//  182  350:astore_2        
		obj[0] = -128;
	//  183  351:aload_2         
	//  184  352:iconst_0        
	//  185  353:bipush          -128
	//  186  355:bastore         
		obj[1] = 80;
	//  187  356:aload_2         
	//  188  357:iconst_1        
	//  189  358:bipush          80
	//  190  360:bastore         
		obj[2] = 1;
	//  191  361:aload_2         
	//  192  362:iconst_2        
	//  193  363:iconst_1        
	//  194  364:bastore         
		obj[3] = 2;
	//  195  365:aload_2         
	//  196  366:iconst_3        
	//  197  367:iconst_2        
	//  198  368:bastore         
		obj[4] = 11;
	//  199  369:aload_2         
	//  200  370:iconst_4        
	//  201  371:bipush          11
	//  202  373:bastore         
		obj[5] = 2;
	//  203  374:aload_2         
	//  204  375:iconst_5        
	//  205  376:iconst_2        
	//  206  377:bastore         
		try
		{
			obj = ((Object) (apduHandler.transceive(((byte []) (obj)))));
	//  207  378:aload_0         
	//  208  379:getfield        #82  <Field ApduHandler apduHandler>
	//  209  382:aload_2         
	//  210  383:invokeinterface #86  <Method byte[] ApduHandler.transceive(byte[])>
	//  211  388:astore_2        
		}
	//* 212  389:goto            434
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 213  392:astore_2        
		{
			if(fmLog != null)
	//* 214  393:aload_0         
	//* 215  394:getfield        #35  <Field FMLog fmLog>
	//* 216  397:ifnull          432
				fmLog.error(logTag, (new StringBuilder("\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//  217  400:aload_0         
	//  218  401:getfield        #35  <Field FMLog fmLog>
	//  219  404:aload_0         
	//  220  405:getfield        #43  <Field String logTag>
	//  221  408:new             #88  <Class StringBuilder>
	//  222  411:dup             
	//  223  412:ldc1            #235 <String "\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:">
	//  224  414:invokespecial   #93  <Method void StringBuilder(String)>
	//  225  417:aload_2         
	//  226  418:invokestatic    #99  <Method String Util4Java.getExceptionInfo(Exception)>
	//  227  421:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  228  424:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  229  427:invokeinterface #224 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//  230  432:aload_1         
	//  231  433:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//* 232  434:aload_2         
	//* 233  435:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 234  438:ifne            443
			return enumcardappstatus;
	//  235  441:aload_1         
	//  236  442:areturn         
		else
			return EnumCardAppStatus.STATUS_ACTIVATE;
	//  237  443:getstatic       #238 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  238  446:areturn         
	}

	public String getTime4Validity()
		throws BusinessException
	{
		byte abyte0[] = new byte[7];
	//    0    0:bipush          7
	//    1    2:newarray        byte[]
	//    2    4:astore_1        
		abyte0[1] = -92;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:bipush          -92
	//    6    9:bastore         
		abyte0[4] = 2;
	//    7   10:aload_1         
	//    8   11:iconst_4        
	//    9   12:iconst_2        
	//   10   13:bastore         
		abyte0[5] = -35;
	//   11   14:aload_1         
	//   12   15:iconst_5        
	//   13   16:bipush          -35
	//   14   18:bastore         
		abyte0[6] = -15;
	//   15   19:aload_1         
	//   16   20:bipush          6
	//   17   22:bipush          -15
	//   18   24:bastore         
		abyte0 = transceive(abyte0);
	//   19   25:aload_0         
	//   20   26:aload_1         
	//   21   27:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   22   30:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  23   31:aload_1         
	//*  24   32:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  25   35:ifne            90
		{
			if(fmLog != null)
	//*  26   38:aload_0         
	//*  27   39:getfield        #35  <Field FMLog fmLog>
	//*  28   42:ifnull          77
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   29   45:aload_0         
	//   30   46:getfield        #35  <Field FMLog fmLog>
	//   31   49:aload_0         
	//   32   50:getfield        #43  <Field String logTag>
	//   33   53:new             #88  <Class StringBuilder>
	//   34   56:dup             
	//   35   57:ldc1            #241 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A">
	//   36   59:invokespecial   #93  <Method void StringBuilder(String)>
	//   37   62:aload_1         
	//   38   63:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   39   66:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   40   69:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   41   72:invokeinterface #224 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   42   77:new             #78  <Class BusinessException>
	//   43   80:dup             
	//   44   81:ldc1            #243 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   45   83:getstatic       #121 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   46   86:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47   89:athrow          
		}
		abyte0 = new byte[5];
	//   48   90:iconst_5        
	//   49   91:newarray        byte[]
	//   50   93:astore_1        
		abyte0[1] = -80;
	//   51   94:aload_1         
	//   52   95:iconst_1        
	//   53   96:bipush          -80
	//   54   98:bastore         
		abyte0[2] = -107;
	//   55   99:aload_1         
	//   56  100:iconst_2        
	//   57  101:bipush          -107
	//   58  103:bastore         
		abyte0 = transceive(abyte0);
	//   59  104:aload_0         
	//   60  105:aload_1         
	//   61  106:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   62  109:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  63  110:aload_1         
	//*  64  111:invokestatic    #149 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  65  114:ifne            169
		{
			if(fmLog != null)
	//*  66  117:aload_0         
	//*  67  118:getfield        #35  <Field FMLog fmLog>
	//*  68  121:ifnull          156
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   69  124:aload_0         
	//   70  125:getfield        #35  <Field FMLog fmLog>
	//   71  128:aload_0         
	//   72  129:getfield        #43  <Field String logTag>
	//   73  132:new             #88  <Class StringBuilder>
	//   74  135:dup             
	//   75  136:ldc1            #245 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//   76  138:invokespecial   #93  <Method void StringBuilder(String)>
	//   77  141:aload_1         
	//   78  142:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   79  145:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   80  148:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   81  151:invokeinterface #224 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   82  156:new             #78  <Class BusinessException>
	//   83  159:dup             
	//   84  160:ldc1            #247 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//   85  162:getstatic       #121 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   86  165:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   87  168:athrow          
		}
		if(abyte0.length < 31)
	//*  88  169:aload_1         
	//*  89  170:arraylength     
	//*  90  171:bipush          31
	//*  91  173:icmpge          228
		{
			if(fmLog != null)
	//*  92  176:aload_0         
	//*  93  177:getfield        #35  <Field FMLog fmLog>
	//*  94  180:ifnull          215
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   95  183:aload_0         
	//   96  184:getfield        #35  <Field FMLog fmLog>
	//   97  187:aload_0         
	//   98  188:getfield        #43  <Field String logTag>
	//   99  191:new             #88  <Class StringBuilder>
	//  100  194:dup             
	//  101  195:ldc1            #245 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//  102  197:invokespecial   #93  <Method void StringBuilder(String)>
	//  103  200:aload_1         
	//  104  201:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  105  204:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  106  207:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  107  210:invokeinterface #224 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  108  215:new             #78  <Class BusinessException>
	//  109  218:dup             
	//  110  219:ldc1            #247 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//  111  221:getstatic       #121 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  112  224:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  227:athrow          
		} else
		{
			return FM_Bytes.bytesToHexString(new byte[] {
				abyte0[27], abyte0[28], abyte0[29], abyte0[30]
			});
	//  114  228:iconst_4        
	//  115  229:newarray        byte[]
	//  116  231:dup             
	//  117  232:iconst_0        
	//  118  233:aload_1         
	//  119  234:bipush          27
	//  120  236:baload          
	//  121  237:bastore         
	//  122  238:dup             
	//  123  239:iconst_1        
	//  124  240:aload_1         
	//  125  241:bipush          28
	//  126  243:baload          
	//  127  244:bastore         
	//  128  245:dup             
	//  129  246:iconst_2        
	//  130  247:aload_1         
	//  131  248:bipush          29
	//  132  250:baload          
	//  133  251:bastore         
	//  134  252:dup             
	//  135  253:iconst_3        
	//  136  254:aload_1         
	//  137  255:bipush          30
	//  138  257:baload          
	//  139  258:bastore         
	//  140  259:invokestatic    #179 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  141  262:areturn         
		}
	}

	public boolean isLock4Consume()
		throws BusinessException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLock4Load()
		throws BusinessException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int queryBalance()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #35  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #35  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.debug(logTag, "LNT queryBalance...");
	//   10   24:aload_0         
	//   11   25:getfield        #35  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field String logTag>
	//   14   32:ldc1            #254 <String "LNT queryBalance...">
	//   15   34:invokeinterface #137 <Method void FMLog.debug(String, String)>
		if(apduHandler == null)
	//*  16   39:aload_0         
	//*  17   40:getfield        #82  <Field ApduHandler apduHandler>
	//*  18   43:ifnonnull       83
		{
			if(fmLog != null)
	//*  19   46:aload_0         
	//*  20   47:getfield        #35  <Field FMLog fmLog>
	//*  21   50:ifnull          69
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   53:aload_0         
	//   23   54:getfield        #35  <Field FMLog fmLog>
	//   24   57:aload_0         
	//   25   58:getfield        #43  <Field String logTag>
	//   26   61:ldc2            #256 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   64:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   69:new             #78  <Class BusinessException>
	//   29   72:dup             
	//   30   73:ldc2            #256 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   76:getstatic       #142 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   79:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   82:athrow          
		}
		byte abyte0[] = new byte[7];
	//   34   83:bipush          7
	//   35   85:newarray        byte[]
	//   36   87:astore_1        
		abyte0[1] = -92;
	//   37   88:aload_1         
	//   38   89:iconst_1        
	//   39   90:bipush          -92
	//   40   92:bastore         
		abyte0[4] = 2;
	//   41   93:aload_1         
	//   42   94:iconst_4        
	//   43   95:iconst_2        
	//   44   96:bastore         
		abyte0[5] = -35;
	//   45   97:aload_1         
	//   46   98:iconst_5        
	//   47   99:bipush          -35
	//   48  101:bastore         
		abyte0[6] = -15;
	//   49  102:aload_1         
	//   50  103:bipush          6
	//   51  105:bipush          -15
	//   52  107:bastore         
		transceive(abyte0);
	//   53  108:aload_0         
	//   54  109:aload_1         
	//   55  110:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   56  113:pop             
		abyte0 = new byte[7];
	//   57  114:bipush          7
	//   58  116:newarray        byte[]
	//   59  118:astore_1        
		abyte0[1] = -92;
	//   60  119:aload_1         
	//   61  120:iconst_1        
	//   62  121:bipush          -92
	//   63  123:bastore         
		abyte0[4] = 2;
	//   64  124:aload_1         
	//   65  125:iconst_4        
	//   66  126:iconst_2        
	//   67  127:bastore         
		abyte0[5] = -83;
	//   68  128:aload_1         
	//   69  129:iconst_5        
	//   70  130:bipush          -83
	//   71  132:bastore         
		abyte0[6] = -13;
	//   72  133:aload_1         
	//   73  134:bipush          6
	//   74  136:bipush          -13
	//   75  138:bastore         
		transceive(abyte0);
	//   76  139:aload_0         
	//   77  140:aload_1         
	//   78  141:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   79  144:pop             
		abyte0 = new byte[17];
	//   80  145:bipush          17
	//   81  147:newarray        byte[]
	//   82  149:astore_1        
		abyte0[0] = -128;
	//   83  150:aload_1         
	//   84  151:iconst_0        
	//   85  152:bipush          -128
	//   86  154:bastore         
		abyte0[1] = 80;
	//   87  155:aload_1         
	//   88  156:iconst_1        
	//   89  157:bipush          80
	//   90  159:bastore         
		abyte0[2] = 3;
	//   91  160:aload_1         
	//   92  161:iconst_2        
	//   93  162:iconst_3        
	//   94  163:bastore         
		abyte0[3] = 2;
	//   95  164:aload_1         
	//   96  165:iconst_3        
	//   97  166:iconst_2        
	//   98  167:bastore         
		abyte0[4] = 11;
	//   99  168:aload_1         
	//  100  169:iconst_4        
	//  101  170:bipush          11
	//  102  172:bastore         
		abyte0[5] = 1;
	//  103  173:aload_1         
	//  104  174:iconst_5        
	//  105  175:iconst_1        
	//  106  176:bastore         
		abyte0[16] = 15;
	//  107  177:aload_1         
	//  108  178:bipush          16
	//  109  180:bipush          15
	//  110  182:bastore         
		abyte0 = transceive(abyte0);
	//  111  183:aload_0         
	//  112  184:aload_1         
	//  113  185:invokespecial   #143 <Method byte[] transceive(byte[])>
	//  114  188:astore_1        
		if(abyte0.length < 9)
	//* 115  189:aload_1         
	//* 116  190:arraylength     
	//* 117  191:bipush          9
	//* 118  193:icmpge          233
		{
			if(fmLog != null)
	//* 119  196:aload_0         
	//* 120  197:getfield        #35  <Field FMLog fmLog>
	//* 121  200:ifnull          219
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548");
	//  122  203:aload_0         
	//  123  204:getfield        #35  <Field FMLog fmLog>
	//  124  207:aload_0         
	//  125  208:getfield        #43  <Field String logTag>
	//  126  211:ldc2            #258 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548">
	//  127  214:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_fail);
	//  128  219:new             #78  <Class BusinessException>
	//  129  222:dup             
	//  130  223:ldc2            #260 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548">
	//  131  226:getstatic       #263 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_fail>
	//  132  229:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  133  232:athrow          
		} else
		{
			return FM_Bytes.bytesToInt(Arrays.copyOf(abyte0, 4)) - FM_Bytes.bytesToInt(new byte[] {
				abyte0[6], abyte0[7], abyte0[8]
			});
	//  134  233:aload_1         
	//  135  234:iconst_4        
	//  136  235:invokestatic    #267 <Method byte[] Arrays.copyOf(byte[], int)>
	//  137  238:invokestatic    #171 <Method int FM_Bytes.bytesToInt(byte[])>
	//  138  241:iconst_3        
	//  139  242:newarray        byte[]
	//  140  244:dup             
	//  141  245:iconst_0        
	//  142  246:aload_1         
	//  143  247:bipush          6
	//  144  249:baload          
	//  145  250:bastore         
	//  146  251:dup             
	//  147  252:iconst_1        
	//  148  253:aload_1         
	//  149  254:bipush          7
	//  150  256:baload          
	//  151  257:bastore         
	//  152  258:dup             
	//  153  259:iconst_2        
	//  154  260:aload_1         
	//  155  261:bipush          8
	//  156  263:baload          
	//  157  264:bastore         
	//  158  265:invokestatic    #171 <Method int FM_Bytes.bytesToInt(byte[])>
	//  159  268:isub            
	//  160  269:ireturn         
		}
	}

	public List readAppRecords()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #35  <Field FMLog fmLog>
		ArrayList arraylist = new ArrayList();
	//    7   17:new             #271 <Class ArrayList>
	//    8   20:dup             
	//    9   21:invokespecial   #272 <Method void ArrayList()>
	//   10   24:astore_2        
		if(fmLog != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #35  <Field FMLog fmLog>
	//*  13   29:ifnull          48
			fmLog.debug(logTag, "LNT readAppRecords...");
	//   14   32:aload_0         
	//   15   33:getfield        #35  <Field FMLog fmLog>
	//   16   36:aload_0         
	//   17   37:getfield        #43  <Field String logTag>
	//   18   40:ldc2            #274 <String "LNT readAppRecords...">
	//   19   43:invokeinterface #137 <Method void FMLog.debug(String, String)>
		if(apduHandler == null)
	//*  20   48:aload_0         
	//*  21   49:getfield        #82  <Field ApduHandler apduHandler>
	//*  22   52:ifnonnull       92
		{
			if(fmLog != null)
	//*  23   55:aload_0         
	//*  24   56:getfield        #35  <Field FMLog fmLog>
	//*  25   59:ifnull          78
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   26   62:aload_0         
	//   27   63:getfield        #35  <Field FMLog fmLog>
	//   28   66:aload_0         
	//   29   67:getfield        #43  <Field String logTag>
	//   30   70:ldc2            #276 <String "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   73:invokeinterface #112 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   32   78:new             #78  <Class BusinessException>
	//   33   81:dup             
	//   34   82:ldc2            #276 <String "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   35   85:getstatic       #142 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   36   88:invokespecial   #124 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   37   91:athrow          
		}
		byte abyte0[] = new byte[7];
	//   38   92:bipush          7
	//   39   94:newarray        byte[]
	//   40   96:astore_3        
		abyte0[1] = -92;
	//   41   97:aload_3         
	//   42   98:iconst_1        
	//   43   99:bipush          -92
	//   44  101:bastore         
		abyte0[4] = 2;
	//   45  102:aload_3         
	//   46  103:iconst_4        
	//   47  104:iconst_2        
	//   48  105:bastore         
		abyte0[5] = -35;
	//   49  106:aload_3         
	//   50  107:iconst_5        
	//   51  108:bipush          -35
	//   52  110:bastore         
		abyte0[6] = -15;
	//   53  111:aload_3         
	//   54  112:bipush          6
	//   55  114:bipush          -15
	//   56  116:bastore         
		transceive(abyte0);
	//   57  117:aload_0         
	//   58  118:aload_3         
	//   59  119:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   60  122:pop             
		abyte0 = new byte[7];
	//   61  123:bipush          7
	//   62  125:newarray        byte[]
	//   63  127:astore_3        
		abyte0[1] = -92;
	//   64  128:aload_3         
	//   65  129:iconst_1        
	//   66  130:bipush          -92
	//   67  132:bastore         
		abyte0[4] = 2;
	//   68  133:aload_3         
	//   69  134:iconst_4        
	//   70  135:iconst_2        
	//   71  136:bastore         
		abyte0[5] = -83;
	//   72  137:aload_3         
	//   73  138:iconst_5        
	//   74  139:bipush          -83
	//   75  141:bastore         
		abyte0[6] = -13;
	//   76  142:aload_3         
	//   77  143:bipush          6
	//   78  145:bipush          -13
	//   79  147:bastore         
		transceive(abyte0);
	//   80  148:aload_0         
	//   81  149:aload_3         
	//   82  150:invokespecial   #143 <Method byte[] transceive(byte[])>
	//   83  153:pop             
		abyte0 = new byte[7];
	//   84  154:bipush          7
	//   85  156:newarray        byte[]
	//   86  158:astore_3        
		abyte0[1] = -92;
	//   87  159:aload_3         
	//   88  160:iconst_1        
	//   89  161:bipush          -92
	//   90  163:bastore         
		abyte0[4] = 2;
	//   91  164:aload_3         
	//   92  165:iconst_4        
	//   93  166:iconst_2        
	//   94  167:bastore         
		abyte0[6] = 24;
	//   95  168:aload_3         
	//   96  169:bipush          6
	//   97  171:bipush          24
	//   98  173:bastore         
		transceive(abyte0);
	//   99  174:aload_0         
	//  100  175:aload_3         
	//  101  176:invokespecial   #143 <Method byte[] transceive(byte[])>
	//  102  179:pop             
		for(int i = 1; i <= 10; i++)
	//* 103  180:iconst_1        
	//* 104  181:istore_1        
	//* 105  182:goto            272
		{
			byte abyte1[] = new byte[5];
	//  106  185:iconst_5        
	//  107  186:newarray        byte[]
	//  108  188:astore_3        
			abyte1[1] = -78;
	//  109  189:aload_3         
	//  110  190:iconst_1        
	//  111  191:bipush          -78
	//  112  193:bastore         
			abyte1[2] = (byte)i;
	//  113  194:aload_3         
	//  114  195:iconst_2        
	//  115  196:iload_1         
	//  116  197:int2byte        
	//  117  198:bastore         
			abyte1[3] = 4;
	//  118  199:aload_3         
	//  119  200:iconst_3        
	//  120  201:iconst_4        
	//  121  202:bastore         
			abyte1 = transceive(abyte1);
	//  122  203:aload_0         
	//  123  204:aload_3         
	//  124  205:invokespecial   #143 <Method byte[] transceive(byte[])>
	//  125  208:astore_3        
			byte abyte2[] = Arrays.copyOfRange(abyte1, abyte1.length - 2, abyte1.length);
	//  126  209:aload_3         
	//  127  210:aload_3         
	//  128  211:arraylength     
	//  129  212:iconst_2        
	//  130  213:isub            
	//  131  214:aload_3         
	//  132  215:arraylength     
	//  133  216:invokestatic    #160 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  134  219:astore          4
			if(Arrays.equals(new byte[] {
	106, -125
}, abyte2))
	//* 135  221:iconst_2        
	//* 136  222:newarray        byte[]
	//* 137  224:dup             
	//* 138  225:iconst_0        
	//* 139  226:ldc2            #277 <Int 106>
	//* 140  229:bastore         
	//* 141  230:dup             
	//* 142  231:iconst_1        
	//* 143  232:ldc2            #278 <Int -125>
	//* 144  235:bastore         
	//* 145  236:aload           4
	//* 146  238:invokestatic    #282 <Method boolean Arrays.equals(byte[], byte[])>
	//* 147  241:ifeq            246
				return ((List) (arraylist));
	//  148  244:aload_2         
	//  149  245:areturn         
			if(abyte1.length >= 23)
	//* 150  246:aload_3         
	//* 151  247:arraylength     
	//* 152  248:bipush          23
	//* 153  250:icmpge          256
	//* 154  253:goto            268
				((List) (arraylist)).add(((Object) (getAppRecord4bytes(abyte1))));
	//  155  256:aload_2         
	//  156  257:aload_0         
	//  157  258:aload_3         
	//  158  259:invokevirtual   #284 <Method CardAppRecord getAppRecord4bytes(byte[])>
	//  159  262:invokeinterface #290 <Method boolean List.add(Object)>
	//  160  267:pop             
		}

	//  161  268:iload_1         
	//  162  269:iconst_1        
	//  163  270:iadd            
	//  164  271:istore_1        
	//  165  272:iload_1         
	//  166  273:bipush          10
	//  167  275:icmple          185
		return ((List) (arraylist));
	//  168  278:aload_2         
	//  169  279:areturn         
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandler = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field ApduHandler apduHandler>
	//    3    5:return          
	}

	private final int BYTE_COUNT_18 = 23;
	private final int MAX_LOG = 10;
	private final byte PERSONALIZE_SUCESS_FLAG = 2;
	private final byte aid[] = {
		89, 67, 84, 46, 85, 83, 69, 82
	};
	private ApduHandler apduHandler;
	FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/card/core/LntAppManager)).getName();
}
