// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;


public class WorkName
{

	public WorkName(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String name>
		workSpecId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String workSpecId>
	//    8   14:return          
	}

	public final String name;
	public final String workSpecId;
}
