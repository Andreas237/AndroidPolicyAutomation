// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.communication.message.*;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.tsm.business.BusinessExtend;
import cn.com.fmsh.tsm.business.bean.*;
import cn.com.fmsh.tsm.business.enums.EnumCardIoType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.*;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

// Referenced classes of package cn.com.fmsh.tsm.business.core:
//			CardAppTradeImpl, CardBusinessBasic

public class BusinessExtendImpl
	implements BusinessExtend
{

	public BusinessExtendImpl(CardBusinessBasic cardbusinessbasic)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		fmLog = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field FMLog fmLog>
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <Class CardAppTradeImpl>
	//    7   12:invokevirtual   #27  <Method String Class.getName()>
	//    8   15:putfield        #29  <Field String logTag>
		cardBusinessBasic = cardbusinessbasic;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #31  <Field CardBusinessBasic cardBusinessBasic>
		fmLog = LogFactory.getInstance().getLog();
	//   12   23:aload_0         
	//   13   24:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//   14   27:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//   15   30:putfield        #19  <Field FMLog fmLog>
	//   16   33:return          
	}

	public int applyForElectronicTakeUp(byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.info(logTag, "\u7535\u5B50\u5238\u7533\u9886...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc1            #50  <String "\u7535\u5B50\u5238\u7533\u9886...">
	//   15   34:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   39:aload_0         
	//*  17   40:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   43:ifnonnull       117
		{
			if(fmLog != null)
	//*  19   46:aload_0         
	//*  20   47:getfield        #19  <Field FMLog fmLog>
	//*  21   50:ifnull          86
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   53:aload_0         
	//   23   54:getfield        #19  <Field FMLog fmLog>
	//   24   57:aload_0         
	//   25   58:getfield        #29  <Field String logTag>
	//   26   61:new             #58  <Class StringBuilder>
	//   27   64:dup             
	//   28   65:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//   29   67:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   70:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   73:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   78:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   81:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   86:new             #46  <Class BusinessException>
	//   36   89:dup             
	//   37   90:new             #58  <Class StringBuilder>
	//   38   93:dup             
	//   39   94:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//   40   96:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41   99:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  102:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  104:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  107:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  110:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  113:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  116:athrow          
		}
		IMessageHandler imessagehandler = cardBusinessBasic.getMessageHandler();
	//   48  117:aload_0         
	//   49  118:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  121:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  124:astore          7
		if(imessagehandler == null)
	//*  52  126:aload           7
	//*  53  128:ifnonnull       202
		{
			if(fmLog != null)
	//*  54  131:aload_0         
	//*  55  132:getfield        #19  <Field FMLog fmLog>
	//*  56  135:ifnull          171
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  138:aload_0         
	//   58  139:getfield        #19  <Field FMLog fmLog>
	//   59  142:aload_0         
	//   60  143:getfield        #29  <Field String logTag>
	//   61  146:new             #58  <Class StringBuilder>
	//   62  149:dup             
	//   63  150:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//   64  152:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  155:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  158:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  160:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  163:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  166:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  171:new             #46  <Class BusinessException>
	//   71  174:dup             
	//   72  175:new             #58  <Class StringBuilder>
	//   73  178:dup             
	//   74  179:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//   75  181:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  184:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  187:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  189:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  192:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  195:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  198:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  201:athrow          
		}
		if(abyte0 == null)
	//*  83  202:aload_1         
	//*  84  203:ifnonnull       277
		{
			if(fmLog != null)
	//*  85  206:aload_0         
	//*  86  207:getfield        #19  <Field FMLog fmLog>
	//*  87  210:ifnull          246
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString());
	//   88  213:aload_0         
	//   89  214:getfield        #19  <Field FMLog fmLog>
	//   90  217:aload_0         
	//   91  218:getfield        #29  <Field String logTag>
	//   92  221:new             #58  <Class StringBuilder>
	//   93  224:dup             
	//   94  225:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//   95  227:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  230:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  233:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//   98  235:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  238:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  241:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  246:new             #46  <Class BusinessException>
	//  102  249:dup             
	//  103  250:new             #58  <Class StringBuilder>
	//  104  253:dup             
	//  105  254:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  106  256:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  259:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  262:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//  109  264:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  267:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  270:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  273:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  276:athrow          
		}
		if(abyte1 == null)
	//* 114  277:aload_2         
	//* 115  278:ifnonnull       352
		{
			if(fmLog != null)
	//* 116  281:aload_0         
	//* 117  282:getfield        #19  <Field FMLog fmLog>
	//* 118  285:ifnull          321
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString());
	//  119  288:aload_0         
	//  120  289:getfield        #19  <Field FMLog fmLog>
	//  121  292:aload_0         
	//  122  293:getfield        #29  <Field String logTag>
	//  123  296:new             #58  <Class StringBuilder>
	//  124  299:dup             
	//  125  300:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  126  302:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  305:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  308:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  129  310:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  313:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  316:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  321:new             #46  <Class BusinessException>
	//  133  324:dup             
	//  134  325:new             #58  <Class StringBuilder>
	//  135  328:dup             
	//  136  329:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  137  331:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  334:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  337:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  140  339:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  342:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  345:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  348:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  351:athrow          
		}
		String s = cardBusinessBasic.getServer4Business(4611);
	//  145  352:aload_0         
	//  146  353:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  147  356:sipush          4611
	//  148  359:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  149  362:astore          5
		if(s == null)
	//* 150  364:aload           5
	//* 151  366:ifnonnull       440
		{
			if(fmLog != null)
	//* 152  369:aload_0         
	//* 153  370:getfield        #19  <Field FMLog fmLog>
	//* 154  373:ifnull          409
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  155  376:aload_0         
	//  156  377:getfield        #19  <Field FMLog fmLog>
	//  157  380:aload_0         
	//  158  381:getfield        #29  <Field String logTag>
	//  159  384:new             #58  <Class StringBuilder>
	//  160  387:dup             
	//  161  388:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  162  390:invokestatic    #66  <Method String String.valueOf(Object)>
	//  163  393:invokespecial   #69  <Method void StringBuilder(String)>
	//  164  396:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  165  398:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  166  401:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  167  404:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  168  409:new             #46  <Class BusinessException>
	//  169  412:dup             
	//  170  413:new             #58  <Class StringBuilder>
	//  171  416:dup             
	//  172  417:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  173  419:invokestatic    #66  <Method String String.valueOf(Object)>
	//  174  422:invokespecial   #69  <Method void StringBuilder(String)>
	//  175  425:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  176  427:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  177  430:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  178  433:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  179  436:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  180  439:athrow          
		}
		cardBusinessBasic.businessReady("\u7535\u5B50\u5238\u7533\u9886", s);
	//  181  440:aload_0         
	//  182  441:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  183  444:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  184  446:aload           5
	//  185  448:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		Object obj = null;
	//  186  451:aconst_null     
	//  187  452:astore          4
		IMessage imessage = imessagehandler.createMessage(4611);
	//  188  454:aload           7
	//  189  456:sipush          4611
	//  190  459:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  191  464:astore          6
		try
		{
			ITag itag = imessagehandler.createTag((byte)112);
	//  192  466:aload           7
	//  193  468:bipush          112
	//  194  470:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  195  475:astore          8
			itag.addValue(abyte0);
	//  196  477:aload           8
	//  197  479:aload_1         
	//  198  480:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  199  485:pop             
			imessage.addTag(itag);
	//  200  486:aload           6
	//  201  488:aload           8
	//  202  490:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  203  495:pop             
			abyte0 = ((byte []) (imessagehandler.createTag((byte)113)));
	//  204  496:aload           7
	//  205  498:bipush          113
	//  206  500:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  207  505:astore_1        
			((ITag) (abyte0)).addValue(abyte1);
	//  208  506:aload_1         
	//  209  507:aload_2         
	//  210  508:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  211  513:pop             
			imessage.addTag(((ITag) (abyte0)));
	//  212  514:aload           6
	//  213  516:aload_1         
	//  214  517:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  215  522:pop             
			abyte0 = imessage.toBytes();
	//  216  523:aload           6
	//  217  525:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  218  530:astore_1        
		}
	//* 219  531:goto            616
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 220  534:astore_1        
		{
			if(fmLog != null)
	//* 221  535:aload_0         
	//* 222  536:getfield        #19  <Field FMLog fmLog>
	//* 223  539:ifnull          582
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  224  542:aload_0         
	//  225  543:getfield        #19  <Field FMLog fmLog>
	//  226  546:aload_0         
	//  227  547:getfield        #29  <Field String logTag>
	//  228  550:new             #58  <Class StringBuilder>
	//  229  553:dup             
	//  230  554:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  231  556:invokestatic    #66  <Method String String.valueOf(Object)>
	//  232  559:invokespecial   #69  <Method void StringBuilder(String)>
	//  233  562:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  234  564:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  235  567:aload_1         
	//  236  568:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  237  571:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  238  574:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  239  577:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u7533\u9886"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  240  582:aload_0         
	//  241  583:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  242  586:new             #58  <Class StringBuilder>
	//  243  589:dup             
	//  244  590:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  245  592:invokestatic    #66  <Method String String.valueOf(Object)>
	//  246  595:invokespecial   #69  <Method void StringBuilder(String)>
	//  247  598:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  248  600:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  249  603:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  250  606:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  251  609:iconst_0        
	//  252  610:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//  253  613:aload           4
	//  254  615:astore_1        
		}
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7535\u5B50\u5238\u7533\u9886", false, s);
	//  255  616:aload_0         
	//  256  617:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  257  620:aload_1         
	//  258  621:ldc1            #60  <String "\u7535\u5B50\u5238\u7533\u9886">
	//  259  623:iconst_0        
	//  260  624:aload           5
	//  261  626:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  262  629:astore_1        
		abyte1 = new byte[2];
	//  263  630:iconst_2        
	//  264  631:newarray        byte[]
	//  265  633:astore_2        
		int i = abyte1.length;
	//  266  634:aload_2         
	//  267  635:arraylength     
	//  268  636:istore_3        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, 2);
	//  269  637:aload_1         
	//  270  638:iconst_0        
	//  271  639:aload_2         
	//  272  640:iconst_0        
	//  273  641:iconst_2        
	//  274  642:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte1))
	//* 275  645:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 276  648:aload_2         
	//* 277  649:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 278  652:ifeq            657
			return 0;
	//  279  655:iconst_0        
	//  280  656:ireturn         
		if(fmLog != null)
	//* 281  657:aload_0         
	//* 282  658:getfield        #19  <Field FMLog fmLog>
	//* 283  661:ifnull          696
			fmLog.warn(logTag, (new StringBuilder("\u7528\u6237\u4FE1\u606F\u4FEE\u6539:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  284  664:aload_0         
	//  285  665:getfield        #19  <Field FMLog fmLog>
	//  286  668:aload_0         
	//  287  669:getfield        #29  <Field String logTag>
	//  288  672:new             #58  <Class StringBuilder>
	//  289  675:dup             
	//  290  676:ldc1            #186 <String "\u7528\u6237\u4FE1\u606F\u4FEE\u6539:">
	//  291  678:invokespecial   #69  <Method void StringBuilder(String)>
	//  292  681:aload_1         
	//  293  682:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  294  685:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  295  688:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  296  691:invokeinterface #81  <Method void FMLog.warn(String, String)>
		return FM_CN.bcdBytesToInt(abyte1);
	//  297  696:aload_2         
	//  298  697:invokestatic    #197 <Method int FM_CN.bcdBytesToInt(byte[])>
	//  299  700:ireturn         
	}

	public MainOrder applyPromotion(byte abyte0[])
		throws BusinessException
	{
		IMessageHandler imessagehandler;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.info(logTag, "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc1            #202 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7...">
	//   15   34:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(abyte0 == null || abyte0.length < 1)
	//*  16   39:aload_1         
	//*  17   40:ifnull          49
	//*  18   43:aload_1         
	//*  19   44:arraylength     
	//*  20   45:iconst_1        
	//*  21   46:icmpge          120
		{
			if(fmLog != null)
	//*  22   49:aload_0         
	//*  23   50:getfield        #19  <Field FMLog fmLog>
	//*  24   53:ifnull          89
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u672A\u4F20\u5165\u7B7E\u540D\u6570\u636E").toString());
	//   25   56:aload_0         
	//   26   57:getfield        #19  <Field FMLog fmLog>
	//   27   60:aload_0         
	//   28   61:getfield        #29  <Field String logTag>
	//   29   64:new             #58  <Class StringBuilder>
	//   30   67:dup             
	//   31   68:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//   32   70:invokestatic    #66  <Method String String.valueOf(Object)>
	//   33   73:invokespecial   #69  <Method void StringBuilder(String)>
	//   34   76:ldc1            #206 <String "\u65F6\uFF0C\u672A\u4F20\u5165\u7B7E\u540D\u6570\u636E">
	//   35   78:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   36   81:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   37   84:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_para_error);
	//   38   89:new             #46  <Class BusinessException>
	//   39   92:dup             
	//   40   93:new             #58  <Class StringBuilder>
	//   41   96:dup             
	//   42   97:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//   43   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   44  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   45  105:ldc1            #208 <String "\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u5F02\u5E38">
	//   46  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   47  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   48  113:getstatic       #211 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_para_error>
	//   49  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   50  119:athrow          
		}
		if(cardBusinessBasic == null)
	//*  51  120:aload_0         
	//*  52  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  53  124:ifnonnull       198
		{
			if(fmLog != null)
	//*  54  127:aload_0         
	//*  55  128:getfield        #19  <Field FMLog fmLog>
	//*  56  131:ifnull          167
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   57  134:aload_0         
	//   58  135:getfield        #19  <Field FMLog fmLog>
	//   59  138:aload_0         
	//   60  139:getfield        #29  <Field String logTag>
	//   61  142:new             #58  <Class StringBuilder>
	//   62  145:dup             
	//   63  146:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//   64  148:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  151:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  154:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   67  156:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  159:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  162:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   70  167:new             #46  <Class BusinessException>
	//   71  170:dup             
	//   72  171:new             #58  <Class StringBuilder>
	//   73  174:dup             
	//   74  175:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//   75  177:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  180:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  183:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   78  185:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  188:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  191:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   81  194:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  197:athrow          
		}
		imessagehandler = cardBusinessBasic.getMessageHandler();
	//   83  198:aload_0         
	//   84  199:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   85  202:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   86  205:astore          4
		if(imessagehandler == null)
	//*  87  207:aload           4
	//*  88  209:ifnonnull       283
		{
			if(fmLog != null)
	//*  89  212:aload_0         
	//*  90  213:getfield        #19  <Field FMLog fmLog>
	//*  91  216:ifnull          252
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   92  219:aload_0         
	//   93  220:getfield        #19  <Field FMLog fmLog>
	//   94  223:aload_0         
	//   95  224:getfield        #29  <Field String logTag>
	//   96  227:new             #58  <Class StringBuilder>
	//   97  230:dup             
	//   98  231:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//   99  233:invokestatic    #66  <Method String String.valueOf(Object)>
	//  100  236:invokespecial   #69  <Method void StringBuilder(String)>
	//  101  239:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//  102  241:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  103  244:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  104  247:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  105  252:new             #46  <Class BusinessException>
	//  106  255:dup             
	//  107  256:new             #58  <Class StringBuilder>
	//  108  259:dup             
	//  109  260:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  110  262:invokestatic    #66  <Method String String.valueOf(Object)>
	//  111  265:invokespecial   #69  <Method void StringBuilder(String)>
	//  112  268:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//  113  270:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  114  273:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  115  276:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  116  279:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  117  282:athrow          
		}
		String s = cardBusinessBasic.getServer4Business(4641);
	//  118  283:aload_0         
	//  119  284:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  120  287:sipush          4641
	//  121  290:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  122  293:astore          5
		if(s == null)
	//* 123  295:aload           5
	//* 124  297:ifnonnull       371
		{
			if(fmLog != null)
	//* 125  300:aload_0         
	//* 126  301:getfield        #19  <Field FMLog fmLog>
	//* 127  304:ifnull          340
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  128  307:aload_0         
	//  129  308:getfield        #19  <Field FMLog fmLog>
	//  130  311:aload_0         
	//  131  312:getfield        #29  <Field String logTag>
	//  132  315:new             #58  <Class StringBuilder>
	//  133  318:dup             
	//  134  319:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  135  321:invokestatic    #66  <Method String String.valueOf(Object)>
	//  136  324:invokespecial   #69  <Method void StringBuilder(String)>
	//  137  327:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  138  329:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  139  332:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  140  335:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  141  340:new             #46  <Class BusinessException>
	//  142  343:dup             
	//  143  344:new             #58  <Class StringBuilder>
	//  144  347:dup             
	//  145  348:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  146  350:invokestatic    #66  <Method String String.valueOf(Object)>
	//  147  353:invokespecial   #69  <Method void StringBuilder(String)>
	//  148  356:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  149  358:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  150  361:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  151  364:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  152  367:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  153  370:athrow          
		}
		cardBusinessBasic.businessReady("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7", s);
	//  154  371:aload_0         
	//  155  372:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  156  375:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  157  377:aload           5
	//  158  379:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		byte abyte1[] = null;
	//  159  382:aconst_null     
	//  160  383:astore_3        
		IMessage imessage = imessagehandler.createMessage(1201);
	//  161  384:aload           4
	//  162  386:sipush          1201
	//  163  389:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  164  394:astore          6
		try
		{
			ITag itag = imessagehandler.createTag((byte)71);
	//  165  396:aload           4
	//  166  398:bipush          71
	//  167  400:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  168  405:astore          7
			itag.addValue(abyte0);
	//  169  407:aload           7
	//  170  409:aload_1         
	//  171  410:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  172  415:pop             
			imessage.addTag(itag);
	//  173  416:aload           6
	//  174  418:aload           7
	//  175  420:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  176  425:pop             
			abyte0 = imessage.toBytes();
	//  177  426:aload           6
	//  178  428:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  179  433:astore_1        
		}
	//* 180  434:goto            518
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 181  437:astore_1        
		{
			if(fmLog != null)
	//* 182  438:aload_0         
	//* 183  439:getfield        #19  <Field FMLog fmLog>
	//* 184  442:ifnull          485
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  185  445:aload_0         
	//  186  446:getfield        #19  <Field FMLog fmLog>
	//  187  449:aload_0         
	//  188  450:getfield        #29  <Field String logTag>
	//  189  453:new             #58  <Class StringBuilder>
	//  190  456:dup             
	//  191  457:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  192  459:invokestatic    #66  <Method String String.valueOf(Object)>
	//  193  462:invokespecial   #69  <Method void StringBuilder(String)>
	//  194  465:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  195  467:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  196  470:aload_1         
	//  197  471:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  198  474:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  199  477:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  200  480:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  201  485:aload_0         
	//  202  486:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  203  489:new             #58  <Class StringBuilder>
	//  204  492:dup             
	//  205  493:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  206  495:invokestatic    #66  <Method String String.valueOf(Object)>
	//  207  498:invokespecial   #69  <Method void StringBuilder(String)>
	//  208  501:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  209  503:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  210  506:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  211  509:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  212  512:iconst_0        
	//  213  513:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = abyte1;
	//  214  516:aload_3         
	//  215  517:astore_1        
		}
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7", false, s);
	//  216  518:aload_0         
	//  217  519:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  218  522:aload_1         
	//  219  523:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  220  525:iconst_0        
	//  221  526:aload           5
	//  222  528:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  223  531:astore_1        
		abyte1 = new byte[2];
	//  224  532:iconst_2        
	//  225  533:newarray        byte[]
	//  226  535:astore_3        
		int i = abyte1.length;
	//  227  536:aload_3         
	//  228  537:arraylength     
	//  229  538:istore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, 2);
	//  230  539:aload_1         
	//  231  540:iconst_0        
	//  232  541:aload_3         
	//  233  542:iconst_0        
	//  234  543:iconst_2        
	//  235  544:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte1))
	//* 236  547:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 237  550:aload_3         
	//* 238  551:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 239  554:ifne            639
		{
			if(fmLog != null)
	//* 240  557:aload_0         
	//* 241  558:getfield        #19  <Field FMLog fmLog>
	//* 242  561:ifnull          604
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  243  564:aload_0         
	//  244  565:getfield        #19  <Field FMLog fmLog>
	//  245  568:aload_0         
	//  246  569:getfield        #29  <Field String logTag>
	//  247  572:new             #58  <Class StringBuilder>
	//  248  575:dup             
	//  249  576:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  250  578:invokestatic    #66  <Method String String.valueOf(Object)>
	//  251  581:invokespecial   #69  <Method void StringBuilder(String)>
	//  252  584:ldc1            #213 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25: ">
	//  253  586:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  254  589:aload_1         
	//  255  590:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  256  593:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  257  596:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  258  599:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte1)), false);
	//  259  604:aload_0         
	//  260  605:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  261  608:new             #58  <Class StringBuilder>
	//  262  611:dup             
	//  263  612:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  264  614:invokestatic    #66  <Method String String.valueOf(Object)>
	//  265  617:invokespecial   #69  <Method void StringBuilder(String)>
	//  266  620:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  267  622:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  268  625:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  269  628:aload_3         
	//  270  629:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  271  632:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  272  635:iconst_0        
	//  273  636:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		abyte0 = ((byte []) (imessagehandler.createMessage(1201, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(96)));
	//  274  639:aload           4
	//  275  641:sipush          1201
	//  276  644:aload_1         
	//  277  645:iconst_2        
	//  278  646:aload_1         
	//  279  647:arraylength     
	//  280  648:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  281  651:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  282  656:bipush          96
	//  283  658:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  284  663:astore_1        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_754;
	//  285  664:aload_1         
	//  286  665:ifnull          754
		abyte0 = ((byte []) (MainOrder.fromTag(((ITag) (abyte0)))));
	//  287  668:aload_1         
	//  288  669:invokestatic    #239 <Method MainOrder MainOrder.fromTag(ITag)>
	//  289  672:astore_1        
		return ((MainOrder) (abyte0));
	//  290  673:aload_1         
	//  291  674:areturn         
		abyte0;
	//  292  675:astore_1        
		if(fmLog != null)
	//* 293  676:aload_0         
	//* 294  677:getfield        #19  <Field FMLog fmLog>
	//* 295  680:ifnull          723
			fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u51FA\u73B0\u5F02\u5E38: ").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  296  683:aload_0         
	//  297  684:getfield        #19  <Field FMLog fmLog>
	//  298  687:aload_0         
	//  299  688:getfield        #29  <Field String logTag>
	//  300  691:new             #58  <Class StringBuilder>
	//  301  694:dup             
	//  302  695:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  303  697:invokestatic    #66  <Method String String.valueOf(Object)>
	//  304  700:invokespecial   #69  <Method void StringBuilder(String)>
	//  305  703:ldc1            #241 <String "\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u51FA\u73B0\u5F02\u5E38: ">
	//  306  705:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  307  708:aload_1         
	//  308  709:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  309  712:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  310  715:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  311  718:invokeinterface #216 <Method void FMLog.error(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7"))).append("\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  312  723:aload_0         
	//  313  724:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  314  727:new             #58  <Class StringBuilder>
	//  315  730:dup             
	//  316  731:ldc1            #204 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u8BA2\u5355\u7533\u8BF7">
	//  317  733:invokestatic    #66  <Method String String.valueOf(Object)>
	//  318  736:invokespecial   #69  <Method void StringBuilder(String)>
	//  319  739:ldc1            #243 <String "\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u5931\u8D25">
	//  320  741:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  321  744:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  322  747:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  323  750:iconst_0        
	//  324  751:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		return null;
	//  325  754:aconst_null     
	//  326  755:areturn         
	}

	public IdentifyingCode obtainIdentifyingCode(int i, String s)
		throws BusinessException
	{
		IdentifyingCode identifyingcode;
		Object obj;
		Object obj1;
		IMessage imessage;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          39
			fmLog.info(logTag, "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc1            #247 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F...">
	//   15   34:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(i < 0)
	//*  16   39:iload_1         
	//*  17   40:ifge            114
		{
			if(fmLog != null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #19  <Field FMLog fmLog>
	//*  20   47:ifnull          83
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u6CA1\u6709\u8F93\u5165\u83B7\u53D6\u9A8C\u8BC1\u7801\u7684\u7C7B\u578B").toString());
	//   21   50:aload_0         
	//   22   51:getfield        #19  <Field FMLog fmLog>
	//   23   54:aload_0         
	//   24   55:getfield        #29  <Field String logTag>
	//   25   58:new             #58  <Class StringBuilder>
	//   26   61:dup             
	//   27   62:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//   28   64:invokestatic    #66  <Method String String.valueOf(Object)>
	//   29   67:invokespecial   #69  <Method void StringBuilder(String)>
	//   30   70:ldc1            #251 <String "\uFF0C\u6CA1\u6709\u8F93\u5165\u83B7\u53D6\u9A8C\u8BC1\u7801\u7684\u7C7B\u578B">
	//   31   72:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   32   75:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   33   78:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u6CA1\u6709\u8F93\u5165\u83B7\u53D6\u9A8C\u8BC1\u7801\u7684\u7C7B\u578B").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   34   83:new             #46  <Class BusinessException>
	//   35   86:dup             
	//   36   87:new             #58  <Class StringBuilder>
	//   37   90:dup             
	//   38   91:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//   39   93:invokestatic    #66  <Method String String.valueOf(Object)>
	//   40   96:invokespecial   #69  <Method void StringBuilder(String)>
	//   41   99:ldc1            #251 <String "\uFF0C\u6CA1\u6709\u8F93\u5165\u83B7\u53D6\u9A8C\u8BC1\u7801\u7684\u7C7B\u578B">
	//   42  101:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   43  104:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   44  107:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   45  110:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   46  113:athrow          
		}
		if(cardBusinessBasic == null)
	//*  47  114:aload_0         
	//*  48  115:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  49  118:ifnonnull       192
		{
			if(fmLog != null)
	//*  50  121:aload_0         
	//*  51  122:getfield        #19  <Field FMLog fmLog>
	//*  52  125:ifnull          161
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   53  128:aload_0         
	//   54  129:getfield        #19  <Field FMLog fmLog>
	//   55  132:aload_0         
	//   56  133:getfield        #29  <Field String logTag>
	//   57  136:new             #58  <Class StringBuilder>
	//   58  139:dup             
	//   59  140:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//   60  142:invokestatic    #66  <Method String String.valueOf(Object)>
	//   61  145:invokespecial   #69  <Method void StringBuilder(String)>
	//   62  148:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   63  150:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   64  153:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   65  156:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   66  161:new             #46  <Class BusinessException>
	//   67  164:dup             
	//   68  165:new             #58  <Class StringBuilder>
	//   69  168:dup             
	//   70  169:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//   71  171:invokestatic    #66  <Method String String.valueOf(Object)>
	//   72  174:invokespecial   #69  <Method void StringBuilder(String)>
	//   73  177:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   74  179:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   75  182:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   76  185:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   77  188:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   78  191:athrow          
		}
		obj = ((Object) (cardBusinessBasic.getMessageHandler()));
	//   79  192:aload_0         
	//   80  193:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   81  196:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   82  199:astore          4
		if(obj == null)
	//*  83  201:aload           4
	//*  84  203:ifnonnull       277
		{
			if(fmLog != null)
	//*  85  206:aload_0         
	//*  86  207:getfield        #19  <Field FMLog fmLog>
	//*  87  210:ifnull          246
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   88  213:aload_0         
	//   89  214:getfield        #19  <Field FMLog fmLog>
	//   90  217:aload_0         
	//   91  218:getfield        #29  <Field String logTag>
	//   92  221:new             #58  <Class StringBuilder>
	//   93  224:dup             
	//   94  225:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//   95  227:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  230:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  233:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   98  235:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  238:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  241:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  246:new             #46  <Class BusinessException>
	//  102  249:dup             
	//  103  250:new             #58  <Class StringBuilder>
	//  104  253:dup             
	//  105  254:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  106  256:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  259:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  262:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//  109  264:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  267:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  270:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  273:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  276:athrow          
		}
		obj1 = ((Object) (cardBusinessBasic.getServer4Business(1061)));
	//  114  277:aload_0         
	//  115  278:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  116  281:sipush          1061
	//  117  284:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  118  287:astore          5
		if(obj1 == null)
	//* 119  289:aload           5
	//* 120  291:ifnonnull       365
		{
			if(fmLog != null)
	//* 121  294:aload_0         
	//* 122  295:getfield        #19  <Field FMLog fmLog>
	//* 123  298:ifnull          334
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  124  301:aload_0         
	//  125  302:getfield        #19  <Field FMLog fmLog>
	//  126  305:aload_0         
	//  127  306:getfield        #29  <Field String logTag>
	//  128  309:new             #58  <Class StringBuilder>
	//  129  312:dup             
	//  130  313:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  131  315:invokestatic    #66  <Method String String.valueOf(Object)>
	//  132  318:invokespecial   #69  <Method void StringBuilder(String)>
	//  133  321:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  134  323:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  135  326:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  136  329:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  137  334:new             #46  <Class BusinessException>
	//  138  337:dup             
	//  139  338:new             #58  <Class StringBuilder>
	//  140  341:dup             
	//  141  342:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  142  344:invokestatic    #66  <Method String String.valueOf(Object)>
	//  143  347:invokespecial   #69  <Method void StringBuilder(String)>
	//  144  350:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  145  352:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  146  355:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  147  358:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  148  361:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  149  364:athrow          
		}
		cardBusinessBasic.businessReady("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F", ((String) (obj1)));
	//  150  365:aload_0         
	//  151  366:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  152  369:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  153  371:aload           5
	//  154  373:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		identifyingcode = null;
	//  155  376:aconst_null     
	//  156  377:astore_3        
		imessage = ((IMessageHandler) (obj)).createMessage(1061);
	//  157  378:aload           4
	//  158  380:sipush          1061
	//  159  383:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  160  388:astore          6
		if(s == null)
			break MISSING_BLOCK_LABEL_423;
	//  161  390:aload_2         
	//  162  391:ifnull          423
		ITag itag = ((IMessageHandler) (obj)).createTag((byte)5);
	//  163  394:aload           4
	//  164  396:iconst_5        
	//  165  397:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  166  402:astore          7
		itag.addValue(s);
	//  167  404:aload           7
	//  168  406:aload_2         
	//  169  407:invokeinterface #254 <Method int ITag.addValue(String)>
	//  170  412:pop             
		imessage.addTag(itag);
	//  171  413:aload           6
	//  172  415:aload           7
	//  173  417:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  174  422:pop             
		s = ((String) (((IMessageHandler) (obj)).createTag((byte)11)));
	//  175  423:aload           4
	//  176  425:bipush          11
	//  177  427:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  178  432:astore_2        
		((ITag) (s)).addValue(i);
	//  179  433:aload_2         
	//  180  434:iload_1         
	//  181  435:invokeinterface #257 <Method int ITag.addValue(int)>
	//  182  440:pop             
		imessage.addTag(((ITag) (s)));
	//  183  441:aload           6
	//  184  443:aload_2         
	//  185  444:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  186  449:pop             
		s = ((String) (imessage.toBytes()));
	//  187  450:aload           6
	//  188  452:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  189  457:astore_2        
		break MISSING_BLOCK_LABEL_542;
	//  190  458:goto            542
		s;
	//  191  461:astore_2        
		if(fmLog != null)
	//* 192  462:aload_0         
	//* 193  463:getfield        #19  <Field FMLog fmLog>
	//* 194  466:ifnull          509
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  195  469:aload_0         
	//  196  470:getfield        #19  <Field FMLog fmLog>
	//  197  473:aload_0         
	//  198  474:getfield        #29  <Field String logTag>
	//  199  477:new             #58  <Class StringBuilder>
	//  200  480:dup             
	//  201  481:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  202  483:invokestatic    #66  <Method String String.valueOf(Object)>
	//  203  486:invokespecial   #69  <Method void StringBuilder(String)>
	//  204  489:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  205  491:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  206  494:aload_2         
	//  207  495:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  208  498:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  209  501:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  210  504:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  211  509:aload_0         
	//  212  510:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  213  513:new             #58  <Class StringBuilder>
	//  214  516:dup             
	//  215  517:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  216  519:invokestatic    #66  <Method String String.valueOf(Object)>
	//  217  522:invokespecial   #69  <Method void StringBuilder(String)>
	//  218  525:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  219  527:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  220  530:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  221  533:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  222  536:iconst_0        
	//  223  537:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		s = ((String) (identifyingcode));
	//  224  540:aload_3         
	//  225  541:astore_2        
		s = ((String) (cardBusinessBasic.interaction(((byte []) (s)), "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F", false, ((String) (obj1)))));
	//  226  542:aload_0         
	//  227  543:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  228  546:aload_2         
	//  229  547:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  230  549:iconst_0        
	//  231  550:aload           5
	//  232  552:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  233  555:astore_2        
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, Arrays.copyOf(((byte []) (s)), 2)))
	//* 234  556:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 235  559:aload_2         
	//* 236  560:iconst_2        
	//* 237  561:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//* 238  564:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 239  567:ifne            657
		{
			if(fmLog != null)
	//* 240  570:aload_0         
	//* 241  571:getfield        #19  <Field FMLog fmLog>
	//* 242  574:ifnull          618
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(((byte []) (s)))).toString());
	//  243  577:aload_0         
	//  244  578:getfield        #19  <Field FMLog fmLog>
	//  245  581:aload_0         
	//  246  582:getfield        #29  <Field String logTag>
	//  247  585:new             #58  <Class StringBuilder>
	//  248  588:dup             
	//  249  589:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  250  591:invokestatic    #66  <Method String String.valueOf(Object)>
	//  251  594:invokespecial   #69  <Method void StringBuilder(String)>
	//  252  597:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  253  600:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  254  603:aload_2         
	//  255  604:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  256  607:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  257  610:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  258  613:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(Arrays.copyOf(((byte []) (s)), 2))), true);
	//  259  618:aload_0         
	//  260  619:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  261  622:new             #58  <Class StringBuilder>
	//  262  625:dup             
	//  263  626:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  264  628:invokestatic    #66  <Method String String.valueOf(Object)>
	//  265  631:invokespecial   #69  <Method void StringBuilder(String)>
	//  266  634:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  267  636:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  268  639:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  269  642:aload_2         
	//  270  643:iconst_2        
	//  271  644:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//  272  647:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  273  650:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  274  653:iconst_1        
	//  275  654:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		identifyingcode = new IdentifyingCode();
	//  276  657:new             #265 <Class IdentifyingCode>
	//  277  660:dup             
	//  278  661:invokespecial   #266 <Method void IdentifyingCode()>
	//  279  664:astore_3        
		obj = ((Object) (((IMessageHandler) (obj)).createMessage(1061, Arrays.copyOfRange(((byte []) (s)), 2, s.length))));
	//  280  665:aload           4
	//  281  667:sipush          1061
	//  282  670:aload_2         
	//  283  671:iconst_2        
	//  284  672:aload_2         
	//  285  673:arraylength     
	//  286  674:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  287  677:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  288  682:astore          4
		obj1 = ((Object) (((IMessage) (obj)).getTag4Id(12)));
	//  289  684:aload           4
	//  290  686:bipush          12
	//  291  688:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  292  693:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_711;
	//  293  695:aload           5
	//  294  697:ifnull          711
		identifyingcode.setCode(((ITag) (obj1)).getStringVal());
	//  295  700:aload_3         
	//  296  701:aload           5
	//  297  703:invokeinterface #269 <Method String ITag.getStringVal()>
	//  298  708:invokevirtual   #272 <Method void IdentifyingCode.setCode(String)>
		obj = ((Object) (((IMessage) (obj)).getTag4Id(64)));
	//  299  711:aload           4
	//  300  713:bipush          64
	//  301  715:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  302  720:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_822;
	//  303  722:aload           4
	//  304  724:ifnull          822
		identifyingcode.setSerial(((ITag) (obj)).getTagValue());
	//  305  727:aload_3         
	//  306  728:aload           4
	//  307  730:invokeinterface #275 <Method byte[] ITag.getTagValue()>
	//  308  735:invokevirtual   #279 <Method void IdentifyingCode.setSerial(byte[])>
		return identifyingcode;
	//  309  738:aload_3         
	//  310  739:areturn         
		FMCommunicationMessageException fmcommunicationmessageexception;
		fmcommunicationmessageexception;
	//  311  740:astore          4
		if(fmLog != null)
	//* 312  742:aload_0         
	//* 313  743:getfield        #19  <Field FMLog fmLog>
	//* 314  746:ifnull          790
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(((byte []) (s)))).toString());
	//  315  749:aload_0         
	//  316  750:getfield        #19  <Field FMLog fmLog>
	//  317  753:aload_0         
	//  318  754:getfield        #29  <Field String logTag>
	//  319  757:new             #58  <Class StringBuilder>
	//  320  760:dup             
	//  321  761:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  322  763:invokestatic    #66  <Method String String.valueOf(Object)>
	//  323  766:invokespecial   #69  <Method void StringBuilder(String)>
	//  324  769:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  325  772:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  326  775:aload_2         
	//  327  776:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  328  779:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  329  782:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  330  785:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  331  790:aload_0         
	//  332  791:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  333  794:new             #58  <Class StringBuilder>
	//  334  797:dup             
	//  335  798:ldc1            #249 <String "\u83B7\u53D6\u9A8C\u8BC1\u7801\u4FE1\u606F">
	//  336  800:invokestatic    #66  <Method String String.valueOf(Object)>
	//  337  803:invokespecial   #69  <Method void StringBuilder(String)>
	//  338  806:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  339  809:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  340  812:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  341  815:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  342  818:iconst_0        
	//  343  819:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		return identifyingcode;
	//  344  822:aload_3         
	//  345  823:areturn         
	}

	public ElectronicAndActivity queryActivity(int i, int j)
		throws BusinessException
	{
		byte abyte0[];
		IMessage imessage;
		String s;
		Object obj;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #290 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		obj = ((Object) (cardBusinessBasic.getMessageHandler()));
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          9
		if(obj == null)
	//*  52  129:aload           9
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		if(i < 0)
	//*  83  207:iload_1         
	//*  84  208:ifge            286
		{
			if(fmLog != null)
	//*  85  211:aload_0         
	//*  86  212:getfield        #19  <Field FMLog fmLog>
	//*  87  215:ifnull          253
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u7C7B\u578B\u4E0D\u5408\u6CD5").toString());
	//   88  218:aload_0         
	//   89  219:getfield        #19  <Field FMLog fmLog>
	//   90  222:aload_0         
	//   91  223:getfield        #29  <Field String logTag>
	//   92  226:new             #58  <Class StringBuilder>
	//   93  229:dup             
	//   94  230:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//   95  233:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  236:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  239:ldc2            #294 <String "\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u7C7B\u578B\u4E0D\u5408\u6CD5">
	//   98  242:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  245:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  248:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u7C7B\u578B\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  253:new             #46  <Class BusinessException>
	//  102  256:dup             
	//  103  257:new             #58  <Class StringBuilder>
	//  104  260:dup             
	//  105  261:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  106  264:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  267:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  270:ldc2            #294 <String "\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u7C7B\u578B\u4E0D\u5408\u6CD5">
	//  109  273:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  276:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  279:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  282:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  285:athrow          
		}
		if(j < 0)
	//* 114  286:iload_2         
	//* 115  287:ifge            365
		{
			if(fmLog != null)
	//* 116  290:aload_0         
	//* 117  291:getfield        #19  <Field FMLog fmLog>
	//* 118  294:ifnull          332
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u65F6\u5E8F\u4E0D\u5408\u6CD5").toString());
	//  119  297:aload_0         
	//  120  298:getfield        #19  <Field FMLog fmLog>
	//  121  301:aload_0         
	//  122  302:getfield        #29  <Field String logTag>
	//  123  305:new             #58  <Class StringBuilder>
	//  124  308:dup             
	//  125  309:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  126  312:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  315:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  318:ldc2            #296 <String "\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u65F6\u5E8F\u4E0D\u5408\u6CD5">
	//  129  321:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  324:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  327:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u65F6\u5E8F\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  332:new             #46  <Class BusinessException>
	//  133  335:dup             
	//  134  336:new             #58  <Class StringBuilder>
	//  135  339:dup             
	//  136  340:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  137  343:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  346:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  349:ldc2            #296 <String "\uFF0C\u4F20\u5165\u7684\u64CD\u4F5C\u65F6\u5E8F\u4E0D\u5408\u6CD5">
	//  140  352:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  355:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  358:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  361:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  364:athrow          
		}
		s = cardBusinessBasic.getServer4Business(1181);
	//  145  365:aload_0         
	//  146  366:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  147  369:sipush          1181
	//  148  372:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  149  375:astore          7
		if(s == null)
	//* 150  377:aload           7
	//* 151  379:ifnonnull       455
		{
			if(fmLog != null)
	//* 152  382:aload_0         
	//* 153  383:getfield        #19  <Field FMLog fmLog>
	//* 154  386:ifnull          423
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  155  389:aload_0         
	//  156  390:getfield        #19  <Field FMLog fmLog>
	//  157  393:aload_0         
	//  158  394:getfield        #29  <Field String logTag>
	//  159  397:new             #58  <Class StringBuilder>
	//  160  400:dup             
	//  161  401:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  162  404:invokestatic    #66  <Method String String.valueOf(Object)>
	//  163  407:invokespecial   #69  <Method void StringBuilder(String)>
	//  164  410:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  165  412:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  166  415:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  167  418:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  168  423:new             #46  <Class BusinessException>
	//  169  426:dup             
	//  170  427:new             #58  <Class StringBuilder>
	//  171  430:dup             
	//  172  431:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  173  434:invokestatic    #66  <Method String String.valueOf(Object)>
	//  174  437:invokespecial   #69  <Method void StringBuilder(String)>
	//  175  440:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  176  442:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  177  445:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  178  448:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  179  451:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  180  454:athrow          
		}
		cardBusinessBasic.businessReady("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2", s);
	//  181  455:aload_0         
	//  182  456:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  183  459:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  184  462:aload           7
	//  185  464:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		abyte0 = null;
	//  186  467:aconst_null     
	//  187  468:astore          5
		imessage = ((IMessageHandler) (obj)).createMessage(1181);
	//  188  470:aload           9
	//  189  472:sipush          1181
	//  190  475:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  191  480:astore          6
		byte abyte1[];
		ITag itag1 = ((IMessageHandler) (obj)).createTag((byte)58);
	//  192  482:aload           9
	//  193  484:bipush          58
	//  194  486:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  195  491:astore          8
		itag1.addValue(i);
	//  196  493:aload           8
	//  197  495:iload_1         
	//  198  496:invokeinterface #257 <Method int ITag.addValue(int)>
	//  199  501:pop             
		imessage.addTag(itag1);
	//  200  502:aload           6
	//  201  504:aload           8
	//  202  506:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  203  511:pop             
		itag1 = ((IMessageHandler) (obj)).createTag((byte)98);
	//  204  512:aload           9
	//  205  514:bipush          98
	//  206  516:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  207  521:astore          8
		itag1.addValue(j);
	//  208  523:aload           8
	//  209  525:iload_2         
	//  210  526:invokeinterface #257 <Method int ITag.addValue(int)>
	//  211  531:pop             
		imessage.addTag(itag1);
	//  212  532:aload           6
	//  213  534:aload           8
	//  214  536:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  215  541:pop             
		abyte1 = imessage.toBytes();
	//  216  542:aload           6
	//  217  544:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  218  549:astore          6
		abyte0 = abyte1;
	//  219  551:aload           6
	//  220  553:astore          5
		break MISSING_BLOCK_LABEL_641;
	//  221  555:goto            641
		FMCommunicationMessageException fmcommunicationmessageexception1;
		fmcommunicationmessageexception1;
	//  222  558:astore          6
		if(fmLog != null)
	//* 223  560:aload_0         
	//* 224  561:getfield        #19  <Field FMLog fmLog>
	//* 225  564:ifnull          609
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (fmcommunicationmessageexception1)))).toString());
	//  226  567:aload_0         
	//  227  568:getfield        #19  <Field FMLog fmLog>
	//  228  571:aload_0         
	//  229  572:getfield        #29  <Field String logTag>
	//  230  575:new             #58  <Class StringBuilder>
	//  231  578:dup             
	//  232  579:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  233  582:invokestatic    #66  <Method String String.valueOf(Object)>
	//  234  585:invokespecial   #69  <Method void StringBuilder(String)>
	//  235  588:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  236  590:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  237  593:aload           6
	//  238  595:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  239  598:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  240  601:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  241  604:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  242  609:aload_0         
	//  243  610:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  244  613:new             #58  <Class StringBuilder>
	//  245  616:dup             
	//  246  617:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  247  620:invokestatic    #66  <Method String String.valueOf(Object)>
	//  248  623:invokespecial   #69  <Method void StringBuilder(String)>
	//  249  626:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  250  628:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  251  631:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  252  634:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  253  637:iconst_0        
	//  254  638:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		byte abyte2[];
		ElectronicAndActivity electronicandactivity;
		abyte2 = cardBusinessBasic.interaction(abyte0, "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2", false, s);
	//  255  641:aload_0         
	//  256  642:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  257  645:aload           5
	//  258  647:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  259  650:iconst_0        
	//  260  651:aload           7
	//  261  653:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  262  656:astore          7
		abyte0 = Arrays.copyOf(abyte2, 2);
	//  263  658:aload           7
	//  264  660:iconst_2        
	//  265  661:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//  266  664:astore          5
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte0))
	//* 267  666:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 268  669:aload           5
	//* 269  671:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 270  674:ifne            764
		{
			if(fmLog != null)
	//* 271  677:aload_0         
	//* 272  678:getfield        #19  <Field FMLog fmLog>
	//* 273  681:ifnull          727
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(abyte2)).toString());
	//  274  684:aload_0         
	//  275  685:getfield        #19  <Field FMLog fmLog>
	//  276  688:aload_0         
	//  277  689:getfield        #29  <Field String logTag>
	//  278  692:new             #58  <Class StringBuilder>
	//  279  695:dup             
	//  280  696:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  281  699:invokestatic    #66  <Method String String.valueOf(Object)>
	//  282  702:invokespecial   #69  <Method void StringBuilder(String)>
	//  283  705:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  284  708:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  285  711:aload           7
	//  286  713:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  287  716:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  288  719:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  289  722:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte0)), true);
	//  290  727:aload_0         
	//  291  728:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  292  731:new             #58  <Class StringBuilder>
	//  293  734:dup             
	//  294  735:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  295  738:invokestatic    #66  <Method String String.valueOf(Object)>
	//  296  741:invokespecial   #69  <Method void StringBuilder(String)>
	//  297  744:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  298  746:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  299  749:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  300  752:aload           5
	//  301  754:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  302  757:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  303  760:iconst_1        
	//  304  761:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		electronicandactivity = new ElectronicAndActivity();
	//  305  764:new             #298 <Class ElectronicAndActivity>
	//  306  767:dup             
	//  307  768:invokespecial   #299 <Method void ElectronicAndActivity()>
	//  308  771:astore          8
		ITag itag;
		obj = ((Object) (((IMessageHandler) (obj)).createMessage(1181, Arrays.copyOfRange(abyte2, 2, abyte2.length))));
	//  309  773:aload           9
	//  310  775:sipush          1181
	//  311  778:aload           7
	//  312  780:iconst_2        
	//  313  781:aload           7
	//  314  783:arraylength     
	//  315  784:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  316  787:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  317  792:astore          9
		itag = ((IMessage) (obj)).getTag4Id(-113);
	//  318  794:aload           9
	//  319  796:bipush          -113
	//  320  798:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  321  803:astore          5
		if(itag == null) goto _L2; else goto _L1
	//  322  805:aload           5
	//  323  807:ifnull          941
