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

public abstract class AppenderBase extends ContextAwareBase
	implements Appender
{

	public AppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ContextAwareBase()>
		started = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean started>
		guard = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field boolean guard>
		fai = new FilterAttachableImpl();
	//    8   14:aload_0         
	//    9   15:new             #30  <Class FilterAttachableImpl>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void FilterAttachableImpl()>
	//   12   22:putfield        #33  <Field FilterAttachableImpl fai>
		statusRepeatCount = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #35  <Field int statusRepeatCount>
		exceptionCount = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #37  <Field int exceptionCount>
	//   19   35:return          
	}

	public void addFilter(Filter filter)
	{
		fai.addFilter(filter);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field FilterAttachableImpl fai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method void FilterAttachableImpl.addFilter(Filter)>
	//    4    8:return          
	}

	protected abstract void append(Object obj);

	public void clearAllFilters()
	{
		fai.clearAllFilters();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field FilterAttachableImpl fai>
	//    2    4:invokevirtual   #49  <Method void FilterAttachableImpl.clearAllFilters()>
	//    3    7:return          
	}

	public void doAppend(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = guard;
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field boolean guard>
	//    4    6:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_3         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		int i;
		guard = true;
	//   10   14:aload_0         
	//   11   15:iconst_1        
	//   12   16:putfield        #28  <Field boolean guard>
		if(started)
			break MISSING_BLOCK_LABEL_98;
	//   13   19:aload_0         
	//   14   20:getfield        #26  <Field boolean started>
	//   15   23:ifne            98
		i = statusRepeatCount;
	//   16   26:aload_0         
	//   17   27:getfield        #35  <Field int statusRepeatCount>
	//   18   30:istore_2        
		statusRepeatCount = i + 1;
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:putfield        #35  <Field int statusRepeatCount>
		if(i >= 5)
			break MISSING_BLOCK_LABEL_90;
	//   24   38:iload_2         
	//   25   39:iconst_5        
	//   26   40:icmpge          90
		obj = ((Object) (new StringBuilder()));
	//   27   43:new             #54  <Class StringBuilder>
	//   28   46:dup             
	//   29   47:invokespecial   #55  <Method void StringBuilder()>
	//   30   50:astore_1        
		((StringBuilder) (obj)).append("Attempted to append to non started appender [");
	//   31   51:aload_1         
	//   32   52:ldc1            #57  <String "Attempted to append to non started appender [">
	//   33   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   34   57:pop             
		((StringBuilder) (obj)).append(name);
	//   35   58:aload_1         
	//   36   59:aload_0         
	//   37   60:getfield        #62  <Field String name>
	//   38   63:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   39   66:pop             
		((StringBuilder) (obj)).append("].");
	//   40   67:aload_1         
	//   41   68:ldc1            #64  <String "].">
	//   42   70:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   43   73:pop             
		addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (obj)).toString(), ((Object) (this))))));
	//   44   74:aload_0         
	//   45   75:new             #66  <Class WarnStatus>
	//   46   78:dup             
	//   47   79:aload_1         
	//   48   80:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   49   83:aload_0         
	//   50   84:invokespecial   #73  <Method void WarnStatus(String, Object)>
	//   51   87:invokevirtual   #77  <Method void addStatus(ch.qos.logback.core.status.Status)>
		guard = false;
	//   52   90:aload_0         
	//   53   91:iconst_0        
	//   54   92:putfield        #28  <Field boolean guard>
		this;
	//   55   95:aload_0         
		JVM INSTR monitorexit ;
	//   56   96:monitorexit     
		return;
	//   57   97:return          
		FilterReply filterreply;
		FilterReply filterreply1;
		filterreply = getFilterChainDecision(obj);
	//   58   98:aload_0         
	//   59   99:aload_1         
	//   60  100:invokevirtual   #81  <Method FilterReply getFilterChainDecision(Object)>
	//   61  103:astore          4
		filterreply1 = FilterReply.DENY;
	//   62  105:getstatic       #87  <Field FilterReply FilterReply.DENY>
	//   63  108:astore          5
		if(filterreply != filterreply1)
			break MISSING_BLOCK_LABEL_125;
	//   64  110:aload           4
	//   65  112:aload           5
	//   66  114:if_acmpne       125
		guard = false;
	//   67  117:aload_0         
	//   68  118:iconst_0        
	//   69  119:putfield        #28  <Field boolean guard>
		this;
	//   70  122:aload_0         
		JVM INSTR monitorexit ;
	//   71  123:monitorexit     
		return;
	//   72  124:return          
		append(obj);
	//   73  125:aload_0         
	//   74  126:aload_1         
	//   75  127:invokevirtual   #89  <Method void append(Object)>
