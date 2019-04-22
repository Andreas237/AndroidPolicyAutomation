// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.*;

public final class Error
{
	public static class Location
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          59
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #26  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #26  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Location)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class Error$Location>
		//   16   28:astore_1        
				if(line != ((Location) (obj)).line)
		//*  17   29:aload_0         
		//*  18   30:getfield        #17  <Field long line>
		//*  19   33:aload_1         
		//*  20   34:getfield        #17  <Field long line>
		//*  21   37:lcmp            
		//*  22   38:ifeq            43
					return false;
		//   23   41:iconst_0        
		//   24   42:ireturn         
				return column == ((Location) (obj)).column;
		//   25   43:aload_0         
		//   26   44:getfield        #19  <Field long column>
		//   27   47:aload_1         
		//   28   48:getfield        #19  <Field long column>
		//   29   51:lcmp            
		//   30   52:ifne            57
		//   31   55:iconst_1        
		//   32   56:ireturn         
		//   33   57:iconst_0        
		//   34   58:ireturn         
			} else
			{
				return false;
		//   35   59:iconst_0        
		//   36   60:ireturn         
			}
		}

		public int hashCode()
		{
			long l = line;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field long line>
		//    2    4:lstore_2        
			int i = (int)(l ^ l >>> 32);
		//    3    5:lload_2         
		//    4    6:lload_2         
		//    5    7:bipush          32
		//    6    9:lushr           
		//    7   10:lxor            
		//    8   11:l2i             
		//    9   12:istore_1        
			l = column;
		//   10   13:aload_0         
		//   11   14:getfield        #19  <Field long column>
		//   12   17:lstore_2        
			return i * 31 + (int)(l ^ l >>> 32);
		//   13   18:iload_1         
		//   14   19:bipush          31
		//   15   21:imul            
		//   16   22:lload_2         
		//   17   23:lload_2         
		//   18   24:bipush          32
		//   19   26:lushr           
		//   20   27:lxor            
		//   21   28:l2i             
		//   22   29:iadd            
		//   23   30:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #33  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Location{line=");
		//    4    8:aload_1         
		//    5    9:ldc1            #35  <String "Location{line=">
		//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(line);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #17  <Field long line>
		//   11   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(long)>
		//   12   23:pop             
			stringbuilder.append(", column=");
		//   13   24:aload_1         
		//   14   25:ldc1            #44  <String ", column=">
		//   15   27:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(column);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #19  <Field long column>
		//   20   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(long)>
		//   21   39:pop             
			stringbuilder.append('}');
		//   22   40:aload_1         
		//   23   41:bipush          125
		//   24   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(char)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		private final long column;
		private final long line;

		public Location(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			line = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #17  <Field long line>
			column = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #19  <Field long column>
		//    8   14:return          
		}
	}


	public Error(String s, List list, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		message = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String message>
		if(list != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          21
			s = ((String) (Collections.unmodifiableList(list)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #29  <Method List Collections.unmodifiableList(List)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            25
			s = ((String) (Collections.emptyList()));
	//   11   21:invokestatic    #33  <Method List Collections.emptyList()>
	//   12   24:astore_1        
		locations = ((List) (s));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #35  <Field List locations>
		if(map != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          42
			s = ((String) (Collections.unmodifiableMap(map)));
	//   18   34:aload_3         
	//   19   35:invokestatic    #39  <Method Map Collections.unmodifiableMap(Map)>
	//   20   38:astore_1        
		else
	//*  21   39:goto            46
			s = ((String) (Collections.emptyMap()));
	//   22   42:invokestatic    #43  <Method Map Collections.emptyMap()>
	//   23   45:astore_1        
		customAttributes = ((Map) (s));
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:putfield        #45  <Field Map customAttributes>
	//   27   51:return          
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
		if(!(obj instanceof Error))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Error>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Error)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Error>
	//   12   20:astore_1        
		String s = message;
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field String message>
	//   15   25:astore_2        
		if(s != null)
	//*  16   26:aload_2         
	//*  17   27:ifnull          43
		{
			if(!s.equals(((Object) (((Error) (obj)).message))))
	//*  18   30:aload_2         
	//*  19   31:aload_1         
	//*  20   32:getfield        #23  <Field String message>
	//*  21   35:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  22   38:ifne            52
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		} else
		if(((Error) (obj)).message != null)
	//*  25   43:aload_1         
	//*  26   44:getfield        #23  <Field String message>
	//*  27   47:ifnull          52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		if(!locations.equals(((Object) (((Error) (obj)).locations))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #35  <Field List locations>
	//*  32   56:aload_1         
	//*  33   57:getfield        #35  <Field List locations>
	//*  34   60:invokeinterface #58  <Method boolean List.equals(Object)>
	//*  35   65:ifne            70
			return false;
	//   36   68:iconst_0        
	//   37   69:ireturn         
		else
			return customAttributes.equals(((Object) (((Error) (obj)).customAttributes)));
	//   38   70:aload_0         
	//   39   71:getfield        #45  <Field Map customAttributes>
	//   40   74:aload_1         
	//   41   75:getfield        #45  <Field Map customAttributes>
	//   42   78:invokeinterface #61  <Method boolean Map.equals(Object)>
	//   43   83:ireturn         
	}

	public int hashCode()
	{
		String s = message;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String message>
	//    2    4:astore_2        
		int i;
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			i = s.hashCode();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #65  <Method int String.hashCode()>
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		return (i * 31 + locations.hashCode()) * 31 + customAttributes.hashCode();
	//   11   19:iload_1         
	//   12   20:bipush          31
	//   13   22:imul            
	//   14   23:aload_0         
	//   15   24:getfield        #35  <Field List locations>
	//   16   27:invokeinterface #66  <Method int List.hashCode()>
	//   17   32:iadd            
	//   18   33:bipush          31
	//   19   35:imul            
	//   20   36:aload_0         
	//   21   37:getfield        #45  <Field Map customAttributes>
	//   22   40:invokeinterface #67  <Method int Map.hashCode()>
	//   23   45:iadd            
	//   24   46:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Error{message='");
	//    4    8:aload_1         
	//    5    9:ldc1            #74  <String "Error{message='">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(message);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field String message>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", locations=");
	//   17   31:aload_1         
	//   18   32:ldc1            #83  <String ", locations=">
	//   19   34:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (locations)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #35  <Field List locations>
	//   24   43:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", customAttributes=");
	//   26   47:aload_1         
	//   27   48:ldc1            #88  <String ", customAttributes=">
	//   28   50:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (customAttributes)));
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #45  <Field Map customAttributes>
	//   33   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
		stringbuilder.append('}');
	//   35   63:aload_1         
	//   36   64:bipush          125
	//   37   66:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	private final Map customAttributes;
	private final List locations;
	private final String message;
}
