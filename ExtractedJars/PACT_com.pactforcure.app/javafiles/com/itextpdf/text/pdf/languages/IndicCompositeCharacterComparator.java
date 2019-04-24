// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;

import java.util.Comparator;

public class IndicCompositeCharacterComparator
	implements Comparator
{

	public IndicCompositeCharacterComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((String)obj, (String)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class String>
	//    3    5:aload_2         
	//    4    6:checkcast       #16  <Class String>
	//    5    9:invokevirtual   #19  <Method int compare(String, String)>
	//    6   12:ireturn         
	}

	public int compare(String s, String s1)
	{
		if(s1.length() > s.length())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #23  <Method int String.length()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #23  <Method int String.length()>
	//*   4    8:icmple          13
			return 1;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(s.length() > s1.length())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #23  <Method int String.length()>
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #23  <Method int String.length()>
	//*  11   21:icmple          26
			return -1;
	//   12   24:iconst_m1       
	//   13   25:ireturn         
		else
			return s.compareTo(s1);
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #27  <Method int String.compareTo(String)>
	//   17   31:ireturn         
	}
}
