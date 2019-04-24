// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;
import java.util.Map;

public class LoggerContextVO
	implements Serializable
{

	public LoggerContextVO(LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		name = loggercontext.getName();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method String LoggerContext.getName()>
	//    5    9:putfield        #29  <Field String name>
		propertyMap = loggercontext.getCopyOfPropertyMap();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #33  <Method Map LoggerContext.getCopyOfPropertyMap()>
	//    9   17:putfield        #35  <Field Map propertyMap>
		birthTime = loggercontext.getBirthTime();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #39  <Method long LoggerContext.getBirthTime()>
	//   13   25:putfield        #41  <Field long birthTime>
	//   14   28:return          
	}

	public LoggerContextVO(String s, Map map, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field String name>
		propertyMap = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field Map propertyMap>
		birthTime = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #41  <Field long birthTime>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LoggerContextVO))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LoggerContextVO>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LoggerContextVO)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LoggerContextVO>
	//   12   20:astore_1        
		if(birthTime != ((LoggerContextVO) (obj)).birthTime)
	//*  13   21:aload_0         
	//*  14   22:getfield        #41  <Field long birthTime>
	//*  15   25:aload_1         
	//*  16   26:getfield        #41  <Field long birthTime>
	//*  17   29:lcmp            
	//*  18   30:ifeq            35
			return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         
		if(name != null)
	//*  21   35:aload_0         
	//*  22   36:getfield        #29  <Field String name>
	//*  23   39:ifnull          58
		{
			if(!name.equals(((Object) (((LoggerContextVO) (obj)).name))))
	//*  24   42:aload_0         
	//*  25   43:getfield        #29  <Field String name>
	//*  26   46:aload_1         
	//*  27   47:getfield        #29  <Field String name>
	//*  28   50:invokevirtual   #51  <Method boolean String.equals(Object)>
	//*  29   53:ifne            67
				return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		if(((LoggerContextVO) (obj)).name != null)
	//*  32   58:aload_1         
	//*  33   59:getfield        #29  <Field String name>
	//*  34   62:ifnull          67
			return false;
	//   35   65:iconst_0        
	//   36   66:ireturn         
		if(propertyMap != null)
	//*  37   67:aload_0         
	//*  38   68:getfield        #35  <Field Map propertyMap>
	//*  39   71:ifnull          92
		{
			if(!propertyMap.equals(((Object) (((LoggerContextVO) (obj)).propertyMap))))
	//*  40   74:aload_0         
	//*  41   75:getfield        #35  <Field Map propertyMap>
	//*  42   78:aload_1         
	//*  43   79:getfield        #35  <Field Map propertyMap>
	//*  44   82:invokeinterface #54  <Method boolean Map.equals(Object)>
	//*  45   87:ifne            101
				return false;
	//   46   90:iconst_0        
	//   47   91:ireturn         
		} else
		if(((LoggerContextVO) (obj)).propertyMap != null)
	//*  48   92:aload_1         
	//*  49   93:getfield        #35  <Field Map propertyMap>
	//*  50   96:ifnull          101
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		return true;
	//   53  101:iconst_1        
	//   54  102:ireturn         
	}

	public long getBirthTime()
	{
		return birthTime;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long birthTime>
	//    2    4:lreturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String name>
	//    2    4:areturn         
	}

	public Map getPropertyMap()
	{
		return propertyMap;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map propertyMap>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		String s = name;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String name>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(s != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          22
			i = name.hashCode();
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field String name>
	//    9   15:invokevirtual   #60  <Method int String.hashCode()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		if(propertyMap != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #35  <Field Map propertyMap>
	//*  16   28:ifnull          41
			j = propertyMap.hashCode();
	//   17   31:aload_0         
	//   18   32:getfield        #35  <Field Map propertyMap>
	//   19   35:invokeinterface #61  <Method int Map.hashCode()>
	//   20   40:istore_2        
		return (i * 31 + j) * 31 + (int)(birthTime ^ birthTime >>> 32);
	//   21   41:iload_1         
	//   22   42:bipush          31
	//   23   44:imul            
	//   24   45:iload_2         
	//   25   46:iadd            
	//   26   47:bipush          31
	//   27   49:imul            
	//   28   50:aload_0         
	//   29   51:getfield        #41  <Field long birthTime>
	//   30   54:aload_0         
	//   31   55:getfield        #41  <Field long birthTime>
	//   32   58:bipush          32
	//   33   60:lushr           
	//   34   61:lxor            
	//   35   62:l2i             
	//   36   63:iadd            
	//   37   64:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("LoggerContextVO{name='");
	//    4    8:aload_1         
	//    5    9:ldc1            #67  <String "LoggerContextVO{name='">
	//    6   11:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #29  <Field String name>
	//   11   20:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", propertyMap=");
	//   17   31:aload_1         
	//   18   32:ldc1            #76  <String ", propertyMap=">
	//   19   34:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (propertyMap)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #35  <Field Map propertyMap>
	//   24   43:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", birthTime=");
	//   26   47:aload_1         
	//   27   48:ldc1            #81  <String ", birthTime=">
	//   28   50:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(birthTime);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #41  <Field long birthTime>
	//   33   59:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//   34   62:pop             
		stringbuilder.append('}');
	//   35   63:aload_1         
	//   36   64:bipush          125
	//   37   66:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	private static final long serialVersionUID = 0xdbfdf2c3L;
	final long birthTime;
	final String name;
	final Map propertyMap;
}
