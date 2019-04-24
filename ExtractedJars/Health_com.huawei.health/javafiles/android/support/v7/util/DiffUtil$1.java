// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.Comparator;

// Referenced classes of package android.support.v7.util:
//			DiffUtil

static final class DiffUtil$1
	implements Comparator
{

	public int compare(ake ake, ake ake1)
	{
		int i = ake.x - ake1.x;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field int DiffUtil$Snake.x>
	//    2    4:aload_2         
	//    3    5:getfield        #22  <Field int DiffUtil$Snake.x>
	//    4    8:isub            
	//    5    9:istore_3        
		if(i == 0)
	//*   6   10:iload_3         
	//*   7   11:ifne            24
			return ake.y - ake1.y;
	//    8   14:aload_1         
	//    9   15:getfield        #25  <Field int DiffUtil$Snake.y>
	//   10   18:aload_2         
	//   11   19:getfield        #25  <Field int DiffUtil$Snake.y>
	//   12   22:isub            
	//   13   23:ireturn         
		else
			return i;
	//   14   24:iload_3         
	//   15   25:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ake)obj, (ake)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class DiffUtil$Snake>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class DiffUtil$Snake>
	//    5    9:invokevirtual   #28  <Method int compare(DiffUtil$Snake, DiffUtil$Snake)>
	//    6   12:ireturn         
	}

	DiffUtil$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
