// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.Comparator;

final class DiffUtil$1
	implements Comparator
{

	public int compare(ake ake, ake ake1)
	{
		int j = ake.x - ake1.x;
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field int DiffUtil$Snake.x>
	//    2    4:aload_2         
	//    3    5:getfield        #19  <Field int DiffUtil$Snake.x>
	//    4    8:isub            
	//    5    9:istore          4
		int i = j;
	//    6   11:iload           4
	//    7   13:istore_3        
		if(j == 0)
	//*   8   14:iload           4
	//*   9   16:ifne            29
			i = ake.y - ake1.y;
	//   10   19:aload_1         
	//   11   20:getfield        #22  <Field int DiffUtil$Snake.y>
	//   12   23:aload_2         
	//   13   24:getfield        #22  <Field int DiffUtil$Snake.y>
	//   14   27:isub            
	//   15   28:istore_3        
		return i;
	//   16   29:iload_3         
	//   17   30:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ake)obj, (ake)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class DiffUtil$Snake>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class DiffUtil$Snake>
	//    5    9:invokevirtual   #25  <Method int compare(DiffUtil$Snake, DiffUtil$Snake)>
	//    6   12:ireturn         
	}

	DiffUtil$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
