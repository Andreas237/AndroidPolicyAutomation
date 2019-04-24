// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


class CharSequenceState
{

	public CharSequenceState(char c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		c = c1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field char c>
		occurrences = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #17  <Field int occurrences>
	//    8   14:return          
	}

	void incrementOccurrences()
	{
		occurrences = occurrences + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field int occurrences>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #17  <Field int occurrences>
	//    6   10:return          
	}

	final char c;
	int occurrences;
}
