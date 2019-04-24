// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class MDCConverter extends ClassicConverter
{

	public MDCConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ClassicConverter()>
		defaultValue = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <String "">
	//    4    7:putfield        #15  <Field String defaultValue>
	//    5   10:return          
	}

	private String outputMDCForAllKeys(Map map)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_3        
		map = ((Map) (map.entrySet().iterator()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #27  <Method Set Map.entrySet()>
	//    6   14:invokeinterface #33  <Method Iterator Set.iterator()>
	//    7   19:astore_1        
		boolean flag = true;
	//    8   20:iconst_1        
	//    9   21:istore_2        
		java.util.Map.Entry entry;
		for(; ((Iterator) (map)).hasNext(); stringbuilder.append((String)entry.getValue()))
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            98
		{
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #43  <Method Object Iterator.next()>
	//   15   37:checkcast       #45  <Class java.util.Map$Entry>
	//   16   40:astore          4
			if(flag)
	//*  17   42:iload_2         
	//*  18   43:ifeq            51
				flag = false;
	//   19   46:iconst_0        
	//   20   47:istore_2        
			else
	//*  21   48:goto            58
				stringbuilder.append(", ");
	//   22   51:aload_3         
	//   23   52:ldc1            #47  <String ", ">
	//   24   54:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			stringbuilder.append((String)entry.getKey());
	//   26   58:aload_3         
	//   27   59:aload           4
	//   28   61:invokeinterface #54  <Method Object java.util.Map$Entry.getKey()>
	//   29   66:checkcast       #56  <Class String>
	//   30   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   31   72:pop             
			stringbuilder.append('=');
	//   32   73:aload_3         
	//   33   74:bipush          61
	//   34   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//   35   79:pop             
		}

	//   36   80:aload_3         
	//   37   81:aload           4
	//   38   83:invokeinterface #62  <Method Object java.util.Map$Entry.getValue()>
	//   39   88:checkcast       #56  <Class String>
	//   40   91:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   41   94:pop             
	//*  42   95:goto            22
		return stringbuilder.toString();
	//   43   98:aload_3         
	//   44   99:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   45  102:areturn         
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		Map map = iloggingevent.getMDCPropertyMap();
	//    0    0:aload_1         
	//    1    1:invokeinterface #76  <Method Map ILoggingEvent.getMDCPropertyMap()>
	//    2    6:astore_2        
		if(map == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       16
			return defaultValue;
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field String defaultValue>
	//    7   15:areturn         
		if(key == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #78  <Field String key>
	//*  10   20:ifnonnull       29
			return outputMDCForAllKeys(map);
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:invokespecial   #80  <Method String outputMDCForAllKeys(Map)>
	//   14   28:areturn         
		iloggingevent = ((ILoggingEvent) ((String)iloggingevent.getMDCPropertyMap().get(((Object) (key)))));
	//   15   29:aload_1         
	//   16   30:invokeinterface #76  <Method Map ILoggingEvent.getMDCPropertyMap()>
	//   17   35:aload_0         
	//   18   36:getfield        #78  <Field String key>
	//   19   39:invokeinterface #84  <Method Object Map.get(Object)>
	//   20   44:checkcast       #56  <Class String>
	//   21   47:astore_1        
		if(iloggingevent != null)
	//*  22   48:aload_1         
	//*  23   49:ifnull          54
			return ((String) (iloggingevent));
	//   24   52:aload_1         
	//   25   53:areturn         
		else
			return defaultValue;
	//   26   54:aload_0         
	//   27   55:getfield        #15  <Field String defaultValue>
	//   28   58:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #72  <Class ILoggingEvent>
	//    3    5:invokevirtual   #87  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	public void start()
	{
		String as[] = OptionHelper.extractDefaultReplacement(getFirstOption());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method String getFirstOption()>
	//    2    4:invokestatic    #97  <Method String[] OptionHelper.extractDefaultReplacement(String)>
	//    3    7:astore_1        
		key = as[0];
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:aaload          
	//    8   12:putfield        #78  <Field String key>
		if(as[1] != null)
	//*   9   15:aload_1         
	//*  10   16:iconst_1        
	//*  11   17:aaload          
	//*  12   18:ifnull          28
			defaultValue = as[1];
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iconst_1        
	//   16   24:aaload          
	//   17   25:putfield        #15  <Field String defaultValue>
		super.start();
	//   18   28:aload_0         
	//   19   29:invokespecial   #99  <Method void ClassicConverter.start()>
	//   20   32:return          
	}

	public void stop()
	{
		key = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #78  <Field String key>
		super.stop();
	//    3    5:aload_0         
	//    4    6:invokespecial   #102 <Method void ClassicConverter.stop()>
	//    5    9:return          
	}

	private String defaultValue;
	private String key;
}
