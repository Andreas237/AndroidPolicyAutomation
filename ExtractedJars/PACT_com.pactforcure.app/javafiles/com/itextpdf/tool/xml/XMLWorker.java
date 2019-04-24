// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.parser.XMLParserListener;
import com.itextpdf.tool.xml.pipeline.ctx.WorkerContextImpl;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml:
//			WorkerContext, Tag, PipelineException, ProcessObject, 
//			Pipeline

public class XMLWorker
	implements XMLParserListener
{

	public XMLWorker(Pipeline pipeline, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		parseHtml = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #28  <Field boolean parseHtml>
		rootpPipe = pipeline;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field Pipeline rootpPipe>
	//    8   14:return          
	}

	protected static void closeLocalWC()
	{
		context.remove();
	//    0    0:getstatic       #23  <Field ThreadLocal context>
	//    1    3:invokevirtual   #38  <Method void ThreadLocal.remove()>
	//    2    6:return          
	}

	protected static WorkerContext getLocalWC()
	{
		return (WorkerContext)context.get();
	//    0    0:getstatic       #23  <Field ThreadLocal context>
	//    1    3:invokevirtual   #44  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #46  <Class WorkerContext>
	//    3    9:areturn         
	}

	public void close()
	{
		closeLocalWC();
	//    0    0:invokestatic    #49  <Method void closeLocalWC()>
	//    1    3:return          
	}

	public void comment(String s)
	{
	//    0    0:return          
	}

	protected Tag createTag(String s, Map map, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(parseHtml)
	//*   2    3:aload_0         
	//*   3    4:getfield        #28  <Field boolean parseHtml>
	//*   4    7:ifeq            16
			s2 = s.toLowerCase();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #59  <Method String String.toLowerCase()>
	//    7   14:astore          4
		return new Tag(s2, map, s1);
	//    8   16:new             #61  <Class Tag>
	//    9   19:dup             
	//   10   20:aload           4
	//   11   22:aload_2         
	//   12   23:aload_3         
	//   13   24:invokespecial   #64  <Method void Tag(String, Map, String)>
	//   14   27:areturn         
	}

	public void endElement(String s, String s1)
	{
		WorkerContext workercontext;
		ProcessObject processobject;
		if(parseHtml)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean parseHtml>
	//*   2    4:ifeq            80
			s = s.toLowerCase();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #59  <Method String String.toLowerCase()>
	//    5   11:astore_1        
		workercontext = getLocalWC();
	//    6   12:invokestatic    #71  <Method WorkerContext getLocalWC()>
	//    7   15:astore_3        
		if(workercontext.getCurrentTag() != null && !s.equals(((Object) (workercontext.getCurrentTag().getName()))))
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  10   22:ifnull          83
	//*  11   25:aload_1         
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  14   32:invokevirtual   #78  <Method String Tag.getName()>
	//*  15   35:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  16   38:ifne            83
			throw new RuntimeWorkerException(String.format(LocaleMessages.getInstance().getMessage("tag.invalidnesting"), new Object[] {
				s, workercontext.getCurrentTag().getName()
			}));
	//   17   41:new             #84  <Class RuntimeWorkerException>
	//   18   44:dup             
	//   19   45:invokestatic    #90  <Method LocaleMessages LocaleMessages.getInstance()>
	//   20   48:ldc1            #92  <String "tag.invalidnesting">
	//   21   50:invokevirtual   #96  <Method String LocaleMessages.getMessage(String)>
	//   22   53:iconst_2        
	//   23   54:anewarray       Object[]
	//   24   57:dup             
	//   25   58:iconst_0        
	//   26   59:aload_1         
	//   27   60:aastore         
	//   28   61:dup             
	//   29   62:iconst_1        
	//   30   63:aload_3         
	//   31   64:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   32   69:invokevirtual   #78  <Method String Tag.getName()>
	//   33   72:aastore         
	//   34   73:invokestatic    #100 <Method String String.format(String, Object[])>
	//   35   76:invokespecial   #102 <Method void RuntimeWorkerException(String)>
	//   36   79:athrow          
	//*  37   80:goto            12
		s = ((String) (rootpPipe));
	//   38   83:aload_0         
	//   39   84:getfield        #30  <Field Pipeline rootpPipe>
	//   40   87:astore_1        
		processobject = new ProcessObject();
	//   41   88:new             #104 <Class ProcessObject>
	//   42   91:dup             
	//   43   92:invokespecial   #105 <Method void ProcessObject()>
	//   44   95:astore          4
_L2:
		s1 = ((String) (((Pipeline) (s)).close(workercontext, workercontext.getCurrentTag(), processobject)));
	//   45   97:aload_1         
	//   46   98:aload_3         
	//   47   99:aload_3         
	//   48  100:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   49  105:aload           4
	//   50  107:invokeinterface #110 <Method Pipeline Pipeline.close(WorkerContext, Tag, ProcessObject)>
	//   51  112:astore_2        
		s = s1;
	//   52  113:aload_2         
	//   53  114:astore_1        
		if(s1 == null)
	//*  54  115:aload_2         
	//*  55  116:ifnonnull       97
		{
			if(workercontext.getCurrentTag() != null)
	//*  56  119:aload_3         
	//*  57  120:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  58  125:ifnull          143
				workercontext.setCurrentTag(workercontext.getCurrentTag().getParent());
	//   59  128:aload_3         
	//   60  129:aload_3         
	//   61  130:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   62  135:invokevirtual   #113 <Method Tag Tag.getParent()>
	//   63  138:invokeinterface #117 <Method void WorkerContext.setCurrentTag(Tag)>
			return;
	//   64  143:return          
		}
		if(true) goto _L2; else goto _L1
_L1:
		s;
	//   65  144:astore_1        
		throw new RuntimeWorkerException(((Throwable) (s)));
	//   66  145:new             #84  <Class RuntimeWorkerException>
	//   67  148:dup             
	//   68  149:aload_1         
	//   69  150:invokespecial   #120 <Method void RuntimeWorkerException(Throwable)>
	//   70  153:athrow          
		s;
	//   71  154:astore_1        
		if(workercontext.getCurrentTag() != null)
	//*  72  155:aload_3         
	//*  73  156:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  74  161:ifnull          179
			workercontext.setCurrentTag(workercontext.getCurrentTag().getParent());
	//   75  164:aload_3         
	//   76  165:aload_3         
	//   77  166:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   78  171:invokevirtual   #113 <Method Tag Tag.getParent()>
	//   79  174:invokeinterface #117 <Method void WorkerContext.setCurrentTag(Tag)>
		throw s;
	//   80  179:aload_1         
	//   81  180:athrow          
	}

	protected Tag getCurrentTag()
	{
		return getLocalWC().getCurrentTag();
	//    0    0:invokestatic    #71  <Method WorkerContext getLocalWC()>
	//    1    3:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//    2    8:areturn         
	}

	protected boolean ignoreCdata()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void init()
	{
		Pipeline pipeline = rootpPipe;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Pipeline rootpPipe>
	//    2    4:astore_1        
		do
		{
			Pipeline pipeline1;
			try
			{
				pipeline1 = pipeline.init(getLocalWC());
	//    3    5:aload_1         
	//    4    6:invokestatic    #71  <Method WorkerContext getLocalWC()>
	//    5    9:invokeinterface #126 <Method Pipeline Pipeline.init(WorkerContext)>
	//    6   14:astore_2        
			}
	//*   7   15:aload_2         
	//*   8   16:astore_1        
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       5
	//*  11   21:return          
			catch(PipelineException pipelineexception)
	//*  12   22:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (pipelineexception)));
	//   13   23:new             #84  <Class RuntimeWorkerException>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #120 <Method void RuntimeWorkerException(Throwable)>
	//   17   31:athrow          
			}
			pipeline = pipeline1;
		} while(pipeline1 != null);
	}

	public void startElement(String s, Map map, String s1)
	{
		s1 = ((String) (createTag(s, map, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #129 <Method Tag createTag(String, Map, String)>
	//    5    7:astore_3        
		WorkerContext workercontext = getLocalWC();
	//    6    8:invokestatic    #71  <Method WorkerContext getLocalWC()>
	//    7   11:astore          4
		if(workercontext.getCurrentTag() != null)
	//*   8   13:aload           4
	//*   9   15:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  10   20:ifnull          34
			workercontext.getCurrentTag().addChild(((Tag) (s1)));
	//   11   23:aload           4
	//   12   25:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   13   30:aload_3         
	//   14   31:invokevirtual   #132 <Method void Tag.addChild(Tag)>
		workercontext.setCurrentTag(((Tag) (s1)));
	//   15   34:aload           4
	//   16   36:aload_3         
	//   17   37:invokeinterface #117 <Method void WorkerContext.setCurrentTag(Tag)>
		s = ((String) (rootpPipe));
	//   18   42:aload_0         
	//   19   43:getfield        #30  <Field Pipeline rootpPipe>
	//   20   46:astore_1        
		ProcessObject processobject = new ProcessObject();
	//   21   47:new             #104 <Class ProcessObject>
	//   22   50:dup             
	//   23   51:invokespecial   #105 <Method void ProcessObject()>
	//   24   54:astore          5
		do
		{
			try
			{
				map = ((Map) (((Pipeline) (s)).open(workercontext, ((Tag) (s1)), processobject)));
	//   25   56:aload_1         
	//   26   57:aload           4
	//   27   59:aload_3         
	//   28   60:aload           5
	//   29   62:invokeinterface #135 <Method Pipeline Pipeline.open(WorkerContext, Tag, ProcessObject)>
	//   30   67:astore_2        
			}
	//*  31   68:aload_2         
	//*  32   69:astore_1        
	//*  33   70:aload_2         
	//*  34   71:ifnonnull       56
	//*  35   74:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  36   75:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (s)));
	//   37   76:new             #84  <Class RuntimeWorkerException>
	//   38   79:dup             
	//   39   80:aload_1         
	//   40   81:invokespecial   #120 <Method void RuntimeWorkerException(Throwable)>
	//   41   84:athrow          
			}
			s = ((String) (map));
		} while(map != null);
	}

	public void text(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!s.startsWith("<![CDATA[")) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ldc1            #139 <String "<![CDATA[">
	//    4    5:invokevirtual   #143 <Method boolean String.startsWith(String)>
	//    5    8:ifeq            43
_L1:
		s1 = s;
	//    6   11:aload_1         
	//    7   12:astore_2        
		if(!s.endsWith("]]>")) goto _L2; else goto _L3
	//    8   13:aload_1         
	//    9   14:ldc1            #145 <String "]]>">
	//   10   16:invokevirtual   #148 <Method boolean String.endsWith(String)>
	//   11   19:ifeq            43
_L3:
		if(!ignoreCdata()) goto _L5; else goto _L4
	//   12   22:aload_0         
	//   13   23:invokevirtual   #150 <Method boolean ignoreCdata()>
	//   14   26:ifeq            30
_L4:
		return;
	//   15   29:return          
_L5:
		s1 = s.substring(9, s.length() - 3);
	//   16   30:aload_1         
	//   17   31:bipush          9
	//   18   33:aload_1         
	//   19   34:invokevirtual   #154 <Method int String.length()>
	//   20   37:iconst_3        
	//   21   38:isub            
	//   22   39:invokevirtual   #158 <Method String String.substring(int, int)>
	//   23   42:astore_2        
_L2:
		WorkerContext workercontext = getLocalWC();
	//   24   43:invokestatic    #71  <Method WorkerContext getLocalWC()>
	//   25   46:astore_3        
		if(workercontext.getCurrentTag() != null && s1.length() > 0)
	//*  26   47:aload_3         
	//*  27   48:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//*  28   53:ifnull          29
	//*  29   56:aload_2         
	//*  30   57:invokevirtual   #154 <Method int String.length()>
	//*  31   60:ifle            29
		{
			s = ((String) (rootpPipe));
	//   32   63:aload_0         
	//   33   64:getfield        #30  <Field Pipeline rootpPipe>
	//   34   67:astore_1        
			ProcessObject processobject = new ProcessObject();
	//   35   68:new             #104 <Class ProcessObject>
	//   36   71:dup             
	//   37   72:invokespecial   #105 <Method void ProcessObject()>
	//   38   75:astore          4
			do
				try
				{
					s = ((String) (((Pipeline) (s)).content(workercontext, workercontext.getCurrentTag(), s1, processobject)));
	//   39   77:aload_1         
	//   40   78:aload_3         
	//   41   79:aload_3         
	//   42   80:invokeinterface #75  <Method Tag WorkerContext.getCurrentTag()>
	//   43   85:aload_2         
	//   44   86:aload           4
	//   45   88:invokeinterface #162 <Method Pipeline Pipeline.content(WorkerContext, Tag, String, ProcessObject)>
	//   46   93:astore_1        
				}
	//*  47   94:aload_1         
	//*  48   95:ifnull          29
	//*  49   98:goto            77
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  50  101:astore_1        
				{
					throw new RuntimeWorkerException(((Throwable) (s)));
	//   51  102:new             #84  <Class RuntimeWorkerException>
	//   52  105:dup             
	//   53  106:aload_1         
	//   54  107:invokespecial   #120 <Method void RuntimeWorkerException(Throwable)>
	//   55  110:athrow          
				}
			while(s != null);
		}
		if(true) goto _L4; else goto _L6
_L6:
	}

	public void unknownText(String s)
	{
	//    0    0:return          
	}

	private static ThreadLocal context = new ThreadLocal() {

		protected WorkerContextImpl initialValue()
		{
			return new WorkerContextImpl();
		//    0    0:new             #16  <Class WorkerContextImpl>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void WorkerContextImpl()>
		//    3    7:areturn         
		}

		protected volatile Object initialValue()
		{
			return ((Object) (initialValue()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #20  <Method WorkerContextImpl initialValue()>
		//    2    4:areturn         
		}

	}
;
	protected final boolean parseHtml;
	protected final Pipeline rootpPipe;

	static 
	{
	//    0    0:new             #8   <Class XMLWorker$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void XMLWorker$1()>
	//    3    7:putstatic       #23  <Field ThreadLocal context>
	//*   4   10:return          
	}
}
