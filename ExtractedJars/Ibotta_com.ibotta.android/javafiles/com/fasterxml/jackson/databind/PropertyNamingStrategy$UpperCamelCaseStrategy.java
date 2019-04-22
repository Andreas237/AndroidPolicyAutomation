// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyNamingStrategy

public static class PropertyNamingStrategy$UpperCamelCaseStrategy extends ase
{

	public String translate(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          51
		{
			if(s.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #20  <Method int String.length()>
	//*   4    8:ifne            13
				return s;
	//    5   11:aload_1         
	//    6   12:areturn         
			char c = s.charAt(0);
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #24  <Method char String.charAt(int)>
	//   10   18:istore_2        
			char c1 = Character.toUpperCase(c);
	//   11   19:iload_2         
	//   12   20:invokestatic    #30  <Method char Character.toUpperCase(char)>
	//   13   23:istore_3        
			if(c == c1)
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpne          31
			{
				return s;
	//   17   29:aload_1         
	//   18   30:areturn         
			} else
			{
				s = ((String) (new StringBuilder(s)));
	//   19   31:new             #32  <Class StringBuilder>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:invokespecial   #35  <Method void StringBuilder(String)>
	//   23   39:astore_1        
				((StringBuilder) (s)).setCharAt(0, c1);
	//   24   40:aload_1         
	//   25   41:iconst_0        
	//   26   42:iload_3         
	//   27   43:invokevirtual   #39  <Method void StringBuilder.setCharAt(int, char)>
				return ((StringBuilder) (s)).toString();
	//   28   46:aload_1         
	//   29   47:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   30   50:areturn         
			}
		} else
		{
			return s;
	//   31   51:aload_1         
	//   32   52:areturn         
		}
	}

	public PropertyNamingStrategy$UpperCamelCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}
