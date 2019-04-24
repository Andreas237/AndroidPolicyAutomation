// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

public final class TurboFilterList extends CopyOnWriteArrayList
{

	public TurboFilterList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void CopyOnWriteArrayList()>
	//    2    4:return          
	}

	public FilterReply getTurboFilterChainDecision(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		int j = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int size()>
	//    2    4:istore          8
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(j == 1)
	//*   5    9:iload           8
	//*   6   11:iconst_1        
	//*   7   12:icmpne          42
		{
			try
			{
				marker = ((Marker) (((TurboFilter)get(0)).decide(marker, logger, level, s, aobj, throwable)));
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #26  <Method Object get(int)>
	//   11   20:checkcast       #28  <Class TurboFilter>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:aload           4
	//   16   28:aload           5
	//   17   30:aload           6
	//   18   32:invokevirtual   #31  <Method FilterReply TurboFilter.decide(Marker, Logger, Level, String, Object[], Throwable)>
	//   19   35:astore_1        
			}
	//*  20   36:aload_1         
	//*  21   37:areturn         
	//*  22   38:getstatic       #37  <Field FilterReply FilterReply.NEUTRAL>
	//*  23   41:areturn         
	//*  24   42:aload_0         
	//*  25   43:invokevirtual   #41  <Method Object[] toArray()>
	//*  26   46:astore          9
	//*  27   48:aload           9
	//*  28   50:arraylength     
	//*  29   51:istore          8
	//*  30   53:iload           7
	//*  31   55:iload           8
	//*  32   57:icmpge          113
	//*  33   60:aload           9
	//*  34   62:iload           7
	//*  35   64:aaload          
	//*  36   65:checkcast       #28  <Class TurboFilter>
	//*  37   68:aload_1         
	//*  38   69:aload_2         
	//*  39   70:aload_3         
	//*  40   71:aload           4
	//*  41   73:aload           5
	//*  42   75:aload           6
	//*  43   77:invokevirtual   #31  <Method FilterReply TurboFilter.decide(Marker, Logger, Level, String, Object[], Throwable)>
	//*  44   80:astore          10
	//*  45   82:aload           10
	//*  46   84:getstatic       #44  <Field FilterReply FilterReply.DENY>
	//*  47   87:if_acmpeq       110
	//*  48   90:aload           10
	//*  49   92:getstatic       #47  <Field FilterReply FilterReply.ACCEPT>
	//*  50   95:if_acmpne       101
	//*  51   98:aload           10
	//*  52  100:areturn         
	//*  53  101:iload           7
	//*  54  103:iconst_1        
	//*  55  104:iadd            
	//*  56  105:istore          7
	//*  57  107:goto            53
	//*  58  110:aload           10
	//*  59  112:areturn         
	//*  60  113:getstatic       #37  <Field FilterReply FilterReply.NEUTRAL>
	//*  61  116:areturn         
			// Misplaced declaration of an exception variable
			catch(Marker marker)
			{
				return FilterReply.NEUTRAL;
			}
			return ((FilterReply) (marker));
		}
		Object aobj1[] = toArray();
		for(int k = aobj1.length; i < k;)
		{
			FilterReply filterreply = ((TurboFilter)aobj1[i]).decide(marker, logger, level, s, aobj, throwable);
			if(filterreply != FilterReply.DENY)
			{
				if(filterreply == FilterReply.ACCEPT)
					return filterreply;
				i++;
			} else
			{
				return filterreply;
			}
		}

		return FilterReply.NEUTRAL;
	//*  62  117:astore_1        
	//*  63  118:goto            38
	}

	private static final long serialVersionUID = 1L;
}
