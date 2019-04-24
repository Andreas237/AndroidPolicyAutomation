// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

// Referenced classes of package ch.qos.logback.core:
//			Appender

public abstract class UnsynchronizedAppenderBase extends ContextAwareBase
	implements Appender
{

	public UnsynchronizedAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ContextAwareBase()>
		started = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean started>
		guard = new ThreadLocal();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ThreadLocal>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void ThreadLocal()>
	//    9   17:putfield        #33  <Field ThreadLocal guard>
		fai = new FilterAttachableImpl();
	//   10   20:aload_0         
	//   11   21:new             #35  <Class FilterAttachableImpl>
	//   12   24:dup             
	//   13   25:invokespecial   #36  <Method void FilterAttachableImpl()>
	//   14   28:putfield        #38  <Field FilterAttachableImpl fai>
		statusRepeatCount = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #40  <Field int statusRepeatCount>
		exceptionCount = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #42  <Field int exceptionCount>
	//   21   41:return          
	}

	public void addFilter(Filter filter)
	{
		fai.addFilter(filter);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FilterAttachableImpl fai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method void FilterAttachableImpl.addFilter(Filter)>
	//    4    8:return          
	}

	protected abstract void append(Object obj);

	public void clearAllFilters()
	{
		fai.clearAllFilters();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FilterAttachableImpl fai>
	//    2    4:invokevirtual   #54  <Method void FilterAttachableImpl.clearAllFilters()>
	//    3    7:return          
	}

	public void doAppend(Object obj)
	{
		if(Boolean.TRUE.equals(guard.get()))
	//*   0    0:getstatic       #63  <Field Boolean Boolean.TRUE>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field ThreadLocal guard>
	//*   3    7:invokevirtual   #67  <Method Object ThreadLocal.get()>
	//*   4   10:invokevirtual   #71  <Method boolean Boolean.equals(Object)>
	//*   5   13:ifeq            17
			return;
	//    6   16:return          
		guard.set(((Object) (Boolean.TRUE)));
	//    7   17:aload_0         
	//    8   18:getfield        #33  <Field ThreadLocal guard>
	//    9   21:getstatic       #63  <Field Boolean Boolean.TRUE>
	//   10   24:invokevirtual   #74  <Method void ThreadLocal.set(Object)>
		if(started) goto _L2; else goto _L1
	//   11   27:aload_0         
	//   12   28:getfield        #28  <Field boolean started>
	//   13   31:ifne            109
_L1:
		int i;
		i = statusRepeatCount;
	//   14   34:aload_0         
	//   15   35:getfield        #40  <Field int statusRepeatCount>
	//   16   38:istore_2        
		statusRepeatCount = i + 1;
	//   17   39:aload_0         
	//   18   40:iload_2         
	//   19   41:iconst_1        
	//   20   42:iadd            
	//   21   43:putfield        #40  <Field int statusRepeatCount>
		if(i >= 3)
			break MISSING_BLOCK_LABEL_98;
	//   22   46:iload_2         
	//   23   47:iconst_3        
	//   24   48:icmpge          98
		obj = ((Object) (new StringBuilder()));
	//   25   51:new             #76  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #77  <Method void StringBuilder()>
	//   28   58:astore_1        
		((StringBuilder) (obj)).append("Attempted to append to non started appender [");
	//   29   59:aload_1         
	//   30   60:ldc1            #79  <String "Attempted to append to non started appender [">
	//   31   62:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		((StringBuilder) (obj)).append(name);
	//   33   66:aload_1         
	//   34   67:aload_0         
	//   35   68:getfield        #84  <Field String name>
	//   36   71:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
		((StringBuilder) (obj)).append("].");
	//   38   75:aload_1         
	//   39   76:ldc1            #86  <String "].">
	//   40   78:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
		addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (obj)).toString(), ((Object) (this))))));
	//   42   82:aload_0         
	//   43   83:new             #88  <Class WarnStatus>
	//   44   86:dup             
	//   45   87:aload_1         
	//   46   88:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   47   91:aload_0         
	//   48   92:invokespecial   #95  <Method void WarnStatus(String, Object)>
	//   49   95:invokevirtual   #99  <Method void addStatus(ch.qos.logback.core.status.Status)>
_L3:
		guard.set(((Object) (Boolean.FALSE)));
	//   50   98:aload_0         
	//   51   99:getfield        #33  <Field ThreadLocal guard>
	//   52  102:getstatic       #102 <Field Boolean Boolean.FALSE>
	//   53  105:invokevirtual   #74  <Method void ThreadLocal.set(Object)>
		return;
	//   54  108:return          
