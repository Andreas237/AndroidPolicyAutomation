// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			ChildKey

private static class ChildKey$IntegerChildKey extends ChildKey
{

	public volatile int compareTo(Object obj)
	{
		return super.compareTo((ChildKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #4   <Class ChildKey>
	//    3    5:invokespecial   #20  <Method int ChildKey.compareTo(ChildKey)>
	//    4    8:ireturn         
	}

	protected int intValue()
	{
		return intValue;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int intValue>
	//    2    4:ireturn         
	}

	protected boolean isInt()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("IntegerChildName(\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "IntegerChildName(\"">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ChildKey.access$100(((ChildKey) (this))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #40  <Method String ChildKey.access$100(ChildKey)>
	//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("\")");
	//   13   24:aload_1         
	//   14   25:ldc1            #42  <String "\")">
	//   15   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final int intValue;

	ChildKey$IntegerChildKey(String s, int i)
	{
		super(s, ((ChildKey._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #12  <Method void ChildKey(String, ChildKey$1)>
		intValue = i;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:putfield        #14  <Field int intValue>
	//    7   11:return          
	}
}
