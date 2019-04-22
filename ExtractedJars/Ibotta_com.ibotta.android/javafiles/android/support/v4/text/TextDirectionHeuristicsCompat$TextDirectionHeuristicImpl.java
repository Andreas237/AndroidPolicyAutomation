// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.nio.CharBuffer;

// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicCompat, TextDirectionHeuristicsCompat

private static abstract class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
	implements TextDirectionHeuristicCompat
{

	private boolean doCheck(CharSequence charsequence, int i, int j)
	{
		switch(mAlgorithm.checkRtl(charsequence, i, j))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
	//*   2    4:aload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:invokeinterface #27  <Method int TextDirectionHeuristicsCompat$TextDirectionAlgorithm.checkRtl(CharSequence, int, int)>
		{
	//*   6   12:tableswitch     0 1: default 36
	//	               0 43
	//	               1 41
		default:
			return defaultIsRtl();
	//    7   36:aload_0         
	//    8   37:invokevirtual   #31  <Method boolean defaultIsRtl()>
	//    9   40:ireturn         

		case 1: // '\001'
			return false;
	//   10   41:iconst_0        
	//   11   42:ireturn         

		case 0: // '\0'
			return true;
	//   12   43:iconst_1        
	//   13   44:ireturn         
		}
	}

	protected abstract boolean defaultIsRtl();

	public boolean isRtl(CharSequence charsequence, int i, int j)
	{
		if(charsequence != null && i >= 0 && j >= 0 && charsequence.length() - j >= i)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
	//*   2    4:iload_2         
	//*   3    5:iflt            44
	//*   4    8:iload_3         
	//*   5    9:iflt            44
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #38  <Method int CharSequence.length()>
	//*   8   18:iload_3         
	//*   9   19:isub            
	//*  10   20:iload_2         
	//*  11   21:icmplt          44
		{
			if(mAlgorithm == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
	//*  14   28:ifnonnull       36
				return defaultIsRtl();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #31  <Method boolean defaultIsRtl()>
	//   17   35:ireturn         
			else
				return doCheck(charsequence, i, j);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:iload_3         
	//   22   40:invokespecial   #40  <Method boolean doCheck(CharSequence, int, int)>
	//   23   43:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   24   44:new             #42  <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:invokespecial   #43  <Method void IllegalArgumentException()>
	//   27   51:athrow          
		}
	}

	public boolean isRtl(char ac[], int i, int j)
	{
		return isRtl(((CharSequence) (CharBuffer.wrap(ac))), i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method CharBuffer CharBuffer.wrap(char[])>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #52  <Method boolean isRtl(CharSequence, int, int)>
	//    6   10:ireturn         
	}

	private final TextDirectionHeuristicsCompat.TextDirectionAlgorithm mAlgorithm;

	TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat.TextDirectionAlgorithm textdirectionalgorithm)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mAlgorithm = textdirectionalgorithm;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
	//    5    9:return          
	}
}