_L2:
		if(getFilterChainDecision(obj) != FilterReply.DENY) goto _L4; else goto _L3
	//   55  109:aload_0         
	//   56  110:aload_1         
	//   57  111:invokevirtual   #106 <Method FilterReply getFilterChainDecision(Object)>
	//   58  114:getstatic       #112 <Field FilterReply FilterReply.DENY>
	//   59  117:if_acmpne       123
	//*  60  120:goto            98
_L4:
		try
		{
			append(obj);
	//   61  123:aload_0         
	//   62  124:aload_1         
	//   63  125:invokevirtual   #114 <Method void append(Object)>
			break MISSING_BLOCK_LABEL_193;
	//   64  128:goto            193
		}
	//*  65  131:astore_1        
	//*  66  132:goto            204
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   67  135:astore_1        
		break MISSING_BLOCK_LABEL_136;
		obj;
		break MISSING_BLOCK_LABEL_204;
		i = exceptionCount;
	//   68  136:aload_0         
	//   69  137:getfield        #42  <Field int exceptionCount>
	//   70  140:istore_2        
		exceptionCount = i + 1;
	//   71  141:aload_0         
	//   72  142:iload_2         
	//   73  143:iconst_1        
	//   74  144:iadd            
	//   75  145:putfield        #42  <Field int exceptionCount>
		if(i >= 3)
			break MISSING_BLOCK_LABEL_193;
	//   76  148:iload_2         
	//   77  149:iconst_3        
	//   78  150:icmpge          193
		StringBuilder stringbuilder = new StringBuilder();
	//   79  153:new             #76  <Class StringBuilder>
	//   80  156:dup             
	//   81  157:invokespecial   #77  <Method void StringBuilder()>
	//   82  160:astore_3        
		stringbuilder.append("Appender [");
	//   83  161:aload_3         
	//   84  162:ldc1            #116 <String "Appender [">
	//   85  164:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   86  167:pop             
		stringbuilder.append(name);
	//   87  168:aload_3         
	//   88  169:aload_0         
	//   89  170:getfield        #84  <Field String name>
	//   90  173:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   91  176:pop             
		stringbuilder.append("] failed to append.");
	//   92  177:aload_3         
	//   93  178:ldc1            #118 <String "] failed to append.">
	//   94  180:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   95  183:pop             
		addError(stringbuilder.toString(), ((Throwable) (obj)));
	//   96  184:aload_0         
	//   97  185:aload_3         
	//   98  186:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   99  189:aload_1         
	//  100  190:invokevirtual   #122 <Method void addError(String, Throwable)>
		guard.set(((Object) (Boolean.FALSE)));
	//  101  193:aload_0         
	//  102  194:getfield        #33  <Field ThreadLocal guard>
	//  103  197:getstatic       #102 <Field Boolean Boolean.FALSE>
	//  104  200:invokevirtual   #74  <Method void ThreadLocal.set(Object)>
		return;
	//  105  203:return          
		guard.set(((Object) (Boolean.FALSE)));
	//  106  204:aload_0         
	//  107  205:getfield        #33  <Field ThreadLocal guard>
	//  108  208:getstatic       #102 <Field Boolean Boolean.FALSE>
	//  109  211:invokevirtual   #74  <Method void ThreadLocal.set(Object)>
		throw obj;
	//  110  214:aload_1         
	//  111  215:athrow          
	}

	public List getCopyOfAttachedFiltersList()
	{
		return fai.getCopyOfAttachedFiltersList();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FilterAttachableImpl fai>
	//    2    4:invokevirtual   #127 <Method List FilterAttachableImpl.getCopyOfAttachedFiltersList()>
	//    3    7:areturn         
	}

	public FilterReply getFilterChainDecision(Object obj)
	{
		return fai.getFilterChainDecision(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FilterAttachableImpl fai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method FilterReply FilterAttachableImpl.getFilterChainDecision(Object)>
	//    4    8:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String name>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String name>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #28  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field boolean started>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #143 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #147 <Method String Class.getName()>
	//    8   16:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_1         
	//   11   21:ldc1            #149 <String "[">
	//   12   23:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(name);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #84  <Field String name>
	//   17   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append("]");
	//   19   36:aload_1         
	//   20   37:ldc1            #151 <String "]">
	//   21   39:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		return stringbuilder.toString();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   25   47:areturn         
	}

	static final int ALLOWED_REPEATS = 3;
	private int exceptionCount;
	private FilterAttachableImpl fai;
	private ThreadLocal guard;
	protected String name;
	protected boolean started;
	private int statusRepeatCount;
}
