// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;


public final class SeekPoint
{

	public SeekPoint(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		timeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #22  <Field long timeUs>
		position = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #24  <Field long position>
	//    8   14:return          
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
	//*   6    8:ifnull          57
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #31  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #31  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((SeekPoint)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class SeekPoint>
	//   16   28:astore_1        
			return timeUs == ((SeekPoint) (obj)).timeUs && position == ((SeekPoint) (obj)).position;
	//   17   29:aload_0         
	//   18   30:getfield        #22  <Field long timeUs>
	//   19   33:aload_1         
	//   20   34:getfield        #22  <Field long timeUs>
	//   21   37:lcmp            
	//   22   38:ifne            55
	//   23   41:aload_0         
	//   24   42:getfield        #24  <Field long position>
	//   25   45:aload_1         
	//   26   46:getfield        #24  <Field long position>
	//   27   49:lcmp            
	//   28   50:ifne            55
	//   29   53:iconst_1        
	//   30   54:ireturn         
	//   31   55:iconst_0        
	//   32   56:ireturn         
		} else
		{
			return false;
	//   33   57:iconst_0        
	//   34   58:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * (int)timeUs + (int)position;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #22  <Field long timeUs>
	//    3    6:l2i             
	//    4    7:imul            
	//    5    8:aload_0         
	//    6    9:getfield        #24  <Field long position>
	//    7   12:l2i             
	//    8   13:iadd            
	//    9   14:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[timeUs=");
	//    4    8:aload_1         
	//    5    9:ldc1            #41  <String "[timeUs=">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(timeUs);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field long timeUs>
	//   11   20:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append(", position=");
	//   13   24:aload_1         
	//   14   25:ldc1            #50  <String ", position=">
	//   15   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(position);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #24  <Field long position>
	//   20   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_1         
	//   23   41:ldc1            #52  <String "]">
	//   24   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public static final SeekPoint START = new SeekPoint(0L, 0L);
	public final long position;
	public final long timeUs;

	static 
	{
	//    0    0:new             #2   <Class SeekPoint>
	//    1    3:dup             
	//    2    4:lconst_0        
	//    3    5:lconst_0        
	//    4    6:invokespecial   #15  <Method void SeekPoint(long, long)>
	//    5    9:putstatic       #17  <Field SeekPoint START>
	//*   6   12:return          
	}
}