_L1:
		int k;
		ITag aitag1[];
		aitag1 = itag.getItemTags();
	//  324  810:aload           5
	//  325  812:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//  326  817:astore          10
		k = aitag1.length;
	//  327  819:aload           10
	//  328  821:arraylength     
	//  329  822:istore_3        
		i = 0;
	//  330  823:iconst_0        
	//  331  824:istore_1        
		  goto _L3
	//* 332  825:goto            1205
_L20:
		itag = aitag1[i];
	//  333  828:aload           10
	//  334  830:iload_1         
	//  335  831:aaload          
	//  336  832:astore          5
		if(itag == null) goto _L5; else goto _L4
	//  337  834:aload           5
	//  338  836:ifnull          1201
_L4:
		ITag aitag2[] = itag.getItemTags();
	//  339  839:aload           5
	//  340  841:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//  341  846:astore          11
		itag = null;
	//  342  848:aconst_null     
	//  343  849:astore          5
		fmcommunicationmessageexception1 = null;
	//  344  851:aconst_null     
	//  345  852:astore          6
		int l = aitag2.length;
	//  346  854:aload           11
	//  347  856:arraylength     
	//  348  857:istore          4
		j = 0;
	//  349  859:iconst_0        
	//  350  860:istore_2        
		  goto _L6
	//* 351  861:goto            1195
