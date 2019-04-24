// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//			QueueFile

static class QueueFile$Element
{

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append("[").append("position = ").append(position).append(", length = ").append(length).append("]").toString();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #38  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #43  <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #49  <String "[">
	//    8   19:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #51  <String "position = ">
	//   10   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #27  <Field int position>
	//   13   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   14   34:ldc1            #56  <String ", length = ">
	//   15   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_0         
	//   17   40:getfield        #29  <Field int length>
	//   18   43:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   19   46:ldc1            #58  <String "]">
	//   20   48:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   22   54:areturn         
	}

	static final int HEADER_LENGTH = 4;
	static final QueueFile$Element NULL = new QueueFile$Element(0, 0);
	final int length;
	final int position;

	static 
	{
	//    0    0:new             #2   <Class QueueFile$Element>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:invokespecial   #20  <Method void QueueFile$Element(int, int)>
	//    5    9:putstatic       #22  <Field QueueFile$Element NULL>
	//*   6   12:return          
	}

	QueueFile$Element(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		position = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int position>
		length = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int length>
	//    8   14:return          
	}
}
