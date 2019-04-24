// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.io.Serializable;

public class AccessibleElementId
	implements Comparable, Serializable
{

	public AccessibleElementId()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		id = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field int id>
		int i = id_counter + 1;
	//    5    9:getstatic       #16  <Field int id_counter>
	//    6   12:iconst_1        
	//    7   13:iadd            
	//    8   14:istore_1        
		id_counter = i;
	//    9   15:iload_1         
	//   10   16:putstatic       #16  <Field int id_counter>
		id = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #22  <Field int id>
	//   14   24:return          
	}

	public int compareTo(AccessibleElementId accessibleelementid)
	{
		if(id < accessibleelementid.id)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int id>
	//*   2    4:aload_1         
	//*   3    5:getfield        #22  <Field int id>
	//*   4    8:icmpge          13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		return id <= accessibleelementid.id ? 0 : 1;
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field int id>
	//    9   17:aload_1         
	//   10   18:getfield        #22  <Field int id>
	//   11   21:icmple          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((AccessibleElementId)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class AccessibleElementId>
	//    3    5:invokevirtual   #27  <Method int compareTo(AccessibleElementId)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof AccessibleElementId) && id == ((AccessibleElementId)obj).id;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AccessibleElementId>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field int id>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class AccessibleElementId>
	//    7   15:getfield        #22  <Field int id>
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int hashCode()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int id>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return Integer.toString(id);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int id>
	//    2    4:invokestatic    #38  <Method String Integer.toString(int)>
	//    3    7:areturn         
	}

	private static int id_counter = 0;
	private int id;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #16  <Field int id_counter>
	//*   2    4:return          
	}
}
