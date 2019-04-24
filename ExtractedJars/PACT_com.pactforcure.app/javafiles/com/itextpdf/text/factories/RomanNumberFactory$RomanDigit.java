// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.factories;


// Referenced classes of package com.itextpdf.text.factories:
//			RomanNumberFactory

private static class RomanNumberFactory$RomanDigit
{

	public char digit;
	public boolean pre;
	public int value;

	RomanNumberFactory$RomanDigit(char c, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		digit = c;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field char digit>
		value = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int value>
		pre = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field boolean pre>
	//   11   19:return          
	}
}
