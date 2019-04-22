// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


public class Tag
{

	public Tag(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		tagNumber = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #13  <Field long tagNumber>
	//    5    9:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          45
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #20  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #20  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Tag)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Tag>
	//   16   28:astore_1        
			return tagNumber == ((Tag) (obj)).tagNumber;
	//   17   29:aload_0         
	//   18   30:getfield        #13  <Field long tagNumber>
	//   19   33:aload_1         
	//   20   34:getfield        #13  <Field long tagNumber>
	//   21   37:lcmp            
	//   22   38:ifeq            43
	//   23   41:iconst_0        
	//   24   42:ireturn         
	//   25   43:iconst_1        
	//   26   44:ireturn         
		} else
		{
			return false;
	//   27   45:iconst_0        
	//   28   46:ireturn         
		}
	}

	public long getTagNumber()
	{
		return tagNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long tagNumber>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		long l = tagNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long tagNumber>
	//    2    4:lstore_1        
		return (int)(l ^ l >>> 32);
	//    3    5:lload_1         
	//    4    6:lload_1         
	//    5    7:bipush          32
	//    6    9:lushr           
	//    7   10:lxor            
	//    8   11:l2i             
	//    9   12:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Tag{tagNumber=");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "Tag{tagNumber=">
	//    6   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(tagNumber);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field long tagNumber>
	//   11   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final long tagNumber;
}