_L19:
		ITag itag3 = aitag2[j];
	//  352  864:aload           11
	//  353  866:iload_2         
	//  354  867:aaload          
	//  355  868:astore          12
		itag3.getId();
	//  356  870:aload           12
	//  357  872:invokeinterface #307 <Method byte ITag.getId()>
		JVM INSTR lookupswitch 2: default 1192
	//	               -114: 904
	//	               28: 916;
	//  358  877:lookupswitch    2: default 1192
	//	               -114: 904
	//	               28: 916
		   goto _L7 _L8 _L9
_L7:
		break; /* Loop/switch isn't completed */
_L8:
		itag = ((ITag) (itag3.getBytesVal()));
	//  359  904:aload           12
	//  360  906:invokeinterface #310 <Method byte[] ITag.getBytesVal()>
	//  361  911:astore          5
		break; /* Loop/switch isn't completed */
	//  362  913:goto            925
_L9:
		fmcommunicationmessageexception1 = ((FMCommunicationMessageException) (itag3.getBytesVal()));
	//  363  916:aload           12
	//  364  918:invokeinterface #310 <Method byte[] ITag.getBytesVal()>
	//  365  923:astore          6
		electronicandactivity.addUrl(((byte []) (fmcommunicationmessageexception1)), ((byte []) (itag)));
	//  366  925:aload           8
	//  367  927:aload           6
	//  368  929:aload           5
	//  369  931:invokevirtual   #314 <Method void ElectronicAndActivity.addUrl(byte[], byte[])>
		j++;
	//  370  934:iload_2         
	//  371  935:iconst_1        
	//  372  936:iadd            
	//  373  937:istore_2        
		continue; /* Loop/switch isn't completed */
	//  374  938:goto            1195