_L2:
		guard = false;
	//   76  130:aload_0         
	//   77  131:iconst_0        
	//   78  132:putfield        #28  <Field boolean guard>
		break; /* Loop/switch isn't completed */
	//   79  135:goto            208
		obj;
	//   80  138:astore_1        
		break MISSING_BLOCK_LABEL_211;
	//   81  139:goto            211
		obj;
	//   82  142:astore_1        
		i = exceptionCount;
	//   83  143:aload_0         
	//   84  144:getfield        #37  <Field int exceptionCount>
	//   85  147:istore_2        
		exceptionCount = i + 1;
	//   86  148:aload_0         
	//   87  149:iload_2         
	//   88  150:iconst_1        
	//   89  151:iadd            
	//   90  152:putfield        #37  <Field int exceptionCount>
		if(i >= 5)
			continue; /* Loop/switch isn't completed */
	//   91  155:iload_2         
	//   92  156:iconst_5        
	//   93  157:icmpge          130
		StringBuilder stringbuilder = new StringBuilder();
	//   94  160:new             #54  <Class StringBuilder>
	//   95  163:dup             
	//   96  164:invokespecial   #55  <Method void StringBuilder()>
	//   97  167:astore          4
		stringbuilder.append("Appender [");
	//   98  169:aload           4
	//   99  171:ldc1            #91  <String "Appender [">
	//  100  173:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//  101  176:pop             
		stringbuilder.append(name);
	//  102  177:aload           4
	//  103  179:aload_0         
	//  104  180:getfield        #62  <Field String name>
	//  105  183:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//  106  186:pop             
		stringbuilder.append("] failed to append.");
	//  107  187:aload           4
	//  108  189:ldc1            #93  <String "] failed to append.">
	//  109  191:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//  110  194:pop             
		addError(stringbuilder.toString(), ((Throwable) (obj)));
	//  111  195:aload_0         
	//  112  196:aload           4
	//  113  198:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  114  201:aload_1         
	//  115  202:invokevirtual   #97  <Method void addError(String, Throwable)>
		if(true) goto _L2; else goto _L1
	//  116  205:goto            130
_L1:
		this;
	//  117  208:aload_0         
		JVM INSTR monitorexit ;
	//  118  209:monitorexit     
		return;
	//  119  210:return          
		guard = false;
	//  120  211:aload_0         
	//  121  212:iconst_0        
	//  122  213:putfield        #28  <Field boolean guard>
		throw obj;
	//  123  216:aload_1         
	//  124  217:athrow          
		obj;
	//  125  218:astore_1        
		this;
	//  126  219:aload_0         
		JVM INSTR monitorexit ;
	//  127  220:monitorexit     
		throw obj;
	//  128  221:aload_1         
	//  129  222:athrow          
	}

	public List getCopyOfAttachedFiltersList()
	{
		return fai.getCopyOfAttachedFiltersList();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field FilterAttachableImpl fai>
	//    2    4:invokevirtual   #102 <Method List FilterAttachableImpl.getCopyOfAttachedFiltersList()>
	//    3    7:areturn         
	}

	public FilterReply getFilterChainDecision(Object obj)
	{
		return fai.getFilterChainDecision(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field FilterAttachableImpl fai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method FilterReply FilterAttachableImpl.getFilterChainDecision(Object)>
	//    4    8:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String name>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String name>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #26  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #26  <Field boolean started>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #118 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #122 <Method String Class.getName()>
	//    8   16:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_1         
	//   11   21:ldc1            #124 <String "[">
	//   12   23:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(name);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #62  <Field String name>
	//   17   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append("]");
	//   19   36:aload_1         
	//   20   37:ldc1            #126 <String "]">
	//   21   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		return stringbuilder.toString();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   25   47:areturn         
	}

	static final int ALLOWED_REPEATS = 5;
	private int exceptionCount;
	private FilterAttachableImpl fai;
	private boolean guard;
	protected String name;
	protected boolean started;
	private int statusRepeatCount;
}
