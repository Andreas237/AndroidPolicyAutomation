// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

public final class SeekParameters
{

	public SeekParameters(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          6
		boolean flag;
		if(l >= 0L)
	//*   4    7:lload_1         
	//*   5    8:lconst_0        
	//*   6    9:lcmp            
	//*   7   10:iflt            19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          5
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          5
		Assertions.checkArgument(flag);
	//   13   22:iload           5
	//   14   24:invokestatic    #40  <Method void Assertions.checkArgument(boolean)>
		flag = flag1;
	//   15   27:iload           6
	//   16   29:istore          5
		if(l1 >= 0L)
	//*  17   31:lload_3         
	//*  18   32:lconst_0        
	//*  19   33:lcmp            
	//*  20   34:iflt            40
			flag = true;
	//   21   37:iconst_1        
	//   22   38:istore          5
		Assertions.checkArgument(flag);
	//   23   40:iload           5
	//   24   42:invokestatic    #40  <Method void Assertions.checkArgument(boolean)>
		toleranceBeforeUs = l;
	//   25   45:aload_0         
	//   26   46:lload_1         
	//   27   47:putfield        #42  <Field long toleranceBeforeUs>
		toleranceAfterUs = l1;
	//   28   50:aload_0         
	//   29   51:lload_3         
	//   30   52:putfield        #44  <Field long toleranceAfterUs>
	//   31   55:return          
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
	//*   8   12:invokevirtual   #51  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #51  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((SeekParameters)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class SeekParameters>
	//   16   28:astore_1        
			return toleranceBeforeUs == ((SeekParameters) (obj)).toleranceBeforeUs && toleranceAfterUs == ((SeekParameters) (obj)).toleranceAfterUs;
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field long toleranceBeforeUs>
	//   19   33:aload_1         
	//   20   34:getfield        #42  <Field long toleranceBeforeUs>
	//   21   37:lcmp            
	//   22   38:ifne            55
	//   23   41:aload_0         
	//   24   42:getfield        #44  <Field long toleranceAfterUs>
	//   25   45:aload_1         
	//   26   46:getfield        #44  <Field long toleranceAfterUs>
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
		return 31 * (int)toleranceBeforeUs + (int)toleranceAfterUs;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #42  <Field long toleranceBeforeUs>
	//    3    6:l2i             
	//    4    7:imul            
	//    5    8:aload_0         
	//    6    9:getfield        #44  <Field long toleranceAfterUs>
	//    7   12:l2i             
	//    8   13:iadd            
	//    9   14:ireturn         
	}

	public static final SeekParameters CLOSEST_SYNC = new SeekParameters(0xffffffffL, 0xffffffffL);
	public static final SeekParameters DEFAULT;
	public static final SeekParameters EXACT;
	public static final SeekParameters NEXT_SYNC = new SeekParameters(0L, 0xffffffffL);
	public static final SeekParameters PREVIOUS_SYNC = new SeekParameters(0xffffffffL, 0L);
	public final long toleranceAfterUs;
	public final long toleranceBeforeUs;

	static 
	{
		EXACT = new SeekParameters(0L, 0L);
	//    0    0:new             #2   <Class SeekParameters>
	//    1    3:dup             
	//    2    4:lconst_0        
	//    3    5:lconst_0        
	//    4    6:invokespecial   #19  <Method void SeekParameters(long, long)>
	//    5    9:putstatic       #21  <Field SeekParameters EXACT>
	//    6   12:new             #2   <Class SeekParameters>
	//    7   15:dup             
	//    8   16:ldc2w           #22  <Long 0xffffffffL>
	//    9   19:ldc2w           #22  <Long 0xffffffffL>
	//   10   22:invokespecial   #19  <Method void SeekParameters(long, long)>
	//   11   25:putstatic       #25  <Field SeekParameters CLOSEST_SYNC>
	//   12   28:new             #2   <Class SeekParameters>
	//   13   31:dup             
	//   14   32:ldc2w           #22  <Long 0xffffffffL>
	//   15   35:lconst_0        
	//   16   36:invokespecial   #19  <Method void SeekParameters(long, long)>
	//   17   39:putstatic       #27  <Field SeekParameters PREVIOUS_SYNC>
	//   18   42:new             #2   <Class SeekParameters>
	//   19   45:dup             
	//   20   46:lconst_0        
	//   21   47:ldc2w           #22  <Long 0xffffffffL>
	//   22   50:invokespecial   #19  <Method void SeekParameters(long, long)>
	//   23   53:putstatic       #29  <Field SeekParameters NEXT_SYNC>
		DEFAULT = EXACT;
	//   24   56:getstatic       #21  <Field SeekParameters EXACT>
	//   25   59:putstatic       #31  <Field SeekParameters DEFAULT>
	//*  26   62:return          
	}
}
