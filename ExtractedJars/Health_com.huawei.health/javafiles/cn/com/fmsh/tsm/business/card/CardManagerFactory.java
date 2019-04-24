// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.card;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.tsm.business.card.base.CardManager;
import cn.com.fmsh.tsm.business.card.core.LntAppManager;
import cn.com.fmsh.tsm.business.card.core.ShTourAppManager;
import cn.com.fmsh.tsm.business.card.core.StpcManager;
import cn.com.fmsh.tsm.business.enums.EnumCardAppType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.ArrayList;
import java.util.List;

public class CardManagerFactory
{

	private CardManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #22  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #26  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #28  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class CardManagerFactory>
	//    8   17:invokevirtual   #34  <Method String Class.getName()>
	//    9   20:putfield        #36  <Field String logTag>
	//   10   23:return          
	}

	public static CardManagerFactory instance()
	{
		if(cardManagerFactory == null)
	//*   0    0:getstatic       #41  <Field CardManagerFactory cardManagerFactory>
	//*   1    3:ifnonnull       16
			cardManagerFactory = new CardManagerFactory();
	//    2    6:new             #2   <Class CardManagerFactory>
	//    3    9:dup             
	//    4   10:invokespecial   #42  <Method void CardManagerFactory()>
	//    5   13:putstatic       #41  <Field CardManagerFactory cardManagerFactory>
		return cardManagerFactory;
	//    6   16:getstatic       #41  <Field CardManagerFactory cardManagerFactory>
	//    7   19:areturn         
	}

	public EnumCardAppType getCardAppType()
		throws BusinessException
	{
		byte abyte0[];
		abyte0 = new byte[7];
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
		if(fmLog == null)
	//*  19   24:aload_0         
	//*  20   25:getfield        #28  <Field FMLog fmLog>
	//*  21   28:ifnonnull       41
			fmLog = LogFactory.getInstance().getLog();
	//   22   31:aload_0         
	//   23   32:invokestatic    #22  <Method LogFactory LogFactory.getInstance()>
	//   24   35:invokevirtual   #26  <Method FMLog LogFactory.getLog()>
	//   25   38:putfield        #28  <Field FMLog fmLog>
		EnumCardAppType enumcardapptype;
		abyte0 = apduHandler.transceive(abyte0);
	//   26   41:aload_0         
	//   27   42:getfield        #50  <Field ApduHandler apduHandler>
	//   28   45:aload_1         
	//   29   46:invokeinterface #56  <Method byte[] ApduHandler.transceive(byte[])>
	//   30   51:astore_1        
		if(!FM_Bytes.isEnd9000(abyte0))
	//*  31   52:aload_1         
	//*  32   53:invokestatic    #62  <Method boolean FM_Bytes.isEnd9000(byte[])>
	//*  33   56:ifne            111
		{
			if(fmLog != null)
	//*  34   59:aload_0         
	//*  35   60:getfield        #28  <Field FMLog fmLog>
	//*  36   63:ifnull          98
				fmLog.warn(logTag, (new StringBuilder("\u83B7\u53D6\u5361\u7684\u7C7B\u578B\u65F6\uFF0CAPDU\u6307\u4EE4\u6267\u884C\u5F02\u5E38:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   37   66:aload_0         
	//   38   67:getfield        #28  <Field FMLog fmLog>
	//   39   70:aload_0         
	//   40   71:getfield        #36  <Field String logTag>
	//   41   74:new             #64  <Class StringBuilder>
	//   42   77:dup             
	//   43   78:ldc1            #66  <String "\u83B7\u53D6\u5361\u7684\u7C7B\u578B\u65F6\uFF0CAPDU\u6307\u4EE4\u6267\u884C\u5F02\u5E38:">
	//   44   80:invokespecial   #69  <Method void StringBuilder(String)>
	//   45   83:aload_1         
	//   46   84:invokestatic    #73  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   47   87:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   49   93:invokeinterface #86  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u7684\u7C7B\u578B\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//   50   98:new             #46  <Class BusinessException>
	//   51  101:dup             
	//   52  102:ldc1            #88  <String "\u83B7\u53D6\u5361\u7684\u7C7B\u578B\u65F6\uFF0C\u8BFB\u53D615\u6587\u4EF6\u5931\u8D25">
	//   53  104:getstatic       #94  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//   54  107:invokespecial   #97  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  110:athrow          
		}
		if(abyte0[abyte0.length - 4] < 70 || abyte0[abyte0.length - 4] > 79)
			break MISSING_BLOCK_LABEL_139;
	//   56  111:aload_1         
	//   57  112:aload_1         
	//   58  113:arraylength     
	//   59  114:iconst_4        
	//   60  115:isub            
	//   61  116:baload          
	//   62  117:bipush          70
	//   63  119:icmplt          139
	//   64  122:aload_1         
	//   65  123:aload_1         
	//   66  124:arraylength     
	//   67  125:iconst_4        
	//   68  126:isub            
	//   69  127:baload          
	//   70  128:bipush          79
	//   71  130:icmpgt          139
		enumcardapptype = EnumCardAppType.CARD_APP_TYPE_SH_TOUR;
	//   72  133:getstatic       #103 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH_TOUR>
	//   73  136:astore_1        
		return enumcardapptype;
	//   74  137:aload_1         
	//   75  138:areturn         
		EnumCardAppType enumcardapptype1;
		try
		{
			enumcardapptype1 = EnumCardAppType.CARD_APP_TYPE_SH;
	//   76  139:getstatic       #106 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH>
	//   77  142:astore_1        
		}
	//*  78  143:aload_1         
	//*  79  144:areturn         
		catch(FMScriptHandleException fmscripthandleexception)
	//*  80  145:astore_1        
		{
			if(fmLog != null)
	//*  81  146:aload_0         
	//*  82  147:getfield        #28  <Field FMLog fmLog>
	//*  83  150:ifnull          185
				fmLog.warn(logTag, (new StringBuilder("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (fmscripthandleexception)))).toString());
	//   84  153:aload_0         
	//   85  154:getfield        #28  <Field FMLog fmLog>
	//   86  157:aload_0         
	//   87  158:getfield        #36  <Field String logTag>
	//   88  161:new             #64  <Class StringBuilder>
	//   89  164:dup             
	//   90  165:ldc1            #108 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//   91  167:invokespecial   #69  <Method void StringBuilder(String)>
	//   92  170:aload_1         
	//   93  171:invokestatic    #114 <Method String Util4Java.getExceptionInfo(Exception)>
	//   94  174:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   95  177:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   96  180:invokeinterface #86  <Method void FMLog.warn(String, String)>
			if(apduHandler != null)
	//*  97  185:aload_0         
	//*  98  186:getfield        #50  <Field ApduHandler apduHandler>
	//*  99  189:ifnull          201
				apduHandler.close();
	//  100  192:aload_0         
	//  101  193:getfield        #50  <Field ApduHandler apduHandler>
	//  102  196:invokeinterface #117 <Method void ApduHandler.close()>
			throw new BusinessException("Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_execute_fail);
	//  103  201:new             #46  <Class BusinessException>
	//  104  204:dup             
	//  105  205:ldc1            #108 <String "Apdu\u6307\u4EE4\u6267\u884C\u51FA\u73B0\u5F02\u5E38">
	//  106  207:getstatic       #94  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_execute_fail>
	//  107  210:invokespecial   #97  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  108  213:athrow          
		}
		return enumcardapptype1;
	}

	public List getCardAppTypes()
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #22  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #26  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #28  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #28  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.debug(logTag, "\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868...");
	//   10   24:aload_0         
	//   11   25:getfield        #28  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #36  <Field String logTag>
	//   14   32:ldc1            #122 <String "\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868...">
	//   15   34:invokeinterface #125 <Method void FMLog.debug(String, String)>
		if(apduHandler == null)
	//*  16   39:aload_0         
	//*  17   40:getfield        #50  <Field ApduHandler apduHandler>
	//*  18   43:ifnonnull       81
		{
			if(fmLog != null)
	//*  19   46:aload_0         
	//*  20   47:getfield        #28  <Field FMLog fmLog>
	//*  21   50:ifnull          68
				fmLog.error(logTag, "\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868\u65F6\uFF0CAPDU\u5904\u7406\u5668\u4E3A\u7A7A");
	//   22   53:aload_0         
	//   23   54:getfield        #28  <Field FMLog fmLog>
	//   24   57:aload_0         
	//   25   58:getfield        #36  <Field String logTag>
	//   26   61:ldc1            #127 <String "\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868\u65F6\uFF0CAPDU\u5904\u7406\u5668\u4E3A\u7A7A">
	//   27   63:invokeinterface #130 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868\u65F6\uFF0C\u8BF7\u5148\u5207\u6362\u5361\u7684\u8BBF\u95EE\u65B9\u5F0F(OMA/NFC)", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_apdu_handler_null);
	//   28   68:new             #46  <Class BusinessException>
	//   29   71:dup             
	//   30   72:ldc1            #132 <String "\u83B7\u53D6\u5361\u7C7B\u578B\u5217\u8868\u65F6\uFF0C\u8BF7\u5148\u5207\u6362\u5361\u7684\u8BBF\u95EE\u65B9\u5F0F(OMA/NFC)">
	//   31   74:getstatic       #135 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_apdu_handler_null>
	//   32   77:invokespecial   #97  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   80:athrow          
		}
		ArrayList arraylist = new ArrayList();
	//   34   81:new             #137 <Class ArrayList>
	//   35   84:dup             
	//   36   85:invokespecial   #138 <Method void ArrayList()>
	//   37   88:astore_1        
		Object obj = ((Object) (new LntAppManager()));
	//   38   89:new             #140 <Class LntAppManager>
	//   39   92:dup             
	//   40   93:invokespecial   #141 <Method void LntAppManager()>
	//   41   96:astore_2        
		if(apduHandler.open(((CardManager) (obj)).getAid()))
	//*  42   97:aload_0         
	//*  43   98:getfield        #50  <Field ApduHandler apduHandler>
	//*  44  101:aload_2         
	//*  45  102:invokeinterface #147 <Method byte[] CardManager.getAid()>
	//*  46  107:invokeinterface #150 <Method boolean ApduHandler.open(byte[])>
	//*  47  112:ifeq            151
		{
			((CardManager) (obj)).setApduHandler(apduHandler);
	//   48  115:aload_2         
	//   49  116:aload_0         
	//   50  117:getfield        #50  <Field ApduHandler apduHandler>
	//   51  120:invokeinterface #154 <Method void CardManager.setApduHandler(ApduHandler)>
			byte abyte0[] = ((CardManager) (obj)).getAppNo();
	//   52  125:aload_2         
	//   53  126:invokeinterface #157 <Method byte[] CardManager.getAppNo()>
	//   54  131:astore_2        
			if(abyte0 != null && abyte0.length > 0)
	//*  55  132:aload_2         
	//*  56  133:ifnull          151
	//*  57  136:aload_2         
	//*  58  137:arraylength     
	//*  59  138:ifle            151
				((List) (arraylist)).add(((Object) (EnumCardAppType.CARD_APP_TYPE_LNT)));
	//   60  141:aload_1         
	//   61  142:getstatic       #160 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_LNT>
	//   62  145:invokeinterface #166 <Method boolean List.add(Object)>
	//   63  150:pop             
		}
		abyte0 = ((byte []) (new StpcManager()));
	//   64  151:new             #168 <Class StpcManager>
	//   65  154:dup             
	//   66  155:invokespecial   #169 <Method void StpcManager()>
	//   67  158:astore_2        
		if(apduHandler.open(((CardManager) (abyte0)).getAid()))
	//*  68  159:aload_0         
	//*  69  160:getfield        #50  <Field ApduHandler apduHandler>
	//*  70  163:aload_2         
	//*  71  164:invokeinterface #147 <Method byte[] CardManager.getAid()>
	//*  72  169:invokeinterface #150 <Method boolean ApduHandler.open(byte[])>
	//*  73  174:ifeq            194
		{
			EnumCardAppType enumcardapptype = getCardAppType();
	//   74  177:aload_0         
	//   75  178:invokevirtual   #171 <Method EnumCardAppType getCardAppType()>
	//   76  181:astore_2        
			if(enumcardapptype != null)
	//*  77  182:aload_2         
	//*  78  183:ifnull          194
				((List) (arraylist)).add(((Object) (enumcardapptype)));
	//   79  186:aload_1         
	//   80  187:aload_2         
	//   81  188:invokeinterface #166 <Method boolean List.add(Object)>
	//   82  193:pop             
		}
		return ((List) (arraylist));
	//   83  194:aload_1         
	//   84  195:areturn         
	}

	public CardManager getCardManager(EnumCardAppType enumcardapptype)
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			return ((CardManager) (new StpcManager()));
	//    2    4:new             #168 <Class StpcManager>
	//    3    7:dup             
	//    4    8:invokespecial   #169 <Method void StpcManager()>
	//    5   11:areturn         
		if(enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH)
	//*   6   12:aload_1         
	//*   7   13:getstatic       #106 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH>
	//*   8   16:if_acmpne       27
			return ((CardManager) (new StpcManager()));
	//    9   19:new             #168 <Class StpcManager>
	//   10   22:dup             
	//   11   23:invokespecial   #169 <Method void StpcManager()>
	//   12   26:areturn         
		if(enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH_TOUR || enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH_RENT)
	//*  13   27:aload_1         
	//*  14   28:getstatic       #103 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH_TOUR>
	//*  15   31:if_acmpeq       41
	//*  16   34:aload_1         
	//*  17   35:getstatic       #178 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH_RENT>
	//*  18   38:if_acmpne       49
			return ((CardManager) (new ShTourAppManager()));
	//   19   41:new             #180 <Class ShTourAppManager>
	//   20   44:dup             
	//   21   45:invokespecial   #181 <Method void ShTourAppManager()>
	//   22   48:areturn         
		else
			return ((CardManager) (new LntAppManager()));
	//   23   49:new             #140 <Class LntAppManager>
	//   24   52:dup             
	//   25   53:invokespecial   #141 <Method void LntAppManager()>
	//   26   56:areturn         
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandler = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field ApduHandler apduHandler>
	//    3    5:return          
	}

	private static CardManagerFactory cardManagerFactory;
	private ApduHandler apduHandler;
	private FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/card/CardManagerFactory)).getName();
}
