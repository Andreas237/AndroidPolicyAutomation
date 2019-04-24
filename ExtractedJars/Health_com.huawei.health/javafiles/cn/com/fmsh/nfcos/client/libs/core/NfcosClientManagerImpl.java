// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.libs.core;

import cn.com.fmsh.nfcos.client.libs.NfcosClientManager;
import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.tsm.business.*;
import cn.com.fmsh.tsm.business.bean.*;
import cn.com.fmsh.tsm.business.card.CardTools;
import cn.com.fmsh.tsm.business.enums.*;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

public class NfcosClientManagerImpl
	implements NfcosClientManager
{

	public NfcosClientManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <String "NfcosClientManagerHodo">
	//    4    7:putfield        #23  <Field String logTag>
		manager = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #25  <Field BusinessManager manager>
		fmLog = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #27  <Field FMLog fmLog>
	//   11   20:return          
	}

	public int appletDownload(EnumCardAppType enumcardapptype, byte abyte0[], String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #34  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #34  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte0 == null || abyte0.length < 1)
	//*  16   37:aload_2         
	//*  17   38:ifnull          47
	//*  18   41:aload_2         
	//*  19   42:arraylength     
	//*  20   43:iconst_1        
	//*  21   44:icmpge          80
		{
			if(fmLog != null)
	//*  22   47:aload_0         
	//*  23   48:getfield        #27  <Field FMLog fmLog>
	//*  24   51:ifnull          67
				fmLog.warn("NfcosClientManagerHodo", "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u8BC6\u4E3A\u7A7A");
	//   25   54:aload_0         
	//   26   55:getfield        #27  <Field FMLog fmLog>
	//   27   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   60:ldc1            #51  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u8BC6\u4E3A\u7A7A">
	//   29   62:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u8BC6\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   67:new             #32  <Class BusinessException>
	//   31   70:dup             
	//   32   71:ldc1            #51  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u8BC6\u4E3A\u7A7A">
	//   33   73:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   76:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   80:aload_3         
	//*  37   81:ifnull          92
	//*  38   84:aload_3         
	//*  39   85:invokevirtual   #57  <Method int String.length()>
	//*  40   88:iconst_1        
	//*  41   89:icmpge          125
		{
			if(fmLog != null)
	//*  42   92:aload_0         
	//*  43   93:getfield        #27  <Field FMLog fmLog>
	//*  44   96:ifnull          112
				fmLog.warn("NfcosClientManagerHodo", "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u4FE1\u53F7\u89C4\u683C\u4E3A\u7A7A");
	//   45   99:aload_0         
	//   46  100:getfield        #27  <Field FMLog fmLog>
	//   47  103:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  105:ldc1            #59  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u4FE1\u53F7\u89C4\u683C\u4E3A\u7A7A">
	//   49  107:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u4F20\u5165\u7684\u7EC8\u7AEF\u4FE1\u53F7\u89C4\u683C\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  112:new             #32  <Class BusinessException>
	//   51  115:dup             
	//   52  116:ldc1            #61  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u4F20\u5165\u7684\u7EC8\u7AEF\u4FE1\u53F7\u89C4\u683C\u4E3A\u7A7A">
	//   53  118:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  121:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  124:athrow          
		}
		return !manager.getCardAppInstall().appletDownload(enumcardapptype, abyte0, s) ? 99 : 0;
	//   56  125:aload_0         
	//   57  126:getfield        #25  <Field BusinessManager manager>
	//   58  129:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   59  134:aload_1         
	//   60  135:aload_2         
	//   61  136:aload_3         
	//   62  137:invokeinterface #72  <Method boolean CardAppInstall.appletDownload(EnumCardAppType, byte[], String)>
	//   63  142:ifeq            147
	//   64  145:iconst_0        
	//   65  146:ireturn         
	//   66  147:bipush          99
	//   67  149:ireturn         
	}

	public MainOrder apply4Pay(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[])
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #77  <String "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #77  <String "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(i <= 0)
	//*  16   37:iload_2         
	//*  17   38:ifgt            74
		{
			if(fmLog != null)
	//*  18   41:aload_0         
	//*  19   42:getfield        #27  <Field FMLog fmLog>
	//*  20   45:ifnull          61
				fmLog.warn("NfcosClientManagerHodo", "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548");
	//   21   48:aload_0         
	//   22   49:getfield        #27  <Field FMLog fmLog>
	//   23   52:ldc1            #21  <String "NfcosClientManagerHodo">
	//   24   54:ldc1            #79  <String "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548">
	//   25   56:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   26   61:new             #32  <Class BusinessException>
	//   27   64:dup             
	//   28   65:ldc1            #79  <String "\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548">
	//   29   67:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   30   70:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   31   73:athrow          
		} else
		{
			return manager.getCardAppTrade().apply4Pay(i, j, abyte0, enumcardapptype);
	//   32   74:aload_0         
	//   33   75:getfield        #25  <Field BusinessManager manager>
	//   34   78:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   35   83:iload_2         
	//   36   84:iload_3         
	//   37   85:aload           4
	//   38   87:aload_1         
	//   39   88:invokeinterface #88  <Method MainOrder CardAppTrade.apply4Pay(int, int, byte[], EnumCardAppType)>
	//   40   93:areturn         
		}
	}

	public MainOrder apply4PayEx(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #92  <String "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #94  <String "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(i <= 0)
	//*  16   37:iload_2         
	//*  17   38:ifgt            74
		{
			if(fmLog != null)
	//*  18   41:aload_0         
	//*  19   42:getfield        #27  <Field FMLog fmLog>
	//*  20   45:ifnull          61
				fmLog.warn("NfcosClientManagerHodo", "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548");
	//   21   48:aload_0         
	//   22   49:getfield        #27  <Field FMLog fmLog>
	//   23   52:ldc1            #21  <String "NfcosClientManagerHodo">
	//   24   54:ldc1            #96  <String "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548">
	//   25   56:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   26   61:new             #32  <Class BusinessException>
	//   27   64:dup             
	//   28   65:ldc1            #96  <String "\u5145\u503C-\u6D3B\u52A8\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5145\u503C\u91D1\u989D\u65E0\u6548">
	//   29   67:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   30   70:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   31   73:athrow          
		} else
		{
			byte byte0 = (byte)j;
	//   32   74:iload_3         
	//   33   75:int2byte        
	//   34   76:istore          6
			byte abyte2[] = FM_Bytes.intToBytes(i, 4);
	//   35   78:iload_2         
	//   36   79:iconst_4        
	//   37   80:invokestatic    #102 <Method byte[] FM_Bytes.intToBytes(int, int)>
	//   38   83:astore          8
			byte byte1 = (byte)abyte2.length;
	//   39   85:aload           8
	//   40   87:arraylength     
	//   41   88:int2byte        
	//   42   89:istore          7
			abyte0 = FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(new byte[] {
				2, 1, byte0
			}, new byte[] {
				1, byte1
			}), abyte2), new byte[] {
				3, (byte)abyte0.length
			}), abyte0);
	//   43   91:iconst_3        
	//   44   92:newarray        byte[]
	//   45   94:dup             
	//   46   95:iconst_0        
	//   47   96:iconst_2        
	//   48   97:bastore         
	//   49   98:dup             
	//   50   99:iconst_1        
	//   51  100:iconst_1        
	//   52  101:bastore         
	//   53  102:dup             
	//   54  103:iconst_2        
	//   55  104:iload           6
	//   56  106:bastore         
	//   57  107:iconst_2        
	//   58  108:newarray        byte[]
	//   59  110:dup             
	//   60  111:iconst_0        
	//   61  112:iconst_1        
	//   62  113:bastore         
	//   63  114:dup             
	//   64  115:iconst_1        
	//   65  116:iload           7
	//   66  118:bastore         
	//   67  119:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   68  122:aload           8
	//   69  124:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   70  127:iconst_2        
	//   71  128:newarray        byte[]
	//   72  130:dup             
	//   73  131:iconst_0        
	//   74  132:iconst_3        
	//   75  133:bastore         
	//   76  134:dup             
	//   77  135:iconst_1        
	//   78  136:aload           4
	//   79  138:arraylength     
	//   80  139:int2byte        
	//   81  140:bastore         
	//   82  141:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   83  144:aload           4
	//   84  146:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   85  149:astore          4
			return manager.getCardAppTrade().applyAct4Pay(abyte1, enumcardapptype, abyte0);
	//   86  151:aload_0         
	//   87  152:getfield        #25  <Field BusinessManager manager>
	//   88  155:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   89  160:aload           5
	//   90  162:aload_1         
	//   91  163:aload           4
	//   92  165:invokeinterface #110 <Method MainOrder CardAppTrade.applyAct4Pay(byte[], EnumCardAppType, byte[])>
	//   93  170:areturn         
		}
	}

	public MainOrder applyIssue(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[], String s, byte abyte1[])
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #114 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #114 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte0 == null || abyte0.length < 1)
	//*  16   37:aload           4
	//*  17   39:ifnull          49
	//*  18   42:aload           4
	//*  19   44:arraylength     
	//*  20   45:iconst_1        
	//*  21   46:icmpge          82
		{
			if(fmLog != null)
	//*  22   49:aload_0         
	//*  23   50:getfield        #27  <Field FMLog fmLog>
	//*  24   53:ifnull          69
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548");
	//   25   56:aload_0         
	//   26   57:getfield        #27  <Field FMLog fmLog>
	//   27   60:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   62:ldc1            #116 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548">
	//   29   64:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   69:new             #32  <Class BusinessException>
	//   31   72:dup             
	//   32   73:ldc1            #116 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548">
	//   33   75:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   78:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   81:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   82:aload           5
	//*  37   84:ifnull          96
	//*  38   87:aload           5
	//*  39   89:invokevirtual   #57  <Method int String.length()>
	//*  40   92:iconst_1        
	//*  41   93:icmpge          129
		{
			if(fmLog != null)
	//*  42   96:aload_0         
	//*  43   97:getfield        #27  <Field FMLog fmLog>
	//*  44  100:ifnull          116
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   45  103:aload_0         
	//   46  104:getfield        #27  <Field FMLog fmLog>
	//   47  107:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  109:ldc1            #118 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   49  111:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  116:new             #32  <Class BusinessException>
	//   51  119:dup             
	//   52  120:ldc1            #118 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   53  122:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  125:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  128:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  56  129:aload           6
	//*  57  131:ifnull          141
	//*  58  134:aload           6
	//*  59  136:arraylength     
	//*  60  137:iconst_1        
	//*  61  138:icmpge          174
		{
			if(fmLog != null)
	//*  62  141:aload_0         
	//*  63  142:getfield        #27  <Field FMLog fmLog>
	//*  64  145:ifnull          161
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548");
	//   65  148:aload_0         
	//   66  149:getfield        #27  <Field FMLog fmLog>
	//   67  152:ldc1            #21  <String "NfcosClientManagerHodo">
	//   68  154:ldc1            #120 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548">
	//   69  156:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   70  161:new             #32  <Class BusinessException>
	//   71  164:dup             
	//   72  165:ldc1            #120 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548">
	//   73  167:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   74  170:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   75  173:athrow          
		}
		if(i <= 0)
	//*  76  174:iload_2         
	//*  77  175:ifgt            211
		{
			if(fmLog != null)
	//*  78  178:aload_0         
	//*  79  179:getfield        #27  <Field FMLog fmLog>
	//*  80  182:ifnull          198
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u91D1\u989D\u65E0\u6548");
	//   81  185:aload_0         
	//   82  186:getfield        #27  <Field FMLog fmLog>
	//   83  189:ldc1            #21  <String "NfcosClientManagerHodo">
	//   84  191:ldc1            #122 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u91D1\u989D\u65E0\u6548">
	//   85  193:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u91D1\u989D\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   86  198:new             #32  <Class BusinessException>
	//   87  201:dup             
	//   88  202:ldc1            #122 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u652F\u4ED8\u91D1\u989D\u65E0\u6548">
	//   89  204:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   90  207:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   91  210:athrow          
		} else
		{
			byte byte0 = (byte)j;
	//   92  211:iload_3         
	//   93  212:int2byte        
	//   94  213:istore          7
			byte abyte2[] = FM_Bytes.intToBytes(i, 4);
	//   95  215:iload_2         
	//   96  216:iconst_4        
	//   97  217:invokestatic    #102 <Method byte[] FM_Bytes.intToBytes(int, int)>
	//   98  220:astore          9
			byte byte1 = (byte)abyte2.length;
	//   99  222:aload           9
	//  100  224:arraylength     
	//  101  225:int2byte        
	//  102  226:istore          8
			abyte0 = FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(new byte[] {
				2, 1, byte0
			}, new byte[] {
				1, byte1
			}), abyte2), new byte[] {
				3, (byte)abyte0.length
			}), abyte0);
	//  103  228:iconst_3        
	//  104  229:newarray        byte[]
	//  105  231:dup             
	//  106  232:iconst_0        
	//  107  233:iconst_2        
	//  108  234:bastore         
	//  109  235:dup             
	//  110  236:iconst_1        
	//  111  237:iconst_1        
	//  112  238:bastore         
	//  113  239:dup             
	//  114  240:iconst_2        
	//  115  241:iload           7
	//  116  243:bastore         
	//  117  244:iconst_2        
	//  118  245:newarray        byte[]
	//  119  247:dup             
	//  120  248:iconst_0        
	//  121  249:iconst_1        
	//  122  250:bastore         
	//  123  251:dup             
	//  124  252:iconst_1        
	//  125  253:iload           8
	//  126  255:bastore         
	//  127  256:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  128  259:aload           9
	//  129  261:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  130  264:iconst_2        
	//  131  265:newarray        byte[]
	//  132  267:dup             
	//  133  268:iconst_0        
	//  134  269:iconst_3        
	//  135  270:bastore         
	//  136  271:dup             
	//  137  272:iconst_1        
	//  138  273:aload           4
	//  139  275:arraylength     
	//  140  276:int2byte        
	//  141  277:bastore         
	//  142  278:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  143  281:aload           4
	//  144  283:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  145  286:astore          4
			s = ((String) (s.getBytes()));
	//  146  288:aload           5
	//  147  290:invokevirtual   #126 <Method byte[] String.getBytes()>
	//  148  293:astore          5
			abyte0 = FM_Bytes.join(FM_Bytes.join(abyte0, new byte[] {
				5, (byte)s.length
			}), ((byte []) (s)));
	//  149  295:aload           4
	//  150  297:iconst_2        
	//  151  298:newarray        byte[]
	//  152  300:dup             
	//  153  301:iconst_0        
	//  154  302:iconst_5        
	//  155  303:bastore         
	//  156  304:dup             
	//  157  305:iconst_1        
	//  158  306:aload           5
	//  159  308:arraylength     
	//  160  309:int2byte        
	//  161  310:bastore         
	//  162  311:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  163  314:aload           5
	//  164  316:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  165  319:astore          4
			return manager.getCardAppTrade().applyAct4Pay(abyte1, enumcardapptype, abyte0);
	//  166  321:aload_0         
	//  167  322:getfield        #25  <Field BusinessManager manager>
	//  168  325:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//  169  330:aload           6
	//  170  332:aload_1         
	//  171  333:aload           4
	//  172  335:invokeinterface #110 <Method MainOrder CardAppTrade.applyAct4Pay(byte[], EnumCardAppType, byte[])>
	//  173  340:areturn         
		}
	}

	public MainOrder applyIssueByProduct(EnumCardAppType enumcardapptype, String s, int i, byte abyte0[], String s1, byte abyte1[])
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #114 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #114 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(s == null || s.length() < 1)
	//*  16   37:aload_2         
	//*  17   38:ifnull          49
	//*  18   41:aload_2         
	//*  19   42:invokevirtual   #57  <Method int String.length()>
	//*  20   45:iconst_1        
	//*  21   46:icmpge          82
		{
			if(fmLog != null)
	//*  22   49:aload_0         
	//*  23   50:getfield        #27  <Field FMLog fmLog>
	//*  24   53:ifnull          69
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u4EA7\u54C1\u7F16\u7801\u65E0\u6548");
	//   25   56:aload_0         
	//   26   57:getfield        #27  <Field FMLog fmLog>
	//   27   60:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   62:ldc1            #130 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u4EA7\u54C1\u7F16\u7801\u65E0\u6548">
	//   29   64:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u4EA7\u54C1\u7F16\u7801\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   69:new             #32  <Class BusinessException>
	//   31   72:dup             
	//   32   73:ldc1            #130 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u4EA7\u54C1\u7F16\u7801\u65E0\u6548">
	//   33   75:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   78:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   81:athrow          
		}
		if(abyte0 == null || abyte0.length < 1)
	//*  36   82:aload           4
	//*  37   84:ifnull          94
	//*  38   87:aload           4
	//*  39   89:arraylength     
	//*  40   90:iconst_1        
	//*  41   91:icmpge          127
		{
			if(fmLog != null)
	//*  42   94:aload_0         
	//*  43   95:getfield        #27  <Field FMLog fmLog>
	//*  44   98:ifnull          114
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548");
	//   45  101:aload_0         
	//   46  102:getfield        #27  <Field FMLog fmLog>
	//   47  105:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  107:ldc1            #116 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548">
	//   49  109:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  114:new             #32  <Class BusinessException>
	//   51  117:dup             
	//   52  118:ldc1            #116 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165SE\u6807\u8BC6\u65E0\u6548">
	//   53  120:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  123:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  126:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  56  127:aload           5
	//*  57  129:ifnull          141
	//*  58  132:aload           5
	//*  59  134:invokevirtual   #57  <Method int String.length()>
	//*  60  137:iconst_1        
	//*  61  138:icmpge          174
		{
			if(fmLog != null)
	//*  62  141:aload_0         
	//*  63  142:getfield        #27  <Field FMLog fmLog>
	//*  64  145:ifnull          161
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   65  148:aload_0         
	//   66  149:getfield        #27  <Field FMLog fmLog>
	//   67  152:ldc1            #21  <String "NfcosClientManagerHodo">
	//   68  154:ldc1            #118 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   69  156:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   70  161:new             #32  <Class BusinessException>
	//   71  164:dup             
	//   72  165:ldc1            #118 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   73  167:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   74  170:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   75  173:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  76  174:aload           6
	//*  77  176:ifnull          186
	//*  78  179:aload           6
	//*  79  181:arraylength     
	//*  80  182:iconst_1        
	//*  81  183:icmpge          219
		{
			if(fmLog != null)
	//*  82  186:aload_0         
	//*  83  187:getfield        #27  <Field FMLog fmLog>
	//*  84  190:ifnull          206
				fmLog.warn("NfcosClientManagerHodo", "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548");
	//   85  193:aload_0         
	//   86  194:getfield        #27  <Field FMLog fmLog>
	//   87  197:ldc1            #21  <String "NfcosClientManagerHodo">
	//   88  199:ldc1            #120 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548">
	//   89  201:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   90  206:new             #32  <Class BusinessException>
	//   91  209:dup             
	//   92  210:ldc1            #120 <String "\u53D1\u5361\u8BA2\u5355\u7533\u8BF7\u4ED8\u6B3E\u65F6\uFF0C\u4F20\u5165\u6D3B\u52A8\u7F16\u7801\u65E0\u6548">
	//   93  212:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   94  215:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   95  218:athrow          
		} else
		{
			byte byte0 = (byte)i;
	//   96  219:iload_3         
	//   97  220:int2byte        
	//   98  221:istore          7
			s = ((String) (s.getBytes()));
	//   99  223:aload_2         
	//  100  224:invokevirtual   #126 <Method byte[] String.getBytes()>
	//  101  227:astore_2        
			byte byte1 = (byte)s.length;
	//  102  228:aload_2         
	//  103  229:arraylength     
	//  104  230:int2byte        
	//  105  231:istore          8
			s = ((String) (FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(new byte[] {
				2, 1, byte0
			}, new byte[] {
				1, byte1
			}), ((byte []) (s))), new byte[] {
				3, (byte)abyte0.length
			}), abyte0)));
	//  106  233:iconst_3        
	//  107  234:newarray        byte[]
	//  108  236:dup             
	//  109  237:iconst_0        
	//  110  238:iconst_2        
	//  111  239:bastore         
	//  112  240:dup             
	//  113  241:iconst_1        
	//  114  242:iconst_1        
	//  115  243:bastore         
	//  116  244:dup             
	//  117  245:iconst_2        
	//  118  246:iload           7
	//  119  248:bastore         
	//  120  249:iconst_2        
	//  121  250:newarray        byte[]
	//  122  252:dup             
	//  123  253:iconst_0        
	//  124  254:iconst_1        
	//  125  255:bastore         
	//  126  256:dup             
	//  127  257:iconst_1        
	//  128  258:iload           8
	//  129  260:bastore         
	//  130  261:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  131  264:aload_2         
	//  132  265:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  133  268:iconst_2        
	//  134  269:newarray        byte[]
	//  135  271:dup             
	//  136  272:iconst_0        
	//  137  273:iconst_3        
	//  138  274:bastore         
	//  139  275:dup             
	//  140  276:iconst_1        
	//  141  277:aload           4
	//  142  279:arraylength     
	//  143  280:int2byte        
	//  144  281:bastore         
	//  145  282:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  146  285:aload           4
	//  147  287:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  148  290:astore_2        
			abyte0 = s1.getBytes();
	//  149  291:aload           5
	//  150  293:invokevirtual   #126 <Method byte[] String.getBytes()>
	//  151  296:astore          4
			s = ((String) (FM_Bytes.join(FM_Bytes.join(((byte []) (s)), new byte[] {
				5, (byte)abyte0.length
			}), abyte0)));
	//  152  298:aload_2         
	//  153  299:iconst_2        
	//  154  300:newarray        byte[]
	//  155  302:dup             
	//  156  303:iconst_0        
	//  157  304:iconst_5        
	//  158  305:bastore         
	//  159  306:dup             
	//  160  307:iconst_1        
	//  161  308:aload           4
	//  162  310:arraylength     
	//  163  311:int2byte        
	//  164  312:bastore         
	//  165  313:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  166  316:aload           4
	//  167  318:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  168  321:astore_2        
			return manager.getCardAppTrade().applyAct4Pay(abyte1, enumcardapptype, ((byte []) (s)));
	//  169  322:aload_0         
	//  170  323:getfield        #25  <Field BusinessManager manager>
	//  171  326:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//  172  331:aload           6
	//  173  333:aload_1         
	//  174  334:aload_2         
	//  175  335:invokeinterface #110 <Method MainOrder CardAppTrade.applyAct4Pay(byte[], EnumCardAppType, byte[])>
	//  176  340:areturn         
		}
	}

	public MainOrder applyPromotion(byte abyte0[])
		throws BusinessException
	{
		return manager.getBusinessExtend().applyPromotion(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #136 <Method BusinessExtend BusinessManager.getBusinessExtend()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #140 <Method MainOrder BusinessExtend.applyPromotion(byte[])>
	//    5   15:areturn         
	}

	public int cancelIssue(int i)
		throws BusinessException
	{
		manager.getCardAppInstall().cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//    3    9:invokeinterface #145 <Method void CardAppInstall.cancel()>
		return 0;
	//    4   14:iconst_0        
	//    5   15:ireturn         
	}

	public int closeApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #149 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #149 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  16   37:aload_3         
	//*  17   38:ifnull          47
	//*  18   41:aload_3         
	//*  19   42:arraylength     
	//*  20   43:iconst_1        
	//*  21   44:icmpge          80
		{
			if(fmLog != null)
	//*  22   47:aload_0         
	//*  23   48:getfield        #27  <Field FMLog fmLog>
	//*  24   51:ifnull          67
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548");
	//   25   54:aload_0         
	//   26   55:getfield        #27  <Field FMLog fmLog>
	//   27   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   60:ldc1            #151 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   29   62:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   67:new             #32  <Class BusinessException>
	//   31   70:dup             
	//   32   71:ldc1            #151 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   33   73:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   76:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   80:aload           4
	//*  37   82:ifnull          94
	//*  38   85:aload           4
	//*  39   87:invokevirtual   #57  <Method int String.length()>
	//*  40   90:iconst_1        
	//*  41   91:icmpge          127
		{
			if(fmLog != null)
	//*  42   94:aload_0         
	//*  43   95:getfield        #27  <Field FMLog fmLog>
	//*  44   98:ifnull          114
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   45  101:aload_0         
	//   46  102:getfield        #27  <Field FMLog fmLog>
	//   47  105:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  107:ldc1            #153 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   49  109:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  114:new             #32  <Class BusinessException>
	//   51  117:dup             
	//   52  118:ldc1            #153 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   53  120:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  123:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  126:athrow          
		}
		return !manager.getCardAppInstall().setApp(abyte0, enumcardapptype, abyte1, s, EnumAppManageOperateType.APP_LOCK) ? 99 : 0;
	//   56  127:aload_0         
	//   57  128:getfield        #25  <Field BusinessManager manager>
	//   58  131:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   59  136:aload_1         
	//   60  137:aload_2         
	//   61  138:aload_3         
	//   62  139:aload           4
	//   63  141:getstatic       #159 <Field EnumAppManageOperateType EnumAppManageOperateType.APP_LOCK>
	//   64  144:invokeinterface #163 <Method boolean CardAppInstall.setApp(byte[], EnumCardAppType, byte[], String, EnumAppManageOperateType)>
	//   65  149:ifeq            154
	//   66  152:iconst_0        
	//   67  153:ireturn         
	//   68  154:bipush          99
	//   69  156:ireturn         
	}

	public CardAppInfo deleteApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #167 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #167 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  16   37:aload_3         
	//*  17   38:ifnull          47
	//*  18   41:aload_3         
	//*  19   42:arraylength     
	//*  20   43:iconst_1        
	//*  21   44:icmpge          80
		{
			if(fmLog != null)
	//*  22   47:aload_0         
	//*  23   48:getfield        #27  <Field FMLog fmLog>
	//*  24   51:ifnull          67
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548");
	//   25   54:aload_0         
	//   26   55:getfield        #27  <Field FMLog fmLog>
	//   27   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   60:ldc1            #169 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   29   62:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   67:new             #32  <Class BusinessException>
	//   31   70:dup             
	//   32   71:ldc1            #169 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   33   73:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   76:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   80:aload           4
	//*  37   82:ifnull          94
	//*  38   85:aload           4
	//*  39   87:invokevirtual   #57  <Method int String.length()>
	//*  40   90:iconst_1        
	//*  41   91:icmpge          127
		{
			if(fmLog != null)
	//*  42   94:aload_0         
	//*  43   95:getfield        #27  <Field FMLog fmLog>
	//*  44   98:ifnull          114
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   45  101:aload_0         
	//   46  102:getfield        #27  <Field FMLog fmLog>
	//   47  105:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  107:ldc1            #171 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   49  109:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  114:new             #32  <Class BusinessException>
	//   51  117:dup             
	//   52  118:ldc1            #171 <String "\u5361\u4E0A\u5E94\u7528\u5378\u8F7D\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   53  120:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  123:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  126:athrow          
		} else
		{
			return manager.getCardAppInstall().deleteApp(abyte0, enumcardapptype, abyte1, s);
	//   56  127:aload_0         
	//   57  128:getfield        #25  <Field BusinessManager manager>
	//   58  131:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   59  136:aload_1         
	//   60  137:aload_2         
	//   61  138:aload_3         
	//   62  139:aload           4
	//   63  141:invokeinterface #173 <Method CardAppInfo CardAppInstall.deleteApp(byte[], EnumCardAppType, byte[], String)>
	//   64  146:areturn         
		}
	}

	public int doIssue(byte abyte0[], int i, byte abyte1[], byte abyte2[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          43
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          30
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u8BF7\u4F20\u5165\u53D1\u5361\u8BA2\u5355\u53F7");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc1            #177 <String "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u8BF7\u4F20\u5165\u53D1\u5361\u8BA2\u5355\u53F7">
	//   13   25:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u8BF7\u4F20\u5165\u53D1\u5361\u8BA2\u5355\u53F7", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   30:new             #32  <Class BusinessException>
	//   15   33:dup             
	//   16   34:ldc1            #177 <String "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u8BF7\u4F20\u5165\u53D1\u5361\u8BA2\u5355\u53F7">
	//   17   36:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   39:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   42:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  20   43:aload_3         
	//*  21   44:ifnull          53
	//*  22   47:aload_3         
	//*  23   48:arraylength     
	//*  24   49:iconst_1        
	//*  25   50:icmpge          86
		{
			if(fmLog != null)
	//*  26   53:aload_0         
	//*  27   54:getfield        #27  <Field FMLog fmLog>
	//*  28   57:ifnull          73
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u5FD7\u4E3A\u7A7A");
	//   29   60:aload_0         
	//   30   61:getfield        #27  <Field FMLog fmLog>
	//   31   64:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   66:ldc1            #179 <String "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u5FD7\u4E3A\u7A7A">
	//   33   68:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u5FD7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   73:new             #32  <Class BusinessException>
	//   35   76:dup             
	//   36   77:ldc1            #179 <String "\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u65F6\uFF0C\u4F20\u5165\u7684eSE\u6807\u5FD7\u4E3A\u7A7A">
	//   37   79:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   82:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   85:athrow          
		}
		return !manager.getCardAppInstall().issuerVer2(abyte0, i, abyte1, abyte2) ? 99 : 0;
	//   40   86:aload_0         
	//   41   87:getfield        #25  <Field BusinessManager manager>
	//   42   90:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   43   95:aload_1         
	//   44   96:iload_2         
	//   45   97:aload_3         
	//   46   98:aload           4
	//   47  100:invokeinterface #183 <Method boolean CardAppInstall.issuerVer2(byte[], int, byte[], byte[])>
	//   48  105:ifeq            110
	//   49  108:iconst_0        
	//   50  109:ireturn         
	//   51  110:bipush          99
	//   52  112:ireturn         
	}

	public int doRefund(byte abyte0[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          43
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          30
				fmLog.warn("NfcosClientManagerHodo", "\u5904\u7406\u9000\u6B3E\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc1            #187 <String "\u5904\u7406\u9000\u6B3E\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   13   25:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5904\u7406\u9000\u6B3E\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   30:new             #32  <Class BusinessException>
	//   15   33:dup             
	//   16   34:ldc1            #187 <String "\u5904\u7406\u9000\u6B3E\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   17   36:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   39:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   42:athrow          
		} else
		{
			return manager.getCardAppTrade().doRefund(abyte0);
	//   20   43:aload_0         
	//   21   44:getfield        #25  <Field BusinessManager manager>
	//   22   47:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   23   52:aload_1         
	//   24   53:invokeinterface #189 <Method int CardAppTrade.doRefund(byte[])>
	//   25   58:ireturn         
		}
	}

	public int doUnsolvedOrder(byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          43
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          30
				fmLog.warn("NfcosClientManagerHodo", "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc1            #193 <String "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   13   25:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   30:new             #32  <Class BusinessException>
	//   15   33:dup             
	//   16   34:ldc1            #193 <String "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   17   36:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   39:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   42:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  20   43:aload_2         
	//*  21   44:ifnull          53
	//*  22   47:aload_2         
	//*  23   48:arraylength     
	//*  24   49:iconst_1        
	//*  25   50:icmpge          86
		{
			if(fmLog != null)
	//*  26   53:aload_0         
	//*  27   54:getfield        #27  <Field FMLog fmLog>
	//*  28   57:ifnull          73
				fmLog.warn("NfcosClientManagerHodo", "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u5361\u53F7\u4E3A\u7A7A");
	//   29   60:aload_0         
	//   30   61:getfield        #27  <Field FMLog fmLog>
	//   31   64:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   66:ldc1            #195 <String "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u5361\u53F7\u4E3A\u7A7A">
	//   33   68:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u5361\u53F7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   73:new             #32  <Class BusinessException>
	//   35   76:dup             
	//   36   77:ldc1            #195 <String "\u5904\u7406\u672A\u51B3\u8BA2\u5355\u65F6\uFF0C\u5361\u53F7\u4E3A\u7A7A">
	//   37   79:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   82:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   85:athrow          
		} else
		{
			return manager.getCardAppTrade().doUnsolvedOrder(abyte0, abyte1);
	//   40   86:aload_0         
	//   41   87:getfield        #25  <Field BusinessManager manager>
	//   42   90:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   43   95:aload_1         
	//   44   96:aload_2         
	//   45   97:invokeinterface #197 <Method int CardAppTrade.doUnsolvedOrder(byte[], byte[])>
	//   46  102:ireturn         
		}
	}

	public EnumCardAppStatus getAppStatus4Platform(EnumCardAppType enumcardapptype, byte abyte0[], String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #201 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #201 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte0 == null || abyte0.length < 1)
	//*  16   37:aload_2         
	//*  17   38:ifnull          47
	//*  18   41:aload_2         
	//*  19   42:arraylength     
	//*  20   43:iconst_1        
	//*  21   44:icmpge          80
		{
			if(fmLog != null)
	//*  22   47:aload_0         
	//*  23   48:getfield        #27  <Field FMLog fmLog>
	//*  24   51:ifnull          67
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684eSE\u7684\u6807\u8BC6\u65E0\u6548");
	//   25   54:aload_0         
	//   26   55:getfield        #27  <Field FMLog fmLog>
	//   27   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   60:ldc1            #203 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684eSE\u7684\u6807\u8BC6\u65E0\u6548">
	//   29   62:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684eSE\u7684\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   67:new             #32  <Class BusinessException>
	//   31   70:dup             
	//   32   71:ldc1            #203 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684eSE\u7684\u6807\u8BC6\u65E0\u6548">
	//   33   73:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   76:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   80:aload_3         
	//*  37   81:ifnull          92
	//*  38   84:aload_3         
	//*  39   85:invokevirtual   #57  <Method int String.length()>
	//*  40   88:iconst_1        
	//*  41   89:icmpge          125
		{
			if(fmLog != null)
	//*  42   92:aload_0         
	//*  43   93:getfield        #27  <Field FMLog fmLog>
	//*  44   96:ifnull          112
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u578B\u53F7\u89C4\u683C\u7684\u8868\u793A\u65E0\u6548");
	//   45   99:aload_0         
	//   46  100:getfield        #27  <Field FMLog fmLog>
	//   47  103:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  105:ldc1            #205 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u578B\u53F7\u89C4\u683C\u7684\u8868\u793A\u65E0\u6548">
	//   49  107:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u578B\u53F7\u89C4\u683C\u7684\u8868\u793A\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  112:new             #32  <Class BusinessException>
	//   51  115:dup             
	//   52  116:ldc1            #205 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u53D1\u884C\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u7684\u7EC8\u7AEF\u578B\u53F7\u89C4\u683C\u7684\u8868\u793A\u65E0\u6548">
	//   53  118:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  121:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  124:athrow          
		} else
		{
			return manager.getCardAppInstall().getAppIssuerStatus4Platform(enumcardapptype, s, abyte0);
	//   56  125:aload_0         
	//   57  126:getfield        #25  <Field BusinessManager manager>
	//   58  129:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   59  134:aload_1         
	//   60  135:aload_3         
	//   61  136:aload_2         
	//   62  137:invokeinterface #209 <Method EnumCardAppStatus CardAppInstall.getAppIssuerStatus4Platform(EnumCardAppType, String, byte[])>
	//   63  142:areturn         
		}
	}

	public CardAppInfo getCardAppInfo(int i, EnumCardAppType enumcardapptype)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #213 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #213 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\uFF0C\u4F20\u5165\u7684\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		CardAppInfo cardappinfo = new CardAppInfo();
	//   16   37:new             #215 <Class CardAppInfo>
	//   17   40:dup             
	//   18   41:invokespecial   #216 <Method void CardAppInfo()>
	//   19   44:astore_3        
		if((i & 1) != 0)
	//*  20   45:iload_1         
	//*  21   46:iconst_1        
	//*  22   47:iand            
	//*  23   48:ifeq            145
		{
			byte abyte0[] = manager.getCardAppTrade().getAppNo(enumcardapptype);
	//   24   51:aload_0         
	//   25   52:getfield        #25  <Field BusinessManager manager>
	//   26   55:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   27   60:aload_2         
	//   28   61:invokeinterface #220 <Method byte[] CardAppTrade.getAppNo(EnumCardAppType)>
	//   29   66:astore          4
			if(enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH || enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH_TOUR || enumcardapptype == EnumCardAppType.CARD_APP_TYPE_SH_RENT)
	//*  30   68:aload_2         
	//*  31   69:getstatic       #226 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH>
	//*  32   72:if_acmpeq       89
	//*  33   75:aload_2         
	//*  34   76:getstatic       #229 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH_TOUR>
	//*  35   79:if_acmpeq       89
	//*  36   82:aload_2         
	//*  37   83:getstatic       #232 <Field EnumCardAppType EnumCardAppType.CARD_APP_TYPE_SH_RENT>
	//*  38   86:if_acmpne       130
			{
				if(abyte0 == null || abyte0.length < 8)
	//*  39   89:aload           4
	//*  40   91:ifnull          102
	//*  41   94:aload           4
	//*  42   96:arraylength     
	//*  43   97:bipush          8
	//*  44   99:icmpge          111
					cardappinfo.setFaceId("");
	//   45  102:aload_3         
	//   46  103:ldc1            #234 <String "">
	//   47  105:invokevirtual   #238 <Method void CardAppInfo.setFaceId(String)>
				else
	//*  48  108:goto            139
					cardappinfo.setFaceId(CardTools.getFaceID4UID(Arrays.copyOfRange(abyte0, 4, abyte0.length)));
	//   49  111:aload_3         
	//   50  112:aload           4
	//   51  114:iconst_4        
	//   52  115:aload           4
	//   53  117:arraylength     
	//   54  118:invokestatic    #244 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   55  121:invokestatic    #250 <Method String CardTools.getFaceID4UID(byte[])>
	//   56  124:invokevirtual   #238 <Method void CardAppInfo.setFaceId(String)>
			} else
	//*  57  127:goto            139
			{
				cardappinfo.setFaceId(CardTools.getFaceNo4uidByLnt(abyte0));
	//   58  130:aload_3         
	//   59  131:aload           4
	//   60  133:invokestatic    #253 <Method String CardTools.getFaceNo4uidByLnt(byte[])>
	//   61  136:invokevirtual   #238 <Method void CardAppInfo.setFaceId(String)>
			}
			cardappinfo.setCardAppNo(abyte0);
	//   62  139:aload_3         
	//   63  140:aload           4
	//   64  142:invokevirtual   #257 <Method void CardAppInfo.setCardAppNo(byte[])>
		}
		if((i & 2) != 0)
	//*  65  145:iload_1         
	//*  66  146:iconst_2        
	//*  67  147:iand            
	//*  68  148:ifeq            170
			cardappinfo.setBalance(manager.getCardAppTrade().getBalance(enumcardapptype));
	//   69  151:aload_3         
	//   70  152:aload_0         
	//   71  153:getfield        #25  <Field BusinessManager manager>
	//   72  156:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   73  161:aload_2         
	//   74  162:invokeinterface #261 <Method Integer CardAppTrade.getBalance(EnumCardAppType)>
	//   75  167:invokevirtual   #265 <Method void CardAppInfo.setBalance(Integer)>
		if((i & 4) != 0)
	//*  76  170:iload_1         
	//*  77  171:iconst_4        
	//*  78  172:iand            
	//*  79  173:ifeq            234
		{
			Object obj = ((Object) (manager.getCardAppTrade().getCardAppRecords(enumcardapptype)));
	//   80  176:aload_0         
	//   81  177:getfield        #25  <Field BusinessManager manager>
	//   82  180:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   83  185:aload_2         
	//   84  186:invokeinterface #269 <Method List CardAppTrade.getCardAppRecords(EnumCardAppType)>
	//   85  191:astore          4
			if(obj != null)
	//*  86  193:aload           4
	//*  87  195:ifnull          234
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); cardappinfo.addRecord((CardAppRecord)((Iterator) (obj)).next()));
	//   88  198:aload           4
	//   89  200:invokeinterface #275 <Method Iterator List.iterator()>
	//   90  205:astore          4
	//   91  207:goto            224
	//   92  210:aload_3         
	//   93  211:aload           4
	//   94  213:invokeinterface #281 <Method Object Iterator.next()>
	//   95  218:checkcast       #283 <Class CardAppRecord>
	//   96  221:invokevirtual   #287 <Method void CardAppInfo.addRecord(CardAppRecord)>
	//   97  224:aload           4
	//   98  226:invokeinterface #291 <Method boolean Iterator.hasNext()>
	//   99  231:ifne            210
		}
		if((i & 8) != 0)
	//* 100  234:iload_1         
	//* 101  235:bipush          8
	//* 102  237:iand            
	//* 103  238:ifeq            272
			if(manager.getCardAppTrade().isLock4Consume(enumcardapptype))
	//* 104  241:aload_0         
	//* 105  242:getfield        #25  <Field BusinessManager manager>
	//* 106  245:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//* 107  250:aload_2         
	//* 108  251:invokeinterface #295 <Method boolean CardAppTrade.isLock4Consume(EnumCardAppType)>
	//* 109  256:ifeq            267
				cardappinfo.setAppClose(true);
	//  110  259:aload_3         
	//  111  260:iconst_1        
	//  112  261:invokevirtual   #299 <Method void CardAppInfo.setAppClose(boolean)>
			else
	//* 113  264:goto            272
				cardappinfo.setAppClose(false);
	//  114  267:aload_3         
	//  115  268:iconst_0        
	//  116  269:invokevirtual   #299 <Method void CardAppInfo.setAppClose(boolean)>
		if((i & 0x10) != 0)
	//* 117  272:iload_1         
	//* 118  273:bipush          16
	//* 119  275:iand            
	//* 120  276:ifeq            298
			cardappinfo.setMoc(manager.getCardAppTrade().getMOC(enumcardapptype));
	//  121  279:aload_3         
	//  122  280:aload_0         
	//  123  281:getfield        #25  <Field BusinessManager manager>
	//  124  284:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//  125  289:aload_2         
	//  126  290:invokeinterface #303 <Method String CardAppTrade.getMOC(EnumCardAppType)>
	//  127  295:invokevirtual   #306 <Method void CardAppInfo.setMoc(String)>
		if((i & 0x20) != 0)
	//* 128  298:iload_1         
	//* 129  299:bipush          32
	//* 130  301:iand            
	//* 131  302:ifeq            324
			cardappinfo.setTime4Validity(manager.getCardAppTrade().getTime4Validity(enumcardapptype));
	//  132  305:aload_3         
	//  133  306:aload_0         
	//  134  307:getfield        #25  <Field BusinessManager manager>
	//  135  310:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//  136  315:aload_2         
	//  137  316:invokeinterface #309 <Method String CardAppTrade.getTime4Validity(EnumCardAppType)>
	//  138  321:invokevirtual   #312 <Method void CardAppInfo.setTime4Validity(String)>
		return cardappinfo;
	//  139  324:aload_3         
	//  140  325:areturn         
	}

	public EnumCardAppStatus getCardAppStatus(EnumCardAppType enumcardapptype)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #201 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #201 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		} else
		{
			return manager.getCardAppInstall().getAppIssuerStatus(enumcardapptype);
	//   16   37:aload_0         
	//   17   38:getfield        #25  <Field BusinessManager manager>
	//   18   41:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   19   46:aload_1         
	//   20   47:invokeinterface #317 <Method EnumCardAppStatus CardAppInstall.getAppIssuerStatus(EnumCardAppType)>
	//   21   52:areturn         
		}
	}

	public String getInvoiceToken(byte abyte0[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          45
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          31
				fmLog.warn("NfcosClientManagerHodo", "\u83B7\u53D6\u8BA2\u5355\u53D1\u7968\u7533\u9886\u51ED\u8BC1\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc2            #320 <String "\u83B7\u53D6\u8BA2\u5355\u53D1\u7968\u7533\u9886\u51ED\u8BC1\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   13   26:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u83B7\u53D6\u8BA2\u5355\u53D1\u7968\u7533\u9886\u51ED\u8BC1\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   31:new             #32  <Class BusinessException>
	//   15   34:dup             
	//   16   35:ldc2            #320 <String "\u83B7\u53D6\u8BA2\u5355\u53D1\u7968\u7533\u9886\u51ED\u8BC1\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   17   38:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   41:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   44:athrow          
		} else
		{
			return manager.getCardAppTrade().getInvoiceToken(abyte0);
	//   20   45:aload_0         
	//   21   46:getfield        #25  <Field BusinessManager manager>
	//   22   49:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   23   54:aload_1         
	//   24   55:invokeinterface #322 <Method String CardAppTrade.getInvoiceToken(byte[])>
	//   25   60:areturn         
		}
	}

	public List getInvoiceTokens()
		throws BusinessException
	{
		return manager.getCardAppTrade().getInvoiceTokenVer3();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//    3    9:invokeinterface #327 <Method List CardAppTrade.getInvoiceTokenVer3()>
	//    4   14:areturn         
	}

	public void init()
	{
		manager = BusinessManagerFactory.getBusinessManager();
	//    0    0:aload_0         
	//    1    1:invokestatic    #336 <Method BusinessManager BusinessManagerFactory.getBusinessManager()>
	//    2    4:putfield        #25  <Field BusinessManager manager>
		Random random = new Random();
	//    3    7:new             #338 <Class Random>
	//    4   10:dup             
	//    5   11:invokespecial   #339 <Method void Random()>
	//    6   14:astore_2        
		byte abyte0[] = new byte[32];
	//    7   15:bipush          32
	//    8   17:newarray        byte[]
	//    9   19:astore_3        
		random.nextBytes(abyte0);
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #342 <Method void Random.nextBytes(byte[])>
		manager.setTerminalNumber(abyte0);
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field BusinessManager manager>
	//   15   29:aload_3         
	//   16   30:invokeinterface #346 <Method boolean BusinessManager.setTerminalNumber(byte[])>
	//   17   35:pop             
		byte byte0 = (byte)EnumTerminalOpType.ANDROID.getId();
	//   18   36:getstatic       #352 <Field EnumTerminalOpType EnumTerminalOpType.ANDROID>
	//   19   39:invokevirtual   #355 <Method int EnumTerminalOpType.getId()>
	//   20   42:int2byte        
	//   21   43:istore_1        
		manager.setMobileInfo(new byte[] {
			2, 1, byte0
		});
	//   22   44:aload_0         
	//   23   45:getfield        #25  <Field BusinessManager manager>
	//   24   48:iconst_3        
	//   25   49:newarray        byte[]
	//   26   51:dup             
	//   27   52:iconst_0        
	//   28   53:iconst_2        
	//   29   54:bastore         
	//   30   55:dup             
	//   31   56:iconst_1        
	//   32   57:iconst_1        
	//   33   58:bastore         
	//   34   59:dup             
	//   35   60:iconst_2        
	//   36   61:iload_1         
	//   37   62:bastore         
	//   38   63:invokeinterface #358 <Method void BusinessManager.setMobileInfo(byte[])>
		unsolvedOrderAndCardNo = ((Map) (new HashMap()));
	//   39   68:aload_0         
	//   40   69:new             #360 <Class HashMap>
	//   41   72:dup             
	//   42   73:invokespecial   #361 <Method void HashMap()>
	//   43   76:putfield        #363 <Field Map unsolvedOrderAndCardNo>
		fmLog = LogFactory.getInstance().getLog();
	//   44   79:aload_0         
	//   45   80:invokestatic    #369 <Method LogFactory LogFactory.getInstance()>
	//   46   83:invokevirtual   #373 <Method FMLog LogFactory.getLog()>
	//   47   86:putfield        #27  <Field FMLog fmLog>
	//   48   89:return          
	}

	public LoginInfo login(String s, String s1)
		throws BusinessException
	{
		if(s == null || s.length() < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #57  <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:icmpge          47
		{
			if(fmLog != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #27  <Field FMLog fmLog>
	//*   8   16:ifnull          33
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A");
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field FMLog fmLog>
	//   11   23:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   25:ldc2            #377 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A">
	//   13   28:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   33:new             #32  <Class BusinessException>
	//   15   36:dup             
	//   16   37:ldc2            #377 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A">
	//   17   40:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   43:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   46:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  20   47:aload_2         
	//*  21   48:ifnull          59
	//*  22   51:aload_2         
	//*  23   52:invokevirtual   #57  <Method int String.length()>
	//*  24   55:iconst_1        
	//*  25   56:icmpge          94
		{
			if(fmLog != null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #27  <Field FMLog fmLog>
	//*  28   63:ifnull          80
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A");
	//   29   66:aload_0         
	//   30   67:getfield        #27  <Field FMLog fmLog>
	//   31   70:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   72:ldc2            #379 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A">
	//   33   75:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   80:new             #32  <Class BusinessException>
	//   35   83:dup             
	//   36   84:ldc2            #379 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A">
	//   37   87:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   90:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   93:athrow          
		} else
		{
			return manager.getCardAppTrade().loginVer2(s, s1);
	//   40   94:aload_0         
	//   41   95:getfield        #25  <Field BusinessManager manager>
	//   42   98:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   43  103:aload_1         
	//   44  104:aload_2         
	//   45  105:invokeinterface #382 <Method LoginInfo CardAppTrade.loginVer2(String, String)>
	//   46  110:areturn         
		}
	}

	public LoginInfo login4third(String s, String s1, EnumUserPlatformType enumuserplatformtype, String s2)
		throws BusinessException
	{
		if(s == null || s.length() < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #57  <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:icmpge          47
		{
			if(fmLog != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #27  <Field FMLog fmLog>
	//*   8   16:ifnull          33
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A");
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field FMLog fmLog>
	//   11   23:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   25:ldc2            #377 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A">
	//   13   28:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   33:new             #32  <Class BusinessException>
	//   15   36:dup             
	//   16   37:ldc2            #377 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u540D\u4E3A\u7A7A">
	//   17   40:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   43:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   46:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  20   47:aload_2         
	//*  21   48:ifnull          59
	//*  22   51:aload_2         
	//*  23   52:invokevirtual   #57  <Method int String.length()>
	//*  24   55:iconst_1        
	//*  25   56:icmpge          94
		{
			if(fmLog != null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #27  <Field FMLog fmLog>
	//*  28   63:ifnull          80
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A");
	//   29   66:aload_0         
	//   30   67:getfield        #27  <Field FMLog fmLog>
	//   31   70:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   72:ldc2            #379 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A">
	//   33   75:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   80:new             #32  <Class BusinessException>
	//   35   83:dup             
	//   36   84:ldc2            #379 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u4E3A\u7A7A">
	//   37   87:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   90:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   93:athrow          
		}
		if(enumuserplatformtype == null)
	//*  40   94:aload_3         
	//*  41   95:ifnonnull       133
		{
			if(fmLog != null)
	//*  42   98:aload_0         
	//*  43   99:getfield        #27  <Field FMLog fmLog>
	//*  44  102:ifnull          119
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u6240\u5C5E\u5E73\u53F0\u7C7B\u578B\u4E0D\u5408\u6CD5");
	//   45  105:aload_0         
	//   46  106:getfield        #27  <Field FMLog fmLog>
	//   47  109:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  111:ldc2            #386 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u6240\u5C5E\u5E73\u53F0\u7C7B\u578B\u4E0D\u5408\u6CD5">
	//   49  114:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u6240\u5C5E\u5E73\u53F0\u7C7B\u578B\u4E0D\u5408\u6CD5", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  119:new             #32  <Class BusinessException>
	//   51  122:dup             
	//   52  123:ldc2            #386 <String "\u7528\u6237\u767B\u5F55\u65F6\uFF0C\u7528\u6237\u6240\u5C5E\u5E73\u53F0\u7C7B\u578B\u4E0D\u5408\u6CD5">
	//   53  126:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  129:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  132:athrow          
		} else
		{
			return manager.getCardAppTrade().loginVer3(s, s1, enumuserplatformtype, s2);
	//   56  133:aload_0         
	//   57  134:getfield        #25  <Field BusinessManager manager>
	//   58  137:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   59  142:aload_1         
	//   60  143:aload_2         
	//   61  144:aload_3         
	//   62  145:aload           4
	//   63  147:invokeinterface #389 <Method LoginInfo CardAppTrade.loginVer3(String, String, EnumUserPlatformType, String)>
	//   64  152:areturn         
		}
	}

	public int logout()
		throws BusinessException
	{
		return manager.getCardAppTrade().logout();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//    3    9:invokeinterface #392 <Method int CardAppTrade.logout()>
	//    4   14:ireturn         
	}

	public int modifyPassword(String s, String s1)
		throws BusinessException
	{
		if(s == null || s.length() < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #57  <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:icmpge          47
		{
			if(fmLog != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #27  <Field FMLog fmLog>
	//*   8   16:ifnull          33
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65E7\u5BC6\u7801\u4E3A\u7A7A");
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field FMLog fmLog>
	//   11   23:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   25:ldc2            #396 <String "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65E7\u5BC6\u7801\u4E3A\u7A7A">
	//   13   28:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65E7\u5BC6\u7801\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   33:new             #32  <Class BusinessException>
	//   15   36:dup             
	//   16   37:ldc2            #396 <String "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65E7\u5BC6\u7801\u4E3A\u7A7A">
	//   17   40:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   43:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   46:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  20   47:aload_2         
	//*  21   48:ifnull          59
	//*  22   51:aload_2         
	//*  23   52:invokevirtual   #57  <Method int String.length()>
	//*  24   55:iconst_1        
	//*  25   56:icmpge          94
		{
			if(fmLog != null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #27  <Field FMLog fmLog>
	//*  28   63:ifnull          80
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65B0\u5BC6\u7801\u4E3A\u7A7A");
	//   29   66:aload_0         
	//   30   67:getfield        #27  <Field FMLog fmLog>
	//   31   70:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   72:ldc2            #398 <String "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65B0\u5BC6\u7801\u4E3A\u7A7A">
	//   33   75:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65B0\u5BC6\u7801\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   80:new             #32  <Class BusinessException>
	//   35   83:dup             
	//   36   84:ldc2            #398 <String "\u7528\u6237\u4FEE\u6539\u5BC6\u7801\u65F6\uFF0C\u65B0\u5BC6\u7801\u4E3A\u7A7A">
	//   37   87:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   90:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   93:athrow          
		} else
		{
			return manager.getCardAppTrade().modifyPassword(s, s1);
	//   40   94:aload_0         
	//   41   95:getfield        #25  <Field BusinessManager manager>
	//   42   98:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   43  103:aload_1         
	//   44  104:aload_2         
	//   45  105:invokeinterface #400 <Method int CardAppTrade.modifyPassword(String, String)>
	//   46  110:ireturn         
		}
	}

	public byte[] moveApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #404 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u65E0\u6548">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #406 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		}
		if(enumcardapptype == null)
	//*  16   39:aload_2         
	//*  17   40:ifnonnull       78
		{
			if(fmLog != null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #27  <Field FMLog fmLog>
	//*  20   47:ifnull          64
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//   21   50:aload_0         
	//   22   51:getfield        #27  <Field FMLog fmLog>
	//   23   54:ldc1            #21  <String "NfcosClientManagerHodo">
	//   24   56:ldc2            #406 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   25   59:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   26   64:new             #32  <Class BusinessException>
	//   27   67:dup             
	//   28   68:ldc2            #408 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   29   71:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   30   74:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   31   77:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  32   78:aload_3         
	//*  33   79:ifnull          88
	//*  34   82:aload_3         
	//*  35   83:arraylength     
	//*  36   84:iconst_1        
	//*  37   85:icmpge          123
		{
			if(fmLog != null)
	//*  38   88:aload_0         
	//*  39   89:getfield        #27  <Field FMLog fmLog>
	//*  40   92:ifnull          109
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548");
	//   41   95:aload_0         
	//   42   96:getfield        #27  <Field FMLog fmLog>
	//   43   99:ldc1            #21  <String "NfcosClientManagerHodo">
	//   44  101:ldc2            #410 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   45  104:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   46  109:new             #32  <Class BusinessException>
	//   47  112:dup             
	//   48  113:ldc2            #410 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   49  116:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   50  119:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   51  122:athrow          
		}
		if(s == null || s.length() < 1)
	//*  52  123:aload           4
	//*  53  125:ifnull          137
	//*  54  128:aload           4
	//*  55  130:invokevirtual   #57  <Method int String.length()>
	//*  56  133:iconst_1        
	//*  57  134:icmpge          172
		{
			if(fmLog != null)
	//*  58  137:aload_0         
	//*  59  138:getfield        #27  <Field FMLog fmLog>
	//*  60  141:ifnull          158
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   61  144:aload_0         
	//   62  145:getfield        #27  <Field FMLog fmLog>
	//   63  148:ldc1            #21  <String "NfcosClientManagerHodo">
	//   64  150:ldc2            #412 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   65  153:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   66  158:new             #32  <Class BusinessException>
	//   67  161:dup             
	//   68  162:ldc2            #412 <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   69  165:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   70  168:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   71  171:athrow          
		} else
		{
			return manager.getCardAppInstall().moveApp(abyte0, enumcardapptype, abyte1, s);
	//   72  172:aload_0         
	//   73  173:getfield        #25  <Field BusinessManager manager>
	//   74  176:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   75  181:aload_1         
	//   76  182:aload_2         
	//   77  183:aload_3         
	//   78  184:aload           4
	//   79  186:invokeinterface #414 <Method byte[] CardAppInstall.moveApp(byte[], EnumCardAppType, byte[], String)>
	//   80  191:areturn         
		}
	}

	public int openApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       37
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          24
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc1            #149 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   19:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   24:new             #32  <Class BusinessException>
	//   11   27:dup             
	//   12   28:ldc1            #149 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   30:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   33:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   36:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  16   37:aload_3         
	//*  17   38:ifnull          47
	//*  18   41:aload_3         
	//*  19   42:arraylength     
	//*  20   43:iconst_1        
	//*  21   44:icmpge          80
		{
			if(fmLog != null)
	//*  22   47:aload_0         
	//*  23   48:getfield        #27  <Field FMLog fmLog>
	//*  24   51:ifnull          67
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548");
	//   25   54:aload_0         
	//   26   55:getfield        #27  <Field FMLog fmLog>
	//   27   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   60:ldc1            #151 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   29   62:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   67:new             #32  <Class BusinessException>
	//   31   70:dup             
	//   32   71:ldc1            #151 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165eSE\u6807\u8BC6\u65E0\u6548">
	//   33   73:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   76:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
		}
		if(s == null || s.length() < 1)
	//*  36   80:aload           4
	//*  37   82:ifnull          94
	//*  38   85:aload           4
	//*  39   87:invokevirtual   #57  <Method int String.length()>
	//*  40   90:iconst_1        
	//*  41   91:icmpge          127
		{
			if(fmLog != null)
	//*  42   94:aload_0         
	//*  43   95:getfield        #27  <Field FMLog fmLog>
	//*  44   98:ifnull          114
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548");
	//   45  101:aload_0         
	//   46  102:getfield        #27  <Field FMLog fmLog>
	//   47  105:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  107:ldc1            #153 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   49  109:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  114:new             #32  <Class BusinessException>
	//   51  117:dup             
	//   52  118:ldc1            #153 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   53  120:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  123:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  126:athrow          
		}
		return !manager.getCardAppInstall().setApp(abyte0, enumcardapptype, abyte1, s, EnumAppManageOperateType.APP_UNLOCK) ? 99 : 0;
	//   56  127:aload_0         
	//   57  128:getfield        #25  <Field BusinessManager manager>
	//   58  131:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//   59  136:aload_1         
	//   60  137:aload_2         
	//   61  138:aload_3         
	//   62  139:aload           4
	//   63  141:getstatic       #418 <Field EnumAppManageOperateType EnumAppManageOperateType.APP_UNLOCK>
	//   64  144:invokeinterface #163 <Method boolean CardAppInstall.setApp(byte[], EnumCardAppType, byte[], String, EnumAppManageOperateType)>
	//   65  149:ifeq            154
	//   66  152:iconst_0        
	//   67  153:ireturn         
	//   68  154:bipush          99
	//   69  156:ireturn         
	}

	public int orderExec(byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		return manager.getCardAppInstall().orderExce(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #67  <Method CardAppInstall BusinessManager.getCardAppInstall()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokeinterface #422 <Method int CardAppInstall.orderExce(byte[], byte[])>
	//    6   16:ireturn         
	}

	public List queryActivities(EnumCardAppType enumcardapptype)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u6D3B\u52A8\u4FE1\u606F\u5217\u8868\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #425 <String "\u6D3B\u52A8\u4FE1\u606F\u5217\u8868\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u6D3B\u52A8\u4FE1\u606F\u5217\u8868\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #425 <String "\u6D3B\u52A8\u4FE1\u606F\u5217\u8868\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		} else
		{
			return manager.getCardAppTrade().queryActivities(enumcardapptype);
	//   16   39:aload_0         
	//   17   40:getfield        #25  <Field BusinessManager manager>
	//   18   43:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   19   48:aload_1         
	//   20   49:invokeinterface #427 <Method List CardAppTrade.queryActivities(EnumCardAppType)>
	//   21   54:areturn         
		}
	}

	public List queryActivities(EnumCardAppType enumcardapptype, String s)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       38
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #431 <String "\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc1            #153 <String "\u5361\u4E0A\u5E94\u7528\u72B6\u6001\u8BBE\u7F6E\u65F6\uFF0C\u4F20\u5165\u7EC8\u7AEF\u578B\u53F7\u65E0\u6548">
	//   13   31:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   34:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   37:athrow          
		}
		if(s == null || s.length() < 1)
	//*  16   38:aload_2         
	//*  17   39:ifnull          50
	//*  18   42:aload_2         
	//*  19   43:invokevirtual   #57  <Method int String.length()>
	//*  20   46:iconst_1        
	//*  21   47:icmpge          85
		{
			if(fmLog != null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #27  <Field FMLog fmLog>
	//*  24   54:ifnull          71
				fmLog.warn("NfcosClientManagerHodo", "\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5382\u5546\u7F16\u7801\u65E0\u6548");
	//   25   57:aload_0         
	//   26   58:getfield        #27  <Field FMLog fmLog>
	//   27   61:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   63:ldc2            #433 <String "\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5382\u5546\u7F16\u7801\u65E0\u6548">
	//   29   66:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5382\u5546\u7F16\u7801\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   71:new             #32  <Class BusinessException>
	//   31   74:dup             
	//   32   75:ldc2            #433 <String "\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5382\u5546\u7F16\u7801\u65E0\u6548">
	//   33   78:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   81:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   84:athrow          
		} else
		{
			return manager.getCardAppTrade().queryActivities(enumcardapptype);
	//   36   85:aload_0         
	//   37   86:getfield        #25  <Field BusinessManager manager>
	//   38   89:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   39   94:aload_1         
	//   40   95:invokeinterface #427 <Method List CardAppTrade.queryActivities(EnumCardAppType)>
	//   41  100:areturn         
		}
	}

	public List queryBlance4PreDeposit(EnumCardAppType enumcardapptype)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u5145\u503C\u989D\u5EA6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #437 <String "\u5145\u503C\u989D\u5EA6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5145\u503C\u989D\u5EA6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #437 <String "\u5145\u503C\u989D\u5EA6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		} else
		{
			return manager.getCardAppTrade().queryPreDepositVer2(enumcardapptype);
	//   16   39:aload_0         
	//   17   40:getfield        #25  <Field BusinessManager manager>
	//   18   43:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   19   48:aload_1         
	//   20   49:invokeinterface #440 <Method List CardAppTrade.queryPreDepositVer2(EnumCardAppType)>
	//   21   54:areturn         
		}
	}

	public BusinessOrder queryBusinessOrder(byte abyte0[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          45
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          31
				fmLog.warn("NfcosClientManagerHodo", "\u4E1A\u52A1\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc2            #445 <String "\u4E1A\u52A1\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   13   26:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E1A\u52A1\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   31:new             #32  <Class BusinessException>
	//   15   34:dup             
	//   16   35:ldc2            #445 <String "\u4E1A\u52A1\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   17   38:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   41:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   44:athrow          
		} else
		{
			return manager.getCardAppTrade().queryBusinessOrder(abyte0);
	//   20   45:aload_0         
	//   21   46:getfield        #25  <Field BusinessManager manager>
	//   22   49:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   23   54:aload_1         
	//   24   55:invokeinterface #447 <Method BusinessOrder CardAppTrade.queryBusinessOrder(byte[])>
	//   25   60:areturn         
		}
	}

	public List queryBusinessOrders(int i, int j, EnumCardAppType enumcardapptype, EnumBusinessOrderType enumbusinessordertype, List list, byte abyte0[])
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #451 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #451 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u7684\u7C7B\u578B\u65E0\u6548">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		}
		if(list == null)
	//*  16   39:aload           5
	//*  17   41:ifnonnull       79
		{
			if(fmLog != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #27  <Field FMLog fmLog>
	//*  20   48:ifnull          65
				fmLog.warn("NfcosClientManagerHodo", "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u8BA2\u5355\u72B6\u6001\u65E0\u6548");
	//   21   51:aload_0         
	//   22   52:getfield        #27  <Field FMLog fmLog>
	//   23   55:ldc1            #21  <String "NfcosClientManagerHodo">
	//   24   57:ldc2            #453 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u8BA2\u5355\u72B6\u6001\u65E0\u6548">
	//   25   60:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u8BA2\u5355\u72B6\u6001\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   26   65:new             #32  <Class BusinessException>
	//   27   68:dup             
	//   28   69:ldc2            #453 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u7684\u8BA2\u5355\u72B6\u6001\u65E0\u6548">
	//   29   72:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   30   75:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   31   78:athrow          
		}
		if(enumbusinessordertype == null)
	//*  32   79:aload           4
	//*  33   81:ifnonnull       119
		{
			if(fmLog != null)
	//*  34   84:aload_0         
	//*  35   85:getfield        #27  <Field FMLog fmLog>
	//*  36   88:ifnull          105
				fmLog.warn("NfcosClientManagerHodo", "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u4E1A\u52A1\u8BA2\u5355\u7C7B\u578B\u65E0\u6548");
	//   37   91:aload_0         
	//   38   92:getfield        #27  <Field FMLog fmLog>
	//   39   95:ldc1            #21  <String "NfcosClientManagerHodo">
	//   40   97:ldc2            #455 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u4E1A\u52A1\u8BA2\u5355\u7C7B\u578B\u65E0\u6548">
	//   41  100:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u4E1A\u52A1\u8BA2\u5355\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   42  105:new             #32  <Class BusinessException>
	//   43  108:dup             
	//   44  109:ldc2            #455 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u4E1A\u52A1\u8BA2\u5355\u7C7B\u578B\u65E0\u6548">
	//   45  112:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   46  115:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  118:athrow          
		}
		if(i < 0 || j < 0)
	//*  48  119:iload_1         
	//*  49  120:iflt            127
	//*  50  123:iload_2         
	//*  51  124:ifge            162
		{
			if(fmLog != null)
	//*  52  127:aload_0         
	//*  53  128:getfield        #27  <Field FMLog fmLog>
	//*  54  131:ifnull          148
				fmLog.warn("NfcosClientManagerHodo", "\u4E1A\u52A1\u8BA2\u5355\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548");
	//   55  134:aload_0         
	//   56  135:getfield        #27  <Field FMLog fmLog>
	//   57  138:ldc1            #21  <String "NfcosClientManagerHodo">
	//   58  140:ldc2            #457 <String "\u4E1A\u52A1\u8BA2\u5355\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548">
	//   59  143:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   60  148:new             #32  <Class BusinessException>
	//   61  151:dup             
	//   62  152:ldc2            #459 <String "\u4E1A\u52A1\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548">
	//   63  155:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   64  158:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   65  161:athrow          
		} else
		{
			return manager.getCardAppTrade().queryBusinessOrdersVer4(i, j, enumcardapptype, enumbusinessordertype, list, abyte0);
	//   66  162:aload_0         
	//   67  163:getfield        #25  <Field BusinessManager manager>
	//   68  166:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   69  171:iload_1         
	//   70  172:iload_2         
	//   71  173:aload_3         
	//   72  174:aload           4
	//   73  176:aload           5
	//   74  178:aload           6
	//   75  180:invokeinterface #462 <Method List CardAppTrade.queryBusinessOrdersVer4(int, int, EnumCardAppType, EnumBusinessOrderType, List, byte[])>
	//   76  185:areturn         
		}
	}

	public MainOrder queryMainOrder(byte abyte0[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          45
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          31
				fmLog.warn("NfcosClientManagerHodo", "\u4E3B\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc2            #466 <String "\u4E3B\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   13   26:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E3B\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   31:new             #32  <Class BusinessException>
	//   15   34:dup             
	//   16   35:ldc2            #466 <String "\u4E3B\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   17   38:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   41:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   44:athrow          
		} else
		{
			return manager.getCardAppTrade().queryMainOrder(abyte0);
	//   20   45:aload_0         
	//   21   46:getfield        #25  <Field BusinessManager manager>
	//   22   49:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   23   54:aload_1         
	//   24   55:invokeinterface #468 <Method MainOrder CardAppTrade.queryMainOrder(byte[])>
	//   25   60:areturn         
		}
	}

	public List queryMainOrders(int i, int j, EnumCardAppType enumcardapptype)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #472 <String "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #472 <String "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u5361\u4E0A\u5E94\u7528\u7C7B\u578B\u65E0\u6548">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		}
		if(i < 0 || j < 0)
	//*  16   39:iload_1         
	//*  17   40:iflt            47
	//*  18   43:iload_2         
	//*  19   44:ifge            82
		{
			if(fmLog != null)
	//*  20   47:aload_0         
	//*  21   48:getfield        #27  <Field FMLog fmLog>
	//*  22   51:ifnull          68
				fmLog.warn("NfcosClientManagerHodo", "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548");
	//   23   54:aload_0         
	//   24   55:getfield        #27  <Field FMLog fmLog>
	//   25   58:ldc1            #21  <String "NfcosClientManagerHodo">
	//   26   60:ldc2            #474 <String "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548">
	//   27   63:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   28   68:new             #32  <Class BusinessException>
	//   29   71:dup             
	//   30   72:ldc2            #474 <String "\u4E3B\u8BA2\u5355\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u67E5\u8BE2\u8303\u56F4\u65E0\u6548">
	//   31   75:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   32   78:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   33   81:athrow          
		} else
		{
			return manager.getCardAppTrade().queryMainOrders(i, j, EnumOrderStatus.unknown, enumcardapptype);
	//   34   82:aload_0         
	//   35   83:getfield        #25  <Field BusinessManager manager>
	//   36   86:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   37   91:iload_1         
	//   38   92:iload_2         
	//   39   93:getstatic       #480 <Field EnumOrderStatus EnumOrderStatus.unknown>
	//   40   96:aload_3         
	//   41   97:invokeinterface #483 <Method List CardAppTrade.queryMainOrders(int, int, EnumOrderStatus, EnumCardAppType)>
	//   42  102:areturn         
		}
	}

	public PayOrder queryPayOrder(byte abyte0[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          45
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          31
				fmLog.warn("NfcosClientManagerHodo", "\u652F\u4ED8\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc2            #488 <String "\u652F\u4ED8\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   13   26:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u652F\u4ED8\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   31:new             #32  <Class BusinessException>
	//   15   34:dup             
	//   16   35:ldc2            #488 <String "\u652F\u4ED8\u8BA2\u5355\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2\u65F6\uFF0C\u4F20\u5165\u8BA2\u5355\u7F16\u53F7\u65E0\u6548">
	//   17   38:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   41:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   44:athrow          
		} else
		{
			return manager.getCardAppTrade().queryPayOrder(abyte0);
	//   20   45:aload_0         
	//   21   46:getfield        #25  <Field BusinessManager manager>
	//   22   49:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   23   54:aload_1         
	//   24   55:invokeinterface #490 <Method PayOrder CardAppTrade.queryPayOrder(byte[])>
	//   25   60:areturn         
		}
	}

	public List queryProducts(String s, EnumCardAppType enumcardapptype, String s1, String s2)
		throws BusinessException
	{
		if(enumcardapptype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       38
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #494 <String "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc1            #34  <String "applet\u9884\u4E0B\u8F7D\u65F6\uFF0C\u4F20\u5165\u7684\u5361\u7C7B\u578B\u4E3A\u7A7A">
	//   13   31:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   34:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   37:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  16   38:aload_3         
	//*  17   39:ifnull          50
	//*  18   42:aload_3         
	//*  19   43:invokevirtual   #57  <Method int String.length()>
	//*  20   46:iconst_1        
	//*  21   47:icmpge          85
		{
			if(fmLog != null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #27  <Field FMLog fmLog>
	//*  24   54:ifnull          71
				fmLog.warn("NfcosClientManagerHodo", "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684SIM\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A");
	//   25   57:aload_0         
	//   26   58:getfield        #27  <Field FMLog fmLog>
	//   27   61:ldc1            #21  <String "NfcosClientManagerHodo">
	//   28   63:ldc2            #496 <String "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684SIM\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A">
	//   29   66:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684SIM\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   30   71:new             #32  <Class BusinessException>
	//   31   74:dup             
	//   32   75:ldc2            #496 <String "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u4F20\u5165\u7684SIM\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A">
	//   33   78:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   34   81:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   84:athrow          
		}
		if(s2 == null || s2.length() < 1)
	//*  36   85:aload           4
	//*  37   87:ifnull          99
	//*  38   90:aload           4
	//*  39   92:invokevirtual   #57  <Method int String.length()>
	//*  40   95:iconst_1        
	//*  41   96:icmpge          134
		{
			if(fmLog != null)
	//*  42   99:aload_0         
	//*  43  100:getfield        #27  <Field FMLog fmLog>
	//*  44  103:ifnull          120
				fmLog.warn("NfcosClientManagerHodo", "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u7528\u6237\u5F53\u524D\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A");
	//   45  106:aload_0         
	//   46  107:getfield        #27  <Field FMLog fmLog>
	//   47  110:ldc1            #21  <String "NfcosClientManagerHodo">
	//   48  112:ldc2            #498 <String "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u7528\u6237\u5F53\u524D\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A">
	//   49  115:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u7528\u6237\u5F53\u524D\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   50  120:new             #32  <Class BusinessException>
	//   51  123:dup             
	//   52  124:ldc2            #498 <String "\u4EA7\u54C1\u4FE1\u606F\u68C0\u7D22\u65F6\uFF0C\u7528\u6237\u5F53\u524D\u6240\u5C5E\u57CE\u5E02\u4E3A\u7A7A">
	//   53  127:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   54  130:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   55  133:athrow          
		} else
		{
			s1 = ((String) (s1.getBytes()));
	//   56  134:aload_3         
	//   57  135:invokevirtual   #126 <Method byte[] String.getBytes()>
	//   58  138:astore_3        
			s2 = ((String) (s2.getBytes()));
	//   59  139:aload           4
	//   60  141:invokevirtual   #126 <Method byte[] String.getBytes()>
	//   61  144:astore          4
			s1 = ((String) (FM_Bytes.join(FM_Bytes.join(FM_Bytes.join(new byte[] {
				1, (byte)s1.length
			}, ((byte []) (s1))), new byte[] {
				2, (byte)s2.length
			}), ((byte []) (s2)))));
	//   62  146:iconst_2        
	//   63  147:newarray        byte[]
	//   64  149:dup             
	//   65  150:iconst_0        
	//   66  151:iconst_1        
	//   67  152:bastore         
	//   68  153:dup             
	//   69  154:iconst_1        
	//   70  155:aload_3         
	//   71  156:arraylength     
	//   72  157:int2byte        
	//   73  158:bastore         
	//   74  159:aload_3         
	//   75  160:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   76  163:iconst_2        
	//   77  164:newarray        byte[]
	//   78  166:dup             
	//   79  167:iconst_0        
	//   80  168:iconst_2        
	//   81  169:bastore         
	//   82  170:dup             
	//   83  171:iconst_1        
	//   84  172:aload           4
	//   85  174:arraylength     
	//   86  175:int2byte        
	//   87  176:bastore         
	//   88  177:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   89  180:aload           4
	//   90  182:invokestatic    #106 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   91  185:astore_3        
			return manager.getCardAppTrade().queryProducts(s, enumcardapptype, ((byte []) (s1)));
	//   92  186:aload_0         
	//   93  187:getfield        #25  <Field BusinessManager manager>
	//   94  190:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   95  195:aload_1         
	//   96  196:aload_2         
	//   97  197:aload_3         
	//   98  198:invokeinterface #501 <Method List CardAppTrade.queryProducts(String, EnumCardAppType, byte[])>
	//   99  203:areturn         
		}
	}

	public List queryPromotionMessage()
		throws BusinessException
	{
		return manager.getBusinessExtend().queryPromotionMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #136 <Method BusinessExtend BusinessManager.getBusinessExtend()>
	//    3    9:invokeinterface #505 <Method List BusinessExtend.queryPromotionMessage()>
	//    4   14:areturn         
	}

	public VersionInfo queryVersion()
		throws BusinessException
	{
		return manager.getCardAppTrade().queryVersion();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//    3    9:invokeinterface #510 <Method VersionInfo CardAppTrade.queryVersion()>
	//    4   14:areturn         
	}

	public int recharge(byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          45
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field FMLog fmLog>
	//*   8   14:ifnull          31
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A");
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field FMLog fmLog>
	//   11   21:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   23:ldc2            #513 <String "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   13   26:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   31:new             #32  <Class BusinessException>
	//   15   34:dup             
	//   16   35:ldc2            #513 <String "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u8BA2\u5355\u7F16\u53F7\u4E3A\u7A7A">
	//   17   38:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   41:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   44:athrow          
		}
		if(abyte1 == null || abyte1.length < 1)
	//*  20   45:aload_2         
	//*  21   46:ifnull          55
	//*  22   49:aload_2         
	//*  23   50:arraylength     
	//*  24   51:iconst_1        
	//*  25   52:icmpge          90
		{
			if(fmLog != null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #27  <Field FMLog fmLog>
	//*  28   59:ifnull          76
				fmLog.warn("NfcosClientManagerHodo", "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u5361\u4E0A\u5E94\u7528\u5E8F\u5217\u53F7\u4E3A\u7A7A");
	//   29   62:aload_0         
	//   30   63:getfield        #27  <Field FMLog fmLog>
	//   31   66:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   68:ldc2            #515 <String "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u5361\u4E0A\u5E94\u7528\u5E8F\u5217\u53F7\u4E3A\u7A7A">
	//   33   71:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u5361\u4E0A\u5E94\u7528\u5E8F\u5217\u53F7\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   76:new             #32  <Class BusinessException>
	//   35   79:dup             
	//   36   80:ldc2            #515 <String "\u5361\u4E0A\u5E94\u7528\u5145\u503C\u65F6\uFF0C\u5361\u4E0A\u5E94\u7528\u5E8F\u5217\u53F7\u4E3A\u7A7A">
	//   37   83:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   86:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   89:athrow          
		}
		return !manager.getCardAppTrade().remoteRecharge(abyte0, abyte1) ? 99 : 0;
	//   40   90:aload_0         
	//   41   91:getfield        #25  <Field BusinessManager manager>
	//   42   94:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   43   99:aload_1         
	//   44  100:aload_2         
	//   45  101:invokeinterface #519 <Method boolean CardAppTrade.remoteRecharge(byte[], byte[])>
	//   46  106:ifeq            111
	//   47  109:iconst_0        
	//   48  110:ireturn         
	//   49  111:bipush          99
	//   50  113:ireturn         
	}

	public int register(String s, String s1)
		throws BusinessException
	{
		if(s == null || s.length() < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #57  <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:icmpge          47
		{
			if(fmLog != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #27  <Field FMLog fmLog>
	//*   8   16:ifnull          33
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u540D\u65E0\u6548");
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field FMLog fmLog>
	//   11   23:ldc1            #21  <String "NfcosClientManagerHodo">
	//   12   25:ldc2            #522 <String "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u540D\u65E0\u6548">
	//   13   28:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u540D\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   14   33:new             #32  <Class BusinessException>
	//   15   36:dup             
	//   16   37:ldc2            #522 <String "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u540D\u65E0\u6548">
	//   17   40:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   18   43:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   19   46:athrow          
		}
		if(s1 == null || s1.length() < 1)
	//*  20   47:aload_2         
	//*  21   48:ifnull          59
	//*  22   51:aload_2         
	//*  23   52:invokevirtual   #57  <Method int String.length()>
	//*  24   55:iconst_1        
	//*  25   56:icmpge          94
		{
			if(fmLog != null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #27  <Field FMLog fmLog>
	//*  28   63:ifnull          80
				fmLog.warn("NfcosClientManagerHodo", "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u65E0\u6548");
	//   29   66:aload_0         
	//   30   67:getfield        #27  <Field FMLog fmLog>
	//   31   70:ldc1            #21  <String "NfcosClientManagerHodo">
	//   32   72:ldc2            #524 <String "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u65E0\u6548">
	//   33   75:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   34   80:new             #32  <Class BusinessException>
	//   35   83:dup             
	//   36   84:ldc2            #524 <String "\u7528\u6237\u6CE8\u518C\u65F6\uFF0C\u7528\u6237\u5BC6\u7801\u65E0\u6548">
	//   37   87:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   38   90:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   39   93:athrow          
		} else
		{
			UserInfo userinfo = new UserInfo();
	//   40   94:new             #526 <Class UserInfo>
	//   41   97:dup             
	//   42   98:invokespecial   #527 <Method void UserInfo()>
	//   43  101:astore_3        
			userinfo.setUserName(s);
	//   44  102:aload_3         
	//   45  103:aload_1         
	//   46  104:invokevirtual   #530 <Method void UserInfo.setUserName(String)>
			userinfo.setPassword(s1);
	//   47  107:aload_3         
	//   48  108:aload_2         
	//   49  109:invokevirtual   #533 <Method void UserInfo.setPassword(String)>
			userinfo.setUserType(2);
	//   50  112:aload_3         
	//   51  113:iconst_2        
	//   52  114:invokevirtual   #537 <Method void UserInfo.setUserType(int)>
			return manager.getCardAppTrade().registerVer2(userinfo);
	//   53  117:aload_0         
	//   54  118:getfield        #25  <Field BusinessManager manager>
	//   55  121:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   56  126:aload_3         
	//   57  127:invokeinterface #541 <Method int CardAppTrade.registerVer2(UserInfo)>
	//   58  132:ireturn         
		}
	}

	public void registerApduHandler(ApduHandler apduhandler)
	{
		manager.setApduHandler(apduhandler);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:aload_1         
	//    3    5:invokeinterface #546 <Method void BusinessManager.setApduHandler(ApduHandler)>
	//    4   10:return          
	}

	public void registerLogHandle(FMLog fmlog)
	{
		LogFactory.getInstance().setLog(fmlog);
	//    0    0:invokestatic    #369 <Method LogFactory LogFactory.getInstance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #551 <Method void LogFactory.setLog(FMLog)>
	//    3    7:return          
	}

	public byte[] rentBusinessHandle(int i, byte abyte0[])
		throws BusinessException
	{
		return manager.getCardAppTrade().rentBusinessHandle(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BusinessManager manager>
	//    2    4:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//    3    9:iload_1         
	//    4   10:aload_2         
	//    5   11:invokeinterface #555 <Method byte[] CardAppTrade.rentBusinessHandle(int, byte[])>
	//    6   16:areturn         
	}

	public int terminalFeedback(TerminalBackInfo terminalbackinfo)
		throws BusinessException
	{
		if(terminalbackinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field FMLog fmLog>
	//*   4    8:ifnull          25
				fmLog.warn("NfcosClientManagerHodo", "\u7EC8\u7AEF\u4FE1\u606F\u53CD\u9988\u65F6\uFF0C\u4F20\u5165\u7684\u53CD\u9988\u4FE1\u606F\u5BF9\u8C61\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field FMLog fmLog>
	//    7   15:ldc1            #21  <String "NfcosClientManagerHodo">
	//    8   17:ldc2            #559 <String "\u7EC8\u7AEF\u4FE1\u606F\u53CD\u9988\u65F6\uFF0C\u4F20\u5165\u7684\u53CD\u9988\u4FE1\u606F\u5BF9\u8C61\u4E3A\u7A7A">
	//    9   20:invokeinterface #40  <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u4FE1\u606F\u53CD\u9988\u65F6\uFF0C\u4F20\u5165\u7684\u53CD\u9988\u4FE1\u606F\u5BF9\u8C61\u4E3A\u7A7A", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   10   25:new             #32  <Class BusinessException>
	//   11   28:dup             
	//   12   29:ldc2            #559 <String "\u7EC8\u7AEF\u4FE1\u606F\u53CD\u9988\u65F6\uFF0C\u4F20\u5165\u7684\u53CD\u9988\u4FE1\u606F\u5BF9\u8C61\u4E3A\u7A7A">
	//   13   32:getstatic       #46  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   14   35:invokespecial   #49  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   15   38:athrow          
		} else
		{
			return manager.getCardAppTrade().terminalInfoBack(terminalbackinfo);
	//   16   39:aload_0         
	//   17   40:getfield        #25  <Field BusinessManager manager>
	//   18   43:invokeinterface #83  <Method CardAppTrade BusinessManager.getCardAppTrade()>
	//   19   48:aload_1         
	//   20   49:invokeinterface #562 <Method int CardAppTrade.terminalInfoBack(TerminalBackInfo)>
	//   21   54:ireturn         
		}
	}

	private FMLog fmLog;
	private final String logTag = "NfcosClientManagerHodo";
	private BusinessManager manager;
	private volatile Map unsolvedOrderAndCardNo;
}
