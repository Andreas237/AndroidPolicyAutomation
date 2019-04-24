// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.measurement;


// Referenced classes of package com.comscore.measurement:
//			Label

public class PrivilegedLabel extends Label
{

	public PrivilegedLabel(String s, String s1, Boolean boolean1)
	{
		super(s, s1, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #10  <Method void Label(String, String, Boolean)>
		a = Boolean.valueOf(true);
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:invokestatic    #16  <Method Boolean Boolean.valueOf(boolean)>
	//    8   12:putfield        #18  <Field Boolean a>
	//    9   15:return          
	}

	public Boolean getPrivileged()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Boolean a>
	//    2    4:areturn         
	}

	private Boolean a;
}
