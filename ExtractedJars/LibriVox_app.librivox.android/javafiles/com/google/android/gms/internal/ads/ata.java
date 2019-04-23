// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asx, asz

final class ata
	implements Iterator
{

	public ata(Iterator iterator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = iterator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Iterator a>
	//    5    9:return          
	}

	public final boolean hasNext()
	{
		return a.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Iterator a>
	//    2    4:invokeinterface #20  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Iterator a>
	//    2    4:invokeinterface #24  <Method Object Iterator.next()>
	//    3    9:checkcast       #26  <Class java.util.Map$Entry>
	//    4   12:astore_1        
		if(entry.getValue() instanceof asx)
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #29  <Method Object java.util.Map$Entry.getValue()>
	//*   7   19:instanceof      #31  <Class asx>
	//*   8   22:ifeq            35
			return ((Object) (new asz(entry, ((asy) (null)))));
	//    9   25:new             #33  <Class asz>
	//   10   28:dup             
	//   11   29:aload_1         
	//   12   30:aconst_null     
	//   13   31:invokespecial   #36  <Method void asz(java.util.Map$Entry, asy)>
	//   14   34:areturn         
		else
			return ((Object) (entry));
	//   15   35:aload_1         
	//   16   36:areturn         
	}

	public final void remove()
	{
		a.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Iterator a>
	//    2    4:invokeinterface #39  <Method void Iterator.remove()>
	//    3    9:return          
	}

	private Iterator a;
}