_L2:
		itag = ((IMessage) (obj)).getTag4Id(51);
	//  375  941:aload           9
	//  376  943:bipush          51
	//  377  945:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  378  950:astore          5
		if(itag == null)
			break MISSING_BLOCK_LABEL_1189;
	//  379  952:aload           5
	//  380  954:ifnull          1189
		ITag aitag[];
		aitag = itag.getItemTags();
	//  381  957:aload           5
	//  382  959:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//  383  964:astore          9
		k = aitag.length;
	//  384  966:aload           9
	//  385  968:arraylength     
	//  386  969:istore_3        
		i = 0;
	//  387  970:iconst_0        
	//  388  971:istore_1        
		  goto _L10
	//* 389  972:goto            1096
_L18:
		itag = aitag[i];
	//  390  975:aload           9
	//  391  977:iload_1         
	//  392  978:aaload          
	//  393  979:astore          5
		if(itag == null)
			continue; /* Loop/switch isn't completed */
	//  394  981:aload           5
	//  395  983:ifnull          1092
		aitag1 = itag.getItemTags();
	//  396  986:aload           5
	//  397  988:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//  398  993:astore          10
		itag = null;
	//  399  995:aconst_null     
	//  400  996:astore          5
		fmcommunicationmessageexception1 = null;
	//  401  998:aconst_null     
	//  402  999:astore          6
		l = aitag1.length;
	//  403 1001:aload           10
	//  404 1003:arraylength     
	//  405 1004:istore          4
		j = 0;
	//  406 1006:iconst_0        
	//  407 1007:istore_2        
		  goto _L11
	//* 408 1008:goto            1086
_L16:
		ITag itag2 = aitag1[j];
	//  409 1011:aload           10
	//  410 1013:iload_2         
	//  411 1014:aaload          
	//  412 1015:astore          11
		itag2.getId();
	//  413 1017:aload           11
	//  414 1019:invokeinterface #307 <Method byte ITag.getId()>
		JVM INSTR lookupswitch 2: default 1213
	//	               71: 1064
	//	               113: 1052;
	//  415 1024:lookupswitch    2: default 1213
	//	               71: 1064
	//	               113: 1052
		   goto _L12 _L13 _L14
_L12:
		break; /* Loop/switch isn't completed */
_L14:
		itag = ((ITag) (itag2.getBytesVal()));
	//  416 1052:aload           11
	//  417 1054:invokeinterface #310 <Method byte[] ITag.getBytesVal()>
	//  418 1059:astore          5
		break; /* Loop/switch isn't completed */
	//  419 1061:goto            1073
_L13:
		fmcommunicationmessageexception1 = ((FMCommunicationMessageException) (itag2.getBytesVal()));
	//  420 1064:aload           11
	//  421 1066:invokeinterface #310 <Method byte[] ITag.getBytesVal()>
	//  422 1071:astore          6
		electronicandactivity.addActivity(((byte []) (itag)), ((byte []) (fmcommunicationmessageexception1)));
	//  423 1073:aload           8
	//  424 1075:aload           5
	//  425 1077:aload           6
	//  426 1079:invokevirtual   #317 <Method void ElectronicAndActivity.addActivity(byte[], byte[])>
		j++;
	//  427 1082:iload_2         
	//  428 1083:iconst_1        
	//  429 1084:iadd            
	//  430 1085:istore_2        
_L11:
		if(j < l) goto _L16; else goto _L15
	//  431 1086:iload_2         
	//  432 1087:iload           4
	//  433 1089:icmplt          1011
_L15:
		i++;
	//  434 1092:iload_1         
	//  435 1093:iconst_1        
	//  436 1094:iadd            
	//  437 1095:istore_1        
_L10:
		if(i < k) goto _L18; else goto _L17
	//  438 1096:iload_1         
	//  439 1097:iload_3         
	//  440 1098:icmplt          975
_L17:
		return electronicandactivity;
	//  441 1101:aload           8
	//  442 1103:areturn         
		FMCommunicationMessageException fmcommunicationmessageexception;
		fmcommunicationmessageexception;
	//  443 1104:astore          5
		if(fmLog != null)
	//* 444 1106:aload_0         
	//* 445 1107:getfield        #19  <Field FMLog fmLog>
	//* 446 1110:ifnull          1156
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(abyte2)).toString());
	//  447 1113:aload_0         
	//  448 1114:getfield        #19  <Field FMLog fmLog>
	//  449 1117:aload_0         
	//  450 1118:getfield        #29  <Field String logTag>
	//  451 1121:new             #58  <Class StringBuilder>
	//  452 1124:dup             
	//  453 1125:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  454 1128:invokestatic    #66  <Method String String.valueOf(Object)>
	//  455 1131:invokespecial   #69  <Method void StringBuilder(String)>
	//  456 1134:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  457 1137:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  458 1140:aload           7
	//  459 1142:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  460 1145:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  461 1148:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  462 1151:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  463 1156:aload_0         
	//  464 1157:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  465 1160:new             #58  <Class StringBuilder>
	//  466 1163:dup             
	//  467 1164:ldc2            #292 <String "\u6D3B\u52A8\uFF08\u7535\u5B50\u5238\uFF09\u4FE1\u606F\u67E5\u8BE2">
	//  468 1167:invokestatic    #66  <Method String String.valueOf(Object)>
	//  469 1170:invokespecial   #69  <Method void StringBuilder(String)>
	//  470 1173:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  471 1176:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  472 1179:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  473 1182:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  474 1185:iconst_0        
	//  475 1186:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		return electronicandactivity;
	//  476 1189:aload           8
	//  477 1191:areturn         
	//* 478 1192:goto            925
_L6:
		if(j < l) goto _L19; else goto _L5
	//  479 1195:iload_2         
	//  480 1196:iload           4
	//  481 1198:icmplt          864
_L5:
		i++;
	//  482 1201:iload_1         
	//  483 1202:iconst_1        
	//  484 1203:iadd            
	//  485 1204:istore_1        
