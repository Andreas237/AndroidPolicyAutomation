// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			bt

static class bt$c
	implements java.util.ntry
{

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof bt$c))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class bt$c>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((bt$c)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class bt$c>
	//   12   20:astore_1        
			if(!a.equals(((bt$c) (obj)).a) || !b.equals(((bt$c) (obj)).b))
	//*  13   21:aload_0         
	//*  14   22:getfield        #23  <Field Object a>
	//*  15   25:aload_1         
	//*  16   26:getfield        #23  <Field Object a>
	//*  17   29:invokevirtual   #25  <Method boolean Object.equals(Object)>
	//*  18   32:ifeq            49
	//*  19   35:aload_0         
	//*  20   36:getfield        #27  <Field Object b>
	//*  21   39:aload_1         
	//*  22   40:getfield        #27  <Field Object b>
	//*  23   43:invokevirtual   #25  <Method boolean Object.equals(Object)>
	//*  24   46:ifne            5
				return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		return true;
	}

	public Object getKey()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object a>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object b>
	//    2    4:areturn         
	}

	public Object setValue(Object obj)
	{
		throw new UnsupportedOperationException("An entry modification is not supported");
	//    0    0:new             #39  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "An entry modification is not supported">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append(a).append("=").append(b).toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Object a>
	//    5   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc1            #59  <String "=">
	//    7   16:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #27  <Field Object b>
	//   10   23:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	final Object a;
	final Object b;
	bt$c c;
	bt$c d;
}
