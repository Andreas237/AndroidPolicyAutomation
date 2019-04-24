// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.PdfChunk;

// Referenced classes of package com.itextpdf.text:
//			SplitCharacter

public class TabSplitCharacter
	implements SplitCharacter
{

	public TabSplitCharacter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public boolean isSplitCharacter(int i, int j, int k, char ac[], PdfChunk apdfchunk[])
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static final SplitCharacter TAB = new TabSplitCharacter();

	static 
	{
	//    0    0:new             #2   <Class TabSplitCharacter>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void TabSplitCharacter()>
	//    3    7:putstatic       #15  <Field SplitCharacter TAB>
	//*   4   10:return          
	}
}