_L3:
		if(i < k) goto _L20; else goto _L2
	//  486 1205:iload_1         
	//  487 1206:iload_3         
	//  488 1207:icmplt          828
	//* 489 1210:goto            941
	//* 490 1213:goto            1073
	}

	public ElectronicTakeUp queryElectronicTakeUp(byte abyte0[], byte abyte1[])
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #321 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		IMessageHandler imessagehandler = cardBusinessBasic.getMessageHandler();
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          4
		if(imessagehandler == null)
	//*  52  129:aload           4
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		if(abyte0 == null)
	//*  83  207:aload_1         
	//*  84  208:ifnonnull       284
		{
			if(fmLog != null)
	//*  85  211:aload_0         
	//*  86  212:getfield        #19  <Field FMLog fmLog>
	//*  87  215:ifnull          252
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString());
	//   88  218:aload_0         
	//   89  219:getfield        #19  <Field FMLog fmLog>
	//   90  222:aload_0         
	//   91  223:getfield        #29  <Field String logTag>
	//   92  226:new             #58  <Class StringBuilder>
	//   93  229:dup             
	//   94  230:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//   95  233:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  236:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  239:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//   98  241:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  244:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  247:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  252:new             #46  <Class BusinessException>
	//  102  255:dup             
	//  103  256:new             #58  <Class StringBuilder>
	//  104  259:dup             
	//  105  260:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  106  263:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  266:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  269:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//  109  271:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  274:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  277:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  280:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  283:athrow          
		}
		if(abyte1 == null)
	//* 114  284:aload_2         
	//* 115  285:ifnonnull       361
		{
			if(fmLog != null)
	//* 116  288:aload_0         
	//* 117  289:getfield        #19  <Field FMLog fmLog>
	//* 118  292:ifnull          329
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString());
	//  119  295:aload_0         
	//  120  296:getfield        #19  <Field FMLog fmLog>
	//  121  299:aload_0         
	//  122  300:getfield        #29  <Field String logTag>
	//  123  303:new             #58  <Class StringBuilder>
	//  124  306:dup             
	//  125  307:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  126  310:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  313:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  316:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  129  318:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  321:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  324:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  329:new             #46  <Class BusinessException>
	//  133  332:dup             
	//  134  333:new             #58  <Class StringBuilder>
	//  135  336:dup             
	//  136  337:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  137  340:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  343:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  346:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  140  348:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  351:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  354:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  357:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  360:athrow          
		}
		String s = cardBusinessBasic.getServer4Business(4631);
	//  145  361:aload_0         
	//  146  362:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  147  365:sipush          4631
	//  148  368:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  149  371:astore          5
		if(s == null)
	//* 150  373:aload           5
	//* 151  375:ifnonnull       451
		{
			if(fmLog != null)
	//* 152  378:aload_0         
	//* 153  379:getfield        #19  <Field FMLog fmLog>
	//* 154  382:ifnull          419
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  155  385:aload_0         
	//  156  386:getfield        #19  <Field FMLog fmLog>
	//  157  389:aload_0         
	//  158  390:getfield        #29  <Field String logTag>
	//  159  393:new             #58  <Class StringBuilder>
	//  160  396:dup             
	//  161  397:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  162  400:invokestatic    #66  <Method String String.valueOf(Object)>
	//  163  403:invokespecial   #69  <Method void StringBuilder(String)>
	//  164  406:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  165  408:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  166  411:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  167  414:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  168  419:new             #46  <Class BusinessException>
	//  169  422:dup             
	//  170  423:new             #58  <Class StringBuilder>
	//  171  426:dup             
	//  172  427:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  173  430:invokestatic    #66  <Method String String.valueOf(Object)>
	//  174  433:invokespecial   #69  <Method void StringBuilder(String)>
	//  175  436:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  176  438:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  177  441:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  178  444:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  179  447:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  180  450:athrow          
		}
		cardBusinessBasic.businessReady("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2", s);
	//  181  451:aload_0         
	//  182  452:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  183  455:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  184  458:aload           5
	//  185  460:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		Object obj = null;
	//  186  463:aconst_null     
	//  187  464:astore_3        
		IMessage imessage = imessagehandler.createMessage(4631);
	//  188  465:aload           4
	//  189  467:sipush          4631
	//  190  470:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  191  475:astore          6
		try
		{
			ITag itag = imessagehandler.createTag((byte)112);
	//  192  477:aload           4
	//  193  479:bipush          112
	//  194  481:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  195  486:astore          7
			itag.addValue(abyte0);
	//  196  488:aload           7
	//  197  490:aload_1         
	//  198  491:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  199  496:pop             
			imessage.addTag(itag);
	//  200  497:aload           6
	//  201  499:aload           7
	//  202  501:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  203  506:pop             
			abyte0 = ((byte []) (imessagehandler.createTag((byte)113)));
	//  204  507:aload           4
	//  205  509:bipush          113
	//  206  511:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  207  516:astore_1        
			((ITag) (abyte0)).addValue(abyte1);
	//  208  517:aload_1         
	//  209  518:aload_2         
	//  210  519:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  211  524:pop             
			imessage.addTag(((ITag) (abyte0)));
	//  212  525:aload           6
	//  213  527:aload_1         
	//  214  528:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  215  533:pop             
			abyte0 = imessage.toBytes();
	//  216  534:aload           6
	//  217  536:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  218  541:astore_1        
		}
	//* 219  542:goto            628
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 220  545:astore_1        
		{
			if(fmLog != null)
	//* 221  546:aload_0         
	//* 222  547:getfield        #19  <Field FMLog fmLog>
	//* 223  550:ifnull          594
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  224  553:aload_0         
	//  225  554:getfield        #19  <Field FMLog fmLog>
	//  226  557:aload_0         
	//  227  558:getfield        #29  <Field String logTag>
	//  228  561:new             #58  <Class StringBuilder>
	//  229  564:dup             
	//  230  565:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  231  568:invokestatic    #66  <Method String String.valueOf(Object)>
	//  232  571:invokespecial   #69  <Method void StringBuilder(String)>
	//  233  574:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  234  576:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  235  579:aload_1         
	//  236  580:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  237  583:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  238  586:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  239  589:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  240  594:aload_0         
	//  241  595:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  242  598:new             #58  <Class StringBuilder>
	//  243  601:dup             
	//  244  602:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  245  605:invokestatic    #66  <Method String String.valueOf(Object)>
	//  246  608:invokespecial   #69  <Method void StringBuilder(String)>
	//  247  611:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  248  613:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  249  616:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  250  619:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  251  622:iconst_0        
	//  252  623:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//  253  626:aload_3         
	//  254  627:astore_1        
		}
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2", false, s);
	//  255  628:aload_0         
	//  256  629:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  257  632:aload_1         
	//  258  633:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  259  636:iconst_0        
	//  260  637:aload           5
	//  261  639:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  262  642:astore_1        
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, Arrays.copyOf(abyte0, 2)))
	//* 263  643:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 264  646:aload_1         
	//* 265  647:iconst_2        
	//* 266  648:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//* 267  651:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 268  654:ifne            738
		{
			if(fmLog != null)
	//* 269  657:aload_0         
	//* 270  658:getfield        #19  <Field FMLog fmLog>
	//* 271  661:ifnull          706
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  272  664:aload_0         
	//  273  665:getfield        #19  <Field FMLog fmLog>
	//  274  668:aload_0         
	//  275  669:getfield        #29  <Field String logTag>
	//  276  672:new             #58  <Class StringBuilder>
	//  277  675:dup             
	//  278  676:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  279  679:invokestatic    #66  <Method String String.valueOf(Object)>
	//  280  682:invokespecial   #69  <Method void StringBuilder(String)>
	//  281  685:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  282  688:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  283  691:aload_1         
	//  284  692:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  285  695:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  286  698:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  287  701:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_platform_business_handle_fail, true);
	//  288  706:aload_0         
	//  289  707:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  290  710:new             #58  <Class StringBuilder>
	//  291  713:dup             
	//  292  714:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  293  717:invokestatic    #66  <Method String String.valueOf(Object)>
	//  294  720:invokespecial   #69  <Method void StringBuilder(String)>
	//  295  723:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  296  725:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  297  728:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  298  731:getstatic       #326 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_platform_business_handle_fail>
	//  299  734:iconst_1        
	//  300  735:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		try
		{
			abyte1 = ((byte []) (imessagehandler.createMessage(4631, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(107)));
	//  301  738:aload           4
	//  302  740:sipush          4631
	//  303  743:aload_1         
	//  304  744:iconst_2        
	//  305  745:aload_1         
	//  306  746:arraylength     
	//  307  747:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  308  750:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  309  755:bipush          107
	//  310  757:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  311  762:astore_2        
		}
	//* 312  763:aload_2         
	//* 313  764:ifnonnull       842
	//* 314  767:aload_0         
	//* 315  768:getfield        #19  <Field FMLog fmLog>
	//* 316  771:ifnull          809
	//* 317  774:aload_0         
	//* 318  775:getfield        #19  <Field FMLog fmLog>
	//* 319  778:aload_0         
	//* 320  779:getfield        #29  <Field String logTag>
	//* 321  782:new             #58  <Class StringBuilder>
	//* 322  785:dup             
	//* 323  786:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//* 324  789:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 325  792:invokespecial   #69  <Method void StringBuilder(String)>
	//* 326  795:ldc2            #328 <String "\u65F6,\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u6CA1\u6709\u5305\u542B\u7535\u5B50\u5238\u4FE1\u606F">
	//* 327  798:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 328  801:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 329  804:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 330  809:aload_0         
	//* 331  810:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//* 332  813:new             #58  <Class StringBuilder>
	//* 333  816:dup             
	//* 334  817:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//* 335  820:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 336  823:invokespecial   #69  <Method void StringBuilder(String)>
	//* 337  826:ldc2            #328 <String "\u65F6,\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u6CA1\u6709\u5305\u542B\u7535\u5B50\u5238\u4FE1\u606F">
	//* 338  829:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 339  832:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 340  835:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//* 341  838:iconst_0        
	//* 342  839:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
	//* 343  842:aload_2         
	//* 344  843:invokestatic    #333 <Method ElectronicTakeUp ElectronicTakeUp.fromTag(ITag)>
	//* 345  846:astore_2        
	//* 346  847:aload_2         
	//* 347  848:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte1[])
	//* 348  849:astore_2        
		{
			if(fmLog != null)
	//* 349  850:aload_0         
	//* 350  851:getfield        #19  <Field FMLog fmLog>
	//* 351  854:ifnull          899
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  352  857:aload_0         
	//  353  858:getfield        #19  <Field FMLog fmLog>
	//  354  861:aload_0         
	//  355  862:getfield        #29  <Field String logTag>
	//  356  865:new             #58  <Class StringBuilder>
	//  357  868:dup             
	//  358  869:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  359  872:invokestatic    #66  <Method String String.valueOf(Object)>
	//  360  875:invokespecial   #69  <Method void StringBuilder(String)>
	//  361  878:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  362  881:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  363  884:aload_1         
	//  364  885:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  365  888:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  366  891:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  367  894:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  368  899:aload_0         
	//  369  900:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  370  903:new             #58  <Class StringBuilder>
	//  371  906:dup             
	//  372  907:ldc2            #323 <String "\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2">
	//  373  910:invokestatic    #66  <Method String String.valueOf(Object)>
	//  374  913:invokespecial   #69  <Method void StringBuilder(String)>
	//  375  916:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  376  919:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  377  922:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  378  925:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  379  928:iconst_0        
	//  380  929:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return null;
	//  381  932:aconst_null     
	//  382  933:areturn         
		}
		if(abyte1 != null)
			break MISSING_BLOCK_LABEL_842;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u6CA1\u6709\u5305\u542B\u7535\u5B50\u5238\u4FE1\u606F").toString());
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u8BE6\u7EC6\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u6CA1\u6709\u5305\u542B\u7535\u5B50\u5238\u4FE1\u606F").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
		abyte1 = ((byte []) (ElectronicTakeUp.fromTag(((ITag) (abyte1)))));
		return ((ElectronicTakeUp) (abyte1));
	}

	public List queryElectronicTakeUps(byte abyte0[], byte byte0, int i)
		throws BusinessException
	{
		Object obj;
		Object obj1;
		Object obj2;
		IMessage imessage;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #290 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		obj1 = ((Object) (cardBusinessBasic.getMessageHandler()));
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          5
		if(obj1 == null)
	//*  52  129:aload           5
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		if(i < 0)
	//*  83  207:iload_3         
	//*  84  208:ifge            286
		{
			if(fmLog != null)
	//*  85  211:aload_0         
	//*  86  212:getfield        #19  <Field FMLog fmLog>
	//*  87  215:ifnull          253
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5").toString());
	//   88  218:aload_0         
	//   89  219:getfield        #19  <Field FMLog fmLog>
	//   90  222:aload_0         
	//   91  223:getfield        #29  <Field String logTag>
	//   92  226:new             #58  <Class StringBuilder>
	//   93  229:dup             
	//   94  230:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   95  233:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  236:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  239:ldc2            #339 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5">
	//   98  242:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  245:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  248:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  253:new             #46  <Class BusinessException>
	//  102  256:dup             
	//  103  257:new             #58  <Class StringBuilder>
	//  104  260:dup             
	//  105  261:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  106  264:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  267:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  270:ldc2            #339 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5">
	//  109  273:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  276:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  279:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  282:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  285:athrow          
		}
		if(byte0 < 0)
	//* 114  286:iload_2         
	//* 115  287:ifge            365
		{
			if(fmLog != null)
	//* 116  290:aload_0         
	//* 117  291:getfield        #19  <Field FMLog fmLog>
	//* 118  294:ifnull          332
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5").toString());
	//  119  297:aload_0         
	//  120  298:getfield        #19  <Field FMLog fmLog>
	//  121  301:aload_0         
	//  122  302:getfield        #29  <Field String logTag>
	//  123  305:new             #58  <Class StringBuilder>
	//  124  308:dup             
	//  125  309:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  126  312:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  315:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  318:ldc2            #341 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5">
	//  129  321:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  324:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  327:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  332:new             #46  <Class BusinessException>
	//  133  335:dup             
	//  134  336:new             #58  <Class StringBuilder>
	//  135  339:dup             
	//  136  340:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  137  343:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  346:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  349:ldc2            #341 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5">
	//  140  352:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  355:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  358:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  361:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  364:athrow          
		}
		obj2 = ((Object) (cardBusinessBasic.getServer4Business(4641)));
	//  145  365:aload_0         
	//  146  366:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  147  369:sipush          4641
	//  148  372:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  149  375:astore          6
		if(obj2 == null)
	//* 150  377:aload           6
	//* 151  379:ifnonnull       455
		{
			if(fmLog != null)
	//* 152  382:aload_0         
	//* 153  383:getfield        #19  <Field FMLog fmLog>
	//* 154  386:ifnull          423
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  155  389:aload_0         
	//  156  390:getfield        #19  <Field FMLog fmLog>
	//  157  393:aload_0         
	//  158  394:getfield        #29  <Field String logTag>
	//  159  397:new             #58  <Class StringBuilder>
	//  160  400:dup             
	//  161  401:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  162  404:invokestatic    #66  <Method String String.valueOf(Object)>
	//  163  407:invokespecial   #69  <Method void StringBuilder(String)>
	//  164  410:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  165  412:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  166  415:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  167  418:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  168  423:new             #46  <Class BusinessException>
	//  169  426:dup             
	//  170  427:new             #58  <Class StringBuilder>
	//  171  430:dup             
	//  172  431:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  173  434:invokestatic    #66  <Method String String.valueOf(Object)>
	//  174  437:invokespecial   #69  <Method void StringBuilder(String)>
	//  175  440:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  176  442:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  177  445:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  178  448:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  179  451:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  180  454:athrow          
		}
		cardBusinessBasic.businessReady("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2", ((String) (obj2)));
	//  181  455:aload_0         
	//  182  456:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  183  459:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  184  462:aload           6
	//  185  464:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		obj = null;
	//  186  467:aconst_null     
	//  187  468:astore          4
		imessage = ((IMessageHandler) (obj1)).createMessage(4641);
	//  188  470:aload           5
	//  189  472:sipush          4641
	//  190  475:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  191  480:astore          7
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_521;
	//  192  482:aload_1         
	//  193  483:ifnull          521
		if(abyte0.length > 0)
	//* 194  486:aload_1         
	//* 195  487:arraylength     
	//* 196  488:ifle            521
		{
			ITag itag = ((IMessageHandler) (obj1)).createTag((byte)113);
	//  197  491:aload           5
	//  198  493:bipush          113
	//  199  495:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  200  500:astore          8
			itag.addValue(abyte0);
	//  201  502:aload           8
	//  202  504:aload_1         
	//  203  505:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  204  510:pop             
			imessage.addTag(itag);
	//  205  511:aload           7
	//  206  513:aload           8
	//  207  515:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  208  520:pop             
		}
		abyte0 = ((byte []) (((IMessageHandler) (obj1)).createTag((byte)121)));
	//  209  521:aload           5
	//  210  523:bipush          121
	//  211  525:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  212  530:astore_1        
		((ITag) (abyte0)).addValue(((int) (byte0)));
	//  213  531:aload_1         
	//  214  532:iload_2         
	//  215  533:invokeinterface #257 <Method int ITag.addValue(int)>
	//  216  538:pop             
		imessage.addTag(((ITag) (abyte0)));
	//  217  539:aload           7
	//  218  541:aload_1         
	//  219  542:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  220  547:pop             
		abyte0 = ((byte []) (((IMessageHandler) (obj1)).createTag((byte)38)));
	//  221  548:aload           5
	//  222  550:bipush          38
	//  223  552:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  224  557:astore_1        
		((ITag) (abyte0)).addValue(i);
	//  225  558:aload_1         
	//  226  559:iload_3         
	//  227  560:invokeinterface #257 <Method int ITag.addValue(int)>
	//  228  565:pop             
		imessage.addTag(((ITag) (abyte0)));
	//  229  566:aload           7
	//  230  568:aload_1         
	//  231  569:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  232  574:pop             
		abyte0 = imessage.toBytes();
	//  233  575:aload           7
	//  234  577:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  235  582:astore_1        
		break MISSING_BLOCK_LABEL_670;
	//  236  583:goto            670
		abyte0;
	//  237  586:astore_1        
		if(fmLog != null)
	//* 238  587:aload_0         
	//* 239  588:getfield        #19  <Field FMLog fmLog>
	//* 240  591:ifnull          635
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  241  594:aload_0         
	//  242  595:getfield        #19  <Field FMLog fmLog>
	//  243  598:aload_0         
	//  244  599:getfield        #29  <Field String logTag>
	//  245  602:new             #58  <Class StringBuilder>
	//  246  605:dup             
	//  247  606:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  248  609:invokestatic    #66  <Method String String.valueOf(Object)>
	//  249  612:invokespecial   #69  <Method void StringBuilder(String)>
	//  250  615:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  251  617:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  252  620:aload_1         
	//  253  621:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  254  624:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  255  627:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  256  630:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  257  635:aload_0         
	//  258  636:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  259  639:new             #58  <Class StringBuilder>
	//  260  642:dup             
	//  261  643:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  262  646:invokestatic    #66  <Method String String.valueOf(Object)>
	//  263  649:invokespecial   #69  <Method void StringBuilder(String)>
	//  264  652:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  265  654:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  266  657:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  267  660:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  268  663:iconst_0        
	//  269  664:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		abyte0 = ((byte []) (obj));
	//  270  667:aload           4
	//  271  669:astore_1        
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2", false, ((String) (obj2)));
	//  272  670:aload_0         
	//  273  671:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  274  674:aload_1         
	//  275  675:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  276  678:iconst_0        
	//  277  679:aload           6
	//  278  681:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  279  684:astore_1        
		byte abyte1[] = Arrays.copyOf(abyte0, 2);
	//  280  685:aload_1         
	//  281  686:iconst_2        
	//  282  687:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//  283  690:astore          4
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte1))
	//* 284  692:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 285  695:aload           4
	//* 286  697:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 287  700:ifne            789
		{
			if(fmLog != null)
	//* 288  703:aload_0         
	//* 289  704:getfield        #19  <Field FMLog fmLog>
	//* 290  707:ifnull          752
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  291  710:aload_0         
	//  292  711:getfield        #19  <Field FMLog fmLog>
	//  293  714:aload_0         
	//  294  715:getfield        #29  <Field String logTag>
	//  295  718:new             #58  <Class StringBuilder>
	//  296  721:dup             
	//  297  722:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  298  725:invokestatic    #66  <Method String String.valueOf(Object)>
	//  299  728:invokespecial   #69  <Method void StringBuilder(String)>
	//  300  731:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  301  734:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  302  737:aload_1         
	//  303  738:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  304  741:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  305  744:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  306  747:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte1)), true);
	//  307  752:aload_0         
	//  308  753:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  309  756:new             #58  <Class StringBuilder>
	//  310  759:dup             
	//  311  760:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  312  763:invokestatic    #66  <Method String String.valueOf(Object)>
	//  313  766:invokespecial   #69  <Method void StringBuilder(String)>
	//  314  769:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  315  771:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  316  774:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  317  777:aload           4
	//  318  779:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  319  782:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  320  785:iconst_1        
	//  321  786:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		ArrayList arraylist = new ArrayList();
	//  322  789:new             #343 <Class ArrayList>
	//  323  792:dup             
	//  324  793:invokespecial   #344 <Method void ArrayList()>
	//  325  796:astore          4
		ITag aitag[];
		try
		{
			obj1 = ((Object) (((IMessageHandler) (obj1)).createMessage(4641, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(108)));
	//  326  798:aload           5
	//  327  800:sipush          4641
	//  328  803:aload_1         
	//  329  804:iconst_2        
	//  330  805:aload_1         
	//  331  806:arraylength     
	//  332  807:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  333  810:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  334  815:bipush          108
	//  335  817:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  336  822:astore          5
		}
	//* 337  824:aload           5
	//* 338  826:ifnonnull       874
	//* 339  829:aload_0         
	//* 340  830:getfield        #19  <Field FMLog fmLog>
	//* 341  833:ifnull          871
	//* 342  836:aload_0         
	//* 343  837:getfield        #19  <Field FMLog fmLog>
	//* 344  840:aload_0         
	//* 345  841:getfield        #29  <Field String logTag>
	//* 346  844:new             #58  <Class StringBuilder>
	//* 347  847:dup             
	//* 348  848:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//* 349  851:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 350  854:invokespecial   #69  <Method void StringBuilder(String)>
	//* 351  857:ldc2            #346 <String "\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F">
	//* 352  860:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 353  863:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 354  866:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 355  871:aload           4
	//* 356  873:areturn         
	//* 357  874:aload           5
	//* 358  876:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//* 359  881:astore          5
	//* 360  883:aload           5
	//* 361  885:ifnull          895
	//* 362  888:aload           5
	//* 363  890:arraylength     
	//* 364  891:iconst_1        
	//* 365  892:icmpge          940
	//* 366  895:aload_0         
	//* 367  896:getfield        #19  <Field FMLog fmLog>
	//* 368  899:ifnull          937
	//* 369  902:aload_0         
	//* 370  903:getfield        #19  <Field FMLog fmLog>
	//* 371  906:aload_0         
	//* 372  907:getfield        #29  <Field String logTag>
	//* 373  910:new             #58  <Class StringBuilder>
	//* 374  913:dup             
	//* 375  914:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//* 376  917:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 377  920:invokespecial   #69  <Method void StringBuilder(String)>
	//* 378  923:ldc2            #348 <String "\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A">
	//* 379  926:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 380  929:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 381  932:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 382  937:aload           4
	//* 383  939:areturn         
	//* 384  940:aload           5
	//* 385  942:arraylength     
	//* 386  943:istore_3        
	//* 387  944:iconst_0        
	//* 388  945:istore_2        
	//* 389  946:goto            986
	//* 390  949:aload           5
	//* 391  951:iload_2         
	//* 392  952:aaload          
	//* 393  953:astore          6
	//* 394  955:aload           6
	//* 395  957:ifnull          982
	//* 396  960:aload           6
	//* 397  962:invokestatic    #333 <Method ElectronicTakeUp ElectronicTakeUp.fromTag(ITag)>
	//* 398  965:astore          6
	//* 399  967:aload           6
	//* 400  969:ifnull          982
	//* 401  972:aload           4
	//* 402  974:aload           6
	//* 403  976:invokeinterface #354 <Method boolean List.add(Object)>
	//* 404  981:pop             
	//* 405  982:iload_2         
	//* 406  983:iconst_1        
	//* 407  984:iadd            
	//* 408  985:istore_2        
	//* 409  986:iload_2         
	//* 410  987:iload_3         
	//* 411  988:icmplt          949
	//* 412  991:aload           4
	//* 413  993:areturn         
		catch(FMCommunicationMessageException fmcommunicationmessageexception)
	//* 414  994:astore          5
		{
			if(fmLog != null)
	//* 415  996:aload_0         
	//* 416  997:getfield        #19  <Field FMLog fmLog>
	//* 417 1000:ifnull          1045
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  418 1003:aload_0         
	//  419 1004:getfield        #19  <Field FMLog fmLog>
	//  420 1007:aload_0         
	//  421 1008:getfield        #29  <Field String logTag>
	//  422 1011:new             #58  <Class StringBuilder>
	//  423 1014:dup             
	//  424 1015:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  425 1018:invokestatic    #66  <Method String String.valueOf(Object)>
	//  426 1021:invokespecial   #69  <Method void StringBuilder(String)>
	//  427 1024:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  428 1027:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  429 1030:aload_1         
	//  430 1031:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  431 1034:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  432 1037:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  433 1040:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  434 1045:aload_0         
	//  435 1046:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  436 1049:new             #58  <Class StringBuilder>
	//  437 1052:dup             
	//  438 1053:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  439 1056:invokestatic    #66  <Method String String.valueOf(Object)>
	//  440 1059:invokespecial   #69  <Method void StringBuilder(String)>
	//  441 1062:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  442 1065:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  443 1068:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  444 1071:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  445 1074:iconst_0        
	//  446 1075:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return ((List) (arraylist));
	//  447 1078:aload           4
	//  448 1080:areturn         
		}
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_874;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F").toString());
		return ((List) (arraylist));
		aitag = ((ITag) (obj1)).getItemTags();
		if(aitag == null)
			break MISSING_BLOCK_LABEL_895;
		if(aitag.length >= 1)
			break MISSING_BLOCK_LABEL_940;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A").toString());
		return ((List) (arraylist));
		i = aitag.length;
		byte0 = 0;
		  goto _L1
_L3:
		obj2 = ((Object) (aitag[byte0]));
		if(obj2 == null)
			continue; /* Loop/switch isn't completed */
		obj2 = ((Object) (ElectronicTakeUp.fromTag(((ITag) (obj2)))));
		if(obj2 == null)
			continue; /* Loop/switch isn't completed */
		((List) (arraylist)).add(obj2);
		byte0++;
_L1:
		if(byte0 < i) goto _L3; else goto _L2
_L2:
		return ((List) (arraylist));
	}

	public List queryElectronicTakeUpsVer2(byte abyte0[], byte abyte1[], int i, int j)
		throws BusinessException
	{
		Object obj;
		Object obj1;
		String s;
		IMessage imessage;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #290 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		obj1 = ((Object) (cardBusinessBasic.getMessageHandler()));
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          6
		if(obj1 == null)
	//*  52  129:aload           6
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		if(j < 0)
	//*  83  207:iload           4
	//*  84  209:ifge            287
		{
			if(fmLog != null)
	//*  85  212:aload_0         
	//*  86  213:getfield        #19  <Field FMLog fmLog>
	//*  87  216:ifnull          254
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5").toString());
	//   88  219:aload_0         
	//   89  220:getfield        #19  <Field FMLog fmLog>
	//   90  223:aload_0         
	//   91  224:getfield        #29  <Field String logTag>
	//   92  227:new             #58  <Class StringBuilder>
	//   93  230:dup             
	//   94  231:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//   95  234:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  237:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  240:ldc2            #339 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5">
	//   98  243:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  246:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  249:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  254:new             #46  <Class BusinessException>
	//  102  257:dup             
	//  103  258:new             #58  <Class StringBuilder>
	//  104  261:dup             
	//  105  262:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  106  265:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  268:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  271:ldc2            #339 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u67E5\u8BE2\u6761\u6570\u4E0D\u5408\u6CD5">
	//  109  274:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  277:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  280:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  283:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  286:athrow          
		}
		if(i < 0)
	//* 114  287:iload_3         
	//* 115  288:ifge            366
		{
			if(fmLog != null)
	//* 116  291:aload_0         
	//* 117  292:getfield        #19  <Field FMLog fmLog>
	//* 118  295:ifnull          333
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5").toString());
	//  119  298:aload_0         
	//  120  299:getfield        #19  <Field FMLog fmLog>
	//  121  302:aload_0         
	//  122  303:getfield        #29  <Field String logTag>
	//  123  306:new             #58  <Class StringBuilder>
	//  124  309:dup             
	//  125  310:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  126  313:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  316:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  319:ldc2            #341 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5">
	//  129  322:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  325:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  328:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  333:new             #46  <Class BusinessException>
	//  133  336:dup             
	//  134  337:new             #58  <Class StringBuilder>
	//  135  340:dup             
	//  136  341:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  137  344:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  347:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  350:ldc2            #341 <String "\uFF0C\u4F20\u5165\u7684\u7535\u5B50\u5238\u72B6\u6001\u4E0D\u5408\u6CD5">
	//  140  353:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  356:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  359:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  362:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  365:athrow          
		}
		s = cardBusinessBasic.getServer4Business(4642);
	//  145  366:aload_0         
	//  146  367:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  147  370:sipush          4642
	//  148  373:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  149  376:astore          7
		if(s == null)
	//* 150  378:aload           7
	//* 151  380:ifnonnull       456
		{
			if(fmLog != null)
	//* 152  383:aload_0         
	//* 153  384:getfield        #19  <Field FMLog fmLog>
	//* 154  387:ifnull          424
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  155  390:aload_0         
	//  156  391:getfield        #19  <Field FMLog fmLog>
	//  157  394:aload_0         
	//  158  395:getfield        #29  <Field String logTag>
	//  159  398:new             #58  <Class StringBuilder>
	//  160  401:dup             
	//  161  402:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  162  405:invokestatic    #66  <Method String String.valueOf(Object)>
	//  163  408:invokespecial   #69  <Method void StringBuilder(String)>
	//  164  411:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  165  413:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  166  416:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  167  419:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  168  424:new             #46  <Class BusinessException>
	//  169  427:dup             
	//  170  428:new             #58  <Class StringBuilder>
	//  171  431:dup             
	//  172  432:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  173  435:invokestatic    #66  <Method String String.valueOf(Object)>
	//  174  438:invokespecial   #69  <Method void StringBuilder(String)>
	//  175  441:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  176  443:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  177  446:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  178  449:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  179  452:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  180  455:athrow          
		}
		cardBusinessBasic.businessReady("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2", s);
	//  181  456:aload_0         
	//  182  457:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  183  460:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  184  463:aload           7
	//  185  465:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		obj = null;
	//  186  468:aconst_null     
	//  187  469:astore          5
		imessage = ((IMessageHandler) (obj1)).createMessage(4642);
	//  188  471:aload           6
	//  189  473:sipush          4642
	//  190  476:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  191  481:astore          8
		if(abyte1 == null)
			break MISSING_BLOCK_LABEL_522;
	//  192  483:aload_2         
	//  193  484:ifnull          522
		if(abyte1.length > 0)
	//* 194  487:aload_2         
	//* 195  488:arraylength     
	//* 196  489:ifle            522
		{
			ITag itag1 = ((IMessageHandler) (obj1)).createTag((byte)113);
	//  197  492:aload           6
	//  198  494:bipush          113
	//  199  496:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  200  501:astore          9
			itag1.addValue(abyte1);
	//  201  503:aload           9
	//  202  505:aload_2         
	//  203  506:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  204  511:pop             
			imessage.addTag(itag1);
	//  205  512:aload           8
	//  206  514:aload           9
	//  207  516:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  208  521:pop             
		}
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_558;
	//  209  522:aload_1         
	//  210  523:ifnull          558
		if(abyte0.length > 0)
	//* 211  526:aload_1         
	//* 212  527:arraylength     
	//* 213  528:ifle            558
		{
			abyte1 = ((byte []) (((IMessageHandler) (obj1)).createTag((byte)71)));
	//  214  531:aload           6
	//  215  533:bipush          71
	//  216  535:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  217  540:astore_2        
			((ITag) (abyte1)).addValue(abyte0);
	//  218  541:aload_2         
	//  219  542:aload_1         
	//  220  543:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  221  548:pop             
			imessage.addTag(((ITag) (abyte1)));
	//  222  549:aload           8
	//  223  551:aload_2         
	//  224  552:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  225  557:pop             
		}
		abyte0 = ((byte []) (((IMessageHandler) (obj1)).createTag((byte)121)));
	//  226  558:aload           6
	//  227  560:bipush          121
	//  228  562:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  229  567:astore_1        
		((ITag) (abyte0)).addValue(i);
	//  230  568:aload_1         
	//  231  569:iload_3         
	//  232  570:invokeinterface #257 <Method int ITag.addValue(int)>
	//  233  575:pop             
		imessage.addTag(((ITag) (abyte0)));
	//  234  576:aload           8
	//  235  578:aload_1         
	//  236  579:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  237  584:pop             
		abyte0 = ((byte []) (((IMessageHandler) (obj1)).createTag((byte)38)));
	//  238  585:aload           6
	//  239  587:bipush          38
	//  240  589:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  241  594:astore_1        
		((ITag) (abyte0)).addValue(j);
	//  242  595:aload_1         
	//  243  596:iload           4
	//  244  598:invokeinterface #257 <Method int ITag.addValue(int)>
	//  245  603:pop             
		imessage.addTag(((ITag) (abyte0)));
	//  246  604:aload           8
	//  247  606:aload_1         
	//  248  607:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  249  612:pop             
		abyte0 = imessage.toBytes();
	//  250  613:aload           8
	//  251  615:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  252  620:astore_1        
		break MISSING_BLOCK_LABEL_708;
	//  253  621:goto            708
		abyte0;
	//  254  624:astore_1        
		if(fmLog != null)
	//* 255  625:aload_0         
	//* 256  626:getfield        #19  <Field FMLog fmLog>
	//* 257  629:ifnull          673
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  258  632:aload_0         
	//  259  633:getfield        #19  <Field FMLog fmLog>
	//  260  636:aload_0         
	//  261  637:getfield        #29  <Field String logTag>
	//  262  640:new             #58  <Class StringBuilder>
	//  263  643:dup             
	//  264  644:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  265  647:invokestatic    #66  <Method String String.valueOf(Object)>
	//  266  650:invokespecial   #69  <Method void StringBuilder(String)>
	//  267  653:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  268  655:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  269  658:aload_1         
	//  270  659:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  271  662:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  272  665:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  273  668:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  274  673:aload_0         
	//  275  674:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  276  677:new             #58  <Class StringBuilder>
	//  277  680:dup             
	//  278  681:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  279  684:invokestatic    #66  <Method String String.valueOf(Object)>
	//  280  687:invokespecial   #69  <Method void StringBuilder(String)>
	//  281  690:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  282  692:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  283  695:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  284  698:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  285  701:iconst_0        
	//  286  702:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		abyte0 = ((byte []) (obj));
	//  287  705:aload           5
	//  288  707:astore_1        
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2", false, s);
	//  289  708:aload_0         
	//  290  709:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  291  712:aload_1         
	//  292  713:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  293  716:iconst_0        
	//  294  717:aload           7
	//  295  719:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  296  722:astore_1        
		abyte1 = Arrays.copyOf(abyte0, 2);
	//  297  723:aload_1         
	//  298  724:iconst_2        
	//  299  725:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//  300  728:astore_2        
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte1))
	//* 301  729:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 302  732:aload_2         
	//* 303  733:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 304  736:ifne            824
		{
			if(fmLog != null)
	//* 305  739:aload_0         
	//* 306  740:getfield        #19  <Field FMLog fmLog>
	//* 307  743:ifnull          788
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  308  746:aload_0         
	//  309  747:getfield        #19  <Field FMLog fmLog>
	//  310  750:aload_0         
	//  311  751:getfield        #29  <Field String logTag>
	//  312  754:new             #58  <Class StringBuilder>
	//  313  757:dup             
	//  314  758:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  315  761:invokestatic    #66  <Method String String.valueOf(Object)>
	//  316  764:invokespecial   #69  <Method void StringBuilder(String)>
	//  317  767:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  318  770:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  319  773:aload_1         
	//  320  774:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  321  777:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  322  780:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  323  783:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte1)), true);
	//  324  788:aload_0         
	//  325  789:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  326  792:new             #58  <Class StringBuilder>
	//  327  795:dup             
	//  328  796:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  329  799:invokestatic    #66  <Method String String.valueOf(Object)>
	//  330  802:invokespecial   #69  <Method void StringBuilder(String)>
	//  331  805:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  332  807:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  333  810:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  334  813:aload_2         
	//  335  814:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  336  817:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  337  820:iconst_1        
	//  338  821:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		abyte1 = ((byte []) (new ArrayList()));
	//  339  824:new             #343 <Class ArrayList>
	//  340  827:dup             
	//  341  828:invokespecial   #344 <Method void ArrayList()>
	//  342  831:astore_2        
		ITag itag;
		ITag aitag[];
		try
		{
			itag = ((IMessageHandler) (obj1)).createMessage(4642, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(108);
	//  343  832:aload           6
	//  344  834:sipush          4642
	//  345  837:aload_1         
	//  346  838:iconst_2        
	//  347  839:aload_1         
	//  348  840:arraylength     
	//  349  841:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  350  844:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  351  849:bipush          108
	//  352  851:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  353  856:astore          5
		}
	//* 354  858:aload           5
	//* 355  860:ifnonnull       907
	//* 356  863:aload_0         
	//* 357  864:getfield        #19  <Field FMLog fmLog>
	//* 358  867:ifnull          905
	//* 359  870:aload_0         
	//* 360  871:getfield        #19  <Field FMLog fmLog>
	//* 361  874:aload_0         
	//* 362  875:getfield        #29  <Field String logTag>
	//* 363  878:new             #58  <Class StringBuilder>
	//* 364  881:dup             
	//* 365  882:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//* 366  885:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 367  888:invokespecial   #69  <Method void StringBuilder(String)>
	//* 368  891:ldc2            #346 <String "\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F">
	//* 369  894:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 370  897:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 371  900:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 372  905:aload_2         
	//* 373  906:areturn         
	//* 374  907:aload           5
	//* 375  909:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//* 376  914:astore          5
	//* 377  916:aload           5
	//* 378  918:ifnull          928
	//* 379  921:aload           5
	//* 380  923:arraylength     
	//* 381  924:iconst_1        
	//* 382  925:icmpge          972
	//* 383  928:aload_0         
	//* 384  929:getfield        #19  <Field FMLog fmLog>
	//* 385  932:ifnull          970
	//* 386  935:aload_0         
	//* 387  936:getfield        #19  <Field FMLog fmLog>
	//* 388  939:aload_0         
	//* 389  940:getfield        #29  <Field String logTag>
	//* 390  943:new             #58  <Class StringBuilder>
	//* 391  946:dup             
	//* 392  947:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//* 393  950:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 394  953:invokespecial   #69  <Method void StringBuilder(String)>
	//* 395  956:ldc2            #348 <String "\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A">
	//* 396  959:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 397  962:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 398  965:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 399  970:aload_2         
	//* 400  971:areturn         
	//* 401  972:aload           5
	//* 402  974:arraylength     
	//* 403  975:istore          4
	//* 404  977:iconst_0        
	//* 405  978:istore_3        
	//* 406  979:goto            1018
	//* 407  982:aload           5
	//* 408  984:iload_3         
	//* 409  985:aaload          
	//* 410  986:astore          6
	//* 411  988:aload           6
	//* 412  990:ifnull          1014
	//* 413  993:aload           6
	//* 414  995:invokestatic    #333 <Method ElectronicTakeUp ElectronicTakeUp.fromTag(ITag)>
	//* 415  998:astore          6
	//* 416 1000:aload           6
	//* 417 1002:ifnull          1014
	//* 418 1005:aload_2         
	//* 419 1006:aload           6
	//* 420 1008:invokeinterface #354 <Method boolean List.add(Object)>
	//* 421 1013:pop             
	//* 422 1014:iload_3         
	//* 423 1015:iconst_1        
	//* 424 1016:iadd            
	//* 425 1017:istore_3        
	//* 426 1018:iload_3         
	//* 427 1019:iload           4
	//* 428 1021:icmplt          982
	//* 429 1024:aload_2         
	//* 430 1025:areturn         
		catch(FMCommunicationMessageException fmcommunicationmessageexception)
	//* 431 1026:astore          5
		{
			if(fmLog != null)
	//* 432 1028:aload_0         
	//* 433 1029:getfield        #19  <Field FMLog fmLog>
	//* 434 1032:ifnull          1077
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  435 1035:aload_0         
	//  436 1036:getfield        #19  <Field FMLog fmLog>
	//  437 1039:aload_0         
	//  438 1040:getfield        #29  <Field String logTag>
	//  439 1043:new             #58  <Class StringBuilder>
	//  440 1046:dup             
	//  441 1047:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  442 1050:invokestatic    #66  <Method String String.valueOf(Object)>
	//  443 1053:invokespecial   #69  <Method void StringBuilder(String)>
	//  444 1056:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  445 1059:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  446 1062:aload_1         
	//  447 1063:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  448 1066:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  449 1069:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  450 1072:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  451 1077:aload_0         
	//  452 1078:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  453 1081:new             #58  <Class StringBuilder>
	//  454 1084:dup             
	//  455 1085:ldc2            #337 <String "\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2">
	//  456 1088:invokestatic    #66  <Method String String.valueOf(Object)>
	//  457 1091:invokespecial   #69  <Method void StringBuilder(String)>
	//  458 1094:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  459 1097:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  460 1100:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  461 1103:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  462 1106:iconst_0        
	//  463 1107:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return ((List) (abyte1));
	//  464 1110:aload_2         
	//  465 1111:areturn         
		}
		if(itag != null)
			break MISSING_BLOCK_LABEL_907;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F").toString());
		return ((List) (abyte1));
		aitag = itag.getItemTags();
		if(aitag == null)
			break MISSING_BLOCK_LABEL_928;
		if(aitag.length >= 1)
			break MISSING_BLOCK_LABEL_972;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u5217\u8868\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A").toString());
		return ((List) (abyte1));
		j = aitag.length;
		i = 0;
		  goto _L1
_L3:
		obj1 = ((Object) (aitag[i]));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		obj1 = ((Object) (ElectronicTakeUp.fromTag(((ITag) (obj1)))));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		((List) (abyte1)).add(obj1);
		i++;
_L1:
		if(i < j) goto _L3; else goto _L2
_L2:
		return ((List) (abyte1));
	}

	public List queryPromotionMessage()
		throws BusinessException
	{
		byte abyte0[];
		IMessage imessage;
		Object obj;
		Object obj1;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #363 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		obj = ((Object) (cardBusinessBasic.getMessageHandler()));
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          5
		if(obj == null)
	//*  52  129:aload           5
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		obj1 = ((Object) (cardBusinessBasic.getServer4Business(4641)));
	//   83  207:aload_0         
	//   84  208:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   85  211:sipush          4641
	//   86  214:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//   87  217:astore          6
		if(obj1 == null)
	//*  88  219:aload           6
	//*  89  221:ifnonnull       297
		{
			if(fmLog != null)
	//*  90  224:aload_0         
	//*  91  225:getfield        #19  <Field FMLog fmLog>
	//*  92  228:ifnull          265
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//   93  231:aload_0         
	//   94  232:getfield        #19  <Field FMLog fmLog>
	//   95  235:aload_0         
	//   96  236:getfield        #29  <Field String logTag>
	//   97  239:new             #58  <Class StringBuilder>
	//   98  242:dup             
	//   99  243:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  100  246:invokestatic    #66  <Method String String.valueOf(Object)>
	//  101  249:invokespecial   #69  <Method void StringBuilder(String)>
	//  102  252:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  103  254:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  104  257:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  105  260:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  106  265:new             #46  <Class BusinessException>
	//  107  268:dup             
	//  108  269:new             #58  <Class StringBuilder>
	//  109  272:dup             
	//  110  273:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  111  276:invokestatic    #66  <Method String String.valueOf(Object)>
	//  112  279:invokespecial   #69  <Method void StringBuilder(String)>
	//  113  282:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  114  284:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  115  287:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  116  290:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  117  293:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  118  296:athrow          
		}
		cardBusinessBasic.businessReady("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2", ((String) (obj1)));
	//  119  297:aload_0         
	//  120  298:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  121  301:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  122  304:aload           6
	//  123  306:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		abyte0 = null;
	//  124  309:aconst_null     
	//  125  310:astore_3        
		imessage = ((IMessageHandler) (obj)).createMessage(1191);
	//  126  311:aload           5
	//  127  313:sipush          1191
	//  128  316:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  129  321:astore          4
		byte abyte1[] = imessage.toBytes();
	//  130  323:aload           4
	//  131  325:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  132  330:astore          4
		abyte0 = abyte1;
	//  133  332:aload           4
	//  134  334:astore_3        
		break MISSING_BLOCK_LABEL_421;
	//  135  335:goto            421
		FMCommunicationMessageException fmcommunicationmessageexception;
		fmcommunicationmessageexception;
	//  136  338:astore          4
		if(fmLog != null)
	//* 137  340:aload_0         
	//* 138  341:getfield        #19  <Field FMLog fmLog>
	//* 139  344:ifnull          389
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (fmcommunicationmessageexception)))).toString());
	//  140  347:aload_0         
	//  141  348:getfield        #19  <Field FMLog fmLog>
	//  142  351:aload_0         
	//  143  352:getfield        #29  <Field String logTag>
	//  144  355:new             #58  <Class StringBuilder>
	//  145  358:dup             
	//  146  359:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  147  362:invokestatic    #66  <Method String String.valueOf(Object)>
	//  148  365:invokespecial   #69  <Method void StringBuilder(String)>
	//  149  368:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  150  370:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  151  373:aload           4
	//  152  375:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  153  378:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  154  381:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  155  384:invokeinterface #81  <Method void FMLog.warn(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  156  389:aload_0         
	//  157  390:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  158  393:new             #58  <Class StringBuilder>
	//  159  396:dup             
	//  160  397:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  161  400:invokestatic    #66  <Method String String.valueOf(Object)>
	//  162  403:invokespecial   #69  <Method void StringBuilder(String)>
	//  163  406:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  164  408:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  165  411:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  166  414:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  167  417:iconst_0        
	//  168  418:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2", false, ((String) (obj1)));
	//  169  421:aload_0         
	//  170  422:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  171  425:aload_3         
	//  172  426:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  173  429:iconst_0        
	//  174  430:aload           6
	//  175  432:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  176  435:astore_3        
		byte abyte2[] = Arrays.copyOf(abyte0, 2);
	//  177  436:aload_3         
	//  178  437:iconst_2        
	//  179  438:invokestatic    #261 <Method byte[] Arrays.copyOf(byte[], int)>
	//  180  441:astore          4
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte2))
	//* 181  443:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 182  446:aload           4
	//* 183  448:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 184  451:ifne            540
		{
			if(fmLog != null)
	//* 185  454:aload_0         
	//* 186  455:getfield        #19  <Field FMLog fmLog>
	//* 187  458:ifnull          503
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  188  461:aload_0         
	//  189  462:getfield        #19  <Field FMLog fmLog>
	//  190  465:aload_0         
	//  191  466:getfield        #29  <Field String logTag>
	//  192  469:new             #58  <Class StringBuilder>
	//  193  472:dup             
	//  194  473:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  195  476:invokestatic    #66  <Method String String.valueOf(Object)>
	//  196  479:invokespecial   #69  <Method void StringBuilder(String)>
	//  197  482:ldc2            #263 <String "\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u9519\u8BEF\u54CD\u5E94\u7801: ">
	//  198  485:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  199  488:aload_3         
	//  200  489:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  201  492:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  202  495:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  203  498:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte2)), true);
	//  204  503:aload_0         
	//  205  504:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  206  507:new             #58  <Class StringBuilder>
	//  207  510:dup             
	//  208  511:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  209  514:invokestatic    #66  <Method String String.valueOf(Object)>
	//  210  517:invokespecial   #69  <Method void StringBuilder(String)>
	//  211  520:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  212  522:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  213  525:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  214  528:aload           4
	//  215  530:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  216  533:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  217  536:iconst_1        
	//  218  537:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		ArrayList arraylist = new ArrayList();
	//  219  540:new             #343 <Class ArrayList>
	//  220  543:dup             
	//  221  544:invokespecial   #344 <Method void ArrayList()>
	//  222  547:astore          4
		int i;
		int j;
		ITag aitag[];
		try
		{
			obj = ((Object) (((IMessageHandler) (obj)).createMessage(1191, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(-57)));
	//  223  549:aload           5
	//  224  551:sipush          1191
	//  225  554:aload_3         
	//  226  555:iconst_2        
	//  227  556:aload_3         
	//  228  557:arraylength     
	//  229  558:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  230  561:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  231  566:bipush          -57
	//  232  568:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  233  573:astore          5
		}
	//* 234  575:aload           5
	//* 235  577:ifnonnull       625
	//* 236  580:aload_0         
	//* 237  581:getfield        #19  <Field FMLog fmLog>
	//* 238  584:ifnull          622
	//* 239  587:aload_0         
	//* 240  588:getfield        #19  <Field FMLog fmLog>
	//* 241  591:aload_0         
	//* 242  592:getfield        #29  <Field String logTag>
	//* 243  595:new             #58  <Class StringBuilder>
	//* 244  598:dup             
	//* 245  599:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//* 246  602:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 247  605:invokespecial   #69  <Method void StringBuilder(String)>
	//* 248  608:ldc2            #367 <String "\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7528\u6237\u4FC3\u9500\u4FE1\u606F">
	//* 249  611:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 250  614:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 251  617:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 252  622:aload           4
	//* 253  624:areturn         
	//* 254  625:aload           5
	//* 255  627:invokeinterface #303 <Method ITag[] ITag.getItemTags()>
	//* 256  632:astore          5
	//* 257  634:aload           5
	//* 258  636:ifnull          646
	//* 259  639:aload           5
	//* 260  641:arraylength     
	//* 261  642:iconst_1        
	//* 262  643:icmpge          691
	//* 263  646:aload_0         
	//* 264  647:getfield        #19  <Field FMLog fmLog>
	//* 265  650:ifnull          688
	//* 266  653:aload_0         
	//* 267  654:getfield        #19  <Field FMLog fmLog>
	//* 268  657:aload_0         
	//* 269  658:getfield        #29  <Field String logTag>
	//* 270  661:new             #58  <Class StringBuilder>
	//* 271  664:dup             
	//* 272  665:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//* 273  668:invokestatic    #66  <Method String String.valueOf(Object)>
	//* 274  671:invokespecial   #69  <Method void StringBuilder(String)>
	//* 275  674:ldc2            #348 <String "\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A">
	//* 276  677:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 277  680:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 278  683:invokeinterface #81  <Method void FMLog.warn(String, String)>
	//* 279  688:aload           4
	//* 280  690:areturn         
	//* 281  691:aload           5
	//* 282  693:arraylength     
	//* 283  694:istore_2        
	//* 284  695:iconst_0        
	//* 285  696:istore_1        
	//* 286  697:goto            737
	//* 287  700:aload           5
	//* 288  702:iload_1         
	//* 289  703:aaload          
	//* 290  704:astore          6
	//* 291  706:aload           6
	//* 292  708:ifnull          733
	//* 293  711:aload           6
	//* 294  713:invokestatic    #372 <Method PromotionMessage PromotionMessage.fromTag(ITag)>
	//* 295  716:astore          6
	//* 296  718:aload           6
	//* 297  720:ifnull          733
	//* 298  723:aload           4
	//* 299  725:aload           6
	//* 300  727:invokeinterface #354 <Method boolean List.add(Object)>
	//* 301  732:pop             
	//* 302  733:iload_1         
	//* 303  734:iconst_1        
	//* 304  735:iadd            
	//* 305  736:istore_1        
	//* 306  737:iload_1         
	//* 307  738:iload_2         
	//* 308  739:icmplt          700
	//* 309  742:aload           4
	//* 310  744:areturn         
		catch(FMCommunicationMessageException fmcommunicationmessageexception1)
	//* 311  745:astore          5
		{
			if(fmLog != null)
	//* 312  747:aload_0         
	//* 313  748:getfield        #19  <Field FMLog fmLog>
	//* 314  751:ifnull          796
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  315  754:aload_0         
	//  316  755:getfield        #19  <Field FMLog fmLog>
	//  317  758:aload_0         
	//  318  759:getfield        #29  <Field String logTag>
	//  319  762:new             #58  <Class StringBuilder>
	//  320  765:dup             
	//  321  766:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  322  769:invokestatic    #66  <Method String String.valueOf(Object)>
	//  323  772:invokespecial   #69  <Method void StringBuilder(String)>
	//  324  775:ldc2            #281 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5F02\u5E38\uFF1A">
	//  325  778:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  326  781:aload_3         
	//  327  782:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  328  785:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  329  788:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  330  791:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_command_data_invaild, false);
	//  331  796:aload_0         
	//  332  797:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  333  800:new             #58  <Class StringBuilder>
	//  334  803:dup             
	//  335  804:ldc2            #365 <String "\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2">
	//  336  807:invokestatic    #66  <Method String String.valueOf(Object)>
	//  337  810:invokespecial   #69  <Method void StringBuilder(String)>
	//  338  813:ldc2            #283 <String "\u65F6,\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u5931\u8D25">
	//  339  816:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  340  819:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  341  822:getstatic       #286 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_command_data_invaild>
	//  342  825:iconst_0        
	//  343  826:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return ((List) (arraylist));
	//  344  829:aload           4
	//  345  831:areturn         
		}
		if(obj != null)
			break MISSING_BLOCK_LABEL_625;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6\uFF0C\u5E73\u53F0\u6CA1\u6709\u7528\u6237\u4FC3\u9500\u4FE1\u606F").toString());
		return ((List) (arraylist));
		aitag = ((ITag) (obj)).getItemTags();
		if(aitag == null)
			break MISSING_BLOCK_LABEL_646;
		if(aitag.length >= 1)
			break MISSING_BLOCK_LABEL_691;
		if(fmLog != null)
			fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7528\u6237\u4FC3\u9500\u6D3B\u52A8\u4FE1\u606F\u67E5\u8BE2"))).append("\u65F6,\u5E73\u53F0\u6CA1\u6709\u7535\u5B50\u5238\u4FE1\u606F\u96C6\u5408\u4FE1\u606F\u4E3A\u7A7A").toString());
		return ((List) (arraylist));
		j = aitag.length;
		i = 0;
		  goto _L1
_L3:
		obj1 = ((Object) (aitag[i]));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		obj1 = ((Object) (PromotionMessage.fromTag(((ITag) (obj1)))));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		((List) (arraylist)).add(obj1);
		i++;
_L1:
		if(i < j) goto _L3; else goto _L2
_L2:
		return ((List) (arraylist));
	}

	public MainOrder useElectronicTakeUp(byte abyte0[], byte abyte1[], byte abyte2[], EnumCardIoType enumcardiotype)
		throws BusinessException
	{
		IMessageHandler imessagehandler;
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #37  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #41  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.info(logTag, "\u7535\u5B50\u5238\u4F7F\u7528...");
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field String logTag>
	//   14   32:ldc2            #377 <String "\u7535\u5B50\u5238\u4F7F\u7528...">
	//   15   35:invokeinterface #56  <Method void FMLog.info(String, String)>
		if(cardBusinessBasic == null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//*  18   44:ifnonnull       120
		{
			if(fmLog != null)
	//*  19   47:aload_0         
	//*  20   48:getfield        #19  <Field FMLog fmLog>
	//*  21   51:ifnull          88
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A").toString());
	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field FMLog fmLog>
	//   24   58:aload_0         
	//   25   59:getfield        #29  <Field String logTag>
	//   26   62:new             #58  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//   29   69:invokestatic    #66  <Method String String.valueOf(Object)>
	//   30   72:invokespecial   #69  <Method void StringBuilder(String)>
	//   31   75:ldc1            #71  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5BF9\u8C61\u4E3A\u7A7A">
	//   32   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   83:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_business_init_fail);
	//   35   88:new             #46  <Class BusinessException>
	//   36   91:dup             
	//   37   92:new             #58  <Class StringBuilder>
	//   38   95:dup             
	//   39   96:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//   40   99:invokestatic    #66  <Method String String.valueOf(Object)>
	//   41  102:invokespecial   #69  <Method void StringBuilder(String)>
	//   42  105:ldc1            #83  <String "\uFF0C\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   43  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45  113:getstatic       #89  <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_business_init_fail>
	//   46  116:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   47  119:athrow          
		}
		imessagehandler = cardBusinessBasic.getMessageHandler();
	//   48  120:aload_0         
	//   49  121:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//   50  124:invokevirtual   #98  <Method IMessageHandler CardBusinessBasic.getMessageHandler()>
	//   51  127:astore          7
		if(imessagehandler == null)
	//*  52  129:aload           7
	//*  53  131:ifnonnull       207
		{
			if(fmLog != null)
	//*  54  134:aload_0         
	//*  55  135:getfield        #19  <Field FMLog fmLog>
	//*  56  138:ifnull          175
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString());
	//   57  141:aload_0         
	//   58  142:getfield        #19  <Field FMLog fmLog>
	//   59  145:aload_0         
	//   60  146:getfield        #29  <Field String logTag>
	//   61  149:new             #58  <Class StringBuilder>
	//   62  152:dup             
	//   63  153:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//   64  156:invokestatic    #66  <Method String String.valueOf(Object)>
	//   65  159:invokespecial   #69  <Method void StringBuilder(String)>
	//   66  162:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   67  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  167:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   69  170:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//   70  175:new             #46  <Class BusinessException>
	//   71  178:dup             
	//   72  179:new             #58  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//   75  186:invokestatic    #66  <Method String String.valueOf(Object)>
	//   76  189:invokespecial   #69  <Method void StringBuilder(String)>
	//   77  192:ldc1            #100 <String "\uFF0C\u6D88\u606F\u5904\u7406\u5668\u4E3A\u7A7A">
	//   78  194:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   79  197:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   80  200:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//   81  203:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   82  206:athrow          
		}
		if(abyte0 == null)
	//*  83  207:aload_1         
	//*  84  208:ifnonnull       284
		{
			if(fmLog != null)
	//*  85  211:aload_0         
	//*  86  212:getfield        #19  <Field FMLog fmLog>
	//*  87  215:ifnull          252
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString());
	//   88  218:aload_0         
	//   89  219:getfield        #19  <Field FMLog fmLog>
	//   90  222:aload_0         
	//   91  223:getfield        #29  <Field String logTag>
	//   92  226:new             #58  <Class StringBuilder>
	//   93  229:dup             
	//   94  230:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//   95  233:invokestatic    #66  <Method String String.valueOf(Object)>
	//   96  236:invokespecial   #69  <Method void StringBuilder(String)>
	//   97  239:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//   98  241:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   99  244:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  100  247:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  101  252:new             #46  <Class BusinessException>
	//  102  255:dup             
	//  103  256:new             #58  <Class StringBuilder>
	//  104  259:dup             
	//  105  260:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  106  263:invokestatic    #66  <Method String String.valueOf(Object)>
	//  107  266:invokespecial   #69  <Method void StringBuilder(String)>
	//  108  269:ldc1            #105 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u6807\u8BC6">
	//  109  271:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  110  274:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  277:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  112  280:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  283:athrow          
		}
		if(abyte1 == null)
	//* 114  284:aload_2         
	//* 115  285:ifnonnull       361
		{
			if(fmLog != null)
	//* 116  288:aload_0         
	//* 117  289:getfield        #19  <Field FMLog fmLog>
	//* 118  292:ifnull          329
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString());
	//  119  295:aload_0         
	//  120  296:getfield        #19  <Field FMLog fmLog>
	//  121  299:aload_0         
	//  122  300:getfield        #29  <Field String logTag>
	//  123  303:new             #58  <Class StringBuilder>
	//  124  306:dup             
	//  125  307:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  126  310:invokestatic    #66  <Method String String.valueOf(Object)>
	//  127  313:invokespecial   #69  <Method void StringBuilder(String)>
	//  128  316:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  129  318:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  321:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  131  324:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  132  329:new             #46  <Class BusinessException>
	//  133  332:dup             
	//  134  333:new             #58  <Class StringBuilder>
	//  135  336:dup             
	//  136  337:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  137  340:invokestatic    #66  <Method String String.valueOf(Object)>
	//  138  343:invokespecial   #69  <Method void StringBuilder(String)>
	//  139  346:ldc1            #107 <String "\uFF0C\u6CA1\u6709\u4F20\u5165\u7535\u5B50\u5238\u7C7B\u578B">
	//  140  348:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  141  351:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  142  354:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  143  357:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  144  360:athrow          
		}
		if(abyte2 == null || abyte2.length < 1)
	//* 145  361:aload_3         
	//* 146  362:ifnull          371
	//* 147  365:aload_3         
	//* 148  366:arraylength     
	//* 149  367:iconst_1        
	//* 150  368:icmpge          446
		{
			if(fmLog != null)
	//* 151  371:aload_0         
	//* 152  372:getfield        #19  <Field FMLog fmLog>
	//* 153  375:ifnull          413
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u4F20\u5165\u7684\u5361\u53F7\u65E0\u6548").toString());
	//  154  378:aload_0         
	//  155  379:getfield        #19  <Field FMLog fmLog>
	//  156  382:aload_0         
	//  157  383:getfield        #29  <Field String logTag>
	//  158  386:new             #58  <Class StringBuilder>
	//  159  389:dup             
	//  160  390:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  161  393:invokestatic    #66  <Method String String.valueOf(Object)>
	//  162  396:invokespecial   #69  <Method void StringBuilder(String)>
	//  163  399:ldc2            #381 <String "\uFF0C\u4F20\u5165\u7684\u5361\u53F7\u65E0\u6548">
	//  164  402:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  165  405:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  166  408:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\uFF0C\u4F20\u5165\u7684\u5361\u53F7\u65E0\u6548").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_load_config_fail);
	//  167  413:new             #46  <Class BusinessException>
	//  168  416:dup             
	//  169  417:new             #58  <Class StringBuilder>
	//  170  420:dup             
	//  171  421:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  172  424:invokestatic    #66  <Method String String.valueOf(Object)>
	//  173  427:invokespecial   #69  <Method void StringBuilder(String)>
	//  174  430:ldc2            #381 <String "\uFF0C\u4F20\u5165\u7684\u5361\u53F7\u65E0\u6548">
	//  175  433:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  176  436:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  177  439:getstatic       #103 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_load_config_fail>
	//  178  442:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  179  445:athrow          
		}
		String s = cardBusinessBasic.getServer4Business(4621);
	//  180  446:aload_0         
	//  181  447:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  182  450:sipush          4621
	//  183  453:invokevirtual   #111 <Method String CardBusinessBasic.getServer4Business(int)>
	//  184  456:astore          8
		if(s == null)
	//* 185  458:aload           8
	//* 186  460:ifnonnull       536
		{
			if(fmLog != null)
	//* 187  463:aload_0         
	//* 188  464:getfield        #19  <Field FMLog fmLog>
	//* 189  467:ifnull          504
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString());
	//  190  470:aload_0         
	//  191  471:getfield        #19  <Field FMLog fmLog>
	//  192  474:aload_0         
	//  193  475:getfield        #29  <Field String logTag>
	//  194  478:new             #58  <Class StringBuilder>
	//  195  481:dup             
	//  196  482:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  197  485:invokestatic    #66  <Method String String.valueOf(Object)>
	//  198  488:invokespecial   #69  <Method void StringBuilder(String)>
	//  199  491:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  200  493:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  201  496:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  202  499:invokeinterface #81  <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_query_server_fail);
	//  203  504:new             #46  <Class BusinessException>
	//  204  507:dup             
	//  205  508:new             #58  <Class StringBuilder>
	//  206  511:dup             
	//  207  512:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  208  515:invokestatic    #66  <Method String String.valueOf(Object)>
	//  209  518:invokespecial   #69  <Method void StringBuilder(String)>
	//  210  521:ldc1            #113 <String "\u65F6\uFF0C\u83B7\u53D6\u5904\u7406\u7684\u5E73\u53F0\u5931\u8D25">
	//  211  523:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  212  526:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  213  529:getstatic       #116 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_query_server_fail>
	//  214  532:invokespecial   #92  <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  215  535:athrow          
		}
		cardBusinessBasic.businessReady("\u7535\u5B50\u5238\u4F7F\u7528", s);
	//  216  536:aload_0         
	//  217  537:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  218  540:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  219  543:aload           8
	//  220  545:invokevirtual   #119 <Method void CardBusinessBasic.businessReady(String, String)>
		Object obj = null;
	//  221  548:aconst_null     
	//  222  549:astore          6
		IMessage imessage = imessagehandler.createMessage(4621);
	//  223  551:aload           7
	//  224  553:sipush          4621
	//  225  556:invokeinterface #125 <Method IMessage IMessageHandler.createMessage(int)>
	//  226  561:astore          9
		try
		{
			ITag itag = imessagehandler.createTag((byte)112);
	//  227  563:aload           7
	//  228  565:bipush          112
	//  229  567:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  230  572:astore          10
			itag.addValue(abyte0);
	//  231  574:aload           10
	//  232  576:aload_1         
	//  233  577:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  234  582:pop             
			imessage.addTag(itag);
	//  235  583:aload           9
	//  236  585:aload           10
	//  237  587:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  238  592:pop             
			abyte0 = ((byte []) (imessagehandler.createTag((byte)113)));
	//  239  593:aload           7
	//  240  595:bipush          113
	//  241  597:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  242  602:astore_1        
			((ITag) (abyte0)).addValue(abyte1);
	//  243  603:aload_1         
	//  244  604:aload_2         
	//  245  605:invokeinterface #135 <Method int ITag.addValue(byte[])>
	//  246  610:pop             
			imessage.addTag(((ITag) (abyte0)));
	//  247  611:aload           9
	//  248  613:aload_1         
	//  249  614:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  250  619:pop             
			abyte0 = ((byte []) (imessagehandler.createTag((byte)15)));
	//  251  620:aload           7
	//  252  622:bipush          15
	//  253  624:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  254  629:astore_1        
			((ITag) (abyte0)).addValue(FM_Bytes.bytesToHexString(abyte2));
	//  255  630:aload_1         
	//  256  631:aload_3         
	//  257  632:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  258  635:invokeinterface #254 <Method int ITag.addValue(String)>
	//  259  640:pop             
			imessage.addTag(((ITag) (abyte0)));
	//  260  641:aload           9
	//  261  643:aload_1         
	//  262  644:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  263  649:pop             
			abyte0 = ((byte []) (imessagehandler.createTag((byte)47)));
	//  264  650:aload           7
	//  265  652:bipush          47
	//  266  654:invokeinterface #129 <Method ITag IMessageHandler.createTag(byte)>
	//  267  659:astore_1        
			((ITag) (abyte0)).addValue(enumcardiotype.getId());
	//  268  660:aload_1         
	//  269  661:aload           4
	//  270  663:invokevirtual   #386 <Method int EnumCardIoType.getId()>
	//  271  666:invokeinterface #257 <Method int ITag.addValue(int)>
	//  272  671:pop             
			imessage.addTag(((ITag) (abyte0)));
	//  273  672:aload           9
	//  274  674:aload_1         
	//  275  675:invokeinterface #141 <Method int IMessage.addTag(ITag)>
	//  276  680:pop             
			abyte0 = imessage.toBytes();
	//  277  681:aload           9
	//  278  683:invokeinterface #145 <Method byte[] IMessage.toBytes()>
	//  279  688:astore_1        
		}
	//* 280  689:goto            776
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 281  692:astore_1        
		{
			if(fmLog != null)
	//* 282  693:aload_0         
	//* 283  694:getfield        #19  <Field FMLog fmLog>
	//* 284  697:ifnull          741
				fmLog.warn(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  285  700:aload_0         
	//  286  701:getfield        #19  <Field FMLog fmLog>
	//  287  704:aload_0         
	//  288  705:getfield        #29  <Field String logTag>
	//  289  708:new             #58  <Class StringBuilder>
	//  290  711:dup             
	//  291  712:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  292  715:invokestatic    #66  <Method String String.valueOf(Object)>
	//  293  718:invokespecial   #69  <Method void StringBuilder(String)>
	//  294  721:ldc1            #147 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  295  723:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  296  726:aload_1         
	//  297  727:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  298  730:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  299  733:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  300  736:invokeinterface #81  <Method void FMLog.warn(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  301  741:aload_0         
	//  302  742:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  303  745:new             #58  <Class StringBuilder>
	//  304  748:dup             
	//  305  749:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  306  752:invokestatic    #66  <Method String String.valueOf(Object)>
	//  307  755:invokespecial   #69  <Method void StringBuilder(String)>
	//  308  758:ldc1            #155 <String "\u65F6\uFF0C\u6784\u9020\u5E73\u53F0\u8BF7\u6C42\u6570\u636E\u51FA\u73B0\u5F02\u5E38">
	//  309  760:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  310  763:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  311  766:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  312  769:iconst_0        
	//  313  770:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//  314  773:aload           6
	//  315  775:astore_1        
		}
		abyte0 = cardBusinessBasic.interaction(abyte0, "\u7535\u5B50\u5238\u4F7F\u7528", false, s);
	//  316  776:aload_0         
	//  317  777:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  318  780:aload_1         
	//  319  781:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  320  784:iconst_0        
	//  321  785:aload           8
	//  322  787:invokevirtual   #166 <Method byte[] CardBusinessBasic.interaction(byte[], String, boolean, String)>
	//  323  790:astore_1        
		abyte1 = new byte[2];
	//  324  791:iconst_2        
	//  325  792:newarray        byte[]
	//  326  794:astore_2        
		int i = abyte1.length;
	//  327  795:aload_2         
	//  328  796:arraylength     
	//  329  797:istore          5
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, 2);
	//  330  799:aload_1         
	//  331  800:iconst_0        
	//  332  801:aload_2         
	//  333  802:iconst_0        
	//  334  803:iconst_2        
	//  335  804:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(!Arrays.equals(cn.com.fmsh.tsm.business.constants.Constants.RespCodeonse4Platform.SUCESS, abyte1))
	//* 336  807:getstatic       #178 <Field byte[] cn.com.fmsh.tsm.business.constants.Constants$RespCodeonse4Platform.SUCESS>
	//* 337  810:aload_2         
	//* 338  811:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//* 339  814:ifne            901
		{
			if(fmLog != null)
	//* 340  817:aload_0         
	//* 341  818:getfield        #19  <Field FMLog fmLog>
	//* 342  821:ifnull          865
				fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25: ").append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  343  824:aload_0         
	//  344  825:getfield        #19  <Field FMLog fmLog>
	//  345  828:aload_0         
	//  346  829:getfield        #29  <Field String logTag>
	//  347  832:new             #58  <Class StringBuilder>
	//  348  835:dup             
	//  349  836:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  350  839:invokestatic    #66  <Method String String.valueOf(Object)>
	//  351  842:invokespecial   #69  <Method void StringBuilder(String)>
	//  352  845:ldc1            #213 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25: ">
	//  353  847:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  354  850:aload_1         
	//  355  851:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  356  854:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  357  857:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  358  860:invokeinterface #216 <Method void FMLog.error(String, String)>
			cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.instance(FM_Bytes.bytesToHexString(abyte1)), false);
	//  359  865:aload_0         
	//  360  866:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  361  869:new             #58  <Class StringBuilder>
	//  362  872:dup             
	//  363  873:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  364  876:invokestatic    #66  <Method String String.valueOf(Object)>
	//  365  879:invokespecial   #69  <Method void StringBuilder(String)>
	//  366  882:ldc1            #218 <String "\u65F6\uFF0C\u5E73\u53F0\u5904\u7406\u5931\u8D25">
	//  367  884:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  368  887:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  369  890:aload_2         
	//  370  891:invokestatic    #192 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  371  894:invokestatic    #222 <Method cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.instance(String)>
	//  372  897:iconst_0        
	//  373  898:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		abyte0 = ((byte []) (imessagehandler.createMessage(4621, Arrays.copyOfRange(abyte0, 2, abyte0.length)).getTag4Id(96)));
	//  374  901:aload           7
	//  375  903:sipush          4621
	//  376  906:aload_1         
	//  377  907:iconst_2        
	//  378  908:aload_1         
	//  379  909:arraylength     
	//  380  910:invokestatic    #226 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  381  913:invokeinterface #229 <Method IMessage IMessageHandler.createMessage(int, byte[])>
	//  382  918:bipush          96
	//  383  920:invokeinterface #233 <Method ITag IMessage.getTag4Id(int)>
	//  384  925:astore_1        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_1018;
	//  385  926:aload_1         
	//  386  927:ifnull          1018
		abyte0 = ((byte []) (MainOrder.fromTag(((ITag) (abyte0)))));
	//  387  930:aload_1         
	//  388  931:invokestatic    #239 <Method MainOrder MainOrder.fromTag(ITag)>
	//  389  934:astore_1        
		return ((MainOrder) (abyte0));
	//  390  935:aload_1         
	//  391  936:areturn         
		abyte0;
	//  392  937:astore_1        
		if(fmLog != null)
	//* 393  938:aload_0         
	//* 394  939:getfield        #19  <Field FMLog fmLog>
	//* 395  942:ifnull          986
			fmLog.error(logTag, (new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u51FA\u73B0\u5F02\u5E38: ").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  396  945:aload_0         
	//  397  946:getfield        #19  <Field FMLog fmLog>
	//  398  949:aload_0         
	//  399  950:getfield        #29  <Field String logTag>
	//  400  953:new             #58  <Class StringBuilder>
	//  401  956:dup             
	//  402  957:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  403  960:invokestatic    #66  <Method String String.valueOf(Object)>
	//  404  963:invokespecial   #69  <Method void StringBuilder(String)>
	//  405  966:ldc1            #241 <String "\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u51FA\u73B0\u5F02\u5E38: ">
	//  406  968:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  407  971:aload_1         
	//  408  972:invokestatic    #153 <Method String Util4Java.getExceptionInfo(Exception)>
	//  409  975:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  410  978:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  411  981:invokeinterface #216 <Method void FMLog.error(String, String)>
		cardBusinessBasic.throwExceptionAndClose((new StringBuilder(String.valueOf("\u7535\u5B50\u5238\u4F7F\u7528"))).append("\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_message_message_handle_exception, false);
	//  412  986:aload_0         
	//  413  987:getfield        #31  <Field CardBusinessBasic cardBusinessBasic>
	//  414  990:new             #58  <Class StringBuilder>
	//  415  993:dup             
	//  416  994:ldc2            #379 <String "\u7535\u5B50\u5238\u4F7F\u7528">
	//  417  997:invokestatic    #66  <Method String String.valueOf(Object)>
	//  418 1000:invokespecial   #69  <Method void StringBuilder(String)>
	//  419 1003:ldc1            #243 <String "\u65F6\uFF0C\u89E3\u6790\u5E73\u53F0\u54CD\u5E94\u5931\u8D25">
	//  420 1005:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  421 1008:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  422 1011:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_message_message_handle_exception>
	//  423 1014:iconst_0        
	//  424 1015:invokevirtual   #162 <Method void CardBusinessBasic.throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		return null;
	//  425 1018:aconst_null     
	//  426 1019:areturn         
	}

	private CardBusinessBasic cardBusinessBasic;
	FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/core/CardAppTradeImpl)).getName();
}
