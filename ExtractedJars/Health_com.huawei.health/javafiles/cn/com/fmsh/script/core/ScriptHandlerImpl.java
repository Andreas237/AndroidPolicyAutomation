// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.core;

import cn.com.fmsh.script.*;
import cn.com.fmsh.script.bean.*;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

// Referenced classes of package cn.com.fmsh.script.core:
//			ApduFilter, FilterPolicy

public class ScriptHandlerImpl
	implements ScriptHandler
{

	public ScriptHandlerImpl(ApduHandler apduhandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #27  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #31  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #33  <Field FMLog fmLog>
		logTag = ((Class) (cn/com/fmsh/script/core/ScriptHandlerImpl)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class ScriptHandlerImpl>
	//    8   17:invokevirtual   #39  <Method String Class.getName()>
	//    9   20:putfield        #41  <Field String logTag>
		apduHandle = apduhandler;
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:putfield        #43  <Field ApduHandler apduHandle>
		apduFilter = new ApduFilter();
	//   13   28:aload_0         
	//   14   29:new             #45  <Class ApduFilter>
	//   15   32:dup             
	//   16   33:invokespecial   #46  <Method void ApduFilter()>
	//   17   36:putfield        #48  <Field ApduFilter apduFilter>
	//   18   39:return          
	}

	public void cancel()
	{
		setStop(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #54  <Method void setStop(boolean)>
	//    3    5:return          
	}

	public ApduReponseList execute(ApduRequestList apdurequestlist)
		throws FMScriptHandleException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #27  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #31  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #33  <Field FMLog fmLog>
		isStop = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #60  <Field boolean isStop>
		if(apdurequestlist == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ApduReponseList apdureponselist = new ApduReponseList();
	//   14   28:new             #62  <Class ApduReponseList>
	//   15   31:dup             
	//   16   32:invokespecial   #63  <Method void ApduReponseList()>
	//   17   35:astore          7
		ApduRequest apdurequest1 = apdurequestlist.getFirstApduRequest();
	//   18   37:aload_1         
	//   19   38:invokevirtual   #69  <Method ApduRequest ApduRequestList.getFirstApduRequest()>
	//   20   41:astore          5
		if(apdurequest1 == null)
	//*  21   43:aload           5
	//*  22   45:ifnonnull       87
		{
			if(fmLog != null)
	//*  23   48:aload_0         
	//*  24   49:getfield        #33  <Field FMLog fmLog>
	//*  25   52:ifnull          70
				fmLog.error(logTag, "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u83B7\u53D6\u7B2C\u4E00\u6761\u6307\u4EE4\u5931\u8D25");
	//   26   55:aload_0         
	//   27   56:getfield        #33  <Field FMLog fmLog>
	//   28   59:aload_0         
	//   29   60:getfield        #41  <Field String logTag>
	//   30   63:ldc1            #71  <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u83B7\u53D6\u7B2C\u4E00\u6761\u6307\u4EE4\u5931\u8D25">
	//   31   65:invokeinterface #77  <Method void FMLog.error(String, String)>
			(new FMScriptHandleException("\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u83B7\u53D6\u7B2C\u4E00\u6761\u6307\u4EE4\u5931\u8D25")).setType(cn.com.fmsh.script.exception.FMScriptHandleException.ScriptHandleExceptionType.INVALID_FIRST_ID);
	//   32   70:new             #58  <Class FMScriptHandleException>
	//   33   73:dup             
	//   34   74:ldc1            #71  <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u83B7\u53D6\u7B2C\u4E00\u6761\u6307\u4EE4\u5931\u8D25">
	//   35   76:invokespecial   #80  <Method void FMScriptHandleException(String)>
	//   36   79:getstatic       #86  <Field cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType.INVALID_FIRST_ID>
	//   37   82:invokevirtual   #90  <Method void FMScriptHandleException.setType(cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType)>
			return null;
	//   38   85:aconst_null     
	//   39   86:areturn         
		}
		ApduRequest apdurequest2 = null;
	//   40   87:aconst_null     
	//   41   88:astore          6
		do
		{
			if(isStop())
	//*  42   90:aload_0         
	//*  43   91:invokevirtual   #93  <Method boolean isStop()>
	//*  44   94:ifeq            116
			{
				apdurequestlist = ((ApduRequestList) (new FMScriptHandleException("\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6,\u5F53\u524D\u64CD\u4F5C\u88AB\u505C\u6B62")));
	//   45   97:new             #58  <Class FMScriptHandleException>
	//   46  100:dup             
	//   47  101:ldc1            #95  <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6,\u5F53\u524D\u64CD\u4F5C\u88AB\u505C\u6B62">
	//   48  103:invokespecial   #80  <Method void FMScriptHandleException(String)>
	//   49  106:astore_1        
				((FMScriptHandleException) (apdurequestlist)).setType(cn.com.fmsh.script.exception.FMScriptHandleException.ScriptHandleExceptionType.STOPED);
	//   50  107:aload_1         
	//   51  108:getstatic       #98  <Field cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType.STOPED>
	//   52  111:invokevirtual   #90  <Method void FMScriptHandleException.setType(cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType)>
				throw apdurequestlist;
	//   53  114:aload_1         
	//   54  115:athrow          
			}
			byte abyte0[] = apdurequest1.getApdu();
	//   55  116:aload           5
	//   56  118:invokevirtual   #104 <Method byte[] ApduRequest.getApdu()>
	//   57  121:astore          4
			if(apduHandle.getApduHandlerType() == cn.com.fmsh.script.ApduHandler.ApduHandlerType.OPEN_MOBILE)
	//*  58  123:aload_0         
	//*  59  124:getfield        #43  <Field ApduHandler apduHandle>
	//*  60  127:invokeinterface #110 <Method cn.com.fmsh.script.ApduHandler$ApduHandlerType ApduHandler.getApduHandlerType()>
	//*  61  132:getstatic       #116 <Field cn.com.fmsh.script.ApduHandler$ApduHandlerType cn.com.fmsh.script.ApduHandler$ApduHandlerType.OPEN_MOBILE>
	//*  62  135:if_acmpne       219
			{
				byte abyte1[] = apduFilter.filter(abyte0);
	//   63  138:aload_0         
	//   64  139:getfield        #48  <Field ApduFilter apduFilter>
	//   65  142:aload           4
	//   66  144:invokevirtual   #120 <Method byte[] ApduFilter.filter(byte[])>
	//   67  147:astore          8
				if(abyte1 != null)
	//*  68  149:aload           8
	//*  69  151:ifnull          203
				{
					if(apduHandle.open(abyte1))
	//*  70  154:aload_0         
	//*  71  155:getfield        #43  <Field ApduHandler apduHandle>
	//*  72  158:aload           8
	//*  73  160:invokeinterface #124 <Method boolean ApduHandler.open(byte[])>
	//*  74  165:ifeq            182
					{
						abyte0 = new byte[2];
	//   75  168:iconst_2        
	//   76  169:newarray        byte[]
	//   77  171:astore          4
						abyte0[0] = -112;
	//   78  173:aload           4
	//   79  175:iconst_0        
	//   80  176:bipush          -112
	//   81  178:bastore         
					} else
	//*  82  179:goto            232
					{
						abyte0 = new byte[2];
	//   83  182:iconst_2        
	//   84  183:newarray        byte[]
	//   85  185:astore          4
						byte[] _tmp = abyte0;
	//   86  187:aload           4
	//   87  189:dup             
	//   88  190:iconst_0        
	//   89  191:ldc1            #125 <Int 105>
	//   90  193:bastore         
	//   91  194:dup             
	//   92  195:iconst_1        
	//   93  196:ldc1            #126 <Int -123>
	//   94  198:bastore         
	//   95  199:pop             
						abyte0[0] = 105;
						abyte0[1] = -123;
					}
				} else
	//*  96  200:goto            232
				{
					abyte0 = apduHandle.transceive(abyte0);
	//   97  203:aload_0         
	//   98  204:getfield        #43  <Field ApduHandler apduHandle>
	//   99  207:aload           4
	//  100  209:invokeinterface #129 <Method byte[] ApduHandler.transceive(byte[])>
	//  101  214:astore          4
				}
			} else
	//* 102  216:goto            232
			{
				abyte0 = apduHandle.transceive(abyte0);
	//  103  219:aload_0         
	//  104  220:getfield        #43  <Field ApduHandler apduHandle>
	//  105  223:aload           4
	//  106  225:invokeinterface #129 <Method byte[] ApduHandler.transceive(byte[])>
	//  107  230:astore          4
			}
			ApduResponse apduresponse = new ApduResponse();
	//  108  232:new             #131 <Class ApduResponse>
	//  109  235:dup             
	//  110  236:invokespecial   #132 <Method void ApduResponse()>
	//  111  239:astore          8
			apduresponse.setId(apdurequest1.getId());
	//  112  241:aload           8
	//  113  243:aload           5
	//  114  245:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  115  248:invokevirtual   #140 <Method void ApduResponse.setId(int)>
			apduresponse.setApdu(apdurequest1.getApdu());
	//  116  251:aload           8
	//  117  253:aload           5
	//  118  255:invokevirtual   #104 <Method byte[] ApduRequest.getApdu()>
	//  119  258:invokevirtual   #144 <Method void ApduResponse.setApdu(byte[])>
			if(abyte0 == null || abyte0.length < 2)
	//* 120  261:aload           4
	//* 121  263:ifnull          273
	//* 122  266:aload           4
	//* 123  268:arraylength     
	//* 124  269:iconst_2        
	//* 125  270:icmpge          341
			{
				apduresponse.setResult(new byte[] {
					1
				});
	//  126  273:aload           8
	//  127  275:iconst_1        
	//  128  276:newarray        byte[]
	//  129  278:dup             
	//  130  279:iconst_0        
	//  131  280:ldc1            #145 <Int 1>
	//  132  282:bastore         
	//  133  283:invokevirtual   #148 <Method void ApduResponse.setResult(byte[])>
				apdureponselist.add(apduresponse);
	//  134  286:aload           7
	//  135  288:aload           8
	//  136  290:invokevirtual   #152 <Method void ApduReponseList.add(ApduResponse)>
				if(fmLog != null)
	//* 137  293:aload_0         
	//* 138  294:getfield        #33  <Field FMLog fmLog>
	//* 139  297:ifnull          655
				{
					fmLog.warn(logTag, (new StringBuilder("\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C[")).append(apdurequest1.getId()).append("]\u6307\u4EE4\u6267\u884C\u5931\u8D25").toString());
	//  140  300:aload_0         
	//  141  301:getfield        #33  <Field FMLog fmLog>
	//  142  304:aload_0         
	//  143  305:getfield        #41  <Field String logTag>
	//  144  308:new             #154 <Class StringBuilder>
	//  145  311:dup             
	//  146  312:ldc1            #156 <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C[">
	//  147  314:invokespecial   #157 <Method void StringBuilder(String)>
	//  148  317:aload           5
	//  149  319:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  150  322:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//  151  325:ldc1            #163 <String "]\u6307\u4EE4\u6267\u884C\u5931\u8D25">
	//  152  327:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  153  330:invokevirtual   #169 <Method String StringBuilder.toString()>
	//  154  333:invokeinterface #172 <Method void FMLog.warn(String, String)>
					return apdureponselist;
	//  155  338:aload           7
	//  156  340:areturn         
				}
				break;
			}
			apduresponse.setResult(abyte0);
	//  157  341:aload           8
	//  158  343:aload           4
	//  159  345:invokevirtual   #148 <Method void ApduResponse.setResult(byte[])>
			apdureponselist.add(apduresponse);
	//  160  348:aload           7
	//  161  350:aload           8
	//  162  352:invokevirtual   #152 <Method void ApduReponseList.add(ApduResponse)>
			byte abyte2[] = Arrays.copyOfRange(abyte0, abyte0.length - 2, abyte0.length);
	//  163  355:aload           4
	//  164  357:aload           4
	//  165  359:arraylength     
	//  166  360:iconst_2        
	//  167  361:isub            
	//  168  362:aload           4
	//  169  364:arraylength     
	//  170  365:invokestatic    #178 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  171  368:astore          8
			ApduRequest apdurequest;
			if(apdurequest1.getTag() == -96)
	//* 172  370:aload           5
	//* 173  372:invokevirtual   #182 <Method byte ApduRequest.getTag()>
	//* 174  375:bipush          -96
	//* 175  377:icmpne          506
			{
				if(apdurequest1.getNext4Expectation(new byte[] {
	-1, -1
}) != -1)
	//* 176  380:aload           5
	//* 177  382:iconst_2        
	//* 178  383:newarray        byte[]
	//* 179  385:dup             
	//* 180  386:iconst_0        
	//* 181  387:ldc1            #183 <Int -1>
	//* 182  389:bastore         
	//* 183  390:dup             
	//* 184  391:iconst_1        
	//* 185  392:ldc1            #183 <Int -1>
	//* 186  394:bastore         
	//* 187  395:invokevirtual   #187 <Method int ApduRequest.getNext4Expectation(byte[])>
	//* 188  398:iconst_m1       
	//* 189  399:icmpeq          418
					apdurequest = apdurequestlist.getApduRequest(apdurequest1.getId() + 1);
	//  190  402:aload_1         
	//  191  403:aload           5
	//  192  405:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  193  408:iconst_1        
	//  194  409:iadd            
	//  195  410:invokevirtual   #191 <Method ApduRequest ApduRequestList.getApduRequest(int)>
	//  196  413:astore          4
				else
	//* 197  415:goto            604
				if(apdurequest1.getNext4Expectation(abyte2) != -1)
	//* 198  418:aload           5
	//* 199  420:aload           8
	//* 200  422:invokevirtual   #187 <Method int ApduRequest.getNext4Expectation(byte[])>
	//* 201  425:iconst_m1       
	//* 202  426:icmpeq          445
				{
					apdurequest = apdurequestlist.getApduRequest(apdurequest1.getId() + 1);
	//  203  429:aload_1         
	//  204  430:aload           5
	//  205  432:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  206  435:iconst_1        
	//  207  436:iadd            
	//  208  437:invokevirtual   #191 <Method ApduRequest ApduRequestList.getApduRequest(int)>
	//  209  440:astore          4
				} else
	//* 210  442:goto            604
				{
					if(fmLog != null)
	//* 211  445:aload_0         
	//* 212  446:getfield        #33  <Field FMLog fmLog>
	//* 213  449:ifnull          655
					{
						fmLog.error(logTag, (new StringBuilder("\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C[")).append(apdurequest1.getId()).append("]\u6307\u4EE4\u54CD\u5E94\u7801[").append(FM_Bytes.bytesToHexString(abyte2)).append("]\u4E0E\u671F\u671B\u503C\u4E0D\u7B26").toString());
	//  214  452:aload_0         
	//  215  453:getfield        #33  <Field FMLog fmLog>
	//  216  456:aload_0         
	//  217  457:getfield        #41  <Field String logTag>
	//  218  460:new             #154 <Class StringBuilder>
	//  219  463:dup             
	//  220  464:ldc1            #156 <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C[">
	//  221  466:invokespecial   #157 <Method void StringBuilder(String)>
	//  222  469:aload           5
	//  223  471:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  224  474:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//  225  477:ldc1            #193 <String "]\u6307\u4EE4\u54CD\u5E94\u7801[">
	//  226  479:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  227  482:aload           8
	//  228  484:invokestatic    #199 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  229  487:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  230  490:ldc1            #201 <String "]\u4E0E\u671F\u671B\u503C\u4E0D\u7B26">
	//  231  492:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  232  495:invokevirtual   #169 <Method String StringBuilder.toString()>
	//  233  498:invokeinterface #77  <Method void FMLog.error(String, String)>
						return apdureponselist;
	//  234  503:aload           7
	//  235  505:areturn         
					}
					break;
				}
			} else
			{
				apdurequest = apdurequest2;
	//  236  506:aload           6
	//  237  508:astore          4
				if(apdurequest1.getTag() == -92)
	//* 238  510:aload           5
	//* 239  512:invokevirtual   #182 <Method byte ApduRequest.getTag()>
	//* 240  515:bipush          -92
	//* 241  517:icmpne          604
				{
					int j;
					if(apdurequest1.isHaveExpectation())
	//* 242  520:aload           5
	//* 243  522:invokevirtual   #204 <Method boolean ApduRequest.isHaveExpectation()>
	//* 244  525:ifeq            589
					{
						j = apdurequest1.getNext4Expectation(abyte2);
	//  245  528:aload           5
	//  246  530:aload           8
	//  247  532:invokevirtual   #187 <Method int ApduRequest.getNext4Expectation(byte[])>
	//  248  535:istore_3        
						int i = j;
	//  249  536:iload_3         
	//  250  537:istore_2        
						if(j == -1)
	//* 251  538:iload_3         
	//* 252  539:iconst_m1       
	//* 253  540:icmpne          562
							i = apdurequest1.getNext4Expectation(new byte[] {
								-1, -1
							});
	//  254  543:aload           5
	//  255  545:iconst_2        
	//  256  546:newarray        byte[]
	//  257  548:dup             
	//  258  549:iconst_0        
	//  259  550:ldc1            #183 <Int -1>
	//  260  552:bastore         
	//  261  553:dup             
	//  262  554:iconst_1        
	//  263  555:ldc1            #183 <Int -1>
	//  264  557:bastore         
	//  265  558:invokevirtual   #187 <Method int ApduRequest.getNext4Expectation(byte[])>
	//  266  561:istore_2        
						if(i == 0)
	//* 267  562:iload_2         
	//* 268  563:ifne            577
						{
							j = apdurequest1.getId() + 1;
	//  269  566:aload           5
	//  270  568:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  271  571:iconst_1        
	//  272  572:iadd            
	//  273  573:istore_3        
						} else
	//* 274  574:goto            597
						{
							j = i;
	//  275  577:iload_2         
	//  276  578:istore_3        
							if(i == 255)
	//* 277  579:iload_2         
	//* 278  580:sipush          255
	//* 279  583:icmpne          597
								return apdureponselist;
	//  280  586:aload           7
	//  281  588:areturn         
						}
					} else
					{
						j = apdurequest1.getId() + 1;
	//  282  589:aload           5
	//  283  591:invokevirtual   #136 <Method int ApduRequest.getId()>
	//  284  594:iconst_1        
	//  285  595:iadd            
	//  286  596:istore_3        
					}
					apdurequest = apdurequestlist.getApduRequest(j);
	//  287  597:aload_1         
	//  288  598:iload_3         
	//  289  599:invokevirtual   #191 <Method ApduRequest ApduRequestList.getApduRequest(int)>
	//  290  602:astore          4
				}
			}
			if(apdurequest == null)
	//* 291  604:aload           4
	//* 292  606:ifnonnull       612
				return apdureponselist;
	//  293  609:aload           7
	//  294  611:areturn         
			if(apdurequest.getId() <= apdurequest1.getId())
	//* 295  612:aload           4
	//* 296  614:invokevirtual   #136 <Method int ApduRequest.getId()>
	//* 297  617:aload           5
	//* 298  619:invokevirtual   #136 <Method int ApduRequest.getId()>
	//* 299  622:icmpgt          644
			{
				apdurequestlist = ((ApduRequestList) (new FMScriptHandleException("\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u5F85\u6307\u4EE4\u7684\u4E0B\u6761\u6307\u4EE4\u7684\u7F16\u53F7\u4E0D\u5927\u4E8E\u672C\u6761\u6307\u4EE4\u7684\u6807\u8BC6\uFF0C\u6267\u884C\u5931\u8D25")));
	//  300  625:new             #58  <Class FMScriptHandleException>
	//  301  628:dup             
	//  302  629:ldc1            #206 <String "\u591A\u6761\u6307\u4EE4\u6267\u884C\u65F6\uFF0C\u5F85\u6307\u4EE4\u7684\u4E0B\u6761\u6307\u4EE4\u7684\u7F16\u53F7\u4E0D\u5927\u4E8E\u672C\u6761\u6307\u4EE4\u7684\u6807\u8BC6\uFF0C\u6267\u884C\u5931\u8D25">
	//  303  631:invokespecial   #80  <Method void FMScriptHandleException(String)>
	//  304  634:astore_1        
				((FMScriptHandleException) (apdurequestlist)).setType(cn.com.fmsh.script.exception.FMScriptHandleException.ScriptHandleExceptionType.INVALID_NEXT);
	//  305  635:aload_1         
	//  306  636:getstatic       #209 <Field cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType.INVALID_NEXT>
	//  307  639:invokevirtual   #90  <Method void FMScriptHandleException.setType(cn.com.fmsh.script.exception.FMScriptHandleException$ScriptHandleExceptionType)>
				throw apdurequestlist;
	//  308  642:aload_1         
	//  309  643:athrow          
			}
			apdurequest1 = apdurequest;
	//  310  644:aload           4
	//  311  646:astore          5
			apdurequest2 = apdurequest;
	//  312  648:aload           4
	//  313  650:astore          6
		} while(true);
	//  314  652:goto            90
		return apdureponselist;
	//  315  655:aload           7
	//  316  657:areturn         
	}

	public byte[] execute(byte abyte0[])
		throws FMScriptHandleException
	{
		return apduHandle.transceive(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ApduHandler apduHandle>
	//    2    4:aload_1         
	//    3    5:invokeinterface #129 <Method byte[] ApduHandler.transceive(byte[])>
	//    4   10:areturn         
	}

	public boolean isStop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isStop;
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field boolean isStop>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public void setApduFilterDataInit(ApduFilterDataInit apdufilterdatainit)
	{
		if(apdufilterdatainit != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          46
		{
			FilterPolicy filterpolicy;
			for(apdufilterdatainit = ((ApduFilterDataInit) (apdufilterdatainit.getFilterPolicies().iterator())); ((Iterator) (apdufilterdatainit)).hasNext(); apduFilter.addFilterPolicy(filterpolicy))
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #218 <Method List ApduFilterDataInit.getFilterPolicies()>
	//*   4   10:invokeinterface #224 <Method Iterator List.iterator()>
	//*   5   15:astore_1        
	//*   6   16:goto            37
				filterpolicy = (FilterPolicy)((Iterator) (apdufilterdatainit)).next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #230 <Method Object Iterator.next()>
	//    9   25:checkcast       #232 <Class FilterPolicy>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #48  <Field ApduFilter apduFilter>
	//   13   33:aload_2         
	//   14   34:invokevirtual   #236 <Method void ApduFilter.addFilterPolicy(FilterPolicy)>
	//   15   37:aload_1         
	//   16   38:invokeinterface #239 <Method boolean Iterator.hasNext()>
	//   17   43:ifne            19
		}
	//   18   46:return          
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandle = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ApduHandler apduHandle>
	//    3    5:return          
	}

	public void setStop(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isStop = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #60  <Field boolean isStop>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_2        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_2         
	//   12   14:athrow          
	}

	private ApduFilter apduFilter;
	private ApduHandler apduHandle;
	private FMLog fmLog;
	private boolean isStop;
	private String logTag;
}
