// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.card.core;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.tsm.business.bean.CardAppRecord;
import cn.com.fmsh.tsm.business.card.CardTools;
import cn.com.fmsh.tsm.business.card.base.CardManager;
import cn.com.fmsh.tsm.business.enums.EnumCardAppStatus;
import cn.com.fmsh.tsm.business.enums.EnumTradeType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShTourAppManager
	implements CardManager
{

	public ShTourAppManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #35  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class ShTourAppManager>
	//    8   17:invokevirtual   #41  <Method String Class.getName()>
	//    9   20:putfield        #43  <Field String logTag>
		byte abyte0[] = new byte[9];
	//   10   23:bipush          9
	//   11   25:newarray        byte[]
	//   12   27:astore_1        
		abyte0[0] = -96;
	//   13   28:aload_1         
	//   14   29:iconst_0        
	//   15   30:bipush          -96
	//   16   32:bastore         
		abyte0[4] = 3;
	//   17   33:aload_1         
	//   18   34:iconst_4        
	//   19   35:iconst_3        
	//   20   36:bastore         
		abyte0[5] = -122;
	//   21   37:aload_1         
	//   22   38:iconst_5        
	//   23   39:bipush          -122
	//   24   41:bastore         
		abyte0[6] = -104;
	//   25   42:aload_1         
	//   26   43:bipush          6
	//   27   45:bipush          -104
	//   28   47:bastore         
		abyte0[7] = 7;
	//   29   48:aload_1         
	//   30   49:bipush          7
	//   31   51:bipush          7
	//   32   53:bastore         
		abyte0[8] = 1;
	//   33   54:aload_1         
	//   34   55:bipush          8
	//   35   57:iconst_1        
	//   36   58:bastore         
		aid = abyte0;
	//   37   59:aload_0         
	//   38   60:aload_1         
	//   39   61:putfield        #45  <Field byte[] aid>
	//   40   64:aload_0         
	//   41   65:bipush          10
	//   42   67:putfield        #47  <Field int MAX_LOG>
	//   43   70:aload_0         
	//   44   71:bipush          23
	//   45   73:putfield        #49  <Field int BYTE_COUNT_18>
	//   46   76:aload_0         
	//   47   77:iconst_0        
	//   48   78:putfield        #51  <Field byte LOCK>
	//   49   81:return          
	}

	private EnumTradeType get07TradeType(byte byte0)
	{
		switch(byte0)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    21: default 180
	//	               -125: 254
	//	               -107: 258
	//	               -103: 262
	//	               1: 182
	//	               3: 186
	//	               5: 190
	//	               6: 194
	//	               7: 198
	//	               9: 202
	//	               17: 206
	//	               20: 210
	//	               32: 214
	//	               34: 218
	//	               49: 222
	//	               52: 226
	//	               65: 230
	//	               66: 234
	//	               81: 238
	//	               82: 242
	//	               99: 246
	//	               104: 250
		default:
			return null;
	//    2  180:aconst_null     
	//    3  181:areturn         

		case 1: // '\001'
			return EnumTradeType.bus;
	//    4  182:getstatic       #60  <Field EnumTradeType EnumTradeType.bus>
	//    5  185:areturn         

		case 3: // '\003'
			return EnumTradeType.onlineRecharge;
	//    6  186:getstatic       #63  <Field EnumTradeType EnumTradeType.onlineRecharge>
	//    7  189:areturn         

		case 5: // '\005'
			return EnumTradeType.bus;
	//    8  190:getstatic       #60  <Field EnumTradeType EnumTradeType.bus>
	//    9  193:areturn         

		case 6: // '\006'
			return EnumTradeType.subwayConsumption;
	//   10  194:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   11  197:areturn         

		case 7: // '\007'
			return EnumTradeType.subwayConsumption;
	//   12  198:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   13  201:areturn         

		case 9: // '\t'
			return EnumTradeType.bus;
	//   14  202:getstatic       #60  <Field EnumTradeType EnumTradeType.bus>
	//   15  205:areturn         

		case 17: // '\021'
			return EnumTradeType.subwayConsumption;
	//   16  206:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   17  209:areturn         

		case 20: // '\024'
			return EnumTradeType.subwayUpdate;
	//   18  210:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayUpdate>
	//   19  213:areturn         

		case 32: // ' '
			return EnumTradeType.maglev;
	//   20  214:getstatic       #72  <Field EnumTradeType EnumTradeType.maglev>
	//   21  217:areturn         

		case 34: // '"'
			return EnumTradeType.recharge;
	//   22  218:getstatic       #75  <Field EnumTradeType EnumTradeType.recharge>
	//   23  221:areturn         

		case 49: // '1'
			return EnumTradeType.ferry;
	//   24  222:getstatic       #78  <Field EnumTradeType EnumTradeType.ferry>
	//   25  225:areturn         

		case 52: // '4'
			return EnumTradeType.subwayConsumption;
	//   26  226:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   27  229:areturn         

		case 65: // 'A'
			return EnumTradeType.taxi;
	//   28  230:getstatic       #81  <Field EnumTradeType EnumTradeType.taxi>
	//   29  233:areturn         

		case 66: // 'B'
			return EnumTradeType.taxi;
	//   30  234:getstatic       #81  <Field EnumTradeType EnumTradeType.taxi>
	//   31  237:areturn         

		case 81: // 'Q'
			return EnumTradeType.expressway;
	//   32  238:getstatic       #84  <Field EnumTradeType EnumTradeType.expressway>
	//   33  241:areturn         

		case 82: // 'R'
			return EnumTradeType.park;
	//   34  242:getstatic       #87  <Field EnumTradeType EnumTradeType.park>
	//   35  245:areturn         

		case 99: // 'c'
			return EnumTradeType.gasStation;
	//   36  246:getstatic       #90  <Field EnumTradeType EnumTradeType.gasStation>
	//   37  249:areturn         

		case 104: // 'h'
			return EnumTradeType.onlineConsumption;
	//   38  250:getstatic       #93  <Field EnumTradeType EnumTradeType.onlineConsumption>
	//   39  253:areturn         

		case -125: 
			return EnumTradeType.recharge;
	//   40  254:getstatic       #75  <Field EnumTradeType EnumTradeType.recharge>
	//   41  257:areturn         

		case -107: 
			return EnumTradeType.onlineRecharge;
	//   42  258:getstatic       #63  <Field EnumTradeType EnumTradeType.onlineRecharge>
	//   43  261:areturn         

		case -103: 
			return EnumTradeType.onlineRecharge;
	//   44  262:getstatic       #63  <Field EnumTradeType EnumTradeType.onlineRecharge>
	//   45  265:areturn         
		}
	}

	private EnumTradeType get18TradeType(byte byte0, byte byte1)
	{
		EnumTradeType enumtradetype = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		switch(byte0)
	//*   2    2:iload_1         
		{
	//*   3    3:lookupswitch    13: default 116
	//	               -125: 203
	//	               1: 126
	//	               5: 133
	//	               9: 140
	//	               17: 119
	//	               20: 147
	//	               32: 154
	//	               34: 161
	//	               49: 168
	//	               65: 175
	//	               81: 182
	//	               82: 189
	//	               99: 196
	//*   4  116:goto            207
		case 17: // '\021'
			enumtradetype = EnumTradeType.subwayConsumption;
	//    5  119:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//    6  122:astore_3        
			break;

	//*   7  123:goto            207
		case 1: // '\001'
			enumtradetype = EnumTradeType.subwayConsumption;
	//    8  126:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//    9  129:astore_3        
			break;

	//*  10  130:goto            207
		case 5: // '\005'
			enumtradetype = EnumTradeType.subwayConsumption;
	//   11  133:getstatic       #66  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   12  136:astore_3        
			break;

	//*  13  137:goto            207
		case 9: // '\t'
			enumtradetype = EnumTradeType.bus;
	//   14  140:getstatic       #60  <Field EnumTradeType EnumTradeType.bus>
	//   15  143:astore_3        
			break;

	//*  16  144:goto            207
		case 20: // '\024'
			enumtradetype = EnumTradeType.subwayUpdate;
	//   17  147:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayUpdate>
	//   18  150:astore_3        
			break;

	//*  19  151:goto            207
		case 32: // ' '
			enumtradetype = EnumTradeType.maglev;
	//   20  154:getstatic       #72  <Field EnumTradeType EnumTradeType.maglev>
	//   21  157:astore_3        
			break;

	//*  22  158:goto            207
		case 34: // '"'
			enumtradetype = EnumTradeType.recharge;
	//   23  161:getstatic       #75  <Field EnumTradeType EnumTradeType.recharge>
	//   24  164:astore_3        
			break;

	//*  25  165:goto            207
		case 49: // '1'
			enumtradetype = EnumTradeType.ferry;
	//   26  168:getstatic       #78  <Field EnumTradeType EnumTradeType.ferry>
	//   27  171:astore_3        
			break;

	//*  28  172:goto            207
		case 65: // 'A'
			enumtradetype = EnumTradeType.taxi;
	//   29  175:getstatic       #81  <Field EnumTradeType EnumTradeType.taxi>
	//   30  178:astore_3        
			break;

	//*  31  179:goto            207
		case 81: // 'Q'
			enumtradetype = EnumTradeType.expressway;
	//   32  182:getstatic       #84  <Field EnumTradeType EnumTradeType.expressway>
	//   33  185:astore_3        
			break;

	//*  34  186:goto            207
		case 82: // 'R'
			enumtradetype = EnumTradeType.park;
	//   35  189:getstatic       #87  <Field EnumTradeType EnumTradeType.park>
	//   36  192:astore_3        
			break;

	//*  37  193:goto            207
		case 99: // 'c'
			enumtradetype = EnumTradeType.gasStation;
	//   38  196:getstatic       #90  <Field EnumTradeType EnumTradeType.gasStation>
	//   39  199:astore_3        
			break;

	//*  40  200:goto            207
		case -125: 
			enumtradetype = EnumTradeType.recharge;
	//   41  203:getstatic       #75  <Field EnumTradeType EnumTradeType.recharge>
	//   42  206:astore_3        
			break;
		}
		EnumTradeType enumtradetype1 = enumtradetype;
	//   43  207:aload_3         
	//   44  208:astore          4
		if(enumtradetype == null)
	//*  45  210:aload_3         
	//*  46  211:ifnonnull       260
			switch(byte1)
	//*  47  214:iload_2         
			{
	//*  48  215:lookupswitch    3: default 248
	//	               2: 251
	//	               6: 255
	//	               9: 255
	//*  49  248:goto            255
			case 2: // '\002'
				return EnumTradeType.recharge;
	//   50  251:getstatic       #75  <Field EnumTradeType EnumTradeType.recharge>
	//   51  254:areturn         

			case 6: // '\006'
			case 9: // '\t'
			default:
				enumtradetype1 = EnumTradeType.elseTrade;
	//   52  255:getstatic       #98  <Field EnumTradeType EnumTradeType.elseTrade>
	//   53  258:astore          4
				break;
			}
		return enumtradetype1;
	//   54  260:aload           4
	//   55  262:areturn         
	}

	private byte[] transceive(byte abyte0[])
		throws BusinessException
	{
		try
		{
			abyte0 = apduHandler.transceive(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ApduHandler apduHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #110 <Method byte[] ApduHandler.transceive(byte[])>
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
	//   14   30:new             #112 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:ldc1            #114 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   17   36:invokespecial   #117 <Method void StringBuilder(String)>
	//   18   39:aload_1         
	//   19   40:invokestatic    #123 <Method String Util4Java.getExceptionInfo(Exception)>
	//   20   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   22   49:invokeinterface #136 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  23   54:aload_0         
	//*  24   55:getfield        #106 <Field ApduHandler apduHandler>
	//*  25   58:ifnull          70
				apduHandler.close();
	//   26   61:aload_0         
	//   27   62:getfield        #106 <Field ApduHandler apduHandler>
	//   28   65:invokeinterface #139 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   29   70:new             #102 <Class BusinessException>
	//   30   73:dup             
	//   31   74:ldc1            #114 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   32   76:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   33   79:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//   48  108:ldc1            #150 <String "Apdu\u6307\u4EE4\u6267\u884C\u7ED3\u679C\u4E3A\u7A7A">
	//   49  110:invokeinterface #136 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  50  115:aload_0         
	//*  51  116:getfield        #106 <Field ApduHandler apduHandler>
	//*  52  119:ifnull          131
				apduHandler.close();
	//   53  122:aload_0         
	//   54  123:getfield        #106 <Field ApduHandler apduHandler>
	//   55  126:invokeinterface #139 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   56  131:new             #102 <Class BusinessException>
	//   57  134:dup             
	//   58  135:ldc1            #152 <String "Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548">
	//   59  137:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   60  140:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//    1    1:getfield        #45  <Field byte[] aid>
	//    2    4:areturn         
	}

	public byte[] getAppNo()
		throws BusinessException
	{
		byte abyte0[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		if(fmLog != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field FMLog fmLog>
	//*   5    9:ifnull          27
			fmLog.info(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ...");
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field FMLog fmLog>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field String logTag>
	//   10   20:ldc1            #158 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ...">
	//   11   22:invokeinterface #161 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #106 <Field ApduHandler apduHandler>
	//*  14   31:ifnonnull       105
		{
			if(fmLog != null)
	//*  15   34:aload_0         
	//*  16   35:getfield        #35  <Field FMLog fmLog>
	//*  17   38:ifnull          74
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   18   41:aload_0         
	//   19   42:getfield        #35  <Field FMLog fmLog>
	//   20   45:aload_0         
	//   21   46:getfield        #43  <Field String logTag>
	//   22   49:new             #112 <Class StringBuilder>
	//   23   52:dup             
	//   24   53:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//   25   55:invokestatic    #169 <Method String String.valueOf(Object)>
	//   26   58:invokespecial   #117 <Method void StringBuilder(String)>
	//   27   61:ldc1            #171 <String "\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   28   63:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   66:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   30   69:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   31   74:new             #102 <Class BusinessException>
	//   32   77:dup             
	//   33   78:new             #112 <Class StringBuilder>
	//   34   81:dup             
	//   35   82:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//   36   84:invokestatic    #169 <Method String String.valueOf(Object)>
	//   37   87:invokespecial   #117 <Method void StringBuilder(String)>
	//   38   90:ldc1            #171 <String "\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   39   92:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   40   95:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   41   98:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   42  101:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   43  104:athrow          
		}
		byte abyte1[] = new byte[7];
	//   44  105:bipush          7
	//   45  107:newarray        byte[]
	//   46  109:astore_3        
		abyte1[1] = -92;
	//   47  110:aload_3         
	//   48  111:iconst_1        
	//   49  112:bipush          -92
	//   50  114:bastore         
		abyte1[4] = 2;
	//   51  115:aload_3         
	//   52  116:iconst_4        
	//   53  117:iconst_2        
	//   54  118:bastore         
		abyte1[5] = 63;
	//   55  119:aload_3         
	//   56  120:iconst_5        
	//   57  121:bipush          63
	//   58  123:bastore         
		abyte1[6] = 1;
	//   59  124:aload_3         
	//   60  125:bipush          6
	//   61  127:iconst_1        
	//   62  128:bastore         
		abyte1 = transceive(abyte1);
	//   63  129:aload_0         
	//   64  130:aload_3         
	//   65  131:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   66  134:astore_3        
		if(FM_Bytes.isEnd9000(abyte1))
	//*  67  135:aload_3         
	//*  68  136:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  69  139:ifeq            291
		{
			if(abyte1.length >= 42)
	//*  70  142:aload_3         
	//*  71  143:arraylength     
	//*  72  144:bipush          42
	//*  73  146:icmplt          164
			{
				int i = abyte0.length;
	//   74  149:aload_2         
	//   75  150:arraylength     
	//   76  151:istore_1        
				System.arraycopy(((Object) (abyte1)), 34, ((Object) (abyte0)), 0, 8);
	//   77  152:aload_3         
	//   78  153:bipush          34
	//   79  155:aload_2         
	//   80  156:iconst_0        
	//   81  157:bipush          8
	//   82  159:invokestatic    #187 <Method void System.arraycopy(Object, int, Object, int, int)>
				return abyte0;
	//   83  162:aload_2         
	//   84  163:areturn         
			}
			abyte1 = new byte[5];
	//   85  164:iconst_5        
	//   86  165:newarray        byte[]
	//   87  167:astore_3        
			abyte1[1] = -80;
	//   88  168:aload_3         
	//   89  169:iconst_1        
	//   90  170:bipush          -80
	//   91  172:bastore         
			abyte1[2] = -107;
	//   92  173:aload_3         
	//   93  174:iconst_2        
	//   94  175:bipush          -107
	//   95  177:bastore         
			abyte1 = transceive(abyte1);
	//   96  178:aload_0         
	//   97  179:aload_3         
	//   98  180:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   99  183:astore_3        
			if(FM_Bytes.isEnd9000(abyte1))
	//* 100  184:aload_3         
	//* 101  185:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 102  188:ifeq            213
				if(abyte1.length >= 20)
	//* 103  191:aload_3         
	//* 104  192:arraylength     
	//* 105  193:bipush          20
	//* 106  195:icmplt          369
				{
					int j = abyte0.length;
	//  107  198:aload_2         
	//  108  199:arraylength     
	//  109  200:istore_1        
					System.arraycopy(((Object) (abyte1)), 12, ((Object) (abyte0)), 0, 8);
	//  110  201:aload_3         
	//  111  202:bipush          12
	//  112  204:aload_2         
	//  113  205:iconst_0        
	//  114  206:bipush          8
	//  115  208:invokestatic    #187 <Method void System.arraycopy(Object, int, Object, int, int)>
					return abyte0;
	//  116  211:aload_2         
	//  117  212:areturn         
				} else
	//* 118  213:aload_0         
	//* 119  214:getfield        #35  <Field FMLog fmLog>
	//* 120  217:ifnull          260
	//* 121  220:aload_0         
	//* 122  221:getfield        #35  <Field FMLog fmLog>
	//* 123  224:aload_0         
	//* 124  225:getfield        #43  <Field String logTag>
	//* 125  228:new             #112 <Class StringBuilder>
	//* 126  231:dup             
	//* 127  232:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//* 128  234:invokestatic    #169 <Method String String.valueOf(Object)>
	//* 129  237:invokespecial   #117 <Method void StringBuilder(String)>
	//* 130  240:ldc1            #189 <String "\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38:">
	//* 131  242:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 132  245:aload_3         
	//* 133  246:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//* 134  249:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 135  252:invokevirtual   #130 <Method String StringBuilder.toString()>
	//* 136  255:invokeinterface #136 <Method void FMLog.warn(String, String)>
	//* 137  260:new             #102 <Class BusinessException>
	//* 138  263:dup             
	//* 139  264:new             #112 <Class StringBuilder>
	//* 140  267:dup             
	//* 141  268:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//* 142  270:invokestatic    #169 <Method String String.valueOf(Object)>
	//* 143  273:invokespecial   #117 <Method void StringBuilder(String)>
	//* 144  276:ldc1            #195 <String "\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38">
	//* 145  278:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 146  281:invokevirtual   #130 <Method String StringBuilder.toString()>
	//* 147  284:getstatic       #198 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//* 148  287:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//* 149  290:athrow          
	//* 150  291:aload_0         
	//* 151  292:getfield        #35  <Field FMLog fmLog>
	//* 152  295:ifnull          338
	//* 153  298:aload_0         
	//* 154  299:getfield        #35  <Field FMLog fmLog>
	//* 155  302:aload_0         
	//* 156  303:getfield        #43  <Field String logTag>
	//* 157  306:new             #112 <Class StringBuilder>
	//* 158  309:dup             
	//* 159  310:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//* 160  312:invokestatic    #169 <Method String String.valueOf(Object)>
	//* 161  315:invokespecial   #117 <Method void StringBuilder(String)>
	//* 162  318:ldc1            #200 <String "\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38:">
	//* 163  320:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 164  323:aload_3         
	//* 165  324:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//* 166  327:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 167  330:invokevirtual   #130 <Method String StringBuilder.toString()>
	//* 168  333:invokeinterface #136 <Method void FMLog.warn(String, String)>
	//* 169  338:new             #102 <Class BusinessException>
	//* 170  341:dup             
	//* 171  342:new             #112 <Class StringBuilder>
	//* 172  345:dup             
	//* 173  346:ldc1            #163 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 ">
	//* 174  348:invokestatic    #169 <Method String String.valueOf(Object)>
	//* 175  351:invokespecial   #117 <Method void StringBuilder(String)>
	//* 176  354:ldc1            #202 <String "\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38">
	//* 177  356:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//* 178  359:invokevirtual   #130 <Method String StringBuilder.toString()>
	//* 179  362:getstatic       #198 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//* 180  365:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//* 181  368:athrow          
				{
					return null;
	//  182  369:aconst_null     
	//  183  370:areturn         
				}
			if(fmLog != null)
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38:").append(FM_Bytes.bytesToHexString(abyte1)).toString());
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
		}
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38:").append(FM_Bytes.bytesToHexString(abyte1)).toString());
		throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5E94\u7528\u5E8F\u5217\u53F7 "))).append("\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
	}

	public CardAppRecord getAppRecord4bytes(byte abyte0[], Map map)
	{
		CardAppRecord cardapprecord = new CardAppRecord();
	//    0    0:new             #206 <Class CardAppRecord>
	//    1    3:dup             
	//    2    4:invokespecial   #207 <Method void CardAppRecord()>
	//    3    7:astore_3        
		cardapprecord.setTradeNo(FM_Bytes.bytesToInt(new byte[] {
			abyte0[0], abyte0[1]
		}));
	//    4    8:aload_3         
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
	//   19   24:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//   20   27:invokevirtual   #215 <Method void CardAppRecord.setTradeNo(int)>
		byte abyte1[] = new byte[4];
	//   21   30:iconst_4        
	//   22   31:newarray        byte[]
	//   23   33:astore          4
		abyte1[0] = abyte0[16];
	//   24   35:aload           4
	//   25   37:iconst_0        
	//   26   38:aload_1         
	//   27   39:bipush          16
	//   28   41:baload          
	//   29   42:bastore         
		abyte1[1] = abyte0[17];
	//   30   43:aload           4
	//   31   45:iconst_1        
	//   32   46:aload_1         
	//   33   47:bipush          17
	//   34   49:baload          
	//   35   50:bastore         
		abyte1[2] = abyte0[18];
	//   36   51:aload           4
	//   37   53:iconst_2        
	//   38   54:aload_1         
	//   39   55:bipush          18
	//   40   57:baload          
	//   41   58:bastore         
		abyte1[3] = abyte0[19];
	//   42   59:aload           4
	//   43   61:iconst_3        
	//   44   62:aload_1         
	//   45   63:bipush          19
	//   46   65:baload          
	//   47   66:bastore         
		cardapprecord.setTradeDate(FM_Bytes.bytesToHexString(abyte1));
	//   48   67:aload_3         
	//   49   68:aload           4
	//   50   70:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   51   73:invokevirtual   #218 <Method void CardAppRecord.setTradeDate(String)>
		byte abyte2[] = new byte[3];
	//   52   76:iconst_3        
	//   53   77:newarray        byte[]
	//   54   79:astore          5
		abyte2[0] = abyte0[20];
	//   55   81:aload           5
	//   56   83:iconst_0        
	//   57   84:aload_1         
	//   58   85:bipush          20
	//   59   87:baload          
	//   60   88:bastore         
		abyte2[1] = abyte0[21];
	//   61   89:aload           5
	//   62   91:iconst_1        
	//   63   92:aload_1         
	//   64   93:bipush          21
	//   65   95:baload          
	//   66   96:bastore         
		abyte2[2] = abyte0[22];
	//   67   97:aload           5
	//   68   99:iconst_2        
	//   69  100:aload_1         
	//   70  101:bipush          22
	//   71  103:baload          
	//   72  104:bastore         
		cardapprecord.setTradeTime(FM_Bytes.bytesToHexString(abyte2));
	//   73  105:aload_3         
	//   74  106:aload           5
	//   75  108:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   76  111:invokevirtual   #221 <Method void CardAppRecord.setTradeTime(String)>
		map = ((Map) ((EnumTradeType)map.get(((Object) ((new StringBuilder(String.valueOf(((Object) (FM_Bytes.bytesToHexString(abyte1)))))).append(FM_Bytes.bytesToHexString(abyte2)).toString())))));
	//   77  114:aload_2         
	//   78  115:new             #112 <Class StringBuilder>
	//   79  118:dup             
	//   80  119:aload           4
	//   81  121:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   82  124:invokestatic    #169 <Method String String.valueOf(Object)>
	//   83  127:invokespecial   #117 <Method void StringBuilder(String)>
	//   84  130:aload           5
	//   85  132:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   86  135:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   87  138:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   88  141:invokeinterface #227 <Method Object Map.get(Object)>
	//   89  146:checkcast       #56  <Class EnumTradeType>
	//   90  149:astore_2        
		cardapprecord.setAmount(Integer.parseInt(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[5], abyte0[6], abyte0[7], abyte0[8]
		}), 16));
	//   91  150:aload_3         
	//   92  151:iconst_4        
	//   93  152:newarray        byte[]
	//   94  154:dup             
	//   95  155:iconst_0        
	//   96  156:aload_1         
	//   97  157:iconst_5        
	//   98  158:baload          
	//   99  159:bastore         
	//  100  160:dup             
	//  101  161:iconst_1        
	//  102  162:aload_1         
	//  103  163:bipush          6
	//  104  165:baload          
	//  105  166:bastore         
	//  106  167:dup             
	//  107  168:iconst_2        
	//  108  169:aload_1         
	//  109  170:bipush          7
	//  110  172:baload          
	//  111  173:bastore         
	//  112  174:dup             
	//  113  175:iconst_3        
	//  114  176:aload_1         
	//  115  177:bipush          8
	//  116  179:baload          
	//  117  180:bastore         
	//  118  181:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  119  184:bipush          16
	//  120  186:invokestatic    #233 <Method int Integer.parseInt(String, int)>
	//  121  189:invokevirtual   #236 <Method void CardAppRecord.setAmount(int)>
		cardapprecord.setBalance(FM_Bytes.bytesToInt(new byte[] {
			abyte0[2], abyte0[3], abyte0[4]
		}));
	//  122  192:aload_3         
	//  123  193:iconst_3        
	//  124  194:newarray        byte[]
	//  125  196:dup             
	//  126  197:iconst_0        
	//  127  198:aload_1         
	//  128  199:iconst_2        
	//  129  200:baload          
	//  130  201:bastore         
	//  131  202:dup             
	//  132  203:iconst_1        
	//  133  204:aload_1         
	//  134  205:iconst_3        
	//  135  206:baload          
	//  136  207:bastore         
	//  137  208:dup             
	//  138  209:iconst_2        
	//  139  210:aload_1         
	//  140  211:iconst_4        
	//  141  212:baload          
	//  142  213:bastore         
	//  143  214:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//  144  217:invokevirtual   #239 <Method void CardAppRecord.setBalance(int)>
		cardapprecord.setOriTradeType(abyte0[12]);
	//  145  220:aload_3         
	//  146  221:aload_1         
	//  147  222:bipush          12
	//  148  224:baload          
	//  149  225:invokevirtual   #243 <Method void CardAppRecord.setOriTradeType(byte)>
		cardapprecord.setOriTradeType(abyte0[9]);
	//  150  228:aload_3         
	//  151  229:aload_1         
	//  152  230:bipush          9
	//  153  232:baload          
	//  154  233:invokevirtual   #243 <Method void CardAppRecord.setOriTradeType(byte)>
		if(map != null)
	//* 155  236:aload_2         
	//* 156  237:ifnull          248
			cardapprecord.setTradeType(((EnumTradeType) (map)));
	//  157  240:aload_3         
	//  158  241:aload_2         
	//  159  242:invokevirtual   #247 <Method void CardAppRecord.setTradeType(EnumTradeType)>
		else
	//* 160  245:goto            264
			cardapprecord.setTradeType(get18TradeType(abyte0[12], abyte0[9]));
	//  161  248:aload_3         
	//  162  249:aload_0         
	//  163  250:aload_1         
	//  164  251:bipush          12
	//  165  253:baload          
	//  166  254:aload_1         
	//  167  255:bipush          9
	//  168  257:baload          
	//  169  258:invokespecial   #249 <Method EnumTradeType get18TradeType(byte, byte)>
	//  170  261:invokevirtual   #247 <Method void CardAppRecord.setTradeType(EnumTradeType)>
		cardapprecord.setTradeDevice(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[10], abyte0[11], abyte0[12], abyte0[13], abyte0[14], abyte0[15]
		}));
	//  171  264:aload_3         
	//  172  265:bipush          6
	//  173  267:newarray        byte[]
	//  174  269:dup             
	//  175  270:iconst_0        
	//  176  271:aload_1         
	//  177  272:bipush          10
	//  178  274:baload          
	//  179  275:bastore         
	//  180  276:dup             
	//  181  277:iconst_1        
	//  182  278:aload_1         
	//  183  279:bipush          11
	//  184  281:baload          
	//  185  282:bastore         
	//  186  283:dup             
	//  187  284:iconst_2        
	//  188  285:aload_1         
	//  189  286:bipush          12
	//  190  288:baload          
	//  191  289:bastore         
	//  192  290:dup             
	//  193  291:iconst_3        
	//  194  292:aload_1         
	//  195  293:bipush          13
	//  196  295:baload          
	//  197  296:bastore         
	//  198  297:dup             
	//  199  298:iconst_4        
	//  200  299:aload_1         
	//  201  300:bipush          14
	//  202  302:baload          
	//  203  303:bastore         
	//  204  304:dup             
	//  205  305:iconst_5        
	//  206  306:aload_1         
	//  207  307:bipush          15
	//  208  309:baload          
	//  209  310:bastore         
	//  210  311:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  211  314:invokevirtual   #252 <Method void CardAppRecord.setTradeDevice(String)>
		return cardapprecord;
	//  212  317:aload_3         
	//  213  318:areturn         
	}

	public String getDateTime4File07(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #257 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #258 <Method void StringBuffer()>
	//    3    7:astore          5
		int i = FM_Bytes.bytesToInt(new byte[] {
			abyte0[0], abyte0[1]
		}) >> 4;
	//    4    9:iconst_2        
	//    5   10:newarray        byte[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:baload          
	//   11   17:bastore         
	//   12   18:dup             
	//   13   19:iconst_1        
	//   14   20:aload_1         
	//   15   21:iconst_1        
	//   16   22:baload          
	//   17   23:bastore         
	//   18   24:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//   19   27:iconst_4        
	//   20   28:ishr            
	//   21   29:istore_2        
		stringbuffer.append(String.valueOf(i));
	//   22   30:aload           5
	//   23   32:iload_2         
	//   24   33:invokestatic    #261 <Method String String.valueOf(int)>
	//   25   36:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//   26   39:pop             
		System.out.println((new StringBuilder("yearValue:")).append(i).toString());
	//   27   40:getstatic       #268 <Field PrintStream System.out>
	//   28   43:new             #112 <Class StringBuilder>
	//   29   46:dup             
	//   30   47:ldc2            #270 <String "yearValue:">
	//   31   50:invokespecial   #117 <Method void StringBuilder(String)>
	//   32   53:iload_2         
	//   33   54:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   34   57:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   35   60:invokevirtual   #278 <Method void PrintStream.println(String)>
		String s1 = String.valueOf(abyte0[1] & 0xf);
	//   36   63:aload_1         
	//   37   64:iconst_1        
	//   38   65:baload          
	//   39   66:bipush          15
	//   40   68:iand            
	//   41   69:invokestatic    #261 <Method String String.valueOf(int)>
	//   42   72:astore          4
		String s = s1;
	//   43   74:aload           4
	//   44   76:astore_3        
		if(s1.length() == 1)
	//*  45   77:aload           4
	//*  46   79:invokevirtual   #282 <Method int String.length()>
	//*  47   82:iconst_1        
	//*  48   83:icmpne          105
			s = (new StringBuilder("0")).append(s1).toString();
	//   49   86:new             #112 <Class StringBuilder>
	//   50   89:dup             
	//   51   90:ldc2            #284 <String "0">
	//   52   93:invokespecial   #117 <Method void StringBuilder(String)>
	//   53   96:aload           4
	//   54   98:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   55  101:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   56  104:astore_3        
		stringbuffer.append(s);
	//   57  105:aload           5
	//   58  107:aload_3         
	//   59  108:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//   60  111:pop             
		s1 = String.valueOf((abyte0[2] & 0xf8) >> 3);
	//   61  112:aload_1         
	//   62  113:iconst_2        
	//   63  114:baload          
	//   64  115:sipush          248
	//   65  118:iand            
	//   66  119:iconst_3        
	//   67  120:ishr            
	//   68  121:invokestatic    #261 <Method String String.valueOf(int)>
	//   69  124:astore          4
		s = s1;
	//   70  126:aload           4
	//   71  128:astore_3        
		if(s1.length() == 1)
	//*  72  129:aload           4
	//*  73  131:invokevirtual   #282 <Method int String.length()>
	//*  74  134:iconst_1        
	//*  75  135:icmpne          157
			s = (new StringBuilder("0")).append(s1).toString();
	//   76  138:new             #112 <Class StringBuilder>
	//   77  141:dup             
	//   78  142:ldc2            #284 <String "0">
	//   79  145:invokespecial   #117 <Method void StringBuilder(String)>
	//   80  148:aload           4
	//   81  150:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   82  153:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   83  156:astore_3        
		stringbuffer.append(s);
	//   84  157:aload           5
	//   85  159:aload_3         
	//   86  160:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//   87  163:pop             
		s1 = String.valueOf(FM_Bytes.bytesToInt(new byte[] {
			(byte)(abyte0[2] & 7), (byte)(abyte0[3] & 0xc0)
		}) >> 6);
	//   88  164:iconst_2        
	//   89  165:newarray        byte[]
	//   90  167:dup             
	//   91  168:iconst_0        
	//   92  169:aload_1         
	//   93  170:iconst_2        
	//   94  171:baload          
	//   95  172:bipush          7
	//   96  174:iand            
	//   97  175:int2byte        
	//   98  176:bastore         
	//   99  177:dup             
	//  100  178:iconst_1        
	//  101  179:aload_1         
	//  102  180:iconst_3        
	//  103  181:baload          
	//  104  182:sipush          192
	//  105  185:iand            
	//  106  186:int2byte        
	//  107  187:bastore         
	//  108  188:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//  109  191:bipush          6
	//  110  193:ishr            
	//  111  194:invokestatic    #261 <Method String String.valueOf(int)>
	//  112  197:astore          4
		s = s1;
	//  113  199:aload           4
	//  114  201:astore_3        
		if(s1.length() == 1)
	//* 115  202:aload           4
	//* 116  204:invokevirtual   #282 <Method int String.length()>
	//* 117  207:iconst_1        
	//* 118  208:icmpne          230
			s = (new StringBuilder("0")).append(s1).toString();
	//  119  211:new             #112 <Class StringBuilder>
	//  120  214:dup             
	//  121  215:ldc2            #284 <String "0">
	//  122  218:invokespecial   #117 <Method void StringBuilder(String)>
	//  123  221:aload           4
	//  124  223:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  125  226:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  126  229:astore_3        
		stringbuffer.append(s);
	//  127  230:aload           5
	//  128  232:aload_3         
	//  129  233:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//  130  236:pop             
		s1 = String.valueOf(((int) ((byte)(abyte0[3] & 0x3f))));
	//  131  237:aload_1         
	//  132  238:iconst_3        
	//  133  239:baload          
	//  134  240:bipush          63
	//  135  242:iand            
	//  136  243:int2byte        
	//  137  244:invokestatic    #261 <Method String String.valueOf(int)>
	//  138  247:astore          4
		s = s1;
	//  139  249:aload           4
	//  140  251:astore_3        
		if(s1.length() == 1)
	//* 141  252:aload           4
	//* 142  254:invokevirtual   #282 <Method int String.length()>
	//* 143  257:iconst_1        
	//* 144  258:icmpne          280
			s = (new StringBuilder("0")).append(s1).toString();
	//  145  261:new             #112 <Class StringBuilder>
	//  146  264:dup             
	//  147  265:ldc2            #284 <String "0">
	//  148  268:invokespecial   #117 <Method void StringBuilder(String)>
	//  149  271:aload           4
	//  150  273:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  151  276:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  152  279:astore_3        
		stringbuffer.append(s);
	//  153  280:aload           5
	//  154  282:aload_3         
	//  155  283:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//  156  286:pop             
		s = String.valueOf((abyte0[4] & 0xfc) >> 2);
	//  157  287:aload_1         
	//  158  288:iconst_4        
	//  159  289:baload          
	//  160  290:sipush          252
	//  161  293:iand            
	//  162  294:iconst_2        
	//  163  295:ishr            
	//  164  296:invokestatic    #261 <Method String String.valueOf(int)>
	//  165  299:astore_3        
		abyte0 = ((byte []) (s));
	//  166  300:aload_3         
	//  167  301:astore_1        
		if(s.length() == 1)
	//* 168  302:aload_3         
	//* 169  303:invokevirtual   #282 <Method int String.length()>
	//* 170  306:iconst_1        
	//* 171  307:icmpne          328
			abyte0 = ((byte []) ((new StringBuilder("0")).append(s).toString()));
	//  172  310:new             #112 <Class StringBuilder>
	//  173  313:dup             
	//  174  314:ldc2            #284 <String "0">
	//  175  317:invokespecial   #117 <Method void StringBuilder(String)>
	//  176  320:aload_3         
	//  177  321:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  178  324:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  179  327:astore_1        
		stringbuffer.append(((String) (abyte0)));
	//  180  328:aload           5
	//  181  330:aload_1         
	//  182  331:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//  183  334:pop             
		return stringbuffer.toString();
	//  184  335:aload           5
	//  185  337:invokevirtual   #285 <Method String StringBuffer.toString()>
	//  186  340:areturn         
	}

	public String getFaceID()
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
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7 ...");
	//   10   24:aload_0         
	//   11   25:getfield        #35  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field String logTag>
	//   14   32:ldc2            #288 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7 ...">
	//   15   35:invokeinterface #161 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #106 <Field ApduHandler apduHandler>
	//*  18   44:ifnonnull       122
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #35  <Field FMLog fmLog>
	//*  21   51:ifnull          89
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #35  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #43  <Field String logTag>
	//   26   62:new             #112 <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #290 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7">
	//   29   69:invokestatic    #169 <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #117 <Method void StringBuilder(String)>
	//   31   75:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   32   78:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   33   81:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   34   84:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   35   89:new             #102 <Class BusinessException>
	//   36   92:dup             
	//   37   93:new             #112 <Class StringBuilder>
	//   38   96:dup             
	//   39   97:ldc2            #290 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5361\u9762\u53F7">
	//   40  100:invokestatic    #169 <Method String String.valueOf(Object)>
	//   41  103:invokespecial   #117 <Method void StringBuilder(String)>
	//   42  106:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   43  109:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   44  112:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   45  115:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   46  118:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  121:athrow          
		} else
		{
			return CardTools.getFaceID4UID(Arrays.copyOfRange(getAppNo(), 4, 8));
	//   48  122:aload_0         
	//   49  123:invokevirtual   #294 <Method byte[] getAppNo()>
	//   50  126:iconst_4        
	//   51  127:bipush          8
	//   52  129:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   53  132:invokestatic    #305 <Method String CardTools.getFaceID4UID(byte[])>
	//   54  135:areturn         
		}
	}

	public String getMOC()
		throws BusinessException
	{
		byte abyte0[] = new byte[5];
	//    0    0:iconst_5        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		abyte0[0] = -128;
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:bipush          -128
	//    6    8:bastore         
		abyte0[1] = -54;
	//    7    9:aload_1         
	//    8   10:iconst_1        
	//    9   11:bipush          -54
	//   10   13:bastore         
		abyte0[4] = 9;
	//   11   14:aload_1         
	//   12   15:iconst_4        
	//   13   16:bipush          9
	//   14   18:bastore         
		abyte0 = transceive(abyte0);
	//   15   19:aload_0         
	//   16   20:aload_1         
	//   17   21:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   18   24:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  19   25:aload_1         
	//*  20   26:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  21   29:ifne            86
		{
			if(fmLog != null)
	//*  22   32:aload_0         
	//*  23   33:getfield        #35  <Field FMLog fmLog>
	//*  24   36:ifnull          72
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u4F4F\u5EFA\u90E8\u8BA4\u8BC1\u7801\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25\uFF0Creponse\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   25   39:aload_0         
	//   26   40:getfield        #35  <Field FMLog fmLog>
	//   27   43:aload_0         
	//   28   44:getfield        #43  <Field String logTag>
	//   29   47:new             #112 <Class StringBuilder>
	//   30   50:dup             
	//   31   51:ldc2            #308 <String "\u83B7\u53D6\u4F4F\u5EFA\u90E8\u8BA4\u8BC1\u7801\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25\uFF0Creponse\uFF1A">
	//   32   54:invokespecial   #117 <Method void StringBuilder(String)>
	//   33   57:aload_1         
	//   34   58:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   35   61:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   37   67:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   38   72:new             #102 <Class BusinessException>
	//   39   75:dup             
	//   40   76:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   41   79:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   42   82:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   43   85:athrow          
		} else
		{
			return FM_Bytes.bytesToHexString(Arrays.copyOf(abyte0, abyte0.length - 2));
	//   44   86:aload_1         
	//   45   87:aload_1         
	//   46   88:arraylength     
	//   47   89:iconst_2        
	//   48   90:isub            
	//   49   91:invokestatic    #314 <Method byte[] Arrays.copyOf(byte[], int)>
	//   50   94:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   51   97:areturn         
		}
	}

	public EnumCardAppStatus getStatus()
		throws BusinessException
	{
		boolean flag;
		Object obj;
		byte abyte2[];
		EnumCardAppStatus enumcardappstatus1;
		EnumCardAppStatus enumcardappstatus = EnumCardAppStatus.STATUS_INSTALL;
	//    0    0:getstatic       #324 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_INSTALL>
	//    1    3:astore          5
		if(fmLog != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #35  <Field FMLog fmLog>
	//*   4    9:ifnull          28
			fmLog.info(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001...");
	//    5   12:aload_0         
	//    6   13:getfield        #35  <Field FMLog fmLog>
	//    7   16:aload_0         
	//    8   17:getfield        #43  <Field String logTag>
	//    9   20:ldc2            #326 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001...">
	//   10   23:invokeinterface #161 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  11   28:aload_0         
	//*  12   29:getfield        #106 <Field ApduHandler apduHandler>
	//*  13   32:ifnonnull       110
		{
			if(fmLog != null)
	//*  14   35:aload_0         
	//*  15   36:getfield        #35  <Field FMLog fmLog>
	//*  16   39:ifnull          77
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   17   42:aload_0         
	//   18   43:getfield        #35  <Field FMLog fmLog>
	//   19   46:aload_0         
	//   20   47:getfield        #43  <Field String logTag>
	//   21   50:new             #112 <Class StringBuilder>
	//   22   53:dup             
	//   23   54:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//   24   57:invokestatic    #169 <Method String String.valueOf(Object)>
	//   25   60:invokespecial   #117 <Method void StringBuilder(String)>
	//   26   63:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   66:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   29   72:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   30   77:new             #102 <Class BusinessException>
	//   31   80:dup             
	//   32   81:new             #112 <Class StringBuilder>
	//   33   84:dup             
	//   34   85:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//   35   88:invokestatic    #169 <Method String String.valueOf(Object)>
	//   36   91:invokespecial   #117 <Method void StringBuilder(String)>
	//   37   94:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   38   97:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   39  100:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   40  103:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   41  106:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   42  109:athrow          
		}
		byte abyte0[] = new byte[5];
	//   43  110:iconst_5        
	//   44  111:newarray        byte[]
	//   45  113:astore          4
		abyte0[1] = -80;
	//   46  115:aload           4
	//   47  117:iconst_1        
	//   48  118:bipush          -80
	//   49  120:bastore         
		abyte0[2] = -107;
	//   50  121:aload           4
	//   51  123:iconst_2        
	//   52  124:bipush          -107
	//   53  126:bastore         
		try
		{
			obj = ((Object) (apduHandler.transceive(abyte0)));
	//   54  127:aload_0         
	//   55  128:getfield        #106 <Field ApduHandler apduHandler>
	//   56  131:aload           4
	//   57  133:invokeinterface #110 <Method byte[] ApduHandler.transceive(byte[])>
	//   58  138:astore          4
		}
	//*  59  140:goto            198
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  60  143:astore          4
		{
			if(fmLog != null)
	//*  61  145:aload_0         
	//*  62  146:getfield        #35  <Field FMLog fmLog>
	//*  63  149:ifnull          195
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:").append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   64  152:aload_0         
	//   65  153:getfield        #35  <Field FMLog fmLog>
	//   66  156:aload_0         
	//   67  157:getfield        #43  <Field String logTag>
	//   68  160:new             #112 <Class StringBuilder>
	//   69  163:dup             
	//   70  164:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//   71  167:invokestatic    #169 <Method String String.valueOf(Object)>
	//   72  170:invokespecial   #117 <Method void StringBuilder(String)>
	//   73  173:ldc2            #330 <String "\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:">
	//   74  176:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   75  179:aload           4
	//   76  181:invokestatic    #123 <Method String Util4Java.getExceptionInfo(Exception)>
	//   77  184:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   78  187:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   79  190:invokeinterface #333 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//   80  195:aload           5
	//   81  197:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//*  82  198:aload           4
	//*  83  200:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  84  203:ifne            209
			return enumcardappstatus;
	//   85  206:aload           5
	//   86  208:areturn         
		byte abyte3[] = new byte[32];
	//   87  209:bipush          32
	//   88  211:newarray        byte[]
	//   89  213:astore          6
		abyte3[30] = -112;
	//   90  215:aload           6
	//   91  217:bipush          30
	//   92  219:bipush          -112
	//   93  221:bastore         
		if(!Arrays.equals(abyte3, ((byte []) (obj))))
	//*  94  222:aload           6
	//*  95  224:aload           4
	//*  96  226:invokestatic    #337 <Method boolean Arrays.equals(byte[], byte[])>
	//*  97  229:ifne            240
			enumcardappstatus1 = EnumCardAppStatus.STATUS_PERSONALIZED;
	//   98  232:getstatic       #340 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_PERSONALIZED>
	//   99  235:astore          7
		else
	//* 100  237:goto            243
			return enumcardappstatus;
	//  101  240:aload           5
	//  102  242:areturn         
		Random random = new Random();
	//  103  243:new             #342 <Class Random>
	//  104  246:dup             
	//  105  247:invokespecial   #343 <Method void Random()>
	//  106  250:astore          6
		abyte2 = new byte[8];
	//  107  252:bipush          8
	//  108  254:newarray        byte[]
	//  109  256:astore          5
		random.nextBytes(abyte2);
	//  110  258:aload           6
	//  111  260:aload           5
	//  112  262:invokevirtual   #347 <Method void Random.nextBytes(byte[])>
		random = ((Random) (new byte[5]));
	//  113  265:iconst_5        
	//  114  266:newarray        byte[]
	//  115  268:astore          6
		random[1] = 10;
	//  116  270:aload           6
	//  117  272:iconst_1        
	//  118  273:bipush          10
	//  119  275:bastore         
		random[2] = -125;
	//  120  276:aload           6
	//  121  278:iconst_2        
	//  122  279:bipush          -125
	//  123  281:bastore         
		random[3] = 4;
	//  124  282:aload           6
	//  125  284:iconst_3        
	//  126  285:iconst_4        
	//  127  286:bastore         
		random[4] = 8;
	//  128  287:aload           6
	//  129  289:iconst_4        
	//  130  290:bipush          8
	//  131  292:bastore         
		abyte2 = FM_Bytes.join(((byte []) (random)), abyte2);
	//  132  293:aload           6
	//  133  295:aload           5
	//  134  297:invokestatic    #351 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  135  300:astore          5
		flag = false;
	//  136  302:iconst_0        
	//  137  303:istore_1        
		abyte2 = apduHandler.transceive(abyte2);
	//  138  304:aload_0         
	//  139  305:getfield        #106 <Field ApduHandler apduHandler>
	//  140  308:aload           5
	//  141  310:invokeinterface #110 <Method byte[] ApduHandler.transceive(byte[])>
	//  142  315:astore          5
		obj = ((Object) (abyte2));
	//  143  317:aload           5
	//  144  319:astore          4
		break MISSING_BLOCK_LABEL_378;
	//  145  321:goto            378
		FMScriptHandleException fmscripthandleexception;
		fmscripthandleexception;
	//  146  324:astore          5
		if(fmLog != null)
	//* 147  326:aload_0         
	//* 148  327:getfield        #35  <Field FMLog fmLog>
	//* 149  330:ifnull          376
			fmLog.error(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0C\u5F02\u5E38:").append(Util4Java.getExceptionInfo(((Exception) (fmscripthandleexception)))).toString());
	//  150  333:aload_0         
	//  151  334:getfield        #35  <Field FMLog fmLog>
	//  152  337:aload_0         
	//  153  338:getfield        #43  <Field String logTag>
	//  154  341:new             #112 <Class StringBuilder>
	//  155  344:dup             
	//  156  345:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//  157  348:invokestatic    #169 <Method String String.valueOf(Object)>
	//  158  351:invokespecial   #117 <Method void StringBuilder(String)>
	//  159  354:ldc2            #353 <String "\u65F6\uFF0C\u5F02\u5E38:">
	//  160  357:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  161  360:aload           5
	//  162  362:invokestatic    #123 <Method String Util4Java.getExceptionInfo(Exception)>
	//  163  365:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  164  368:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  165  371:invokeinterface #333 <Method void FMLog.error(String, String)>
		flag = true;
	//  166  376:iconst_1        
	//  167  377:istore_1        
		long l;
		Date date;
		Object obj2;
		String s;
		if(flag)
	//* 168  378:iload_1         
	//* 169  379:ifeq            387
		{
			flag = true;
	//  170  382:iconst_1        
	//  171  383:istore_1        
			break MISSING_BLOCK_LABEL_544;
	//  172  384:goto            544
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//* 173  387:aload           4
	//* 174  389:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 175  392:ifne            400
		{
			flag = true;
	//  176  395:iconst_1        
	//  177  396:istore_1        
			break MISSING_BLOCK_LABEL_544;
	//  178  397:goto            544
		}
		if(obj.length < 5)
	//* 179  400:aload           4
	//* 180  402:arraylength     
	//* 181  403:iconst_5        
	//* 182  404:icmpge          412
		{
			flag = true;
	//  183  407:iconst_1        
	//  184  408:istore_1        
			break MISSING_BLOCK_LABEL_544;
	//  185  409:goto            544
		}
		s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(((byte []) (obj)), 1, 5));
	//  186  412:aload           4
	//  187  414:iconst_1        
	//  188  415:iconst_5        
	//  189  416:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  190  419:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  191  422:astore          8
		l = System.currentTimeMillis();
	//  192  424:invokestatic    #357 <Method long System.currentTimeMillis()>
	//  193  427:lstore_2        
		obj2 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  194  428:new             #359 <Class SimpleDateFormat>
	//  195  431:dup             
	//  196  432:ldc2            #361 <String "yyyyMMdd">
	//  197  435:invokespecial   #362 <Method void SimpleDateFormat(String)>
	//  198  438:astore          6
		date = null;
	//  199  440:aconst_null     
	//  200  441:astore          5
		obj2 = ((Object) (((SimpleDateFormat) (obj2)).parse(s)));
	//  201  443:aload           6
	//  202  445:aload           8
	//  203  447:invokevirtual   #366 <Method Date SimpleDateFormat.parse(String)>
	//  204  450:astore          6
		date = ((Date) (obj2));
	//  205  452:aload           6
	//  206  454:astore          5
		break MISSING_BLOCK_LABEL_508;
	//  207  456:goto            508
		ParseException parseexception;
		parseexception;
	//  208  459:astore          6
		if(fmLog != null)
	//* 209  461:aload_0         
	//* 210  462:getfield        #35  <Field FMLog fmLog>
	//* 211  465:ifnull          508
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:").append(s).toString());
	//  212  468:aload_0         
	//  213  469:getfield        #35  <Field FMLog fmLog>
	//  214  472:aload_0         
	//  215  473:getfield        #43  <Field String logTag>
	//  216  476:new             #112 <Class StringBuilder>
	//  217  479:dup             
	//  218  480:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//  219  483:invokestatic    #169 <Method String String.valueOf(Object)>
	//  220  486:invokespecial   #117 <Method void StringBuilder(String)>
	//  221  489:ldc2            #368 <String "\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  222  492:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  223  495:aload           8
	//  224  497:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  225  500:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  226  503:invokeinterface #136 <Method void FMLog.warn(String, String)>
		if(date == null)
	//* 227  508:aload           5
	//* 228  510:ifnonnull       518
			flag = true;
	//  229  513:iconst_1        
	//  230  514:istore_1        
		else
	//* 231  515:goto            544
		if(obj[0] == 0 || date.getTime() < l)
	//* 232  518:aload           4
	//* 233  520:iconst_0        
	//* 234  521:baload          
	//* 235  522:ifeq            535
	//* 236  525:aload           5
	//* 237  527:invokevirtual   #373 <Method long Date.getTime()>
	//* 238  530:lload_2         
	//* 239  531:lcmp            
	//* 240  532:ifge            540
			flag = false;
	//  241  535:iconst_0        
	//  242  536:istore_1        
		else
	//* 243  537:goto            544
			return EnumCardAppStatus.STATUS_ACTIVATE;
	//  244  540:getstatic       #376 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  245  543:areturn         
		if(flag)
	//* 246  544:iload_1         
	//* 247  545:ifeq            796
		{
			byte abyte1[] = new byte[16];
	//  248  548:bipush          16
	//  249  550:newarray        byte[]
	//  250  552:astore          4
			abyte1[0] = -128;
	//  251  554:aload           4
	//  252  556:iconst_0        
	//  253  557:bipush          -128
	//  254  559:bastore         
			abyte1[1] = 80;
	//  255  560:aload           4
	//  256  562:iconst_1        
	//  257  563:bipush          80
	//  258  565:bastore         
			abyte1[3] = 2;
	//  259  566:aload           4
	//  260  568:iconst_3        
	//  261  569:iconst_2        
	//  262  570:bastore         
			abyte1[4] = 11;
	//  263  571:aload           4
	//  264  573:iconst_4        
	//  265  574:bipush          11
	//  266  576:bastore         
			abyte1[5] = 1;
	//  267  577:aload           4
	//  268  579:iconst_5        
	//  269  580:iconst_1        
	//  270  581:bastore         
			abyte1[8] = 7;
	//  271  582:aload           4
	//  272  584:bipush          8
	//  273  586:bipush          7
	//  274  588:bastore         
			abyte1[9] = -48;
	//  275  589:aload           4
	//  276  591:bipush          9
	//  277  593:bipush          -48
	//  278  595:bastore         
			Object obj1;
			try
			{
				obj1 = ((Object) (apduHandler.transceive(abyte1)));
	//  279  596:aload_0         
	//  280  597:getfield        #106 <Field ApduHandler apduHandler>
	//  281  600:aload           4
	//  282  602:invokeinterface #110 <Method byte[] ApduHandler.transceive(byte[])>
	//  283  607:astore          4
			}
	//* 284  609:goto            667
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 285  612:astore          4
			{
				if(fmLog != null)
	//* 286  614:aload_0         
	//* 287  615:getfield        #35  <Field FMLog fmLog>
	//* 288  618:ifnull          664
					fmLog.error(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:").append(Util4Java.getExceptionInfo(((Exception) (obj1)))).toString());
	//  289  621:aload_0         
	//  290  622:getfield        #35  <Field FMLog fmLog>
	//  291  625:aload_0         
	//  292  626:getfield        #43  <Field String logTag>
	//  293  629:new             #112 <Class StringBuilder>
	//  294  632:dup             
	//  295  633:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//  296  636:invokestatic    #169 <Method String String.valueOf(Object)>
	//  297  639:invokespecial   #117 <Method void StringBuilder(String)>
	//  298  642:ldc2            #378 <String "\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:">
	//  299  645:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  300  648:aload           4
	//  301  650:invokestatic    #123 <Method String Util4Java.getExceptionInfo(Exception)>
	//  302  653:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  303  656:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  304  659:invokeinterface #333 <Method void FMLog.error(String, String)>
				return enumcardappstatus1;
	//  305  664:aload           7
	//  306  666:areturn         
			}
			if(!FM_Bytes.isEnd9000(((byte []) (obj1))))
	//* 307  667:aload           4
	//* 308  669:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 309  672:ifne            678
				return enumcardappstatus1;
	//  310  675:aload           7
	//  311  677:areturn         
			obj1 = ((Object) (FM_Bytes.hexStringToBytes("805200000B2014072815153492F981B2")));
	//  312  678:ldc2            #380 <String "805200000B2014072815153492F981B2">
	//  313  681:invokestatic    #384 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//  314  684:astore          4
			try
			{
				obj1 = ((Object) (apduHandler.transceive(((byte []) (obj1)))));
	//  315  686:aload_0         
	//  316  687:getfield        #106 <Field ApduHandler apduHandler>
	//  317  690:aload           4
	//  318  692:invokeinterface #110 <Method byte[] ApduHandler.transceive(byte[])>
	//  319  697:astore          4
			}
	//* 320  699:goto            757
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 321  702:astore          4
			{
				if(fmLog != null)
	//* 322  704:aload_0         
	//* 323  705:getfield        #35  <Field FMLog fmLog>
	//* 324  708:ifnull          754
					fmLog.error(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001"))).append("\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:").append(Util4Java.getExceptionInfo(((Exception) (obj1)))).toString());
	//  325  711:aload_0         
	//  326  712:getfield        #35  <Field FMLog fmLog>
	//  327  715:aload_0         
	//  328  716:getfield        #43  <Field String logTag>
	//  329  719:new             #112 <Class StringBuilder>
	//  330  722:dup             
	//  331  723:ldc2            #328 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u5F53\u524D\u7684\u72B6\u6001">
	//  332  726:invokestatic    #169 <Method String String.valueOf(Object)>
	//  333  729:invokespecial   #117 <Method void StringBuilder(String)>
	//  334  732:ldc2            #378 <String "\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:">
	//  335  735:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  336  738:aload           4
	//  337  740:invokestatic    #123 <Method String Util4Java.getExceptionInfo(Exception)>
	//  338  743:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  339  746:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  340  749:invokeinterface #333 <Method void FMLog.error(String, String)>
				return enumcardappstatus1;
	//  341  754:aload           7
	//  342  756:areturn         
			}
			if(FM_Bytes.isEnd(((byte []) (obj1)), new byte[] {
	-109, 2
}))
	//* 343  757:aload           4
	//* 344  759:iconst_2        
	//* 345  760:newarray        byte[]
	//* 346  762:dup             
	//* 347  763:iconst_0        
	//* 348  764:ldc2            #385 <Int -109>
	//* 349  767:bastore         
	//* 350  768:dup             
	//* 351  769:iconst_1        
	//* 352  770:ldc2            #386 <Int 2>
	//* 353  773:bastore         
	//* 354  774:invokestatic    #389 <Method boolean FM_Bytes.isEnd(byte[], byte[])>
	//* 355  777:ifeq            784
				return EnumCardAppStatus.STATUS_ACTIVATE;
	//  356  780:getstatic       #376 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  357  783:areturn         
			if(FM_Bytes.isEnd9000(((byte []) (obj1))))
	//* 358  784:aload           4
	//* 359  786:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 360  789:ifeq            796
				return EnumCardAppStatus.STATUS_ACTIVATE;
	//  361  792:getstatic       #376 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  362  795:areturn         
		}
		return enumcardappstatus1;
	//  363  796:aload           7
	//  364  798:areturn         
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
		abyte0[5] = 63;
	//   11   14:aload_1         
	//   12   15:iconst_5        
	//   13   16:bipush          63
	//   14   18:bastore         
		abyte0[6] = 1;
	//   15   19:aload_1         
	//   16   20:bipush          6
	//   17   22:iconst_1        
	//   18   23:bastore         
		abyte0 = transceive(abyte0);
	//   19   24:aload_0         
	//   20   25:aload_1         
	//   21   26:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   22   29:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  23   30:aload_1         
	//*  24   31:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  25   34:ifne            91
		{
			if(fmLog != null)
	//*  26   37:aload_0         
	//*  27   38:getfield        #35  <Field FMLog fmLog>
	//*  28   41:ifnull          77
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   29   44:aload_0         
	//   30   45:getfield        #35  <Field FMLog fmLog>
	//   31   48:aload_0         
	//   32   49:getfield        #43  <Field String logTag>
	//   33   52:new             #112 <Class StringBuilder>
	//   34   55:dup             
	//   35   56:ldc2            #392 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A">
	//   36   59:invokespecial   #117 <Method void StringBuilder(String)>
	//   37   62:aload_1         
	//   38   63:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   39   66:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   40   69:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   41   72:invokeinterface #333 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   42   77:new             #102 <Class BusinessException>
	//   43   80:dup             
	//   44   81:ldc2            #394 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   45   84:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   46   87:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47   90:athrow          
		}
		abyte0 = new byte[5];
	//   48   91:iconst_5        
	//   49   92:newarray        byte[]
	//   50   94:astore_1        
		abyte0[1] = -80;
	//   51   95:aload_1         
	//   52   96:iconst_1        
	//   53   97:bipush          -80
	//   54   99:bastore         
		abyte0[2] = -107;
	//   55  100:aload_1         
	//   56  101:iconst_2        
	//   57  102:bipush          -107
	//   58  104:bastore         
		abyte0 = transceive(abyte0);
	//   59  105:aload_0         
	//   60  106:aload_1         
	//   61  107:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   62  110:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  63  111:aload_1         
	//*  64  112:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  65  115:ifne            172
		{
			if(fmLog != null)
	//*  66  118:aload_0         
	//*  67  119:getfield        #35  <Field FMLog fmLog>
	//*  68  122:ifnull          158
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   69  125:aload_0         
	//   70  126:getfield        #35  <Field FMLog fmLog>
	//   71  129:aload_0         
	//   72  130:getfield        #43  <Field String logTag>
	//   73  133:new             #112 <Class StringBuilder>
	//   74  136:dup             
	//   75  137:ldc2            #396 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//   76  140:invokespecial   #117 <Method void StringBuilder(String)>
	//   77  143:aload_1         
	//   78  144:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   79  147:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   80  150:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   81  153:invokeinterface #333 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   82  158:new             #102 <Class BusinessException>
	//   83  161:dup             
	//   84  162:ldc2            #398 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//   85  165:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   86  168:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   87  171:athrow          
		}
		if(abyte0.length < 29)
	//*  88  172:aload_1         
	//*  89  173:arraylength     
	//*  90  174:bipush          29
	//*  91  176:icmpge          233
		{
			if(fmLog != null)
	//*  92  179:aload_0         
	//*  93  180:getfield        #35  <Field FMLog fmLog>
	//*  94  183:ifnull          219
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   95  186:aload_0         
	//   96  187:getfield        #35  <Field FMLog fmLog>
	//   97  190:aload_0         
	//   98  191:getfield        #43  <Field String logTag>
	//   99  194:new             #112 <Class StringBuilder>
	//  100  197:dup             
	//  101  198:ldc2            #396 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//  102  201:invokespecial   #117 <Method void StringBuilder(String)>
	//  103  204:aload_1         
	//  104  205:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  105  208:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  106  211:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  107  214:invokeinterface #333 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  108  219:new             #102 <Class BusinessException>
	//  109  222:dup             
	//  110  223:ldc2            #398 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//  111  226:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  112  229:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  232:athrow          
		} else
		{
			return FM_Bytes.bytesToHexString(new byte[] {
				abyte0[24], abyte0[25], abyte0[26], abyte0[27]
			});
	//  114  233:iconst_4        
	//  115  234:newarray        byte[]
	//  116  236:dup             
	//  117  237:iconst_0        
	//  118  238:aload_1         
	//  119  239:bipush          24
	//  120  241:baload          
	//  121  242:bastore         
	//  122  243:dup             
	//  123  244:iconst_1        
	//  124  245:aload_1         
	//  125  246:bipush          25
	//  126  248:baload          
	//  127  249:bastore         
	//  128  250:dup             
	//  129  251:iconst_2        
	//  130  252:aload_1         
	//  131  253:bipush          26
	//  132  255:baload          
	//  133  256:bastore         
	//  134  257:dup             
	//  135  258:iconst_3        
	//  136  259:aload_1         
	//  137  260:bipush          27
	//  138  262:baload          
	//  139  263:bastore         
	//  140  264:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  141  267:areturn         
		}
	}

	public boolean isLock4Consume()
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
		if(apduHandler == null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #106 <Field ApduHandler apduHandler>
	//*   9   21:ifnonnull       61
		{
			if(fmLog != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #35  <Field FMLog fmLog>
	//*  12   28:ifnull          47
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   13   31:aload_0         
	//   14   32:getfield        #35  <Field FMLog fmLog>
	//   15   35:aload_0         
	//   16   36:getfield        #43  <Field String logTag>
	//   17   39:ldc2            #402 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   18   42:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   19   47:new             #102 <Class BusinessException>
	//   20   50:dup             
	//   21   51:ldc2            #404 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   22   54:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   23   57:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   24   60:athrow          
		}
		Object obj = ((Object) (new Random()));
	//   25   61:new             #342 <Class Random>
	//   26   64:dup             
	//   27   65:invokespecial   #343 <Method void Random()>
	//   28   68:astore          4
		byte abyte0[] = new byte[8];
	//   29   70:bipush          8
	//   30   72:newarray        byte[]
	//   31   74:astore_3        
		((Random) (obj)).nextBytes(abyte0);
	//   32   75:aload           4
	//   33   77:aload_3         
	//   34   78:invokevirtual   #347 <Method void Random.nextBytes(byte[])>
		byte abyte1[] = new byte[5];
	//   35   81:iconst_5        
	//   36   82:newarray        byte[]
	//   37   84:astore          4
		abyte1[1] = 10;
	//   38   86:aload           4
	//   39   88:iconst_1        
	//   40   89:bipush          10
	//   41   91:bastore         
		abyte1[2] = 67;
	//   42   92:aload           4
	//   43   94:iconst_2        
	//   44   95:bipush          67
	//   45   97:bastore         
		abyte1[3] = 4;
	//   46   98:aload           4
	//   47  100:iconst_3        
	//   48  101:iconst_4        
	//   49  102:bastore         
		abyte1[4] = 8;
	//   50  103:aload           4
	//   51  105:iconst_4        
	//   52  106:bipush          8
	//   53  108:bastore         
		abyte1 = transceive(FM_Bytes.join(abyte1, abyte0));
	//   54  109:aload_0         
	//   55  110:aload           4
	//   56  112:aload_3         
	//   57  113:invokestatic    #351 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   58  116:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   59  119:astore          4
		if(!FM_Bytes.isEnd9000(abyte1))
	//*  60  121:aload           4
	//*  61  123:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  62  126:ifne            166
		{
			if(fmLog != null)
	//*  63  129:aload_0         
	//*  64  130:getfield        #35  <Field FMLog fmLog>
	//*  65  133:ifnull          152
				fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25");
	//   66  136:aload_0         
	//   67  137:getfield        #35  <Field FMLog fmLog>
	//   68  140:aload_0         
	//   69  141:getfield        #43  <Field String logTag>
	//   70  144:ldc2            #406 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25">
	//   71  147:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   72  152:new             #102 <Class BusinessException>
	//   73  155:dup             
	//   74  156:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   75  159:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   76  162:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   77  165:athrow          
		}
		if(abyte1.length < 5)
	//*  78  166:aload           4
	//*  79  168:arraylength     
	//*  80  169:iconst_5        
	//*  81  170:icmpge          210
		{
			if(fmLog != null)
	//*  82  173:aload_0         
	//*  83  174:getfield        #35  <Field FMLog fmLog>
	//*  84  177:ifnull          196
				fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25");
	//   85  180:aload_0         
	//   86  181:getfield        #35  <Field FMLog fmLog>
	//   87  184:aload_0         
	//   88  185:getfield        #43  <Field String logTag>
	//   89  188:ldc2            #408 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   90  191:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   91  196:new             #102 <Class BusinessException>
	//   92  199:dup             
	//   93  200:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   94  203:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   95  206:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   96  209:athrow          
		}
		String s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(abyte1, 1, 5));
	//   97  210:aload           4
	//   98  212:iconst_1        
	//   99  213:iconst_5        
	//  100  214:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  101  217:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  102  220:astore_3        
		long l = System.currentTimeMillis();
	//  103  221:invokestatic    #357 <Method long System.currentTimeMillis()>
	//  104  224:lstore_1        
		Object obj1 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  105  225:new             #359 <Class SimpleDateFormat>
	//  106  228:dup             
	//  107  229:ldc2            #361 <String "yyyyMMdd">
	//  108  232:invokespecial   #362 <Method void SimpleDateFormat(String)>
	//  109  235:astore          5
		try
		{
			obj1 = ((Object) (((SimpleDateFormat) (obj1)).parse(s)));
	//  110  237:aload           5
	//  111  239:aload_3         
	//  112  240:invokevirtual   #366 <Method Date SimpleDateFormat.parse(String)>
	//  113  243:astore          5
		}
	//* 114  245:goto            301
		// Misplaced declaration of an exception variable
		catch(byte abyte1[])
	//* 115  248:astore          4
		{
			if(fmLog != null)
	//* 116  250:aload_0         
	//* 117  251:getfield        #35  <Field FMLog fmLog>
	//* 118  254:ifnull          287
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:")).append(s).toString());
	//  119  257:aload_0         
	//  120  258:getfield        #35  <Field FMLog fmLog>
	//  121  261:aload_0         
	//  122  262:getfield        #43  <Field String logTag>
	//  123  265:new             #112 <Class StringBuilder>
	//  124  268:dup             
	//  125  269:ldc2            #410 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  126  272:invokespecial   #117 <Method void StringBuilder(String)>
	//  127  275:aload_3         
	//  128  276:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  129  279:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  130  282:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  131  287:new             #102 <Class BusinessException>
	//  132  290:dup             
	//  133  291:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//  134  294:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  135  297:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  136  300:athrow          
		}
		return abyte1[0] == 0 || ((Date) (obj1)).getTime() < l;
	//  137  301:aload           4
	//  138  303:iconst_0        
	//  139  304:baload          
	//  140  305:ifeq            318
	//  141  308:aload           5
	//  142  310:invokevirtual   #373 <Method long Date.getTime()>
	//  143  313:lload_1         
	//  144  314:lcmp            
	//  145  315:ifge            320
	//  146  318:iconst_1        
	//  147  319:ireturn         
	//  148  320:iconst_0        
	//  149  321:ireturn         
	}

	public boolean isLock4Load()
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
		if(apduHandler == null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #106 <Field ApduHandler apduHandler>
	//*   9   21:ifnonnull       61
		{
			if(fmLog != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #35  <Field FMLog fmLog>
	//*  12   28:ifnull          47
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   13   31:aload_0         
	//   14   32:getfield        #35  <Field FMLog fmLog>
	//   15   35:aload_0         
	//   16   36:getfield        #43  <Field String logTag>
	//   17   39:ldc2            #402 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   18   42:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   19   47:new             #102 <Class BusinessException>
	//   20   50:dup             
	//   21   51:ldc2            #404 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   22   54:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   23   57:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   24   60:athrow          
		}
		Object obj = ((Object) (new Random()));
	//   25   61:new             #342 <Class Random>
	//   26   64:dup             
	//   27   65:invokespecial   #343 <Method void Random()>
	//   28   68:astore          4
		byte abyte0[] = new byte[8];
	//   29   70:bipush          8
	//   30   72:newarray        byte[]
	//   31   74:astore_3        
		((Random) (obj)).nextBytes(abyte0);
	//   32   75:aload           4
	//   33   77:aload_3         
	//   34   78:invokevirtual   #347 <Method void Random.nextBytes(byte[])>
		byte abyte1[] = new byte[5];
	//   35   81:iconst_5        
	//   36   82:newarray        byte[]
	//   37   84:astore          4
		abyte1[1] = 10;
	//   38   86:aload           4
	//   39   88:iconst_1        
	//   40   89:bipush          10
	//   41   91:bastore         
		abyte1[2] = -125;
	//   42   92:aload           4
	//   43   94:iconst_2        
	//   44   95:bipush          -125
	//   45   97:bastore         
		abyte1[3] = 4;
	//   46   98:aload           4
	//   47  100:iconst_3        
	//   48  101:iconst_4        
	//   49  102:bastore         
		abyte1[4] = 8;
	//   50  103:aload           4
	//   51  105:iconst_4        
	//   52  106:bipush          8
	//   53  108:bastore         
		abyte1 = transceive(FM_Bytes.join(abyte1, abyte0));
	//   54  109:aload_0         
	//   55  110:aload           4
	//   56  112:aload_3         
	//   57  113:invokestatic    #351 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   58  116:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   59  119:astore          4
		if(!FM_Bytes.isEnd9000(abyte1))
	//*  60  121:aload           4
	//*  61  123:invokestatic    #181 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  62  126:ifne            166
		{
			if(fmLog != null)
	//*  63  129:aload_0         
	//*  64  130:getfield        #35  <Field FMLog fmLog>
	//*  65  133:ifnull          152
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25");
	//   66  136:aload_0         
	//   67  137:getfield        #35  <Field FMLog fmLog>
	//   68  140:aload_0         
	//   69  141:getfield        #43  <Field String logTag>
	//   70  144:ldc2            #413 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25">
	//   71  147:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   72  152:new             #102 <Class BusinessException>
	//   73  155:dup             
	//   74  156:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   75  159:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   76  162:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   77  165:athrow          
		}
		if(abyte1.length < 5)
	//*  78  166:aload           4
	//*  79  168:arraylength     
	//*  80  169:iconst_5        
	//*  81  170:icmpge          210
		{
			if(fmLog != null)
	//*  82  173:aload_0         
	//*  83  174:getfield        #35  <Field FMLog fmLog>
	//*  84  177:ifnull          196
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25");
	//   85  180:aload_0         
	//   86  181:getfield        #35  <Field FMLog fmLog>
	//   87  184:aload_0         
	//   88  185:getfield        #43  <Field String logTag>
	//   89  188:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   90  191:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   91  196:new             #102 <Class BusinessException>
	//   92  199:dup             
	//   93  200:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   94  203:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   95  206:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   96  209:athrow          
		}
		String s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(abyte1, 1, 5));
	//   97  210:aload           4
	//   98  212:iconst_1        
	//   99  213:iconst_5        
	//  100  214:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  101  217:invokestatic    #193 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  102  220:astore_3        
		long l = System.currentTimeMillis();
	//  103  221:invokestatic    #357 <Method long System.currentTimeMillis()>
	//  104  224:lstore_1        
		Object obj1 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  105  225:new             #359 <Class SimpleDateFormat>
	//  106  228:dup             
	//  107  229:ldc2            #361 <String "yyyyMMdd">
	//  108  232:invokespecial   #362 <Method void SimpleDateFormat(String)>
	//  109  235:astore          5
		try
		{
			obj1 = ((Object) (((SimpleDateFormat) (obj1)).parse(s)));
	//  110  237:aload           5
	//  111  239:aload_3         
	//  112  240:invokevirtual   #366 <Method Date SimpleDateFormat.parse(String)>
	//  113  243:astore          5
		}
	//* 114  245:goto            301
		// Misplaced declaration of an exception variable
		catch(byte abyte1[])
	//* 115  248:astore          4
		{
			if(fmLog != null)
	//* 116  250:aload_0         
	//* 117  251:getfield        #35  <Field FMLog fmLog>
	//* 118  254:ifnull          287
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:")).append(s).toString());
	//  119  257:aload_0         
	//  120  258:getfield        #35  <Field FMLog fmLog>
	//  121  261:aload_0         
	//  122  262:getfield        #43  <Field String logTag>
	//  123  265:new             #112 <Class StringBuilder>
	//  124  268:dup             
	//  125  269:ldc2            #410 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  126  272:invokespecial   #117 <Method void StringBuilder(String)>
	//  127  275:aload_3         
	//  128  276:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  129  279:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  130  282:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  131  287:new             #102 <Class BusinessException>
	//  132  290:dup             
	//  133  291:ldc2            #310 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//  134  294:getstatic       #145 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  135  297:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  136  300:athrow          
		}
		return abyte1[0] == 0 || ((Date) (obj1)).getTime() < l;
	//  137  301:aload           4
	//  138  303:iconst_0        
	//  139  304:baload          
	//  140  305:ifeq            318
	//  141  308:aload           5
	//  142  310:invokevirtual   #373 <Method long Date.getTime()>
	//  143  313:lload_1         
	//  144  314:lcmp            
	//  145  315:ifge            320
	//  146  318:iconst_1        
	//  147  319:ireturn         
	//  148  320:iconst_0        
	//  149  321:ireturn         
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
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D ...");
	//   10   24:aload_0         
	//   11   25:getfield        #35  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field String logTag>
	//   14   32:ldc2            #416 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D ...">
	//   15   35:invokeinterface #161 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #106 <Field ApduHandler apduHandler>
	//*  18   44:ifnonnull       84
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #35  <Field FMLog fmLog>
	//*  21   51:ifnull          70
				fmLog.warn(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   54:aload_0         
	//   23   55:getfield        #35  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #43  <Field String logTag>
	//   26   62:ldc2            #418 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   65:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   70:new             #102 <Class BusinessException>
	//   29   73:dup             
	//   30   74:ldc2            #404 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   77:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   80:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   83:athrow          
		}
		byte abyte0[] = new byte[7];
	//   34   84:bipush          7
	//   35   86:newarray        byte[]
	//   36   88:astore_1        
		abyte0[1] = -92;
	//   37   89:aload_1         
	//   38   90:iconst_1        
	//   39   91:bipush          -92
	//   40   93:bastore         
		abyte0[4] = 2;
	//   41   94:aload_1         
	//   42   95:iconst_4        
	//   43   96:iconst_2        
	//   44   97:bastore         
		abyte0[5] = 63;
	//   45   98:aload_1         
	//   46   99:iconst_5        
	//   47  100:bipush          63
	//   48  102:bastore         
		abyte0[6] = 1;
	//   49  103:aload_1         
	//   50  104:bipush          6
	//   51  106:iconst_1        
	//   52  107:bastore         
		transceive(abyte0);
	//   53  108:aload_0         
	//   54  109:aload_1         
	//   55  110:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   56  113:pop             
		abyte0 = new byte[17];
	//   57  114:bipush          17
	//   58  116:newarray        byte[]
	//   59  118:astore_1        
		abyte0[0] = -128;
	//   60  119:aload_1         
	//   61  120:iconst_0        
	//   62  121:bipush          -128
	//   63  123:bastore         
		abyte0[1] = 80;
	//   64  124:aload_1         
	//   65  125:iconst_1        
	//   66  126:bipush          80
	//   67  128:bastore         
		abyte0[2] = 3;
	//   68  129:aload_1         
	//   69  130:iconst_2        
	//   70  131:iconst_3        
	//   71  132:bastore         
		abyte0[3] = 2;
	//   72  133:aload_1         
	//   73  134:iconst_3        
	//   74  135:iconst_2        
	//   75  136:bastore         
		abyte0[4] = 11;
	//   76  137:aload_1         
	//   77  138:iconst_4        
	//   78  139:bipush          11
	//   79  141:bastore         
		abyte0[5] = 1;
	//   80  142:aload_1         
	//   81  143:iconst_5        
	//   82  144:iconst_1        
	//   83  145:bastore         
		abyte0[16] = 15;
	//   84  146:aload_1         
	//   85  147:bipush          16
	//   86  149:bipush          15
	//   87  151:bastore         
		abyte0 = transceive(abyte0);
	//   88  152:aload_0         
	//   89  153:aload_1         
	//   90  154:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   91  157:astore_1        
		if(abyte0.length < 9)
	//*  92  158:aload_1         
	//*  93  159:arraylength     
	//*  94  160:bipush          9
	//*  95  162:icmpge          202
		{
			if(fmLog != null)
	//*  96  165:aload_0         
	//*  97  166:getfield        #35  <Field FMLog fmLog>
	//*  98  169:ifnull          188
				fmLog.warn(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548");
	//   99  172:aload_0         
	//  100  173:getfield        #35  <Field FMLog fmLog>
	//  101  176:aload_0         
	//  102  177:getfield        #43  <Field String logTag>
	//  103  180:ldc2            #420 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548">
	//  104  183:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_fail);
	//  105  188:new             #102 <Class BusinessException>
	//  106  191:dup             
	//  107  192:ldc2            #422 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548">
	//  108  195:getstatic       #425 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_fail>
	//  109  198:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  110  201:athrow          
		} else
		{
			return FM_Bytes.bytesToInt(Arrays.copyOf(abyte0, 4)) - FM_Bytes.bytesToInt(new byte[] {
				abyte0[6], abyte0[7], abyte0[8]
			});
	//  111  202:aload_1         
	//  112  203:iconst_4        
	//  113  204:invokestatic    #314 <Method byte[] Arrays.copyOf(byte[], int)>
	//  114  207:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//  115  210:iconst_3        
	//  116  211:newarray        byte[]
	//  117  213:dup             
	//  118  214:iconst_0        
	//  119  215:aload_1         
	//  120  216:bipush          6
	//  121  218:baload          
	//  122  219:bastore         
	//  123  220:dup             
	//  124  221:iconst_1        
	//  125  222:aload_1         
	//  126  223:bipush          7
	//  127  225:baload          
	//  128  226:bastore         
	//  129  227:dup             
	//  130  228:iconst_2        
	//  131  229:aload_1         
	//  132  230:bipush          8
	//  133  232:baload          
	//  134  233:bastore         
	//  135  234:invokestatic    #211 <Method int FM_Bytes.bytesToInt(byte[])>
	//  136  237:isub            
	//  137  238:ireturn         
		}
	}

	public List readAppRecords()
		throws BusinessException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #429 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #430 <Method void ArrayList()>
	//    3    7:astore_2        
		if(fmLog != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field FMLog fmLog>
	//*   6   12:ifnull          31
			fmLog.info(logTag, "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55 ...");
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field FMLog fmLog>
	//    9   19:aload_0         
	//   10   20:getfield        #43  <Field String logTag>
	//   11   23:ldc2            #432 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55 ...">
	//   12   26:invokeinterface #161 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  13   31:aload_0         
	//*  14   32:getfield        #106 <Field ApduHandler apduHandler>
	//*  15   35:ifnonnull       113
		{
			if(fmLog != null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #35  <Field FMLog fmLog>
	//*  18   42:ifnull          80
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   19   45:aload_0         
	//   20   46:getfield        #35  <Field FMLog fmLog>
	//   21   49:aload_0         
	//   22   50:getfield        #43  <Field String logTag>
	//   23   53:new             #112 <Class StringBuilder>
	//   24   56:dup             
	//   25   57:ldc2            #434 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55">
	//   26   60:invokestatic    #169 <Method String String.valueOf(Object)>
	//   27   63:invokespecial   #117 <Method void StringBuilder(String)>
	//   28   66:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   29   69:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   31   75:invokeinterface #136 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55"))).append("\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   32   80:new             #102 <Class BusinessException>
	//   33   83:dup             
	//   34   84:new             #112 <Class StringBuilder>
	//   35   87:dup             
	//   36   88:ldc2            #434 <String "\u83B7\u53D6\u4E0A\u6D77\u65C5\u6E38\u5361\u4EA4\u6613\u8BB0\u5F55">
	//   37   91:invokestatic    #169 <Method String String.valueOf(Object)>
	//   38   94:invokespecial   #117 <Method void StringBuilder(String)>
	//   39   97:ldc2            #292 <String "\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   40  100:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   41  103:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   42  106:getstatic       #174 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   43  109:invokespecial   #148 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   44  112:athrow          
		}
		byte abyte0[] = new byte[7];
	//   45  113:bipush          7
	//   46  115:newarray        byte[]
	//   47  117:astore_3        
		abyte0[1] = -92;
	//   48  118:aload_3         
	//   49  119:iconst_1        
	//   50  120:bipush          -92
	//   51  122:bastore         
		abyte0[4] = 2;
	//   52  123:aload_3         
	//   53  124:iconst_4        
	//   54  125:iconst_2        
	//   55  126:bastore         
		abyte0[5] = 63;
	//   56  127:aload_3         
	//   57  128:iconst_5        
	//   58  129:bipush          63
	//   59  131:bastore         
		abyte0[6] = 1;
	//   60  132:aload_3         
	//   61  133:bipush          6
	//   62  135:iconst_1        
	//   63  136:bastore         
		transceive(abyte0);
	//   64  137:aload_0         
	//   65  138:aload_3         
	//   66  139:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   67  142:pop             
		HashMap hashmap = new HashMap();
	//   68  143:new             #436 <Class HashMap>
	//   69  146:dup             
	//   70  147:invokespecial   #437 <Method void HashMap()>
	//   71  150:astore_3        
		byte abyte1[] = new byte[7];
	//   72  151:bipush          7
	//   73  153:newarray        byte[]
	//   74  155:astore          4
		abyte1[1] = -92;
	//   75  157:aload           4
	//   76  159:iconst_1        
	//   77  160:bipush          -92
	//   78  162:bastore         
		abyte1[4] = 2;
	//   79  163:aload           4
	//   80  165:iconst_4        
	//   81  166:iconst_2        
	//   82  167:bastore         
		abyte1[6] = 7;
	//   83  168:aload           4
	//   84  170:bipush          6
	//   85  172:bipush          7
	//   86  174:bastore         
		transceive(abyte1);
	//   87  175:aload_0         
	//   88  176:aload           4
	//   89  178:invokespecial   #175 <Method byte[] transceive(byte[])>
	//   90  181:pop             
		abyte1 = new byte[5];
	//   91  182:iconst_5        
	//   92  183:newarray        byte[]
	//   93  185:astore          4
		for(int i = 1; i <= 10; i++)
	//*  94  187:iconst_1        
	//*  95  188:istore_1        
	//*  96  189:goto            324
		{
			abyte1 = new byte[5];
	//   97  192:iconst_5        
	//   98  193:newarray        byte[]
	//   99  195:astore          4
			abyte1[1] = -78;
	//  100  197:aload           4
	//  101  199:iconst_1        
	//  102  200:bipush          -78
	//  103  202:bastore         
			abyte1[2] = (byte)i;
	//  104  203:aload           4
	//  105  205:iconst_2        
	//  106  206:iload_1         
	//  107  207:int2byte        
	//  108  208:bastore         
			abyte1[3] = 4;
	//  109  209:aload           4
	//  110  211:iconst_3        
	//  111  212:iconst_4        
	//  112  213:bastore         
			abyte1 = transceive(abyte1);
	//  113  214:aload_0         
	//  114  215:aload           4
	//  115  217:invokespecial   #175 <Method byte[] transceive(byte[])>
	//  116  220:astore          4
			byte abyte3[] = Arrays.copyOfRange(abyte1, abyte1.length - 2, abyte1.length);
	//  117  222:aload           4
	//  118  224:aload           4
	//  119  226:arraylength     
	//  120  227:iconst_2        
	//  121  228:isub            
	//  122  229:aload           4
	//  123  231:arraylength     
	//  124  232:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  125  235:astore          5
			if(Arrays.equals(new byte[] {
	106, -125
}, abyte3))
	//* 126  237:iconst_2        
	//* 127  238:newarray        byte[]
	//* 128  240:dup             
	//* 129  241:iconst_0        
	//* 130  242:ldc2            #438 <Int 106>
	//* 131  245:bastore         
	//* 132  246:dup             
	//* 133  247:iconst_1        
	//* 134  248:ldc2            #439 <Int -125>
	//* 135  251:bastore         
	//* 136  252:aload           5
	//* 137  254:invokestatic    #337 <Method boolean Arrays.equals(byte[], byte[])>
	//* 138  257:ifeq            263
				break;
	//  139  260:goto            330
			if(abyte1.length >= 16)
	//* 140  263:aload           4
	//* 141  265:arraylength     
	//* 142  266:bipush          16
	//* 143  268:icmpge          274
	//* 144  271:goto            320
			{
				String s = getDateTime4File07(Arrays.copyOfRange(abyte1, 10, 15));
	//  145  274:aload_0         
	//  146  275:aload           4
	//  147  277:bipush          10
	//  148  279:bipush          15
	//  149  281:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  150  284:invokevirtual   #441 <Method String getDateTime4File07(byte[])>
	//  151  287:astore          5
				EnumTradeType enumtradetype = get07TradeType(abyte1[0]);
	//  152  289:aload_0         
	//  153  290:aload           4
	//  154  292:iconst_0        
	//  155  293:baload          
	//  156  294:invokespecial   #443 <Method EnumTradeType get07TradeType(byte)>
	//  157  297:astore          4
				if(s != null && enumtradetype != null)
	//* 158  299:aload           5
	//* 159  301:ifnull          320
	//* 160  304:aload           4
	//* 161  306:ifnull          320
					((Map) (hashmap)).put(((Object) (s)), ((Object) (enumtradetype)));
	//  162  309:aload_3         
	//  163  310:aload           5
	//  164  312:aload           4
	//  165  314:invokeinterface #447 <Method Object Map.put(Object, Object)>
	//  166  319:pop             
			}
		}

	//  167  320:iload_1         
	//  168  321:iconst_1        
	//  169  322:iadd            
	//  170  323:istore_1        
	//  171  324:iload_1         
	//  172  325:bipush          10
	//  173  327:icmple          192
		enumtradetype = ((EnumTradeType) (new byte[7]));
	//  174  330:bipush          7
	//  175  332:newarray        byte[]
	//  176  334:astore          4
		enumtradetype[1] = -92;
	//  177  336:aload           4
	//  178  338:iconst_1        
	//  179  339:bipush          -92
	//  180  341:bastore         
		enumtradetype[4] = 2;
	//  181  342:aload           4
	//  182  344:iconst_4        
	//  183  345:iconst_2        
	//  184  346:bastore         
		enumtradetype[6] = 24;
	//  185  347:aload           4
	//  186  349:bipush          6
	//  187  351:bipush          24
	//  188  353:bastore         
		transceive(((byte []) (enumtradetype)));
	//  189  354:aload_0         
	//  190  355:aload           4
	//  191  357:invokespecial   #175 <Method byte[] transceive(byte[])>
	//  192  360:pop             
		for(int j = 1; j <= 10; j++)
	//* 193  361:iconst_1        
	//* 194  362:istore_1        
	//* 195  363:goto            465
		{
			byte abyte2[] = new byte[5];
	//  196  366:iconst_5        
	//  197  367:newarray        byte[]
	//  198  369:astore          4
			abyte2[1] = -78;
	//  199  371:aload           4
	//  200  373:iconst_1        
	//  201  374:bipush          -78
	//  202  376:bastore         
			abyte2[2] = (byte)j;
	//  203  377:aload           4
	//  204  379:iconst_2        
	//  205  380:iload_1         
	//  206  381:int2byte        
	//  207  382:bastore         
			abyte2[3] = 4;
	//  208  383:aload           4
	//  209  385:iconst_3        
	//  210  386:iconst_4        
	//  211  387:bastore         
			abyte2 = transceive(abyte2);
	//  212  388:aload_0         
	//  213  389:aload           4
	//  214  391:invokespecial   #175 <Method byte[] transceive(byte[])>
	//  215  394:astore          4
			byte abyte4[] = Arrays.copyOfRange(abyte2, abyte2.length - 2, abyte2.length);
	//  216  396:aload           4
	//  217  398:aload           4
	//  218  400:arraylength     
	//  219  401:iconst_2        
	//  220  402:isub            
	//  221  403:aload           4
	//  222  405:arraylength     
	//  223  406:invokestatic    #300 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  224  409:astore          5
			if(Arrays.equals(new byte[] {
	106, -125
}, abyte4))
	//* 225  411:iconst_2        
	//* 226  412:newarray        byte[]
	//* 227  414:dup             
	//* 228  415:iconst_0        
	//* 229  416:ldc2            #438 <Int 106>
	//* 230  419:bastore         
	//* 231  420:dup             
	//* 232  421:iconst_1        
	//* 233  422:ldc2            #439 <Int -125>
	//* 234  425:bastore         
	//* 235  426:aload           5
	//* 236  428:invokestatic    #337 <Method boolean Arrays.equals(byte[], byte[])>
	//* 237  431:ifeq            436
				return ((List) (arraylist));
	//  238  434:aload_2         
	//  239  435:areturn         
			if(abyte2.length >= 23)
	//* 240  436:aload           4
	//* 241  438:arraylength     
	//* 242  439:bipush          23
	//* 243  441:icmpge          447
	//* 244  444:goto            461
				((List) (arraylist)).add(((Object) (getAppRecord4bytes(abyte2, ((Map) (hashmap))))));
	//  245  447:aload_2         
	//  246  448:aload_0         
	//  247  449:aload           4
	//  248  451:aload_3         
	//  249  452:invokevirtual   #449 <Method CardAppRecord getAppRecord4bytes(byte[], Map)>
	//  250  455:invokeinterface #455 <Method boolean List.add(Object)>
	//  251  460:pop             
		}

	//  252  461:iload_1         
	//  253  462:iconst_1        
	//  254  463:iadd            
	//  255  464:istore_1        
	//  256  465:iload_1         
	//  257  466:bipush          10
	//  258  468:icmple          366
		return ((List) (arraylist));
	//  259  471:aload_2         
	//  260  472:areturn         
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandler = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field ApduHandler apduHandler>
	//    3    5:return          
	}

	private final int BYTE_COUNT_18 = 23;
	private final byte LOCK = 0;
	private final int MAX_LOG = 10;
	private final byte aid[];
	private ApduHandler apduHandler;
	FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/card/core/ShTourAppManager)).getName();
}
