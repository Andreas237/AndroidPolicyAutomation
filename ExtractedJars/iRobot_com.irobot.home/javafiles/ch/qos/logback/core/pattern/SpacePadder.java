// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


public class SpacePadder
{

	public SpacePadder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static final void leftPad(StringBuilder stringbuilder, String s, int i)
	{
		int j;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			j = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method int String.length()>
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(j < i)
	//*   8   14:iload_3         
	//*   9   15:iload_2         
	//*  10   16:icmpge          26
			spacePad(stringbuilder, i - j);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:isub            
	//   15   23:invokestatic    #38  <Method void spacePad(StringBuilder, int)>
		if(s != null)
	//*  16   26:aload_1         
	//*  17   27:ifnull          36
			stringbuilder.append(s);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   21   35:pop             
	//   22   36:return          
	}

	public static final void rightPad(StringBuilder stringbuilder, String s, int i)
	{
		int j;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			j = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method int String.length()>
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          24
			stringbuilder.append(s);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
		if(j < i)
	//*  14   24:iload_3         
	//*  15   25:iload_2         
	//*  16   26:icmpge          36
			spacePad(stringbuilder, i - j);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:iload_3         
	//   20   32:isub            
	//   21   33:invokestatic    #38  <Method void spacePad(StringBuilder, int)>
	//   22   36:return          
	}

	public static final void spacePad(StringBuilder stringbuilder, int i)
	{
		for(; i >= 32; i -= 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmplt          24
			stringbuilder.append(SPACES[5]);
	//    3    6:aload_0         
	//    4    7:getstatic       #24  <Field String[] SPACES>
	//    5   10:iconst_5        
	//    6   11:aaload          
	//    7   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   15:pop             

	//    9   16:iload_1         
	//   10   17:bipush          32
	//   11   19:isub            
	//   12   20:istore_1        
	//*  13   21:goto            0
		for(int j = 4; j >= 0; j--)
	//*  14   24:iconst_4        
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:iflt            55
			if((1 << j & i) != 0)
	//*  18   30:iconst_1        
	//*  19   31:iload_2         
	//*  20   32:ishl            
	//*  21   33:iload_1         
	//*  22   34:iand            
	//*  23   35:ifeq            48
				stringbuilder.append(SPACES[j]);
	//   24   38:aload_0         
	//   25   39:getstatic       #24  <Field String[] SPACES>
	//   26   42:iload_2         
	//   27   43:aaload          
	//   28   44:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   47:pop             

	//   30   48:iload_2         
	//   31   49:iconst_1        
	//   32   50:isub            
	//   33   51:istore_2        
	//*  34   52:goto            26
	//   35   55:return          
	}

	static final String SPACES[] = {
		" ", "  ", "    ", "        ", "                ", "                                "
	};

	static 
	{
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #12  <String " ">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #14  <String "  ">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #16  <String "    ">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #18  <String "        ">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #20  <String "                ">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #22  <String "                                ">
	//   25   34:aastore         
	//   26   35:putstatic       #24  <Field String[] SPACES>
	//*  27   38:return          
	}
}
