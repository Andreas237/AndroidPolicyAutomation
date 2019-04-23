// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat

private static class TextDirectionHeuristicsCompat$FirstStrong
	implements nAlgorithm
{

	public int checkRtl(CharSequence charsequence, int i, int j)
	{
		int l = 2;
	//    0    0:iconst_2        
	//    1    1:istore          5
		for(int k = i; k < j + i && l == 2; k++)
	//*   2    3:iload_2         
	//*   3    4:istore          4
	//*   4    6:iload           4
	//*   5    8:iload_3         
	//*   6    9:iload_2         
	//*   7   10:iadd            
	//*   8   11:icmpge          45
	//*   9   14:iload           5
	//*  10   16:iconst_2        
	//*  11   17:icmpne          45
			l = TextDirectionHeuristicsCompat.isRtlTextOrFormat(((int) (Character.getDirectionality(charsequence.charAt(k)))));
	//   12   20:aload_1         
	//   13   21:iload           4
	//   14   23:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   15   28:invokestatic    #34  <Method byte Character.getDirectionality(char)>
	//   16   31:invokestatic    #38  <Method int TextDirectionHeuristicsCompat.isRtlTextOrFormat(int)>
	//   17   34:istore          5

	//   18   36:iload           4
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:istore          4
	//*  22   42:goto            6
		return l;
	//   23   45:iload           5
	//   24   47:ireturn         
	}

	static final TextDirectionHeuristicsCompat$FirstStrong INSTANCE = new TextDirectionHeuristicsCompat$FirstStrong();

	static 
	{
	//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$FirstStrong>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void TextDirectionHeuristicsCompat$FirstStrong()>
	//    3    7:putstatic       #18  <Field TextDirectionHeuristicsCompat$FirstStrong INSTANCE>
	//*   4   10:return          
	}

	private TextDirectionHeuristicsCompat$FirstStrong()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
