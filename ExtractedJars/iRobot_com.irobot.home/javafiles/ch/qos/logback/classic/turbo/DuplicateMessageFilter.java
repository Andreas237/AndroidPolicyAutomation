// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.Marker;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			TurboFilter, LRUMessageCache

public class DuplicateMessageFilter extends TurboFilter
{

	public DuplicateMessageFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void TurboFilter()>
		allowedRepetitions = 5;
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #19  <Field int allowedRepetitions>
		cacheSize = 100;
	//    5    9:aload_0         
	//    6   10:bipush          100
	//    7   12:putfield        #21  <Field int cacheSize>
	//    8   15:return          
	}

	public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		if(msgCache.getMessageCountAndThenIncrement(s) <= allowedRepetitions)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field LRUMessageCache msgCache>
	//*   2    4:aload           4
	//*   3    6:invokevirtual   #32  <Method int LRUMessageCache.getMessageCountAndThenIncrement(String)>
	//*   4    9:aload_0         
	//*   5   10:getfield        #19  <Field int allowedRepetitions>
	//*   6   13:icmpgt          20
			return FilterReply.NEUTRAL;
	//    7   16:getstatic       #38  <Field FilterReply FilterReply.NEUTRAL>
	//    8   19:areturn         
		else
			return FilterReply.DENY;
	//    9   20:getstatic       #41  <Field FilterReply FilterReply.DENY>
	//   10   23:areturn         
	}

	public int getAllowedRepetitions()
	{
		return allowedRepetitions;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int allowedRepetitions>
	//    2    4:ireturn         
	}

	public int getCacheSize()
	{
		return cacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int cacheSize>
	//    2    4:ireturn         
	}

	public void setAllowedRepetitions(int i)
	{
		allowedRepetitions = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int allowedRepetitions>
	//    3    5:return          
	}

	public void setCacheSize(int i)
	{
		cacheSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int cacheSize>
	//    3    5:return          
	}

	public void start()
	{
		msgCache = new LRUMessageCache(cacheSize);
	//    0    0:aload_0         
	//    1    1:new             #28  <Class LRUMessageCache>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field int cacheSize>
	//    5    9:invokespecial   #50  <Method void LRUMessageCache(int)>
	//    6   12:putfield        #26  <Field LRUMessageCache msgCache>
		super.start();
	//    7   15:aload_0         
	//    8   16:invokespecial   #52  <Method void TurboFilter.start()>
	//    9   19:return          
	}

	public void stop()
	{
		msgCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field LRUMessageCache msgCache>
	//    2    4:invokevirtual   #56  <Method void LRUMessageCache.clear()>
		msgCache = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #26  <Field LRUMessageCache msgCache>
		super.stop();
	//    6   12:aload_0         
	//    7   13:invokespecial   #58  <Method void TurboFilter.stop()>
	//    8   16:return          
	}

	public static final int DEFAULT_ALLOWED_REPETITIONS = 5;
	public static final int DEFAULT_CACHE_SIZE = 100;
	public int allowedRepetitions;
	public int cacheSize;
	private LRUMessageCache msgCache;
}
