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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StpcManager
	implements CardManager
{

	public StpcManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #30  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #34  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #36  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class StpcManager>
	//    8   17:invokevirtual   #42  <Method String Class.getName()>
	//    9   20:putfield        #44  <Field String logTag>
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
	//   39   61:putfield        #46  <Field byte[] aid>
		abyte0 = new byte[2];
	//   40   64:iconst_2        
	//   41   65:newarray        byte[]
	//   42   67:astore_1        
		abyte0[0] = 32;
	//   43   68:aload_1         
	//   44   69:iconst_0        
	//   45   70:bipush          32
	//   46   72:bastore         
		CITY_CODE_SH = abyte0;
	//   47   73:aload_0         
	//   48   74:aload_1         
	//   49   75:putfield        #48  <Field byte[] CITY_CODE_SH>
	//   50   78:aload_0         
	//   51   79:bipush          10
	//   52   81:putfield        #50  <Field int MAX_LOG>
	//   53   84:aload_0         
	//   54   85:bipush          23
	//   55   87:putfield        #52  <Field int BYTE_COUNT_18>
	//   56   90:aload_0         
	//   57   91:iconst_0        
	//   58   92:putfield        #54  <Field byte LOCK>
	//   59   95:return          
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
	//    4  182:getstatic       #63  <Field EnumTradeType EnumTradeType.bus>
	//    5  185:areturn         

		case 3: // '\003'
			return EnumTradeType.onlineRecharge;
	//    6  186:getstatic       #66  <Field EnumTradeType EnumTradeType.onlineRecharge>
	//    7  189:areturn         

		case 5: // '\005'
			return EnumTradeType.bus;
	//    8  190:getstatic       #63  <Field EnumTradeType EnumTradeType.bus>
	//    9  193:areturn         

		case 6: // '\006'
			return EnumTradeType.subwayConsumption;
	//   10  194:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   11  197:areturn         

		case 7: // '\007'
			return EnumTradeType.subwayConsumption;
	//   12  198:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   13  201:areturn         

		case 9: // '\t'
			return EnumTradeType.bus;
	//   14  202:getstatic       #63  <Field EnumTradeType EnumTradeType.bus>
	//   15  205:areturn         

		case 17: // '\021'
			return EnumTradeType.subwayConsumption;
	//   16  206:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   17  209:areturn         

		case 20: // '\024'
			return EnumTradeType.subwayUpdate;
	//   18  210:getstatic       #72  <Field EnumTradeType EnumTradeType.subwayUpdate>
	//   19  213:areturn         

		case 32: // ' '
			return EnumTradeType.maglev;
	//   20  214:getstatic       #75  <Field EnumTradeType EnumTradeType.maglev>
	//   21  217:areturn         

		case 34: // '"'
			return EnumTradeType.recharge;
	//   22  218:getstatic       #78  <Field EnumTradeType EnumTradeType.recharge>
	//   23  221:areturn         

		case 49: // '1'
			return EnumTradeType.ferry;
	//   24  222:getstatic       #81  <Field EnumTradeType EnumTradeType.ferry>
	//   25  225:areturn         

		case 52: // '4'
			return EnumTradeType.subwayConsumption;
	//   26  226:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   27  229:areturn         

		case 65: // 'A'
			return EnumTradeType.taxi;
	//   28  230:getstatic       #84  <Field EnumTradeType EnumTradeType.taxi>
	//   29  233:areturn         

		case 66: // 'B'
			return EnumTradeType.taxi;
	//   30  234:getstatic       #84  <Field EnumTradeType EnumTradeType.taxi>
	//   31  237:areturn         

		case 81: // 'Q'
			return EnumTradeType.expressway;
	//   32  238:getstatic       #87  <Field EnumTradeType EnumTradeType.expressway>
	//   33  241:areturn         

		case 82: // 'R'
			return EnumTradeType.park;
	//   34  242:getstatic       #90  <Field EnumTradeType EnumTradeType.park>
	//   35  245:areturn         

		case 99: // 'c'
			return EnumTradeType.gasStation;
	//   36  246:getstatic       #93  <Field EnumTradeType EnumTradeType.gasStation>
	//   37  249:areturn         

		case 104: // 'h'
			return EnumTradeType.onlineConsumption;
	//   38  250:getstatic       #96  <Field EnumTradeType EnumTradeType.onlineConsumption>
	//   39  253:areturn         

		case -125: 
			return EnumTradeType.recharge;
	//   40  254:getstatic       #78  <Field EnumTradeType EnumTradeType.recharge>
	//   41  257:areturn         

		case -107: 
			return EnumTradeType.onlineRecharge;
	//   42  258:getstatic       #66  <Field EnumTradeType EnumTradeType.onlineRecharge>
	//   43  261:areturn         

		case -103: 
			return EnumTradeType.onlineRecharge;
	//   44  262:getstatic       #66  <Field EnumTradeType EnumTradeType.onlineRecharge>
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
	//    5  119:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//    6  122:astore_3        
			break;

	//*   7  123:goto            207
		case 1: // '\001'
			enumtradetype = EnumTradeType.subwayConsumption;
	//    8  126:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//    9  129:astore_3        
			break;

	//*  10  130:goto            207
		case 5: // '\005'
			enumtradetype = EnumTradeType.subwayConsumption;
	//   11  133:getstatic       #69  <Field EnumTradeType EnumTradeType.subwayConsumption>
	//   12  136:astore_3        
			break;

	//*  13  137:goto            207
		case 9: // '\t'
			enumtradetype = EnumTradeType.bus;
	//   14  140:getstatic       #63  <Field EnumTradeType EnumTradeType.bus>
	//   15  143:astore_3        
			break;

	//*  16  144:goto            207
		case 20: // '\024'
			enumtradetype = EnumTradeType.subwayUpdate;
	//   17  147:getstatic       #72  <Field EnumTradeType EnumTradeType.subwayUpdate>
	//   18  150:astore_3        
			break;

	//*  19  151:goto            207
		case 32: // ' '
			enumtradetype = EnumTradeType.maglev;
	//   20  154:getstatic       #75  <Field EnumTradeType EnumTradeType.maglev>
	//   21  157:astore_3        
			break;

	//*  22  158:goto            207
		case 34: // '"'
			enumtradetype = EnumTradeType.recharge;
	//   23  161:getstatic       #78  <Field EnumTradeType EnumTradeType.recharge>
	//   24  164:astore_3        
			break;

	//*  25  165:goto            207
		case 49: // '1'
			enumtradetype = EnumTradeType.ferry;
	//   26  168:getstatic       #81  <Field EnumTradeType EnumTradeType.ferry>
	//   27  171:astore_3        
			break;

	//*  28  172:goto            207
		case 65: // 'A'
			enumtradetype = EnumTradeType.taxi;
	//   29  175:getstatic       #84  <Field EnumTradeType EnumTradeType.taxi>
	//   30  178:astore_3        
			break;

	//*  31  179:goto            207
		case 81: // 'Q'
			enumtradetype = EnumTradeType.expressway;
	//   32  182:getstatic       #87  <Field EnumTradeType EnumTradeType.expressway>
	//   33  185:astore_3        
			break;

	//*  34  186:goto            207
		case 82: // 'R'
			enumtradetype = EnumTradeType.park;
	//   35  189:getstatic       #90  <Field EnumTradeType EnumTradeType.park>
	//   36  192:astore_3        
			break;

	//*  37  193:goto            207
		case 99: // 'c'
			enumtradetype = EnumTradeType.gasStation;
	//   38  196:getstatic       #93  <Field EnumTradeType EnumTradeType.gasStation>
	//   39  199:astore_3        
			break;

	//*  40  200:goto            207
		case -125: 
			enumtradetype = EnumTradeType.recharge;
	//   41  203:getstatic       #78  <Field EnumTradeType EnumTradeType.recharge>
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
	//   50  251:getstatic       #78  <Field EnumTradeType EnumTradeType.recharge>
	//   51  254:areturn         

			case 6: // '\006'
			case 9: // '\t'
			default:
				enumtradetype1 = EnumTradeType.elseTrade;
	//   52  255:getstatic       #101 <Field EnumTradeType EnumTradeType.elseTrade>
	//   53  258:astore          4
				break;
			}
		return enumtradetype1;
	//   54  260:aload           4
	//   55  262:areturn         
	}

	private byte[] getCityCode(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		abyte0 = ((byte []) (FM_Bytes.bytesToHexString(abyte0)));
	//    8   12:aload_1         
	//    9   13:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   10   16:astore_1        
		int i = ((String) (abyte0)).indexOf("9F0C1E");
	//   11   17:aload_1         
	//   12   18:ldc1            #111 <String "9F0C1E">
	//   13   20:invokevirtual   #117 <Method int String.indexOf(String)>
	//   14   23:istore_2        
		if(i < 0)
	//*  15   24:iload_2         
	//*  16   25:ifge            52
		{
			if(fmLog != null)
	//*  17   28:aload_0         
	//*  18   29:getfield        #36  <Field FMLog fmLog>
	//*  19   32:ifnull          50
				fmLog.error(logTag, "3F01\u7ED3\u679C\u83B7\u53D6\u57CE\u5E02\u7F16\u7801\u5931\u8D25\uFF0C\u54CD\u5E94\u7ED3\u679C\u4E0D\u5305\u542B9F0C");
	//   20   35:aload_0         
	//   21   36:getfield        #36  <Field FMLog fmLog>
	//   22   39:aload_0         
	//   23   40:getfield        #44  <Field String logTag>
	//   24   43:ldc1            #119 <String "3F01\u7ED3\u679C\u83B7\u53D6\u57CE\u5E02\u7F16\u7801\u5931\u8D25\uFF0C\u54CD\u5E94\u7ED3\u679C\u4E0D\u5305\u542B9F0C">
	//   25   45:invokeinterface #125 <Method void FMLog.error(String, String)>
			return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
		} else
		{
			abyte0 = FM_Bytes.hexStringToBytes(((String) (abyte0)).substring(i));
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:invokevirtual   #129 <Method String String.substring(int)>
	//   31   57:invokestatic    #133 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   32   60:astore_1        
			return (new byte[] {
				abyte0[13], abyte0[14]
			});
	//   33   61:iconst_2        
	//   34   62:newarray        byte[]
	//   35   64:dup             
	//   36   65:iconst_0        
	//   37   66:aload_1         
	//   38   67:bipush          13
	//   39   69:baload          
	//   40   70:bastore         
	//   41   71:dup             
	//   42   72:iconst_1        
	//   43   73:aload_1         
	//   44   74:bipush          14
	//   45   76:baload          
	//   46   77:bastore         
	//   47   78:areturn         
		}
	}

	private byte[] transceive(byte abyte0[])
		throws BusinessException
	{
		try
		{
			abyte0 = apduHandler.transceive(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ApduHandler apduHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #144 <Method byte[] ApduHandler.transceive(byte[])>
	//    4   10:astore_1        
		}
	//*   5   11:goto            83
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   6   14:astore_1        
		{
			if(fmLog != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field FMLog fmLog>
	//*   9   19:ifnull          54
				fmLog.warn(logTag, (new StringBuilder("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field FMLog fmLog>
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field String logTag>
	//   14   30:new             #146 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:ldc1            #148 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   17   36:invokespecial   #151 <Method void StringBuilder(String)>
	//   18   39:aload_1         
	//   19   40:invokestatic    #157 <Method String Util4Java.getExceptionInfo(Exception)>
	//   20   43:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   22   49:invokeinterface #167 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  23   54:aload_0         
	//*  24   55:getfield        #140 <Field ApduHandler apduHandler>
	//*  25   58:ifnull          70
				apduHandler.close();
	//   26   61:aload_0         
	//   27   62:getfield        #140 <Field ApduHandler apduHandler>
	//   28   65:invokeinterface #170 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   29   70:new             #136 <Class BusinessException>
	//   30   73:dup             
	//   31   74:ldc1            #148 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   32   76:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   33   79:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//*  42   94:getfield        #36  <Field FMLog fmLog>
	//*  43   97:ifnull          115
				fmLog.warn(logTag, "Apdu\u6307\u4EE4\u6267\u884C\u7ED3\u679C\u4E3A\u7A7A");
	//   44  100:aload_0         
	//   45  101:getfield        #36  <Field FMLog fmLog>
	//   46  104:aload_0         
	//   47  105:getfield        #44  <Field String logTag>
	//   48  108:ldc1            #181 <String "Apdu\u6307\u4EE4\u6267\u884C\u7ED3\u679C\u4E3A\u7A7A">
	//   49  110:invokeinterface #167 <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  50  115:aload_0         
	//*  51  116:getfield        #140 <Field ApduHandler apduHandler>
	//*  52  119:ifnull          131
				apduHandler.close();
	//   53  122:aload_0         
	//   54  123:getfield        #140 <Field ApduHandler apduHandler>
	//   55  126:invokeinterface #170 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   56  131:new             #136 <Class BusinessException>
	//   57  134:dup             
	//   58  135:ldc1            #183 <String "Apdu\u5904\u7406\u5668\u5904\u7406\u7ED3\u679C\u65E0\u6548">
	//   59  137:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   60  140:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//    1    1:getfield        #46  <Field byte[] aid>
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
	//*   4    6:getfield        #36  <Field FMLog fmLog>
	//*   5    9:ifnull          27
			fmLog.info(logTag, "SPTC APP NO ...");
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field FMLog fmLog>
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field String logTag>
	//   10   20:ldc1            #189 <String "SPTC APP NO ...">
	//   11   22:invokeinterface #192 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #140 <Field ApduHandler apduHandler>
	//*  14   31:ifnonnull       69
		{
			if(fmLog != null)
	//*  15   34:aload_0         
	//*  16   35:getfield        #36  <Field FMLog fmLog>
	//*  17   38:ifnull          56
				fmLog.warn(logTag, "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   18   41:aload_0         
	//   19   42:getfield        #36  <Field FMLog fmLog>
	//   20   45:aload_0         
	//   21   46:getfield        #44  <Field String logTag>
	//   22   49:ldc1            #194 <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   23   51:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   24   56:new             #136 <Class BusinessException>
	//   25   59:dup             
	//   26   60:ldc1            #194 <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   62:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   28   65:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   29   68:athrow          
		}
		byte abyte1[] = new byte[7];
	//   30   69:bipush          7
	//   31   71:newarray        byte[]
	//   32   73:astore_3        
		abyte1[1] = -92;
	//   33   74:aload_3         
	//   34   75:iconst_1        
	//   35   76:bipush          -92
	//   36   78:bastore         
		abyte1[4] = 2;
	//   37   79:aload_3         
	//   38   80:iconst_4        
	//   39   81:iconst_2        
	//   40   82:bastore         
		abyte1[5] = 63;
	//   41   83:aload_3         
	//   42   84:iconst_5        
	//   43   85:bipush          63
	//   44   87:bastore         
		abyte1[6] = 1;
	//   45   88:aload_3         
	//   46   89:bipush          6
	//   47   91:iconst_1        
	//   48   92:bastore         
		abyte1 = transceive(abyte1);
	//   49   93:aload_0         
	//   50   94:aload_3         
	//   51   95:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   52   98:astore_3        
		byte abyte2[] = getCityCode(abyte1);
	//   53   99:aload_0         
	//   54  100:aload_3         
	//   55  101:invokespecial   #200 <Method byte[] getCityCode(byte[])>
	//   56  104:astore          4
		if(abyte2 == null || !Arrays.equals(abyte2, CITY_CODE_SH))
	//*  57  106:aload           4
	//*  58  108:ifnull          123
	//*  59  111:aload           4
	//*  60  113:aload_0         
	//*  61  114:getfield        #48  <Field byte[] CITY_CODE_SH>
	//*  62  117:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//*  63  120:ifne            136
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_no_sptcc);
	//   64  123:new             #136 <Class BusinessException>
	//   65  126:dup             
	//   66  127:ldc1            #208 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361">
	//   67  129:getstatic       #211 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_no_sptcc>
	//   68  132:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   69  135:athrow          
		if(FM_Bytes.isEnd9000(abyte1))
	//*  70  136:aload_3         
	//*  71  137:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  72  140:ifeq            266
		{
			if(abyte1.length >= 42)
	//*  73  143:aload_3         
	//*  74  144:arraylength     
	//*  75  145:bipush          42
	//*  76  147:icmplt          165
			{
				int i = abyte0.length;
	//   77  150:aload_2         
	//   78  151:arraylength     
	//   79  152:istore_1        
				System.arraycopy(((Object) (abyte1)), 34, ((Object) (abyte0)), 0, 8);
	//   80  153:aload_3         
	//   81  154:bipush          34
	//   82  156:aload_2         
	//   83  157:iconst_0        
	//   84  158:bipush          8
	//   85  160:invokestatic    #221 <Method void System.arraycopy(Object, int, Object, int, int)>
				return abyte0;
	//   86  163:aload_2         
	//   87  164:areturn         
			}
			abyte1 = new byte[5];
	//   88  165:iconst_5        
	//   89  166:newarray        byte[]
	//   90  168:astore_3        
			abyte1[1] = -80;
	//   91  169:aload_3         
	//   92  170:iconst_1        
	//   93  171:bipush          -80
	//   94  173:bastore         
			abyte1[2] = -107;
	//   95  174:aload_3         
	//   96  175:iconst_2        
	//   97  176:bipush          -107
	//   98  178:bastore         
			abyte1 = transceive(abyte1);
	//   99  179:aload_0         
	//  100  180:aload_3         
	//  101  181:invokespecial   #198 <Method byte[] transceive(byte[])>
	//  102  184:astore_3        
			if(FM_Bytes.isEnd9000(abyte1))
	//* 103  185:aload_3         
	//* 104  186:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 105  189:ifeq            214
				if(abyte1.length >= 20)
	//* 106  192:aload_3         
	//* 107  193:arraylength     
	//* 108  194:bipush          20
	//* 109  196:icmplt          318
				{
					int j = abyte0.length;
	//  110  199:aload_2         
	//  111  200:arraylength     
	//  112  201:istore_1        
					System.arraycopy(((Object) (abyte1)), 12, ((Object) (abyte0)), 0, 8);
	//  113  202:aload_3         
	//  114  203:bipush          12
	//  115  205:aload_2         
	//  116  206:iconst_0        
	//  117  207:bipush          8
	//  118  209:invokestatic    #221 <Method void System.arraycopy(Object, int, Object, int, int)>
					return abyte0;
	//  119  212:aload_2         
	//  120  213:areturn         
				} else
	//* 121  214:aload_0         
	//* 122  215:getfield        #36  <Field FMLog fmLog>
	//* 123  218:ifnull          253
	//* 124  221:aload_0         
	//* 125  222:getfield        #36  <Field FMLog fmLog>
	//* 126  225:aload_0         
	//* 127  226:getfield        #44  <Field String logTag>
	//* 128  229:new             #146 <Class StringBuilder>
	//* 129  232:dup             
	//* 130  233:ldc1            #223 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38:">
	//* 131  235:invokespecial   #151 <Method void StringBuilder(String)>
	//* 132  238:aload_3         
	//* 133  239:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//* 134  242:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//* 135  245:invokevirtual   #164 <Method String StringBuilder.toString()>
	//* 136  248:invokeinterface #167 <Method void FMLog.warn(String, String)>
	//* 137  253:new             #136 <Class BusinessException>
	//* 138  256:dup             
	//* 139  257:ldc1            #225 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38">
	//* 140  259:getstatic       #228 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//* 141  262:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//* 142  265:athrow          
	//* 143  266:aload_0         
	//* 144  267:getfield        #36  <Field FMLog fmLog>
	//* 145  270:ifnull          305
	//* 146  273:aload_0         
	//* 147  274:getfield        #36  <Field FMLog fmLog>
	//* 148  277:aload_0         
	//* 149  278:getfield        #44  <Field String logTag>
	//* 150  281:new             #146 <Class StringBuilder>
	//* 151  284:dup             
	//* 152  285:ldc1            #230 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38:">
	//* 153  287:invokespecial   #151 <Method void StringBuilder(String)>
	//* 154  290:aload_3         
	//* 155  291:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//* 156  294:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//* 157  297:invokevirtual   #164 <Method String StringBuilder.toString()>
	//* 158  300:invokeinterface #167 <Method void FMLog.warn(String, String)>
	//* 159  305:new             #136 <Class BusinessException>
	//* 160  308:dup             
	//* 161  309:ldc1            #232 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38">
	//* 162  311:getstatic       #228 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_apdu_execute_exception>
	//* 163  314:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//* 164  317:athrow          
				{
					return null;
	//  165  318:aconst_null     
	//  166  319:areturn         
				}
			if(fmLog != null)
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38:")).append(FM_Bytes.bytesToHexString(abyte1)).toString());
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E915\u6587\u4EF6\u54CD\u5E94\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
		}
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38:")).append(FM_Bytes.bytesToHexString(abyte1)).toString());
		throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u5361\u53F7\u65F6\uFF0C\u9009\u62E9ADF\u6267\u884C\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_apdu_execute_exception);
	}

	public CardAppRecord getAppRecord4bytes(byte abyte0[], Map map)
	{
		CardAppRecord cardapprecord = new CardAppRecord();
	//    0    0:new             #236 <Class CardAppRecord>
	//    1    3:dup             
	//    2    4:invokespecial   #237 <Method void CardAppRecord()>
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
	//   19   24:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//   20   27:invokevirtual   #245 <Method void CardAppRecord.setTradeNo(int)>
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
	//   50   70:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   51   73:invokevirtual   #248 <Method void CardAppRecord.setTradeDate(String)>
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
	//   75  108:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   76  111:invokevirtual   #251 <Method void CardAppRecord.setTradeTime(String)>
		cardapprecord.setAmount(Integer.parseInt(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[5], abyte0[6], abyte0[7], abyte0[8]
		}), 16));
	//   77  114:aload_3         
	//   78  115:iconst_4        
	//   79  116:newarray        byte[]
	//   80  118:dup             
	//   81  119:iconst_0        
	//   82  120:aload_1         
	//   83  121:iconst_5        
	//   84  122:baload          
	//   85  123:bastore         
	//   86  124:dup             
	//   87  125:iconst_1        
	//   88  126:aload_1         
	//   89  127:bipush          6
	//   90  129:baload          
	//   91  130:bastore         
	//   92  131:dup             
	//   93  132:iconst_2        
	//   94  133:aload_1         
	//   95  134:bipush          7
	//   96  136:baload          
	//   97  137:bastore         
	//   98  138:dup             
	//   99  139:iconst_3        
	//  100  140:aload_1         
	//  101  141:bipush          8
	//  102  143:baload          
	//  103  144:bastore         
	//  104  145:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  105  148:bipush          16
	//  106  150:invokestatic    #257 <Method int Integer.parseInt(String, int)>
	//  107  153:invokevirtual   #260 <Method void CardAppRecord.setAmount(int)>
		cardapprecord.setBalance(FM_Bytes.bytesToInt(new byte[] {
			abyte0[2], abyte0[3], abyte0[4]
		}));
	//  108  156:aload_3         
	//  109  157:iconst_3        
	//  110  158:newarray        byte[]
	//  111  160:dup             
	//  112  161:iconst_0        
	//  113  162:aload_1         
	//  114  163:iconst_2        
	//  115  164:baload          
	//  116  165:bastore         
	//  117  166:dup             
	//  118  167:iconst_1        
	//  119  168:aload_1         
	//  120  169:iconst_3        
	//  121  170:baload          
	//  122  171:bastore         
	//  123  172:dup             
	//  124  173:iconst_2        
	//  125  174:aload_1         
	//  126  175:iconst_4        
	//  127  176:baload          
	//  128  177:bastore         
	//  129  178:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//  130  181:invokevirtual   #263 <Method void CardAppRecord.setBalance(int)>
		cardapprecord.setOriTradeType(abyte0[12]);
	//  131  184:aload_3         
	//  132  185:aload_1         
	//  133  186:bipush          12
	//  134  188:baload          
	//  135  189:invokevirtual   #267 <Method void CardAppRecord.setOriTradeType(byte)>
		cardapprecord.setOriTradeType(abyte0[9]);
	//  136  192:aload_3         
	//  137  193:aload_1         
	//  138  194:bipush          9
	//  139  196:baload          
	//  140  197:invokevirtual   #267 <Method void CardAppRecord.setOriTradeType(byte)>
		map = ((Map) ((EnumTradeType)map.get(((Object) ((new StringBuilder(String.valueOf(((Object) (FM_Bytes.bytesToHexString(abyte1)))))).append(FM_Bytes.bytesToHexString(abyte2)).toString())))));
	//  141  200:aload_2         
	//  142  201:new             #146 <Class StringBuilder>
	//  143  204:dup             
	//  144  205:aload           4
	//  145  207:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  146  210:invokestatic    #271 <Method String String.valueOf(Object)>
	//  147  213:invokespecial   #151 <Method void StringBuilder(String)>
	//  148  216:aload           5
	//  149  218:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  150  221:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  151  224:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  152  227:invokeinterface #277 <Method Object Map.get(Object)>
	//  153  232:checkcast       #59  <Class EnumTradeType>
	//  154  235:astore_2        
		EnumTradeType enumtradetype = get18TradeType(abyte0[12], abyte0[9]);
	//  155  236:aload_0         
	//  156  237:aload_1         
	//  157  238:bipush          12
	//  158  240:baload          
	//  159  241:aload_1         
	//  160  242:bipush          9
	//  161  244:baload          
	//  162  245:invokespecial   #279 <Method EnumTradeType get18TradeType(byte, byte)>
	//  163  248:astore          4
		if(enumtradetype != null)
	//* 164  250:aload           4
	//* 165  252:ifnull          264
			cardapprecord.setTradeType(enumtradetype);
	//  166  255:aload_3         
	//  167  256:aload           4
	//  168  258:invokevirtual   #283 <Method void CardAppRecord.setTradeType(EnumTradeType)>
		else
	//* 169  261:goto            269
			cardapprecord.setTradeType(((EnumTradeType) (map)));
	//  170  264:aload_3         
	//  171  265:aload_2         
	//  172  266:invokevirtual   #283 <Method void CardAppRecord.setTradeType(EnumTradeType)>
		cardapprecord.setTradeDevice(FM_Bytes.bytesToHexString(new byte[] {
			abyte0[10], abyte0[11], abyte0[12], abyte0[13], abyte0[14], abyte0[15]
		}));
	//  173  269:aload_3         
	//  174  270:bipush          6
	//  175  272:newarray        byte[]
	//  176  274:dup             
	//  177  275:iconst_0        
	//  178  276:aload_1         
	//  179  277:bipush          10
	//  180  279:baload          
	//  181  280:bastore         
	//  182  281:dup             
	//  183  282:iconst_1        
	//  184  283:aload_1         
	//  185  284:bipush          11
	//  186  286:baload          
	//  187  287:bastore         
	//  188  288:dup             
	//  189  289:iconst_2        
	//  190  290:aload_1         
	//  191  291:bipush          12
	//  192  293:baload          
	//  193  294:bastore         
	//  194  295:dup             
	//  195  296:iconst_3        
	//  196  297:aload_1         
	//  197  298:bipush          13
	//  198  300:baload          
	//  199  301:bastore         
	//  200  302:dup             
	//  201  303:iconst_4        
	//  202  304:aload_1         
	//  203  305:bipush          14
	//  204  307:baload          
	//  205  308:bastore         
	//  206  309:dup             
	//  207  310:iconst_5        
	//  208  311:aload_1         
	//  209  312:bipush          15
	//  210  314:baload          
	//  211  315:bastore         
	//  212  316:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  213  319:invokevirtual   #286 <Method void CardAppRecord.setTradeDevice(String)>
		return cardapprecord;
	//  214  322:aload_3         
	//  215  323:areturn         
	}

	public String getDateTime4File07(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #291 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #292 <Method void StringBuffer()>
	//    3    7:astore          4
		stringbuffer.append(String.valueOf(FM_Bytes.bytesToInt(new byte[] {
			abyte0[0], abyte0[1]
		}) >> 4));
	//    4    9:aload           4
	//    5   11:iconst_2        
	//    6   12:newarray        byte[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_1         
	//   10   17:iconst_0        
	//   11   18:baload          
	//   12   19:bastore         
	//   13   20:dup             
	//   14   21:iconst_1        
	//   15   22:aload_1         
	//   16   23:iconst_1        
	//   17   24:baload          
	//   18   25:bastore         
	//   19   26:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//   20   29:iconst_4        
	//   21   30:ishr            
	//   22   31:invokestatic    #294 <Method String String.valueOf(int)>
	//   23   34:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//   24   37:pop             
		String s1 = String.valueOf(abyte0[1] & 0xf);
	//   25   38:aload_1         
	//   26   39:iconst_1        
	//   27   40:baload          
	//   28   41:bipush          15
	//   29   43:iand            
	//   30   44:invokestatic    #294 <Method String String.valueOf(int)>
	//   31   47:astore_3        
		String s = s1;
	//   32   48:aload_3         
	//   33   49:astore_2        
		if(s1.length() == 1)
	//*  34   50:aload_3         
	//*  35   51:invokevirtual   #301 <Method int String.length()>
	//*  36   54:iconst_1        
	//*  37   55:icmpne          76
			s = (new StringBuilder("0")).append(s1).toString();
	//   38   58:new             #146 <Class StringBuilder>
	//   39   61:dup             
	//   40   62:ldc2            #303 <String "0">
	//   41   65:invokespecial   #151 <Method void StringBuilder(String)>
	//   42   68:aload_3         
	//   43   69:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   44   72:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   45   75:astore_2        
		stringbuffer.append(s);
	//   46   76:aload           4
	//   47   78:aload_2         
	//   48   79:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//   49   82:pop             
		s1 = String.valueOf((abyte0[2] & 0xf8) >> 3);
	//   50   83:aload_1         
	//   51   84:iconst_2        
	//   52   85:baload          
	//   53   86:sipush          248
	//   54   89:iand            
	//   55   90:iconst_3        
	//   56   91:ishr            
	//   57   92:invokestatic    #294 <Method String String.valueOf(int)>
	//   58   95:astore_3        
		s = s1;
	//   59   96:aload_3         
	//   60   97:astore_2        
		if(s1.length() == 1)
	//*  61   98:aload_3         
	//*  62   99:invokevirtual   #301 <Method int String.length()>
	//*  63  102:iconst_1        
	//*  64  103:icmpne          124
			s = (new StringBuilder("0")).append(s1).toString();
	//   65  106:new             #146 <Class StringBuilder>
	//   66  109:dup             
	//   67  110:ldc2            #303 <String "0">
	//   68  113:invokespecial   #151 <Method void StringBuilder(String)>
	//   69  116:aload_3         
	//   70  117:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   71  120:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   72  123:astore_2        
		stringbuffer.append(s);
	//   73  124:aload           4
	//   74  126:aload_2         
	//   75  127:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//   76  130:pop             
		s1 = String.valueOf(FM_Bytes.bytesToInt(new byte[] {
			(byte)(abyte0[2] & 7), (byte)(abyte0[3] & 0xc0)
		}) >> 6);
	//   77  131:iconst_2        
	//   78  132:newarray        byte[]
	//   79  134:dup             
	//   80  135:iconst_0        
	//   81  136:aload_1         
	//   82  137:iconst_2        
	//   83  138:baload          
	//   84  139:bipush          7
	//   85  141:iand            
	//   86  142:int2byte        
	//   87  143:bastore         
	//   88  144:dup             
	//   89  145:iconst_1        
	//   90  146:aload_1         
	//   91  147:iconst_3        
	//   92  148:baload          
	//   93  149:sipush          192
	//   94  152:iand            
	//   95  153:int2byte        
	//   96  154:bastore         
	//   97  155:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//   98  158:bipush          6
	//   99  160:ishr            
	//  100  161:invokestatic    #294 <Method String String.valueOf(int)>
	//  101  164:astore_3        
		s = s1;
	//  102  165:aload_3         
	//  103  166:astore_2        
		if(s1.length() == 1)
	//* 104  167:aload_3         
	//* 105  168:invokevirtual   #301 <Method int String.length()>
	//* 106  171:iconst_1        
	//* 107  172:icmpne          193
			s = (new StringBuilder("0")).append(s1).toString();
	//  108  175:new             #146 <Class StringBuilder>
	//  109  178:dup             
	//  110  179:ldc2            #303 <String "0">
	//  111  182:invokespecial   #151 <Method void StringBuilder(String)>
	//  112  185:aload_3         
	//  113  186:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  114  189:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  115  192:astore_2        
		stringbuffer.append(s);
	//  116  193:aload           4
	//  117  195:aload_2         
	//  118  196:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//  119  199:pop             
		s1 = String.valueOf(((int) ((byte)(abyte0[3] & 0x3f))));
	//  120  200:aload_1         
	//  121  201:iconst_3        
	//  122  202:baload          
	//  123  203:bipush          63
	//  124  205:iand            
	//  125  206:int2byte        
	//  126  207:invokestatic    #294 <Method String String.valueOf(int)>
	//  127  210:astore_3        
		s = s1;
	//  128  211:aload_3         
	//  129  212:astore_2        
		if(s1.length() == 1)
	//* 130  213:aload_3         
	//* 131  214:invokevirtual   #301 <Method int String.length()>
	//* 132  217:iconst_1        
	//* 133  218:icmpne          239
			s = (new StringBuilder("0")).append(s1).toString();
	//  134  221:new             #146 <Class StringBuilder>
	//  135  224:dup             
	//  136  225:ldc2            #303 <String "0">
	//  137  228:invokespecial   #151 <Method void StringBuilder(String)>
	//  138  231:aload_3         
	//  139  232:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  140  235:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  141  238:astore_2        
		stringbuffer.append(s);
	//  142  239:aload           4
	//  143  241:aload_2         
	//  144  242:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//  145  245:pop             
		s = String.valueOf((abyte0[4] & 0xfc) >> 2);
	//  146  246:aload_1         
	//  147  247:iconst_4        
	//  148  248:baload          
	//  149  249:sipush          252
	//  150  252:iand            
	//  151  253:iconst_2        
	//  152  254:ishr            
	//  153  255:invokestatic    #294 <Method String String.valueOf(int)>
	//  154  258:astore_2        
		abyte0 = ((byte []) (s));
	//  155  259:aload_2         
	//  156  260:astore_1        
		if(s.length() == 1)
	//* 157  261:aload_2         
	//* 158  262:invokevirtual   #301 <Method int String.length()>
	//* 159  265:iconst_1        
	//* 160  266:icmpne          287
			abyte0 = ((byte []) ((new StringBuilder("0")).append(s).toString()));
	//  161  269:new             #146 <Class StringBuilder>
	//  162  272:dup             
	//  163  273:ldc2            #303 <String "0">
	//  164  276:invokespecial   #151 <Method void StringBuilder(String)>
	//  165  279:aload_2         
	//  166  280:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  167  283:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  168  286:astore_1        
		stringbuffer.append(((String) (abyte0)));
	//  169  287:aload           4
	//  170  289:aload_1         
	//  171  290:invokevirtual   #297 <Method StringBuffer StringBuffer.append(String)>
	//  172  293:pop             
		return stringbuffer.toString();
	//  173  294:aload           4
	//  174  296:invokevirtual   #304 <Method String StringBuffer.toString()>
	//  175  299:areturn         
	}

	public String getFaceID()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #30  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #34  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #36  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #36  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "SPTC face no ...");
	//   10   24:aload_0         
	//   11   25:getfield        #36  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #44  <Field String logTag>
	//   14   32:ldc2            #307 <String "SPTC face no ...">
	//   15   35:invokeinterface #192 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #140 <Field ApduHandler apduHandler>
	//*  18   44:ifnonnull       84
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #36  <Field FMLog fmLog>
	//*  21   51:ifnull          70
				fmLog.warn(logTag, "\u83B7\u53D6\u5361\u9762\u53F7\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   54:aload_0         
	//   23   55:getfield        #36  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #44  <Field String logTag>
	//   26   62:ldc2            #309 <String "\u83B7\u53D6\u5361\u9762\u53F7\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   65:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u9762\u53F7\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   70:new             #136 <Class BusinessException>
	//   29   73:dup             
	//   30   74:ldc2            #309 <String "\u83B7\u53D6\u5361\u9762\u53F7\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   77:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   80:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   83:athrow          
		} else
		{
			return CardTools.getFaceID4UID(Arrays.copyOfRange(getAppNo(), 4, 8));
	//   34   84:aload_0         
	//   35   85:invokevirtual   #311 <Method byte[] getAppNo()>
	//   36   88:iconst_4        
	//   37   89:bipush          8
	//   38   91:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   39   94:invokestatic    #320 <Method String CardTools.getFaceID4UID(byte[])>
	//   40   97:areturn         
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
	//   17   21:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   18   24:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  19   25:aload_1         
	//*  20   26:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  21   29:ifne            86
		{
			if(fmLog != null)
	//*  22   32:aload_0         
	//*  23   33:getfield        #36  <Field FMLog fmLog>
	//*  24   36:ifnull          72
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u4F4F\u5EFA\u90E8\u8BA4\u8BC1\u7801\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25\uFF0Creponse\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   25   39:aload_0         
	//   26   40:getfield        #36  <Field FMLog fmLog>
	//   27   43:aload_0         
	//   28   44:getfield        #44  <Field String logTag>
	//   29   47:new             #146 <Class StringBuilder>
	//   30   50:dup             
	//   31   51:ldc2            #323 <String "\u83B7\u53D6\u4F4F\u5EFA\u90E8\u8BA4\u8BC1\u7801\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25\uFF0Creponse\uFF1A">
	//   32   54:invokespecial   #151 <Method void StringBuilder(String)>
	//   33   57:aload_1         
	//   34   58:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   35   61:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   37   67:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   38   72:new             #136 <Class BusinessException>
	//   39   75:dup             
	//   40   76:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   41   79:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   42   82:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   43   85:athrow          
		} else
		{
			return FM_Bytes.bytesToHexString(Arrays.copyOf(abyte0, abyte0.length - 2));
	//   44   86:aload_1         
	//   45   87:aload_1         
	//   46   88:arraylength     
	//   47   89:iconst_2        
	//   48   90:isub            
	//   49   91:invokestatic    #329 <Method byte[] Arrays.copyOf(byte[], int)>
	//   50   94:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
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
	//    0    0:getstatic       #339 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_INSTALL>
	//    1    3:astore          5
		if(fmLog != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #36  <Field FMLog fmLog>
	//*   4    9:ifnull          28
			fmLog.info(logTag, "\u83B7\u53D6\u5F53\u524D\u53D1\u884C\u72B6\u6001...");
	//    5   12:aload_0         
	//    6   13:getfield        #36  <Field FMLog fmLog>
	//    7   16:aload_0         
	//    8   17:getfield        #44  <Field String logTag>
	//    9   20:ldc2            #341 <String "\u83B7\u53D6\u5F53\u524D\u53D1\u884C\u72B6\u6001...">
	//   10   23:invokeinterface #192 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  11   28:aload_0         
	//*  12   29:getfield        #140 <Field ApduHandler apduHandler>
	//*  13   32:ifnonnull       72
		{
			if(fmLog != null)
	//*  14   35:aload_0         
	//*  15   36:getfield        #36  <Field FMLog fmLog>
	//*  16   39:ifnull          58
				fmLog.warn(logTag, "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   17   42:aload_0         
	//   18   43:getfield        #36  <Field FMLog fmLog>
	//   19   46:aload_0         
	//   20   47:getfield        #44  <Field String logTag>
	//   21   50:ldc2            #343 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   22   53:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   23   58:new             #136 <Class BusinessException>
	//   24   61:dup             
	//   25   62:ldc2            #343 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   26   65:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   27   68:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   28   71:athrow          
		}
		byte abyte0[] = new byte[5];
	//   29   72:iconst_5        
	//   30   73:newarray        byte[]
	//   31   75:astore          4
		abyte0[1] = -80;
	//   32   77:aload           4
	//   33   79:iconst_1        
	//   34   80:bipush          -80
	//   35   82:bastore         
		abyte0[2] = -107;
	//   36   83:aload           4
	//   37   85:iconst_2        
	//   38   86:bipush          -107
	//   39   88:bastore         
		try
		{
			obj = ((Object) (apduHandler.transceive(abyte0)));
	//   40   89:aload_0         
	//   41   90:getfield        #140 <Field ApduHandler apduHandler>
	//   42   93:aload           4
	//   43   95:invokeinterface #144 <Method byte[] ApduHandler.transceive(byte[])>
	//   44  100:astore          4
		}
	//*  45  102:goto            151
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  46  105:astore          4
		{
			if(fmLog != null)
	//*  47  107:aload_0         
	//*  48  108:getfield        #36  <Field FMLog fmLog>
	//*  49  111:ifnull          148
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   50  114:aload_0         
	//   51  115:getfield        #36  <Field FMLog fmLog>
	//   52  118:aload_0         
	//   53  119:getfield        #44  <Field String logTag>
	//   54  122:new             #146 <Class StringBuilder>
	//   55  125:dup             
	//   56  126:ldc2            #345 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u65F6\uFF0C\u8BFB\u53D60015\u6587\u4EF6\u5931\u8D25:">
	//   57  129:invokespecial   #151 <Method void StringBuilder(String)>
	//   58  132:aload           4
	//   59  134:invokestatic    #157 <Method String Util4Java.getExceptionInfo(Exception)>
	//   60  137:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   61  140:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   62  143:invokeinterface #125 <Method void FMLog.error(String, String)>
			return enumcardappstatus;
	//   63  148:aload           5
	//   64  150:areturn         
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//*  65  151:aload           4
	//*  66  153:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  67  156:ifne            162
			return enumcardappstatus;
	//   68  159:aload           5
	//   69  161:areturn         
		byte abyte3[] = new byte[32];
	//   70  162:bipush          32
	//   71  164:newarray        byte[]
	//   72  166:astore          6
		abyte3[30] = -112;
	//   73  168:aload           6
	//   74  170:bipush          30
	//   75  172:bipush          -112
	//   76  174:bastore         
		if(!Arrays.equals(abyte3, ((byte []) (obj))))
	//*  77  175:aload           6
	//*  78  177:aload           4
	//*  79  179:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//*  80  182:ifne            193
			enumcardappstatus1 = EnumCardAppStatus.STATUS_PERSONALIZED;
	//   81  185:getstatic       #348 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_PERSONALIZED>
	//   82  188:astore          7
		else
	//*  83  190:goto            196
			return enumcardappstatus;
	//   84  193:aload           5
	//   85  195:areturn         
		Random random = new Random();
	//   86  196:new             #350 <Class Random>
	//   87  199:dup             
	//   88  200:invokespecial   #351 <Method void Random()>
	//   89  203:astore          6
		abyte2 = new byte[8];
	//   90  205:bipush          8
	//   91  207:newarray        byte[]
	//   92  209:astore          5
		random.nextBytes(abyte2);
	//   93  211:aload           6
	//   94  213:aload           5
	//   95  215:invokevirtual   #355 <Method void Random.nextBytes(byte[])>
		random = ((Random) (new byte[5]));
	//   96  218:iconst_5        
	//   97  219:newarray        byte[]
	//   98  221:astore          6
		random[1] = 10;
	//   99  223:aload           6
	//  100  225:iconst_1        
	//  101  226:bipush          10
	//  102  228:bastore         
		random[2] = -125;
	//  103  229:aload           6
	//  104  231:iconst_2        
	//  105  232:bipush          -125
	//  106  234:bastore         
		random[3] = 4;
	//  107  235:aload           6
	//  108  237:iconst_3        
	//  109  238:iconst_4        
	//  110  239:bastore         
		random[4] = 8;
	//  111  240:aload           6
	//  112  242:iconst_4        
	//  113  243:bipush          8
	//  114  245:bastore         
		abyte2 = FM_Bytes.join(((byte []) (random)), abyte2);
	//  115  246:aload           6
	//  116  248:aload           5
	//  117  250:invokestatic    #359 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  118  253:astore          5
		flag = false;
	//  119  255:iconst_0        
	//  120  256:istore_1        
		abyte2 = apduHandler.transceive(abyte2);
	//  121  257:aload_0         
	//  122  258:getfield        #140 <Field ApduHandler apduHandler>
	//  123  261:aload           5
	//  124  263:invokeinterface #144 <Method byte[] ApduHandler.transceive(byte[])>
	//  125  268:astore          5
		obj = ((Object) (abyte2));
	//  126  270:aload           5
	//  127  272:astore          4
		break MISSING_BLOCK_LABEL_322;
	//  128  274:goto            322
		FMScriptHandleException fmscripthandleexception;
		fmscripthandleexception;
	//  129  277:astore          5
		if(fmLog != null)
	//* 130  279:aload_0         
	//* 131  280:getfield        #36  <Field FMLog fmLog>
	//* 132  283:ifnull          320
			fmLog.error(logTag, (new StringBuilder("\u5224\u65AD\u662F\u5426\u5708\u5B58\u9501\u5B9A\u65F6\uFF0C\u5F02\u5E38:")).append(Util4Java.getExceptionInfo(((Exception) (fmscripthandleexception)))).toString());
	//  133  286:aload_0         
	//  134  287:getfield        #36  <Field FMLog fmLog>
	//  135  290:aload_0         
	//  136  291:getfield        #44  <Field String logTag>
	//  137  294:new             #146 <Class StringBuilder>
	//  138  297:dup             
	//  139  298:ldc2            #361 <String "\u5224\u65AD\u662F\u5426\u5708\u5B58\u9501\u5B9A\u65F6\uFF0C\u5F02\u5E38:">
	//  140  301:invokespecial   #151 <Method void StringBuilder(String)>
	//  141  304:aload           5
	//  142  306:invokestatic    #157 <Method String Util4Java.getExceptionInfo(Exception)>
	//  143  309:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  144  312:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  145  315:invokeinterface #125 <Method void FMLog.error(String, String)>
		flag = true;
	//  146  320:iconst_1        
	//  147  321:istore_1        
		long l;
		Date date;
		Object obj2;
		String s;
		if(flag)
	//* 148  322:iload_1         
	//* 149  323:ifeq            331
		{
			flag = true;
	//  150  326:iconst_1        
	//  151  327:istore_1        
			break MISSING_BLOCK_LABEL_479;
	//  152  328:goto            479
		}
		if(!FM_Bytes.isEnd9000(((byte []) (obj))))
	//* 153  331:aload           4
	//* 154  333:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 155  336:ifne            344
		{
			flag = true;
	//  156  339:iconst_1        
	//  157  340:istore_1        
			break MISSING_BLOCK_LABEL_479;
	//  158  341:goto            479
		}
		if(obj.length < 5)
	//* 159  344:aload           4
	//* 160  346:arraylength     
	//* 161  347:iconst_5        
	//* 162  348:icmpge          356
		{
			flag = true;
	//  163  351:iconst_1        
	//  164  352:istore_1        
			break MISSING_BLOCK_LABEL_479;
	//  165  353:goto            479
		}
		s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(((byte []) (obj)), 1, 5));
	//  166  356:aload           4
	//  167  358:iconst_1        
	//  168  359:iconst_5        
	//  169  360:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  170  363:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  171  366:astore          8
		l = System.currentTimeMillis();
	//  172  368:invokestatic    #365 <Method long System.currentTimeMillis()>
	//  173  371:lstore_2        
		obj2 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  174  372:new             #367 <Class SimpleDateFormat>
	//  175  375:dup             
	//  176  376:ldc2            #369 <String "yyyyMMdd">
	//  177  379:invokespecial   #370 <Method void SimpleDateFormat(String)>
	//  178  382:astore          6
		date = null;
	//  179  384:aconst_null     
	//  180  385:astore          5
		obj2 = ((Object) (((SimpleDateFormat) (obj2)).parse(s)));
	//  181  387:aload           6
	//  182  389:aload           8
	//  183  391:invokevirtual   #374 <Method Date SimpleDateFormat.parse(String)>
	//  184  394:astore          6
		date = ((Date) (obj2));
	//  185  396:aload           6
	//  186  398:astore          5
		break MISSING_BLOCK_LABEL_443;
	//  187  400:goto            443
		ParseException parseexception;
		parseexception;
	//  188  403:astore          6
		if(fmLog != null)
	//* 189  405:aload_0         
	//* 190  406:getfield        #36  <Field FMLog fmLog>
	//* 191  409:ifnull          443
			fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:")).append(s).toString());
	//  192  412:aload_0         
	//  193  413:getfield        #36  <Field FMLog fmLog>
	//  194  416:aload_0         
	//  195  417:getfield        #44  <Field String logTag>
	//  196  420:new             #146 <Class StringBuilder>
	//  197  423:dup             
	//  198  424:ldc2            #376 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  199  427:invokespecial   #151 <Method void StringBuilder(String)>
	//  200  430:aload           8
	//  201  432:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  202  435:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  203  438:invokeinterface #167 <Method void FMLog.warn(String, String)>
		if(date == null)
	//* 204  443:aload           5
	//* 205  445:ifnonnull       453
			flag = true;
	//  206  448:iconst_1        
	//  207  449:istore_1        
		else
	//* 208  450:goto            479
		if(obj[0] == 0 || date.getTime() < l)
	//* 209  453:aload           4
	//* 210  455:iconst_0        
	//* 211  456:baload          
	//* 212  457:ifeq            470
	//* 213  460:aload           5
	//* 214  462:invokevirtual   #381 <Method long Date.getTime()>
	//* 215  465:lload_2         
	//* 216  466:lcmp            
	//* 217  467:ifge            475
			flag = false;
	//  218  470:iconst_0        
	//  219  471:istore_1        
		else
	//* 220  472:goto            479
			return EnumCardAppStatus.STATUS_ACTIVATE;
	//  221  475:getstatic       #384 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  222  478:areturn         
		if(flag)
	//* 223  479:iload_1         
	//* 224  480:ifeq            713
		{
			byte abyte1[] = new byte[16];
	//  225  483:bipush          16
	//  226  485:newarray        byte[]
	//  227  487:astore          4
			abyte1[0] = -128;
	//  228  489:aload           4
	//  229  491:iconst_0        
	//  230  492:bipush          -128
	//  231  494:bastore         
			abyte1[1] = 80;
	//  232  495:aload           4
	//  233  497:iconst_1        
	//  234  498:bipush          80
	//  235  500:bastore         
			abyte1[3] = 2;
	//  236  501:aload           4
	//  237  503:iconst_3        
	//  238  504:iconst_2        
	//  239  505:bastore         
			abyte1[4] = 11;
	//  240  506:aload           4
	//  241  508:iconst_4        
	//  242  509:bipush          11
	//  243  511:bastore         
			abyte1[5] = 1;
	//  244  512:aload           4
	//  245  514:iconst_5        
	//  246  515:iconst_1        
	//  247  516:bastore         
			abyte1[8] = 7;
	//  248  517:aload           4
	//  249  519:bipush          8
	//  250  521:bipush          7
	//  251  523:bastore         
			abyte1[9] = -48;
	//  252  524:aload           4
	//  253  526:bipush          9
	//  254  528:bipush          -48
	//  255  530:bastore         
			Object obj1;
			try
			{
				obj1 = ((Object) (apduHandler.transceive(abyte1)));
	//  256  531:aload_0         
	//  257  532:getfield        #140 <Field ApduHandler apduHandler>
	//  258  535:aload           4
	//  259  537:invokeinterface #144 <Method byte[] ApduHandler.transceive(byte[])>
	//  260  542:astore          4
			}
	//* 261  544:goto            593
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 262  547:astore          4
			{
				if(fmLog != null)
	//* 263  549:aload_0         
	//* 264  550:getfield        #36  <Field FMLog fmLog>
	//* 265  553:ifnull          590
					fmLog.error(logTag, (new StringBuilder("\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj1)))).toString());
	//  266  556:aload_0         
	//  267  557:getfield        #36  <Field FMLog fmLog>
	//  268  560:aload_0         
	//  269  561:getfield        #44  <Field String logTag>
	//  270  564:new             #146 <Class StringBuilder>
	//  271  567:dup             
	//  272  568:ldc2            #386 <String "\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:">
	//  273  571:invokespecial   #151 <Method void StringBuilder(String)>
	//  274  574:aload           4
	//  275  576:invokestatic    #157 <Method String Util4Java.getExceptionInfo(Exception)>
	//  276  579:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  277  582:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  278  585:invokeinterface #125 <Method void FMLog.error(String, String)>
				return enumcardappstatus1;
	//  279  590:aload           7
	//  280  592:areturn         
			}
			if(!FM_Bytes.isEnd9000(((byte []) (obj1))))
	//* 281  593:aload           4
	//* 282  595:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 283  598:ifne            604
				return enumcardappstatus1;
	//  284  601:aload           7
	//  285  603:areturn         
			obj1 = ((Object) (FM_Bytes.hexStringToBytes("805200000B2014072815153492F981B2")));
	//  286  604:ldc2            #388 <String "805200000B2014072815153492F981B2">
	//  287  607:invokestatic    #133 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//  288  610:astore          4
			try
			{
				obj1 = ((Object) (apduHandler.transceive(((byte []) (obj1)))));
	//  289  612:aload_0         
	//  290  613:getfield        #140 <Field ApduHandler apduHandler>
	//  291  616:aload           4
	//  292  618:invokeinterface #144 <Method byte[] ApduHandler.transceive(byte[])>
	//  293  623:astore          4
			}
	//* 294  625:goto            674
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 295  628:astore          4
			{
				if(fmLog != null)
	//* 296  630:aload_0         
	//* 297  631:getfield        #36  <Field FMLog fmLog>
	//* 298  634:ifnull          671
					fmLog.error(logTag, (new StringBuilder("\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (obj1)))).toString());
	//  299  637:aload_0         
	//  300  638:getfield        #36  <Field FMLog fmLog>
	//  301  641:aload_0         
	//  302  642:getfield        #44  <Field String logTag>
	//  303  645:new             #146 <Class StringBuilder>
	//  304  648:dup             
	//  305  649:ldc2            #386 <String "\u5224\u65AD\u5361\u662F\u5426\u5F00\u901A\u65F6\uFF0C\u5708\u5B58\u521D\u59CB\u5316\u5931\u8D25:">
	//  306  652:invokespecial   #151 <Method void StringBuilder(String)>
	//  307  655:aload           4
	//  308  657:invokestatic    #157 <Method String Util4Java.getExceptionInfo(Exception)>
	//  309  660:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  310  663:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  311  666:invokeinterface #125 <Method void FMLog.error(String, String)>
				return enumcardappstatus1;
	//  312  671:aload           7
	//  313  673:areturn         
			}
			if(FM_Bytes.isEnd(((byte []) (obj1)), new byte[] {
	-109, 2
}))
	//* 314  674:aload           4
	//* 315  676:iconst_2        
	//* 316  677:newarray        byte[]
	//* 317  679:dup             
	//* 318  680:iconst_0        
	//* 319  681:ldc2            #389 <Int -109>
	//* 320  684:bastore         
	//* 321  685:dup             
	//* 322  686:iconst_1        
	//* 323  687:ldc2            #390 <Int 2>
	//* 324  690:bastore         
	//* 325  691:invokestatic    #393 <Method boolean FM_Bytes.isEnd(byte[], byte[])>
	//* 326  694:ifeq            701
				return EnumCardAppStatus.STATUS_ACTIVATE;
	//  327  697:getstatic       #384 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  328  700:areturn         
			if(FM_Bytes.isEnd9000(((byte []) (obj1))))
	//* 329  701:aload           4
	//* 330  703:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//* 331  706:ifeq            713
				return EnumCardAppStatus.STATUS_ACTIVATE;
	//  332  709:getstatic       #384 <Field EnumCardAppStatus EnumCardAppStatus.STATUS_ACTIVATE>
	//  333  712:areturn         
		}
		return enumcardappstatus1;
	//  334  713:aload           7
	//  335  715:areturn         
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
	//   21   26:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   22   29:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  23   30:aload_1         
	//*  24   31:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  25   34:ifne            91
		{
			if(fmLog != null)
	//*  26   37:aload_0         
	//*  27   38:getfield        #36  <Field FMLog fmLog>
	//*  28   41:ifnull          77
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   29   44:aload_0         
	//   30   45:getfield        #36  <Field FMLog fmLog>
	//   31   48:aload_0         
	//   32   49:getfield        #44  <Field String logTag>
	//   33   52:new             #146 <Class StringBuilder>
	//   34   55:dup             
	//   35   56:ldc2            #396 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u5931\u8D25\uFF1A">
	//   36   59:invokespecial   #151 <Method void StringBuilder(String)>
	//   37   62:aload_1         
	//   38   63:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   39   66:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   40   69:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   41   72:invokeinterface #125 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   42   77:new             #136 <Class BusinessException>
	//   43   80:dup             
	//   44   81:ldc2            #398 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u9009\u62E9\u5E94\u7528\u76EE\u5F55\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   45   84:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   46   87:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47   90:athrow          
		}
		abyte0 = getCityCode(abyte0);
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:invokespecial   #200 <Method byte[] getCityCode(byte[])>
	//   51   96:astore_1        
		if(abyte0 == null || !Arrays.equals(abyte0, CITY_CODE_SH))
	//*  52   97:aload_1         
	//*  53   98:ifnull          112
	//*  54  101:aload_1         
	//*  55  102:aload_0         
	//*  56  103:getfield        #48  <Field byte[] CITY_CODE_SH>
	//*  57  106:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//*  58  109:ifne            126
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_no_sptcc);
	//   59  112:new             #136 <Class BusinessException>
	//   60  115:dup             
	//   61  116:ldc2            #400 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361">
	//   62  119:getstatic       #211 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_no_sptcc>
	//   63  122:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   64  125:athrow          
		abyte0 = new byte[5];
	//   65  126:iconst_5        
	//   66  127:newarray        byte[]
	//   67  129:astore_1        
		abyte0[1] = -80;
	//   68  130:aload_1         
	//   69  131:iconst_1        
	//   70  132:bipush          -80
	//   71  134:bastore         
		abyte0[2] = -107;
	//   72  135:aload_1         
	//   73  136:iconst_2        
	//   74  137:bipush          -107
	//   75  139:bastore         
		abyte0 = transceive(abyte0);
	//   76  140:aload_0         
	//   77  141:aload_1         
	//   78  142:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   79  145:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  80  146:aload_1         
	//*  81  147:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  82  150:ifne            207
		{
			if(fmLog != null)
	//*  83  153:aload_0         
	//*  84  154:getfield        #36  <Field FMLog fmLog>
	//*  85  157:ifnull          193
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   86  160:aload_0         
	//   87  161:getfield        #36  <Field FMLog fmLog>
	//   88  164:aload_0         
	//   89  165:getfield        #44  <Field String logTag>
	//   90  168:new             #146 <Class StringBuilder>
	//   91  171:dup             
	//   92  172:ldc2            #402 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//   93  175:invokespecial   #151 <Method void StringBuilder(String)>
	//   94  178:aload_1         
	//   95  179:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   96  182:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   98  188:invokeinterface #125 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   99  193:new             #136 <Class BusinessException>
	//  100  196:dup             
	//  101  197:ldc2            #404 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//  102  200:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  103  203:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  104  206:athrow          
		}
		if(abyte0.length < 29)
	//* 105  207:aload_1         
	//* 106  208:arraylength     
	//* 107  209:bipush          29
	//* 108  211:icmpge          268
		{
			if(fmLog != null)
	//* 109  214:aload_0         
	//* 110  215:getfield        #36  <Field FMLog fmLog>
	//* 111  218:ifnull          254
				fmLog.error(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  112  221:aload_0         
	//  113  222:getfield        #36  <Field FMLog fmLog>
	//  114  225:aload_0         
	//  115  226:getfield        #44  <Field String logTag>
	//  116  229:new             #146 <Class StringBuilder>
	//  117  232:dup             
	//  118  233:ldc2            #402 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25\uFF1A">
	//  119  236:invokespecial   #151 <Method void StringBuilder(String)>
	//  120  239:aload_1         
	//  121  240:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  122  243:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  123  246:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  124  249:invokeinterface #125 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  125  254:new             #136 <Class BusinessException>
	//  126  257:dup             
	//  127  258:ldc2            #404 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u6709\u6548\u671F\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//  128  261:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  129  264:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  130  267:athrow          
		} else
		{
			return FM_Bytes.bytesToHexString(new byte[] {
				abyte0[24], abyte0[25], abyte0[26], abyte0[27]
			});
	//  131  268:iconst_4        
	//  132  269:newarray        byte[]
	//  133  271:dup             
	//  134  272:iconst_0        
	//  135  273:aload_1         
	//  136  274:bipush          24
	//  137  276:baload          
	//  138  277:bastore         
	//  139  278:dup             
	//  140  279:iconst_1        
	//  141  280:aload_1         
	//  142  281:bipush          25
	//  143  283:baload          
	//  144  284:bastore         
	//  145  285:dup             
	//  146  286:iconst_2        
	//  147  287:aload_1         
	//  148  288:bipush          26
	//  149  290:baload          
	//  150  291:bastore         
	//  151  292:dup             
	//  152  293:iconst_3        
	//  153  294:aload_1         
	//  154  295:bipush          27
	//  155  297:baload          
	//  156  298:bastore         
	//  157  299:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  158  302:areturn         
		}
	}

	public boolean isLock4Consume()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #30  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #34  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #36  <Field FMLog fmLog>
		if(apduHandler == null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #140 <Field ApduHandler apduHandler>
	//*   9   21:ifnonnull       61
		{
			if(fmLog != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #36  <Field FMLog fmLog>
	//*  12   28:ifnull          47
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   13   31:aload_0         
	//   14   32:getfield        #36  <Field FMLog fmLog>
	//   15   35:aload_0         
	//   16   36:getfield        #44  <Field String logTag>
	//   17   39:ldc2            #408 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   18   42:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   19   47:new             #136 <Class BusinessException>
	//   20   50:dup             
	//   21   51:ldc2            #410 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   22   54:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   23   57:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   24   60:athrow          
		}
		Object obj = ((Object) (new Random()));
	//   25   61:new             #350 <Class Random>
	//   26   64:dup             
	//   27   65:invokespecial   #351 <Method void Random()>
	//   28   68:astore          4
		byte abyte0[] = new byte[8];
	//   29   70:bipush          8
	//   30   72:newarray        byte[]
	//   31   74:astore_3        
		((Random) (obj)).nextBytes(abyte0);
	//   32   75:aload           4
	//   33   77:aload_3         
	//   34   78:invokevirtual   #355 <Method void Random.nextBytes(byte[])>
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
	//   57  113:invokestatic    #359 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   58  116:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   59  119:astore          4
		if(!FM_Bytes.isEnd9000(abyte1))
	//*  60  121:aload           4
	//*  61  123:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  62  126:ifne            166
		{
			if(fmLog != null)
	//*  63  129:aload_0         
	//*  64  130:getfield        #36  <Field FMLog fmLog>
	//*  65  133:ifnull          152
				fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25");
	//   66  136:aload_0         
	//   67  137:getfield        #36  <Field FMLog fmLog>
	//   68  140:aload_0         
	//   69  141:getfield        #44  <Field String logTag>
	//   70  144:ldc2            #412 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25">
	//   71  147:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   72  152:new             #136 <Class BusinessException>
	//   73  155:dup             
	//   74  156:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   75  159:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   76  162:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//*  83  174:getfield        #36  <Field FMLog fmLog>
	//*  84  177:ifnull          196
				fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25");
	//   85  180:aload_0         
	//   86  181:getfield        #36  <Field FMLog fmLog>
	//   87  184:aload_0         
	//   88  185:getfield        #44  <Field String logTag>
	//   89  188:ldc2            #414 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   90  191:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   91  196:new             #136 <Class BusinessException>
	//   92  199:dup             
	//   93  200:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   94  203:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   95  206:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   96  209:athrow          
		}
		String s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(abyte1, 1, 5));
	//   97  210:aload           4
	//   98  212:iconst_1        
	//   99  213:iconst_5        
	//  100  214:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  101  217:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  102  220:astore_3        
		long l = System.currentTimeMillis();
	//  103  221:invokestatic    #365 <Method long System.currentTimeMillis()>
	//  104  224:lstore_1        
		Object obj1 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  105  225:new             #367 <Class SimpleDateFormat>
	//  106  228:dup             
	//  107  229:ldc2            #369 <String "yyyyMMdd">
	//  108  232:invokespecial   #370 <Method void SimpleDateFormat(String)>
	//  109  235:astore          5
		try
		{
			obj1 = ((Object) (((SimpleDateFormat) (obj1)).parse(s)));
	//  110  237:aload           5
	//  111  239:aload_3         
	//  112  240:invokevirtual   #374 <Method Date SimpleDateFormat.parse(String)>
	//  113  243:astore          5
		}
	//* 114  245:goto            301
		// Misplaced declaration of an exception variable
		catch(byte abyte1[])
	//* 115  248:astore          4
		{
			if(fmLog != null)
	//* 116  250:aload_0         
	//* 117  251:getfield        #36  <Field FMLog fmLog>
	//* 118  254:ifnull          287
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:")).append(s).toString());
	//  119  257:aload_0         
	//  120  258:getfield        #36  <Field FMLog fmLog>
	//  121  261:aload_0         
	//  122  262:getfield        #44  <Field String logTag>
	//  123  265:new             #146 <Class StringBuilder>
	//  124  268:dup             
	//  125  269:ldc2            #376 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  126  272:invokespecial   #151 <Method void StringBuilder(String)>
	//  127  275:aload_3         
	//  128  276:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  129  279:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  130  282:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  131  287:new             #136 <Class BusinessException>
	//  132  290:dup             
	//  133  291:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//  134  294:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  135  297:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  136  300:athrow          
		}
		return abyte1[0] == 0 || ((Date) (obj1)).getTime() < l;
	//  137  301:aload           4
	//  138  303:iconst_0        
	//  139  304:baload          
	//  140  305:ifeq            318
	//  141  308:aload           5
	//  142  310:invokevirtual   #381 <Method long Date.getTime()>
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
	//*   1    1:getfield        #36  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #30  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #34  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #36  <Field FMLog fmLog>
		if(apduHandler == null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #140 <Field ApduHandler apduHandler>
	//*   9   21:ifnonnull       61
		{
			if(fmLog != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #36  <Field FMLog fmLog>
	//*  12   28:ifnull          47
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   13   31:aload_0         
	//   14   32:getfield        #36  <Field FMLog fmLog>
	//   15   35:aload_0         
	//   16   36:getfield        #44  <Field String logTag>
	//   17   39:ldc2            #408 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   18   42:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   19   47:new             #136 <Class BusinessException>
	//   20   50:dup             
	//   21   51:ldc2            #410 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   22   54:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   23   57:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   24   60:athrow          
		}
		Object obj = ((Object) (new Random()));
	//   25   61:new             #350 <Class Random>
	//   26   64:dup             
	//   27   65:invokespecial   #351 <Method void Random()>
	//   28   68:astore          4
		byte abyte0[] = new byte[8];
	//   29   70:bipush          8
	//   30   72:newarray        byte[]
	//   31   74:astore_3        
		((Random) (obj)).nextBytes(abyte0);
	//   32   75:aload           4
	//   33   77:aload_3         
	//   34   78:invokevirtual   #355 <Method void Random.nextBytes(byte[])>
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
	//   57  113:invokestatic    #359 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   58  116:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   59  119:astore          4
		if(!FM_Bytes.isEnd9000(abyte1))
	//*  60  121:aload           4
	//*  61  123:invokestatic    #215 <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  62  126:ifne            166
		{
			if(fmLog != null)
	//*  63  129:aload_0         
	//*  64  130:getfield        #36  <Field FMLog fmLog>
	//*  65  133:ifnull          152
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25");
	//   66  136:aload_0         
	//   67  137:getfield        #36  <Field FMLog fmLog>
	//   68  140:aload_0         
	//   69  141:getfield        #44  <Field String logTag>
	//   70  144:ldc2            #417 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u8FD4\u56DE\u7ED3\u679C\u5931\u8D25">
	//   71  147:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   72  152:new             #136 <Class BusinessException>
	//   73  155:dup             
	//   74  156:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   75  159:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   76  162:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
	//*  83  174:getfield        #36  <Field FMLog fmLog>
	//*  84  177:ifnull          196
				fmLog.warn(logTag, "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25");
	//   85  180:aload_0         
	//   86  181:getfield        #36  <Field FMLog fmLog>
	//   87  184:aload_0         
	//   88  185:getfield        #44  <Field String logTag>
	//   89  188:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   90  191:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   91  196:new             #136 <Class BusinessException>
	//   92  199:dup             
	//   93  200:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//   94  203:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   95  206:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   96  209:athrow          
		}
		String s = FM_Bytes.bytesToHexString(Arrays.copyOfRange(abyte1, 1, 5));
	//   97  210:aload           4
	//   98  212:iconst_1        
	//   99  213:iconst_5        
	//  100  214:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  101  217:invokestatic    #109 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  102  220:astore_3        
		long l = System.currentTimeMillis();
	//  103  221:invokestatic    #365 <Method long System.currentTimeMillis()>
	//  104  224:lstore_1        
		Object obj1 = ((Object) (new SimpleDateFormat("yyyyMMdd")));
	//  105  225:new             #367 <Class SimpleDateFormat>
	//  106  228:dup             
	//  107  229:ldc2            #369 <String "yyyyMMdd">
	//  108  232:invokespecial   #370 <Method void SimpleDateFormat(String)>
	//  109  235:astore          5
		try
		{
			obj1 = ((Object) (((SimpleDateFormat) (obj1)).parse(s)));
	//  110  237:aload           5
	//  111  239:aload_3         
	//  112  240:invokevirtual   #374 <Method Date SimpleDateFormat.parse(String)>
	//  113  243:astore          5
		}
	//* 114  245:goto            301
		// Misplaced declaration of an exception variable
		catch(byte abyte1[])
	//* 115  248:astore          4
		{
			if(fmLog != null)
	//* 116  250:aload_0         
	//* 117  251:getfield        #36  <Field FMLog fmLog>
	//* 118  254:ifnull          287
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:")).append(s).toString());
	//  119  257:aload_0         
	//  120  258:getfield        #36  <Field FMLog fmLog>
	//  121  261:aload_0         
	//  122  262:getfield        #44  <Field String logTag>
	//  123  265:new             #146 <Class StringBuilder>
	//  124  268:dup             
	//  125  269:ldc2            #376 <String "\u83B7\u53D6\u6D88\u8D39\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0C\u83B7\u53D6\u7684\u65E5\u671F\u683C\u5F0F\u5F02\u5E38:">
	//  126  272:invokespecial   #151 <Method void StringBuilder(String)>
	//  127  275:aload_3         
	//  128  276:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//  129  279:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  130  282:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  131  287:new             #136 <Class BusinessException>
	//  132  290:dup             
	//  133  291:ldc2            #325 <String "\u83B7\u53D6\u5708\u5B58\u529F\u80FD\u9501\u5B9A\u72B6\u6001\u65F6\uFF0CAPDU\u6307\u4EE4\u5904\u7406\u5931\u8D25">
	//  134  294:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  135  297:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  136  300:athrow          
		}
		return abyte1[0] == 0 || ((Date) (obj1)).getTime() < l;
	//  137  301:aload           4
	//  138  303:iconst_0        
	//  139  304:baload          
	//  140  305:ifeq            318
	//  141  308:aload           5
	//  142  310:invokevirtual   #381 <Method long Date.getTime()>
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
	//*   1    1:getfield        #36  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #30  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #34  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #36  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #36  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "SPTC blance ...");
	//   10   24:aload_0         
	//   11   25:getfield        #36  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #44  <Field String logTag>
	//   14   32:ldc2            #420 <String "SPTC blance ...">
	//   15   35:invokeinterface #192 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #140 <Field ApduHandler apduHandler>
	//*  18   44:ifnonnull       84
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #36  <Field FMLog fmLog>
	//*  21   51:ifnull          70
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   54:aload_0         
	//   23   55:getfield        #36  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #44  <Field String logTag>
	//   26   62:ldc2            #410 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   65:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   70:new             #136 <Class BusinessException>
	//   29   73:dup             
	//   30   74:ldc2            #410 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   31   77:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   80:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
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
		abyte0 = getCityCode(transceive(abyte0));
	//   53  108:aload_0         
	//   54  109:aload_0         
	//   55  110:aload_1         
	//   56  111:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   57  114:invokespecial   #200 <Method byte[] getCityCode(byte[])>
	//   58  117:astore_1        
		if(abyte0 == null || !Arrays.equals(abyte0, CITY_CODE_SH))
	//*  59  118:aload_1         
	//*  60  119:ifnull          133
	//*  61  122:aload_1         
	//*  62  123:aload_0         
	//*  63  124:getfield        #48  <Field byte[] CITY_CODE_SH>
	//*  64  127:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//*  65  130:ifne            147
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_no_sptcc);
	//   66  133:new             #136 <Class BusinessException>
	//   67  136:dup             
	//   68  137:ldc2            #400 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361">
	//   69  140:getstatic       #211 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_no_sptcc>
	//   70  143:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   71  146:athrow          
		abyte0 = new byte[17];
	//   72  147:bipush          17
	//   73  149:newarray        byte[]
	//   74  151:astore_1        
		abyte0[0] = -128;
	//   75  152:aload_1         
	//   76  153:iconst_0        
	//   77  154:bipush          -128
	//   78  156:bastore         
		abyte0[1] = 80;
	//   79  157:aload_1         
	//   80  158:iconst_1        
	//   81  159:bipush          80
	//   82  161:bastore         
		abyte0[2] = 3;
	//   83  162:aload_1         
	//   84  163:iconst_2        
	//   85  164:iconst_3        
	//   86  165:bastore         
		abyte0[3] = 2;
	//   87  166:aload_1         
	//   88  167:iconst_3        
	//   89  168:iconst_2        
	//   90  169:bastore         
		abyte0[4] = 11;
	//   91  170:aload_1         
	//   92  171:iconst_4        
	//   93  172:bipush          11
	//   94  174:bastore         
		abyte0[5] = 1;
	//   95  175:aload_1         
	//   96  176:iconst_5        
	//   97  177:iconst_1        
	//   98  178:bastore         
		abyte0[16] = 15;
	//   99  179:aload_1         
	//  100  180:bipush          16
	//  101  182:bipush          15
	//  102  184:bastore         
		abyte0 = transceive(abyte0);
	//  103  185:aload_0         
	//  104  186:aload_1         
	//  105  187:invokespecial   #198 <Method byte[] transceive(byte[])>
	//  106  190:astore_1        
		if(abyte0.length < 9)
	//* 107  191:aload_1         
	//* 108  192:arraylength     
	//* 109  193:bipush          9
	//* 110  195:icmpge          235
		{
			if(fmLog != null)
	//* 111  198:aload_0         
	//* 112  199:getfield        #36  <Field FMLog fmLog>
	//* 113  202:ifnull          221
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548");
	//  114  205:aload_0         
	//  115  206:getfield        #36  <Field FMLog fmLog>
	//  116  209:aload_0         
	//  117  210:getfield        #44  <Field String logTag>
	//  118  213:ldc2            #422 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0CAPDU\u54CD\u5E94\u7684\u6570\u636E\u65E0\u6548">
	//  119  216:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_fail);
	//  120  221:new             #136 <Class BusinessException>
	//  121  224:dup             
	//  122  225:ldc2            #424 <String "\u83B7\u53D6\u4EA4\u901A\u5361\u4F59\u989D\u65F6\uFF0C\u54CD\u5E94\u6570\u636E\u65E0\u6548">
	//  123  228:getstatic       #427 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_fail>
	//  124  231:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  125  234:athrow          
		} else
		{
			return FM_Bytes.bytesToInt(Arrays.copyOf(abyte0, 4)) - FM_Bytes.bytesToInt(new byte[] {
				abyte0[6], abyte0[7], abyte0[8]
			});
	//  126  235:aload_1         
	//  127  236:iconst_4        
	//  128  237:invokestatic    #329 <Method byte[] Arrays.copyOf(byte[], int)>
	//  129  240:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//  130  243:iconst_3        
	//  131  244:newarray        byte[]
	//  132  246:dup             
	//  133  247:iconst_0        
	//  134  248:aload_1         
	//  135  249:bipush          6
	//  136  251:baload          
	//  137  252:bastore         
	//  138  253:dup             
	//  139  254:iconst_1        
	//  140  255:aload_1         
	//  141  256:bipush          7
	//  142  258:baload          
	//  143  259:bastore         
	//  144  260:dup             
	//  145  261:iconst_2        
	//  146  262:aload_1         
	//  147  263:bipush          8
	//  148  265:baload          
	//  149  266:bastore         
	//  150  267:invokestatic    #241 <Method int FM_Bytes.bytesToInt(byte[])>
	//  151  270:isub            
	//  152  271:ireturn         
		}
	}

	public List readAppRecords()
		throws BusinessException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #431 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #432 <Method void ArrayList()>
	//    3    7:astore_2        
		if(fmLog != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #36  <Field FMLog fmLog>
	//*   6   12:ifnull          31
			fmLog.info(logTag, "SPTC app records ...");
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field FMLog fmLog>
	//    9   19:aload_0         
	//   10   20:getfield        #44  <Field String logTag>
	//   11   23:ldc2            #434 <String "SPTC app records ...">
	//   12   26:invokeinterface #192 <Method void FMLog.info(String, String)>
		if(apduHandler == null)
	//*  13   31:aload_0         
	//*  14   32:getfield        #140 <Field ApduHandler apduHandler>
	//*  15   35:ifnonnull       75
		{
			if(fmLog != null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #36  <Field FMLog fmLog>
	//*  18   42:ifnull          61
				fmLog.warn(logTag, "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A");
	//   19   45:aload_0         
	//   20   46:getfield        #36  <Field FMLog fmLog>
	//   21   49:aload_0         
	//   22   50:getfield        #44  <Field String logTag>
	//   23   53:ldc2            #436 <String "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   24   56:invokeinterface #167 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   25   61:new             #136 <Class BusinessException>
	//   26   64:dup             
	//   27   65:ldc2            #436 <String "\u83B7\u53D6\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0CApdu\u5904\u7406\u5668\u4E3A\u7A7A">
	//   28   68:getstatic       #197 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   29   71:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   30   74:athrow          
		}
		byte abyte0[] = new byte[7];
	//   31   75:bipush          7
	//   32   77:newarray        byte[]
	//   33   79:astore_3        
		abyte0[1] = -92;
	//   34   80:aload_3         
	//   35   81:iconst_1        
	//   36   82:bipush          -92
	//   37   84:bastore         
		abyte0[4] = 2;
	//   38   85:aload_3         
	//   39   86:iconst_4        
	//   40   87:iconst_2        
	//   41   88:bastore         
		abyte0[5] = 63;
	//   42   89:aload_3         
	//   43   90:iconst_5        
	//   44   91:bipush          63
	//   45   93:bastore         
		abyte0[6] = 1;
	//   46   94:aload_3         
	//   47   95:bipush          6
	//   48   97:iconst_1        
	//   49   98:bastore         
		abyte0 = getCityCode(transceive(abyte0));
	//   50   99:aload_0         
	//   51  100:aload_0         
	//   52  101:aload_3         
	//   53  102:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   54  105:invokespecial   #200 <Method byte[] getCityCode(byte[])>
	//   55  108:astore_3        
		if(abyte0 == null || !Arrays.equals(abyte0, CITY_CODE_SH))
	//*  56  109:aload_3         
	//*  57  110:ifnull          124
	//*  58  113:aload_3         
	//*  59  114:aload_0         
	//*  60  115:getfield        #48  <Field byte[] CITY_CODE_SH>
	//*  61  118:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//*  62  121:ifne            138
			throw new BusinessException("\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_get_app_info_no_sptcc);
	//   63  124:new             #136 <Class BusinessException>
	//   64  127:dup             
	//   65  128:ldc2            #438 <String "\u83B7\u53D6\u4E0A\u6D77\u516C\u4EA4\u5361\u7684\u4EA4\u6613\u8BB0\u5F55\u65F6\uFF0C\u5F85\u5904\u7406\u7684\u5361\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361">
	//   66  131:getstatic       #211 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_get_app_info_no_sptcc>
	//   67  134:invokespecial   #179 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   68  137:athrow          
		HashMap hashmap = new HashMap();
	//   69  138:new             #440 <Class HashMap>
	//   70  141:dup             
	//   71  142:invokespecial   #441 <Method void HashMap()>
	//   72  145:astore_3        
		byte abyte1[] = new byte[7];
	//   73  146:bipush          7
	//   74  148:newarray        byte[]
	//   75  150:astore          4
		abyte1[1] = -92;
	//   76  152:aload           4
	//   77  154:iconst_1        
	//   78  155:bipush          -92
	//   79  157:bastore         
		abyte1[4] = 2;
	//   80  158:aload           4
	//   81  160:iconst_4        
	//   82  161:iconst_2        
	//   83  162:bastore         
		abyte1[6] = 7;
	//   84  163:aload           4
	//   85  165:bipush          6
	//   86  167:bipush          7
	//   87  169:bastore         
		transceive(abyte1);
	//   88  170:aload_0         
	//   89  171:aload           4
	//   90  173:invokespecial   #198 <Method byte[] transceive(byte[])>
	//   91  176:pop             
		abyte1 = new byte[5];
	//   92  177:iconst_5        
	//   93  178:newarray        byte[]
	//   94  180:astore          4
		for(int i = 1; i <= 10; i++)
	//*  95  182:iconst_1        
	//*  96  183:istore_1        
	//*  97  184:goto            319
		{
			abyte1 = new byte[5];
	//   98  187:iconst_5        
	//   99  188:newarray        byte[]
	//  100  190:astore          4
			abyte1[1] = -78;
	//  101  192:aload           4
	//  102  194:iconst_1        
	//  103  195:bipush          -78
	//  104  197:bastore         
			abyte1[2] = (byte)i;
	//  105  198:aload           4
	//  106  200:iconst_2        
	//  107  201:iload_1         
	//  108  202:int2byte        
	//  109  203:bastore         
			abyte1[3] = 4;
	//  110  204:aload           4
	//  111  206:iconst_3        
	//  112  207:iconst_4        
	//  113  208:bastore         
			abyte1 = transceive(abyte1);
	//  114  209:aload_0         
	//  115  210:aload           4
	//  116  212:invokespecial   #198 <Method byte[] transceive(byte[])>
	//  117  215:astore          4
			byte abyte3[] = Arrays.copyOfRange(abyte1, abyte1.length - 2, abyte1.length);
	//  118  217:aload           4
	//  119  219:aload           4
	//  120  221:arraylength     
	//  121  222:iconst_2        
	//  122  223:isub            
	//  123  224:aload           4
	//  124  226:arraylength     
	//  125  227:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  126  230:astore          5
			if(Arrays.equals(new byte[] {
	106, -125
}, abyte3))
	//* 127  232:iconst_2        
	//* 128  233:newarray        byte[]
	//* 129  235:dup             
	//* 130  236:iconst_0        
	//* 131  237:ldc2            #442 <Int 106>
	//* 132  240:bastore         
	//* 133  241:dup             
	//* 134  242:iconst_1        
	//* 135  243:ldc2            #443 <Int -125>
	//* 136  246:bastore         
	//* 137  247:aload           5
	//* 138  249:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//* 139  252:ifeq            258
				break;
	//  140  255:goto            325
			if(abyte1.length >= 16)
	//* 141  258:aload           4
	//* 142  260:arraylength     
	//* 143  261:bipush          16
	//* 144  263:icmpge          269
	//* 145  266:goto            315
			{
				String s = getDateTime4File07(Arrays.copyOfRange(abyte1, 10, 15));
	//  146  269:aload_0         
	//  147  270:aload           4
	//  148  272:bipush          10
	//  149  274:bipush          15
	//  150  276:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  151  279:invokevirtual   #445 <Method String getDateTime4File07(byte[])>
	//  152  282:astore          5
				EnumTradeType enumtradetype = get07TradeType(abyte1[0]);
	//  153  284:aload_0         
	//  154  285:aload           4
	//  155  287:iconst_0        
	//  156  288:baload          
	//  157  289:invokespecial   #447 <Method EnumTradeType get07TradeType(byte)>
	//  158  292:astore          4
				if(s != null && enumtradetype != null)
	//* 159  294:aload           5
	//* 160  296:ifnull          315
	//* 161  299:aload           4
	//* 162  301:ifnull          315
					((Map) (hashmap)).put(((Object) (s)), ((Object) (enumtradetype)));
	//  163  304:aload_3         
	//  164  305:aload           5
	//  165  307:aload           4
	//  166  309:invokeinterface #451 <Method Object Map.put(Object, Object)>
	//  167  314:pop             
			}
		}

	//  168  315:iload_1         
	//  169  316:iconst_1        
	//  170  317:iadd            
	//  171  318:istore_1        
	//  172  319:iload_1         
	//  173  320:bipush          10
	//  174  322:icmple          187
		enumtradetype = ((EnumTradeType) (new byte[7]));
	//  175  325:bipush          7
	//  176  327:newarray        byte[]
	//  177  329:astore          4
		enumtradetype[1] = -92;
	//  178  331:aload           4
	//  179  333:iconst_1        
	//  180  334:bipush          -92
	//  181  336:bastore         
		enumtradetype[4] = 2;
	//  182  337:aload           4
	//  183  339:iconst_4        
	//  184  340:iconst_2        
	//  185  341:bastore         
		enumtradetype[6] = 24;
	//  186  342:aload           4
	//  187  344:bipush          6
	//  188  346:bipush          24
	//  189  348:bastore         
		transceive(((byte []) (enumtradetype)));
	//  190  349:aload_0         
	//  191  350:aload           4
	//  192  352:invokespecial   #198 <Method byte[] transceive(byte[])>
	//  193  355:pop             
		for(int j = 1; j <= 10; j++)
	//* 194  356:iconst_1        
	//* 195  357:istore_1        
	//* 196  358:goto            460
		{
			byte abyte2[] = new byte[5];
	//  197  361:iconst_5        
	//  198  362:newarray        byte[]
	//  199  364:astore          4
			abyte2[1] = -78;
	//  200  366:aload           4
	//  201  368:iconst_1        
	//  202  369:bipush          -78
	//  203  371:bastore         
			abyte2[2] = (byte)j;
	//  204  372:aload           4
	//  205  374:iconst_2        
	//  206  375:iload_1         
	//  207  376:int2byte        
	//  208  377:bastore         
			abyte2[3] = 4;
	//  209  378:aload           4
	//  210  380:iconst_3        
	//  211  381:iconst_4        
	//  212  382:bastore         
			abyte2 = transceive(abyte2);
	//  213  383:aload_0         
	//  214  384:aload           4
	//  215  386:invokespecial   #198 <Method byte[] transceive(byte[])>
	//  216  389:astore          4
			byte abyte4[] = Arrays.copyOfRange(abyte2, abyte2.length - 2, abyte2.length);
	//  217  391:aload           4
	//  218  393:aload           4
	//  219  395:arraylength     
	//  220  396:iconst_2        
	//  221  397:isub            
	//  222  398:aload           4
	//  223  400:arraylength     
	//  224  401:invokestatic    #315 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  225  404:astore          5
			if(Arrays.equals(new byte[] {
	106, -125
}, abyte4))
	//* 226  406:iconst_2        
	//* 227  407:newarray        byte[]
	//* 228  409:dup             
	//* 229  410:iconst_0        
	//* 230  411:ldc2            #442 <Int 106>
	//* 231  414:bastore         
	//* 232  415:dup             
	//* 233  416:iconst_1        
	//* 234  417:ldc2            #443 <Int -125>
	//* 235  420:bastore         
	//* 236  421:aload           5
	//* 237  423:invokestatic    #206 <Method boolean Arrays.equals(byte[], byte[])>
	//* 238  426:ifeq            431
				return ((List) (arraylist));
	//  239  429:aload_2         
	//  240  430:areturn         
			if(abyte2.length >= 23)
	//* 241  431:aload           4
	//* 242  433:arraylength     
	//* 243  434:bipush          23
	//* 244  436:icmpge          442
	//* 245  439:goto            456
				((List) (arraylist)).add(((Object) (getAppRecord4bytes(abyte2, ((Map) (hashmap))))));
	//  246  442:aload_2         
	//  247  443:aload_0         
	//  248  444:aload           4
	//  249  446:aload_3         
	//  250  447:invokevirtual   #453 <Method CardAppRecord getAppRecord4bytes(byte[], Map)>
	//  251  450:invokeinterface #459 <Method boolean List.add(Object)>
	//  252  455:pop             
		}

	//  253  456:iload_1         
	//  254  457:iconst_1        
	//  255  458:iadd            
	//  256  459:istore_1        
	//  257  460:iload_1         
	//  258  461:bipush          10
	//  259  463:icmple          361
		return ((List) (arraylist));
	//  260  466:aload_2         
	//  261  467:areturn         
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandler = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field ApduHandler apduHandler>
	//    3    5:return          
	}

	private final int BYTE_COUNT_18 = 23;
	private final byte CITY_CODE_SH[];
	private final byte LOCK = 0;
	private final int MAX_LOG = 10;
	private final byte aid[];
	private ApduHandler apduHandler;
	FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/card/core/StpcManager)).getName();
}
