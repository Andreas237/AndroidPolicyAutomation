// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.test;

import cn.com.fmsh.communication.message.*;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.script.*;
import cn.com.fmsh.script.bean.*;
import cn.com.fmsh.script.core.FilterPolicy;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test
{
	class ApduHandler4Test
		implements ApduHandler
	{

		public void close()
		{
		//    0    0:return          
		}

		public boolean connect()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public cn.com.fmsh.script.ApduHandler.ApduHandlerType getApduHandlerType()
		{
			return cn.com.fmsh.script.ApduHandler.ApduHandlerType.OPEN_MOBILE;
		//    0    0:getstatic       #33  <Field cn.com.fmsh.script.ApduHandler$ApduHandlerType cn.com.fmsh.script.ApduHandler$ApduHandlerType.OPEN_MOBILE>
		//    1    3:areturn         
		}

		public boolean isConnect()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean open(byte abyte0[])
		{
			System.out.println((new StringBuilder("open aid:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
		//    0    0:getstatic       #42  <Field PrintStream System.out>
		//    1    3:new             #44  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:ldc1            #46  <String "open aid:">
		//    4    9:invokespecial   #49  <Method void StringBuilder(String)>
		//    5   12:aload_1         
		//    6   13:invokestatic    #55  <Method String FM_Bytes.bytesToHexString(byte[])>
		//    7   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:invokevirtual   #63  <Method String StringBuilder.toString()>
		//    9   22:invokevirtual   #68  <Method void PrintStream.println(String)>
			return true;
		//   10   25:iconst_1        
		//   11   26:ireturn         
		}

		public byte[] transceive(byte abyte0[])
			throws FMScriptHandleException
		{
			abyte0 = new byte[2];
		//    0    0:iconst_2        
		//    1    1:newarray        byte[]
		//    2    3:astore_1        
			abyte0[0] = -112;
		//    3    4:aload_1         
		//    4    5:iconst_0        
		//    5    6:bipush          -112
		//    6    8:bastore         
			return abyte0;
		//    7    9:aload_1         
		//    8   10:areturn         
		}

		final Test this$0;

		private ApduHandler4Test()
		{
			this$0 = Test.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Test this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

		ApduHandler4Test(ApduHandler4Test apduhandler4test)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void Test$ApduHandler4Test(Test)>
		//    3    5:return          
		}
	}

	class FilterDataInit4Test
		implements ApduFilterDataInit
	{

		public List getFilterPolicies()
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #26  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void ArrayList()>
		//    3    7:astore_1        
			FilterPolicy filterpolicy = new FilterPolicy();
		//    4    8:new             #29  <Class FilterPolicy>
		//    5   11:dup             
		//    6   12:invokespecial   #30  <Method void FilterPolicy()>
		//    7   15:astore_2        
			filterpolicy.setCla((byte)0);
		//    8   16:aload_2         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #34  <Method void FilterPolicy.setCla(byte)>
			filterpolicy.setIns((byte)-92);
		//   11   21:aload_2         
		//   12   22:bipush          -92
		//   13   24:invokevirtual   #37  <Method void FilterPolicy.setIns(byte)>
			filterpolicy.addFilterData(new byte[0]);
		//   14   27:aload_2         
		//   15   28:iconst_0        
		//   16   29:newarray        byte[]
		//   17   31:invokevirtual   #41  <Method void FilterPolicy.addFilterData(byte[])>
			((List) (arraylist)).add(((Object) (filterpolicy)));
		//   18   34:aload_1         
		//   19   35:aload_2         
		//   20   36:invokeinterface #47  <Method boolean List.add(Object)>
		//   21   41:pop             
			return ((List) (arraylist));
		//   22   42:aload_1         
		//   23   43:areturn         
		}

		final Test this$0;

		private FilterDataInit4Test()
		{
			this$0 = Test.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Test this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

		FilterDataInit4Test(FilterDataInit4Test filterdatainit4test)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void Test$FilterDataInit4Test(Test)>
		//    3    5:return          
		}
	}


	public Test()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		messageHandler = ((IMessageHandler) (MessageHandleFactory.getMessageHandler()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #22  <Method cn.com.fmsh.communication.message.core.MessageHandler MessageHandleFactory.getMessageHandler()>
	//    4    8:putfield        #24  <Field IMessageHandler messageHandler>
	//    5   11:return          
	}

	public static void main(String args[])
	{
		args = ((String []) (new Test()));
	//    0    0:new             #2   <Class Test>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void Test()>
	//    3    7:astore_0        
		((Test) (args)).load();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #31  <Method void load()>
		((Test) (args)).testM();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #34  <Method void testM()>
	//    8   16:return          
	}

	public void load()
	{
		Object obj;
		messageHandler = ((IMessageHandler) (MessageHandleFactory.getMessageHandler()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method cn.com.fmsh.communication.message.core.MessageHandler MessageHandleFactory.getMessageHandler()>
	//    2    4:putfield        #24  <Field IMessageHandler messageHandler>
		obj = ((Object) (new File("C:/temp/message-tag.xml")));
	//    3    7:new             #40  <Class File>
	//    4   10:dup             
	//    5   11:ldc1            #42  <String "C:/temp/message-tag.xml">
	//    6   13:invokespecial   #45  <Method void File(String)>
	//    7   16:astore_1        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//    8   17:new             #47  <Class FileInputStream>
	//    9   20:dup             
	//   10   21:aload_1         
	//   11   22:invokespecial   #50  <Method void FileInputStream(File)>
	//   12   25:astore_1        
		try
		{
			messageHandler.loadDefine(((java.io.InputStream) (obj)));
	//   13   26:aload_0         
	//   14   27:getfield        #24  <Field IMessageHandler messageHandler>
	//   15   30:aload_1         
	//   16   31:invokeinterface #56  <Method int IMessageHandler.loadDefine(java.io.InputStream)>
	//   17   36:pop             
			return;
	//   18   37:return          
		}
		catch(FMCommunicationMessageException fmcommunicationmessageexception)
	//*  19   38:astore_1        
		{
			try
			{
				fmcommunicationmessageexception.printStackTrace();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #59  <Method void FMCommunicationMessageException.printStackTrace()>
				return;
	//   22   43:return          
			}
			catch(FileNotFoundException filenotfoundexception)
	//*  23   44:astore_1        
			{
				filenotfoundexception.printStackTrace();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #60  <Method void FileNotFoundException.printStackTrace()>
			}
		}
		return;
	//   26   49:return          
	}

	public void testM()
	{
		Object obj;
		Object obj1;
		ApduRequestList apdurequestlist;
		ITag itag;
		ITag itag1;
		ITag itag2;
		ITag itag3;
		obj1 = ((Object) (ScriptHandlerFactory.getInstance().getScriptHandler(((ApduHandler) (new ApduHandler4Test(((ApduHandler4Test) (null))))))));
	//    0    0:invokestatic    #68  <Method ScriptHandlerFactory ScriptHandlerFactory.getInstance()>
	//    1    3:new             #6   <Class Test$ApduHandler4Test>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokespecial   #71  <Method void Test$ApduHandler4Test(Test, Test$ApduHandler4Test)>
	//    6   12:invokevirtual   #75  <Method ScriptHandler ScriptHandlerFactory.getScriptHandler(ApduHandler)>
	//    7   15:astore          4
		((ScriptHandler) (obj1)).setApduFilterDataInit(((ApduFilterDataInit) (new FilterDataInit4Test(((FilterDataInit4Test) (null))))));
	//    8   17:aload           4
	//    9   19:new             #9   <Class Test$FilterDataInit4Test>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #78  <Method void Test$FilterDataInit4Test(Test, Test$FilterDataInit4Test)>
	//   14   28:invokeinterface #84  <Method void ScriptHandler.setApduFilterDataInit(ApduFilterDataInit)>
		apdurequestlist = new ApduRequestList();
	//   15   33:new             #86  <Class ApduRequestList>
	//   16   36:dup             
	//   17   37:invokespecial   #87  <Method void ApduRequestList()>
	//   18   40:astore          5
		System.out.println("=======================test==============================================");
	//   19   42:getstatic       #93  <Field PrintStream System.out>
	//   20   45:ldc1            #95  <String "=======================test==============================================">
	//   21   47:invokevirtual   #100 <Method void PrintStream.println(String)>
		obj = ((Object) (messageHandler.createTag((byte)-95)));
	//   22   50:aload_0         
	//   23   51:getfield        #24  <Field IMessageHandler messageHandler>
	//   24   54:bipush          -95
	//   25   56:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   26   61:astore_3        
		itag3 = messageHandler.createTag((byte)-96);
	//   27   62:aload_0         
	//   28   63:getfield        #24  <Field IMessageHandler messageHandler>
	//   29   66:bipush          -96
	//   30   68:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   31   73:astore          9
		itag2 = messageHandler.createTag((byte)-92);
	//   32   75:aload_0         
	//   33   76:getfield        #24  <Field IMessageHandler messageHandler>
	//   34   79:bipush          -92
	//   35   81:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   36   86:astore          8
		itag1 = messageHandler.createTag((byte)-92);
	//   37   88:aload_0         
	//   38   89:getfield        #24  <Field IMessageHandler messageHandler>
	//   39   92:bipush          -92
	//   40   94:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   41   99:astore          7
		itag = messageHandler.createTag((byte)-92);
	//   42  101:aload_0         
	//   43  102:getfield        #24  <Field IMessageHandler messageHandler>
	//   44  105:bipush          -92
	//   45  107:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   46  112:astore          6
		byte abyte2[] = new byte[8];
	//   47  114:bipush          8
	//   48  116:newarray        byte[]
	//   49  118:astore          10
		abyte2[0] = 1;
	//   50  120:aload           10
	//   51  122:iconst_0        
	//   52  123:iconst_1        
	//   53  124:bastore         
		abyte2[2] = -92;
	//   54  125:aload           10
	//   55  127:iconst_2        
	//   56  128:bipush          -92
	//   57  130:bastore         
		abyte2[6] = -1;
	//   58  131:aload           10
	//   59  133:bipush          6
	//   60  135:iconst_m1       
	//   61  136:bastore         
		abyte2[7] = -1;
	//   62  137:aload           10
	//   63  139:bipush          7
	//   64  141:iconst_m1       
	//   65  142:bastore         
		itag3.addValue(abyte2);
	//   66  143:aload           9
	//   67  145:aload           10
	//   68  147:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//   69  152:pop             
		((ITag) (obj)).addValue(itag3);
	//   70  153:aload_3         
	//   71  154:aload           9
	//   72  156:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//   73  161:pop             
		itag3 = messageHandler.createTag((byte)56);
	//   74  162:aload_0         
	//   75  163:getfield        #24  <Field IMessageHandler messageHandler>
	//   76  166:bipush          56
	//   77  168:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   78  173:astore          9
		itag3.addValue(2);
	//   79  175:aload           9
	//   80  177:iconst_2        
	//   81  178:invokeinterface #116 <Method int ITag.addValue(int)>
	//   82  183:pop             
		itag2.addValue(itag3);
	//   83  184:aload           8
	//   84  186:aload           9
	//   85  188:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//   86  193:pop             
		itag3 = messageHandler.createTag((byte)57);
	//   87  194:aload_0         
	//   88  195:getfield        #24  <Field IMessageHandler messageHandler>
	//   89  198:bipush          57
	//   90  200:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   91  205:astore          9
		abyte2 = new byte[5];
	//   92  207:iconst_5        
	//   93  208:newarray        byte[]
	//   94  210:astore          10
		abyte2[1] = -92;
	//   95  212:aload           10
	//   96  214:iconst_1        
	//   97  215:bipush          -92
	//   98  217:bastore         
		itag3.addValue(abyte2);
	//   99  218:aload           9
	//  100  220:aload           10
	//  101  222:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  102  227:pop             
		itag2.addValue(itag3);
	//  103  228:aload           8
	//  104  230:aload           9
	//  105  232:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  106  237:pop             
		itag3 = messageHandler.createTag((byte)60);
	//  107  238:aload_0         
	//  108  239:getfield        #24  <Field IMessageHandler messageHandler>
	//  109  242:bipush          60
	//  110  244:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  111  249:astore          9
		abyte2 = new byte[3];
	//  112  251:iconst_3        
	//  113  252:newarray        byte[]
	//  114  254:astore          10
		abyte2[0] = -112;
	//  115  256:aload           10
	//  116  258:iconst_0        
	//  117  259:bipush          -112
	//  118  261:bastore         
		itag3.addValue(abyte2);
	//  119  262:aload           9
	//  120  264:aload           10
	//  121  266:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  122  271:pop             
		itag2.addValue(itag3);
	//  123  272:aload           8
	//  124  274:aload           9
	//  125  276:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  126  281:pop             
		itag3 = messageHandler.createTag((byte)60);
	//  127  282:aload_0         
	//  128  283:getfield        #24  <Field IMessageHandler messageHandler>
	//  129  286:bipush          60
	//  130  288:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  131  293:astore          9
		abyte2 = new byte[3];
	//  132  295:iconst_3        
	//  133  296:newarray        byte[]
	//  134  298:astore          10
		abyte2[0] = 105;
	//  135  300:aload           10
	//  136  302:iconst_0        
	//  137  303:bipush          105
	//  138  305:bastore         
		abyte2[2] = -1;
	//  139  306:aload           10
	//  140  308:iconst_2        
	//  141  309:iconst_m1       
	//  142  310:bastore         
		byte abyte1[];
		itag3.addValue(abyte2);
	//  143  311:aload           9
	//  144  313:aload           10
	//  145  315:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  146  320:pop             
		itag2.addValue(itag3);
	//  147  321:aload           8
	//  148  323:aload           9
	//  149  325:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  150  330:pop             
		((ITag) (obj)).addValue(itag2);
	//  151  331:aload_3         
	//  152  332:aload           8
	//  153  334:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  154  339:pop             
		itag2 = messageHandler.createTag((byte)56);
	//  155  340:aload_0         
	//  156  341:getfield        #24  <Field IMessageHandler messageHandler>
	//  157  344:bipush          56
	//  158  346:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  159  351:astore          8
		itag2.addValue(3);
	//  160  353:aload           8
	//  161  355:iconst_3        
	//  162  356:invokeinterface #116 <Method int ITag.addValue(int)>
	//  163  361:pop             
		itag1.addValue(itag2);
	//  164  362:aload           7
	//  165  364:aload           8
	//  166  366:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  167  371:pop             
		itag2 = messageHandler.createTag((byte)57);
	//  168  372:aload_0         
	//  169  373:getfield        #24  <Field IMessageHandler messageHandler>
	//  170  376:bipush          57
	//  171  378:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  172  383:astore          8
		abyte1 = new byte[5];
	//  173  385:iconst_5        
	//  174  386:newarray        byte[]
	//  175  388:astore          9
		abyte1[1] = -92;
	//  176  390:aload           9
	//  177  392:iconst_1        
	//  178  393:bipush          -92
	//  179  395:bastore         
		itag2.addValue(abyte1);
	//  180  396:aload           8
	//  181  398:aload           9
	//  182  400:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  183  405:pop             
		itag1.addValue(itag2);
	//  184  406:aload           7
	//  185  408:aload           8
	//  186  410:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  187  415:pop             
		itag2 = messageHandler.createTag((byte)60);
	//  188  416:aload_0         
	//  189  417:getfield        #24  <Field IMessageHandler messageHandler>
	//  190  420:bipush          60
	//  191  422:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  192  427:astore          8
		abyte1 = new byte[3];
	//  193  429:iconst_3        
	//  194  430:newarray        byte[]
	//  195  432:astore          9
		abyte1[0] = -112;
	//  196  434:aload           9
	//  197  436:iconst_0        
	//  198  437:bipush          -112
	//  199  439:bastore         
		abyte1[2] = 4;
	//  200  440:aload           9
	//  201  442:iconst_2        
	//  202  443:iconst_4        
	//  203  444:bastore         
		itag2.addValue(abyte1);
	//  204  445:aload           8
	//  205  447:aload           9
	//  206  449:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  207  454:pop             
		itag1.addValue(itag2);
	//  208  455:aload           7
	//  209  457:aload           8
	//  210  459:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  211  464:pop             
		itag2 = messageHandler.createTag((byte)60);
	//  212  465:aload_0         
	//  213  466:getfield        #24  <Field IMessageHandler messageHandler>
	//  214  469:bipush          60
	//  215  471:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  216  476:astore          8
		abyte1 = new byte[3];
	//  217  478:iconst_3        
	//  218  479:newarray        byte[]
	//  219  481:astore          9
		abyte1[0] = 105;
	//  220  483:aload           9
	//  221  485:iconst_0        
	//  222  486:bipush          105
	//  223  488:bastore         
		abyte1[2] = -1;
	//  224  489:aload           9
	//  225  491:iconst_2        
	//  226  492:iconst_m1       
	//  227  493:bastore         
		byte abyte0[];
		itag2.addValue(abyte1);
	//  228  494:aload           8
	//  229  496:aload           9
	//  230  498:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  231  503:pop             
		itag1.addValue(itag2);
	//  232  504:aload           7
	//  233  506:aload           8
	//  234  508:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  235  513:pop             
		((ITag) (obj)).addValue(itag1);
	//  236  514:aload_3         
	//  237  515:aload           7
	//  238  517:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  239  522:pop             
		itag1 = messageHandler.createTag((byte)56);
	//  240  523:aload_0         
	//  241  524:getfield        #24  <Field IMessageHandler messageHandler>
	//  242  527:bipush          56
	//  243  529:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  244  534:astore          7
		itag1.addValue(4);
	//  245  536:aload           7
	//  246  538:iconst_4        
	//  247  539:invokeinterface #116 <Method int ITag.addValue(int)>
	//  248  544:pop             
		itag.addValue(itag1);
	//  249  545:aload           6
	//  250  547:aload           7
	//  251  549:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  252  554:pop             
		itag1 = messageHandler.createTag((byte)57);
	//  253  555:aload_0         
	//  254  556:getfield        #24  <Field IMessageHandler messageHandler>
	//  255  559:bipush          57
	//  256  561:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  257  566:astore          7
		abyte0 = new byte[5];
	//  258  568:iconst_5        
	//  259  569:newarray        byte[]
	//  260  571:astore          8
		abyte0[1] = -92;
	//  261  573:aload           8
	//  262  575:iconst_1        
	//  263  576:bipush          -92
	//  264  578:bastore         
		itag1.addValue(abyte0);
	//  265  579:aload           7
	//  266  581:aload           8
	//  267  583:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  268  588:pop             
		itag.addValue(itag1);
	//  269  589:aload           6
	//  270  591:aload           7
	//  271  593:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  272  598:pop             
		itag1 = messageHandler.createTag((byte)60);
	//  273  599:aload_0         
	//  274  600:getfield        #24  <Field IMessageHandler messageHandler>
	//  275  603:bipush          60
	//  276  605:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  277  610:astore          7
		abyte0 = new byte[3];
	//  278  612:iconst_3        
	//  279  613:newarray        byte[]
	//  280  615:astore          8
		abyte0[0] = -112;
	//  281  617:aload           8
	//  282  619:iconst_0        
	//  283  620:bipush          -112
	//  284  622:bastore         
		abyte0[2] = -1;
	//  285  623:aload           8
	//  286  625:iconst_2        
	//  287  626:iconst_m1       
	//  288  627:bastore         
		itag1.addValue(abyte0);
	//  289  628:aload           7
	//  290  630:aload           8
	//  291  632:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  292  637:pop             
		itag.addValue(itag1);
	//  293  638:aload           6
	//  294  640:aload           7
	//  295  642:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  296  647:pop             
		itag1 = messageHandler.createTag((byte)60);
	//  297  648:aload_0         
	//  298  649:getfield        #24  <Field IMessageHandler messageHandler>
	//  299  652:bipush          60
	//  300  654:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//  301  659:astore          7
		abyte0 = new byte[3];
	//  302  661:iconst_3        
	//  303  662:newarray        byte[]
	//  304  664:astore          8
		abyte0[0] = 105;
	//  305  666:aload           8
	//  306  668:iconst_0        
	//  307  669:bipush          105
	//  308  671:bastore         
		abyte0[2] = -1;
	//  309  672:aload           8
	//  310  674:iconst_2        
	//  311  675:iconst_m1       
	//  312  676:bastore         
		try
		{
			itag1.addValue(abyte0);
	//  313  677:aload           7
	//  314  679:aload           8
	//  315  681:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//  316  686:pop             
			itag.addValue(itag1);
	//  317  687:aload           6
	//  318  689:aload           7
	//  319  691:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  320  696:pop             
			((ITag) (obj)).addValue(itag);
	//  321  697:aload_3         
	//  322  698:aload           6
	//  323  700:invokeinterface #113 <Method int ITag.addValue(ITag)>
	//  324  705:pop             
		}
	//* 325  706:goto            722
		catch(FMCommunicationMessageException fmcommunicationmessageexception1)
	//* 326  709:astore          6
		{
			System.out.println(Util4Java.getExceptionInfo(((Exception) (fmcommunicationmessageexception1))));
	//  327  711:getstatic       #93  <Field PrintStream System.out>
	//  328  714:aload           6
	//  329  716:invokestatic    #122 <Method String Util4Java.getExceptionInfo(Exception)>
	//  330  719:invokevirtual   #100 <Method void PrintStream.println(String)>
		}
		try
		{
			apdurequestlist.fromTag(((ITag) (obj)));
	//  331  722:aload           5
	//  332  724:aload_3         
	//  333  725:invokevirtual   #126 <Method void ApduRequestList.fromTag(ITag)>
		}
	//* 334  728:goto            756
		catch(FMScriptHandleException fmscripthandleexception)
	//* 335  731:astore_3        
		{
			System.out.println(Util4Java.getExceptionInfo(((Exception) (fmscripthandleexception))));
	//  336  732:getstatic       #93  <Field PrintStream System.out>
	//  337  735:aload_3         
	//  338  736:invokestatic    #122 <Method String Util4Java.getExceptionInfo(Exception)>
	//  339  739:invokevirtual   #100 <Method void PrintStream.println(String)>
		}
	//* 340  742:goto            756
		catch(FMCommunicationMessageException fmcommunicationmessageexception)
	//* 341  745:astore_3        
		{
			System.out.println(Util4Java.getExceptionInfo(((Exception) (fmcommunicationmessageexception))));
	//  342  746:getstatic       #93  <Field PrintStream System.out>
	//  343  749:aload_3         
	//  344  750:invokestatic    #122 <Method String Util4Java.getExceptionInfo(Exception)>
	//  345  753:invokevirtual   #100 <Method void PrintStream.println(String)>
		}
		fmcommunicationmessageexception = null;
	//  346  756:aconst_null     
	//  347  757:astore_3        
		obj1 = ((Object) (((ScriptHandler) (obj1)).execute(apdurequestlist)));
	//  348  758:aload           4
	//  349  760:aload           5
	//  350  762:invokeinterface #130 <Method ApduReponseList ScriptHandler.execute(ApduRequestList)>
	//  351  767:astore          4
		fmcommunicationmessageexception = ((FMCommunicationMessageException) (obj1));
	//  352  769:aload           4
	//  353  771:astore_3        
		break MISSING_BLOCK_LABEL_782;
	//  354  772:goto            782
		FMScriptHandleException fmscripthandleexception1;
		fmscripthandleexception1;
	//  355  775:astore          4
		fmscripthandleexception1.printStackTrace();
	//  356  777:aload           4
	//  357  779:invokevirtual   #131 <Method void FMScriptHandleException.printStackTrace()>
		ApduResponse aapduresponse[] = ((ApduReponseList) (fmcommunicationmessageexception)).getApduResponse();
	//  358  782:aload_3         
	//  359  783:invokevirtual   #137 <Method ApduResponse[] ApduReponseList.getApduResponse()>
	//  360  786:astore_3        
		System.out.println((new StringBuilder("apduReponses.length:")).append(aapduresponse.length).toString());
	//  361  787:getstatic       #93  <Field PrintStream System.out>
	//  362  790:new             #139 <Class StringBuilder>
	//  363  793:dup             
	//  364  794:ldc1            #141 <String "apduReponses.length:">
	//  365  796:invokespecial   #142 <Method void StringBuilder(String)>
	//  366  799:aload_3         
	//  367  800:arraylength     
	//  368  801:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//  369  804:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  370  807:invokevirtual   #100 <Method void PrintStream.println(String)>
		int j = aapduresponse.length;
	//  371  810:aload_3         
	//  372  811:arraylength     
	//  373  812:istore_2        
		for(int i = 0; i < j; i++)
	//* 374  813:iconst_0        
	//* 375  814:istore_1        
	//* 376  815:goto            869
		{
			ApduResponse apduresponse = aapduresponse[i];
	//  377  818:aload_3         
	//  378  819:iload_1         
	//  379  820:aaload          
	//  380  821:astore          4
			System.out.println((new StringBuilder("id:")).append(apduresponse.getId()).append("  reponseCode:").append(FM_Bytes.bytesToHexString(apduresponse.getResult())).toString());
	//  381  823:getstatic       #93  <Field PrintStream System.out>
	//  382  826:new             #139 <Class StringBuilder>
	//  383  829:dup             
	//  384  830:ldc1            #152 <String "id:">
	//  385  832:invokespecial   #142 <Method void StringBuilder(String)>
	//  386  835:aload           4
	//  387  837:invokevirtual   #158 <Method int ApduResponse.getId()>
	//  388  840:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//  389  843:ldc1            #160 <String "  reponseCode:">
	//  390  845:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  391  848:aload           4
	//  392  850:invokevirtual   #167 <Method byte[] ApduResponse.getResult()>
	//  393  853:invokestatic    #173 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  394  856:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  395  859:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  396  862:invokevirtual   #100 <Method void PrintStream.println(String)>
		}

	//  397  865:iload_1         
	//  398  866:iconst_1        
	//  399  867:iadd            
	//  400  868:istore_1        
	//  401  869:iload_1         
	//  402  870:iload_2         
	//  403  871:icmplt          818
		return;
	//  404  874:return          
	}

	public void testSingle()
	{
		Object obj;
		Object obj1;
		ApduRequestList apdurequestlist;
		obj1 = ((Object) (ScriptHandlerFactory.getInstance().getScriptHandler(((ApduHandler) (new ApduHandler4Test(((ApduHandler4Test) (null))))))));
	//    0    0:invokestatic    #68  <Method ScriptHandlerFactory ScriptHandlerFactory.getInstance()>
	//    1    3:new             #6   <Class Test$ApduHandler4Test>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokespecial   #71  <Method void Test$ApduHandler4Test(Test, Test$ApduHandler4Test)>
	//    6   12:invokevirtual   #75  <Method ScriptHandler ScriptHandlerFactory.getScriptHandler(ApduHandler)>
	//    7   15:astore          4
		((ScriptHandler) (obj1)).setApduFilterDataInit(((ApduFilterDataInit) (new FilterDataInit4Test(((FilterDataInit4Test) (null))))));
	//    8   17:aload           4
	//    9   19:new             #9   <Class Test$FilterDataInit4Test>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #78  <Method void Test$FilterDataInit4Test(Test, Test$FilterDataInit4Test)>
	//   14   28:invokeinterface #84  <Method void ScriptHandler.setApduFilterDataInit(ApduFilterDataInit)>
		apdurequestlist = new ApduRequestList();
	//   15   33:new             #86  <Class ApduRequestList>
	//   16   36:dup             
	//   17   37:invokespecial   #87  <Method void ApduRequestList()>
	//   18   40:astore          5
		System.out.println("=======================test==============================================");
	//   19   42:getstatic       #93  <Field PrintStream System.out>
	//   20   45:ldc1            #95  <String "=======================test==============================================">
	//   21   47:invokevirtual   #100 <Method void PrintStream.println(String)>
		obj = ((Object) (messageHandler.createTag((byte)-96)));
	//   22   50:aload_0         
	//   23   51:getfield        #24  <Field IMessageHandler messageHandler>
	//   24   54:bipush          -96
	//   25   56:invokeinterface #104 <Method ITag IMessageHandler.createTag(byte)>
	//   26   61:astore_3        
		byte abyte0[] = new byte[9];
	//   27   62:bipush          9
	//   28   64:newarray        byte[]
	//   29   66:astore          6
		abyte0[0] = 1;
	//   30   68:aload           6
	//   31   70:iconst_0        
	//   32   71:iconst_1        
	//   33   72:bastore         
		abyte0[1] = 5;
	//   34   73:aload           6
	//   35   75:iconst_1        
	//   36   76:iconst_5        
	//   37   77:bastore         
		abyte0[3] = -92;
	//   38   78:aload           6
	//   39   80:iconst_3        
	//   40   81:bipush          -92
	//   41   83:bastore         
		abyte0[7] = -112;
	//   42   84:aload           6
	//   43   86:bipush          7
	//   44   88:bipush          -112
	//   45   90:bastore         
		try
		{
			((ITag) (obj)).addValue(abyte0);
	//   46   91:aload_3         
	//   47   92:aload           6
	//   48   94:invokeinterface #110 <Method int ITag.addValue(byte[])>
	//   49   99:pop             
		}
	//*  50  100:goto            110
		catch(FMCommunicationMessageException fmcommunicationmessageexception1)
	//*  51  103:astore          6
		{
			fmcommunicationmessageexception1.printStackTrace();
	//   52  105:aload           6
	//   53  107:invokevirtual   #59  <Method void FMCommunicationMessageException.printStackTrace()>
		}
		try
		{
			apdurequestlist.fromTag(((ITag) (obj)));
	//   54  110:aload           5
	//   55  112:aload_3         
	//   56  113:invokevirtual   #126 <Method void ApduRequestList.fromTag(ITag)>
		}
	//*  57  116:goto            144
		catch(FMScriptHandleException fmscripthandleexception)
	//*  58  119:astore_3        
		{
			System.out.println(Util4Java.getExceptionInfo(((Exception) (fmscripthandleexception))));
	//   59  120:getstatic       #93  <Field PrintStream System.out>
	//   60  123:aload_3         
	//   61  124:invokestatic    #122 <Method String Util4Java.getExceptionInfo(Exception)>
	//   62  127:invokevirtual   #100 <Method void PrintStream.println(String)>
		}
	//*  63  130:goto            144
		catch(FMCommunicationMessageException fmcommunicationmessageexception)
	//*  64  133:astore_3        
		{
			System.out.println(Util4Java.getExceptionInfo(((Exception) (fmcommunicationmessageexception))));
	//   65  134:getstatic       #93  <Field PrintStream System.out>
	//   66  137:aload_3         
	//   67  138:invokestatic    #122 <Method String Util4Java.getExceptionInfo(Exception)>
	//   68  141:invokevirtual   #100 <Method void PrintStream.println(String)>
		}
		fmcommunicationmessageexception = null;
	//   69  144:aconst_null     
	//   70  145:astore_3        
		obj1 = ((Object) (((ScriptHandler) (obj1)).execute(apdurequestlist)));
	//   71  146:aload           4
	//   72  148:aload           5
	//   73  150:invokeinterface #130 <Method ApduReponseList ScriptHandler.execute(ApduRequestList)>
	//   74  155:astore          4
		fmcommunicationmessageexception = ((FMCommunicationMessageException) (obj1));
	//   75  157:aload           4
	//   76  159:astore_3        
		break MISSING_BLOCK_LABEL_170;
	//   77  160:goto            170
		FMScriptHandleException fmscripthandleexception1;
		fmscripthandleexception1;
	//   78  163:astore          4
		fmscripthandleexception1.printStackTrace();
	//   79  165:aload           4
	//   80  167:invokevirtual   #131 <Method void FMScriptHandleException.printStackTrace()>
		ApduResponse aapduresponse[] = ((ApduReponseList) (fmcommunicationmessageexception)).getApduResponse();
	//   81  170:aload_3         
	//   82  171:invokevirtual   #137 <Method ApduResponse[] ApduReponseList.getApduResponse()>
	//   83  174:astore_3        
		System.out.println((new StringBuilder("apduReponses.length:")).append(aapduresponse.length).toString());
	//   84  175:getstatic       #93  <Field PrintStream System.out>
	//   85  178:new             #139 <Class StringBuilder>
	//   86  181:dup             
	//   87  182:ldc1            #141 <String "apduReponses.length:">
	//   88  184:invokespecial   #142 <Method void StringBuilder(String)>
	//   89  187:aload_3         
	//   90  188:arraylength     
	//   91  189:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   92  192:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   93  195:invokevirtual   #100 <Method void PrintStream.println(String)>
		int j = aapduresponse.length;
	//   94  198:aload_3         
	//   95  199:arraylength     
	//   96  200:istore_2        
		for(int i = 0; i < j; i++)
	//*  97  201:iconst_0        
	//*  98  202:istore_1        
	//*  99  203:goto            229
		{
			ApduResponse apduresponse = aapduresponse[i];
	//  100  206:aload_3         
	//  101  207:iload_1         
	//  102  208:aaload          
	//  103  209:astore          4
			System.out.println(FM_Bytes.bytesToHexString(apduresponse.getResult()));
	//  104  211:getstatic       #93  <Field PrintStream System.out>
	//  105  214:aload           4
	//  106  216:invokevirtual   #167 <Method byte[] ApduResponse.getResult()>
	//  107  219:invokestatic    #173 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  108  222:invokevirtual   #100 <Method void PrintStream.println(String)>
		}

	//  109  225:iload_1         
	//  110  226:iconst_1        
	//  111  227:iadd            
	//  112  228:istore_1        
	//  113  229:iload_1         
	//  114  230:iload_2         
	//  115  231:icmplt          206
		return;
	//  116  234:return          
	}

	private IMessageHandler messageHandler;
}
