// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;


// Referenced classes of package com.apollographql.apollo.api:
//			Error

public static class Error$Location
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
			obj = ((Object) ((Error$Location)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Error$Location>
	//   16   28:astore_1        
			if(line != ((Error$Location) (obj)).line)
	//*  17   29:aload_0         
	//*  18   30:getfield        #17  <Field long line>
	//*  19   33:aload_1         
	//*  20   34:getfield        #17  <Field long line>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			return column == ((Error$Location) (obj)).column;
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

	public Error$Location(long l, long l1)
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
